package com.feiliao.oauth.sdk.flipchat.open.b;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001\rB-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0010¢\u0006\u0002\b\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteFlatMapSingle;", "T", "R", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "sourceSubscribe", "transformFuc", "Lkotlin/Function1;", "(Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;Lkotlin/jvm/functions/Function1;)V", "realSubscribe", "", "observer", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingleObserver;", "realSubscribe$flipchat_open_sdk_release", "Observer", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class h<T, R> extends j<R> {

    /* renamed from: b  reason: collision with root package name */
    private final j<T> f24306b;

    /* renamed from: c  reason: collision with root package name */
    private final Function1<T, j<R>> f24307c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteFlatMapSingle$Observer;", "mT", "mR", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingleObserver;", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteDisposable;", "sourceObserver", "transform", "Lkotlin/Function1;", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "(Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingleObserver;Lkotlin/jvm/functions/Function1;)V", "isDispose", "", "getTransform", "()Lkotlin/jvm/functions/Function1;", "upDisposable", "dispose", "", "isDisposed", "onError", "t", "", "onSubscribe", "disposable", "onSuccess", "(Ljava/lang/Object;)V", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    public static final class a<mT, mR> implements f, l<mT> {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final Function1<mT, j<mR>> f24308a;

        /* renamed from: b  reason: collision with root package name */
        private f f24309b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f24310c;

        /* renamed from: d  reason: collision with root package name */
        private final l<mR> f24311d;

        public final void a() {
            this.f24310c = true;
            f fVar = this.f24309b;
            if (fVar != null) {
                fVar.a();
            }
        }

        public final void a(@NotNull f fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "disposable");
            this.f24309b = fVar;
            this.f24311d.a((f) this);
        }

        public final void a(mT mt) {
            try {
                if (!this.f24310c) {
                    ((j) this.f24308a.invoke(mt)).b(this.f24311d);
                }
            } catch (Throwable th) {
                this.f24311d.a(th);
            }
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "t");
            if (!this.f24310c) {
                this.f24311d.a(th);
            }
        }

        public a(@NotNull l<mR> lVar, @NotNull Function1<? super mT, ? extends j<mR>> function1) {
            Intrinsics.checkParameterIsNotNull(lVar, "sourceObserver");
            Intrinsics.checkParameterIsNotNull(function1, "transform");
            this.f24311d = lVar;
            this.f24308a = function1;
        }
    }

    public final void a(@NotNull l<R> lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "observer");
        this.f24306b.b(new a(lVar, this.f24307c));
    }

    public h(@NotNull j<T> jVar, @NotNull Function1<? super T, ? extends j<R>> function1) {
        Intrinsics.checkParameterIsNotNull(jVar, "sourceSubscribe");
        Intrinsics.checkParameterIsNotNull(function1, "transformFuc");
        this.f24306b = jVar;
        this.f24307c = function1;
    }
}
