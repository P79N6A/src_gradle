package com.mapbox.mapboxsdk.plugins.china.maps;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.p;

public final class a extends MapView {
    private p h;

    /* access modifiers changed from: package-private */
    public final p getChinaOptions() {
        return this.h;
    }

    @UiThread
    public a(@NonNull Context context, @Nullable p pVar) {
        super(context, pVar);
    }

    public final void a(@NonNull Context context, @NonNull p pVar) {
        pVar.a("https://api.mapbox.cn");
        String str = pVar.D;
        if (str != null && !str.isEmpty()) {
            if (!str.contains("zh-v")) {
                char c2 = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -1885048708) {
                    if (hashCode == 945063576 && str.equals("mapbox://styles/mapbox/light-v9")) {
                        c2 = 0;
                    }
                } else if (str.equals("mapbox://styles/mapbox/dark-v9")) {
                    c2 = 1;
                }
                switch (c2) {
                    case 0:
                        pVar.b("mapbox://styles/mapbox/light-zh-v1");
                        break;
                    case 1:
                        pVar.b("mapbox://styles/mapbox/dark-zh-v1");
                        break;
                    default:
                        pVar.b("mapbox://styles/mapbox/streets-zh-v1");
                        break;
                }
            }
        } else {
            pVar.b("mapbox://styles/mapbox/streets-zh-v1");
        }
        this.h = pVar;
        super.a(context, this.h);
    }
}
