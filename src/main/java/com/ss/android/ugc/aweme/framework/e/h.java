package com.ss.android.ugc.aweme.framework.e;

import com.meituan.robust.ChangeQuickRedirect;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48509a;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        if (r1 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a7, code lost:
        if (r1 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f6, code lost:
        if (r3 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0107, code lost:
        if (r3 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1 A[SYNTHETIC, Splitter:B:34:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0102 A[SYNTHETIC, Splitter:B:71:0x0102] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r16, android.net.Uri r17) {
        /*
            r1 = 2
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r15 = 0
            r8[r15] = r16
            r6 = 1
            r8[r6] = r17
            com.meituan.robust.ChangeQuickRedirect r10 = f48509a
            java.lang.Class[] r13 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r13[r15] = r2
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r13[r6] = r2
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r9 = 0
            r11 = 1
            r12 = 45999(0xb3af, float:6.4458E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r2 == 0) goto L_0x0043
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r15] = r16
            r2[r6] = r17
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = f48509a
            r10 = 1
            r11 = 45999(0xb3af, float:6.4458E-41)
            java.lang.Class[] r12 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r12[r15] = r0
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            r12[r6] = r0
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r7 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0043:
            r8 = 0
            if (r17 != 0) goto L_0x0047
            return r8
        L_0x0047:
            java.lang.String r1 = r17.getScheme()
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x010c
            java.lang.String r2 = "file"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x005b
            goto L_0x010c
        L_0x005b:
            java.lang.String r2 = "http"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0068
            java.lang.String r0 = r17.toString()
            return r0
        L_0x0068:
            java.lang.String r2 = "content"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x010b
            java.lang.String[] r11 = new java.lang.String[r6]
            java.lang.String r1 = "_data"
            r11[r15] = r1
            java.lang.String r9 = ""
            android.content.ContentResolver r1 = r16.getContentResolver()     // Catch:{ Exception -> 0x00a5, all -> 0x009d }
            r4 = 0
            r5 = 0
            r10 = 0
            r2 = r17
            r3 = r11
            r12 = 1
            r6 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00a6, all -> 0x009d }
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x00a7, all -> 0x009b }
            if (r2 == 0) goto L_0x0093
            java.lang.String r2 = r1.getString(r15)     // Catch:{ Exception -> 0x00a7, all -> 0x009b }
            r9 = r2
        L_0x0093:
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ Exception -> 0x00a7, all -> 0x009b }
        L_0x0098:
            if (r1 == 0) goto L_0x00ac
            goto L_0x00a9
        L_0x009b:
            r0 = move-exception
            goto L_0x009f
        L_0x009d:
            r0 = move-exception
            r1 = r8
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()     // Catch:{ Exception -> 0x00a4 }
        L_0x00a4:
            throw r0
        L_0x00a5:
            r12 = 1
        L_0x00a6:
            r1 = r8
        L_0x00a7:
            if (r1 == 0) goto L_0x00ac
        L_0x00a9:
            r1.close()     // Catch:{ Exception -> 0x00ac }
        L_0x00ac:
            r2 = r1
            r1 = r9
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x010a
            android.content.ContentResolver r9 = r16.getContentResolver()     // Catch:{ Exception -> 0x0106, all -> 0x00ff }
            java.lang.String r0 = "_id= ?"
            java.lang.String r3 = r17.getLastPathSegment()     // Catch:{ Exception -> 0x0106, all -> 0x00ff }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0106, all -> 0x00ff }
            r5 = 19
            if (r4 < r5) goto L_0x00da
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0106, all -> 0x00ff }
            if (r4 != 0) goto L_0x00da
            java.lang.String r4 = ":"
            boolean r4 = r3.contains(r4)     // Catch:{ Exception -> 0x0106, all -> 0x00ff }
            if (r4 == 0) goto L_0x00da
            java.lang.String r4 = ":"
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ Exception -> 0x0106, all -> 0x00ff }
            r3 = r3[r12]     // Catch:{ Exception -> 0x0106, all -> 0x00ff }
        L_0x00da:
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ Exception -> 0x0106, all -> 0x00ff }
            r13[r15] = r3     // Catch:{ Exception -> 0x0106, all -> 0x00ff }
            android.net.Uri r10 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0106, all -> 0x00ff }
            r14 = 0
            r12 = r0
            android.database.Cursor r3 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0106, all -> 0x00ff }
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x0107, all -> 0x00fc }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = r3.getString(r15)     // Catch:{ Exception -> 0x0107, all -> 0x00fc }
            r1 = r0
        L_0x00f1:
            if (r3 == 0) goto L_0x00f6
            r3.close()     // Catch:{ Exception -> 0x0107, all -> 0x00fc }
        L_0x00f6:
            if (r3 == 0) goto L_0x010a
        L_0x00f8:
            r3.close()     // Catch:{ Exception -> 0x010a }
            goto L_0x010a
        L_0x00fc:
            r0 = move-exception
            r2 = r3
            goto L_0x0100
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            if (r2 == 0) goto L_0x0105
            r2.close()     // Catch:{ Exception -> 0x0105 }
        L_0x0105:
            throw r0
        L_0x0106:
            r3 = r2
        L_0x0107:
            if (r3 == 0) goto L_0x010a
            goto L_0x00f8
        L_0x010a:
            return r1
        L_0x010b:
            return r8
        L_0x010c:
            java.lang.String r0 = r17.getPath()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.framework.e.h.a(android.content.Context, android.net.Uri):java.lang.String");
    }
}
