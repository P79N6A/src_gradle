package com.ss.android.ugc.aweme.commerce.portfolio.api;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.portfolio.b;
import com.ss.android.ugc.aweme.commerce.service.l.c;
import com.ss.android.ugc.aweme.commerce.service.models.u;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00060\rH\u0007Jm\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00060\rH\u0007¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0007J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00182\u0006\u0010\u001e\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/api/PortfolioApiImpl;", "", "()V", "portfolioApi", "Lcom/ss/android/ugc/aweme/commerce/portfolio/api/PortfolioApi;", "getShopGoodsList", "", "count", "", "cursor", "uid", "", "onResult", "Lkotlin/Function2;", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopPromotionListResponse;", "getShopGoodsListBySort", "columnId", "sort", "keyWord", "categoryId", "", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "searchUserCategory", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/portfolio/UserShopCategoryResponse;", "kolId", "secKolId", "userProfile", "Lcom/ss/android/ugc/aweme/commerce/portfolio/UserResponse;", "userId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37050a;

    /* renamed from: b  reason: collision with root package name */
    public static final PortfolioApi f37051b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f37052c = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopPromotionListResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.portfolio.api.a$a  reason: collision with other inner class name */
    static final class C0468a<TTaskResult, TContinuationResult> implements g<u, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37053a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f37054b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37055c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f37056d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f37057e;

        C0468a(Function2 function2, int i, int i2, String str) {
            this.f37054b = function2;
            this.f37055c = i;
            this.f37056d = i2;
            this.f37057e = str;
        }

        public final /* synthetic */ Object then(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f37053a, false, 28456, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f37053a, false, 28456, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
            if (iVar.d() || iVar.e() == null || ((u) iVar.e()).statusCode != 0) {
                if (iVar.d() || iVar.e() == null) {
                    c.f37989a.a(false, (Integer) null, "task fail", Integer.valueOf(this.f37055c), Integer.valueOf(this.f37056d), this.f37057e);
                } else {
                    c.f37989a.a(false, Integer.valueOf(((u) iVar.e()).statusCode), "result error", Integer.valueOf(this.f37055c), Integer.valueOf(this.f37056d), this.f37057e);
                }
                this.f37054b.invoke(Boolean.FALSE, iVar.e());
            } else {
                this.f37054b.invoke(Boolean.TRUE, iVar.e());
                c.f37989a.a(true, (Integer) null, (String) null, (Integer) null, (Integer) null, (String) null);
            }
            return null;
        }
    }

    private a() {
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com/").create(PortfolioApi.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…PortfolioApi::class.java)");
        f37051b = (PortfolioApi) create;
    }

    @JvmStatic
    @NotNull
    public static final i<b> a(@NotNull String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f37050a, true, 28452, new Class[]{String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2}, null, f37050a, true, 28452, new Class[]{String.class}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        return f37051b.userProfile(str2);
    }

    @SuppressLint({"TooManyMethodParam"})
    @JvmStatic
    public static final void a(int i, int i2, @NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable Long l, @NotNull Function2<? super Boolean, ? super u, Unit> function2) throws Exception {
        String str4 = str;
        Function2<? super Boolean, ? super u, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str4, str2, num, str3, l, function22}, null, f37050a, true, 28454, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, Integer.class, String.class, Long.class, Function2.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str4, str2, num, str3, l, function22}, null, f37050a, true, 28454, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, Integer.class, String.class, Long.class, Function2.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str4, "uid");
        Intrinsics.checkParameterIsNotNull(function22, "onResult");
        f37051b.getShopGoodsList(i, i2, str, str2, num, null, str3, l).a((g<TResult, TContinuationResult>) new C0468a<TResult,TContinuationResult>(function22, i, i2, str4), i.f1052b);
    }
}
