package com.ss.android.ugc.aweme.mediachoose.a;

import com.meituan.robust.ChangeQuickRedirect;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55264a;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1 A[SYNTHETIC, Splitter:B:27:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5 A[Catch:{ Throwable -> 0x00a2, all -> 0x009c, all -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0067 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.ugc.aweme.music.b.a.a> a(android.content.Context r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f55264a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = 0
            r5 = 1
            r6 = 58622(0xe4fe, float:8.2147E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f55264a
            r13 = 1
            r14 = 58622(0xe4fe, float:8.2147E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class<java.util.List> r16 = java.util.List.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0035:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r8 = "datetaken DESC"
            r3 = 3
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.String r3 = "_id"
            r5[r9] = r3
            java.lang.String r3 = "_data"
            r5[r1] = r3
            java.lang.String r3 = "date_modified"
            r10 = 2
            r5[r10] = r3
            java.lang.String r6 = "mime_type like ?"
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r3 = "%gif%"
            r7[r9] = r3
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r11 = 0
            android.content.ContentResolver r3 = r17.getContentResolver()     // Catch:{ all -> 0x00bc }
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00bc }
            if (r3 != 0) goto L_0x0067
            if (r3 == 0) goto L_0x0066
            r3.close()
        L_0x0066:
            return r2
        L_0x0067:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x00b4
            long r4 = r3.getLong(r9)     // Catch:{ all -> 0x00ba }
            com.ss.android.ugc.aweme.music.b.a.a r0 = new com.ss.android.ugc.aweme.music.b.a.a     // Catch:{ all -> 0x00ba }
            r0.<init>((long) r4)     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r3.getString(r1)     // Catch:{ all -> 0x00ba }
            pl.droidsonroids.gif.a r5 = new pl.droidsonroids.gif.a     // Catch:{ Throwable -> 0x00a2, all -> 0x009c }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x00a2, all -> 0x009c }
            int r6 = r5.getIntrinsicWidth()     // Catch:{ Throwable -> 0x00a2, all -> 0x009c }
            r0.l = r6     // Catch:{ Throwable -> 0x00a2, all -> 0x009c }
            int r6 = r5.getIntrinsicHeight()     // Catch:{ Throwable -> 0x00a2, all -> 0x009c }
            r0.m = r6     // Catch:{ Throwable -> 0x00a2, all -> 0x009c }
            int r6 = r5.c()     // Catch:{ Throwable -> 0x00a2, all -> 0x009c }
            if (r6 <= r1) goto L_0x0093
            r6 = 1
            goto L_0x0094
        L_0x0093:
            r6 = 0
        L_0x0094:
            r5.a()     // Catch:{ Throwable -> 0x00a3, all -> 0x009a }
            if (r6 != 0) goto L_0x00a6
            goto L_0x0067
        L_0x009a:
            r0 = move-exception
            goto L_0x009e
        L_0x009c:
            r0 = move-exception
            r6 = 0
        L_0x009e:
            if (r6 != 0) goto L_0x00a1
            goto L_0x0067
        L_0x00a1:
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00a2:
            r6 = 0
        L_0x00a3:
            if (r6 != 0) goto L_0x00a6
            goto L_0x0067
        L_0x00a6:
            long r5 = r3.getLong(r10)     // Catch:{ all -> 0x00ba }
            r0.f56315e = r4     // Catch:{ all -> 0x00ba }
            r0.f56316f = r5     // Catch:{ all -> 0x00ba }
            r0.g = r10     // Catch:{ all -> 0x00ba }
            r2.add(r0)     // Catch:{ all -> 0x00ba }
            goto L_0x0067
        L_0x00b4:
            if (r3 == 0) goto L_0x00b9
            r3.close()
        L_0x00b9:
            return r2
        L_0x00ba:
            r0 = move-exception
            goto L_0x00be
        L_0x00bc:
            r0 = move-exception
            r3 = r11
        L_0x00be:
            if (r3 == 0) goto L_0x00c3
            r3.close()
        L_0x00c3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mediachoose.a.c.a(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.ugc.aweme.music.b.a.a> b(android.content.Context r23) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r23
            com.meituan.robust.ChangeQuickRedirect r4 = f55264a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = 0
            r5 = 1
            r6 = 58623(0xe4ff, float:8.2148E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r23
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f55264a
            r13 = 1
            r14 = 58623(0xe4ff, float:8.2148E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class<java.util.List> r16 = java.util.List.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0035:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r8 = "datetaken DESC"
            r3 = 11
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.String r3 = "_id"
            r5[r9] = r3
            java.lang.String r3 = "_data"
            r5[r1] = r3
            java.lang.String r3 = "date_modified"
            r10 = 2
            r5[r10] = r3
            java.lang.String r3 = "mime_type"
            r11 = 3
            r5[r11] = r3
            java.lang.String r3 = "duration"
            r12 = 4
            r5[r12] = r3
            java.lang.String r3 = "_size"
            r13 = 5
            r5[r13] = r3
            java.lang.String r3 = "latitude"
            r14 = 6
            r5[r14] = r3
            java.lang.String r3 = "longitude"
            r15 = 7
            r5[r15] = r3
            java.lang.String r3 = "_data"
            r7 = 8
            r5[r7] = r3
            java.lang.String r3 = "width"
            r6 = 9
            r5[r6] = r3
            java.lang.String r3 = "height"
            r4 = 10
            r5[r4] = r3
            android.net.Uri r16 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            r17 = 0
            android.content.ContentResolver r3 = r23.getContentResolver()     // Catch:{ all -> 0x0122 }
            r0 = 0
            r18 = 0
            r4 = r16
            r6 = r0
            r0 = 8
            r7 = r18
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0122 }
            if (r3 != 0) goto L_0x0096
            if (r3 == 0) goto L_0x0095
            r3.close()
        L_0x0095:
            return r2
        L_0x0096:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x0120 }
            if (r4 == 0) goto L_0x0119
            long r4 = r3.getLong(r9)     // Catch:{ all -> 0x0120 }
            java.lang.String r6 = r3.getString(r1)     // Catch:{ all -> 0x0120 }
            long r7 = r3.getLong(r10)     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = r3.getString(r11)     // Catch:{ all -> 0x0120 }
            long r9 = r3.getLong(r12)     // Catch:{ all -> 0x0120 }
            long r11 = r3.getLong(r13)     // Catch:{ all -> 0x0120 }
            r19 = r1
            double r0 = r3.getDouble(r14)     // Catch:{ all -> 0x0120 }
            double r13 = r3.getDouble(r15)     // Catch:{ all -> 0x0120 }
            r20 = r2
            r15 = 8
            java.lang.String r2 = r3.getString(r15)     // Catch:{ all -> 0x0120 }
            r21 = r13
            r15 = 9
            int r13 = r3.getInt(r15)     // Catch:{ all -> 0x0120 }
            r14 = 10
            int r15 = r3.getInt(r14)     // Catch:{ all -> 0x0120 }
            boolean r16 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ all -> 0x0120 }
            if (r16 != 0) goto L_0x010b
            r16 = 0
            int r18 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x010b
            int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x010b
            com.ss.android.ugc.aweme.music.b.a.a r14 = new com.ss.android.ugc.aweme.music.b.a.a     // Catch:{ all -> 0x0120 }
            r14.<init>((long) r4)     // Catch:{ all -> 0x0120 }
            r14.f56315e = r6     // Catch:{ all -> 0x0120 }
            r14.f56316f = r7     // Catch:{ all -> 0x0120 }
            r4 = r19
            r14.j = r4     // Catch:{ all -> 0x0120 }
            r14.h = r9     // Catch:{ all -> 0x0120 }
            r14.i = r11     // Catch:{ all -> 0x0120 }
            r4 = 4
            r14.g = r4     // Catch:{ all -> 0x0120 }
            r14.k = r2     // Catch:{ all -> 0x0120 }
            r14.n = r0     // Catch:{ all -> 0x0120 }
            r0 = r21
            r14.o = r0     // Catch:{ all -> 0x0120 }
            r14.l = r13     // Catch:{ all -> 0x0120 }
            r14.m = r15     // Catch:{ all -> 0x0120 }
            r0 = r20
            r0.add(r14)     // Catch:{ all -> 0x0120 }
            r2 = r0
            goto L_0x010d
        L_0x010b:
            r2 = r20
        L_0x010d:
            r0 = 8
            r1 = 1
            r9 = 0
            r10 = 2
            r11 = 3
            r12 = 4
            r13 = 5
            r14 = 6
            r15 = 7
            goto L_0x0096
        L_0x0119:
            r0 = r2
            if (r3 == 0) goto L_0x011f
            r3.close()
        L_0x011f:
            return r0
        L_0x0120:
            r0 = move-exception
            goto L_0x0125
        L_0x0122:
            r0 = move-exception
            r3 = r17
        L_0x0125:
            if (r3 == 0) goto L_0x012a
            r3.close()
        L_0x012a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mediachoose.a.c.b(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010f, code lost:
        if (r10 == false) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011c A[SYNTHETIC, Splitter:B:42:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0120 A[Catch:{ Throwable -> 0x011d, all -> 0x0114, all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a2 A[Catch:{ Throwable -> 0x011d, all -> 0x0114, all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.ugc.aweme.music.b.a.a> a(android.content.Context r28, boolean r29) {
        /*
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r28
            java.lang.Byte r4 = java.lang.Byte.valueOf(r29)
            r11 = 1
            r3[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f55264a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r11] = r4
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r4 = 0
            r6 = 1
            r7 = 58621(0xe4fd, float:8.2146E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004c
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r28
            java.lang.Byte r0 = java.lang.Byte.valueOf(r29)
            r12[r11] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f55264a
            r15 = 1
            r16 = 58621(0xe4fd, float:8.2146E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r11] = r1
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x004c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r9 = "datetaken DESC"
            r4 = 8
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r4 = "_id"
            r6[r10] = r4
            java.lang.String r4 = "_data"
            r6[r11] = r4
            java.lang.String r4 = "date_modified"
            r6[r2] = r4
            java.lang.String r4 = "mime_type"
            r12 = 3
            r6[r12] = r4
            java.lang.String r4 = "_size"
            r13 = 4
            r6[r13] = r4
            java.lang.String r4 = "latitude"
            r14 = 5
            r6[r14] = r4
            java.lang.String r4 = "longitude"
            r15 = 6
            r6[r15] = r4
            java.lang.String r4 = "_data"
            r8 = 7
            r6[r8] = r4
            r16 = 0
            if (r29 == 0) goto L_0x0083
            r7 = r16
            goto L_0x0086
        L_0x0083:
            java.lang.String r4 = "mime_type not like ?"
            r7 = r4
        L_0x0086:
            if (r29 == 0) goto L_0x008b
            r1 = r16
            goto L_0x0091
        L_0x008b:
            java.lang.String[] r1 = new java.lang.String[r11]
            java.lang.String r4 = "%gif%"
            r1[r10] = r4
        L_0x0091:
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.content.ContentResolver r4 = r28.getContentResolver()     // Catch:{ all -> 0x01ce }
            r8 = r1
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01ce }
            if (r1 != 0) goto L_0x00a4
            if (r1 == 0) goto L_0x00a3
            r1.close()
        L_0x00a3:
            return r3
        L_0x00a4:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x01c6
            long r4 = r1.getLong(r10)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = r1.getString(r11)     // Catch:{ all -> 0x01cc }
            long r6 = r1.getLong(r2)     // Catch:{ all -> 0x01cc }
            java.lang.String r8 = r1.getString(r12)     // Catch:{ all -> 0x01cc }
            long r10 = r1.getLong(r13)     // Catch:{ all -> 0x01cc }
            double r12 = r1.getDouble(r14)     // Catch:{ all -> 0x01cc }
            r20 = r3
            double r2 = r1.getDouble(r15)     // Catch:{ all -> 0x01cc }
            r9 = 7
            java.lang.String r14 = r1.getString(r9)     // Catch:{ all -> 0x01cc }
            r17 = 0
            int r19 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x01bc
            com.ss.android.ugc.aweme.music.b.a.a r9 = new com.ss.android.ugc.aweme.music.b.a.a     // Catch:{ all -> 0x01cc }
            r9.<init>((long) r4)     // Catch:{ all -> 0x01cc }
            r9.f56315e = r0     // Catch:{ all -> 0x01cc }
            r9.f56316f = r6     // Catch:{ all -> 0x01cc }
            r9.i = r10     // Catch:{ all -> 0x01cc }
            r9.k = r14     // Catch:{ all -> 0x01cc }
            r9.n = r12     // Catch:{ all -> 0x01cc }
            r9.o = r2     // Catch:{ all -> 0x01cc }
            if (r8 == 0) goto L_0x0127
            java.lang.String r2 = "gif"
            boolean r2 = r8.contains(r2)     // Catch:{ all -> 0x01cc }
            if (r2 == 0) goto L_0x0127
            r2 = 2
            r9.g = r2     // Catch:{ all -> 0x01cc }
            pl.droidsonroids.gif.a r3 = new pl.droidsonroids.gif.a     // Catch:{ Throwable -> 0x011d, all -> 0x0114 }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x011d, all -> 0x0114 }
            int r0 = r3.getIntrinsicWidth()     // Catch:{ Throwable -> 0x011d, all -> 0x0114 }
            r9.l = r0     // Catch:{ Throwable -> 0x011d, all -> 0x0114 }
            int r0 = r3.getIntrinsicHeight()     // Catch:{ Throwable -> 0x011d, all -> 0x0114 }
            r9.m = r0     // Catch:{ Throwable -> 0x011d, all -> 0x0114 }
            int r0 = r3.c()     // Catch:{ Throwable -> 0x011d, all -> 0x0114 }
            r4 = 1
            if (r0 <= r4) goto L_0x010b
            r10 = 1
            goto L_0x010c
        L_0x010b:
            r10 = 0
        L_0x010c:
            r3.a()     // Catch:{ Throwable -> 0x011e, all -> 0x0112 }
            if (r10 != 0) goto L_0x0121
            goto L_0x0118
        L_0x0112:
            r0 = move-exception
            goto L_0x0116
        L_0x0114:
            r0 = move-exception
            r10 = 0
        L_0x0116:
            if (r10 != 0) goto L_0x011c
        L_0x0118:
            r3 = r20
            goto L_0x01bf
        L_0x011c:
            throw r0     // Catch:{ all -> 0x01cc }
        L_0x011d:
            r10 = 0
        L_0x011e:
            if (r10 != 0) goto L_0x0121
            goto L_0x0118
        L_0x0121:
            r3 = r20
            r4 = 1
            r5 = 0
            goto L_0x01b8
        L_0x0127:
            r2 = 2
            r3 = 1
            r9.g = r3     // Catch:{ all -> 0x01cc }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x01cc }
            r5 = 0
            r4[r5] = r0     // Catch:{ all -> 0x01cc }
            r22 = 0
            com.meituan.robust.ChangeQuickRedirect r23 = f55264a     // Catch:{ all -> 0x01cc }
            r24 = 1
            r25 = 58624(0xe500, float:8.215E-41)
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x01cc }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r6[r5] = r3     // Catch:{ all -> 0x01cc }
            java.lang.Class<android.util.Pair> r27 = android.util.Pair.class
            r21 = r4
            r26 = r6
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x01cc }
            if (r3 == 0) goto L_0x016d
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x01cc }
            r5 = 0
            r4[r5] = r0     // Catch:{ all -> 0x01cc }
            r22 = 0
            com.meituan.robust.ChangeQuickRedirect r23 = f55264a     // Catch:{ all -> 0x01cc }
            r24 = 1
            r25 = 58624(0xe500, float:8.215E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01cc }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r5] = r3     // Catch:{ all -> 0x01cc }
            java.lang.Class<android.util.Pair> r27 = android.util.Pair.class
            r21 = r4
            r26 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x01cc }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x01cc }
            goto L_0x0176
        L_0x016d:
            r5 = 0
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ all -> 0x01cc }
            if (r3 == 0) goto L_0x0178
        L_0x0174:
            r0 = r16
        L_0x0176:
            r4 = 1
            goto L_0x01a0
        L_0x0178:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x01cc }
            r3.<init>(r0)     // Catch:{ all -> 0x01cc }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x01cc }
            if (r3 != 0) goto L_0x0184
            goto L_0x0174
        L_0x0184:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x01cc }
            r3.<init>()     // Catch:{ all -> 0x01cc }
            r4 = 1
            r3.inJustDecodeBounds = r4     // Catch:{ all -> 0x01cc }
            android.graphics.BitmapFactory.decodeFile(r0, r3)     // Catch:{ all -> 0x01cc }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x01cc }
            int r6 = r3.outWidth     // Catch:{ all -> 0x01cc }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01cc }
            int r3 = r3.outHeight     // Catch:{ all -> 0x01cc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01cc }
            r0.<init>(r6, r3)     // Catch:{ all -> 0x01cc }
        L_0x01a0:
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r3 = r0.first     // Catch:{ all -> 0x01cc }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x01cc }
            int r3 = r3.intValue()     // Catch:{ all -> 0x01cc }
            r9.l = r3     // Catch:{ all -> 0x01cc }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x01cc }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01cc }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01cc }
            r9.m = r0     // Catch:{ all -> 0x01cc }
        L_0x01b6:
            r3 = r20
        L_0x01b8:
            r3.add(r9)     // Catch:{ all -> 0x01cc }
            goto L_0x01bf
        L_0x01bc:
            r3 = r20
            r2 = 2
        L_0x01bf:
            r10 = 0
            r11 = 1
            r12 = 3
            r13 = 4
            r14 = 5
            goto L_0x00a4
        L_0x01c6:
            if (r1 == 0) goto L_0x01cb
            r1.close()
        L_0x01cb:
            return r3
        L_0x01cc:
            r0 = move-exception
            goto L_0x01d1
        L_0x01ce:
            r0 = move-exception
            r1 = r16
        L_0x01d1:
            if (r1 == 0) goto L_0x01d6
            r1.close()
        L_0x01d6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mediachoose.a.c.a(android.content.Context, boolean):java.util.List");
    }
}
