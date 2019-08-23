package com.ss.android.ugc.aweme.app.application.b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.base.component.AnalysisFragmentComponent;
import com.ss.android.ugc.aweme.base.component.EventActivityComponent;

public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33929a;

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, bundle}, this, f33929a, false, 23237, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bundle}, this, f33929a, false, 23237, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
            return;
        }
        if (activity2 instanceof AbsActivity) {
            AbsActivity absActivity = (AbsActivity) activity2;
            if (PatchProxy.isSupport(new Object[]{absActivity}, this, f33929a, false, 23238, new Class[]{AbsActivity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{absActivity}, this, f33929a, false, 23238, new Class[]{AbsActivity.class}, Void.TYPE);
            } else {
                absActivity.getLifecycle().addObserver(new AnalysisActivityComponent(absActivity));
                absActivity.getLifecycle().addObserver(new EventActivityComponent(absActivity));
            }
        }
        if (activity2 instanceof FragmentActivity) {
            ((FragmentActivity) activity2).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new AnalysisFragmentComponent(), true);
        }
    }
}
