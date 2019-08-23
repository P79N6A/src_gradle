package com.ss.android.ugc.aweme.framework.services;

import android.content.Context;
import android.support.annotation.MainThread;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IPluginService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CHECK_TYPE {
    }

    public interface CheckCallback {
        void onCancel(String str);

        void onSuccess(String str);
    }

    public interface PatchCallback {
        void log(String str);

        void onPatchDownloadResult(int i, String str);

        void onPatchResult(boolean z, String str);

        void onServerResponse(String str);
    }

    @Deprecated
    void check(Context context, String str, String str2, CheckCallback checkCallback);

    void check(Context context, String str, String str2, boolean z, CheckCallback checkCallback);

    void handleNetworkChanged(Context context, boolean z);

    void initPatchCallback(PatchCallback patchCallback);

    void initSaveu(Context context);

    void install(Context context);

    boolean loadLibrary(String str, String str2);

    void monitorPlugins();

    @MainThread
    void preload(String str);

    void update(Context context);
}
