package com.ss.android.ugc.aweme.base.component;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.analysis.c;
import java.lang.ref.WeakReference;

public class AnalysisFragmentComponent extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34683a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<c> f34684b;

    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f34683a, false, 24560, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f34683a, false, 24560, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
            return;
        }
        super.onFragmentResumed(fragmentManager, fragment);
    }

    public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f34683a, false, 24561, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f34683a, false, 24561, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
            return;
        }
        super.onFragmentStopped(fragmentManager, fragment);
    }

    public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment2, context}, this, f34683a, false, 24559, new Class[]{FragmentManager.class, Fragment.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment2, context}, this, f34683a, false, 24559, new Class[]{FragmentManager.class, Fragment.class, Context.class}, Void.TYPE);
            return;
        }
        super.onFragmentAttached(fragmentManager, fragment, context);
        if (fragment2 instanceof c) {
            this.f34684b = new WeakReference<>((c) fragment2);
        }
    }
}
