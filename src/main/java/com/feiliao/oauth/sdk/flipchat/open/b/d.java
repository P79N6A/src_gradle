package com.feiliao.oauth.sdk.flipchat.open.b;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B-\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteCustomObserver;", "C", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingleObserver;", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteDisposable;", "successBlock", "Lkotlin/Function1;", "", "errorBlock", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getErrorBlock", "()Lkotlin/jvm/functions/Function1;", "isDispose", "", "getSuccessBlock", "upDisposable", "dispose", "isDisposed", "onError", "t", "onSubscribe", "disposable", "onSuccess", "(Ljava/lang/Object;)V", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class d<C> implements f, l<C> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final Function1<C, Unit> f24301a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Function1<Throwable, Unit> f24302b;

    /* renamed from: c  reason: collision with root package name */
    private f f24303c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f24304d;

    public final void a() {
        this.f24304d = true;
        f fVar = this.f24303c;
        if (fVar != null) {
            fVar.a();
        }
    }

    public final void a(@NotNull f fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "disposable");
        this.f24303c = fVar;
    }

    public final void a(C c2) {
        if (!this.f24304d) {
            this.f24301a.invoke(c2);
        }
    }

    public final void a(@NotNull Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        if (!this.f24304d) {
            this.f24302b.invoke(th);
        }
    }

    public d(@NotNull Function1<? super C, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(function1, "successBlock");
        Intrinsics.checkParameterIsNotNull(function12, "errorBlock");
        this.f24301a = function1;
        this.f24302b = function12;
    }
}
