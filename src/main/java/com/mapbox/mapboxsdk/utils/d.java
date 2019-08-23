package com.mapbox.mapboxsdk.utils;

import android.content.Context;
import android.os.Bundle;
import com.mapbox.mapboxsdk.maps.p;

public final class d {
    public static Bundle a(p pVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapboxMapOptions", pVar);
        return bundle;
    }

    public static p a(Context context, Bundle bundle) {
        if (bundle == null || !bundle.containsKey("MapboxMapOptions")) {
            return p.a(context, null);
        }
        return (p) bundle.getParcelable("MapboxMapOptions");
    }
}
