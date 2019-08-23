package com.ss.android.ugc.aweme.filter.a;

import a.i;
import com.bytedance.apm.k.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b.a;
import com.ss.android.ugc.aweme.effect.c.b.e;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.v;
import com.ss.android.ugc.aweme.filter.w;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0014\u001a\u00020\n2\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016H\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/downloader/FilterOnDownloadListener;", "Lcom/ss/android/ugc/aweme/common/http/DownloadManager$OnDownloadListener;", "task", "Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTask;", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "Ljava/lang/Void;", "callback", "Lcom/ss/android/ugc/aweme/effect/persistence/callback/ISerialTaskExecCallback;", "(Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTask;Lcom/ss/android/ugc/aweme/effect/persistence/callback/ISerialTaskExecCallback;)V", "onDownloadFailed", "", "url", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onDownloadProgress", "percent", "", "onDownloadSuccess", "runOnUiThread", "block", "Lkotlin/Function0;", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements a.C0521a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47461a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.effect.c.b.b<h, Void> f47462b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.effect.c.a.b<h, Void> f47463c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44450, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44450, new Class[0], Void.TYPE);
                return;
            }
            w.c((h) this.this$0.f47462b.f43733f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/ss/android/ugc/aweme/filter/downloader/FilterOnDownloadListener$runOnUiThread$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b<V> implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f47465b;

        b(Function0 function0) {
            this.f47465b = function0;
        }

        @Nullable
        public final Object call() {
            if (!PatchProxy.isSupport(new Object[0], this, f47464a, false, 44451, new Class[0], Object.class)) {
                return this.f47465b.invoke();
            }
            return PatchProxy.accessDispatch(new Object[0], this, f47464a, false, 44451, new Class[0], Object.class);
        }
    }

    public final void a(@Nullable String str, int i) {
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f47461a, false, 44448, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f47461a, false, 44448, new Class[]{String.class}, Void.TYPE);
            return;
        }
        v.a().b((h) this.f47462b.f43733f);
        if (!this.f47462b.f43730c) {
            Function0 aVar = new a(this);
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f47461a, false, 44449, new Class[]{Function0.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f47461a, false, 44449, new Class[]{Function0.class}, Void.TYPE);
            } else if (q.a()) {
                aVar.invoke();
            } else {
                i.a((Callable<TResult>) new b<TResult>(aVar), i.f1052b);
            }
        }
        this.f47462b.a(3);
        this.f47462b.f43731d = null;
        this.f47463c.b(this.f47462b);
        n.a("filter_download_error_rate", 0, (JSONObject) null);
    }

    public c(@NotNull com.ss.android.ugc.aweme.effect.c.b.b<h, Void> bVar, @NotNull com.ss.android.ugc.aweme.effect.c.a.b<h, Void> bVar2) {
        Intrinsics.checkParameterIsNotNull(bVar, "task");
        Intrinsics.checkParameterIsNotNull(bVar2, "callback");
        this.f47462b = bVar;
        this.f47463c = bVar2;
    }

    public final void a(@Nullable String str, @Nullable Exception exc) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str, exc}, this, f47461a, false, 44447, new Class[]{String.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, exc}, this, f47461a, false, 44447, new Class[]{String.class, Exception.class}, Void.TYPE);
            return;
        }
        this.f47462b.a(4);
        com.ss.android.ugc.aweme.effect.c.b.b<h, Void> bVar = this.f47462b;
        String str3 = null;
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = null;
        }
        bVar.f43732e = new e(-1, str2, exc);
        this.f47463c.c(this.f47462b);
        com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
        if (exc != null) {
            str3 = exc.getMessage();
        }
        n.a("filter_download_error_rate", 1, a2.a("exception", str3).a(PushConstants.WEB_URL, str).a("filter_id", Integer.valueOf(((h) this.f47462b.f43733f).f47598b)).b());
    }
}
