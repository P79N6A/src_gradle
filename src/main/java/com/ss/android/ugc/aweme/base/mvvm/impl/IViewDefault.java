package com.ss.android.ugc.aweme.base.mvvm.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.mvvm.d;
import com.ss.android.ugc.aweme.base.mvvm.e;

public abstract class IViewDefault<K extends e> implements d<K> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected View mView;

    public void refresh() {
    }

    public View getAndroidView() {
        return this.mView;
    }

    public Activity getActivity() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24670, new Class[0], Activity.class)) {
            return (Activity) getAndroidView().getContext();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24670, new Class[0], Activity.class);
    }

    public Context getContext() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24669, new Class[0], Context.class)) {
            return getAndroidView().getContext();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24669, new Class[0], Context.class);
    }

    public IViewDefault(Context context) {
    }
}
