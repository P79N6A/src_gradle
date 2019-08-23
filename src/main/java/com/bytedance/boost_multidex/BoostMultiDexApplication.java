package com.bytedance.boost_multidex;

import android.app.Application;
import android.content.Context;

public class BoostMultiDexApplication extends Application {
    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        BoostMultiDex.install(this);
    }
}
