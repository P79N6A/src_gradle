package com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.business;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.meituan.robust.ChangeQuickRedirect;

public class BusinessModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getName() {
        return "bridge";
    }

    public BusinessModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
