package com.facebook.c.a;

import android.util.JsonReader;
import com.facebook.c.b.h;
import java.io.IOException;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    static final a<com.facebook.c.b.h> f23312a = new a<com.facebook.c.b.h>() {
        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            h.a aVar = new h.a();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c2 = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != -1535541424) {
                    if (hashCode == 3076010 && nextName.equals("data")) {
                        c2 = 1;
                    }
                } else if (nextName.equals("start_frame")) {
                    c2 = 0;
                }
                switch (c2) {
                    case 0:
                        aVar.f23368a = jsonReader.nextInt();
                        break;
                    case 1:
                        aVar.f23369b = b.f23303a.a(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            return new com.facebook.c.b.h(aVar.f23368a, aVar.f23369b);
        }
    };
}
