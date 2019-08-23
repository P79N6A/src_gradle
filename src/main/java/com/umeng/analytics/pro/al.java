package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;

public class al extends y {

    /* renamed from: b  reason: collision with root package name */
    private Context f80366b;

    public String f() {
        SharedPreferences a2 = ba.a(this.f80366b);
        if (a2 != null) {
            return a2.getString("uopdta", "");
        }
        return "";
    }

    public al(Context context) {
        super("uop");
        this.f80366b = context;
    }
}
