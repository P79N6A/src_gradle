package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.c.b.h;
import java.io.IOException;

public final class t {
    static h a(JsonReader jsonReader) throws IOException {
        String str = null;
        h.a aVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3488) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c2 = 0;
                }
            } else if (nextName.equals("mm")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    aVar = h.a.forId(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new h(str, aVar);
    }
}
