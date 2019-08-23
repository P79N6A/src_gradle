package com.ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelStore;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class Widget implements LifecycleObserver, ViewModelStoreOwner {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f2707c;

    /* renamed from: a  reason: collision with root package name */
    private ViewModelStore f2708a;

    /* renamed from: d  reason: collision with root package name */
    public Context f2709d;

    /* renamed from: e  reason: collision with root package name */
    protected View f2710e;

    /* renamed from: f  reason: collision with root package name */
    public View f2711f;
    public DataCenter g;
    public a h;
    public boolean i;
    boolean j;

    protected interface a {
        LifecycleOwner a();

        void a(Intent intent, int i);

        Activity b();

        WidgetManager c();
    }

    public void a(int i2, int i3, Intent intent) {
    }

    public void a(View view) {
    }

    @LayoutRes
    public int b() {
        return 0;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    public LifecycleOwner a() {
        if (!PatchProxy.isSupport(new Object[0], this, f2707c, false, 23836, new Class[0], LifecycleOwner.class)) {
            return this.h.a();
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, f2707c, false, 23836, new Class[0], LifecycleOwner.class);
    }

    public final Activity c() {
        if (!PatchProxy.isSupport(new Object[0], this, f2707c, false, 23830, new Class[0], Activity.class)) {
            return this.h.b();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f2707c, false, 23830, new Class[0], Activity.class);
    }

    public final WidgetManager d() {
        if (!PatchProxy.isSupport(new Object[0], this, f2707c, false, 23837, new Class[0], WidgetManager.class)) {
            return this.h.c();
        }
        return (WidgetManager) PatchProxy.accessDispatch(new Object[0], this, f2707c, false, 23837, new Class[0], WidgetManager.class);
    }

    @NonNull
    public ViewModelStore getViewModelStore() {
        if (PatchProxy.isSupport(new Object[0], this, f2707c, false, 23838, new Class[0], ViewModelStore.class)) {
            return (ViewModelStore) PatchProxy.accessDispatch(new Object[0], this, f2707c, false, 23838, new Class[0], ViewModelStore.class);
        }
        if (this.f2708a == null) {
            this.f2708a = new ViewModelStore();
        }
        return this.f2708a;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    @CallSuper
    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f2707c, false, 23825, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2707c, false, 23825, new Class[0], Void.TYPE);
            return;
        }
        this.i = true;
        this.j = false;
        a(this.f2711f);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    @CallSuper
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2707c, false, 23826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2707c, false, 23826, new Class[0], Void.TYPE);
            return;
        }
        this.i = false;
        this.j = true;
        if (this.f2708a != null) {
            this.f2708a.clear();
        }
    }

    public final void a(Intent intent, int i2) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2, Integer.valueOf(i2)}, this, f2707c, false, 23829, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, Integer.valueOf(i2)}, this, f2707c, false, 23829, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h.a(intent2, i2);
    }
}
