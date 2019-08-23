package com.feiliao.oauth.sdk.flipchat.open.b;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/rx/EmitterDispatchCallback;", "T", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/DispatchCallback;", "emitter", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteEmitter;", "(Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteEmitter;)V", "onError", "", "t", "", "onSuccess", "response", "(Ljava/lang/Object;)V", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class b<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final g<T> f24300a;

    public final void a(T t) {
        this.f24300a.a(t);
    }

    public b(@NotNull g<T> gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "emitter");
        this.f24300a = gVar;
    }

    public final void a(@NotNull Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        this.f24300a.a(th);
    }
}
