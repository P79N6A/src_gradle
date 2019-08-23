package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.IdRes;
import android.view.View;
import com.bytedance.android.live.core.rxutils.a;
import com.bytedance.android.live.core.rxutils.autodispose.ae;
import com.bytedance.android.live.core.rxutils.autodispose.e;
import com.bytedance.android.live.core.rxutils.autodispose.m;
import com.bytedance.android.live.core.rxutils.f;
import com.bytedance.android.live.core.rxutils.g;
import com.bytedance.android.livesdk.an;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.CompositeDisposable;

public abstract class LiveWidget extends Widget {
    public static ChangeQuickRedirect changeQuickRedirect;
    private CompositeDisposable compositeDisposable;
    private a lifecycleTransformer;
    private g transformer;

    @Deprecated
    public final <T> a<T> getAutoUnbindTransformer() {
        return this.lifecycleTransformer;
    }

    public Context getContext() {
        return this.context;
    }

    public DataCenter getDataCenter() {
        return this.dataCenter;
    }

    public final <T> m<T> autoDispose() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15180, new Class[0], m.class)) {
            return e.a((LifecycleOwner) this);
        }
        return (m) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15180, new Class[0], m.class);
    }

    public final <T> m<T> autoDisposeWithTransformer() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15181, new Class[0], m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15181, new Class[0], m.class);
        }
        if (this.transformer == null) {
            this.transformer = new g();
        }
        return e.a((ae) com.bytedance.android.live.core.rxutils.autodispose.a.a(this, Lifecycle.Event.ON_DESTROY), (f<T>) this.transformer);
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15178, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15178, new Class[0], Void.TYPE);
            return;
        }
        if (this.compositeDisposable != null) {
            this.compositeDisposable.dispose();
        }
        this.compositeDisposable = new CompositeDisposable();
        this.lifecycleTransformer = new a(this.compositeDisposable);
        super.onCreate();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15179, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.compositeDisposable.dispose();
        this.subWidgetManager = null;
    }

    public void enableSubWidgetManager() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15177, new Class[0], Void.TYPE);
            return;
        }
        if (this.subWidgetManager == null) {
            this.subWidgetManager = RecyclableWidgetManager.of(this.widgetCallback.getFragment(), this.contentView);
            ((RecyclableWidgetManager) this.subWidgetManager).setWidgetProvider(an.a());
            this.subWidgetManager.setDataCenter(this.dataCenter);
        }
    }

    public final <T extends View> T findViewById(@IdRes int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 15182, new Class[]{Integer.TYPE}, View.class)) {
            return this.contentView.findViewById(i);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 15182, new Class[]{Integer.TYPE}, View.class);
    }
}
