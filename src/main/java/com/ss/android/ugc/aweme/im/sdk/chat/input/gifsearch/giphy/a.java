package com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J6\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/input/gifsearch/giphy/GiphyGifApiManager;", "", "()V", "sImAPi", "Lcom/ss/android/ugc/aweme/im/sdk/chat/input/gifsearch/giphy/GiphyGifApi;", "getSearchingGiphy", "", "offset", "", "queryKey", "", "giphyGifCallback", "Lcom/ss/android/ugc/aweme/im/sdk/chat/input/gifsearch/callback/GifCallback;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/input/gifsearch/giphy/model/GiphyGifsResponse;", "getTrendingGiphy", "onTaskResultCall", "task", "Lbolts/Task;", "isTrending", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50607a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f50608b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static GiphyGifApi f50609c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/input/gifsearch/giphy/model/GiphyGifsResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a$a  reason: collision with other inner class name */
    static final class C0597a<TTaskResult, TContinuationResult> implements g<c, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50611b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a f50612c;

        C0597a(int i, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a aVar) {
            this.f50611b = i;
            this.f50612c = aVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f50610a, false, 50896, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f50610a, false, 50896, new Class[]{i.class}, Void.class);
            }
            a.f50608b.a(this.f50611b, this.f50612c, iVar, false);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/input/gifsearch/giphy/model/GiphyGifsResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class b<TTaskResult, TContinuationResult> implements g<c, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50614a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50615b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a f50616c;

        b(int i, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a aVar) {
            this.f50615b = i;
            this.f50616c = aVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f50614a, false, 50897, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f50614a, false, 50897, new Class[]{i.class}, Void.class);
            }
            a.f50608b.a(this.f50615b, this.f50616c, iVar, true);
            return null;
        }
    }

    private a() {
    }

    static {
        GiphyGifApi giphyGifApi;
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        if (iRetrofitService != null) {
            IRetrofit createNewRetrofit = iRetrofitService.createNewRetrofit(com.ss.android.ugc.aweme.im.sdk.utils.g.f52586b);
            if (createNewRetrofit != null) {
                giphyGifApi = (GiphyGifApi) createNewRetrofit.create(GiphyGifApi.class);
                f50609c = giphyGifApi;
            }
        }
        giphyGifApi = null;
        f50609c = giphyGifApi;
    }

    @JvmStatic
    public static final void a(int i, @NotNull com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a<c> aVar) {
        int i2 = i;
        com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a<c> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar2}, null, f50607a, true, 50893, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar2}, null, f50607a, true, 50893, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "giphyGifCallback");
        GiphyGifApi giphyGifApi = f50609c;
        if (giphyGifApi != null) {
            i trendingGiphy = giphyGifApi.getTrendingGiphy(i2);
            if (trendingGiphy != null) {
                trendingGiphy.a((g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(i2, aVar2), i.f1052b);
            }
        }
    }

    @JvmStatic
    public static final void a(int i, @NotNull String str, @NotNull com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a<c> aVar) {
        int i2 = i;
        String str2 = str;
        com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a<c> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, aVar2}, null, f50607a, true, 50894, new Class[]{Integer.TYPE, String.class, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, aVar2}, null, f50607a, true, 50894, new Class[]{Integer.TYPE, String.class, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "queryKey");
        Intrinsics.checkParameterIsNotNull(aVar2, "giphyGifCallback");
        GiphyGifApi giphyGifApi = f50609c;
        if (giphyGifApi != null) {
            i searchingGiphy = giphyGifApi.getSearchingGiphy(i2, str2);
            if (searchingGiphy != null) {
                searchingGiphy.a((g<TResult, TContinuationResult>) new C0597a<TResult,TContinuationResult>(i2, aVar2), i.f1052b);
            }
        }
    }

    public final void a(int i, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a<c> aVar, i<c> iVar, boolean z) {
        com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a<c> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar2, iVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f50607a, false, 50895, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a.class, i.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar2, iVar, Byte.valueOf(z)}, this, f50607a, false, 50895, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a.class, i.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (iVar == null || !iVar.b() || iVar.e() == null) {
            if (iVar == null || iVar.d() || iVar.e() == null) {
                aVar.a();
            }
        } else if (i > 0) {
            Object e2 = iVar.e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "task.result");
            aVar2.a(e2);
        } else if (z) {
            Object e3 = iVar.e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "task.result");
            aVar2.c(e3);
        } else {
            Object e4 = iVar.e();
            Intrinsics.checkExpressionValueIsNotNull(e4, "task.result");
            aVar2.b(e4);
        }
    }
}
