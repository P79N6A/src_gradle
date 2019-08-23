package com.ss.android.ugc.aweme.commerce.preview.api;

import a.g;
import a.i;
import android.content.Context;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.preview.api.a.d;
import com.ss.android.ugc.aweme.commerce.preview.api.a.e;
import com.ss.android.ugc.aweme.commerce.service.l.c;
import com.ss.android.ugc.aweme.commerce.service.models.p;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.dr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004JQ\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00140\u0018J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\b2\u0006\u0010\u001f\u001a\u00020\u0004J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\bJ \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J$\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J4\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\b2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J$\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J<\u00100\u001a\b\u0012\u0004\u0012\u0002010\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004JP\u00104\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u00105\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u00042\b\u00107\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u001408J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J&\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u000eH\u0007J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\b2\u0006\u0010@\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/api/PreviewApiImpl;", "", "()V", "API_URL_PREFIX_SI", "", "portfolioApi", "Lcom/ss/android/ugc/aweme/commerce/preview/api/PreviewApi;", "add2WillList", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewWillListResponse;", "awemeId", "promotionId", "authorId", "type", "", "addShopCart", "Lcom/ss/android/ugc/aweme/commerce/preview/pops/sku/AddCartResponse;", "productId", "skuInfo", "appointPromotion", "", "context", "Landroid/content/Context;", "onResult", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "consumeCoupon", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ConsumeCouponResponse;", "couponMetaId", "getCartCount", "Lcom/ss/android/ugc/aweme/commerce/preview/pops/sku/CartCountResponse;", "getShopCommentList", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewCommentListResponse;", "getShopRecommend", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewRecommendResponse;", "getShopVideoIds", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewVideoIdsResponse;", "page", "size", "itemId", "getUserTrace", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/UserTraceResponse;", "shopCoupon", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ShopCouponResponse;", "shopCouponNew", "shopSku", "Lcom/ss/android/ugc/aweme/commerce/preview/pops/sku/ShopSkuResponse;", "originType", "enterMethod", "shopSkuDynamicInfo", "from", "kolId", "secKolId", "Lkotlin/Function2;", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionDynamicInfoResponse;", "skuCheck", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/SkuCheckResponse;", "skuCheckV2", "button_type", "userProfile", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/CUserResponse;", "userId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37314a;

    /* renamed from: b  reason: collision with root package name */
    public static final PreviewApi f37315b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f37316c = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.preview.api.a$a  reason: collision with other inner class name */
    static final class C0471a<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.commerce.service.d.a, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37317a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function1 f37318b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37319c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f37320d;

        C0471a(Function1 function1, int i, Context context) {
            this.f37318b = function1;
            this.f37319c = i;
            this.f37320d = context;
        }

        public final /* synthetic */ Object then(i iVar) {
            String str;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f37317a, false, 28867, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37317a, false, 28867, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
            if (iVar.d() || iVar.e() == null || ((com.ss.android.ugc.aweme.commerce.service.d.a) iVar.e()).statusCode != 0) {
                this.f37318b.invoke(Boolean.FALSE);
                if (this.f37319c == 1) {
                    str = this.f37320d.getResources().getString(C0906R.string.wr);
                } else {
                    str = this.f37320d.getResources().getString(C0906R.string.zv);
                }
            } else {
                this.f37318b.invoke(Boolean.TRUE);
                if (this.f37319c == 1) {
                    str = this.f37320d.getResources().getString(C0906R.string.ws);
                } else {
                    str = this.f37320d.getResources().getString(C0906R.string.zw);
                }
            }
            UIUtils.displayToast(this.f37320d, str);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionDynamicInfoResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    public static final class b<TTaskResult, TContinuationResult> implements g<p, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f37323b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37324c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f37325d;

        public b(Function2 function2, String str, String str2) {
            this.f37323b = function2;
            this.f37324c = str;
            this.f37325d = str2;
        }

        public final /* synthetic */ Object then(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f37322a, false, 28868, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f37322a, false, 28868, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
            if (iVar.d() || iVar.e() == null || ((p) iVar.e()).statusCode != 0) {
                if (iVar.d() || iVar.e() == null) {
                    c.a.a(c.f37989a, false, null, "task fail", this.f37325d, this.f37324c, 2);
                } else {
                    c.f37989a.a(false, Integer.valueOf(((p) iVar.e()).statusCode), "result error", this.f37325d, this.f37324c);
                }
                Function2 function2 = this.f37323b;
                Boolean bool = Boolean.FALSE;
                Object e2 = iVar.e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "task.result");
                function2.invoke(bool, e2);
            } else {
                c.a.a(c.f37989a, true, null, null, null, null, 30);
                Function2 function22 = this.f37323b;
                Boolean bool2 = Boolean.TRUE;
                Object e3 = iVar.e();
                Intrinsics.checkExpressionValueIsNotNull(e3, "task.result");
                function22.invoke(bool2, e3);
            }
            return null;
        }
    }

    private a() {
    }

    public final void a(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull Function1<? super Boolean, Unit> function1) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Function1<? super Boolean, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6, Integer.valueOf(i), function12}, this, f37314a, false, 28865, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Function1.class}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, str6, Integer.valueOf(i), function12};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f37314a, false, 28865, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str4, "promotionId");
        Intrinsics.checkParameterIsNotNull(str5, "awemeId");
        Intrinsics.checkParameterIsNotNull(str6, "authorId");
        Intrinsics.checkParameterIsNotNull(function12, "onResult");
        f37315b.appointPromotion(str, str2, str3, dr.a().a(str6), i).a((g<TResult, TContinuationResult>) new C0471a<TResult,TContinuationResult>(function12, i, context2), i.f1052b);
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com/").create(PreviewApi.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…e(PreviewApi::class.java)");
        f37315b = (PreviewApi) create;
    }

    @NotNull
    public final i<com.ss.android.ugc.aweme.commerce.preview.pops.a.c> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f37314a, false, 28858, new Class[0], i.class)) {
            return f37315b.getCartCount();
        }
        return (i) PatchProxy.accessDispatch(new Object[0], this, f37314a, false, 28858, new Class[0], i.class);
    }

    @JvmStatic
    @NotNull
    public static final i<com.ss.android.ugc.aweme.commerce.preview.api.a.a> a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f37314a, true, 28852, new Class[]{String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2}, null, f37314a, true, 28852, new Class[]{String.class}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        return f37315b.userProfile(str2);
    }

    @JvmStatic
    @NotNull
    public static final i<com.ss.android.ugc.aweme.commerce.service.g.a.c> a(@NotNull String str, @NotNull String str2, int i) throws Exception {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, null, f37314a, true, 28861, new Class[]{String.class, String.class, Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, null, f37314a, true, 28861, new Class[]{String.class, String.class, Integer.TYPE}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "promotionId");
        Intrinsics.checkParameterIsNotNull(str4, "productId");
        return f37315b.skuCheckV2(str3, str4, i);
    }

    @NotNull
    public final i<e> a(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, Integer.valueOf(i)}, this, f37314a, false, 28862, new Class[]{String.class, String.class, String.class, Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str4, str5, str6, Integer.valueOf(i)}, this, f37314a, false, 28862, new Class[]{String.class, String.class, String.class, Integer.TYPE}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "awemeId");
        Intrinsics.checkParameterIsNotNull(str5, "promotionId");
        Intrinsics.checkParameterIsNotNull(str6, "authorId");
        return f37315b.shopWillList(str, str2, str3, dr.a().a(str6), i);
    }

    @NotNull
    public final i<d> a(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), 10, str4, str5, str6}, this, f37314a, false, 28851, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, String.class}, i.class)) {
            Object[] objArr = {Integer.valueOf(i), 10, str4, str5, str6};
            return (i) PatchProxy.accessDispatch(objArr, this, f37314a, false, 28851, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, String.class}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "itemId");
        Intrinsics.checkParameterIsNotNull(str5, "promotionId");
        Intrinsics.checkParameterIsNotNull(str6, "productId");
        return f37315b.getShopFeeds(i, 10, str, str2, str3);
    }

    @NotNull
    public final i<com.ss.android.ugc.aweme.commerce.preview.pops.a.d> a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if (PatchProxy.isSupport(new Object[]{str7, str8, str9, str10, str11, str12}, this, f37314a, false, 28853, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str7, str8, str9, str10, str11, str12}, this, f37314a, false, 28853, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str7, "promotionId");
        Intrinsics.checkParameterIsNotNull(str8, "productId");
        Intrinsics.checkParameterIsNotNull(str9, "originType");
        Intrinsics.checkParameterIsNotNull(str10, "enterMethod");
        Intrinsics.checkParameterIsNotNull(str11, "awemeId");
        Intrinsics.checkParameterIsNotNull(str12, "authorId");
        return f37315b.shopSku(str, str2, str3, str4, str5, str6, dr.a().a(str12));
    }
}
