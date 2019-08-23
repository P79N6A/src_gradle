package com.ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.lifecycle.ViewModelStore;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34390a;

    @MainThread
    @NonNull
    public static ViewModelProvider a(@NonNull Fragment fragment) {
        if (!PatchProxy.isSupport(new Object[]{fragment}, null, f34390a, true, 23814, new Class[]{Fragment.class}, ViewModelProvider.class)) {
            return ViewModelProviders.of(fragment);
        }
        return (ViewModelProvider) PatchProxy.accessDispatch(new Object[]{fragment}, null, f34390a, true, 23814, new Class[]{Fragment.class}, ViewModelProvider.class);
    }

    @MainThread
    @NonNull
    public static ViewModelProvider a(@NonNull FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f34390a, true, 23815, new Class[]{FragmentActivity.class}, ViewModelProvider.class)) {
            return ViewModelProviders.of(fragmentActivity);
        }
        return (ViewModelProvider) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f34390a, true, 23815, new Class[]{FragmentActivity.class}, ViewModelProvider.class);
    }

    @MainThread
    @NonNull
    public static ViewModelProvider a(@NonNull Fragment fragment, @NonNull ViewModelStoreOwner viewModelStoreOwner) {
        Activity activity;
        Application application;
        ViewModelStore viewModelStore;
        if (PatchProxy.isSupport(new Object[]{fragment, viewModelStoreOwner}, null, f34390a, true, 23818, new Class[]{Fragment.class, ViewModelStoreOwner.class}, ViewModelProvider.class)) {
            return (ViewModelProvider) PatchProxy.accessDispatch(new Object[]{fragment, viewModelStoreOwner}, null, f34390a, true, 23818, new Class[]{Fragment.class, ViewModelStoreOwner.class}, ViewModelProvider.class);
        }
        if (PatchProxy.isSupport(new Object[]{fragment}, null, f34390a, true, 23813, new Class[]{Fragment.class}, Activity.class)) {
            activity = (Activity) PatchProxy.accessDispatch(new Object[]{fragment}, null, f34390a, true, 23813, new Class[]{Fragment.class}, Activity.class);
        } else {
            activity = fragment.getActivity();
            if (activity == null) {
                throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
            }
        }
        if (PatchProxy.isSupport(new Object[]{activity}, null, f34390a, true, 23812, new Class[]{Activity.class}, Application.class)) {
            application = (Application) PatchProxy.accessDispatch(new Object[]{activity}, null, f34390a, true, 23812, new Class[]{Activity.class}, Application.class);
        } else {
            application = activity.getApplication();
            if (application == null) {
                throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
            }
        }
        ViewModelProvider.AndroidViewModelFactory instance = ViewModelProvider.AndroidViewModelFactory.getInstance(application);
        if (PatchProxy.isSupport(new Object[]{viewModelStoreOwner}, null, d.f34391a, true, 23824, new Class[]{ViewModelStoreOwner.class}, ViewModelStore.class)) {
            viewModelStore = (ViewModelStore) PatchProxy.accessDispatch(new Object[]{viewModelStoreOwner}, null, d.f34391a, true, 23824, new Class[]{ViewModelStoreOwner.class}, ViewModelStore.class);
        } else {
            viewModelStore = viewModelStoreOwner.getViewModelStore();
        }
        return new ViewModelProvider(viewModelStore, (ViewModelProvider.Factory) instance);
    }
}
