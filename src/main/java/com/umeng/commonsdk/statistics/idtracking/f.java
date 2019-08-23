package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

public class f extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80963b;

    public String f() {
        return DeviceConfig.getImeiNew(this.f80963b);
    }

    public f(Context context) {
        super("imei");
        this.f80963b = context;
    }
}
