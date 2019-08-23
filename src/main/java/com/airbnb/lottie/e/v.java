package com.airbnb.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

public final class v implements af<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final v f4823a = new v();

    private v() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f2) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return n.b(jsonReader, f2);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return n.b(jsonReader, f2);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f2, ((float) jsonReader.nextDouble()) * f2);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + peek);
    }
}
