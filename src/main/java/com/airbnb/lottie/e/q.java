package com.airbnb.lottie.e;

public final class q {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x024a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.c.c.d a(android.util.JsonReader r36, com.airbnb.lottie.LottieComposition r37) throws java.io.IOException {
        /*
            r0 = r36
            r7 = r37
            com.airbnb.lottie.c.c.d$b r1 = com.airbnb.lottie.c.c.d.b.None
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r36.beginObject()
            r2 = 0
            r11 = 0
            r3 = 0
            r4 = 0
            r12 = -1
            r30 = r1
            r14 = r2
            r20 = r14
            r21 = r20
            r28 = r21
            r29 = r28
            r31 = r29
            r16 = r4
            r18 = r12
            r1 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r12 = r31
            r13 = r12
            r2 = 0
        L_0x003e:
            boolean r4 = r36.hasNext()
            if (r4 == 0) goto L_0x02f4
            java.lang.String r4 = r36.nextName()
            int r5 = r4.hashCode()
            r6 = 1
            r32 = -1
            switch(r5) {
                case -995424086: goto L_0x0141;
                case -903568142: goto L_0x0136;
                case 104: goto L_0x012b;
                case 116: goto L_0x0120;
                case 119: goto L_0x0115;
                case 3177: goto L_0x010a;
                case 3233: goto L_0x00ff;
                case 3367: goto L_0x00f4;
                case 3432: goto L_0x00e9;
                case 3519: goto L_0x00de;
                case 3553: goto L_0x00d2;
                case 3664: goto L_0x00c7;
                case 3669: goto L_0x00bc;
                case 3679: goto L_0x00b0;
                case 3681: goto L_0x00a4;
                case 3684: goto L_0x0099;
                case 3705: goto L_0x008d;
                case 3712: goto L_0x0081;
                case 3717: goto L_0x0076;
                case 104415: goto L_0x006b;
                case 108390670: goto L_0x0060;
                case 1441620890: goto L_0x0054;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x014b
        L_0x0054:
            java.lang.String r5 = "masksProperties"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 10
            goto L_0x014c
        L_0x0060:
            java.lang.String r5 = "refId"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 2
            goto L_0x014c
        L_0x006b:
            java.lang.String r5 = "ind"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 1
            goto L_0x014c
        L_0x0076:
            java.lang.String r5 = "ty"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 3
            goto L_0x014c
        L_0x0081:
            java.lang.String r5 = "tt"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 9
            goto L_0x014c
        L_0x008d:
            java.lang.String r5 = "tm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 20
            goto L_0x014c
        L_0x0099:
            java.lang.String r5 = "sw"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 5
            goto L_0x014c
        L_0x00a4:
            java.lang.String r5 = "st"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 15
            goto L_0x014c
        L_0x00b0:
            java.lang.String r5 = "sr"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 14
            goto L_0x014c
        L_0x00bc:
            java.lang.String r5 = "sh"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 6
            goto L_0x014c
        L_0x00c7:
            java.lang.String r5 = "sc"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 7
            goto L_0x014c
        L_0x00d2:
            java.lang.String r5 = "op"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 19
            goto L_0x014c
        L_0x00de:
            java.lang.String r5 = "nm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 0
            goto L_0x014c
        L_0x00e9:
            java.lang.String r5 = "ks"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 8
            goto L_0x014c
        L_0x00f4:
            java.lang.String r5 = "ip"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 18
            goto L_0x014c
        L_0x00ff:
            java.lang.String r5 = "ef"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 13
            goto L_0x014c
        L_0x010a:
            java.lang.String r5 = "cl"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 21
            goto L_0x014c
        L_0x0115:
            java.lang.String r5 = "w"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 16
            goto L_0x014c
        L_0x0120:
            java.lang.String r5 = "t"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 12
            goto L_0x014c
        L_0x012b:
            java.lang.String r5 = "h"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 17
            goto L_0x014c
        L_0x0136:
            java.lang.String r5 = "shapes"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 11
            goto L_0x014c
        L_0x0141:
            java.lang.String r5 = "parent"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x014b
            r4 = 4
            goto L_0x014c
        L_0x014b:
            r4 = -1
        L_0x014c:
            switch(r4) {
                case 0: goto L_0x02ed;
                case 1: goto L_0x02e5;
                case 2: goto L_0x02e0;
                case 3: goto L_0x02ca;
                case 4: goto L_0x02c2;
                case 5: goto L_0x02b3;
                case 6: goto L_0x02a4;
                case 7: goto L_0x029b;
                case 8: goto L_0x0296;
                case 9: goto L_0x028b;
                case 10: goto L_0x0275;
                case 11: goto L_0x025d;
                case 12: goto L_0x01f7;
                case 13: goto L_0x019e;
                case 14: goto L_0x0197;
                case 15: goto L_0x018e;
                case 16: goto L_0x017e;
                case 17: goto L_0x016e;
                case 18: goto L_0x0167;
                case 19: goto L_0x0160;
                case 20: goto L_0x015a;
                case 21: goto L_0x0154;
                default: goto L_0x014f;
            }
        L_0x014f:
            r36.skipValue()
            goto L_0x02f1
        L_0x0154:
            java.lang.String r13 = r36.nextString()
            goto L_0x003e
        L_0x015a:
            com.airbnb.lottie.c.a.b r31 = com.airbnb.lottie.e.d.a((android.util.JsonReader) r0, (com.airbnb.lottie.LottieComposition) r7, (boolean) r3)
            goto L_0x003e
        L_0x0160:
            double r4 = r36.nextDouble()
            float r2 = (float) r4
            goto L_0x003e
        L_0x0167:
            double r4 = r36.nextDouble()
            float r1 = (float) r4
            goto L_0x003e
        L_0x016e:
            int r4 = r36.nextInt()
            float r4 = (float) r4
            float r5 = com.airbnb.lottie.f.f.a()
            float r4 = r4 * r5
            int r4 = (int) r4
            r27 = r4
            goto L_0x003e
        L_0x017e:
            int r4 = r36.nextInt()
            float r4 = (float) r4
            float r5 = com.airbnb.lottie.f.f.a()
            float r4 = r4 * r5
            int r4 = (int) r4
            r26 = r4
            goto L_0x003e
        L_0x018e:
            double r4 = r36.nextDouble()
            float r4 = (float) r4
            r25 = r4
            goto L_0x003e
        L_0x0197:
            double r4 = r36.nextDouble()
            float r15 = (float) r4
            goto L_0x003e
        L_0x019e:
            r36.beginArray()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x01a6:
            boolean r5 = r36.hasNext()
            if (r5 == 0) goto L_0x01e1
            r36.beginObject()
        L_0x01af:
            boolean r5 = r36.hasNext()
            if (r5 == 0) goto L_0x01dc
            java.lang.String r5 = r36.nextName()
            int r6 = r5.hashCode()
            r3 = 3519(0xdbf, float:4.931E-42)
            if (r6 == r3) goto L_0x01c2
            goto L_0x01cc
        L_0x01c2:
            java.lang.String r3 = "nm"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x01cc
            r3 = 0
            goto L_0x01cd
        L_0x01cc:
            r3 = -1
        L_0x01cd:
            if (r3 == 0) goto L_0x01d4
            r36.skipValue()
        L_0x01d2:
            r3 = 0
            goto L_0x01af
        L_0x01d4:
            java.lang.String r3 = r36.nextString()
            r4.add(r3)
            goto L_0x01d2
        L_0x01dc:
            r36.endObject()
            r3 = 0
            goto L_0x01a6
        L_0x01e1:
            r36.endArray()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r3.<init>(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r7.addWarning(r3)
            goto L_0x02f1
        L_0x01f7:
            r36.beginObject()
        L_0x01fa:
            boolean r3 = r36.hasNext()
            if (r3 == 0) goto L_0x0258
            java.lang.String r3 = r36.nextName()
            int r4 = r3.hashCode()
            r5 = 97
            if (r4 == r5) goto L_0x021b
            r5 = 100
            if (r4 == r5) goto L_0x0211
            goto L_0x0225
        L_0x0211:
            java.lang.String r4 = "d"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0225
            r3 = 0
            goto L_0x0226
        L_0x021b:
            java.lang.String r4 = "a"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0225
            r3 = 1
            goto L_0x0226
        L_0x0225:
            r3 = -1
        L_0x0226:
            switch(r3) {
                case 0: goto L_0x024a;
                case 1: goto L_0x022d;
                default: goto L_0x0229;
            }
        L_0x0229:
            r36.skipValue()
            goto L_0x01fa
        L_0x022d:
            r36.beginArray()
            boolean r3 = r36.hasNext()
            if (r3 == 0) goto L_0x023c
            com.airbnb.lottie.c.a.k r3 = com.airbnb.lottie.e.b.a(r36, r37)
            r29 = r3
        L_0x023c:
            boolean r3 = r36.hasNext()
            if (r3 == 0) goto L_0x0246
            r36.skipValue()
            goto L_0x023c
        L_0x0246:
            r36.endArray()
            goto L_0x01fa
        L_0x024a:
            com.airbnb.lottie.c.a.j r3 = new com.airbnb.lottie.c.a.j
            com.airbnb.lottie.e.h r4 = com.airbnb.lottie.e.h.f4815a
            java.util.List r4 = com.airbnb.lottie.e.d.a((android.util.JsonReader) r0, (com.airbnb.lottie.LottieComposition) r7, (com.airbnb.lottie.e.af<T>) r4)
            r3.<init>(r4)
            r28 = r3
            goto L_0x01fa
        L_0x0258:
            r36.endObject()
            goto L_0x02f1
        L_0x025d:
            r36.beginArray()
        L_0x0260:
            boolean r3 = r36.hasNext()
            if (r3 == 0) goto L_0x0270
            com.airbnb.lottie.c.b.b r3 = com.airbnb.lottie.e.g.a(r36, r37)
            if (r3 == 0) goto L_0x0260
            r8.add(r3)
            goto L_0x0260
        L_0x0270:
            r36.endArray()
            goto L_0x02f1
        L_0x0275:
            r36.beginArray()
        L_0x0278:
            boolean r3 = r36.hasNext()
            if (r3 == 0) goto L_0x0286
            com.airbnb.lottie.c.b.g r3 = com.airbnb.lottie.e.s.a(r36, r37)
            r10.add(r3)
            goto L_0x0278
        L_0x0286:
            r36.endArray()
            goto L_0x02f1
        L_0x028b:
            com.airbnb.lottie.c.c.d$b[] r3 = com.airbnb.lottie.c.c.d.b.values()
            int r4 = r36.nextInt()
            r30 = r3[r4]
            goto L_0x02f1
        L_0x0296:
            com.airbnb.lottie.c.a.l r21 = com.airbnb.lottie.e.c.a(r36, r37)
            goto L_0x02f1
        L_0x029b:
            java.lang.String r3 = r36.nextString()
            int r24 = android.graphics.Color.parseColor(r3)
            goto L_0x02f1
        L_0x02a4:
            int r3 = r36.nextInt()
            float r3 = (float) r3
            float r4 = com.airbnb.lottie.f.f.a()
            float r3 = r3 * r4
            int r3 = (int) r3
            r23 = r3
            goto L_0x02f1
        L_0x02b3:
            int r3 = r36.nextInt()
            float r3 = (float) r3
            float r4 = com.airbnb.lottie.f.f.a()
            float r3 = r3 * r4
            int r3 = (int) r3
            r22 = r3
            goto L_0x02f1
        L_0x02c2:
            int r3 = r36.nextInt()
            long r3 = (long) r3
            r18 = r3
            goto L_0x02f1
        L_0x02ca:
            int r3 = r36.nextInt()
            com.airbnb.lottie.c.c.d$a r4 = com.airbnb.lottie.c.c.d.a.Unknown
            int r4 = r4.ordinal()
            if (r3 >= r4) goto L_0x02dd
            com.airbnb.lottie.c.c.d$a[] r4 = com.airbnb.lottie.c.c.d.a.values()
            r14 = r4[r3]
            goto L_0x02f1
        L_0x02dd:
            com.airbnb.lottie.c.c.d$a r14 = com.airbnb.lottie.c.c.d.a.Unknown
            goto L_0x02f1
        L_0x02e0:
            java.lang.String r20 = r36.nextString()
            goto L_0x02f1
        L_0x02e5:
            int r3 = r36.nextInt()
            long r3 = (long) r3
            r16 = r3
            goto L_0x02f1
        L_0x02ed:
            java.lang.String r12 = r36.nextString()
        L_0x02f1:
            r3 = 0
            goto L_0x003e
        L_0x02f4:
            r36.endObject()
            float r32 = r1 / r15
            float r33 = r2 / r15
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = (r32 > r11 ? 1 : (r32 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0325
            com.airbnb.lottie.g.a r5 = new com.airbnb.lottie.g.a
            java.lang.Float r2 = java.lang.Float.valueOf(r11)
            java.lang.Float r3 = java.lang.Float.valueOf(r11)
            r4 = 0
            r34 = 0
            java.lang.Float r35 = java.lang.Float.valueOf(r32)
            r0 = r5
            r1 = r37
            r9 = r5
            r5 = r34
            r11 = r6
            r6 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.add(r9)
            goto L_0x0326
        L_0x0325:
            r11 = r6
        L_0x0326:
            r0 = 0
            int r1 = (r33 > r0 ? 1 : (r33 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x032c
            goto L_0x0332
        L_0x032c:
            float r0 = r37.getEndFrame()
            r33 = r0
        L_0x0332:
            com.airbnb.lottie.g.a r9 = new com.airbnb.lottie.g.a
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            r4 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r33)
            r0 = r9
            r1 = r37
            r5 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.add(r9)
            com.airbnb.lottie.g.a r9 = new com.airbnb.lottie.g.a
            r0 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = r9
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.add(r9)
            java.lang.String r0 = ".ai"
            boolean r0 = r12.endsWith(r0)
            if (r0 != 0) goto L_0x0379
            java.lang.String r0 = "ai"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x037e
        L_0x0379:
            java.lang.String r0 = "Convert your Illustrator layers to shape layers."
            r7.addWarning(r0)
        L_0x037e:
            com.airbnb.lottie.c.c.d r32 = new com.airbnb.lottie.c.c.d
            r0 = r32
            r1 = r8
            r2 = r37
            r3 = r12
            r4 = r16
            r6 = r14
            r7 = r18
            r9 = r20
            r33 = r11
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r16 = r25
            r17 = r26
            r18 = r27
            r19 = r28
            r20 = r29
            r21 = r33
            r22 = r30
            r23 = r31
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.e.q.a(android.util.JsonReader, com.airbnb.lottie.LottieComposition):com.airbnb.lottie.c.c.d");
    }
}
