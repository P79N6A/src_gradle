package com.facebook.react.bridge;

import android.app.Activity;
import javax.annotation.Nullable;

public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
    private final ReactApplicationContext mReactApplicationContext;

    public final ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final Activity getCurrentActivity() {
        return this.mReactApplicationContext.getCurrentActivity();
    }

    public ReactContextBaseJavaModule(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }
}
