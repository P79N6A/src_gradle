package com.ss.android.ugc.aweme.newfollow.ui;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.param.IFollowFeedFetchTrigger;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.ag;
import com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.profile.ui.header.as;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.publish.IPublishService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.widget.h;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001JB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\u0006\u0010\u0013\u001a\u00020\u0010J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\fH\u0002J\b\u0010!\u001a\u00020\fH\u0016J\b\u0010\"\u001a\u00020\u0010H\u0002J\b\u0010#\u001a\u00020\u0010H\u0002J\u0012\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J&\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u00100\u001a\u00020\u0010H\u0016J\u0010\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\fH\u0016J\u0010\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u000205H\u0007J\u0010\u00106\u001a\u00020\u00102\u0006\u00104\u001a\u000207H\u0007J\u0010\u00108\u001a\u00020\u00102\u0006\u00104\u001a\u000209H\u0007J\b\u0010:\u001a\u00020\u0010H\u0016J\u001a\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020+2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010=\u001a\u00020\u0010H\u0016J\u0006\u0010>\u001a\u00020\u0010J\b\u0010?\u001a\u00020\u0010H\u0002J\u0010\u0010@\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\bH\u0016J\u0010\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\fH\u0016J\u0010\u0010D\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\fH\u0002J\u0010\u0010F\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fH\u0016J\u0019\u0010F\u001a\u00020\f2\n\b\u0001\u0010G\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0002\u0010IR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/ui/FullScreenFollowFeedIn2TabFragment;", "Lcom/ss/android/ugc/aweme/feed/ui/FeedFragment;", "Lcom/ss/android/ugc/aweme/profile/ui/header/IStoryPublish;", "Lcom/ss/android/ugc/aweme/follow/IFollowNoticeHandler;", "()V", "feedFollowFragment", "Lcom/ss/android/ugc/aweme/feed/ui/FeedFollowFragment;", "leaveTime", "", "mDataCenter", "Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "mIsInit", "", "uploadRecoverPopView", "Lcom/ss/android/ugc/aweme/shortvideo/widget/UploadRecoverPopView;", "addFeedFollowFragment", "", "checkRefreshFollowLiveSkyLight", "checkUnreadAutoRefresh", "clickSecondTab", "findFeedFollowFragment", "handleAvatarShow", "insertAwemeId", "", "handleFollowCountShow", "handleFollowDotShow", "handleLiveLabelShow", "handleNoTips", "handlePageResume", "isTriggeredByNav", "handlePageStop", "hideUploadRecoverWindow", "hasNewUpload", "inFollowTab", "initDataCenter", "initTitleView", "onAttach", "activity", "Landroid/app/Activity;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onHiddenChanged", "hidden", "onHideUploadRecoverEvent", "event", "Lcom/ss/android/ugc/aweme/shortvideo/event/HideUploadRecoverEvent;", "onLogoutEvent", "Lcom/ss/android/ugc/aweme/app/event/LogoutEvent;", "onPublishStatusUpdate", "Lcom/ss/android/ugc/aweme/shortvideo/event/PublishStatus;", "onStoryPublish", "onViewCreated", "view", "refreshWithAnim", "refreshWithPushEnter", "refreshWithUnread", "setEnterTime", "time", "setUserVisibleHint", "isVisibleToUser", "showUploadRecoverIfNeed", "isServerException", "tryRefresh", "type", "", "(Ljava/lang/Integer;)Z", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FullScreenFollowFeedIn2TabFragment extends FeedFragment implements com.ss.android.ugc.aweme.follow.b, as {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3660a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f3661d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public FeedFollowFragment f3662b;

    /* renamed from: c  reason: collision with root package name */
    public h f3663c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3664e;

    /* renamed from: f  reason: collision with root package name */
    private long f3665f;
    private DataCenter g;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/ui/FullScreenFollowFeedIn2TabFragment$Companion;", "", "()V", "AUTO_REFRESH_DURATION", "", "FOLLOW_LIVE_SKYLIGHT_ARROW_SHOW", "", "FOLLOW_LIVE_SKYLIGHT_BTN_SHOW", "FOLLOW_LIVE_SKYLIGHT_COUNT", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "kvData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "onChanged", "com/ss/android/ugc/aweme/newfollow/ui/FullScreenFollowFeedIn2TabFragment$initDataCenter$1$1$1", "com/ss/android/ugc/aweme/newfollow/ui/FullScreenFollowFeedIn2TabFragment$$special$$inlined$also$lambda$1"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FragmentActivity f57258b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FullScreenFollowFeedIn2TabFragment f57259c;

        b(FragmentActivity fragmentActivity, FullScreenFollowFeedIn2TabFragment fullScreenFollowFeedIn2TabFragment) {
            this.f57258b = fragmentActivity;
            this.f57259c = fullScreenFollowFeedIn2TabFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f57257a, false, 61651, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f57257a, false, 61651, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                bool = (Boolean) aVar.a();
            } else {
                bool = null;
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                FeedFollowFragment feedFollowFragment = this.f57259c.f3662b;
                if (feedFollowFragment != null) {
                    feedFollowFragment.a((View) (LinearLayout) this.f57258b.findViewById(C0906R.id.bi1), booleanValue, false);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "kvData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "onChanged", "com/ss/android/ugc/aweme/newfollow/ui/FullScreenFollowFeedIn2TabFragment$initDataCenter$1$1$2", "com/ss/android/ugc/aweme/newfollow/ui/FullScreenFollowFeedIn2TabFragment$$special$$inlined$also$lambda$2"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FragmentActivity f57261b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FullScreenFollowFeedIn2TabFragment f57262c;

        c(FragmentActivity fragmentActivity, FullScreenFollowFeedIn2TabFragment fullScreenFollowFeedIn2TabFragment) {
            this.f57261b = fragmentActivity;
            this.f57262c = fullScreenFollowFeedIn2TabFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f57260a, false, 61652, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f57260a, false, 61652, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                num = (Integer) aVar.a();
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                DmtTextView dmtTextView = (DmtTextView) this.f57261b.findViewById(C0906R.id.dj8);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "tv_skylight_style_d_btn");
                dmtTextView.setText(GlobalContext.getContext().getString(C0906R.string.agh, new Object[]{Integer.valueOf(intValue)}));
                return;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "kvData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "onChanged", "com/ss/android/ugc/aweme/newfollow/ui/FullScreenFollowFeedIn2TabFragment$initDataCenter$1$1$3", "com/ss/android/ugc/aweme/newfollow/ui/FullScreenFollowFeedIn2TabFragment$$special$$inlined$also$lambda$3"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57263a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FragmentActivity f57264b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FullScreenFollowFeedIn2TabFragment f57265c;

        d(FragmentActivity fragmentActivity, FullScreenFollowFeedIn2TabFragment fullScreenFollowFeedIn2TabFragment) {
            this.f57264b = fragmentActivity;
            this.f57265c = fullScreenFollowFeedIn2TabFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f57263a, false, 61653, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f57263a, false, 61653, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                bool = (Boolean) aVar.a();
            } else {
                bool = null;
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                FeedFollowFragment feedFollowFragment = this.f57265c.f3662b;
                if (feedFollowFragment != null) {
                    feedFollowFragment.a((View) (AutoRTLImageView) this.f57264b.findViewById(C0906R.id.b57), booleanValue);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FullScreenFollowFeedIn2TabFragment f57267b;

        e(FullScreenFollowFeedIn2TabFragment fullScreenFollowFeedIn2TabFragment) {
            this.f57267b = fullScreenFollowFeedIn2TabFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57266a, false, 61654, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57266a, false, 61654, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f57267b.a((Integer) 2)) {
                FragmentActivity activity = this.f57267b.getActivity();
                if (activity != null) {
                    FollowFeedTriggerViewModel.a aVar = FollowFeedTriggerViewModel.f47719c;
                    Intrinsics.checkExpressionValueIsNotNull(activity, "this");
                    aVar.a(activity).a((Integer) 2);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FullScreenFollowFeedIn2TabFragment f57269b;

        f(FullScreenFollowFeedIn2TabFragment fullScreenFollowFeedIn2TabFragment) {
            this.f57269b = fullScreenFollowFeedIn2TabFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57268a, false, 61655, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57268a, false, 61655, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            FeedFollowFragment feedFollowFragment = this.f57269b.f3662b;
            if (feedFollowFragment != null) {
                feedFollowFragment.k();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/newfollow/ui/FullScreenFollowFeedIn2TabFragment$showUploadRecoverIfNeed$1", "Lcom/ss/android/ugc/aweme/services/publish/IPublishService$OnGetRecoverDraftCallback;", "onFail", "", "onSuccess", "draft", "Lcom/ss/android/ugc/aweme/draft/model/AwemeDraft;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements IPublishService.OnGetRecoverDraftCallback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FullScreenFollowFeedIn2TabFragment f57271b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f57272c;

        public final void onFail() {
        }

        public final void onSuccess(@NotNull com.ss.android.ugc.aweme.draft.a.c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f57270a, false, 61656, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f57270a, false, 61656, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar, "draft");
            if (this.f57271b.isViewValid()) {
                this.f57271b.f3663c = new h(this.f57271b.getActivity(), cVar, this.f57272c);
                if (this.f57271b.isHidden()) {
                    h hVar = this.f57271b.f3663c;
                    if (hVar != null) {
                        hVar.a(false);
                    }
                }
                h hVar2 = this.f57271b.f3663c;
                if (hVar2 != null) {
                    hVar2.b();
                }
            }
        }

        g(FullScreenFollowFeedIn2TabFragment fullScreenFollowFeedIn2TabFragment, boolean z) {
            this.f57271b = fullScreenFollowFeedIn2TabFragment;
            this.f57272c = z;
        }
    }

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3660a, false, 61649, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3660a, false, 61649, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.h == null) {
            this.h = new HashMap();
        }
        View view = (View) this.h.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean Q_() {
        return true;
    }

    public final void i() {
    }

    private final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61648, new Class[0], Void.TYPE);
        } else if (ag.h.d() && this.f3664e) {
            FeedFollowFragment feedFollowFragment = this.f3662b;
            if (feedFollowFragment != null) {
                feedFollowFragment.a(3);
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61638, new Class[0], Void.TYPE);
            return;
        }
        j();
        ag.f46464f = true;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61642, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61642, new Class[0], Void.TYPE);
            return;
        }
        k();
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61619, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61619, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        bg.d(this);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61650, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61650, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment f() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3660a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment> r7 = com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment.class
            r4 = 0
            r5 = 61626(0xf0ba, float:8.6356E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3660a
            r5 = 0
            r6 = 61626(0xf0ba, float:8.6356E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment> r8 = com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment r0 = (com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment r0 = r9.f3662b
            if (r0 != 0) goto L_0x0048
            android.support.v4.app.FragmentActivity r0 = r9.getActivity()
            r1 = 0
            if (r0 == 0) goto L_0x0040
            android.support.v4.app.FragmentManager r0 = r0.getSupportFragmentManager()
            if (r0 == 0) goto L_0x0040
            java.lang.String r2 = "tag_full_screen_follow_feed"
            android.support.v4.app.Fragment r0 = r0.findFragmentByTag(r2)
            goto L_0x0041
        L_0x0040:
            r0 = r1
        L_0x0041:
            boolean r2 = r0 instanceof com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment
            if (r2 != 0) goto L_0x0046
            r0 = r1
        L_0x0046:
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment r0 = (com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment) r0
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment.f():com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment");
    }

    private final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61635, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61635, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3665f <= 0) {
            return false;
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.f3665f;
            if (currentTimeMillis <= 0) {
                return false;
            }
            if (currentTimeMillis <= 300000) {
                FeedFollowFragment feedFollowFragment = this.f3662b;
                if (feedFollowFragment == null || feedFollowFragment.j()) {
                    return false;
                }
            }
            j();
            return true;
        }
    }

    private final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61637, new Class[0], Void.TYPE);
            return;
        }
        if (a((Integer) 6)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                FollowFeedTriggerViewModel.a aVar = FollowFeedTriggerViewModel.f47719c;
                Intrinsics.checkExpressionValueIsNotNull(activity, "this");
                aVar.a(activity).a((Integer) 6);
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61641, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61641, new Class[0], Void.TYPE);
            return;
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.bM()) {
            j();
            return;
        }
        if (!g()) {
            k();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61640, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61640, new Class[0], Void.TYPE);
            return;
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.bM()) {
            j();
            return;
        }
        if (!g()) {
            k();
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3660a, false, 61618, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3660a, false, 61618, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        bg.c(this);
    }

    private final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3660a, false, 61643, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3660a, false, 61643, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (MainPageExperimentHelper.e()) {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            Intrinsics.checkExpressionValueIsNotNull(iAVService, "avService");
            iAVService.getPublishService().getRecoverDraftIfHave(k.a(), new g(this, z));
        }
    }

    public final boolean d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3660a, false, 61627, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3660a, false, 61627, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        FeedFollowFragment f2 = f();
        if (f2 != null) {
            return f2.d(z);
        }
        return false;
    }

    public final void onAttach(@Nullable Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f3660a, false, 61633, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f3660a, false, 61633, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        super.onAttach(activity);
        if (activity2 instanceof MainActivity) {
            b(false);
        }
    }

    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3660a, false, 61634, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3660a, false, 61634, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        h hVar = this.f3663c;
        if (hVar != null) {
            hVar.a(!z);
        }
        if (z) {
            this.f3665f = System.currentTimeMillis();
        }
    }

    @Subscribe
    public final void onHideUploadRecoverEvent(@NotNull com.ss.android.ugc.aweme.shortvideo.f.d dVar) {
        com.ss.android.ugc.aweme.shortvideo.f.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3660a, false, 61645, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3660a, false, 61645, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "event");
        f(dVar2.f67639a);
    }

    @Subscribe
    public final void onLogoutEvent(@NotNull com.ss.android.ugc.aweme.app.d.g gVar) {
        com.ss.android.ugc.aweme.app.d.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f3660a, false, 61646, new Class[]{com.ss.android.ugc.aweme.app.d.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f3660a, false, 61646, new Class[]{com.ss.android.ugc.aweme.app.d.g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(gVar2, "event");
        f(false);
    }

    @Subscribe
    public final void onPublishStatusUpdate(@NotNull com.ss.android.ugc.aweme.shortvideo.f.e eVar) {
        com.ss.android.ugc.aweme.shortvideo.f.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f3660a, false, 61647, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f3660a, false, 61647, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "event");
        if (isViewValid()) {
            if (eVar2.f67642c == 9 && eVar2.g) {
                b(eVar2.h);
            }
        }
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3660a, false, 61625, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3660a, false, 61625, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FeedFollowFragment f2 = f();
        if (f2 != null) {
            f2.setUserVisibleHint(z);
        }
    }

    private final void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3660a, false, 61644, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3660a, false, 61644, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (MainPageExperimentHelper.e() && isViewValid() && this.f3663c != null) {
            h hVar = this.f3663c;
            if (hVar != null && hVar.isShowing()) {
                if (z) {
                    com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.j8).a();
                }
                h hVar2 = this.f3663c;
                if (hVar2 != null) {
                    hVar2.dismiss();
                }
            }
        }
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f3660a, false, 61629, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f3660a, false, 61629, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        FeedFollowFragment f2 = f();
        if (f2 != null) {
            f2.a(j2);
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3660a, false, 61631, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3660a, false, 61631, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.c(z);
        FeedFollowFragment f2 = f();
        if (f2 != null) {
            f2.c(z);
        }
    }

    public final void a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3660a, false, 61639, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3660a, false, 61639, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "insertAwemeId");
        if (!TextUtils.isEmpty(str) && this.f3662b != null) {
            FeedFollowFragment feedFollowFragment = this.f3662b;
            if (feedFollowFragment != null) {
                feedFollowFragment.g = str;
            }
        }
        j();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3660a, false, 61630, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3660a, false, 61630, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        FeedFollowFragment f2 = f();
        if (f2 != null) {
            f2.a(z);
        }
    }

    public final boolean a(@IFollowFeedFetchTrigger.IRefreshType Integer num) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{num}, this, f3660a, false, 61628, new Class[]{Integer.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{num}, this, f3660a, false, 61628, new Class[]{Integer.class}, Boolean.TYPE)).booleanValue();
        }
        if ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 2)) {
            z = false;
        }
        return d(z);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3660a, false, 61621, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3660a, false, 61621, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61622, new Class[0], Void.TYPE);
        } else {
            Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("tag_full_screen_follow_feed");
            if (!(findFragmentByTag instanceof FeedFollowFragment)) {
                findFragmentByTag = null;
            }
            this.f3662b = (FeedFollowFragment) findFragmentByTag;
            if (this.f3662b == null) {
                FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
                Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "childFragmentManager.beginTransaction()");
                Fragment a2 = ac.a(1, "homepage_follow");
                if (a2 != null) {
                    this.f3662b = (FeedFollowFragment) a2;
                    FeedFollowFragment feedFollowFragment = this.f3662b;
                    if (feedFollowFragment == null) {
                        Intrinsics.throwNpe();
                    }
                    beginTransaction.add(C0906R.id.afa, feedFollowFragment, "tag_full_screen_follow_feed");
                    beginTransaction.commitAllowingStateLoss();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment");
                }
            }
            setUserVisibleHint(true);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61623, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61623, new Class[0], Void.TYPE);
        } else {
            int statusBarHeight = UIUtils.getStatusBarHeight(getContext());
            FrameLayout frameLayout = (FrameLayout) a((int) C0906R.id.d3r);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "title_container");
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin += statusBarHeight;
                FrameLayout frameLayout2 = (FrameLayout) a((int) C0906R.id.d3r);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "title_container");
                frameLayout2.setLayoutParams(layoutParams2);
                ((DmtTextView) a((int) C0906R.id.dbu)).setOnClickListener(new e(this));
                ((LinearLayout) a((int) C0906R.id.bi1)).setOnClickListener(new f(this));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3660a, false, 61624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3660a, false, 61624, new Class[0], Void.TYPE);
        } else {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.g = DataCenter.a(ViewModelProviders.of(activity), (LifecycleOwner) this);
                DataCenter dataCenter = this.g;
                if (dataCenter != null) {
                    dataCenter.a("follow_live_skylight_btn_show", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new b<com.ss.android.ugc.aweme.arch.widgets.base.a>(activity, this)).a("follow_live_skylight_count", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new c<com.ss.android.ugc.aweme.arch.widgets.base.a>(activity, this)).a("follow_live_skylight_arrow_show", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new d<com.ss.android.ugc.aweme.arch.widgets.base.a>(activity, this));
                }
            }
        }
        this.f3664e = true;
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3660a, false, 61620, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3660a, false, 61620, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return com.bytedance.ies.x2c.d.a(getContext(), C0906R.layout.o3, viewGroup2, false);
    }
}
