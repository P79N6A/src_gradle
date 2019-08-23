package com.bytedance.frameworks.plugin.compat.o;

import android.content.res.Configuration;
import android.view.ViewRootImpl;
import com.bytedance.frameworks.plugin.core.h;

public class ActivityConfigCallbackProxy implements ViewRootImpl.ActivityConfigCallback {
    private ViewRootImpl.ActivityConfigCallback mOriginCallback;

    public ActivityConfigCallbackProxy(ViewRootImpl.ActivityConfigCallback activityConfigCallback) {
        this.mOriginCallback = activityConfigCallback;
    }

    public void onConfigurationChanged(Configuration configuration, int i) {
        h a2 = h.a();
        h.a();
        a2.a(configuration, h.b().getDisplayMetrics());
        this.mOriginCallback.onConfigurationChanged(configuration, i);
    }
}
