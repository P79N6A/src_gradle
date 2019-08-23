package com.huawei.emui.hiexperience.hwperf;

import android.content.Context;
import com.huawei.emui.hiexperience.hwperf.utils.HwPerfLog;

public class HwPerfFactory {
    public static HwPerfFactory mFactory;
    public Context mContext;

    public static final HwPerfFactory getInstance(Context context) {
        HwPerfLog.i("API: HwPerfFactory getInstance");
        return null;
    }

    public HwPerfBase createFeature(int i) {
        HwPerfLog.i("API: HwPerfFactory createFeature");
        return null;
    }
}
