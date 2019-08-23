package com.ss.android.ugc.aweme.longvideonew;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior;
import com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout;
import com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController;
import com.ss.android.ugc.aweme.longvideonew.feature.Rotate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\b\u0012\u0004\u0012\u00020\t0\b:\u0001WB\u0005¢\u0006\u0002\u0010\nJ\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000203H\u0016J\u0010\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u001dH\u0016J\b\u00107\u001a\u00020$H\u0002J\b\u00108\u001a\u000203H\u0002J\b\u00109\u001a\u000203H\u0002J\b\u0010:\u001a\u000203H\u0002J\b\u0010;\u001a\u00020<H\u0002J\u0006\u0010=\u001a\u000203J\u0012\u0010>\u001a\u0002032\b\u0010?\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010@\u001a\u0002032\b\u0010A\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010B\u001a\u0002032\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J&\u0010E\u001a\u0004\u0018\u00010\u000e2\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010L\u001a\u000203H\u0016J\u0012\u0010M\u001a\u0002032\b\u0010N\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010O\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020$2\b\u0010N\u001a\u0004\u0018\u00010QH\u0016J\u001a\u0010R\u001a\u0002032\u0006\u0010S\u001a\u00020\u000e2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010T\u001a\u000203H\u0002J\u0010\u0010U\u001a\u0002032\b\u0010V\u001a\u0004\u0018\u00010\fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/LongVideoPlayFragment;", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "Lcom/ss/android/ugc/aweme/base/activity/ActivityOnKeyDownListener;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/ugc/aweme/longvideonew/feature/NoOperateModeController$NoOperationCallback;", "Lcom/ss/android/ugc/aweme/feed/listener/IGetEnterFromListener;", "Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "()V", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mBackgroundContainer", "Landroid/view/View;", "mBusinessType", "", "mCloseView", "Landroid/widget/ImageView;", "mCommerceLikeLayout", "Lcom/ss/android/ugc/aweme/commercialize/views/CommerceLikeLayout;", "mDataCenter", "Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "mDialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "mEventType", "mFunctionalLayerContainer", "Landroid/widget/FrameLayout;", "mIsLandscapeMode", "", "mLongVideoScreenHelper", "Lcom/ss/android/ugc/aweme/longvideonew/feature/LongVideoScreenHelper;", "mNoOperateModeController", "Lcom/ss/android/ugc/aweme/longvideonew/feature/NoOperateModeController;", "mOperationContainer", "mPageType", "", "mPlayerSeekContainer", "mResizeVideoSizeEvent", "Lcom/ss/android/ugc/aweme/longvideonew/feature/ResizeVideoSizeEvent;", "mRootView", "mRotate", "Lcom/ss/android/ugc/aweme/longvideonew/feature/Rotate;", "mToolContainer", "Landroid/widget/RelativeLayout;", "mVideo", "Lcom/ss/android/ugc/aweme/feed/model/Video;", "mVideoPlayerContainer", "Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout;", "mVideoPlayerRootView", "enterNoOperationMode", "", "exitNoOperationMode", "getEnterFrom", "eventV3", "getNavigationBarHeight", "initArguments", "initLongVideoBottomSheetBehavior", "initLongVideoPlayer", "initScreenSize", "Lcom/ss/android/ugc/aweme/longvideonew/feature/Size;", "onBackPressed", "onChanged", "t", "onClick", "v", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInternalEvent", "event", "onKeyDown", "keyCode", "Landroid/view/KeyEvent;", "onViewCreated", "view", "postOperateEvent", "setAweme", "aweme", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LongVideoPlayFragment extends AmeBaseFragment implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>, View.OnClickListener, com.ss.android.ugc.aweme.base.activity.a, aa<ar>, com.ss.android.ugc.aweme.feed.listener.c, NoOperateModeController.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54000a;
    public static final a r = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public Aweme f54001b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f54002c;

    /* renamed from: d  reason: collision with root package name */
    public DataCenter f54003d;

    /* renamed from: e  reason: collision with root package name */
    public Rotate f54004e;

    /* renamed from: f  reason: collision with root package name */
    public Video f54005f;
    public String g = "";
    public com.ss.android.ugc.aweme.longvideonew.feature.a h;
    public NoOperateModeController i;
    public FrameLayout j;
    public DoubleClickDiggFrameLayout k;
    public FrameLayout l;
    public FrameLayout m;
    public CommerceLikeLayout n;
    public View o;
    public ImageView p;
    public RelativeLayout q;
    private String s = "noBusinessType";
    private int t;
    private com.ss.android.ugc.aweme.feed.d u;
    private FrameLayout v;
    private FrameLayout w;
    private com.ss.android.ugc.aweme.longvideonew.feature.c x;
    private HashMap y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/LongVideoPlayFragment$Companion;", "", "()V", "ACTION_CONTAINER_ON_DOUBLE_CLICK_IDGG", "", "ACTION_IS_LANDSCAPE_MODE", "ACTION_KEYCODE_VOLUME_DOWN", "ACTION_KEYCODE_VOLUME_UP", "ANIMATION_DURATION_TWO_HUNDRED_LONG", "", "EXTRA_BUSINESS_TYPE", "EXTRA_EVENT_TYPE", "EXTRA_PAGE_TYPE", "NO_OPERATION_MODE_ALPHA", "", "TOOL_CONTAINER_SLIDE_OFFSET", "newInstance", "Lcom/ss/android/ugc/aweme/longvideonew/LongVideoPlayFragment;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "eventType", "pageType", "", "businessType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54006a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayFragment f54008b;

        b(LongVideoPlayFragment longVideoPlayFragment) {
            this.f54008b = longVideoPlayFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54007a, false, 56858, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54007a, false, 56858, new Class[0], Void.TYPE);
                return;
            }
            FrameLayout frameLayout = this.f54008b.m;
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
            }
            FrameLayout frameLayout2 = this.f54008b.m;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f54009a = new c();

        c() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/LongVideoPlayFragment$initLongVideoBottomSheetBehavior$1", "Landroid/support/design/widget/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayFragment f54011b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CustomBottomSheetBehavior f54012c;

        d(LongVideoPlayFragment longVideoPlayFragment, CustomBottomSheetBehavior customBottomSheetBehavior) {
            this.f54011b = longVideoPlayFragment;
            this.f54012c = customBottomSheetBehavior;
        }

        public final void onStateChanged(@NotNull View view, int i) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f54010a, false, 56859, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f54010a, false, 56859, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            if (i == 1) {
                Rotate rotate = this.f54011b.f54004e;
                if (rotate != null && rotate.f3499f) {
                    this.f54012c.setState(4);
                }
            } else if (i == 5) {
                FragmentActivity activity = this.f54011b.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }

        public final void onSlide(@NotNull View view, float f2) {
            if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f54010a, false, 56860, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f54010a, false, 56860, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            if (Float.isNaN(f2)) {
                View view2 = this.f54011b.o;
                if (view2 != null) {
                    view2.setAlpha(1.0f);
                }
                RelativeLayout relativeLayout = this.f54011b.q;
                if (relativeLayout != null) {
                    relativeLayout.setAlpha(1.0f);
                }
                return;
            }
            float abs = Math.abs(f2);
            if (abs > 0.0f && abs < 0.15f) {
                float f3 = abs / 0.15f;
                RelativeLayout relativeLayout2 = this.f54011b.q;
                if (relativeLayout2 != null) {
                    relativeLayout2.setAlpha(1.0f - f3);
                }
            }
            if (abs > 0.15f) {
                float f4 = (abs - 0.15f) / 0.85f;
                View view3 = this.f54011b.o;
                if (view3 != null) {
                    view3.setAlpha(1.0f - f4);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/LongVideoPlayFragment$initLongVideoBottomSheetBehavior$2", "Lcom/ss/android/ugc/aweme/longvideo/view/CustomBottomSheetBehavior$OnTouchEventCallBack;", "onTouchEvent", "", "parent", "Landroid/support/design/widget/CoordinatorLayout;", "child", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements CustomBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayFragment f54014b;

        e(LongVideoPlayFragment longVideoPlayFragment) {
            this.f54014b = longVideoPlayFragment;
        }

        public final void a(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull MotionEvent motionEvent) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            View view2 = view;
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, view2, motionEvent2}, this, f54013a, false, 56861, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, view2, motionEvent2}, this, f54013a, false, 56861, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(coordinatorLayout2, "parent");
            Intrinsics.checkParameterIsNotNull(view2, "child");
            Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
            DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.f54014b.k;
            if (doubleClickDiggFrameLayout != null) {
                doubleClickDiggFrameLayout.a(motionEvent2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/LongVideoPlayFragment$initLongVideoPlayer$1", "Lcom/ss/android/ugc/aweme/longvideonew/feature/Rotate$Observer;", "rotateChange", "", "isLandscape", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f implements Rotate.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayFragment f54016b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.longvideonew.feature.d f54017c;

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54015a, false, 56862, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54015a, false, 56862, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f54016b.f54002c = z;
            ImageView imageView = this.f54016b.p;
            if (imageView != null) {
                imageView.setSelected(this.f54016b.f54002c);
            }
            DataCenter dataCenter = this.f54016b.f54003d;
            if (dataCenter != null) {
                dataCenter.a("action_is_landscape_mode", (Object) Boolean.valueOf(this.f54016b.f54002c));
            }
            com.ss.android.ugc.aweme.longvideonew.feature.a aVar = this.f54016b.h;
            if (aVar != null) {
                aVar.a(this.f54016b.f54002c);
            }
            com.ss.android.ugc.aweme.longvideonew.feature.b.f54072a.a((Activity) this.f54016b.getActivity(), (View) this.f54016b.l, (View) this.f54016b.j, this.f54016b.f54005f, this.f54017c, this.f54016b.f54002c);
            this.f54016b.d();
        }

        f(LongVideoPlayFragment longVideoPlayFragment, com.ss.android.ugc.aweme.longvideonew.feature.d dVar) {
            this.f54016b = longVideoPlayFragment;
            this.f54017c = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/LongVideoPlayFragment$onViewCreated$1", "Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout$OnDiggListener;", "onClick", "", "onDoubleClickDigg", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements DoubleClickDiggFrameLayout.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54018a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayFragment f54019b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f54018a, false, 56863, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54018a, false, 56863, new Class[0], Void.TYPE);
                return;
            }
            DataCenter dataCenter = this.f54019b.f54003d;
            if (dataCenter != null) {
                dataCenter.a("action_container_on_double_click_digg", (Object) "onDoubleClickDigg");
            }
            CommerceLikeLayout commerceLikeLayout = this.f54019b.n;
            if (commerceLikeLayout != null) {
                commerceLikeLayout.a(this.f54019b.g);
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f54018a, false, 56864, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54018a, false, 56864, new Class[0], Void.TYPE);
                return;
            }
            NoOperateModeController noOperateModeController = this.f54019b.i;
            if (noOperateModeController == null || !noOperateModeController.f3491d) {
                NoOperateModeController noOperateModeController2 = this.f54019b.i;
                if (noOperateModeController2 != null) {
                    noOperateModeController2.a(0);
                    return;
                }
                return;
            }
            this.f54019b.d();
        }

        g(LongVideoPlayFragment longVideoPlayFragment) {
            this.f54019b = longVideoPlayFragment;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54000a, false, 56844, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54000a, false, 56844, new Class[0], Void.TYPE);
            return;
        }
        if (this.f54002c) {
            Rotate rotate = this.f54004e;
            if (rotate != null) {
                rotate.b();
            }
        } else {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f54000a, false, 56852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54000a, false, 56852, new Class[0], Void.TYPE);
            return;
        }
        bg.a(new com.ss.android.ugc.aweme.longvideo.a.a());
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f54000a, false, 56843, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54000a, false, 56843, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.feed.d dVar = this.u;
        if (dVar != null) {
            dVar.b();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f54000a, false, 56855, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54000a, false, 56855, new Class[0], Void.TYPE);
            return;
        }
        if (this.y != null) {
            this.y.clear();
        }
    }

    private final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f54000a, false, 56845, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f54000a, false, 56845, new Class[0], Integer.TYPE)).intValue();
        }
        Resources resources = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    private final com.ss.android.ugc.aweme.longvideonew.feature.d f() {
        if (PatchProxy.isSupport(new Object[0], this, f54000a, false, 56846, new Class[0], com.ss.android.ugc.aweme.longvideonew.feature.d.class)) {
            return (com.ss.android.ugc.aweme.longvideonew.feature.d) PatchProxy.accessDispatch(new Object[0], this, f54000a, false, 56846, new Class[0], com.ss.android.ugc.aweme.longvideonew.feature.d.class);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WindowManager windowManager = activity.getWindowManager();
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (defaultDisplay != null) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
        }
        return com.ss.android.ugc.aweme.longvideonew.feature.b.f54072a.a(displayMetrics.widthPixels, p.e(getActivity()));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f54000a, false, 56850, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54000a, false, 56850, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f54002c) {
            ImageView imageView = this.p;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        FrameLayout frameLayout = this.w;
        if (frameLayout != null) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(0.34f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
        }
        if (b.f54028a.a()) {
            FrameLayout frameLayout2 = this.m;
            if (frameLayout2 != null) {
                ViewPropertyAnimator animate2 = frameLayout2.animate();
                if (animate2 != null) {
                    ViewPropertyAnimator alpha2 = animate2.alpha(0.34f);
                    if (alpha2 != null) {
                        ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                        if (duration2 != null) {
                            duration2.start();
                        }
                    }
                }
            }
            return;
        }
        FrameLayout frameLayout3 = this.m;
        if (frameLayout3 != null) {
            ViewPropertyAnimator animate3 = frameLayout3.animate();
            if (animate3 != null) {
                ViewPropertyAnimator alpha3 = animate3.alpha(0.0f);
                if (alpha3 != null) {
                    ViewPropertyAnimator duration3 = alpha3.setDuration(200);
                    if (duration3 != null) {
                        ViewPropertyAnimator withEndAction = duration3.withEndAction(new b(this));
                        if (withEndAction != null) {
                            withEndAction.start();
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f54000a, false, 56851, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54000a, false, 56851, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        FrameLayout frameLayout = this.w;
        if (frameLayout != null) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(1.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
        }
        if (!this.f54002c) {
            if (b.f54028a.a()) {
                FrameLayout frameLayout2 = this.m;
                if (frameLayout2 != null) {
                    ViewPropertyAnimator animate2 = frameLayout2.animate();
                    if (animate2 != null) {
                        ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                        if (alpha2 != null) {
                            ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                            if (duration2 != null) {
                                duration2.start();
                            }
                        }
                    }
                }
                return;
            }
            FrameLayout frameLayout3 = this.m;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            FrameLayout frameLayout4 = this.m;
            if (frameLayout4 != null) {
                frameLayout4.setAlpha(0.0f);
            }
            FrameLayout frameLayout5 = this.m;
            if (frameLayout5 != null) {
                ViewPropertyAnimator animate3 = frameLayout5.animate();
                if (animate3 != null) {
                    ViewPropertyAnimator alpha3 = animate3.alpha(1.0f);
                    if (alpha3 != null) {
                        ViewPropertyAnimator duration3 = alpha3.setDuration(200);
                        if (duration3 != null) {
                            ViewPropertyAnimator withEndAction = duration3.withEndAction(c.f54009a);
                            if (withEndAction != null) {
                                withEndAction.start();
                            }
                        }
                    }
                }
            }
        }
    }

    @NotNull
    public final String a(boolean z) {
        return this.g;
    }

    public final void onClick(@Nullable View view) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54000a, false, 56849, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54000a, false, 56849, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.azy) {
            a();
        }
    }

    public final /* synthetic */ void a(Object obj) {
        Integer num;
        ar arVar = (ar) obj;
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f54000a, false, 56853, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f54000a, false, 56853, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        User user = null;
        if (arVar != null) {
            num = Integer.valueOf(arVar.f45292b);
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                m a2 = m.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "NetworkStateManager.getInstance()");
                if (!a2.c()) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                    return;
                }
                Object obj2 = arVar.f45293c;
                if (obj2 != null) {
                    Aweme aweme = (Aweme) obj2;
                    if (aweme != null) {
                        user = aweme.getAuthor();
                    }
                    if (user != null) {
                        com.ss.android.ugc.aweme.feed.d dVar = this.u;
                        if (dVar != null) {
                            dVar.h(aweme);
                            return;
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                }
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f54000a, false, 56848, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f54000a, false, 56848, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            str = aVar.f34376a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -2091198651) {
                if (hashCode != 356960147) {
                    if (hashCode == 441659136 && str.equals("resize_video_and_cover")) {
                        this.x = (com.ss.android.ugc.aweme.longvideonew.feature.c) aVar.a();
                        com.ss.android.ugc.aweme.longvideonew.feature.b.f54072a.a((Activity) getActivity(), (View) this.l, (View) this.j, this.f54005f, f(), this.f54002c);
                    }
                } else if (str.equals("action_video_on_play_completed") && !this.f54002c) {
                    ImageView imageView = this.p;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    c();
                    NoOperateModeController noOperateModeController = this.i;
                    if (noOperateModeController != null) {
                        noOperateModeController.f3491d = false;
                    }
                }
            } else if (str.equals("action_switch_mode")) {
                Rotate rotate = this.f54004e;
                if (rotate != null) {
                    rotate.b();
                }
            }
        }
    }

    public final void onConfigurationChanged(@Nullable Configuration configuration) {
        Configuration configuration2 = configuration;
        if (PatchProxy.isSupport(new Object[]{configuration2}, this, f54000a, false, 56842, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration2}, this, f54000a, false, 56842, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        Rotate rotate = this.f54004e;
        if (rotate != null) {
            if (PatchProxy.isSupport(new Object[]{configuration2}, rotate, Rotate.f3494a, false, 56925, new Class[]{Configuration.class}, Void.TYPE)) {
                Rotate rotate2 = rotate;
                PatchProxy.accessDispatch(new Object[]{configuration2}, rotate2, Rotate.f3494a, false, 56925, new Class[]{Configuration.class}, Void.TYPE);
            } else if (configuration2 != null && configuration2.orientation == 1) {
                rotate.f3499f = false;
                rotate.a(false);
            } else if (configuration2 != null && configuration2.orientation == 2) {
                rotate.f3499f = true;
                rotate.a(true);
            }
        }
        super.onConfigurationChanged(configuration);
    }

    public final boolean a(int i2, @Nullable KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), keyEvent}, this, f54000a, false, 56847, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), keyEvent}, this, f54000a, false, 56847, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (i2) {
            case 24:
                DataCenter dataCenter = this.f54003d;
                if (dataCenter != null) {
                    dataCenter.a("action_keycode_volume_up", (Object) Integer.valueOf(i2));
                }
                return true;
            case 25:
                DataCenter dataCenter2 = this.f54003d;
                if (dataCenter2 != null) {
                    dataCenter2.a("action_keycode_volume_down", (Object) Integer.valueOf(i2));
                }
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0082, code lost:
        if (r0 == null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a6, code lost:
        if (r0 == null) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r20, @org.jetbrains.annotations.Nullable android.os.Bundle r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            r11 = 1
            r0[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r2 = f54000a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 56838(0xde06, float:7.9647E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            r0[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r2 = f54000a
            r3 = 0
            r4 = 56838(0xde06, float:7.9647E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            super.onViewCreated(r20, r21)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f54000a
            r3 = 0
            r4 = 56839(0xde07, float:7.9648E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r8 = 0
            if (r0 == 0) goto L_0x0074
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f54000a
            r3 = 0
            r4 = 56839(0xde07, float:7.9648E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00cd
        L_0x0074:
            android.os.Bundle r0 = r19.getArguments()
            if (r0 == 0) goto L_0x0084
            java.lang.String r1 = "extra_event_type"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L_0x0086
        L_0x0084:
            java.lang.String r0 = ""
        L_0x0086:
            r7.g = r0
            android.os.Bundle r0 = r19.getArguments()
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = "extra_page_type"
            int r0 = r0.getInt(r1, r10)
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            r7.t = r0
            android.os.Bundle r0 = r19.getArguments()
            if (r0 == 0) goto L_0x00a8
            java.lang.String r1 = "extra_business_type"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L_0x00aa
        L_0x00a8:
            java.lang.String r0 = ""
        L_0x00aa:
            r7.s = r0
            r7.f54005f = r8
            java.lang.String r0 = "long_video_player_activity"
            java.lang.String r1 = r7.s
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00bf
            com.ss.android.ugc.aweme.longvideonew.d r0 = com.ss.android.ugc.aweme.longvideonew.d.f54037b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f54001b
            r0.a(r1)
        L_0x00bf:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r7.f54005f
            if (r0 != 0) goto L_0x00cd
            com.ss.android.ugc.aweme.longvideonew.d r0 = com.ss.android.ugc.aweme.longvideonew.d.f54036a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f54001b
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.a(r1)
            r7.f54005f = r0
        L_0x00cd:
            com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout r0 = r7.n
            if (r0 == 0) goto L_0x00d6
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f54001b
            r0.setCommerceDigg(r1)
        L_0x00d6:
            com.ss.android.ugc.aweme.feed.d r0 = new com.ss.android.ugc.aweme.feed.d
            java.lang.String r1 = r7.g
            int r2 = r7.t
            r3 = r7
            com.ss.android.ugc.aweme.feed.f.aa r3 = (com.ss.android.ugc.aweme.feed.f.aa) r3
            r4 = r7
            com.ss.android.ugc.aweme.feed.listener.c r4 = (com.ss.android.ugc.aweme.feed.listener.c) r4
            r0.<init>(r1, r2, r3, r4)
            r7.u = r0
            com.ss.android.ugc.aweme.feed.d r0 = r7.u
            if (r0 == 0) goto L_0x00f4
            android.support.v4.app.FragmentActivity r1 = r19.getActivity()
            android.app.Activity r1 = (android.app.Activity) r1
            r0.a(r1, r8)
        L_0x00f4:
            com.ss.android.ugc.aweme.feed.d r0 = r7.u
            if (r0 == 0) goto L_0x00fb
            r0.a()
        L_0x00fb:
            r0 = r7
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            r1 = r7
            android.arch.lifecycle.ViewModelStoreOwner r1 = (android.arch.lifecycle.ViewModelStoreOwner) r1
            android.arch.lifecycle.ViewModelProvider r1 = com.ss.android.ugc.aweme.arch.widgets.base.c.a(r0, r1)
            r2 = r7
            android.arch.lifecycle.LifecycleOwner r2 = (android.arch.lifecycle.LifecycleOwner) r2
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = com.ss.android.ugc.aweme.arch.widgets.base.DataCenter.a((android.arch.lifecycle.ViewModelProvider) r1, (android.arch.lifecycle.LifecycleOwner) r2)
            r7.f54003d = r1
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.f54003d
            if (r1 == 0) goto L_0x011a
            java.lang.String r2 = "action_switch_mode"
            r3 = r7
            android.arch.lifecycle.Observer r3 = (android.arch.lifecycle.Observer) r3
            r1.a((java.lang.String) r2, (android.arch.lifecycle.Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) r3)
        L_0x011a:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.f54003d
            if (r1 == 0) goto L_0x0126
            java.lang.String r2 = "action_video_on_play_completed"
            r3 = r7
            android.arch.lifecycle.Observer r3 = (android.arch.lifecycle.Observer) r3
            r1.a((java.lang.String) r2, (android.arch.lifecycle.Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) r3)
        L_0x0126:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.f54003d
            if (r1 == 0) goto L_0x0132
            java.lang.String r2 = "resize_video_and_cover"
            r3 = r7
            android.arch.lifecycle.Observer r3 = (android.arch.lifecycle.Observer) r3
            r1.a((java.lang.String) r2, (android.arch.lifecycle.Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) r3)
        L_0x0132:
            android.widget.FrameLayout r1 = r7.v
            android.view.View r1 = (android.view.View) r1
            com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager r0 = com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager.a((android.support.v4.app.Fragment) r0, (android.view.View) r1)
            java.lang.String r1 = "widgetManager"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.f54003d
            r0.a((com.ss.android.ugc.aweme.arch.widgets.base.DataCenter) r1)
            r1 = 2131171379(0x7f071833, float:1.7957143E38)
            com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget r2 = new com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r7.f54001b
            java.lang.String r14 = r7.g
            int r3 = r7.t
            java.lang.String r4 = r7.s
            com.ss.android.ugc.aweme.feed.d r5 = r7.u
            r12 = r2
            r15 = r3
            r16 = r4
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.ss.android.ugc.aweme.arch.widgets.base.Widget) r2
            r0.b(r1, r2)
            r1 = 2131168736(0x7f070de0, float:1.7951782E38)
            com.ss.android.ugc.aweme.longvideonew.widget.VideoOperationWidget r2 = new com.ss.android.ugc.aweme.longvideonew.widget.VideoOperationWidget
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r7.f54001b
            java.lang.String r14 = r7.g
            int r3 = r7.t
            java.lang.String r4 = r7.s
            com.ss.android.ugc.aweme.feed.d r5 = r7.u
            r12 = r2
            r15 = r3
            r16 = r4
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.ss.android.ugc.aweme.arch.widgets.base.Widget) r2
            r0.b(r1, r2)
            r1 = 2131168865(0x7f070e61, float:1.7952044E38)
            com.ss.android.ugc.aweme.longvideonew.widget.VideoSeekContainerWidget r2 = new com.ss.android.ugc.aweme.longvideonew.widget.VideoSeekContainerWidget
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f54001b
            java.lang.String r4 = r7.g
            int r5 = r7.t
            java.lang.String r6 = r7.s
            r2.<init>(r3, r4, r5, r6)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.ss.android.ugc.aweme.arch.widgets.base.Widget) r2
            r0.b(r1, r2)
            r1 = 2131166919(0x7f0706c7, float:1.7948097E38)
            com.ss.android.ugc.aweme.longvideonew.widget.VideoFunctionalLayerWidget r2 = new com.ss.android.ugc.aweme.longvideonew.widget.VideoFunctionalLayerWidget
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f54001b
            java.lang.String r4 = r7.g
            int r5 = r7.t
            java.lang.String r6 = r7.s
            r2.<init>(r3, r4, r5, r6)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.ss.android.ugc.aweme.arch.widgets.base.Widget) r2
            r0.b(r1, r2)
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout r0 = r7.k
            if (r0 == 0) goto L_0x01b6
            com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$g r1 = new com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$g
            r1.<init>(r7)
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout$a r1 = (com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout.a) r1
            r0.setOnDiggListener(r1)
        L_0x01b6:
            android.support.v4.app.FragmentActivity r0 = r19.getActivity()
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r0)
            if (r0 != 0) goto L_0x01ce
            android.support.v4.app.FragmentActivity r0 = r19.getActivity()
            android.content.Context r0 = (android.content.Context) r0
            r1 = 2131561431(0x7f0d0bd7, float:1.8748262E38)
            com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
        L_0x01ce:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f54000a
            r3 = 0
            r4 = 56840(0xde08, float:7.965E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01f4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f54000a
            r3 = 0
            r4 = 56840(0xde08, float:7.965E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x01f4:
            java.lang.String r0 = "long_video_player_activity"
            java.lang.String r1 = r7.s
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0334
            com.ss.android.ugc.aweme.longvideonew.feature.d r0 = r19.f()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.f54003d
            if (r1 == 0) goto L_0x0211
            java.lang.String r2 = "action_is_landscape_mode"
            boolean r3 = r7.f54002c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.a((java.lang.String) r2, (java.lang.Object) r3)
        L_0x0211:
            com.ss.android.ugc.aweme.longvideonew.feature.b$a r12 = com.ss.android.ugc.aweme.longvideonew.feature.b.f54072a
            android.support.v4.app.FragmentActivity r1 = r19.getActivity()
            r13 = r1
            android.app.Activity r13 = (android.app.Activity) r13
            android.widget.FrameLayout r1 = r7.l
            r14 = r1
            android.view.View r14 = (android.view.View) r14
            android.widget.FrameLayout r1 = r7.j
            r15 = r1
            android.view.View r15 = (android.view.View) r15
            com.ss.android.ugc.aweme.feed.model.Video r1 = r7.f54005f
            boolean r2 = r7.f54002c
            r16 = r1
            r17 = r0
            r18 = r2
            r12.a((android.app.Activity) r13, (android.view.View) r14, (android.view.View) r15, (com.ss.android.ugc.aweme.feed.model.Video) r16, (com.ss.android.ugc.aweme.longvideonew.feature.d) r17, (boolean) r18)
            com.ss.android.ugc.aweme.longvideonew.feature.Rotate r1 = new com.ss.android.ugc.aweme.longvideonew.feature.Rotate
            android.support.v4.app.FragmentActivity r2 = r19.getActivity()
            if (r2 == 0) goto L_0x032c
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r2 = (com.ss.android.ugc.aweme.base.activity.AmeSSActivity) r2
            com.ss.android.ugc.aweme.feed.model.Video r3 = r7.f54005f
            r1.<init>(r2, r3)
            r7.f54004e = r1
            com.ss.android.ugc.aweme.longvideonew.feature.Rotate r1 = r7.f54004e
            if (r1 == 0) goto L_0x028b
            com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$f r2 = new com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$f
            r2.<init>(r7, r0)
            com.ss.android.ugc.aweme.longvideonew.feature.Rotate$a r2 = (com.ss.android.ugc.aweme.longvideonew.feature.Rotate.a) r2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.longvideonew.feature.Rotate.f3494a
            r15 = 0
            r16 = 56922(0xde5a, float:7.9765E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.longvideonew.feature.Rotate$a> r3 = com.ss.android.ugc.aweme.longvideonew.feature.Rotate.a.class
            r0[r10] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r1
            r17 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x0281
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.longvideonew.feature.Rotate.f3494a
            r15 = 0
            r16 = 56922(0xde5a, float:7.9765E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.longvideonew.feature.Rotate$a> r2 = com.ss.android.ugc.aweme.longvideonew.feature.Rotate.a.class
            r0[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r1
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x028b
        L_0x0281:
            java.lang.String r0 = "observer"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.util.ArrayList<com.ss.android.ugc.aweme.longvideonew.feature.Rotate$a> r0 = r1.f3496c
            r0.add(r2)
        L_0x028b:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f54000a
            r3 = 0
            r4 = 56841(0xde09, float:7.9651E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02b1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f54000a
            r3 = 0
            r4 = 56841(0xde09, float:7.9651E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x02b1:
            com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior r0 = new com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior
            r0.<init>()
            com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$d r1 = new com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$d
            r1.<init>(r7, r0)
            android.support.design.widget.BottomSheetBehavior$BottomSheetCallback r1 = (android.support.design.widget.BottomSheetBehavior.BottomSheetCallback) r1
            r0.setBottomSheetCallback(r1)
            r0.setHideable(r11)
            android.support.v4.app.FragmentActivity r1 = r19.getActivity()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = com.ss.android.ugc.aweme.app.a.a.a((android.app.Activity) r1)
            if (r1 != 0) goto L_0x02ed
            android.support.v4.app.FragmentActivity r1 = r19.getActivity()
            android.content.Context r1 = (android.content.Context) r1
            int r1 = com.ss.android.ugc.aweme.base.utils.p.a(r1)
            int r2 = r19.e()
            int r1 = r1 + r2
            android.support.v4.app.FragmentActivity r2 = r19.getActivity()
            android.content.Context r2 = (android.content.Context) r2
            int r2 = com.ss.android.ugc.aweme.profile.a.d(r2)
            int r1 = r1 + r2
            r0.setPeekHeight(r1)
            goto L_0x02ff
        L_0x02ed:
            android.support.v4.app.FragmentActivity r1 = r19.getActivity()
            android.content.Context r1 = (android.content.Context) r1
            int r1 = com.ss.android.ugc.aweme.base.utils.p.a(r1)
            int r2 = r19.e()
            int r1 = r1 + r2
            r0.setPeekHeight(r1)
        L_0x02ff:
            r0.setSkipCollapsed(r11)
            r1 = 3
            r0.setState(r1)
            com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$e r1 = new com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$e
            r1.<init>(r7)
            com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior$a r1 = (com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior.a) r1
            r0.a(r1)
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout r1 = r7.k
            if (r1 == 0) goto L_0x0318
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
        L_0x0318:
            if (r8 == 0) goto L_0x0324
            android.support.design.widget.CoordinatorLayout$LayoutParams r8 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r8
            if (r8 == 0) goto L_0x0334
            android.support.design.widget.CoordinatorLayout$Behavior r0 = (android.support.design.widget.CoordinatorLayout.Behavior) r0
            r8.setBehavior(r0)
            return
        L_0x0324:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.design.widget.CoordinatorLayout.LayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x032c:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.AmeSSActivity"
            r0.<init>(r1)
            throw r0
        L_0x0334:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r0v32, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r21, @org.jetbrains.annotations.Nullable android.view.ViewGroup r22, @org.jetbrains.annotations.Nullable android.os.Bundle r23) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            r13 = 2
            r0[r13] = r23
            com.meituan.robust.ChangeQuickRedirect r2 = f54000a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
            r5[r11] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r12] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r3 = 0
            r4 = 56837(0xde05, float:7.9646E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0057
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            r0[r13] = r23
            com.meituan.robust.ChangeQuickRedirect r2 = f54000a
            r3 = 0
            r4 = 56837(0xde05, float:7.9646E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
            r5[r11] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r12] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x0057:
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            r0 = 2131690044(0x7f0f023c, float:1.900912E38)
            android.view.View r0 = r8.inflate(r0, r9, r11)
            if (r0 == 0) goto L_0x0184
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.v = r0
            android.widget.FrameLayout r0 = r7.v
            r1 = 0
            if (r0 == 0) goto L_0x0076
            r2 = 2131165603(0x7f0701a3, float:1.7945428E38)
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x0077
        L_0x0076:
            r0 = r1
        L_0x0077:
            r7.o = r0
            android.widget.FrameLayout r0 = r7.v
            if (r0 == 0) goto L_0x0087
            r2 = 2131171377(0x7f071831, float:1.7957139E38)
            android.view.View r0 = r0.findViewById(r2)
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout r0 = (com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout) r0
            goto L_0x0088
        L_0x0087:
            r0 = r1
        L_0x0088:
            r7.k = r0
            android.widget.FrameLayout r0 = r7.v
            if (r0 == 0) goto L_0x0098
            r2 = 2131170444(0x7f07148c, float:1.7955246E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            goto L_0x0099
        L_0x0098:
            r0 = r1
        L_0x0099:
            r7.q = r0
            android.widget.FrameLayout r0 = r7.v
            if (r0 == 0) goto L_0x00a9
            r2 = 2131166919(0x7f0706c7, float:1.7948097E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L_0x00aa
        L_0x00a9:
            r0 = r1
        L_0x00aa:
            r7.j = r0
            android.widget.FrameLayout r0 = r7.v
            if (r0 == 0) goto L_0x00ba
            r2 = 2131168736(0x7f070de0, float:1.7951782E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L_0x00bb
        L_0x00ba:
            r0 = r1
        L_0x00bb:
            r7.m = r0
            android.widget.FrameLayout r0 = r7.v
            if (r0 == 0) goto L_0x00cb
            r2 = 2131171379(0x7f071833, float:1.7957143E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L_0x00cc
        L_0x00cb:
            r0 = r1
        L_0x00cc:
            r7.l = r0
            android.widget.FrameLayout r0 = r7.v
            if (r0 == 0) goto L_0x00dc
            r2 = 2131166064(0x7f070370, float:1.7946363E38)
            android.view.View r0 = r0.findViewById(r2)
            com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout r0 = (com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout) r0
            goto L_0x00dd
        L_0x00dc:
            r0 = r1
        L_0x00dd:
            r7.n = r0
            android.widget.FrameLayout r0 = r7.v
            if (r0 == 0) goto L_0x00ed
            r2 = 2131167543(0x7f070937, float:1.7949363E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            goto L_0x00ee
        L_0x00ed:
            r0 = r1
        L_0x00ee:
            r7.p = r0
            android.widget.ImageView r0 = r7.p
            if (r0 == 0) goto L_0x00fa
            r2 = r7
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
        L_0x00fa:
            android.widget.ImageView r0 = r7.p
            if (r0 == 0) goto L_0x0101
            r0.setSelected(r11)
        L_0x0101:
            android.widget.FrameLayout r0 = r7.v
            if (r0 == 0) goto L_0x010f
            r1 = 2131168865(0x7f070e61, float:1.7952044E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
        L_0x010f:
            r7.w = r1
            com.ss.android.ugc.aweme.longvideonew.feature.a r0 = new com.ss.android.ugc.aweme.longvideonew.feature.a
            android.support.v4.app.FragmentActivity r1 = r20.getActivity()
            android.content.Context r1 = (android.content.Context) r1
            android.widget.FrameLayout r2 = r7.v
            android.view.View r2 = (android.view.View) r2
            android.widget.FrameLayout r3 = r7.w
            r0.<init>(r1, r2, r3)
            r7.h = r0
            com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController r0 = new com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController
            android.support.v4.app.FragmentActivity r1 = r20.getActivity()
            if (r1 == 0) goto L_0x017c
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = (com.ss.android.ugc.aweme.base.activity.AmeSSActivity) r1
            r0.<init>(r1)
            r7.i = r0
            com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController r0 = r7.i
            if (r0 == 0) goto L_0x0177
            r1 = r7
            com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController$a r1 = (com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController.a) r1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController.f3488a
            r16 = 0
            r17 = 56910(0xde4e, float:7.9748E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController$a> r3 = com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController.a.class
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0170
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController.f3488a
            r16 = 0
            r17 = 56910(0xde4e, float:7.9748E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController$a> r2 = com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController.a.class
            r1[r11] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0177
        L_0x0170:
            java.lang.String r2 = "noOperationCallback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            r0.f3490c = r1
        L_0x0177:
            android.widget.FrameLayout r0 = r7.v
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x017c:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.AmeSSActivity"
            r0.<init>(r1)
            throw r0
        L_0x0184:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.FrameLayout"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
