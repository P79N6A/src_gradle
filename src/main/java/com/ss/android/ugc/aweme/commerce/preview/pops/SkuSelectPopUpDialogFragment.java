package com.ss.android.ugc.aweme.commerce.preview.pops;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.service.l.c;
import com.ss.android.ugc.aweme.commerce.service.models.aa;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.commerce.service.pop.FixedDialog;
import com.ss.android.ugc.aweme.commerce.service.widgets.PriceView;
import com.ss.android.ugc.aweme.commercialize.utils.a.a.a;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 h2\u00020\u0001:\u0001hB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010G\u001a\u00020\u000bH\u0002J\u0006\u0010H\u001a\u00020\u000bJ\u0012\u0010I\u001a\u00020\u000b2\b\u0010J\u001a\u0004\u0018\u00010KH\u0002J\u0012\u0010L\u001a\u00020\u000b2\b\u0010M\u001a\u0004\u0018\u00010KH\u0016J\u0012\u0010N\u001a\u00020\u000b2\b\u0010M\u001a\u0004\u0018\u00010KH\u0017J\u0012\u0010O\u001a\u00020P2\b\u0010M\u001a\u0004\u0018\u00010KH\u0016J&\u0010Q\u001a\u0004\u0018\u00010\u00152\u0006\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010M\u001a\u0004\u0018\u00010KH\u0016J\u0012\u0010V\u001a\u00020\u000b2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\u0016\u0010Y\u001a\u00020\u000b2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001dJ\u0010\u0010[\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\\\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u001fJ\u0010\u0010^\u001a\u00020\u000b2\b\u0010_\u001a\u0004\u0018\u00010CJP\u0010`\u001a\u00020\u000b2*\u0010\u0005\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\u00062\u001c\u0010+\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010,J\u0010\u0010a\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010?J\u001c\u0010b\u001a\u00020\u000b2\b\u0010c\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010f\u001a\u00020\u000b2\b\u0010g\u001a\u0004\u0018\u00010dR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R4\u0010\u0005\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b!\u0010\u0017R\u001b\u0010#\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b$\u0010\u0017R\u001b\u0010&\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b(\u0010)R$\u0010+\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b/\u0010\u0017R\u001b\u00101\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b5\u0010\u0011\u001a\u0004\b3\u00104R\u001b\u00106\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b8\u0010\u0011\u001a\u0004\b7\u00104R\u001b\u00109\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\b=\u0010\u0011\u001a\u0004\b;\u0010<R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010D\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\bF\u0010\u0011\u001a\u0004\bE\u00104¨\u0006i"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/pops/SkuSelectPopUpDialogFragment;", "Landroid/support/design/widget/BottomSheetDialogFragment;", "()V", "adWebUrlData", "Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/AdWebPage$AdWebUrlData;", "addCartListener", "Lkotlin/Function4;", "", "", "Landroid/graphics/Rect;", "Landroid/graphics/Bitmap;", "", "avatar", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getAvatar", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "avatar$delegate", "Lkotlin/Lazy;", "buySingleOnly", "", "closeBtn", "Landroid/view/View;", "getCloseBtn", "()Landroid/view/View;", "closeBtn$delegate", "defaultPrice", "forAddCart", "Ljava/lang/Boolean;", "logCB", "Lkotlin/Function0;", "mClickStartTime", "", "minusBtn", "getMinusBtn", "minusBtn$delegate", "plusBtn", "getPlusBtn", "plusBtn$delegate", "popPriceView", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;", "getPopPriceView", "()Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;", "popPriceView$delegate", "purchaseListener", "Lkotlin/Function2;", "rootView", "selectConfirm", "getSelectConfirm", "selectConfirm$delegate", "selectCount", "Landroid/widget/TextView;", "getSelectCount", "()Landroid/widget/TextView;", "selectCount$delegate", "selectPopTitle", "getSelectPopTitle", "selectPopTitle$delegate", "skuBox", "Landroid/widget/LinearLayout;", "getSkuBox", "()Landroid/widget/LinearLayout;", "skuBox$delegate", "skuInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "skuLogic", "Lcom/ss/android/ugc/aweme/commerce/service/sku/SkuLogic;", "skuPanelState", "Lcom/ss/android/ugc/aweme/commerce/service/models/SkuPanelState;", "userLimitText", "getUserLimitText", "userLimitText$delegate", "bindOtherRelationShips", "checkParams", "initParams", "bundle", "Landroid/os/Bundle;", "onActivityCreated", "savedInstanceState", "onCreate", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onPressConfirm", "cb", "setAdWebUrlData", "setClickStartTime", "clickStartTime", "setInitSkuPanelStoreModel", "skuStoreModel", "setPopupListener", "setUISkuInfo", "show", "manager", "Landroid/support/v4/app/FragmentManager;", "tag", "showDialog", "fragmentManager", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SkuSelectPopUpDialogFragment extends BottomSheetDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37535a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f37536b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuSelectPopUpDialogFragment.class), "skuBox", "getSkuBox()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuSelectPopUpDialogFragment.class), "avatar", "getAvatar()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuSelectPopUpDialogFragment.class), "selectPopTitle", "getSelectPopTitle()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuSelectPopUpDialogFragment.class), "popPriceView", "getPopPriceView()Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuSelectPopUpDialogFragment.class), "plusBtn", "getPlusBtn()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuSelectPopUpDialogFragment.class), "minusBtn", "getMinusBtn()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuSelectPopUpDialogFragment.class), "selectCount", "getSelectCount()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuSelectPopUpDialogFragment.class), "selectConfirm", "getSelectConfirm()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuSelectPopUpDialogFragment.class), "closeBtn", "getCloseBtn()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuSelectPopUpDialogFragment.class), "userLimitText", "getUserLimitText()Landroid/widget/TextView;"))};
    public static final a m = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public ak f37537c;

    /* renamed from: d  reason: collision with root package name */
    public a.C0516a f37538d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f37539e = Boolean.FALSE;

    /* renamed from: f  reason: collision with root package name */
    public aa f37540f;
    public com.ss.android.ugc.aweme.commerce.service.k.a g;
    public View h;
    public Function4<? super Integer, ? super String, ? super Rect, ? super Bitmap, Unit> i;
    public Function2<? super Integer, ? super String, Unit> j;
    public Function0<Unit> k;
    public long l;
    private String n;
    private boolean o;
    private final Lazy p = LazyKt.lazy(new n(this));
    private final Lazy q = LazyKt.lazy(new b(this));
    private final Lazy r = LazyKt.lazy(new m(this));
    private final Lazy s = LazyKt.lazy(new j(this));
    private final Lazy t = LazyKt.lazy(new i(this));
    private final Lazy u = LazyKt.lazy(new f(this));
    private final Lazy v = LazyKt.lazy(new l(this));
    private final Lazy w = LazyKt.lazy(new k(this));
    private final Lazy x = LazyKt.lazy(new e(this));
    private final Lazy y = LazyKt.lazy(new o(this));
    private HashMap z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0001\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000e2*\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00150\u00122\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001bH\u0007¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/pops/SkuSelectPopUpDialogFragment$Companion;", "", "()V", "KEY_BUNDLE_BUY_SINGLE_ONLY", "", "KEY_BUNDLE_DEFAULT_PRICE", "KEY_BUNDLE_FOR_ADD_CART", "THRESHOLD", "", "VALUE_500_L", "", "popUp", "Lcom/ss/android/ugc/aweme/commerce/preview/pops/SkuSelectPopUpDialogFragment;", "forAddCart", "", "defaultPrice", "buySingleOnly", "addCartListener", "Lkotlin/Function4;", "Landroid/graphics/Rect;", "Landroid/graphics/Bitmap;", "", "purchaseListener", "Lkotlin/Function2;", "skuPanelState", "Lcom/ss/android/ugc/aweme/commerce/service/models/SkuPanelState;", "logCB", "Lkotlin/Function0;", "(Ljava/lang/Boolean;Ljava/lang/String;ZLkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lcom/ss/android/ugc/aweme/commerce/service/models/SkuPanelState;Lkotlin/jvm/functions/Function0;)Lcom/ss/android/ugc/aweme/commerce/preview/pops/SkuSelectPopUpDialogFragment;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37541a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuSelectPopUpDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            super(0);
            this.this$0 = skuSelectPopUpDialogFragment;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29090, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) SkuSelectPopUpDialogFragment.a(this.this$0).findViewById(C0906R.id.cn_);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29090, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuSelectPopUpDialogFragment f37543b;

        c(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            this.f37543b = skuSelectPopUpDialogFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37542a, false, 29091, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37542a, false, 29091, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37543b.dismissAllowingStateLoss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuSelectPopUpDialogFragment f37545b;

        d(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            this.f37545b = skuSelectPopUpDialogFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37544a, false, 29092, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37544a, false, 29092, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f37545b.a().isEnabled() && !com.ss.android.ugc.aweme.c.a.a.a(view, 500)) {
                Function0<Unit> function0 = this.f37545b.k;
                if (function0 != null) {
                    function0.invoke();
                }
                if (Intrinsics.areEqual((Object) this.f37545b.f37539e, (Object) Boolean.TRUE)) {
                    final long uptimeMillis = SystemClock.uptimeMillis();
                    com.ss.android.ugc.aweme.commerce.service.k.a aVar = this.f37545b.g;
                    if (aVar != null) {
                        aVar.a((Function4<? super Integer, ? super String, ? super Rect, ? super Bitmap, Unit>) new Function4<Integer, String, Rect, Bitmap, Unit>(this) {
                            public static ChangeQuickRedirect changeQuickRedirect;
                            final /* synthetic */ d this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                invoke(((Number) obj).intValue(), (String) obj2, (Rect) obj3, (Bitmap) obj4);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i, @Nullable String str, @Nullable Rect rect, @Nullable Bitmap bitmap) {
                                Rect rect2 = rect;
                                Bitmap bitmap2 = bitmap;
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, rect2, bitmap2}, this, changeQuickRedirect, false, 29093, new Class[]{Integer.TYPE, String.class, Rect.class, Bitmap.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, rect2, bitmap2}, this, changeQuickRedirect, false, 29093, new Class[]{Integer.TYPE, String.class, Rect.class, Bitmap.class}, Void.TYPE);
                                    return;
                                }
                                com.ss.android.ugc.aweme.commerce.service.l.c.f37989a.a(SystemClock.uptimeMillis() - uptimeMillis);
                                Function4<? super Integer, ? super String, ? super Rect, ? super Bitmap, Unit> function4 = this.this$0.f37545b.i;
                                if (function4 != null) {
                                    function4.invoke(Integer.valueOf(i), null, rect2, bitmap2);
                                }
                                this.this$0.f37545b.dismissAllowingStateLoss();
                            }
                        });
                    }
                } else {
                    com.ss.android.ugc.aweme.commerce.service.k.a aVar2 = this.f37545b.g;
                    if (aVar2 != null) {
                        aVar2.a((Function2<? super Integer, ? super String, Unit>) new Function2<Integer, String, Unit>(this) {
                            public static ChangeQuickRedirect changeQuickRedirect;
                            final /* synthetic */ d this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke(((Number) obj).intValue(), (String) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i, @Nullable String str) {
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 29094, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 29094, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                                    return;
                                }
                                this.this$0.f37545b.dismissAllowingStateLoss();
                            }
                        });
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuSelectPopUpDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            super(0);
            this.this$0 = skuSelectPopUpDialogFragment;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29095, new Class[0], View.class)) {
                return SkuSelectPopUpDialogFragment.a(this.this$0).findViewById(C0906R.id.wf);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29095, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuSelectPopUpDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            super(0);
            this.this$0 = skuSelectPopUpDialogFragment;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29096, new Class[0], View.class)) {
                return SkuSelectPopUpDialogFragment.a(this.this$0).findViewById(C0906R.id.cn6);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29096, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, k = 3, mv = {1, 1, 15})
    static final class g implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37546a;

        /* renamed from: b  reason: collision with root package name */
        public static final g f37547b = new g();

        g() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f37546a, false, 29097, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f37546a, false, 29097, new Class[]{DialogInterface.class}, Void.TYPE);
            } else if (dialogInterface != null) {
                FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C0906R.id.a3z);
                if (frameLayout != null) {
                    frameLayout.getLayoutParams().height = com.ss.android.ugc.aweme.commerce.service.l.j.f38031b;
                    frameLayout.setLayoutParams(frameLayout.getLayoutParams());
                    final BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                    Intrinsics.checkExpressionValueIsNotNull(from, "behavior");
                    from.setPeekHeight(com.ss.android.ugc.aweme.commerce.service.l.j.f38031b);
                    from.setSkipCollapsed(true);
                    from.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f37548a;

                        public final void onSlide(@NotNull View view, float f2) {
                            View view2 = view;
                            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f37548a, false, 29099, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f37548a, false, 29099, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                                return;
                            }
                            Intrinsics.checkParameterIsNotNull(view2, "bottomSheet");
                        }

                        public final void onStateChanged(@NotNull View view, int i) {
                            View view2 = view;
                            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, this, f37548a, false, 29098, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, this, f37548a, false, 29098, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            Intrinsics.checkParameterIsNotNull(view2, "bottomSheet");
                            if (i == 1) {
                                BottomSheetBehavior bottomSheetBehavior = from;
                                Intrinsics.checkExpressionValueIsNotNull(bottomSheetBehavior, "behavior");
                                bottomSheetBehavior.setState(3);
                            }
                        }
                    });
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.design.widget.BottomSheetDialog");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "enableSubmit", "", "invoke", "com/ss/android/ugc/aweme/commerce/preview/pops/SkuSelectPopUpDialogFragment$onCreateView$1$1"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuSelectPopUpDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            super(1);
            this.this$0 = skuSelectPopUpDialogFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            int i;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 29100, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 29100, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            View a2 = this.this$0.a();
            if (z) {
                i = 2130838507;
            } else {
                i = 2130838419;
            }
            a2.setBackgroundResource(i);
            this.this$0.a().setEnabled(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuSelectPopUpDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            super(0);
            this.this$0 = skuSelectPopUpDialogFragment;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29101, new Class[0], View.class)) {
                return SkuSelectPopUpDialogFragment.a(this.this$0).findViewById(C0906R.id.cn9);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29101, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<PriceView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuSelectPopUpDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            super(0);
            this.this$0 = skuSelectPopUpDialogFragment;
        }

        public final PriceView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29102, new Class[0], PriceView.class)) {
                return (PriceView) SkuSelectPopUpDialogFragment.a(this.this$0).findViewById(C0906R.id.d1f);
            }
            return (PriceView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29102, new Class[0], PriceView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuSelectPopUpDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            super(0);
            this.this$0 = skuSelectPopUpDialogFragment;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29103, new Class[0], TextView.class)) {
                return (TextView) SkuSelectPopUpDialogFragment.a(this.this$0).findViewById(C0906R.id.cmx);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29103, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuSelectPopUpDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            super(0);
            this.this$0 = skuSelectPopUpDialogFragment;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29104, new Class[0], TextView.class)) {
                return (TextView) SkuSelectPopUpDialogFragment.a(this.this$0).findViewById(C0906R.id.cmy);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29104, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuSelectPopUpDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            super(0);
            this.this$0 = skuSelectPopUpDialogFragment;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29105, new Class[0], TextView.class)) {
                return (TextView) SkuSelectPopUpDialogFragment.a(this.this$0).findViewById(C0906R.id.cnc);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29105, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuSelectPopUpDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            super(0);
            this.this$0 = skuSelectPopUpDialogFragment;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29106, new Class[0], LinearLayout.class)) {
                return (LinearLayout) SkuSelectPopUpDialogFragment.a(this.this$0).findViewById(C0906R.id.crt);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29106, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class o extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuSelectPopUpDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
            super(0);
            this.this$0 = skuSelectPopUpDialogFragment;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29107, new Class[0], TextView.class)) {
                return (TextView) SkuSelectPopUpDialogFragment.a(this.this$0).findViewById(C0906R.id.d22);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29107, new Class[0], TextView.class);
        }
    }

    public final View a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29072, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29072, new Class[0], View.class);
        } else {
            value = this.w.getValue();
        }
        return (View) value;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29087, new Class[0], Void.TYPE);
            return;
        }
        if (this.z != null) {
            this.z.clear();
        }
    }

    public static final /* synthetic */ View a(SkuSelectPopUpDialogFragment skuSelectPopUpDialogFragment) {
        View view = skuSelectPopUpDialogFragment.h;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }

    private final void a(Bundle bundle) {
        Boolean bool;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37535a, false, 29079, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f37535a, false, 29079, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        String str = null;
        if (bundle != null) {
            bool = Boolean.valueOf(bundle.getBoolean("args_for_add_cart"));
        } else {
            bool = null;
        }
        this.f37539e = bool;
        if (bundle != null) {
            str = bundle.getString("args_default_price");
        }
        this.n = str;
        if (bundle != null) {
            z2 = bundle.getBoolean("args_buy_single_only");
        }
        this.o = z2;
    }

    @SuppressLint({"useChinaStyleVersion"})
    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37535a, false, 29076, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f37535a, false, 29076, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(0, C0906R.style.qw);
        if (bundle == null) {
            a(getArguments());
        } else {
            a(bundle);
        }
        if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29077, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29077, new Class[0], Void.TYPE);
            return;
        }
        if (this.f37537c == null) {
            dismiss();
        }
    }

    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37535a, false, 29075, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f37535a, false, 29075, new Class[]{Bundle.class}, Dialog.class);
        }
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        return new FixedDialog(context, getTheme());
    }

    public final void onDismiss(@Nullable DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f37535a, false, 29085, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f37535a, false, 29085, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.service.k.a aVar = this.g;
        if (aVar != null) {
            aa aaVar = this.f37540f;
            if (aaVar != null) {
                String[] a2 = aVar.a();
                int b2 = aVar.b();
                if (a2 != null) {
                    aaVar.f38171a = a2;
                }
                aaVar.f38172b = b2;
            }
        }
        super.onDismiss(dialogInterface);
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37535a, false, 29082, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f37535a, false, 29082, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        getDialog().setOnShowListener(g.f37547b);
        c.a aVar = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a;
        long uptimeMillis = SystemClock.uptimeMillis() - this.l;
        if (PatchProxy.isSupport(new Object[]{new Long(uptimeMillis)}, aVar, c.a.f37990a, false, 29968, new Class[]{Long.TYPE}, Void.TYPE)) {
            c.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{new Long(uptimeMillis)}, aVar2, c.a.f37990a, false, 29968, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", uptimeMillis);
        com.ss.android.ugc.aweme.base.n.a("aweme_commerce_seeding_sku_dialog_display_time", jSONObject, new JSONObject());
    }

    public final void show(@Nullable FragmentManager fragmentManager, @Nullable String str) {
        Fragment fragment;
        if (PatchProxy.isSupport(new Object[]{fragmentManager, str}, this, f37535a, false, 29084, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, str}, this, f37535a, false, 29084, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
            return;
        }
        if (fragmentManager != null) {
            try {
                fragment = fragmentManager.findFragmentByTag(str);
            } catch (Exception unused) {
                return;
            }
        } else {
            fragment = null;
        }
        if (fragment != null) {
            fragmentManager.beginTransaction().remove(fragment).commit();
        } else {
            super.show(fragmentManager, str);
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f37535a, false, 29080, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f37535a, false, 29080, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        View inflate = layoutInflater2.inflate(C0906R.layout.a2k, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…pop_up, container, false)");
        this.h = inflate;
        if (getContext() != null) {
            ak akVar = this.f37537c;
            if (akVar != null) {
                if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29066, new Class[0], RemoteImageView.class)) {
                    value2 = PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29066, new Class[0], RemoteImageView.class);
                } else {
                    value2 = this.q.getValue();
                }
                RemoteImageView remoteImageView = (RemoteImageView) value2;
                Context context = getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
                if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29068, new Class[0], PriceView.class)) {
                    value3 = PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29068, new Class[0], PriceView.class);
                } else {
                    value3 = this.s.getValue();
                }
                PriceView priceView = (PriceView) value3;
                if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29067, new Class[0], TextView.class)) {
                    value4 = PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29067, new Class[0], TextView.class);
                } else {
                    value4 = this.r.getValue();
                }
                TextView textView = (TextView) value4;
                if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29065, new Class[0], LinearLayout.class)) {
                    value5 = PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29065, new Class[0], LinearLayout.class);
                } else {
                    value5 = this.p.getValue();
                }
                LinearLayout linearLayout = (LinearLayout) value5;
                if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29070, new Class[0], View.class)) {
                    value6 = PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29070, new Class[0], View.class);
                } else {
                    value6 = this.u.getValue();
                }
                View view = (View) value6;
                if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29069, new Class[0], View.class)) {
                    value7 = PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29069, new Class[0], View.class);
                } else {
                    value7 = this.t.getValue();
                }
                View view2 = (View) value7;
                if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29071, new Class[0], TextView.class)) {
                    value8 = PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29071, new Class[0], TextView.class);
                } else {
                    value8 = this.v.getValue();
                }
                TextView textView2 = (TextView) value8;
                if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29074, new Class[0], TextView.class)) {
                    value9 = PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29074, new Class[0], TextView.class);
                } else {
                    value9 = this.y.getValue();
                }
                TextView textView3 = (TextView) value9;
                String str = this.n;
                if (str == null) {
                    str = "";
                }
                b bVar = new b(remoteImageView, context, priceView, textView, null, null, linearLayout, null, view, view2, textView2, textView3, akVar, str, this.o, this.f37540f, new h(this), this.f37538d);
                this.g = bVar;
                com.ss.android.ugc.aweme.commerce.service.k.a aVar = this.g;
                if (aVar != null) {
                    aVar.a(new com.ss.android.ugc.aweme.commerce.service.i.a(0, null, 100, 3));
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29081, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29081, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f37535a, false, 29073, new Class[0], View.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f37535a, false, 29073, new Class[0], View.class);
            } else {
                value = this.x.getValue();
            }
            ((View) value).setOnClickListener(new c(this));
            a().setOnClickListener(new d(this));
        }
        View view3 = this.h;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view3;
    }
}
