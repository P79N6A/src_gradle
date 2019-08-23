package com.ss.android.ugc.aweme.commerce.billshare;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.billshare.a;
import com.ss.android.ugc.aweme.commerce.preview.h;
import com.ss.android.ugc.aweme.commerce.service.l.g;
import com.ss.android.ugc.aweme.commerce.service.l.l;
import com.ss.android.ugc.aweme.commerce.service.logs.ad;
import com.ss.android.ugc.aweme.commerce.service.logs.ae;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commerce.service.stagger.SmartRecyclerAdapter;
import com.ss.android.ugc.aweme.commerce.service.widgets.NoneSymmetryDecoration;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 _2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001_B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0003J\b\u0010+\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0002J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0004H\u0002J\b\u00100\u001a\u00020*H\u0002J\b\u00101\u001a\u00020*H\u0002J\b\u00102\u001a\u00020(H\u0016J\b\u00103\u001a\u00020\tH\u0002J\b\u00104\u001a\u00020(H\u0002J\b\u00105\u001a\u00020(H\u0002J\b\u00106\u001a\u00020(H\u0002J\b\u00107\u001a\u00020(H\u0002J\u0010\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020\u0018H\u0002J\b\u0010:\u001a\u00020(H\u0016J\u0012\u0010;\u001a\u00020(2\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J\b\u0010>\u001a\u00020(H\u0014J\u0010\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020AH\u0007J \u0010B\u001a\u00020(2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\u0006\u0010D\u001a\u00020\u000fH\u0016J \u0010E\u001a\u00020(2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\u0006\u0010D\u001a\u00020\u000fH\u0016J\b\u0010F\u001a\u00020(H\u0016J \u0010G\u001a\u00020(2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\u0006\u0010D\u001a\u00020\u000fH\u0016J\u0016\u0010H\u001a\u00020(2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00040JH\u0002J\b\u0010K\u001a\u00020(H\u0014J\b\u0010L\u001a\u00020(H\u0002J\b\u0010M\u001a\u00020(H\u0016J\u0012\u0010N\u001a\u00020(2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\u0018\u0010Q\u001a\u00020(2\u0006\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020\u000fH\u0002J\u0012\u0010T\u001a\u00020(2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010U\u001a\u00020(H\u0016J\u0012\u0010V\u001a\u00020(2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010W\u001a\u00020(H\u0016J\u0010\u0010X\u001a\u00020(2\u0006\u0010Y\u001a\u00020\u000fH\u0002J\b\u0010Z\u001a\u00020(H\u0016J\b\u0010[\u001a\u00020(H\u0002J\b\u0010\\\u001a\u00020(H\u0002J\u0010\u0010]\u001a\u00020(2\u0006\u0010^\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X.¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "Lcom/ss/android/ugc/aweme/commerce/service/stagger/SmartRecyclerAdapter$OnMoreCallback;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "()V", "adapter", "Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareAdapter;", "awemeId", "", "creationId", "enterMethod", "footerView", "Landroid/widget/FrameLayout;", "fromSchema", "", "headerView", "mAllVideos", "", "mDisplayGood", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "mImmersionBar", "Lcom/gyf/barlibrary/ImmersionBar;", "mLastY", "", "mPresenter", "Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareListPresenter;", "mPromotions", "referFrom", "smoothScroller", "Landroid/support/v7/widget/RecyclerView$SmoothScroller;", "getSmoothScroller", "()Landroid/support/v7/widget/RecyclerView$SmoothScroller;", "smoothScroller$delegate", "Lkotlin/Lazy;", "staggeredLayoutManager", "Landroid/support/v7/widget/StaggeredGridLayoutManager;", "userInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "adjustStatusBar", "", "view", "Landroid/view/View;", "bindAdapter", "bindDisplayGood", "bindViews", "calcIndex", "aweme", "constructFootView", "constructHeadView", "finish", "getSourcePage", "hideLoadingSuccessInternal", "hideStartRecodeClickAnim", "initHeadAndFooterView", "initPresenter", "loadVideos", "queryType", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "event", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "onLoadLatestResult", "list", "hasMore", "onLoadMoreResult", "onMore", "onRefreshResult", "replaceVideos", "videos", "", "setStatusBarColor", "shootBillShare", "showLoadEmpty", "showLoadError", "e", "Ljava/lang/Exception;", "showLoadInternal", "message", "hideIndicator", "showLoadLatestError", "showLoadLatestLoading", "showLoadMoreError", "showLoadMoreLoading", "showLoadResultInternalAccordingToState", "noMore", "showLoading", "showLoadingAccordingToState", "showStartRecodeClickAnim", "updateY", "dy", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class BillShareActivity extends AmeActivity implements SmartRecyclerAdapter.a, com.ss.android.ugc.aweme.common.f.c<Aweme> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2861a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2862b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BillShareActivity.class), "smoothScroller", "getSmoothScroller()Landroid/support/v7/widget/RecyclerView$SmoothScroller;"))};
    public static final a q = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public c f2863c;

    /* renamed from: d  reason: collision with root package name */
    FrameLayout f2864d;

    /* renamed from: e  reason: collision with root package name */
    FrameLayout f2865e;

    /* renamed from: f  reason: collision with root package name */
    StaggeredGridLayoutManager f2866f;
    BillShareAdapter g;
    List<Aweme> h = new ArrayList();
    public com.ss.android.ugc.aweme.commerce.service.models.h i;
    public CommerceUser j;
    public String k = "click_open_url";
    int l;
    public String m = "INVALID_ENTER_FROM";
    public String n = "";
    public boolean o;
    public String p = "";
    private List<com.ss.android.ugc.aweme.commerce.service.models.h> r = new ArrayList();
    private ImmersionBar s;
    private final Lazy t = LazyKt.lazy(new k(this));
    private HashMap u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareActivity$Companion;", "", "()V", "SHOOT_WAY_UN_BOXING", "", "THRESHOLD", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "video", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "view", "Landroid/view/View;", "<anonymous parameter 2>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function3<Aweme, View, String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ BillShareActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BillShareActivity billShareActivity) {
            super(3);
            this.this$0 = billShareActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Aweme) obj, (View) obj2, (String) obj3);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Aweme aweme, @NotNull View view, @NotNull String str) {
            Aweme aweme2 = aweme;
            View view2 = view;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{aweme2, view2, str2}, this, changeQuickRedirect, false, 27965, new Class[]{Aweme.class, View.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2, view2, str2}, this, changeQuickRedirect, false, 27965, new Class[]{Aweme.class, View.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aweme2, "video");
            Intrinsics.checkParameterIsNotNull(view2, "view");
            Intrinsics.checkParameterIsNotNull(str2, "<anonymous parameter 2>");
            String promotionId = BillShareActivity.a(this.this$0).getPromotionId();
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeManager.inst()");
            c cVar = this.this$0.f2863c;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            a2.f44610c = (b) cVar.i();
            com.ss.android.ugc.aweme.ag.h.a().a((Activity) this.this$0, com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + aweme.getAid()).a("page_type", "unboxing_page").a("promotion_id", promotionId).a("refer", "unboxing_page").a("video_from", "from_commerce_bill_share").a(), view2);
            new ae().a("unboxing_page").b(aweme.getAid()).b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "video", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<Aweme, Unit> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Aweme) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Aweme aweme) {
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, changeQuickRedirect, false, 27966, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2}, this, changeQuickRedirect, false, 27966, new Class[]{Aweme.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aweme2, "video");
            new com.ss.android.ugc.aweme.commerce.service.logs.e().a("unboxing_page").b(aweme.getAid()).c(aweme.getRecallType()).b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<View, Boolean> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((View) obj));
        }

        public final boolean invoke(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 27967, new Class[]{View.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 27967, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            return view2 instanceof FrameLayout;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36705a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BillShareActivity f36706b;

        e(BillShareActivity billShareActivity) {
            this.f36706b = billShareActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36705a, false, 27968, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36705a, false, 27968, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f36706b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36707a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BillShareActivity f36708b;

        f(BillShareActivity billShareActivity) {
            this.f36708b = billShareActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f36707a, false, 27970, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f36707a, false, 27970, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent2, "event");
            switch (motionEvent.getAction()) {
                case 0:
                    BillShareActivity billShareActivity = this.f36708b;
                    if (!PatchProxy.isSupport(new Object[0], billShareActivity, BillShareActivity.f2861a, false, 27945, new Class[0], Void.TYPE)) {
                        billShareActivity.a((int) C0906R.id.cus).clearAnimation();
                        View a2 = billShareActivity.a((int) C0906R.id.cus);
                        Intrinsics.checkExpressionValueIsNotNull(a2, "start_record_out_ring");
                        a2.setVisibility(4);
                        ((FrameLayout) billShareActivity.a((int) C0906R.id.cup)).startAnimation(AnimationUtils.loadAnimation(billShareActivity, C0906R.anim.dj));
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[0], billShareActivity, BillShareActivity.f2861a, false, 27945, new Class[0], Void.TYPE);
                        break;
                    }
                case 1:
                    BillShareActivity billShareActivity2 = this.f36708b;
                    if (!PatchProxy.isSupport(new Object[0], billShareActivity2, BillShareActivity.f2861a, false, 27946, new Class[0], Void.TYPE)) {
                        View a3 = billShareActivity2.a((int) C0906R.id.cus);
                        Intrinsics.checkExpressionValueIsNotNull(a3, "start_record_out_ring");
                        a3.setVisibility(0);
                        billShareActivity2.a((int) C0906R.id.cus).startAnimation(AnimationUtils.loadAnimation(billShareActivity2, C0906R.anim.dl));
                        ((FrameLayout) billShareActivity2.a((int) C0906R.id.cup)).clearAnimation();
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[0], billShareActivity2, BillShareActivity.f2861a, false, 27946, new Class[0], Void.TYPE);
                        break;
                    }
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36709a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BillShareActivity f36710b;

        g(BillShareActivity billShareActivity) {
            this.f36710b = billShareActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36709a, false, 27971, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36709a, false, 27971, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            if (TextUtils.equals(BillShareActivity.b(this.f36710b).getUid(), a2.getCurUserId())) {
                com.ss.android.ugc.aweme.commerce.e.b.a(this.f36710b, this.f36710b.getResources().getString(C0906R.string.zf));
                return;
            }
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                BillShareActivity billShareActivity = this.f36710b;
                if (PatchProxy.isSupport(new Object[0], billShareActivity, BillShareActivity.f2861a, false, 27947, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], billShareActivity, BillShareActivity.f2861a, false, 27947, new Class[0], Void.TYPE);
                    return;
                }
                Object service = ServiceManager.get().getService(IAVService.class);
                Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get()\n   …e(IAVService::class.java)");
                Intent intent = new Intent(billShareActivity, ((IAVService) service).getRecordPermissionActivity());
                v vVar = new v();
                com.ss.android.ugc.aweme.commerce.service.models.h hVar = billShareActivity.i;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                }
                vVar.setTitle(hVar.shortTitle());
                ShopOrderShareStruct shopOrderShareStruct = new ShopOrderShareStruct();
                shopOrderShareStruct.setOriginItemId(billShareActivity.n);
                CommerceUser commerceUser = billShareActivity.j;
                if (commerceUser == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userInfo");
                }
                shopOrderShareStruct.setOriginUserId(commerceUser.getUid());
                com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = billShareActivity.i;
                if (hVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                }
                shopOrderShareStruct.setPromotionId(hVar2.getPromotionId());
                vVar.setShopOrderShareStruct(shopOrderShareStruct);
                com.ss.android.ugc.aweme.commercialize.model.e b2 = com.ss.android.ugc.aweme.commercialize.model.e.b("");
                Intrinsics.checkExpressionValueIsNotNull(b2, "commercePublishModel");
                b2.f39379f = vVar;
                intent.putExtra("commerce_data_in_tools_line", com.ss.android.ugc.aweme.commercialize.model.e.a(b2));
                intent.putExtra("shoot_way", "unboxing");
                intent.putExtra("creation_id", billShareActivity.p);
                billShareActivity.startActivity(intent);
                com.ss.android.ugc.aweme.commerce.service.logs.c cVar = new com.ss.android.ugc.aweme.commerce.service.logs.c();
                cVar.f38122f = "unboxing";
                cVar.g = billShareActivity.p;
                cVar.h = billShareActivity.f();
                cVar.b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36711a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BillShareActivity f36712b;

        h(BillShareActivity billShareActivity) {
            this.f36712b = billShareActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36711a, false, 27972, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36711a, false, 27972, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f36712b.o) {
                if (this.f36712b.n != null) {
                    h.a aVar = com.ss.android.ugc.aweme.commerce.preview.h.f37502d;
                    n.a aVar2 = n.r;
                    Context context = this.f36712b;
                    CommerceUser b2 = BillShareActivity.b(this.f36712b);
                    String promotionId = BillShareActivity.a(this.f36712b).getPromotionId();
                    if (promotionId == null) {
                        Intrinsics.throwNpe();
                    }
                    String productId = BillShareActivity.a(this.f36712b).getProductId();
                    if (productId == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar.a(n.a.a(aVar2, context, b2, promotionId, productId, BillShareActivity.a(this.f36712b).getDetailUrl(), this.f36712b.m, this.f36712b.k, null, null, com.ss.android.ugc.aweme.app.f.f34168b, null, null, SystemClock.uptimeMillis(), BillShareActivity.a(this.f36712b).getPromotionSource(), null, null, null, null, 248832));
                }
                return;
            }
            this.f36712b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "promotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<com.ss.android.ugc.aweme.commerce.service.models.h, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ d $billShareModel;
        final /* synthetic */ BillShareActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(BillShareActivity billShareActivity, d dVar) {
            super(1);
            this.this$0 = billShareActivity;
            this.$billShareModel = dVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.ss.android.ugc.aweme.commerce.service.models.h) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.ss.android.ugc.aweme.commerce.service.models.h hVar) {
            View view;
            View view2;
            com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, changeQuickRedirect, false, 27973, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2}, this, changeQuickRedirect, false, 27973, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hVar2, "promotion");
            this.this$0.i = hVar2;
            BillShareActivity billShareActivity = this.this$0;
            String str = this.$billShareModel.f36756c;
            if (str == null) {
                str = "INVALID_ENTER_FROM";
            }
            billShareActivity.m = str;
            BillShareActivity billShareActivity2 = this.this$0;
            String str2 = this.$billShareModel.f36757d;
            if (str2 == null) {
                str2 = "click_slide_card";
            }
            billShareActivity2.k = str2;
            this.this$0.n = this.$billShareModel.f36758e;
            this.this$0.o = this.$billShareModel.f36759f;
            this.this$0.p = this.$billShareModel.g;
            BillShareActivity billShareActivity3 = this.this$0;
            if (PatchProxy.isSupport(new Object[0], billShareActivity3, BillShareActivity.f2861a, false, 27943, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], billShareActivity3, BillShareActivity.f2861a, false, 27943, new Class[0], Void.TYPE);
            } else {
                billShareActivity3.f2863c = new c();
                c cVar = billShareActivity3.f2863c;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                }
                cVar.a(billShareActivity3);
                c cVar2 = billShareActivity3.f2863c;
                if (cVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                }
                cVar2.a(new b());
                c cVar3 = billShareActivity3.f2863c;
                if (cVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                }
                if (cVar3.f2978e != null) {
                    ((b) cVar3.f2978e).f36751d = true;
                }
            }
            BillShareActivity billShareActivity4 = this.this$0;
            if (PatchProxy.isSupport(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27944, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27944, new Class[0], Void.TYPE);
            } else {
                Context context = billShareActivity4;
                ((DmtStatusView) billShareActivity4.a((int) C0906R.id.cvb)).setBuilder(DmtStatusView.a.a(context));
                View a2 = billShareActivity4.a((int) C0906R.id.cv0);
                Intrinsics.checkExpressionValueIsNotNull(a2, "status_bar");
                if (PatchProxy.isSupport(new Object[]{a2}, billShareActivity4, BillShareActivity.f2861a, false, 27959, new Class[]{View.class}, Void.TYPE)) {
                    BillShareActivity billShareActivity5 = billShareActivity4;
                    PatchProxy.accessDispatch(new Object[]{a2}, billShareActivity5, BillShareActivity.f2861a, false, 27959, new Class[]{View.class}, Void.TYPE);
                } else if (Build.VERSION.SDK_INT >= 19) {
                    a2.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(a2.getContext());
                }
                if (PatchProxy.isSupport(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27954, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27954, new Class[0], Void.TYPE);
                } else {
                    billShareActivity4.f2864d = new FrameLayout(context);
                    FrameLayout frameLayout = billShareActivity4.f2864d;
                    if (frameLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    FrameLayout frameLayout2 = billShareActivity4.f2864d;
                    if (frameLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    if (PatchProxy.isSupport(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27956, new Class[0], View.class)) {
                        view = (View) PatchProxy.accessDispatch(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27956, new Class[0], View.class);
                    } else {
                        LayoutInflater from = LayoutInflater.from(context);
                        FrameLayout frameLayout3 = billShareActivity4.f2864d;
                        if (frameLayout3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("headerView");
                        }
                        view = from.inflate(C0906R.layout.a22, frameLayout3, false);
                        Intrinsics.checkExpressionValueIsNotNull(view, "LayoutInflater.from(this…eader, headerView, false)");
                    }
                    frameLayout2.addView(view, new RecyclerView.LayoutParams(-1, -2));
                    billShareActivity4.f2865e = new FrameLayout(context);
                    FrameLayout frameLayout4 = billShareActivity4.f2865e;
                    if (frameLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("footerView");
                    }
                    frameLayout4.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    FrameLayout frameLayout5 = billShareActivity4.f2865e;
                    if (frameLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("footerView");
                    }
                    if (PatchProxy.isSupport(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27955, new Class[0], View.class)) {
                        view2 = (View) PatchProxy.accessDispatch(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27955, new Class[0], View.class);
                    } else {
                        LayoutInflater from2 = LayoutInflater.from(context);
                        FrameLayout frameLayout6 = billShareActivity4.f2865e;
                        if (frameLayout6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("footerView");
                        }
                        view2 = from2.inflate(C0906R.layout.a21, frameLayout6, false);
                        Intrinsics.checkExpressionValueIsNotNull(view2, "LayoutInflater.from(this…ooter, footerView, false)");
                    }
                    frameLayout5.addView(view2, new RecyclerView.LayoutParams(-1, -2));
                }
                if (PatchProxy.isSupport(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27950, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27950, new Class[0], Void.TYPE);
                } else {
                    l.a aVar = l.f38039a;
                    FrameLayout frameLayout7 = billShareActivity4.f2864d;
                    if (frameLayout7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    RemoteImageView remoteImageView = (RemoteImageView) frameLayout7.findViewById(C0906R.id.l0);
                    Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "headerView.bill_share_core_image");
                    com.ss.android.ugc.aweme.commerce.service.models.h hVar3 = billShareActivity4.i;
                    if (hVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                    }
                    aVar.a(remoteImageView, hVar3.preferredImages());
                    FrameLayout frameLayout8 = billShareActivity4.f2864d;
                    if (frameLayout8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    DmtTextView dmtTextView = (DmtTextView) frameLayout8.findViewById(C0906R.id.l4);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.bill_share_title");
                    com.ss.android.ugc.aweme.commerce.service.models.h hVar4 = billShareActivity4.i;
                    if (hVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                    }
                    dmtTextView.setText(hVar4.longTitle());
                    FrameLayout frameLayout9 = billShareActivity4.f2864d;
                    if (frameLayout9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    DmtTextView dmtTextView2 = (DmtTextView) frameLayout9.findViewById(C0906R.id.l1);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "headerView.bill_share_price");
                    com.ss.android.ugc.aweme.commerce.service.models.h hVar5 = billShareActivity4.i;
                    if (hVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                    }
                    dmtTextView2.setText(com.ss.android.ugc.aweme.commerce.service.l.d.a(hVar5.getPrice()));
                    FrameLayout frameLayout10 = billShareActivity4.f2864d;
                    if (frameLayout10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    DmtTextView dmtTextView3 = (DmtTextView) frameLayout10.findViewById(C0906R.id.l3);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "headerView.bill_share_statics");
                    dmtTextView3.setText(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(context, C0906R.string.wv, 0));
                    FrameLayout frameLayout11 = billShareActivity4.f2864d;
                    if (frameLayout11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    DmtTextView dmtTextView4 = (DmtTextView) frameLayout11.findViewById(C0906R.id.l2);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "headerView.bill_share_sell_count");
                    g.a aVar2 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
                    Object[] objArr = new Object[1];
                    com.ss.android.ugc.aweme.commerce.service.models.h hVar6 = billShareActivity4.i;
                    if (hVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                    }
                    objArr[0] = Integer.valueOf(hVar6.getSales());
                    dmtTextView4.setText(aVar2.a(context, C0906R.string.zc, objArr));
                }
                if (PatchProxy.isSupport(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27951, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], billShareActivity4, BillShareActivity.f2861a, false, 27951, new Class[0], Void.TYPE);
                } else {
                    List<Aweme> list = billShareActivity4.h;
                    CommerceUser commerceUser = billShareActivity4.j;
                    if (commerceUser == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userInfo");
                    }
                    billShareActivity4.g = new BillShareAdapter(list, commerceUser.getUid(), new b(billShareActivity4), c.INSTANCE);
                    billShareActivity4.f2866f = new StaggeredGridLayoutManager(2, 1);
                    BillShareAdapter billShareAdapter = billShareActivity4.g;
                    if (billShareAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    }
                    SmartRecyclerAdapter smartRecyclerAdapter = new SmartRecyclerAdapter(billShareAdapter);
                    FrameLayout frameLayout12 = billShareActivity4.f2864d;
                    if (frameLayout12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    smartRecyclerAdapter.a(frameLayout12);
                    FrameLayout frameLayout13 = billShareActivity4.f2865e;
                    if (frameLayout13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("footerView");
                    }
                    smartRecyclerAdapter.b(frameLayout13);
                    smartRecyclerAdapter.f38253d = billShareActivity4;
                    RecyclerView recyclerView = (RecyclerView) billShareActivity4.a((int) C0906R.id.ccd);
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view_bill_share");
                    StaggeredGridLayoutManager staggeredGridLayoutManager = billShareActivity4.f2866f;
                    if (staggeredGridLayoutManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("staggeredLayoutManager");
                    }
                    recyclerView.setLayoutManager(staggeredGridLayoutManager);
                    ((RecyclerView) billShareActivity4.a((int) C0906R.id.ccd)).addItemDecoration(new NoneSymmetryDecoration(context, 8.0f, 2.0f, d.INSTANCE));
                    RecyclerView recyclerView2 = (RecyclerView) billShareActivity4.a((int) C0906R.id.ccd);
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "recycler_view_bill_share");
                    recyclerView2.setAdapter(smartRecyclerAdapter);
                }
                billShareActivity4.a((int) C0906R.id.w6).setOnClickListener(new e(billShareActivity4));
                ((RecyclerView) billShareActivity4.a((int) C0906R.id.ccd)).addOnScrollListener(new BillShareActivity$bindViews$2(billShareActivity4));
                billShareActivity4.a((int) C0906R.id.cus).startAnimation(AnimationUtils.loadAnimation(context, C0906R.anim.dl));
                ((FrameLayout) billShareActivity4.a((int) C0906R.id.cup)).setOnTouchListener(new f(billShareActivity4));
                ((FrameLayout) billShareActivity4.a((int) C0906R.id.cup)).setOnClickListener(new g(billShareActivity4));
                FrameLayout frameLayout14 = billShareActivity4.f2864d;
                if (frameLayout14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                frameLayout14.setOnClickListener(new h(billShareActivity4));
            }
            ad adVar = new ad();
            adVar.f38062f = this.this$0.f();
            adVar.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<JSONObject, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ BillShareActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(BillShareActivity billShareActivity) {
            super(1);
            this.this$0 = billShareActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull JSONObject jSONObject) {
            if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 27974, new Class[]{JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 27974, new Class[]{JSONObject.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(jSONObject, AdvanceSetting.NETWORK_TYPE);
            a.f36734c.a(this.this$0);
            this.this$0.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/ugc/aweme/commerce/billshare/BillShareActivity$smoothScroller$2$1", "invoke", "()Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareActivity$smoothScroller$2$1;"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<BillShareActivity$smoothScroller$2$1> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ BillShareActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(BillShareActivity billShareActivity) {
            super(0);
            this.this$0 = billShareActivity;
        }

        @NotNull
        public final BillShareActivity$smoothScroller$2$1 invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27977, new Class[0], BillShareActivity$smoothScroller$2$1.class)) {
                return new BillShareActivity$smoothScroller$2$1(this, this.this$0);
            }
            return (BillShareActivity$smoothScroller$2$1) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27977, new Class[0], BillShareActivity$smoothScroller$2$1.class);
        }
    }

    private final RecyclerView.SmoothScroller i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27940, new Class[0], RecyclerView.SmoothScroller.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27940, new Class[0], RecyclerView.SmoothScroller.class);
        } else {
            value = this.t.getValue();
        }
        return (RecyclerView.SmoothScroller) value;
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2861a, false, 27961, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2861a, false, 27961, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.u == null) {
            this.u = new HashMap();
        }
        View view = (View) this.u.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.u.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27963, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27963, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.billshare.BillShareActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.billshare.BillShareActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2861a, false, 27964, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2861a, false, 27964, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.billshare.BillShareActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final String f() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27948, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27948, new Class[0], String.class);
        } else if (TextUtils.equals("commodity_page", this.m)) {
            return "full_screen_card";
        } else {
            return this.m;
        }
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27960, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27960, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (isTaskRoot()) {
            com.ss.android.ugc.aweme.ag.h.a().a((Activity) this, "aweme://main");
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27925, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27925, new Class[0], Void.TYPE);
            return;
        }
        g();
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27958, new Class[0], Void.TYPE);
            return;
        }
        a.f36734c.a(this);
        super.onBackPressed();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27924, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27924, new Class[0], Void.TYPE);
            return;
        }
        g();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27942, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27942, new Class[0], Void.TYPE);
            return;
        }
        super.setStatusBarColor();
        this.s = ImmersionBar.with((Activity) this);
        ImmersionBar immersionBar = this.s;
        if (immersionBar != null) {
            ImmersionBar statusBarDarkFont = immersionBar.statusBarDarkFont(true);
            if (statusBarDarkFont != null) {
                statusBarDarkFont.init();
            }
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27928, new Class[0], Void.TYPE);
            return;
        }
        a(true);
    }

    public final void z_() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27926, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27926, new Class[0], Void.TYPE);
            return;
        }
        g();
    }

    private final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27923, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27923, new Class[0], Void.TYPE);
        } else if (!this.h.isEmpty()) {
            ((DmtStatusView) a((int) C0906R.id.cvb)).b();
            a(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.string.b75, new Object[0]), false);
        } else {
            DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.cvb);
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_loading");
            dmtStatusView.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) a((int) C0906R.id.br0);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "no_videos_hint");
            relativeLayout.setVisibility(8);
            ((DmtStatusView) a((int) C0906R.id.cvb)).d();
        }
    }

    private final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27932, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27932, new Class[0], Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.f2865e;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerView");
        }
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.bjb);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "footerView.loading_more_area");
        linearLayout.setVisibility(4);
        DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.cvb);
        Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_loading");
        dmtStatusView.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) a((int) C0906R.id.br0);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "no_videos_hint");
        relativeLayout.setVisibility(8);
        ((DmtStatusView) a((int) C0906R.id.cvb)).b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27938, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{4}, this, f2861a, false, 27939, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{4}, this, f2861a, false, 27939, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.i;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        String promotionId = hVar.getPromotionId();
        c cVar = this.f2863c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        cVar.a(4, promotionId);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2861a, false, 27957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2861a, false, 27957, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar immersionBar = this.s;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        if (this.f2863c != null) {
            c cVar = this.f2863c;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            cVar.k();
        }
        if (org.greenrobot.eventbus.c.a().b((Object) this)) {
            org.greenrobot.eventbus.c.a().c(this);
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.h a(BillShareActivity billShareActivity) {
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = billShareActivity.i;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        return hVar;
    }

    public static final /* synthetic */ CommerceUser b(BillShareActivity billShareActivity) {
        CommerceUser commerceUser = billShareActivity.j;
        if (commerceUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
        }
        return commerceUser;
    }

    public final void b(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2861a, false, 27930, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2861a, false, 27930, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a(false);
    }

    public final void c(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2861a, false, 27931, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2861a, false, 27931, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a(false);
    }

    public final void d(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2861a, false, 27929, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2861a, false, 27929, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a(false);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        d dVar;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2861a, false, 27941, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2861a, false, 27941, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.billshare.BillShareActivity", "onCreate", true);
        super.onCreate(bundle);
        if (!org.greenrobot.eventbus.c.a().b((Object) this)) {
            org.greenrobot.eventbus.c.a().a((Object) this);
        }
        setContentView((int) C0906R.layout.a20);
        a.C0462a aVar = a.f36734c;
        Activity activity = this;
        if (PatchProxy.isSupport(new Object[]{activity}, aVar, a.C0462a.f36735a, false, 27984, new Class[]{Activity.class}, d.class)) {
            a.C0462a aVar2 = aVar;
            dVar = (d) PatchProxy.accessDispatch(new Object[]{activity}, aVar2, a.C0462a.f36735a, false, 27984, new Class[]{Activity.class}, d.class);
        } else {
            Intrinsics.checkParameterIsNotNull(activity, "act");
            dVar = a.f36732a.get(activity.getIntent().getStringExtra("KEY_HASH_CODE"));
        }
        if (dVar == null) {
            a.f36734c.a(activity);
            finish();
        } else {
            this.j = dVar.h;
            com.ss.android.ugc.aweme.commerce.promotion.a aVar3 = com.ss.android.ugc.aweme.commerce.promotion.a.f37668b;
            String promotionId = dVar.f36755b.getPromotionId();
            String productId = dVar.f36755b.getProductId();
            CommerceUser commerceUser = this.j;
            if (commerceUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            }
            aVar3.a(promotionId, productId, commerceUser.getUid(), new i(this, dVar), new j(this));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.billshare.BillShareActivity", "onCreate", false);
    }

    @Subscribe
    public final void onEvent(@NotNull ar arVar) {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f2861a, false, 27952, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f2861a, false, 27952, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(arVar, "event");
        if (arVar.f45292b == 21 && (arVar.f45293c instanceof Aweme)) {
            Object obj = arVar.f45293c;
            if (obj != null) {
                Aweme aweme = (Aweme) obj;
                if (!PatchProxy.isSupport(new Object[]{aweme}, this, f2861a, false, 27953, new Class[]{Aweme.class}, Integer.TYPE)) {
                    Iterator<Aweme> it2 = this.h.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (TextUtils.equals(aweme.getAid(), it2.next().getAid())) {
                            i2 = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, this, f2861a, false, 27953, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
                }
                i().setTargetPosition(i2 + 1);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2866f;
                if (staggeredGridLayoutManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("staggeredLayoutManager");
                }
                staggeredGridLayoutManager.startSmoothScroll(i());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            }
        }
    }

    private final void a(List<? extends Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f2861a, false, 27936, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f2861a, false, 27936, new Class[]{List.class}, Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.f2864d;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        DmtTextView dmtTextView = (DmtTextView) frameLayout.findViewById(C0906R.id.l3);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.bill_share_statics");
        g.a aVar = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
        Context context = this;
        Object[] objArr = new Object[1];
        c cVar = this.f2863c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        objArr[0] = Integer.valueOf(cVar.c());
        dmtTextView.setText(aVar.a(context, C0906R.string.wv, objArr));
        int size = this.h.size();
        this.h.clear();
        this.h.addAll(list);
        if (this.h.size() > 0) {
            FrameLayout frameLayout2 = this.f2864d;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            View findViewById = frameLayout2.findViewById(C0906R.id.ani);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "headerView.headerDivider");
            findViewById.setVisibility(0);
        } else {
            FrameLayout frameLayout3 = this.f2864d;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            View findViewById2 = frameLayout3.findViewById(C0906R.id.ani);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "headerView.headerDivider");
            findViewById2.setVisibility(8);
        }
        BillShareAdapter billShareAdapter = this.g;
        if (billShareAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        c cVar2 = this.f2863c;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        billShareAdapter.f36716b = cVar2.d();
        BillShareAdapter billShareAdapter2 = this.g;
        if (billShareAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        billShareAdapter2.notifyItemRangeInserted(size + 1, list.size() - size);
    }

    private final void a(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2861a, false, 27927, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2861a, false, 27927, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!this.h.isEmpty()) {
            g.a aVar = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
            Context context = this;
            if (z) {
                i2 = C0906R.string.b77;
            } else {
                i2 = C0906R.string.b76;
            }
            a(aVar.a(context, i2, new Object[0]), true);
        } else {
            DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.cvb);
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_loading");
            dmtStatusView.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) a((int) C0906R.id.br0);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "no_videos_hint");
            relativeLayout.setVisibility(0);
        }
        ((DmtStatusView) a((int) C0906R.id.cvb)).b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(@org.jetbrains.annotations.Nullable java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r19, boolean r20) {
        /*
            r18 = this;
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r19
            java.lang.Byte r3 = java.lang.Byte.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f2861a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 27934(0x6d1e, float:3.9144E-41)
            r3 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0049
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r19
            java.lang.Byte r0 = java.lang.Byte.valueOf(r20)
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = f2861a
            r14 = 0
            r15 = 27934(0x6d1e, float:3.9144E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r18
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0049:
            if (r19 == 0) goto L_0x005a
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            r1 = r0
            r0 = r18
            goto L_0x005f
        L_0x005a:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0056
        L_0x005f:
            r0.a((java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>) r1)
            r18.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.billshare.BillShareActivity.c(java.util.List, boolean):void");
    }

    private final void a(String str, boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2861a, false, 27937, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f2861a, false, 27937, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.f2865e;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerView");
        }
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.bjb);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "footerView.loading_more_area");
        linearLayout.setVisibility(0);
        FrameLayout frameLayout2 = this.f2865e;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerView");
        }
        ProgressBar progressBar = (ProgressBar) frameLayout2.findViewById(C0906R.id.bjd);
        Intrinsics.checkExpressionValueIsNotNull(progressBar, "footerView.loading_more_progress");
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        progressBar.setVisibility(i2);
        FrameLayout frameLayout3 = this.f2865e;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerView");
        }
        DmtTextView dmtTextView = (DmtTextView) frameLayout3.findViewById(C0906R.id.bjc);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "footerView.loading_more_content");
        dmtTextView.setVisibility(0);
        FrameLayout frameLayout4 = this.f2865e;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerView");
        }
        DmtTextView dmtTextView2 = (DmtTextView) frameLayout4.findViewById(C0906R.id.bjc);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "footerView.loading_more_content");
        dmtTextView2.setText(str);
        RelativeLayout relativeLayout = (RelativeLayout) a((int) C0906R.id.br0);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "no_videos_hint");
        relativeLayout.setVisibility(8);
        DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.cvb);
        Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_loading");
        dmtStatusView.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(@org.jetbrains.annotations.Nullable java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r19, boolean r20) {
        /*
            r18 = this;
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r19
            java.lang.Byte r3 = java.lang.Byte.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f2861a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 27933(0x6d1d, float:3.9142E-41)
            r3 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0049
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r19
            java.lang.Byte r0 = java.lang.Byte.valueOf(r20)
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = f2861a
            r14 = 0
            r15 = 27933(0x6d1d, float:3.9142E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r18
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0049:
            if (r19 == 0) goto L_0x005a
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            r1 = r0
            r0 = r18
            goto L_0x005f
        L_0x005a:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0056
        L_0x005f:
            r0.a((java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>) r1)
            r18.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.billshare.BillShareActivity.b(java.util.List, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r19, boolean r20) {
        /*
            r18 = this;
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r19
            java.lang.Byte r3 = java.lang.Byte.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f2861a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 27935(0x6d1f, float:3.9145E-41)
            r3 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0049
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r19
            java.lang.Byte r0 = java.lang.Byte.valueOf(r20)
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = f2861a
            r14 = 0
            r15 = 27935(0x6d1f, float:3.9145E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r18
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0049:
            if (r19 == 0) goto L_0x005a
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            r1 = r0
            r0 = r18
            goto L_0x005f
        L_0x005a:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0056
        L_0x005f:
            r0.a((java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>) r1)
            r18.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.billshare.BillShareActivity.a(java.util.List, boolean):void");
    }
}
