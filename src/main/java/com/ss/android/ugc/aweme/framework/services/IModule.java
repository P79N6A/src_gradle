package com.ss.android.ugc.aweme.framework.services;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.f.a.a;
import java.lang.ref.WeakReference;

public interface IModule {

    public static class ModuleParams {
        public String apiHost;
        public Application application;
        public String channel;
        public String currentFlavor;
        public boolean debug;
    }

    void initialize(ModuleParams moduleParams);

    void registerJSBridgeJavaMethod(a aVar, WeakReference<Context> weakReference);
}
