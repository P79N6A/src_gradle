package com.ss.android.experiencekit;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.experiencekit.c.d;

public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private Class<? extends Activity> f29063a;

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        b.b().a(com.ss.android.experiencekit.c.a.f29089c, d.BEGIN);
    }

    private boolean a(Activity activity) {
        try {
            if (this.f29063a == null) {
                this.f29063a = Class.forName("com.ss.android.ugc.aweme.live.sdk.module.live.ui.LivePlayActivity");
            }
            if (activity.getClass() == this.f29063a) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (a(activity)) {
            b.b().a(com.ss.android.experiencekit.c.a.f29089c, d.BEGIN);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (a(activity)) {
            b.b().a(com.ss.android.experiencekit.c.a.k, d.END);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (a(activity)) {
            b.b().a(com.ss.android.experiencekit.c.a.k, d.BEGIN);
        }
    }
}
