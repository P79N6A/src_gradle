package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.c.b.i;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.a;
import java.io.IOException;

public final class w {
    static i a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        String str = null;
        i.a aVar = null;
        b bVar = null;
        m mVar = null;
        b bVar2 = null;
        b bVar3 = null;
        b bVar4 = null;
        b bVar5 = null;
        b bVar6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case SearchJediMixFeedAdapter.f42516e /*?: ONE_ARG  (wrap: ?
  ?: SGET   com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter.e int)*/:
                    if (nextName.equals("p")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        c2 = 8;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3555:
                    if (nextName.equals(a.f69355d)) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    aVar = i.a.forValue(jsonReader.nextInt());
                    break;
                case 2:
                    bVar = d.a(jsonReader, lottieComposition, false);
                    break;
                case 3:
                    mVar = a.b(jsonReader, lottieComposition);
                    break;
                case 4:
                    bVar2 = d.a(jsonReader, lottieComposition, false);
                    break;
                case 5:
                    bVar4 = d.a(jsonReader, lottieComposition);
                    break;
                case 6:
                    bVar6 = d.a(jsonReader, lottieComposition, false);
                    break;
                case e.l /*?: ONE_ARG  (7 int)*/:
                    bVar3 = d.a(jsonReader, lottieComposition);
                    break;
                case 8:
                    bVar5 = d.a(jsonReader, lottieComposition, false);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        i iVar = new i(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6);
        return iVar;
    }
}
