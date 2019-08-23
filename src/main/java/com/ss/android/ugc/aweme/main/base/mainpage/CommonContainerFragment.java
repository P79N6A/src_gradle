package com.ss.android.ugc.aweme.main.base.mainpage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public abstract class CommonContainerFragment extends CommonPageFragment {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f54440b;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f54441c;

    public abstract String a();

    public abstract Fragment b();

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54440b, false, 57819, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54440b, false, 57819, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (isViewValid()) {
            if (z) {
                if (PatchProxy.isSupport(new Object[0], this, f54440b, false, 57820, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f54440b, false, 57820, new Class[0], Void.TYPE);
                } else if (this.f54441c == null) {
                    this.f54441c = getChildFragmentManager().findFragmentByTag(a());
                    if (this.f54441c == null) {
                        this.f54441c = b();
                    }
                    Fragment fragment = this.f54441c;
                    String a2 = a();
                    if (PatchProxy.isSupport(new Object[]{fragment, a2}, this, f54440b, false, 57821, new Class[]{Fragment.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{fragment, a2}, this, f54440b, false, 57821, new Class[]{Fragment.class, String.class}, Void.TYPE);
                    } else {
                        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
                        beginTransaction.replace(C0906R.id.y9, fragment, a2);
                        beginTransaction.commitAllowingStateLoss();
                    }
                }
            }
            if (this.f54441c != null) {
                this.f54441c.setUserVisibleHint(z);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f54440b, false, 57818, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f54440b, false, 57818, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f54440b, false, 57817, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.pe, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f54440b, false, 57817, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
