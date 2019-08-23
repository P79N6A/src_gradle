package com.ss.android.newmedia.app;

import android.annotation.TargetApi;
import com.meituan.robust.ChangeQuickRedirect;

@TargetApi(9)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30168a;

    @TargetApi(11)
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30169a;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x017d A[Catch:{ Throwable -> 0x01b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a6 A[Catch:{ Throwable -> 0x01b0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(java.lang.String r23, java.lang.String r24, boolean r25, android.content.Context r26, java.lang.String r27, java.util.List<com.ss.android.http.a.a> r28, boolean r29) {
        /*
            r3 = r26
            r6 = 7
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r14 = 0
            r7[r14] = r23
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
            com.meituan.robust.ChangeQuickRedirect r9 = f30168a
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
            java.lang.Class r13 = java.lang.Long.TYPE
            r8 = 0
            r10 = 1
            r11 = 18548(0x4874, float:2.5991E-41)
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L_0x00aa
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r14] = r23
            r7[r15] = r24
            java.lang.Byte r0 = java.lang.Byte.valueOf(r25)
            r7[r16] = r0
            r7[r17] = r3
            r7[r18] = r27
            r7[r19] = r28
            java.lang.Byte r0 = java.lang.Byte.valueOf(r29)
            r7[r20] = r0
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r1 = f30168a
            r2 = 1
            r3 = 18548(0x4874, float:2.5991E-41)
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
        L_0x00aa:
            r6 = -1
            if (r3 != 0) goto L_0x00af
            return r6
        L_0x00af:
            java.lang.String r8 = "download"
            java.lang.Object r8 = r3.getSystemService(r8)     // Catch:{ Exception -> 0x01b1 }
            android.app.DownloadManager r8 = (android.app.DownloadManager) r8     // Catch:{ Exception -> 0x01b1 }
            if (r8 != 0) goto L_0x00ba
            return r6
        L_0x00ba:
            android.net.Uri r0 = android.net.Uri.parse(r23)     // Catch:{ Throwable -> 0x01b0 }
            java.lang.String r9 = r0.getLastPathSegment()     // Catch:{ Throwable -> 0x01b0 }
            boolean r10 = com.bytedance.common.utility.StringUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x01b0 }
            if (r10 == 0) goto L_0x00d7
            boolean r9 = com.bytedance.common.utility.StringUtils.isEmpty(r24)     // Catch:{ Throwable -> 0x01b0 }
            if (r9 != 0) goto L_0x00d1
            r9 = r24
            goto L_0x00d7
        L_0x00d1:
            if (r25 == 0) goto L_0x00d6
            java.lang.String r9 = "default.apk"
            goto L_0x00d7
        L_0x00d6:
            return r6
        L_0x00d7:
            boolean r10 = com.bytedance.common.utility.StringUtils.isEmpty(r24)     // Catch:{ Throwable -> 0x01b0 }
            if (r10 == 0) goto L_0x00df
            r1 = r9
            goto L_0x00e1
        L_0x00df:
            r1 = r24
        L_0x00e1:
            android.app.DownloadManager$Request r10 = new android.app.DownloadManager$Request     // Catch:{ Throwable -> 0x01b0 }
            r10.<init>(r0)     // Catch:{ Throwable -> 0x01b0 }
            if (r28 == 0) goto L_0x0104
            java.util.Iterator r0 = r28.iterator()     // Catch:{ Throwable -> 0x01b0 }
        L_0x00ec:
            boolean r5 = r0.hasNext()     // Catch:{ Throwable -> 0x01b0 }
            if (r5 == 0) goto L_0x0104
            java.lang.Object r5 = r0.next()     // Catch:{ Throwable -> 0x01b0 }
            com.ss.android.http.a.a r5 = (com.ss.android.http.a.a) r5     // Catch:{ Throwable -> 0x01b0 }
            java.lang.String r11 = r5.a()     // Catch:{ Throwable -> 0x01b0 }
            java.lang.String r5 = r5.b()     // Catch:{ Throwable -> 0x01b0 }
            r10.addRequestHeader(r11, r5)     // Catch:{ Throwable -> 0x01b0 }
            goto L_0x00ec
        L_0x0104:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x01b0 }
            r5 = 11
            if (r0 < r5) goto L_0x014c
            com.ss.android.newmedia.app.d$a r0 = new com.ss.android.newmedia.app.d$a     // Catch:{ Throwable -> 0x01b0 }
            r0.<init>(r14)     // Catch:{ Throwable -> 0x01b0 }
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x01b0 }
            r5[r14] = r10     // Catch:{ Throwable -> 0x01b0 }
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.newmedia.app.d.a.f30169a     // Catch:{ Throwable -> 0x01b0 }
            r19 = 0
            r20 = 18549(0x4875, float:2.5993E-41)
            java.lang.Class[] r11 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x01b0 }
            java.lang.Class<android.app.DownloadManager$Request> r12 = android.app.DownloadManager.Request.class
            r11[r14] = r12     // Catch:{ Throwable -> 0x01b0 }
            java.lang.Class r22 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x01b0 }
            r16 = r5
            r17 = r0
            r21 = r11
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x01b0 }
            if (r5 == 0) goto L_0x0149
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x01b0 }
            r5[r14] = r10     // Catch:{ Throwable -> 0x01b0 }
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.newmedia.app.d.a.f30169a     // Catch:{ Throwable -> 0x01b0 }
            r19 = 0
            r20 = 18549(0x4875, float:2.5993E-41)
            java.lang.Class[] r11 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x01b0 }
            java.lang.Class<android.app.DownloadManager$Request> r12 = android.app.DownloadManager.Request.class
            r11[r14] = r12     // Catch:{ Throwable -> 0x01b0 }
            java.lang.Class r22 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x01b0 }
            r16 = r5
            r17 = r0
            r21 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x01b0 }
            goto L_0x014c
        L_0x0149:
            r10.setNotificationVisibility(r15)     // Catch:{ Throwable -> 0x01b0 }
        L_0x014c:
            if (r25 == 0) goto L_0x0167
            java.lang.String r0 = ".apk"
            boolean r0 = r9.endsWith(r0)     // Catch:{ Throwable -> 0x01b0 }
            if (r0 != 0) goto L_0x0167
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01b0 }
            r0.<init>()     // Catch:{ Throwable -> 0x01b0 }
            r0.append(r9)     // Catch:{ Throwable -> 0x01b0 }
            java.lang.String r5 = ".apk"
            r0.append(r5)     // Catch:{ Throwable -> 0x01b0 }
            java.lang.String r9 = r0.toString()     // Catch:{ Throwable -> 0x01b0 }
        L_0x0167:
            if (r25 != 0) goto L_0x0175
            java.lang.String r0 = ".apk"
            boolean r0 = r9.endsWith(r0)     // Catch:{ Throwable -> 0x01b0 }
            if (r0 == 0) goto L_0x0172
            goto L_0x0175
        L_0x0172:
            r0 = r27
            goto L_0x0177
        L_0x0175:
            java.lang.String r0 = "application/vnd.android.package-archive"
        L_0x0177:
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x01b0 }
            if (r2 != 0) goto L_0x0180
            r10.setMimeType(r0)     // Catch:{ Throwable -> 0x01b0 }
        L_0x0180:
            r10.setTitle(r1)     // Catch:{ Throwable -> 0x01b0 }
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ Throwable -> 0x01b0 }
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)     // Catch:{ Throwable -> 0x01b0 }
            if (r0 == 0) goto L_0x0198
            boolean r1 = r0.exists()     // Catch:{ Throwable -> 0x01b0 }
            if (r1 != 0) goto L_0x0198
            boolean r0 = r0.mkdirs()     // Catch:{ Throwable -> 0x01b0 }
            if (r0 != 0) goto L_0x0198
            return r6
        L_0x0198:
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ Throwable -> 0x01b0 }
            r10.setDestinationInExternalPublicDir(r0, r9)     // Catch:{ Throwable -> 0x01b0 }
            r10.setAllowedOverRoaming(r14)     // Catch:{ Throwable -> 0x01b0 }
            long r0 = r8.enqueue(r10)     // Catch:{ Throwable -> 0x01b0 }
            if (r29 == 0) goto L_0x01af
            r2 = 2130838576(0x7f020430, float:1.7282138E38)
            r4 = 2131563033(0x7f0d1219, float:1.8751512E38)
            com.bytedance.common.utility.UIUtils.displayToastWithIcon((android.content.Context) r3, (int) r2, (int) r4)     // Catch:{ Throwable -> 0x01b0 }
        L_0x01af:
            return r0
        L_0x01b0:
            return r6
        L_0x01b1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.app.d.a(java.lang.String, java.lang.String, boolean, android.content.Context, java.lang.String, java.util.List, boolean):long");
    }
}
