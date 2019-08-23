package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

public class d extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80955b;

    public String f() {
        return DeviceConfig.getDeviceIdUmengMD5(this.f80955b);
    }

    public d(Context context) {
        super("idmd5");
        this.f80955b = context;
    }
}
