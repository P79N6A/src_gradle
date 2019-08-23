package com.airbnb.lottie.e;

import android.support.annotation.Nullable;
import android.util.JsonReader;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.c.a.a;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.c;
import com.airbnb.lottie.c.a.f;
import com.airbnb.lottie.c.a.h;
import java.io.IOException;
import java.util.List;

public final class d {
    public static b a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return a(jsonReader, lottieComposition, true);
    }

    static com.airbnb.lottie.c.a.d b(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new com.airbnb.lottie.c.a.d(a(jsonReader, lottieComposition, (af<T>) m.f4818a));
    }

    static f c(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new f(a(jsonReader, com.airbnb.lottie.f.f.a(), lottieComposition, v.f4823a));
    }

    static h d(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new h(a(jsonReader, com.airbnb.lottie.f.f.a(), lottieComposition, aa.f4813a));
    }

    static a e(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new a(a(jsonReader, lottieComposition, (af<T>) f.f4814a));
    }

    static c a(JsonReader jsonReader, LottieComposition lottieComposition, int i) throws IOException {
        return new c(a(jsonReader, lottieComposition, (af<T>) new j<T>(i)));
    }

    public static b a(JsonReader jsonReader, LottieComposition lottieComposition, boolean z) throws IOException {
        float f2;
        if (z) {
            f2 = com.airbnb.lottie.f.f.a();
        } else {
            f2 = 1.0f;
        }
        return new b(a(jsonReader, f2, lottieComposition, i.f4816a));
    }

    @Nullable
    static <T> List<com.airbnb.lottie.g.a<T>> a(JsonReader jsonReader, LottieComposition lottieComposition, af<T> afVar) throws IOException {
        return p.a(jsonReader, lottieComposition, 1.0f, afVar);
    }

    @Nullable
    private static <T> List<com.airbnb.lottie.g.a<T>> a(JsonReader jsonReader, float f2, LottieComposition lottieComposition, af<T> afVar) throws IOException {
        return p.a(jsonReader, lottieComposition, f2, afVar);
    }
}
