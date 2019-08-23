package com.ss.android.newmedia.app;

import com.meituan.robust.ChangeQuickRedirect;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30167a;

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0171 A[Catch:{ Throwable -> 0x01b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a8 A[Catch:{ Throwable -> 0x01b5 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a9 A[Catch:{ Throwable -> 0x01b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(java.lang.String r23, java.lang.String r24, boolean r25, android.content.Context r26, java.lang.String r27, java.util.List<com.ss.android.http.a.a> r28, boolean r29, boolean r30, boolean r31) {
        /*
            r0 = r23
            r3 = r26
            r6 = 9
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r14 = 0
            r7[r14] = r0
            r15 = 1
            r7[r15] = r24
            java.lang.Byte r8 = java.lang.Byte.valueOf(r25)
            r16 = 2
            r7[r16] = r8
            r17 = 3
            r7[r17] = r3
            r18 = 4
            r7[r18] = r27
            r19 = 5
            r7[r19] = r28
            java.lang.Byte r8 = java.lang.Byte.valueOf(r29)
            r20 = 6
            r7[r20] = r8
            java.lang.Byte r8 = java.lang.Byte.valueOf(r30)
            r21 = 7
            r7[r21] = r8
            java.lang.Byte r8 = java.lang.Byte.valueOf(r31)
            r22 = 8
            r7[r22] = r8
            com.meituan.robust.ChangeQuickRedirect r9 = f30167a
            java.lang.Class[] r12 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r14] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r15] = r8
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r12[r16] = r8
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r12[r17] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r18] = r8
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r12[r19] = r8
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r12[r20] = r8
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r12[r21] = r8
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r12[r22] = r8
            java.lang.Class r13 = java.lang.Long.TYPE
            r8 = 0
            r10 = 1
            r11 = 18545(0x4871, float:2.5987E-41)
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L_0x00d9
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r14] = r0
            r7[r15] = r24
            java.lang.Byte r0 = java.lang.Byte.valueOf(r25)
            r7[r16] = r0
            r7[r17] = r3
            r7[r18] = r27
            r7[r19] = r28
            java.lang.Byte r0 = java.lang.Byte.valueOf(r29)
            r7[r20] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r30)
            r7[r21] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r31)
            r7[r22] = r0
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r1 = f30167a
            r2 = 1
            r3 = 18545(0x4871, float:2.5987E-41)
            java.lang.Class[] r4 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r14] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r15] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r16] = r5
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r17] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r18] = r5
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r4[r19] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r20] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r21] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r22] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r23 = r7
            r24 = r0
            r25 = r1
            r26 = r2
            r27 = r3
            r28 = r4
            r29 = r5
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r23, r24, r25, r26, r27, r28, r29)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x00d9:
            r6 = -1
            if (r3 != 0) goto L_0x00de
            return r6
        L_0x00de:
            com.ss.android.socialbase.appdownloader.AppDownloader r8 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Exception -> 0x01b6 }
            if (r8 != 0) goto L_0x00e5
            return r6
        L_0x00e5:
            android.net.Uri r9 = android.net.Uri.parse(r23)     // Catch:{ Throwable -> 0x01b5 }
            java.lang.String r9 = r9.getLastPathSegment()     // Catch:{ Throwable -> 0x01b5 }
            boolean r10 = com.bytedance.common.utility.StringUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x01b5 }
            if (r10 == 0) goto L_0x0102
            boolean r9 = com.bytedance.common.utility.StringUtils.isEmpty(r24)     // Catch:{ Throwable -> 0x01b5 }
            if (r9 != 0) goto L_0x00fc
            r9 = r24
            goto L_0x0102
        L_0x00fc:
            if (r25 == 0) goto L_0x0101
            java.lang.String r9 = "default.apk"
            goto L_0x0102
        L_0x0101:
            return r6
        L_0x0102:
            boolean r10 = com.bytedance.common.utility.StringUtils.isEmpty(r24)     // Catch:{ Throwable -> 0x01b5 }
            if (r10 == 0) goto L_0x010a
            r1 = r9
            goto L_0x010c
        L_0x010a:
            r1 = r24
        L_0x010c:
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r10 = new com.ss.android.socialbase.appdownloader.AppTaskBuilder     // Catch:{ Throwable -> 0x01b5 }
            r10.<init>(r3, r0)     // Catch:{ Throwable -> 0x01b5 }
            if (r28 == 0) goto L_0x0140
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Throwable -> 0x01b5 }
            int r11 = r28.size()     // Catch:{ Throwable -> 0x01b5 }
            r0.<init>(r11)     // Catch:{ Throwable -> 0x01b5 }
            java.util.Iterator r5 = r28.iterator()     // Catch:{ Throwable -> 0x01b5 }
        L_0x0120:
            boolean r11 = r5.hasNext()     // Catch:{ Throwable -> 0x01b5 }
            if (r11 == 0) goto L_0x013d
            java.lang.Object r11 = r5.next()     // Catch:{ Throwable -> 0x01b5 }
            com.ss.android.http.a.a r11 = (com.ss.android.http.a.a) r11     // Catch:{ Throwable -> 0x01b5 }
            com.ss.android.socialbase.downloader.model.HttpHeader r12 = new com.ss.android.socialbase.downloader.model.HttpHeader     // Catch:{ Throwable -> 0x01b5 }
            java.lang.String r13 = r11.a()     // Catch:{ Throwable -> 0x01b5 }
            java.lang.String r11 = r11.b()     // Catch:{ Throwable -> 0x01b5 }
            r12.<init>(r13, r11)     // Catch:{ Throwable -> 0x01b5 }
            r0.add(r12)     // Catch:{ Throwable -> 0x01b5 }
            goto L_0x0120
        L_0x013d:
            r10.headers(r0)     // Catch:{ Throwable -> 0x01b5 }
        L_0x0140:
            if (r25 == 0) goto L_0x015b
            java.lang.String r0 = ".apk"
            boolean r0 = r9.endsWith(r0)     // Catch:{ Throwable -> 0x01b5 }
            if (r0 != 0) goto L_0x015b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01b5 }
            r0.<init>()     // Catch:{ Throwable -> 0x01b5 }
            r0.append(r9)     // Catch:{ Throwable -> 0x01b5 }
            java.lang.String r5 = ".apk"
            r0.append(r5)     // Catch:{ Throwable -> 0x01b5 }
            java.lang.String r9 = r0.toString()     // Catch:{ Throwable -> 0x01b5 }
        L_0x015b:
            if (r25 != 0) goto L_0x0169
            java.lang.String r0 = ".apk"
            boolean r0 = r9.endsWith(r0)     // Catch:{ Throwable -> 0x01b5 }
            if (r0 == 0) goto L_0x0166
            goto L_0x0169
        L_0x0166:
            r0 = r27
            goto L_0x016b
        L_0x0169:
            java.lang.String r0 = "application/vnd.android.package-archive"
        L_0x016b:
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x01b5 }
            if (r2 != 0) goto L_0x0174
            r10.mimeType(r0)     // Catch:{ Throwable -> 0x01b5 }
        L_0x0174:
            r10.name(r1)     // Catch:{ Throwable -> 0x01b5 }
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ Throwable -> 0x01b5 }
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)     // Catch:{ Throwable -> 0x01b5 }
            if (r0 == 0) goto L_0x018c
            boolean r1 = r0.exists()     // Catch:{ Throwable -> 0x01b5 }
            if (r1 != 0) goto L_0x018c
            boolean r1 = r0.mkdirs()     // Catch:{ Throwable -> 0x01b5 }
            if (r1 != 0) goto L_0x018c
            return r6
        L_0x018c:
            java.lang.String r0 = r0.getPath()     // Catch:{ Throwable -> 0x01b5 }
            r10.savePath(r0)     // Catch:{ Throwable -> 0x01b5 }
            r0 = r30
            r10.showNotification(r0)     // Catch:{ Throwable -> 0x01b5 }
            r0 = r31
            r10.needWifi(r0)     // Catch:{ Throwable -> 0x01b5 }
            int r0 = r8.addDownloadTask(r10)     // Catch:{ Throwable -> 0x01b5 }
            long r0 = (long) r0     // Catch:{ Throwable -> 0x01b5 }
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x01a9
            return r6
        L_0x01a9:
            if (r29 == 0) goto L_0x01b4
            r2 = 2130838576(0x7f020430, float:1.7282138E38)
            r4 = 2131563033(0x7f0d1219, float:1.8751512E38)
            com.bytedance.common.utility.UIUtils.displayToastWithIcon((android.content.Context) r3, (int) r2, (int) r4)     // Catch:{ Throwable -> 0x01b5 }
        L_0x01b4:
            return r0
        L_0x01b5:
            return r6
        L_0x01b6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.app.c.a(java.lang.String, java.lang.String, boolean, android.content.Context, java.lang.String, java.util.List, boolean, boolean, boolean):long");
    }
}
