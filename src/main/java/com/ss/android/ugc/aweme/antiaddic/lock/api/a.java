package com.ss.android.ugc.aweme.antiaddic.lock.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"await", "T", "Lcom/bytedance/retrofit2/Call;", "(Lcom/bytedance/retrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/common/util/concurrent/ListenableFuture;", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33430a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/antiaddic/lock/api/FutureExtentionKt$await$2$1", "Lcom/google/common/util/concurrent/FutureCallback;", "onFailure", "", "t", "", "onSuccess", "result", "(Ljava/lang/Object;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.a$a  reason: collision with other inner class name */
    public static final class C0428a implements k<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33431a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f33432b;

        C0428a(c cVar) {
            this.f33432b = cVar;
        }

        public final void onFailure(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f33431a, false, 21836, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f33431a, false, 21836, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "t");
            this.f33432b.resumeWith(l.m673constructorimpl(m.a(th)));
        }

        public final void onSuccess(@Nullable T t) {
            if (PatchProxy.isSupport(new Object[]{t}, this, f33431a, false, 21835, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{t}, this, f33431a, false, 21835, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            if (t != null) {
                this.f33432b.resumeWith(l.m673constructorimpl(t));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/antiaddic/lock/api/FutureExtentionKt$await$4$1", "Lcom/bytedance/retrofit2/Callback;", "onFailure", "", "call", "Lcom/bytedance/retrofit2/Call;", "t", "", "onResponse", "response", "Lcom/bytedance/retrofit2/SsResponse;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.bytedance.retrofit2.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f33434b;

        public b(c cVar) {
            this.f33434b = cVar;
        }

        public final void a(@NotNull Call<T> call, @NotNull SsResponse<T> ssResponse) {
            if (PatchProxy.isSupport(new Object[]{call, ssResponse}, this, f33433a, false, 21838, new Class[]{Call.class, SsResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{call, ssResponse}, this, f33433a, false, 21838, new Class[]{Call.class, SsResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(ssResponse, "response");
            if (!ssResponse.isSuccessful() || ssResponse.body() == null) {
                this.f33434b.resumeWith(l.m673constructorimpl(m.a(new RuntimeException("response is null"))));
            } else {
                this.f33434b.resumeWith(l.m673constructorimpl(ssResponse.body()));
            }
        }

        public final void a(@NotNull Call<T> call, @NotNull Throwable th) {
            Call<T> call2 = call;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{call2, th2}, this, f33433a, false, 21837, new Class[]{Call.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{call2, th2}, this, f33433a, false, 21837, new Class[]{Call.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(call2, "call");
            Intrinsics.checkParameterIsNotNull(th2, "t");
            this.f33434b.resumeWith(l.m673constructorimpl(m.a(th)));
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull q<T> qVar, @NotNull c<? super T> cVar) {
        q<T> qVar2 = qVar;
        if (PatchProxy.isSupport(new Object[]{qVar2, cVar}, null, f33430a, true, 21833, new Class[]{q.class, c.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{qVar2, cVar}, null, f33430a, true, 21833, new Class[]{q.class, c.class}, Object.class);
        }
        g gVar = new g(kotlin.coroutines.a.b.a(cVar));
        com.google.common.util.concurrent.l.a(qVar2, new C0428a(gVar));
        Object a2 = gVar.a();
        if (a2 == kotlin.coroutines.a.b.a()) {
            kotlin.coroutines.jvm.internal.g.b(cVar);
        }
        return a2;
    }
}
