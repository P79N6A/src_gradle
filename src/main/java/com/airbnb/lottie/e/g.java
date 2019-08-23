package com.airbnb.lottie.e;

public final class g {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [com.airbnb.lottie.c.b.b] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r6v25 */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* JADX WARNING: type inference failed for: r6v28 */
    /* JADX WARNING: type inference failed for: r6v29 */
    /* JADX WARNING: type inference failed for: r6v30 */
    /* JADX WARNING: type inference failed for: r6v31 */
    /* JADX WARNING: type inference failed for: r6v32 */
    /* JADX WARNING: type inference failed for: r6v33 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b1, code lost:
        if (r2.equals("gs") != false) goto L_0x00dd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0041 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017c  */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.c.b.b a(android.util.JsonReader r9, com.airbnb.lottie.LottieComposition r10) throws java.io.IOException {
        /*
            r9.beginObject()
            r0 = 2
            r1 = 2
        L_0x0005:
            boolean r2 = r9.hasNext()
            r3 = 0
            r4 = 1
            r5 = -1
            r6 = 0
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = r9.nextName()
            int r7 = r2.hashCode()
            r8 = 100
            if (r7 == r8) goto L_0x002a
            r8 = 3717(0xe85, float:5.209E-42)
            if (r7 == r8) goto L_0x0020
            goto L_0x0034
        L_0x0020:
            java.lang.String r7 = "ty"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0034
            r2 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r7 = "d"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0034
            r2 = 1
            goto L_0x0035
        L_0x0034:
            r2 = -1
        L_0x0035:
            switch(r2) {
                case 0: goto L_0x0041;
                case 1: goto L_0x003c;
                default: goto L_0x0038;
            }
        L_0x0038:
            r9.skipValue()
            goto L_0x0005
        L_0x003c:
            int r1 = r9.nextInt()
            goto L_0x0005
        L_0x0041:
            java.lang.String r2 = r9.nextString()
            goto L_0x0047
        L_0x0046:
            r2 = r6
        L_0x0047:
            if (r2 != 0) goto L_0x004a
            return r6
        L_0x004a:
            int r7 = r2.hashCode()
            switch(r7) {
                case 3239: goto L_0x00d2;
                case 3270: goto L_0x00c8;
                case 3295: goto L_0x00be;
                case 3307: goto L_0x00b4;
                case 3308: goto L_0x00ab;
                case 3488: goto L_0x00a0;
                case 3633: goto L_0x0095;
                case 3646: goto L_0x008a;
                case 3669: goto L_0x0080;
                case 3679: goto L_0x0075;
                case 3681: goto L_0x006a;
                case 3705: goto L_0x005e;
                case 3710: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x00dc
        L_0x0053:
            java.lang.String r0 = "tr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 5
            goto L_0x00dd
        L_0x005e:
            java.lang.String r0 = "tm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 9
            goto L_0x00dd
        L_0x006a:
            java.lang.String r0 = "st"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 1
            goto L_0x00dd
        L_0x0075:
            java.lang.String r0 = "sr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 10
            goto L_0x00dd
        L_0x0080:
            java.lang.String r0 = "sh"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 6
            goto L_0x00dd
        L_0x008a:
            java.lang.String r0 = "rp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 12
            goto L_0x00dd
        L_0x0095:
            java.lang.String r0 = "rc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 8
            goto L_0x00dd
        L_0x00a0:
            java.lang.String r0 = "mm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 11
            goto L_0x00dd
        L_0x00ab:
            java.lang.String r7 = "gs"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00b4:
            java.lang.String r0 = "gr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 0
            goto L_0x00dd
        L_0x00be:
            java.lang.String r0 = "gf"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 4
            goto L_0x00dd
        L_0x00c8:
            java.lang.String r0 = "fl"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 3
            goto L_0x00dd
        L_0x00d2:
            java.lang.String r0 = "el"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 7
            goto L_0x00dd
        L_0x00dc:
            r0 = -1
        L_0x00dd:
            switch(r0) {
                case 0: goto L_0x012d;
                case 1: goto L_0x0128;
                case 2: goto L_0x0123;
                case 3: goto L_0x011d;
                case 4: goto L_0x0117;
                case 5: goto L_0x0111;
                case 6: goto L_0x010b;
                case 7: goto L_0x0105;
                case 8: goto L_0x00ff;
                case 9: goto L_0x00f9;
                case 10: goto L_0x00f3;
                case 11: goto L_0x00e8;
                case 12: goto L_0x00e2;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            goto L_0x0187
        L_0x00e2:
            com.airbnb.lottie.c.b.k r6 = com.airbnb.lottie.e.y.a(r9, r10)
            goto L_0x0187
        L_0x00e8:
            com.airbnb.lottie.c.b.h r6 = com.airbnb.lottie.e.t.a(r9)
            java.lang.String r0 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r10.addWarning(r0)
            goto L_0x0187
        L_0x00f3:
            com.airbnb.lottie.c.b.i r6 = com.airbnb.lottie.e.w.a(r9, r10)
            goto L_0x0187
        L_0x00f9:
            com.airbnb.lottie.c.b.q r6 = com.airbnb.lottie.e.ae.a(r9, r10)
            goto L_0x0187
        L_0x00ff:
            com.airbnb.lottie.c.b.j r6 = com.airbnb.lottie.e.x.a(r9, r10)
            goto L_0x0187
        L_0x0105:
            com.airbnb.lottie.c.b.a r6 = com.airbnb.lottie.e.e.a(r9, r10, r1)
            goto L_0x0187
        L_0x010b:
            com.airbnb.lottie.c.b.o r6 = com.airbnb.lottie.e.ac.a(r9, r10)
            goto L_0x0187
        L_0x0111:
            com.airbnb.lottie.c.a.l r6 = com.airbnb.lottie.e.c.a(r9, r10)
            goto L_0x0187
        L_0x0117:
            com.airbnb.lottie.c.b.d r6 = com.airbnb.lottie.e.k.a(r9, r10)
            goto L_0x0187
        L_0x011d:
            com.airbnb.lottie.c.b.m r6 = com.airbnb.lottie.e.ab.a(r9, r10)
            goto L_0x0187
        L_0x0123:
            com.airbnb.lottie.c.b.e r6 = com.airbnb.lottie.e.l.a(r9, r10)
            goto L_0x0187
        L_0x0128:
            com.airbnb.lottie.c.b.p r6 = com.airbnb.lottie.e.ad.a(r9, r10)
            goto L_0x0187
        L_0x012d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0132:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0181
            java.lang.String r1 = r9.nextName()
            int r2 = r1.hashCode()
            r7 = 3371(0xd2b, float:4.724E-42)
            if (r2 == r7) goto L_0x0153
            r7 = 3519(0xdbf, float:4.931E-42)
            if (r2 == r7) goto L_0x0149
            goto L_0x015d
        L_0x0149:
            java.lang.String r2 = "nm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x015d
            r1 = 0
            goto L_0x015e
        L_0x0153:
            java.lang.String r2 = "it"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x015d
            r1 = 1
            goto L_0x015e
        L_0x015d:
            r1 = -1
        L_0x015e:
            switch(r1) {
                case 0: goto L_0x017c;
                case 1: goto L_0x0165;
                default: goto L_0x0161;
            }
        L_0x0161:
            r9.skipValue()
            goto L_0x0132
        L_0x0165:
            r9.beginArray()
        L_0x0168:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0178
            com.airbnb.lottie.c.b.b r1 = a(r9, r10)
            if (r1 == 0) goto L_0x0168
            r0.add(r1)
            goto L_0x0168
        L_0x0178:
            r9.endArray()
            goto L_0x0132
        L_0x017c:
            java.lang.String r6 = r9.nextString()
            goto L_0x0132
        L_0x0181:
            com.airbnb.lottie.c.b.n r10 = new com.airbnb.lottie.c.b.n
            r10.<init>(r6, r0)
            r6 = r10
        L_0x0187:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0191
            r9.skipValue()
            goto L_0x0187
        L_0x0191:
            r9.endObject()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.e.g.a(android.util.JsonReader, com.airbnb.lottie.LottieComposition):com.airbnb.lottie.c.b.b");
    }
}
