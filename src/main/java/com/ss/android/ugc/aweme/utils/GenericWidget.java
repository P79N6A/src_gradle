package com.ss.android.ugc.aweme.utils;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;

public class GenericWidget extends Widget implements GenericLifecycleObserver {
    public static ChangeQuickRedirect s;

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle.Event event2 = event;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event2}, this, s, false, 88344, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event2}, this, s, false, 88344, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
        } else if (event2 == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event2 == Lifecycle.Event.ON_START) {
            onStart();
        } else if (event2 == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event2 == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event2 == Lifecycle.Event.ON_STOP) {
            onStop();
        } else {
            if (event2 == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }
    }
}
