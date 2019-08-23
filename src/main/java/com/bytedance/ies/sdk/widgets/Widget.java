package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class Widget implements LifecycleObserver, LifecycleOwner {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ViewGroup containerView;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public boolean isDestroyed;
    public boolean isViewValid;
    public LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    public WidgetManager subWidgetManager;
    public WidgetCallback widgetCallback;

    public interface WidgetCallback {
        Fragment getFragment();

        <T extends ViewModel> T getViewModel(Class<T> cls);

        <T extends ViewModel> T getViewModel(Class<T> cls, @NonNull ViewModelProvider.Factory factory);

        void startActivity(Intent intent);

        void startActivity(Intent intent, @Nullable Bundle bundle);

        void startActivityForResult(Intent intent, int i);

        void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle);
    }

    @LayoutRes
    public int getLayoutId() {
        return 0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public boolean isViewValid() {
        return this.isViewValid;
    }

    public void enableSubWidgetManager() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15209, new Class[0], Void.TYPE);
            return;
        }
        if (this.subWidgetManager == null) {
            this.subWidgetManager = WidgetManager.of(this.widgetCallback.getFragment(), this.contentView);
            this.subWidgetManager.setDataCenter(this.dataCenter);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    @CallSuper
    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15203, new Class[0], Void.TYPE);
            return;
        }
        this.isViewValid = true;
        this.isDestroyed = false;
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    @CallSuper
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15206, new Class[0], Void.TYPE);
            return;
        }
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    @CallSuper
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15205, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15205, new Class[0], Void.TYPE);
            return;
        }
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    @CallSuper
    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15204, new Class[0], Void.TYPE);
            return;
        }
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    @CallSuper
    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15207, new Class[0], Void.TYPE);
            return;
        }
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    @CallSuper
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15208, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15208, new Class[0], Void.TYPE);
            return;
        }
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        if (this.subWidgetManager != null) {
            this.widgetCallback.getFragment().getChildFragmentManager().beginTransaction().remove(this.subWidgetManager).commitNowAllowingStateLoss();
        }
        this.isDestroyed = true;
        this.isViewValid = false;
    }

    public void setWidgetCallback(WidgetCallback widgetCallback2) {
        this.widgetCallback = widgetCallback2;
    }

    public <T extends ViewModel> T getViewModel(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, this, changeQuickRedirect, false, 15214, new Class[]{Class.class}, ViewModel.class)) {
            return this.widgetCallback.getViewModel(cls2);
        }
        return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, changeQuickRedirect, false, 15214, new Class[]{Class.class}, ViewModel.class);
    }

    public void startActivity(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, changeQuickRedirect, false, 15210, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, changeQuickRedirect, false, 15210, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        this.widgetCallback.startActivity(intent2);
    }

    public <T extends ViewModel> T getViewModel(Class<T> cls, @NonNull ViewModelProvider.Factory factory) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2, factory}, this, changeQuickRedirect, false, 15215, new Class[]{Class.class, ViewModelProvider.Factory.class}, ViewModel.class)) {
            return this.widgetCallback.getViewModel(cls2);
        }
        return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2, factory}, this, changeQuickRedirect, false, 15215, new Class[]{Class.class, ViewModelProvider.Factory.class}, ViewModel.class);
    }

    public void startActivity(Intent intent, @Nullable Bundle bundle) {
        Intent intent2 = intent;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{intent2, bundle2}, this, changeQuickRedirect, false, 15211, new Class[]{Intent.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, bundle2}, this, changeQuickRedirect, false, 15211, new Class[]{Intent.class, Bundle.class}, Void.TYPE);
            return;
        }
        this.widgetCallback.startActivity(intent2, bundle2);
    }

    public void startActivityForResult(Intent intent, int i) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 15212, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 15212, new Class[]{Intent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.widgetCallback.startActivityForResult(intent2, i);
    }

    public void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
        Intent intent2 = intent;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{intent2, Integer.valueOf(i), bundle2}, this, changeQuickRedirect, false, 15213, new Class[]{Intent.class, Integer.TYPE, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, Integer.valueOf(i), bundle2}, this, changeQuickRedirect, false, 15213, new Class[]{Intent.class, Integer.TYPE, Bundle.class}, Void.TYPE);
            return;
        }
        this.widgetCallback.startActivityForResult(intent2, i, bundle2);
    }
}
