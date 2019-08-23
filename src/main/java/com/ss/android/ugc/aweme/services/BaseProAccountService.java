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
import com.ss.android.ugc.aweme.r;

public class BaseProAccountService implements LifecycleObserver, r {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LifecycleOwner mLifeOwner;
    private IAccountService.h mResult;

    public void switchProAccount(int i, String str, @Nullable IAccountService.h hVar) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71359, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71359, new Class[0], Void.TYPE);
            return;
        }
        if (this.mLifeOwner != null) {
            this.mLifeOwner.getLifecycle().removeObserver(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    public void returnResult(@IAccountService.ActionType int i, @IAccountService.ActionResult int i2, @Nullable Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 71360, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 71360, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        if (this.mResult != null) {
            int i3 = i;
            int i4 = i2;
            this.mResult.a(i, i2, obj2);
        }
    }

    public void bindProAccountMobile(Activity activity, String str, @Nullable IAccountService.h hVar, int i, String str2) {
        Activity activity2 = activity;
        IAccountService.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str, hVar2, Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 71358, new Class[]{Activity.class, String.class, IAccountService.h.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str, hVar2, Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 71358, new Class[]{Activity.class, String.class, IAccountService.h.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.mResult = hVar2;
        if (activity2 instanceof LifecycleOwner) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity2;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }
}
