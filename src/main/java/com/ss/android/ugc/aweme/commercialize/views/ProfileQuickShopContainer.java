package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dv;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000©\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u000b\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0001jB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ0\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010,2\b\u0010:\u001a\u0004\u0018\u00010%2\b\u0010;\u001a\u0004\u0018\u00010\u001f2\b\u0010<\u001a\u0004\u0018\u00010*H\u0002J\b\u0010=\u001a\u000208H\u0002J\b\u0010>\u001a\u000208H\u0002J\u0012\u0010?\u001a\u00020\u000e2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010B\u001a\u0002082\u0006\u0010C\u001a\u00020\u000eH\u0002J \u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0002J\b\u0010H\u001a\u00020\u0016H\u0002J\b\u0010I\u001a\u000208H\u0002J\b\u0010J\u001a\u000208H\u0002J\b\u0010K\u001a\u000208H\u0002J\u0006\u0010L\u001a\u000208J\b\u0010M\u001a\u000208H\u0007J\b\u0010N\u001a\u000208H\u0007J\b\u0010O\u001a\u000208H\u0014J\u0010\u0010P\u001a\u0002082\u0006\u0010Q\u001a\u00020RH\u0007J\u0018\u0010S\u001a\u0002082\b\u0010Q\u001a\u0004\u0018\u00010T2\u0006\u0010U\u001a\u00020VJ\u000e\u0010W\u001a\u0002082\u0006\u0010X\u001a\u00020\u000eJ\u000e\u0010Y\u001a\u0002082\u0006\u0010Z\u001a\u00020\bJ\u0006\u0010[\u001a\u000208J6\u0010\\\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010*2\b\u00109\u001a\u0004\u0018\u00010,2\b\u0010:\u001a\u0004\u0018\u00010%2\b\u0010;\u001a\u0004\u0018\u00010\u001f2\u0006\u0010]\u001a\u00020\u000eJ\b\u0010^\u001a\u000208H\u0002J\u0010\u0010_\u001a\u0002082\u0006\u0010`\u001a\u00020\u000eH\u0002J\b\u0010a\u001a\u000208H\u0002J\u001a\u0010b\u001a\u0002082\u0006\u0010c\u001a\u00020\u000e2\b\b\u0002\u0010d\u001a\u00020\u000eH\u0002J\u0010\u0010e\u001a\u0002082\u0006\u0010c\u001a\u00020\u000eH\u0002J,\u0010f\u001a\u0002052\u0006\u0010U\u001a\u00020V2\u0006\u0010g\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010iH\u0002R\u0010\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0001X.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X.¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000¨\u0006k"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/ProfileQuickShopContainer;", "Landroid/widget/FrameLayout;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "activityOnKeyDownListener", "com/ss/android/ugc/aweme/commercialize/views/ProfileQuickShopContainer$activityOnKeyDownListener$1", "Lcom/ss/android/ugc/aweme/commercialize/views/ProfileQuickShopContainer$activityOnKeyDownListener$1;", "alreadyInQuickShop", "", "commercializeWebViewHelper", "Lcom/ss/android/ugc/aweme/commercialize/utils/CommercializeWebViewHelper;", "getCommercializeWebViewHelper", "()Lcom/ss/android/ugc/aweme/commercialize/utils/CommercializeWebViewHelper;", "setCommercializeWebViewHelper", "(Lcom/ss/android/ugc/aweme/commercialize/utils/CommercializeWebViewHelper;)V", "enterText", "", "hasLoggedOnce", "isInitialized", "isPageLoadError", "isPageLoadFinish", "lastTranslationY", "mCloseBtn", "Landroid/widget/ImageView;", "mGuideView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mGuideViewAnimatorSet", "Landroid/animation/AnimatorSet;", "mLoadingAnimationView", "Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;", "mLoadingView", "Landroid/view/View;", "mRootView", "mShareBtn", "mTransBgTextView", "mUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "mUserCover", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mUserCoverMask", "mWebView", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "processText", "screenHeight", "getScreenHeight", "()I", "scrollDownAnimator", "Landroid/animation/ValueAnimator;", "scrollUpAnimator", "bind", "", "userCover", "userCoverMask", "guide", "user", "cancelGuideViewAnimation", "cancelScrollAnimator", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "enterQuickShop", "enter", "getTopMarginAnimator", "view", "targetTopMargin", "duration", "getUrl", "initListener", "initViews", "logEnterStatus", "onCloseWebViewLoadingJsEvent", "onCreate", "onDestroy", "onDetachedFromWindow", "onEvent", "event", "Lcom/ss/android/ugc/aweme/im/service/model/ShareCompleteEvent;", "onFakeCoverAction", "Lcom/ss/android/ugc/aweme/commercialize/event/UserProfileFakeCoverActionEvent;", "scrollableLayout", "Lcom/ss/android/ugc/aweme/common/widget/scrollablelayout/DampScrollableLayout;", "onProfileVisibilityChanged", "isVisibleToUser", "onScroll", "translationY", "onScrollEnd", "onUserLoadSuccess", "fromUserProfileActivity", "openShareDialog", "registerActivityOnKeyDownListener", "register", "resetLocation", "showGuide", "show", "isFirstAnimation", "showLoading", "smoothScrollTo", "toY", "withEndAction", "Ljava/lang/Runnable;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProfileQuickShopContainer extends FrameLayout implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2946a;
    public static int l;
    public static final String m;
    public static final a n;
    private String A;
    private boolean B;

    /* renamed from: b  reason: collision with root package name */
    public CrossPlatformWebView f2947b;

    /* renamed from: c  reason: collision with root package name */
    public View f2948c;

    /* renamed from: d  reason: collision with root package name */
    public AnimationImageView f2949d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    CommercializeWebViewHelper f2950e;

    /* renamed from: f  reason: collision with root package name */
    public User f2951f;
    public AnimatorSet g;
    public ValueAnimator h;
    public ValueAnimator i;
    public boolean j;
    public boolean k;
    private FrameLayout o;
    private ImageView p;
    private ImageView q;
    private DmtTextView r;
    private RemoteImageView s;
    private View t;
    private DmtTextView u;
    private boolean v;
    private int w;
    private boolean x;
    private b y;
    private String z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/ProfileQuickShopContainer$Companion;", "", "()V", "BLANK_URL", "", "DEFAULT_ENTER_TEXT", "DEFAULT_PROCESS_TEXT", "ENTER_SHOP_MIN_TRANS_Y", "", "getENTER_SHOP_MIN_TRANS_Y", "()I", "setENTER_SHOP_MIN_TRANS_Y", "(I)V", "SHOW_GUIDE_MAX_TRANS_Y", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/commercialize/views/ProfileQuickShopContainer$activityOnKeyDownListener$1", "Lcom/ss/android/ugc/aweme/base/activity/ActivityOnKeyDownListener;", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.ss.android.ugc.aweme.base.activity.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39957a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileQuickShopContainer f39958b;

        b(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f39958b = profileQuickShopContainer;
        }

        public final boolean a(int i, @Nullable KeyEvent keyEvent) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f39957a, false, 32950, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f39957a, false, 32950, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (i == 4) {
                this.f39958b.a(false);
                return true;
            } else {
                return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileQuickShopContainer f39960b;

        c(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f39960b = profileQuickShopContainer;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39959a, false, 32951, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39959a, false, 32951, new Class[0], Void.TYPE);
                return;
            }
            CrossPlatformWebView crossPlatformWebView = this.f39960b.f2947b;
            if (crossPlatformWebView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            crossPlatformWebView.b("about:blank", false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39961a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup.MarginLayoutParams f39962b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f39963c;

        d(ViewGroup.MarginLayoutParams marginLayoutParams, View view) {
            this.f39962b = marginLayoutParams;
            this.f39963c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f39961a, false, 32952, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f39961a, false, 32952, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f39962b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                marginLayoutParams.topMargin = ((Integer) animatedValue).intValue();
                this.f39963c.setLayoutParams(this.f39962b);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J.\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\u0015\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0017J&\u0010\u0018\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001bH\u0016¨\u0006\u001c"}, d2 = {"com/ss/android/ugc/aweme/commercialize/views/ProfileQuickShopContainer$initListener$webViewStatus$1", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "beforeNormalUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.ss.android.ugc.aweme.crossplatform.platform.webview.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39964a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileQuickShopContainer f39965b;

        public final void a(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
        }

        @TargetApi(23)
        public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        }

        public final void b(@Nullable WebView webView, @Nullable String str) {
        }

        e(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f39965b = profileQuickShopContainer;
        }

        public final void a(@Nullable WebView webView, @Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f39964a, false, 32953, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str}, this, f39964a, false, 32953, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            this.f39965b.j = true;
            if (!this.f39965b.k) {
                this.f39965b.b(false);
            }
            this.f39965b.c();
        }

        public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            this.f39965b.k = true;
        }

        public final void a(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{webView, str2, bitmap}, this, f39964a, false, 32954, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str2, bitmap}, this, f39964a, false, 32954, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE);
                return;
            }
            this.f39965b.j = false;
            this.f39965b.k = false;
            CommercializeWebViewHelper commercializeWebViewHelper = this.f39965b.getCommercializeWebViewHelper();
            if (commercializeWebViewHelper != null) {
                com.ss.android.ugc.aweme.crossplatform.business.j crossPlatformBusiness = commercializeWebViewHelper.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null) {
                    ShareBusiness shareBusiness = (ShareBusiness) crossPlatformBusiness.a(ShareBusiness.class);
                    if (shareBusiness != null) {
                        shareBusiness.a(str);
                    }
                }
            }
        }

        public final void a(@Nullable WebView webView, int i, @Nullable String str, @Nullable String str2) {
            this.f39965b.k = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39966a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileQuickShopContainer f39967b;

        f(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f39967b = profileQuickShopContainer;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39966a, false, 32955, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39966a, false, 32955, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39967b.a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39968a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileQuickShopContainer f39969b;

        g(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f39969b = profileQuickShopContainer;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39968a, false, 32956, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39968a, false, 32956, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ProfileQuickShopContainer profileQuickShopContainer = this.f39969b;
            if (PatchProxy.isSupport(new Object[0], profileQuickShopContainer, ProfileQuickShopContainer.f2946a, false, 32926, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], profileQuickShopContainer, ProfileQuickShopContainer.f2946a, false, 32926, new Class[0], Void.TYPE);
                return;
            }
            if (profileQuickShopContainer.j) {
                CommercializeWebViewHelper commercializeWebViewHelper = profileQuickShopContainer.f2950e;
                if (commercializeWebViewHelper != null) {
                    com.ss.android.ugc.aweme.crossplatform.business.j crossPlatformBusiness = commercializeWebViewHelper.getCrossPlatformBusiness();
                    if (crossPlatformBusiness != null) {
                        ShareBusiness shareBusiness = (ShareBusiness) crossPlatformBusiness.a(ShareBusiness.class);
                        if (shareBusiness != null) {
                            CrossPlatformWebView crossPlatformWebView = profileQuickShopContainer.f2947b;
                            if (crossPlatformWebView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
                            }
                            shareBusiness.b((WebView) ((com.ss.android.ugc.aweme.crossplatform.view.h) crossPlatformWebView.a(com.ss.android.ugc.aweme.crossplatform.view.h.class)).b());
                        }
                    }
                }
                return;
            }
            CommercializeWebViewHelper commercializeWebViewHelper2 = profileQuickShopContainer.f2950e;
            if (commercializeWebViewHelper2 != null) {
                com.ss.android.ugc.aweme.crossplatform.business.j crossPlatformBusiness2 = commercializeWebViewHelper2.getCrossPlatformBusiness();
                if (crossPlatformBusiness2 != null) {
                    ShareBusiness shareBusiness2 = (ShareBusiness) crossPlatformBusiness2.a(ShareBusiness.class);
                    if (shareBusiness2 != null) {
                        shareBusiness2.c();
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileQuickShopContainer f39971b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DampScrollableLayout f39972c;

        public h(ProfileQuickShopContainer profileQuickShopContainer, DampScrollableLayout dampScrollableLayout) {
            this.f39971b = profileQuickShopContainer;
            this.f39972c = dampScrollableLayout;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39970a, false, 32957, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39970a, false, 32957, new Class[0], Void.TYPE);
                return;
            }
            this.f39971b.i = this.f39971b.a(this.f39972c, 0, 200, (Runnable) null);
            ValueAnimator valueAnimator = this.f39971b.i;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39973a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileQuickShopContainer f39974b;

        i(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f39974b = profileQuickShopContainer;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39973a, false, 32958, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39973a, false, 32958, new Class[0], Void.TYPE);
                return;
            }
            this.f39974b.a(false, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commercialize/views/ProfileQuickShopContainer$showGuide$1$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class j implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DmtTextView f39976b;

        public final void onAnimationCancel(@Nullable Animator animator) {
        }

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        public final void onAnimationStart(@Nullable Animator animator) {
        }

        j(DmtTextView dmtTextView) {
            this.f39976b = dmtTextView;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39975a, false, 32959, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39975a, false, 32959, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f39976b.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39977a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DmtTextView f39978b;

        k(DmtTextView dmtTextView) {
            this.f39978b = dmtTextView;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39977a, false, 32960, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39977a, false, 32960, new Class[0], Void.TYPE);
                return;
            }
            this.f39978b.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileQuickShopContainer f39980b;

        l(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f39980b = profileQuickShopContainer;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39979a, false, 32961, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39979a, false, 32961, new Class[0], Void.TYPE);
                return;
            }
            View view = this.f39980b.f2948c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
            }
            view.setVisibility(4);
            AnimationImageView animationImageView = this.f39980b.f2949d;
            if (animationImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingAnimationView");
            }
            animationImageView.cancelAnimation();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class m implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39981a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DampScrollableLayout f39982b;

        m(DampScrollableLayout dampScrollableLayout) {
            this.f39982b = dampScrollableLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f39981a, false, 32962, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f39981a, false, 32962, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f39982b.scrollTo(0, ((Integer) obj).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commercialize/views/ProfileQuickShopContainer$smoothScrollTo$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class n implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f39984b;

        public final void onAnimationCancel(@Nullable Animator animator) {
        }

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        public final void onAnimationStart(@Nullable Animator animator) {
        }

        n(Runnable runnable) {
            this.f39984b = runnable;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39983a, false, 32963, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39983a, false, 32963, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Runnable runnable = this.f39984b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @JvmOverloads
    public ProfileQuickShopContainer(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ProfileQuickShopContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Nullable
    public final CommercializeWebViewHelper getCommercializeWebViewHelper() {
        return this.f2950e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.profile.model.User r19, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.base.ui.RemoteImageView r20, @org.jetbrains.annotations.Nullable android.view.View r21, @org.jetbrains.annotations.Nullable com.bytedance.ies.dmt.ui.widget.DmtTextView r22, boolean r23) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = 5
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r8
            r14 = 1
            r0[r14] = r9
            r15 = 2
            r0[r15] = r10
            r16 = 3
            r0[r16] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r23)
            r6 = 4
            r0[r6] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2946a
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r1 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r5[r14] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r15] = r1
            java.lang.Class<com.bytedance.ies.dmt.ui.widget.DmtTextView> r1 = com.bytedance.ies.dmt.ui.widget.DmtTextView.class
            r5[r16] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r6] = r1
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 32922(0x809a, float:4.6134E-41)
            r1 = r18
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0085
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            r0[r14] = r9
            r0[r15] = r10
            r0[r16] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r23)
            r6 = 4
            r0[r6] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2946a
            r3 = 0
            r4 = 32922(0x809a, float:4.6134E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r1 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r5[r14] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r15] = r1
            java.lang.Class<com.bytedance.ies.dmt.ui.widget.DmtTextView> r1 = com.bytedance.ies.dmt.ui.widget.DmtTextView.class
            r5[r16] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r6] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0085:
            r6 = 4
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.c((com.ss.android.ugc.aweme.profile.model.User) r19)
            if (r0 == 0) goto L_0x021b
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r13] = r9
            r0[r14] = r10
            r0[r15] = r11
            r0[r16] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2946a
            r3 = 0
            r4 = 32923(0x809b, float:4.6135E-41)
            java.lang.Class[] r5 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r1 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r14] = r1
            java.lang.Class<com.bytedance.ies.dmt.ui.widget.DmtTextView> r1 = com.bytedance.ies.dmt.ui.widget.DmtTextView.class
            r5[r15] = r1
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r16] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r1 = r18
            r12 = 4
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00e6
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r9
            r0[r14] = r10
            r0[r15] = r11
            r0[r16] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2946a
            r3 = 0
            r4 = 32923(0x809b, float:4.6135E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r1 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r14] = r1
            java.lang.Class<com.bytedance.ies.dmt.ui.widget.DmtTextView> r1 = com.bytedance.ies.dmt.ui.widget.DmtTextView.class
            r5[r15] = r1
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0208
        L_0x00e6:
            r18.e()
            r7.s = r9
            r7.t = r10
            r7.u = r11
            r7.f2951f = r8
            if (r8 == 0) goto L_0x013f
            com.ss.android.ugc.aweme.profile.model.QuickShopInfo r0 = r19.getQuickShopInfo()
            if (r0 == 0) goto L_0x013f
            com.ss.android.ugc.aweme.profile.model.QuickShopSecondFloorInfo r0 = r0.getSecondFloorInfo()
            if (r0 == 0) goto L_0x013f
            java.lang.String r1 = r0.getProcessText()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x012d
            java.lang.String r1 = r0.getEnterText()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x012d
            java.lang.String r1 = r0.getProcessText()
            java.lang.String r2 = "it.processText"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r7.z = r1
            java.lang.String r1 = r0.getEnterText()
            java.lang.String r2 = "it.enterText"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r7.A = r1
        L_0x012d:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.r
            if (r1 != 0) goto L_0x0136
            java.lang.String r2 = "mTransBgTextView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0136:
            java.lang.String r0 = r0.getTransBgText()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x013f:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = f2946a
            r3 = 0
            r4 = 32927(0x809f, float:4.614E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0166
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = f2946a
            r3 = 0
            r4 = 32927(0x809f, float:4.614E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0202
        L_0x0166:
            com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$e r0 = new com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$e
            r0.<init>(r7)
            android.widget.FrameLayout r1 = r7.o
            if (r1 != 0) goto L_0x0174
            java.lang.String r2 = "mRootView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0174:
            android.view.View r1 = (android.view.View) r1
            android.app.Activity r1 = com.ss.android.ugc.aweme.base.utils.v.c((android.view.View) r1)
            if (r1 == 0) goto L_0x0202
            boolean r2 = r1 instanceof android.arch.lifecycle.LifecycleOwner
            if (r2 == 0) goto L_0x0202
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "url"
            java.lang.String r4 = r18.getUrl()
            r2.putString(r3, r4)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r7.f2947b
            if (r3 != 0) goto L_0x0197
            java.lang.String r4 = "mWebView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0197:
            com.ss.android.ugc.aweme.crossplatform.view.a r3 = (com.ss.android.ugc.aweme.crossplatform.view.a) r3
            com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = (com.ss.android.ugc.aweme.crossplatform.platform.webview.c) r0
            r4 = r1
            android.arch.lifecycle.LifecycleOwner r4 = (android.arch.lifecycle.LifecycleOwner) r4
            com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper r0 = com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper.a(r3, r0, r4, r1, r2)
            r7.f2950e = r0
            com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper r0 = r7.f2950e
            if (r0 == 0) goto L_0x01d2
            com.ss.android.ugc.aweme.crossplatform.business.j r0 = r0.getCrossPlatformBusiness()
            if (r0 == 0) goto L_0x01d2
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness> r1 = com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness.class
            com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business r0 = r0.a((java.lang.Class<T>) r1)
            com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness r0 = (com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness) r0
            if (r0 == 0) goto L_0x01d2
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r7.f2947b
            if (r1 != 0) goto L_0x01c1
            java.lang.String r2 = "mWebView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01c1:
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.view.h> r2 = com.ss.android.ugc.aweme.crossplatform.view.h.class
            com.ss.android.ugc.aweme.crossplatform.view.g r1 = r1.a((java.lang.Class<T>) r2)
            com.ss.android.ugc.aweme.crossplatform.view.h r1 = (com.ss.android.ugc.aweme.crossplatform.view.h) r1
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r1 = r1.b()
            android.webkit.WebView r1 = (android.webkit.WebView) r1
            r0.a((android.webkit.WebView) r1)
        L_0x01d2:
            com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper r0 = r7.f2950e
            if (r0 == 0) goto L_0x01df
            com.ss.android.ugc.aweme.crossplatform.params.base.a r0 = r0.getCrossPlatformParams()
            if (r0 == 0) goto L_0x01df
            com.ss.android.ugc.aweme.crossplatform.params.d r0 = r0.f40808d
            goto L_0x01e0
        L_0x01df:
            r0 = 0
        L_0x01e0:
            android.widget.ImageView r1 = r7.q
            if (r1 != 0) goto L_0x01e9
            java.lang.String r2 = "mShareBtn"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01e9:
            if (r0 == 0) goto L_0x01ee
            boolean r0 = r0.f40823b
            goto L_0x01ef
        L_0x01ee:
            r0 = 1
        L_0x01ef:
            if (r0 == 0) goto L_0x01f4
            r0 = 8
            goto L_0x01f5
        L_0x01f4:
            r0 = 0
        L_0x01f5:
            r1.setVisibility(r0)
            android.arch.lifecycle.Lifecycle r0 = r4.getLifecycle()
            r1 = r7
            android.arch.lifecycle.LifecycleObserver r1 = (android.arch.lifecycle.LifecycleObserver) r1
            r0.addObserver(r1)
        L_0x0202:
            r7.a(r14, r14)
            r18.f()
        L_0x0208:
            r7.setVisibility(r13)
            if (r11 == 0) goto L_0x0210
            r11.setVisibility(r13)
        L_0x0210:
            if (r10 == 0) goto L_0x0215
            r10.setVisibility(r13)
        L_0x0215:
            if (r23 == 0) goto L_0x021a
            r7.c(r14)
        L_0x021a:
            return r14
        L_0x021b:
            r0 = 8
            r7.setVisibility(r0)
            if (r11 == 0) goto L_0x0225
            r11.setVisibility(r0)
        L_0x0225:
            if (r10 == 0) goto L_0x022a
            r10.setVisibility(r0)
        L_0x022a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer.a(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.base.ui.RemoteImageView, android.view.View, com.bytedance.ies.dmt.ui.widget.DmtTextView, boolean):boolean");
    }

    static {
        a aVar = new a((byte) 0);
        n = aVar;
        m = aVar.getClass().getName();
    }

    private final int getScreenHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, f2946a, false, 32921, new Class[0], Integer.TYPE)) {
            return p.a(getContext());
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2946a, false, 32921, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2946a, false, 32938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2946a, false, 32938, new Class[0], Void.TYPE);
            return;
        }
        if (this.w < 0 && this.w < l) {
            a(true);
            postDelayed(new i(this), 500);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2946a, false, 32939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2946a, false, 32939, new Class[0], Void.TYPE);
            return;
        }
        b(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f2946a, false, 32928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2946a, false, 32928, new Class[0], Void.TYPE);
            return;
        }
        bg.c(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2946a, false, 32929, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2946a, false, 32929, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f2946a, false, 32945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2946a, false, 32945, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        g();
        d();
    }

    private final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f2946a, false, 32936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2946a, false, 32936, new Class[0], Void.TYPE);
            return;
        }
        e();
        FrameLayout frameLayout = this.o;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = -getScreenHeight();
            FrameLayout frameLayout2 = this.o;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            frameLayout2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f2946a, false, 32946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2946a, false, 32946, new Class[0], Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.g;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.g;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            this.g = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getUrl() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2946a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 32931(0x80a3, float:4.6146E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f2946a
            r5 = 0
            r6 = 32931(0x80a3, float:4.6146E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.f2951f
            if (r0 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.profile.model.QuickShopInfo r0 = r0.getQuickShopInfo()
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r0.getQuickShopUrl()
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            boolean r1 = com.ss.android.ugc.aweme.commercialize.utils.c.a((java.lang.String) r0)
            if (r1 == 0) goto L_0x0048
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "url"
            java.lang.String r0 = r0.getQueryParameter(r1)
        L_0x0048:
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = ""
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer.getUrl():java.lang.String");
    }

    public final void c() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f2946a, false, 32944, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2946a, false, 32944, new Class[0], Void.TYPE);
        } else if (!this.x) {
            this.x = true;
            boolean z2 = this.j;
            if (z2) {
                boolean z3 = this.k;
                if (z3) {
                    str = "failed_app";
                } else if (!z3) {
                    str = "success";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z2) {
                str = "failed_user";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            User user = this.f2951f;
            if (user != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            r.a("enter_flash_store", (Map) a2.a("author_id", str2).a("enter_method", "slidedown").a("is_success", str).f34114b);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f2946a, false, 32947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2946a, false, 32947, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.h;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
            }
            ValueAnimator valueAnimator3 = this.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            this.h = null;
        }
        ValueAnimator valueAnimator4 = this.i;
        if (valueAnimator4 != null && valueAnimator4.isRunning()) {
            ValueAnimator valueAnimator5 = this.i;
            if (valueAnimator5 != null) {
                valueAnimator5.removeAllListeners();
            }
            ValueAnimator valueAnimator6 = this.i;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
            }
            this.i = null;
        }
    }

    private final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f2946a, false, 32924, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2946a, false, 32924, new Class[0], Void.TYPE);
        } else if (!this.v) {
            View inflate = View.inflate(getContext(), C0906R.layout.a7u, this);
            if (inflate != null) {
                this.o = (FrameLayout) inflate;
                FrameLayout frameLayout = this.o;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                }
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.height = getScreenHeight();
                FrameLayout frameLayout2 = this.o;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                }
                frameLayout2.setLayoutParams(layoutParams);
                View findViewById = findViewById(C0906R.id.dx6);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.webview)");
                this.f2947b = (CrossPlatformWebView) findViewById;
                View findViewById2 = findViewById(C0906R.id.ti);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.close)");
                this.p = (ImageView) findViewById2;
                ImageView imageView = this.p;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCloseBtn");
                }
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.topMargin += com.ss.android.ugc.aweme.profile.a.d(getContext());
                    ImageView imageView2 = this.p;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCloseBtn");
                    }
                    imageView2.setLayoutParams(marginLayoutParams);
                    ImageView imageView3 = this.p;
                    if (imageView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCloseBtn");
                    }
                    imageView3.setOnClickListener(new f(this));
                    View findViewById3 = findViewById(C0906R.id.cp3);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.share)");
                    this.q = (ImageView) findViewById3;
                    ImageView imageView4 = this.q;
                    if (imageView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mShareBtn");
                    }
                    imageView4.setOnClickListener(new g(this));
                    ImageView imageView5 = this.q;
                    if (imageView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mShareBtn");
                    }
                    ViewGroup.LayoutParams layoutParams3 = imageView5.getLayoutParams();
                    if (layoutParams3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams2.topMargin += com.ss.android.ugc.aweme.profile.a.d(getContext());
                        ImageView imageView6 = this.q;
                        if (imageView6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mShareBtn");
                        }
                        imageView6.setLayoutParams(marginLayoutParams2);
                        View findViewById4 = findViewById(C0906R.id.biy);
                        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.loading)");
                        this.f2948c = findViewById4;
                        View findViewById5 = findViewById(C0906R.id.d69);
                        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.trans_bg_text)");
                        this.r = (DmtTextView) findViewById5;
                        View findViewById6 = findViewById(C0906R.id.bj3);
                        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.loading_animation_view)");
                        this.f2949d = (AnimationImageView) findViewById6;
                        l = -((int) UIUtils.dip2Px(getContext(), 100.0f));
                        this.v = true;
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
    }

    public final void setCommercializeWebViewHelper(@Nullable CommercializeWebViewHelper commercializeWebViewHelper) {
        this.f2950e = commercializeWebViewHelper;
    }

    private final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2946a, false, 32932, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2946a, false, 32932, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.o;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        Activity c2 = v.c((View) frameLayout);
        if (!(c2 instanceof MainActivity)) {
            if (c2 instanceof UserProfileActivity) {
                if (z2) {
                    ((UserProfileActivity) c2).a((com.ss.android.ugc.aweme.base.activity.a) this.y);
                    return;
                }
                ((UserProfileActivity) c2).b(this.y);
            }
        } else if (z2) {
            ((MainActivity) c2).registerActivityOnKeyDownListener(this.y);
        } else {
            ((MainActivity) c2).unRegisterActivityOnKeyDownListener(this.y);
        }
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f2946a, false, 32942, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f2946a, false, 32942, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Subscribe
    public final void onEvent(@NotNull com.ss.android.ugc.aweme.im.service.model.g gVar) {
        com.ss.android.ugc.aweme.im.service.model.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f2946a, false, 32930, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f2946a, false, 32930, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(gVar2, "event");
        if (TextUtils.equals("web", gVar2.itemType)) {
            Context context = getContext();
            FrameLayout frameLayout = this.o;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            dv.a(context, frameLayout, gVar2);
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2946a, false, 32933, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2946a, false, 32933, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            View view = this.f2948c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
            }
            view.setVisibility(0);
            View view2 = this.f2948c;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
            }
            view2.setAlpha(1.0f);
            View view3 = this.f2948c;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
            }
            view3.setScaleX(1.0f);
            View view4 = this.f2948c;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
            }
            view4.setScaleY(1.0f);
            AnimationImageView animationImageView = this.f2949d;
            if (animationImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingAnimationView");
            }
            animationImageView.setAnimation("business_loading_lottie.json");
            AnimationImageView animationImageView2 = this.f2949d;
            if (animationImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingAnimationView");
            }
            animationImageView2.playAnimation();
        } else {
            View view5 = this.f2948c;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
            }
            view5.animate().alpha(0.0f).scaleX(1.1f).scaleY(1.1f).setDuration(200).withEndAction(new l(this)).setInterpolator(new com.ss.android.ugc.aweme.feed.adapter.c()).start();
        }
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2946a, false, 32934, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2946a, false, 32934, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            a(true, true);
        } else {
            a(false, false);
            AnimationImageView animationImageView = this.f2949d;
            if (animationImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingAnimationView");
            }
            if (animationImageView.isAnimating()) {
                AnimationImageView animationImageView2 = this.f2949d;
                if (animationImageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoadingAnimationView");
                }
                animationImageView2.cancelAnimation();
            }
            f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r1.getVisibility() == 0) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2946a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 32937(0x80a9, float:4.6155E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2946a
            r3 = 0
            r4 = 32937(0x80a9, float:4.6155E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            int r0 = r9.w
            if (r0 != r10) goto L_0x003f
            return
        L_0x003f:
            r0 = 2
            if (r10 >= 0) goto L_0x00a2
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.u
            if (r1 == 0) goto L_0x0055
            int r1 = r1.getVisibility()
            r2 = 8
            if (r1 != r2) goto L_0x0055
            int r1 = r9.w
            if (r1 <= r10) goto L_0x0055
            r9.a(r7, false)
        L_0x0055:
            int r0 = l
            if (r10 >= r0) goto L_0x0065
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.u
            if (r0 == 0) goto L_0x0070
            java.lang.String r1 = r9.A
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            goto L_0x0070
        L_0x0065:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.u
            if (r0 == 0) goto L_0x0070
            java.lang.String r1 = r9.z
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0070:
            boolean r0 = r9.B
            if (r0 != 0) goto L_0x00b5
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r9.s
            if (r0 == 0) goto L_0x008c
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1063675494(0x3f666666, float:0.9)
            float r3 = (float) r10
            float r2 = r2 * r3
            float r2 = r2 * r3
            int r3 = l
            int r3 = r3 * r3
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = r1 - r2
            r0.setAlpha(r1)
        L_0x008c:
            android.view.View r0 = r9.t
            if (r0 == 0) goto L_0x00b5
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r2 = 1060320051(0x3f333333, float:0.7)
            float r3 = (float) r10
            float r3 = r3 * r2
            int r2 = l
            float r2 = (float) r2
            float r3 = r3 / r2
            float r3 = r3 + r1
            r0.setAlpha(r3)
            goto L_0x00b5
        L_0x00a2:
            if (r10 == 0) goto L_0x00b2
            r1 = 40
            if (r10 <= r1) goto L_0x00b5
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.u
            if (r1 == 0) goto L_0x00b5
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x00b5
        L_0x00b2:
            r9.a(r8, false)
        L_0x00b5:
            r9.w = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer.a(int):void");
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2946a, false, 32925, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2946a, false, 32925, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e();
        this.B = z2;
        if (z2) {
            FrameLayout frameLayout = this.o;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            a(frameLayout, 0, 500).start();
            RemoteImageView remoteImageView = this.s;
            if (remoteImageView != null) {
                remoteImageView.animate().translationY((float) remoteImageView.getHeight()).setDuration(300).start();
            }
            b(true);
            CrossPlatformWebView crossPlatformWebView = this.f2947b;
            if (crossPlatformWebView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            crossPlatformWebView.b(getUrl(), false);
            this.x = false;
            d(true);
            return;
        }
        FrameLayout frameLayout2 = this.o;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        a(frameLayout2, -getScreenHeight(), 500).start();
        RemoteImageView remoteImageView2 = this.s;
        if (remoteImageView2 != null) {
            remoteImageView2.animate().translationY(0.0f).alpha(1.0f).setDuration(300).setStartDelay(200).start();
        }
        View view = this.t;
        if (view != null) {
            view.setAlpha(0.2f);
        }
        c();
        postDelayed(new c(this), 500);
        d(false);
    }

    /* access modifiers changed from: private */
    public final void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f2946a, false, 32935, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f2946a, false, 32935, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        DmtTextView dmtTextView = this.u;
        if (dmtTextView != null) {
            g();
            if (z2) {
                dmtTextView.setVisibility(0);
                dmtTextView.setText(this.z);
                dmtTextView.setAlpha(0.0f);
                if (!z3) {
                    dmtTextView.animate().alpha(1.0f).setDuration(200).start();
                } else {
                    this.g = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dmtTextView, "alpha", new float[]{0.0f, 1.0f});
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat, "guideIn");
                    ofFloat.setDuration(200);
                    ofFloat.setStartDelay(800);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dmtTextView, "alpha", new float[]{1.0f, 0.0f});
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "guideOut");
                    ofFloat2.setDuration(200);
                    ofFloat2.setStartDelay(8000);
                    AnimatorSet animatorSet = this.g;
                    if (animatorSet != null) {
                        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
                    }
                    AnimatorSet animatorSet2 = this.g;
                    if (animatorSet2 != null) {
                        animatorSet2.addListener(new j(dmtTextView));
                    }
                    AnimatorSet animatorSet3 = this.g;
                    if (animatorSet3 != null) {
                        animatorSet3.start();
                    }
                }
            } else {
                dmtTextView.animate().alpha(0.0f).setDuration(200).withEndAction(new k(dmtTextView)).start();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProfileQuickShopContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.y = new b(this);
        this.z = "下拉有惊喜";
        this.A = "松手有惊喜";
    }

    private final ValueAnimator a(View view, int i2, int i3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), 500}, this, f2946a, false, 32943, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, ValueAnimator.class)) {
            return (ValueAnimator) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), 500}, this, f2946a, false, 32943, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, ValueAnimator.class);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{marginLayoutParams.topMargin, i2});
            ofInt.addUpdateListener(new d(marginLayoutParams, view2));
            Intrinsics.checkExpressionValueIsNotNull(ofInt, "animator");
            ofInt.setDuration(500);
            ofInt.setInterpolator(new com.ss.android.ugc.aweme.p.a());
            return ofInt;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final ValueAnimator a(DampScrollableLayout dampScrollableLayout, int i2, int i3, Runnable runnable) {
        DampScrollableLayout dampScrollableLayout2 = dampScrollableLayout;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{dampScrollableLayout2, Integer.valueOf(i2), Integer.valueOf(i3), runnable2}, this, f2946a, false, 32941, new Class[]{DampScrollableLayout.class, Integer.TYPE, Integer.TYPE, Runnable.class}, ValueAnimator.class)) {
            return (ValueAnimator) PatchProxy.accessDispatch(new Object[]{dampScrollableLayout2, Integer.valueOf(i2), Integer.valueOf(i3), runnable2}, this, f2946a, false, 32941, new Class[]{DampScrollableLayout.class, Integer.TYPE, Integer.TYPE, Runnable.class}, ValueAnimator.class);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{dampScrollableLayout.getCurScrollY(), i2});
        ofInt.addUpdateListener(new m(dampScrollableLayout2));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "animator");
        ofInt.setDuration((long) i3);
        ofInt.addListener(new n(runnable2));
        return ofInt;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileQuickShopContainer(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
