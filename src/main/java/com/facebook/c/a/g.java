package com.facebook.c.a;

import com.facebook.c.b.f;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final a<f> f23311a = new a<f>() {
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object b(android.util.JsonReader r18) throws java.io.IOException {
            /*
                r17 = this;
                r0 = r18
                r18.beginObject()
                com.facebook.c.b.f$a r1 = new com.facebook.c.b.f$a
                r1.<init>()
            L_0x000a:
                boolean r2 = r18.hasNext()
                if (r2 == 0) goto L_0x016d
                java.lang.String r2 = r18.nextName()
                int r3 = r2.hashCode()
                r4 = -1
                r5 = 0
                switch(r3) {
                    case -1923169788: goto L_0x009e;
                    case -1833928446: goto L_0x0093;
                    case -1806353256: goto L_0x0089;
                    case -1530780935: goto L_0x007f;
                    case -1446309207: goto L_0x0075;
                    case -259686756: goto L_0x006b;
                    case -247981657: goto L_0x0061;
                    case -241402625: goto L_0x0057;
                    case 3373707: goto L_0x004d;
                    case 94742904: goto L_0x0042;
                    case 152226438: goto L_0x0037;
                    case 574151256: goto L_0x002b;
                    case 725843758: goto L_0x001f;
                    default: goto L_0x001d;
                }
            L_0x001d:
                goto L_0x00a9
            L_0x001f:
                java.lang.String r3 = "stroke_line_cap"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 11
                goto L_0x00aa
            L_0x002b:
                java.lang.String r3 = "feature_animations"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 9
                goto L_0x00aa
            L_0x0037:
                java.lang.String r3 = "key_frames"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 6
                goto L_0x00aa
            L_0x0042:
                java.lang.String r3 = "class"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 12
                goto L_0x00aa
            L_0x004d:
                java.lang.String r3 = "name"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 0
                goto L_0x00aa
            L_0x0057:
                java.lang.String r3 = "stroke_width"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 3
                goto L_0x00aa
            L_0x0061:
                java.lang.String r3 = "fill_color"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 1
                goto L_0x00aa
            L_0x006b:
                java.lang.String r3 = "stroke_color"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 2
                goto L_0x00aa
            L_0x0075:
                java.lang.String r3 = "to_frame"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 5
                goto L_0x00aa
            L_0x007f:
                java.lang.String r3 = "timing_curves"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 7
                goto L_0x00aa
            L_0x0089:
                java.lang.String r3 = "from_frame"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 4
                goto L_0x00aa
            L_0x0093:
                java.lang.String r3 = "effects"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 10
                goto L_0x00aa
            L_0x009e:
                java.lang.String r3 = "animation_group"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00a9
                r2 = 8
                goto L_0x00aa
            L_0x00a9:
                r2 = -1
            L_0x00aa:
                switch(r2) {
                    case 0: goto L_0x0165;
                    case 1: goto L_0x0159;
                    case 2: goto L_0x014d;
                    case 3: goto L_0x0144;
                    case 4: goto L_0x013b;
                    case 5: goto L_0x0132;
                    case 6: goto L_0x0128;
                    case 7: goto L_0x0120;
                    case 8: goto L_0x0118;
                    case 9: goto L_0x010e;
                    case 10: goto L_0x00cc;
                    case 11: goto L_0x00ba;
                    case 12: goto L_0x00b2;
                    default: goto L_0x00ad;
                }
            L_0x00ad:
                r18.skipValue()
                goto L_0x000a
            L_0x00b2:
                java.lang.String r2 = r18.nextString()
                r1.m = r2
                goto L_0x000a
            L_0x00ba:
                java.lang.String r2 = r18.nextString()
                java.util.Locale r3 = java.util.Locale.US
                java.lang.String r2 = r2.toUpperCase(r3)
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.valueOf(r2)
                r1.j = r2
                goto L_0x000a
            L_0x00cc:
                r18.beginObject()
                com.facebook.c.b.g$a r2 = new com.facebook.c.b.g$a
                r2.<init>()
            L_0x00d4:
                boolean r3 = r18.hasNext()
                if (r3 == 0) goto L_0x0100
                java.lang.String r3 = r18.nextName()
                int r6 = r3.hashCode()
                r7 = 89650992(0x557f730, float:1.01546526E-35)
                if (r6 == r7) goto L_0x00e8
                goto L_0x00f2
            L_0x00e8:
                java.lang.String r6 = "gradient"
                boolean r3 = r3.equals(r6)
                if (r3 == 0) goto L_0x00f2
                r3 = 0
                goto L_0x00f3
            L_0x00f2:
                r3 = -1
            L_0x00f3:
                if (r3 == 0) goto L_0x00f9
                r18.skipValue()
                goto L_0x00d4
            L_0x00f9:
                com.facebook.c.b.i r3 = com.facebook.c.a.j.a(r18)
                r2.f23365a = r3
                goto L_0x00d4
            L_0x0100:
                r18.endObject()
                com.facebook.c.b.g r3 = new com.facebook.c.b.g
                com.facebook.c.b.i r2 = r2.f23365a
                r3.<init>(r2, r5)
                r1.l = r3
                goto L_0x000a
            L_0x010e:
                com.facebook.c.a.a<com.facebook.c.b.b> r2 = com.facebook.c.a.c.f23307a
                java.util.List r2 = r2.a(r0)
                r1.k = r2
                goto L_0x000a
            L_0x0118:
                int r2 = r18.nextInt()
                r1.i = r2
                goto L_0x000a
            L_0x0120:
                float[][][] r2 = com.facebook.c.a.b.b(r18)
                r1.h = r2
                goto L_0x000a
            L_0x0128:
                com.facebook.c.a.a<com.facebook.c.b.h> r2 = com.facebook.c.a.h.f23312a
                java.util.List r2 = r2.a(r0)
                r1.g = r2
                goto L_0x000a
            L_0x0132:
                double r2 = r18.nextDouble()
                float r2 = (float) r2
                r1.f23363f = r2
                goto L_0x000a
            L_0x013b:
                double r2 = r18.nextDouble()
                float r2 = (float) r2
                r1.f23362e = r2
                goto L_0x000a
            L_0x0144:
                double r2 = r18.nextDouble()
                float r2 = (float) r2
                r1.f23361d = r2
                goto L_0x000a
            L_0x014d:
                java.lang.String r2 = r18.nextString()
                int r2 = android.graphics.Color.parseColor(r2)
                r1.f23360c = r2
                goto L_0x000a
            L_0x0159:
                java.lang.String r2 = r18.nextString()
                int r2 = android.graphics.Color.parseColor(r2)
                r1.f23359b = r2
                goto L_0x000a
            L_0x0165:
                java.lang.String r2 = r18.nextString()
                r1.f23358a = r2
                goto L_0x000a
            L_0x016d:
                r18.endObject()
                com.facebook.c.b.f r0 = new com.facebook.c.b.f
                java.lang.String r4 = r1.f23358a
                int r5 = r1.f23359b
                int r6 = r1.f23360c
                float r7 = r1.f23361d
                float r8 = r1.f23362e
                float r9 = r1.f23363f
                java.util.List<com.facebook.c.b.h> r10 = r1.g
                float[][][] r11 = r1.h
                int r12 = r1.i
                android.graphics.Paint$Cap r13 = r1.j
                java.util.List<com.facebook.c.b.b> r14 = r1.k
                com.facebook.c.b.g r15 = r1.l
                java.lang.String r1 = r1.m
                r3 = r0
                r16 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.a.g.AnonymousClass1.b(android.util.JsonReader):java.lang.Object");
        }
    };
}
