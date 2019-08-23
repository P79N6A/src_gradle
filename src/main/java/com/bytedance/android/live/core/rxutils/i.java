package com.bytedance.android.live.core.rxutils;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.android.live.core.rxutils.rxlifecycle.BindingFragment;
import com.bytedance.android.live.core.rxutils.rxlifecycle.a;
import com.bytedance.android.live.core.rxutils.rxlifecycle.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.internal.util.ExceptionHelper;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8106a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f8107b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Consumer<Throwable> f8108c = j.f8111b;

    /* renamed from: d  reason: collision with root package name */
    private static Consumer<Object> f8109d = k.f8113b;

    public static Consumer<Throwable> b() {
        return f8108c;
    }

    public static Consumer<Object> c() {
        return f8109d;
    }

    public static <T> g<T> a() {
        if (PatchProxy.isSupport(new Object[0], null, f8106a, true, 631, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], null, f8106a, true, 631, new Class[0], g.class);
        }
        return new g<>();
    }

    public static <T> ObservableTransformer<T, T> a(Fragment fragment) {
        b bVar;
        if (PatchProxy.isSupport(new Object[]{fragment}, null, f8106a, true, 635, new Class[]{Fragment.class}, ObservableTransformer.class)) {
            return (ObservableTransformer) PatchProxy.accessDispatch(new Object[]{fragment}, null, f8106a, true, 635, new Class[]{Fragment.class}, ObservableTransformer.class);
        }
        a aVar = a.DESTROY;
        if (PatchProxy.isSupport(new Object[]{fragment, aVar}, null, f8106a, true, 638, new Class[]{Fragment.class, a.class}, ObservableTransformer.class)) {
            return (ObservableTransformer) PatchProxy.accessDispatch(new Object[]{fragment, aVar}, null, f8106a, true, 638, new Class[]{Fragment.class, a.class}, ObservableTransformer.class);
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        if (PatchProxy.isSupport(new Object[]{childFragmentManager}, null, b.f8122a, true, 853, new Class[]{FragmentManager.class}, b.class)) {
            bVar = (b) PatchProxy.accessDispatch(new Object[]{childFragmentManager}, null, b.f8122a, true, 853, new Class[]{FragmentManager.class}, b.class);
        } else {
            BindingFragment bindingFragment = (BindingFragment) childFragmentManager.findFragmentByTag("_LIFECYCLE_BINDING_FRAGMENT_");
            if (bindingFragment == null) {
                bindingFragment = new BindingFragment();
                FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                beginTransaction.add((Fragment) bindingFragment, "_LIFECYCLE_BINDING_FRAGMENT_");
                beginTransaction.commitAllowingStateLoss();
            } else if (bindingFragment.isDetached()) {
                FragmentTransaction beginTransaction2 = childFragmentManager.beginTransaction();
                beginTransaction2.attach(bindingFragment);
                beginTransaction2.commitAllowingStateLoss();
            }
            bVar = b.a((Observable<T>) bindingFragment.f8115b);
        }
        return bVar.a(aVar);
    }

    @NonNull
    public static <T, R> R a(@NonNull Function<T, R> function, @NonNull T t) {
        if (PatchProxy.isSupport(new Object[]{function, t}, null, f8106a, true, 639, new Class[]{Function.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{function, t}, null, f8106a, true, 639, new Class[]{Function.class, Object.class}, Object.class);
        }
        try {
            return function.apply(t);
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @NonNull
    public static <T, U, R> R a(@NonNull BiFunction<T, U, R> biFunction, @NonNull T t, @NonNull U u) {
        if (PatchProxy.isSupport(new Object[]{biFunction, t, u}, null, f8106a, true, 640, new Class[]{BiFunction.class, Object.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{biFunction, t, u}, null, f8106a, true, 640, new Class[]{BiFunction.class, Object.class, Object.class}, Object.class);
        }
        try {
            return biFunction.apply(t, u);
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @NonNull
    public static <T1, T2, T3, R> R a(@NonNull Function3<T1, T2, T3, R> function3, @NonNull T1 t1, @NonNull T2 t2, @NonNull T3 t3) {
        if (PatchProxy.isSupport(new Object[]{function3, t1, t2, t3}, null, f8106a, true, 641, new Class[]{Function3.class, Object.class, Object.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{function3, t1, t2, t3}, null, f8106a, true, 641, new Class[]{Function3.class, Object.class, Object.class, Object.class}, Object.class);
        }
        try {
            return function3.apply(t1, t2, t3);
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @NonNull
    public static <T1, T2, T3, T4, R> R a(@NonNull Function4<T1, T2, T3, T4, R> function4, @NonNull T1 t1, @NonNull T2 t2, @NonNull T3 t3, @NonNull T4 t4) {
        if (PatchProxy.isSupport(new Object[]{function4, t1, t2, t3, t4}, null, f8106a, true, 642, new Class[]{Function4.class, Object.class, Object.class, Object.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{function4, t1, t2, t3, t4}, null, f8106a, true, 642, new Class[]{Function4.class, Object.class, Object.class, Object.class, Object.class}, Object.class);
        }
        try {
            return function4.apply(t1, t2, t3, t4);
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }
}
