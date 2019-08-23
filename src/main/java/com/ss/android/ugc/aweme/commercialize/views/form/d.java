package com.ss.android.ugc.aweme.commercialize.views.form;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.IESBrowserFragment;
import com.ss.android.ugc.aweme.video.o;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40103a;

    public final IESBrowserFragment a(FragmentManager fragmentManager, ViewGroup viewGroup, int i, Bundle bundle) {
        AdFormBrowserFragment adFormBrowserFragment;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{fragmentManager, viewGroup2, Integer.valueOf(i), bundle2}, this, f40103a, false, 33158, new Class[]{FragmentManager.class, ViewGroup.class, Integer.TYPE, Bundle.class}, IESBrowserFragment.class)) {
            Object[] objArr = {fragmentManager, viewGroup2, Integer.valueOf(i), bundle2};
            return (IESBrowserFragment) PatchProxy.accessDispatch(objArr, this, f40103a, false, 33158, new Class[]{FragmentManager.class, ViewGroup.class, Integer.TYPE, Bundle.class}, IESBrowserFragment.class);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(i2);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewGroup2.addView(frameLayout);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, AdFormBrowserFragment.ah, true, 33110, new Class[]{Bundle.class}, AdFormBrowserFragment.class)) {
            Object[] objArr2 = {bundle2};
            adFormBrowserFragment = (AdFormBrowserFragment) PatchProxy.accessDispatch(objArr2, null, AdFormBrowserFragment.ah, true, 33110, new Class[]{Bundle.class}, AdFormBrowserFragment.class);
        } else {
            adFormBrowserFragment = new AdFormBrowserFragment();
            adFormBrowserFragment.setArguments(bundle2);
            adFormBrowserFragment.ap = bundle2.getBoolean("use_css_injection", true);
        }
        if (!o.v()) {
            o.b().h();
        }
        beginTransaction.add(i2, (Fragment) adFormBrowserFragment);
        beginTransaction.commitAllowingStateLoss();
        return adFormBrowserFragment;
    }

    public final void a(FragmentManager fragmentManager, ViewGroup viewGroup, int i, boolean z) {
        FragmentManager fragmentManager2 = fragmentManager;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{fragmentManager2, viewGroup2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f40103a, false, 33159, new Class[]{FragmentManager.class, ViewGroup.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager2, viewGroup2, Integer.valueOf(i), Byte.valueOf(z)}, this, f40103a, false, 33159, new Class[]{FragmentManager.class, ViewGroup.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        viewGroup2.removeView((FrameLayout) viewGroup.findViewById(i));
        Fragment findFragmentById = fragmentManager2.findFragmentById(i);
        if (findFragmentById != null) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.remove(findFragmentById);
            beginTransaction.commitAllowingStateLoss();
        }
        if (z && !o.v()) {
            o.b().f();
        }
    }
}
