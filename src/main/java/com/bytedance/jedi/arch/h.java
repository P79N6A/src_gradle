package com.bytedance.jedi.arch;

import android.arch.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.e;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "arch_release"}, k = 1, mv = {1, 1, 15})
public interface h extends f {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class a {
        @NotNull
        public static f d(h hVar) {
            return hVar;
        }

        public static boolean e(h hVar) {
            f fVar = hVar;
            return true;
        }

        @NotNull
        public static k a(h hVar) {
            return hVar;
        }

        @NotNull
        public static r<f> b(h hVar) {
            return hVar;
        }

        @NotNull
        public static LifecycleOwner c(h hVar) {
            return hVar;
        }

        public static <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(h hVar, @NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
            Intrinsics.checkParameterIsNotNull(vm1, "viewModel1");
            Intrinsics.checkParameterIsNotNull(function1, "block");
            f fVar = hVar;
            Intrinsics.checkParameterIsNotNull(vm1, "viewModel1");
            Intrinsics.checkParameterIsNotNull(function1, "block");
            return e.a.a(vm1, function1);
        }

        public static <VM1 extends JediViewModel<S1>, S1 extends x, VM2 extends JediViewModel<S2>, S2 extends x, R> R a(h hVar, @NotNull VM1 vm1, @NotNull VM2 vm2, @NotNull Function2<? super S1, ? super S2, ? extends R> function2) {
            Intrinsics.checkParameterIsNotNull(vm1, "viewModel1");
            Intrinsics.checkParameterIsNotNull(vm2, "viewModel2");
            Intrinsics.checkParameterIsNotNull(function2, "block");
            f fVar = hVar;
            Intrinsics.checkParameterIsNotNull(vm1, "viewModel1");
            Intrinsics.checkParameterIsNotNull(vm2, "viewModel2");
            Intrinsics.checkParameterIsNotNull(function2, "block");
            Intrinsics.checkParameterIsNotNull(vm1, "viewModel1");
            Intrinsics.checkParameterIsNotNull(vm2, "viewModel2");
            Intrinsics.checkParameterIsNotNull(function2, "block");
            return function2.invoke(vm1.b(), vm2.b());
        }

        @NotNull
        public static <S extends x> Disposable a(h hVar, @NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super f, ? super S, Unit> function2) {
            Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$subscribe");
            Intrinsics.checkParameterIsNotNull(function2, "subscriber");
            Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$subscribe");
            Intrinsics.checkParameterIsNotNull(function2, "subscriber");
            return e.a.a(hVar, jediViewModel, z, z2, function2);
        }

        @NotNull
        public static <S extends x, A> Disposable a(h hVar, @NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function2<? super f, ? super A, Unit> function2) {
            Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
            Intrinsics.checkParameterIsNotNull(function2, "subscriber");
            Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
            Intrinsics.checkParameterIsNotNull(function2, "subscriber");
            return e.a.a(hVar, jediViewModel, kProperty1, z, z2, function2);
        }

        @NotNull
        public static <S extends x, T> Disposable a(h hVar, @NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function2<? super f, ? super Throwable, Unit> function2, @Nullable Function1<? super f, Unit> function1, @Nullable Function2<? super f, ? super T, Unit> function22) {
            Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$asyncSubscribe");
            Intrinsics.checkParameterIsNotNull(kProperty1, "prop");
            Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$asyncSubscribe");
            Intrinsics.checkParameterIsNotNull(kProperty1, "prop");
            return e.a.a((e<? extends RECEIVER>) hVar, jediViewModel, kProperty1, z, z2, function2, function1, function22);
        }
    }
}
