package com.bumptech.glide.disklrucache;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class DiskLruCache implements Closeable {
    private final int appVersion;
    private final Callable<Void> cleanupCallable;
    public final File directory;
    final ThreadPoolExecutor executorService;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    public Writer journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    private long nextSequenceNumber = 0;
    public int redundantOpCount;
    private long size;
    public final int valueCount;

    static final class DiskLruCacheThreadFactory implements ThreadFactory {
        private DiskLruCacheThreadFactory() {
        }

        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class Editor {
        private boolean committed;
        public final Entry entry;
        public final boolean[] written;

        public final void abort() throws IOException {
            DiskLruCache.this.completeEdit(this, false);
        }

        public final void abortUnlessCommitted() {
            if (!this.committed) {
                try {
                    abort();
                } catch (IOException unused) {
                }
            }
        }

        public final void commit() throws IOException {
            DiskLruCache.this.completeEdit(this, true);
            this.committed = true;
        }

        public final String getString(int i) throws IOException {
            InputStream newInputStream = newInputStream(i);
            if (newInputStream != null) {
                return DiskLruCache.inputStreamToString(newInputStream);
            }
            return null;
        }

        private InputStream newInputStream(int i) throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.entry.currentEditor != this) {
                    throw new IllegalStateException();
                } else if (!this.entry.readable) {
                    return null;
                } else {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.entry.getCleanFile(i));
                        return fileInputStream;
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }

        public final File getFile(int i) throws IOException {
            File dirtyFile;
            synchronized (DiskLruCache.this) {
                if (this.entry.currentEditor == this) {
                    if (!this.entry.readable) {
                        this.written[i] = true;
                    }
                    dirtyFile = this.entry.getDirtyFile(i);
                    if (!DiskLruCache.this.directory.exists()) {
                        DiskLruCache.this.directory.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return dirtyFile;
        }

        private Editor(Entry entry2) {
            boolean[] zArr;
            this.entry = entry2;
            if (entry2.readable) {
                zArr = null;
            } else {
                zArr = new boolean[DiskLruCache.this.valueCount];
            }
            this.written = zArr;
        }

        public final void set(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(getFile(i)), Util.UTF_8);
                try {
                    outputStreamWriter2.write(str);
                    Util.closeQuietly(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    Util.closeQuietly(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                Util.closeQuietly(outputStreamWriter);
                throw th;
            }
        }
    }

    final class Entry {
        File[] cleanFiles;
        public Editor currentEditor;
        File[] dirtyFiles;
        public final String key;
        public final long[] lengths;
        public boolean readable;
        public long sequenceNumber;

        public final String getLengths() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.lengths) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        public final File getCleanFile(int i) {
            return this.cleanFiles[i];
        }

        public final File getDirtyFile(int i) {
            return this.dirtyFiles[i];
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void setLengths(String[] strArr) throws IOException {
            if (strArr.length == DiskLruCache.this.valueCount) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.lengths[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        private Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new File[DiskLruCache.this.valueCount];
            this.dirtyFiles = new File[DiskLruCache.this.valueCount];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                sb.append(i);
                this.cleanFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.append(".tmp");
                this.dirtyFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public final class Value {
        private final File[] files;
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;

        public final Editor edit() throws IOException {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public final File getFile(int i) {
            return this.files[i];
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final String getString(int i) throws IOException {
            return DiskLruCache.inputStreamToString(new FileInputStream(this.files[i]));
        }

        private Value(String str, long j, File[] fileArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.files = fileArr;
            this.lengths = jArr;
        }
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final synchronized long size() {
        return this.size;
    }

    private void checkNotClosed() {
        if (this.journalWriter == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void delete() throws IOException {
        close();
        Util.deleteContents(this.directory);
    }

    public final synchronized boolean isClosed() {
        boolean z;
        if (this.journalWriter == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void flush() throws IOException {
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
    }

    public final boolean journalRebuildRequired() {
        if (this.redundantOpCount < 2000 || this.redundantOpCount < this.lruEntries.size()) {
            return false;
        }
        return true;
    }

    public final synchronized void close() throws IOException {
        if (this.journalWriter != null) {
            Iterator it2 = new ArrayList(this.lruEntries.values()).iterator();
            while (it2.hasNext()) {
                Entry entry = (Entry) it2.next();
                if (entry.currentEditor != null) {
                    entry.currentEditor.abort();
                }
            }
            trimToSize();
            this.journalWriter.close();
            this.journalWriter = null;
        }
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            remove((String) this.lruEntries.entrySet().iterator().next().getKey());
        }
    }

    private void processJournal() throws IOException {
        deleteIfExists(this.journalFileTmp);
        Iterator<Entry> it2 = this.lruEntries.values().iterator();
        while (it2.hasNext()) {
            Entry next = it2.next();
            int i = 0;
            if (next.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += next.lengths[i];
                    i++;
                }
            } else {
                next.currentEditor = null;
                while (i < this.valueCount) {
                    deleteIfExists(next.getCleanFile(i));
                    deleteIfExists(next.getDirtyFile(i));
                    i++;
                }
                it2.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8.redundantOpCount = r1 - r8.lruEntries.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r0.hasUnterminatedLine() != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        rebuildJournal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r8.journalWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r8.journalFile, true), com.bumptech.glide.disklrucache.Util.US_ASCII));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008a=Splitter:B:23:0x008a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readJournal() throws java.io.IOException {
        /*
            r8 = this;
            com.bumptech.glide.disklrucache.StrictLineReader r0 = new com.bumptech.glide.disklrucache.StrictLineReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r8.journalFile
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.bumptech.glide.disklrucache.Util.US_ASCII
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = r0.readLine()     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = r0.readLine()     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = r0.readLine()     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = r0.readLine()     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x00bb }
            if (r6 == 0) goto L_0x008a
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x00bb }
            if (r6 == 0) goto L_0x008a
            int r6 = r8.appVersion     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x00bb }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x008a
            int r3 = r8.valueCount     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x00bb }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x008a
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x008a
            r1 = 0
        L_0x0053:
            java.lang.String r2 = r0.readLine()     // Catch:{ EOFException -> 0x005d }
            r8.readJournalLine(r2)     // Catch:{ EOFException -> 0x005d }
            int r1 = r1 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r2 = r8.lruEntries     // Catch:{ all -> 0x00bb }
            int r2 = r2.size()     // Catch:{ all -> 0x00bb }
            int r1 = r1 - r2
            r8.redundantOpCount = r1     // Catch:{ all -> 0x00bb }
            boolean r1 = r0.hasUnterminatedLine()     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0070
            r8.rebuildJournal()     // Catch:{ all -> 0x00bb }
            goto L_0x0086
        L_0x0070:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bb }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bb }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bb }
            java.io.File r4 = r8.journalFile     // Catch:{ all -> 0x00bb }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00bb }
            java.nio.charset.Charset r4 = com.bumptech.glide.disklrucache.Util.US_ASCII     // Catch:{ all -> 0x00bb }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00bb }
            r1.<init>(r2)     // Catch:{ all -> 0x00bb }
            r8.journalWriter = r1     // Catch:{ all -> 0x00bb }
        L_0x0086:
            com.bumptech.glide.disklrucache.Util.closeQuietly(r0)
            return
        L_0x008a:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x00bb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = "unexpected journal header: ["
            r6.<init>(r7)     // Catch:{ all -> 0x00bb }
            r6.append(r1)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00bb }
            r6.append(r2)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00bb }
            r6.append(r4)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00bb }
            r6.append(r5)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = "]"
            r6.append(r1)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x00bb }
            r3.<init>(r1)     // Catch:{ all -> 0x00bb }
            throw r3     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r1 = move-exception
            com.bumptech.glide.disklrucache.Util.closeQuietly(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.DiskLruCache.readJournal():void");
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void rebuildJournal() throws IOException {
        if (this.journalWriter != null) {
            this.journalWriter.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), Util.US_ASCII));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.appVersion));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.valueCount));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (Entry next : this.lruEntries.values()) {
                if (next.currentEditor != null) {
                    bufferedWriter.write("DIRTY " + next.key + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.key + next.getLengths() + 10);
                }
            }
            bufferedWriter.close();
            if (this.journalFile.exists()) {
                renameTo(this.journalFile, this.journalFileBackup, true);
            }
            renameTo(this.journalFileTmp, this.journalFile, false);
            this.journalFileBackup.delete();
            this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    public final Editor edit(String str) throws IOException {
        return edit(str, -1);
    }

    public static String inputStreamToString(InputStream inputStream) throws IOException {
        return Util.readFully(new InputStreamReader(inputStream, Util.UTF_8));
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        this.executorService.submit(this.cleanupCallable);
    }

    private static void deleteIfExists(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final synchronized Value get(String str) throws IOException {
        checkNotClosed();
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        if (!entry.readable) {
            return null;
        }
        for (File exists : entry.cleanFiles) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.redundantOpCount++;
        this.journalWriter.append("READ");
        this.journalWriter.append(' ');
        this.journalWriter.append(str);
        this.journalWriter.append(10);
        if (journalRebuildRequired()) {
            this.executorService.submit(this.cleanupCallable);
        }
        Value value = new Value(str, entry.sequenceNumber, entry.cleanFiles, entry.lengths);
        return value;
    }

    private void readJournalLine(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.lruEntries.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            Entry entry = this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(str2);
                this.lruEntries.put(str2, entry);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                entry.readable = true;
                entry.currentEditor = null;
                entry.setLengths(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                entry.currentEditor = new Editor(entry);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean remove(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.checkNotClosed()     // Catch:{ all -> 0x0086 }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0086 }
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r0 = (com.bumptech.glide.disklrucache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0086 }
            r1 = 0
            if (r0 == 0) goto L_0x0084
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r2 = r0.currentEditor     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x0014
            goto L_0x0084
        L_0x0014:
            int r2 = r7.valueCount     // Catch:{ all -> 0x0086 }
            if (r1 >= r2) goto L_0x0050
            java.io.File r2 = r0.getCleanFile(r1)     // Catch:{ all -> 0x0086 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x003d
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x0086 }
            r0.append(r2)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0086 }
            r8.<init>(r0)     // Catch:{ all -> 0x0086 }
            throw r8     // Catch:{ all -> 0x0086 }
        L_0x003d:
            long r2 = r7.size     // Catch:{ all -> 0x0086 }
            long[] r4 = r0.lengths     // Catch:{ all -> 0x0086 }
            r5 = r4[r1]     // Catch:{ all -> 0x0086 }
            r4 = 0
            long r2 = r2 - r5
            r7.size = r2     // Catch:{ all -> 0x0086 }
            long[] r2 = r0.lengths     // Catch:{ all -> 0x0086 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0086 }
            int r1 = r1 + 1
            goto L_0x0014
        L_0x0050:
            int r0 = r7.redundantOpCount     // Catch:{ all -> 0x0086 }
            r1 = 1
            int r0 = r0 + r1
            r7.redundantOpCount = r0     // Catch:{ all -> 0x0086 }
            java.io.Writer r0 = r7.journalWriter     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x0086 }
            java.io.Writer r0 = r7.journalWriter     // Catch:{ all -> 0x0086 }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x0086 }
            java.io.Writer r0 = r7.journalWriter     // Catch:{ all -> 0x0086 }
            r0.append(r8)     // Catch:{ all -> 0x0086 }
            java.io.Writer r0 = r7.journalWriter     // Catch:{ all -> 0x0086 }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x0086 }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch:{ all -> 0x0086 }
            r0.remove(r8)     // Catch:{ all -> 0x0086 }
            boolean r8 = r7.journalRebuildRequired()     // Catch:{ all -> 0x0086 }
            if (r8 == 0) goto L_0x0082
            java.util.concurrent.ThreadPoolExecutor r8 = r7.executorService     // Catch:{ all -> 0x0086 }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.cleanupCallable     // Catch:{ all -> 0x0086 }
            r8.submit(r0)     // Catch:{ all -> 0x0086 }
        L_0x0082:
            monitor-exit(r7)
            return r1
        L_0x0084:
            monitor-exit(r7)
            return r1
        L_0x0086:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.DiskLruCache.remove(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bumptech.glide.disklrucache.DiskLruCache.Editor edit(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.checkNotClosed()     // Catch:{ all -> 0x0058 }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch:{ all -> 0x0058 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0058 }
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r0 = (com.bumptech.glide.disklrucache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0058 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001d
            if (r0 == 0) goto L_0x001b
            long r1 = r0.sequenceNumber     // Catch:{ all -> 0x0058 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001d
        L_0x001b:
            monitor-exit(r5)
            return r3
        L_0x001d:
            if (r0 != 0) goto L_0x002a
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r0 = new com.bumptech.glide.disklrucache.DiskLruCache$Entry     // Catch:{ all -> 0x0058 }
            r0.<init>(r6)     // Catch:{ all -> 0x0058 }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r7 = r5.lruEntries     // Catch:{ all -> 0x0058 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0058 }
            goto L_0x0030
        L_0x002a:
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r7 = r0.currentEditor     // Catch:{ all -> 0x0058 }
            if (r7 == 0) goto L_0x0030
            monitor-exit(r5)
            return r3
        L_0x0030:
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r7 = new com.bumptech.glide.disklrucache.DiskLruCache$Editor     // Catch:{ all -> 0x0058 }
            r7.<init>(r0)     // Catch:{ all -> 0x0058 }
            r0.currentEditor = r7     // Catch:{ all -> 0x0058 }
            java.io.Writer r8 = r5.journalWriter     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x0058 }
            java.io.Writer r8 = r5.journalWriter     // Catch:{ all -> 0x0058 }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x0058 }
            java.io.Writer r8 = r5.journalWriter     // Catch:{ all -> 0x0058 }
            r8.append(r6)     // Catch:{ all -> 0x0058 }
            java.io.Writer r6 = r5.journalWriter     // Catch:{ all -> 0x0058 }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x0058 }
            java.io.Writer r6 = r5.journalWriter     // Catch:{ all -> 0x0058 }
            r6.flush()     // Catch:{ all -> 0x0058 }
            monitor-exit(r5)
            return r7
        L_0x0058:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.DiskLruCache.edit(java.lang.String, long):com.bumptech.glide.disklrucache.DiskLruCache$Editor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ee, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void completeEdit(com.bumptech.glide.disklrucache.DiskLruCache.Editor r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r0 = r10.entry     // Catch:{ all -> 0x00f5 }
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r1 = r0.currentEditor     // Catch:{ all -> 0x00f5 }
            if (r1 != r10) goto L_0x00ef
            r1 = 0
            if (r11 == 0) goto L_0x0042
            boolean r2 = r0.readable     // Catch:{ all -> 0x00f5 }
            if (r2 != 0) goto L_0x0042
            r2 = 0
        L_0x000f:
            int r3 = r9.valueCount     // Catch:{ all -> 0x00f5 }
            if (r2 >= r3) goto L_0x0042
            boolean[] r3 = r10.written     // Catch:{ all -> 0x00f5 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f5 }
            if (r3 == 0) goto L_0x002b
            java.io.File r3 = r0.getDirtyFile(r2)     // Catch:{ all -> 0x00f5 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f5 }
            if (r3 != 0) goto L_0x0028
            r10.abort()     // Catch:{ all -> 0x00f5 }
            monitor-exit(r9)
            return
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002b:
            r10.abort()     // Catch:{ all -> 0x00f5 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x00f5 }
            r11.append(r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f5 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f5 }
            throw r10     // Catch:{ all -> 0x00f5 }
        L_0x0042:
            int r10 = r9.valueCount     // Catch:{ all -> 0x00f5 }
            if (r1 >= r10) goto L_0x0073
            java.io.File r10 = r0.getDirtyFile(r1)     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x006d
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f5 }
            if (r2 == 0) goto L_0x0070
            java.io.File r2 = r0.getCleanFile(r1)     // Catch:{ all -> 0x00f5 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f5 }
            long[] r10 = r0.lengths     // Catch:{ all -> 0x00f5 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f5 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f5 }
            long[] r10 = r0.lengths     // Catch:{ all -> 0x00f5 }
            r10[r1] = r5     // Catch:{ all -> 0x00f5 }
            long r7 = r9.size     // Catch:{ all -> 0x00f5 }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.size = r7     // Catch:{ all -> 0x00f5 }
            goto L_0x0070
        L_0x006d:
            deleteIfExists(r10)     // Catch:{ all -> 0x00f5 }
        L_0x0070:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x0073:
            int r10 = r9.redundantOpCount     // Catch:{ all -> 0x00f5 }
            r1 = 1
            int r10 = r10 + r1
            r9.redundantOpCount = r10     // Catch:{ all -> 0x00f5 }
            r10 = 0
            r0.currentEditor = r10     // Catch:{ all -> 0x00f5 }
            boolean r10 = r0.readable     // Catch:{ all -> 0x00f5 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b4
            r0.readable = r1     // Catch:{ all -> 0x00f5 }
            java.io.Writer r10 = r9.journalWriter     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x00f5 }
            java.io.Writer r10 = r9.journalWriter     // Catch:{ all -> 0x00f5 }
            r10.append(r3)     // Catch:{ all -> 0x00f5 }
            java.io.Writer r10 = r9.journalWriter     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = r0.key     // Catch:{ all -> 0x00f5 }
            r10.append(r1)     // Catch:{ all -> 0x00f5 }
            java.io.Writer r10 = r9.journalWriter     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = r0.getLengths()     // Catch:{ all -> 0x00f5 }
            r10.append(r1)     // Catch:{ all -> 0x00f5 }
            java.io.Writer r10 = r9.journalWriter     // Catch:{ all -> 0x00f5 }
            r10.append(r2)     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00d3
            long r10 = r9.nextSequenceNumber     // Catch:{ all -> 0x00f5 }
            r1 = 1
            long r1 = r1 + r10
            r9.nextSequenceNumber = r1     // Catch:{ all -> 0x00f5 }
            r0.sequenceNumber = r10     // Catch:{ all -> 0x00f5 }
            goto L_0x00d3
        L_0x00b4:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r10 = r9.lruEntries     // Catch:{ all -> 0x00f5 }
            java.lang.String r11 = r0.key     // Catch:{ all -> 0x00f5 }
            r10.remove(r11)     // Catch:{ all -> 0x00f5 }
            java.io.Writer r10 = r9.journalWriter     // Catch:{ all -> 0x00f5 }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x00f5 }
            java.io.Writer r10 = r9.journalWriter     // Catch:{ all -> 0x00f5 }
            r10.append(r3)     // Catch:{ all -> 0x00f5 }
            java.io.Writer r10 = r9.journalWriter     // Catch:{ all -> 0x00f5 }
            java.lang.String r11 = r0.key     // Catch:{ all -> 0x00f5 }
            r10.append(r11)     // Catch:{ all -> 0x00f5 }
            java.io.Writer r10 = r9.journalWriter     // Catch:{ all -> 0x00f5 }
            r10.append(r2)     // Catch:{ all -> 0x00f5 }
        L_0x00d3:
            java.io.Writer r10 = r9.journalWriter     // Catch:{ all -> 0x00f5 }
            r10.flush()     // Catch:{ all -> 0x00f5 }
            long r10 = r9.size     // Catch:{ all -> 0x00f5 }
            long r0 = r9.maxSize     // Catch:{ all -> 0x00f5 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e6
            boolean r10 = r9.journalRebuildRequired()     // Catch:{ all -> 0x00f5 }
            if (r10 == 0) goto L_0x00ed
        L_0x00e6:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.executorService     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.cleanupCallable     // Catch:{ all -> 0x00f5 }
            r10.submit(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00ed:
            monitor-exit(r9)
            return
        L_0x00ef:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f5 }
            r10.<init>()     // Catch:{ all -> 0x00f5 }
            throw r10     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.DiskLruCache.completeEdit(com.bumptech.glide.disklrucache.DiskLruCache$Editor, boolean):void");
    }

    private static void renameTo(File file, File file2, boolean z) throws IOException {
        if (z) {
            deleteIfExists(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private DiskLruCache(File file, int i, int i2, long j) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DiskLruCacheThreadFactory());
        this.executorService = threadPoolExecutor;
        this.cleanupCallable = new Callable<Void>() {
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
                return null;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r4 = this;
                    com.bumptech.glide.disklrucache.DiskLruCache r0 = com.bumptech.glide.disklrucache.DiskLruCache.this
                    monitor-enter(r0)
                    com.bumptech.glide.disklrucache.DiskLruCache r1 = com.bumptech.glide.disklrucache.DiskLruCache.this     // Catch:{ all -> 0x0025 }
                    java.io.Writer r1 = r1.journalWriter     // Catch:{ all -> 0x0025 }
                    r2 = 0
                    if (r1 != 0) goto L_0x000c
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x000c:
                    com.bumptech.glide.disklrucache.DiskLruCache r1 = com.bumptech.glide.disklrucache.DiskLruCache.this     // Catch:{ all -> 0x0025 }
                    r1.trimToSize()     // Catch:{ all -> 0x0025 }
                    com.bumptech.glide.disklrucache.DiskLruCache r1 = com.bumptech.glide.disklrucache.DiskLruCache.this     // Catch:{ all -> 0x0025 }
                    boolean r1 = r1.journalRebuildRequired()     // Catch:{ all -> 0x0025 }
                    if (r1 == 0) goto L_0x0023
                    com.bumptech.glide.disklrucache.DiskLruCache r1 = com.bumptech.glide.disklrucache.DiskLruCache.this     // Catch:{ all -> 0x0025 }
                    r1.rebuildJournal()     // Catch:{ all -> 0x0025 }
                    com.bumptech.glide.disklrucache.DiskLruCache r1 = com.bumptech.glide.disklrucache.DiskLruCache.this     // Catch:{ all -> 0x0025 }
                    r3 = 0
                    r1.redundantOpCount = r3     // Catch:{ all -> 0x0025 }
                L_0x0023:
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x0025:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.DiskLruCache.AnonymousClass1.call():java.lang.Void");
            }
        };
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, "journal");
        this.journalFileTmp = new File(file, "journal.tmp");
        this.journalFileBackup = new File(file, "journal.bkp");
        this.valueCount = i2;
        this.maxSize = j;
    }

    public static DiskLruCache open(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    renameTo(file2, file3, false);
                }
            }
            DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j);
            if (diskLruCache.journalFile.exists()) {
                try {
                    diskLruCache.readJournal();
                    diskLruCache.processJournal();
                    return diskLruCache;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    diskLruCache.delete();
                }
            }
            file.mkdirs();
            DiskLruCache diskLruCache2 = new DiskLruCache(file, i, i2, j);
            diskLruCache2.rebuildJournal();
            return diskLruCache2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }
}
