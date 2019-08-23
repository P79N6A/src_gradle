package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import com.google.a.a.a.a.a.a;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class UnpackingSoSource extends DirectorySoSource {
    @Nullable
    private String[] mAbis;
    protected final Context mContext;
    @Nullable
    protected String mCorruptedLib;
    private final Map<String, Object> mLibsBeingLoaded = new HashMap();

    public static class Dso {
        public final String hash;
        public final String name;

        public Dso(String str, String str2) {
            this.name = str;
            this.hash = str2;
        }
    }

    public static final class DsoManifest {
        public final Dso[] dsos;

        public DsoManifest(Dso[] dsoArr) {
            this.dsos = dsoArr;
        }

        static final DsoManifest read(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    Dso[] dsoArr = new Dso[readInt];
                    for (int i = 0; i < readInt; i++) {
                        dsoArr[i] = new Dso(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new DsoManifest(dsoArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void write(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.dsos.length);
            for (int i = 0; i < this.dsos.length; i++) {
                dataOutput.writeUTF(this.dsos[i].name);
                dataOutput.writeUTF(this.dsos[i].hash);
            }
        }
    }

    protected static final class InputDso implements Closeable {
        public final InputStream content;
        public final Dso dso;

        public final void close() throws IOException {
            this.content.close();
        }

        public InputDso(Dso dso2, InputStream inputStream) {
            this.dso = dso2;
            this.content = inputStream;
        }
    }

    protected static abstract class InputDsoIterator implements Closeable {
        public void close() throws IOException {
        }

        public abstract boolean hasNext();

        public abstract InputDso next() throws IOException;

        protected InputDsoIterator() {
        }
    }

    protected static abstract class Unpacker implements Closeable {
        public void close() throws IOException {
        }

        /* access modifiers changed from: protected */
        public abstract DsoManifest getDsoManifest() throws IOException;

        /* access modifiers changed from: protected */
        public abstract InputDsoIterator openDsoIterator() throws IOException;

        protected Unpacker() {
        }
    }

    /* access modifiers changed from: protected */
    public abstract Unpacker makeUnpacker() throws IOException;

    public String[] getSoSourceAbis() {
        if (this.mAbis == null) {
            return super.getSoSourceAbis();
        }
        return this.mAbis;
    }

    /* access modifiers changed from: protected */
    public byte[] getDepsBlock() throws IOException {
        Throwable th;
        Parcel obtain = Parcel.obtain();
        Unpacker makeUnpacker = makeUnpacker();
        try {
            Dso[] dsoArr = makeUnpacker.getDsoManifest().dsos;
            obtain.writeByte((byte) 1);
            obtain.writeInt(dsoArr.length);
            for (int i = 0; i < dsoArr.length; i++) {
                obtain.writeString(dsoArr[i].name);
                obtain.writeString(dsoArr[i].hash);
            }
            if (makeUnpacker != null) {
                makeUnpacker.close();
            }
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th2) {
            a.a(th, th2);
        }
        throw th;
    }

    public void setSoSourceAbis(String[] strArr) {
        this.mAbis = strArr;
    }

    private Object getLibraryLock(String str) {
        Object obj;
        synchronized (this.mLibsBeingLoaded) {
            obj = this.mLibsBeingLoaded.get(str);
            if (obj == null) {
                obj = new Object();
                this.mLibsBeingLoaded.put(str, obj);
            }
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public synchronized void prepare(String str) throws IOException {
        synchronized (getLibraryLock(str)) {
            this.mCorruptedLib = str;
            prepare(2);
        }
    }

    /* access modifiers changed from: protected */
    public void prepare(int i) throws IOException {
        SysUtil.mkdirOrThrow(this.soDirectory);
        FileLocker lock = FileLocker.lock(new File(this.soDirectory, "dso_lock"));
        try {
            if (refreshLocked(lock, i, getDepsBlock())) {
                lock = null;
            }
        } finally {
            if (lock != null) {
                lock.close();
            }
        }
    }

    private void deleteUnmentionedFiles(Dso[] dsoArr) throws IOException {
        String[] list = this.soDirectory.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < dsoArr.length) {
                        if (dsoArr[i].name.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        SysUtil.dumbDeleteRecursive(new File(this.soDirectory, str));
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.soDirectory);
    }

    protected UnpackingSoSource(Context context, File file) {
        super(file, 1);
        this.mContext = context;
    }

    protected UnpackingSoSource(Context context, String str) {
        super(getSoStorePath(context, str), 1);
        this.mContext = context;
    }

    public static File getSoStorePath(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        com.google.a.a.a.a.a.a.a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r3 != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeState(java.io.File r3, byte r4) throws java.io.IOException {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r3 = 0
            r0.seek(r1)     // Catch:{ Throwable -> 0x0024 }
            r0.write(r4)     // Catch:{ Throwable -> 0x0024 }
            long r1 = r0.getFilePointer()     // Catch:{ Throwable -> 0x0024 }
            r0.setLength(r1)     // Catch:{ Throwable -> 0x0024 }
            java.io.FileDescriptor r4 = r0.getFD()     // Catch:{ Throwable -> 0x0024 }
            r4.sync()     // Catch:{ Throwable -> 0x0024 }
            r0.close()
            return
        L_0x0022:
            r4 = move-exception
            goto L_0x0026
        L_0x0024:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x0026:
            if (r3 == 0) goto L_0x0031
            r0.close()     // Catch:{ Throwable -> 0x002c }
            goto L_0x0034
        L_0x002c:
            r0 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.lang.Throwable) r0)
            goto L_0x0034
        L_0x0031:
            r0.close()
        L_0x0034:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.writeState(java.io.File, byte):void");
    }

    private void extractDso(InputDso inputDso, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        if (this.soDirectory.setWritable(true, true)) {
            File file = new File(this.soDirectory, inputDso.dso.name);
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (IOException unused) {
                SysUtil.dumbDeleteRecursive(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
            }
            try {
                int available = inputDso.content.available();
                if (available > 1) {
                    SysUtil.fallocateIfSupported(randomAccessFile.getFD(), (long) available);
                }
                SysUtil.copyBytes(randomAccessFile, inputDso.content, Integer.MAX_VALUE, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    randomAccessFile.close();
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e2) {
                SysUtil.dumbDeleteRecursive(file);
                throw e2;
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        } else {
            throw new IOException("cannot make directory writable for us: " + this.soDirectory);
        }
    }

    public int loadLibrary(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int loadLibraryFrom;
        synchronized (getLibraryLock(str)) {
            loadLibraryFrom = loadLibraryFrom(str, i, this.soDirectory, threadPolicy);
        }
        return loadLibraryFrom;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        com.google.a.a.a.a.a.a.a(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3 != 1) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b2, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b3, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b7, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b8, code lost:
        r10 = r13;
        r13 = r12;
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cc, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00cd, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d1, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d2, code lost:
        r10 = r13;
        r13 = r12;
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1 != null) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc A[ExcHandler: all (th java.lang.Throwable)] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean refreshLocked(com.facebook.soloader.FileLocker r12, int r13, byte[] r14) throws java.io.IOException {
        /*
            r11 = this;
            java.io.File r5 = new java.io.File
            java.io.File r0 = r11.soDirectory
            java.lang.String r1 = "dso_state"
            r5.<init>(r0, r1)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r5, r1)
            r7 = 1
            r1 = 0
            r2 = 0
            byte r3 = r0.readByte()     // Catch:{ EOFException -> 0x002d, Throwable -> 0x001c }
            if (r3 == r7) goto L_0x002e
            goto L_0x002d
        L_0x001a:
            r12 = move-exception
            goto L_0x001e
        L_0x001c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001a }
        L_0x001e:
            if (r1 == 0) goto L_0x0029
            r0.close()     // Catch:{ Throwable -> 0x0024 }
            goto L_0x002c
        L_0x0024:
            r13 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r1, (java.lang.Throwable) r13)
            goto L_0x002c
        L_0x0029:
            r0.close()
        L_0x002c:
            throw r12
        L_0x002d:
            r3 = 0
        L_0x002e:
            r0.close()
            java.io.File r4 = new java.io.File
            java.io.File r0 = r11.soDirectory
            java.lang.String r6 = "dso_deps"
            r4.<init>(r0, r6)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r6 = "rw"
            r0.<init>(r4, r6)
            long r8 = r0.length()     // Catch:{ Throwable -> 0x00e8 }
            int r6 = (int) r8     // Catch:{ Throwable -> 0x00e8 }
            byte[] r6 = new byte[r6]     // Catch:{ Throwable -> 0x00e8 }
            int r8 = r0.read(r6)     // Catch:{ Throwable -> 0x00e8 }
            int r9 = r6.length     // Catch:{ Throwable -> 0x00e8 }
            if (r8 == r9) goto L_0x0050
            r3 = 0
        L_0x0050:
            boolean r6 = java.util.Arrays.equals(r6, r14)     // Catch:{ Throwable -> 0x00e8 }
            if (r6 != 0) goto L_0x0057
            r3 = 0
        L_0x0057:
            if (r3 == 0) goto L_0x0060
            r6 = r13 & 2
            if (r6 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r8 = r1
            goto L_0x007c
        L_0x0060:
            writeState(r5, r2)     // Catch:{ Throwable -> 0x00e8 }
            com.facebook.soloader.UnpackingSoSource$Unpacker r6 = r11.makeUnpacker()     // Catch:{ Throwable -> 0x00e8 }
            com.facebook.soloader.UnpackingSoSource$DsoManifest r8 = r6.getDsoManifest()     // Catch:{ Throwable -> 0x00cf, all -> 0x00cc }
            com.facebook.soloader.UnpackingSoSource$InputDsoIterator r9 = r6.openDsoIterator()     // Catch:{ Throwable -> 0x00cf, all -> 0x00cc }
            r11.regenerate(r3, r8, r9)     // Catch:{ Throwable -> 0x00b5, all -> 0x00b2 }
            if (r9 == 0) goto L_0x0077
            r9.close()     // Catch:{ Throwable -> 0x00cf, all -> 0x00cc }
        L_0x0077:
            if (r6 == 0) goto L_0x007c
            r6.close()     // Catch:{ Throwable -> 0x00e8 }
        L_0x007c:
            r0.close()
            if (r8 != 0) goto L_0x0082
            return r2
        L_0x0082:
            com.facebook.soloader.UnpackingSoSource$1 r9 = new com.facebook.soloader.UnpackingSoSource$1
            r0 = r9
            r1 = r11
            r2 = r4
            r3 = r14
            r4 = r8
            r6 = r12
            r0.<init>(r2, r3, r4, r5, r6)
            r12 = r13 & 1
            if (r12 == 0) goto L_0x00ae
            java.lang.Thread r12 = new java.lang.Thread
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "SoSync:"
            r13.<init>(r14)
            java.io.File r14 = r11.soDirectory
            java.lang.String r14 = r14.getName()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r9, r13)
            r12.start()
            goto L_0x00b1
        L_0x00ae:
            r9.run()
        L_0x00b1:
            return r7
        L_0x00b2:
            r12 = move-exception
            r13 = r1
            goto L_0x00bb
        L_0x00b5:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r13 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x00bb:
            if (r9 == 0) goto L_0x00cb
            if (r13 == 0) goto L_0x00c8
            r9.close()     // Catch:{ Throwable -> 0x00c3, all -> 0x00cc }
            goto L_0x00cb
        L_0x00c3:
            r14 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r13, (java.lang.Throwable) r14)     // Catch:{ Throwable -> 0x00cf, all -> 0x00cc }
            goto L_0x00cb
        L_0x00c8:
            r9.close()     // Catch:{ Throwable -> 0x00cf, all -> 0x00cc }
        L_0x00cb:
            throw r12     // Catch:{ Throwable -> 0x00cf, all -> 0x00cc }
        L_0x00cc:
            r12 = move-exception
            r13 = r1
            goto L_0x00d5
        L_0x00cf:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r13 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x00d5:
            if (r6 == 0) goto L_0x00e5
            if (r13 == 0) goto L_0x00e2
            r6.close()     // Catch:{ Throwable -> 0x00dd }
            goto L_0x00e5
        L_0x00dd:
            r14 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r13, (java.lang.Throwable) r14)     // Catch:{ Throwable -> 0x00e8 }
            goto L_0x00e5
        L_0x00e2:
            r6.close()     // Catch:{ Throwable -> 0x00e8 }
        L_0x00e5:
            throw r12     // Catch:{ Throwable -> 0x00e8 }
        L_0x00e6:
            r12 = move-exception
            goto L_0x00eb
        L_0x00e8:
            r12 = move-exception
            r1 = r12
            throw r1     // Catch:{ all -> 0x00e6 }
        L_0x00eb:
            if (r1 == 0) goto L_0x00f6
            r0.close()     // Catch:{ Throwable -> 0x00f1 }
            goto L_0x00f9
        L_0x00f1:
            r13 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r1, (java.lang.Throwable) r13)
            goto L_0x00f9
        L_0x00f6:
            r0.close()
        L_0x00f9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.refreshLocked(com.facebook.soloader.FileLocker, int, byte[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[SYNTHETIC, Splitter:B:11:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[Catch:{ Throwable -> 0x001c, all -> 0x0019, Throwable -> 0x009e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void regenerate(byte r11, com.facebook.soloader.UnpackingSoSource.DsoManifest r12, com.facebook.soloader.UnpackingSoSource.InputDsoIterator r13) throws java.io.IOException {
        /*
            r10 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r10.soDirectory
            java.lang.String r2 = "dso_manifest"
            r0.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)
            r0 = 1
            r2 = 0
            if (r11 != r0) goto L_0x0020
            com.facebook.soloader.UnpackingSoSource$DsoManifest r11 = com.facebook.soloader.UnpackingSoSource.DsoManifest.read(r1)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0021
        L_0x0019:
            r11 = move-exception
            goto L_0x0098
        L_0x001c:
            r11 = move-exception
            r2 = r11
            goto L_0x0097
        L_0x0020:
            r11 = r2
        L_0x0021:
            r3 = 0
            if (r11 != 0) goto L_0x002b
            com.facebook.soloader.UnpackingSoSource$DsoManifest r11 = new com.facebook.soloader.UnpackingSoSource$DsoManifest     // Catch:{ Throwable -> 0x001c }
            com.facebook.soloader.UnpackingSoSource$Dso[] r4 = new com.facebook.soloader.UnpackingSoSource.Dso[r3]     // Catch:{ Throwable -> 0x001c }
            r11.<init>(r4)     // Catch:{ Throwable -> 0x001c }
        L_0x002b:
            com.facebook.soloader.UnpackingSoSource$Dso[] r12 = r12.dsos     // Catch:{ Throwable -> 0x001c }
            r10.deleteUnmentionedFiles(r12)     // Catch:{ Throwable -> 0x001c }
            r12 = 32768(0x8000, float:4.5918E-41)
            byte[] r12 = new byte[r12]     // Catch:{ Throwable -> 0x001c }
        L_0x0035:
            boolean r4 = r13.hasNext()     // Catch:{ Throwable -> 0x001c }
            if (r4 == 0) goto L_0x0093
            com.facebook.soloader.UnpackingSoSource$InputDso r4 = r13.next()     // Catch:{ Throwable -> 0x001c }
            r5 = 1
            r6 = 0
        L_0x0041:
            if (r5 == 0) goto L_0x0071
            com.facebook.soloader.UnpackingSoSource$Dso[] r7 = r11.dsos     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            int r7 = r7.length     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            if (r6 >= r7) goto L_0x0071
            com.facebook.soloader.UnpackingSoSource$Dso[] r7 = r11.dsos     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            r7 = r7[r6]     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            java.lang.String r7 = r7.name     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            com.facebook.soloader.UnpackingSoSource$Dso r8 = r4.dso     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            java.lang.String r8 = r8.name     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            boolean r7 = r7.equals(r8)     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            if (r7 == 0) goto L_0x0069
            com.facebook.soloader.UnpackingSoSource$Dso[] r7 = r11.dsos     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            r7 = r7[r6]     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            java.lang.String r7 = r7.hash     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            com.facebook.soloader.UnpackingSoSource$Dso r8 = r4.dso     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            java.lang.String r8 = r8.hash     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            boolean r7 = r7.equals(r8)     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            if (r7 == 0) goto L_0x0069
            r5 = 0
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x0041
        L_0x006c:
            r11 = move-exception
            r12 = r2
            goto L_0x007c
        L_0x006f:
            r11 = move-exception
            goto L_0x0077
        L_0x0071:
            if (r5 == 0) goto L_0x008d
            r10.extractDso(r4, r12)     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            goto L_0x008d
        L_0x0077:
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r12 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x007c:
            if (r4 == 0) goto L_0x008c
            if (r12 == 0) goto L_0x0089
            r4.close()     // Catch:{ Throwable -> 0x0084 }
            goto L_0x008c
        L_0x0084:
            r13 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r12, (java.lang.Throwable) r13)     // Catch:{ Throwable -> 0x001c }
            goto L_0x008c
        L_0x0089:
            r4.close()     // Catch:{ Throwable -> 0x001c }
        L_0x008c:
            throw r11     // Catch:{ Throwable -> 0x001c }
        L_0x008d:
            if (r4 == 0) goto L_0x0035
            r4.close()     // Catch:{ Throwable -> 0x001c }
            goto L_0x0035
        L_0x0093:
            r1.close()
            return
        L_0x0097:
            throw r2     // Catch:{ all -> 0x0019 }
        L_0x0098:
            if (r2 == 0) goto L_0x00a3
            r1.close()     // Catch:{ Throwable -> 0x009e }
            goto L_0x00a6
        L_0x009e:
            r12 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r2, (java.lang.Throwable) r12)
            goto L_0x00a6
        L_0x00a3:
            r1.close()
        L_0x00a6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.regenerate(byte, com.facebook.soloader.UnpackingSoSource$DsoManifest, com.facebook.soloader.UnpackingSoSource$InputDsoIterator):void");
    }
}
