package com.ss.android.downloadlib.core.download;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.ss.android.downloadlib.core.download.j;
import java.io.File;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    File f29040a;

    /* renamed from: b  reason: collision with root package name */
    public File f29041b;

    /* renamed from: c  reason: collision with root package name */
    final Context f29042c;

    /* renamed from: d  reason: collision with root package name */
    private File f29043d;

    /* renamed from: e  reason: collision with root package name */
    private int f29044e;

    /* renamed from: f  reason: collision with root package name */
    private int f29045f;
    private Thread g;

    private synchronized void d() {
        this.f29044e = 0;
    }

    private synchronized void c() {
        if (this.g == null || !this.g.isAlive()) {
            this.g = new Thread() {
                /* JADX WARNING: Removed duplicated region for block: B:29:0x006a A[SYNTHETIC, Splitter:B:29:0x006a] */
                /* JADX WARNING: Removed duplicated region for block: B:35:0x0070 A[SYNTHETIC, Splitter:B:35:0x0070] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r9 = this;
                        com.ss.android.downloadlib.core.download.p r0 = com.ss.android.downloadlib.core.download.p.this
                        r0.b()
                        com.ss.android.downloadlib.core.download.p r0 = com.ss.android.downloadlib.core.download.p.this
                        r1 = 0
                        android.content.Context r2 = r0.f29042c     // Catch:{ Exception -> 0x006e, all -> 0x0066 }
                        com.ss.android.downloadlib.core.download.g r3 = com.ss.android.downloadlib.core.download.g.a((android.content.Context) r2)     // Catch:{ Exception -> 0x006e, all -> 0x0066 }
                        android.net.Uri r4 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ Exception -> 0x006e, all -> 0x0066 }
                        r2 = 1
                        java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ Exception -> 0x006e, all -> 0x0066 }
                        r2 = 0
                        java.lang.String r6 = "_id"
                        r5[r2] = r6     // Catch:{ Exception -> 0x006e, all -> 0x0066 }
                        java.lang.String r6 = "status >= '200'"
                        r7 = 0
                        java.lang.String r8 = "lastmod"
                        android.database.Cursor r2 = r3.a((android.net.Uri) r4, (java.lang.String[]) r5, (java.lang.String) r6, (java.lang.String[]) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x006e, all -> 0x0066 }
                        if (r2 != 0) goto L_0x002a
                        if (r2 == 0) goto L_0x0075
                        r2.close()     // Catch:{ Exception -> 0x0029 }
                        goto L_0x0075
                    L_0x0029:
                        return
                    L_0x002a:
                        boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
                        if (r3 == 0) goto L_0x005a
                        int r3 = r2.getCount()     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
                        int r3 = r3 + -1000
                        java.lang.String r4 = "_id"
                        int r4 = r2.getColumnIndexOrThrow(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
                    L_0x003c:
                        if (r3 <= 0) goto L_0x005a
                        android.net.Uri r5 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
                        long r6 = r2.getLong(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
                        android.net.Uri r5 = android.content.ContentUris.withAppendedId(r5, r6)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
                        android.content.Context r6 = r0.f29042c     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
                        com.ss.android.downloadlib.core.download.g r6 = com.ss.android.downloadlib.core.download.g.a((android.content.Context) r6)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
                        r6.a((android.net.Uri) r5, (java.lang.String) r1, (java.lang.String[]) r1)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
                        boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
                        if (r5 == 0) goto L_0x005a
                        int r3 = r3 + -1
                        goto L_0x003c
                    L_0x005a:
                        if (r2 == 0) goto L_0x0061
                        r2.close()     // Catch:{ Exception -> 0x0060 }
                        goto L_0x0061
                    L_0x0060:
                        return
                    L_0x0061:
                        return
                    L_0x0062:
                        r0 = move-exception
                        goto L_0x0068
                    L_0x0064:
                        r1 = r2
                        goto L_0x006e
                    L_0x0066:
                        r0 = move-exception
                        r2 = r1
                    L_0x0068:
                        if (r2 == 0) goto L_0x006d
                        r2.close()     // Catch:{ Exception -> 0x006d }
                    L_0x006d:
                        throw r0
                    L_0x006e:
                        if (r1 == 0) goto L_0x0075
                        r1.close()     // Catch:{ Exception -> 0x0074 }
                        goto L_0x0075
                    L_0x0074:
                        return
                    L_0x0075:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.p.AnonymousClass1.run():void");
                }
            };
            this.g.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        int i = this.f29045f + 1;
        this.f29045f = i;
        if (i % 250 == 0) {
            c();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0070 }
            r0.<init>()     // Catch:{ Exception -> 0x0070 }
            java.io.File r1 = r9.f29043d     // Catch:{ Exception -> 0x0070 }
            if (r1 == 0) goto L_0x0018
            java.io.File r1 = r9.f29043d     // Catch:{ Exception -> 0x0070 }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ Exception -> 0x0070 }
            if (r1 == 0) goto L_0x0018
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x0070 }
            r0.addAll(r1)     // Catch:{ Exception -> 0x0070 }
        L_0x0018:
            java.io.File r1 = r9.f29041b     // Catch:{ Exception -> 0x0070 }
            if (r1 == 0) goto L_0x002b
            java.io.File r1 = r9.f29041b     // Catch:{ Exception -> 0x0070 }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ Exception -> 0x0070 }
            if (r1 == 0) goto L_0x002b
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x0070 }
            r0.addAll(r1)     // Catch:{ Exception -> 0x0070 }
        L_0x002b:
            int r1 = r0.size()     // Catch:{ Exception -> 0x0070 }
            if (r1 != 0) goto L_0x0032
            return
        L_0x0032:
            android.content.Context r1 = r9.f29042c     // Catch:{ Exception -> 0x0070 }
            com.ss.android.downloadlib.core.download.g r2 = com.ss.android.downloadlib.core.download.g.a((android.content.Context) r1)     // Catch:{ Exception -> 0x0070 }
            android.net.Uri r3 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ Exception -> 0x0070 }
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0070 }
            java.lang.String r1 = "_data"
            r8 = 0
            r4[r8] = r1     // Catch:{ Exception -> 0x0070 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r2.a((android.net.Uri) r3, (java.lang.String[]) r4, (java.lang.String) r5, (java.lang.String[]) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x0070 }
            if (r1 == 0) goto L_0x006b
        L_0x004b:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0064 }
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = r1.getString(r8)     // Catch:{ all -> 0x0064 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0064 }
            if (r3 != 0) goto L_0x004b
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0064 }
            r3.<init>(r2)     // Catch:{ all -> 0x0064 }
            r0.remove(r3)     // Catch:{ all -> 0x0064 }
            goto L_0x004b
        L_0x0064:
            r0 = move-exception
            if (r1 == 0) goto L_0x006a
            r1.close()     // Catch:{ Exception -> 0x006a }
        L_0x006a:
            throw r0     // Catch:{ Exception -> 0x0070 }
        L_0x006b:
            if (r1 == 0) goto L_0x0070
            r1.close()     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.p.b():void");
    }

    /* access modifiers changed from: package-private */
    public synchronized int a(long j) {
        this.f29044e = (int) (((long) this.f29044e) + j);
        return this.f29044e;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(android.content.Context r2) {
        /*
            r1 = this;
            r1.<init>()
            r1.f29042c = r2
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x000b }
            r1.f29040a = r0     // Catch:{ Exception -> 0x000b }
        L_0x000b:
            java.io.File r2 = r2.getCacheDir()     // Catch:{ Exception -> 0x001b }
            r1.f29041b = r2     // Catch:{ Exception -> 0x001b }
            java.io.File r2 = android.os.Environment.getDownloadCacheDirectory()     // Catch:{ Exception -> 0x001b }
            r1.f29043d = r2     // Catch:{ Exception -> 0x001b }
            r1.c()     // Catch:{ Exception -> 0x001b }
            return
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.p.<init>(android.content.Context):void");
    }

    private static long a(File file) {
        File[] listFiles = file.listFiles();
        long j = 104857600;
        if (listFiles == null) {
            return 104857600;
        }
        for (File length : listFiles) {
            j -= length.length();
        }
        return j;
    }

    private static long b(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
    }

    private long a(int i, long j) {
        Cursor a2 = g.a(this.f29042c).a(j.a.f29029a, (String[]) null, "( status = '200' AND destination = ? )", new String[]{String.valueOf(i)}, "lastmod");
        long j2 = 0;
        if (a2 == null) {
            return 0;
        }
        try {
            int columnIndex = a2.getColumnIndex("_data");
            while (a2.moveToNext() && j2 < 10485760) {
                String string = a2.getString(columnIndex);
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    j2 += file.length();
                    file.delete();
                    g.a(this.f29042c).a(ContentUris.withAppendedId(j.a.f29029a, a2.getLong(a2.getColumnIndex("_id"))), (String) null, (String[]) null);
                }
            }
            return j2;
        } finally {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    private synchronized void a(File file, long j, int i) throws o {
        if (j != 0) {
            if (i == 1 || i == 0) {
                if (!Environment.getExternalStorageState().equals("mounted")) {
                    throw new o(199, "external media not mounted");
                }
            }
            long b2 = b(file);
            if (b2 < 10485760) {
                a(i, 10485760);
                b();
                b2 = b(file);
                if (b2 < 10485760) {
                    if (file == null || !file.equals(this.f29043d)) {
                        throw new o(198, "space in the filesystem rooted at: " + file + " is below 10% availability. stopping this download.");
                    }
                }
            }
            if (file != null && file.equals(this.f29041b)) {
                b2 = a(this.f29041b);
                if (b2 < j) {
                    a(i, 10485760);
                    b();
                    b2 = a(this.f29041b);
                }
            }
            if (b2 < j) {
                throw new o(198, "not enough free space in the filesystem rooted at: " + file + " and unable to free any more");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r2, java.lang.String r3, long r4) throws com.ss.android.downloadlib.core.download.o {
        /*
            r1 = this;
            r1.d()
            if (r3 == 0) goto L_0x006c
            switch(r2) {
                case 0: goto L_0x0042;
                case 1: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0049
        L_0x0009:
            java.io.File r0 = r1.f29040a
            if (r0 == 0) goto L_0x001c
            java.io.File r0 = r1.f29040a
            java.lang.String r0 = r0.getPath()
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x001c
            java.io.File r0 = r1.f29040a
            goto L_0x004a
        L_0x001c:
            java.io.File r0 = r1.f29041b
            if (r0 == 0) goto L_0x002f
            java.io.File r0 = r1.f29041b
            java.lang.String r0 = r0.getPath()
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x002f
            java.io.File r0 = r1.f29041b
            goto L_0x004a
        L_0x002f:
            java.io.File r0 = r1.f29043d
            if (r0 == 0) goto L_0x0049
            java.io.File r0 = r1.f29043d
            java.lang.String r0 = r0.getPath()
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0049
            java.io.File r0 = r1.f29043d
            goto L_0x004a
        L_0x0042:
            java.io.File r0 = r1.f29040a
            if (r0 == 0) goto L_0x0049
            java.io.File r0 = r1.f29040a
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 == 0) goto L_0x0050
            r1.a((java.io.File) r0, (long) r4, (int) r2)
            return
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "invalid combination of destination: "
            r5.<init>(r0)
            r5.append(r2)
            java.lang.String r2 = ", path: "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            throw r4
        L_0x006c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "path can't be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.p.a(int, java.lang.String, long):void");
    }
}