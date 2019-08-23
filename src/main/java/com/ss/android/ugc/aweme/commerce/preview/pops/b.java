package com.ss.android.ugc.aweme.commerce.preview.pops;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout;
import com.ss.android.ugc.aweme.commerce.service.l.g;
import com.ss.android.ugc.aweme.commerce.service.models.aa;
import com.ss.android.ugc.aweme.commerce.service.models.ab;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.commerce.service.widgets.PriceView;
import com.ss.android.ugc.aweme.commercialize.utils.a.a.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u0000 ?2\u00020\u0001:\u0001?B±\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010!J6\u0010)\u001a\u00020\u001e2,\u0010*\u001a(\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\u001e\u0018\u00010+H\u0016J\b\u0010.\u001a\u00020\u0019H\u0016J\u0010\u0010/\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&H\u0016J&\u00100\u001a\u00020\u001e2\u001c\u00101\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u001e\u0018\u000102H\u0016J\b\u00103\u001a\u00020#H\u0002J\b\u00104\u001a\u00020\u0017H\u0002J\b\u00105\u001a\u00020#H\u0016JT\u00106\u001a\u00020\u001e2,\u0010*\u001a(\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\u001e\u0018\u00010+2\u001c\u00101\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u001e\u0018\u000102H\u0002J\b\u00107\u001a\u00020\u001eH\u0002J\b\u00108\u001a\u00020\u001eH\u0002J\b\u00109\u001a\u00020\u001eH\u0002J\b\u0010:\u001a\u00020\u001eH\u0002J\u0017\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010<H\u0016¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\u001eH\u0002R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/pops/SkuController;", "Lcom/ss/android/ugc/aweme/commerce/service/sku/SkuLogic;", "avatar", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "context", "Landroid/content/Context;", "popPriceView", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;", "titleView", "Landroid/widget/TextView;", "preSaleView", "skuLayout", "Landroid/widget/LinearLayout;", "skuBox", "noStockHintLayout", "Landroid/view/View;", "minusBtn", "plusBtn", "selectCount", "userLimitText", "skuInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "defaultPrice", "", "buySingleOnly", "", "skuPanelState", "Lcom/ss/android/ugc/aweme/commerce/service/models/SkuPanelState;", "shouldChangeStatus", "Lkotlin/Function1;", "", "adWebUrlData", "Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/AdWebPage$AdWebUrlData;", "(Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;Landroid/content/Context;Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;Ljava/lang/String;ZLcom/ss/android/ugc/aweme/commerce/service/models/SkuPanelState;Lkotlin/jvm/functions/Function1;Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/AdWebPage$AdWebUrlData;)V", "count", "", "enableSubmit", "skuPanelData", "Lcom/ss/android/ugc/aweme/commerce/service/preview/SkuPanelData;", "specItemGroupLayout", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemGroupLayout;", "addCart", "addCartListener", "Lkotlin/Function4;", "Landroid/graphics/Rect;", "Landroid/graphics/Bitmap;", "allSelected", "bindData", "buyNow", "purchaseListener", "Lkotlin/Function2;", "currentSkuMax", "getMessage", "getProductCount", "handleSubmit", "refreshAvatarImageView", "refreshPriceView", "refreshSubmit", "renderWithParams", "traceSkuResult", "", "()[Ljava/lang/String;", "updateCountView", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements com.ss.android.ugc.aweme.commerce.service.k.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37576a;
    public static final a j = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public SpecItemGroupLayout f37577b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commerce.service.i.a f37578c;

    /* renamed from: d  reason: collision with root package name */
    public int f37579d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final RemoteImageView f37580e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f37581f;
    public final View g;
    public final ak h;
    public final a.C0516a i;
    private boolean k;
    private final PriceView l;
    private final TextView m;
    private final TextView n;
    private final LinearLayout o;
    private final LinearLayout p;
    private final View q;
    private final View r;
    private final TextView s;
    private final TextView t;
    private final String u;
    private final boolean v;
    private final aa w;
    private final Function1<Boolean, Unit> x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004J&\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0001\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2,\u0010\u001e\u001a(\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001fH\u0007¢\u0006\u0002\u0010 J\\\u0010!\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0016\u001a\u00020\u00172\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0012\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/pops/SkuController$Companion;", "", "()V", "VALUE_100", "", "VALUE_100_F", "", "VALUE_35_F", "canOpenMiniApp", "", "orderMiniAppUrl", "", "formatCouponPrice", "priceValue", "getMiniAppUrl", "comboId", "count", "handleSubmitForAddCart", "", "skuInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "comboKey", "context", "Landroid/content/Context;", "selectedKeys", "", "avatarViewRect", "Landroid/graphics/Rect;", "avatarSnapshot", "Landroid/graphics/Bitmap;", "addCartListener", "Lkotlin/Function4;", "(Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;Ljava/lang/String;ILandroid/content/Context;[Ljava/lang/String;Landroid/graphics/Rect;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function4;)V", "handleSubmitForPurchase", "skuData", "Lcom/ss/android/ugc/aweme/commerce/service/preview/SkuPanelData;", "onOk", "Lkotlin/Function2;", "adWebUrlData", "Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/AdWebPage$AdWebUrlData;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37582a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/pops/sku/AddCartResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.commerce.preview.pops.b$a$a  reason: collision with other inner class name */
        static final class C0481a<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.commerce.preview.pops.a.b, Void> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37583a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Function4 f37584b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Rect f37585c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Bitmap f37586d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Context f37587e;

            C0481a(Function4 function4, Rect rect, Bitmap bitmap, Context context) {
                this.f37584b = function4;
                this.f37585c = rect;
                this.f37586d = bitmap;
                this.f37587e = context;
            }

            public final /* synthetic */ Object then(i iVar) {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f37583a, false, 29059, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37583a, false, 29059, new Class[]{i.class}, Void.class);
                }
                Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
                if (!iVar.d() && ((com.ss.android.ugc.aweme.commerce.preview.pops.a.b) iVar.e()).statusCode == 0) {
                    Function4 function4 = this.f37584b;
                    if (function4 != null) {
                        function4.invoke(Integer.valueOf(((com.ss.android.ugc.aweme.commerce.preview.pops.a.b) iVar.e()).f37566a), null, this.f37585c, this.f37586d);
                    }
                    UIUtils.displayToast(this.f37587e, com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.f37587e, C0906R.string.wl, new Object[0]));
                } else if (TextUtils.isEmpty(((com.ss.android.ugc.aweme.commerce.preview.pops.a.b) iVar.e()).statusMsg) || ((com.ss.android.ugc.aweme.commerce.preview.pops.a.b) iVar.e()).statusCode != 4) {
                    UIUtils.displayToast(this.f37587e, com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.f37587e, C0906R.string.wk, new Object[0]));
                } else {
                    UIUtils.displayToast(this.f37587e, ((com.ss.android.ugc.aweme.commerce.preview.pops.a.b) iVar.e()).statusMsg);
                }
                return null;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final boolean a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f37582a, false, 29056, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f37582a, false, 29056, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else if (!AbTestManager.a().W() || TextUtils.isEmpty(str)) {
                return false;
            } else {
                return true;
            }
        }

        @NotNull
        public final String a(int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37582a, false, 29058, new Class[]{Integer.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37582a, false, 29058, new Class[]{Integer.TYPE}, String.class);
            } else if (i2 % 100 == 0) {
                g.a aVar = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
                com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                Application application = b2.f3307e;
                Intrinsics.checkExpressionValueIsNotNull(application, "AppTracker.get().application");
                return aVar.a(application, C0906R.string.bqq, Float.valueOf(((float) i2) / 100.0f));
            } else if (i2 % 10 == 0) {
                g.a aVar2 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
                com.ss.android.ugc.aweme.framework.core.a b3 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "AppTracker.get()");
                Application application2 = b3.f3307e;
                Intrinsics.checkExpressionValueIsNotNull(application2, "AppTracker.get().application");
                return aVar2.a(application2, C0906R.string.bqk, Float.valueOf(((float) i2) / 100.0f));
            } else {
                g.a aVar3 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
                com.ss.android.ugc.aweme.framework.core.a b4 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b4, "AppTracker.get()");
                Application application3 = b4.f3307e;
                Intrinsics.checkExpressionValueIsNotNull(application3, "AppTracker.get().application");
                return aVar3.a(application3, C0906R.string.bqo, Float.valueOf(((float) i2) / 100.0f));
            }
        }

        public final String a(String str, String str2, int i) {
            String str3;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str, str4, Integer.valueOf(i)}, this, f37582a, false, 29055, new Class[]{String.class, String.class, Integer.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str, str4, Integer.valueOf(i)}, this, f37582a, false, 29055, new Class[]{String.class, String.class, Integer.TYPE}, String.class);
            }
            String queryParameter = Uri.parse(str).getQueryParameter("start_page");
            com.ss.android.common.util.i iVar = new com.ss.android.common.util.i(Uri.decode(queryParameter));
            iVar.a("combo_id", str4);
            iVar.a("combo_num", i);
            String encode = Uri.encode(iVar.toString());
            if (str != null) {
                String encode2 = Uri.encode(queryParameter);
                Intrinsics.checkExpressionValueIsNotNull(encode2, "Uri.encode(originStartPage)");
                Intrinsics.checkExpressionValueIsNotNull(encode, "startPage");
                str3 = StringsKt.replace$default(str, encode2, encode, false, 4, (Object) null);
            } else {
                str3 = null;
            }
            return str3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0155  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0158  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x015b  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x015e  */
        @android.annotation.SuppressLint({"TooManyMethodParam"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.commerce.service.models.ak r37, @org.jetbrains.annotations.Nullable java.lang.String r38, int r39, @org.jetbrains.annotations.NotNull android.content.Context r40, @org.jetbrains.annotations.NotNull java.lang.String[] r41, @org.jetbrains.annotations.Nullable android.graphics.Rect r42, @org.jetbrains.annotations.Nullable android.graphics.Bitmap r43, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function4<? super java.lang.Integer, ? super java.lang.String, ? super android.graphics.Rect, ? super android.graphics.Bitmap, kotlin.Unit> r44) {
            /*
                r36 = this;
                r0 = r37
                r1 = r38
                r2 = r39
                r3 = r40
                r4 = r41
                r5 = r42
                r6 = r43
                r7 = r44
                r8 = 8
                java.lang.Object[] r9 = new java.lang.Object[r8]
                r15 = 0
                r9[r15] = r0
                r16 = 1
                r9[r16] = r1
                java.lang.Integer r10 = java.lang.Integer.valueOf(r39)
                r17 = 2
                r9[r17] = r10
                r14 = 3
                r9[r14] = r3
                r18 = 4
                r9[r18] = r4
                r19 = 5
                r9[r19] = r5
                r20 = 6
                r9[r20] = r6
                r21 = 7
                r9[r21] = r7
                com.meituan.robust.ChangeQuickRedirect r11 = f37582a
                java.lang.Class[] r13 = new java.lang.Class[r8]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.ak> r10 = com.ss.android.ugc.aweme.commerce.service.models.ak.class
                r13[r15] = r10
                java.lang.Class<java.lang.String> r10 = java.lang.String.class
                r13[r16] = r10
                java.lang.Class r10 = java.lang.Integer.TYPE
                r13[r17] = r10
                java.lang.Class<android.content.Context> r10 = android.content.Context.class
                r13[r14] = r10
                java.lang.Class<java.lang.String[]> r10 = java.lang.String[].class
                r13[r18] = r10
                java.lang.Class<android.graphics.Rect> r10 = android.graphics.Rect.class
                r13[r19] = r10
                java.lang.Class<android.graphics.Bitmap> r10 = android.graphics.Bitmap.class
                r13[r20] = r10
                java.lang.Class<kotlin.jvm.functions.Function4> r10 = kotlin.jvm.functions.Function4.class
                r13[r21] = r10
                java.lang.Class r22 = java.lang.Void.TYPE
                r12 = 0
                r23 = 29057(0x7181, float:4.0718E-41)
                r10 = r36
                r24 = r13
                r13 = r23
                r14 = r24
                r15 = r22
                boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                if (r9 == 0) goto L_0x00c2
                java.lang.Object[] r9 = new java.lang.Object[r8]
                r10 = 0
                r9[r10] = r0
                r9[r16] = r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r39)
                r9[r17] = r0
                r11 = 3
                r9[r11] = r3
                r9[r18] = r4
                r9[r19] = r5
                r9[r20] = r6
                r9[r21] = r7
                com.meituan.robust.ChangeQuickRedirect r0 = f37582a
                r1 = 0
                r2 = 29057(0x7181, float:4.0718E-41)
                java.lang.Class[] r3 = new java.lang.Class[r8]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.ak> r4 = com.ss.android.ugc.aweme.commerce.service.models.ak.class
                r3[r10] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r3[r16] = r4
                java.lang.Class r4 = java.lang.Integer.TYPE
                r3[r17] = r4
                java.lang.Class<android.content.Context> r4 = android.content.Context.class
                r3[r11] = r4
                java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
                r3[r18] = r4
                java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
                r3[r19] = r4
                java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
                r3[r20] = r4
                java.lang.Class<kotlin.jvm.functions.Function4> r4 = kotlin.jvm.functions.Function4.class
                r3[r21] = r4
                java.lang.Class r4 = java.lang.Void.TYPE
                r37 = r9
                r38 = r36
                r39 = r0
                r40 = r1
                r41 = r2
                r42 = r3
                r43 = r4
                com.meituan.robust.PatchProxy.accessDispatch(r37, r38, r39, r40, r41, r42, r43)
                return
            L_0x00c2:
                r10 = 0
                r11 = 3
                java.lang.String r8 = "context"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r8)
                java.lang.String r8 = "selectedKeys"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r8)
                if (r0 == 0) goto L_0x00e1
                java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r8 = r0.f38189c
                if (r8 == 0) goto L_0x00e1
                java.lang.Object r8 = r8.get(r1)
                com.ss.android.ugc.aweme.commerce.service.models.z r8 = (com.ss.android.ugc.aweme.commerce.service.models.z) r8
                if (r8 == 0) goto L_0x00e1
                int r15 = r8.getStockNum()
                goto L_0x00e2
            L_0x00e1:
                r15 = 0
            L_0x00e2:
                r8 = 30
                if (r0 == 0) goto L_0x00fd
                java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r9 = r0.f38189c
                if (r9 == 0) goto L_0x00fd
                java.lang.Object r9 = r9.get(r1)
                com.ss.android.ugc.aweme.commerce.service.models.z r9 = (com.ss.android.ugc.aweme.commerce.service.models.z) r9
                if (r9 == 0) goto L_0x00fd
                java.lang.Integer r9 = r9.getUserLimit()
                if (r9 == 0) goto L_0x00fd
                int r9 = r9.intValue()
                goto L_0x00ff
            L_0x00fd:
                r9 = 30
            L_0x00ff:
                int r8 = java.lang.Math.min(r15, r8)
                int r8 = java.lang.Math.min(r8, r9)
                r9 = 2131561425(0x7f0d0bd1, float:1.874825E38)
                if (r2 != 0) goto L_0x0118
                com.ss.android.ugc.aweme.commerce.service.l.g$a r0 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                java.lang.Object[] r1 = new java.lang.Object[r10]
                java.lang.String r0 = r0.a(r3, r9, r1)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r3, (java.lang.String) r0)
                return
            L_0x0118:
                if (r2 <= r8) goto L_0x0129
                com.ss.android.ugc.aweme.commerce.service.l.g$a r0 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r1 = 2131559369(0x7f0d03c9, float:1.874408E38)
                java.lang.Object[] r2 = new java.lang.Object[r10]
                java.lang.String r0 = r0.a(r3, r1, r2)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r3, (java.lang.String) r0)
                return
            L_0x0129:
                r8 = 0
                if (r0 == 0) goto L_0x0131
                java.lang.String r12 = r0.i
                r19 = r12
                goto L_0x0133
            L_0x0131:
                r19 = r8
            L_0x0133:
                if (r0 == 0) goto L_0x013a
                java.lang.String r12 = r0.k
                r20 = r12
                goto L_0x013c
            L_0x013a:
                r20 = r8
            L_0x013c:
                if (r0 == 0) goto L_0x0151
                java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r12 = r0.f38189c
                if (r12 == 0) goto L_0x0151
                java.lang.Object r1 = r12.get(r1)
                com.ss.android.ugc.aweme.commerce.service.models.z r1 = (com.ss.android.ugc.aweme.commerce.service.models.z) r1
                if (r1 == 0) goto L_0x0151
                java.lang.String r1 = r1.getId()
                r21 = r1
                goto L_0x0153
            L_0x0151:
                r21 = r8
            L_0x0153:
                if (r0 == 0) goto L_0x0158
                java.lang.String r1 = r0.f38190d
                goto L_0x0159
            L_0x0158:
                r1 = r8
            L_0x0159:
                if (r0 == 0) goto L_0x015e
                java.lang.String r12 = r0.f38191e
                goto L_0x015f
            L_0x015e:
                r12 = r8
            L_0x015f:
                r13 = r19
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 != 0) goto L_0x031a
                r13 = r20
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 != 0) goto L_0x031a
                r13 = r21
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 != 0) goto L_0x031a
                r13 = r1
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 != 0) goto L_0x031a
                r13 = r12
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 == 0) goto L_0x0191
                goto L_0x031a
            L_0x0191:
                if (r0 == 0) goto L_0x027e
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.ab> r0 = r0.f38187a
                if (r0 == 0) goto L_0x027e
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r13 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r9)
                r8.<init>(r13)
                java.util.Collection r8 = (java.util.Collection) r8
                java.util.Iterator r0 = r0.iterator()
                r13 = 0
            L_0x01ab:
                boolean r14 = r0.hasNext()
                if (r14 == 0) goto L_0x0260
                java.lang.Object r14 = r0.next()
                int r15 = r13 + 1
                if (r13 >= 0) goto L_0x01bc
                kotlin.collections.CollectionsKt.throwIndexOverflow()
            L_0x01bc:
                com.ss.android.ugc.aweme.commerce.service.models.ab r14 = (com.ss.android.ugc.aweme.commerce.service.models.ab) r14
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = r14.getName()
                r10.append(r11)
                java.lang.String r11 = ":"
                r10.append(r11)
                java.util.List r11 = r14.getList()
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Collection r14 = (java.util.Collection) r14
                java.util.Iterator r11 = r11.iterator()
            L_0x01e0:
                boolean r18 = r11.hasNext()
                if (r18 == 0) goto L_0x0206
                java.lang.Object r9 = r11.next()
                r18 = r9
                com.ss.android.ugc.aweme.commerce.service.models.ac r18 = (com.ss.android.ugc.aweme.commerce.service.models.ac) r18
                r26 = r0
                java.lang.String r0 = r18.getId()
                r2 = r4[r13]
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
                if (r0 == 0) goto L_0x01ff
                r14.add(r9)
            L_0x01ff:
                r0 = r26
                r2 = r39
                r9 = 10
                goto L_0x01e0
            L_0x0206:
                r26 = r0
                java.util.List r14 = (java.util.List) r14
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r0 = new java.util.ArrayList
                r2 = 10
                int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r14, r2)
                r0.<init>(r9)
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.Iterator r9 = r14.iterator()
            L_0x021d:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x0231
                java.lang.Object r11 = r9.next()
                com.ss.android.ugc.aweme.commerce.service.models.ac r11 = (com.ss.android.ugc.aweme.commerce.service.models.ac) r11
                java.lang.String r11 = r11.getName()
                r0.add(r11)
                goto L_0x021d
            L_0x0231:
                java.util.List r0 = (java.util.List) r0
                r27 = r0
                java.lang.Iterable r27 = (java.lang.Iterable) r27
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 63
                r35 = 0
                java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r27, r28, r29, r30, r31, r32, r33, r34, r35)
                r10.append(r0)
                java.lang.String r0 = r10.toString()
                r8.add(r0)
                r13 = r15
                r0 = r26
                r2 = r39
                r9 = 10
                r10 = 0
                r11 = 3
                goto L_0x01ab
            L_0x0260:
                java.util.List r8 = (java.util.List) r8
                r25 = r8
                java.lang.Iterable r25 = (java.lang.Iterable) r25
                java.lang.String r0 = " "
                r26 = r0
                java.lang.CharSequence r26 = (java.lang.CharSequence) r26
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 62
                r33 = 0
                java.lang.String r8 = kotlin.collections.CollectionsKt.joinToString$default(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            L_0x027e:
                r23 = r8
                java.lang.String r24 = com.ss.android.common.applog.AppLog.getServerDeviceId()
                com.ss.android.ugc.aweme.commerce.preview.api.a r0 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c
                if (r1 != 0) goto L_0x028b
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x028b:
                if (r12 != 0) goto L_0x0290
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0290:
                com.ss.android.ugc.aweme.commerce.preview.pops.a.a r2 = new com.ss.android.ugc.aweme.commerce.preview.pops.a.a
                java.lang.String r22 = java.lang.String.valueOf(r39)
                r18 = r2
                r18.<init>(r19, r20, r21, r22, r23, r24)
                java.lang.String r2 = r2.a()
                r4 = 3
                java.lang.Object[] r8 = new java.lang.Object[r4]
                r9 = 0
                r8[r9] = r1
                r8[r16] = r12
                r8[r17] = r2
                com.meituan.robust.ChangeQuickRedirect r27 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a
                r28 = 0
                r29 = 28857(0x70b9, float:4.0437E-41)
                java.lang.Class[] r10 = new java.lang.Class[r4]
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r10[r9] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r10[r16] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r10[r17] = r4
                java.lang.Class<a.i> r31 = a.i.class
                r25 = r8
                r26 = r0
                r30 = r10
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r25, r26, r27, r28, r29, r30, r31)
                if (r4 == 0) goto L_0x02f8
                r4 = 3
                java.lang.Object[] r8 = new java.lang.Object[r4]
                r9 = 0
                r8[r9] = r1
                r8[r16] = r12
                r8[r17] = r2
                com.meituan.robust.ChangeQuickRedirect r27 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a
                r28 = 0
                r29 = 28857(0x70b9, float:4.0437E-41)
                java.lang.Class[] r1 = new java.lang.Class[r4]
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r9] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r16] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r17] = r2
                java.lang.Class<a.i> r31 = a.i.class
                r25 = r8
                r26 = r0
                r30 = r1
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r25, r26, r27, r28, r29, r30, r31)
                a.i r0 = (a.i) r0
                goto L_0x030d
            L_0x02f8:
                java.lang.String r0 = "promotionId"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
                java.lang.String r0 = "productId"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
                java.lang.String r0 = "skuInfo"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
                com.ss.android.ugc.aweme.commerce.preview.api.PreviewApi r0 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37315b
                a.i r0 = r0.addShopCart(r1, r12, r2)
            L_0x030d:
                com.ss.android.ugc.aweme.commerce.preview.pops.b$a$a r1 = new com.ss.android.ugc.aweme.commerce.preview.pops.b$a$a
                r1.<init>(r7, r5, r6, r3)
                a.g r1 = (a.g) r1
                java.util.concurrent.Executor r2 = a.i.f1052b
                r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r2)
                return
            L_0x031a:
                com.ss.android.ugc.aweme.commerce.service.l.g$a r0 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r0 = r0.a(r3, r9, r1)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r3, (java.lang.String) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.pops.b.a.a(com.ss.android.ugc.aweme.commerce.service.models.ak, java.lang.String, int, android.content.Context, java.lang.String[], android.graphics.Rect, android.graphics.Bitmap, kotlin.jvm.functions.Function4):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/SkuCheckResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.preview.pops.b$b  reason: collision with other inner class name */
    static final class C0482b<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.commerce.service.g.a.c, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37588a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f37589b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37590c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function4 f37591d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String[] f37592e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Function2 f37593f;
        final /* synthetic */ long g;

        C0482b(b bVar, String str, Function4 function4, String[] strArr, Function2 function2, long j) {
            this.f37589b = bVar;
            this.f37590c = str;
            this.f37591d = function4;
            this.f37592e = strArr;
            this.f37593f = function2;
            this.g = j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x01fd  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x020a  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0232  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0235  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0238  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x023b  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x02e4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r27) {
            /*
                r26 = this;
                r7 = r26
                r8 = r27
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37588a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r3 = 0
                r4 = 29061(0x7185, float:4.0723E-41)
                r1 = r26
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37588a
                r3 = 0
                r4 = 29061(0x7185, float:4.0723E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r1 = r26
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Void r0 = (java.lang.Void) r0
                return r0
            L_0x0039:
                java.lang.String r0 = "task"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
                boolean r0 = r27.d()
                r1 = 2131559306(0x7f0d038a, float:1.8743952E38)
                if (r0 != 0) goto L_0x0338
                java.lang.Object r0 = r27.e()
                if (r0 == 0) goto L_0x0338
                java.lang.Object r0 = r27.e()
                com.ss.android.ugc.aweme.commerce.service.g.a.c r0 = (com.ss.android.ugc.aweme.commerce.service.g.a.c) r0
                int r0 = r0.statusCode
                if (r0 != 0) goto L_0x0338
                java.lang.Object r0 = r27.e()
                com.ss.android.ugc.aweme.commerce.service.g.a.c r0 = (com.ss.android.ugc.aweme.commerce.service.g.a.c) r0
                int r0 = r0.f37969b
                if (r0 != 0) goto L_0x0338
                com.ss.android.ugc.aweme.commerce.preview.pops.b r0 = r7.f37589b
                android.view.View r0 = r0.g
                if (r0 == 0) goto L_0x006c
                r3 = 8
                r0.setVisibility(r3)
            L_0x006c:
                java.lang.Object r0 = r27.e()
                com.ss.android.ugc.aweme.commerce.service.g.a.c r0 = (com.ss.android.ugc.aweme.commerce.service.g.a.c) r0
                java.lang.String r0 = r0.f37968a
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x0324
                com.google.gson.Gson r0 = new com.google.gson.Gson
                r0.<init>()
                java.lang.Object r1 = r27.e()
                com.ss.android.ugc.aweme.commerce.service.g.a.c r1 = (com.ss.android.ugc.aweme.commerce.service.g.a.c) r1
                java.lang.String r1 = r1.f37968a
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.y> r3 = com.ss.android.ugc.aweme.commerce.service.models.y.class
                java.lang.Object r0 = r0.fromJson((java.lang.String) r1, (java.lang.Class<T>) r3)
                com.ss.android.ugc.aweme.commerce.service.models.y r0 = (com.ss.android.ugc.aweme.commerce.service.models.y) r0
                if (r0 == 0) goto L_0x00a8
                java.util.Map r1 = r0.getSkuList()
                if (r1 == 0) goto L_0x00a8
                java.lang.String r3 = r7.f37590c
                java.lang.Object r1 = r1.get(r3)
                com.ss.android.ugc.aweme.commerce.service.models.z r1 = (com.ss.android.ugc.aweme.commerce.service.models.z) r1
                if (r1 == 0) goto L_0x00a8
                int r1 = r1.getStockNum()
                goto L_0x00a9
            L_0x00a8:
                r1 = 0
            L_0x00a9:
                if (r1 <= 0) goto L_0x02e4
                kotlin.jvm.functions.Function4 r0 = r7.f37591d
                r1 = 2
                if (r0 == 0) goto L_0x010d
                com.ss.android.ugc.aweme.commerce.preview.pops.b r0 = r7.f37589b
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r0.f37580e
                android.view.View r0 = (android.view.View) r0
                android.graphics.Bitmap r18 = com.ss.android.ugc.aweme.commerce.service.l.d.a((android.view.View) r0)
                int[] r0 = new int[r1]
                com.ss.android.ugc.aweme.commerce.preview.pops.b r1 = r7.f37589b
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r1.f37580e
                r1.getLocationOnScreen(r0)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r3 = r0[r10]
                r1.left = r3
                r0 = r0[r9]
                r1.top = r0
                int r0 = r1.left
                com.ss.android.ugc.aweme.commerce.preview.pops.b r3 = r7.f37589b
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r3.f37580e
                int r3 = r3.getWidth()
                int r0 = r0 + r3
                r1.right = r0
                int r0 = r1.top
                com.ss.android.ugc.aweme.commerce.preview.pops.b r3 = r7.f37589b
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r3.f37580e
                int r3 = r3.getHeight()
                int r0 = r0 + r3
                r1.bottom = r0
                java.lang.String[] r0 = r7.f37592e
                if (r0 == 0) goto L_0x0396
                com.ss.android.ugc.aweme.commerce.preview.pops.b$a r11 = com.ss.android.ugc.aweme.commerce.preview.pops.b.j
                com.ss.android.ugc.aweme.commerce.preview.pops.b r0 = r7.f37589b
                com.ss.android.ugc.aweme.commerce.service.models.ak r12 = r0.h
                java.lang.String r13 = r7.f37590c
                com.ss.android.ugc.aweme.commerce.preview.pops.b r0 = r7.f37589b
                int r14 = r0.f37579d
                com.ss.android.ugc.aweme.commerce.preview.pops.b r0 = r7.f37589b
                android.content.Context r15 = r0.f37581f
                java.lang.String[] r0 = r7.f37592e
                kotlin.jvm.functions.Function4 r3 = r7.f37591d
                r16 = r0
                r17 = r1
                r19 = r3
                r11.a(r12, r13, r14, r15, r16, r17, r18, r19)
                goto L_0x0396
            L_0x010d:
                com.ss.android.ugc.aweme.commerce.preview.pops.b$a r0 = com.ss.android.ugc.aweme.commerce.preview.pops.b.j
                com.ss.android.ugc.aweme.commerce.preview.pops.b r3 = r7.f37589b
                com.ss.android.ugc.aweme.commerce.service.models.ak r3 = r3.h
                java.lang.String r4 = r7.f37590c
                com.ss.android.ugc.aweme.commerce.preview.pops.b r5 = r7.f37589b
                int r5 = r5.f37579d
                com.ss.android.ugc.aweme.commerce.preview.pops.b r6 = r7.f37589b
                com.ss.android.ugc.aweme.commerce.service.i.a r6 = r6.f37578c
                com.ss.android.ugc.aweme.commerce.preview.pops.b r8 = r7.f37589b
                android.content.Context r8 = r8.f37581f
                kotlin.jvm.functions.Function2 r11 = r7.f37593f
                com.ss.android.ugc.aweme.commerce.preview.pops.b r12 = r7.f37589b
                com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a r12 = r12.i
                r13 = 7
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r14[r10] = r3
                r14[r9] = r4
                java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
                r14[r1] = r15
                r15 = 3
                r14[r15] = r6
                r16 = 4
                r14[r16] = r8
                r17 = 5
                r14[r17] = r11
                r18 = 6
                r14[r18] = r12
                com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.commerce.preview.pops.b.a.f37582a
                r22 = 0
                r23 = 29054(0x717e, float:4.0713E-41)
                java.lang.Class[] r2 = new java.lang.Class[r13]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.ak> r19 = com.ss.android.ugc.aweme.commerce.service.models.ak.class
                r2[r10] = r19
                java.lang.Class<java.lang.String> r19 = java.lang.String.class
                r2[r9] = r19
                java.lang.Class r19 = java.lang.Integer.TYPE
                r2[r1] = r19
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.i.a> r19 = com.ss.android.ugc.aweme.commerce.service.i.a.class
                r2[r15] = r19
                java.lang.Class<android.content.Context> r19 = android.content.Context.class
                r2[r16] = r19
                java.lang.Class<kotlin.jvm.functions.Function2> r19 = kotlin.jvm.functions.Function2.class
                r2[r17] = r19
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a> r19 = com.ss.android.ugc.aweme.commercialize.utils.a.a.a.C0516a.class
                r2[r18] = r19
                java.lang.Class r25 = java.lang.Void.TYPE
                r19 = r14
                r20 = r0
                r24 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
                if (r2 == 0) goto L_0x01ba
                java.lang.Object[] r2 = new java.lang.Object[r13]
                r2[r10] = r3
                r2[r9] = r4
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r1] = r3
                r2[r15] = r6
                r2[r16] = r8
                r2[r17] = r11
                r2[r18] = r12
                com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.commerce.preview.pops.b.a.f37582a
                r22 = 0
                r23 = 29054(0x717e, float:4.0713E-41)
                java.lang.Class[] r3 = new java.lang.Class[r13]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.ak> r4 = com.ss.android.ugc.aweme.commerce.service.models.ak.class
                r3[r10] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r3[r9] = r4
                java.lang.Class r4 = java.lang.Integer.TYPE
                r3[r1] = r4
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.i.a> r1 = com.ss.android.ugc.aweme.commerce.service.i.a.class
                r3[r15] = r1
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                r3[r16] = r1
                java.lang.Class<kotlin.jvm.functions.Function2> r1 = kotlin.jvm.functions.Function2.class
                r3[r17] = r1
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a> r1 = com.ss.android.ugc.aweme.commercialize.utils.a.a.a.C0516a.class
                r3[r18] = r1
                java.lang.Class r25 = java.lang.Void.TYPE
                r19 = r2
                r20 = r0
                r24 = r3
                com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
                goto L_0x02d0
            L_0x01ba:
                java.lang.String r1 = "context"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r1)
                if (r3 == 0) goto L_0x01d2
                java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r1 = r3.f38189c
                if (r1 == 0) goto L_0x01d2
                java.lang.Object r1 = r1.get(r4)
                com.ss.android.ugc.aweme.commerce.service.models.z r1 = (com.ss.android.ugc.aweme.commerce.service.models.z) r1
                if (r1 == 0) goto L_0x01d2
                int r1 = r1.getStockNum()
                goto L_0x01d3
            L_0x01d2:
                r1 = 0
            L_0x01d3:
                r2 = 30
                if (r3 == 0) goto L_0x01ee
                java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r9 = r3.f38189c
                if (r9 == 0) goto L_0x01ee
                java.lang.Object r9 = r9.get(r4)
                com.ss.android.ugc.aweme.commerce.service.models.z r9 = (com.ss.android.ugc.aweme.commerce.service.models.z) r9
                if (r9 == 0) goto L_0x01ee
                java.lang.Integer r9 = r9.getUserLimit()
                if (r9 == 0) goto L_0x01ee
                int r9 = r9.intValue()
                goto L_0x01f0
            L_0x01ee:
                r9 = 30
            L_0x01f0:
                int r1 = java.lang.Math.min(r1, r2)
                int r1 = java.lang.Math.min(r1, r9)
                r2 = 2131561425(0x7f0d0bd1, float:1.874825E38)
                if (r5 != 0) goto L_0x020a
                com.ss.android.ugc.aweme.commerce.service.l.g$a r0 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                java.lang.Object[] r1 = new java.lang.Object[r10]
                java.lang.String r0 = r0.a(r8, r2, r1)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r8, (java.lang.String) r0)
                goto L_0x02d0
            L_0x020a:
                if (r5 <= r1) goto L_0x021c
                com.ss.android.ugc.aweme.commerce.service.l.g$a r0 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r1 = 2131559369(0x7f0d03c9, float:1.874408E38)
                java.lang.Object[] r2 = new java.lang.Object[r10]
                java.lang.String r0 = r0.a(r8, r1, r2)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r8, (java.lang.String) r0)
                goto L_0x02d0
            L_0x021c:
                if (r3 == 0) goto L_0x022f
                java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r1 = r3.f38189c
                if (r1 == 0) goto L_0x022f
                java.lang.Object r1 = r1.get(r4)
                com.ss.android.ugc.aweme.commerce.service.models.z r1 = (com.ss.android.ugc.aweme.commerce.service.models.z) r1
                if (r1 == 0) goto L_0x022f
                java.lang.String r1 = r1.getId()
                goto L_0x0230
            L_0x022f:
                r1 = 0
            L_0x0230:
                if (r3 == 0) goto L_0x0235
                java.lang.String r4 = r3.q
                goto L_0x0236
            L_0x0235:
                r4 = 0
            L_0x0236:
                if (r3 == 0) goto L_0x023b
                java.lang.String r9 = r3.r
                goto L_0x023c
            L_0x023b:
                r9 = 0
            L_0x023c:
                r13 = r1
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 != 0) goto L_0x02c5
                r13 = r4
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 == 0) goto L_0x0250
                goto L_0x02c5
            L_0x0250:
                com.ss.android.ugc.aweme.commerce.preview.pops.b$a r0 = (com.ss.android.ugc.aweme.commerce.preview.pops.b.a) r0
                boolean r2 = r0.a((java.lang.String) r9)
                if (r2 == 0) goto L_0x0280
                java.lang.String r0 = r0.a(r9, r1, r5)
                com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService> r9 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.class
                java.lang.Object r2 = r2.getService(r9)
                com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r2 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r2
                com.ss.android.ugc.aweme.miniapp_api.model.b$a r9 = new com.ss.android.ugc.aweme.miniapp_api.model.b$a
                r9.<init>()
                if (r3 == 0) goto L_0x0272
                java.lang.String r3 = r3.s
                goto L_0x0273
            L_0x0272:
                r3 = 0
            L_0x0273:
                com.ss.android.ugc.aweme.miniapp_api.model.b$a r3 = r9.b(r3)
                com.ss.android.ugc.aweme.miniapp_api.model.b r3 = r3.a()
                boolean r0 = r2.openMiniApp(r8, r0, r3)
                goto L_0x0281
            L_0x0280:
                r0 = 0
            L_0x0281:
                if (r0 != 0) goto L_0x02ba
                com.ss.android.common.util.i r0 = new com.ss.android.common.util.i
                r0.<init>(r4)
                java.lang.String r2 = "combo_id"
                r0.a((java.lang.String) r2, (java.lang.String) r1)
                java.lang.String r1 = "combo_num"
                r0.a((java.lang.String) r1, (int) r5)
                java.lang.String r13 = r0.toString()
                if (r6 == 0) goto L_0x029c
                android.support.v4.app.Fragment r2 = r6.f37974b
                r14 = r2
                goto L_0x029d
            L_0x029c:
                r14 = 0
            L_0x029d:
                r15 = r8
                android.app.Activity r15 = (android.app.Activity) r15
                if (r6 == 0) goto L_0x02ad
                java.lang.Integer r0 = r6.f37975c
                if (r0 == 0) goto L_0x02ad
                int r10 = r0.intValue()
                r19 = r10
                goto L_0x02af
            L_0x02ad:
                r19 = 0
            L_0x02af:
                java.lang.String r16 = ""
                r17 = 0
                r18 = 1
                r20 = r12
                com.ss.android.ugc.aweme.commerce.a.a((java.lang.String) r13, (android.support.v4.app.Fragment) r14, (android.app.Activity) r15, (java.lang.String) r16, (boolean) r17, (boolean) r18, (int) r19, (com.ss.android.ugc.aweme.commercialize.utils.a.a.a.C0516a) r20)
            L_0x02ba:
                if (r11 == 0) goto L_0x02d0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                r1 = 0
                r11.invoke(r0, r1)
                goto L_0x02d0
            L_0x02c5:
                com.ss.android.ugc.aweme.commerce.service.l.g$a r0 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                java.lang.Object[] r1 = new java.lang.Object[r10]
                java.lang.String r0 = r0.a(r8, r2, r1)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r8, (java.lang.String) r0)
            L_0x02d0:
                com.ss.android.ugc.aweme.commerce.service.l.c$a r9 = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a
                long r0 = android.os.SystemClock.uptimeMillis()
                long r2 = r7.g
                long r10 = r0 - r2
                r12 = 1
                r13 = 0
                r14 = 0
                r15 = 12
                com.ss.android.ugc.aweme.commerce.service.l.c.a.a((com.ss.android.ugc.aweme.commerce.service.l.c.a) r9, (long) r10, (boolean) r12, (java.lang.Integer) r13, (java.lang.String) r14, (int) r15)
                goto L_0x0396
            L_0x02e4:
                com.ss.android.ugc.aweme.commerce.preview.pops.b r1 = r7.f37589b
                com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout r1 = r1.f37577b
                if (r1 != 0) goto L_0x02ef
                java.lang.String r2 = "specItemGroupLayout"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            L_0x02ef:
                java.lang.String r2 = "newSku"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                r1.a(r0)
                com.ss.android.ugc.aweme.commerce.preview.pops.b r0 = r7.f37589b
                android.content.Context r0 = r0.f37581f
                com.ss.android.ugc.aweme.commerce.service.l.g$a r1 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                com.ss.android.ugc.aweme.commerce.preview.pops.b r2 = r7.f37589b
                android.content.Context r2 = r2.f37581f
                r3 = 2131559295(0x7f0d037f, float:1.874393E38)
                java.lang.Object[] r4 = new java.lang.Object[r10]
                java.lang.String r1 = r1.a(r2, r3, r4)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r0, (java.lang.String) r1)
                kotlin.jvm.functions.Function2 r0 = r7.f37593f
                if (r0 == 0) goto L_0x0396
                com.ss.android.ugc.aweme.commerce.service.l.c$a r8 = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a
                long r0 = android.os.SystemClock.uptimeMillis()
                long r2 = r7.g
                long r9 = r0 - r2
                r11 = 0
                r12 = 0
                java.lang.String r13 = "no stock"
                r14 = 4
                com.ss.android.ugc.aweme.commerce.service.l.c.a.a((com.ss.android.ugc.aweme.commerce.service.l.c.a) r8, (long) r9, (boolean) r11, (java.lang.Integer) r12, (java.lang.String) r13, (int) r14)
                goto L_0x0396
            L_0x0324:
                com.ss.android.ugc.aweme.commerce.preview.pops.b r0 = r7.f37589b
                android.content.Context r0 = r0.f37581f
                com.ss.android.ugc.aweme.commerce.service.l.g$a r2 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                com.ss.android.ugc.aweme.commerce.preview.pops.b r3 = r7.f37589b
                android.content.Context r3 = r3.f37581f
                java.lang.Object[] r4 = new java.lang.Object[r10]
                java.lang.String r1 = r2.a(r3, r1, r4)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r0, (java.lang.String) r1)
                goto L_0x0396
            L_0x0338:
                java.lang.Object r0 = r27.e()
                com.ss.android.ugc.aweme.commerce.service.g.a.c r0 = (com.ss.android.ugc.aweme.commerce.service.g.a.c) r0
                int r0 = r0.f37969b
                if (r0 != r9) goto L_0x0363
                com.ss.android.ugc.aweme.commerce.preview.pops.b r0 = r7.f37589b
                android.view.View r0 = r0.g
                if (r0 == 0) goto L_0x034b
                r0.setVisibility(r10)
            L_0x034b:
                kotlin.jvm.functions.Function2 r0 = r7.f37593f
                if (r0 == 0) goto L_0x0383
                com.ss.android.ugc.aweme.commerce.service.l.c$a r11 = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a
                long r2 = android.os.SystemClock.uptimeMillis()
                long r4 = r7.g
                long r12 = r2 - r4
                r14 = 0
                r15 = 0
                java.lang.String r16 = "no stock"
                r17 = 4
                com.ss.android.ugc.aweme.commerce.service.l.c.a.a((com.ss.android.ugc.aweme.commerce.service.l.c.a) r11, (long) r12, (boolean) r14, (java.lang.Integer) r15, (java.lang.String) r16, (int) r17)
                goto L_0x0383
            L_0x0363:
                kotlin.jvm.functions.Function2 r0 = r7.f37593f
                if (r0 == 0) goto L_0x0383
                com.ss.android.ugc.aweme.commerce.service.l.c$a r11 = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a
                long r2 = android.os.SystemClock.uptimeMillis()
                long r4 = r7.g
                long r12 = r2 - r4
                r14 = 0
                java.lang.Object r0 = r27.e()
                com.ss.android.ugc.aweme.commerce.service.g.a.c r0 = (com.ss.android.ugc.aweme.commerce.service.g.a.c) r0
                int r0 = r0.statusCode
                java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
                java.lang.String r16 = "result error"
                r11.a((long) r12, (boolean) r14, (java.lang.Integer) r15, (java.lang.String) r16)
            L_0x0383:
                com.ss.android.ugc.aweme.commerce.preview.pops.b r0 = r7.f37589b
                android.content.Context r0 = r0.f37581f
                com.ss.android.ugc.aweme.commerce.service.l.g$a r2 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                com.ss.android.ugc.aweme.commerce.preview.pops.b r3 = r7.f37589b
                android.content.Context r3 = r3.f37581f
                java.lang.Object[] r4 = new java.lang.Object[r10]
                java.lang.String r1 = r2.a(r3, r1, r4)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r0, (java.lang.String) r1)
            L_0x0396:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.pops.b.C0482b.then(a.i):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/pops/SkuController$renderWithParams$1", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemGroupLayout$ICheckedChangeListener;", "onCheckedChange", "", "checkIdArray", "", "", "([Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements SpecItemGroupLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f37595b;

        c(b bVar) {
            this.f37595b = bVar;
        }

        public final void a(@NotNull String[] strArr) {
            if (PatchProxy.isSupport(new Object[]{strArr}, this, f37594a, false, 29062, new Class[]{String[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{strArr}, this, f37594a, false, 29062, new Class[]{String[].class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(strArr, "checkIdArray");
            this.f37595b.f();
            this.f37595b.d();
            this.f37595b.e();
            this.f37595b.g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37596a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f37597b;

        d(b bVar) {
            this.f37597b = bVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37596a, false, 29063, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37596a, false, 29063, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f37597b.f37579d < this.f37597b.c()) {
                this.f37597b.f37579d++;
            }
            this.f37597b.d();
            this.f37597b.e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f37599b;

        e(b bVar) {
            this.f37599b = bVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37598a, false, 29064, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37598a, false, 29064, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f37599b.f37579d > 1) {
                b bVar = this.f37599b;
                bVar.f37579d--;
            }
            this.f37599b.d();
            this.f37599b.e();
        }
    }

    public final int b() {
        return this.f37579d;
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f37576a, false, 29043, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f37576a, false, 29043, new Class[0], Boolean.TYPE)).booleanValue();
        }
        SpecItemGroupLayout specItemGroupLayout = this.f37577b;
        if (specItemGroupLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("specItemGroupLayout");
        }
        String[] checkedIdArray = specItemGroupLayout.getCheckedIdArray();
        if (checkedIdArray == null) {
            return false;
        }
        for (String str : checkedIdArray) {
            if (str == null) {
                return false;
            }
        }
        return true;
    }

    public final int c() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f37576a, false, 29049, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37576a, false, 29049, new Class[0], Integer.TYPE)).intValue();
        } else if (!h()) {
            return 30;
        } else {
            SpecItemGroupLayout specItemGroupLayout = this.f37577b;
            if (specItemGroupLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("specItemGroupLayout");
            }
            Integer checkSkuStockCount = specItemGroupLayout.getCheckSkuStockCount();
            if (checkSkuStockCount != null) {
                i2 = checkSkuStockCount.intValue();
            }
            return Math.min(i2, 30);
        }
    }

    public final void e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f37576a, false, 29051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37576a, false, 29051, new Class[0], Void.TYPE);
            return;
        }
        if (h() && this.f37579d <= c()) {
            z = true;
        }
        this.k = z;
        Function1<Boolean, Unit> function1 = this.x;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.k));
        }
    }

    public final void f() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f37576a, false, 29052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37576a, false, 29052, new Class[0], Void.TYPE);
            return;
        }
        SpecItemGroupLayout specItemGroupLayout = this.f37577b;
        if (specItemGroupLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("specItemGroupLayout");
        }
        Integer checkSkuPrice = specItemGroupLayout.getCheckSkuPrice();
        if (checkSkuPrice != null) {
            i2 = checkSkuPrice.intValue();
        }
        if (i2 > 0) {
            this.l.setPriceText(j.a(i2));
        } else {
            this.l.setPriceText(this.u);
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f37576a, false, 29053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37576a, false, 29053, new Class[0], Void.TYPE);
            return;
        }
        SpecItemGroupLayout specItemGroupLayout = this.f37577b;
        if (specItemGroupLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("specItemGroupLayout");
        }
        String checkSkuImageUrl = specItemGroupLayout.getCheckSkuImageUrl();
        if (!TextUtils.isEmpty(checkSkuImageUrl)) {
            com.ss.android.ugc.aweme.base.c.a(this.f37580e, checkSkuImageUrl);
        } else {
            com.ss.android.ugc.aweme.base.c.b(this.f37580e, this.h.l);
        }
    }

    private final String i() {
        if (PatchProxy.isSupport(new Object[0], this, f37576a, false, 29046, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f37576a, false, 29046, new Class[0], String.class);
        }
        List arrayList = new ArrayList();
        SpecItemGroupLayout specItemGroupLayout = this.f37577b;
        if (specItemGroupLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("specItemGroupLayout");
        }
        String[] checkedIdArray = specItemGroupLayout.getCheckedIdArray();
        if (checkedIdArray != null) {
            int length = checkedIdArray.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                if (checkedIdArray[i2] == null && this.h.f38187a != null) {
                    List<ab> list = this.h.f38187a;
                    if (list == null) {
                        Intrinsics.throwNpe();
                    }
                    arrayList.add(list.get(i3).getName());
                }
                i2++;
                i3 = i4;
            }
        }
        if (!(!arrayList.isEmpty())) {
            return com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.f37581f, C0906R.string.zn, new Object[0]);
        }
        return com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.f37581f, C0906R.string.zo, CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f37576a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 29050(0x717a, float:4.0708E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f37576a
            r5 = 0
            r6 = 29050(0x717a, float:4.0708E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            boolean r1 = r9.v
            r2 = 8
            r3 = 1
            if (r1 == 0) goto L_0x004d
            r9.f37579d = r3
            android.widget.TextView r1 = r9.s
            int r3 = r9.f37579d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
            android.view.View r1 = r9.q
            r1.setVisibility(r2)
            android.view.View r1 = r9.r
            r1.setVisibility(r2)
            android.view.View r1 = r9.q
            r1.setEnabled(r0)
            android.view.View r1 = r9.r
            r2 = r1
            goto L_0x00e4
        L_0x004d:
            int r1 = r9.c()
            boolean r4 = r9.h()
            if (r4 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout r4 = r9.f37577b
            if (r4 != 0) goto L_0x0060
            java.lang.String r5 = "specItemGroupLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x0060:
            boolean r4 = r4.getCheckSkuIsActivity()
            if (r4 == 0) goto L_0x008a
            if (r1 <= 0) goto L_0x008a
            android.widget.TextView r2 = r9.t
            if (r2 == 0) goto L_0x006f
            r2.setVisibility(r0)
        L_0x006f:
            android.widget.TextView r2 = r9.t
            if (r2 == 0) goto L_0x0091
            android.content.Context r4 = r9.f37581f
            r5 = 2131562273(0x7f0d0f21, float:1.874997E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6[r0] = r7
            java.lang.String r4 = r4.getString(r5, r6)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setText(r4)
            goto L_0x0091
        L_0x008a:
            android.widget.TextView r4 = r9.t
            if (r4 == 0) goto L_0x0091
            r4.setVisibility(r2)
        L_0x0091:
            int r2 = r9.f37579d
            if (r3 <= r1) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            if (r2 <= r1) goto L_0x009a
            r9.f37579d = r1
        L_0x009a:
            android.view.View r2 = r9.q
            r2.setVisibility(r0)
            android.view.View r2 = r9.r
            r2.setVisibility(r0)
            android.widget.TextView r2 = r9.s
            int r4 = r9.f37579d
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setText(r4)
            android.view.View r2 = r9.q
            int r4 = r9.f37579d
            if (r4 > r3) goto L_0x00bb
            r4 = 2130838466(0x7f0203c2, float:1.7281915E38)
            goto L_0x00be
        L_0x00bb:
            r4 = 2130838465(0x7f0203c1, float:1.7281913E38)
        L_0x00be:
            r2.setBackgroundResource(r4)
            android.view.View r2 = r9.r
            int r4 = r9.f37579d
            if (r4 < r1) goto L_0x00cb
            r4 = 2130838468(0x7f0203c4, float:1.728192E38)
            goto L_0x00ce
        L_0x00cb:
            r4 = 2130838467(0x7f0203c3, float:1.7281917E38)
        L_0x00ce:
            r2.setBackgroundResource(r4)
            android.view.View r2 = r9.q
            int r4 = r9.f37579d
            if (r4 <= r3) goto L_0x00d9
            r4 = 1
            goto L_0x00da
        L_0x00d9:
            r4 = 0
        L_0x00da:
            r2.setEnabled(r4)
            android.view.View r2 = r9.r
            int r4 = r9.f37579d
            if (r4 >= r1) goto L_0x00e4
            r0 = 1
        L_0x00e4:
            r2.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.pops.b.d():void");
    }

    @Nullable
    public final String[] a() {
        if (PatchProxy.isSupport(new Object[0], this, f37576a, false, 29044, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, f37576a, false, 29044, new Class[0], String[].class);
        }
        SpecItemGroupLayout specItemGroupLayout = this.f37577b;
        if (specItemGroupLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("specItemGroupLayout");
        }
        return specItemGroupLayout.getCheckedIdArray();
    }

    public final void a(@Nullable Function2<? super Integer, ? super String, Unit> function2) {
        Function2<? super Integer, ? super String, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{function22}, this, f37576a, false, 29041, new Class[]{Function2.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function22}, this, f37576a, false, 29041, new Class[]{Function2.class}, Void.TYPE);
            return;
        }
        a(null, function22);
    }

    public final void a(@Nullable Function4<? super Integer, ? super String, ? super Rect, ? super Bitmap, Unit> function4) {
        Function4<? super Integer, ? super String, ? super Rect, ? super Bitmap, Unit> function42 = function4;
        if (PatchProxy.isSupport(new Object[]{function42}, this, f37576a, false, 29042, new Class[]{Function4.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function42}, this, f37576a, false, 29042, new Class[]{Function4.class}, Void.TYPE);
            return;
        }
        a(function42, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02df, code lost:
        if (r0.a() == false) goto L_0x038d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x046b  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.commerce.service.k.a a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.commerce.service.i.a r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f37576a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.i.a> r1 = com.ss.android.ugc.aweme.commerce.service.i.a.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.k.a> r6 = com.ss.android.ugc.aweme.commerce.service.k.a.class
            r3 = 0
            r4 = 29045(0x7175, float:4.0701E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0039
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f37576a
            r3 = 0
            r4 = 29045(0x7175, float:4.0701E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.i.a> r1 = com.ss.android.ugc.aweme.commerce.service.i.a.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.k.a> r6 = com.ss.android.ugc.aweme.commerce.service.k.a.class
            r1 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.commerce.service.k.a r0 = (com.ss.android.ugc.aweme.commerce.service.k.a) r0
            return r0
        L_0x0039:
            java.lang.String r0 = "skuPanelData"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            r7.f37578c = r8
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f37576a
            r3 = 0
            r4 = 29048(0x7178, float:4.0705E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0065
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f37576a
            r3 = 0
            r4 = 29048(0x7178, float:4.0705E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x04a7
        L_0x0065:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.f37580e
            com.ss.android.ugc.aweme.commerce.service.models.ak r1 = r7.h
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.l
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout r0 = new com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout
            android.content.Context r1 = r7.f37581f
            r0.<init>(r1)
            r7.f37577b = r0
            com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout r0 = r7.f37577b
            if (r0 != 0) goto L_0x0080
            java.lang.String r1 = "specItemGroupLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0080:
            com.ss.android.ugc.aweme.commerce.service.models.ak r1 = r7.h
            com.ss.android.ugc.aweme.commerce.service.models.aa r2 = r7.w
            if (r2 == 0) goto L_0x0089
            java.lang.String[] r2 = r2.f38171a
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            com.ss.android.ugc.aweme.commerce.service.i.a r4 = r7.f37578c
            if (r4 == 0) goto L_0x0095
            int r4 = r4.f37973a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0096
        L_0x0095:
            r4 = 0
        L_0x0096:
            r5 = 3
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r10] = r1
            r11[r9] = r2
            r6 = 2
            r11[r6] = r4
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout.f37641a
            r14 = 0
            r15 = 29199(0x720f, float:4.0917E-41)
            java.lang.Class[] r8 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.ak> r12 = com.ss.android.ugc.aweme.commerce.service.models.ak.class
            r8[r10] = r12
            java.lang.Class<java.lang.String[]> r12 = java.lang.String[].class
            r8[r9] = r12
            java.lang.Class<java.lang.Integer> r12 = java.lang.Integer.class
            r8[r6] = r12
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r8
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r8 == 0) goto L_0x00e3
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r10] = r1
            r11[r9] = r2
            r11[r6] = r4
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout.f37641a
            r14 = 0
            r15 = 29199(0x720f, float:4.0917E-41)
            java.lang.Class[] r1 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.ak> r2 = com.ss.android.ugc.aweme.commerce.service.models.ak.class
            r1[r10] = r2
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r1[r9] = r2
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r1[r6] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x029d
        L_0x00e3:
            java.lang.String r5 = "skuInfo"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r5)
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.ab> r5 = r1.f38187a
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x00f7
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r5 = 0
            goto L_0x00f8
        L_0x00f7:
            r5 = 1
        L_0x00f8:
            if (r5 != 0) goto L_0x029d
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.ab> r5 = r1.f38187a
            if (r5 != 0) goto L_0x0101
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0101:
            int r5 = r5.size()
            java.lang.String[] r8 = new java.lang.String[r5]
            r0.f37644d = r8
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r8 = r1.f38189c
            if (r8 == 0) goto L_0x029d
            java.util.Map<java.lang.String, java.lang.String> r8 = r1.f38188b
            if (r8 == 0) goto L_0x029d
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.ab> r8 = r1.f38187a
            if (r8 == 0) goto L_0x029d
            com.ss.android.ugc.aweme.commerce.preview.view.a r8 = new com.ss.android.ugc.aweme.commerce.preview.view.a
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r11 = r1.f38189c
            if (r11 != 0) goto L_0x011e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x011e:
            java.util.Map<java.lang.String, java.lang.String> r12 = r1.f38188b
            if (r12 != 0) goto L_0x0125
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0125:
            r8.<init>(r11, r12)
            r0.f37643c = r8
            if (r2 == 0) goto L_0x0132
            int r8 = r2.length
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0133
        L_0x0132:
            r8 = 0
        L_0x0133:
            if (r8 != 0) goto L_0x0136
            goto L_0x014e
        L_0x0136:
            int r8 = r8.intValue()
            if (r5 != r8) goto L_0x014e
            int r8 = r2.length
            r11 = 0
        L_0x013e:
            if (r11 >= r8) goto L_0x014e
            r12 = r2[r11]
            java.lang.String[] r13 = r0.f37644d
            if (r13 != 0) goto L_0x0149
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0149:
            r13[r11] = r12
            int r11 = r11 + 1
            goto L_0x013e
        L_0x014e:
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.ab> r8 = r1.f38187a
            r11 = 10
            if (r8 == 0) goto L_0x0248
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r11)
            r12.<init>(r13)
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.Iterator r8 = r8.iterator()
            r13 = 0
        L_0x0166:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x0248
            java.lang.Object r14 = r8.next()
            int r15 = r13 + 1
            if (r13 >= 0) goto L_0x0177
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x0177:
            com.ss.android.ugc.aweme.commerce.service.models.ab r14 = (com.ss.android.ugc.aweme.commerce.service.models.ab) r14
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            r3 = r16
            java.util.List r3 = (java.util.List) r3
            java.util.List r16 = r14.getList()
            java.util.Iterator r16 = r16.iterator()
        L_0x018a:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x01d5
            java.lang.Object r17 = r16.next()
            com.ss.android.ugc.aweme.commerce.service.models.ac r17 = (com.ss.android.ugc.aweme.commerce.service.models.ac) r17
            java.lang.String r18 = r17.getId()
            if (r18 == 0) goto L_0x01d0
            java.lang.String r18 = r17.getName()
            if (r18 == 0) goto L_0x01d0
            com.ss.android.ugc.aweme.commerce.preview.view.b$c r9 = new com.ss.android.ugc.aweme.commerce.preview.view.b$c
            java.lang.String r10 = r17.getId()
            if (r10 != 0) goto L_0x01ad
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01ad:
            java.lang.String r11 = r17.getName()
            if (r11 != 0) goto L_0x01b6
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01b6:
            r9.<init>(r10, r11)
            java.lang.String[] r10 = new java.lang.String[r5]
            java.lang.String r11 = r17.getId()
            r10[r13] = r11
            com.ss.android.ugc.aweme.commerce.preview.view.a r11 = r0.f37643c
            if (r11 == 0) goto L_0x01ca
            boolean r10 = r11.c(r10)
            goto L_0x01cb
        L_0x01ca:
            r10 = 0
        L_0x01cb:
            r9.f37661a = r10
            r3.add(r9)
        L_0x01d0:
            r9 = 1
            r10 = 0
            r11 = 10
            goto L_0x018a
        L_0x01d5:
            com.ss.android.ugc.aweme.commerce.preview.view.b r9 = new com.ss.android.ugc.aweme.commerce.preview.view.b
            android.content.Context r10 = r0.f37642b
            if (r10 != 0) goto L_0x01de
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01de:
            boolean r11 = r1.d()
            r9.<init>(r10, r4, r11)
            com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout$c r10 = new com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout$c
            r10.<init>(r0, r5, r4, r1)
            com.ss.android.ugc.aweme.commerce.preview.view.b$b r10 = (com.ss.android.ugc.aweme.commerce.preview.view.b.C0484b) r10
            r9.setOnItemCheckedListener(r10)
            java.lang.String r10 = r14.getName()
            r9.a((java.lang.String) r10, (java.util.List<com.ss.android.ugc.aweme.commerce.preview.view.b.c>) r3, (int) r13)
            java.util.ArrayList<com.ss.android.ugc.aweme.commerce.preview.view.b> r3 = r0.f37645e
            r3.add(r9)
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r3 = new android.support.v7.widget.LinearLayoutCompat$LayoutParams
            r10 = -1
            r11 = -2
            r3.<init>((int) r10, (int) r11)
            if (r13 != 0) goto L_0x0225
            if (r4 != 0) goto L_0x0207
            goto L_0x0219
        L_0x0207:
            int r10 = r4.intValue()
            if (r10 != r6) goto L_0x0219
            android.content.Context r10 = r0.getContext()
            r11 = 1096810496(0x41600000, float:14.0)
            float r10 = com.bytedance.common.utility.UIUtils.dip2Px(r10, r11)
            int r10 = (int) r10
            goto L_0x0230
        L_0x0219:
            android.content.Context r10 = r0.getContext()
            r11 = 1099956224(0x41900000, float:18.0)
            float r10 = com.bytedance.common.utility.UIUtils.dip2Px(r10, r11)
            int r10 = (int) r10
            goto L_0x0230
        L_0x0225:
            android.content.Context r10 = r0.getContext()
            r11 = 1094713344(0x41400000, float:12.0)
            float r10 = com.bytedance.common.utility.UIUtils.dip2Px(r10, r11)
            int r10 = (int) r10
        L_0x0230:
            r3.topMargin = r10
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r9.setLayoutParams(r3)
            android.view.View r9 = (android.view.View) r9
            r0.addView(r9)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            r12.add(r3)
            r13 = r15
            r9 = 1
            r10 = 0
            r11 = 10
            goto L_0x0166
        L_0x0248:
            if (r2 == 0) goto L_0x029d
            int r3 = r2.length
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.ab> r4 = r1.f38187a
            if (r4 == 0) goto L_0x0254
            int r10 = r4.size()
            goto L_0x0255
        L_0x0254:
            r10 = 0
        L_0x0255:
            if (r3 < r10) goto L_0x0259
            r3 = 1
            goto L_0x025a
        L_0x0259:
            r3 = 0
        L_0x025a:
            if (r3 == 0) goto L_0x025e
            r3 = r2
            goto L_0x025f
        L_0x025e:
            r3 = 0
        L_0x025f:
            if (r3 == 0) goto L_0x029d
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.ab> r1 = r1.f38187a
            if (r1 == 0) goto L_0x029d
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x0279:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x029d
            r1.next()
            int r5 = r4 + 1
            if (r4 >= 0) goto L_0x0289
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x0289:
            r6 = r2[r4]
            java.util.ArrayList<com.ss.android.ugc.aweme.commerce.preview.view.b> r8 = r0.f37645e
            java.lang.Object r8 = r8.get(r4)
            com.ss.android.ugc.aweme.commerce.preview.view.b r8 = (com.ss.android.ugc.aweme.commerce.preview.view.b) r8
            r8.a((int) r4, (java.lang.String) r6)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r3.add(r4)
            r4 = r5
            goto L_0x0279
        L_0x029d:
            com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout r0 = r7.f37577b
            if (r0 != 0) goto L_0x02a6
            java.lang.String r1 = "specItemGroupLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x02a6:
            com.ss.android.ugc.aweme.commerce.preview.pops.b$c r1 = new com.ss.android.ugc.aweme.commerce.preview.pops.b$c
            r1.<init>(r7)
            com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout$b r1 = (com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout.b) r1
            r0.setCheckedChangeListener(r1)
            android.widget.LinearLayout r0 = r7.p
            com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout r1 = r7.f37577b
            if (r1 != 0) goto L_0x02bb
            java.lang.String r2 = "specItemGroupLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02bb:
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
            com.ss.android.ugc.aweme.commerce.service.models.ak r0 = r7.h
            boolean r0 = r0.d()
            r1 = 8
            if (r0 == 0) goto L_0x038d
            com.ss.android.ugc.aweme.commerce.service.models.ak r0 = r7.h
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x02e3
            com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout r0 = r7.f37577b
            if (r0 != 0) goto L_0x02db
            java.lang.String r2 = "specItemGroupLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02db:
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x02e3
            goto L_0x038d
        L_0x02e3:
            com.ss.android.ugc.aweme.commerce.service.models.ak r0 = r7.h
            boolean r0 = r0.a()
            r2 = 18
            r3 = 1108082688(0x420c0000, float:35.0)
            if (r0 == 0) goto L_0x032f
            android.widget.TextView r0 = r7.n
            if (r0 == 0) goto L_0x02f7
            r4 = 0
            r0.setVisibility(r4)
        L_0x02f7:
            android.widget.TextView r0 = r7.n
            if (r0 == 0) goto L_0x0309
            android.content.Context r4 = r7.f37581f
            r5 = 2131561794(0x7f0d0d42, float:1.8748999E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
        L_0x0309:
            android.text.SpannableString r0 = new android.text.SpannableString
            com.ss.android.ugc.aweme.commerce.service.models.ak r4 = r7.h
            java.lang.String r4 = r4.m
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.<init>(r4)
            android.text.style.LeadingMarginSpan$Standard r4 = new android.text.style.LeadingMarginSpan$Standard
            android.content.Context r5 = r7.f37581f
            int r3 = com.ss.android.ugc.aweme.framework.e.b.a(r5, r3)
            r5 = 0
            r4.<init>(r3, r5)
            int r3 = r0.length()
            com.ss.android.ugc.aweme.commerce.preview.pops.c.a(r0, r4, r5, r3, r2)
            android.widget.TextView r2 = r7.m
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            goto L_0x039f
        L_0x032f:
            r5 = 0
            com.ss.android.ugc.aweme.commerce.service.models.ak r0 = r7.h
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x037a
            android.widget.TextView r0 = r7.n
            if (r0 == 0) goto L_0x033f
            r0.setVisibility(r5)
        L_0x033f:
            android.widget.TextView r0 = r7.n
            if (r0 == 0) goto L_0x0354
            com.ss.android.ugc.aweme.commerce.service.models.ak r4 = r7.h
            com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment r4 = r4.v
            if (r4 == 0) goto L_0x034e
            java.lang.String r4 = r4.getShowLabel()
            goto L_0x034f
        L_0x034e:
            r4 = 0
        L_0x034f:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
        L_0x0354:
            android.text.SpannableString r0 = new android.text.SpannableString
            com.ss.android.ugc.aweme.commerce.service.models.ak r4 = r7.h
            java.lang.String r4 = r4.m
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.<init>(r4)
            android.text.style.LeadingMarginSpan$Standard r4 = new android.text.style.LeadingMarginSpan$Standard
            android.content.Context r5 = r7.f37581f
            int r3 = com.ss.android.ugc.aweme.framework.e.b.a(r5, r3)
            r5 = 0
            r4.<init>(r3, r5)
            int r3 = r0.length()
            com.ss.android.ugc.aweme.commerce.preview.pops.c.a(r0, r4, r5, r3, r2)
            android.widget.TextView r2 = r7.m
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            goto L_0x039f
        L_0x037a:
            android.widget.TextView r0 = r7.n
            if (r0 == 0) goto L_0x0381
            r0.setVisibility(r1)
        L_0x0381:
            android.widget.TextView r0 = r7.m
            com.ss.android.ugc.aweme.commerce.service.models.ak r2 = r7.h
            java.lang.String r2 = r2.m
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            goto L_0x039f
        L_0x038d:
            android.widget.TextView r0 = r7.n
            if (r0 == 0) goto L_0x0394
            r0.setVisibility(r1)
        L_0x0394:
            android.widget.TextView r0 = r7.m
            com.ss.android.ugc.aweme.commerce.service.models.ak r2 = r7.h
            java.lang.String r2 = r2.m
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
        L_0x039f:
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r0 = r7.l
            com.ss.android.ugc.aweme.commerce.preview.pops.b$a r2 = j
            com.ss.android.ugc.aweme.commerce.service.models.ak r3 = r7.h
            int r3 = r3.n
            java.lang.String r2 = r2.a((int) r3)
            r0.setPriceText(r2)
            android.view.View r0 = r7.g
            if (r0 == 0) goto L_0x042a
            r2 = 2131171002(0x7f0716ba, float:1.7956378E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "this.findViewById(R.id.tv_sell_out)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.widget.LinearLayout r3 = r7.o
            boolean r3 = r3 instanceof com.ss.android.ugc.aweme.commerce.service.widgets.InterceptTouchLinearLayout
            if (r3 == 0) goto L_0x03cb
            android.widget.LinearLayout r3 = r7.o
            com.ss.android.ugc.aweme.commerce.service.widgets.InterceptTouchLinearLayout r3 = (com.ss.android.ugc.aweme.commerce.service.widgets.InterceptTouchLinearLayout) r3
            goto L_0x03cc
        L_0x03cb:
            r3 = 0
        L_0x03cc:
            com.ss.android.ugc.aweme.commerce.service.models.ak r4 = r7.h
            boolean r4 = r4.d()
            if (r4 != 0) goto L_0x03ef
            r4 = 0
            r0.setVisibility(r4)
            android.content.Context r0 = r0.getContext()
            r1 = 2131559359(0x7f0d03bf, float:1.874406E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            if (r3 == 0) goto L_0x042a
            r0 = 1
            r3.setIntercept(r0)
            goto L_0x042a
        L_0x03ef:
            com.ss.android.ugc.aweme.commerce.service.models.ak r4 = r7.h
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x0421
            com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout r4 = r7.f37577b
            if (r4 != 0) goto L_0x0400
            java.lang.String r5 = "specItemGroupLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x0400:
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x0421
            r4 = 0
            r0.setVisibility(r4)
            android.content.Context r0 = r0.getContext()
            r1 = 2131559360(0x7f0d03c0, float:1.8744062E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            if (r3 == 0) goto L_0x042a
            r0 = 1
            r3.setIntercept(r0)
            goto L_0x042a
        L_0x0421:
            r0.setVisibility(r1)
            if (r3 == 0) goto L_0x042a
            r0 = 0
            r3.setIntercept(r0)
        L_0x042a:
            android.view.View r0 = r7.r
            com.ss.android.ugc.aweme.commerce.preview.pops.b$d r1 = new com.ss.android.ugc.aweme.commerce.preview.pops.b$d
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.view.View r0 = r7.q
            com.ss.android.ugc.aweme.commerce.preview.pops.b$e r1 = new com.ss.android.ugc.aweme.commerce.preview.pops.b$e
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.ss.android.ugc.aweme.commerce.service.models.aa r0 = r7.w
            if (r0 == 0) goto L_0x0453
            com.ss.android.ugc.aweme.commerce.service.models.aa r0 = r7.w
            int r0 = r0.f38172b
            r1 = 1
            if (r0 <= r1) goto L_0x0453
            com.ss.android.ugc.aweme.commerce.service.models.aa r0 = r7.w
            int r0 = r0.f38172b
            r7.f37579d = r0
        L_0x0453:
            r19.d()
            r19.f()
            r19.e()
            r19.g()
            com.ss.android.ugc.aweme.commerce.preview.pops.b$a r0 = j
            com.ss.android.ugc.aweme.commerce.service.models.ak r1 = r7.h
            java.lang.String r1 = r1.r
            boolean r0 = r0.a((java.lang.String) r1)
            if (r0 == 0) goto L_0x04a7
            com.ss.android.ugc.aweme.commerce.preview.pops.b$a r0 = j
            com.ss.android.ugc.aweme.commerce.service.models.ak r1 = r7.h
            java.lang.String r1 = r1.r
            com.ss.android.ugc.aweme.commerce.service.models.ak r2 = r7.h
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r2 = r2.f38189c
            if (r2 == 0) goto L_0x0491
            com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout r3 = r7.f37577b
            if (r3 != 0) goto L_0x0480
            java.lang.String r4 = "specItemGroupLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0480:
            java.lang.String r3 = r3.getCheckedId()
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.commerce.service.models.z r2 = (com.ss.android.ugc.aweme.commerce.service.models.z) r2
            if (r2 == 0) goto L_0x0491
            java.lang.String r3 = r2.getId()
            goto L_0x0492
        L_0x0491:
            r3 = 0
        L_0x0492:
            int r2 = r7.f37579d
            java.lang.String r0 = r0.a(r1, r3, r2)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService> r2 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r1 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r1
            r1.preloadMiniApp(r0)
        L_0x04a7:
            r0 = r7
            com.ss.android.ugc.aweme.commerce.service.k.a r0 = (com.ss.android.ugc.aweme.commerce.service.k.a) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.pops.b.a(com.ss.android.ugc.aweme.commerce.service.i.a):com.ss.android.ugc.aweme.commerce.service.k.a");
    }

    private final void a(Function4<? super Integer, ? super String, ? super Rect, ? super Bitmap, Unit> function4, Function2<? super Integer, ? super String, Unit> function2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{function4, function2}, this, f37576a, false, 29047, new Class[]{Function4.class, Function2.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function4, function2}, this, f37576a, false, 29047, new Class[]{Function4.class, Function2.class}, Void.TYPE);
        } else if (!h()) {
            UIUtils.displayToast(this.f37581f, i());
        } else {
            SpecItemGroupLayout specItemGroupLayout = this.f37577b;
            if (specItemGroupLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("specItemGroupLayout");
            }
            String checkedId = specItemGroupLayout.getCheckedId();
            if (checkedId != null) {
                SpecItemGroupLayout specItemGroupLayout2 = this.f37577b;
                if (specItemGroupLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("specItemGroupLayout");
                }
                String[] checkedIdArray = specItemGroupLayout2.getCheckedIdArray();
                long uptimeMillis = SystemClock.uptimeMillis();
                String str = this.h.f38190d;
                if (str == null) {
                    str = "";
                }
                String str2 = this.h.f38191e;
                if (str2 == null) {
                    str2 = "";
                }
                if (function4 == null) {
                    i2 = 1;
                }
                i<com.ss.android.ugc.aweme.commerce.service.g.a.c> a2 = com.ss.android.ugc.aweme.commerce.preview.api.a.a(str, str2, i2);
                C0482b bVar = new C0482b(this, checkedId, function4, checkedIdArray, function2, uptimeMillis);
                a2.a((a.g<TResult, TContinuationResult>) bVar, i.f1052b);
            }
        }
    }

    @SuppressLint({"TooManyMethodParam"})
    public b(@NotNull RemoteImageView remoteImageView, @NotNull Context context, @NotNull PriceView priceView, @NotNull TextView textView, @Nullable TextView textView2, @Nullable LinearLayout linearLayout, @NotNull LinearLayout linearLayout2, @Nullable View view, @NotNull View view2, @NotNull View view3, @NotNull TextView textView3, @Nullable TextView textView4, @NotNull ak akVar, @NotNull String str, boolean z, @Nullable aa aaVar, @Nullable Function1<? super Boolean, Unit> function1, @Nullable a.C0516a aVar) {
        TextView textView5 = textView;
        LinearLayout linearLayout3 = linearLayout2;
        View view4 = view2;
        View view5 = view3;
        TextView textView6 = textView3;
        ak akVar2 = akVar;
        String str2 = str;
        Intrinsics.checkParameterIsNotNull(remoteImageView, "avatar");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(priceView, "popPriceView");
        Intrinsics.checkParameterIsNotNull(textView5, "titleView");
        Intrinsics.checkParameterIsNotNull(linearLayout3, "skuBox");
        Intrinsics.checkParameterIsNotNull(view4, "minusBtn");
        Intrinsics.checkParameterIsNotNull(view5, "plusBtn");
        Intrinsics.checkParameterIsNotNull(textView6, "selectCount");
        Intrinsics.checkParameterIsNotNull(akVar2, "skuInfo");
        Intrinsics.checkParameterIsNotNull(str2, "defaultPrice");
        this.f37580e = remoteImageView;
        this.f37581f = context;
        this.l = priceView;
        this.m = textView5;
        this.n = textView2;
        this.o = linearLayout;
        this.p = linearLayout3;
        this.g = view;
        this.q = view4;
        this.r = view5;
        this.s = textView6;
        this.t = textView4;
        this.h = akVar2;
        this.u = str2;
        this.v = z;
        this.w = aaVar;
        this.x = function1;
        this.i = aVar;
    }
}
