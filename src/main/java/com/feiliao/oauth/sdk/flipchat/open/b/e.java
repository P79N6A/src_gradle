package com.feiliao.oauth.sdk.flipchat.open.b;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016R#\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteCustomOnSubscriber;", "T", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteOnSubscriber;", "block", "Lkotlin/Function1;", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteEmitter;", "", "(Lkotlin/jvm/functions/Function1;)V", "getBlock", "()Lkotlin/jvm/functions/Function1;", "subscribe", "emitter", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class e<T> implements i<T> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final Function1<g<T>, Unit> f24305a;

    public e(@NotNull Function1<? super g<T>, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        this.f24305a = function1;
    }

    public final void a(@NotNull g<T> gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "emitter");
        this.f24305a.invoke(gVar);
    }
}
