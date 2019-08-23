package com.bytedance.ies.ugc.aweme.plugin.service;

import android.content.Context;
import android.support.annotation.MainThread;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IPluginService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CHECK_TYPE {
    }

    public interface b {
        void a(int i, String str);

        void a(String str);

        void a(boolean z, String str);
    }

    public interface a {
        void a(String str);

        void b(String str);
    }

    void check(Context context, String str, String str2, boolean z, a aVar);

    void initPatchCallback(b bVar);

    void initSaveu(Context context);

    void install(Context context);

    boolean loadLibrary(String str, String str2);

    void monitorPlugins();

    boolean needUpgradePlugin(Context context, String str);

    @MainThread
    void preload(String str);

    void update(Context context);
}
