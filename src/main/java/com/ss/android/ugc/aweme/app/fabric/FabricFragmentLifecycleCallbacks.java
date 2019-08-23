package com.ss.android.ugc.aweme.app.fabric;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;

public class FabricFragmentLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34183a;

    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f34183a, false, 23510, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f34183a, false, 23510, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
            return;
        }
        a.a("onFragmentPaused() called with:  Fragment = [" + fragment.getClass().getName() + "]");
    }

    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f34183a, false, 23509, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f34183a, false, 23509, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
            return;
        }
        a.a("onFragmentResumed() called with: Fragment = [" + fragment.getClass().getName() + "]");
    }

    public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f34183a, false, 23508, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f34183a, false, 23508, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
            return;
        }
        a.a("onFragmentStarted() called with: Fragment = [" + fragment.getClass().getName() + "]");
    }

    public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment, bundle}, this, f34183a, false, 23506, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment, bundle}, this, f34183a, false, 23506, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE);
            return;
        }
        a.a("onFragmentCreated() called with: Fragment = [" + fragment.getClass().getName() + "]");
    }

    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment, view, bundle}, this, f34183a, false, 23507, new Class[]{FragmentManager.class, Fragment.class, View.class, Bundle.class}, Void.TYPE)) {
            Object[] objArr = {fragmentManager, fragment, view, bundle};
            PatchProxy.accessDispatch(objArr, this, f34183a, false, 23507, new Class[]{FragmentManager.class, Fragment.class, View.class, Bundle.class}, Void.TYPE);
            return;
        }
        a.a("onFragmentViewCreated() called with: Fragment = [" + fragment.getClass().getName() + "]");
        try {
            long a2 = a.a(view.getContext().getApplicationContext());
            a.a(fragment.getClass().getName() + "   freeMem :" + ((a2 / 1024) / 1024));
        } catch (Exception unused) {
        }
    }
}
