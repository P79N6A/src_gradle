package com.bytedance.jedi.arch;

import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\n\u001a\u00020\u000bH&J\u001c\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u000eH&J!\u0010\u000f\u001a\u00020\u000b2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0002\b\u0011H&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/bytedance/jedi/arch/Store;", "S", "", "observable", "Lio/reactivex/Observable;", "getObservable", "()Lio/reactivex/Observable;", "state", "getState", "()Ljava/lang/Object;", "dispose", "", "get", "block", "Lkotlin/Function1;", "set", "stateReducer", "Lkotlin/ExtensionFunctionType;", "arch_release"}, k = 1, mv = {1, 1, 15})
public interface y<S> {
    @NotNull
    Observable<S> a();

    void a(@NotNull Function1<? super S, Unit> function1);

    S b();

    void b(@NotNull Function1<? super S, ? extends S> function1);

    void d();
}
