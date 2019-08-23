package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

public class g extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80964b;

    public String f() {
        try {
            return DeviceConfig.getMac(this.f80964b);
        } catch (Exception e2) {
            UMCrashManager.reportCrash(this.f80964b, e2);
            return null;
        }
    }

    public g(Context context) {
        super("mac");
        this.f80964b = context;
    }
}
