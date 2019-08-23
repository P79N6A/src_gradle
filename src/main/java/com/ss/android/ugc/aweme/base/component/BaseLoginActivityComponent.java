package com.ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.framework.core.a;

public abstract class BaseLoginActivityComponent implements LifecycleObserver, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2741a;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2741a, false, 24575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2741a, false, 24575, new Class[0], Void.TYPE);
            return;
        }
        c.b().openPrivacyPolicy(a.b().a());
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2741a, false, 24576, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2741a, false, 24576, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f2741a, false, 24574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2741a, false, 24574, new Class[0], Void.TYPE);
            return;
        }
        a(a.b().a(), "", "", (Bundle) null, (f) null);
    }

    @CallSuper
    public void a(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle, @Nullable f fVar) {
        Bundle bundle2;
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4, bundle, fVar}, this, f2741a, false, 24572, new Class[]{Activity.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str3, str4, bundle, fVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f2741a, false, 24572, new Class[]{Activity.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE);
            return;
        }
        if (activity2 instanceof LifecycleOwner) {
            ((LifecycleOwner) activity2).getLifecycle().addObserver(this);
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        bundle2.putString("enter_from", str3);
        bundle2.putString("enter_method", str4);
    }

    @CallSuper
    public void a(@NonNull Fragment fragment, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle, @Nullable f fVar) {
        Bundle bundle2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{fragment, str3, str4, bundle, fVar}, this, f2741a, false, 24571, new Class[]{Fragment.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE)) {
            Object[] objArr = {fragment, str3, str4, bundle, fVar};
            PatchProxy.accessDispatch(objArr, this, f2741a, false, 24571, new Class[]{Fragment.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE);
            return;
        }
        fragment.getLifecycle().addObserver(this);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        bundle2.putString("enter_from", str3);
        bundle2.putString("enter_method", str4);
    }
}
