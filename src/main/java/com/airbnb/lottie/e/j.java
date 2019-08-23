package com.airbnb.lottie.e;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.c.b.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class j implements af<c> {

    /* renamed from: a  reason: collision with root package name */
    private int f4817a;

    public j(int i) {
        this.f4817a = i;
    }

    private void a(c cVar, List<Float> list) {
        int i;
        c cVar2 = cVar;
        List<Float> list2 = list;
        int i2 = this.f4817a * 4;
        if (list.size() > i2) {
            int size = (list.size() - i2) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i3 = 0;
            while (i2 < list.size()) {
                if (i2 % 2 == 0) {
                    dArr[i3] = (double) list2.get(i2).floatValue();
                } else {
                    dArr2[i3] = (double) list2.get(i2).floatValue();
                    i3++;
                }
                i2++;
            }
            for (int i4 = 0; i4 < cVar.a(); i4++) {
                int i5 = cVar2.f4708b[i4];
                double d2 = (double) cVar2.f4707a[i4];
                int i6 = 1;
                while (true) {
                    if (i6 >= dArr.length) {
                        i = (int) (dArr2[dArr2.length - 1] * 255.0d);
                        break;
                    }
                    int i7 = i6 - 1;
                    double d3 = dArr[i7];
                    double d4 = dArr[i6];
                    if (dArr[i6] >= d2) {
                        Double.isNaN(d2);
                        double d5 = dArr2[i7];
                        i = (int) ((d5 + (((d2 - d3) / (d4 - d3)) * (dArr2[i6] - d5))) * 255.0d);
                        break;
                    }
                    i6++;
                }
                cVar2.f4708b[i4] = Color.argb(i, Color.red(i5), Color.green(i5), Color.blue(i5));
            }
        }
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f2) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f4817a == -1) {
            this.f4817a = arrayList.size() / 4;
        }
        float[] fArr = new float[this.f4817a];
        int[] iArr = new int[this.f4817a];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4817a * 4; i3++) {
            int i4 = i3 / 4;
            double floatValue = (double) ((Float) arrayList.get(i3)).floatValue();
            switch (i3 % 4) {
                case 0:
                    fArr[i4] = (float) floatValue;
                    break;
                case 1:
                    Double.isNaN(floatValue);
                    i = (int) (floatValue * 255.0d);
                    break;
                case 2:
                    Double.isNaN(floatValue);
                    i2 = (int) (floatValue * 255.0d);
                    break;
                case 3:
                    Double.isNaN(floatValue);
                    iArr[i4] = Color.argb(255, i, i2, (int) (floatValue * 255.0d));
                    break;
            }
        }
        c cVar = new c(fArr, iArr);
        a(cVar, (List<Float>) arrayList);
        return cVar;
    }
}
