package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

public class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80953b;

    public String f() {
        return DeviceConfig.getAndroidId(this.f80953b);
    }

    public b(Context context) {
        super("android_id");
        this.f80953b = context;
    }
}
