package com.tt.miniapphost;

import android.app.Activity;
import android.content.Intent;
import com.tt.miniapphost.process.annotation.MiniAppProcess;

@MiniAppProcess
public abstract class NativeModule {
    private AppbrandContext appbrandContext;

    public interface NativeModuleCallback<T> {
        @MiniAppProcess
        void onNativeModuleCall(T t);
    }

    @MiniAppProcess
    public abstract String getName();

    @MiniAppProcess
    public abstract <T> String invoke(String str, NativeModuleCallback<T> nativeModuleCallback) throws Exception;

    @MiniAppProcess
    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @MiniAppProcess
    public void onStart() {
    }

    @MiniAppProcess
    public void onStop() {
    }

    @MiniAppProcess
    public Activity getCurrentActivity() {
        return this.appbrandContext.getCurrentActivity();
    }

    @MiniAppProcess
    public NativeModule(AppbrandContext appbrandContext2) {
        this.appbrandContext = appbrandContext2;
    }
}
