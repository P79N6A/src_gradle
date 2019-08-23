package com.facebook.c.a;

import android.util.JsonReader;
import com.facebook.c.b.j;
import java.io.IOException;

public final class i {
    public static j a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        j.a aVar = new j.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1530780935) {
                if (hashCode == 594928386 && nextName.equals("key_values")) {
                    c2 = 0;
                }
            } else if (nextName.equals("timing_curves")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    aVar.f23377a = f.f23310a.a(jsonReader);
                    break;
                case 1:
                    aVar.f23378b = b.b(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new j(aVar.f23377a, aVar.f23378b);
    }
}
