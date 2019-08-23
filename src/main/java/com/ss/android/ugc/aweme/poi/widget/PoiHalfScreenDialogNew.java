package com.ss.android.ugc.aweme.poi.widget;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.c.a;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.ad;
import com.ss.android.ugc.aweme.poi.model.ae;
import com.ss.android.ugc.aweme.poi.model.af;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.model.u;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity;
import com.ss.android.ugc.aweme.poi.ui.o;
import com.ss.android.ugc.aweme.u.aa;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 c2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001cB9\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u0002012\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000201H\u0016J\b\u00106\u001a\u000201H\u0002J\b\u00107\u001a\u000201H\u0002J\b\u00108\u001a\u000201H\u0002J\b\u00109\u001a\u000201H\u0002J\b\u0010:\u001a\u00020 H\u0002J\b\u0010;\u001a\u00020 H\u0002J\u0018\u0010<\u001a\u0002012\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u0002012\u0006\u0010=\u001a\u00020\u000bH\u0002J\u0018\u0010A\u001a\u0002012\u000e\u0010B\u001a\n\u0018\u00010Cj\u0004\u0018\u0001`DH\u0016J\u0012\u0010E\u001a\u0002012\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010H\u001a\u000201H\u0002J\b\u0010I\u001a\u000201H\u0002J\u0010\u0010J\u001a\u0002012\u0006\u0010K\u001a\u00020 H\u0002J\u0012\u0010L\u001a\u0002012\b\u0010M\u001a\u0004\u0018\u000104H\u0016J\u0012\u0010N\u001a\u0002012\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0012\u0010O\u001a\u0002012\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\u0012\u0010R\u001a\u0002012\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0012\u0010S\u001a\u0002012\b\u0010P\u001a\u0004\u0018\u00010TH\u0016J\u0012\u0010U\u001a\u0002012\b\u0010V\u001a\u0004\u0018\u00010WH\u0014J\b\u0010X\u001a\u000201H\u0002J\b\u0010Y\u001a\u000201H\u0002J\b\u0010Z\u001a\u000201H\u0002J\b\u0010[\u001a\u000201H\u0002J\b\u0010\\\u001a\u000201H\u0002J\b\u0010]\u001a\u000201H\u0016J\b\u0010^\u001a\u000201H\u0002J\b\u0010_\u001a\u000201H\u0002J\b\u0010`\u001a\u000201H\u0002J\b\u0010a\u001a\u000201H\u0002J\b\u0010b\u001a\u000201H\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006d"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/widget/PoiHalfScreenDialogNew;", "Landroid/support/design/widget/BottomSheetDialog;", "Lcom/ss/android/ugc/aweme/favorites/presenter/ICollectActionView;", "Lcom/ss/android/ugc/aweme/poi/ui/PoiHalfCardView;", "Lcom/ss/android/ugc/aweme/poi/nearby/presenter/PoiCouponView;", "Landroid/view/View$OnClickListener;", "theme", "", "poiStruct", "Lcom/ss/android/ugc/aweme/poi/model/PoiStruct;", "enterFrom", "", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mContext", "Landroid/content/Context;", "locationWrapper", "Lcom/ss/android/ugc/aweme/poi/LocationBundle;", "(ILcom/ss/android/ugc/aweme/poi/model/PoiStruct;Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Landroid/content/Context;Lcom/ss/android/ugc/aweme/poi/LocationBundle;)V", "getEnterFrom", "()Ljava/lang/String;", "getLocationWrapper", "()Lcom/ss/android/ugc/aweme/poi/LocationBundle;", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mCollectPresenter", "Lcom/ss/android/ugc/aweme/favorites/presenter/CollectActionPresenter;", "getMContext", "()Landroid/content/Context;", "mDismissTime", "", "mHasPoiCollected", "", "mPoiCouponInfo", "Lcom/ss/android/ugc/aweme/commercialize/coupon/model/CouponInfo;", "mPoiCouponPresenter", "Lcom/ss/android/ugc/aweme/poi/nearby/presenter/PoiCouponPresenter;", "mPoiHalfCardPresenter", "Lcom/ss/android/ugc/aweme/poi/presenter/PoiHalfCardPresenter;", "mPoiHalfCardStruct", "Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardInfoStruct;", "mPoiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "mShowTime", "getPoiStruct", "()Lcom/ss/android/ugc/aweme/poi/model/PoiStruct;", "buildPoiMobEventParams", "Lcom/ss/android/ugc/aweme/poi/mob/PoiMobEventParams;", "calculateWidth", "", "configureBottomSheetBehavior", "contentView", "Landroid/view/View;", "dismiss", "handleCollectionState", "hideCityName", "initListeners", "initViews", "isPoiWithoutCity", "isPoiWithoutLatLng", "jumpToLogin", "enterMethod", "callback", "Lcom/ss/android/ugc/aweme/base/component/OnActivityResult;", "jumpToPoiDetail", "loadPoiHalfCardFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "loadPoiHalfCardSuccess", "poiHalfCardInfoResponse", "Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardInfoResponse;", "mobCollectPoiEvent", "mobHalfCardShowEvent", "monitorHalfCardRequest", "success", "onClick", "v", "onCollectFailed", "onCollectSuccess", "response", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "onCouponJoinFailed", "onCouponJoinSuccess", "Lcom/ss/android/ugc/aweme/poi/model/PoiJoinActivityResponse;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "poiCall", "poiCollection", "receivePoiCoupon", "sendDataRequest", "setHalfCardData", "show", "showCouponInfo", "showCouponLayoutWithAnimIfNeeded", "updateCollectionUI", "updateCouponUI", "updateDistanceUI", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiHalfScreenDialogNew extends BottomSheetDialog implements View.OnClickListener, com.ss.android.ugc.aweme.favorites.c.b, com.ss.android.ugc.aweme.poi.nearby.b.b, o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61021a;
    public static final a g = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final PoiStruct f61022b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f61023c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final Aweme f61024d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final Context f61025e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.poi.a f61026f;
    private com.ss.android.ugc.aweme.poi.d.b h;
    private com.ss.android.ugc.aweme.favorites.c.a i;
    private ad j;
    private com.ss.android.ugc.aweme.commercialize.coupon.model.c k;
    private boolean l;
    private com.ss.android.ugc.aweme.poi.nearby.b.a m;
    private long n;
    private long o;
    private com.ss.android.ugc.aweme.poi.c p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/widget/PoiHalfScreenDialogNew$Companion;", "", "()V", "ENTER_METHOD_CLICK_CARD", "", "ENTER_METHOD_CLICK_MAP", "ENTER_METHOD_CLICK_VIEW_MORE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/poi/widget/PoiHalfScreenDialogNew$configureBottomSheetBehavior$1", "Landroid/support/design/widget/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61027a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiHalfScreenDialogNew f61028b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BottomSheetBehavior f61029c;

        public final void onSlide(@NotNull View view, float f2) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f61027a, false, 67048, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f61027a, false, 67048, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "bottomSheet");
        }

        b(PoiHalfScreenDialogNew poiHalfScreenDialogNew, BottomSheetBehavior bottomSheetBehavior) {
            this.f61028b = poiHalfScreenDialogNew;
            this.f61029c = bottomSheetBehavior;
        }

        public final void onStateChanged(@NotNull View view, int i) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f61027a, false, 67047, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f61027a, false, 67047, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            if (i == 5) {
                this.f61028b.cancel();
                this.f61029c.setState(4);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61030a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiHalfScreenDialogNew f61031b;

        c(PoiHalfScreenDialogNew poiHalfScreenDialogNew) {
            this.f61031b = poiHalfScreenDialogNew;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f61030a, false, 67049, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f61030a, false, 67049, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f61031b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/poi/widget/PoiHalfScreenDialogNew$poiCollection$1", "Lcom/ss/android/ugc/aweme/base/component/OnActivityResult;", "onResultCancelled", "", "data", "Landroid/os/Bundle;", "onResultOK", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiHalfScreenDialogNew f61033b;

        public final void a(@Nullable Bundle bundle) {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f61032a, false, 67050, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61032a, false, 67050, new Class[0], Void.TYPE);
                return;
            }
            this.f61033b.c();
        }

        d(PoiHalfScreenDialogNew poiHalfScreenDialogNew) {
            this.f61033b = poiHalfScreenDialogNew;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/poi/widget/PoiHalfScreenDialogNew$receivePoiCoupon$1", "Lcom/ss/android/ugc/aweme/base/component/OnActivityResult;", "onResultCancelled", "", "data", "Landroid/os/Bundle;", "onResultOK", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiHalfScreenDialogNew f61035b;

        public final void a(@Nullable Bundle bundle) {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f61034a, false, 67051, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61034a, false, 67051, new Class[0], Void.TYPE);
                return;
            }
            this.f61035b.b();
        }

        e(PoiHalfScreenDialogNew poiHalfScreenDialogNew) {
            this.f61035b = poiHalfScreenDialogNew;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiHalfScreenDialogNew f61037b;

        f(PoiHalfScreenDialogNew poiHalfScreenDialogNew) {
            this.f61037b = poiHalfScreenDialogNew;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f61036a, false, 67052, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61036a, false, 67052, new Class[0], Void.TYPE);
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) UIUtils.dip2Px(this.f61037b.f61025e, 65.0f)});
            final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.leftMargin = (int) UIUtils.dip2Px(this.f61037b.f61025e, 16.0f);
            layoutParams.rightMargin = (int) UIUtils.dip2Px(this.f61037b.f61025e, 16.0f);
            Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
            ofInt.setDuration(300);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61038a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ f f61039b;

                {
                    this.f61039b = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f61038a, false, 67053, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f61038a, false, 67053, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    PoiHalfScreenDialogNew poiHalfScreenDialogNew = this.f61039b.f61037b;
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        int intValue = ((Integer) animatedValue).intValue();
                        layoutParams.height = intValue;
                        LinearLayout.LayoutParams layoutParams = layoutParams;
                        double d2 = (double) intValue;
                        Double.isNaN(d2);
                        layoutParams.topMargin = (int) (d2 * 0.25d);
                        LinearLayout linearLayout = (LinearLayout) poiHalfScreenDialogNew.findViewById(C0906R.id.a0z);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "coupon_info_container");
                        linearLayout.setLayoutParams(layoutParams);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            });
            ofInt.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x06c9  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x06ef  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0287  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.poi.model.ac r30) {
        /*
            r29 = this;
            r7 = r29
            r8 = r30
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.ac> r1 = com.ss.android.ugc.aweme.poi.model.ac.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 67021(0x105cd, float:9.3916E-41)
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67021(0x105cd, float:9.3916E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.ac> r1 = com.ss.android.ugc.aweme.poi.model.ac.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            if (r8 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.poi.model.ad r0 = r8.f59863b
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r1 = 2131170110(0x7f07133e, float:1.795457E38)
            r12 = 4
            r2 = 2131168987(0x7f070edb, float:1.7952291E38)
            if (r0 != 0) goto L_0x005f
            android.view.View r0 = r7.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r2 = "poi_info_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r12)
            android.view.View r0 = r7.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.ui.widget.DmtStatusView) r0
            r0.f()
            return
        L_0x005f:
            r7.a((boolean) r9)
            android.view.View r0 = r7.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.ui.widget.DmtStatusView) r0
            r0.b()
            android.view.View r0 = r7.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "poi_info_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
            com.ss.android.ugc.aweme.poi.model.ad r0 = r8.f59863b
            r7.j = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67023(0x105cf, float:9.3919E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67023(0x105cf, float:9.3919E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00a3:
            com.ss.android.ugc.aweme.poi.model.ad r8 = r7.j
            if (r8 == 0) goto L_0x0836
            int r0 = r8.k
            if (r0 != r9) goto L_0x00ad
            r0 = 1
            goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            r7.l = r0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r8.f59867d
            if (r0 == 0) goto L_0x00ce
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r8.f59867d
            java.util.List r0 = r0.getUrlList()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ce
            r0 = 2131168982(0x7f070ed6, float:1.7952281E38)
            android.view.View r0 = r7.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r8.f59867d
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
        L_0x00ce:
            r0 = 2131168997(0x7f070ee5, float:1.7952312E38)
            android.view.View r0 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_name"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r1 = r8.f59866c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            r29.f()
            java.lang.String r0 = r8.q
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r13 = 2131169060(0x7f070f24, float:1.795244E38)
            r14 = 8
            if (r0 == 0) goto L_0x0104
            android.view.View r0 = r7.findViewById(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_type"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            goto L_0x0124
        L_0x0104:
            android.view.View r0 = r7.findViewById(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_type"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
            android.view.View r0 = r7.findViewById(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_type"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r1 = r8.q
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0124:
            double r0 = r8.h
            int r0 = (int) r0
            r15 = 2131169002(0x7f070eea, float:1.7952322E38)
            if (r0 != 0) goto L_0x013b
            android.view.View r0 = r7.findViewById(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_per_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            goto L_0x0180
        L_0x013b:
            android.view.View r1 = r7.findViewById(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "poi_per_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.Context r2 = r7.f61025e
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131561719(0x7f0d0cf7, float:1.8748846E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "mContext.resources.getString(R.string.poi_cost)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r10] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r9)
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            android.view.View r0 = r7.findViewById(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_per_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
        L_0x0180:
            android.view.View r0 = r7.findViewById(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_per_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.getVisibility()
            r6 = 2131168806(0x7f070e26, float:1.7951924E38)
            if (r0 != 0) goto L_0x01b4
            android.view.View r0 = r7.findViewById(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_type"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01b4
            android.view.View r0 = r7.findViewById(r6)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r1 = "per_cost_divider"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
            goto L_0x01c2
        L_0x01b4:
            android.view.View r0 = r7.findViewById(r6)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r1 = "per_cost_divider"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
        L_0x01c2:
            android.view.View r0 = r7.findViewById(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_type"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.getVisibility()
            r5 = 2131168970(0x7f070eca, float:1.7952257E38)
            if (r0 != r14) goto L_0x0215
            android.view.View r0 = r7.findViewById(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_per_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.getVisibility()
            if (r0 != r14) goto L_0x0215
            android.view.View r0 = r7.findViewById(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x020d
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.leftMargin = r10
            android.view.View r1 = r7.findViewById(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r1.setLayoutParams(r0)
            goto L_0x0215
        L_0x020d:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x0215:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67024(0x105d0, float:9.392E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r16 = java.lang.Void.TYPE
            r17 = r1
            r1 = r29
            r11 = 2131168970(0x7f070eca, float:1.7952257E38)
            r5 = r17
            r12 = 2131168806(0x7f070e26, float:1.7951924E38)
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r6 = 2131168968(0x7f070ec8, float:1.7952253E38)
            if (r0 == 0) goto L_0x0250
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67024(0x105d0, float:9.392E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r16 = java.lang.Void.TYPE
            r1 = r29
            r12 = 2131168968(0x7f070ec8, float:1.7952253E38)
            r6 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0623
        L_0x0250:
            r12 = 2131168968(0x7f070ec8, float:1.7952253E38)
            com.ss.android.ugc.aweme.poi.a r0 = r7.f61026f
            if (r0 != 0) goto L_0x02b2
            boolean r0 = r29.e()
            if (r0 != 0) goto L_0x02ad
            android.view.View r0 = r7.findViewById(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r7.f61022b
            if (r2 == 0) goto L_0x027a
            com.ss.android.ugc.aweme.poi.model.b r2 = r2.address
            if (r2 == 0) goto L_0x027a
            java.lang.String r2 = r2.getCity()
            goto L_0x027b
        L_0x027a:
            r2 = 0
        L_0x027b:
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r7.f61022b
            if (r2 == 0) goto L_0x0290
            com.ss.android.ugc.aweme.poi.model.b r2 = r2.address
            if (r2 == 0) goto L_0x0290
            java.lang.String r2 = r2.getDistrict()
            goto L_0x0291
        L_0x0290:
            r2 = 0
        L_0x0291:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.view.View r0 = r7.findViewById(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_distance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            goto L_0x046d
        L_0x02ad:
            r29.d()
            goto L_0x046d
        L_0x02b2:
            boolean r0 = r29.e()
            if (r0 != 0) goto L_0x046a
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.f61022b
            com.ss.android.ugc.aweme.poi.a r1 = r7.f61026f
            boolean r0 = com.ss.android.ugc.aweme.poi.e.p.a((com.ss.android.ugc.aweme.poi.model.PoiStruct) r0, (com.ss.android.ugc.aweme.poi.a) r1)
            if (r0 == 0) goto L_0x0411
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67028(0x105d4, float:9.3926E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02ef
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67028(0x105d4, float:9.3926E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r29
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0313
        L_0x02ef:
            com.ss.android.ugc.aweme.poi.model.ad r0 = r7.j
            if (r0 == 0) goto L_0x02f6
            java.lang.String r0 = r0.f59869f
            goto L_0x02f7
        L_0x02f6:
            r0 = 0
        L_0x02f7:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0312
            com.ss.android.ugc.aweme.poi.model.ad r0 = r7.j
            if (r0 == 0) goto L_0x0306
            java.lang.String r0 = r0.f59868e
            goto L_0x0307
        L_0x0306:
            r0 = 0
        L_0x0307:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0310
            goto L_0x0312
        L_0x0310:
            r0 = 0
            goto L_0x0313
        L_0x0312:
            r0 = 1
        L_0x0313:
            if (r0 != 0) goto L_0x0411
            com.ss.android.ugc.aweme.poi.model.ad r0 = r7.j
            if (r0 == 0) goto L_0x031c
            java.lang.String r0 = r0.f59869f
            goto L_0x031d
        L_0x031c:
            r0 = 0
        L_0x031d:
            if (r0 != 0) goto L_0x0322
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0322:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            com.ss.android.ugc.aweme.poi.model.ad r1 = r7.j
            if (r1 == 0) goto L_0x032d
            java.lang.String r1 = r1.f59868e
            goto L_0x032e
        L_0x032d:
            r1 = 0
        L_0x032e:
            if (r1 != 0) goto L_0x0333
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0333:
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            com.ss.android.ugc.aweme.poi.a r2 = r7.f61026f
            double r2 = r2.latitude
            com.ss.android.ugc.aweme.poi.a r4 = r7.f61026f
            double r4 = r4.longitude
            com.ss.android.ugc.aweme.poi.a r6 = r7.f61026f
            boolean r6 = r6.isGaode
            if (r6 != 0) goto L_0x034e
            double[] r2 = com.ss.android.ugc.aweme.poi.e.a.b(r4, r2)
            r4 = r2[r10]
            r16 = r2[r9]
            goto L_0x0350
        L_0x034e:
            r16 = r2
        L_0x0350:
            r27 = r4
            java.lang.String r2 = "poiLat"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            double r19 = r0.doubleValue()
            java.lang.String r2 = "poiLng"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            double r21 = r1.doubleValue()
            r23 = r16
            r25 = r27
            double r2 = com.ss.android.ugc.aweme.poi.e.c.a(r19, r21, r23, r25)
            r4 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x03c2
            android.view.View r2 = r7.findViewById(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r2
            java.lang.String r3 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r7.f61022b
            if (r3 == 0) goto L_0x038a
            com.ss.android.ugc.aweme.poi.model.b r3 = r3.address
            if (r3 == 0) goto L_0x038a
            java.lang.String r3 = r3.getDistrict()
            goto L_0x038b
        L_0x038a:
            r3 = 0
        L_0x038b:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r3 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r2 = r2.getService(r3)
            r19 = r2
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r19 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r19
            android.content.Context r2 = r7.f61025e
            double r21 = r0.doubleValue()
            double r23 = r1.doubleValue()
            r20 = r2
            r25 = r16
            java.lang.String r0 = r19.getDistanceBetweenLocations(r20, r21, r23, r25, r27)
            android.view.View r1 = r7.findViewById(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "poi_distance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            goto L_0x046d
        L_0x03c2:
            android.view.View r0 = r7.findViewById(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r7.f61022b
            if (r2 == 0) goto L_0x03df
            com.ss.android.ugc.aweme.poi.model.b r2 = r2.address
            if (r2 == 0) goto L_0x03df
            java.lang.String r2 = r2.getCity()
            goto L_0x03e0
        L_0x03df:
            r2 = 0
        L_0x03e0:
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r7.f61022b
            if (r2 == 0) goto L_0x03f5
            com.ss.android.ugc.aweme.poi.model.b r2 = r2.address
            if (r2 == 0) goto L_0x03f5
            java.lang.String r2 = r2.getDistrict()
            goto L_0x03f6
        L_0x03f5:
            r2 = 0
        L_0x03f6:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.view.View r0 = r7.findViewById(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_distance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            goto L_0x046d
        L_0x0411:
            boolean r0 = r29.e()
            if (r0 != 0) goto L_0x0466
            android.view.View r0 = r7.findViewById(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r7.f61022b
            if (r2 == 0) goto L_0x0434
            com.ss.android.ugc.aweme.poi.model.b r2 = r2.address
            if (r2 == 0) goto L_0x0434
            java.lang.String r2 = r2.getCity()
            goto L_0x0435
        L_0x0434:
            r2 = 0
        L_0x0435:
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r7.f61022b
            if (r2 == 0) goto L_0x044a
            com.ss.android.ugc.aweme.poi.model.b r2 = r2.address
            if (r2 == 0) goto L_0x044a
            java.lang.String r2 = r2.getDistrict()
            goto L_0x044b
        L_0x044a:
            r2 = 0
        L_0x044b:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.view.View r0 = r7.findViewById(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_distance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            goto L_0x046d
        L_0x0466:
            r29.d()
            goto L_0x046d
        L_0x046a:
            r29.d()
        L_0x046d:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67025(0x105d1, float:9.3922E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0494
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67025(0x105d1, float:9.3922E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0623
        L_0x0494:
            android.content.Context r0 = r7.f61025e
            int r0 = com.bytedance.common.utility.UIUtils.getScreenWidth(r0)
            android.content.Context r1 = r7.f61025e
            r2 = 1107296256(0x42000000, float:32.0)
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r2)
            int r1 = (int) r1
            android.view.View r2 = r7.findViewById(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r2
            java.lang.String r3 = "poi_type"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x04dc
            android.view.View r2 = r7.findViewById(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r2
            java.lang.String r3 = "poi_type"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.text.TextPaint r2 = r2.getPaint()
            android.view.View r3 = r7.findViewById(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
            java.lang.String r4 = "poi_type"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            float r2 = r2.measureText(r3)
            int r2 = (int) r2
            goto L_0x04dd
        L_0x04dc:
            r2 = 0
        L_0x04dd:
            android.view.View r3 = r7.findViewById(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
            java.lang.String r4 = "poi_per_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0520
            android.view.View r3 = r7.findViewById(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
            java.lang.String r4 = "poi_per_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            android.text.TextPaint r3 = r3.getPaint()
            android.view.View r4 = r7.findViewById(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r4
            java.lang.String r5 = "poi_per_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            float r3 = r3.measureText(r4)
            int r3 = (int) r3
            android.content.Context r4 = r7.f61025e
            r5 = 1094713344(0x41400000, float:12.0)
            float r4 = com.bytedance.common.utility.UIUtils.dip2Px(r4, r5)
            int r4 = (int) r4
            int r3 = r3 + r4
            goto L_0x0521
        L_0x0520:
            r3 = 0
        L_0x0521:
            android.view.View r4 = r7.findViewById(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r4
            java.lang.String r5 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x0564
            android.view.View r4 = r7.findViewById(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r4
            java.lang.String r5 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.text.TextPaint r4 = r4.getPaint()
            android.view.View r5 = r7.findViewById(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r5
            java.lang.String r6 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            java.lang.CharSequence r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            float r4 = r4.measureText(r5)
            int r4 = (int) r4
            android.content.Context r5 = r7.f61025e
            r6 = 1102053376(0x41b00000, float:22.0)
            float r5 = com.bytedance.common.utility.UIUtils.dip2Px(r5, r6)
            int r5 = (int) r5
            int r4 = r4 + r5
            goto L_0x0565
        L_0x0564:
            r4 = 0
        L_0x0565:
            android.view.View r5 = r7.findViewById(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r5
            java.lang.String r6 = "poi_distance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x05a8
            android.view.View r5 = r7.findViewById(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r5
            java.lang.String r6 = "poi_distance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            android.text.TextPaint r5 = r5.getPaint()
            android.view.View r6 = r7.findViewById(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r6
            java.lang.String r9 = "poi_distance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r9)
            java.lang.CharSequence r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            float r5 = r5.measureText(r6)
            int r5 = (int) r5
            android.content.Context r6 = r7.f61025e
            r9 = 1086324736(0x40c00000, float:6.0)
            float r6 = com.bytedance.common.utility.UIUtils.dip2Px(r6, r9)
            int r6 = (int) r6
            int r5 = r5 + r6
            goto L_0x05a9
        L_0x05a8:
            r5 = 0
        L_0x05a9:
            int r6 = r2 + r1
            if (r6 >= r0) goto L_0x05e8
            int r2 = r2 + r3
            int r3 = r2 + r1
            if (r3 < r0) goto L_0x05b3
            goto L_0x05e8
        L_0x05b3:
            int r2 = r2 + r4
            int r3 = r2 + r1
            if (r3 < r0) goto L_0x05d5
            android.view.View r0 = r7.findViewById(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            android.view.View r0 = r7.findViewById(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_distance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            goto L_0x0623
        L_0x05d5:
            int r2 = r2 + r5
            int r2 = r2 + r1
            if (r2 < r0) goto L_0x0623
            android.view.View r0 = r7.findViewById(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_distance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            goto L_0x0623
        L_0x05e8:
            r0 = 2131168806(0x7f070e26, float:1.7951924E38)
            android.view.View r1 = r7.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r0 = "per_cost_divider"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r0)
            r1.setVisibility(r14)
            android.view.View r0 = r7.findViewById(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_per_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            android.view.View r0 = r7.findViewById(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            android.view.View r0 = r7.findViewById(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_distance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
        L_0x0623:
            android.view.View r0 = r7.findViewById(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_type"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.getVisibility()
            r1 = 2131169045(0x7f070f15, float:1.7952409E38)
            if (r0 != r14) goto L_0x068d
            android.view.View r0 = r7.findViewById(r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r2 = "poi_per_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            int r0 = r0.getVisibility()
            if (r0 != r14) goto L_0x068d
            r0 = 2131168806(0x7f070e26, float:1.7951924E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r2 = "per_cost_divider"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            int r0 = r0.getVisibility()
            if (r0 != r14) goto L_0x068d
            android.view.View r0 = r7.findViewById(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r2 = "poi_district"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            int r0 = r0.getVisibility()
            if (r0 != r14) goto L_0x068d
            android.view.View r0 = r7.findViewById(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r2 = "poi_distance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            int r0 = r0.getVisibility()
            if (r0 != r14) goto L_0x068d
            android.view.View r0 = r7.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "poi_sub_info_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            goto L_0x069b
        L_0x068d:
            android.view.View r0 = r7.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "poi_sub_info_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
        L_0x069b:
            java.lang.String r0 = r8.n
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 2131168866(0x7f070e62, float:1.7952046E38)
            if (r0 == 0) goto L_0x06c9
            android.view.View r0 = r7.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "poi_action_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            r0 = 2131168867(0x7f070e63, float:1.7952048E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r1 = "poi_action_divider"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 4
            r0.setVisibility(r1)
            goto L_0x06e8
        L_0x06c9:
            android.view.View r0 = r7.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "poi_action_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
            r0 = 2131168867(0x7f070e63, float:1.7952048E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r1 = "poi_action_divider"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
        L_0x06e8:
            com.ss.android.ugc.aweme.poi.model.d r0 = r8.l
            r9 = 2131166215(0x7f070407, float:1.794667E38)
            if (r0 == 0) goto L_0x0827
            com.ss.android.ugc.aweme.poi.model.d r0 = r8.l
            com.ss.android.ugc.aweme.commercialize.coupon.model.c r0 = r0.getCouponInfo()
            if (r0 == 0) goto L_0x0827
            com.ss.android.ugc.aweme.poi.model.d r0 = r8.l
            com.ss.android.ugc.aweme.commercialize.coupon.model.c r0 = r0.getCouponInfo()
            r7.k = r0
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.f61022b
            if (r0 == 0) goto L_0x0708
            java.util.List r11 = r0.getVoucherReleaseAreas()
            goto L_0x0709
        L_0x0708:
            r11 = 0
        L_0x0709:
            boolean r0 = com.ss.android.ugc.aweme.poi.e.p.a((java.util.List<java.lang.String>) r11)
            if (r0 == 0) goto L_0x0818
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67031(0x105d7, float:9.393E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0736
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67031(0x105d7, float:9.393E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0835
        L_0x0736:
            com.ss.android.ugc.aweme.poi.c.a$a r0 = new com.ss.android.ugc.aweme.poi.c.a$a
            r0.<init>()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r7.f61022b
            if (r1 != 0) goto L_0x0742
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0742:
            java.lang.String r1 = r1.poiId
            com.ss.android.ugc.aweme.poi.c.a$a r0 = r0.b(r1)
            java.lang.String r1 = r7.f61023c
            com.ss.android.ugc.aweme.poi.c.a$a r0 = r0.a((java.lang.String) r1)
            com.ss.android.ugc.aweme.commercialize.coupon.model.c r1 = r7.k
            if (r1 != 0) goto L_0x0755
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0755:
            int r1 = r1.getCouponId()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.ss.android.ugc.aweme.poi.c.a$a r0 = r0.g(r1)
            android.content.Context r1 = r7.f61025e
            com.ss.android.ugc.aweme.commercialize.coupon.model.c r2 = r7.k
            if (r2 != 0) goto L_0x076a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x076a:
            int r2 = r2.getStatus()
            r3 = 1
            java.lang.String r1 = com.ss.android.ugc.aweme.commercialize.coupon.a.a(r1, r2, r3)
            com.ss.android.ugc.aweme.poi.c.a$a r0 = r0.h(r1)
            java.lang.String r1 = r7.f61023c
            com.ss.android.ugc.aweme.poi.c.a$a r0 = r0.e(r1)
            java.lang.String r1 = "click_poi_card"
            com.ss.android.ugc.aweme.poi.c.a$a r0 = r0.f(r1)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r7.f61022b
            com.ss.android.ugc.aweme.poi.c.a$a r0 = r0.a((com.ss.android.ugc.aweme.poi.model.PoiStruct) r1)
            com.ss.android.ugc.aweme.poi.c.a r0 = r0.a()
            com.ss.android.ugc.aweme.poi.c.b.d(r0)
            r0 = 2131166224(0x7f070410, float:1.7946687E38)
            android.view.View r0 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "coupon_title"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.commercialize.coupon.model.c r1 = r7.k
            if (r1 == 0) goto L_0x07a7
            java.lang.String r11 = r1.getTitle()
            goto L_0x07a8
        L_0x07a7:
            r11 = 0
        L_0x07a8:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r0.setText(r11)
            r0 = 2131166216(0x7f070408, float:1.7946671E38)
            android.view.View r0 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "coupon_invalid_date"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.commercialize.coupon.model.c r1 = r7.k
            if (r1 == 0) goto L_0x07c4
            java.lang.String r11 = r1.validDateText
            r18 = r11
            goto L_0x07c6
        L_0x07c4:
            r18 = 0
        L_0x07c6:
            r1 = r18
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            r29.g()
            android.view.View r0 = r7.findViewById(r9)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "coupon_info_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.getHeight()
            if (r0 != 0) goto L_0x0836
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67029(0x105d5, float:9.3928E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0807
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f61021a
            r3 = 0
            r4 = 67029(0x105d5, float:9.3928E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0835
        L_0x0807:
            android.view.View r0 = r7.findViewById(r9)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.ss.android.ugc.aweme.poi.widget.PoiHalfScreenDialogNew$f r1 = new com.ss.android.ugc.aweme.poi.widget.PoiHalfScreenDialogNew$f
            r1.<init>(r7)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.post(r1)
            goto L_0x0836
        L_0x0818:
            android.view.View r0 = r7.findViewById(r9)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "coupon_info_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
            goto L_0x0836
        L_0x0827:
            android.view.View r0 = r7.findViewById(r9)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "coupon_info_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r14)
        L_0x0835:
            return
        L_0x0836:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.widget.PoiHalfScreenDialogNew.a(com.ss.android.ugc.aweme.poi.model.ac):void");
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f61021a, false, 67034, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f61021a, false, 67034, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (exc != null) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        }
        h();
    }

    private final void f() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67030, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67030, new Class[0], Void.TYPE);
            return;
        }
        CheckableImageView checkableImageView = (CheckableImageView) findViewById(C0906R.id.c1r);
        if (this.l) {
            i2 = 2130839385;
        } else {
            i2 = 2130839203;
        }
        checkableImageView.setImageResource(i2);
    }

    private final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67035, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67035, new Class[0], Void.TYPE);
            return;
        }
        this.l = !this.l;
        f();
    }

    private final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67044, new Class[0], Void.TYPE);
        } else if (this.l) {
            com.ss.android.ugc.aweme.poi.c.b.b(j());
        } else {
            com.ss.android.ugc.aweme.poi.c.b.a(j());
        }
    }

    private final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67026, new Class[0], Void.TYPE);
            return;
        }
        DmtTextView dmtTextView = (DmtTextView) findViewById(C0906R.id.c1i);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "poi_district");
        dmtTextView.setVisibility(8);
        DmtTextView dmtTextView2 = (DmtTextView) findViewById(C0906R.id.c1g);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "poi_distance");
        dmtTextView2.setVisibility(8);
    }

    private final boolean e() {
        com.ss.android.ugc.aweme.poi.model.b bVar;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67027, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67027, new Class[0], Boolean.TYPE)).booleanValue();
        }
        PoiStruct poiStruct = this.f61022b;
        String str2 = null;
        if (poiStruct != null) {
            bVar = poiStruct.address;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            com.ss.android.ugc.aweme.poi.model.b bVar2 = this.f61022b.address;
            if (bVar2 != null) {
                str = bVar2.getCity();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                com.ss.android.ugc.aweme.poi.model.b bVar3 = this.f61022b.address;
                if (bVar3 != null) {
                    str2 = bVar3.getDistrict();
                }
                if (!TextUtils.isEmpty(str2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void g() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67032, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67032, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar = this.k;
        if (cVar != null) {
            int status = cVar.getStatus();
            if (status == com.ss.android.ugc.aweme.commercialize.coupon.model.a.StatusUnReceived.value) {
                i2 = C0906R.string.a38;
            } else if (status == com.ss.android.ugc.aweme.commercialize.coupon.model.a.StatusRedeemed.value) {
                i2 = C0906R.string.a2o;
            } else {
                i2 = C0906R.string.a32;
            }
            ((DmtTextView) findViewById(C0906R.id.a17)).setText(i2);
        }
    }

    private final com.ss.android.ugc.aweme.poi.c.a j() {
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67045, new Class[0], com.ss.android.ugc.aweme.poi.c.a.class)) {
            return (com.ss.android.ugc.aweme.poi.c.a) PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67045, new Class[0], com.ss.android.ugc.aweme.poi.c.a.class);
        }
        a.C0670a aVar = new a.C0670a();
        PoiStruct poiStruct = this.f61022b;
        if (poiStruct == null) {
            Intrinsics.throwNpe();
        }
        return aVar.b(poiStruct.poiId).a(this.f61023c).c(this.f61022b.getTypeCode()).d(this.f61024d.getAid()).a(this.f61022b).f("click_poi_card").a();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67043, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67043, new Class[0], Void.TYPE);
            return;
        }
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        if (!a2.isLogin()) {
            a("click_favorite_poi", new d(this));
            return;
        }
        if (this.i == null) {
            this.i = new com.ss.android.ugc.aweme.favorites.c.a();
            com.ss.android.ugc.aweme.favorites.c.a aVar = this.i;
            if (aVar != null) {
                aVar.a(this);
            }
        }
        i();
        com.ss.android.ugc.aweme.favorites.c.a aVar2 = this.i;
        if (aVar2 != null) {
            Object[] objArr = new Object[3];
            objArr[0] = 4;
            PoiStruct poiStruct = this.f61022b;
            if (poiStruct == null) {
                Intrinsics.throwNpe();
            }
            objArr[1] = poiStruct.poiId;
            objArr[2] = Integer.valueOf(true ^ this.l ? 1 : 0);
            aVar2.a(objArr);
        }
        h();
    }

    public final void b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67039, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67039, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a((LinearLayout) findViewById(C0906R.id.a0z))) {
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            if (!a2.isLogin()) {
                a("click_coupon", new e(this));
            } else if (this.k != null) {
                Aweme a3 = j.a().a(this.f61024d.getAid());
                if (com.ss.android.ugc.aweme.commercialize.utils.c.u(a3)) {
                    Context context = this.f61025e;
                    PoiStruct poiStruct = this.f61022b;
                    if (poiStruct != null) {
                        str = poiStruct.poiId;
                    } else {
                        str = null;
                    }
                    g.g(context, a3, str);
                }
                a.C0670a aVar = new a.C0670a();
                PoiStruct poiStruct2 = this.f61022b;
                if (poiStruct2 == null) {
                    Intrinsics.throwNpe();
                }
                a.C0670a e2 = aVar.b(poiStruct2.poiId).a(this.f61023c).e(this.f61023c);
                com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar = this.k;
                if (cVar == null) {
                    Intrinsics.throwNpe();
                }
                a.C0670a g2 = e2.g(String.valueOf(cVar.getCouponId()));
                Context context2 = this.f61025e;
                com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar2 = this.k;
                if (cVar2 == null) {
                    Intrinsics.throwNpe();
                }
                a.C0670a f2 = g2.h(com.ss.android.ugc.aweme.commercialize.coupon.a.a(context2, cVar2.getStatus(), true)).f("click_poi_card");
                com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar3 = this.k;
                if (cVar3 == null) {
                    Intrinsics.throwNpe();
                }
                com.ss.android.ugc.aweme.poi.c.b.e(f2.j(com.ss.android.ugc.aweme.commercialize.coupon.a.a(cVar3)).a(this.f61022b).a());
                com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar4 = this.k;
                if (cVar4 == null) {
                    Intrinsics.throwNpe();
                }
                if (cVar4.getStatus() == com.ss.android.ugc.aweme.commercialize.coupon.model.a.StatusUnReceived.value) {
                    if (this.m == null) {
                        this.m = new com.ss.android.ugc.aweme.poi.nearby.b.a();
                        com.ss.android.ugc.aweme.poi.nearby.b.a aVar2 = this.m;
                        if (aVar2 != null) {
                            aVar2.a(new u());
                        }
                        com.ss.android.ugc.aweme.poi.nearby.b.a aVar3 = this.m;
                        if (aVar3 != null) {
                            aVar3.a(this);
                        }
                    }
                    com.ss.android.ugc.aweme.poi.nearby.b.a aVar4 = this.m;
                    if (aVar4 != null) {
                        Object[] objArr = new Object[2];
                        objArr[0] = this.f61022b.poiId;
                        com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar5 = this.k;
                        if (cVar5 == null) {
                            Intrinsics.throwNpe();
                        }
                        objArr[1] = Integer.valueOf(cVar5.getActivityId());
                        aVar4.a(objArr);
                    }
                } else {
                    Context context3 = this.f61025e;
                    com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar6 = this.k;
                    if (cVar6 == null) {
                        Intrinsics.throwNpe();
                    }
                    int couponId = cVar6.getCouponId();
                    com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar7 = this.k;
                    if (cVar7 == null) {
                        Intrinsics.throwNpe();
                    }
                    CouponDetailActivity.a(context3, couponId, cVar7.getCodeId());
                }
            }
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67019, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67019, new Class[0], Void.TYPE);
            return;
        }
        this.o = System.currentTimeMillis();
        a.C0670a aVar = new a.C0670a();
        PoiStruct poiStruct = this.f61022b;
        if (poiStruct == null) {
            Intrinsics.throwNpe();
        }
        a.C0670a e2 = aVar.b(poiStruct.poiId).a(this.f61023c).e(this.f61023c);
        e2.l = String.valueOf(this.o - this.n);
        a.C0670a d2 = e2.d(this.f61024d.getAid());
        d2.j = this.f61024d.getAuthorUid();
        com.ss.android.ugc.aweme.poi.c.a a2 = d2.a(this.f61022b).a();
        if (PatchProxy.isSupport(new Object[]{a2}, null, com.ss.android.ugc.aweme.poi.c.b.f59767a, true, 64990, new Class[]{com.ss.android.ugc.aweme.poi.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{a2}, null, com.ss.android.ugc.aweme.poi.c.b.f59767a, true, 64990, new Class[]{com.ss.android.ugc.aweme.poi.c.a.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(a2, "params");
            com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a();
            if (!TextUtils.isEmpty(a2.f59756b)) {
                a3.a("poi_id", a2.f59756b);
            }
            if (!TextUtils.isEmpty(a2.f59755a)) {
                a3.a("enter_from", a2.f59755a);
            }
            if (!TextUtils.isEmpty(a2.i)) {
                a3.a("author_id", a2.i);
            }
            if (!TextUtils.isEmpty(a2.f59758d)) {
                a3.a("group_id", a2.f59758d);
            }
            if (!TextUtils.isEmpty(a2.k)) {
                a3.a("duration", a2.k);
            }
            h.a(a2, "close_poi_halfcard", a3);
        }
        super.dismiss();
    }

    public final void show() {
        String str;
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67018, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67018, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        this.n = System.currentTimeMillis();
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67033, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67033, new Class[0], Void.TYPE);
        } else {
            if (p.a(this.f61026f, this.f61022b) || !p.b(this.f61022b)) {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            } else {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            }
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            com.ss.android.ugc.aweme.app.d.d a3 = a2.a("enter_from", this.f61023c).a("group_id", this.f61024d.getAid());
            PoiStruct poiStruct = this.f61022b;
            Integer num = null;
            if (poiStruct != null) {
                str2 = poiStruct.typeCode;
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.app.d.d a4 = a3.a("poi_type", str2);
            PoiStruct poiStruct2 = this.f61022b;
            if (poiStruct2 != null) {
                str3 = poiStruct2.poiId;
            } else {
                str3 = null;
            }
            com.ss.android.ugc.aweme.app.d.d a5 = a4.a("poi_id", str3).a("poi_channel", aa.b()).a("enter_method", "click_label").a("author_id", this.f61024d.getAuthorUid()).a("city_info", aa.a()).a("is_coupon", str).a("distance_info", aa.i(this.f61024d));
            AwemeAppData p2 = AwemeAppData.p();
            Intrinsics.checkExpressionValueIsNotNull(p2, "AwemeAppData.inst()");
            if (p2.ap) {
                str4 = "auto";
            } else {
                str4 = "normal";
            }
            com.ss.android.ugc.aweme.app.d.d a6 = a5.a("play_mode", str4);
            PoiStruct poiStruct3 = this.f61022b;
            if (poiStruct3 != null) {
                num = Integer.valueOf(poiStruct3.getPoiSubTitleType());
            }
            a6.a("poi_label_type", String.valueOf(num)).a("is_halfcard", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            if (aa.d(this.f61023c)) {
                a2.a("log_pb", ai.a().a(aa.c(this.f61024d)));
                h.b(this.f61022b, "enter_poi_detail", a2);
            } else {
                h.a(this.f61022b, "enter_poi_detail", a2);
            }
        }
        a();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67020, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67020, new Class[0], Void.TYPE);
            return;
        }
        if (this.h == null) {
            this.h = new com.ss.android.ugc.aweme.poi.d.b();
            com.ss.android.ugc.aweme.poi.d.b bVar = this.h;
            if (bVar != null) {
                bVar.a(new ae());
            }
            com.ss.android.ugc.aweme.poi.d.b bVar2 = this.h;
            if (bVar2 != null) {
                bVar2.a(this);
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C0906R.id.c1z);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "poi_info_container");
        linearLayout.setVisibility(4);
        ((DmtStatusView) findViewById(C0906R.id.cvd)).d();
        com.ss.android.ugc.aweme.poi.d.b bVar3 = this.h;
        if (bVar3 != null) {
            Object[] objArr = new Object[1];
            PoiStruct poiStruct = this.f61022b;
            if (poiStruct == null) {
                Intrinsics.throwNpe();
            }
            objArr[0] = poiStruct.poiId;
            bVar3.a(objArr);
        }
    }

    public final void a(@Nullable BaseResponse baseResponse) {
        ad adVar = this.j;
        if (adVar != null) {
            adVar.k = this.l ? 1 : 0;
        }
    }

    public final void b(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f61021a, false, 67037, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f61021a, false, 67037, new Class[]{Exception.class}, Void.TYPE);
        } else if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.bytedance.ies.dmt.ui.d.a.c(this.f61025e.getApplicationContext(), ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorMsg()).a();
        } else {
            com.bytedance.ies.dmt.ui.d.a.c(this.f61025e.getApplicationContext(), (int) C0906R.string.a2n).a();
        }
    }

    public final void c(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f61021a, false, 67022, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f61021a, false, 67022, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C0906R.id.c1z);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "poi_info_container");
        linearLayout.setVisibility(4);
        ((DmtStatusView) findViewById(C0906R.id.cvd)).f();
        if (exc != null) {
            com.google.a.a.a.a.a.a.b(exc);
        }
        a(false);
    }

    private final void a(String str) {
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[]{str}, this, f61021a, false, 67041, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f61021a, false, 67041, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Context context = this.f61025e;
        Aweme aweme = this.f61024d;
        PoiStruct poiStruct = this.f61022b;
        if (poiStruct != null) {
            str2 = poiStruct.poiId;
        } else {
            str2 = null;
        }
        g.d(context, aweme, str2);
        if (p.a(this.f61026f, this.f61022b) || !p.b(this.f61022b)) {
            str3 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        }
        if (Intrinsics.areEqual((Object) "click_poi_card_map", (Object) str)) {
            Context context2 = this.f61025e;
            PoiStruct poiStruct2 = this.f61022b;
            if (poiStruct2 == null) {
                Intrinsics.throwNpe();
            }
            PoiRouteActivity.a(context2, poiStruct2, null, aa.m(this.f61024d), true);
            return;
        }
        Intrinsics.areEqual((Object) "click_poi_card_more", (Object) str);
        Context context3 = this.f61025e;
        l.a aVar = new l.a();
        PoiStruct poiStruct3 = this.f61022b;
        if (poiStruct3 == null) {
            Intrinsics.throwNpe();
        }
        l.a a2 = aVar.c(poiStruct3.poiId).g(this.f61022b.poiName).f(this.f61022b.typeCode).a(this.f61022b).a(this.f61024d).i(this.f61023c).o(str3).l(str).r(String.valueOf(this.f61022b.getPoiSubTitleType())).a(0);
        AwemeAppData p2 = AwemeAppData.p();
        Intrinsics.checkExpressionValueIsNotNull(p2, "AwemeAppData.inst()");
        if (p2.ap) {
            str4 = "auto";
        } else {
            str4 = "normal";
        }
        PoiDetailActivity.a(context3, a2.t(str4).a());
        dismiss();
    }

    private final void a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61021a, false, 67046, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61021a, false, 67046, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
        if (z) {
            str = "success";
        } else {
            str = "failure";
        }
        a2.a("result", str);
        n.a("poi_log", "poi_half_card", a2.b());
    }

    public final void onClick(@Nullable View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f61021a, false, 67040, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f61021a, false, 67040, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            if (Intrinsics.areEqual((Object) view, (Object) (LinearLayout) findViewById(C0906R.id.c1z))) {
                a("click_poi_card");
            } else if (Intrinsics.areEqual((Object) view, (Object) (ImageView) findViewById(C0906R.id.ti))) {
                dismiss();
            } else {
                if (Intrinsics.areEqual((Object) view, (Object) (LinearLayout) findViewById(C0906R.id.bzc))) {
                    if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67038, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67038, new Class[0], Void.TYPE);
                    } else {
                        ad adVar = this.j;
                        String str2 = null;
                        if (adVar != null) {
                            str = adVar.n;
                        } else {
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            if (this.p == null) {
                                c.a aVar = new c.a();
                                PoiStruct poiStruct = this.f61022b;
                                if (poiStruct == null) {
                                    Intrinsics.throwNpe();
                                }
                                this.p = aVar.a(poiStruct.poiId).b(this.f61022b.typeCode).c(this.f61024d.getAid()).d(this.f61022b.getBackendTypeCode()).e(this.f61022b.getCityCode()).a();
                            }
                            Context context = this.f61025e;
                            ad adVar2 = this.j;
                            if (adVar2 != null) {
                                str2 = adVar2.n;
                            }
                            h.a(context, str2, this.f61023c, "click_poi_card", this.p);
                        }
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) (LinearLayout) findViewById(C0906R.id.a0z))) {
                    b();
                } else if (Intrinsics.areEqual((Object) view, (Object) (LinearLayout) findViewById(C0906R.id.c3i))) {
                    a("click_poi_card_map");
                } else if (Intrinsics.areEqual((Object) view, (Object) (LinearLayout) findViewById(C0906R.id.c1s))) {
                    c();
                } else if (Intrinsics.areEqual((Object) view, (Object) (DmtTextView) findViewById(C0906R.id.du8))) {
                    a("click_poi_card_more");
                }
            }
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f61021a, false, 67014, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f61021a, false, 67014, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.kt);
        if (this.f61022b == null || TextUtils.isEmpty(this.f61022b.poiId)) {
            dismiss();
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67016, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67016, new Class[0], Void.TYPE);
        } else {
            Window window = getWindow();
            if (window != null) {
                int screenHeight = UIUtils.getScreenHeight(this.f61025e) - UIUtils.getStatusBarHeight(this.f61025e);
                if (screenHeight == 0) {
                    screenHeight = -1;
                }
                window.setLayout(-1, screenHeight);
                FrameLayout frameLayout = (FrameLayout) findViewById(C0906R.id.ci4);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "root_view");
                View view = frameLayout;
                if (PatchProxy.isSupport(new Object[]{view}, this, f61021a, false, 67017, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f61021a, false, 67017, new Class[]{View.class}, Void.TYPE);
                } else {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        BottomSheetBehavior from = BottomSheetBehavior.from((View) parent);
                        Intrinsics.checkExpressionValueIsNotNull(from, "mBottomSheetBehavior");
                        from.setPeekHeight((int) UIUtils.dip2Px(this.f61025e, 452.0f));
                        from.setState(4);
                        from.setBottomSheetCallback(new b(this, from));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                    }
                }
                window.setGravity(80);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                window.setAttributes(attributes);
                window.findViewById(C0906R.id.a3z).setBackgroundDrawable(new ColorDrawable(0));
                setCanceledOnTouchOutside(true);
            }
            PoiStruct poiStruct = this.f61022b;
            if (poiStruct == null) {
                Intrinsics.throwNpe();
            }
            if (p.b(poiStruct) && p.a(this.f61022b.getVoucherReleaseAreas())) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) UIUtils.dip2Px(this.f61025e, 65.0f));
                layoutParams.topMargin = (int) UIUtils.dip2Px(this.f61025e, 16.0f);
                layoutParams.leftMargin = (int) UIUtils.dip2Px(this.f61025e, 16.0f);
                layoutParams.rightMargin = (int) UIUtils.dip2Px(this.f61025e, 16.0f);
                LinearLayout linearLayout = (LinearLayout) findViewById(C0906R.id.a0z);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "coupon_info_container");
                linearLayout.setLayoutParams(layoutParams);
            }
            ((DmtStatusView) findViewById(C0906R.id.cvd)).setBuilder(DmtStatusView.a.a(this.f61025e).a().a((int) C0906R.string.bol).a((int) C0906R.string.b6x, (View.OnClickListener) new c(this)).c(0));
        }
        if (PatchProxy.isSupport(new Object[0], this, f61021a, false, 67015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61021a, false, 67015, new Class[0], Void.TYPE);
            return;
        }
        View.OnClickListener onClickListener = this;
        ((LinearLayout) findViewById(C0906R.id.c1z)).setOnClickListener(onClickListener);
        ((ImageView) findViewById(C0906R.id.ti)).setOnClickListener(onClickListener);
        ((LinearLayout) findViewById(C0906R.id.c1s)).setOnClickListener(onClickListener);
        ((LinearLayout) findViewById(C0906R.id.bzc)).setOnClickListener(onClickListener);
        ((LinearLayout) findViewById(C0906R.id.a0z)).setOnClickListener(onClickListener);
        ((LinearLayout) findViewById(C0906R.id.c3i)).setOnClickListener(onClickListener);
        ((DmtTextView) findViewById(C0906R.id.du8)).setOnClickListener(onClickListener);
    }

    public final void a(@Nullable af afVar) {
        if (PatchProxy.isSupport(new Object[]{afVar}, this, f61021a, false, 67036, new Class[]{af.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{afVar}, this, f61021a, false, 67036, new Class[]{af.class}, Void.TYPE);
        } else if (afVar != null) {
            if (afVar.status_code != 0) {
                if (!TextUtils.isEmpty(afVar.status_msg)) {
                    com.bytedance.ies.dmt.ui.d.a.c(this.f61025e.getApplicationContext(), afVar.status_msg).a();
                } else {
                    com.bytedance.ies.dmt.ui.d.a.c(this.f61025e.getApplicationContext(), (int) C0906R.string.a2n).a();
                }
            } else if (afVar.getCouponInfo() != null) {
                this.k = afVar.getCouponInfo();
                com.bytedance.ies.dmt.ui.d.a.c(this.f61025e.getApplicationContext(), (int) C0906R.string.a37).a();
                g();
            }
        }
    }

    private final void a(String str, com.ss.android.ugc.aweme.base.component.f fVar) {
        if (PatchProxy.isSupport(new Object[]{str, fVar}, this, f61021a, false, 67042, new Class[]{String.class, com.ss.android.ugc.aweme.base.component.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, fVar}, this, f61021a, false, 67042, new Class[]{String.class, com.ss.android.ugc.aweme.base.component.f.class}, Void.TYPE);
            return;
        }
        if (this.f61025e instanceof Activity) {
            com.ss.android.ugc.aweme.login.e.a((Activity) this.f61025e, this.f61023c, str, fVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PoiHalfScreenDialogNew(int i2, @Nullable PoiStruct poiStruct, @NotNull String str, @NotNull Aweme aweme, @NotNull Context context, @Nullable com.ss.android.ugc.aweme.poi.a aVar) {
        super(context, C0906R.style.rc);
        Intrinsics.checkParameterIsNotNull(str, "enterFrom");
        Intrinsics.checkParameterIsNotNull(aweme, "mAweme");
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f61022b = poiStruct;
        this.f61023c = str;
        this.f61024d = aweme;
        this.f61025e = context;
        this.f61026f = aVar;
    }
}
