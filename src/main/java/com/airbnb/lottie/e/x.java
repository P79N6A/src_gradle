package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.f;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.c.b.j;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import java.io.IOException;

public final class x {
    static j a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        String str = null;
        m mVar = null;
        f fVar = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 112) {
                if (hashCode != 3519) {
                    switch (hashCode) {
                        case 114:
                            if (nextName.equals("r")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 115:
                            if (nextName.equals(NotifyType.SOUND)) {
                                c2 = 2;
                                break;
                            }
                            break;
                    }
                } else if (nextName.equals("nm")) {
                    c2 = 0;
                }
            } else if (nextName.equals("p")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    mVar = a.b(jsonReader, lottieComposition);
                    break;
                case 2:
                    fVar = d.c(jsonReader, lottieComposition);
                    break;
                case 3:
                    bVar = d.a(jsonReader, lottieComposition);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new j(str, mVar, fVar, bVar);
    }
}
