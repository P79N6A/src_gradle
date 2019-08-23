package com.bytedance.widget;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;

public class Widget_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a  reason: collision with root package name */
    final Widget f22908a;

    Widget_LifecycleAdapter(Widget widget) {
        this.f22908a = widget;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2;
        if (methodCallsLogger != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (event == Lifecycle.Event.ON_CREATE) {
                if (!z2 || methodCallsLogger.approveCall("create$widget_release", 1)) {
                    this.f22908a.create$widget_release();
                }
            } else if (event == Lifecycle.Event.ON_START) {
                if (!z2 || methodCallsLogger.approveCall("start$widget_release", 1)) {
                    this.f22908a.start$widget_release();
                }
            } else if (event == Lifecycle.Event.ON_RESUME) {
                if (!z2 || methodCallsLogger.approveCall("resume$widget_release", 1)) {
                    this.f22908a.resume$widget_release();
                }
            } else if (event == Lifecycle.Event.ON_PAUSE) {
                if (!z2 || methodCallsLogger.approveCall("pause$widget_release", 1)) {
                    this.f22908a.pause$widget_release();
                }
            } else if (event == Lifecycle.Event.ON_STOP) {
                if (!z2 || methodCallsLogger.approveCall("stop$widget_release", 1)) {
                    this.f22908a.stop$widget_release();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                if (!z2 || methodCallsLogger.approveCall("destroy$widget_release", 1)) {
                    this.f22908a.destroy$widget_release();
                }
            }
        }
    }
}
