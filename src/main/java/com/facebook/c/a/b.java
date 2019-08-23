package com.facebook.c.a;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a<String> f23303a = new a<String>() {
        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
            return jsonReader.nextString();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final a<Float> f23304b = new a<Float>() {
        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
            return Float.valueOf((float) jsonReader.nextDouble());
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static final a<List<Float>> f23305c = new a<List<Float>>() {
        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
            return b.f23304b.a(jsonReader);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final a<List<List<Float>>> f23306d = new a<List<List<Float>>>() {
        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
            return b.f23305c.a(jsonReader);
        }
    };

    public static float[] a(JsonReader jsonReader) throws IOException {
        return a(f23304b.a(jsonReader));
    }

    private static float[] a(List<Float> list) {
        float[] fArr = new float[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fArr[i] = list.get(i).floatValue();
        }
        return fArr;
    }

    public static float[][][] b(JsonReader jsonReader) throws IOException {
        List a2 = f23306d.a(jsonReader);
        float[][][] fArr = new float[a2.size()][][];
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            float[][] fArr2 = new float[((List) a2.get(0)).size()][];
            int length = fArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                fArr2[i2] = a((List) ((List) a2.get(i)).get(i2));
            }
            fArr[i] = fArr2;
        }
        return fArr;
    }
}
