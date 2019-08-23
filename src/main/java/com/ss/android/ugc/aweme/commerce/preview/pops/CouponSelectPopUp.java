package com.ss.android.ugc.aweme.commerce.preview.pops;

import a.i;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
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
import android.widget.ScrollView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.service.l.j;
import com.ss.android.ugc.aweme.commerce.service.models.aj;
import com.ss.android.ugc.aweme.commerce.service.pop.FixedDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\"\u001a\u00020 2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J\b\u0010#\u001a\u00020 H\u0002J\u0012\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J$\u0010'\u001a\u00020 2\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001dH\u0002J\u0012\u0010)\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0017J\u0012\u0010*\u001a\u00020+2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010,\u001a\u0004\u0018\u00010\u00132\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0018\u00101\u001a\u00020 2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001fH\u0002J\b\u00105\u001a\u00020 H\u0002J\u001c\u00106\u001a\u00020 2\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010:\u001a\u00020 H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/pops/CouponSelectPopUp;", "Landroid/support/design/widget/BottomSheetDialogFragment;", "()V", "canApplyCoupons", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceGoodCoupon;", "canUseCoupons", "containerScrollView", "Landroid/widget/ScrollView;", "getContainerScrollView", "()Landroid/widget/ScrollView;", "containerScrollView$delegate", "Lkotlin/Lazy;", "couponBox", "Landroid/widget/LinearLayout;", "getCouponBox", "()Landroid/widget/LinearLayout;", "couponBox$delegate", "finishBtn", "Landroid/view/View;", "getFinishBtn", "()Landroid/view/View;", "finishBtn$delegate", "loadingView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "getLoadingView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "loadingView$delegate", "logCB", "Lkotlin/Function2;", "", "", "", "rootView", "bindData", "hideLoading", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onConfirm", "cb", "onCreate", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "renderWithCouponUIModel", "couponUIModel", "Lcom/ss/android/ugc/aweme/commerce/service/models/UICouponModel;", "isBottom", "renderWithParams", "show", "manager", "Landroid/support/v4/app/FragmentManager;", "tag", "showLoading", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CouponSelectPopUp extends BottomSheetDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37520a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f37521b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CouponSelectPopUp.class), "couponBox", "getCouponBox()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CouponSelectPopUp.class), "finishBtn", "getFinishBtn()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CouponSelectPopUp.class), "loadingView", "getLoadingView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CouponSelectPopUp.class), "containerScrollView", "getContainerScrollView()Landroid/widget/ScrollView;"))};
    public static final a g = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    List<com.ss.android.ugc.aweme.commerce.service.models.f> f37522c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    List<com.ss.android.ugc.aweme.commerce.service.models.f> f37523d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public Function2<? super String, ? super Boolean, Unit> f37524e;

    /* renamed from: f  reason: collision with root package name */
    public View f37525f;
    private final Lazy h = LazyKt.lazy(new c(this));
    private final Lazy i = LazyKt.lazy(new d(this));
    private final Lazy j = LazyKt.lazy(new e(this));
    private final Lazy k = LazyKt.lazy(new b(this));
    private HashMap l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/pops/CouponSelectPopUp$Companion;", "", "()V", "PRODUCT_ID", "", "PROMOTION_ID", "TAG_COUPON_SELECT_INFO", "popUp", "", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "promotionId", "productId", "logCB", "Lkotlin/Function2;", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37526a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ScrollView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<ScrollView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CouponSelectPopUp this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CouponSelectPopUp couponSelectPopUp) {
            super(0);
            this.this$0 = couponSelectPopUp;
        }

        public final ScrollView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29016, new Class[0], ScrollView.class)) {
                return (ScrollView) CouponSelectPopUp.a(this.this$0).findViewById(C0906R.id.wn);
            }
            return (ScrollView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29016, new Class[0], ScrollView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CouponSelectPopUp this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CouponSelectPopUp couponSelectPopUp) {
            super(0);
            this.this$0 = couponSelectPopUp;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29017, new Class[0], LinearLayout.class)) {
                return (LinearLayout) CouponSelectPopUp.a(this.this$0).findViewById(C0906R.id.we);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29017, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CouponSelectPopUp this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CouponSelectPopUp couponSelectPopUp) {
            super(0);
            this.this$0 = couponSelectPopUp;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29018, new Class[0], View.class)) {
                return CouponSelectPopUp.a(this.this$0).findViewById(C0906R.id.cmx);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29018, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<DmtStatusView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CouponSelectPopUp this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CouponSelectPopUp couponSelectPopUp) {
            super(0);
            this.this$0 = couponSelectPopUp;
        }

        public final DmtStatusView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29019, new Class[0], DmtStatusView.class)) {
                return (DmtStatusView) CouponSelectPopUp.a(this.this$0).findViewById(C0906R.id.wk);
            }
            return (DmtStatusView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29019, new Class[0], DmtStatusView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, k = 3, mv = {1, 1, 15})
    static final class f implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37527a;

        /* renamed from: b  reason: collision with root package name */
        public static final f f37528b = new f();

        f() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f37527a, false, 29020, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f37527a, false, 29020, new Class[]{DialogInterface.class}, Void.TYPE);
            } else if (dialogInterface != null) {
                FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C0906R.id.a3z);
                if (frameLayout != null) {
                    frameLayout.getLayoutParams().height = j.f38031b;
                    frameLayout.setLayoutParams(frameLayout.getLayoutParams());
                    final BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                    Intrinsics.checkExpressionValueIsNotNull(from, "behavior");
                    from.setPeekHeight(j.f38031b);
                    from.setSkipCollapsed(true);
                    from.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f37529a;

                        public final void onSlide(@NotNull View view, float f2) {
                            View view2 = view;
                            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f37529a, false, 29022, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f37529a, false, 29022, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                                return;
                            }
                            Intrinsics.checkParameterIsNotNull(view2, "bottomSheet");
                        }

                        public final void onStateChanged(@NotNull View view, int i) {
                            View view2 = view;
                            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, this, f37529a, false, 29021, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, this, f37529a, false, 29021, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ShopCouponResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class g<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.commerce.service.g.a.b, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37531a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CouponSelectPopUp f37532b;

        g(CouponSelectPopUp couponSelectPopUp) {
            this.f37532b = couponSelectPopUp;
        }

        public final /* synthetic */ Object then(i iVar) {
            List<com.ss.android.ugc.aweme.commerce.service.models.f> list;
            List<com.ss.android.ugc.aweme.commerce.service.models.f> list2;
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f37531a, false, 29023, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f37531a, false, 29023, new Class[]{i.class}, Void.class);
            }
            CouponSelectPopUp couponSelectPopUp = this.f37532b;
            if (PatchProxy.isSupport(new Object[0], couponSelectPopUp, CouponSelectPopUp.f37520a, false, 29000, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], couponSelectPopUp, CouponSelectPopUp.f37520a, false, 29000, new Class[0], Void.TYPE);
            } else {
                couponSelectPopUp.a().setVisibility(8);
                couponSelectPopUp.b().setVisibility(0);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
            if (iVar.d() || iVar.e() == null || ((com.ss.android.ugc.aweme.commerce.service.g.a.b) iVar.e()).statusCode != 0) {
                UIUtils.displayToast(this.f37532b.getContext(), (int) C0906R.string.xn);
            } else {
                CouponSelectPopUp couponSelectPopUp2 = this.f37532b;
                com.ss.android.ugc.aweme.commerce.service.g.a.b bVar = (com.ss.android.ugc.aweme.commerce.service.g.a.b) iVar.e();
                if (bVar != null) {
                    list = bVar.f37966a;
                } else {
                    list = null;
                }
                com.ss.android.ugc.aweme.commerce.service.g.a.b bVar2 = (com.ss.android.ugc.aweme.commerce.service.g.a.b) iVar.e();
                if (bVar2 != null) {
                    list2 = bVar2.f37967b;
                } else {
                    list2 = null;
                }
                if (PatchProxy.isSupport(new Object[]{list, list2}, couponSelectPopUp2, CouponSelectPopUp.f37520a, false, 28998, new Class[]{List.class, List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list, list2}, couponSelectPopUp2, CouponSelectPopUp.f37520a, false, 28998, new Class[]{List.class, List.class}, Void.TYPE);
                } else {
                    if (list2 == null) {
                        list2 = new ArrayList<>();
                    }
                    couponSelectPopUp2.f37522c = list2;
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    couponSelectPopUp2.f37523d = list;
                    if ((!couponSelectPopUp2.f37522c.isEmpty()) || (!couponSelectPopUp2.f37523d.isEmpty())) {
                        couponSelectPopUp2.c();
                    }
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37533a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CouponSelectPopUp f37534b;

        h(CouponSelectPopUp couponSelectPopUp) {
            this.f37534b = couponSelectPopUp;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37533a, false, 29024, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37533a, false, 29024, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37534b.dismissAllowingStateLoss();
        }
    }

    private final LinearLayout d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37520a, false, 29006, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37520a, false, 29006, new Class[0], LinearLayout.class);
        } else {
            value = this.h.getValue();
        }
        return (LinearLayout) value;
    }

    /* access modifiers changed from: package-private */
    public final DmtStatusView a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37520a, false, 29008, new Class[0], DmtStatusView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37520a, false, 29008, new Class[0], DmtStatusView.class);
        } else {
            value = this.j.getValue();
        }
        return (DmtStatusView) value;
    }

    /* access modifiers changed from: package-private */
    public final ScrollView b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37520a, false, 29009, new Class[0], ScrollView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37520a, false, 29009, new Class[0], ScrollView.class);
        } else {
            value = this.k.getValue();
        }
        return (ScrollView) value;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f37520a, false, 29013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37520a, false, 29013, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null) {
            this.l.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        Object value;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f37520a, false, 29010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37520a, false, 29010, new Class[0], Void.TYPE);
            return;
        }
        ArrayList<com.ss.android.ugc.aweme.commerce.service.models.f> arrayList = new ArrayList<>();
        arrayList.addAll(this.f37523d);
        arrayList.addAll(this.f37522c);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        int size = arrayList.size();
        int i2 = 0;
        for (com.ss.android.ugc.aweme.commerce.service.models.f fVar : arrayList) {
            boolean z2 = true;
            i2++;
            if (i2 <= this.f37523d.size()) {
                z = true;
            } else {
                z = false;
            }
            booleanRef.element = z;
            if (booleanRef.element) {
                aj a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(getContext(), fVar, true, true);
                Intrinsics.checkExpressionValueIsNotNull(a2, "CommerceUtils.translateC…text, coupon, true, true)");
                if (i2 != size) {
                    z2 = false;
                }
                a(a2, z2);
            } else {
                aj a3 = com.ss.android.ugc.aweme.commerce.service.l.d.a(getContext(), fVar, false, true);
                Intrinsics.checkExpressionValueIsNotNull(a3, "CommerceUtils.translateC…ext, coupon, false, true)");
                if (i2 != size) {
                    z2 = false;
                }
                a(a3, z2);
            }
            String couponMetaId = fVar.getCouponMetaId();
            if (couponMetaId != null) {
                Function2<? super String, ? super Boolean, Unit> function2 = this.f37524e;
                if (function2 != null) {
                    function2.invoke(couponMetaId, Boolean.FALSE);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f37520a, false, 29007, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37520a, false, 29007, new Class[0], View.class);
        } else {
            value = this.i.getValue();
        }
        ((View) value).setOnClickListener(new h(this));
    }

    public static final /* synthetic */ View a(CouponSelectPopUp couponSelectPopUp) {
        View view = couponSelectPopUp.f37525f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37520a, false, 29004, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f37520a, false, 29004, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        getDialog().setOnShowListener(f.f37528b);
    }

    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37520a, false, 29001, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f37520a, false, 29001, new Class[]{Bundle.class}, Dialog.class);
        }
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        return new FixedDialog(context, getTheme());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        if (r2 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
        if (r1 == null) goto L_0x004d;
     */
    @android.annotation.SuppressLint({"useChinaStyleVersion"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f37520a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 29002(0x714a, float:4.064E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f37520a
            r3 = 0
            r4 = 29002(0x714a, float:4.064E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0034:
            super.onCreate(r18)
            r0 = 2131493542(0x7f0c02a6, float:1.8610567E38)
            r7.setStyle(r9, r0)
            com.ss.android.ugc.aweme.commerce.preview.api.a r0 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c
            android.os.Bundle r1 = r17.getArguments()
            if (r1 == 0) goto L_0x004d
            java.lang.String r2 = "PROMOTION_ID"
            java.lang.String r1 = r1.getString(r2)
            if (r1 != 0) goto L_0x004f
        L_0x004d:
            java.lang.String r1 = ""
        L_0x004f:
            android.os.Bundle r2 = r17.getArguments()
            if (r2 == 0) goto L_0x005d
            java.lang.String r3 = "PRODUCT_ID"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L_0x005f
        L_0x005d:
            java.lang.String r2 = ""
        L_0x005f:
            r3 = 2
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r9] = r1
            r10[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a
            r13 = 0
            r14 = 28856(0x70b8, float:4.0436E-41)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r9] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r8] = r5
            java.lang.Class<a.i> r16 = a.i.class
            r11 = r0
            r15 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x009f
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r9] = r1
            r10[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a
            r13 = 0
            r14 = 28856(0x70b8, float:4.0436E-41)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r9] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r8] = r2
            java.lang.Class<a.i> r16 = a.i.class
            r11 = r0
            r15 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            a.i r0 = (a.i) r0
            goto L_0x00af
        L_0x009f:
            java.lang.String r0 = "promotionId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            java.lang.String r0 = "productId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            com.ss.android.ugc.aweme.commerce.preview.api.PreviewApi r0 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37315b
            a.i r0 = r0.shopCouponNew(r1, r2)
        L_0x00af:
            com.ss.android.ugc.aweme.commerce.preview.pops.CouponSelectPopUp$g r1 = new com.ss.android.ugc.aweme.commerce.preview.pops.CouponSelectPopUp$g
            r1.<init>(r7)
            a.g r1 = (a.g) r1
            java.util.concurrent.Executor r2 = a.i.f1052b
            r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.pops.CouponSelectPopUp.onCreate(android.os.Bundle):void");
    }

    public final void show(@Nullable FragmentManager fragmentManager, @Nullable String str) {
        Fragment fragment;
        if (PatchProxy.isSupport(new Object[]{fragmentManager, str}, this, f37520a, false, 29005, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, str}, this, f37520a, false, 29005, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
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

    private final void a(aj ajVar, boolean z) {
        aj ajVar2 = ajVar;
        if (PatchProxy.isSupport(new Object[]{ajVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f37520a, false, 29011, new Class[]{aj.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ajVar2, Byte.valueOf(z)}, this, f37520a, false, 29011, new Class[]{aj.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, AdvanceSetting.NETWORK_TYPE);
            a a2 = new a(ajVar2, context).a(d());
            a2.a();
            a2.a(this.f37524e);
            d().addView(a2.b());
            if (z) {
                ViewGroup.LayoutParams layoutParams = a2.b().getLayoutParams();
                if (layoutParams != null) {
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin += 8;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
            return;
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f37520a, false, 29003, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f37520a, false, 29003, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0906R.layout.a2i, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…pop_up, container, false)");
        this.f37525f = inflate;
        a().setBuilder(DmtStatusView.a.a(getContext()));
        if (PatchProxy.isSupport(new Object[0], this, f37520a, false, 28999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37520a, false, 28999, new Class[0], Void.TYPE);
        } else {
            b().setVisibility(8);
            a().setVisibility(0);
            a().d();
        }
        View view = this.f37525f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }
}
