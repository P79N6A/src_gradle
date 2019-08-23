package com.facebook.c.a;

import android.util.JsonReader;
import com.facebook.c.b.b;
import java.io.IOException;
import java.util.Locale;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final a<b> f23307a = new a<b>() {
        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            b.a aVar = new b.a();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c2 = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != -1530780935) {
                    if (hashCode != -1413299531) {
                        if (hashCode != -993141291) {
                            if (hashCode == 594928386 && nextName.equals("key_values")) {
                                c2 = 1;
                            }
                        } else if (nextName.equals("property")) {
                            c2 = 0;
                        }
                    } else if (nextName.equals("anchor")) {
                        c2 = 3;
                    }
                } else if (nextName.equals("timing_curves")) {
                    c2 = 2;
                }
                switch (c2) {
                    case 0:
                        aVar.f23333a = b.C0250b.valueOf(jsonReader.nextString().toUpperCase(Locale.US));
                        break;
                    case 1:
                        aVar.f23334b = d.f23308a.a(jsonReader);
                        break;
                    case 2:
                        aVar.f23335c = b.b(jsonReader);
                        break;
                    case 3:
                        aVar.f23336d = b.a(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            return new b(aVar.f23333a, aVar.f23334b, aVar.f23335c, aVar.f23336d);
        }
    };
}
