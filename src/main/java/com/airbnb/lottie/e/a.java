package com.airbnb.lottie.e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.a.b.h;
import com.airbnb.lottie.c.a.e;
import com.airbnb.lottie.f.f;
import java.io.IOException;
import java.util.ArrayList;

public final class a {
    public static e a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new h(lottieComposition, o.a(jsonReader, lottieComposition, f.a(), u.f4822a, z)));
            }
            jsonReader.endArray();
            p.a(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.g.a(n.b(jsonReader, f.a())));
        }
        return new e(arrayList);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[PHI: r1 
      PHI: (r1v4 boolean) = (r1v2 boolean), (r1v5 boolean) binds: [B:16:0x0042, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.c.a.m<android.graphics.PointF, android.graphics.PointF> b(android.util.JsonReader r10, com.airbnb.lottie.LottieComposition r11) throws java.io.IOException {
        /*
            r10.beginObject()
            r0 = 0
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
            r1 = 0
        L_0x0009:
            android.util.JsonToken r5 = r10.peek()
            android.util.JsonToken r6 = android.util.JsonToken.END_OBJECT
            if (r5 == r6) goto L_0x006c
            java.lang.String r5 = r10.nextName()
            r6 = -1
            int r7 = r5.hashCode()
            r8 = 107(0x6b, float:1.5E-43)
            r9 = 1
            if (r7 == r8) goto L_0x0037
            switch(r7) {
                case 120: goto L_0x002d;
                case 121: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0041
        L_0x0023:
            java.lang.String r7 = "y"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0041
            r5 = 2
            goto L_0x0042
        L_0x002d:
            java.lang.String r7 = "x"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0041
            r5 = 1
            goto L_0x0042
        L_0x0037:
            java.lang.String r7 = "k"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0041
            r5 = 0
            goto L_0x0042
        L_0x0041:
            r5 = -1
        L_0x0042:
            switch(r5) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0054;
                case 2: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0068
        L_0x0046:
            android.util.JsonToken r5 = r10.peek()
            android.util.JsonToken r6 = android.util.JsonToken.STRING
            if (r5 != r6) goto L_0x004f
            goto L_0x005c
        L_0x004f:
            com.airbnb.lottie.c.a.b r4 = com.airbnb.lottie.e.d.a(r10, r11)
            goto L_0x0009
        L_0x0054:
            android.util.JsonToken r5 = r10.peek()
            android.util.JsonToken r6 = android.util.JsonToken.STRING
            if (r5 != r6) goto L_0x005e
        L_0x005c:
            r1 = 1
            goto L_0x0068
        L_0x005e:
            com.airbnb.lottie.c.a.b r3 = com.airbnb.lottie.e.d.a(r10, r11)
            goto L_0x0009
        L_0x0063:
            com.airbnb.lottie.c.a.e r2 = a(r10, r11)
            goto L_0x0009
        L_0x0068:
            r10.skipValue()
            goto L_0x0009
        L_0x006c:
            r10.endObject()
            if (r1 == 0) goto L_0x0076
            java.lang.String r10 = "Lottie doesn't support expressions."
            r11.addWarning(r10)
        L_0x0076:
            if (r2 == 0) goto L_0x0079
            return r2
        L_0x0079:
            com.airbnb.lottie.c.a.i r10 = new com.airbnb.lottie.c.a.i
            r10.<init>(r3, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.e.a.b(android.util.JsonReader, com.airbnb.lottie.LottieComposition):com.airbnb.lottie.c.a.m");
    }
}
