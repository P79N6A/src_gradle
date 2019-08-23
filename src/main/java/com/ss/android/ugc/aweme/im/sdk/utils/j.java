package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52598a;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[SYNTHETIC, Splitter:B:23:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067 A[SYNTHETIC, Splitter:B:29:0x0067] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f52598a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.io.File> r3 = java.io.File.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 53387(0xd08b, float:7.4811E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f52598a
            r13 = 1
            r14 = 53387(0xd08b, float:7.4811E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.io.File> r0 = java.io.File.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0065, all -> 0x005d }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0065, all -> 0x005d }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0065, all -> 0x005d }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0065, all -> 0x005d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            r0.<init>()     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
        L_0x0047:
            java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            if (r1 == 0) goto L_0x0051
            r0.append(r1)     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            goto L_0x0047
        L_0x0051:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            r2.close()     // Catch:{ Exception -> 0x0058 }
        L_0x0058:
            return r0
        L_0x0059:
            r0 = move-exception
            goto L_0x005f
        L_0x005b:
            r1 = r2
            goto L_0x0065
        L_0x005d:
            r0 = move-exception
            r2 = r1
        L_0x005f:
            if (r2 == 0) goto L_0x0064
            r2.close()     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            throw r0
        L_0x0065:
            if (r1 == 0) goto L_0x006a
            r1.close()     // Catch:{ Exception -> 0x006a }
        L_0x006a:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.j.a(java.io.File):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:24|(0)|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00c8 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c5 A[SYNTHETIC, Splitter:B:30:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb A[SYNTHETIC, Splitter:B:36:0x00cb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized <T extends java.io.Serializable> java.util.List<T> a(java.lang.String r18) {
        /*
            r0 = r18
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.utils.j> r1 = com.ss.android.ugc.aweme.im.sdk.utils.j.class
            monitor-enter(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x00d0 }
            r10 = 0
            r3[r10] = r0     // Catch:{ all -> 0x00d0 }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = f52598a     // Catch:{ all -> 0x00d0 }
            r6 = 1
            r7 = 53386(0xd08a, float:7.481E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x00d0 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r10] = r9     // Catch:{ all -> 0x00d0 }
            java.lang.Class<java.util.List> r9 = java.util.List.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x003d
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x00d0 }
            r11[r10] = r0     // Catch:{ all -> 0x00d0 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f52598a     // Catch:{ all -> 0x00d0 }
            r14 = 1
            r15 = 53386(0xd08a, float:7.481E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x00d0 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r10] = r2     // Catch:{ all -> 0x00d0 }
            java.lang.Class<java.util.List> r17 = java.util.List.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00d0 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00d0 }
            monitor-exit(r1)
            return r0
        L_0x003d:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00d0 }
            r3.<init>()     // Catch:{ all -> 0x00d0 }
            android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()     // Catch:{ all -> 0x00d0 }
            java.io.File r0 = r4.getFileStreamPath(r0)     // Catch:{ all -> 0x00d0 }
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00c9, all -> 0x00c1 }
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ Exception -> 0x00c9, all -> 0x00c1 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x00c9, all -> 0x00c1 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00c9, all -> 0x00c1 }
        L_0x0055:
            java.lang.String r0 = r5.readLine()     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            if (r0 == 0) goto L_0x00b9
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r11[r10] = r0     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.utils.al.f52480a     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r14 = 1
            r15 = 53683(0xd1b3, float:7.5226E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r10] = r6     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            java.lang.Class<java.lang.Object> r17 = java.lang.Object.class
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            if (r4 == 0) goto L_0x0092
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r11[r10] = r0     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.utils.al.f52480a     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r14 = 1
            r15 = 53683(0xd1b3, float:7.5226E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r0[r10] = r4     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            java.lang.Class<java.lang.Object> r17 = java.lang.Object.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            java.lang.Object r0 = (java.lang.Object) r0     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            goto L_0x00b3
        L_0x0092:
            java.lang.String r4 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r4)     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            java.lang.String r6 = "ISO-8859-1"
            byte[] r0 = r0.getBytes(r6)     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r0.<init>(r4)     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            java.lang.Object r6 = r0.readObject()     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r0.close()     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r4.close()     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r0 = r6
        L_0x00b3:
            java.io.Serializable r0 = (java.io.Serializable) r0     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            r3.add(r0)     // Catch:{ Exception -> 0x00bf, all -> 0x00bd }
            goto L_0x0055
        L_0x00b9:
            r5.close()     // Catch:{ Exception -> 0x00ce }
            goto L_0x00ce
        L_0x00bd:
            r0 = move-exception
            goto L_0x00c3
        L_0x00bf:
            r4 = r5
            goto L_0x00c9
        L_0x00c1:
            r0 = move-exception
            r5 = r4
        L_0x00c3:
            if (r5 == 0) goto L_0x00c8
            r5.close()     // Catch:{ Exception -> 0x00c8 }
        L_0x00c8:
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00c9:
            if (r4 == 0) goto L_0x00ce
            r4.close()     // Catch:{ Exception -> 0x00ce }
        L_0x00ce:
            monitor-exit(r1)
            return r3
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.j.a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a A[SYNTHETIC, Splitter:B:38:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0091 A[SYNTHETIC, Splitter:B:42:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0098 A[SYNTHETIC, Splitter:B:49:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009f A[SYNTHETIC, Splitter:B:53:0x009f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f52598a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 53388(0xd08c, float:7.4813E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f52598a
            r15 = 1
            r16 = 53388(0xd08c, float:7.4813E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0095, all -> 0x0086 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0095, all -> 0x0086 }
            boolean r0 = r3.exists()     // Catch:{ Exception -> 0x0095, all -> 0x0086 }
            if (r0 == 0) goto L_0x0078
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0095, all -> 0x0086 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0095, all -> 0x0086 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0072, all -> 0x006f }
        L_0x005f:
            int r1 = r4.read(r0)     // Catch:{ Exception -> 0x0072, all -> 0x006f }
            r2 = -1
            if (r1 == r2) goto L_0x006a
            r3.write(r0, r10, r1)     // Catch:{ Exception -> 0x0072, all -> 0x006f }
            goto L_0x005f
        L_0x006a:
            r3.flush()     // Catch:{ Exception -> 0x0072, all -> 0x006f }
            r2 = r4
            goto L_0x0079
        L_0x006f:
            r0 = move-exception
            r2 = r3
            goto L_0x0088
        L_0x0072:
            r2 = r3
            goto L_0x0096
        L_0x0074:
            r0 = move-exception
            goto L_0x0088
        L_0x0076:
            goto L_0x0096
        L_0x0078:
            r3 = r2
        L_0x0079:
            if (r2 == 0) goto L_0x0080
            r2.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x0080
        L_0x007f:
        L_0x0080:
            if (r3 == 0) goto L_0x00a3
            r3.close()     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            return
        L_0x0086:
            r0 = move-exception
            r4 = r2
        L_0x0088:
            if (r4 == 0) goto L_0x008f
            r4.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x008f
        L_0x008e:
        L_0x008f:
            if (r2 == 0) goto L_0x0094
            r2.close()     // Catch:{ IOException -> 0x0094 }
        L_0x0094:
            throw r0
        L_0x0095:
            r4 = r2
        L_0x0096:
            if (r4 == 0) goto L_0x009d
            r4.close()     // Catch:{ IOException -> 0x009c }
            goto L_0x009d
        L_0x009c:
        L_0x009d:
            if (r2 == 0) goto L_0x00a3
            r2.close()     // Catch:{ IOException -> 0x00a2 }
        L_0x00a2:
            return
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.j.a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:37|(0)|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00f3 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0 A[SYNTHETIC, Splitter:B:43:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6 A[SYNTHETIC, Splitter:B:49:0x00f6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized <T extends java.io.Serializable> boolean a(java.lang.String r20, java.util.List<T> r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.utils.j> r2 = com.ss.android.ugc.aweme.im.sdk.utils.j.class
            monitor-enter(r2)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00fb }
            r11 = 0
            r4[r11] = r0     // Catch:{ all -> 0x00fb }
            r12 = 1
            r4[r12] = r1     // Catch:{ all -> 0x00fb }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f52598a     // Catch:{ all -> 0x00fb }
            r7 = 1
            r8 = 53385(0xd089, float:7.4808E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x00fb }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r11] = r10     // Catch:{ all -> 0x00fb }
            java.lang.Class<java.util.List> r10 = java.util.List.class
            r9[r12] = r10     // Catch:{ all -> 0x00fb }
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00fb }
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00fb }
            if (r4 == 0) goto L_0x0051
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x00fb }
            r13[r11] = r0     // Catch:{ all -> 0x00fb }
            r13[r12] = r1     // Catch:{ all -> 0x00fb }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f52598a     // Catch:{ all -> 0x00fb }
            r16 = 1
            r17 = 53385(0xd089, float:7.4808E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x00fb }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1     // Catch:{ all -> 0x00fb }
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r12] = r1     // Catch:{ all -> 0x00fb }
            java.lang.Class r19 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00fb }
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00fb }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00fb }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00fb }
            monitor-exit(r2)
            return r0
        L_0x0051:
            if (r1 != 0) goto L_0x0055
            monitor-exit(r2)
            return r11
        L_0x0055:
            android.content.Context r3 = com.ss.android.common.applog.GlobalContext.getContext()     // Catch:{ all -> 0x00fb }
            java.io.File r0 = r3.getFileStreamPath(r0)     // Catch:{ all -> 0x00fb }
            boolean r3 = r0.exists()     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x0069
            r0.createNewFile()     // Catch:{ IOException -> 0x0067 }
            goto L_0x0069
        L_0x0067:
            monitor-exit(r2)
            return r11
        L_0x0069:
            r3 = 0
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x00f4, all -> 0x00ec }
            java.io.FileWriter r5 = new java.io.FileWriter     // Catch:{ Exception -> 0x00f4, all -> 0x00ec }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00f4, all -> 0x00ec }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00f4, all -> 0x00ec }
            r0 = 0
        L_0x0075:
            int r3 = r21.size()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            if (r0 >= r3) goto L_0x00e3
            java.lang.Object r3 = r1.get(r0)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r13[r11] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.utils.al.f52480a     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r16 = 1
            r17 = 53682(0xd1b2, float:7.5225E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5[r11] = r6     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            if (r5 == 0) goto L_0x00b8
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r13[r11] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.utils.al.f52480a     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r16 = 1
            r17 = 53682(0xd1b2, float:7.5225E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r3[r11] = r5     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            goto L_0x00d7
        L_0x00b8:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r5.<init>()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r6.writeObject(r3)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r3 = "ISO-8859-1"
            java.lang.String r3 = r5.toString(r3)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r7 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r7)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r6.close()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r5.close()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
        L_0x00d7:
            r4.write(r3)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r4.newLine()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r4.flush()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00e3:
            r4.close()     // Catch:{ IOException -> 0x00e6 }
        L_0x00e6:
            r11 = 1
            goto L_0x00f9
        L_0x00e8:
            r0 = move-exception
            goto L_0x00ee
        L_0x00ea:
            r3 = r4
            goto L_0x00f4
        L_0x00ec:
            r0 = move-exception
            r4 = r3
        L_0x00ee:
            if (r4 == 0) goto L_0x00f3
            r4.close()     // Catch:{ IOException -> 0x00f3 }
        L_0x00f3:
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00f4:
            if (r3 == 0) goto L_0x00f9
            r3.close()     // Catch:{ IOException -> 0x00f9 }
        L_0x00f9:
            monitor-exit(r2)
            return r11
        L_0x00fb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.j.a(java.lang.String, java.util.List):boolean");
    }
}
