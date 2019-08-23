package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.b.b;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.m;

public abstract class BaseBindService implements LifecycleObserver, m {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mKeepCallback;
    private LifecycleOwner mLifeOwner;
    private IAccountService.h mResult;

    public m keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    public void returnAuthorizeResult(String str, boolean z) {
    }

    public boolean hasPlatformBound() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71335, new Class[0], Boolean.TYPE)) {
            return b.a().b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71335, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71336, new Class[0], Void.TYPE);
            return;
        }
        if (this.mLifeOwner != null) {
            this.mLifeOwner.getLifecycle().removeObserver(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    public Intent getAuthorizeActivityStartIntent(@NonNull Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71333, new Class[]{Context.class}, Intent.class)) {
            return new Intent(context2, AuthorizeActivity.class);
        }
        return (Intent) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71333, new Class[]{Context.class}, Intent.class);
    }

    public boolean isPlatformBound(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71334, new Class[]{String.class}, Boolean.TYPE)) {
            return b.a().a(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71334, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public void returnResult(@IAccountService.ActionType int i, @IAccountService.ActionResult int i2, @Nullable Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 71337, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 71337, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        if (this.mResult != null) {
            int i3 = i;
            int i4 = i2;
            this.mResult.a(i, i2, obj2);
        }
        this.mResult = null;
    }

    public void bindMobile(Activity activity, String str, Bundle bundle, @Nullable IAccountService.h hVar) {
        Activity activity2 = activity;
        IAccountService.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str, bundle, hVar2}, this, changeQuickRedirect, false, 71331, new Class[]{Activity.class, String.class, Bundle.class, IAccountService.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str, bundle, hVar2}, this, changeQuickRedirect, false, 71331, new Class[]{Activity.class, String.class, Bundle.class, IAccountService.h.class}, Void.TYPE);
            return;
        }
        this.mResult = hVar2;
        if (!this.mKeepCallback && (activity2 instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity2;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    public void modifyMobile(Activity activity, String str, Bundle bundle, @Nullable IAccountService.h hVar) {
        Activity activity2 = activity;
        IAccountService.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str, bundle, hVar2}, this, changeQuickRedirect, false, 71332, new Class[]{Activity.class, String.class, Bundle.class, IAccountService.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str, bundle, hVar2}, this, changeQuickRedirect, false, 71332, new Class[]{Activity.class, String.class, Bundle.class, IAccountService.h.class}, Void.TYPE);
            return;
        }
        this.mResult = hVar2;
        if (!this.mKeepCallback && (activity2 instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity2;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }
}
