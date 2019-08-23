package com.feiliao.oauth.sdk.flipchat.open.b;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b \u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0003J,\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0000\"\u0004\b\u0001\u0010\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00000\u0007J\u001b\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH ¢\u0006\u0002\b\fJ.\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0007J\u0014\u0010\r\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¨\u0006\u0013"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "T", "", "()V", "flatMap", "R", "trans", "Lkotlin/Function1;", "realSubscribe", "", "observer", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingleObserver;", "realSubscribe$flipchat_open_sdk_release", "subscribe", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteDisposable;", "suc", "err", "", "Companion", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public abstract class j<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24312a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052'\u0010\u0006\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00050\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle$Companion;", "", "()V", "create", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "R", "onSubscriber", "Lkotlin/Function1;", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteEmitter;", "Lkotlin/ParameterName;", "name", "emitter", "", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteOnSubscriber;", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        private static <R> j<R> a(@NotNull i<R> iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "onSubscriber");
            return new k<>(iVar);
        }

        @JvmStatic
        @NotNull
        public final <R> j<R> a(@NotNull Function1<? super g<R>, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onSubscriber");
            return a((i<R>) new e<R>(function1));
        }
    }

    public abstract void a(@NotNull l<T> lVar);

    @NotNull
    public final <R> j<R> a(@NotNull Function1<? super T, ? extends j<R>> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "trans");
        return new h<>(this, function1);
    }

    public final void b(@NotNull l<T> lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "observer");
        try {
            a(lVar);
        } catch (Exception e2) {
            lVar.a((Throwable) e2);
        }
    }

    @NotNull
    public final f a(@NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(function1, "suc");
        Intrinsics.checkParameterIsNotNull(function12, "err");
        d dVar = new d(function1, function12);
        b(dVar);
        return dVar;
    }
}
