package io.fabric.sdk.android;

import android.util.Log;

public final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private int f83129a = 4;

    public b() {
    }

    public b(int i) {
    }

    public final boolean a(String str, int i) {
        if (this.f83129a <= i || Log.isLoggable(str, i)) {
            return true;
        }
        return false;
    }
}
