package com.airbnb.lottie.e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.g.d;
import java.io.IOException;

public final class z implements af<d> {

    /* renamed from: a  reason: collision with root package name */
    public static final z f4824a = new z();

    private z() {
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
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new d((nextDouble / 100.0f) * f2, (nextDouble2 / 100.0f) * f2);
    }
}
