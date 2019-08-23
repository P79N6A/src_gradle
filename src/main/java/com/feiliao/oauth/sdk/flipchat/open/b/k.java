package com.feiliao.oauth.sdk.flipchat.open.b;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000bB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0010¢\u0006\u0002\b\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingleCreate;", "T", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "onSubscriber", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteOnSubscriber;", "(Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteOnSubscriber;)V", "realSubscribe", "", "observer", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingleObserver;", "realSubscribe$flipchat_open_sdk_release", "Emitter", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class k<T> extends j<T> {

    /* renamed from: b  reason: collision with root package name */
    private final i<T> f24313b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingleCreate$Emitter;", "mT", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteEmitter;", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteDisposable;", "actual", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingleObserver;", "(Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingleObserver;)V", "isDispose", "", "sDisposable", "dispose", "", "isDisposed", "onError", "t", "", "onSuccess", "value", "(Ljava/lang/Object;)V", "setDisposable", "s", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    public static final class a<mT> implements f, g<mT> {

        /* renamed from: a  reason: collision with root package name */
        private f f24314a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f24315b;

        /* renamed from: c  reason: collision with root package name */
        private final l<mT> f24316c;

        public final void a() {
            this.f24315b = true;
            f fVar = this.f24314a;
            if (fVar != null) {
                fVar.a();
            }
        }

        public a(@NotNull l<mT> lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "actual");
            this.f24316c = lVar;
        }

        public final void a(mT mt) {
            if (!this.f24315b) {
                this.f24316c.a(mt);
            }
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "t");
            if (!this.f24315b) {
                this.f24316c.a(th);
            }
        }
    }

    public k(@NotNull i<T> iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "onSubscriber");
        this.f24313b = iVar;
    }

    public final void a(@NotNull l<T> lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "observer");
        a aVar = new a(lVar);
        lVar.a((f) aVar);
        try {
            this.f24313b.a(aVar);
        } catch (Throwable th) {
            lVar.a(th);
        }
    }
}
