package com.umeng.analytics.pro;

import android.content.Context;
import android.provider.Settings;

public class z extends y {

    /* renamed from: b  reason: collision with root package name */
    private Context f80707b;

    public String f() {
        try {
            return Settings.Secure.getString(this.f80707b.getContentResolver(), "android_id");
        } catch (Exception unused) {
            return null;
        }
    }

    public z(Context context) {
        super("android_id");
        this.f80707b = context;
    }
}
