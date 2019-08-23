package com.airbnb.lottie.e;

import android.util.JsonReader;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.b.q;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import java.io.IOException;

public final class ae {
    static q a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        String str = null;
        q.a aVar = null;
        b bVar = null;
        b bVar2 = null;
        b bVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 101) {
                if (hashCode != 109) {
                    if (hashCode != 111) {
                        if (hashCode != 115) {
                            if (hashCode == 3519 && nextName.equals("nm")) {
                                c2 = 3;
                            }
                        } else if (nextName.equals(NotifyType.SOUND)) {
                            c2 = 0;
                        }
                    } else if (nextName.equals("o")) {
                        c2 = 2;
                    }
                } else if (nextName.equals("m")) {
                    c2 = 4;
                }
            } else if (nextName.equals("e")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    bVar = d.a(jsonReader, lottieComposition, false);
                    break;
                case 1:
                    bVar2 = d.a(jsonReader, lottieComposition, false);
                    break;
                case 2:
                    bVar3 = d.a(jsonReader, lottieComposition, false);
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    aVar = q.a.forId(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        q qVar = new q(str, aVar, bVar, bVar2, bVar3);
        return qVar;
    }
}
