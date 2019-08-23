package com.ss.android.ugc.aweme.detail.operators;

import android.arch.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.f;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.r;
import com.bytedance.jedi.arch.x;
import com.bytedance.widget.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/operators/JediWidget;", "Lcom/bytedance/widget/Widget;", "Lcom/bytedance/jedi/arch/JediView;", "()V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class JediWidget extends Widget implements h {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f41198f;

    @NotNull
    public final k a() {
        if (!PatchProxy.isSupport(new Object[0], this, f41198f, false, 34859, new Class[0], k.class)) {
            return h.a.a(this);
        }
        return (k) PatchProxy.accessDispatch(new Object[0], this, f41198f, false, 34859, new Class[0], k.class);
    }

    @NotNull
    public final r<f> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f41198f, false, 34862, new Class[0], r.class)) {
            return h.a.b(this);
        }
        return (r) PatchProxy.accessDispatch(new Object[0], this, f41198f, false, 34862, new Class[0], r.class);
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f41198f, false, 34863, new Class[0], Boolean.TYPE)) {
            return h.a.e(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41198f, false, 34863, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final LifecycleOwner d() {
        if (!PatchProxy.isSupport(new Object[0], this, f41198f, false, 34860, new Class[0], LifecycleOwner.class)) {
            return h.a.c(this);
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, f41198f, false, 34860, new Class[0], LifecycleOwner.class);
    }

    public final /* synthetic */ d e() {
        f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f41198f, false, 34861, new Class[0], f.class)) {
            fVar = (f) PatchProxy.accessDispatch(new Object[0], this, f41198f, false, 34861, new Class[0], f.class);
        } else {
            fVar = h.a.d(this);
        }
        return fVar;
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        VM1 vm12 = vm1;
        Function1<? super S1, ? extends R> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{vm12, function12}, this, f41198f, false, 34864, new Class[]{JediViewModel.class, Function1.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{vm12, function12}, this, f41198f, false, 34864, new Class[]{JediViewModel.class, Function1.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function12, "block");
        return h.a.a(this, vm1, function1);
    }

    @NotNull
    public final <S extends x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super f, ? super S, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        Function2<? super f, ? super S, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f41198f, false, 34880, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, this, f41198f, false, 34880, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return h.a.a(this, jediViewModel, z, z2, function2);
    }

    @NotNull
    public final <S extends x, A> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function2<? super f, ? super A, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends A> kProperty12 = kProperty1;
        Function2<? super f, ? super A, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f41198f, false, 34875, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            Object[] objArr = {jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22};
            return (Disposable) PatchProxy.accessDispatch(objArr, this, f41198f, false, 34875, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop1");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2);
    }

    @NotNull
    public final <S extends x, T> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function2<? super f, ? super Throwable, Unit> function2, @Nullable Function1<? super f, Unit> function1, @Nullable Function2<? super f, ? super T, Unit> function22) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends a<? extends T>> kProperty12 = kProperty1;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function2, function1, function22}, this, f41198f, false, 34874, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22}, this, f41198f, false, 34874, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2, function1, function22);
    }
}
