package com.feiliao.oauth.sdk.flipchat.open.b;

import com.bytedance.retrofit2.Call;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"convertSingle", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "T", "Lcom/bytedance/retrofit2/Call;", "flipchat_open_sdk_release"}, k = 2, mv = {1, 1, 13})
public final class c {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "emitter", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteEmitter;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class a extends Lambda implements Function1<g<T>, Unit> {
        final /* synthetic */ Call $this_convertSingle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Call call) {
            super(1);
            this.$this_convertSingle = call;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull g<T> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "emitter");
            this.$this_convertSingle.enqueue(new b(gVar));
        }
    }

    @NotNull
    public static final <T> j<T> a(@NotNull Call<T> call) {
        Intrinsics.checkParameterIsNotNull(call, "receiver$0");
        return j.f24312a.a((Function1<? super g<R>, Unit>) new a<Object,Unit>(call));
    }
}
