package com.facebook.imageutils;

public final class e {
    public static int a(int i) {
        return g.a(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059 A[Catch:{ IOException -> 0x00fc }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a A[Catch:{ IOException -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ac A[Catch:{ IOException -> 0x00fc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.io.InputStream r11) {
        /*
            r0 = 0
            com.facebook.common.internal.Preconditions.checkNotNull(r11)     // Catch:{ IOException -> 0x00fc }
        L_0x0004:
            r1 = 1
            int r2 = com.facebook.imageutils.f.a(r11, r1, r0)     // Catch:{ IOException -> 0x00fc }
            r3 = 255(0xff, float:3.57E-43)
            r4 = 2
            if (r2 != r3) goto L_0x0036
            r2 = 255(0xff, float:3.57E-43)
        L_0x0010:
            if (r2 != r3) goto L_0x0017
            int r2 = com.facebook.imageutils.f.a(r11, r1, r0)     // Catch:{ IOException -> 0x00fc }
            goto L_0x0010
        L_0x0017:
            r3 = 225(0xe1, float:3.15E-43)
            if (r2 != r3) goto L_0x001d
            r2 = 1
            goto L_0x0037
        L_0x001d:
            r3 = 216(0xd8, float:3.03E-43)
            if (r2 == r3) goto L_0x0004
            if (r2 == r1) goto L_0x0004
            r3 = 217(0xd9, float:3.04E-43)
            if (r2 == r3) goto L_0x0036
            r3 = 218(0xda, float:3.05E-43)
            if (r2 != r3) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            int r1 = com.facebook.imageutils.f.a(r11, r4, r0)     // Catch:{ IOException -> 0x00fc }
            int r1 = r1 - r4
            long r1 = (long) r1     // Catch:{ IOException -> 0x00fc }
            r11.skip(r1)     // Catch:{ IOException -> 0x00fc }
            goto L_0x0004
        L_0x0036:
            r2 = 0
        L_0x0037:
            r3 = 4
            if (r2 == 0) goto L_0x0056
            int r2 = com.facebook.imageutils.f.a(r11, r4, r0)     // Catch:{ IOException -> 0x00fc }
            int r2 = r2 - r4
            r5 = 6
            if (r2 <= r5) goto L_0x0056
            int r5 = com.facebook.imageutils.f.a(r11, r3, r0)     // Catch:{ IOException -> 0x00fc }
            int r2 = r2 + -4
            int r6 = com.facebook.imageutils.f.a(r11, r4, r0)     // Catch:{ IOException -> 0x00fc }
            int r2 = r2 + -2
            r7 = 1165519206(0x45786966, float:3974.5874)
            if (r5 != r7) goto L_0x0056
            if (r6 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            if (r2 != 0) goto L_0x005a
            return r0
        L_0x005a:
            com.facebook.imageutils.g$a r5 = new com.facebook.imageutils.g$a     // Catch:{ IOException -> 0x00fc }
            r5.<init>(r0)     // Catch:{ IOException -> 0x00fc }
            r6 = 8
            if (r2 > r6) goto L_0x0065
        L_0x0063:
            r2 = 0
            goto L_0x00a7
        L_0x0065:
            int r7 = com.facebook.imageutils.f.a(r11, r3, r0)     // Catch:{ IOException -> 0x00fc }
            r5.f24238b = r7     // Catch:{ IOException -> 0x00fc }
            int r2 = r2 + -4
            int r7 = r5.f24238b     // Catch:{ IOException -> 0x00fc }
            r8 = 1229531648(0x49492a00, float:823968.0)
            if (r7 == r8) goto L_0x0083
            int r7 = r5.f24238b     // Catch:{ IOException -> 0x00fc }
            r9 = 1296891946(0x4d4d002a, float:2.14958752E8)
            if (r7 == r9) goto L_0x0083
            java.lang.Class<?> r2 = com.facebook.imageutils.g.f24236a     // Catch:{ IOException -> 0x00fc }
            java.lang.String r7 = "Invalid TIFF header"
            com.facebook.common.logging.FLog.e((java.lang.Class<?>) r2, (java.lang.String) r7)     // Catch:{ IOException -> 0x00fc }
            goto L_0x0063
        L_0x0083:
            int r7 = r5.f24238b     // Catch:{ IOException -> 0x00fc }
            if (r7 != r8) goto L_0x0089
            r7 = 1
            goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            r5.f24237a = r7     // Catch:{ IOException -> 0x00fc }
            boolean r7 = r5.f24237a     // Catch:{ IOException -> 0x00fc }
            int r7 = com.facebook.imageutils.f.a(r11, r3, r7)     // Catch:{ IOException -> 0x00fc }
            r5.f24239c = r7     // Catch:{ IOException -> 0x00fc }
            int r2 = r2 + -4
            int r7 = r5.f24239c     // Catch:{ IOException -> 0x00fc }
            if (r7 < r6) goto L_0x009f
            int r7 = r5.f24239c     // Catch:{ IOException -> 0x00fc }
            int r7 = r7 - r6
            if (r7 <= r2) goto L_0x00a7
        L_0x009f:
            java.lang.Class<?> r2 = com.facebook.imageutils.g.f24236a     // Catch:{ IOException -> 0x00fc }
            java.lang.String r7 = "Invalid offset"
            com.facebook.common.logging.FLog.e((java.lang.Class<?>) r2, (java.lang.String) r7)     // Catch:{ IOException -> 0x00fc }
            goto L_0x0063
        L_0x00a7:
            int r7 = r5.f24239c     // Catch:{ IOException -> 0x00fc }
            int r7 = r7 - r6
            if (r2 == 0) goto L_0x00fb
            if (r7 <= r2) goto L_0x00af
            goto L_0x00fb
        L_0x00af:
            long r8 = (long) r7     // Catch:{ IOException -> 0x00fc }
            r11.skip(r8)     // Catch:{ IOException -> 0x00fc }
            int r2 = r2 - r7
            boolean r6 = r5.f24237a     // Catch:{ IOException -> 0x00fc }
            r7 = 14
            if (r2 < r7) goto L_0x00dc
            int r7 = com.facebook.imageutils.f.a(r11, r4, r6)     // Catch:{ IOException -> 0x00fc }
            int r2 = r2 + -2
        L_0x00c0:
            int r8 = r7 + -1
            if (r7 <= 0) goto L_0x00dc
            r7 = 12
            if (r2 < r7) goto L_0x00dc
            int r7 = com.facebook.imageutils.f.a(r11, r4, r6)     // Catch:{ IOException -> 0x00fc }
            int r2 = r2 + -2
            r9 = 274(0x112, float:3.84E-43)
            if (r7 != r9) goto L_0x00d3
            goto L_0x00dd
        L_0x00d3:
            r9 = 10
            r11.skip(r9)     // Catch:{ IOException -> 0x00fc }
            int r2 = r2 + -10
            r7 = r8
            goto L_0x00c0
        L_0x00dc:
            r2 = 0
        L_0x00dd:
            boolean r5 = r5.f24237a     // Catch:{ IOException -> 0x00fc }
            r6 = 10
            if (r2 >= r6) goto L_0x00e4
            return r0
        L_0x00e4:
            int r2 = com.facebook.imageutils.f.a(r11, r4, r5)     // Catch:{ IOException -> 0x00fc }
            r6 = 3
            if (r2 == r6) goto L_0x00ec
            return r0
        L_0x00ec:
            int r2 = com.facebook.imageutils.f.a(r11, r3, r5)     // Catch:{ IOException -> 0x00fc }
            if (r2 == r1) goto L_0x00f3
            return r0
        L_0x00f3:
            int r1 = com.facebook.imageutils.f.a(r11, r4, r5)     // Catch:{ IOException -> 0x00fc }
            com.facebook.imageutils.f.a(r11, r4, r5)     // Catch:{ IOException -> 0x00fc }
            return r1
        L_0x00fb:
            return r0
        L_0x00fc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.e.a(java.io.InputStream):int");
    }
}
