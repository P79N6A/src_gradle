package com.ss.android.ugc.aweme.base.arch;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.f;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.r;
import com.bytedance.jedi.arch.x;
import com.bytedance.widget.ext.list.ItemWidget;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u0006B\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/JediBaseItemWidget;", "ITEM", "VH", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "Lcom/bytedance/widget/ext/list/ItemWidget;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "()V", "viewModelFactory", "getViewModelFactory", "()Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class JediBaseItemWidget<ITEM, VH extends ItemWidgetViewHolder<ITEM>> extends ItemWidget<ITEM, VH> implements ae<c>, h {
    public static ChangeQuickRedirect g;
    @NotNull
    public final c h = new c();

    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory r_() {
        return this.h;
    }

    @NotNull
    public final k a() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 24478, new Class[0], k.class)) {
            return h.a.a(this);
        }
        return (k) PatchProxy.accessDispatch(new Object[0], this, g, false, 24478, new Class[0], k.class);
    }

    @NotNull
    public final r<f> b() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 24481, new Class[0], r.class)) {
            return h.a.b(this);
        }
        return (r) PatchProxy.accessDispatch(new Object[0], this, g, false, 24481, new Class[0], r.class);
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 24482, new Class[0], Boolean.TYPE)) {
            return h.a.e(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 24482, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final LifecycleOwner d() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 24479, new Class[0], LifecycleOwner.class)) {
            return h.a.c(this);
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, g, false, 24479, new Class[0], LifecycleOwner.class);
    }

    public final /* synthetic */ d e() {
        f fVar;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 24480, new Class[0], f.class)) {
            fVar = (f) PatchProxy.accessDispatch(new Object[0], this, g, false, 24480, new Class[0], f.class);
        } else {
            fVar = h.a.d(this);
        }
        return fVar;
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        VM1 vm12 = vm1;
        Function1<? super S1, ? extends R> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{vm12, function12}, this, g, false, 24483, new Class[]{JediViewModel.class, Function1.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{vm12, function12}, this, g, false, 24483, new Class[]{JediViewModel.class, Function1.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function12, "block");
        return h.a.a(this, vm1, function1);
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends x, VM2 extends JediViewModel<S2>, S2 extends x, R> R a(@NotNull VM1 vm1, @NotNull VM2 vm2, @NotNull Function2<? super S1, ? super S2, ? extends R> function2) {
        VM1 vm12 = vm1;
        VM2 vm22 = vm2;
        Function2<? super S1, ? super S2, ? extends R> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{vm12, vm22, function22}, this, g, false, 24484, new Class[]{JediViewModel.class, JediViewModel.class, Function2.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{vm12, vm22, function22}, this, g, false, 24484, new Class[]{JediViewModel.class, JediViewModel.class, Function2.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
        Intrinsics.checkParameterIsNotNull(vm22, "viewModel2");
        Intrinsics.checkParameterIsNotNull(function22, "block");
        return h.a.a(this, vm1, vm2, function2);
    }

    @NotNull
    public final <S extends x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super f, ? super S, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        Function2<? super f, ? super S, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, g, false, 24499, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, this, g, false, 24499, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
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
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, g, false, 24494, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            Object[] objArr = {jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22};
            return (Disposable) PatchProxy.accessDispatch(objArr, this, g, false, 24494, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
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
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function2, function1, function22}, this, g, false, 24493, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22}, this, g, false, 24493, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2, function1, function22);
    }
}
