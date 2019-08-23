package com.airbnb.lottie.e;

import android.support.v4.util.LongSparseArray;
import android.util.JsonReader;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.c.c.d;
import java.io.IOException;
import java.util.List;

public final class r {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.util.JsonReader r9, java.util.Map<java.lang.String, com.airbnb.lottie.c.c> r10) throws java.io.IOException {
        /*
            r9.beginObject()
        L_0x0003:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = r9.nextName()
            int r1 = r0.hashCode()
            r2 = 3322014(0x32b09e, float:4.655133E-39)
            r3 = 0
            r4 = -1
            if (r1 == r2) goto L_0x0019
            goto L_0x0023
        L_0x0019:
            java.lang.String r1 = "list"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0023
            r0 = 0
            goto L_0x0024
        L_0x0023:
            r0 = -1
        L_0x0024:
            if (r0 == 0) goto L_0x002a
            r9.skipValue()
            goto L_0x0003
        L_0x002a:
            r9.beginArray()
        L_0x002d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00b2
            r0 = 0
            r9.beginObject()
            r1 = 0
            r0 = r1
            r2 = r0
            r5 = 0
        L_0x003b:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x00a3
            java.lang.String r6 = r9.nextName()
            int r7 = r6.hashCode()
            r8 = -1866931350(0xffffffff90b8e36a, float:-7.292559E-29)
            if (r7 == r8) goto L_0x007c
            r8 = -1408684838(0xffffffffac092cda, float:-1.9493769E-12)
            if (r7 == r8) goto L_0x0072
            r8 = -1294566165(0xffffffffb2d67ceb, float:-2.4969685E-8)
            if (r7 == r8) goto L_0x0068
            r8 = 96619537(0x5c24c11, float:1.8271615E-35)
            if (r7 == r8) goto L_0x005e
            goto L_0x0086
        L_0x005e:
            java.lang.String r7 = "fName"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 1
            goto L_0x0087
        L_0x0068:
            java.lang.String r7 = "fStyle"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 2
            goto L_0x0087
        L_0x0072:
            java.lang.String r7 = "ascent"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 3
            goto L_0x0087
        L_0x007c:
            java.lang.String r7 = "fFamily"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0087
        L_0x0086:
            r6 = -1
        L_0x0087:
            switch(r6) {
                case 0: goto L_0x009e;
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x008e;
                default: goto L_0x008a;
            }
        L_0x008a:
            r9.skipValue()
            goto L_0x003b
        L_0x008e:
            double r5 = r9.nextDouble()
            float r5 = (float) r5
            goto L_0x003b
        L_0x0094:
            java.lang.String r2 = r9.nextString()
            goto L_0x003b
        L_0x0099:
            java.lang.String r0 = r9.nextString()
            goto L_0x003b
        L_0x009e:
            java.lang.String r1 = r9.nextString()
            goto L_0x003b
        L_0x00a3:
            r9.endObject()
            com.airbnb.lottie.c.c r6 = new com.airbnb.lottie.c.c
            r6.<init>(r1, r0, r2, r5)
            java.lang.String r0 = r6.f4767b
            r10.put(r0, r6)
            goto L_0x002d
        L_0x00b2:
            r9.endArray()
            goto L_0x0003
        L_0x00b7:
            r9.endObject()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.e.r.a(android.util.JsonReader, java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.util.JsonReader r13, com.airbnb.lottie.LottieComposition r14, android.support.v4.util.SparseArrayCompat<com.airbnb.lottie.c.d> r15) throws java.io.IOException {
        /*
            r13.beginArray()
        L_0x0003:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r13.beginObject()
            r0 = 0
            r3 = 0
            r1 = 0
            r8 = r0
            r9 = r8
            r6 = r3
            r4 = r6
            r3 = 0
        L_0x001a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r13.nextName()
            r10 = -1
            int r11 = r0.hashCode()
            r12 = -1866931350(0xffffffff90b8e36a, float:-7.292559E-29)
            if (r11 == r12) goto L_0x0078
            r12 = 119(0x77, float:1.67E-43)
            if (r11 == r12) goto L_0x006e
            r12 = 3173(0xc65, float:4.446E-42)
            if (r11 == r12) goto L_0x0064
            r12 = 3076010(0x2eefaa, float:4.310408E-39)
            if (r11 == r12) goto L_0x005a
            r12 = 3530753(0x35e001, float:4.947639E-39)
            if (r11 == r12) goto L_0x0050
            r12 = 109780401(0x68b1db1, float:5.2329616E-35)
            if (r11 == r12) goto L_0x0046
            goto L_0x0082
        L_0x0046:
            java.lang.String r11 = "style"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0082
            r0 = 3
            goto L_0x0083
        L_0x0050:
            java.lang.String r11 = "size"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0082
            r0 = 1
            goto L_0x0083
        L_0x005a:
            java.lang.String r11 = "data"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0082
            r0 = 5
            goto L_0x0083
        L_0x0064:
            java.lang.String r11 = "ch"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0082
            r0 = 0
            goto L_0x0083
        L_0x006e:
            java.lang.String r11 = "w"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0082
            r0 = 2
            goto L_0x0083
        L_0x0078:
            java.lang.String r11 = "fFamily"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0082
            r0 = 4
            goto L_0x0083
        L_0x0082:
            r0 = -1
        L_0x0083:
            switch(r0) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x00d1;
                case 2: goto L_0x00cb;
                case 3: goto L_0x00c5;
                case 4: goto L_0x00bf;
                case 5: goto L_0x008a;
                default: goto L_0x0086;
            }
        L_0x0086:
            r13.skipValue()
            goto L_0x001a
        L_0x008a:
            r13.beginObject()
        L_0x008d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "shapes"
            java.lang.String r10 = r13.nextName()
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00b6
            r13.beginArray()
        L_0x00a2:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00b2
            com.airbnb.lottie.c.b.b r0 = com.airbnb.lottie.e.g.a(r13, r14)
            com.airbnb.lottie.c.b.n r0 = (com.airbnb.lottie.c.b.n) r0
            r2.add(r0)
            goto L_0x00a2
        L_0x00b2:
            r13.endArray()
            goto L_0x008d
        L_0x00b6:
            r13.skipValue()
            goto L_0x008d
        L_0x00ba:
            r13.endObject()
            goto L_0x001a
        L_0x00bf:
            java.lang.String r9 = r13.nextString()
            goto L_0x001a
        L_0x00c5:
            java.lang.String r8 = r13.nextString()
            goto L_0x001a
        L_0x00cb:
            double r6 = r13.nextDouble()
            goto L_0x001a
        L_0x00d1:
            double r4 = r13.nextDouble()
            goto L_0x001a
        L_0x00d7:
            java.lang.String r0 = r13.nextString()
            char r3 = r0.charAt(r1)
            goto L_0x001a
        L_0x00e1:
            r13.endObject()
            com.airbnb.lottie.c.d r0 = new com.airbnb.lottie.c.d
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r9)
            int r1 = r0.hashCode()
            r15.put(r1, r0)
            goto L_0x0003
        L_0x00f3:
            r13.endArray()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.e.r.a(android.util.JsonReader, com.airbnb.lottie.LottieComposition, android.support.v4.util.SparseArrayCompat):void");
    }

    public static void a(JsonReader jsonReader, LottieComposition lottieComposition, List<d> list, LongSparseArray<d> longSparseArray) throws IOException {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            d a2 = q.a(jsonReader, lottieComposition);
            if (a2.f4785e == d.a.Image) {
                i++;
            }
            list.add(a2);
            longSparseArray.put(a2.f4784d, a2);
            if (i > 4) {
                com.airbnb.lottie.d.a("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.util.JsonReader r12, com.airbnb.lottie.LottieComposition r13, java.util.Map<java.lang.String, java.util.List<com.airbnb.lottie.c.c.d>> r14, java.util.Map<java.lang.String, com.airbnb.lottie.g> r15) throws java.io.IOException {
        /*
            r12.beginArray()
        L_0x0003:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.support.v4.util.LongSparseArray r1 = new android.support.v4.util.LongSparseArray
            r1.<init>()
            r12.beginObject()
            r2 = 0
            r3 = 0
            r7 = r3
            r8 = r7
            r9 = r8
            r5 = 0
            r6 = 0
        L_0x001d:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x00c0
            java.lang.String r3 = r12.nextName()
            r4 = -1
            int r10 = r3.hashCode()
            r11 = -1109732030(0xffffffffbddad542, float:-0.10685207)
            if (r10 == r11) goto L_0x0078
            r11 = 104(0x68, float:1.46E-43)
            if (r10 == r11) goto L_0x006e
            r11 = 112(0x70, float:1.57E-43)
            if (r10 == r11) goto L_0x0064
            r11 = 117(0x75, float:1.64E-43)
            if (r10 == r11) goto L_0x005a
            r11 = 119(0x77, float:1.67E-43)
            if (r10 == r11) goto L_0x0050
            r11 = 3355(0xd1b, float:4.701E-42)
            if (r10 == r11) goto L_0x0046
            goto L_0x0082
        L_0x0046:
            java.lang.String r10 = "id"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 0
            goto L_0x0083
        L_0x0050:
            java.lang.String r10 = "w"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 2
            goto L_0x0083
        L_0x005a:
            java.lang.String r10 = "u"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 5
            goto L_0x0083
        L_0x0064:
            java.lang.String r10 = "p"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 4
            goto L_0x0083
        L_0x006e:
            java.lang.String r10 = "h"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 3
            goto L_0x0083
        L_0x0078:
            java.lang.String r10 = "layers"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = -1
        L_0x0083:
            switch(r3) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x009f;
                case 2: goto L_0x0099;
                case 3: goto L_0x0094;
                case 4: goto L_0x008f;
                case 5: goto L_0x008a;
                default: goto L_0x0086;
            }
        L_0x0086:
            r12.skipValue()
            goto L_0x001d
        L_0x008a:
            java.lang.String r9 = r12.nextString()
            goto L_0x001d
        L_0x008f:
            java.lang.String r8 = r12.nextString()
            goto L_0x001d
        L_0x0094:
            int r6 = r12.nextInt()
            goto L_0x001d
        L_0x0099:
            int r5 = r12.nextInt()
            goto L_0x001d
        L_0x009f:
            r12.beginArray()
        L_0x00a2:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x00b5
            com.airbnb.lottie.c.c.d r3 = com.airbnb.lottie.e.q.a(r12, r13)
            long r10 = r3.f4784d
            r1.put(r10, r3)
            r0.add(r3)
            goto L_0x00a2
        L_0x00b5:
            r12.endArray()
            goto L_0x001d
        L_0x00ba:
            java.lang.String r7 = r12.nextString()
            goto L_0x001d
        L_0x00c0:
            r12.endObject()
            if (r8 == 0) goto L_0x00d2
            com.airbnb.lottie.g r0 = new com.airbnb.lottie.g
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r1 = r0.f4855c
            r15.put(r1, r0)
            goto L_0x0003
        L_0x00d2:
            r14.put(r7, r0)
            goto L_0x0003
        L_0x00d7:
            r12.endArray()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.e.r.a(android.util.JsonReader, com.airbnb.lottie.LottieComposition, java.util.Map, java.util.Map):void");
    }
}
