package com.bytedance.jedi.arch;

import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J!\u0010\u0012\u001a\u00020\u000e2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0002\b\u0014H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/bytedance/jedi/arch/StoreOwner;", "S", "", "Lcom/bytedance/jedi/arch/Store;", "realStore", "(Lcom/bytedance/jedi/arch/Store;)V", "observable", "Lio/reactivex/Observable;", "getObservable", "()Lio/reactivex/Observable;", "state", "getState", "()Ljava/lang/Object;", "dispose", "", "get", "block", "Lkotlin/Function1;", "set", "stateReducer", "Lkotlin/ExtensionFunctionType;", "arch_release"}, k = 1, mv = {1, 1, 15})
public final class z<S> implements y<S> {

    /* renamed from: a  reason: collision with root package name */
    private final y<S> f21430a;

    @NotNull
    public final Observable<S> a() {
        return this.f21430a.a();
    }

    @NotNull
    public final S b() {
        return this.f21430a.b();
    }

    public final void d() {
        this.f21430a.d();
    }

    public z(@NotNull y<S> yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "realStore");
        this.f21430a = yVar;
    }

    public final void a(@NotNull Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        this.f21430a.a(function1);
    }

    public final void b(@NotNull Function1<? super S, ? extends S> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "stateReducer");
        this.f21430a.b(function1);
    }
}
