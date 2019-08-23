package com.facebook.c.a;

import android.util.JsonReader;
import com.facebook.c.b.d;
import java.io.IOException;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final a<d> f23309a = new a<d>() {
        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            d.a aVar = new d.a();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c2 = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != 314070383) {
                    if (hashCode != 506361563) {
                        if (hashCode == 1394981546 && nextName.equals("parent_group")) {
                            c2 = 1;
                        }
                    } else if (nextName.equals("group_id")) {
                        c2 = 0;
                    }
                } else if (nextName.equals("animations")) {
                    c2 = 2;
                }
                switch (c2) {
                    case 0:
                        aVar.f23345a = jsonReader.nextInt();
                        break;
                    case 1:
                        aVar.f23346b = jsonReader.nextInt();
                        break;
                    case 2:
                        aVar.f23347c = c.f23307a.a(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            return new d(aVar.f23345a, aVar.f23346b, aVar.f23347c);
        }
    };
}
