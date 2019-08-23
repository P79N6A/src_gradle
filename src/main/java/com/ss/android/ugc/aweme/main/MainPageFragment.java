package com.ss.android.ugc.aweme.main;

import a.i;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ah.a;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashEvent;
import com.ss.android.ugc.aweme.commercialize.utils.ab;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.f.ac;
import com.ss.android.ugc.aweme.feed.f.ae;
import com.ss.android.ugc.aweme.feed.f.am;
import com.ss.android.ugc.aweme.feed.f.t;
import com.ss.android.ugc.aweme.feed.f.w;
import com.ss.android.ugc.aweme.feed.f.y;
import com.ss.android.ugc.aweme.feed.guide.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.feed.ui.MainPageNearByFragment;
import com.ss.android.ugc.aweme.feed.ui.NearByFragment;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feedback.l;
import com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel;
import com.ss.android.ugc.aweme.follow.presenter.f;
import com.ss.android.ugc.aweme.follow.ui.TeenagerFollowFragment;
import com.ss.android.ugc.aweme.follow.ui.TeenagerMessagesFragment;
import com.ss.android.ugc.aweme.follow.ui.TeenagerNearbyFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.ui.RecommendFriendActivity;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.lego.lazy.LazyFragmentPagerAdapter;
import com.ss.android.ugc.aweme.legoImp.inflate.p;
import com.ss.android.ugc.aweme.main.a.c;
import com.ss.android.ugc.aweme.main.base.MainBottomTabView;
import com.ss.android.ugc.aweme.main.base.TabAlphaController;
import com.ss.android.ugc.aweme.main.base.TabChangeManager;
import com.ss.android.ugc.aweme.main.base.mainpage.CommonPageFragment;
import com.ss.android.ugc.aweme.main.bu;
import com.ss.android.ugc.aweme.main.dialogmanager.HomeDialogManager;
import com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn;
import com.ss.android.ugc.aweme.main.follow.e;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.main.page.TabClickCallBack;
import com.ss.android.ugc.aweme.message.model.FollowTabInfoStruct;
import com.ss.android.ugc.aweme.message.model.NoticeCount;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import com.ss.android.ugc.aweme.mobile.a.b;
import com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment;
import com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment;
import com.ss.android.ugc.aweme.notification.MessagesFragment;
import com.ss.android.ugc.aweme.profile.api.ActivityLinkManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.MyProfileFragment;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.share.bg;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.shortvideo.au;
import com.ss.android.ugc.aweme.shortvideo.av;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.video.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
public class MainPageFragment extends CommonPageFragment implements LazyFragmentPagerAdapter.a, com.ss.android.ugc.aweme.main.base.a, f {
    private static final String TAG = MainActivity.class.getSimpleName();
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static boolean hasClickProfileTab = false;
    private static boolean isColdStart = true;
    private com.ss.android.ugc.aweme.main.a.b bubbleGuideHelper;
    @BindView(2131493422)
    ViewStub bubbleGuideHolder;
    private boolean hasLiveRecordInit = false;
    private boolean hasLogged = false;
    private boolean hasNotifiPopShowed = false;
    private boolean isInVideoPlayMode;
    private boolean isShowNotificationDot = true;
    private boolean isShowNotifyPop;
    private LiveBroadcastWarn liveBroadcastWarn;
    private List<com.ss.android.ugc.aweme.main.follow.a> liveNoticeUsers;
    public e liveNoticeView;
    private List<Long> liveShowRecord = new ArrayList();
    private AnimatorSet mAddVolumeAnim;
    public MainAnimViewModel mAnimViewModel;
    @BindView(2131494174)
    LinearLayout mAutoPlayTab;
    private boolean mAwesomeSplashShowing;
    private boolean mBubbleGuidePending;
    bg mBubbleManager;
    private int mCommentDialogState;
    private int mCurFollowCount = 0;
    private int mCurScreenWidthDp;
    public Aweme mCurrentAweme;
    private AnimatorSet mCutVolumeAnim;
    private DataCenter mDataCenter;
    DisLikeAwemeLayout mDisLikeAwemeLayout;
    public String mEventType = "homepage_hot";
    public long mFirstClickPublish;
    private List<NoticeCount> mFirstLevelShowList = new CopyOnWriteArrayList();
    private c mFollowTabBubbleGuideView;
    private f mFollowingAwemeCountPresenter;
    boolean mGuideShown;
    View mGuideView;
    private AnimatorSet mHideAnimatorSet;
    private String mInsertAwemeId;
    private boolean mIsFirstResume;
    private boolean mIsFollowAvatarShowing = false;
    private boolean mIsFollowCountShowing = false;
    private boolean mIsFollowDotShowing = false;
    private boolean mIsFollowLiveLabelShowing = false;
    public boolean mIsScrollToProflieGuideShowing;
    private String mLastUserId;
    public boolean mLongClickGuideShowing;
    @BindView(2131495698)
    MainBottomTabView mMainBottomTabView;
    private com.ss.android.ugc.aweme.feed.ui.seekbar.a.c mMainTabVideoSeekBarControl;
    bt mSafeMainTabPreferences = new bt();
    public e mScrollSwitchHelper;
    public g mScrollToProfileGuideHelper;
    private List<NoticeCount> mSecondLevelShowList = new CopyOnWriteArrayList();
    private boolean mSettingSyncDoneAndShouldShowPrivacyDialog;
    private boolean mSettingSyncTimeOutOrPrivacyPolicyDialogHasShowed;
    private Runnable mShowDialogRoutineRunnable;
    private boolean mStoryRecordShowing;
    public boolean mSwipeUpGuideShowing;
    public TabChangeManager mTabChangeManager;
    MainBottomTabView.a mTabClickListener = new MainBottomTabView.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54232a;

        /* JADX WARNING: type inference failed for: r1v68, types: [android.support.v4.app.Fragment] */
        /* JADX WARNING: type inference failed for: r1v71, types: [android.support.v4.app.Fragment] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@com.ss.android.ugc.aweme.main.base.TabType java.lang.String r20) {
            /*
                r19 = this;
                r7 = r19
                r8 = r20
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f54232a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 57574(0xe0e6, float:8.0678E-41)
                r1 = r19
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0038
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f54232a
                r3 = 0
                r4 = 57574(0xe0e6, float:8.0678E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r19
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0038:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.tryHideLiveBroadcastWarn()
                java.lang.String r0 = "NOTIFICATION"
                boolean r0 = r0.equals(r8)
                if (r0 == 0) goto L_0x0055
                com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
                r0.f55366c = r9
                com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
                r1 = 998(0x3e6, float:1.398E-42)
                r0.a((int) r1)
                goto L_0x005b
            L_0x0055:
                com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
                r0.f55366c = r10
            L_0x005b:
                java.lang.String r0 = "page_setting"
                com.ss.android.ugc.aweme.main.MainPageFragment r1 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.e r1 = r1.mScrollSwitchHelper
                java.lang.String r1 = r1.b()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x006c
                return
            L_0x006c:
                java.lang.String r0 = "MainPage"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "MainBottomTabView click, tab is "
                r1.<init>(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r2 = 4
                com.ss.android.ugc.aweme.framework.a.a.a(r2, r0, r1)
                com.ss.android.ugc.aweme.feed.f.e r0 = new com.ss.android.ugc.aweme.feed.f.e
                r0.<init>(r8)
                com.ss.android.ugc.aweme.utils.bg.a(r0)
                com.ss.android.ugc.aweme.ah.a.c.f33270b = r8
                r0 = -1
                int r1 = r20.hashCode()
                r3 = 3
                r4 = 2
                switch(r1) {
                    case -1996153217: goto L_0x00c7;
                    case -1382453013: goto L_0x00bd;
                    case 2223327: goto L_0x00b3;
                    case 2614219: goto L_0x00a9;
                    case 482617583: goto L_0x009f;
                    case 2079338417: goto L_0x0095;
                    default: goto L_0x0094;
                }
            L_0x0094:
                goto L_0x00d0
            L_0x0095:
                java.lang.String r1 = "FOLLOW"
                boolean r1 = r8.equals(r1)
                if (r1 == 0) goto L_0x00d0
                r0 = 2
                goto L_0x00d0
            L_0x009f:
                java.lang.String r1 = "PUBLISH"
                boolean r1 = r8.equals(r1)
                if (r1 == 0) goto L_0x00d0
                r0 = 3
                goto L_0x00d0
            L_0x00a9:
                java.lang.String r1 = "USER"
                boolean r1 = r8.equals(r1)
                if (r1 == 0) goto L_0x00d0
                r0 = 5
                goto L_0x00d0
            L_0x00b3:
                java.lang.String r1 = "HOME"
                boolean r1 = r8.equals(r1)
                if (r1 == 0) goto L_0x00d0
                r0 = 0
                goto L_0x00d0
            L_0x00bd:
                java.lang.String r1 = "NOTIFICATION"
                boolean r1 = r8.equals(r1)
                if (r1 == 0) goto L_0x00d0
                r0 = 4
                goto L_0x00d0
            L_0x00c7:
                java.lang.String r1 = "NEARBY"
                boolean r1 = r8.equals(r1)
                if (r1 == 0) goto L_0x00d0
                r0 = 1
            L_0x00d0:
                r5 = 500(0x1f4, double:2.47E-321)
                r1 = 0
                switch(r0) {
                    case 0: goto L_0x08c1;
                    case 1: goto L_0x082d;
                    case 2: goto L_0x0612;
                    case 3: goto L_0x0467;
                    case 4: goto L_0x02ea;
                    case 5: goto L_0x00d8;
                    default: goto L_0x00d6;
                }
            L_0x00d6:
                goto L_0x091d
            L_0x00d8:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.hideSomeMainPageView()
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
                boolean r0 = r0.isLogin()
                if (r0 != 0) goto L_0x0138
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.MainBottomTabView r0 = r0.mMainBottomTabView
                boolean r0 = com.ss.android.ugc.aweme.c.a.a.a(r0)
                if (r0 == 0) goto L_0x00f2
                return
            L_0x00f2:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r1 = 2131561250(0x7f0d0b22, float:1.8747895E38)
                java.lang.String r0 = r0.getString(r1)
                com.ss.android.ugc.aweme.main.MainPageFragment r1 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.mCurrentAweme
                if (r1 == 0) goto L_0x010a
                com.ss.android.ugc.aweme.main.MainPageFragment r1 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.mCurrentAweme
                java.lang.String r1 = r1.getAid()
                goto L_0x010c
            L_0x010a:
                java.lang.String r1 = ""
            L_0x010c:
                com.ss.android.ugc.aweme.main.MainPageFragment r2 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.support.v4.app.FragmentActivity r2 = r2.getActivity()
                com.ss.android.ugc.aweme.main.MainPageFragment r3 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                java.lang.String r3 = r3.mEventType
                java.lang.String r4 = "click_mine"
                com.ss.android.ugc.aweme.utils.ad r5 = com.ss.android.ugc.aweme.utils.ad.a()
                java.lang.String r6 = "login_title"
                com.ss.android.ugc.aweme.utils.ad r0 = r5.a((java.lang.String) r6, (java.lang.String) r0)
                java.lang.String r5 = "group_id"
                com.ss.android.ugc.aweme.utils.ad r0 = r0.a((java.lang.String) r5, (java.lang.String) r1)
                java.lang.String r5 = "log_pb"
                java.lang.String r1 = com.ss.android.ugc.aweme.u.aa.g((java.lang.String) r1)
                com.ss.android.ugc.aweme.utils.ad r0 = r0.a((java.lang.String) r5, (java.lang.String) r1)
                android.os.Bundle r0 = r0.f75487b
                com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r2, (java.lang.String) r3, (java.lang.String) r4, (android.os.Bundle) r0)
                return
            L_0x0138:
                java.lang.String r0 = "USER"
                com.ss.android.ugc.aweme.main.MainPageFragment r3 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r3 = r3.mTabChangeManager
                java.lang.String r3 = r3.f54419e
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x0287
                java.lang.String r0 = "homepage_click"
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                java.lang.String r1 = "USER"
                r0.toTargetTab(r1)
                com.ss.android.ugc.aweme.main.MainPageFragment.hasClickProfileTab = r9
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r0 = r0.mTabChangeManager
                android.support.v4.app.Fragment r0 = r0.a()
                boolean r1 = r0 instanceof com.ss.android.ugc.aweme.profile.ui.MyProfileFragment
                if (r1 == 0) goto L_0x01ff
                com.ss.android.ugc.aweme.profile.ui.MyProfileFragment r0 = (com.ss.android.ugc.aweme.profile.ui.MyProfileFragment) r0
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.MyProfileFragment.M
                r14 = 0
                r15 = 68528(0x10bb0, float:9.6028E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r1 == 0) goto L_0x018a
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.MyProfileFragment.M
                r14 = 0
                r15 = 68528(0x10bb0, float:9.6028E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x01c5
            L_0x018a:
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
                com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
                if (r1 == 0) goto L_0x01c5
                com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
                com.ss.android.ugc.aweme.app.an r3 = r3.getHasEnterBindPhone()
                java.lang.Object r3 = r3.c()
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L_0x01c5
                java.lang.String r1 = r1.getBindPhone()
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L_0x01c5
                com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
                java.lang.String r3 = "tip_show"
                com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r3)
                java.lang.String r3 = "mobile_link"
                com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r3)
                com.ss.android.ugc.aweme.common.r.onEvent(r1)
            L_0x01c5:
                r0.G()
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.MyProfileFragment.M
                r14 = 0
                r15 = 68555(0x10bcb, float:9.6066E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r1 == 0) goto L_0x01f0
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.MyProfileFragment.M
                r14 = 0
                r15 = 68555(0x10bcb, float:9.6066E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x01fd
            L_0x01f0:
                com.ss.android.ugc.aweme.profile.ui.header.a r1 = r0.E
                boolean r1 = r1 instanceof com.ss.android.ugc.aweme.profile.ui.header.AbsMyCommonHeaderLayout
                if (r1 == 0) goto L_0x01fd
                com.ss.android.ugc.aweme.profile.ui.header.a r1 = r0.E
                com.ss.android.ugc.aweme.profile.ui.header.AbsMyCommonHeaderLayout r1 = (com.ss.android.ugc.aweme.profile.ui.header.AbsMyCommonHeaderLayout) r1
                r1.A()
            L_0x01fd:
                r0.ac = r9
            L_0x01ff:
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi.f38582a
                r14 = 1
                r15 = 30443(0x76eb, float:4.266E-41)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r0
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r0 == 0) goto L_0x0225
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi.f38582a
                r14 = 1
                r15 = 30443(0x76eb, float:4.266E-41)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0241
            L_0x0225:
                com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi.f38583b = r10
                com.ss.android.ugc.aweme.framework.services.IRetrofit r0 = com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi.f38584c
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi$RealApi> r1 = com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi.RealApi.class
                java.lang.Object r0 = r0.create(r1)
                com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi$RealApi r0 = (com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi.RealApi) r0
                com.google.common.util.concurrent.q r0 = r0.getCouponEntry()
                com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi$1 r1 = new com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi$1
                r1.<init>()
                java.util.concurrent.Executor r3 = com.google.common.util.concurrent.v.a()
                com.google.common.util.concurrent.l.a(r0, r1, r3)
            L_0x0241:
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.api.PoiMerchantApi.f59720a
                r14 = 1
                r15 = 64926(0xfd9e, float:9.0981E-41)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r0
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r0 == 0) goto L_0x0269
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.api.PoiMerchantApi.f59720a
                r14 = 1
                r15 = 64926(0xfd9e, float:9.0981E-41)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0287
            L_0x0269:
                com.ss.android.ugc.aweme.poi.api.PoiMerchantApi.f59722c = r10
                com.ss.android.ugc.aweme.poi.api.PoiMerchantApi.f59721b = r10
                com.ss.android.ugc.aweme.framework.services.IRetrofit r0 = com.ss.android.ugc.aweme.poi.api.PoiMerchantApi.f59723d
                java.lang.Class<com.ss.android.ugc.aweme.poi.api.PoiMerchantApi$RealApi> r1 = com.ss.android.ugc.aweme.poi.api.PoiMerchantApi.RealApi.class
                java.lang.Object r0 = r0.create(r1)
                com.ss.android.ugc.aweme.poi.api.PoiMerchantApi$RealApi r0 = (com.ss.android.ugc.aweme.poi.api.PoiMerchantApi.RealApi) r0
                com.google.common.util.concurrent.q r0 = r0.getPoiMerchantList()
                com.ss.android.ugc.aweme.poi.api.PoiMerchantApi$1 r1 = new com.ss.android.ugc.aweme.poi.api.PoiMerchantApi$1
                r1.<init>()
                java.util.concurrent.Executor r3 = com.google.common.util.concurrent.v.a()
                com.google.common.util.concurrent.l.a(r0, r1, r3)
            L_0x0287:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r0 = r0.mTabChangeManager
                android.support.v4.app.Fragment r0 = r0.a()
                boolean r1 = r0 instanceof com.ss.android.ugc.aweme.profile.ui.MyProfileFragment
                if (r1 == 0) goto L_0x02ca
                com.ss.android.ugc.aweme.profile.ui.MyProfileFragment r0 = (com.ss.android.ugc.aweme.profile.ui.MyProfileFragment) r0
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.MyProfileFragment.M
                r14 = 0
                r15 = 68525(0x10bad, float:9.6024E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r1 == 0) goto L_0x02bd
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.MyProfileFragment.M
                r14 = 0
                r15 = 68525(0x10bad, float:9.6024E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x02ca
            L_0x02bd:
                com.ss.android.ugc.aweme.profile.ui.header.a r1 = r0.E
                boolean r1 = r1 instanceof com.ss.android.ugc.aweme.profile.ui.header.AbsMyCommonHeaderLayout
                if (r1 == 0) goto L_0x02ca
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = r0.E
                com.ss.android.ugc.aweme.profile.ui.header.AbsMyCommonHeaderLayout r0 = (com.ss.android.ugc.aweme.profile.ui.header.AbsMyCommonHeaderLayout) r0
                r0.z()
            L_0x02ca:
                com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
                boolean r0 = r0.d(r2)
                if (r0 == 0) goto L_0x02db
                com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
                r0.a((int) r2)
            L_0x02db:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                java.lang.String r1 = "personal_homepage"
                java.lang.String r2 = "click"
                com.ss.android.common.lib.a.a(r0, r1, r2)
                goto L_0x091d
            L_0x02ea:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.hideSomeMainPageView()
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
                boolean r0 = r0.isLogin()
                if (r0 != 0) goto L_0x0329
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.MainBottomTabView r0 = r0.mMainBottomTabView
                boolean r0 = com.ss.android.ugc.aweme.c.a.a.a(r0)
                if (r0 == 0) goto L_0x0304
                return
            L_0x0304:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r1 = 2131561239(0x7f0d0b17, float:1.8747873E38)
                java.lang.String r0 = r0.getString(r1)
                com.ss.android.ugc.aweme.main.MainPageFragment r1 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                com.ss.android.ugc.aweme.main.MainPageFragment r2 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                java.lang.String r2 = r2.mEventType
                java.lang.String r3 = "click_message"
                com.ss.android.ugc.aweme.utils.ad r4 = com.ss.android.ugc.aweme.utils.ad.a()
                java.lang.String r5 = "login_title"
                com.ss.android.ugc.aweme.utils.ad r0 = r4.a((java.lang.String) r5, (java.lang.String) r0)
                android.os.Bundle r0 = r0.f75487b
                com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r1, (java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r0)
                return
            L_0x0329:
                java.lang.String r0 = "NOTIFICATION"
                com.ss.android.ugc.aweme.main.MainPageFragment r2 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r2 = r2.mTabChangeManager
                java.lang.String r2 = r2.f54419e
                boolean r0 = android.text.TextUtils.equals(r0, r2)
                if (r0 == 0) goto L_0x03da
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.MainBottomTabView r0 = r0.mMainBottomTabView
                java.lang.String r2 = "NOTIFICATION"
                com.ss.android.ugc.aweme.main.base.b r0 = r0.c(r2)
                boolean r0 = com.ss.android.ugc.aweme.c.a.a.a(r0, r5)
                if (r0 == 0) goto L_0x03da
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r0 = r0.mTabChangeManager
                android.support.v4.app.Fragment r0 = r0.a()
                if (r0 == 0) goto L_0x03da
                boolean r2 = r0 instanceof com.ss.android.ugc.aweme.notification.MessagesFragment
                if (r2 == 0) goto L_0x03da
                com.ss.android.ugc.aweme.notification.MessagesFragment r0 = (com.ss.android.ugc.aweme.notification.MessagesFragment) r0
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.notification.MessagesFragment.f57798a
                r14 = 0
                r15 = 62790(0xf546, float:8.7988E-41)
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<android.support.v4.app.Fragment> r17 = android.support.v4.app.Fragment.class
                r12 = r0
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x0383
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.notification.MessagesFragment.f57798a
                r14 = 0
                r15 = 62790(0xf546, float:8.7988E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class<android.support.v4.app.Fragment> r17 = android.support.v4.app.Fragment.class
                r12 = r0
                r16 = r1
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                r1 = r0
                android.support.v4.app.Fragment r1 = (android.support.v4.app.Fragment) r1
                goto L_0x038d
            L_0x0383:
                com.ss.android.ugc.aweme.notification.adapter.MessagePagerAdapter r2 = r0.f57799b
                if (r2 == 0) goto L_0x038d
                com.ss.android.ugc.aweme.notification.adapter.MessagePagerAdapter r0 = r0.f57799b
                android.support.v4.app.Fragment r1 = r0.a()
            L_0x038d:
                if (r1 == 0) goto L_0x03da
                boolean r0 = r1 instanceof com.ss.android.ugc.aweme.notification.NewsFragment
                if (r0 == 0) goto L_0x03da
                r0 = r1
                com.ss.android.ugc.aweme.notification.NewsFragment r0 = (com.ss.android.ugc.aweme.notification.NewsFragment) r0
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.notification.NewsFragment.f57816a
                r14 = 0
                r15 = 62816(0xf560, float:8.8024E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r1 == 0) goto L_0x03be
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.notification.NewsFragment.f57816a
                r14 = 0
                r15 = 62816(0xf560, float:8.8024E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x03d7
            L_0x03be:
                boolean r1 = com.ss.android.ugc.aweme.im.b.b()
                if (r1 == 0) goto L_0x03d7
                android.support.v4.app.FragmentManager r0 = r0.getChildFragmentManager()
                java.lang.String r1 = "session"
                android.support.v4.app.Fragment r0 = r0.findFragmentByTag(r1)
                boolean r1 = r0 instanceof com.ss.android.ugc.aweme.im.service.c.a
                if (r1 == 0) goto L_0x03d7
                com.ss.android.ugc.aweme.im.service.c.a r0 = (com.ss.android.ugc.aweme.im.service.c.a) r0
                r0.e()
            L_0x03d7:
                com.ss.android.ugc.aweme.c.a.a.a()
            L_0x03da:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.logMessageTabClick()
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.toNotifyPage()
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.f.f50065a
                r14 = 1
                r15 = 50101(0xc3b5, float:7.0206E-41)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r0
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r0 == 0) goto L_0x040c
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.f.f50065a
                r14 = 1
                r15 = 50101(0xc3b5, float:7.0206E-41)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x041f
            L_0x040c:
                com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()
                java.lang.String r1 = "message"
                com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
                java.lang.String r1 = "click"
                com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
                com.ss.android.ugc.aweme.common.r.onEvent(r0)
            L_0x041f:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.content.Context r0 = r0.getApplicationContext()
                java.lang.String r1 = "message"
                java.lang.String r2 = "click"
                com.ss.android.common.lib.a.a(r0, r1, r2)
                boolean r0 = com.ss.android.ugc.aweme.im.b.b()
                if (r0 != 0) goto L_0x0453
                com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
                int r0 = r0.b()
                if (r0 <= 0) goto L_0x0453
                com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
                r1 = 47
                r0.a((int) r1)
                com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
                r2 = 16
                r0.a((int) r2)
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.showNotificationCount(r1, r10)
            L_0x0453:
                boolean r0 = com.ss.android.ugc.aweme.im.b.c()
                if (r0 != 0) goto L_0x045e
                java.lang.String r0 = "sessionListFragment-onMain:game"
                com.ss.android.ugc.aweme.utils.bg.a(r0)
            L_0x045e:
                com.benchmark.bl.a r0 = com.benchmark.bl.a.b()
                r0.a((int) r3)
                goto L_0x091d
            L_0x0467:
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.utils.dh.f75749a
                r14 = 1
                r15 = 88514(0x159c2, float:1.24035E-40)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r0
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r0 == 0) goto L_0x048f
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.utils.dh.f75749a
                r14 = 1
                r15 = 88514(0x159c2, float:1.24035E-40)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x049a
            L_0x048f:
                java.lang.String r0 = "click to open camera"
                com.ss.android.ugc.aweme.shortvideo.util.ai.d(r0)
                long r2 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.utils.dh.f75750b = r2
            L_0x049a:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.hideSomeMainPageView()
                long r2 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                long r10 = r0.mFirstClickPublish
                long r2 = r2 - r10
                int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x04ad
                return
            L_0x04ad:
                boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
                if (r0 == 0) goto L_0x04ca
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                com.ss.android.ugc.aweme.main.MainPageFragment r1 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r2 = 2131562855(0x7f0d1167, float:1.875115E38)
                java.lang.String r1 = r1.getString(r2)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (java.lang.String) r1)
                r0.a()
                return
            L_0x04ca:
                com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r0 = r0.getService(r2)
                com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
                com.ss.android.ugc.aweme.services.publish.IPublishService r0 = r0.getPublishService()
                com.ss.android.ugc.aweme.main.MainPageFragment r2 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.support.v4.app.FragmentActivity r2 = r2.getActivity()
                boolean r0 = r0.checkIsAlreadyPublished(r2)
                if (r0 != 0) goto L_0x04e7
                return
            L_0x04e7:
                com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r0 = r0.getService(r2)
                com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
                com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
                r0.setCurMusic(r1)
                com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r0 = r0.getService(r1)
                com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
                com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
                r0.removeChallenges()
                java.lang.String r0 = "direct"
                java.lang.String r1 = ""
                java.lang.String r2 = "HOME"
                com.ss.android.ugc.aweme.main.MainPageFragment r3 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r3 = r3.mTabChangeManager
                java.lang.String r3 = r3.f54419e
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0597
                com.ss.android.ugc.aweme.main.MainPageFragment r2 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r2 = r2.mTabChangeManager
                android.support.v4.app.Fragment r2 = r2.a()
                com.ss.android.ugc.aweme.main.MainFragment r2 = (com.ss.android.ugc.aweme.main.MainFragment) r2
                com.ss.android.ugc.aweme.feed.ui.FeedFragment r2 = r2.a()
                boolean r2 = r2 instanceof com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment
                if (r2 == 0) goto L_0x0576
                com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
                java.lang.String r2 = "record"
                com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
                java.lang.String r2 = "click"
                com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
                com.ss.android.ugc.aweme.common.t r2 = new com.ss.android.ugc.aweme.common.t
                r2.<init>()
                java.lang.String r3 = "group_id"
                com.ss.android.ugc.aweme.shortvideo.av r4 = com.ss.android.ugc.aweme.shortvideo.av.INSTANCE
                java.lang.String r4 = r4.getVideoId()
                com.ss.android.ugc.aweme.common.t r2 = r2.a(r3, r4)
                java.lang.String r3 = "record_mode"
                com.ss.android.ugc.aweme.common.t r0 = r2.a(r3, r0)
                org.json.JSONObject r0 = r0.a()
                com.ss.android.ugc.aweme.common.MobClick r0 = r1.setJsonObject(r0)
                com.ss.android.ugc.aweme.common.r.onEvent(r0)
                com.ss.android.ugc.aweme.feed.ai r0 = com.ss.android.ugc.aweme.feed.ai.a()
                com.ss.android.ugc.aweme.shortvideo.av r1 = com.ss.android.ugc.aweme.shortvideo.av.INSTANCE
                java.lang.String r1 = r1.getVideoId()
                java.lang.String r1 = com.ss.android.ugc.aweme.u.aa.f((java.lang.String) r1)
                java.lang.String r1 = r0.a((java.lang.String) r1)
                goto L_0x05b7
            L_0x0576:
                com.ss.android.ugc.aweme.main.MainPageFragment r2 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.support.v4.app.FragmentActivity r10 = r2.getActivity()
                java.lang.String r11 = "record"
                java.lang.String r12 = "click"
                r13 = 0
                r15 = 0
                com.ss.android.ugc.aweme.common.t r2 = new com.ss.android.ugc.aweme.common.t
                r2.<init>()
                java.lang.String r3 = "record_mode"
                com.ss.android.ugc.aweme.common.t r0 = r2.a(r3, r0)
                org.json.JSONObject r17 = r0.a()
                com.ss.android.common.lib.a.a(r10, r11, r12, r13, r15, r17)
                goto L_0x05b7
            L_0x0597:
                com.ss.android.ugc.aweme.main.MainPageFragment r2 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.support.v4.app.FragmentActivity r10 = r2.getActivity()
                java.lang.String r11 = "record"
                java.lang.String r12 = "click"
                r13 = 0
                r15 = 0
                com.ss.android.ugc.aweme.common.t r2 = new com.ss.android.ugc.aweme.common.t
                r2.<init>()
                java.lang.String r3 = "record_mode"
                com.ss.android.ugc.aweme.common.t r0 = r2.a(r3, r0)
                org.json.JSONObject r17 = r0.a()
                com.ss.android.common.lib.a.a(r10, r11, r12, r13, r15, r17)
            L_0x05b7:
                com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r0 = r0.getService(r2)
                com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
                if (r0 == 0) goto L_0x05f0
                boolean r0 = r0.needLoginBeforeRecord()
                if (r0 == 0) goto L_0x05f0
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r1 = 2131562432(0x7f0d0fc0, float:1.8750293E38)
                java.lang.String r0 = r0.getString(r1)
                com.ss.android.ugc.aweme.main.MainPageFragment r1 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                com.ss.android.ugc.aweme.main.MainPageFragment r2 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                java.lang.String r2 = r2.mEventType
                java.lang.String r3 = "click_shoot"
                com.ss.android.ugc.aweme.utils.ad r4 = com.ss.android.ugc.aweme.utils.ad.a()
                java.lang.String r5 = "login_title"
                com.ss.android.ugc.aweme.utils.ad r0 = r4.a((java.lang.String) r5, (java.lang.String) r0)
                android.os.Bundle r0 = r0.f75487b
                com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r1, (java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r0)
                return
            L_0x05f0:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.recordWithMusic(r1)
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                long r1 = java.lang.System.currentTimeMillis()
                r0.mFirstClickPublish = r1
                com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r0 = r0.getService(r1)
                com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
                com.ss.android.ugc.aweme.filter.ar r0 = r0.getFilterService()
                r0.refreshData()
                goto L_0x091d
            L_0x0612:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                boolean r0 = r0.isViewValid()
                if (r0 != 0) goto L_0x061b
                return
            L_0x061b:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.hideSomeMainPageView()
                com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.Integer r0 = r0.G()
                int r0 = r0.intValue()
                if (r0 != r4) goto L_0x065d
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
                boolean r0 = r0.isLogin()
                if (r0 != 0) goto L_0x065d
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r1 = 2131560039(0x7f0d0667, float:1.874544E38)
                java.lang.String r0 = r0.getString(r1)
                com.ss.android.ugc.aweme.main.MainPageFragment r1 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                com.ss.android.ugc.aweme.main.MainPageFragment r2 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                java.lang.String r2 = r2.mEventType
                java.lang.String r3 = "click_follow_tab"
                com.ss.android.ugc.aweme.utils.ad r4 = com.ss.android.ugc.aweme.utils.ad.a()
                java.lang.String r5 = "login_title"
                com.ss.android.ugc.aweme.utils.ad r0 = r4.a((java.lang.String) r5, (java.lang.String) r0)
                android.os.Bundle r0 = r0.f75487b
                com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r1, (java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r0)
                return
            L_0x065d:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                java.lang.String r0 = r0.getEnterFrom()
                java.lang.String r2 = "FOLLOW"
                com.ss.android.ugc.aweme.main.MainPageFragment r3 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r3 = r3.mTabChangeManager
                java.lang.String r3 = r3.f54419e
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 != 0) goto L_0x071c
                com.ss.android.ugc.aweme.main.MainPageFragment r3 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                java.lang.String r5 = "FOLLOW"
                r3.toTargetTab(r5)
                com.ss.android.ugc.aweme.main.MainPageFragment r3 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r3 = r3.mTabChangeManager
                android.support.v4.app.Fragment r3 = r3.a()
                boolean r5 = r3 instanceof com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment
                if (r5 == 0) goto L_0x06f8
                com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment r3 = (com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment) r3
                long r5 = java.lang.System.currentTimeMillis()
                java.lang.Object[] r11 = new java.lang.Object[r9]
                java.lang.Long r12 = new java.lang.Long
                r12.<init>(r5)
                r11[r10] = r12
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment.f3654a
                r14 = 0
                r15 = 61572(0xf084, float:8.6281E-41)
                java.lang.Class[] r12 = new java.lang.Class[r9]
                java.lang.Class r16 = java.lang.Long.TYPE
                r12[r10] = r16
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r12
                r12 = r3
                boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r11 == 0) goto L_0x06c8
                java.lang.Object[] r11 = new java.lang.Object[r9]
                java.lang.Long r12 = new java.lang.Long
                r12.<init>(r5)
                r11[r10] = r12
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment.f3654a
                r14 = 0
                r15 = 61572(0xf084, float:8.6281E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r6 = java.lang.Long.TYPE
                r5[r10] = r6
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r3
                r16 = r5
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x06ef
            L_0x06c8:
                java.util.ArrayList<android.support.v4.app.Fragment> r11 = r3.f3655b
                if (r11 == 0) goto L_0x06ef
                android.support.v4.view.ViewPager r11 = r3.mViewPager
                if (r11 == 0) goto L_0x06ef
                java.util.ArrayList<android.support.v4.app.Fragment> r11 = r3.f3655b
                int r11 = r11.size()
                android.support.v4.view.ViewPager r12 = r3.mViewPager
                int r12 = r12.getCurrentItem()
                if (r11 <= r12) goto L_0x06ef
                java.util.ArrayList<android.support.v4.app.Fragment> r11 = r3.f3655b
                android.support.v4.view.ViewPager r12 = r3.mViewPager
                int r12 = r12.getCurrentItem()
                java.lang.Object r11 = r11.get(r12)
                com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment r11 = (com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment) r11
                r11.a((long) r5)
            L_0x06ef:
                r3.setUserVisibleHint(r9)
                r18 = r3
                r3 = r1
                r1 = r18
                goto L_0x070d
            L_0x06f8:
                boolean r5 = r3 instanceof com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment
                if (r5 == 0) goto L_0x070c
                com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment r3 = (com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment) r3
                long r5 = java.lang.System.currentTimeMillis()
                r3.a((long) r5)
                r3.setUserVisibleHint(r9)
                r3.a((boolean) r10)
                goto L_0x070d
            L_0x070c:
                r3 = r1
            L_0x070d:
                com.ss.android.ugc.aweme.main.MainPageFragment r5 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.support.v4.app.FragmentActivity r5 = r5.getActivity()
                com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel r5 = com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel.a((android.support.v4.app.FragmentActivity) r5)
                r5.a()
                goto L_0x07c3
            L_0x071c:
                com.ss.android.ugc.aweme.main.MainPageFragment r3 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r3 = r3.mTabChangeManager
                android.support.v4.app.Fragment r3 = r3.a()
                boolean r5 = r3 instanceof com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment
                if (r5 == 0) goto L_0x0768
                com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment r3 = (com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment) r3
                com.ss.android.ugc.aweme.main.MainPageFragment r5 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.MainBottomTabView r5 = r5.mMainBottomTabView
                java.lang.String r6 = "FOLLOW"
                r5.b(r6)
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment.f3654a
                r14 = 0
                r15 = 61573(0xf085, float:8.6282E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r3
                r16 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r5 == 0) goto L_0x075b
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment.f3654a
                r14 = 0
                r15 = 61573(0xf085, float:8.6282E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r3
                r16 = r5
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0762
            L_0x075b:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
                r3.a((java.lang.Integer) r5)
            L_0x0762:
                r18 = r3
                r3 = r1
                r1 = r18
                goto L_0x07c3
            L_0x0768:
                boolean r5 = r3 instanceof com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment
                if (r5 == 0) goto L_0x07c2
                com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment r3 = (com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment) r3
                com.ss.android.ugc.aweme.main.MainPageFragment r5 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.MainBottomTabView r5 = r5.mMainBottomTabView
                java.lang.String r6 = "FOLLOW"
                r5.b(r6)
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment.f3660a
                r14 = 0
                r15 = 61632(0xf0c0, float:8.6365E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r3
                r16 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r5 == 0) goto L_0x079f
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment.f3660a
                r14 = 0
                r15 = 61632(0xf0c0, float:8.6365E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r3
                r16 = r5
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x07c3
            L_0x079f:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
                boolean r5 = r3.a((java.lang.Integer) r5)
                if (r5 == 0) goto L_0x07c3
                android.support.v4.app.FragmentActivity r5 = r3.getActivity()
                if (r5 == 0) goto L_0x07c3
                com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel$a r6 = com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel.f47719c
                java.lang.String r11 = "this"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r11)
                com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel r5 = r6.a(r5)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                r5.a((java.lang.Integer) r6)
                goto L_0x07c3
            L_0x07c2:
                r3 = r1
            L_0x07c3:
                if (r1 == 0) goto L_0x07cb
                com.ss.android.ugc.aweme.main.MainPageFragment r3 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r3.handleFollowNotice(r0, r1, r2)
                goto L_0x07d2
            L_0x07cb:
                if (r3 == 0) goto L_0x07d2
                com.ss.android.ugc.aweme.main.MainPageFragment r1 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r1.handleFollowNotice(r0, r3, r2)
            L_0x07d2:
                com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.Integer r0 = r0.G()
                int r0 = r0.intValue()
                if (r0 != r4) goto L_0x081e
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.g.a.f57157a
                r14 = 1
                r15 = 61355(0xefab, float:8.5977E-41)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r0
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r0 == 0) goto L_0x0809
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.g.a.f57157a
                r14 = 1
                r15 = 61355(0xefab, float:8.5977E-41)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x091d
            L_0x0809:
                com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()
                java.lang.String r1 = "following"
                com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
                java.lang.String r1 = "click"
                com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
                com.ss.android.ugc.aweme.common.r.onEvent(r0)
                goto L_0x091d
            L_0x081e:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.content.Context r0 = r0.getApplicationContext()
                java.lang.String r1 = "discovery"
                java.lang.String r2 = "click"
                com.ss.android.common.lib.a.a(r0, r1, r2)
                goto L_0x091d
            L_0x082d:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                boolean r0 = r0.isViewValid()
                if (r0 != 0) goto L_0x0836
                return
            L_0x0836:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.hideSomeMainPageView()
                java.lang.String r0 = "NEARBY"
                com.ss.android.ugc.aweme.main.MainPageFragment r1 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r1 = r1.mTabChangeManager
                java.lang.String r1 = r1.f54419e
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x085d
                com.ss.android.ugc.aweme.feed.f.y r0 = new com.ss.android.ugc.aweme.feed.f.y
                r0.<init>()
                com.ss.android.ugc.aweme.utils.bg.a(r0)
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.MainBottomTabView r0 = r0.mMainBottomTabView
                java.lang.String r1 = "NEARBY"
                r0.b(r1)
                java.lang.String r0 = "refresh"
                goto L_0x0866
            L_0x085d:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                java.lang.String r1 = "NEARBY"
                r0.toTargetTab(r1)
                java.lang.String r0 = "click_bottom_icon"
            L_0x0866:
                java.lang.String r1 = "homepage_fresh_click"
                com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r3 = "click_method"
                com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
                java.lang.String r2 = "city_info"
                java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.a()
                com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
                java.lang.String r0 = "enter_homepage_fresh"
                com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r2 = "group_id"
                com.ss.android.ugc.aweme.main.MainPageFragment r3 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.getCurrentAweme()
                java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.m(r3)
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "author_id"
                com.ss.android.ugc.aweme.main.MainPageFragment r3 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.getCurrentAweme()
                java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.a((com.ss.android.ugc.aweme.feed.model.Aweme) r3)
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "enter_method"
                java.lang.String r3 = "click_bottom_icon"
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "previous_page"
                com.ss.android.ugc.aweme.main.MainPageFragment r3 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                java.lang.String r3 = r3.getEnterFrom()
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                goto L_0x091d
            L_0x08c1:
                java.lang.String r0 = "HOME"
                com.ss.android.ugc.aweme.main.MainPageFragment r1 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r1 = r1.mTabChangeManager
                java.lang.String r1 = r1.f54419e
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x08f0
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r0 = r0.mTabChangeManager
                android.support.v4.app.Fragment r0 = r0.a()
                com.ss.android.ugc.aweme.main.MainFragment r0 = (com.ss.android.ugc.aweme.main.MainFragment) r0
                java.lang.String r1 = "homepage_refresh"
                r0.a((int) r9, (java.lang.String) r1)
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.MainBottomTabView r0 = r0.mMainBottomTabView
                java.lang.String r1 = "HOME"
                r0.b(r1)
                com.ss.android.ugc.aweme.commercialize.b.a r0 = new com.ss.android.ugc.aweme.commercialize.b.a
                r0.<init>()
                com.ss.android.ugc.aweme.utils.bg.a(r0)
                goto L_0x0910
            L_0x08f0:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                com.ss.android.ugc.aweme.main.base.TabChangeManager r0 = r0.mTabChangeManager
                java.lang.String r1 = "HOME"
                r0.a((java.lang.String) r1)
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.tryShowPublishView()
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                r0.handleMainPageResume()
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.content.Context r0 = r0.getApplicationContext()
                java.lang.String r1 = "homepage"
                java.lang.String r2 = "show"
                com.ss.android.common.lib.a.a(r0, r1, r2)
            L_0x0910:
                com.ss.android.ugc.aweme.main.MainPageFragment r0 = com.ss.android.ugc.aweme.main.MainPageFragment.this
                android.content.Context r0 = r0.getApplicationContext()
                java.lang.String r1 = "homepage"
                java.lang.String r2 = "click"
                com.ss.android.common.lib.a.a(r0, r1, r2)
            L_0x091d:
                com.ss.android.ugc.aweme.main.MainPageFragment.hasClickProfileTab = r9
                java.lang.String r0 = "HOME"
                boolean r0 = com.bytedance.common.utility.StringUtils.equal(r8, r0)
                if (r0 != 0) goto L_0x092f
                com.ss.android.ugc.aweme.feed.f.j r0 = new com.ss.android.ugc.aweme.feed.f.j
                r0.<init>()
                com.ss.android.ugc.aweme.utils.bg.a(r0)
            L_0x092f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.AnonymousClass14.a(java.lang.String):void");
        }

        public final boolean b(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f54232a, false, 57575, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f54232a, false, 57575, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else if (!com.ss.android.ugc.aweme.g.a.a()) {
                return false;
            } else {
                char c2 = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 2614219) {
                    if (hashCode == 2079338417 && str.equals("FOLLOW")) {
                        c2 = 1;
                    }
                } else if (str.equals("USER")) {
                    c2 = 0;
                }
                switch (c2) {
                    case 0:
                        h.a().a((Activity) MainPageFragment.this.getActivity(), "aweme://test_setting");
                        return true;
                    case 1:
                        com.ss.android.ugc.aweme.util.d.a((Activity) MainPageFragment.this.getActivity());
                        return true;
                    default:
                        return false;
                }
            }
        }
    };
    FragmentTabHost mTabHost;
    private List<NoticeCount> mThirdLevelShowList = new CopyOnWriteArrayList();
    @BindView(2131498470)
    VideoSeekBar mVideoSeekBar;
    @BindView(2131498471)
    LinearLayout mVideoSeekDuration;
    public boolean needShowNotification;
    private bn notificationCountView;
    private int previousShowCnt = 0;
    private View rootView;
    @BindView(2131493341)
    View tabDivider;
    @BindView(2131498575)
    View vwSettingShadow;

    interface a {
        void a(boolean z);
    }

    static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54254a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<Activity> f54255b;

        b(Activity activity) {
            this.f54255b = new WeakReference<>(activity);
        }

        public final void a(final boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54254a, false, 57577, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54254a, false, 57577, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            final Activity activity = (Activity) this.f54255b.get();
            if (activity != null) {
                activity.runOnUiThread(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f54256a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f54256a, false, 57578, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f54256a, false, 57578, new Class[0], Void.TYPE);
                            return;
                        }
                        HomeDialogManager homeDialogManager = new HomeDialogManager();
                        homeDialogManager.a(new com.ss.android.ugc.aweme.main.e.a());
                        homeDialogManager.a(new com.ss.android.ugc.aweme.main.e.c(activity, z));
                        homeDialogManager.a(new com.ss.android.ugc.aweme.main.e.b(z));
                        homeDialogManager.a(new com.ss.android.ugc.aweme.main.e.e());
                        homeDialogManager.a(new com.ss.android.ugc.aweme.main.e.d());
                        if (!com.ss.android.ugc.aweme.commercialize.utils.c.Q(AwemeChangeCallBack.a((FragmentActivity) activity))) {
                            Activity activity = activity;
                            if (PatchProxy.isSupport(new Object[]{activity}, homeDialogManager, HomeDialogManager.f54719a, false, 57978, new Class[]{Activity.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{activity}, homeDialogManager, HomeDialogManager.f54719a, false, 57978, new Class[]{Activity.class}, Void.TYPE);
                                return;
                            }
                            Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
                            if (!activity.isFinishing() && (activity instanceof MainActivity) && homeDialogManager.f54721c < homeDialogManager.f54720b.size()) {
                                List list = homeDialogManager.f54720b;
                                if (list.size() > 1) {
                                    CollectionsKt.sortWith(list, new HomeDialogManager.a());
                                }
                                int i = homeDialogManager.f54721c;
                                int size = homeDialogManager.f54720b.size();
                                while (true) {
                                    if (i >= size) {
                                        break;
                                    }
                                    homeDialogManager.f54721c++;
                                    if (homeDialogManager.f54720b.get(i).a(activity)) {
                                        try {
                                            Lifecycle lifecycle = ((MainActivity) activity).getLifecycle();
                                            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "activity.lifecycle");
                                            if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                                                homeDialogManager.f54720b.get(i).a(activity, new HomeDialogManager.b(activity));
                                            }
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54260a;

        /* renamed from: b  reason: collision with root package name */
        private a f54261b;

        public final void run() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f54260a, false, 57579, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54260a, false, 57579, new Class[0], Void.TYPE);
                return;
            }
            int i = 0;
            while (true) {
                if (i >= 3) {
                    break;
                }
                try {
                    z = com.ss.android.ugc.aweme.global.config.settings.g.b().bR().booleanValue();
                    break;
                } catch (com.bytedance.ies.a unused) {
                    SystemClock.sleep(1000);
                    i++;
                }
            }
            this.f54261b.a(z);
        }

        c(a aVar) {
            this.f54261b = aVar;
        }
    }

    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54262a;

        private d() {
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54262a, false, 57580, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54262a, false, 57580, new Class[0], Void.TYPE);
                return;
            }
            MobClick labelName = MobClick.obtain().setEventName("draft_count").setLabelName("mine");
            r.onEvent(labelName.setValue(((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().queryMyDraftCount()));
        }

        /* synthetic */ d(byte b2) {
            this();
        }
    }

    public String getPlayListId() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57536, new Class[0], String.class)) {
            return g.c();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57536, new Class[0], String.class);
    }

    public String getPlayListIdKey() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57535, new Class[0], String.class)) {
            return g.b();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57535, new Class[0], String.class);
    }

    public String getPlayListType() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57534, new Class[0], String.class)) {
            return g.a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57534, new Class[0], String.class);
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    private boolean hasNotificationPopShowed() {
        return this.hasNotifiPopShowed;
    }

    private boolean isHotSearchGuideShowing() {
        return bj.f54592c;
    }

    private boolean isMainFragmentStoryPanelShowing() {
        return bj.f54591b;
    }

    public Aweme getCurrentAweme() {
        return this.mCurrentAweme;
    }

    public String getLastUserId() {
        return this.mLastUserId;
    }

    @Nullable
    public View getSettingShadowView() {
        return this.vwSettingShadow;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$checkLiveLabelShowLimit$18$MainPageFragment() throws Exception {
        com.ss.android.ugc.aweme.aj.b.b().a((Context) k.a(), "live_label_time_records", (Object) this.liveShowRecord);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$checkLiveLabelShowLimit$19$MainPageFragment() throws Exception {
        com.ss.android.ugc.aweme.aj.b.b().a((Context) k.a(), "live_label_time_records", (Object) this.liveShowRecord);
        return null;
    }

    private void addFollowFeedTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57445, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57445, new Class[0], Void.TYPE);
        } else if (TimeLockRuler.isTeenModeON()) {
            this.mTabChangeManager.a(TeenagerFollowFragment.class, "FOLLOW", null);
        } else {
            this.mTabChangeManager.a(FriendTabFragment.class, "FOLLOW", null);
        }
    }

    private void addFullScreenFollowFeedTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57443, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57443, new Class[0], Void.TYPE);
        } else if (TimeLockRuler.isInTeenagerModeNewVersion()) {
            this.mTabChangeManager.a(TeenagerFollowFragment.class, "FOLLOW", null);
        } else {
            this.mTabChangeManager.a(FullScreenFollowFeedIn2TabFragment.class, "FOLLOW", null);
        }
    }

    private void addMessagesTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57446, new Class[0], Void.TYPE);
        } else if (TimeLockRuler.isTeenModeON()) {
            this.mTabChangeManager.a(TeenagerMessagesFragment.class, "NOTIFICATION", null);
        } else {
            this.mTabChangeManager.a(MessagesFragment.class, "NOTIFICATION", null);
        }
    }

    private void addNearByTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57444, new Class[0], Void.TYPE);
        } else if (TimeLockRuler.isTeenModeON()) {
            this.mTabChangeManager.a(TeenagerNearbyFragment.class, "NEARBY", null);
        } else {
            this.mTabChangeManager.a(MainPageNearByFragment.class, "NEARBY", null);
        }
    }

    private void addSecondTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57442, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57442, new Class[0], Void.TYPE);
        } else if (MainPageExperimentHelper.f() == 1) {
            addNearByTab();
        } else if (MainPageExperimentHelper.f() == 2) {
            addFullScreenFollowFeedTab();
        } else {
            addFollowFeedTab();
        }
    }

    private void dismissNotificationCountViewSafely() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57507, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57507, new Class[0], Void.TYPE);
            return;
        }
        if (this.notificationCountView != null) {
            try {
                this.notificationCountView.dismiss();
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private Bundle getFeedFollowBundle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57441, new Class[0], Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57441, new Class[0], Bundle.class);
        }
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 1);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_follow");
        return bundle;
    }

    private com.ss.android.ugc.aweme.main.base.tab.a getFollowAvatarTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57489, new Class[0], com.ss.android.ugc.aweme.main.base.tab.a.class)) {
            return (com.ss.android.ugc.aweme.main.base.tab.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57489, new Class[0], com.ss.android.ugc.aweme.main.base.tab.a.class);
        }
        com.ss.android.ugc.aweme.main.base.b c2 = this.mMainBottomTabView.c("FOLLOW");
        if (c2 instanceof com.ss.android.ugc.aweme.main.base.tab.a) {
            return (com.ss.android.ugc.aweme.main.base.tab.a) c2;
        }
        return null;
    }

    private Intent getIntent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57427, new Class[0], Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57427, new Class[0], Intent.class);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.getIntent();
        }
        return null;
    }

    private FragmentManager getSupportFragmentManager() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57517, new Class[0], FragmentManager.class)) {
            return getChildFragmentManager();
        }
        return (FragmentManager) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57517, new Class[0], FragmentManager.class);
    }

    private void goToFollowInMainTabByPush() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57462, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57462, new Class[0], Void.TYPE);
            return;
        }
        this.mTabChangeManager.a("HOME");
        setTabBackground(false);
        MainFragment mainFragment = (MainFragment) this.mTabChangeManager.a();
        if (mainFragment != null) {
            mainFragment.b(0);
        }
    }

    private void hideFollowAvatar() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57484, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57484, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mMainBottomTabView.a(false, "FOLLOW", null);
            this.mIsFollowAvatarShowing = false;
            this.mInsertAwemeId = null;
        }
    }

    private void hidePublishView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57457, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.main.f.a.b(getActivity());
    }

    public static MainPageFragment newInstance() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 57401, new Class[0], MainPageFragment.class)) {
            return (MainPageFragment) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 57401, new Class[0], MainPageFragment.class);
        }
        Bundle bundle = new Bundle();
        MainPageFragment mainPageFragment = new MainPageFragment();
        mainPageFragment.setArguments(bundle);
        return mainPageFragment;
    }

    private void reportDraftCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57453, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57453, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new d((byte) 0));
    }

    private void showProfileDot() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57474, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57474, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mMainBottomTabView.a(true, "USER");
        }
    }

    private void toSecondTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57465, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57465, new Class[0], Void.TYPE);
            return;
        }
        handleMainPageStop();
        this.mTabChangeManager.a(bz.f54668a);
    }

    private void tryShowFissionPopupWindow() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57437, new Class[0], Void.TYPE);
            return;
        }
        this.rootView.postDelayed(new as(this), 4000);
    }

    public void dismissNotification() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57506, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57506, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            dismissNotificationCountViewSafely();
        }
    }

    public Context getApplicationContext() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57452, new Class[0], Context.class)) {
            return k.a();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57452, new Class[0], Context.class);
    }

    public Fragment getCurFragment() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57512, new Class[0], Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57512, new Class[0], Fragment.class);
        } else if (this.mTabChangeManager == null) {
            return null;
        } else {
            return this.mTabChangeManager.a();
        }
    }

    public void hideNotificationDotWithOutClear() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57473, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.isShowNotificationDot = false;
            this.mMainBottomTabView.a(false, "NOTIFICATION");
        }
    }

    public void hideProfileDot() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57475, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57475, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mMainBottomTabView.a(false, "USER");
        }
    }

    public void hideSomeMainPageView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57448, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57448, new Class[0], Void.TYPE);
            return;
        }
        if (this.bubbleGuideHelper != null) {
            this.mBubbleGuidePending = false;
            this.bubbleGuideHelper.b();
        }
    }

    public boolean isFeedPage() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57504, new Class[0], Boolean.TYPE)) {
            return getUserVisibleHint();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57504, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isMyProfileTabCurrent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57458, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57458, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mTabChangeManager == null) {
            return false;
        } else {
            return this.mTabChangeManager.a() instanceof MyProfileFragment;
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57438, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.mScrollToProfileGuideHelper != null) {
            this.mScrollToProfileGuideHelper.b();
        }
    }

    public void refreshPushFollow() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57414, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54226a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f54226a, false, 57571, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f54226a, false, 57571, new Class[0], Void.TYPE);
                    return;
                }
                Fragment a2 = MainPageFragment.this.mTabChangeManager.a();
                if (a2 instanceof FriendTabFragment) {
                    ((FriendTabFragment) a2).g();
                    return;
                }
                if (a2 instanceof FullScreenFollowFeedIn2TabFragment) {
                    FullScreenFollowFeedIn2TabFragment fullScreenFollowFeedIn2TabFragment = (FullScreenFollowFeedIn2TabFragment) a2;
                    if (PatchProxy.isSupport(new Object[0], fullScreenFollowFeedIn2TabFragment, FullScreenFollowFeedIn2TabFragment.f3660a, false, 61636, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], fullScreenFollowFeedIn2TabFragment, FullScreenFollowFeedIn2TabFragment.f3660a, false, 61636, new Class[0], Void.TYPE);
                    } else if (fullScreenFollowFeedIn2TabFragment.a((Integer) 6)) {
                        FragmentActivity activity = fullScreenFollowFeedIn2TabFragment.getActivity();
                        if (activity != null) {
                            FollowFeedTriggerViewModel.a aVar = FollowFeedTriggerViewModel.f47719c;
                            Intrinsics.checkExpressionValueIsNotNull(activity, "this");
                            aVar.a(activity).a((Integer) 6);
                        }
                    }
                }
            }
        });
    }

    public void tryDismissFissionPopupWindow() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57436, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57436, new Class[0], Void.TYPE);
            return;
        }
        if (this.mBubbleManager != null) {
            this.mBubbleManager.a();
        }
    }

    public void tryHideLiveBroadcastWarn() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57406, new Class[0], Void.TYPE);
            return;
        }
        if (this.liveBroadcastWarn != null) {
            this.liveBroadcastWarn.b(null);
        }
    }

    public void tryShowPublishView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57451, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57451, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.main.f.a.a(getActivity());
    }

    private void addTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57439, new Class[0], Void.TYPE);
            return;
        }
        this.mTabChangeManager.a(MainFragment.class, "HOME", getMainFragmentBundle());
        addSecondTab();
        addMessagesTab();
        addProfileTab(null);
        TabClickCallBack.a(getActivity(), this, this.mTabClickListener);
        this.mTabHost.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54230a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f54230a, false, 57573, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f54230a, false, 57573, new Class[0], Void.TYPE);
                    return;
                }
                if (MainPageFragment.this.isViewValid()) {
                    ((MainActivity) MainPageFragment.this.getActivity()).refreshSlideSwitchCanScrollRight();
                }
            }
        });
    }

    private void exitDislikeMode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57420, new Class[0], Void.TYPE);
            return;
        }
        an.a(this.mAutoPlayTab, this.mAutoPlayTab.getAlpha(), 1.0f);
        an.a(this.mMainBottomTabView, this.mMainBottomTabView.getAlpha(), 1.0f);
        an.a(this.tabDivider, this.tabDivider.getAlpha(), 1.0f);
    }

    private void exitGuideView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57497, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57497, new Class[0], Void.TYPE);
            return;
        }
        bm bmVar = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(getActivity(), bm.class);
        if (this.mSwipeUpGuideShowing) {
            this.mMainBottomTabView.a(true);
            this.mSafeMainTabPreferences.c(false);
            this.mGuideView.setVisibility(8);
            handleMainPageResume();
        }
        if (this.mLongClickGuideShowing) {
            this.mMainBottomTabView.a(true);
            if (bmVar != null) {
                bmVar.s(false);
            }
            this.mGuideView.setVisibility(8);
            handleMainPageResume();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.os.Bundle getMainFragmentBundle() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<android.os.Bundle> r7 = android.os.Bundle.class
            r4 = 0
            r5 = 57440(0xe060, float:8.049E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 57440(0xe060, float:8.049E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.os.Bundle> r8 = android.os.Bundle.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
        L_0x0028:
            android.content.Intent r1 = r9.getIntent()
            r2 = -1
            if (r1 == 0) goto L_0x0054
            java.lang.String r3 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"
            java.lang.String r3 = r1.getStringExtra(r3)
            boolean r3 = shouldGoToFollowInMainTabByPush(r3)
            if (r3 == 0) goto L_0x003c
            goto L_0x0055
        L_0x003c:
            java.lang.String r0 = "tab"
            java.lang.String r0 = r1.getStringExtra(r0)
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x004f
            java.lang.String r0 = "tab"
            int r0 = r1.getIntExtra(r0, r2)
            goto L_0x0055
        L_0x004f:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x0054 }
            goto L_0x0055
        L_0x0054:
            r0 = -1
        L_0x0055:
            if (r0 >= 0) goto L_0x0059
            r0 = 0
            return r0
        L_0x0059:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "tab"
            r1.putInt(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.getMainFragmentBundle():android.os.Bundle");
    }

    private void handleMainPageStop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57510, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57510, new Class[0], Void.TYPE);
            return;
        }
        Fragment a2 = this.mTabChangeManager.a();
        if (a2 == null || !(a2 instanceof MainFragment)) {
            if (a2 instanceof FullScreenFollowFeedIn2TabFragment) {
                ((FullScreenFollowFeedIn2TabFragment) a2).c(false);
            }
            return;
        }
        ((MainFragment) a2).d(true);
    }

    private void hideFollowDot() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57481, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57481, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (!MainPageExperimentHelper.n()) {
                this.mMainBottomTabView.a(false, "FOLLOW");
                this.mIsFollowDotShowing = false;
            } else if (this.mDataCenter != null) {
                this.mDataCenter.a("FOLLOW_NOTICE_AT_MAIN_TAB_STRIP", (Object) new int[]{1, 0});
            }
        }
    }

    private void hideFollowLiveLabel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57486, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57486, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (!MainPageExperimentHelper.n()) {
                this.mMainBottomTabView.b(false, "FOLLOW");
                this.mIsFollowLiveLabelShowing = false;
            } else if (this.mDataCenter != null) {
                this.mDataCenter.a("FOLLOW_NOTICE_AT_MAIN_TAB_STRIP", (Object) new int[]{3, 0});
            }
        }
    }

    private void initBubbleGuideHelper() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57518, new Class[0], Void.TYPE);
            return;
        }
        this.bubbleGuideHelper = new com.ss.android.ugc.aweme.main.a.b(this.bubbleGuideHolder);
        com.ss.android.ugc.aweme.port.a<Boolean> bubbleGuideShown = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().bubbleGuideShown();
        if (com.ss.android.ugc.aweme.account.d.a().isLogin() && com.ss.android.ugc.aweme.account.d.a().getCurUser().isShowImageBubble() && !((Boolean) bubbleGuideShown.get()).booleanValue()) {
            if (this.mAwesomeSplashShowing) {
                this.mBubbleGuidePending = true;
            } else {
                this.bubbleGuideHelper.a();
            }
            bubbleGuideShown.set(Boolean.TRUE);
        }
    }

    private void initTabs() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57417, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, bl.f54598a, true, 57585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, bl.f54598a, true, 57585, new Class[0], Void.TYPE);
        } else {
            bl.f54599b.clear();
        }
        TabChangeManager a2 = TabChangeManager.a(getActivity());
        FragmentTabHost fragmentTabHost = this.mTabHost;
        a2.f54420f = true;
        a2.f54416b = fragmentTabHost;
        a2.g = getSupportFragmentManager();
        this.mTabChangeManager = a2.a((com.ss.android.ugc.aweme.main.base.a) this);
        addTab();
    }

    private void logFirstMessageNoticeShow() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57455, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57455, new Class[0], Void.TYPE);
            return;
        }
        int b2 = com.ss.android.ugc.aweme.message.c.c.a().b();
        if (b2 > this.previousShowCnt) {
            this.hasLogged = false;
        }
        if (!this.hasLogged) {
            if (b2 > 0 || com.ss.android.ugc.aweme.message.c.c.a().d()) {
                HashMap hashMap = new HashMap();
                if (b2 > 0) {
                    hashMap.put("notice_type", "number_dot");
                    hashMap.put("show_cnt", String.valueOf(b2));
                    hashMap.put("previous_show_cnt", String.valueOf(this.previousShowCnt));
                } else {
                    hashMap.put("notice_type", "yellow_dot");
                }
                r.a("message_notice_show", (Map) hashMap);
                this.hasLogged = true;
                this.previousShowCnt = b2;
            }
        }
    }

    private boolean shouldRecordWithSticker() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57467, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57467, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (((CurChosenFeedListType) ViewModelProviders.of(getActivity()).get(CurChosenFeedListType.class)).f54127a == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.mCurrentAweme == null || !this.mCurrentAweme.hasStickerID() || !"HOME".equals(this.mTabChangeManager.f54419e) || !z) {
            return false;
        }
        return true;
    }

    private boolean shouldStartAtFollowTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57415, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57415, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.account.d.a().isLogin() && this.mTabChangeManager != null && MainPageExperimentHelper.h() && !"FOLLOW".equals(this.mTabChangeManager.f54419e) && AbTestManager.a().G().intValue() == 2 && AbTestManager.a().I() && SharePrefCache.inst().isFollowFeedAsDefault()) {
            return true;
        } else {
            return false;
        }
    }

    private void showFollowDot() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57480, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57480, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (!MainPageExperimentHelper.n()) {
                this.mMainBottomTabView.a(true, "FOLLOW");
                this.mIsFollowDotShowing = true;
                logFollowTabNotice("yellow_dot");
            } else if (this.mDataCenter != null) {
                this.mDataCenter.a("FOLLOW_NOTICE_AT_MAIN_TAB_STRIP", (Object) new int[]{1, 1});
            }
        }
    }

    private void showScrollToProfileAnimation() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57499, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57499, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.mScrollToProfileGuideHelper == null) {
            this.mScrollToProfileGuideHelper = new g((ViewStub) getActivity().findViewById(C0906R.id.cx3));
            this.mScrollToProfileGuideHelper.h = new g.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54242a;

                public final void a() {
                    MainPageFragment.this.mIsScrollToProflieGuideShowing = true;
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f54242a, false, 57564, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f54242a, false, 57564, new Class[0], Void.TYPE);
                        return;
                    }
                    if (MainPageFragment.this.mMainBottomTabView != null) {
                        MainPageFragment.this.mMainBottomTabView.a(true);
                    }
                    MainPageFragment.this.handleMainPageResume();
                }
            };
            this.mScrollToProfileGuideHelper.a();
            this.mMainBottomTabView.a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void changeTabToFollowAfterPublish() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57464, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57464, new Class[0], Void.TYPE);
            return;
        }
        boolean z = true;
        if (!(MainPageExperimentHelper.n() || AbTestManager.a().G().intValue() == 0 || AbTestManager.a().G().intValue() == 1)) {
            z = false;
        }
        if (z) {
            goToFollowInMainTabByPush();
            return;
        }
        toSecondTab();
        if (!MainPageExperimentHelper.d()) {
            com.ss.android.ugc.aweme.base.livedata.a.a().a("change_tab_event", Integer.class).setValue(0);
        }
    }

    public IFeedViewHolder getCurrentViewHolder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57419, new Class[0], IFeedViewHolder.class)) {
            return (IFeedViewHolder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57419, new Class[0], IFeedViewHolder.class);
        }
        Fragment curFragment = getCurFragment();
        if (curFragment instanceof MainFragment) {
            FeedFragment a2 = ((MainFragment) curFragment).a();
            if (a2 instanceof FeedRecommendFragment) {
                return ((FeedRecommendFragment) a2).j();
            }
        }
        return null;
    }

    public void handleMainPageResume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57509, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57509, new Class[0], Void.TYPE);
            return;
        }
        Fragment a2 = this.mTabChangeManager.a();
        if (a2 == null || !(a2 instanceof MainFragment)) {
            if (a2 instanceof FullScreenFollowFeedIn2TabFragment) {
                ((FullScreenFollowFeedIn2TabFragment) a2).a(false);
            }
            return;
        }
        ((MainFragment) a2).c(true);
    }

    public void hideNotificationDot() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57472, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mMainBottomTabView.a(false, "NOTIFICATION");
            if (!TimeLockRuler.isTeenModeON() && com.ss.android.ugc.aweme.message.c.c.a().d(0)) {
                com.ss.android.ugc.aweme.message.c.c.a().a(0);
            }
        }
    }

    public void initView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57428, new Class[0], Void.TYPE);
            return;
        }
        this.mMainBottomTabView.setMode(com.ss.android.ugc.aweme.main.base.g.MODE_TEXT);
        TabAlphaController a2 = TabAlphaController.a();
        MainBottomTabView mainBottomTabView = this.mMainBottomTabView;
        if (mainBottomTabView != null) {
            a2.f3535b = mainBottomTabView;
        }
        getLifecycle().addObserver(TabAlphaController.a());
        if (getContext() instanceof MainActivity) {
            this.mDisLikeAwemeLayout = (DisLikeAwemeLayout) ((MainActivity) getContext()).findViewById(C0906R.id.a5m);
        }
        this.mTabHost.setup(getActivity(), getSupportFragmentManager(), C0906R.id.cyo);
        this.mTabHost.getTabWidget().setVisibility(8);
        this.mTabHost.setOnTabSwitchListener(new FragmentTabHost.OnTabSwitchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54228a;

            public final void onTabSwitched(String str, Fragment fragment, Fragment fragment2) {
                Fragment fragment3 = fragment;
                Fragment fragment4 = fragment2;
                if (PatchProxy.isSupport(new Object[]{str, fragment3, fragment4}, this, f54228a, false, 57572, new Class[]{String.class, Fragment.class, Fragment.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, fragment3, fragment4}, this, f54228a, false, 57572, new Class[]{String.class, Fragment.class, Fragment.class}, Void.TYPE);
                    return;
                }
                MainPageFragment.this.rememberTabBeforeExit(fragment3);
                if ((fragment4 instanceof FriendTabFragment) || (fragment4 instanceof MyProfileFragment) || (fragment4 instanceof MainPageNearByFragment) || (fragment4 instanceof FullScreenFollowFeedIn2TabFragment)) {
                    fragment4.setUserVisibleHint(false);
                }
                if (fragment4 instanceof MainPageNearByFragment) {
                    ((MainPageNearByFragment) fragment4).c(false);
                }
                if (fragment3 instanceof MainPageNearByFragment) {
                    ((MainPageNearByFragment) fragment3).a(false);
                }
                if (fragment4 instanceof FullScreenFollowFeedIn2TabFragment) {
                    ((FullScreenFollowFeedIn2TabFragment) fragment4).c(false);
                }
                if (fragment3 instanceof FullScreenFollowFeedIn2TabFragment) {
                    ((FullScreenFollowFeedIn2TabFragment) fragment3).a(false);
                }
                if ((fragment3 instanceof MyProfileFragment) && ((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().c()).booleanValue()) {
                    MainPageFragment.this.hideProfileDot();
                    Context context = MainPageFragment.this.getContext();
                    if (PatchProxy.isSupport(new Object[]{context}, null, ActivityLinkManager.f61301a, true, 67427, new Class[]{Context.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context}, null, ActivityLinkManager.f61301a, true, 67427, new Class[]{Context.class}, Void.TYPE);
                        return;
                    }
                    bm bmVar = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(context, bm.class);
                    if (bmVar != null) {
                        bmVar.f("true");
                    }
                }
            }
        });
    }

    public void logMessageTabClick() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57454, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57454, new Class[0], Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        int b2 = com.ss.android.ugc.aweme.message.c.c.a().b();
        if (b2 > 0) {
            hashMap.put("notice_type", "number_dot");
            hashMap.put("show_cnt", String.valueOf(b2));
        } else if (com.ss.android.ugc.aweme.message.c.c.a().d()) {
            hashMap.put("notice_type", "yellow_dot");
        }
        r.a("enter_homepage_message", (Map) hashMap);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57430, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        displayProfileDot();
        if (com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            if (!com.ss.android.ugc.aweme.message.c.c.a().d()) {
                hideNotificationDot();
            } else if (this.isShowNotificationDot) {
                showNotificationDot();
            }
        }
    }

    public void showNotificationDot() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57471, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57471, new Class[0], Void.TYPE);
        } else if (!isViewValid() || TimeLockRuler.isTeenModeON()) {
        } else {
            if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                hideNotificationDot();
            } else if (com.ss.android.ugc.aweme.message.c.c.a().b() > 0) {
                hideNotificationDot();
            } else if (!TextUtils.equals("NOTIFICATION", this.mTabChangeManager.f54419e)) {
                logFirstMessageNoticeShow();
                this.mMainBottomTabView.a(true, "NOTIFICATION");
            }
        }
    }

    public void stopMainPageCalTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57511, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57511, new Class[0], Void.TYPE);
            return;
        }
        Fragment a2 = this.mTabChangeManager.a();
        if (a2 != null && (a2 instanceof MainFragment)) {
            MainFragment mainFragment = (MainFragment) a2;
            if (PatchProxy.isSupport(new Object[0], mainFragment, MainFragment.f3515a, false, 57292, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mainFragment, MainFragment.f3515a, false, 57292, new Class[0], Void.TYPE);
            } else {
                if (mainFragment.f3518d != null) {
                    FeedFragment feedFragment = (FeedFragment) mainFragment.f3518d.a();
                    if (feedFragment != null) {
                        feedFragment.L_();
                    }
                }
            }
        } else if (a2 instanceof FullScreenFollowFeedIn2TabFragment) {
            ((FullScreenFollowFeedIn2TabFragment) a2).L_();
        }
    }

    public void toNotifyPage() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57456, new Class[0], Void.TYPE);
            return;
        }
        if (!"NOTIFICATION".equals(this.mTabChangeManager.f54419e)) {
            handleMainPageStop();
            this.mTabChangeManager.a("NOTIFICATION");
            if (!o.v()) {
                o.b().h();
            } else {
                IFeedViewHolder currentViewHolder = getCurrentViewHolder();
                if (!(currentViewHolder == null || currentViewHolder.m() == null)) {
                    currentViewHolder.m().T();
                }
            }
            hidePublishView();
            setTabBackground(true);
            setInVideoPlayMode(false);
        }
        hideNotificationDotWithOutClear();
    }

    public boolean tryShowGuideView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57494, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57494, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (AbTestManager.a().v() != 0) {
            return false;
        } else {
            if (tryShowScrollToProfileView() || tryShowVideoGuideView()) {
                return true;
            }
            return false;
        }
    }

    private void displayProfileDot() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57431, new Class[0], Void.TYPE);
        } else if (((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().c()).booleanValue()) {
            Context context = getContext();
            if (PatchProxy.isSupport(new Object[]{context}, null, ActivityLinkManager.f61301a, true, 67425, new Class[]{Context.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, ActivityLinkManager.f61301a, true, 67425, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else {
                bm bmVar = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(context, bm.class);
                if (bmVar != null) {
                    z = TextUtils.equals(bmVar.e(""), "true");
                }
            }
            if (!z) {
                showProfileDot();
            } else {
                hideProfileDot();
            }
        } else {
            hideProfileDot();
        }
    }

    private void doAdaptation4MainBottomTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57403, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            com.ss.android.ugc.aweme.profile.a a2 = com.ss.android.ugc.aweme.profile.a.a();
            MainBottomTabView mainBottomTabView = this.mMainBottomTabView;
            View view = this.tabDivider;
            VideoSeekBar videoSeekBar = this.mVideoSeekBar;
            if (PatchProxy.isSupport(new Object[]{mainBottomTabView, view, videoSeekBar}, a2, com.ss.android.ugc.aweme.profile.a.f61215a, false, 67226, new Class[]{View.class, View.class, View.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.profile.a aVar = a2;
                PatchProxy.accessDispatch(new Object[]{mainBottomTabView, view, videoSeekBar}, aVar, com.ss.android.ugc.aweme.profile.a.f61215a, false, 67226, new Class[]{View.class, View.class, View.class}, Void.TYPE);
            } else if (com.ss.android.ugc.aweme.profile.a.d() && mainBottomTabView != null && view != null && videoSeekBar != null) {
                com.ss.android.b.a.a.a.b(new com.ss.android.ugc.aweme.profile.e(view, mainBottomTabView, videoSeekBar));
            }
        }
    }

    private void initDataCenter() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57416, new Class[0], Void.TYPE);
            return;
        }
        this.mDataCenter = DataCenter.a(ViewModelProviders.of(getActivity()), (LifecycleOwner) this);
        this.mDataCenter.a("ENTER_DISLIKE_MODE", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new al<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("handlePageResume", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new am<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("setInVideoPlayMode", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new ax<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("tryShowGuideView", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new bc<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("playHomeAddBtnAnim", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new bd<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("setTabBackground", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new be<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("changeTabToFollowAfterPublish", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new bf<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("onNewIntent", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new bg<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("tryShowLongClickGuideView", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new bh<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("exitMaskLayer", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new bi<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("changeAutoPlayTabVisibility", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new an<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("hideAutoPlayTab", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new ao<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("hideNotificationCountView", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new ap<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("exitGuideView", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new aq<com.ss.android.ugc.aweme.arch.widgets.base.a>(this));
    }

    private void showFollowLiveLabel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57485, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57485, new Class[0], Void.TYPE);
        } else if (isViewValid() && com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            if (!MainPageExperimentHelper.n()) {
                this.mMainBottomTabView.b(true, "FOLLOW");
                this.mIsFollowLiveLabelShowing = true;
                logFollowTabNotice("live");
            } else if (this.mDataCenter != null) {
                this.mDataCenter.a("FOLLOW_NOTICE_AT_MAIN_TAB_STRIP", (Object) new int[]{3, 1});
            }
            long d2 = com.ss.android.ugc.aweme.aj.b.b().d(k.a(), "display_duration");
            if (d2 > 0) {
                i.a(d2 * 1000).a((a.g<TResult, TContinuationResult>) new au<TResult,TContinuationResult>(this), i.f1052b);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r2.equals("HOME") != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getEnterFrom() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 57529(0xe0b9, float:8.0615E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 57529(0xe0b9, float:8.0615E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.main.base.TabChangeManager r2 = r9.mTabChangeManager
            java.lang.String r2 = r2.f54419e
            if (r2 == 0) goto L_0x00af
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -1996153217: goto L_0x0060;
                case -1382453013: goto L_0x0056;
                case 2223327: goto L_0x004d;
                case 2614219: goto L_0x0043;
                case 2079338417: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x006a
        L_0x0039:
            java.lang.String r0 = "FOLLOW"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006a
            r0 = 1
            goto L_0x006b
        L_0x0043:
            java.lang.String r0 = "USER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006a
            r0 = 4
            goto L_0x006b
        L_0x004d:
            java.lang.String r4 = "HOME"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x006a
            goto L_0x006b
        L_0x0056:
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006a
            r0 = 3
            goto L_0x006b
        L_0x0060:
            java.lang.String r0 = "NEARBY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006a
            r0 = 2
            goto L_0x006b
        L_0x006a:
            r0 = -1
        L_0x006b:
            switch(r0) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0078;
                case 2: goto L_0x0075;
                case 3: goto L_0x0072;
                case 4: goto L_0x006f;
                default: goto L_0x006e;
            }
        L_0x006e:
            goto L_0x00af
        L_0x006f:
            java.lang.String r1 = "personal_homepage"
            goto L_0x00af
        L_0x0072:
            java.lang.String r1 = "message"
            goto L_0x00af
        L_0x0075:
            java.lang.String r1 = "homepage_nearby"
            goto L_0x00af
        L_0x0078:
            com.ss.android.ugc.aweme.main.base.TabChangeManager r0 = r9.mTabChangeManager
            android.support.v4.app.Fragment r0 = r0.a()
            boolean r2 = r0 instanceof com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment
            if (r2 == 0) goto L_0x0091
            com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment r0 = (com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment) r0
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = "homepage_friends"
        L_0x008c:
            r1 = r0
            goto L_0x00af
        L_0x008e:
            java.lang.String r0 = "homepage_follow"
            goto L_0x008c
        L_0x0091:
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment
            if (r0 == 0) goto L_0x00af
            java.lang.String r1 = "homepage_follow"
            goto L_0x00af
        L_0x0098:
            com.ss.android.ugc.aweme.main.base.TabChangeManager r0 = r9.mTabChangeManager
            android.support.v4.app.Fragment r0 = r0.a()
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.main.MainFragment
            if (r1 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.main.MainFragment r0 = (com.ss.android.ugc.aweme.main.MainFragment) r0
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x00ad
            java.lang.String r1 = "homepage_follow"
            goto L_0x00af
        L_0x00ad:
            java.lang.String r1 = "homepage_hot"
        L_0x00af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.getEnterFrom():java.lang.String");
    }

    @Nullable
    public AwemeListFragment getProfileAwemeFragment() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57459, new Class[0], AwemeListFragment.class)) {
            return (AwemeListFragment) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57459, new Class[0], AwemeListFragment.class);
        } else if (this.mTabChangeManager == null) {
            return null;
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager == null) {
                return null;
            }
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("USER");
            if (!(findFragmentByTag instanceof MyProfileFragment)) {
                return null;
            }
            MyProfileFragment myProfileFragment = (MyProfileFragment) findFragmentByTag;
            if (PatchProxy.isSupport(new Object[0], myProfileFragment, MyProfileFragment.M, false, 68556, new Class[0], AwemeListFragment.class)) {
                return (AwemeListFragment) PatchProxy.accessDispatch(new Object[0], myProfileFragment, MyProfileFragment.M, false, 68556, new Class[0], AwemeListFragment.class);
            } else if (CollectionUtils.isEmpty(myProfileFragment.v) || !(myProfileFragment.v.get(0) instanceof AwemeListFragment)) {
                return null;
            } else {
                return (AwemeListFragment) myProfileFragment.v.get(0);
            }
        }
    }

    public void hideAutoPlayTab() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57433, new Class[0], Void.TYPE);
            return;
        }
        if (AwemeAppData.p().ap) {
            com.ss.android.ugc.aweme.app.d.d dVar = new com.ss.android.ugc.aweme.app.d.d();
            if (this.mCurrentAweme == null) {
                str = "";
            } else {
                str = this.mCurrentAweme.getAid();
            }
            com.ss.android.ugc.aweme.app.d.d a2 = dVar.a("group_id", str).a("enter_from", this.mEventType).a("enter_method", "others");
            if (this.mCurrentAweme == null || this.mCurrentAweme.getAuthor() == null) {
                str2 = "";
            } else {
                str2 = this.mCurrentAweme.getAuthor().getUid();
            }
            r.a("exit_auto_play", (Map) a2.a("author_id", str2).a("log_pb", ai.a().a(aa.c(this.mCurrentAweme))).f34114b);
        }
        this.mMainBottomTabView.setTranslationY(0.0f);
        this.mAutoPlayTab.setTranslationY((float) u.a((double) (getResources().getDimension(C0906R.dimen.lw) + 2.0f)));
        this.mAutoPlayTab.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onSettingSyncDone$14$MainPageFragment() {
        Context context = com.ss.android.ugc.aweme.app.i.a().getContext();
        displayProfileDot();
        if (PatchProxy.isSupport(new Object[]{context}, null, ActivityLinkManager.f61301a, true, 67428, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, ActivityLinkManager.f61301a, true, 67428, new Class[]{Context.class}, Void.TYPE);
        } else if (!((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().c()).booleanValue()) {
            bm bmVar = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(context, bm.class);
            if (bmVar != null) {
                bmVar.b("");
                bmVar.f("");
                bmVar.d("");
                bmVar.y(false);
            }
            com.ss.android.ugc.aweme.main.guide.a a2 = com.ss.android.ugc.aweme.main.guide.a.h.a();
            if (PatchProxy.isSupport(new Object[]{context}, a2, com.ss.android.ugc.aweme.main.guide.a.f54799a, false, 58052, new Class[]{Context.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.main.guide.a aVar = a2;
                PatchProxy.accessDispatch(new Object[]{context}, aVar, com.ss.android.ugc.aweme.main.guide.a.f54799a, false, 58052, new Class[]{Context.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(context, "context");
                a2.a(context).edit().putBoolean(com.ss.android.ugc.aweme.main.guide.a.g, false).apply();
            }
        }
        tryShowFissionPopupWindow();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57429, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.notificationCountView != null && this.notificationCountView.isShowing()) {
            this.notificationCountView.a();
        }
        if (this.bubbleGuideHelper != null) {
            this.mBubbleGuidePending = false;
            this.bubbleGuideHelper.b();
        }
        if (this.mFollowingAwemeCountPresenter != null) {
            this.mFollowingAwemeCountPresenter.k();
        }
        TabChangeManager tabChangeManager = this.mTabChangeManager;
        tabChangeManager.f54416b = null;
        tabChangeManager.f54420f = false;
        tabChangeManager.g = null;
        if (this.mMainTabVideoSeekBarControl != null) {
            com.ss.android.ugc.aweme.feed.ui.seekbar.a.c cVar = this.mMainTabVideoSeekBarControl;
            if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.feed.ui.seekbar.a.c.f3217a, false, 43538, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.feed.ui.seekbar.a.c.f3217a, false, 43538, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.utils.bg.d(cVar);
                cVar.k = null;
            }
        }
        if (this.liveBroadcastWarn != null) {
            getViewLifecycleOwner().getLifecycle().removeObserver(this.liveBroadcastWarn);
        }
    }

    public void playHomeAddBtnAnim() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57516, new Class[0], Void.TYPE);
            return;
        }
        if (this.mMainBottomTabView != null) {
            MainBottomTabView mainBottomTabView = this.mMainBottomTabView;
            if (PatchProxy.isSupport(new Object[0], mainBottomTabView, MainBottomTabView.f3526a, false, 57766, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mainBottomTabView, MainBottomTabView.f3526a, false, 57766, new Class[0], Void.TYPE);
            } else if (mainBottomTabView.f3528c != null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setInterpolator(new au(0.66f, 0.0f, 0.34f, 1.0f));
                valueAnimator.setDuration(200);
                valueAnimator.setFloatValues(new float[]{1.0f, 0.0f});
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f54404a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54404a, false, 57775, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54404a, false, 57775, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                        if (animatedFraction < 0.5f) {
                            float f2 = (animatedFraction * 0.2f * 2.0f) + 1.0f;
                            MainBottomTabView.this.f3528c.setScaleX(f2);
                            MainBottomTabView.this.f3528c.setScaleY(f2);
                            return;
                        }
                        float f3 = 1.2f - (((animatedFraction - 0.5f) * 0.2f) * 2.0f);
                        MainBottomTabView.this.f3528c.setScaleX(f3);
                        MainBottomTabView.this.f3528c.setScaleY(f3);
                    }
                });
                valueAnimator.start();
            }
        }
    }

    public void tryShowLiveBubble() {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57407, new Class[0], Void.TYPE);
            return;
        }
        if (this.mTabChangeManager.a() instanceof MainFragment) {
            if (this.isShowNotifyPop || !com.ss.android.ugc.aweme.account.d.a().isLogin() || this.mSwipeUpGuideShowing || this.mLongClickGuideShowing || this.mIsScrollToProflieGuideShowing) {
                z = false;
            } else {
                z = true;
            }
            if ((!ab.a(getActivity().getIntent()) || TextUtils.isEmpty(com.ss.android.ugc.aweme.commercialize.splash.a.a().g)) && !com.ss.android.ugc.aweme.commercialize.utils.c.t(this.mCurrentAweme)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z && !z2 && this.liveBroadcastWarn != null) {
                LiveBroadcastWarn liveBroadcastWarn2 = this.liveBroadcastWarn;
                if (PatchProxy.isSupport(new Object[0], liveBroadcastWarn2, LiveBroadcastWarn.f3552a, false, 58001, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], liveBroadcastWarn2, LiveBroadcastWarn.f3552a, false, 58001, new Class[0], Void.TYPE);
                } else if (!liveBroadcastWarn2.f3556d && !LiveBroadcastWarn.f3553e) {
                    liveBroadcastWarn2.f3556d = true;
                    i.a(liveBroadcastWarn2.f3555c).a((a.g<TResult, TContinuationResult>) new com.ss.android.ugc.aweme.main.follow.b<TResult,TContinuationResult>(liveBroadcastWarn2), i.f1052b);
                }
            }
        }
    }

    public boolean tryShowLongClickGuideView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57496, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57496, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TimeLockRuler.isTeenModeON() || isMainFragmentStoryPanelShowing() || this.mCurrentAweme == null || this.mCurrentAweme.isAd()) {
            return false;
        } else {
            final bm bmVar = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(getContext(), bm.class);
            if (bmVar == null || this.mSafeMainTabPreferences.b(true) || !bmVar.i(false) || !bmVar.k(false) || isHotSearchGuideShowing() || this.mIsScrollToProflieGuideShowing || !bmVar.r(true) || this.mGuideShown || com.ss.android.ugc.aweme.main.guide.e.f54822b) {
                this.mMainBottomTabView.a(true);
                return false;
            }
            this.mGuideShown = true;
            this.mLongClickGuideShowing = true;
            this.mMainBottomTabView.a(false);
            this.mGuideView = LayoutInflater.from(getContext()).inflate(C0906R.layout.m3, null);
            ((ViewGroup) this.rootView.findViewById(C0906R.id.bl1)).addView(this.mGuideView, new ViewGroup.LayoutParams(-1, -1));
            AnimationImageView animationImageView = (AnimationImageView) this.mGuideView.findViewById(C0906R.id.ama);
            animationImageView.loop(true);
            animationImageView.setAnimation("home_longpress_guide.json");
            animationImageView.playAnimation();
            this.mGuideView.setOnLongClickListener(new View.OnLongClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54236a;

                public final boolean onLongClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54236a, false, 57562, new Class[]{View.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f54236a, false, 57562, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                    }
                    MainPageFragment.this.mLongClickGuideShowing = false;
                    MainPageFragment.this.mMainBottomTabView.a(true);
                    bmVar.s(false);
                    com.ss.android.ugc.aweme.feed.f.i iVar = new com.ss.android.ugc.aweme.feed.f.i(true, 1, 0.0f, (float) ((MainPageFragment.this.getContext().getResources().getDisplayMetrics().heightPixels / 2) + u.a(105.0d)), MainPageFragment.this.getActivity().hashCode());
                    com.ss.android.ugc.aweme.utils.bg.a(iVar);
                    return true;
                }
            });
            this.mGuideView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54239a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54239a, false, 57563, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f54239a, false, 57563, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    MainPageFragment.this.mLongClickGuideShowing = false;
                    MainPageFragment.this.mMainBottomTabView.a(true);
                    bmVar.s(false);
                }
            });
            return true;
        }
    }

    public boolean tryShowScrollToProfileView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57498, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57498, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (MainPageExperimentHelper.j()) {
            return false;
        } else {
            IAVStoryService iAVStoryService = (IAVStoryService) ServiceManager.get().getService(IAVStoryService.class);
            if (isMainFragmentStoryPanelShowing() || ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishing() || (iAVStoryService != null && iAVStoryService.isStoryPublishing(getContext()))) {
                return false;
            }
            if (SharePrefCache.inst().getScrollToProfileGuideState() == null || ((Integer) SharePrefCache.inst().getScrollToProfileGuideState().c()).intValue() != 1) {
                if (this.mMainBottomTabView != null) {
                    this.mMainBottomTabView.a(true);
                }
                return false;
            }
            com.ss.android.ugc.aweme.utils.bg.a(new com.ss.android.ugc.aweme.detail.c.b(true));
            showScrollToProfileAnimation();
            return true;
        }
    }

    public boolean tryShowVideoGuideView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57495, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57495, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid() || isMainFragmentStoryPanelShowing()) {
            return false;
        } else {
            if (!this.mSafeMainTabPreferences.b(true) || this.mGuideShown) {
                this.mMainBottomTabView.a(true);
                return false;
            }
            this.mGuideShown = true;
            this.mSwipeUpGuideShowing = true;
            this.mMainBottomTabView.a(false);
            this.mGuideView = LayoutInflater.from(getActivity()).inflate(C0906R.layout.m2, null);
            ((ViewGroup) getActivity().findViewById(16908290)).addView(this.mGuideView, new ViewGroup.LayoutParams(-1, -1));
            AnimationImageView animationImageView = (AnimationImageView) this.mGuideView.findViewById(C0906R.id.ama);
            animationImageView.loop(true);
            animationImageView.setAnimation("home_swipe_up_guide.json");
            animationImageView.playAnimation();
            this.mGuideView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54234a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54234a, false, 57576, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f54234a, false, 57576, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (MainPageFragment.this.isViewValid()) {
                        MainPageFragment.this.mSwipeUpGuideShowing = false;
                        MainPageFragment.this.mMainBottomTabView.a(true);
                        MainPageFragment.this.mSafeMainTabPreferences.c(false);
                        MainPageFragment.this.handleMainPageResume();
                    }
                }
            });
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$tryShowFissionPopupWindow$15$MainPageFragment() {
        try {
            UgAwemeActivitySetting bs = com.ss.android.ugc.aweme.global.config.settings.g.b().bs();
            if (TextUtils.equals(this.mScrollSwitchHelper.b(), "page_home") && !hasNotificationPopShowed() && !TextUtils.equals("USER", this.mTabChangeManager.f54419e) && getActivity() != null) {
                this.mBubbleManager = new bg(getActivity(), bs, this.mMainBottomTabView.c("USER"));
                bg bgVar = this.mBubbleManager;
                if (PatchProxy.isSupport(new Object[0], bgVar, bg.f64763a, false, 73111, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], bgVar, bg.f64763a, false, 73111, new Class[0], Void.TYPE);
                } else if (bgVar.a(bgVar.i)) {
                    if (PatchProxy.isSupport(new Object[0], bgVar, bg.f64763a, false, 73116, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], bgVar, bg.f64763a, false, 73116, new Class[0], Void.TYPE);
                    } else if (bgVar.f64765c != null) {
                        Context context = bgVar.h;
                        View view = bgVar.j;
                        String str = bgVar.f64765c;
                        if (str != null) {
                            com.ss.android.ugc.aweme.main.a.c cVar = new com.ss.android.ugc.aweme.main.a.c(context, view, str, bgVar.f64766d, bgVar.f64767e);
                            if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.main.a.c.f54299a, false, 57968, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.main.a.c.f54299a, false, 57968, new Class[0], Void.TYPE);
                            } else if (cVar.g != null) {
                                if (Build.VERSION.SDK_INT >= 19) {
                                    cVar.showAsDropDown(cVar.g, cVar.f54304f, -(cVar.g.getHeight() + cVar.f54301c + cVar.f54303e), 51);
                                } else {
                                    cVar.showAsDropDown(cVar.g, cVar.f54304f, -(cVar.g.getHeight() + cVar.f54301c + cVar.f54303e));
                                }
                                if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.main.a.c.f54299a, false, 57965, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.main.a.c.f54299a, false, 57965, new Class[0], Void.TYPE);
                                } else {
                                    cVar.f54302d.post(new c.d(cVar));
                                }
                                long j = (long) cVar.j;
                                if (PatchProxy.isSupport(new Object[]{new Long(j)}, cVar, com.ss.android.ugc.aweme.main.a.c.f54299a, false, 57971, new Class[]{Long.TYPE}, Void.TYPE)) {
                                    com.ss.android.ugc.aweme.main.a.c cVar2 = cVar;
                                    PatchProxy.accessDispatch(new Object[]{new Long(j)}, cVar2, com.ss.android.ugc.aweme.main.a.c.f54299a, false, 57971, new Class[]{Long.TYPE}, Void.TYPE);
                                } else {
                                    cVar.getContentView().removeCallbacks(cVar.f54300b);
                                    cVar.getContentView().postDelayed(cVar.f54300b, j);
                                }
                            }
                            com.ss.android.ugc.aweme.main.guide.a a2 = com.ss.android.ugc.aweme.main.guide.a.h.a();
                            Context context2 = bgVar.h;
                            if (PatchProxy.isSupport(new Object[]{context2}, a2, com.ss.android.ugc.aweme.main.guide.a.f54799a, false, 58050, new Class[]{Context.class}, Void.TYPE)) {
                                com.ss.android.ugc.aweme.main.guide.a aVar = a2;
                                PatchProxy.accessDispatch(new Object[]{context2}, aVar, com.ss.android.ugc.aweme.main.guide.a.f54799a, false, 58050, new Class[]{Context.class}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(context2, "context");
                                a2.a(context2).edit().putBoolean(com.ss.android.ugc.aweme.main.guide.a.g, true).apply();
                            }
                            bgVar.f64768f = cVar;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                }
            }
        } catch (com.bytedance.ies.a unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0268 A[Catch:{ Exception -> 0x02c4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void showNotification() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 57508(0xe0a4, float:8.0586E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 57508(0xe0a4, float:8.0586E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            boolean r1 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r1 == 0) goto L_0x002c
            return
        L_0x002c:
            int r1 = r11.mCommentDialogState
            r2 = 1
            if (r1 != r2) goto L_0x0032
            return
        L_0x0032:
            com.ss.android.ugc.aweme.main.follow.e r1 = r11.liveNoticeView
            if (r1 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.main.follow.e r1 = r11.liveNoticeView
            boolean r1 = r1.isShowing()
            if (r1 != 0) goto L_0x02c5
        L_0x003e:
            boolean r1 = r11.mAwesomeSplashShowing
            if (r1 != 0) goto L_0x02c5
            boolean r1 = r11.mStoryRecordShowing
            if (r1 == 0) goto L_0x0048
            goto L_0x02c5
        L_0x0048:
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r6 = 0
            r7 = 71846(0x118a6, float:1.00678E-40)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0077
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r6 = 0
            r7 = 71846(0x118a6, float:1.00678E-40)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0095
        L_0x0077:
            java.lang.Boolean r3 = r1.o
            if (r3 == 0) goto L_0x007c
            goto L_0x008f
        L_0x007c:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r3 = r1.d()
            if (r3 != 0) goto L_0x0087
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.o = r3
            goto L_0x008f
        L_0x0087:
            boolean r3 = r3.notShowNotification
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.o = r3
        L_0x008f:
            java.lang.Boolean r1 = r1.o
            boolean r1 = r1.booleanValue()
        L_0x0095:
            if (r1 == 0) goto L_0x0098
            return
        L_0x0098:
            com.ss.android.ugc.aweme.main.bn r1 = r11.notificationCountView
            if (r1 != 0) goto L_0x00a7
            com.ss.android.ugc.aweme.main.bn r1 = new com.ss.android.ugc.aweme.main.bn
            android.support.v4.app.FragmentActivity r3 = r11.getActivity()
            r1.<init>(r3)
            r11.notificationCountView = r1
        L_0x00a7:
            com.ss.android.ugc.aweme.main.bn r1 = r11.notificationCountView
            r1.setOutsideTouchable(r2)
            com.ss.android.ugc.aweme.main.bn r1 = r11.notificationCountView
            android.view.View r1 = r1.getContentView()
            if (r1 == 0) goto L_0x00cc
            com.ss.android.ugc.aweme.main.bn r1 = r11.notificationCountView
            android.view.View r1 = r1.getContentView()
            com.ss.android.ugc.aweme.main.MainPageFragment$6 r3 = new com.ss.android.ugc.aweme.main.MainPageFragment$6
            r3.<init>()
            r1.setOnClickListener(r3)
            com.ss.android.ugc.aweme.main.bn r1 = r11.notificationCountView
            com.ss.android.ugc.aweme.main.MainPageFragment$7 r3 = new com.ss.android.ugc.aweme.main.MainPageFragment$7
            r3.<init>()
            r1.setOnDismissListener(r3)
        L_0x00cc:
            boolean r1 = r11.isViewValid()     // Catch:{ Exception -> 0x02c4 }
            if (r1 == 0) goto L_0x02c3
            com.ss.android.ugc.aweme.main.bn r1 = r11.notificationCountView     // Catch:{ Exception -> 0x02c4 }
            com.ss.android.ugc.aweme.main.base.MainBottomTabView r3 = r11.mMainBottomTabView     // Catch:{ Exception -> 0x02c4 }
            java.lang.String r4 = "NOTIFICATION"
            com.ss.android.ugc.aweme.main.base.b r10 = r3.c(r4)     // Catch:{ Exception -> 0x02c4 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02c4 }
            r3[r0] = r10     // Catch:{ Exception -> 0x02c4 }
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.main.bn.f54606a     // Catch:{ Exception -> 0x02c4 }
            r6 = 0
            r7 = 57599(0xe0ff, float:8.0713E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r8[r0] = r4     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x02c4 }
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02c4 }
            if (r3 == 0) goto L_0x0114
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02c4 }
            r3[r0] = r10     // Catch:{ Exception -> 0x02c4 }
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.main.bn.f54606a     // Catch:{ Exception -> 0x02c4 }
            r6 = 0
            r7 = 57599(0xe0ff, float:8.0713E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r8[r0] = r2     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x02c4 }
            r4 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02c4 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x02c4 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x02c4 }
            goto L_0x02bd
        L_0x0114:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02c4 }
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.main.bn.f54606a     // Catch:{ Exception -> 0x02c4 }
            r6 = 0
            r7 = 57600(0xe100, float:8.0715E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02c4 }
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02c4 }
            if (r3 == 0) goto L_0x0138
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02c4 }
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.main.bn.f54606a     // Catch:{ Exception -> 0x02c4 }
            r6 = 0
            r7 = 57600(0xe100, float:8.0715E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02c4 }
            r4 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02c4 }
            goto L_0x0143
        L_0x0138:
            java.lang.String r3 = "message_bubble_show"
            com.ss.android.ugc.aweme.app.d.d r4 = com.ss.android.ugc.aweme.app.d.d.a()     // Catch:{ Exception -> 0x02c4 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f34114b     // Catch:{ Exception -> 0x02c4 }
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r3, (java.util.Map) r4)     // Catch:{ Exception -> 0x02c4 }
        L_0x0143:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02c4 }
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.main.bn.f54606a     // Catch:{ Exception -> 0x02c4 }
            r6 = 0
            r7 = 57601(0xe101, float:8.0716E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02c4 }
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02c4 }
            if (r3 == 0) goto L_0x0168
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02c4 }
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.main.bn.f54606a     // Catch:{ Exception -> 0x02c4 }
            r6 = 0
            r7 = 57601(0xe101, float:8.0716E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02c4 }
            r4 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02c4 }
            goto L_0x0252
        L_0x0168:
            com.ss.android.ugc.aweme.message.c.c r3 = com.ss.android.ugc.aweme.message.c.c.a()     // Catch:{ Exception -> 0x02c4 }
            r4 = 7
            int r3 = r3.b(r4)     // Catch:{ Exception -> 0x02c4 }
            r1.g = r3     // Catch:{ Exception -> 0x02c4 }
            com.ss.android.ugc.aweme.message.c.c r3 = com.ss.android.ugc.aweme.message.c.c.a()     // Catch:{ Exception -> 0x02c4 }
            r4 = 28
            int r3 = r3.b(r4)     // Catch:{ Exception -> 0x02c4 }
            r1.h = r3     // Catch:{ Exception -> 0x02c4 }
            com.ss.android.ugc.aweme.message.c.c r3 = com.ss.android.ugc.aweme.message.c.c.a()     // Catch:{ Exception -> 0x02c4 }
            r4 = 3
            int r3 = r3.b(r4)     // Catch:{ Exception -> 0x02c4 }
            r1.i = r3     // Catch:{ Exception -> 0x02c4 }
            com.ss.android.ugc.aweme.message.c.c r3 = com.ss.android.ugc.aweme.message.c.c.a()     // Catch:{ Exception -> 0x02c4 }
            r4 = 24
            int r3 = r3.b(r4)     // Catch:{ Exception -> 0x02c4 }
            r1.j = r3     // Catch:{ Exception -> 0x02c4 }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02c4 }
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.main.bn.f54606a     // Catch:{ Exception -> 0x02c4 }
            r6 = 0
            r7 = 57602(0xe102, float:8.0718E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02c4 }
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02c4 }
            if (r3 == 0) goto L_0x01bb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02c4 }
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.main.bn.f54606a     // Catch:{ Exception -> 0x02c4 }
            r6 = 0
            r7 = 57602(0xe102, float:8.0718E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02c4 }
            r4 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02c4 }
            goto L_0x0252
        L_0x01bb:
            android.widget.TextView r3 = r1.f54608c     // Catch:{ Exception -> 0x02c4 }
            int r4 = r1.h     // Catch:{ Exception -> 0x02c4 }
            r1.a((android.widget.TextView) r3, (int) r4)     // Catch:{ Exception -> 0x02c4 }
            android.widget.TextView r3 = r1.f54609d     // Catch:{ Exception -> 0x02c4 }
            int r4 = r1.i     // Catch:{ Exception -> 0x02c4 }
            r1.a((android.widget.TextView) r3, (int) r4)     // Catch:{ Exception -> 0x02c4 }
            android.widget.TextView r3 = r1.f54610e     // Catch:{ Exception -> 0x02c4 }
            int r4 = r1.j     // Catch:{ Exception -> 0x02c4 }
            r1.a((android.widget.TextView) r3, (int) r4)     // Catch:{ Exception -> 0x02c4 }
            android.widget.TextView r3 = r1.f54607b     // Catch:{ Exception -> 0x02c4 }
            int r4 = r1.g     // Catch:{ Exception -> 0x02c4 }
            r1.a((android.widget.TextView) r3, (int) r4)     // Catch:{ Exception -> 0x02c4 }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02c4 }
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.main.bn.f54606a     // Catch:{ Exception -> 0x02c4 }
            r6 = 0
            r7 = 57604(0xe104, float:8.072E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02c4 }
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02c4 }
            if (r3 == 0) goto L_0x01fb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02c4 }
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.main.bn.f54606a     // Catch:{ Exception -> 0x02c4 }
            r6 = 0
            r7 = 57604(0xe104, float:8.072E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02c4 }
            r4 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x02c4 }
            goto L_0x0252
        L_0x01fb:
            int r3 = r1.j     // Catch:{ Exception -> 0x02c4 }
            if (r3 > 0) goto L_0x0252
            int r3 = r1.h     // Catch:{ Exception -> 0x02c4 }
            if (r3 == 0) goto L_0x021b
            android.widget.TextView r3 = r1.f54608c     // Catch:{ Exception -> 0x02c4 }
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch:{ Exception -> 0x02c4 }
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3     // Catch:{ Exception -> 0x02c4 }
            r3.rightMargin = r0     // Catch:{ Exception -> 0x02c4 }
            r4 = 2130838951(0x7f0205a7, float:1.7282899E38)
            android.widget.TextView r5 = r1.f54608c     // Catch:{ Exception -> 0x02c4 }
            r1.a((int) r4, (android.widget.TextView) r5)     // Catch:{ Exception -> 0x02c4 }
            android.widget.TextView r4 = r1.f54608c     // Catch:{ Exception -> 0x02c4 }
            r4.setLayoutParams(r3)     // Catch:{ Exception -> 0x02c4 }
            goto L_0x0252
        L_0x021b:
            int r3 = r1.i     // Catch:{ Exception -> 0x02c4 }
            if (r3 == 0) goto L_0x0237
            android.widget.TextView r3 = r1.f54609d     // Catch:{ Exception -> 0x02c4 }
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch:{ Exception -> 0x02c4 }
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3     // Catch:{ Exception -> 0x02c4 }
            r3.rightMargin = r0     // Catch:{ Exception -> 0x02c4 }
            r4 = 2130838953(0x7f0205a9, float:1.7282903E38)
            android.widget.TextView r5 = r1.f54609d     // Catch:{ Exception -> 0x02c4 }
            r1.a((int) r4, (android.widget.TextView) r5)     // Catch:{ Exception -> 0x02c4 }
            android.widget.TextView r4 = r1.f54609d     // Catch:{ Exception -> 0x02c4 }
            r4.setLayoutParams(r3)     // Catch:{ Exception -> 0x02c4 }
            goto L_0x0252
        L_0x0237:
            int r3 = r1.g     // Catch:{ Exception -> 0x02c4 }
            if (r3 == 0) goto L_0x0252
            android.widget.TextView r3 = r1.f54607b     // Catch:{ Exception -> 0x02c4 }
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch:{ Exception -> 0x02c4 }
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3     // Catch:{ Exception -> 0x02c4 }
            r3.rightMargin = r0     // Catch:{ Exception -> 0x02c4 }
            r4 = 2130838952(0x7f0205a8, float:1.72829E38)
            android.widget.TextView r5 = r1.f54607b     // Catch:{ Exception -> 0x02c4 }
            r1.a((int) r4, (android.widget.TextView) r5)     // Catch:{ Exception -> 0x02c4 }
            android.widget.TextView r4 = r1.f54607b     // Catch:{ Exception -> 0x02c4 }
            r4.setLayoutParams(r3)     // Catch:{ Exception -> 0x02c4 }
        L_0x0252:
            int r3 = r1.g     // Catch:{ Exception -> 0x02c4 }
            if (r3 != 0) goto L_0x0265
            int r3 = r1.j     // Catch:{ Exception -> 0x02c4 }
            if (r3 != 0) goto L_0x0265
            int r3 = r1.i     // Catch:{ Exception -> 0x02c4 }
            if (r3 != 0) goto L_0x0265
            int r3 = r1.h     // Catch:{ Exception -> 0x02c4 }
            if (r3 == 0) goto L_0x0263
            goto L_0x0265
        L_0x0263:
            r3 = 0
            goto L_0x0266
        L_0x0265:
            r3 = 1
        L_0x0266:
            if (r3 == 0) goto L_0x02ba
            if (r10 != 0) goto L_0x026b
            goto L_0x02ba
        L_0x026b:
            boolean r3 = r1.isShowing()     // Catch:{ Exception -> 0x02c4 }
            if (r3 != 0) goto L_0x02b8
            android.app.Activity r3 = r1.f54611f     // Catch:{ Exception -> 0x02c4 }
            boolean r3 = r3.isFinishing()     // Catch:{ Exception -> 0x02c4 }
            if (r3 != 0) goto L_0x02b8
            r3 = 2
            int[] r4 = new int[r3]     // Catch:{ Exception -> 0x02c4 }
            r10.getLocationOnScreen(r4)     // Catch:{ Exception -> 0x02c4 }
            android.view.View r5 = r1.getContentView()     // Catch:{ Exception -> 0x02c4 }
            r5.measure(r0, r0)     // Catch:{ Exception -> 0x02c4 }
            int r6 = r5.getMeasuredWidth()     // Catch:{ Exception -> 0x02c4 }
            int r7 = r5.getMeasuredHeight()     // Catch:{ Exception -> 0x02c4 }
            android.content.Context r8 = r10.getContext()     // Catch:{ Exception -> 0x02c4 }
            r9 = 1065353216(0x3f800000, float:1.0)
            float r8 = com.bytedance.common.utility.UIUtils.dip2Px(r8, r9)     // Catch:{ Exception -> 0x02c4 }
            int r8 = (int) r8     // Catch:{ Exception -> 0x02c4 }
            int r7 = r7 + r8
            r8 = 4
            r5.setVisibility(r8)     // Catch:{ Exception -> 0x02c4 }
            r8 = r4[r0]     // Catch:{ Exception -> 0x02c4 }
            int r9 = r10.getWidth()     // Catch:{ Exception -> 0x02c4 }
            int r9 = r9 / r3
            int r8 = r8 + r9
            int r6 = r6 / r3
            int r8 = r8 - r6
            r3 = r4[r2]     // Catch:{ Exception -> 0x02c4 }
            int r3 = r3 - r7
            r1.showAtLocation(r10, r0, r8, r3)     // Catch:{ Exception -> 0x02c4 }
            com.ss.android.ugc.aweme.main.bo r0 = new com.ss.android.ugc.aweme.main.bo     // Catch:{ Exception -> 0x02c4 }
            r0.<init>(r1, r5)     // Catch:{ Exception -> 0x02c4 }
            java.util.concurrent.Executor r1 = a.i.f1052b     // Catch:{ Exception -> 0x02c4 }
            a.i.a((java.util.concurrent.Callable<TResult>) r0, (java.util.concurrent.Executor) r1)     // Catch:{ Exception -> 0x02c4 }
        L_0x02b8:
            r0 = 1
            goto L_0x02bd
        L_0x02ba:
            r1.dismiss()     // Catch:{ Exception -> 0x02c4 }
        L_0x02bd:
            r11.isShowNotifyPop = r0     // Catch:{ Exception -> 0x02c4 }
            boolean r0 = r11.isShowNotifyPop     // Catch:{ Exception -> 0x02c4 }
            r11.hasNotifiPopShowed = r0     // Catch:{ Exception -> 0x02c4 }
        L_0x02c3:
            return
        L_0x02c4:
            return
        L_0x02c5:
            r11.needShowNotification = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.showNotification():void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$1$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        handleMainPageResume();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$11$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        hideAutoPlayTab();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$12$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        dismissNotification();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$13$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        exitGuideView();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$3$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        tryShowGuideView();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$4$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        playHomeAddBtnAnim();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$6$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        changeTabToFollowAfterPublish();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$8$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        tryShowLongClickGuideView();
    }

    @Subscribe
    public void onCloseStoryRecordEvent(com.ss.android.ugc.aweme.main.c.a aVar) {
        this.mStoryRecordShowing = false;
    }

    @Subscribe
    public void onScroll2StoryPublishPage(com.ss.android.ugc.aweme.main.c.d dVar) {
        this.mStoryRecordShowing = true;
    }

    public void setInVideoPlayMode(boolean z) {
        this.isInVideoPlayMode = z;
    }

    @Subscribe
    public void onCommentDialogEvent(com.ss.android.ugc.aweme.feed.f.f fVar) {
        this.mCommentDialogState = fVar.f45302a;
    }

    @Subscribe
    public void onMobEnterFromEvent(w wVar) {
        this.mEventType = wVar.f45319a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$10$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        changeAutoPlayTabVisibility(((Integer) aVar.a()).intValue());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$2$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        setInVideoPlayMode(((Boolean) aVar.a()).booleanValue());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$5$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        setTabBackground(((Boolean) aVar.a()).booleanValue());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$7$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        onNewIntent((Intent) aVar.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$9$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        exitMaskLayer(((Boolean) aVar.a()).booleanValue());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initDataCenter$0$MainPageFragment(com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        if (((Boolean) aVar.a()).booleanValue()) {
            enterDislikeMode(0.0f, 0.0f);
        } else {
            exitDislikeMode();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$showFollowAvatar$16$MainPageFragment(i iVar) throws Exception {
        if (this.mIsFollowAvatarShowing) {
            hideFollowAvatar();
            if (!this.mSecondLevelShowList.isEmpty()) {
                for (NoticeCount showFollowNoticeLogic : this.mSecondLevelShowList) {
                    showFollowNoticeLogic(showFollowNoticeLogic);
                }
            }
            this.mSecondLevelShowList.clear();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$showFollowLiveLabel$17$MainPageFragment(i iVar) throws Exception {
        if (this.mIsFollowLiveLabelShowing || MainPageExperimentHelper.n()) {
            hideFollowLiveLabel();
            if (!this.mSecondLevelShowList.isEmpty()) {
                for (NoticeCount showFollowNoticeLogic : this.mSecondLevelShowList) {
                    showFollowNoticeLogic(showFollowNoticeLogic);
                }
            }
            this.mSecondLevelShowList.clear();
        }
        return null;
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 57423, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 57423, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
    }

    @Subscribe
    public void onBottomTabTransParentEvent(com.ss.android.ugc.aweme.feed.f.c cVar) {
        com.ss.android.ugc.aweme.feed.f.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 57425, new Class[]{com.ss.android.ugc.aweme.feed.f.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 57425, new Class[]{com.ss.android.ugc.aweme.feed.f.c.class}, Void.TYPE);
            return;
        }
        transParentBottomTab(cVar2.f45297a);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, changeQuickRedirect, false, 57533, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, changeQuickRedirect, false, 57533, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        isScreenChange(configuration);
    }

    @Subscribe
    public void onNavigateToTab(com.ss.android.ugc.aweme.message.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, changeQuickRedirect, false, 57493, new Class[]{com.ss.android.ugc.aweme.message.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, changeQuickRedirect, false, 57493, new Class[]{com.ss.android.ugc.aweme.message.b.b.class}, Void.TYPE);
            return;
        }
        if (this.mTabClickListener != null) {
            this.mTabClickListener.a(bVar.f55357a);
        }
    }

    @Subscribe
    public void onScrolledToProfileTab(com.ss.android.ugc.aweme.share.model.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, changeQuickRedirect, false, 57435, new Class[]{com.ss.android.ugc.aweme.share.model.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, changeQuickRedirect, false, 57435, new Class[]{com.ss.android.ugc.aweme.share.model.b.class}, Void.TYPE);
            return;
        }
        tryDismissFissionPopupWindow();
    }

    @Subscribe(b = true)
    public void onSettingSyncDone(com.ss.android.ugc.aweme.setting.a.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, changeQuickRedirect, false, 57432, new Class[]{com.ss.android.ugc.aweme.setting.a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, changeQuickRedirect, false, 57432, new Class[]{com.ss.android.ugc.aweme.setting.a.d.class}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.b(new ar(this));
    }

    private void addProfileTab(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, changeQuickRedirect, false, 57447, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, changeQuickRedirect, false, 57447, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("from", "from_main");
        this.mTabChangeManager.a(MyProfileFragment.class, "USER", bundle);
    }

    private void asyncGetDialogStyleAndShowDialog(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 57532, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 57532, new Class[]{a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.thread.h.d().submit(new c(aVar2));
    }

    private void handleShowList(List<NoticeCount> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 57478, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 57478, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            for (NoticeCount next : list) {
                if (checkLiveLabelShowLimit(next.group)) {
                    showFollowNoticeLogic(next);
                }
            }
        }
    }

    private void initBottomTab(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57530, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57530, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mMainBottomTabView.setAppWidth(this.mCurScreenWidthDp);
        this.mMainBottomTabView.a(com.ss.android.ugc.aweme.main.base.g.MODE_TEXT, z);
    }

    private void insertStory(String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 57410, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 57410, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(str2, "FOLLOW")) {
            String stringExtra = getIntent().getStringExtra("extra_story_insert_uid");
            int intExtra = getIntent().getIntExtra("extra_story_is_friend", 1);
            Fragment a2 = this.mTabChangeManager.a();
            if (a2 instanceof FriendTabFragment) {
                FriendTabFragment friendTabFragment = (FriendTabFragment) a2;
                if (intExtra != 1) {
                    z = false;
                }
                friendTabFragment.a(stringExtra, z);
            }
        }
    }

    private void isScreenChange(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, changeQuickRedirect, false, 57531, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, changeQuickRedirect, false, 57531, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        if (this.mCurScreenWidthDp != configuration.screenWidthDp) {
            this.mCurScreenWidthDp = configuration.screenWidthDp;
            com.ss.android.ugc.aweme.framework.a.a.a(4, "MainPage", "isScreenChange, curScreenWidthDp is " + this.mCurScreenWidthDp);
            initBottomTab(true);
        }
    }

    private void logFollowTabNotice(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 57488, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 57488, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", getEnterFrom());
        hashMap.put("notice_type", str2);
        hashMap.put("action_type", "show");
        if (TextUtils.equals(str2, "number_dot")) {
            hashMap.put("show_cnt", String.valueOf(this.mCurFollowCount));
        }
        r.a("homepage_social_notice", (Map) hashMap);
    }

    private void mobLocationRequestState(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57525, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57525, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
        a2.a("is_open", z ? 1 : 0);
        r.a("location_status", (Map) a2.f34114b);
    }

    private static boolean shouldGoToFollowInMainTabByPush(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 57411, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 57411, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.equals(str2, "FOLLOW") || !MainPageExperimentHelper.n()) {
            return false;
        } else {
            return true;
        }
    }

    private void showFollowCount(int i) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57482, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57482, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (!MainPageExperimentHelper.n()) {
                this.mMainBottomTabView.a("FOLLOW", i);
                if (i == 0) {
                    z = false;
                }
                this.mIsFollowCountShowing = z;
                this.mCurFollowCount = i;
                if (i > 0) {
                    logFollowTabNotice("number_dot");
                }
            } else if (this.mDataCenter != null) {
                this.mDataCenter.a("FOLLOW_NOTICE_AT_MAIN_TAB_STRIP", (Object) new int[]{2, i});
            }
        }
    }

    private void showFollowLogic(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57413, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57413, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z) {
            this.mScrollSwitchHelper.a(false);
            refreshPushFollow();
        } else {
            com.ss.android.ugc.aweme.login.e.a((Fragment) this, this.mEventType, "push", (com.ss.android.ugc.aweme.base.component.f) new com.ss.android.ugc.aweme.base.component.f() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54224a;

                public final void a(Bundle bundle) {
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f54224a, false, 57570, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f54224a, false, 57570, new Class[0], Void.TYPE);
                        return;
                    }
                    MainPageFragment.this.mTabChangeManager.a("FOLLOW");
                    MainPageFragment.this.refreshPushFollow();
                }
            });
        }
    }

    private void transParentBottomTab(boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57426, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57426, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.mTabChangeManager == null || !"HOME".equals(this.mTabChangeManager.f54419e) || this.mMainBottomTabView == null)) {
            if (z) {
                this.mMainBottomTabView.setBackground(null);
                return;
            }
            MainBottomTabView mainBottomTabView = this.mMainBottomTabView;
            if (com.ss.android.ugc.aweme.profile.a.d()) {
                i = C0906R.color.h7;
            } else {
                i = C0906R.color.a25;
            }
            mainBottomTabView.setBackgroundResource(i);
        }
    }

    public void changeAutoPlayTabVisibility(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57434, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57434, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mAutoPlayTab.setVisibility(i);
    }

    public void exitMaskLayer(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57421, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57421, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        an.a(this.mAutoPlayTab, this.mAutoPlayTab.getAlpha(), 1.0f);
        an.a(this.mMainBottomTabView, this.mMainBottomTabView.getAlpha(), 1.0f);
        an.a(this.tabDivider, this.tabDivider.getAlpha(), 1.0f);
        enterAutoPlayAnimator(z, true);
    }

    @Subscribe
    public void onAwesomeSplashEvent(AwesomeSplashEvent awesomeSplashEvent) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{awesomeSplashEvent}, this, changeQuickRedirect, false, 57424, new Class[]{AwesomeSplashEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awesomeSplashEvent}, this, changeQuickRedirect, false, 57424, new Class[]{AwesomeSplashEvent.class}, Void.TYPE);
            return;
        }
        if (awesomeSplashEvent.f39420b != 4) {
            z = true;
        } else {
            z = false;
        }
        this.mAwesomeSplashShowing = z;
        if (this.mAwesomeSplashShowing) {
            if (this.bubbleGuideHelper != null) {
                this.mBubbleGuidePending = false;
                this.bubbleGuideHelper.b();
            }
            dismissNotificationCountViewSafely();
        } else if (this.mBubbleGuidePending) {
            this.mBubbleGuidePending = false;
            if (this.bubbleGuideHelper != null) {
                this.bubbleGuideHelper.a();
            }
        }
        com.ss.android.ugc.aweme.commercialize.splash.d.a(awesomeSplashEvent.f39420b, this.tabDivider, this.mMainBottomTabView);
    }

    @Subscribe
    public void onChangeCityEvent(com.ss.android.ugc.aweme.feed.f.d dVar) {
        com.ss.android.ugc.aweme.feed.f.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 57468, new Class[]{com.ss.android.ugc.aweme.feed.f.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 57468, new Class[]{com.ss.android.ugc.aweme.feed.f.d.class}, Void.TYPE);
        } else if (!MainPageExperimentHelper.i()) {
            if (!TextUtils.equals(dVar2.f45298a.code, com.ss.android.ugc.aweme.feed.c.d())) {
                com.ss.android.ugc.aweme.feed.c.a(dVar2.f45298a);
            } else {
                com.ss.android.ugc.aweme.feed.c.a((NearbyCities.CityBean) null);
            }
            if (dVar2.f45299b) {
                com.ss.android.ugc.aweme.feed.c.b(dVar2.f45298a);
            }
            if (dVar2.f45300c) {
                com.ss.android.ugc.aweme.utils.bg.a(new y());
            }
        }
    }

    @Subscribe
    public void onCommerceDialogEvent(com.ss.android.ugc.aweme.feed.f.an anVar) {
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[]{anVar}, this, changeQuickRedirect, false, 57527, new Class[]{com.ss.android.ugc.aweme.feed.f.an.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{anVar}, this, changeQuickRedirect, false, 57527, new Class[]{com.ss.android.ugc.aweme.feed.f.an.class}, Void.TYPE);
            return;
        }
        LinearLayout linearLayout = this.mAutoPlayTab;
        float alpha = this.mAutoPlayTab.getAlpha();
        float f4 = 1.0f;
        if (anVar.f45289a) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        an.a(linearLayout, alpha, f2);
        MainBottomTabView mainBottomTabView = this.mMainBottomTabView;
        float alpha2 = this.mMainBottomTabView.getAlpha();
        if (anVar.f45289a) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        an.a(mainBottomTabView, alpha2, f3);
        View view = this.tabDivider;
        float alpha3 = this.tabDivider.getAlpha();
        if (anVar.f45289a) {
            f4 = 0.0f;
        }
        an.a(view, alpha3, f4);
    }

    @Subscribe
    public void onDislikeAwemeEvent(com.ss.android.ugc.aweme.feed.f.i iVar) {
        com.ss.android.ugc.aweme.feed.f.i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, changeQuickRedirect, false, 57526, new Class[]{com.ss.android.ugc.aweme.feed.f.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, this, changeQuickRedirect, false, 57526, new Class[]{com.ss.android.ugc.aweme.feed.f.i.class}, Void.TYPE);
            return;
        }
        if (iVar2.f45308b == 1 && iVar2.f45307a) {
            enterDislikeMode(iVar2.f45309c, iVar2.f45310d);
        }
    }

    @Subscribe
    public void onFollowTabBubbleGuideEvent(t tVar) {
        if (PatchProxy.isSupport(new Object[]{tVar}, this, changeQuickRedirect, false, 57469, new Class[]{t.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tVar}, this, changeQuickRedirect, false, 57469, new Class[]{t.class}, Void.TYPE);
            return;
        }
        if (MainPageExperimentHelper.h() && this.mMainBottomTabView != null) {
            com.ss.android.ugc.aweme.main.guide.b.f54809f.a().a(this, this.mMainBottomTabView.c("FOLLOW"), 0);
        }
    }

    @Subscribe
    public void onProfileFollowEvent(com.ss.android.ugc.aweme.challenge.a.d dVar) {
        com.ss.android.ugc.aweme.challenge.a.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 57470, new Class[]{com.ss.android.ugc.aweme.challenge.a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 57470, new Class[]{com.ss.android.ugc.aweme.challenge.a.d.class}, Void.TYPE);
            return;
        }
        if (MainPageExperimentHelper.h() && dVar2.f35320c == 1 && (dVar2.f35319b instanceof User)) {
            if (dVar2.f35318a == 1) {
                com.ss.android.ugc.aweme.main.guide.b.f54809f.a().f54811c = (User) dVar2.f35319b;
                com.ss.android.ugc.aweme.main.guide.b.f54809f.a().f54813e = true;
                return;
            }
            com.ss.android.ugc.aweme.main.guide.b.f54809f.a().f54811c = null;
            com.ss.android.ugc.aweme.main.guide.b.f54809f.a().f54813e = false;
        }
    }

    @Subscribe(b = true)
    public void onQueryUserFinishedEvent(com.ss.android.ugc.aweme.base.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 57502, new Class[]{com.ss.android.ugc.aweme.base.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 57502, new Class[]{com.ss.android.ugc.aweme.base.a.a.class}, Void.TYPE);
            return;
        }
        if (this.mTabChangeManager != null && this.mTabChangeManager.b("USER") == null) {
            addProfileTab(aVar.f34475a);
        }
        if (isViewValid() && com.ss.android.ugc.aweme.account.d.a().getCurUser().isNeedRecommend()) {
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54244a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f54244a, false, 57565, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f54244a, false, 57565, new Class[0], Void.TYPE);
                        return;
                    }
                    if (AwemeAppData.p().f() != null && AwemeAppData.p().f().getClass() == MainActivity.class) {
                        b.a.a((Activity) MainPageFragment.this.getActivity()).a(RecommendFriendActivity.class).a();
                    }
                }
            });
        }
    }

    @Subscribe
    public void onShootEvent(am amVar) {
        if (PatchProxy.isSupport(new Object[]{amVar}, this, changeQuickRedirect, false, 57519, new Class[]{am.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{amVar}, this, changeQuickRedirect, false, 57519, new Class[]{am.class}, Void.TYPE);
            return;
        }
        MainBottomTabView mainBottomTabView = this.mMainBottomTabView;
        if (PatchProxy.isSupport(new Object[0], mainBottomTabView, MainBottomTabView.f3526a, false, 57767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], mainBottomTabView, MainBottomTabView.f3526a, false, 57767, new Class[0], Void.TYPE);
        } else if (mainBottomTabView.f3528c != null && mainBottomTabView.f3528c.isEnabled()) {
            mainBottomTabView.f3528c.performClick();
        }
    }

    @Subscribe
    public void onVideoPageChangeEvent(ac acVar) {
        if (PatchProxy.isSupport(new Object[]{acVar}, this, changeQuickRedirect, false, 57505, new Class[]{ac.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{acVar}, this, changeQuickRedirect, false, 57505, new Class[]{ac.class}, Void.TYPE);
        } else if (acVar.f45277a != null && acVar.f45277a.getAuthor() != null) {
            String uid = acVar.f45277a.getAuthor().getUid();
            this.mCurrentAweme = acVar.f45277a;
            if (!TextUtils.equals(this.mLastUserId, uid)) {
                this.mLastUserId = uid;
            }
        }
    }

    @Subscribe(b = true)
    public void requestPermission(com.ss.android.ugc.aweme.main.dialogmanager.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 57524, new Class[]{com.ss.android.ugc.aweme.main.dialogmanager.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 57524, new Class[]{com.ss.android.ugc.aweme.main.dialogmanager.c.class}, Void.TYPE);
        } else if (getActivity() != null) {
            bm bmVar = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(getActivity(), bm.class);
            if (com.ss.android.ugc.aweme.utils.permission.f.d(getActivity()) != 0 && !bmVar.a()) {
                bmVar.m(true);
                requestPermissions(new String[]{"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"}, 1);
            }
            if (com.ss.android.ugc.aweme.utils.permission.a.a((Context) getActivity(), af.f2626c)) {
                mobLocationRequestState(true);
            }
        }
    }

    public void setCanScroll(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57503, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57503, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mScrollSwitchHelper.a(z);
    }

    public void setTabBackground(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57501, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57501, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.tabDivider;
        if (com.ss.android.ugc.aweme.profile.a.d()) {
            v.a(view, 8);
        } else if (view != null) {
            if (z) {
                i = 4;
            }
            view.setVisibility(i);
        }
        ((MainActivity) getActivity()).refreshSlideSwitchCanScrollRight();
    }

    public void setUserVisibleHint(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57528, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57528, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (isViewValid()) {
            if (z2) {
                handleMainPageResume();
            } else {
                handleMainPageStop();
            }
            Fragment a2 = this.mTabChangeManager.a();
            if ((a2 instanceof FriendTabFragment) || (a2 instanceof FullScreenFollowFeedIn2TabFragment)) {
                a2.setUserVisibleHint(z2);
            }
            TabAlphaController.a().a(z2);
        }
    }

    @Subscribe
    public void showDialog(com.ss.android.ugc.aweme.main.dialogmanager.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 57523, new Class[]{com.ss.android.ugc.aweme.main.dialogmanager.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 57523, new Class[]{com.ss.android.ugc.aweme.main.dialogmanager.a.class}, Void.TYPE);
        } else if (getActivity() != null) {
            asyncGetDialogStyleAndShowDialog(new b(getActivity()));
        }
    }

    @Subscribe
    public void switchToFriendTab(com.ss.android.ugc.aweme.main.c.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 57463, new Class[]{com.ss.android.ugc.aweme.main.c.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 57463, new Class[]{com.ss.android.ugc.aweme.main.c.f.class}, Void.TYPE);
            return;
        }
        new com.ss.android.ugc.aweme.main.d.c().a(this.mTabChangeManager);
    }

    public void toTargetTab(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 57449, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 57449, new Class[]{String.class}, Void.TYPE);
            return;
        }
        handleMainPageStop();
        this.mTabChangeManager.a(str);
        if (!o.v()) {
            o.b().h();
        } else {
            IFeedViewHolder currentViewHolder = getCurrentViewHolder();
            if (!(currentViewHolder == null || currentViewHolder.m() == null)) {
                currentViewHolder.m().T();
            }
        }
        hidePublishView();
        setTabBackground(true);
        setInVideoPlayMode(false);
    }

    private void showFollowAvatar(SimpleUser simpleUser) {
        if (PatchProxy.isSupport(new Object[]{simpleUser}, this, changeQuickRedirect, false, 57483, new Class[]{SimpleUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{simpleUser}, this, changeQuickRedirect, false, 57483, new Class[]{SimpleUser.class}, Void.TYPE);
        } else if (isViewValid() && com.ss.android.ugc.aweme.account.d.a().isLogin() && simpleUser != null && simpleUser.getAvatarThumb() != null) {
            tryHideLiveBroadcastWarn();
            this.mMainBottomTabView.a(true, "FOLLOW", simpleUser);
            this.mIsFollowAvatarShowing = true;
            logFollowTabNotice("head_show");
            int intValue = ((Integer) SharePrefCache.inst().getFriendTabAvatarDuation().c()).intValue();
            if (intValue > 0) {
                i.a((long) (intValue * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)).a((a.g<TResult, TContinuationResult>) new at<TResult,TContinuationResult>(this), i.f1052b);
            }
        }
    }

    private void showFollowNoticeLogic(NoticeCount noticeCount) {
        if (PatchProxy.isSupport(new Object[]{noticeCount}, this, changeQuickRedirect, false, 57479, new Class[]{NoticeCount.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{noticeCount}, this, changeQuickRedirect, false, 57479, new Class[]{NoticeCount.class}, Void.TYPE);
        } else if (noticeCount != null) {
            switch (noticeCount.group) {
                case 38:
                    hideFollowDot();
                    showFollowCount(0);
                    showFollowLiveLabel();
                    return;
                case 39:
                    if (!(noticeCount.extra == null || noticeCount.extra.followTabInfo == null)) {
                        if (noticeCount.extra.followTabInfo.publishItemId > 0) {
                            this.mInsertAwemeId = String.valueOf(noticeCount.extra.followTabInfo.publishItemId);
                        }
                        showFollowAvatar(noticeCount.extra.followTabInfo.publishFriend);
                        return;
                    }
                case 40:
                case 42:
                    showFollowCount(0);
                    hideFollowLiveLabel();
                    showFollowDot();
                    return;
                case 41:
                    hideFollowLiveLabel();
                    hideFollowDot();
                    showFollowCount(noticeCount.count);
                    break;
            }
        }
    }

    private void showLiveNoticeView(List<com.ss.android.ugc.aweme.main.follow.a> list) {
        int i;
        List<com.ss.android.ugc.aweme.main.follow.a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 57404, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 57404, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            AbTestManager a2 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71771, new Class[0], Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71771, new Class[0], Integer.TYPE)).intValue();
            } else {
                AbTestModel d2 = a2.d();
                if (d2 == null) {
                    i = -1;
                } else {
                    i = d2.showFollowTabAvatarLimit;
                }
            }
            if (this.mCurFollowCount > 0 && i >= 0 && com.ss.android.ugc.aweme.account.d.a().isLogin() && com.ss.android.ugc.aweme.account.d.a().getCurUser().getFollowingCount() > i) {
                final ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list2);
                list.clear();
                if (isViewValid()) {
                    if (this.liveNoticeView == null) {
                        this.liveNoticeView = new e(getActivity());
                        this.liveNoticeView.setOnDismissListener(new PopupWindow.OnDismissListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f54221a;

                            public final void onDismiss() {
                                if (PatchProxy.isSupport(new Object[0], this, f54221a, false, 57561, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f54221a, false, 57561, new Class[0], Void.TYPE);
                                    return;
                                }
                                MainPageFragment.this.mobFollowNoticeDot("follow_notice_dis", (long) arrayList.size(), "head_show");
                                MainPageFragment.this.liveNoticeView.a();
                                MainPageFragment.this.liveNoticeView = null;
                                if (MainPageFragment.this.needShowNotification) {
                                    MainPageFragment.this.showNotification();
                                    MainPageFragment.this.needShowNotification = false;
                                }
                            }
                        });
                    }
                    if (MainPageExperimentHelper.h()) {
                        this.liveNoticeView.a(this.mMainBottomTabView.c("FOLLOW"), arrayList);
                    }
                    mobFollowNoticeDot("follow_notice_show", (long) arrayList.size(), "head_show");
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a8  */
    @org.greenrobot.eventbus.Subscribe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFollowInRecommendEvent(com.ss.android.ugc.aweme.feed.f.s r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.s> r1 = com.ss.android.ugc.aweme.feed.f.s.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 57521(0xe0b1, float:8.0604E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 57521(0xe0b1, float:8.0604E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.s> r1 = com.ss.android.ugc.aweme.feed.f.s.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            com.ss.android.ugc.aweme.main.base.MainBottomTabView r0 = r10.mMainBottomTabView
            java.lang.String r1 = "FOLLOW"
            com.ss.android.ugc.aweme.main.base.b r0 = r0.c(r1)
            android.support.v4.app.FragmentActivity r1 = r10.getActivity()
            r2 = 2131171245(0x7f0717ad, float:1.7956871E38)
            android.view.View r1 = r1.findViewById(r2)
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r1 = (com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView) r1
            android.support.v4.app.FragmentActivity r2 = r10.getActivity()
            r3 = 2131171249(0x7f0717b1, float:1.795688E38)
            android.view.View r2 = r2.findViewById(r3)
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r2 = (com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView) r2
            if (r1 == 0) goto L_0x00c2
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.mCurrentAweme
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getAvatarThumb()
            int r4 = r1.getWidth()
            r10.loadAvatarViews(r2, r3, r4)
            r3 = 0
            r2.setTranslationX(r3)
            r2.setTranslationY(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScaleX(r3)
            r2.setScaleY(r3)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int[] r4 = r11.f45316a
            r4 = r4[r9]
            r3.leftMargin = r4
            int[] r4 = r11.f45316a
            r4 = r4[r8]
            r3.topMargin = r4
            r2.setLayoutParams(r3)
            r2.setVisibility(r9)
            r3 = 0
            boolean r4 = r0 instanceof com.ss.android.ugc.aweme.main.base.tab.m
            if (r4 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.main.base.tab.m r0 = (com.ss.android.ugc.aweme.main.base.tab.m) r0
            android.widget.ImageView r0 = r0.getTabIcon()
        L_0x0099:
            r3 = r0
            goto L_0x00a6
        L_0x009b:
            boolean r4 = r0 instanceof com.ss.android.ugc.aweme.main.base.tab.l
            if (r4 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.main.base.tab.l r0 = (com.ss.android.ugc.aweme.main.base.tab.l) r0
            android.widget.TextView r0 = r0.getTabTitle()
            goto L_0x0099
        L_0x00a6:
            if (r3 == 0) goto L_0x00c2
            int[] r0 = r11.f45316a
            r4 = r0[r9]
            int[] r0 = r11.f45316a
            r5 = r0[r8]
            int r6 = r1.getWidth()
            int r7 = r1.getHeight()
            r0 = r10
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.startAnimationAfterFollow(r1, r2, r3, r4, r5, r6)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.onFollowInRecommendEvent(com.ss.android.ugc.aweme.feed.f.s):void");
    }

    @Subscribe
    public void onRefreshEndEvent(ae aeVar) {
        String str;
        ae aeVar2 = aeVar;
        if (PatchProxy.isSupport(new Object[]{aeVar2}, this, changeQuickRedirect, false, 57500, new Class[]{ae.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aeVar2}, this, changeQuickRedirect, false, 57500, new Class[]{ae.class}, Void.TYPE);
        } else if (isViewValid()) {
            MainBottomTabView mainBottomTabView = this.mMainBottomTabView;
            if (!TextUtils.isEmpty(aeVar2.f45281a)) {
                str = aeVar2.f45281a;
            } else {
                str = "HOME";
            }
            if (PatchProxy.isSupport(new Object[]{str}, mainBottomTabView, MainBottomTabView.f3526a, false, 57755, new Class[]{String.class}, Void.TYPE)) {
                MainBottomTabView mainBottomTabView2 = mainBottomTabView;
                PatchProxy.accessDispatch(new Object[]{str}, mainBottomTabView2, MainBottomTabView.f3526a, false, 57755, new Class[]{String.class}, Void.TYPE);
                return;
            }
            if (mainBottomTabView.f3530e.containsKey(str)) {
                com.ss.android.ugc.aweme.main.base.b bVar = mainBottomTabView.f3530e.get(str);
                if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.main.base.b.f54424a, false, 57787, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.main.base.b.f54424a, false, 57787, new Class[0], Void.TYPE);
                } else if (bVar.f54425b) {
                    bVar.f54425b = false;
                    bVar.i();
                }
            }
        }
    }

    public void rememberTabBeforeExit(Fragment fragment) {
        boolean z;
        Fragment fragment2 = fragment;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, changeQuickRedirect, false, 57409, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, this, changeQuickRedirect, false, 57409, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        if (MainPageExperimentHelper.h() && !isColdStart) {
            AbTestManager a2 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71701, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71701, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                a2.v = Boolean.FALSE;
                AbTestModel d2 = a2.d();
                if (d2 != null) {
                    a2.v = Boolean.valueOf(d2.enable_remember_cold_start_follow);
                }
                z = a2.v.booleanValue();
            }
            if (z) {
                if (!(fragment2 instanceof FriendTabFragment) && !(fragment2 instanceof FullScreenFollowFeedIn2TabFragment)) {
                    z2 = false;
                }
                com.ss.android.ugc.aweme.aj.b.b().a((Context) k.a(), "is_next_cold_start_in_follow_tab", z2);
            }
        }
    }

    private boolean checkLiveLabelShowLimit(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57487, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57487, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i != 38) {
            return true;
        } else {
            if (!this.hasLiveRecordInit) {
                List<Long> b2 = com.ss.android.ugc.aweme.aj.b.b().b((Context) k.a(), "live_label_time_records", Long.class);
                if (!CollectionUtils.isEmpty(b2)) {
                    this.liveShowRecord.addAll(b2);
                }
                this.hasLiveRecordInit = true;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.liveShowRecord.size() == 0) {
                this.liveShowRecord.add(Long.valueOf(currentTimeMillis));
                i.a((Callable<TResult>) new av<TResult>(this), (Executor) i.f1051a);
                return true;
            }
            for (int size = this.liveShowRecord.size() - 1; size >= 0; size--) {
                if (currentTimeMillis - this.liveShowRecord.get(size).longValue() > 3600000) {
                    this.liveShowRecord.remove(size);
                }
            }
            int b3 = com.ss.android.ugc.aweme.aj.b.b().b(k.a(), "most_display_times");
            if (b3 > 0 && this.liveShowRecord.size() > b3) {
                return false;
            }
            long d2 = com.ss.android.ugc.aweme.aj.b.b().d(k.a(), "one_display_intervals");
            if (d2 > 0 && this.liveShowRecord.size() > 0 && currentTimeMillis - this.liveShowRecord.get(this.liveShowRecord.size() - 1).longValue() <= d2 * 1000) {
                return false;
            }
            this.liveShowRecord.add(Long.valueOf(currentTimeMillis));
            i.a((Callable<TResult>) new aw<TResult>(this), (Executor) i.f1051a);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void tryGoToSecondTabWhenColdStart(java.lang.String r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 57408(0xe040, float:8.0446E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 57408(0xe040, float:8.0446E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L_0x005e
            android.support.v4.app.FragmentActivity r0 = r18.getActivity()
            android.content.Intent r0 = r0.getIntent()
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.ab.a(r0)
            if (r0 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.commercialize.splash.a r0 = com.ss.android.ugc.aweme.commercialize.splash.a.a()
            java.lang.String r0 = r0.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005e
        L_0x005c:
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            com.ss.android.ugc.aweme.y.a r1 = com.ss.android.ugc.aweme.y.a.a()
            boolean r1 = r1.f76941b
            if (r1 == 0) goto L_0x00ac
            com.ss.android.ugc.aweme.y.a r1 = com.ss.android.ugc.aweme.y.a.a()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.y.a.f76939a
            r14 = 0
            r15 = 62687(0xf4df, float:8.7843E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r1
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x009a
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.y.a.f76939a
            r14 = 0
            r15 = 62687(0xf4df, float:8.7843E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r1
            r16 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x00a8
        L_0x009a:
            com.ss.android.ugc.aweme.aj.b r1 = com.ss.android.ugc.aweme.aj.b.b()
            com.ss.android.ugc.aweme.app.k r2 = com.ss.android.ugc.aweme.app.k.a()
            java.lang.String r3 = "default_second_tab"
            boolean r1 = r1.b((android.content.Context) r2, (java.lang.String) r3, (boolean) r10)
        L_0x00a8:
            if (r1 == 0) goto L_0x00ac
            r1 = 1
            goto L_0x00ad
        L_0x00ac:
            r1 = 0
        L_0x00ad:
            boolean r2 = com.ss.android.ugc.aweme.main.MainPageExperimentHelper.h()
            if (r2 == 0) goto L_0x00d2
            java.lang.String r2 = "HOME"
            boolean r2 = android.text.TextUtils.equals(r8, r2)
            if (r2 == 0) goto L_0x00d2
            boolean r2 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isInTeenagerModeNewVersion()
            if (r2 != 0) goto L_0x00d2
            com.ss.android.ugc.aweme.aj.b r2 = com.ss.android.ugc.aweme.aj.b.b()
            com.ss.android.ugc.aweme.app.k r3 = com.ss.android.ugc.aweme.app.k.a()
            java.lang.String r4 = "is_next_cold_start_in_follow_tab"
            boolean r2 = r2.c(r3, r4)
            if (r2 == 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r9 = 0
        L_0x00d3:
            if (r0 == 0) goto L_0x0163
            r0 = 3
            if (r1 == 0) goto L_0x0120
            r18.toSecondTab()
            android.support.v4.app.FragmentActivity r1 = r18.getActivity()
            com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel r1 = com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel.a((android.support.v4.app.FragmentActivity) r1)
            r1.f47720b = r0
            com.ss.android.ugc.aweme.y.a r0 = com.ss.android.ugc.aweme.y.a.a()
            r0.f76941b = r10
            java.lang.String r0 = "enter_homepage_follow"
            com.ss.android.ugc.aweme.app.d.d r1 = new com.ss.android.ugc.aweme.app.d.d
            r1.<init>()
            java.lang.String r2 = "previous_page"
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "click_follow_tab"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.mCurrentAweme
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.m(r3)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.mCurrentAweme
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.a((com.ss.android.ugc.aweme.feed.model.Aweme) r3)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        L_0x0120:
            if (r9 == 0) goto L_0x0163
            r18.toSecondTab()
            android.support.v4.app.FragmentActivity r1 = r18.getActivity()
            com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel r1 = com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel.a((android.support.v4.app.FragmentActivity) r1)
            r1.f47720b = r0
            java.lang.String r0 = "enter_homepage_follow"
            com.ss.android.ugc.aweme.app.d.d r1 = new com.ss.android.ugc.aweme.app.d.d
            r1.<init>()
            java.lang.String r2 = "previous_page"
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "click_follow_tab"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.mCurrentAweme
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.m(r3)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.mCurrentAweme
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.a((com.ss.android.ugc.aweme.feed.model.Aweme) r3)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.tryGoToSecondTabWhenColdStart(java.lang.String):void");
    }

    @Subscribe
    public void onFeedbackEvent(com.ss.android.ugc.aweme.feedback.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 57492, new Class[]{com.ss.android.ugc.aweme.feedback.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 57492, new Class[]{com.ss.android.ugc.aweme.feedback.c.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            com.ss.android.ugc.aweme.feedback.k a2 = com.ss.android.ugc.aweme.feedback.k.a(getActivity());
            if (!AbTestManager.a().ce()) {
                FragmentActivity activity = getActivity();
                if (PatchProxy.isSupport(new Object[]{activity}, a2, com.ss.android.ugc.aweme.feedback.k.f47186a, false, 43814, new Class[]{Context.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.feedback.k kVar = a2;
                    PatchProxy.accessDispatch(new Object[]{activity}, kVar, com.ss.android.ugc.aweme.feedback.k.f47186a, false, 43814, new Class[]{Context.class}, Void.TYPE);
                    return;
                }
                r.a("feedback_reply_alert", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("uid", com.ss.android.ugc.aweme.account.d.a().getCurUserId()).f34114b);
                l lVar = new l(activity);
                AlertDialog.Builder a3 = com.ss.android.a.a.a(activity);
                a3.setTitle((int) C0906R.string.b1a).setPositiveButton((int) C0906R.string.b4o, (DialogInterface.OnClickListener) lVar).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) null);
                a3.show();
            } else if (!"page_setting".equals(this.mScrollSwitchHelper.b())) {
                if (!(getActivity() instanceof MainActivity) || !((MainActivity) getActivity()).isInMaskLayer()) {
                    FragmentActivity activity2 = getActivity();
                    com.ss.android.ugc.aweme.main.base.b c2 = this.mMainBottomTabView.c("NOTIFICATION");
                    if (PatchProxy.isSupport(new Object[]{activity2, c2}, a2, com.ss.android.ugc.aweme.feedback.k.f47186a, false, 43815, new Class[]{Activity.class, View.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.feedback.k kVar2 = a2;
                        PatchProxy.accessDispatch(new Object[]{activity2, c2}, kVar2, com.ss.android.ugc.aweme.feedback.k.f47186a, false, 43815, new Class[]{Activity.class, View.class}, Void.TYPE);
                    } else {
                        r.a("feedback_reply_alert", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("uid", com.ss.android.ugc.aweme.account.d.a().getCurUserId()).f34114b);
                        if (activity2 != null) {
                            LinearLayout linearLayout = new LinearLayout(activity2);
                            DmtTextView dmtTextView = new DmtTextView(activity2);
                            dmtTextView.setText(activity2.getResources().getString(C0906R.string.bgp));
                            dmtTextView.setTextColor(activity2.getResources().getColor(C0906R.color.hy));
                            linearLayout.addView(dmtTextView);
                            DmtTextView dmtTextView2 = new DmtTextView(activity2);
                            dmtTextView2.setText(activity2.getResources().getString(C0906R.string.bgq));
                            dmtTextView2.setPadding(u.a(4.0d), 0, 0, 0);
                            dmtTextView2.setTextColor(activity2.getResources().getColor(C0906R.color.zn));
                            linearLayout.addView(dmtTextView2);
                            linearLayout.setPadding(0, 9, 0, 9);
                            if (a2.f47189d == null) {
                                a2.f47189d = new b.a(activity2).d(false).c(false).a(false).a((View) linearLayout).e(u.a(7.0d)).a((b.C0184b) new b.C0184b(activity2) {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f47192a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ Activity f47193b;

                                    public final void a() {
                                        if (PatchProxy.isSupport(new Object[0], this, f47192a, false, 43818, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f47192a, false, 43818, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        r.a("feedback_reply_view", (Map) d.a().a("uid", com.ss.android.ugc.aweme.account.d.a().getCurUserId()).f34114b);
                                        this.f47193b.startActivity(new Intent(this.f47193b, FeedbackActivity.class));
                                    }

                                    {
                                        this.f47193b = r2;
                                    }
                                }).a();
                            }
                            a2.f47189d.a(c2, 48, (float) u.a(160.0d), -u.a(147.0d));
                        }
                    }
                }
            }
        }
    }

    @Subscribe
    public void onFollowTabNoticeEvent(com.ss.android.ugc.aweme.message.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 57477, new Class[]{com.ss.android.ugc.aweme.message.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 57477, new Class[]{com.ss.android.ugc.aweme.message.b.a.class}, Void.TYPE);
        } else if (aVar != null && !TextUtils.equals("FOLLOW", this.mTabChangeManager.f54419e) && !TimeLockRuler.isInTeenagerModeNewVersion()) {
            List<NoticeCount> a2 = aVar.a();
            if (!a2.isEmpty()) {
                if (MainPageExperimentHelper.n()) {
                    Iterator it2 = a2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        com.ss.android.ugc.aweme.message.c.c.a();
                        if (com.ss.android.ugc.aweme.message.c.c.g(((NoticeCount) it2.next()).group)) {
                            if (this.mDataCenter != null) {
                                this.mDataCenter.a("FOLLOW_NOTICE_AT_MAIN_TAB_STRIP", (Object) new int[]{1, 1});
                            }
                        }
                    }
                }
                this.mFirstLevelShowList.clear();
                this.mSecondLevelShowList.clear();
                this.mThirdLevelShowList.clear();
                for (NoticeCount noticeCount : a2) {
                    if (!(noticeCount.extra == null || noticeCount.extra.followTabInfo == null)) {
                        if (noticeCount.extra.followTabInfo.level == FollowTabInfoStruct.FIRST_LEVEL) {
                            this.mFirstLevelShowList.add(noticeCount);
                        } else if (noticeCount.extra.followTabInfo.level == FollowTabInfoStruct.SECOND_LEVEL) {
                            this.mSecondLevelShowList.add(noticeCount);
                        } else if (noticeCount.extra.followTabInfo.level == FollowTabInfoStruct.THIRD_LEVEL) {
                            this.mThirdLevelShowList.add(noticeCount);
                        }
                    }
                }
                if (!this.mFirstLevelShowList.isEmpty()) {
                    if (this.mFirstLevelShowList.size() != 1) {
                        handleShowList(this.mFirstLevelShowList);
                    } else if (checkLiveLabelShowLimit(this.mFirstLevelShowList.get(0).group)) {
                        showFollowNoticeLogic(this.mFirstLevelShowList.get(0));
                        this.mFirstLevelShowList.clear();
                    } else if (!this.mIsFollowLiveLabelShowing) {
                        handleShowList(this.mSecondLevelShowList);
                    }
                }
            }
        }
    }

    public void onNewIntent(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, changeQuickRedirect, false, 57460, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, changeQuickRedirect, false, 57460, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        String str = null;
        if (this.mTabChangeManager != null) {
            str = this.mTabChangeManager.f54419e;
        }
        if (intent2.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUBLISH", false)) {
            changeTabToFollowAfterPublish();
        } else if (intent2.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", false)) {
            this.mTabChangeManager.a("HOME");
            setTabBackground(false);
            MainFragment mainFragment = (MainFragment) this.mTabChangeManager.a();
            if (mainFragment != null) {
                mainFragment.b(1);
            }
        } else if (intent2.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_STORY_PUBLISH", false)) {
            new com.ss.android.ugc.aweme.main.d.c().a(this.mTabChangeManager);
        } else if (intent2.getBooleanExtra("extra_story_push", false)) {
            handleStoryPush(intent2, false);
        } else {
            String stringExtra = intent2.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
            if ("FOLLOW".equals(stringExtra)) {
                if (!MainPageExperimentHelper.h()) {
                    goToFollowInMainTabByPush();
                } else if (this.mTabClickListener != null) {
                    this.mTabClickListener.a("FOLLOW");
                }
            } else if (!TextUtils.isEmpty(stringExtra)) {
                this.mTabChangeManager.a(stringExtra);
                if ("HOME".equals(stringExtra)) {
                    int intExtra = intent2.getIntExtra("tab", 1);
                    MainFragment mainFragment2 = (MainFragment) this.mTabChangeManager.a();
                    if (mainFragment2 != null) {
                        mainFragment2.b(intExtra);
                        if (PatchProxy.isSupport(new Object[0], mainFragment2, MainFragment.f3515a, false, 57242, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], mainFragment2, MainFragment.f3515a, false, 57242, new Class[0], Void.TYPE);
                        } else if (mainFragment2.f3518d != null) {
                            Fragment a2 = mainFragment2.f3518d.a();
                            if (a2 instanceof NearByFragment) {
                                ((NearByFragment) a2).f(true);
                            }
                        }
                    }
                    if (!"HOME".equals(str)) {
                        FragmentActivity activity = getActivity();
                        if (activity instanceof MainActivity) {
                            ((MainActivity) activity).performHomeTabClick();
                        }
                    }
                } else if (!"NOTIFICATION".equals(stringExtra) || com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                    hideNotificationDot();
                } else {
                    com.ss.android.ugc.aweme.login.e.a((Activity) getActivity(), this.mEventType, "click_message");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e8, code lost:
        if (r0.bC() == 0) goto L_0x01ec;
     */
    @org.greenrobot.eventbus.Subscribe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotificationIndicatorEvent(com.ss.android.ugc.aweme.message.b.c r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.message.b.c> r1 = com.ss.android.ugc.aweme.message.b.c.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 57490(0xe092, float:8.056E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 57490(0xe092, float:8.056E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.message.b.c> r1 = com.ss.android.ugc.aweme.message.b.c.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            if (r8 != 0) goto L_0x003b
            return
        L_0x003b:
            boolean r0 = r7.isShowNotifyPop
            if (r0 != 0) goto L_0x0099
            com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.message.c.c.f55363a
            r14 = 0
            r15 = 58765(0xe58d, float:8.2347E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0072
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.message.c.c.f55363a
            r14 = 0
            r15 = 58765(0xe58d, float:8.2347E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0094
        L_0x0072:
            r1 = 7
            int r1 = r0.b(r1)
            if (r1 > 0) goto L_0x0093
            r1 = 3
            int r1 = r0.b(r1)
            if (r1 > 0) goto L_0x0093
            r1 = 28
            int r1 = r0.b(r1)
            if (r1 > 0) goto L_0x0093
            r1 = 24
            int r0 = r0.b(r1)
            if (r0 <= 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r0 = 0
            goto L_0x0094
        L_0x0093:
            r0 = 1
        L_0x0094:
            if (r0 == 0) goto L_0x0099
            r18.showNotification()
        L_0x0099:
            com.ss.android.ugc.aweme.message.c.c.a()
            int r0 = r8.f55358a
            r1 = 11
            if (r0 == r1) goto L_0x00ad
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L_0x00ad
            r1 = 12
            if (r0 != r1) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r0 = 0
            goto L_0x00ae
        L_0x00ad:
            r0 = 1
        L_0x00ae:
            if (r0 == 0) goto L_0x00d1
            int r0 = r8.f55359b
            r1 = -1
            if (r0 != r1) goto L_0x00cd
            com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
            int r1 = r8.f55358a
            r0.a((int) r1)
            com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x00c9
            return
        L_0x00c9:
            r18.hideNotificationDot()
            return
        L_0x00cd:
            r18.showNotificationDot()
            return
        L_0x00d1:
            com.ss.android.ugc.aweme.message.c.c.a()
            int r0 = r8.f55358a
            boolean r0 = com.ss.android.ugc.aweme.message.c.c.e(r0)
            if (r0 == 0) goto L_0x00e4
            int r0 = r8.f55358a
            int r1 = r8.f55359b
            r7.showNotificationCount(r0, r1)
            return
        L_0x00e4:
            com.ss.android.ugc.aweme.message.c.c.a()
            int r0 = r8.f55358a
            boolean r0 = com.ss.android.ugc.aweme.message.c.c.f(r0)
            if (r0 == 0) goto L_0x01fd
            com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.message.c.c.f55363a
            r14 = 0
            r15 = 58766(0xe58e, float:8.2349E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            r2 = 50
            if (r1 == 0) goto L_0x0124
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.message.c.c.f55363a
            r14 = 0
            r15 = 58766(0xe58e, float:8.2349E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0135
        L_0x0124:
            boolean r1 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isInTeenagerModeNewVersion()
            if (r1 == 0) goto L_0x0131
            r1 = 51
            boolean r0 = r0.d(r1)
            goto L_0x0135
        L_0x0131:
            boolean r0 = r0.d(r2)
        L_0x0135:
            if (r0 != 0) goto L_0x0143
            r18.hideFollowDot()
            r7.showFollowCount(r10)
            java.util.List<com.ss.android.ugc.aweme.message.model.NoticeCount> r0 = r7.mThirdLevelShowList
            r0.clear()
            return
        L_0x0143:
            int r0 = r8.f55358a
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r11[r10] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.utils.bp.f75625a
            r14 = 1
            r15 = 88325(0x15905, float:1.2377E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r10] = r3
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0188
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.utils.bp.f75625a
            r14 = 1
            r15 = 88325(0x15905, float:1.2377E-40)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
        L_0x0181:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L_0x01ec
        L_0x0188:
            com.ss.android.ugc.aweme.utils.bp$a r1 = com.ss.android.ugc.aweme.utils.bp.f75626b
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r11[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.utils.bp.a.f75627a
            r14 = 0
            r15 = 88328(0x15908, float:1.23774E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r10] = r4
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r1
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x01ca
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.utils.bp.a.f75627a
            r4 = 0
            r5 = 88328(0x15908, float:1.23774E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r10] = r0
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r0 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0181
        L_0x01ca:
            if (r0 != r2) goto L_0x01eb
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            boolean r0 = r0.bU()
            if (r0 == 0) goto L_0x01eb
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.bC()
            if (r0 != 0) goto L_0x01eb
            goto L_0x01ec
        L_0x01eb:
            r9 = 0
        L_0x01ec:
            if (r9 == 0) goto L_0x01fd
            com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
            int r1 = r8.f55358a
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L_0x01fd
            r18.showFollowDot()
        L_0x01fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.onNotificationIndicatorEvent(com.ss.android.ugc.aweme.message.b.c):void");
    }

    public void recordWithMusic(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 57466, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 57466, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String uuid = UUID.randomUUID().toString();
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", uuid).a("shoot_way", "direct_shoot").a("group_id", av.INSTANCE.getVideoId()).a("_staging_flag", com.ss.android.g.a.b() ^ true ? 1 : 0);
        if (com.ss.android.ugc.aweme.ae.d.a().a(av.INSTANCE.getVideoId())) {
            a2.a("previous_page", "push");
        }
        if (!TextUtils.isEmpty(str)) {
            a2.a("log_pb", str2);
        }
        r.a("shoot", (Map) a2.f34114b);
        Intent intent = new Intent();
        intent.putExtra("shoot_way", "direct_shoot");
        intent.putExtra("creation_id", uuid);
        intent.putExtra("translation_type", 3);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        intent.putExtra("from", "main");
        if (shouldRecordWithSticker()) {
            intent.putStringArrayListExtra("reuse_sticker_ids", bv.a(this.mCurrentAweme.getStickerIDs()));
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).startToolPermissionActivity(getActivity(), intent);
        if (AbTestManager.a().d().playerReleaseOnShoot) {
            com.ss.android.ugc.aweme.video.u.a().d();
            if (!o.v()) {
                o.b().a(true);
                o.b().j();
                return;
            }
            com.ss.android.ugc.playerkit.videoview.a.a().c();
        }
    }

    static final /* synthetic */ void lambda$startAnimationAfterFollow$21$MainPageFragment(View view, ValueAnimator valueAnimator) {
        view.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    static final /* synthetic */ void lambda$startAnimationAfterFollow$22$MainPageFragment(View view, ValueAnimator valueAnimator) {
        view.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    static final /* synthetic */ void lambda$startAnimationAfterFollow$23$MainPageFragment(View view, ValueAnimator valueAnimator) {
        view.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @NonNull
    private String goToPushTab(Bundle bundle, Intent intent) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{bundle, intent}, this, changeQuickRedirect, false, 57412, new Class[]{Bundle.class, Intent.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bundle, intent}, this, changeQuickRedirect, false, 57412, new Class[]{Bundle.class, Intent.class}, String.class);
        }
        String stringExtra = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        if (TextUtils.isEmpty(stringExtra)) {
            if (shouldStartAtFollowTab()) {
                stringExtra = "FOLLOW";
            } else {
                stringExtra = "HOME";
            }
        }
        if (shouldGoToFollowInMainTabByPush(stringExtra)) {
            stringExtra = "HOME";
        }
        if (TextUtils.equals(stringExtra, "FOLLOW") && !com.ss.android.ugc.aweme.account.d.a().isLogin() && AbTestManager.a().I()) {
            z = true;
        }
        if (bundle == null) {
            if (!z) {
                this.mTabChangeManager.a(stringExtra);
            } else {
                this.mTabChangeManager.a("HOME");
            }
            if ("HOME".equals(stringExtra)) {
                String stringExtra2 = intent.getStringExtra("tab");
                if (StringUtils.isEmpty(stringExtra2)) {
                    intent.getIntExtra("tab", -1);
                } else {
                    try {
                        Integer.parseInt(stringExtra2);
                    } catch (Throwable unused) {
                    }
                }
            }
            if ("FOLLOW".equals(stringExtra)) {
                showFollowLogic(z);
            }
        }
        if ("NOTIFICATION".equals(stringExtra) && !com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            com.ss.android.ugc.aweme.login.e.a((Activity) getActivity(), this.mEventType, "click_message");
        }
        return stringExtra;
    }

    private void handleStoryPush(Intent intent, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{intent, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57461, new Class[]{Intent.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent, Byte.valueOf(z)}, this, changeQuickRedirect, false, 57461, new Class[]{Intent.class, Boolean.TYPE}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            String stringExtra = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
            if (!TextUtils.isEmpty(stringExtra)) {
                if (z) {
                    this.mTabChangeManager.a(stringExtra);
                } else if (!stringExtra.equals(this.mTabChangeManager.f54419e)) {
                    this.mTabClickListener.a(stringExtra);
                }
                String stringExtra2 = intent.getStringExtra("extra_story_insert_uid");
                if (TextUtils.equals("FOLLOW", stringExtra)) {
                    Fragment a2 = this.mTabChangeManager.a();
                    if (a2 instanceof FriendTabFragment) {
                        int intExtra = intent.getIntExtra("extra_story_is_friend", 1);
                        if (!TextUtils.isEmpty(stringExtra2)) {
                            FriendTabFragment friendTabFragment = (FriendTabFragment) a2;
                            if (intExtra == 1) {
                                z2 = true;
                            }
                            friendTabFragment.a(stringExtra2, z2);
                        }
                        ((FriendTabFragment) a2).g();
                    }
                    return;
                }
                com.ss.android.ugc.aweme.story.api.model.f fVar = new com.ss.android.ugc.aweme.story.api.model.f();
                fVar.detailType = 7;
                fVar.uid = stringExtra2;
                fVar.isSelf = false;
                ((com.ss.android.ugc.aweme.story.api.i) ServiceManager.get().getService(com.ss.android.ugc.aweme.story.api.i.class)).a(getActivity(), fVar, null, -1);
            }
        }
    }

    private void setCanScrollOnTabChange(String str, Fragment fragment) {
        String str2 = str;
        Fragment fragment2 = fragment;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str2, fragment2}, this, changeQuickRedirect, false, 57515, new Class[]{String.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, fragment2}, this, changeQuickRedirect, false, 57515, new Class[]{String.class, Fragment.class}, Void.TYPE);
        } else if (str2 != null) {
            if (!bz.f54668a.equals(str2) ? !"NEARBY".equals(str2) && !"NOTIFICATION".equals(str2) && ("HOME".equals(str2) || "USER".equals(str2) || "FOLLOW".equals(str2)) : !(fragment2 instanceof FriendTabFragment) && !(fragment2 instanceof MainPageNearByFragment) && (fragment2 instanceof FullScreenFollowFeedIn2TabFragment)) {
                z = true;
            }
            this.mScrollSwitchHelper.a(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, changeQuickRedirect, false, 57405, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, changeQuickRedirect, false, 57405, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.rootView = view;
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.mCurScreenWidthDp = i;
        this.mAnimViewModel = (MainAnimViewModel) ViewModelProviders.of(getActivity()).get(MainAnimViewModel.class);
        this.mMainTabVideoSeekBarControl = new com.ss.android.ugc.aweme.feed.ui.seekbar.a.c(this.mVideoSeekBar, this.mVideoSeekDuration);
        this.mScrollSwitchHelper = com.ss.android.ugc.aweme.main.base.d.a(getActivity());
        this.mScrollSwitchHelper.a((bu.a) new bu.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54250a;

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54250a, false, 57568, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54250a, false, 57568, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                IFeedViewHolder currentViewHolder = MainPageFragment.this.getCurrentViewHolder();
                String b2 = MainPageFragment.this.mScrollSwitchHelper.b();
                if (MainPageFragment.this.mAnimViewModel != null) {
                    MainPageFragment.this.mAnimViewModel.f54178e.setValue(b2);
                }
                if (TextUtils.equals(b2, "page_home")) {
                    MainPageFragment.this.tryHideLiveBroadcastWarn();
                }
                char c2 = 65535;
                int hashCode = b2.hashCode();
                if (hashCode != -1571965031) {
                    if (hashCode != 185242617) {
                        if (hashCode == 883526799 && b2.equals("page_home")) {
                            c2 = 1;
                        }
                    } else if (b2.equals("page_profile")) {
                        c2 = 2;
                    }
                } else if (b2.equals("page_discover")) {
                    c2 = 0;
                }
                switch (c2) {
                    case 0:
                        MainPageFragment.this.stopMainPageCalTime();
                        if (currentViewHolder != null) {
                            currentViewHolder.b(1);
                            return;
                        }
                        break;
                    case 1:
                        com.ss.android.ugc.aweme.utils.bg.a(new com.ss.android.ugc.aweme.music.a.g());
                        if (currentViewHolder != null) {
                            currentViewHolder.c(1);
                        }
                        MainPageFragment.this.handleMainPageResume();
                        if (MainPageExperimentHelper.h() && MainPageFragment.this.mMainBottomTabView != null) {
                            com.ss.android.ugc.aweme.main.guide.b a2 = com.ss.android.ugc.aweme.main.guide.b.f54809f.a();
                            MainPageFragment mainPageFragment = MainPageFragment.this;
                            com.ss.android.ugc.aweme.main.base.b c3 = MainPageFragment.this.mMainBottomTabView.c("FOLLOW");
                            if (PatchProxy.isSupport(new Object[]{mainPageFragment, c3}, a2, com.ss.android.ugc.aweme.main.guide.b.f54808a, false, 58061, new Class[]{MainPageFragment.class, com.ss.android.ugc.aweme.main.base.b.class}, Void.TYPE)) {
                                com.ss.android.ugc.aweme.main.guide.b bVar = a2;
                                PatchProxy.accessDispatch(new Object[]{mainPageFragment, c3}, bVar, com.ss.android.ugc.aweme.main.guide.b.f54808a, false, 58061, new Class[]{MainPageFragment.class, com.ss.android.ugc.aweme.main.base.b.class}, Void.TYPE);
                                break;
                            } else {
                                if (!(mainPageFragment == null || c3 == null || !a2.f54813e)) {
                                    a2.f54813e = false;
                                    a2.a(mainPageFragment, c3, 500);
                                }
                                return;
                            }
                        }
                    case 2:
                        if (currentViewHolder != null) {
                            currentViewHolder.b(1);
                        }
                        MainPageFragment.this.stopMainPageCalTime();
                        if (MainPageFragment.this.mScrollToProfileGuideHelper != null) {
                            MainPageFragment.this.mScrollToProfileGuideHelper.b();
                        }
                        MainPageFragment.this.tryDismissFissionPopupWindow();
                        break;
                }
            }
        });
        this.mScrollSwitchHelper.a(this, null, null);
        initView();
        doAdaptation4MainBottomTab();
        initTabs();
        initDataCenter();
        initBubbleGuideHelper();
        Intent intent = getIntent();
        String str = "";
        if (intent != null) {
            str = goToPushTab(bundle, intent);
            if (intent.getBooleanExtra("extra_story_push", false)) {
                handleStoryPush(intent, true);
            }
        }
        this.mAutoPlayTab.setTranslationY(getResources().getDimension(C0906R.dimen.lw) + 2.0f);
        this.mAutoPlayTab.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54252a;

            public final void onClick(View view) {
                String str;
                if (PatchProxy.isSupport(new Object[]{view}, this, f54252a, false, 57569, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f54252a, false, 57569, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                com.ss.android.ugc.aweme.app.d.d a2 = new com.ss.android.ugc.aweme.app.d.d().a("group_id", MainPageFragment.this.mCurrentAweme.getAid()).a("enter_from", MainPageFragment.this.mEventType).a("enter_method", "click_bottom_button");
                if (MainPageFragment.this.mCurrentAweme.getAuthor() != null) {
                    str = MainPageFragment.this.mCurrentAweme.getAuthor().getUid();
                } else {
                    str = "";
                }
                r.a("exit_auto_play", (Map) a2.a("author_id", str).a("log_pb", ai.a().a(aa.c(MainPageFragment.this.mCurrentAweme))).f34114b);
                MainPageFragment.this.mAutoPlayTab.setVisibility(0);
                com.bytedance.ies.dmt.ui.d.a.c(MainPageFragment.this.getContext(), (int) C0906R.string.ep).a();
                MainPageFragment.this.enterAutoPlayAnimator(false, false);
            }
        });
        tryGoToSecondTabWhenColdStart(str);
        this.liveBroadcastWarn = new LiveBroadcastWarn(this, this.rootView.findViewById(C0906R.id.bd8));
        getViewLifecycleOwner().getLifecycle().addObserver(this.liveBroadcastWarn);
        tryShowLiveBubble();
        isColdStart = false;
    }

    public void showNotificationCount(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 57491, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 57491, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!isViewValid() || TimeLockRuler.isTeenModeON()) {
        } else {
            if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                hideNotificationDot();
                return;
            }
            if (com.ss.android.ugc.aweme.message.c.c.a().b() > 0) {
                hideNotificationDot();
            }
            logFirstMessageNoticeShow();
            com.ss.android.ugc.aweme.message.c.c.a().a(i, i2);
            this.mMainBottomTabView.a("NOTIFICATION", com.ss.android.ugc.aweme.message.c.c.a().b());
        }
    }

    private void enterDislikeMode(float f2, float f3) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 57418, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 57418, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (this.mDisLikeAwemeLayout != null) {
            ((bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(getContext(), bm.class)).s(false);
            if (this.mTabChangeManager.a() instanceof MainFragment) {
                FeedFragment a2 = ((MainFragment) this.mTabChangeManager.a()).a();
                if (a2 instanceof FeedRecommendFragment) {
                    FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) a2;
                    if (PatchProxy.isSupport(new Object[0], feedRecommendFragment, FeedRecommendFragment.f3200e, false, 42643, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], feedRecommendFragment, FeedRecommendFragment.f3200e, false, 42643, new Class[0], Void.TYPE);
                    } else if (feedRecommendFragment.g != null) {
                        feedRecommendFragment.g.av();
                    }
                }
            }
            com.ss.android.ugc.aweme.app.d.d a3 = new com.ss.android.ugc.aweme.app.d.d().a("group_id", this.mCurrentAweme.getAid());
            if (this.mCurrentAweme.getAuthor() != null) {
                str = this.mCurrentAweme.getAuthor().getUid();
            } else {
                str = "";
            }
            r.a("click_trans_layer", (Map) a3.a("author_id", str).a("log_pb", ai.a().a(aa.c(this.mCurrentAweme))).a("enter_from", this.mEventType).f34114b);
            this.mDisLikeAwemeLayout.a(f2, f3, getEnterFrom(), this.mCurrentAweme);
            this.mDisLikeAwemeLayout.setInDislikeMode(true);
            if (this.mDisLikeAwemeLayout.getAdapter() != null) {
                this.mDisLikeAwemeLayout.getAdapter().notifyDataSetChanged();
            }
            an.a(this.mAutoPlayTab, this.mAutoPlayTab.getAlpha(), 0.0f);
            an.a(this.mMainBottomTabView, this.mMainBottomTabView.getAlpha(), 0.0f);
            an.a(this.tabDivider, this.tabDivider.getAlpha(), 0.0f);
            if (this.mScrollToProfileGuideHelper != null) {
                this.mScrollToProfileGuideHelper.b();
            }
        }
    }

    public void enterAutoPlayAnimator(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57422, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, changeQuickRedirect, false, 57422, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        float a2 = (float) u.a((double) (getResources().getDimension(C0906R.dimen.lw) + 2.0f));
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mAutoPlayTab, "translationY", new float[]{a2, 0.0f});
            ofFloat.setDuration(200).setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mMainBottomTabView, "translationY", new float[]{0.0f, a2});
            ofFloat2.setDuration(200).setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.mAutoPlayTab, "alpha", new float[]{0.0f, 1.0f});
            ofFloat3.setDuration(0);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.mMainBottomTabView, "alpha", new float[]{0.0f, 1.0f});
            ofFloat4.setDuration(0);
            animatorSet.play(ofFloat).with(ofFloat3).after(ofFloat2).with(ofFloat4);
        } else {
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.mAutoPlayTab, "translationY", new float[]{0.0f, a2});
            ofFloat5.setDuration(200).setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.mMainBottomTabView, "translationY", new float[]{a2, 0.0f});
            ofFloat6.setDuration(200).setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.mAutoPlayTab, "alpha", new float[]{0.0f, 1.0f});
            ofFloat7.setDuration(0);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.mMainBottomTabView, "alpha", new float[]{0.0f, 1.0f});
            ofFloat8.setDuration(0);
            animatorSet.play(ofFloat5).with(ofFloat7).before(ofFloat6).with(ofFloat8);
        }
        if (z2) {
            animatorSet.setStartDelay(200);
        }
        animatorSet.start();
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 57402, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 57402, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View a2 = ((p) com.ss.android.ugc.aweme.lego.a.i.b(p.class)).a(getContext(), (int) C0906R.layout.fragment_main_page);
        this.mTabHost = (FragmentTabHost) a2.findViewById(C0906R.id.bl4);
        this.mTabHost.setHideWhenTabChanged(true);
        return a2;
    }

    private void loadAvatarViews(@NonNull AvatarWithBorderView avatarWithBorderView, UrlModel urlModel, int i) {
        AvatarWithBorderView avatarWithBorderView2 = avatarWithBorderView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{avatarWithBorderView2, urlModel2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 57520, new Class[]{AvatarWithBorderView.class, UrlModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarWithBorderView2, urlModel2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 57520, new Class[]{AvatarWithBorderView.class, UrlModel.class, Integer.TYPE}, Void.TYPE);
        } else if (urlModel2 == null || CollectionUtils.isEmpty(urlModel.getUrlList())) {
            avatarWithBorderView2.setImageURI(new Uri.Builder().scheme("res").path("2130839027").build());
        } else {
            int i2 = i;
            com.ss.android.ugc.aweme.base.c.a((RemoteImageView) avatarWithBorderView2, urlModel2, i2, i2);
        }
    }

    public void mobFollowNoticeDot(String str, long j, String str2) {
        String str3 = str;
        long j2 = j;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, new Long(j2), str4}, this, changeQuickRedirect, false, 57476, new Class[]{String.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, new Long(j2), str4}, this, changeQuickRedirect, false, 57476, new Class[]{String.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("notice_type", str4);
        if (j2 > 0) {
            a2.a("show_cnt", j2);
        }
        r.a(str3, (Map) a2.f34114b);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notice_type", str4);
        } catch (JSONException unused) {
        }
        MobClick jsonObject = MobClick.obtain().setEventName(str3).setLabelName("follow_bottom_tab").setJsonObject(jSONObject);
        if (j2 > 0) {
            jsonObject.setValue(String.valueOf(j));
        }
        r.onEvent(jsonObject);
    }

    public void handleFollowNotice(String str, com.ss.android.ugc.aweme.follow.b bVar, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        com.ss.android.ugc.aweme.follow.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str6, bVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57450, new Class[]{String.class, com.ss.android.ugc.aweme.follow.b.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str6, bVar2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 57450, new Class[]{String.class, com.ss.android.ugc.aweme.follow.b.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        String str7 = "";
        if (this.mIsFollowLiveLabelShowing) {
            str7 = "live";
        } else if (this.mIsFollowAvatarShowing) {
            str7 = "head_show";
        } else if (this.mIsFollowCountShowing) {
            str7 = "number_dot";
        } else if (this.mIsFollowDotShowing) {
            str7 = "yellow_dot";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("previous_page", str);
        hashMap.put("notice_type", str7);
        if (TextUtils.equals(str7, "number_dot")) {
            hashMap.put("show_cnt", String.valueOf(this.mCurFollowCount));
        }
        r.a("enter_homepage_social", (Map) hashMap);
        if (bVar2 != null) {
            if (!z) {
                if (this.mIsFollowLiveLabelShowing) {
                    bVar.a();
                    hideFollowLiveLabel();
                } else if (this.mIsFollowAvatarShowing) {
                    bVar2.a(this.mInsertAwemeId);
                    hideFollowAvatar();
                    hideFollowDot();
                } else if (this.mIsFollowCountShowing) {
                    bVar.b();
                    showFollowCount(0);
                } else if (this.mIsFollowDotShowing) {
                    bVar.c();
                    hideFollowDot();
                } else {
                    bVar.d();
                }
                this.mSecondLevelShowList.clear();
                handleShowList(this.mThirdLevelShowList);
            } else if (this.mIsFollowDotShowing) {
                r.a("homepage_social_notice", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "homepage_follow").a("notice_type", "yellow_dot").a("action_type", "click").f34114b);
            }
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            if (bVar.Q_()) {
                str3 = "enter_homepage_follow";
                if (com.ss.android.ugc.aweme.message.c.c.a().d(50)) {
                    str2 = "yellow_dot";
                } else {
                    str2 = "";
                }
                a2.a("group_id", aa.m(this.mCurrentAweme)).a("author_id", aa.a(this.mCurrentAweme)).a("notice_type", str7);
            } else {
                str3 = "enter_homepage_friends";
                if (com.ss.android.ugc.aweme.message.c.c.a().d(51)) {
                    str5 = "yellow_dot";
                } else {
                    str5 = "";
                }
                str2 = str5;
            }
            com.ss.android.ugc.aweme.app.d.d a3 = a2.a("previous_page", str).a("enter_from", "click_follow_tab").a("head_notice_type", str2);
            if (this.mIsFollowDotShowing) {
                str4 = "yellow_dot";
            } else {
                str4 = "";
            }
            r.a(str3, (Map) a3.a("bottom_notice_type", str4).f34114b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r23, @android.support.annotation.NonNull java.lang.String[] r24, @android.support.annotation.NonNull int[] r25) {
        /*
            r22 = this;
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r12 = 0
            r0[r12] = r1
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r13] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 57513(0xe0a9, float:8.0593E-41)
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005e
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0[r12] = r1
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 57513(0xe0a9, float:8.0593E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r13] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005e:
            android.support.v4.app.FragmentActivity r0 = r22.getActivity()
            com.ss.android.ugc.aweme.utils.permission.a.a((android.app.Activity) r0, (int) r8, (java.lang.String[]) r9, (int[]) r10)
            super.onRequestPermissionsResult(r23, r24, r25)
            android.support.v4.app.FragmentActivity r0 = r22.getActivity()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = android.support.v4.content.ContextCompat.checkSelfPermission(r0, r1)
            if (r0 != 0) goto L_0x008a
            android.support.v4.app.FragmentActivity r0 = r22.getActivity()
            com.ss.android.ugc.aweme.app.af r0 = com.ss.android.ugc.aweme.app.af.a((android.content.Context) r0)
            r0.d()
            r7.mobLocationRequestState(r13)
            com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter r0 = com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter.d()
            r0.e()
            goto L_0x008d
        L_0x008a:
            r7.mobLocationRequestState(r12)
        L_0x008d:
            java.lang.Runnable r0 = r7.mShowDialogRoutineRunnable
            if (r0 == 0) goto L_0x0096
            java.lang.Runnable r0 = r7.mShowDialogRoutineRunnable
            r0.run()
        L_0x0096:
            com.ss.android.ugc.aweme.commercialize.utils.af r0 = com.ss.android.ugc.aweme.commercialize.utils.af.a()
            java.lang.Object[] r15 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r15[r12] = r1
            r15[r13] = r9
            r15[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.commercialize.utils.af.f39679a
            r18 = 0
            r19 = 32562(0x7f32, float:4.5629E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r12] = r2
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r1[r13] = r2
            java.lang.Class<int[]> r2 = int[].class
            r1[r14] = r2
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x00f0
            java.lang.Object[] r15 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r15[r12] = r1
            r15[r13] = r9
            r15[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.commercialize.utils.af.f39679a
            r18 = 0
            r19 = 32562(0x7f32, float:4.5629E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r12] = r2
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r1[r13] = r2
            java.lang.Class<int[]> r2 = int[].class
            r1[r14] = r2
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x00f0:
            com.ss.android.ad.smartphone.a.a r1 = r0.f39681b
            if (r1 == 0) goto L_0x010b
            r1 = 101(0x65, float:1.42E-43)
            if (r8 == r1) goto L_0x00f9
            goto L_0x010b
        L_0x00f9:
            int r1 = r10.length
            if (r1 <= 0) goto L_0x0106
            r1 = r10[r12]
            if (r1 != 0) goto L_0x0106
            com.ss.android.ad.smartphone.a.a r0 = r0.f39681b
            r0.a()
            return
        L_0x0106:
            com.ss.android.ad.smartphone.a.a r0 = r0.f39681b
            r0.b()
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    public void onTabChanged(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57514, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z)}, this, changeQuickRedirect, false, 57514, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            Fragment a2 = this.mTabChangeManager.a();
            if (a2 != null) {
                a2.setUserVisibleHint(true);
            }
            setCanScrollOnTabChange(str3, a2);
            if (z) {
                this.mMainBottomTabView.a(str3);
            } else {
                MainBottomTabView mainBottomTabView = this.mMainBottomTabView;
                if (PatchProxy.isSupport(new Object[]{str3, str4}, mainBottomTabView, MainBottomTabView.f3526a, false, 57750, new Class[]{String.class, String.class}, Void.TYPE)) {
                    Object[] objArr = {str3, str4};
                    MainBottomTabView mainBottomTabView2 = mainBottomTabView;
                    PatchProxy.accessDispatch(objArr, mainBottomTabView2, MainBottomTabView.f3526a, false, 57750, new Class[]{String.class, String.class}, Void.TYPE);
                } else {
                    com.ss.android.b.a.a.a.b(new Runnable(str3, str4) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f54407a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f54408b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ String f54409c;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f54407a, false, 57776, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f54407a, false, 57776, new Class[0], Void.TYPE);
                            } else if (!TextUtils.equals(this.f54408b, this.f54409c) && !TextUtils.equals(this.f54408b, "PUBLISH")) {
                                if (MainBottomTabView.this.f3530e.get(this.f54408b) != null) {
                                    MainBottomTabView.this.f3530e.get(this.f54408b).d();
                                }
                                if (MainBottomTabView.this.f3530e.get(this.f54409c) != null) {
                                    MainBottomTabView.this.f3530e.get(this.f54409c).a();
                                }
                                if (!MainBottomTabView.this.f3529d) {
                                    MainBottomTabView.this.d(this.f54408b);
                                }
                            }
                        }

                        {
                            this.f54408b = r2;
                            this.f54409c = r3;
                        }
                    });
                }
            }
            a.c.f33271c = str3;
            if (!TextUtils.isEmpty(str) && !str3.equals("HOME")) {
                AwemeAppData.p().ai = true;
            }
            if (!(getCurFragment() instanceof MainFragment)) {
                com.ss.android.ugc.aweme.utils.bg.a(new com.ss.android.ugc.aweme.feed.f.l());
            }
            if (this.mAnimViewModel != null) {
                this.mAnimViewModel.f54179f.setValue(Boolean.valueOf(TextUtils.equals(str4, "HOME")));
            }
            if ("USER".equals(str3) && !this.mScrollSwitchHelper.b("page_setting")) {
                this.mScrollSwitchHelper.e();
            } else if (!"USER".equals(str3) && !this.mScrollSwitchHelper.b("page_profile")) {
                this.mScrollSwitchHelper.f();
            }
            if ("USER".equals(str3)) {
                tryDismissFissionPopupWindow();
            }
        }
    }

    static final /* synthetic */ void lambda$startAnimationAfterFollow$20$MainPageFragment(View view, float f2, float f3, ValueAnimator valueAnimator) {
        view.setTranslationX(f2 * ((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.setTranslationY(f3 * ((Float) valueAnimator.getAnimatedValue()).floatValue() * ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void startAnimationAfterFollow(View view, View view2, int i, int i2, int i3, int i4) {
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 57522, new Class[]{View.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {view3, view4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 57522, new Class[]{View.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(new com.ss.android.ugc.aweme.feed.adapter.c());
        int[] iArr = new int[2];
        view4.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + ((view2.getWidth() / 2) - (i3 / 2));
        iArr[1] = iArr[1] + ((view2.getHeight() / 2) - (i4 / 2));
        ofFloat.addUpdateListener(new ay(view3, (float) (iArr[0] - i), (float) (iArr[1] - i2)));
        ofFloat.setDuration(600);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.addUpdateListener(new az(view3));
        ofFloat2.setDuration(100);
        ofFloat2.setStartDelay(500);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 1.2f});
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{1.2f, 1.0f});
        ofFloat3.addUpdateListener(new ba(view4));
        ofFloat3.setDuration(120);
        ofFloat4.addUpdateListener(new bb(view4));
        ofFloat4.setDuration(200);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat2).before(ofFloat3);
        animatorSet.play(ofFloat3).before(ofFloat4);
        animatorSet.start();
    }
}
