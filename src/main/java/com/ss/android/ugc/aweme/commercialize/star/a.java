package com.ss.android.ugc.aweme.commercialize.star;

import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u00020\n8FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/star/StarAtlasManager;", "", "()V", "commerceVideoDesc", "", "getCommerceVideoDesc", "()Ljava/lang/String;", "setCommerceVideoDesc", "(Ljava/lang/String;)V", "hasStarAtlasOrder", "", "isShowStarAtlasOrderItem", "()Z", "setShowStarAtlasOrderItem", "(Z)V", "starAtlasHashTag", "getStarAtlasHashTag", "setStarAtlasHashTag", "starAtlasOrderWebUrl", "getStarAtlasOrderWebUrl", "setStarAtlasOrderWebUrl", "starAtlasToast", "getStarAtlasToast", "setStarAtlasToast", "checkIsHasStarAtlasOrder", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "checkStarAtlasOrder", "", "iCheckOrder", "Lcom/ss/android/ugc/aweme/commercialize/star/StarAtlasManager$ICheckOrder;", "ICheckOrder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39478a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    static String f39479b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    static String f39480c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    static String f39481d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    static String f39482e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f39483f = new a();
    /* access modifiers changed from: private */
    public static boolean g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/star/StarAtlasManager$ICheckOrder;", "", "hasOrder", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.a$a  reason: collision with other inner class name */
    public interface C0513a {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commercialize/star/StarAtlasManager$checkStarAtlasOrder$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/ss/android/ugc/aweme/commercialize/star/StarAtlasOrderResponse;", "onFailure", "", "t", "", "onSuccess", "result", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements k<b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0513a f39485b;

        b(C0513a aVar) {
            this.f39485b = aVar;
        }

        public final void onFailure(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f39484a, false, 32026, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f39484a, false, 32026, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "t");
            a.g = false;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            b bVar = (b) obj;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f39484a, false, 32025, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f39484a, false, 32025, new Class[]{b.class}, Void.TYPE);
                return;
            }
            if (bVar != null) {
                if (bVar.f39486a > 0) {
                    z = true;
                }
                if (!z) {
                    bVar = null;
                }
                if (bVar != null) {
                    a.g = true;
                    e eVar = bVar.f39487b;
                    if (eVar != null) {
                        a.f39479b = StringsKt.replace$default(eVar.f39498a, "#", "", false, 4, (Object) null);
                        a.f39480c = eVar.f39499b;
                        a.f39481d = eVar.f39500c;
                    }
                    this.f39485b.a();
                    return;
                }
            }
        }
    }

    private a() {
    }

    @Nullable
    public static String b() {
        return f39479b;
    }

    @Nullable
    public static String c() {
        return f39480c;
    }

    @Nullable
    public static String d() {
        return f39481d;
    }

    public static boolean a() {
        return g;
    }

    static {
        SharePrefCache inst = SharePrefCache.inst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
        an<String> starAtlasOrderWebUrl = inst.getStarAtlasOrderWebUrl();
        Intrinsics.checkExpressionValueIsNotNull(starAtlasOrderWebUrl, "SharePrefCache.inst().starAtlasOrderWebUrl");
        Object c2 = starAtlasOrderWebUrl.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "SharePrefCache.inst().starAtlasOrderWebUrl.cache");
        f39482e = (String) c2;
    }

    public final boolean a(@NotNull Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f39478a, false, 32022, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f39478a, false, 32022, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
        if (aweme.getStarAtlasOrderId() > 0) {
            return true;
        }
        return false;
    }
}
