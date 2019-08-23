package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.b.i;

public class ResourceUnityVersionProvider implements UnityVersionProvider {
    private final Context context;
    private final UnityVersionProvider fallback;
    private boolean hasRead;
    private String unityVersion;

    public String getUnityVersion() {
        if (!this.hasRead) {
            this.unityVersion = i.i(this.context);
            this.hasRead = true;
        }
        if (this.unityVersion != null) {
            return this.unityVersion;
        }
        if (this.fallback != null) {
            return this.fallback.getUnityVersion();
        }
        return null;
    }

    public ResourceUnityVersionProvider(Context context2, UnityVersionProvider unityVersionProvider) {
        this.context = context2;
        this.fallback = unityVersionProvider;
    }
}
