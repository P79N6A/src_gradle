package com.ss.android.socialbase.downloader.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.b;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public static volatile SQLiteDatabase f30804a;

    /* renamed from: b  reason: collision with root package name */
    public d f30805b;

    /* renamed from: c  reason: collision with root package name */
    public d f30806c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f30807d;

    public final DownloadInfo a(int i) {
        return null;
    }

    public final List<DownloadInfo> a(String str) {
        return null;
    }

    public final void a(int i, List<b> list) {
    }

    public final List<DownloadInfo> b(String str) {
        return null;
    }

    public final List<DownloadInfo> c(String str) {
        return null;
    }

    public final void c(DownloadInfo downloadInfo) {
    }

    public final boolean d() {
        return this.f30807d;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(2:7|8)|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = f30804a
            if (r0 != 0) goto L_0x0038
            java.lang.Class<com.ss.android.socialbase.downloader.a.c> r0 = com.ss.android.socialbase.downloader.a.c.class
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = f30804a     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0033
            com.ss.android.socialbase.downloader.a.a r1 = com.ss.android.socialbase.downloader.a.a.a()     // Catch:{ Throwable -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Throwable -> 0x0033 }
            f30804a = r1     // Catch:{ Throwable -> 0x0033 }
            com.ss.android.socialbase.downloader.a.d r1 = new com.ss.android.socialbase.downloader.a.d     // Catch:{ Throwable -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r2 = f30804a     // Catch:{ Throwable -> 0x0033 }
            java.lang.String r3 = "downloader"
            java.lang.String[] r4 = com.ss.android.socialbase.downloader.constants.c.f30848a     // Catch:{ Throwable -> 0x0033 }
            java.lang.String[] r5 = com.ss.android.socialbase.downloader.constants.c.f30849b     // Catch:{ Throwable -> 0x0033 }
            r1.<init>(r2, r3, r4, r5)     // Catch:{ Throwable -> 0x0033 }
            r6.f30805b = r1     // Catch:{ Throwable -> 0x0033 }
            com.ss.android.socialbase.downloader.a.d r1 = new com.ss.android.socialbase.downloader.a.d     // Catch:{ Throwable -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r2 = f30804a     // Catch:{ Throwable -> 0x0033 }
            java.lang.String r3 = "downloadChunk"
            java.lang.String[] r4 = com.ss.android.socialbase.downloader.constants.c.f30850c     // Catch:{ Throwable -> 0x0033 }
            java.lang.String[] r5 = com.ss.android.socialbase.downloader.constants.c.f30851d     // Catch:{ Throwable -> 0x0033 }
            r1.<init>(r2, r3, r4, r5)     // Catch:{ Throwable -> 0x0033 }
            r6.f30806c = r1     // Catch:{ Throwable -> 0x0033 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.a.c.a():void");
    }

    public final void a(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<b>> sparseArray2, final b bVar) {
        try {
            AnonymousClass1 r0 = new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:103:0x015f A[Catch:{ Throwable -> 0x01ca }] */
                /* JADX WARNING: Removed duplicated region for block: B:129:0x01c1 A[Catch:{ Throwable -> 0x01ca }] */
                /* JADX WARNING: Removed duplicated region for block: B:33:0x0089 A[Catch:{ Throwable -> 0x0148, all -> 0x0146 }] */
                /* JADX WARNING: Removed duplicated region for block: B:34:0x0095 A[Catch:{ Throwable -> 0x0148, all -> 0x0146 }] */
                /* JADX WARNING: Removed duplicated region for block: B:96:0x014f A[SYNTHETIC, Splitter:B:96:0x014f] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r13 = this;
                        com.ss.android.socialbase.downloader.a.c r0 = com.ss.android.socialbase.downloader.a.c.this
                        r0.a()
                        android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.a.c.f30804a
                        if (r0 != 0) goto L_0x000a
                        return
                    L_0x000a:
                        com.ss.android.socialbase.downloader.downloader.j r0 = com.ss.android.socialbase.downloader.downloader.b.l()
                        android.util.SparseArray r1 = new android.util.SparseArray
                        r1.<init>()
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        r3 = 0
                        r4 = 0
                        r5 = 1
                        android.database.sqlite.SQLiteDatabase r6 = com.ss.android.socialbase.downloader.a.c.f30804a     // Catch:{ Throwable -> 0x01cb, all -> 0x014b }
                        java.lang.String r7 = "SELECT * FROM downloader"
                        android.database.Cursor r6 = r6.rawQuery(r7, r3)     // Catch:{ Throwable -> 0x01cb, all -> 0x014b }
                    L_0x0023:
                        boolean r3 = r6.moveToNext()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        if (r3 == 0) goto L_0x00c7
                        com.ss.android.socialbase.downloader.model.DownloadInfo r3 = new com.ss.android.socialbase.downloader.model.DownloadInfo     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        r3.<init>((android.database.Cursor) r6)     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        boolean r7 = r3.isCanResumeFromBreakPointStatus()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        if (r7 == 0) goto L_0x0038
                        r7 = -5
                        r3.setStatus(r7)     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                    L_0x0038:
                        java.lang.String r7 = r3.getSavePath()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        if (r7 != 0) goto L_0x0086
                        java.lang.String r7 = r3.getName()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        if (r7 == 0) goto L_0x004d
                        goto L_0x0086
                    L_0x004d:
                        java.io.File r7 = new java.io.File     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        java.lang.String r8 = r3.getSavePath()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        java.lang.String r9 = r3.getName()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        r7.<init>(r8, r9)     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        int r8 = r3.getStatus()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        r9 = -3
                        if (r8 != r9) goto L_0x0067
                        boolean r7 = r7.exists()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        if (r7 == 0) goto L_0x0086
                    L_0x0067:
                        int r7 = r3.getStatus()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        if (r7 != r5) goto L_0x0077
                        long r7 = r3.getCurBytes()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        r10 = 0
                        int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
                        if (r12 <= 0) goto L_0x0086
                    L_0x0077:
                        int r7 = r3.getStatus()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        if (r7 == r9) goto L_0x0084
                        boolean r7 = r3.isFileDataValid()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        if (r7 != 0) goto L_0x0084
                        goto L_0x0086
                    L_0x0084:
                        r7 = 0
                        goto L_0x0087
                    L_0x0086:
                        r7 = 1
                    L_0x0087:
                        if (r7 == 0) goto L_0x0095
                        int r3 = r3.getId()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        r2.add(r3)     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        goto L_0x0023
                    L_0x0095:
                        int r7 = r3.getId()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        if (r0 == 0) goto L_0x00a8
                        java.lang.String r8 = r3.getUrl()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        java.lang.String r9 = r3.getSavePath()     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        int r8 = r0.a(r8, r9)     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        goto L_0x00a9
                    L_0x00a8:
                        r8 = 0
                    L_0x00a9:
                        if (r8 == r7) goto L_0x00b1
                        r3.setId(r8)     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        r1.put(r7, r3)     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                    L_0x00b1:
                        android.util.SparseArray r7 = r2     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        if (r7 == 0) goto L_0x0023
                        android.util.SparseArray r7 = r2     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        monitor-enter(r7)     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                        android.util.SparseArray r8 = r2     // Catch:{ all -> 0x00c4 }
                        int r9 = r3.getId()     // Catch:{ all -> 0x00c4 }
                        r8.put(r9, r3)     // Catch:{ all -> 0x00c4 }
                        monitor-exit(r7)     // Catch:{ all -> 0x00c4 }
                        goto L_0x0023
                    L_0x00c4:
                        r0 = move-exception
                        monitor-exit(r7)     // Catch:{ all -> 0x00c4 }
                        throw r0     // Catch:{ Throwable -> 0x0148, all -> 0x0146 }
                    L_0x00c7:
                        if (r6 == 0) goto L_0x00cc
                        r6.close()     // Catch:{ Throwable -> 0x00cc }
                    L_0x00cc:
                        com.ss.android.socialbase.downloader.a.c r0 = com.ss.android.socialbase.downloader.a.c.this
                        android.util.SparseArray r3 = r2
                        android.util.SparseArray r6 = r3
                        r0.a((java.util.List<java.lang.Integer>) r2, (android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo>) r1, (android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo>) r3, (android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.model.b>>) r6)
                        android.util.SparseArray r0 = r2     // Catch:{ Throwable -> 0x0145 }
                        if (r0 == 0) goto L_0x0137
                        android.util.SparseArray r0 = r2     // Catch:{ Throwable -> 0x0145 }
                        monitor-enter(r0)     // Catch:{ Throwable -> 0x0145 }
                        java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0134 }
                        r1.<init>()     // Catch:{ all -> 0x0134 }
                    L_0x00e1:
                        android.util.SparseArray r2 = r2     // Catch:{ all -> 0x0134 }
                        int r2 = r2.size()     // Catch:{ all -> 0x0134 }
                        if (r4 >= r2) goto L_0x0118
                        android.util.SparseArray r2 = r2     // Catch:{ all -> 0x0134 }
                        int r2 = r2.keyAt(r4)     // Catch:{ all -> 0x0134 }
                        if (r2 == 0) goto L_0x0115
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x0134 }
                        java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0134 }
                        com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r2     // Catch:{ all -> 0x0134 }
                        if (r2 == 0) goto L_0x0115
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x0134 }
                        if (r3 != 0) goto L_0x0115
                        int r3 = r2.getId()     // Catch:{ all -> 0x0134 }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0134 }
                        r1.add(r3)     // Catch:{ all -> 0x0134 }
                        android.util.SparseArray r3 = r3     // Catch:{ all -> 0x0134 }
                        int r2 = r2.getId()     // Catch:{ all -> 0x0134 }
                        r3.remove(r2)     // Catch:{ all -> 0x0134 }
                    L_0x0115:
                        int r4 = r4 + 1
                        goto L_0x00e1
                    L_0x0118:
                        java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0134 }
                    L_0x011c:
                        boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0134 }
                        if (r2 == 0) goto L_0x0132
                        java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0134 }
                        java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0134 }
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x0134 }
                        int r2 = r2.intValue()     // Catch:{ all -> 0x0134 }
                        r3.remove(r2)     // Catch:{ all -> 0x0134 }
                        goto L_0x011c
                    L_0x0132:
                        monitor-exit(r0)     // Catch:{ all -> 0x0134 }
                        goto L_0x0137
                    L_0x0134:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x0134 }
                        throw r1     // Catch:{ Throwable -> 0x0145 }
                    L_0x0137:
                        com.ss.android.socialbase.downloader.a.b r0 = r4     // Catch:{ Throwable -> 0x0145 }
                        if (r0 == 0) goto L_0x0144
                        com.ss.android.socialbase.downloader.a.b r0 = r4     // Catch:{ Throwable -> 0x0145 }
                        r0.a()     // Catch:{ Throwable -> 0x0145 }
                        com.ss.android.socialbase.downloader.a.c r0 = com.ss.android.socialbase.downloader.a.c.this     // Catch:{ Throwable -> 0x0145 }
                        r0.f30807d = r5     // Catch:{ Throwable -> 0x0145 }
                    L_0x0144:
                        return
                    L_0x0145:
                        return
                    L_0x0146:
                        r0 = move-exception
                        goto L_0x014d
                    L_0x0148:
                        r3 = r6
                        goto L_0x01cb
                    L_0x014b:
                        r0 = move-exception
                        r6 = r3
                    L_0x014d:
                        if (r6 == 0) goto L_0x0152
                        r6.close()     // Catch:{ Throwable -> 0x0152 }
                    L_0x0152:
                        com.ss.android.socialbase.downloader.a.c r3 = com.ss.android.socialbase.downloader.a.c.this
                        android.util.SparseArray r6 = r2
                        android.util.SparseArray r7 = r3
                        r3.a((java.util.List<java.lang.Integer>) r2, (android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo>) r1, (android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo>) r6, (android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.model.b>>) r7)
                        android.util.SparseArray r1 = r2     // Catch:{ Throwable -> 0x01ca }
                        if (r1 == 0) goto L_0x01bd
                        android.util.SparseArray r1 = r2     // Catch:{ Throwable -> 0x01ca }
                        monitor-enter(r1)     // Catch:{ Throwable -> 0x01ca }
                        java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x01ba }
                        r2.<init>()     // Catch:{ all -> 0x01ba }
                    L_0x0167:
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x01ba }
                        int r3 = r3.size()     // Catch:{ all -> 0x01ba }
                        if (r4 >= r3) goto L_0x019e
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x01ba }
                        int r3 = r3.keyAt(r4)     // Catch:{ all -> 0x01ba }
                        if (r3 == 0) goto L_0x019b
                        android.util.SparseArray r6 = r2     // Catch:{ all -> 0x01ba }
                        java.lang.Object r3 = r6.get(r3)     // Catch:{ all -> 0x01ba }
                        com.ss.android.socialbase.downloader.model.DownloadInfo r3 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r3     // Catch:{ all -> 0x01ba }
                        if (r3 == 0) goto L_0x019b
                        boolean r6 = r3.isChunkBreakpointAvailable()     // Catch:{ all -> 0x01ba }
                        if (r6 != 0) goto L_0x019b
                        int r6 = r3.getId()     // Catch:{ all -> 0x01ba }
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01ba }
                        r2.add(r6)     // Catch:{ all -> 0x01ba }
                        android.util.SparseArray r6 = r3     // Catch:{ all -> 0x01ba }
                        int r3 = r3.getId()     // Catch:{ all -> 0x01ba }
                        r6.remove(r3)     // Catch:{ all -> 0x01ba }
                    L_0x019b:
                        int r4 = r4 + 1
                        goto L_0x0167
                    L_0x019e:
                        java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x01ba }
                    L_0x01a2:
                        boolean r3 = r2.hasNext()     // Catch:{ all -> 0x01ba }
                        if (r3 == 0) goto L_0x01b8
                        java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x01ba }
                        java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x01ba }
                        android.util.SparseArray r4 = r2     // Catch:{ all -> 0x01ba }
                        int r3 = r3.intValue()     // Catch:{ all -> 0x01ba }
                        r4.remove(r3)     // Catch:{ all -> 0x01ba }
                        goto L_0x01a2
                    L_0x01b8:
                        monitor-exit(r1)     // Catch:{ all -> 0x01ba }
                        goto L_0x01bd
                    L_0x01ba:
                        r2 = move-exception
                        monitor-exit(r1)     // Catch:{ all -> 0x01ba }
                        throw r2     // Catch:{ Throwable -> 0x01ca }
                    L_0x01bd:
                        com.ss.android.socialbase.downloader.a.b r1 = r4     // Catch:{ Throwable -> 0x01ca }
                        if (r1 == 0) goto L_0x01ca
                        com.ss.android.socialbase.downloader.a.b r1 = r4     // Catch:{ Throwable -> 0x01ca }
                        r1.a()     // Catch:{ Throwable -> 0x01ca }
                        com.ss.android.socialbase.downloader.a.c r1 = com.ss.android.socialbase.downloader.a.c.this     // Catch:{ Throwable -> 0x01ca }
                        r1.f30807d = r5     // Catch:{ Throwable -> 0x01ca }
                    L_0x01ca:
                        throw r0
                    L_0x01cb:
                        if (r3 == 0) goto L_0x01d0
                        r3.close()     // Catch:{ Throwable -> 0x01d0 }
                    L_0x01d0:
                        com.ss.android.socialbase.downloader.a.c r0 = com.ss.android.socialbase.downloader.a.c.this
                        android.util.SparseArray r3 = r2
                        android.util.SparseArray r6 = r3
                        r0.a((java.util.List<java.lang.Integer>) r2, (android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo>) r1, (android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo>) r3, (android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.model.b>>) r6)
                        android.util.SparseArray r0 = r2     // Catch:{ Throwable -> 0x0249 }
                        if (r0 == 0) goto L_0x023b
                        android.util.SparseArray r0 = r2     // Catch:{ Throwable -> 0x0249 }
                        monitor-enter(r0)     // Catch:{ Throwable -> 0x0249 }
                        java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0238 }
                        r1.<init>()     // Catch:{ all -> 0x0238 }
                    L_0x01e5:
                        android.util.SparseArray r2 = r2     // Catch:{ all -> 0x0238 }
                        int r2 = r2.size()     // Catch:{ all -> 0x0238 }
                        if (r4 >= r2) goto L_0x021c
                        android.util.SparseArray r2 = r2     // Catch:{ all -> 0x0238 }
                        int r2 = r2.keyAt(r4)     // Catch:{ all -> 0x0238 }
                        if (r2 == 0) goto L_0x0219
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x0238 }
                        java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0238 }
                        com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r2     // Catch:{ all -> 0x0238 }
                        if (r2 == 0) goto L_0x0219
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x0238 }
                        if (r3 != 0) goto L_0x0219
                        int r3 = r2.getId()     // Catch:{ all -> 0x0238 }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0238 }
                        r1.add(r3)     // Catch:{ all -> 0x0238 }
                        android.util.SparseArray r3 = r3     // Catch:{ all -> 0x0238 }
                        int r2 = r2.getId()     // Catch:{ all -> 0x0238 }
                        r3.remove(r2)     // Catch:{ all -> 0x0238 }
                    L_0x0219:
                        int r4 = r4 + 1
                        goto L_0x01e5
                    L_0x021c:
                        java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0238 }
                    L_0x0220:
                        boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0238 }
                        if (r2 == 0) goto L_0x0236
                        java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0238 }
                        java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0238 }
                        android.util.SparseArray r3 = r2     // Catch:{ all -> 0x0238 }
                        int r2 = r2.intValue()     // Catch:{ all -> 0x0238 }
                        r3.remove(r2)     // Catch:{ all -> 0x0238 }
                        goto L_0x0220
                    L_0x0236:
                        monitor-exit(r0)     // Catch:{ all -> 0x0238 }
                        goto L_0x023b
                    L_0x0238:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x0238 }
                        throw r1     // Catch:{ Throwable -> 0x0249 }
                    L_0x023b:
                        com.ss.android.socialbase.downloader.a.b r0 = r4     // Catch:{ Throwable -> 0x0249 }
                        if (r0 == 0) goto L_0x0248
                        com.ss.android.socialbase.downloader.a.b r0 = r4     // Catch:{ Throwable -> 0x0249 }
                        r0.a()     // Catch:{ Throwable -> 0x0249 }
                        com.ss.android.socialbase.downloader.a.c r0 = com.ss.android.socialbase.downloader.a.c.this     // Catch:{ Throwable -> 0x0249 }
                        r0.f30807d = r5     // Catch:{ Throwable -> 0x0249 }
                    L_0x0248:
                        return
                    L_0x0249:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.a.c.AnonymousClass1.run():void");
                }
            };
            ExecutorService g = com.ss.android.socialbase.downloader.downloader.b.g();
            if (g != null) {
                g.execute(r0);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0146 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<java.lang.Integer> r18, android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r19, android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r20, android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.model.b>> r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            r3 = r21
            int r4 = r19.size()
            if (r4 < 0) goto L_0x0154
            android.database.sqlite.SQLiteDatabase r5 = f30804a
            if (r5 != 0) goto L_0x0014
            goto L_0x0154
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r5 = f30804a
            monitor-enter(r5)
            e()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            boolean r6 = r18.isEmpty()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x0044
            java.lang.String r6 = ", "
            r9 = r18
            java.lang.String r6 = android.text.TextUtils.join(r6, r9)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            android.database.sqlite.SQLiteDatabase r9 = f30804a     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r10 = "downloader"
            java.lang.String r11 = "_id IN (?)"
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r12[r7] = r6     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r9.delete(r10, r11, r12)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            android.database.sqlite.SQLiteDatabase r9 = f30804a     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r10 = "downloadChunk"
            java.lang.String r11 = "_id IN (?)"
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r12[r7] = r6     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r9.delete(r10, r11, r12)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
        L_0x0044:
            r6 = 0
        L_0x0045:
            if (r6 >= r4) goto L_0x0110
            int r9 = r0.keyAt(r6)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.Object r10 = r0.get(r9)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r10     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            android.database.sqlite.SQLiteDatabase r11 = f30804a     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r12 = "downloader"
            java.lang.String r13 = "_id = ?"
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r15 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r14[r7] = r15     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r11.delete(r12, r13, r14)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            android.database.sqlite.SQLiteDatabase r11 = f30804a     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r12 = "downloader"
            android.content.ContentValues r13 = r10.toContentValues()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r14 = 0
            r11.insert(r12, r14, r13)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            int r11 = r10.getChunkCount()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            if (r11 <= r8) goto L_0x010a
            java.util.List r11 = r1.c((int) r9)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            int r12 = r11.size()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            if (r12 <= 0) goto L_0x010a
            android.database.sqlite.SQLiteDatabase r12 = f30804a     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r13 = "downloadChunk"
            java.lang.String r15 = "_id = ?"
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r14[r7] = r9     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r12.delete(r13, r15, r14)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
        L_0x0093:
            boolean r11 = r9.hasNext()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            if (r11 == 0) goto L_0x010a
            java.lang.Object r11 = r9.next()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            com.ss.android.socialbase.downloader.model.b r11 = (com.ss.android.socialbase.downloader.model.b) r11     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            int r12 = r10.getId()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r11.f31053a = r12     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            android.database.sqlite.SQLiteDatabase r12 = f30804a     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r13 = "downloadChunk"
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r14.<init>()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r15 = "_id"
            int r7 = r11.f31053a     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r14.put(r15, r7)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r7 = "chunkIndex"
            int r15 = r11.f31057e     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r14.put(r7, r15)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r7 = "startOffset"
            r16 = r9
            long r8 = r11.f31054b     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r14.put(r7, r8)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r7 = "curOffset"
            long r8 = r11.i()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r14.put(r7, r8)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r7 = "endOffset"
            long r8 = r11.f31055c     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r14.put(r7, r8)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r7 = "chunkContentLen"
            long r8 = r11.f31056d     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r14.put(r7, r8)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.String r7 = "hostChunkIndex"
            int r8 = r11.a()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r14.put(r7, r8)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r7 = 0
            r12.insert(r13, r7, r14)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r9 = r16
            r7 = 0
            r8 = 1
            goto L_0x0093
        L_0x010a:
            int r6 = r6 + 1
            r7 = 0
            r8 = 1
            goto L_0x0045
        L_0x0110:
            if (r2 == 0) goto L_0x0141
            if (r3 == 0) goto L_0x0141
            monitor-enter(r20)     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            int r0 = r20.size()     // Catch:{ all -> 0x013e }
            r4 = 0
        L_0x011a:
            if (r4 >= r0) goto L_0x013c
            java.lang.Object r6 = r2.valueAt(r4)     // Catch:{ all -> 0x013e }
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r6     // Catch:{ all -> 0x013e }
            int r6 = r6.getId()     // Catch:{ all -> 0x013e }
            java.util.List r7 = r1.c((int) r6)     // Catch:{ all -> 0x013e }
            java.util.List r7 = com.ss.android.socialbase.downloader.e.d.a((java.util.List<com.ss.android.socialbase.downloader.model.b>) r7)     // Catch:{ all -> 0x013e }
            if (r7 == 0) goto L_0x0139
            int r8 = r7.size()     // Catch:{ all -> 0x013e }
            if (r8 <= 0) goto L_0x0139
            r3.put(r6, r7)     // Catch:{ all -> 0x013e }
        L_0x0139:
            int r4 = r4 + 1
            goto L_0x011a
        L_0x013c:
            monitor-exit(r20)     // Catch:{ all -> 0x013e }
            goto L_0x0141
        L_0x013e:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x013e }
            throw r0     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
        L_0x0141:
            android.database.sqlite.SQLiteDatabase r0 = f30804a     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
            r0.setTransactionSuccessful()     // Catch:{ Throwable -> 0x0146, all -> 0x014a }
        L_0x0146:
            f()     // Catch:{ all -> 0x0151 }
            goto L_0x014f
        L_0x014a:
            r0 = move-exception
            f()     // Catch:{ all -> 0x0151 }
            throw r0     // Catch:{ all -> 0x0151 }
        L_0x014f:
            monitor-exit(r5)     // Catch:{ all -> 0x0151 }
            return
        L_0x0151:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0151 }
            throw r0
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.a.c.a(java.util.List, android.util.SparseArray, android.util.SparseArray, android.util.SparseArray):void");
    }

    public final void a(final b bVar) {
        a();
        if (f30804a != null && this.f30806c != null) {
            if (d.d()) {
                ExecutorService g = com.ss.android.socialbase.downloader.downloader.b.g();
                if (g != null) {
                    g.execute(new Runnable() {
                        public final void run() {
                            try {
                                c.a(bVar, c.this.f30806c.a());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            try {
                a(bVar, this.f30806c.a());
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(int i, int i2, long j) {
        a();
        if (i != 0 && i2 >= 0 && j >= 0 && f30804a != null && this.f30806c != null) {
            if (d.d()) {
                ExecutorService g = com.ss.android.socialbase.downloader.downloader.b.g();
                if (g != null) {
                    final int i3 = i;
                    final int i4 = i2;
                    final long j2 = j;
                    AnonymousClass6 r1 = new Runnable() {
                        public final void run() {
                            try {
                                c.a(i3, i4, j2, c.this.f30806c.c());
                            } catch (Throwable unused) {
                            }
                        }
                    };
                    g.execute(r1);
                    return;
                }
                return;
            }
            try {
                a(i, i2, j, this.f30806c.c());
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(int i, int i2, int i3, long j) {
        a();
        if (i != 0 && i2 >= 0 && i3 >= 0 && j >= 0 && f30804a != null && this.f30806c != null) {
            if (d.d()) {
                ExecutorService g = com.ss.android.socialbase.downloader.downloader.b.g();
                if (g != null) {
                    final int i4 = i;
                    final int i5 = i2;
                    final int i6 = i3;
                    final long j2 = j;
                    AnonymousClass7 r1 = new Runnable() {
                        public final void run() {
                            try {
                                c.a(i4, i5, i6, j2, c.this.f30806c.c());
                            } catch (Throwable unused) {
                            }
                        }
                    };
                    g.execute(r1);
                    return;
                }
                return;
            }
            try {
                a(i, i2, i3, j, this.f30806c.c());
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        a();
        if (i != 0 && i3 >= 0 && i4 != i2 && i4 >= 0 && f30804a != null && this.f30806c != null) {
            if (d.d()) {
                ExecutorService g = com.ss.android.socialbase.downloader.downloader.b.g();
                if (g != null) {
                    final int i5 = i;
                    final int i6 = i2;
                    final int i7 = i3;
                    final int i8 = i4;
                    AnonymousClass8 r1 = new Runnable() {
                        public final void run() {
                            try {
                                c.a(i5, i6, i7, i8, c.this.f30806c.c());
                            } catch (Throwable unused) {
                            }
                        }
                    };
                    g.execute(r1);
                    return;
                }
                return;
            }
            try {
                a(i, i2, i3, i4, this.f30806c.c());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|(5:9|10|11|17|16)(0)|5|4) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.socialbase.downloader.model.DownloadInfo a(int r7, int r8) {
        /*
            r6 = this;
            r6.a()
            android.database.sqlite.SQLiteDatabase r0 = f30804a
            r1 = 0
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            r0 = 10
        L_0x000b:
            android.database.sqlite.SQLiteDatabase r2 = f30804a     // Catch:{ Throwable -> 0x003e }
            boolean r2 = r2.isDbLockedByCurrentThread()     // Catch:{ Throwable -> 0x003e }
            if (r2 == 0) goto L_0x001d
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001d
            r2 = 5
            java.lang.Thread.sleep(r2)     // Catch:{ Throwable -> 0x000b }
            goto L_0x000b
        L_0x001d:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Throwable -> 0x003e }
            r0.<init>()     // Catch:{ Throwable -> 0x003e }
            java.lang.String r2 = "chunkCount"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x003e }
            r0.put(r2, r8)     // Catch:{ Throwable -> 0x003e }
            android.database.sqlite.SQLiteDatabase r8 = f30804a     // Catch:{ Throwable -> 0x003e }
            java.lang.String r2 = "downloader"
            java.lang.String r3 = "_id = ? "
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Throwable -> 0x003e }
            r5 = 0
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ Throwable -> 0x003e }
            r4[r5] = r7     // Catch:{ Throwable -> 0x003e }
            r8.update(r2, r0, r3, r4)     // Catch:{ Throwable -> 0x003e }
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.a.c.a(int, int):com.ss.android.socialbase.downloader.model.DownloadInfo");
    }

    public final boolean a(final DownloadInfo downloadInfo) {
        a();
        if (downloadInfo == null || f30804a == null) {
            return false;
        }
        if (d.d()) {
            ExecutorService g = com.ss.android.socialbase.downloader.downloader.b.g();
            if (g == null) {
                return false;
            }
            g.execute(new Runnable() {
                public final void run() {
                    c.this.b(downloadInfo);
                }
            });
        } else {
            b(downloadInfo);
        }
        return true;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(com.ss.android.socialbase.downloader.model.DownloadInfo r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L_0x0005
            monitor-exit(r1)
            return
        L_0x0005:
            int r0 = r2.getId()     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            boolean r0 = r1.j(r0)     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            if (r0 != 0) goto L_0x0013
            r1.d((com.ss.android.socialbase.downloader.model.DownloadInfo) r2)     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            goto L_0x0028
        L_0x0013:
            com.ss.android.socialbase.downloader.a.d r0 = r1.f30805b     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            if (r0 != 0) goto L_0x0019
            monitor-exit(r1)
            return
        L_0x0019:
            com.ss.android.socialbase.downloader.a.d r0 = r1.f30805b     // Catch:{ Throwable -> 0x0023, all -> 0x0025 }
            android.database.sqlite.SQLiteStatement r0 = r0.c()     // Catch:{ Throwable -> 0x0023, all -> 0x0025 }
            b((com.ss.android.socialbase.downloader.model.DownloadInfo) r2, (android.database.sqlite.SQLiteStatement) r0)     // Catch:{ Throwable -> 0x0023, all -> 0x0025 }
            goto L_0x0028
        L_0x0023:
            monitor-exit(r1)
            return
        L_0x0025:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0028:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.a.c.b(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    public final DownloadInfo a(int i, long j, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", 3);
        contentValues.put("totalBytes", Long.valueOf(j));
        contentValues.put("eTag", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put("name", str2);
        }
        b(i, contentValues);
        return null;
    }

    public final DownloadInfo a(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", 4);
        contentValues.put("curBytes", Long.valueOf(j));
        b(i, contentValues);
        return null;
    }

    public c() {
        this(false);
    }

    private static void e() {
        f30804a.beginTransaction();
    }

    private static void f() {
        try {
            if (f30804a != null && f30804a.inTransaction()) {
                f30804a.endTransaction();
            }
        } catch (Throwable unused) {
        }
    }

    public final synchronized void c() {
        try {
            e();
            f30804a.delete("downloader", null, null);
            f30804a.delete("downloadChunk", null, null);
            f30804a.setTransactionSuccessful();
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void b() {
        a();
        if (f30804a != null) {
            if (d.d()) {
                ExecutorService g = com.ss.android.socialbase.downloader.downloader.b.g();
                if (g != null) {
                    g.execute(new Runnable() {
                        public final void run() {
                            c.this.c();
                        }
                    });
                    return;
                }
                return;
            }
            c();
        }
    }

    private c(boolean z) {
    }

    public final void b(b bVar) {
        a(bVar);
    }

    private boolean j(int i) {
        try {
            if (b(i) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean e(int i) {
        a();
        if (f30804a == null || this.f30805b == null) {
            return false;
        }
        try {
            a(i, this.f30805b.b());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final DownloadInfo g(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", 5);
        contentValues.put("isFirstDownload", 0);
        b(i, contentValues);
        return null;
    }

    public final DownloadInfo h(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", 1);
        b(i, contentValues);
        return null;
    }

    public final DownloadInfo i(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", -7);
        b(i, contentValues);
        return null;
    }

    private void d(final DownloadInfo downloadInfo) {
        a();
        if (f30804a != null && this.f30805b != null) {
            if (d.d()) {
                ExecutorService g = com.ss.android.socialbase.downloader.downloader.b.g();
                if (g != null) {
                    g.execute(new Runnable() {
                        public final void run() {
                            try {
                                c.a(downloadInfo, c.this.f30805b.a());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            try {
                a(downloadInfo, this.f30805b.a());
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean f(final int i) {
        if (d.d()) {
            ExecutorService g = com.ss.android.socialbase.downloader.downloader.b.g();
            if (g == null) {
                return false;
            }
            g.execute(new Runnable() {
                public final void run() {
                    c.this.e(i);
                    c.this.d(i);
                }
            });
        } else {
            e(i);
            d(i);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r9 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r9 != null) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[SYNTHETIC, Splitter:B:16:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.socialbase.downloader.model.b> c(int r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.a()
            android.database.sqlite.SQLiteDatabase r1 = f30804a
            if (r1 == 0) goto L_0x0051
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = f30804a     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r3 = "SELECT * FROM %s WHERE %s = ?"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "downloadChunk"
            r6 = 0
            r4[r6] = r5     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "_id"
            r7 = 1
            r4[r7] = r5     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r4[r6] = r9     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            android.database.Cursor r9 = r2.rawQuery(r3, r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
        L_0x002e:
            boolean r1 = r9.moveToNext()     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            if (r1 == 0) goto L_0x003d
            com.ss.android.socialbase.downloader.model.b r1 = new com.ss.android.socialbase.downloader.model.b     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            r1.<init>((android.database.Cursor) r9)     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            r0.add(r1)     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            goto L_0x002e
        L_0x003d:
            if (r9 == 0) goto L_0x0051
        L_0x003f:
            r9.close()     // Catch:{ Throwable -> 0x0051 }
            goto L_0x0051
        L_0x0043:
            r0 = move-exception
            r1 = r9
            goto L_0x0047
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ Throwable -> 0x004c }
        L_0x004c:
            throw r0
        L_0x004d:
            r9 = r1
        L_0x004e:
            if (r9 == 0) goto L_0x0051
            goto L_0x003f
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.a.c.c(int):java.util.List");
    }

    public final void d(final int i) {
        a();
        if (f30804a != null && this.f30806c != null) {
            if (d.d()) {
                ExecutorService g = com.ss.android.socialbase.downloader.downloader.b.g();
                if (g != null) {
                    g.execute(new Runnable() {
                        public final void run() {
                            try {
                                c.a(i, c.this.f30806c.b());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            try {
                a(i, this.f30806c.b());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r8 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r8 != null) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[SYNTHETIC, Splitter:B:20:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.socialbase.downloader.model.DownloadInfo b(int r8) {
        /*
            r7 = this;
            r7.a()
            android.database.sqlite.SQLiteDatabase r0 = f30804a
            r1 = 0
            if (r0 == 0) goto L_0x004e
            android.database.sqlite.SQLiteDatabase r0 = f30804a     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r2 = "SELECT * FROM %s WHERE %s = ?"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r4 = "downloader"
            r5 = 0
            r3[r5] = r4     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r4 = "_id"
            r6 = 1
            r3[r6] = r4     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            r3[r5] = r8     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            android.database.Cursor r8 = r0.rawQuery(r2, r3)     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            boolean r0 = r8.moveToNext()     // Catch:{ Throwable -> 0x004b, all -> 0x0040 }
            if (r0 == 0) goto L_0x003a
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = new com.ss.android.socialbase.downloader.model.DownloadInfo     // Catch:{ Throwable -> 0x004b, all -> 0x0040 }
            r0.<init>((android.database.Cursor) r8)     // Catch:{ Throwable -> 0x004b, all -> 0x0040 }
            if (r8 == 0) goto L_0x0039
            r8.close()     // Catch:{ Throwable -> 0x0039 }
        L_0x0039:
            return r0
        L_0x003a:
            if (r8 == 0) goto L_0x004e
        L_0x003c:
            r8.close()     // Catch:{ Throwable -> 0x004e }
            goto L_0x004e
        L_0x0040:
            r0 = move-exception
            r1 = r8
            goto L_0x0044
        L_0x0043:
            r0 = move-exception
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ Throwable -> 0x0049 }
        L_0x0049:
            throw r0
        L_0x004a:
            r8 = r1
        L_0x004b:
            if (r8 == 0) goto L_0x004e
            goto L_0x003c
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.a.c.b(int):com.ss.android.socialbase.downloader.model.DownloadInfo");
    }

    public static void a(int i, SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    sQLiteStatement.bindLong(1, (long) i);
                    sQLiteStatement.execute();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final DownloadInfo d(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", -2);
        contentValues.put("curBytes", Long.valueOf(j));
        b(i, contentValues);
        return null;
    }

    private void b(final int i, final ContentValues contentValues) {
        a();
        if (f30804a != null) {
            if (d.d()) {
                ExecutorService g = com.ss.android.socialbase.downloader.downloader.b.g();
                if (g != null) {
                    g.execute(new Runnable() {
                        public final void run() {
                            c.a(i, contentValues);
                        }
                    });
                    return;
                }
                return;
            }
            a(i, contentValues);
        }
    }

    public final DownloadInfo c(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", -3);
        contentValues.put("curBytes", Long.valueOf(j));
        contentValues.put("isFirstDownload", 0);
        contentValues.put("isFirstSuccess", 0);
        b(i, contentValues);
        return null;
    }

    private static void b(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.bindLong(downloadInfo.getBindValueCount() + 1, (long) downloadInfo.getId());
                    sQLiteStatement.execute();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0002 */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r5, android.content.ContentValues r6) {
        /*
            r0 = 10
        L_0x0002:
            android.database.sqlite.SQLiteDatabase r1 = f30804a     // Catch:{ Throwable -> 0x0029 }
            boolean r1 = r1.isDbLockedByCurrentThread()     // Catch:{ Throwable -> 0x0029 }
            if (r1 == 0) goto L_0x0014
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0014
            r1 = 5
            java.lang.Thread.sleep(r1)     // Catch:{ Throwable -> 0x0002 }
            goto L_0x0002
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = f30804a     // Catch:{ Throwable -> 0x0028 }
            java.lang.String r1 = "downloader"
            java.lang.String r2 = "_id = ? "
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0028 }
            r4 = 0
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x0028 }
            r3[r4] = r5     // Catch:{ Throwable -> 0x0028 }
            r0.update(r1, r6, r2, r3)     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.a.c.a(int, android.content.ContentValues):void");
    }

    public final DownloadInfo b(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", -1);
        contentValues.put("curBytes", Long.valueOf(j));
        if (j > 0) {
            contentValues.put("isFirstDownload", 0);
        }
        b(i, contentValues);
        return null;
    }

    public static void a(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.executeInsert();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(b bVar, SQLiteStatement sQLiteStatement) {
        if (bVar != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    if (sQLiteStatement != null) {
                        bVar.i = 0;
                        sQLiteStatement.clearBindings();
                        int i = bVar.i + 1;
                        bVar.i = i;
                        sQLiteStatement.bindLong(i, (long) bVar.f31053a);
                        int i2 = bVar.i + 1;
                        bVar.i = i2;
                        sQLiteStatement.bindLong(i2, (long) bVar.f31057e);
                        int i3 = bVar.i + 1;
                        bVar.i = i3;
                        sQLiteStatement.bindLong(i3, bVar.f31054b);
                        int i4 = bVar.i + 1;
                        bVar.i = i4;
                        sQLiteStatement.bindLong(i4, bVar.i());
                        int i5 = bVar.i + 1;
                        bVar.i = i5;
                        sQLiteStatement.bindLong(i5, bVar.f31055c);
                        int i6 = bVar.i + 1;
                        bVar.i = i6;
                        sQLiteStatement.bindLong(i6, bVar.f31056d);
                        int i7 = bVar.i + 1;
                        bVar.i = i7;
                        sQLiteStatement.bindLong(i7, (long) bVar.a());
                    }
                    sQLiteStatement.executeInsert();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void b(int i, List<b> list) {
        try {
            d(i);
            if (list != null) {
                for (b next : list) {
                    if (next != null) {
                        a(next);
                        if (next.d()) {
                            for (b a2 : next.g) {
                                a(a2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(int i, int i2, long j, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j));
                f30804a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2)});
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(int i, int i2, int i3, int i4, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("chunkIndex", Integer.valueOf(i4));
                f30804a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)});
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(int i, int i2, int i3, long j, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j));
                f30804a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)});
            }
        } catch (Throwable unused) {
        }
    }
}
