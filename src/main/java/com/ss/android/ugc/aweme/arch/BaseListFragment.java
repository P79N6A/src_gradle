package com.ss.android.ugc.aweme.arch;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;

public abstract class BaseListFragment<T> extends AmeBaseFragment implements Observer<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34335a;

    /* renamed from: b  reason: collision with root package name */
    protected c<T> f34336b;

    /* renamed from: c  reason: collision with root package name */
    protected DataCenter f34337c;

    public abstract c<T> a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract int e();

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f34335a, false, 23757, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f34335a, false, 23757, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f34335a, false, 23759, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34335a, false, 23759, new Class[0], Void.TYPE);
        } else {
            if (this.f34337c == null) {
                this.f34337c = DataCenter.a(c.a((Fragment) this), (LifecycleOwner) this);
            }
            if (!TextUtils.isEmpty(b())) {
                this.f34337c.a(b(), (Observer<a>) this);
            }
            if (!TextUtils.isEmpty(c())) {
                this.f34337c.a(c(), (Observer<a>) this);
            }
            if (!TextUtils.isEmpty(d())) {
                this.f34337c.a(d(), (Observer<a>) this);
            }
        }
        if (PatchProxy.isSupport(new Object[]{view}, this, f34335a, false, 23758, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f34335a, false, 23758, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f34336b = a();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f34335a, false, 23756, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(e(), viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f34335a, false, 23756, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
