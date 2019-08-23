package com.ss.android.medialib.f;

import com.meituan.robust.ChangeQuickRedirect;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29666a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f29667b = "com.ss.android.medialib.f.e";

    /* renamed from: c  reason: collision with root package name */
    private static int f29668c = 2048;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.io.Closeable... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f29666a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.io.Closeable[]> r3 = java.io.Closeable[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 17825(0x45a1, float:2.4978E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f29666a
            r13 = 0
            r14 = 17825(0x45a1, float:2.4978E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.io.Closeable[]> r0 = java.io.Closeable[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            int r1 = r0.length
            if (r1 > 0) goto L_0x0038
            return
        L_0x0038:
            int r1 = r0.length
        L_0x0039:
            if (r9 >= r1) goto L_0x0045
            r2 = r0[r9]
            if (r2 == 0) goto L_0x0042
            r2.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            int r9 = r9 + 1
            goto L_0x0039
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.f.e.a(java.io.Closeable[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        a(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d0, code lost:
        r3 = "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7 A[ExcHandler: all (r0v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:13:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r12, java.util.zip.ZipInputStream r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r12
            r10 = 1
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f29666a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2
            java.lang.Class<java.util.zip.ZipInputStream> r2 = java.util.zip.ZipInputStream.class
            r6[r10] = r2
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 17821(0x459d, float:2.4973E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0040
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r12
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f29666a
            r4 = 0
            r5 = 17821(0x459d, float:2.4973E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class<java.util.zip.ZipInputStream> r0 = java.util.zip.ZipInputStream.class
            r6[r10] = r0
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0040:
            if (r13 != 0) goto L_0x0045
            java.lang.String r0 = ""
            return r0
        L_0x0045:
            java.io.File r1 = new java.io.File
            r1.<init>(r12)
            java.io.File r1 = r1.getParentFile()
            if (r1 == 0) goto L_0x0059
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0059
            r1.mkdirs()
        L_0x0059:
            java.lang.String r1 = ""
            java.util.zip.ZipEntry r2 = r13.getNextEntry()     // Catch:{ Exception -> 0x00d0, all -> 0x00c7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d0, all -> 0x00c7 }
            r3.<init>()     // Catch:{ Exception -> 0x00d0, all -> 0x00c7 }
            r3.append(r12)     // Catch:{ Exception -> 0x00d0, all -> 0x00c7 }
            java.lang.String r4 = r2.getName()     // Catch:{ Exception -> 0x00d0, all -> 0x00c7 }
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ Exception -> 0x00d0, all -> 0x00c7 }
            r3.append(r4)     // Catch:{ Exception -> 0x00d0, all -> 0x00c7 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00d0, all -> 0x00c7 }
        L_0x0076:
            if (r2 == 0) goto L_0x00bf
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            r4.<init>()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            r4.append(r12)     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            java.lang.String r5 = r2.getName()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            r4.append(r5)     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            boolean r4 = r1.exists()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            if (r4 == 0) goto L_0x009f
            java.util.zip.ZipEntry r2 = r13.getNextEntry()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            goto L_0x0076
        L_0x009f:
            boolean r2 = r2.isDirectory()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            if (r2 == 0) goto L_0x00b3
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            if (r2 != 0) goto L_0x00ae
            r1.mkdirs()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
        L_0x00ae:
            java.util.zip.ZipEntry r2 = r13.getNextEntry()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            goto L_0x0076
        L_0x00b3:
            int r2 = f29668c     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            r11.a((java.util.zip.ZipInputStream) r13, (java.io.File) r1, (byte[]) r2)     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            java.util.zip.ZipEntry r2 = r13.getNextEntry()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            goto L_0x0076
        L_0x00bf:
            r13.close()     // Catch:{ Exception -> 0x00d1, all -> 0x00c7 }
            java.io.Closeable[] r0 = new java.io.Closeable[r10]
            r0[r9] = r13
            goto L_0x00d5
        L_0x00c7:
            r0 = move-exception
            java.io.Closeable[] r1 = new java.io.Closeable[r10]
            r1[r9] = r13
            r11.a(r1)
            throw r0
        L_0x00d0:
            r3 = r1
        L_0x00d1:
            java.io.Closeable[] r0 = new java.io.Closeable[r10]
            r0[r9] = r13
        L_0x00d5:
            r11.a(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.f.e.a(java.lang.String, java.util.zip.ZipInputStream):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.zip.ZipInputStream r16, java.io.File r17, byte[] r18) {
        /*
            r15 = this;
            r8 = r15
            r0 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r12 = 0
            r1[r12] = r0
            r13 = 1
            r1[r13] = r9
            r14 = 2
            r1[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = f29666a
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<java.util.zip.ZipInputStream> r2 = java.util.zip.ZipInputStream.class
            r6[r12] = r2
            java.lang.Class<java.io.File> r2 = java.io.File.class
            r6[r13] = r2
            java.lang.Class<byte[]> r2 = byte[].class
            r6[r14] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 17824(0x45a0, float:2.4977E-41)
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0051
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r12] = r0
            r1[r13] = r9
            r1[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = f29666a
            r4 = 0
            r5 = 17824(0x45a0, float:2.4977E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<java.util.zip.ZipInputStream> r0 = java.util.zip.ZipInputStream.class
            r6[r12] = r0
            java.lang.Class<java.io.File> r0 = java.io.File.class
            r6[r13] = r0
            java.lang.Class<byte[]> r0 = byte[].class
            r6[r14] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0051:
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x008b, all -> 0x007f }
            r2.<init>(r9)     // Catch:{ IOException -> 0x008b, all -> 0x007f }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x008c, all -> 0x007d }
            int r4 = f29668c     // Catch:{ IOException -> 0x008c, all -> 0x007d }
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x008c, all -> 0x007d }
        L_0x005e:
            int r1 = f29668c     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            int r1 = r0.read(r10, r12, r1)     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            r4 = -1
            if (r1 == r4) goto L_0x006b
            r3.write(r10, r12, r1)     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            goto L_0x005e
        L_0x006b:
            r3.flush()     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            java.io.Closeable[] r0 = new java.io.Closeable[r14]
            r0[r12] = r2
            r0[r13] = r3
        L_0x0074:
            r15.a(r0)
            return
        L_0x0078:
            r0 = move-exception
            r1 = r3
            goto L_0x0081
        L_0x007b:
            r1 = r3
            goto L_0x008c
        L_0x007d:
            r0 = move-exception
            goto L_0x0081
        L_0x007f:
            r0 = move-exception
            r2 = r1
        L_0x0081:
            java.io.Closeable[] r3 = new java.io.Closeable[r14]
            r3[r12] = r2
            r3[r13] = r1
            r15.a(r3)
            throw r0
        L_0x008b:
            r2 = r1
        L_0x008c:
            java.io.Closeable[] r0 = new java.io.Closeable[r14]
            r0[r12] = r2
            r0[r13] = r1
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.f.e.a(java.util.zip.ZipInputStream, java.io.File, byte[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.zip.ZipInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(android.content.Context r22, @android.support.annotation.RawRes int r23, java.lang.String r24) {
        /*
            r21 = this;
            r1 = r23
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r22
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
            r12 = 1
            r4[r12] = r5
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f29666a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r13] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r7 = 0
            r8 = 17819(0x459b, float:2.497E-41)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005e
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r14[r12] = r0
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f29666a
            r17 = 0
            r18 = 17819(0x459b, float:2.497E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x005e:
            if (r22 == 0) goto L_0x00d0
            if (r1 == 0) goto L_0x00d0
            boolean r3 = android.text.TextUtils.isEmpty(r24)
            if (r3 == 0) goto L_0x0069
            goto L_0x00d0
        L_0x0069:
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r11] = r22
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r4[r12] = r3
            com.meituan.robust.ChangeQuickRedirect r6 = f29666a
            r7 = 0
            r8 = 17822(0x459e, float:2.4974E-41)
            java.lang.Class[] r9 = new java.lang.Class[r13]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r9[r11] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r9[r12] = r3
            java.lang.Class<java.util.zip.ZipInputStream> r10 = java.util.zip.ZipInputStream.class
            r5 = r21
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            r4 = 0
            if (r3 == 0) goto L_0x00b7
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r11] = r22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r14[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r16 = f29666a
            r17 = 0
            r18 = 17822(0x459e, float:2.4974E-41)
            java.lang.Class[] r0 = new java.lang.Class[r13]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class<java.util.zip.ZipInputStream> r20 = java.util.zip.ZipInputStream.class
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            r4 = r0
            java.util.zip.ZipInputStream r4 = (java.util.zip.ZipInputStream) r4
        L_0x00b4:
            r0 = r21
            goto L_0x00cb
        L_0x00b7:
            if (r22 != 0) goto L_0x00ba
        L_0x00b9:
            goto L_0x00b4
        L_0x00ba:
            android.content.res.Resources r0 = r22.getResources()
            if (r0 != 0) goto L_0x00c1
            goto L_0x00b9
        L_0x00c1:
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream
            java.io.InputStream r0 = r0.openRawResource(r1)
            r4.<init>(r0)
            goto L_0x00b4
        L_0x00cb:
            java.lang.String r1 = r0.a(r2, r4)
            return r1
        L_0x00d0:
            r0 = r21
            java.lang.String r1 = ""
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.f.e.a(android.content.Context, int, java.lang.String):java.lang.String");
    }
}
