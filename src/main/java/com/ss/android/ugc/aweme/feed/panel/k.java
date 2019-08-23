package com.ss.android.ugc.aweme.feed.panel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.common.component.fragment.a;

public abstract class k extends a {
    public static ChangeQuickRedirect ap;

    /* renamed from: a  reason: collision with root package name */
    private Unbinder f3179a;
    public boolean aq;

    public void bt() {
    }

    public boolean h() {
        return false;
    }

    public boolean aq() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, ap, false, 41811, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, ap, false, 41811, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Fragment fragment = this.as;
        if (fragment != null && fragment.isResumed()) {
            z = true;
        }
        return z;
    }

    public boolean bc() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, ap, false, 41810, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, ap, false, 41810, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbsFragment absFragment = (AbsFragment) this.as;
        if (absFragment != null && absFragment.isViewValid()) {
            z = true;
        }
        return z;
    }

    public final boolean bq() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, ap, false, 41812, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, ap, false, 41812, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbsFragment absFragment = (AbsFragment) this.as;
        if (absFragment != null && absFragment.isActive()) {
            z = true;
        }
        return z;
    }

    public final FragmentManager br() {
        if (PatchProxy.isSupport(new Object[0], this, ap, false, 41813, new Class[0], FragmentManager.class)) {
            return (FragmentManager) PatchProxy.accessDispatch(new Object[0], this, ap, false, 41813, new Class[0], FragmentManager.class);
        }
        AbsFragment absFragment = (AbsFragment) this.as;
        if (absFragment == null) {
            return null;
        }
        return absFragment.getChildFragmentManager();
    }

    public final Bundle bs() {
        if (PatchProxy.isSupport(new Object[0], this, ap, false, 41814, new Class[0], Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[0], this, ap, false, 41814, new Class[0], Bundle.class);
        }
        AbsFragment absFragment = (AbsFragment) this.as;
        if (absFragment == null) {
            return null;
        }
        return absFragment.getArguments();
    }

    public void n() {
        if (PatchProxy.isSupport(new Object[0], this, ap, false, 41817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, ap, false, 41817, new Class[0], Void.TYPE);
            return;
        }
        super.n();
        if (this.f3179a != null) {
            this.f3179a.unbind();
        }
        if (h()) {
            bg.d(this);
        }
    }

    public void f(boolean z) {
        this.aq = z;
    }

    public void a(View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, ap, false, 41816, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, ap, false, 41816, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.a(view, bundle);
        ButterKnife.bind((Object) this, view);
        if (h()) {
            bg.c(this);
        }
    }
}
