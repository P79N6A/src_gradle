package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.q;

public abstract class BasePasswordService implements LifecycleObserver, q {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mKeepCallback;
    private LifecycleOwner mLifeOwner;
    private IAccountService.h mResult;

    public q keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71356, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71356, new Class[0], Void.TYPE);
            return;
        }
        if (this.mLifeOwner != null) {
            this.mLifeOwner.getLifecycle().removeObserver(this);
        }
        this.mResult = null;
        this.mLifeOwner = null;
    }

    public void changePassword(Activity activity, @Nullable IAccountService.h hVar) {
        if (PatchProxy.isSupport(new Object[]{activity, hVar}, this, changeQuickRedirect, false, 71355, new Class[]{Activity.class, IAccountService.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, hVar}, this, changeQuickRedirect, false, 71355, new Class[]{Activity.class, IAccountService.h.class}, Void.TYPE);
            return;
        }
        this.mResult = hVar;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    public void setPassword(Activity activity, @Nullable IAccountService.h hVar) {
        if (PatchProxy.isSupport(new Object[]{activity, hVar}, this, changeQuickRedirect, false, 71354, new Class[]{Activity.class, IAccountService.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, hVar}, this, changeQuickRedirect, false, 71354, new Class[]{Activity.class, IAccountService.h.class}, Void.TYPE);
            return;
        }
        this.mResult = hVar;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    public void returnResult(@IAccountService.ActionType int i, @IAccountService.ActionResult int i2, @Nullable Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 71357, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 71357, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        if (this.mResult != null) {
            int i3 = i;
            int i4 = i2;
            this.mResult.a(i, i2, obj2);
            this.mResult = null;
        }
    }
}
