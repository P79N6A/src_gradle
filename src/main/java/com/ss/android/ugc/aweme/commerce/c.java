package com.ss.android.ugc.aweme.commerce;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.a;
import com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity;
import com.ss.android.ugc.aweme.commerce.preview.h;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commerce.service.widgets.PriceView;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JS\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\b0\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00132\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012H\u0016J\b\u0010/\u001a\u00020\u0013H\u0016J\f\u00100\u001a\u0006\u0012\u0002\b\u000301H\u0016J\b\u00102\u001a\u000203H\u0016J\f\u00104\u001a\u0006\u0012\u0002\b\u000301H\u0016J\n\u00105\u001a\u0004\u0018\u000106H\u0016J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020\u0013H\u0016J\b\u0010:\u001a\u00020\bH\u0016J$\u0010;\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010\f2\b\u0010=\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010>\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010?\u001a\u00020\fH\u0016J \u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\fH\u0016J \u0010E\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010?\u001a\u00020\f2\u0006\u0010F\u001a\u00020\fH\u0016J0\u0010G\u001a\u00020\b2\b\u0010H\u001a\u0004\u0018\u00010\f2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0J2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J.\u0010K\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010L\u001a\u0004\u0018\u00010\f2\b\u0010M\u001a\u0004\u0018\u00010\f2\b\u0010=\u001a\u0004\u0018\u00010\fH\u0016J(\u0010N\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010\f2\u0014\u0010P\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010Q\u0012\u0004\u0012\u00020\b0\u0012H\u0016JV\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020T2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010U\u001a\u0004\u0018\u00010\f2\b\u0010V\u001a\u0004\u0018\u00010\f2\b\u0010W\u001a\u0004\u0018\u00010\f2\b\u0010X\u001a\u0004\u0018\u00010\f2\b\u0010F\u001a\u0004\u0018\u00010\f2\b\u0010Y\u001a\u0004\u0018\u00010\fH\u0016JB\u0010Z\u001a\u00020\b2\u0006\u0010S\u001a\u00020T2\b\u0010O\u001a\u0004\u0018\u00010\f2\b\u0010[\u001a\u0004\u0018\u00010\f2\b\u0010\\\u001a\u0004\u0018\u00010\f2\b\u0010F\u001a\u0004\u0018\u00010\f2\b\u0010Y\u001a\u0004\u0018\u00010\fH\u0016J`\u0010]\u001a\u00020\b2\u0006\u0010S\u001a\u00020T2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010U\u001a\u0004\u0018\u00010\f2\b\u0010V\u001a\u0004\u0018\u00010\f2\b\u0010W\u001a\u0004\u0018\u00010\f2\b\u0010X\u001a\u0004\u0018\u00010\f2\b\u0010F\u001a\u0004\u0018\u00010\f2\b\u0010Y\u001a\u0004\u0018\u00010\f2\b\u0010^\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010_\u001a\u00020\b2\u0006\u0010`\u001a\u00020aH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/CommerceProxyImpl;", "Lcom/ss/android/ugc/aweme/commerce/service/env/ICommerceProxy;", "()V", "currentUser", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "getCurrentUser", "()Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "appointPromotion", "", "context", "Landroid/content/Context;", "promotionId", "", "awemeId", "authorId", "type", "", "onResult", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "bindPhone", "bindSkuLogic", "Lcom/ss/android/ugc/aweme/commerce/service/sku/SkuLogic;", "avatar", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "popPriceView", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;", "titleView", "Landroid/widget/TextView;", "preSaleView", "skuLayout", "Landroid/widget/LinearLayout;", "skuBox", "noStockHintLayout", "Landroid/view/View;", "minusBtn", "plusBtn", "selectCount", "userLimitTxt", "skuInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "defaultPrice", "buySingleOnly", "shouldChangeStatus", "enableLawWindow", "getBrowserClass", "Ljava/lang/Class;", "getCommerceSettings", "Lcom/ss/android/ugc/aweme/commerce/service/configs/CommerceSettings;", "getPortfolioClass", "getShoppingDesc", "Lcom/ss/android/ugc/aweme/commerce/service/setting/ShoppingDesc;", "getTopFeedPromotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimplePromotion;", "isUserLogin", "onCommerceMessageReceived", "openAdWebUrl", "url", "title", "openEasyGoByMiniApp", "uri", "openLawHintDialog", "yesListener", "Landroid/view/View$OnClickListener;", "noListener", "content", "openMiniApp", "enterFrom", "openRN", "schema", "options", "", "openSchemaWithH5Fallback", "webUrl", "schemaUrl", "queryUserInfo", "userId", "ucb", "Lcom/ss/android/ugc/aweme/profile/model/User;", "schemaToOrderShare", "fromAct", "Landroid/app/Activity;", "productId", "targetUid", "secTargetUid", "itemId", "enterMethod", "schemaToPortfolio", "secUserId", "entranceLocation", "schemaToSeeding", "playId", "startPreview", "previewParams", "Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements com.ss.android.ugc.aweme.commerce.service.e.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36762a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/CUserResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class a<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36763a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function1 f36764b;

        a(Function1 function1) {
            this.f36764b = function1;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f36763a, false, 27914, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f36763a, false, 27914, new Class[]{i.class}, Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
                if (iVar.d() || iVar.e() == null || ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).f37321a == null || ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).statusCode != 0) {
                    this.f36764b.invoke(null);
                } else {
                    this.f36764b.invoke(((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).f37321a);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final Class<?> a() {
        return PortfolioActivity.class;
    }

    @NotNull
    public final Class<?> f() {
        return CrossPlatformActivity.class;
    }

    public final void a(@NotNull View.OnClickListener onClickListener, @NotNull View.OnClickListener onClickListener2, @NotNull String str) {
        View.OnClickListener onClickListener3 = onClickListener;
        View.OnClickListener onClickListener4 = onClickListener2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{onClickListener3, onClickListener4, str2}, this, f36762a, false, 27899, new Class[]{View.OnClickListener.class, View.OnClickListener.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener3, onClickListener4, str2}, this, f36762a, false, 27899, new Class[]{View.OnClickListener.class, View.OnClickListener.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(onClickListener3, "yesListener");
        Intrinsics.checkParameterIsNotNull(onClickListener4, "noListener");
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.CONTENT);
        a aVar = a.f36661b;
        if (PatchProxy.isSupport(new Object[]{onClickListener3, onClickListener4, str2}, aVar, a.f36660a, false, 27865, new Class[]{View.OnClickListener.class, View.OnClickListener.class, String.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{onClickListener3, onClickListener4, str2}, aVar2, a.f36660a, false, 27865, new Class[]{View.OnClickListener.class, View.OnClickListener.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(onClickListener3, "yesListener");
        Intrinsics.checkParameterIsNotNull(onClickListener4, "noListener");
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.CONTENT);
        AwemeAppData p = AwemeAppData.p();
        Intrinsics.checkExpressionValueIsNotNull(p, "AwemeAppData.inst()");
        Activity f2 = p.f();
        if (f2 != null) {
            b a2 = new b.a().b(str2).a(f2.getString(C0906R.string.bzs)).c(f2.getString(C0906R.string.pm)).a(2130840180).d(f2.getString(C0906R.string.anu)).a((Context) f2);
            a2.a(new a.C0460a(a2, onClickListener3));
            a2.b(new a.b(a2, onClickListener4));
            a2.setCanceledOnTouchOutside(false);
            try {
                a2.show();
            } catch (Exception unused) {
            }
        }
    }

    public final void a(@Nullable String str, @NotNull Function1<? super User, Unit> function1) {
        Function1<? super User, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{str, function12}, this, f36762a, false, 27906, new Class[]{String.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, function12}, this, f36762a, false, 27906, new Class[]{String.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "ucb");
        if (str == null) {
            function12.invoke(null);
        } else {
            com.ss.android.ugc.aweme.commerce.preview.api.a.a(str).a((g<TResult, TContinuationResult>) new a<TResult,TContinuationResult>(function12));
        }
    }

    public final void a(@Nullable String str, @NotNull Map<String, String> map, @Nullable Context context) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str, map2, context}, this, f36762a, false, 27907, new Class[]{String.class, Map.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map2, context}, this, f36762a, false, 27907, new Class[]{String.class, Map.class, Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(map2, "options");
        a.a(str, map, context);
    }

    public final void a(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str, str2}, this, f36762a, false, 27908, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str, str2}, this, f36762a, false, 27908, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        if (PatchProxy.isSupport(new Object[]{context2, str, str2}, null, a.f36660a, true, 27864, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str, str2}, null, a.f36660a, true, 27864, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        com.ss.android.ugc.aweme.commercialize.utils.g.a(context, str, str2);
    }

    public final void a(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull Function1<? super Boolean, Unit> function1) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Function1<? super Boolean, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6, Integer.valueOf(i), function12}, this, f36762a, false, 27912, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Function1.class}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, str6, Integer.valueOf(i), function12};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f36762a, false, 27912, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str4, "promotionId");
        Intrinsics.checkParameterIsNotNull(str5, "awemeId");
        Intrinsics.checkParameterIsNotNull(str6, "authorId");
        Intrinsics.checkParameterIsNotNull(function12, "onResult");
        com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c.a(context, str, str2, str3, i, function1);
    }

    @NotNull
    public final CommerceUser b() {
        if (PatchProxy.isSupport(new Object[0], this, f36762a, false, 27898, new Class[0], CommerceUser.class)) {
            return (CommerceUser) PatchProxy.accessDispatch(new Object[0], this, f36762a, false, 27898, new Class[0], CommerceUser.class);
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        CommerceUser a3 = com.ss.android.ugc.aweme.commerce.service.l.d.a(a2.getCurUser());
        Intrinsics.checkExpressionValueIsNotNull(a3, "CommerceUtils.toCommerce…oxyService.get().curUser)");
        return a3;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.commerce.service.j.a c() {
        if (!PatchProxy.isSupport(new Object[0], this, f36762a, false, 27903, new Class[0], com.ss.android.ugc.aweme.commerce.service.j.a.class)) {
            return com.ss.android.ugc.aweme.commerce.setting.b.a();
        }
        return (com.ss.android.ugc.aweme.commerce.service.j.a) PatchProxy.accessDispatch(new Object[0], this, f36762a, false, 27903, new Class[0], com.ss.android.ugc.aweme.commerce.service.j.a.class);
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f36762a, false, 27904, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36762a, false, 27904, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        return a2.isLogin();
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f36762a, false, 27911, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36762a, false, 27911, new Class[0], Boolean.TYPE)).booleanValue();
        }
        SharePrefCache inst = SharePrefCache.inst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
        an<Boolean> enableLawWindow = inst.getEnableLawWindow();
        Intrinsics.checkExpressionValueIsNotNull(enableLawWindow, "SharePrefCache.inst().enableLawWindow");
        Object c2 = enableLawWindow.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "SharePrefCache.inst().enableLawWindow.cache");
        return ((Boolean) c2).booleanValue();
    }

    public final void a(@NotNull n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f36762a, false, 27894, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f36762a, false, 27894, new Class[]{n.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(nVar2, "previewParams");
        h.f37502d.a(nVar2);
    }

    public final void a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f36762a, false, 27901, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f36762a, false, 27901, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        com.ss.android.ugc.aweme.account.c.c().bindMobile((Activity) context2, "", null, null);
    }

    public final void a(@NotNull Activity activity, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, str, str2, str3, str4, str5}, this, f36762a, false, 27896, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str, str2, str3, str4, str5};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f36762a, false, 27896, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        a.a(activity, str, str2, str3, str4, str5);
    }

    public final void a(@NotNull Activity activity, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, str, str2, str3, str4, str5, str6, str7}, this, f36762a, false, 27897, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str, str2, str3, str4, str5, str6, str7}, this, f36762a, false, 27897, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        a.a(activity, str, str2, str3, str4, str5, str6, str7);
    }

    public final void a(@NotNull Activity activity, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, str, str2, str3, str4, str5, str6, str7, str8}, this, f36762a, false, 27893, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str, str2, str3, str4, str5, str6, str7, str8}, this, f36762a, false, 27893, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
        a.a(activity, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @NotNull
    public final com.ss.android.ugc.aweme.commerce.service.k.a a(@NotNull RemoteImageView remoteImageView, @NotNull Context context, @NotNull PriceView priceView, @NotNull TextView textView, @NotNull TextView textView2, @NotNull LinearLayout linearLayout, @NotNull LinearLayout linearLayout2, @NotNull View view, @NotNull View view2, @NotNull View view3, @NotNull TextView textView3, @NotNull TextView textView4, @NotNull ak akVar, @NotNull String str, boolean z, @Nullable Function1<? super Boolean, Unit> function1) {
        RemoteImageView remoteImageView2 = remoteImageView;
        Context context2 = context;
        PriceView priceView2 = priceView;
        TextView textView5 = textView;
        TextView textView6 = textView2;
        LinearLayout linearLayout3 = linearLayout;
        LinearLayout linearLayout4 = linearLayout2;
        View view4 = view;
        View view5 = view2;
        View view6 = view3;
        TextView textView7 = textView3;
        TextView textView8 = textView4;
        ak akVar2 = akVar;
        Object[] objArr = {remoteImageView2, context2, priceView2, textView5, textView6, linearLayout3, linearLayout4, view4, view5, view6, textView7, textView8, akVar2, str, Byte.valueOf(z ? (byte) 1 : 0), function1};
        if (PatchProxy.isSupport(objArr, this, f36762a, false, 27895, new Class[]{RemoteImageView.class, Context.class, PriceView.class, TextView.class, TextView.class, LinearLayout.class, LinearLayout.class, View.class, View.class, View.class, TextView.class, TextView.class, ak.class, String.class, Boolean.TYPE, Function1.class}, com.ss.android.ugc.aweme.commerce.service.k.a.class)) {
            return (com.ss.android.ugc.aweme.commerce.service.k.a) PatchProxy.accessDispatch(new Object[]{remoteImageView2, context2, priceView2, textView5, textView6, linearLayout3, linearLayout4, view4, view5, view6, textView7, textView8, akVar2, str, Byte.valueOf(z), function1}, this, f36762a, false, 27895, new Class[]{RemoteImageView.class, Context.class, PriceView.class, TextView.class, TextView.class, LinearLayout.class, LinearLayout.class, View.class, View.class, View.class, TextView.class, TextView.class, ak.class, String.class, Boolean.TYPE, Function1.class}, com.ss.android.ugc.aweme.commerce.service.k.a.class);
        }
        Intrinsics.checkParameterIsNotNull(remoteImageView2, "avatar");
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(priceView2, "popPriceView");
        Intrinsics.checkParameterIsNotNull(textView5, "titleView");
        Intrinsics.checkParameterIsNotNull(textView6, "preSaleView");
        Intrinsics.checkParameterIsNotNull(linearLayout3, "skuLayout");
        Intrinsics.checkParameterIsNotNull(linearLayout4, "skuBox");
        Intrinsics.checkParameterIsNotNull(view4, "noStockHintLayout");
        Intrinsics.checkParameterIsNotNull(view5, "minusBtn");
        Intrinsics.checkParameterIsNotNull(view6, "plusBtn");
        Intrinsics.checkParameterIsNotNull(textView7, "selectCount");
        Intrinsics.checkParameterIsNotNull(textView8, "userLimitTxt");
        Intrinsics.checkParameterIsNotNull(akVar2, "skuInfo");
        Intrinsics.checkParameterIsNotNull(str, "defaultPrice");
        com.ss.android.ugc.aweme.commerce.preview.pops.b bVar = new com.ss.android.ugc.aweme.commerce.preview.pops.b(remoteImageView, context, priceView, textView, textView2, linearLayout, linearLayout2, view, view2, view3, textView3, textView4, akVar, str, z, null, function1, null);
        return bVar;
    }
}
