package com.airbnb.lottie.e;

public final class c {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.c.a.l a(android.util.JsonReader r14, com.airbnb.lottie.LottieComposition r15) throws java.io.IOException {
        /*
            android.util.JsonToken r0 = r14.peek()
            android.util.JsonToken r1 = android.util.JsonToken.BEGIN_OBJECT
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 == 0) goto L_0x0012
            r14.beginObject()
        L_0x0012:
            r1 = 0
            r4 = r1
            r5 = r4
            r8 = r5
            r10 = r8
            r12 = r10
            r13 = r12
        L_0x0019:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x00d4
            java.lang.String r6 = r14.nextName()
            r7 = -1
            int r9 = r6.hashCode()
            switch(r9) {
                case 97: goto L_0x0072;
                case 111: goto L_0x0068;
                case 112: goto L_0x005e;
                case 114: goto L_0x0054;
                case 115: goto L_0x004a;
                case 3242: goto L_0x0040;
                case 3656: goto L_0x0036;
                case 3676: goto L_0x002c;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x007c
        L_0x002c:
            java.lang.String r9 = "so"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x007c
            r6 = 6
            goto L_0x007d
        L_0x0036:
            java.lang.String r9 = "rz"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x007c
            r6 = 3
            goto L_0x007d
        L_0x0040:
            java.lang.String r9 = "eo"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x007c
            r6 = 7
            goto L_0x007d
        L_0x004a:
            java.lang.String r9 = "s"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x007c
            r6 = 2
            goto L_0x007d
        L_0x0054:
            java.lang.String r9 = "r"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x007c
            r6 = 4
            goto L_0x007d
        L_0x005e:
            java.lang.String r9 = "p"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x007c
            r6 = 1
            goto L_0x007d
        L_0x0068:
            java.lang.String r9 = "o"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x007c
            r6 = 5
            goto L_0x007d
        L_0x0072:
            java.lang.String r9 = "a"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007d
        L_0x007c:
            r6 = -1
        L_0x007d:
            switch(r6) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x00ab;
                case 2: goto L_0x009e;
                case 3: goto L_0x0093;
                case 4: goto L_0x0098;
                case 5: goto L_0x008e;
                case 6: goto L_0x0089;
                case 7: goto L_0x0084;
                default: goto L_0x0080;
            }
        L_0x0080:
            r14.skipValue()
            goto L_0x0019
        L_0x0084:
            com.airbnb.lottie.c.a.b r13 = com.airbnb.lottie.e.d.a((android.util.JsonReader) r14, (com.airbnb.lottie.LottieComposition) r15, (boolean) r3)
            goto L_0x0019
        L_0x0089:
            com.airbnb.lottie.c.a.b r12 = com.airbnb.lottie.e.d.a((android.util.JsonReader) r14, (com.airbnb.lottie.LottieComposition) r15, (boolean) r3)
            goto L_0x0019
        L_0x008e:
            com.airbnb.lottie.c.a.d r5 = com.airbnb.lottie.e.d.b(r14, r15)
            goto L_0x0019
        L_0x0093:
            java.lang.String r6 = "Lottie doesn't support 3D layers."
            r15.addWarning(r6)
        L_0x0098:
            com.airbnb.lottie.c.a.b r10 = com.airbnb.lottie.e.d.a((android.util.JsonReader) r14, (com.airbnb.lottie.LottieComposition) r15, (boolean) r3)
            goto L_0x0019
        L_0x009e:
            com.airbnb.lottie.c.a.g r4 = new com.airbnb.lottie.c.a.g
            com.airbnb.lottie.e.z r6 = com.airbnb.lottie.e.z.f4824a
            java.util.List r6 = com.airbnb.lottie.e.d.a((android.util.JsonReader) r14, (com.airbnb.lottie.LottieComposition) r15, (com.airbnb.lottie.e.af<T>) r6)
            r4.<init>((java.util.List<com.airbnb.lottie.g.a<com.airbnb.lottie.g.d>>) r6)
            goto L_0x0019
        L_0x00ab:
            com.airbnb.lottie.c.a.m r8 = com.airbnb.lottie.e.a.b(r14, r15)
            goto L_0x0019
        L_0x00b1:
            r14.beginObject()
        L_0x00b4:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x00cf
            java.lang.String r6 = r14.nextName()
            java.lang.String r7 = "k"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00cb
            com.airbnb.lottie.c.a.e r1 = com.airbnb.lottie.e.a.a(r14, r15)
            goto L_0x00b4
        L_0x00cb:
            r14.skipValue()
            goto L_0x00b4
        L_0x00cf:
            r14.endObject()
            goto L_0x0019
        L_0x00d4:
            if (r0 == 0) goto L_0x00d9
            r14.endObject()
        L_0x00d9:
            if (r1 != 0) goto L_0x00e0
            com.airbnb.lottie.c.a.e r1 = new com.airbnb.lottie.c.a.e
            r1.<init>()
        L_0x00e0:
            r7 = r1
            if (r4 != 0) goto L_0x00ef
            com.airbnb.lottie.c.a.g r4 = new com.airbnb.lottie.c.a.g
            com.airbnb.lottie.g.d r14 = new com.airbnb.lottie.g.d
            r15 = 1065353216(0x3f800000, float:1.0)
            r14.<init>(r15, r15)
            r4.<init>((com.airbnb.lottie.g.d) r14)
        L_0x00ef:
            r9 = r4
            if (r5 != 0) goto L_0x00f7
            com.airbnb.lottie.c.a.d r5 = new com.airbnb.lottie.c.a.d
            r5.<init>()
        L_0x00f7:
            r11 = r5
            com.airbnb.lottie.c.a.l r14 = new com.airbnb.lottie.c.a.l
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.e.c.a(android.util.JsonReader, com.airbnb.lottie.LottieComposition):com.airbnb.lottie.c.a.l");
    }
}
