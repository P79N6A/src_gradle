package com.airbnb.lottie.e;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

public final class f implements af<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f4814a = new f();

    private f() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f2) throws IOException {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.beginArray();
        }
        double nextDouble = jsonReader.nextDouble();
        double nextDouble2 = jsonReader.nextDouble();
        double nextDouble3 = jsonReader.nextDouble();
        double nextDouble4 = jsonReader.nextDouble();
        if (z) {
            jsonReader.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d && nextDouble4 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            nextDouble4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
