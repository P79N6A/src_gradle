package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

public class q extends a {

    /* renamed from: c  reason: collision with root package name */
    private Context f80975c;

    public String f() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f80975c);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("uopdta", "");
        }
        return "";
    }

    public q(Context context) {
        super("uop");
        this.f80975c = context;
    }
}
