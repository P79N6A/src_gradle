package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;

public final class bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52579a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.ss.android.ugc.aweme.im.sdk.k.w} */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:94|95|(2:97|98)|99|100) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:27|(1:29)|30|(11:31|32|(1:34)(2:35|(1:37)(2:38|(2:40|(1:42)(3:116|43|44))(1:45)))|46|47|48|49|50|(2:51|(1:53)(1:54))|55|(1:118))|58|59|119) */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01b4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x01d3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x008b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01aa A[SYNTHETIC, Splitter:B:69:0x01aa] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b1 A[SYNTHETIC, Splitter:B:73:0x01b1] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b9 A[SYNTHETIC, Splitter:B:80:0x01b9] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:58:0x0198] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d0 A[SYNTHETIC, Splitter:B:97:0x01d0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(java.lang.String r20, java.lang.String r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.utils.bh> r2 = com.ss.android.ugc.aweme.im.sdk.utils.bh.class
            monitor-enter(r2)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x01df }
            r11 = 0
            r4[r11] = r0     // Catch:{ all -> 0x01df }
            r12 = 1
            r4[r12] = r1     // Catch:{ all -> 0x01df }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f52579a     // Catch:{ all -> 0x01df }
            r7 = 1
            r8 = 53852(0xd25c, float:7.5463E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x01df }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r11] = r10     // Catch:{ all -> 0x01df }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r12] = r10     // Catch:{ all -> 0x01df }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ all -> 0x01df }
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01df }
            if (r4 == 0) goto L_0x004a
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x01df }
            r13[r11] = r0     // Catch:{ all -> 0x01df }
            r13[r12] = r1     // Catch:{ all -> 0x01df }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f52579a     // Catch:{ all -> 0x01df }
            r16 = 1
            r17 = 53852(0xd25c, float:7.5463E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01df }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1     // Catch:{ all -> 0x01df }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1     // Catch:{ all -> 0x01df }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ all -> 0x01df }
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01df }
            monitor-exit(r2)
            return
        L_0x004a:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x01df }
            r3.<init>(r1)     // Catch:{ all -> 0x01df }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x01df }
            if (r4 != 0) goto L_0x0058
            r3.mkdirs()     // Catch:{ all -> 0x01df }
        L_0x0058:
            r3 = 0
            com.ss.android.ugc.aweme.im.sdk.k.w r13 = new com.ss.android.ugc.aweme.im.sdk.k.w     // Catch:{ IOException -> 0x01d4, all -> 0x01cc }
            r13.<init>(r0)     // Catch:{ IOException -> 0x01d4, all -> 0x01cc }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.im.sdk.k.w.f51782a     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r7 = 0
            r8 = 54323(0xd433, float:7.6123E-41)
            java.lang.Class[] r9 = new java.lang.Class[r11]     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.lang.Class<java.util.Enumeration> r10 = java.util.Enumeration.class
            r5 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            if (r0 == 0) goto L_0x0085
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.im.sdk.k.w.f51782a     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r7 = 0
            r8 = 54323(0xd433, float:7.6123E-41)
            java.lang.Class[] r9 = new java.lang.Class[r11]     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.lang.Class<java.util.Enumeration> r10 = java.util.Enumeration.class
            r5 = r13
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.util.Enumeration r0 = (java.util.Enumeration) r0     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            goto L_0x008b
        L_0x0085:
            java.util.List<com.ss.android.ugc.aweme.im.sdk.k.u> r0 = r13.f51783b     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.util.Enumeration r0 = java.util.Collections.enumeration(r0)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
        L_0x008b:
            boolean r4 = r0.hasMoreElements()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = r0.nextElement()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r14 = r4
            com.ss.android.ugc.aweme.im.sdk.k.u r14 = (com.ss.android.ugc.aweme.im.sdk.k.u) r14     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            boolean r4 = r14.isDirectory()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            if (r4 == 0) goto L_0x00c8
            java.lang.String r4 = r14.getName()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            int r5 = r4.length()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            int r5 = r5 - r12
            java.lang.String r4 = r4.substring(r11, r5)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r6.<init>()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r6.append(r1)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.lang.String r7 = java.io.File.separator     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r6.append(r7)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r6.append(r4)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r5.mkdir()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            goto L_0x008b
        L_0x00c8:
            java.lang.String r4 = r14.getName()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r5 = 92
            r6 = 47
            java.lang.String r4 = r4.replace(r5, r6)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.io.File r15 = new java.io.File     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r5.<init>()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r5.append(r1)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.lang.String r6 = java.io.File.separator     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r5.append(r6)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r5.append(r4)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r15.<init>(r4)     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.io.File r4 = r15.getParentFile()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            r4.mkdirs()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            boolean r4 = r15.exists()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            if (r4 == 0) goto L_0x00fd
            r15.delete()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
        L_0x00fd:
            r15.createNewFile()     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            r4[r11] = r14     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.im.sdk.k.w.f51782a     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            r7 = 0
            r8 = 54327(0xd437, float:7.6128E-41)
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r5 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r9[r11] = r5     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            java.lang.Class<java.io.InputStream> r10 = java.io.InputStream.class
            r5 = r13
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            if (r4 == 0) goto L_0x0133
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            r4[r11] = r14     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.im.sdk.k.w.f51782a     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            r7 = 0
            r8 = 54327(0xd437, float:7.6128E-41)
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r5 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r9[r11] = r5     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            java.lang.Class<java.io.InputStream> r10 = java.io.InputStream.class
            r5 = r13
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            goto L_0x017f
        L_0x0133:
            boolean r4 = r14 instanceof com.ss.android.ugc.aweme.im.sdk.k.w.b     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            if (r4 != 0) goto L_0x0139
            r4 = r3
            goto L_0x017f
        L_0x0139:
            r4 = r14
            com.ss.android.ugc.aweme.im.sdk.k.w$b r4 = (com.ss.android.ugc.aweme.im.sdk.k.w.b) r4     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            com.ss.android.ugc.aweme.im.sdk.k.w$d r4 = r4.i     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            com.ss.android.ugc.aweme.im.sdk.k.aa.a((com.ss.android.ugc.aweme.im.sdk.k.u) r14)     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            long r6 = r4.f51800b     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            com.ss.android.ugc.aweme.im.sdk.k.w$a r10 = new com.ss.android.ugc.aweme.im.sdk.k.w$a     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            long r8 = r14.getCompressedSize()     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            r4 = r10
            r5 = r13
            r4.<init>(r6, r8)     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            int r4 = r14.getMethod()     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            if (r4 == 0) goto L_0x017e
            r5 = 8
            if (r4 != r5) goto L_0x0166
            r10.f51793b = r12     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            java.util.zip.Inflater r4 = new java.util.zip.Inflater     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            r4.<init>(r12)     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            com.ss.android.ugc.aweme.im.sdk.k.w$1 r5 = new com.ss.android.ugc.aweme.im.sdk.k.w$1     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            r5.<init>(r10, r4, r4)     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            r4 = r5
            goto L_0x017f
        L_0x0166:
            java.util.zip.ZipException r4 = new java.util.zip.ZipException     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            java.lang.String r6 = "Found unsupported compression method "
            r5.<init>(r6)     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            int r6 = r14.getMethod()     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            r5.append(r6)     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
            throw r4     // Catch:{ IOException -> 0x01b5, all -> 0x01a6 }
        L_0x017e:
            r4 = r10
        L_0x017f:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01a4, all -> 0x01a2 }
            r5.<init>(r15)     // Catch:{ IOException -> 0x01a4, all -> 0x01a2 }
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x01a0, all -> 0x019d }
        L_0x0188:
            int r7 = r4.read(r6)     // Catch:{ IOException -> 0x01a0, all -> 0x019d }
            r8 = -1
            if (r7 == r8) goto L_0x0193
            r5.write(r6, r11, r7)     // Catch:{ IOException -> 0x01a0, all -> 0x019d }
            goto L_0x0188
        L_0x0193:
            r5.close()     // Catch:{ IOException -> 0x0196, all -> 0x01c8 }
        L_0x0196:
            if (r4 == 0) goto L_0x008b
        L_0x0198:
            r4.close()     // Catch:{ IOException -> 0x008b, all -> 0x01c8 }
            goto L_0x008b
        L_0x019d:
            r0 = move-exception
            r3 = r5
            goto L_0x01a8
        L_0x01a0:
            goto L_0x01b7
        L_0x01a2:
            r0 = move-exception
            goto L_0x01a8
        L_0x01a4:
            r5 = r3
            goto L_0x01b7
        L_0x01a6:
            r0 = move-exception
            r4 = r3
        L_0x01a8:
            if (r3 == 0) goto L_0x01af
            r3.close()     // Catch:{ IOException -> 0x01ae, all -> 0x01c8 }
            goto L_0x01af
        L_0x01ae:
        L_0x01af:
            if (r4 == 0) goto L_0x01b4
            r4.close()     // Catch:{ IOException -> 0x01b4, all -> 0x01c8 }
        L_0x01b4:
            throw r0     // Catch:{ IOException -> 0x01ca, all -> 0x01c8 }
        L_0x01b5:
            r4 = r3
            r5 = r4
        L_0x01b7:
            if (r5 == 0) goto L_0x01be
            r5.close()     // Catch:{ IOException -> 0x01bd, all -> 0x01c8 }
            goto L_0x01be
        L_0x01bd:
        L_0x01be:
            if (r4 == 0) goto L_0x008b
            goto L_0x0198
        L_0x01c1:
            r13.close()     // Catch:{ IOException -> 0x01c6 }
            monitor-exit(r2)
            return
        L_0x01c6:
            monitor-exit(r2)
            return
        L_0x01c8:
            r0 = move-exception
            goto L_0x01ce
        L_0x01ca:
            r3 = r13
            goto L_0x01d4
        L_0x01cc:
            r0 = move-exception
            r13 = r3
        L_0x01ce:
            if (r13 == 0) goto L_0x01d3
            r13.close()     // Catch:{ IOException -> 0x01d3 }
        L_0x01d3:
            throw r0     // Catch:{ all -> 0x01df }
        L_0x01d4:
            if (r3 == 0) goto L_0x01dd
            r3.close()     // Catch:{ IOException -> 0x01db }
            monitor-exit(r2)
            return
        L_0x01db:
            monitor-exit(r2)
            return
        L_0x01dd:
            monitor-exit(r2)
            return
        L_0x01df:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.bh.a(java.lang.String, java.lang.String):void");
    }
}
