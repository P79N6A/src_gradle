package com.ss.android.ugc.aweme.commerce.sdk.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commerce.service.widgets.PriceView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 n2\u00020\u0001:\u0001nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00160\u001eJ\u000e\u0010#\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bJ\u0001\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u001f2\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001eH\u0007J\f\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010<J\u0006\u0010=\u001a\u00020\u001fJ\b\u0010>\u001a\u00020\u0014H\u0002J\b\u0010?\u001a\u0004\u0018\u00010@J\u0006\u0010A\u001a\u00020\u0016J\u001e\u0010B\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u0012J\u0006\u0010E\u001a\u00020\u001fJ \u0010F\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\b\u0010G\u001a\u0004\u0018\u00010\u00182\u0006\u0010H\u001a\u00020\u0018J\u0016\u0010I\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u0018J\u001e\u0010K\u001a\u00020\u00162\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u0018J\u001e\u0010P\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u00182\u0006\u0010Q\u001a\u00020\u0018J.\u0010R\u001a\u00020\u00162\b\u0010S\u001a\u0004\u0018\u00010\u00182\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180U2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ,\u0010V\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\b\u0010W\u001a\u0004\u0018\u00010\u00182\b\u0010X\u001a\u0004\u0018\u00010\u00182\b\u0010H\u001a\u0004\u0018\u00010\u0018J\f\u0010Y\u001a\b\u0012\u0002\b\u0003\u0018\u00010<J&\u0010Z\u001a\u00020\u00162\b\u0010[\u001a\u0004\u0018\u00010\u00182\u0014\u0010\\\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010]\u0012\u0004\u0012\u00020\u00160\u001eJT\u0010^\u001a\u00020\u00162\u0006\u0010_\u001a\u00020`2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010a\u001a\u0004\u0018\u00010\u00182\b\u0010b\u001a\u0004\u0018\u00010\u00182\b\u0010c\u001a\u0004\u0018\u00010\u00182\b\u0010d\u001a\u0004\u0018\u00010\u00182\b\u0010Q\u001a\u0004\u0018\u00010\u00182\b\u0010e\u001a\u0004\u0018\u00010\u0018J@\u0010f\u001a\u00020\u00162\u0006\u0010_\u001a\u00020`2\b\u0010[\u001a\u0004\u0018\u00010\u00182\b\u0010g\u001a\u0004\u0018\u00010\u00182\b\u0010h\u001a\u0004\u0018\u00010\u00182\b\u0010Q\u001a\u0004\u0018\u00010\u00182\b\u0010e\u001a\u0004\u0018\u00010\u0018J`\u0010i\u001a\u00020\u00162\u0006\u0010_\u001a\u00020`2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010a\u001a\u0004\u0018\u00010\u00182\b\u0010b\u001a\u0004\u0018\u00010\u00182\b\u0010c\u001a\u0004\u0018\u00010\u00182\b\u0010d\u001a\u0004\u0018\u00010\u00182\b\u0010Q\u001a\u0004\u0018\u00010\u00182\b\u0010e\u001a\u0004\u0018\u00010\u00182\b\u0010j\u001a\u0004\u0018\u00010\u0018H\u0007J\u000e\u0010k\u001a\u00020\u00162\u0006\u0010l\u001a\u00020mR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006o"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/proxy/CommerceProxyManager;", "", "()V", "commerceSettings", "Lcom/ss/android/ugc/aweme/commerce/service/configs/CommerceSettings;", "getCommerceSettings", "()Lcom/ss/android/ugc/aweme/commerce/service/configs/CommerceSettings;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "currentUser", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "getCurrentUser", "()Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "mConfigs", "Lcom/ss/android/ugc/aweme/commerce/service/configs/CommerceConfigs;", "mProxy", "Lcom/ss/android/ugc/aweme/commerce/service/env/ICommerceProxy;", "appointPromotion", "", "promotionId", "", "awemeId", "authorId", "type", "", "onResult", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "bindPhone", "bindSkuLogic", "Lcom/ss/android/ugc/aweme/commerce/service/sku/SkuLogic;", "avatar", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "popPriceView", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;", "titleView", "Landroid/widget/TextView;", "preSaleView", "skuLayout", "Landroid/widget/LinearLayout;", "skuBox", "noStockHintLayout", "Landroid/view/View;", "minusBtn", "plusBtn", "selectCount", "userLimitTxt", "skuInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "defaultPrice", "buySingleOnly", "shouldChangeStatus", "browserClass", "Ljava/lang/Class;", "enableLawWindow", "getProxy", "getShoppingDesc", "Lcom/ss/android/ugc/aweme/commerce/service/setting/ShoppingDesc;", "handleCommerceMessageReceived", "init", "commerceEnvironment", "config", "isLogin", "openAdWebUrl", "url", "title", "openEasyGoByMiniApp", "uri", "openLawHintDialog", "yesListener", "Landroid/view/View$OnClickListener;", "noListener", "content", "openMiniApp", "enterFrom", "openRN", "schema", "options", "", "openSchemaWithH5Fallback", "webUrl", "schemaUrl", "portfolioClass", "queryUser", "userId", "ucb", "Lcom/ss/android/ugc/aweme/profile/model/User;", "schemaToOrderShare", "fromAct", "Landroid/app/Activity;", "productId", "targetUid", "secTargetUid", "itemId", "enterMethod", "schemaToPortfolio", "secUserId", "entranceLocation", "schemaToSeeding", "playId", "startPreview", "previewParams", "Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams;", "Companion", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37701a;
    @NotNull
    @SuppressLint({"StaticFieldLeak"})
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public static final a f37702e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final C0487a f37703f = new C0487a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commerce.service.e.a f37704b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commerce.service.b.a f37705c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public Context f37706d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/proxy/CommerceProxyManager$Companion;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/commerce/sdk/proxy/CommerceProxyManager;", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.b.a$a  reason: collision with other inner class name */
    public static final class C0487a {
        private C0487a() {
        }

        public /* synthetic */ C0487a(byte b2) {
            this();
        }
    }

    private a() {
    }

    @NotNull
    public final Context a() {
        if (PatchProxy.isSupport(new Object[0], this, f37701a, false, 29484, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, f37701a, false, 29484, new Class[0], Context.class);
        }
        Context context = this.f37706d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    public final com.ss.android.ugc.aweme.commerce.service.e.a b() {
        if (PatchProxy.isSupport(new Object[0], this, f37701a, false, 29486, new Class[0], com.ss.android.ugc.aweme.commerce.service.e.a.class)) {
            return (com.ss.android.ugc.aweme.commerce.service.e.a) PatchProxy.accessDispatch(new Object[0], this, f37701a, false, 29486, new Class[0], com.ss.android.ugc.aweme.commerce.service.e.a.class);
        }
        if (this.f37704b == null) {
            ServiceManager.get().getService(ICommerceService.class);
        }
        com.ss.android.ugc.aweme.commerce.service.e.a aVar = this.f37704b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProxy");
        }
        return aVar;
    }

    @NotNull
    public final CommerceUser c() {
        if (!PatchProxy.isSupport(new Object[0], this, f37701a, false, 29488, new Class[0], CommerceUser.class)) {
            return b().b();
        }
        return (CommerceUser) PatchProxy.accessDispatch(new Object[0], this, f37701a, false, 29488, new Class[0], CommerceUser.class);
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f37701a, false, 29489, new Class[0], Boolean.TYPE)) {
            return b().d();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f37701a, false, 29489, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean e() {
        if (!PatchProxy.isSupport(new Object[0], this, f37701a, false, 29499, new Class[0], Boolean.TYPE)) {
            return b().e();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f37701a, false, 29499, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @Nullable
    public final com.ss.android.ugc.aweme.commerce.service.j.a f() {
        if (!PatchProxy.isSupport(new Object[0], this, f37701a, false, 29501, new Class[0], com.ss.android.ugc.aweme.commerce.service.j.a.class)) {
            return b().c();
        }
        return (com.ss.android.ugc.aweme.commerce.service.j.a) PatchProxy.accessDispatch(new Object[0], this, f37701a, false, 29501, new Class[0], com.ss.android.ugc.aweme.commerce.service.j.a.class);
    }

    @Nullable
    public final Class<?> g() {
        if (!PatchProxy.isSupport(new Object[0], this, f37701a, false, 29504, new Class[0], Class.class)) {
            return b().f();
        }
        return (Class) PatchProxy.accessDispatch(new Object[0], this, f37701a, false, 29504, new Class[0], Class.class);
    }

    public final void a(@NotNull n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f37701a, false, 29506, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f37701a, false, 29506, new Class[]{n.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(nVar2, "previewParams");
        b().a(nVar2);
    }

    public final void a(@NotNull Context context, @Nullable String str, @NotNull String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, this, f37701a, false, 29496, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, this, f37701a, false, 29496, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str4, PushConstants.TITLE);
        b().a(context2, str3, str4);
    }

    public final void a(@NotNull View.OnClickListener onClickListener, @NotNull View.OnClickListener onClickListener2, @NotNull String str) {
        View.OnClickListener onClickListener3 = onClickListener;
        View.OnClickListener onClickListener4 = onClickListener2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{onClickListener3, onClickListener4, str2}, this, f37701a, false, 29491, new Class[]{View.OnClickListener.class, View.OnClickListener.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener3, onClickListener4, str2}, this, f37701a, false, 29491, new Class[]{View.OnClickListener.class, View.OnClickListener.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(onClickListener3, "yesListener");
        Intrinsics.checkParameterIsNotNull(onClickListener4, "noListener");
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.CONTENT);
        b().a(onClickListener3, onClickListener4, str2);
    }

    @NotNull
    @SuppressLint({"TooManyMethodParam"})
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
        if (PatchProxy.isSupport(objArr, this, f37701a, false, 29509, new Class[]{RemoteImageView.class, Context.class, PriceView.class, TextView.class, TextView.class, LinearLayout.class, LinearLayout.class, View.class, View.class, View.class, TextView.class, TextView.class, ak.class, String.class, Boolean.TYPE, Function1.class}, com.ss.android.ugc.aweme.commerce.service.k.a.class)) {
            return (com.ss.android.ugc.aweme.commerce.service.k.a) PatchProxy.accessDispatch(new Object[]{remoteImageView2, context2, priceView2, textView5, textView6, linearLayout3, linearLayout4, view4, view5, view6, textView7, textView8, akVar2, str, Byte.valueOf(z), function1}, this, f37701a, false, 29509, new Class[]{RemoteImageView.class, Context.class, PriceView.class, TextView.class, TextView.class, LinearLayout.class, LinearLayout.class, View.class, View.class, View.class, TextView.class, TextView.class, ak.class, String.class, Boolean.TYPE, Function1.class}, com.ss.android.ugc.aweme.commerce.service.k.a.class);
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
        return b().a(remoteImageView, context, priceView, textView, textView2, linearLayout, linearLayout2, view, view2, view3, textView3, textView4, akVar, str, z, function1);
    }
}
