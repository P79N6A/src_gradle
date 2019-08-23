package com.facebook.c.a;

import android.util.JsonReader;
import com.facebook.c.b.i;
import java.io.IOException;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static final a<i> f23313a = new a<i>() {
        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
            return j.a(jsonReader);
        }
    };

    public static i a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        i.a aVar = new i.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 1324875910) {
                if (hashCode == 1981251071 && nextName.equals("color_end")) {
                    c2 = 1;
                }
            } else if (nextName.equals("color_start")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    aVar.f23373a = i.a(jsonReader);
                    break;
                case 1:
                    aVar.f23374b = i.a(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }
}
