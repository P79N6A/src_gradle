package com.umeng.analytics.pro;

import android.os.Build;

public class aj extends y {
    public aj() {
        super("serial");
    }

    public String f() {
        if (Build.VERSION.SDK_INT >= 9) {
            return Build.SERIAL;
        }
        return null;
    }
}
