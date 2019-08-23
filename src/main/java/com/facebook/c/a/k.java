package com.facebook.c.a;

import android.util.JsonReader;
import com.facebook.c.b.k;
import java.io.IOException;

public final class k {
    public static com.facebook.c.b.k a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        k.a aVar = new k.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1872643448:
                    if (nextName.equals("canvas_size")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -290659267:
                    if (nextName.equals("features")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -270583694:
                    if (nextName.equals("frame_rate")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 106079:
                    if (nextName.equals("key")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 511278831:
                    if (nextName.equals("animation_groups")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1301359490:
                    if (nextName.equals("animation_frame_count")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    aVar.f23385a = jsonReader.nextInt();
                    break;
                case 1:
                    aVar.f23386b = jsonReader.nextInt();
                    break;
                case 2:
                    aVar.f23387c = g.f23311a.a(jsonReader);
                    break;
                case 3:
                    aVar.f23388d = e.f23309a.a(jsonReader);
                    break;
                case 4:
                    aVar.f23389e = b.a(jsonReader);
                    break;
                case 5:
                    aVar.f23390f = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        com.facebook.c.b.k kVar = new com.facebook.c.b.k(aVar.f23385a, aVar.f23386b, aVar.f23387c, aVar.f23388d, aVar.f23389e, aVar.f23390f, (byte) 0);
        return kVar;
    }
}
