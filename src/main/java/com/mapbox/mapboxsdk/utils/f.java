package com.mapbox.mapboxsdk.utils;

import android.os.Looper;
import com.mapbox.mapboxsdk.b.a;

public final class f {
    public static void a(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new a(String.format("%s interactions should happen on the UI thread.", new Object[]{str}));
        }
    }
}
