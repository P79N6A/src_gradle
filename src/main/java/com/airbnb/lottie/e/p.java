package com.airbnb.lottie.e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.g.a;
import com.ss.android.ugc.aweme.miniapp.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class p {
    public static void a(List<? extends a<?>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            i2++;
            ((a) list.get(i2)).f4864f = Float.valueOf(((a) list.get(i2)).f4863e);
        }
        a aVar = (a) list.get(i);
        if (aVar.f4860b == null) {
            list.remove(aVar);
        }
    }

    static <T> List<a<T>> a(JsonReader jsonReader, LottieComposition lottieComposition, float f2, af<T> afVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            lottieComposition.addWarning("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            if (nextName.hashCode() == 107 && nextName.equals(k.f55809b)) {
                c2 = 0;
            }
            if (c2 != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(o.a(jsonReader, lottieComposition, f2, afVar, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(o.a(jsonReader, lottieComposition, f2, afVar, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(o.a(jsonReader, lottieComposition, f2, afVar, false));
            }
        }
        jsonReader.endObject();
        a(arrayList);
        return arrayList;
    }
}
