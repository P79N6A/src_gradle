package com.mapbox.android.core.a;

public final class c {
    c() {
    }

    static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
