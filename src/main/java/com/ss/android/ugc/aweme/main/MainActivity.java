package com.ss.android.ugc.aweme.main;

import a.i;
import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.DmtViewPager;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.benchmark.b;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.applog.z;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.d.d;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.feed.am;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashEvent;
import com.ss.android.ugc.aweme.commercialize.splash.g;
import com.ss.android.ugc.aweme.commercialize.utils.ab;
import com.ss.android.ugc.aweme.commercialize.utils.aj;
import com.ss.android.ugc.aweme.commercialize.utils.ak;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.f.ah;
import com.ss.android.ugc.aweme.feed.f.ai;
import com.ss.android.ugc.aweme.feed.f.ap;
import com.ss.android.ugc.aweme.feed.f.u;
import com.ss.android.ugc.aweme.feed.f.v;
import com.ss.android.ugc.aweme.feed.f.w;
import com.ss.android.ugc.aweme.feed.f.x;
import com.ss.android.ugc.aweme.feed.listener.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.s;
import com.ss.android.ugc.aweme.feed.share.command.CommandObserver;
import com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.feed.ui.NearByFragment;
import com.ss.android.ugc.aweme.feed.ui.au;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.iesapi.a;
import com.ss.android.ugc.aweme.k;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.legoImp.inflate.p;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.legoImp.service.DouDouService;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImp.task.ChannelUploadTask;
import com.ss.android.ugc.aweme.legoImp.task.InitCloudMessageTask;
import com.ss.android.ugc.aweme.legoImp.task.LogMainTask;
import com.ss.android.ugc.aweme.login.b.a;
import com.ss.android.ugc.aweme.login.ui.BannedDialogActivity;
import com.ss.android.ugc.aweme.main.NewsCountPresenter;
import com.ss.android.ugc.aweme.main.base.MainBottomTabView;
import com.ss.android.ugc.aweme.main.base.TabChangeManager;
import com.ss.android.ugc.aweme.main.base.TabType;
import com.ss.android.ugc.aweme.main.base.d;
import com.ss.android.ugc.aweme.main.base.mainpage.CommonPageFragment;
import com.ss.android.ugc.aweme.main.base.mainpage.MainPagerAdapter;
import com.ss.android.ugc.aweme.main.base.mainpage.view.ScrollableViewPager;
import com.ss.android.ugc.aweme.main.dialogmanager.HomeDialogManager;
import com.ss.android.ugc.aweme.main.page.PageManager;
import com.ss.android.ugc.aweme.main.page.TabClickCallBack;
import com.ss.android.ugc.aweme.net.b.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment;
import com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment;
import com.ss.android.ugc.aweme.newfollow.ui.FullScreenFollowFeedIn2TabFragment;
import com.ss.android.ugc.aweme.opensdk.share.a.a;
import com.ss.android.ugc.aweme.port.internal.PublishFragmentLifecycleCallbacks;
import com.ss.android.ugc.aweme.port.internal.ServiceConnectionImpl;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.profile.SlideSettingPageFragment;
import com.ss.android.ugc.aweme.profile.d.ac;
import com.ss.android.ugc.aweme.promote.PromoteProgramDialog;
import com.ss.android.ugc.aweme.requesttask.idle.AVCameraInitTask;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.l;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.publish.IPublishService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.e.a;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.shortvideo.PublishDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.publish.c;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.az;
import com.ss.android.ugc.aweme.utils.ba;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cy;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.db;
import com.ss.android.ugc.aweme.utils.dm;
import com.ss.android.ugc.aweme.utils.dn;
import com.ss.android.ugc.aweme.utils.ee;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.m;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@AddPageTrace
public class MainActivity extends AmeSSActivity implements com.ss.android.ugc.aweme.commercialize.symphony.a, s, d.a, com.ss.android.ugc.aweme.splash.a {
    private static final String TAG = "MainActivity";
    public static ChangeQuickRedirect changeQuickRedirect;
    public e adViewController;
    private DouDouService.a douDouListener;
    private boolean isPaused = true;
    private List<com.ss.android.ugc.aweme.base.activity.a> mActivityOnKeyDownListeners = new ArrayList();
    private MainPagerAdapter mAdapter;
    private boolean mAntiAddictiveChecked = false;
    private com.ss.android.ugc.aweme.profile.presenter.a mAvatarPresenter;
    public ViewGroup mAwesomeSplashMask = null;
    public int mAwesomeSplashStatus = 4;
    private boolean mAwesomeSplashStatusBgRecovered = false;
    private c mBinder;
    private k mBroadCastRegister;
    private boolean mCheckMinor = false;
    private boolean mCheckPass = false;
    private int mCommentDialogCount = 0;
    private long mCreateTime = -1;
    public Aweme mCurrentAweme;
    private DataCenter mDataCenter;
    @BindView(2131493982)
    DisLikeAwemeLayout mDisLikeAwemeLayout;
    private String mEventType = "homepage_hot";
    public boolean mGameHelperNoticeFetched = false;
    boolean mGuideShown;
    private boolean mIsFirstVisible = false;
    private boolean mIsLogin = false;
    public String mLastUserId;
    private bm mLazyedMainTabPreferences;
    private ai mMainHelper;
    private d.a mOnDeviceConfigUpdateListener;
    private String mPushAwemeId;
    private String mPushAwemeIds;
    private String mPushParams;
    private boolean mPushSettingDone = false;
    private boolean mResumed = false;
    public bu mScrollSwitchHelper;
    private com.ss.android.ugc.aweme.opensdk.share.presenter.b mShareIntentParseCenter;
    private boolean mShouldShowSlideSetting;
    private g mSplashLoadMaskHelper = new g(this);
    MainBottomTabView.a mTabClickListener = new MainBottomTabView.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54142a;

        public final boolean b(String str) {
            return false;
        }

        public final void a(@TabType String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f54142a, false, 57209, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f54142a, false, 57209, new Class[]{String.class}, Void.TYPE);
                return;
            }
            if (!TextUtils.equals(str, "HOME") && MainActivity.this.getMainTabPreferences().f(true)) {
                bg.a(new u(false));
            }
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1382453013) {
                if (hashCode == 2223327 && str.equals("HOME")) {
                    c2 = 0;
                }
            } else if (str.equals("NOTIFICATION")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    MainActivity.this.performHomeTabClick();
                    return;
                case 1:
                    if (!MainActivity.this.mGameHelperNoticeFetched) {
                        MainActivity.this.mGameHelperNoticeFetched = true;
                        com.ss.android.ugc.aweme.notification.b.c.i();
                        break;
                    }
                    break;
            }
        }
    };
    private boolean mToutiaoSettingDone = false;
    @BindView(2131498537)
    ScrollableViewPager mViewPager;
    private NewsCountPresenter newsPresenter = new NewsCountPresenter();
    private IPublishService.OnPublishCallback processedCallback = new IPublishService.OnPublishCallback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54161a;

        public final void onStopPublish() {
        }

        public final void onStartPublish() {
            if (PatchProxy.isSupport(new Object[0], this, f54161a, false, 57215, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54161a, false, 57215, new Class[0], Void.TYPE);
                return;
            }
            FragmentActivity activity = MainActivity.this.getActivity();
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{activity}, null, com.ss.android.ugc.aweme.promote.b.f63236a, true, 70168, new Class[]{Activity.class}, PromoteProgramDialog.class)) {
                PromoteProgramDialog promoteProgramDialog = (PromoteProgramDialog) PatchProxy.accessDispatch(new Object[]{activity}, null, com.ss.android.ugc.aweme.promote.b.f63236a, true, 70168, new Class[]{Activity.class}, PromoteProgramDialog.class);
            } else if (activity != null && !activity.isFinishing() && com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                if (com.ss.android.ugc.aweme.promote.b.f63237b != null) {
                    com.ss.android.ugc.aweme.promote.b.f63237b.dismiss();
                    com.ss.android.ugc.aweme.promote.b.f63237b = null;
                }
                if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.promote.b.f63236a, true, 70170, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.promote.b.f63236a, true, 70170, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    Boolean bool = (Boolean) SharePrefCache.inst().getPromoteDialogShouldShow().c();
                    if (bool != null && bool.booleanValue()) {
                        String string = com.ss.android.ugc.aweme.promote.b.a().getString("uid", "");
                        String curUserId = com.ss.android.ugc.aweme.account.d.a().getCurUserId();
                        if (TextUtils.isEmpty(string)) {
                            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.promote.b.a().edit();
                            edit.putString("uid", curUserId);
                            edit.apply();
                            string = curUserId;
                        }
                        if (!string.equals(curUserId)) {
                            SharedPreferences.Editor edit2 = com.ss.android.ugc.aweme.promote.b.a().edit();
                            edit2.putBoolean("joined", false);
                            edit2.putString("uid", curUserId);
                            edit2.putInt("popup_times", 0);
                            edit2.putLong("popup_last_time", 0);
                            edit2.apply();
                        }
                        if (!com.ss.android.ugc.aweme.promote.b.a().getBoolean("joined", false)) {
                            int i = com.ss.android.ugc.aweme.promote.b.a().getInt("popup_times", 0);
                            long j = com.ss.android.ugc.aweme.promote.b.a().getLong("popup_last_time", 0);
                            Integer num = (Integer) SharePrefCache.inst().getPromoteDialogPopupPopupInterval().c();
                            if (i < ((Integer) SharePrefCache.inst().getPromoteDialogPopupTimesLimit().c()).intValue() && System.currentTimeMillis() - j > ((long) (num.intValue() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE * 3600 * 24))) {
                                SharedPreferences.Editor edit3 = com.ss.android.ugc.aweme.promote.b.a().edit();
                                edit3.putInt("popup_times", i + 1);
                                edit3.putLong("popup_last_time", System.currentTimeMillis());
                                edit3.apply();
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (com.ss.android.g.a.b()) {
                        com.ss.android.ugc.aweme.promote.b.f63237b = new PromoteProgramDialog(activity, "", (byte) 0);
                    } else {
                        UIUtils.dip2Px(com.ss.android.ugc.aweme.base.utils.d.a(), 52.0f);
                        com.ss.android.ugc.aweme.promote.b.f63237b = new PromoteProgramDialog(activity, "");
                    }
                    com.ss.android.ugc.aweme.promote.b.f63237b.setOnDismissListener(new DialogInterface.OnDismissListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f63239a;

                        public final void onDismiss(DialogInterface dialogInterface) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f63239a, false, 70172, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f63239a, false, 70172, new Class[]{DialogInterface.class}, Void.TYPE);
                                return;
                            }
                            SharePrefCache.inst().getShowPromoteLicense().a(0);
                            b.f63237b = null;
                        }
                    });
                    r.a("creative_permission_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
                    com.ss.android.ugc.aweme.promote.b.f63237b.show();
                    PromoteProgramDialog promoteProgramDialog2 = com.ss.android.ugc.aweme.promote.b.f63237b;
                }
            }
        }
    };
    private boolean splashToStoryCamera;
    private long splashTriggerAt = 0;

    class ToastTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public f type() {
            return f.BOOT_FINISH;
        }

        private ToastTask() {
        }

        public void run(@NotNull Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 57227, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 57227, new Class[]{Context.class}, Void.TYPE);
            } else if (MainActivity.this.mAwesomeSplashStatus != 1 && MainActivity.this.mAwesomeSplashStatus != 2) {
                com.ss.android.ugc.aweme.framework.a.a.a("ToastTask");
                long d2 = com.ss.android.ugc.aweme.aj.b.b().d(MainActivity.this, "red_point_count");
                if (d2 > 0) {
                    com.bytedance.ies.dmt.ui.d.a.c((Context) MainActivity.this, MainActivity.this.getString(C0906R.string.bym, new Object[]{Long.valueOf(d2)})).a();
                    n.a("log_red_badge", "click", com.ss.android.ugc.aweme.app.d.c.a().a("count", String.valueOf(d2)).b());
                    r.onEvent(MobClick.obtain().setEventName("red_badge").setLabelName("click").setValue(String.valueOf(d2)));
                    com.ss.android.ugc.aweme.aj.b.b().a((Context) MainActivity.this, "red_point_count", 0);
                }
                if (AbTestManager.e()) {
                    com.bytedance.ies.dmt.ui.d.a.a((Context) MainActivity.this, MainActivity.this.getString(C0906R.string.a2)).a();
                }
            }
        }
    }

    static class a extends cg<MainActivity> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54170a;

        a(MainActivity mainActivity) {
            super(mainActivity);
        }

        public final /* synthetic */ void a(Object obj) {
            MainActivity mainActivity = (MainActivity) obj;
            if (PatchProxy.isSupport(new Object[]{mainActivity}, this, f54170a, false, 57224, new Class[]{MainActivity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mainActivity}, this, f54170a, false, 57224, new Class[]{MainActivity.class}, Void.TYPE);
            } else if (mainActivity != null && !mainActivity.isFinishing()) {
                AlertDialog a2 = bc.a(mainActivity, C0906R.string.drj, C0906R.string.pm, new r(mainActivity), C0906R.string.a0v, new s(mainActivity));
                a2.setCanceledOnTouchOutside(false);
                a2.setCancelable(false);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54171a;

        private b() {
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54171a, false, 57228, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54171a, false, 57228, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.user.util.b.a().b();
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static Intent getMainActivityIntent(Context context) {
        return null;
    }

    public FragmentActivity getActivity() {
        return this;
    }

    public boolean isInTeenagerMode() {
        return true;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public boolean isSplashShowing() {
        return false;
    }

    public c getBinder() {
        return this.mBinder;
    }

    public e getHelper() {
        return this.mScrollSwitchHelper;
    }

    public IPublishService.OnPublishCallback getProcessedCallback() {
        return this.processedCallback;
    }

    public boolean isSplashToStoryCamera() {
        return this.splashToStoryCamera;
    }

    public String getPushAwemeId() {
        String str = this.mPushAwemeId;
        this.mPushAwemeId = null;
        return str;
    }

    public String getPushAwemeIds() {
        String str = this.mPushAwemeIds;
        this.mPushAwemeIds = null;
        return str;
    }

    public String getPushParams() {
        String str = this.mPushParams;
        this.mPushParams = null;
        return str;
    }

    public boolean isInMaskLayer() {
        if (this.mDisLikeAwemeLayout == null || !this.mDisLikeAwemeLayout.m) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$1$MainActivity() {
        com.ss.android.ugc.aweme.lego.a.i.a().a(new ToastTask()).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$onCreate$2$MainActivity() throws Exception {
        getApplicationContext();
        com.ss.android.common.applog.k.a();
        com.ss.android.ugc.aweme.app.c.a.c.a().a().a(1);
        com.ss.android.ugc.aweme.app.c.c.b.a();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$onDestroy$7$MainActivity() throws Exception {
        getApplicationContext();
        com.ss.android.ugc.aweme.app.c.a.c.a().a().a(2);
        return null;
    }

    private void changeTabToFollowAfterPublish() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57183, new Class[0], Void.TYPE);
            return;
        }
        this.mDataCenter.a("changeTabToFollowAfterPublish", (Object) null);
        bg.a(new com.ss.android.ugc.aweme.commerce.service.f.b());
    }

    @MeasureFunction
    private void createMainHelper() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57100, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57100, new Class[0], Void.TYPE);
            return;
        }
        this.mMainHelper = new ai(this);
        this.mMainHelper.a();
    }

    private void handleMainPageResume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57169, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57169, new Class[0], Void.TYPE);
            return;
        }
        this.mDataCenter.a("handlePageResume", (Object) null);
    }

    private void hideStatusBar() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57154, new Class[0], Void.TYPE);
            return;
        }
        getWindow().addFlags(1024);
        hideCustomToastStatusBar();
    }

    @MeasureFunction
    private void initCloudControl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57119, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57119, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.lego.a.i.a().a(new InitCloudMessageTask()).a();
    }

    @MeasureFunction
    private void initDataCenter() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57098, new Class[0], Void.TYPE);
            return;
        }
        this.mDataCenter = DataCenter.a(ViewModelProviders.of((FragmentActivity) this), (LifecycleOwner) this);
    }

    @MeasureFunction
    private void initDislikeView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57122, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57122, new Class[0], Void.TYPE);
            return;
        }
        this.mDisLikeAwemeLayout.setListener(new DisLikeAwemeLayout.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54147a;

            public final void a(boolean z) {
                if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f54147a, false, 57221, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f54147a, false, 57221, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                MainActivity.this.exitDislikeMode();
            }
        });
    }

    @MeasureFunction
    private void pushAuthorityMonitor() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57125, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57125, new Class[0], Void.TYPE);
        } else if (cy.a(this)) {
            n.a("aweme_push_authority_rate", 0, (JSONObject) null);
        } else {
            n.a("aweme_push_authority_rate", 1, (JSONObject) null);
        }
    }

    private void recordLaunchDate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57097, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57097, new Class[0], Void.TYPE);
            return;
        }
        i.a(3000).b(new l(this), i.f1051a);
    }

    @MeasureFunction
    private void setSplashSkipView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57104, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57104, new Class[0], Void.TYPE);
            return;
        }
        View findViewById = findViewById(C0906R.id.is);
        if (findViewById != null) {
            findViewById.setOnClickListener(new m(this));
        }
    }

    private void setupTheme() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57096, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57096, new Class[0], Void.TYPE);
            return;
        }
        setTheme(C0906R.style.l4);
        getWindow().setBackgroundDrawableResource(C0906R.color.a25);
    }

    @MeasureFunction
    private void showStatusBar() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57155, new Class[0], Void.TYPE);
            return;
        }
        getWindow().clearFlags(1024);
        showCustomToastStatusBar();
        StatusBarUtils.setTransparent(this);
    }

    private void showUpdateUserDialog() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57192, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57192, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.commercialize.utils.c.Q(this.mCurrentAweme)) {
            if (this.mAvatarPresenter == null) {
                this.mAvatarPresenter = new com.ss.android.ugc.aweme.profile.presenter.a();
            }
            ac.a(this, this.mAvatarPresenter, null, false);
        }
    }

    @MeasureFunction
    private void uploadContact() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57124, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new b((byte) 0));
    }

    public Fragment getCurFragment() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57159, new Class[0], Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57159, new Class[0], Fragment.class);
        } else if (getTabChangeManager() == null) {
            return null;
        } else {
            return getTabChangeManager().a();
        }
    }

    public FeedRecommendFragment getCurrentFeedRecommendFragment() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57120, new Class[0], FeedRecommendFragment.class)) {
            return (FeedRecommendFragment) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57120, new Class[0], FeedRecommendFragment.class);
        }
        Fragment curFragment = getCurFragment();
        if (curFragment instanceof MainFragment) {
            FeedFragment a2 = ((MainFragment) curFragment).a();
            if (a2 instanceof FeedRecommendFragment) {
                return (FeedRecommendFragment) a2;
            }
        }
        return null;
    }

    public IFeedViewHolder getCurrentViewHolder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57121, new Class[0], IFeedViewHolder.class)) {
            return (IFeedViewHolder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57121, new Class[0], IFeedViewHolder.class);
        }
        FeedRecommendFragment currentFeedRecommendFragment = getCurrentFeedRecommendFragment();
        if (currentFeedRecommendFragment == null) {
            return null;
        }
        return currentFeedRecommendFragment.j();
    }

    public TabChangeManager getTabChangeManager() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57153, new Class[0], TabChangeManager.class)) {
            return TabChangeManager.a(getActivity());
        }
        return (TabChangeManager) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57153, new Class[0], TabChangeManager.class);
    }

    public void hideAutoPlayTab() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57186, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57186, new Class[0], Void.TYPE);
            return;
        }
        this.mDataCenter.a("hideAutoPlayTab", (Object) null);
    }

    public void hideNotificationCountView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57187, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57187, new Class[0], Void.TYPE);
            return;
        }
        this.mDataCenter.a("hideNotificationCountView", (Object) null);
    }

    public boolean isFeedPage() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57157, new Class[0], Boolean.TYPE)) {
            return this.mScrollSwitchHelper.j();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57157, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isInDiscoveryPage() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57180, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57180, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mScrollSwitchHelper != null && TextUtils.equals(this.mScrollSwitchHelper.b(), "page_discover")) {
            z = true;
        }
        return z;
    }

    public boolean isMainPageVisible() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57175, new Class[0], Boolean.TYPE)) {
            return bj.a(this.mAdapter);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57175, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isProfilePage() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57158, new Class[0], Boolean.TYPE)) {
            return this.mScrollSwitchHelper.k();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57158, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isUnderMainTab() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57170, new Class[0], Boolean.TYPE)) {
            return "HOME".equals(getTabChangeManager().f54419e);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57170, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isUnderNearbyTab() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57176, new Class[0], Boolean.TYPE)) {
            return "NEARBY".equals(getTabChangeManager().f54419e);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57176, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isUnderProfileTab() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57179, new Class[0], Boolean.TYPE)) {
            return "USER".equals(getTabChangeManager().f54419e);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57179, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isUnderSecondTab() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57177, new Class[0], Boolean.TYPE)) {
            return "FOLLOW".equals(getTabChangeManager().f54419e);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57177, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isUnderThirdTab() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57178, new Class[0], Boolean.TYPE)) {
            return "NOTIFICATION".equals(getTabChangeManager().f54419e);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57178, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57144, new Class[0], Void.TYPE);
            return;
        }
        this.mMainHelper.d();
        this.mDataCenter.a("exitGuideView", (Object) Boolean.FALSE);
        exitDislikeMode();
    }

    public void onFeedRecommendFragmentReady() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57189, new Class[0], Void.TYPE);
            return;
        }
        fitAwesomeSplash();
    }

    public void onKeyBack() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57163, new Class[0], Void.TYPE);
            return;
        }
        this.mScrollSwitchHelper.i();
    }

    @MeasureFunction
    public void onSplashFinish() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57188, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57188, new Class[0], Void.TYPE);
            return;
        }
        IFeedViewHolder currentViewHolder = getCurrentViewHolder();
        if (!(currentViewHolder == null || currentViewHolder.t() == null)) {
            currentViewHolder.t().J();
        }
    }

    public void performHomeTabClick() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57094, new Class[0], Void.TYPE);
            return;
        }
        setCanScroll(true);
        refreshSlideSwitchCanScrollRight();
        setCanScrollToProfile();
        setAdScrollRightControl();
    }

    public void playHomeAddBtnAnim() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57129, new Class[0], Void.TYPE);
            return;
        }
        this.mDataCenter.a("playHomeAddBtnAnim", (Object) null);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57150, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, Integer.MIN_VALUE);
        }
    }

    public void tryShowLiveTakeBubble() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57132, new Class[0], Void.TYPE);
            return;
        }
        CommonPageFragment d2 = this.mAdapter.d("page_home");
        if (d2 != null && (d2 instanceof HomeFragment)) {
            ((HomeFragment) d2).b().tryShowLiveBubble();
        }
    }

    public boolean tryShowLongClickGuideView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57133, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57133, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.mDataCenter.a("tryShowLongClickGuideView", (Object) null);
        return false;
    }

    @MeasureFunction
    private void ensureDouDetector() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57106, new Class[0], Void.TYPE);
            return;
        }
        DouDouService douDouService = (DouDouService) com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class);
        douDouService.ensureDouDetector();
        if (this.douDouListener == null) {
            this.douDouListener = new DouDouService.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54165a;

                public final boolean a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f54165a, false, 57217, new Class[0], Boolean.TYPE)) {
                        return MainActivity.this.performOndou();
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54165a, false, 57217, new Class[0], Boolean.TYPE)).booleanValue();
                }
            };
            douDouService.setDouDouListener(this.douDouListener);
        }
        PageManager.a(this, this, new n(douDouService));
    }

    private boolean fakeJumpToOpenUrl() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57173, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57173, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.ugc.aweme.commercialize.utils.c.G(this.mCurrentAweme) && com.ss.android.ugc.aweme.commercialize.utils.g.b((Context) getActivity(), this.mCurrentAweme)) {
            z = true;
        }
        return z;
    }

    @MeasureFunction
    private void goProfile() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57126, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57126, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.aj.b.b().b((Context) this, "is_go_profile", true)) {
            com.ss.android.ugc.aweme.aj.b.b().a((Context) this, "is_go_profile", false);
            String string = com.ss.android.ugc.aweme.q.c.a(this, "applog_stats", 0).getString("app_track", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    h.a().a((Activity) this, new JSONObject(string).optString("openurl"));
                } catch (JSONException unused) {
                }
            }
        }
    }

    private boolean hasDialogShowing() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57110, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57110, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!(getCurFragment() instanceof MainFragment)) {
            return true;
        } else {
            FeedFragment a2 = ((MainFragment) getCurFragment()).a();
            if (!(a2 instanceof FeedRecommendFragment)) {
                return false;
            }
            FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) a2;
            if (feedRecommendFragment.p() || com.ss.android.ugc.aweme.commercialize.utils.n.a(feedRecommendFragment.getFragmentManager())) {
                return true;
            }
            return false;
        }
    }

    private void larksso() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57099, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.login.b.a.f53744a, true, 56379, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.login.b.a.f53744a, true, 56379, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(this, "context");
        new Handler().postDelayed(new a.c(this), TimeUnit.SECONDS.toMillis(1));
    }

    @MeasureFunction
    private void logLogMain() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57101, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57101, new Class[0], Void.TYPE);
            return;
        }
        if (db.a().a(da.LOAD_MAIN)) {
            com.ss.android.ugc.aweme.lego.a.i.a().a(new LogMainTask()).a();
        }
    }

    @MeasureFunction
    private void postPreinstallChannelEvent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57102, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57102, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.aj.b.b().b((Context) this, "is_upload_pre_info", true)) {
            if (!TextUtils.isEmpty(z.a())) {
                uploadChannel();
            } else {
                this.mOnDeviceConfigUpdateListener = new d.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f54163a;

                    public final void a(boolean z) {
                    }

                    public final void a(boolean z, boolean z2) {
                    }

                    public final void a(String str, String str2) {
                        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f54163a, false, 57216, new Class[]{String.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f54163a, false, 57216, new Class[]{String.class, String.class}, Void.TYPE);
                            return;
                        }
                        MainActivity.this.uploadChannel();
                    }
                };
                com.ss.android.d.d.a(this.mOnDeviceConfigUpdateListener);
            }
        }
    }

    @MeasureFunction
    private void resetWindowBackgroundFromFakeSplash() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57117, new Class[0], Void.TYPE);
            return;
        }
        getWindow().setBackgroundDrawableResource(C0906R.color.a25);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
        }
        g gVar = this.mSplashLoadMaskHelper;
        if (PatchProxy.isSupport(new Object[0], gVar, g.f39463a, false, 32017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], gVar, g.f39463a, false, 32017, new Class[0], Void.TYPE);
            return;
        }
        if (!(gVar.f39464b == null || gVar.f39465c == null)) {
            gVar.f39464b.removeView(gVar.f39465c);
        }
    }

    private void setAdScrollRightControl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57167, new Class[0], Void.TYPE);
        } else if (!this.adViewController.a() || this.adViewController.d()) {
            if (this.adViewController.d()) {
                setCanScrollToProfile();
            } else {
                this.mScrollSwitchHelper.c(false);
            }
        } else if (com.ss.android.ugc.aweme.commercialize.utils.c.F(this.mCurrentAweme).booleanValue()) {
            this.mScrollSwitchHelper.c(false);
        } else if (this.adViewController.b()) {
            this.mScrollSwitchHelper.c(true);
        } else {
            this.mScrollSwitchHelper.c(false);
        }
    }

    private void setCanScrollToProfile() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57118, new Class[0], Void.TYPE);
            return;
        }
        if (this.mScrollSwitchHelper != null) {
            Fragment a2 = getTabChangeManager().a();
            if (a2 != null && (a2 instanceof MainFragment)) {
                FeedFragment a3 = ((MainFragment) a2).a();
                if (a3 != null && (a3 instanceof NearByFragment)) {
                    this.mScrollSwitchHelper.c(false);
                    return;
                }
            }
            this.mScrollSwitchHelper.c(true);
        }
    }

    private boolean shouldContinueUpload() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57143, new Class[0], Boolean.TYPE)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isPublishServiceRunning(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57143, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void exitDislikeMode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57145, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57145, new Class[0], Void.TYPE);
            return;
        }
        this.mDisLikeAwemeLayout.b(false);
        this.mDisLikeAwemeLayout.setInDislikeMode(false);
        this.mDataCenter.a("ENTER_DISLIKE_MODE", (Object) Boolean.FALSE);
        bg.a(new com.ss.android.ugc.aweme.feed.f.i(false, 1, hashCode()));
    }

    public String getEnterFromPage() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57181, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57181, new Class[0], String.class);
        }
        String str = "homepage_hot";
        if (isUnderSecondTab()) {
            str = "homepage_friends";
            if (getCurFragment() instanceof FriendTabFragment) {
                if (((FriendTabFragment) getCurFragment()).h()) {
                    str = "homepage_friends";
                } else {
                    str = "homepage_follow";
                }
            } else if (getCurFragment() instanceof FullScreenFollowFeedIn2TabFragment) {
                str = "homepage_follow";
            }
        } else if (isUnderThirdTab()) {
            str = "homepage_message";
        } else if (isUnderProfileTab()) {
            str = "personal_homepage";
        }
        return str;
    }

    public bm getMainTabPreferences() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57193, new Class[0], bm.class)) {
            return (bm) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57193, new Class[0], bm.class);
        }
        if (this.mLazyedMainTabPreferences == null) {
            this.mLazyedMainTabPreferences = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(com.ss.android.ugc.aweme.app.i.a().getContext(), bm.class);
        }
        return this.mLazyedMainTabPreferences;
    }

    public boolean isMainTabVisible() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57174, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57174, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isUnderMainTab() || this.mScrollSwitchHelper == null || !TextUtils.equals(this.mScrollSwitchHelper.b(), "page_home") || !bj.a(this.mAdapter)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isPaused() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57194, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57194, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.isPaused || SystemClock.uptimeMillis() < this.splashTriggerAt + 2000) {
            return true;
        } else {
            return false;
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57112, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        ag.i().h();
        LocalVideoPlayerManager.a().b();
        if (!com.aweme.storage.c.f7378a) {
            i.a((Callable<TResult>) new Callable<Object>(getApplicationContext()) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Context f7384a;

                /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object call() throws java.lang.Exception {
                    /*
                        r11 = this;
                        android.content.Context r0 = r11.f7384a
                        boolean r1 = com.aweme.storage.c.f7378a
                        if (r1 != 0) goto L_0x0093
                        if (r0 != 0) goto L_0x000a
                        goto L_0x0093
                    L_0x000a:
                        com.aweme.storage.h r1 = com.aweme.storage.c.f7381d
                        if (r1 == 0) goto L_0x0093
                        com.aweme.storage.h r1 = com.aweme.storage.c.f7381d
                        boolean r1 = r1.c()
                        if (r1 == 0) goto L_0x0093
                        r1 = 0
                        r3 = 1
                        r4 = 0
                        if (r0 == 0) goto L_0x0047
                        java.lang.String r5 = "clean_storage_pref"
                        android.content.SharedPreferences r5 = com.ss.android.ugc.aweme.q.c.a(r0, r5, r4)
                        java.lang.String r6 = "key_clean_date"
                        long r5 = r5.getLong(r6, r1)
                        com.aweme.storage.a r7 = com.aweme.storage.c.f7380c
                        if (r7 == 0) goto L_0x0039
                        int r8 = r7.f7363a
                        if (r8 <= 0) goto L_0x0039
                        int r7 = r7.f7363a
                        long r7 = (long) r7
                        r9 = 3600000(0x36ee80, double:1.7786363E-317)
                        long r7 = r7 * r9
                        goto L_0x003c
                    L_0x0039:
                        r7 = 259200000(0xf731400, double:1.280618154E-315)
                    L_0x003c:
                        long r9 = java.lang.System.currentTimeMillis()
                        long r9 = r9 - r5
                        int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                        if (r5 <= 0) goto L_0x0047
                        r5 = 1
                        goto L_0x0048
                    L_0x0047:
                        r5 = 0
                    L_0x0048:
                        if (r5 == 0) goto L_0x0093
                        com.aweme.storage.c.f7378a = r3
                        int r5 = android.os.Build.VERSION.SDK_INT
                        r6 = 26
                        if (r5 < r6) goto L_0x0089
                        boolean r5 = com.aweme.storage.CompatJobService.f7355a     // Catch:{ Exception -> 0x007c }
                        if (r5 != 0) goto L_0x0093
                        com.aweme.storage.CompatJobService.f7355a = r3     // Catch:{ Exception -> 0x007c }
                        android.app.job.JobInfo$Builder r3 = new android.app.job.JobInfo$Builder     // Catch:{ Exception -> 0x007c }
                        android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ Exception -> 0x007c }
                        java.lang.Class<com.aweme.storage.CompatJobService> r6 = com.aweme.storage.CompatJobService.class
                        r5.<init>(r0, r6)     // Catch:{ Exception -> 0x007c }
                        r3.<init>(r4, r5)     // Catch:{ Exception -> 0x007c }
                        r3.setMinimumLatency(r1)     // Catch:{ Exception -> 0x007c }
                        r1 = 3000(0xbb8, double:1.482E-320)
                        r3.setOverrideDeadline(r1)     // Catch:{ Exception -> 0x007c }
                        java.lang.String r1 = "jobscheduler"
                        java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x007c }
                        android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0     // Catch:{ Exception -> 0x007c }
                        android.app.job.JobInfo r1 = r3.build()     // Catch:{ Exception -> 0x007c }
                        r0.schedule(r1)     // Catch:{ Exception -> 0x007c }
                        goto L_0x0093
                    L_0x007c:
                        org.json.JSONObject r0 = new org.json.JSONObject
                        r0.<init>()
                        java.lang.String r1 = "model"
                        java.lang.String r2 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x0093 }
                        r0.put(r1, r2)     // Catch:{ JSONException -> 0x0093 }
                        goto L_0x0093
                    L_0x0089:
                        android.content.Intent r1 = new android.content.Intent
                        java.lang.Class<com.aweme.storage.JobService> r2 = com.aweme.storage.JobService.class
                        r1.<init>(r0, r2)
                        r0.startService(r1)
                    L_0x0093:
                        r0 = 0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.c.AnonymousClass1.call():java.lang.Object");
                }

                {
                    this.f7384a = r1;
                }
            });
        }
    }

    @MeasureFunction
    public boolean performOndou() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57107, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57107, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (isProfilePage()) {
            return false;
        } else {
            performSplashSkipClick(true);
            Intent intent = new Intent();
            intent.putExtra("enter_method", "shake");
            intent.putExtra("enter_from", getEnterFromPage());
            ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).launchRecord(this, intent);
            hideNotificationCountView();
            return true;
        }
    }

    public boolean tryShowGuideView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57131, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57131, new Class[0], Boolean.TYPE)).booleanValue();
        }
        CommonPageFragment d2 = this.mAdapter.d("page_home");
        if (d2 == null || !(d2 instanceof HomeFragment)) {
            return false;
        }
        return ((HomeFragment) d2).b().tryShowGuideView();
    }

    public void uploadChannel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57103, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.lego.a.i.a().a(new ChannelUploadTask()).a();
        com.ss.android.ugc.aweme.aj.b.b().a((Context) this, "is_upload_pre_info", false);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57108, new Class[0], Void.TYPE);
            return;
        }
        NewsCountPresenter newsCountPresenter = this.newsPresenter;
        if (PatchProxy.isSupport(new Object[0], newsCountPresenter, NewsCountPresenter.f54265a, false, 57593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], newsCountPresenter, NewsCountPresenter.f54265a, false, 57593, new Class[0], Void.TYPE);
        } else {
            LocalBroadcastManager.getInstance(GlobalContext.getContext()).unregisterReceiver(newsCountPresenter.f54267c);
        }
        super.onDestroy();
        com.ss.android.di.push.a.a().onLastActivityDestroy(getApplicationContext());
        com.bytedance.ies.x2c.d.f20874a.remove(com.bytedance.ies.x2c.d.a(this));
        i.a((Callable<TResult>) new o<TResult>(this), (Executor) com.ss.android.ugc.aweme.thread.h.g());
        com.ss.android.ugc.aweme.video.u.a().d();
        if (!o.v()) {
            o.b().j();
        } else {
            com.ss.android.ugc.playerkit.videoview.a.a().c();
        }
        com.ss.android.ugc.aweme.commercialize.splash.a.a().f39440d = false;
        com.ss.android.ugc.aweme.commercialize.splash.a.a().d();
        AwemeAppData.p().ag = false;
        ((DouDouService) com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class)).onDestroy();
        if (!(this.mBroadCastRegister == null || getApplication() == null)) {
            this.mBroadCastRegister.c(getApplication());
        }
    }

    public void onPause() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57109, new Class[0], Void.TYPE);
            return;
        }
        boolean z2 = true;
        this.isPaused = true;
        ag.i().h();
        this.mResumed = false;
        super.onPause();
        AwemeAppData.p().ai = true;
        ((DouDouService) com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class)).onPause();
        com.ss.android.ugc.aweme.commercialize.splash.a a2 = com.ss.android.ugc.aweme.commercialize.splash.a.a();
        if (this.mCommentDialogCount > 0 || hasDialogShowing() || isInMaskLayer()) {
            z = true;
        } else {
            z = false;
        }
        a2.f39440d = z;
        com.ss.android.ugc.aweme.commercialize.splash.a a3 = com.ss.android.ugc.aweme.commercialize.splash.a.a();
        if (!bj.a(this.mAdapter) || !isFeedPage() || !(getCurFragment() instanceof MainFragment) || !((MainFragment) getCurFragment()).l()) {
            z2 = false;
        }
        a3.f39441e = z2;
        IFeedViewHolder currentViewHolder = getCurrentViewHolder();
        if (!(currentViewHolder == null || currentViewHolder.d() == null)) {
            com.ss.android.ugc.aweme.commercialize.splash.a.a().f39442f = currentViewHolder.d().isEnableTopView();
        }
        com.ss.android.ugc.aweme.commercialize.splash.a.a().m = false;
        com.ss.android.ugc.aweme.commercialize.splash.a.a().j = false;
    }

    public void refreshSlideSwitchCanScrollRight() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57171, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57171, new Class[0], Void.TYPE);
            return;
        }
        if (this.mScrollSwitchHelper != null) {
            Fragment a2 = getTabChangeManager().a();
            if ((a2 instanceof FullScreenFollowFeedIn2TabFragment) && MainPageExperimentHelper.b()) {
                this.mScrollSwitchHelper.c(true);
            } else if (a2 == null) {
                this.mScrollSwitchHelper.c(false);
            } else if (!(a2 instanceof MainFragment)) {
                this.mScrollSwitchHelper.c(false);
            } else {
                FeedFragment a3 = ((MainFragment) a2).a();
                if (a3 == null || (!(a3 instanceof FeedFollowFragment) && !(a3 instanceof FeedRecommendFragment))) {
                    this.adViewController.k();
                    this.mScrollSwitchHelper.c(false);
                } else {
                    e eVar = this.adViewController;
                    if (PatchProxy.isSupport(new Object[]{this}, eVar, e.f38827a, false, 30586, new Class[]{Context.class}, Void.TYPE)) {
                        e eVar2 = eVar;
                        PatchProxy.accessDispatch(new Object[]{this}, eVar2, e.f38827a, false, 30586, new Class[]{Context.class}, Void.TYPE);
                    } else {
                        eVar.a((Context) this, eVar.f38828b);
                    }
                    setAdScrollRightControl();
                }
            }
        }
    }

    @MeasureFunction
    private void initView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57127, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, az.f75574a, true, 88209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, az.f75574a, true, 88209, new Class[0], Void.TYPE);
        } else if (!az.f75575b) {
            com.ss.android.ugc.aweme.app.k a2 = com.ss.android.ugc.aweme.app.k.a();
            if (a2 != null) {
                try {
                    com.benchmark.b a3 = com.benchmark.b.a((Context) a2);
                    ba baVar = new ba(a2);
                    if (a3.h == null) {
                        if (a3.f7464f == null) {
                            if (a3.f7462d == null) {
                                a3.f7462d = new b.d(baVar);
                            }
                            a3.f7464f = new b.c(a3.f7462d);
                        }
                        a3.a(1, a3.f7464f);
                    } else {
                        a3.h.a(a3.f7462d);
                    }
                } catch (RemoteException unused) {
                    az.a(a2, null);
                }
                az.f75575b = true;
            }
        }
        MainPagerAdapter.a aVar = new MainPagerAdapter.a();
        if (TimeLockRuler.isInTeenagerModeNewVersion()) {
            aVar.a(HomeFragment.class, "page_home").a(ProfilePageFragment.class, "page_profile", 1, 1.0f).a(SlideSettingPageFragment.class, "page_setting", 1, 0.666f);
        } else {
            aVar.a(HomeFragment.class, "page_home").a(ProfilePageFragment.class, "page_profile", 1, 1.0f).a(SlideSettingPageFragment.class, "page_setting", 1, 0.666f);
        }
        this.mAdapter = aVar.a(getSupportFragmentManager());
        this.mViewPager.setOffscreenPageLimit(3);
        com.ss.android.ugc.aweme.main.base.h hVar = new com.ss.android.ugc.aweme.main.base.h(getActivity());
        ScrollableViewPager scrollableViewPager = this.mViewPager;
        if (PatchProxy.isSupport(new Object[]{scrollableViewPager}, hVar, com.ss.android.ugc.aweme.main.base.h.f54439a, false, 57816, new Class[]{DmtViewPager.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.main.base.h hVar2 = hVar;
            PatchProxy.accessDispatch(new Object[]{scrollableViewPager}, hVar2, com.ss.android.ugc.aweme.main.base.h.f54439a, false, 57816, new Class[]{DmtViewPager.class}, Void.TYPE);
        } else {
            try {
                scrollableViewPager.setScroller(hVar);
            } catch (Exception unused2) {
            }
        }
        this.mViewPager.setAdapter(this.mAdapter);
        this.mAdapter.notifyDataSetChanged();
        this.mScrollSwitchHelper = new bu(this, this.mViewPager, this.mAdapter);
        getActivity();
        bu buVar = this.mScrollSwitchHelper;
        if (PatchProxy.isSupport(new Object[0], buVar, bu.f54648a, false, 57657, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], buVar, bu.f54648a, false, 57657, new Class[0], Void.TYPE);
        } else {
            buVar.j.setDescendantFocusability(131072);
            buVar.j.setFocusable(true);
            buVar.j.setFocusableInTouchMode(true);
            buVar.j.setOnTouchListener(new View.OnTouchListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54656a;

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f54656a, false, 57705, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f54656a, false, 57705, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                    }
                    view.requestFocusFromTouch();
                    return false;
                }
            });
        }
        this.mScrollSwitchHelper.c(this.mEventType);
        this.mScrollSwitchHelper.a("page_home", false);
        this.mScrollSwitchHelper.a((j) new j() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54149a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f54149a, false, 57222, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f54149a, false, 57222, new Class[0], Void.TYPE);
                    return;
                }
                if (!(MainActivity.this.mScrollSwitchHelper == null || MainActivity.this.adViewController == null || !MainActivity.this.mScrollSwitchHelper.j())) {
                    MainActivity.this.adViewController.h();
                }
            }
        });
        this.mScrollSwitchHelper.m = new com.ss.android.ugc.aweme.feed.listener.k() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54151a;

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54151a, false, 57210, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54151a, false, 57210, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (TextUtils.equals(MainActivity.this.mScrollSwitchHelper.a(i), "page_profile") && MainActivity.this.mCurrentAweme != null) {
                    MainActivity.this.adViewController.i();
                    if (MainActivity.this.mScrollSwitchHelper != null && MainActivity.this.mCurrentAweme.isAd()) {
                        MainActivity.this.mCurrentAweme.withFakeUser();
                    }
                }
            }
        };
        if (this.mShouldShowSlideSetting) {
            this.mScrollSwitchHelper.e();
        }
    }

    @MeasureFunction
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57111, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57111, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", true);
        ag i = ag.i();
        if (PatchProxy.isSupport(new Object[0], i, ag.f3141a, false, 40162, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i, ag.f3141a, false, 40162, new Class[0], Void.TYPE);
        } else if (i.k > 0) {
            i.h();
        } else {
            i.k = SystemClock.uptimeMillis();
        }
        this.isPaused = false;
        if (isFinishing()) {
            com.ss.android.ugc.aweme.shortvideo.util.f.a(this);
            ExceptionMonitor.ensureNotReachHere("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", false);
            return;
        }
        ((MainLooperOptService) com.ss.android.ugc.aweme.lego.a.i.a(MainLooperOptService.class)).updateState(MainLooperOptService.a.WATCH_ON_MEASURE);
        super.onResume();
        if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.main.j.a.f54845a, true, 58311, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.main.j.a.f54845a, true, 58311, new Class[]{Context.class}, Void.TYPE);
        } else {
            if (com.ss.android.ugc.aweme.main.j.a.f54848d == null) {
                try {
                    com.ss.android.ugc.aweme.main.j.a.f54848d = Class.forName("com.e9where.analysis.sdk.ApiAgent");
                } catch (Exception unused) {
                }
            }
            if (com.ss.android.ugc.aweme.main.j.a.f54849e == null) {
                com.ss.android.ugc.aweme.main.j.a.f54849e = com.ss.android.ugc.aweme.main.j.a.f54848d.getMethod("onResume", new Class[]{Context.class});
            }
            if (com.ss.android.ugc.aweme.main.j.a.f54846b == null) {
                SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(com.ss.android.ugc.aweme.app.k.a(), "dixintong_ditui_sdk", 0);
                com.ss.android.ugc.aweme.main.j.a.f54846b = a2;
                com.ss.android.ugc.aweme.main.j.a.f54847c = a2.getInt("dixintong_ditui_launch_times", 0);
            }
            int i2 = com.ss.android.ugc.aweme.main.j.a.f54847c;
            com.ss.android.ugc.aweme.main.j.a.f54847c = i2 + 1;
            if (i2 < 10) {
                try {
                    com.ss.android.ugc.aweme.main.j.a.f54849e.invoke(null, new Object[]{this});
                } catch (Exception | IllegalAccessException | InvocationTargetException unused2) {
                }
                SharedPreferences.Editor edit = com.ss.android.ugc.aweme.main.j.a.f54846b.edit();
                edit.putInt("dixintong_ditui_launch_times", com.ss.android.ugc.aweme.main.j.a.f54847c);
                edit.apply();
            }
        }
        this.mResumed = true;
        this.mAntiAddictiveChecked = false;
        if (com.ss.android.ugc.aweme.app.k.f() != -1) {
            n.a("aweme_app_performance", "main_page_time", (float) (System.currentTimeMillis() - com.ss.android.ugc.aweme.app.k.f()));
            com.ss.android.ugc.aweme.app.k.a(-1);
        }
        if (this.mCreateTime != -1) {
            n.a("aweme_app_performance", "main_create_time ", (float) (System.currentTimeMillis() - this.mCreateTime));
            this.mCreateTime = -1;
        }
        ensureDouDetector();
        if (!com.ss.android.ugc.aweme.commercialize.splash.d.a()) {
            resetWindowBackgroundFromFakeSplash();
        }
        com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29087a, com.ss.android.experiencekit.c.d.END);
        this.splashToStoryCamera = aj.f39698b;
        if (this.splashToStoryCamera) {
            performOndou();
            aj.f39698b = false;
        }
        fitAwesomeSplash();
        ee.a(this);
        ag i3 = ag.i();
        if (PatchProxy.isSupport(new Object[0], i3, ag.f3141a, false, 40163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i3, ag.f3141a, false, 40163, new Class[0], Void.TYPE);
        } else if (i3.l > 0) {
            i3.h();
        } else {
            i3.l = SystemClock.uptimeMillis();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", false);
    }

    @MeasureFunction
    private void fitAwesomeSplash() {
        Aweme aweme;
        int i;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57190, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57190, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        if (ab.a(getIntent()) && com.ss.android.ugc.aweme.commercialize.splash.d.a()) {
            FeedRecommendFragment currentFeedRecommendFragment = getCurrentFeedRecommendFragment();
            if (PatchProxy.isSupport(new Object[]{currentFeedRecommendFragment}, null, com.ss.android.ugc.aweme.commercialize.splash.d.f39459a, true, 32012, new Class[]{FeedRecommendFragment.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{currentFeedRecommendFragment}, null, com.ss.android.ugc.aweme.commercialize.splash.d.f39459a, true, 32012, new Class[]{FeedRecommendFragment.class}, Boolean.TYPE)).booleanValue();
            } else if (currentFeedRecommendFragment != null) {
                String str = com.ss.android.ugc.aweme.commercialize.splash.a.a().g;
                com.ss.android.ugc.aweme.commercialize.splash.a.a().b();
                if (!TextUtils.isEmpty(str)) {
                    com.ss.android.ugc.aweme.commercialize.splash.a a2 = com.ss.android.ugc.aweme.commercialize.splash.a.a();
                    if (PatchProxy.isSupport(new Object[]{str}, a2, com.ss.android.ugc.aweme.commercialize.splash.a.f39437a, false, 31971, new Class[]{String.class}, Aweme.class)) {
                        aweme = (Aweme) PatchProxy.accessDispatch(new Object[]{str}, a2, com.ss.android.ugc.aweme.commercialize.splash.a.f39437a, false, 31971, new Class[]{String.class}, Aweme.class);
                    } else {
                        aweme = com.ss.android.ugc.aweme.commercialize.splash.a.f39438b.a(str);
                    }
                    if (aweme != null && aweme.isAd()) {
                        FullFeedFragmentPanel fullFeedFragmentPanel = currentFeedRecommendFragment.g;
                        if (fullFeedFragmentPanel != null && fullFeedFragmentPanel.be() != null) {
                            int ah = fullFeedFragmentPanel.ah();
                            FeedPagerAdapter be = fullFeedFragmentPanel.be();
                            int lastIndexOf = be.h.lastIndexOf(aweme);
                            if (lastIndexOf >= 0) {
                                Aweme c2 = be.c(lastIndexOf);
                                Context context = GlobalContext.getContext();
                                if (c2.isAd()) {
                                    i = 1;
                                } else {
                                    i = 2;
                                }
                                com.ss.android.ugc.aweme.commercialize.log.g.a(context, aweme, i);
                            }
                            int i2 = 0;
                            int i3 = -1;
                            while (true) {
                                if (i2 < be.getCount()) {
                                    Aweme c3 = be.c(i2);
                                    if ((c3 == aweme || TextUtils.equals(c3.getAid(), aweme.getAid())) && aweme.getAwemeRawAd().isEnableFilterSameVideo()) {
                                        com.ss.android.ugc.aweme.commercialize.log.g.b((Context) com.ss.android.ugc.aweme.app.k.a(), aweme, com.ss.android.ugc.aweme.commercialize.splash.a.a().a("8", (String) null));
                                        break;
                                    }
                                    if (i2 >= ah && i3 == -1 && !c3.isAd()) {
                                        i3 = i2;
                                    }
                                    i2++;
                                } else {
                                    com.ss.android.ugc.aweme.feed.a.a().a(aweme);
                                    AwemeSplashInfo V = com.ss.android.ugc.aweme.commercialize.utils.c.V(aweme);
                                    if (V != null) {
                                        V.setShown(false);
                                        V.contextTrackSent = false;
                                    }
                                    int i4 = i3;
                                    if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(ah)}, fullFeedFragmentPanel, BaseListFragmentPanel.v, false, 41720, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(ah)}, fullFeedFragmentPanel, BaseListFragmentPanel.v, false, 41720, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
                                    } else if (fullFeedFragmentPanel.I == null || !fullFeedFragmentPanel.I.a(aweme, ah)) {
                                        FeedPagerAdapter feedPagerAdapter = fullFeedFragmentPanel.A;
                                        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(ah)}, feedPagerAdapter, FeedPagerAdapter.g, false, 40503, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(ah)}, feedPagerAdapter, FeedPagerAdapter.g, false, 40503, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
                                        } else if (aweme != null && ah >= 0 && ah <= feedPagerAdapter.getCount()) {
                                            feedPagerAdapter.h.add(ah, aweme);
                                            feedPagerAdapter.notifyDataSetChanged();
                                        }
                                        fullFeedFragmentPanel.A.notifyDataSetChanged();
                                    }
                                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(ah), (byte) 0}, fullFeedFragmentPanel, BaseListFragmentPanel.v, false, 41717, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(ah), (byte) 0}, fullFeedFragmentPanel, BaseListFragmentPanel.v, false, 41717, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                                    } else {
                                        fullFeedFragmentPanel.mViewPager.a(ah, false);
                                    }
                                    AbTestManager a3 = AbTestManager.a();
                                    if (PatchProxy.isSupport(new Object[0], a3, AbTestManager.f63777a, false, 72005, new Class[0], Boolean.TYPE)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a3, AbTestManager.f63777a, false, 72005, new Class[0], Boolean.TYPE)).booleanValue();
                                    } else if (!com.ss.android.g.a.a()) {
                                        AbTestModel d2 = a3.d();
                                        if (d2 != null) {
                                            z = d2.topviewFeedGapOptimizeEnabled;
                                        }
                                    }
                                    if (z) {
                                        for (int count = be.getCount() - 1; count > ah; count--) {
                                            if (count != i4 + 1 && (fullFeedFragmentPanel instanceof FullFeedFragmentPanel)) {
                                                fullFeedFragmentPanel.a(count, be.c(count));
                                            }
                                        }
                                        currentFeedRecommendFragment.w_();
                                    } else if (!com.ss.android.ugc.aweme.commercialize.splash.h.d()) {
                                        com.ss.android.ugc.aweme.commercialize.splash.a.a().c();
                                    }
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
            if (z) {
                viewGroup.setAlpha(0.0f);
                return;
            }
        }
        com.ss.android.ugc.aweme.commercialize.splash.a.a().c();
        viewGroup.setAlpha(1.0f);
    }

    public void setGuideShown(boolean z) {
        this.mGuideShown = z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onAwesomeSplashEvent$9$MainActivity(View view) {
        performSplashSkipClick(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setSplashSkipView$5$MainActivity(View view) {
        performSplashSkipClick(false);
    }

    @Subscribe
    public void onMobRequestIdEvent(x xVar) {
        this.mScrollSwitchHelper.f54653f = xVar.f45320a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$3$MainActivity(String str) {
        this.splashTriggerAt = SystemClock.uptimeMillis();
        ak.a((Context) this, str);
    }

    @Subscribe
    public void onCommentDialogEvent(com.ss.android.ugc.aweme.feed.f.f fVar) {
        if (fVar.f45302a == 0) {
            this.mCommentDialogCount--;
            return;
        }
        if (fVar.f45302a == 1) {
            this.mCommentDialogCount++;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void lambda$onCreate$0$MainActivity(Boolean bool) {
        if (bool.booleanValue()) {
            com.ss.android.b.a.a.a.b(new a(this));
        } else {
            enterRecordFrom3rdPlatform(getIntent(), getIntent().getBooleanExtra("enter_record_from_other_platform", false));
        }
        return null;
    }

    @Subscribe
    public void onMainActivityConsumer(v vVar) {
        v vVar2 = vVar;
        if (PatchProxy.isSupport(new Object[]{vVar2}, this, changeQuickRedirect, false, 57164, new Class[]{v.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vVar2}, this, changeQuickRedirect, false, 57164, new Class[]{v.class}, Void.TYPE);
            return;
        }
        vVar2.accept(this);
    }

    @Subscribe
    public void onMobEnterFromEvent(w wVar) {
        if (PatchProxy.isSupport(new Object[]{wVar}, this, changeQuickRedirect, false, 57136, new Class[]{w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar}, this, changeQuickRedirect, false, 57136, new Class[]{w.class}, Void.TYPE);
            return;
        }
        this.mEventType = wVar.f45319a;
        this.mScrollSwitchHelper.c(wVar.f45319a);
    }

    @Subscribe
    public void onSlideSwitchLayoutInMainActivityConsumer(ap apVar) {
        if (PatchProxy.isSupport(new Object[]{apVar}, this, changeQuickRedirect, false, 57141, new Class[]{ap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{apVar}, this, changeQuickRedirect, false, 57141, new Class[]{ap.class}, Void.TYPE);
            return;
        }
        if (this.mScrollSwitchHelper != null) {
            apVar.accept(this.mScrollSwitchHelper);
        }
    }

    @Subscribe
    public void onUserLoginStateChange(com.ss.android.ugc.aweme.base.a.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 57135, new Class[]{com.ss.android.ugc.aweme.base.a.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 57135, new Class[]{com.ss.android.ugc.aweme.base.a.f.class}, Void.TYPE);
            return;
        }
        AwemeSSOPlatformUtils.a();
    }

    public void registerActivityOnKeyDownListener(@NonNull com.ss.android.ugc.aweme.base.activity.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 57160, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 57160, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE);
            return;
        }
        if (!this.mActivityOnKeyDownListeners.contains(aVar)) {
            this.mActivityOnKeyDownListeners.add(aVar);
        }
    }

    public void unRegisterActivityOnKeyDownListener(@NonNull com.ss.android.ugc.aweme.base.activity.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 57161, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 57161, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE);
            return;
        }
        if (this.mActivityOnKeyDownListeners != null) {
            this.mActivityOnKeyDownListeners.remove(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: enterRecordReal */
    public void lambda$enterRecordFrom3rdPlatform$8$MainActivity(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, changeQuickRedirect, false, 57149, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, changeQuickRedirect, false, 57149, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        com.ss.android.common.lib.a.a(getApplicationContext(), "protect", "record_on");
        Intent intent2 = new Intent(intent);
        if (intent.getBooleanExtra("show_no_splash_ad", false)) {
            AwemeAppData.p().ao = true;
        }
        intent2.setClass(this, ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
        startActivity(intent2);
    }

    private void showOpenSdkShareDialog(Intent intent) {
        String str;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, changeQuickRedirect, false, 57147, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, changeQuickRedirect, false, 57147, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        if (intent2.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG")) {
            final com.ss.android.ugc.aweme.common.w wVar = (com.ss.android.ugc.aweme.common.w) intent2.getSerializableExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG");
            if (wVar != null) {
                wVar.mNeedShowDialog = true;
                if (com.ss.android.ugc.aweme.opensdk.share.share.a.a((com.ss.android.ugc.aweme.common.c) wVar)) {
                    final FragmentActivity activity = getActivity();
                    if (activity != null) {
                        if (TextUtils.isEmpty(wVar.mAppName)) {
                            str = activity.getString(C0906R.string.cj7);
                        } else {
                            str = wVar.mAppName;
                        }
                        new com.ss.android.ugc.aweme.opensdk.share.a.a(activity, str, "share saved", new a.C0657a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f54153a;

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f54153a, false, 57211, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f54153a, false, 57211, new Class[0], Void.TYPE);
                                    return;
                                }
                                new com.ss.android.ugc.aweme.opensdk.share.e(activity, wVar).a("", 20015);
                            }

                            public final void b() {
                                if (PatchProxy.isSupport(new Object[0], this, f54153a, false, 57212, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f54153a, false, 57212, new Class[0], Void.TYPE);
                                    return;
                                }
                                Intent intent = new Intent();
                                intent.setAction("com.aweme.opensdk.action.stay.in.dy");
                                activity.sendBroadcast(intent);
                            }
                        }).show();
                    }
                }
            }
        }
    }

    private void showSyncToutiaoDialog(final int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57115, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57115, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        AlertDialog.Builder a2 = com.ss.android.a.a.a(this);
        a2.setTitle((int) C0906R.string.chf);
        a2.setMessage((int) C0906R.string.che);
        a2.setPositiveButton((int) C0906R.string.cha, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54167a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f54167a, false, 57218, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f54167a, false, 57218, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                MainActivity.this.syncToToutiao(i);
            }
        });
        a2.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        a2.create().show();
    }

    public void cancelRestoreDialog(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 57168, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 57168, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        if (isUnderMainTab()) {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService != null) {
                iAVService.publishService().cancelRestoreOnMain();
            }
            handleMainPageResume();
        }
        com.ss.android.common.lib.a.a(getApplicationContext(), "protect", "record_off");
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
    }

    public void changeAutoPlayTabVisibility(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57166, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57166, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mDataCenter.a("changeAutoPlayTabVisibility", (Object) Integer.valueOf(i));
    }

    public void exitMaskLayer(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57123, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57123, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mDataCenter.a("exitMaskLayer", (Object) Boolean.valueOf(z));
    }

    @Subscribe
    public void onCommentShowEvent(com.ss.android.ugc.aweme.comment.b.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, changeQuickRedirect, false, 57137, new Class[]{com.ss.android.ugc.aweme.comment.b.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, changeQuickRedirect, false, 57137, new Class[]{com.ss.android.ugc.aweme.comment.b.d.class}, Void.TYPE);
            return;
        }
        if (!(dVar == null || this.mScrollSwitchHelper == null || dVar.f36378b == null || !TextUtils.equals(getClass().getSimpleName(), dVar.f36378b.getClass().getSimpleName()))) {
            this.mScrollSwitchHelper.a(!dVar.f36377a);
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onNextVideo(com.ss.android.ugc.aweme.shortvideo.f.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 57197, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 57197, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.f.class}, Void.TYPE);
            return;
        }
        if (fVar.f67648c == 10) {
            if (this.adViewController == null || !this.adViewController.a()) {
                tryShowLiveTakeBubble();
            } else {
                bg.a(new com.ss.android.ugc.aweme.main.follow.f());
            }
        }
    }

    @Subscribe
    public void onScrollToDetailEvent(ah ahVar) {
        if (PatchProxy.isSupport(new Object[]{ahVar}, this, changeQuickRedirect, false, 57142, new Class[]{ah.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ahVar}, this, changeQuickRedirect, false, 57142, new Class[]{ah.class}, Void.TYPE);
        } else if (ahVar != null && ahVar.f45285b && this.mScrollSwitchHelper != null && this.mScrollSwitchHelper != null) {
            this.mScrollSwitchHelper.c(ahVar.f45284a);
        }
    }

    @Subscribe
    public void onScrollToHotSearchEvent(ai aiVar) {
        if (PatchProxy.isSupport(new Object[]{aiVar}, this, changeQuickRedirect, false, 57138, new Class[]{ai.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aiVar}, this, changeQuickRedirect, false, 57138, new Class[]{ai.class}, Void.TYPE);
            return;
        }
        bu buVar = this.mScrollSwitchHelper;
        if (PatchProxy.isSupport(new Object[0], buVar, bu.f54648a, false, 57665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], buVar, bu.f54648a, false, 57665, new Class[0], Void.TYPE);
            return;
        }
        if (buVar.j != null) {
            buVar.l = "FROM_CLICK";
            buVar.a("page_discover", true);
        }
    }

    @Subscribe
    public void onSubscriberExceptionEvent(m mVar) {
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{mVar2}, this, changeQuickRedirect, false, 57195, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar2}, this, changeQuickRedirect, false, 57195, new Class[]{m.class}, Void.TYPE);
            return;
        }
        if (!(mVar2.f84131c == null || mVar2.f84132d == null)) {
            com.ss.android.ugc.aweme.framework.a.a.a("Could not dispatch event: " + mVar2.f84131c.getClass() + " to subscribing class " + mVar2.f84132d.getClass());
        }
        if (mVar2.f84130b != null) {
            com.ss.android.ugc.aweme.framework.a.a.a(mVar2.f84130b);
        }
    }

    @Subscribe
    public void onWebSocketEvent(com.ss.android.websocket.b.a.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 57139, new Class[]{com.ss.android.websocket.b.a.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 57139, new Class[]{com.ss.android.websocket.b.a.f.class}, Void.TYPE);
            return;
        }
        if (!StringUtils.isEmpty(AppLog.getServerDeviceId())) {
            com.ss.android.ugc.aweme.message.d.f.d().f();
        }
    }

    public void setCanScroll(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57156, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57156, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mScrollSwitchHelper.a(z);
    }

    public void setInVideoPlayMode(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57130, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57130, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mDataCenter.a("setInVideoPlayMode", (Object) Boolean.valueOf(z));
    }

    public void setTabBackground(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57128, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57128, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mDataCenter.a("setTabBackground", (Object) Boolean.valueOf(z));
    }

    private void showUploadItemInNewFollowFeed(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 57185, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 57185, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Fragment b2 = TabChangeManager.a((FragmentActivity) this).b("FOLLOW");
        if (b2 != null && (b2 instanceof FriendTabFragment)) {
            FriendTabFragment friendTabFragment = (FriendTabFragment) b2;
            IPublishService.OnPublishCallback onPublishCallback = this.processedCallback;
            if (PatchProxy.isSupport(new Object[]{cVar2, onPublishCallback}, friendTabFragment, FriendTabFragment.f3654a, false, 61575, new Class[]{c.class, IPublishService.OnPublishCallback.class}, Void.TYPE)) {
                FriendTabFragment friendTabFragment2 = friendTabFragment;
                PatchProxy.accessDispatch(new Object[]{cVar2, onPublishCallback}, friendTabFragment2, FriendTabFragment.f3654a, false, 61575, new Class[]{c.class, IPublishService.OnPublishCallback.class}, Void.TYPE);
            } else {
                if (!(friendTabFragment.f3655b == null || friendTabFragment.mViewPager == null || friendTabFragment.f3655b.size() <= friendTabFragment.mViewPager.getCurrentItem())) {
                    if (!friendTabFragment.Q_()) {
                        friendTabFragment.a(0);
                    }
                    Fragment k = friendTabFragment.k();
                    if (k instanceof FollowFeedFragment) {
                        ((FollowFeedFragment) k).a(cVar2, onPublishCallback);
                    }
                    Fragment j = friendTabFragment.j();
                    if (j instanceof FollowFeedFragment) {
                        ((FollowFeedFragment) j).a(cVar2, onPublishCallback);
                    }
                }
            }
        } else if (b2 == null) {
            this.mBinder = cVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        if (r1 != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r1 != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ a.i lambda$recordLaunchDate$4$MainActivity(a.i r14) throws java.lang.Exception {
        /*
            r13 = this;
            boolean r14 = com.ss.android.ugc.aweme.share.score.c.a(r13)
            r0 = 0
            if (r14 == 0) goto L_0x0008
            return r0
        L_0x0008:
            java.util.Calendar r14 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            r14.setTimeInMillis(r1)     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            r1 = 11
            r2 = 0
            r14.set(r1, r2)     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            r1 = 12
            r14.set(r1, r2)     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            r1 = 13
            r14.set(r1, r2)     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            r1 = 14
            r14.set(r1, r2)     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            com.ss.android.ugc.aweme.share.score.a r1 = com.ss.android.ugc.aweme.share.score.a.a()     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            android.database.sqlite.SQLiteDatabase r3 = r1.f65265c     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            r4 = 1
            java.lang.String r5 = "app_open"
            r6 = 0
            java.lang.String r7 = "open_time = ?"
            r1 = 1
            java.lang.String[] r8 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            long r9 = r14.getTimeInMillis()     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            r8[r2] = r1     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0081, all -> 0x007a }
            if (r1 == 0) goto L_0x005a
            int r2 = r1.getCount()     // Catch:{ Exception -> 0x0082, all -> 0x0057 }
            if (r2 == 0) goto L_0x005a
            if (r1 == 0) goto L_0x0056
            r1.close()
        L_0x0056:
            return r0
        L_0x0057:
            r14 = move-exception
            r0 = r1
            goto L_0x007b
        L_0x005a:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x0082, all -> 0x0057 }
            r2.<init>()     // Catch:{ Exception -> 0x0082, all -> 0x0057 }
            java.lang.String r3 = "open_time"
            long r4 = r14.getTimeInMillis()     // Catch:{ Exception -> 0x0082, all -> 0x0057 }
            java.lang.Long r14 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0082, all -> 0x0057 }
            r2.put(r3, r14)     // Catch:{ Exception -> 0x0082, all -> 0x0057 }
            com.ss.android.ugc.aweme.share.score.a r14 = com.ss.android.ugc.aweme.share.score.a.a()     // Catch:{ Exception -> 0x0082, all -> 0x0057 }
            android.database.sqlite.SQLiteDatabase r14 = r14.f65264b     // Catch:{ Exception -> 0x0082, all -> 0x0057 }
            java.lang.String r3 = "app_open"
            r14.insert(r3, r0, r2)     // Catch:{ Exception -> 0x0082, all -> 0x0057 }
            if (r1 == 0) goto L_0x0087
            goto L_0x0084
        L_0x007a:
            r14 = move-exception
        L_0x007b:
            if (r0 == 0) goto L_0x0080
            r0.close()
        L_0x0080:
            throw r14
        L_0x0081:
            r1 = r0
        L_0x0082:
            if (r1 == 0) goto L_0x0087
        L_0x0084:
            r1.close()
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainActivity.lambda$recordLaunchDate$4$MainActivity(a.i):a.i");
    }

    public void onNewIntent(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, changeQuickRedirect, false, 57146, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, changeQuickRedirect, false, 57146, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onNewIntent(intent);
        if (!ab.a(intent)) {
            setIntent(intent);
            tryShowGuideView();
            if (this.mShareIntentParseCenter != null) {
                this.mShareIntentParseCenter.f58407b = intent;
                this.mShareIntentParseCenter.a(false);
            }
            com.ss.android.ugc.aweme.main.f.a.a();
            showOpenSdkShareDialog(getIntent());
            bg.a(new t(this, intent));
            boolean processPublish = ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().processPublish(getActivity(), intent);
            if (processPublish || ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).processPublish(getActivity(), intent)) {
                if ((processPublish || !MainPageExperimentHelper.m()) && !intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT")) {
                    changeTabToFollowAfterPublish();
                }
                return;
            }
            this.mDataCenter.a("onNewIntent", (Object) intent);
            this.mScrollSwitchHelper.i();
            enterRecordFrom3rdPlatform(getIntent(), getIntent().getBooleanExtra("enter_record_from_other_platform", false));
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 57152, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 57152, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onRestoreInstanceState(bundle);
        String string = bundle2.getString("previousTag");
        boolean z = bundle2.getBoolean("slide_switch_scanScroll");
        if (getTabChangeManager() != null) {
            TabChangeManager tabChangeManager = getTabChangeManager();
            if (PatchProxy.isSupport(new Object[]{bundle2}, tabChangeManager, TabChangeManager.f54415a, false, 57804, new Class[]{Bundle.class}, Void.TYPE)) {
                TabChangeManager tabChangeManager2 = tabChangeManager;
                PatchProxy.accessDispatch(new Object[]{bundle2}, tabChangeManager2, TabChangeManager.f54415a, false, 57804, new Class[]{Bundle.class}, Void.TYPE);
            } else if (bundle2 != null) {
                if (tabChangeManager.f54419e == null) {
                    tabChangeManager.f54419e = bundle2.getString("cur_fragment");
                }
                if (tabChangeManager.f54417c == null) {
                    tabChangeManager.f54417c = bundle2.getString("last_fragment");
                }
            }
            getTabChangeManager().a(string, true);
        }
        this.mScrollSwitchHelper.a(z);
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 57151, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 57151, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        TabChangeManager tabChangeManager = getTabChangeManager();
        if (PatchProxy.isSupport(new Object[]{bundle2}, tabChangeManager, TabChangeManager.f54415a, false, 57803, new Class[]{Bundle.class}, Void.TYPE)) {
            Object[] objArr = {bundle2};
            TabChangeManager tabChangeManager2 = tabChangeManager;
            PatchProxy.accessDispatch(objArr, tabChangeManager2, TabChangeManager.f54415a, false, 57803, new Class[]{Bundle.class}, Void.TYPE);
        } else {
            bundle2.putString("cur_fragment", tabChangeManager.f54419e);
            bundle2.putString("last_fragment", tabChangeManager.f54417c);
        }
        bundle2.putString("previousTag", getTabChangeManager().f54419e);
        bundle2.putBoolean("slide_switch_scanScroll", this.mScrollSwitchHelper.a());
        bundle2.putBoolean("should_show_slide_setting", this.mAdapter.b("page_setting"));
    }

    @Subscribe
    public void onScrollToProfileEvent(com.ss.android.ugc.aweme.feed.f.aj ajVar) {
        if (PatchProxy.isSupport(new Object[]{ajVar}, this, changeQuickRedirect, false, 57172, new Class[]{com.ss.android.ugc.aweme.feed.f.aj.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ajVar}, this, changeQuickRedirect, false, 57172, new Class[]{com.ss.android.ugc.aweme.feed.f.aj.class}, Void.TYPE);
        } else if (ajVar != null && this.mScrollSwitchHelper != null && ajVar.f45286a == hashCode() && this.mScrollSwitchHelper != null) {
            if (com.ss.android.ugc.aweme.commercialize.utils.c.X(this.mCurrentAweme) && !am.RAW_AD.isRealAuthor()) {
                if (!com.ss.android.ugc.aweme.commercialize.utils.g.b((Context) getActivity(), this.mCurrentAweme)) {
                    com.ss.android.ugc.aweme.miniapp.l.b.a(getActivity(), this.mCurrentAweme);
                }
            } else if (!this.adViewController.a() || this.adViewController.b() || this.adViewController.d()) {
                if (!fakeJumpToOpenUrl()) {
                    this.mScrollSwitchHelper.a(this.mCurrentAweme, ajVar.f45287b);
                }
            } else {
                com.bytedance.ies.dmt.ui.d.a.c((Context) this, (int) C0906R.string.c9).a();
            }
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onUserBannedEvent(com.ss.android.ugc.aweme.base.a.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, changeQuickRedirect, false, 57182, new Class[]{com.ss.android.ugc.aweme.base.a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, changeQuickRedirect, false, 57182, new Class[]{com.ss.android.ugc.aweme.base.a.d.class}, Void.TYPE);
        } else if (!BannedDialogActivity.a.a()) {
            BannedDialogActivity.a aVar = BannedDialogActivity.j;
            if (PatchProxy.isSupport(new Object[]{this}, aVar, BannedDialogActivity.a.f53784a, false, 56419, new Class[]{Context.class}, Void.TYPE)) {
                BannedDialogActivity.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{this}, aVar2, BannedDialogActivity.a.f53784a, false, 56419, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(this, "context");
            if (!BannedDialogActivity.a.a()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (uptimeMillis > BannedDialogActivity.h + BannedDialogActivity.g) {
                    BannedDialogActivity.h = uptimeMillis;
                    startActivity(new Intent(this, BannedDialogActivity.class));
                }
            }
        }
    }

    @Subscribe
    public void onVideoPageChangeEvent(com.ss.android.ugc.aweme.feed.f.ac acVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{acVar}, this, changeQuickRedirect, false, 57165, new Class[]{com.ss.android.ugc.aweme.feed.f.ac.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{acVar}, this, changeQuickRedirect, false, 57165, new Class[]{com.ss.android.ugc.aweme.feed.f.ac.class}, Void.TYPE);
        } else if (acVar.f45277a != null && acVar.f45277a.getAuthor() != null) {
            if (!this.mAntiAddictiveChecked) {
                com.ss.android.ugc.aweme.commercialize.utils.c.Q(acVar.f45277a);
            }
            String uid = acVar.f45277a.getAuthor().getUid();
            this.mCurrentAweme = acVar.f45277a;
            com.ss.android.ugc.aweme.u.c.f75107b = uid;
            if (this.mCurrentAweme != null) {
                str = this.mCurrentAweme.getAid();
            } else {
                str = "";
            }
            com.ss.android.ugc.aweme.u.c.f75106a = str;
            if (!TextUtils.equals(this.mLastUserId, uid)) {
                this.mLastUserId = uid;
                this.adViewController.a((Context) this, acVar.f45277a);
                this.adViewController.g();
                if (!this.adViewController.a() || this.adViewController.d()) {
                    com.ss.android.b.a.a.a.a(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f54157a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f54157a, false, 57213, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f54157a, false, 57213, new Class[0], Void.TYPE);
                                return;
                            }
                            if (!MainActivity.this.isFinishing() && MainActivity.this.mScrollSwitchHelper != null) {
                                MainActivity.this.mScrollSwitchHelper.f54649b = MainActivity.this.mLastUserId;
                                bu buVar = MainActivity.this.mScrollSwitchHelper;
                                Aweme aweme = MainActivity.this.mCurrentAweme;
                                if (PatchProxy.isSupport(new Object[]{aweme}, buVar, bu.f54648a, false, 57673, new Class[]{Aweme.class}, Void.TYPE)) {
                                    bu buVar2 = buVar;
                                    PatchProxy.accessDispatch(new Object[]{aweme}, buVar2, bu.f54648a, false, 57673, new Class[]{Aweme.class}, Void.TYPE);
                                } else {
                                    buVar.g = aweme;
                                    if (aweme != null) {
                                        buVar.g.setIsPreloadScroll(false);
                                    }
                                }
                                if (MainActivity.this.mCurrentAweme != null) {
                                    MainActivity.this.mCurrentAweme.getAuthor();
                                }
                            }
                        }
                    }, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
                } else if (this.adViewController.b()) {
                    getSupportFragmentManager();
                    acVar.f45277a.getAwemeRawAd().getWebUrl();
                }
                setAdScrollRightControl();
                showUpdateUserDialog();
            }
        }
    }

    public void syncToToutiao(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57116, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57116, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.iesapi.a.c cVar = new com.ss.android.ugc.aweme.iesapi.a.c(this);
        AnonymousClass11 r1 = new a.C0592a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54145a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f54145a, false, 57219, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f54145a, false, 57219, new Class[0], Void.TYPE);
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.a((Context) MainActivity.this, (int) C0906R.string.hh).a();
            }

            public final void a(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f54145a, false, 57220, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f54145a, false, 57220, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.b((Context) MainActivity.this, (int) C0906R.string.hg).a();
            }
        };
        if (PatchProxy.isSupport(new Object[]{r1, Integer.valueOf(i)}, cVar, com.ss.android.ugc.aweme.iesapi.a.c.f50041d, false, 50010, new Class[]{a.C0592a.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {r1, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            com.ss.android.ugc.aweme.iesapi.a.c cVar2 = cVar;
            PatchProxy.accessDispatch(objArr2, cVar2, com.ss.android.ugc.aweme.iesapi.a.c.f50041d, false, 50010, new Class[]{a.C0592a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        cVar.a();
        com.ss.android.b.a.a.a.a(new com.ss.android.ugc.aweme.iesapi.a.d(cVar, r1), i);
    }

    @MeasureFunction
    private void performSplashSkipClick(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57105, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57105, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z || this.mAwesomeSplashStatus == 2) {
            IFeedViewHolder currentViewHolder = getCurrentViewHolder();
            long j = 0;
            if (com.ss.android.ugc.aweme.feed.k.b.f(currentViewHolder) && com.ss.android.ugc.aweme.commercialize.utils.c.Q(currentViewHolder.d())) {
                if (getCurFragment() instanceof MainFragment) {
                    MainFragment mainFragment = (MainFragment) getCurFragment();
                    if (mainFragment.a() instanceof FeedRecommendFragment) {
                        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) mainFragment.a();
                        if (feedRecommendFragment != null) {
                            j = feedRecommendFragment.g.az();
                        }
                    }
                }
                long j2 = j;
                HashMap hashMap = new HashMap();
                hashMap.put("duration", String.valueOf(j2));
                if (z) {
                    Aweme d2 = currentViewHolder.d();
                    if (PatchProxy.isSupport(new Object[]{this, d2, hashMap}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31655, new Class[]{Context.class, Aweme.class, Map.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{this, d2, hashMap}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31655, new Class[]{Context.class, Aweme.class, Map.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.commercialize.log.g.b((Context) this, "shake_skip", d2, com.ss.android.ugc.aweme.commercialize.log.g.a((Context) this, d2, "raw ad shake skip", false, (Map<String, String>) hashMap));
                    }
                    Aweme d3 = currentViewHolder.d();
                    if (PatchProxy.isSupport(new Object[]{this, d3, new Long(j2), 1, "play_break"}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31507, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{this, d3, new Long(j2), 1, "play_break"}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31507, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.commercialize.log.g.a((Context) this, d3, j2, 1, "play_break", (Integer) null);
                    }
                    com.ss.android.ugc.aweme.commercialize.log.g.a((Context) this, currentViewHolder.d(), j2, 1);
                } else {
                    Aweme d4 = currentViewHolder.d();
                    if (PatchProxy.isSupport(new Object[]{this, d4, hashMap}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31654, new Class[]{Context.class, Aweme.class, Map.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{this, d4, hashMap}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31654, new Class[]{Context.class, Aweme.class, Map.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.commercialize.log.g.b((Context) this, "skip", d4, com.ss.android.ugc.aweme.commercialize.log.g.a((Context) this, d4, "raw ad skip", false, (Map<String, String>) hashMap));
                    }
                    com.ss.android.ugc.aweme.commercialize.log.g.a((Context) this, currentViewHolder.d(), j2, 1);
                }
                bg.a(new com.ss.android.ugc.aweme.feed.f.g(currentViewHolder.d().getAid()));
            }
        }
    }

    @Subscribe
    public void onAwesomeSplashEvent(AwesomeSplashEvent awesomeSplashEvent) {
        AwesomeSplashEvent awesomeSplashEvent2 = awesomeSplashEvent;
        if (PatchProxy.isSupport(new Object[]{awesomeSplashEvent2}, this, changeQuickRedirect, false, 57191, new Class[]{AwesomeSplashEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awesomeSplashEvent2}, this, changeQuickRedirect, false, 57191, new Class[]{AwesomeSplashEvent.class}, Void.TYPE);
            return;
        }
        this.mAwesomeSplashStatus = awesomeSplashEvent2.f39420b;
        if (awesomeSplashEvent2.f39420b != 1 && !this.mAwesomeSplashStatusBgRecovered) {
            resetWindowBackgroundFromFakeSplash();
            this.mAwesomeSplashStatusBgRecovered = true;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        if (awesomeSplashEvent2.f39420b == 1) {
            g gVar = this.mSplashLoadMaskHelper;
            if (PatchProxy.isSupport(new Object[0], gVar, g.f39463a, false, 32016, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], gVar, g.f39463a, false, 32016, new Class[0], Void.TYPE);
            } else {
                gVar.f39464b = (ViewGroup) gVar.f39466d.getWindow().getDecorView();
                gVar.f39465c = new View(gVar.f39466d);
                gVar.f39465c.setBackground(((com.ss.android.ugc.aweme.legoImp.inflate.i) com.ss.android.ugc.aweme.lego.a.i.b(com.ss.android.ugc.aweme.legoImp.inflate.i.class)).a(gVar.f39466d));
                if (gVar.f39464b instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    if (com.ss.android.ugc.aweme.app.a.a.a(gVar.f39466d)) {
                        layoutParams.topMargin = com.ss.android.ugc.aweme.profile.a.d(GlobalContext.getContext());
                    }
                    gVar.f39464b.addView(gVar.f39465c, 0, layoutParams);
                } else {
                    gVar.f39464b.addView(gVar.f39465c, 0, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            viewGroup.setAlpha(0.0f);
        } else {
            viewGroup.setAlpha(1.0f);
        }
        if (awesomeSplashEvent2.f39420b == 4) {
            if (this.mAwesomeSplashMask != null) {
                viewGroup.removeView(this.mAwesomeSplashMask);
                this.mAwesomeSplashMask = null;
            }
        } else if (this.mAwesomeSplashMask == null) {
            if (com.ss.android.ugc.aweme.global.config.settings.g.b().aR().booleanValue()) {
                getLayoutInflater().inflate(C0906R.layout.gl, viewGroup, true);
            } else {
                getLayoutInflater().inflate(C0906R.layout.gk, viewGroup, true);
            }
            this.mAwesomeSplashMask = (ViewGroup) viewGroup.findViewById(C0906R.id.iq);
            View findViewById = this.mAwesomeSplashMask.findViewById(C0906R.id.is);
            if (findViewById != null) {
                findViewById.setOnClickListener(new q(this));
            }
            this.mAwesomeSplashMask.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54159a;

                public final boolean onPreDraw() {
                    if (PatchProxy.isSupport(new Object[0], this, f54159a, false, 57214, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54159a, false, 57214, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    com.ss.android.ugc.aweme.commercialize.splash.h.a(System.currentTimeMillis());
                    if (!(MainActivity.this.mAwesomeSplashMask == null || MainActivity.this.mAwesomeSplashMask.getViewTreeObserver() == null)) {
                        MainActivity.this.mAwesomeSplashMask.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    return true;
                }
            });
        }
        if (this.mAwesomeSplashMask instanceof com.ss.android.ugc.aweme.commercialize.splash.f) {
            ((com.ss.android.ugc.aweme.commercialize.splash.f) this.mAwesomeSplashMask).onEvent(awesomeSplashEvent2);
        }
        if ((awesomeSplashEvent2.f39420b == 1 || awesomeSplashEvent2.f39420b == 2) && (getCurFragment() instanceof MainFragment)) {
            FeedFragment a2 = ((MainFragment) getCurFragment()).a();
            if (a2 instanceof FeedRecommendFragment) {
                FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) a2;
                if (PatchProxy.isSupport(new Object[0], feedRecommendFragment, FeedRecommendFragment.f3200e, false, 42657, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], feedRecommendFragment, FeedRecommendFragment.f3200e, false, 42657, new Class[0], Void.TYPE);
                } else if (feedRecommendFragment.p()) {
                    feedRecommendFragment.g.aN();
                }
                exitDislikeMode();
            }
        }
    }

    @MeasureFunction
    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57140, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 57140, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z) {
            ag i = ag.i();
            if (PatchProxy.isSupport(new Object[0], i, ag.f3141a, false, 40166, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i, ag.f3141a, false, 40166, new Class[0], Void.TYPE);
            } else if (i.o > 0) {
                i.h();
            } else {
                i.o = SystemClock.uptimeMillis();
            }
        }
        if (z && !this.mIsFirstVisible) {
            com.ss.android.ugc.aweme.net.ac.a();
            this.mIsFirstVisible = true;
            if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.antiaddic.c.b.f33381a, true, 22102, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.antiaddic.c.b.f33381a, true, 22102, new Class[]{Activity.class}, Void.TYPE);
            } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin() && AbTestManager.a().by() && !isFinishing() && AbTestManager.a().T() == 0 && !AbTestManager.a().bx() && ((Boolean) com.ss.android.ugc.aweme.app.x.a().ai().c()).booleanValue()) {
                com.ss.android.ugc.aweme.login.e.a((Activity) this, "", "forced_login_launch", ad.a().a("is_force_login", true).f75487b);
            }
            ((MainLooperOptService) com.ss.android.ugc.aweme.lego.a.i.a(MainLooperOptService.class)).updateState(MainLooperOptService.a.WATCH_ON_DRAW);
        }
        if (z) {
            ag i2 = ag.i();
            if (PatchProxy.isSupport(new Object[0], i2, ag.f3141a, false, 40167, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i2, ag.f3141a, false, 40167, new Class[0], Void.TYPE);
            } else if (i2.p > 0) {
                i2.h();
            } else {
                i2.p = SystemClock.uptimeMillis();
            }
        } else {
            ag.i().h();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.greenrobot.eventbus.Subscribe(a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPublishMessage(com.ss.android.ugc.aweme.story.model.b r19) {
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
            java.lang.Class<com.ss.android.ugc.aweme.story.model.b> r1 = com.ss.android.ugc.aweme.story.model.b.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 57134(0xdf2e, float:8.0062E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 57134(0xdf2e, float:8.0062E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.story.model.b> r1 = com.ss.android.ugc.aweme.story.model.b.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            int r0 = r8.f73236b
            r1 = -1
            if (r0 == r1) goto L_0x03ac
            switch(r0) {
                case 1: goto L_0x03a6;
                case 2: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x03ab
        L_0x0042:
            com.ss.android.ugc.aweme.shortvideo.util.ac r0 = new com.ss.android.ugc.aweme.shortvideo.util.ac
            r0.<init>()
            r1 = 2
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r10] = r7
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81016(0x13c78, float:1.13528E-40)
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.story.model.b> r3 = com.ss.android.ugc.aweme.story.model.b.class
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0088
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r10] = r7
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81016(0x13c78, float:1.13528E-40)
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.story.model.b> r2 = com.ss.android.ugc.aweme.story.model.b.class
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0088:
            if (r8 == 0) goto L_0x03ab
            r0.f71082b = r7
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r2 = r2.bi()
            if (r2 == 0) goto L_0x018c
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = com.ss.android.ugc.aweme.global.config.settings.g.b()
            java.lang.Boolean r2 = r2.bq()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x03ab
            com.ss.android.ugc.aweme.user.c r2 = com.ss.android.ugc.aweme.user.c.a()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.b()
            boolean r2 = r2.isSecret()
            if (r2 != 0) goto L_0x03ab
            java.lang.String[] r2 = r8.h
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r10] = r2
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81017(0x13c79, float:1.13529E-40)
            java.lang.Class[] r3 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r3[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.story.model.b> r4 = com.ss.android.ugc.aweme.story.model.b.class
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x00f5
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r10] = r2
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81017(0x13c79, float:1.13529E-40)
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.story.model.b> r2 = com.ss.android.ugc.aweme.story.model.b.class
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03ab
        L_0x00f5:
            java.lang.String[] r1 = r8.h
            if (r1 == 0) goto L_0x0114
            java.lang.String[] r1 = r8.h
            int r1 = r1.length
            if (r1 <= 0) goto L_0x0114
            java.lang.String r1 = "hotsoon"
            r2 = r2[r10]
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0114
            com.ss.android.ugc.aweme.shortvideo.view.PublishSyncDialog r1 = new com.ss.android.ugc.aweme.shortvideo.view.PublishSyncDialog
            android.app.Activity r0 = r0.f71082b
            r1.<init>(r0, r10, r8)
            r1.show()
            goto L_0x03ab
        L_0x0114:
            com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse$a r1 = r8.i
            if (r1 == 0) goto L_0x03ab
            com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse$a r1 = r8.i
            int r1 = r1.type
            r2 = 3
            if (r1 != r2) goto L_0x03ab
            com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse$a r1 = r8.i
            java.lang.String r1 = r1.text
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x012b
            goto L_0x03ab
        L_0x012b:
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r1 = com.ss.android.ugc.aweme.global.config.settings.g.b()
            java.lang.Boolean r1 = r1.bq()
            boolean r1 = r1.booleanValue()
            boolean r2 = com.ss.android.ugc.aweme.shortvideo.util.ac.a()
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r3 = r3.getSyncTT()
            java.lang.Object r3 = r3.c()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.intValue()
            if (r1 == 0) goto L_0x03ab
            if (r2 == 0) goto L_0x0152
            goto L_0x03ab
        L_0x0152:
            java.lang.String r1 = r8.g
            int[] r1 = com.ss.android.ugc.aweme.shortvideo.api.a.a(r1)
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.getSyncTTFirstPublish()
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0172
            boolean r1 = com.ss.android.ugc.aweme.shortvideo.util.ac.a(r1, r9)
            if (r1 == 0) goto L_0x018b
        L_0x0172:
            com.ss.android.ugc.aweme.shortvideo.view.PublishSyncDialog r1 = new com.ss.android.ugc.aweme.shortvideo.view.PublishSyncDialog
            android.app.Activity r0 = r0.f71082b
            r1.<init>(r0, r9, r8)
            r1.f71266d = r9
            r1.show()
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getSyncTTFirstPublish()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.a(r1)
        L_0x018b:
            return
        L_0x018c:
            java.lang.String[] r2 = r8.h
            if (r2 == 0) goto L_0x02ea
            java.lang.String[] r2 = r8.h
            int r2 = r2.length
            if (r2 <= 0) goto L_0x02ea
            java.lang.String[] r2 = r8.h
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r10] = r2
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81018(0x13c7a, float:1.1353E-40)
            java.lang.Class[] r3 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r3[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.story.model.b> r4 = com.ss.android.ugc.aweme.story.model.b.class
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x01d8
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r10] = r2
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81018(0x13c7a, float:1.1353E-40)
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.story.model.b> r2 = com.ss.android.ugc.aweme.story.model.b.class
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03ab
        L_0x01d8:
            java.lang.String r1 = "hotsoon"
            r3 = r2[r10]
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x01ee
            com.ss.android.ugc.aweme.shortvideo.view.PublishSyncDialog r1 = new com.ss.android.ugc.aweme.shortvideo.view.PublishSyncDialog
            android.app.Activity r0 = r0.f71082b
            r1.<init>(r0, r10, r8)
            r1.show()
            goto L_0x03ab
        L_0x01ee:
            r1 = r2[r10]
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81015(0x13c77, float:1.13526E-40)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x022b
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81015(0x13c77, float:1.13526E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0238
        L_0x022b:
            if (r1 == 0) goto L_0x0237
            java.lang.String r2 = "toutiao"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0237
            r1 = 1
            goto L_0x0238
        L_0x0237:
            r1 = 0
        L_0x0238:
            if (r1 == 0) goto L_0x02e9
            com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse$a r1 = r8.i
            if (r1 == 0) goto L_0x02be
            com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse$a r1 = r8.i
            int r1 = r1.type
            if (r1 != 0) goto L_0x0246
            goto L_0x02be
        L_0x0246:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81019(0x13c7b, float:1.13532E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x026e
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81019(0x13c7b, float:1.13532E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x029e
        L_0x026e:
            android.app.Activity r1 = r0.f71082b
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = com.ss.android.a.a.a(r1)
            r2 = 2131559621(0x7f0d04c5, float:1.8744591E38)
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = r1.setTitle((int) r2)
            r2 = 2131559620(0x7f0d04c4, float:1.874459E38)
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = r1.setMessage((int) r2)
            r2 = 2131559011(0x7f0d0263, float:1.8743354E38)
            android.content.DialogInterface$OnClickListener r3 = com.ss.android.ugc.aweme.shortvideo.util.ad.f71090b
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = r1.setNegativeButton((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            r2 = 2131559619(0x7f0d04c3, float:1.8744587E38)
            com.ss.android.ugc.aweme.shortvideo.util.ae r3 = new com.ss.android.ugc.aweme.shortvideo.util.ae
            r3.<init>(r0)
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = r1.setPositiveButton((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            com.bytedance.ies.uikit.dialog.AlertDialog r0 = r0.create()
            r0.show()
        L_0x029e:
            java.lang.String r0 = "bind_toutiao_notify_show"
            java.lang.String r1 = "current_fans_count"
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getCurUser()
            int r2 = r2.getFansCount()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "enter_method"
            java.lang.String r4 = "after_publish"
            com.google.common.collect.ak r1 = com.google.common.collect.ak.of(r1, r2, r3, r4)
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            goto L_0x02e9
        L_0x02be:
            com.ss.android.ugc.aweme.shortvideo.view.PublishSyncDialog r1 = new com.ss.android.ugc.aweme.shortvideo.view.PublishSyncDialog
            android.app.Activity r0 = r0.f71082b
            r1.<init>(r0, r9, r8)
            r1.show()
            java.lang.String r0 = "sync_toutiao_notify_show"
            java.lang.String r1 = "current_fans_count"
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getCurUser()
            int r2 = r2.getFansCount()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "enter_method"
            java.lang.String r4 = "after_publish"
            com.google.common.collect.ak r1 = com.google.common.collect.ak.of(r1, r2, r3, r4)
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            goto L_0x03ab
        L_0x02e9:
            return
        L_0x02ea:
            java.lang.String r1 = r8.g
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81020(0x13c7c, float:1.13533E-40)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0320
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.util.ac.f71081a
            r14 = 0
            r15 = 81020(0x13c7c, float:1.13533E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0320:
            if (r1 == 0) goto L_0x03ab
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.getSyncTT()
            java.lang.Object r2 = r2.c()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r9) goto L_0x03a5
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.isShowSyncToToutiaoDialog()
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x034b
            goto L_0x03a5
        L_0x034b:
            boolean r2 = com.ss.android.ugc.aweme.shortvideo.util.ac.a()
            if (r2 != 0) goto L_0x03ab
            int[] r1 = com.ss.android.ugc.aweme.shortvideo.api.a.a(r1)
            boolean r1 = com.ss.android.ugc.aweme.shortvideo.util.ac.a(r1, r9)
            if (r1 != 0) goto L_0x03ab
            android.app.Activity r1 = r0.f71082b
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = com.ss.android.a.a.a(r1)
            r2 = 2131562834(0x7f0d1152, float:1.8751108E38)
            r1.setMessage((int) r2)
            r2 = 2131562833(0x7f0d1151, float:1.8751106E38)
            com.ss.android.ugc.aweme.shortvideo.util.ac$1 r3 = new com.ss.android.ugc.aweme.shortvideo.util.ac$1
            r3.<init>()
            r1.setPositiveButton((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            r2 = 2131562832(0x7f0d1150, float:1.8751104E38)
            com.ss.android.ugc.aweme.shortvideo.util.ac$2 r3 = new com.ss.android.ugc.aweme.shortvideo.util.ac$2
            r3.<init>()
            r1.setNegativeButton((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            com.bytedance.ies.uikit.dialog.AlertDialog r0 = r1.create()
            r0.show()
            com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "sync_after_publish_show"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            java.lang.String r1 = "publish"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.isShowSyncToToutiaoDialog()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.a(r1)
            goto L_0x03ab
        L_0x03a5:
            return
        L_0x03a6:
            boolean r0 = r8.f73240f
            if (r0 != 0) goto L_0x03ab
            return
        L_0x03ab:
            return
        L_0x03ac:
            com.ss.android.ugc.aweme.main.bu r0 = r7.mScrollSwitchHelper
            java.lang.String r1 = "page_home"
            r0.a((java.lang.String) r1, (boolean) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainActivity.onPublishMessage(com.ss.android.ugc.aweme.story.model.b):void");
    }

    @MeasureFunction
    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        boolean z2;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 57095, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 57095, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", true);
        ag i2 = ag.i();
        if (PatchProxy.isSupport(new Object[0], i2, ag.f3141a, false, 40160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i2, ag.f3141a, false, 40160, new Class[0], Void.TYPE);
        } else if (i2.i > 0) {
            i2.h();
        } else {
            i2.i = SystemClock.uptimeMillis();
        }
        com.ss.android.ugc.aweme.feed.z.a();
        if (com.ss.android.ugc.aweme.lego.a.h != a.C0611a.COLD_BOOT_BEGIN) {
            com.ss.android.ugc.aweme.lego.a.h = a.C0611a.HOT_BOOT_BEGIN;
        }
        com.ss.android.ugc.aweme.lego.a aVar = com.ss.android.ugc.aweme.lego.a.i;
        if (PatchProxy.isSupport(new Object[]{this}, aVar, com.ss.android.ugc.aweme.lego.a.f3404a, false, 55084, new Class[]{Activity.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.lego.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{this}, aVar2, com.ss.android.ugc.aweme.lego.a.f3404a, false, 55084, new Class[]{Activity.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(this, PushConstants.INTENT_ACTIVITY_NAME);
            com.ss.android.ugc.aweme.lego.a.a aVar3 = com.ss.android.ugc.aweme.lego.a.f3408e;
            if (PatchProxy.isSupport(new Object[]{this}, aVar3, com.ss.android.ugc.aweme.lego.a.a.f53009a, false, 55146, new Class[]{Activity.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.lego.a.a aVar4 = aVar3;
                PatchProxy.accessDispatch(new Object[]{this}, aVar4, com.ss.android.ugc.aweme.lego.a.a.f53009a, false, 55146, new Class[]{Activity.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(this, PushConstants.INTENT_ACTIVITY_NAME);
                aVar3.f53011c.put(getClass(), new WeakReference(this));
            }
        }
        com.ss.android.ugc.aweme.lego.a.i.c().a(com.ss.android.ugc.aweme.legoImp.inflate.j.class).a(com.ss.android.ugc.aweme.legoImp.inflate.n.class).a(p.class).a(com.ss.android.ugc.aweme.legoImp.inflate.o.class).a(com.ss.android.ugc.aweme.legoImp.inflate.a.class).a(com.ss.android.ugc.aweme.legoImp.inflate.m.class).a(q.class).a();
        com.ss.android.ugc.aweme.lego.a.i.d().a(new com.ss.android.ugc.aweme.requesttask.idle.d()).a(new com.ss.android.ugc.aweme.requesttask.idle.h()).a(new com.ss.android.ugc.aweme.requesttask.idle.f()).a(new com.ss.android.ugc.aweme.requesttask.a.a()).a(new com.ss.android.ugc.aweme.requesttask.idle.c()).a(new l()).a(new com.ss.android.ugc.aweme.requesttask.idle.j()).a(new com.ss.android.ugc.aweme.requesttask.idle.a()).a(new com.ss.android.ugc.aweme.legoImp.a.a.a()).a(new com.ss.android.ugc.aweme.requesttask.a.e()).a();
        com.ss.android.ugc.aweme.lego.a.i.a().a(new GeckoCheckInRequest()).a();
        com.ss.android.ugc.aweme.video.j.a();
        if (bundle2 != null) {
            this.mShouldShowSlideSetting = bundle2.getBoolean("should_show_slide_setting");
            resetWindowBackgroundFromFakeSplash();
            com.ss.android.ugc.aweme.net.ac.a();
        }
        setupTheme();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.adViewController = new e();
        initDataCenter();
        TabClickCallBack.a(this, this, this.mTabClickListener);
        showStatusBar();
        if (ToolUtils.isFlyme()) {
            StatusBarUtils.setTranslucent(this);
        }
        com.ss.android.ugc.aweme.commercialize.splash.a.a().j = true;
        com.ss.android.ugc.aweme.commercialize.splash.a.a().a(getIntent());
        initCloudControl();
        NewsCountPresenter newsCountPresenter = this.newsPresenter;
        if (PatchProxy.isSupport(new Object[0], newsCountPresenter, NewsCountPresenter.f54265a, false, 57590, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], newsCountPresenter, NewsCountPresenter.f54265a, false, 57590, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], newsCountPresenter, NewsCountPresenter.f54265a, false, 57591, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], newsCountPresenter, NewsCountPresenter.f54265a, false, 57591, new Class[0], Void.TYPE);
            } else {
                newsCountPresenter.f54267c = new NewsCountPresenter.MsgCountBroadcastReceiver();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.msg.count.action.arrived");
                intentFilter.addAction("message_stranger_mark_read_action");
                LocalBroadcastManager.getInstance(GlobalContext.getContext()).registerReceiver(newsCountPresenter.f54267c, intentFilter);
            }
            if (!NewsCountPresenter.f54266b) {
                if (PatchProxy.isSupport(new Object[0], newsCountPresenter, NewsCountPresenter.f54265a, false, 57592, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], newsCountPresenter, NewsCountPresenter.f54265a, false, 57592, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.b.a.a.a.a(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f54268a;

                        public final void run() {
                            int i;
                            if (PatchProxy.isSupport(new Object[0], this, f54268a, false, 57594, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f54268a, false, 57594, new Class[0], Void.TYPE);
                                return;
                            }
                            com.ss.android.ugc.aweme.message.c.c a2 = com.ss.android.ugc.aweme.message.c.c.a();
                            if (NewsCountPresenter.f54266b) {
                                i = 1;
                            } else {
                                i = 5;
                            }
                            a2.a(false, i);
                        }
                    });
                }
            }
            NewsCountPresenter.f54266b = false;
        }
        bg.c(this);
        setContentView(((com.ss.android.ugc.aweme.legoImp.inflate.j) com.ss.android.ugc.aweme.lego.a.i.b(com.ss.android.ugc.aweme.legoImp.inflate.j.class)).a((Context) this, (int) C0906R.layout.activity_main));
        initView();
        logLogMain();
        if (!ab.a(getIntent())) {
            resetWindowBackgroundFromFakeSplash();
        }
        this.mCreateTime = System.currentTimeMillis();
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("extra_splash_data");
        this.mPushAwemeId = intent.getStringExtra("id");
        this.mPushAwemeIds = intent.getStringExtra("ids");
        this.mPushParams = intent.getStringExtra("push_params");
        createMainHelper();
        if (SharePrefCache.inst().getLastPublishFailed() != null && ((Boolean) SharePrefCache.inst().getLastPublishFailed().c()).booleanValue()) {
            UIUtils.displayToast((Context) this, (int) C0906R.string.b4x);
            SharePrefCache.inst().getLastPublishFailed().a(Boolean.FALSE);
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().tryRestorePublish(this, new h(this));
        com.ss.android.ugc.aweme.setting.e.a aVar5 = com.ss.android.ugc.aweme.setting.e.a.f63954b;
        if (PatchProxy.isSupport(new Object[]{this}, aVar5, com.ss.android.ugc.aweme.setting.e.a.f63953a, false, 72885, new Class[]{Context.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.setting.e.a aVar6 = aVar5;
            PatchProxy.accessDispatch(new Object[]{this}, aVar6, com.ss.android.ugc.aweme.setting.e.a.f63953a, false, 72885, new Class[]{Context.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(this, "context");
            if (TimeLockRuler.isContentFilterOn()) {
                com.ss.android.ugc.aweme.app.x a2 = com.ss.android.ugc.aweme.app.x.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "CommonSharePrefCache.inst()");
                an m = a2.m();
                Intrinsics.checkExpressionValueIsNotNull(m, "CommonSharePrefCache.ins…oShowForceTeensModeDialog");
                if (((Boolean) m.c()).booleanValue()) {
                    com.ss.android.ugc.aweme.app.x a3 = com.ss.android.ugc.aweme.app.x.a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "CommonSharePrefCache.inst()");
                    an m2 = a3.m();
                    Intrinsics.checkExpressionValueIsNotNull(m2, "CommonSharePrefCache.ins…oShowForceTeensModeDialog");
                    m2.a(Boolean.FALSE);
                    View inflate = LayoutInflater.from(this).inflate(C0906R.layout.kh, null);
                    com.ss.android.b.a.a.a.a(new a.C0695a(new a.C0185a(this).c(2130840136).a(inflate).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) a.b.f63960a).a(), (DmtTextView) inflate.findViewById(C0906R.id.cdq)), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                }
            }
        }
        goProfile();
        if (com.ss.android.ugc.aweme.lego.a.f()) {
            com.ss.android.ugc.aweme.lego.a.i.a().a(new ToastTask()).a();
        } else {
            com.ss.android.b.a.a.a.a(new i(this), 1500);
        }
        com.ss.android.ugc.aweme.lego.a.i.a().a(new AVCameraInitTask()).a();
        pushAuthorityMonitor();
        if (PatchProxy.isSupport(new Object[0], null, dm.f75755a, true, 88526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, dm.f75755a, true, 88526, new Class[0], Void.TYPE);
        } else {
            i.a(dn.f75757b, (Executor) com.ss.android.ugc.aweme.thread.h.e());
        }
        initDislikeView();
        uploadContact();
        com.ss.android.ugc.aweme.video.z.a(true);
        postPreinstallChannelEvent();
        i.a((Callable<TResult>) new j<TResult>(this), (Executor) com.ss.android.ugc.aweme.thread.h.g());
        getLifecycle().addObserver(new CaptchaLifeCycleObserver(this));
        getLifecycle().addObserver(new HomeDialogManager());
        au.f46527b = getClass();
        if (bundleExtra != null) {
            String string = bundleExtra.getString("splash_open_url_extra");
            if (!TextUtils.isEmpty(string)) {
                new Handler().postDelayed(new k(this, string), 200);
            }
        }
        this.mShareIntentParseCenter = new com.ss.android.ugc.aweme.opensdk.share.presenter.b(this, getIntent());
        this.mShareIntentParseCenter.f58410e = this.mEventType;
        this.mShareIntentParseCenter.a(false);
        com.ss.android.ugc.aweme.share.a.f.a(true);
        CommandObserver.a();
        if (getExternalCacheDir() == null) {
            i = 0;
        } else {
            i = 1;
        }
        n.a("sdcard_visibility", i, (JSONObject) null);
        if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.util.d.f75427a, true, 87781, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.util.d.f75427a, true, 87781, new Class[]{Activity.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.util.d.b()) {
            com.ss.android.ugc.aweme.util.d.a();
        }
        com.ss.android.ugc.aweme.net.b.a aVar7 = a.C0648a.f56918a;
        if (PatchProxy.isSupport(new Object[]{this}, aVar7, com.ss.android.ugc.aweme.net.b.a.f56915a, false, 61000, new Class[]{Activity.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.net.b.a aVar8 = aVar7;
            PatchProxy.accessDispatch(new Object[]{this}, aVar8, com.ss.android.ugc.aweme.net.b.a.f56915a, false, 61000, new Class[]{Activity.class}, Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.net.b.a.f56915a, true, 61004, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.net.b.a.f56915a, true, 61004, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                if (com.ss.android.ugc.aweme.net.b.a.f56916c == null) {
                    Boolean bool = (Boolean) SharePrefCache.inst().getShowVideoBitrateInfo().c();
                    if (bool == null) {
                        z2 = false;
                    } else {
                        z2 = bool.booleanValue();
                    }
                    com.ss.android.ugc.aweme.net.b.a.f56916c = Boolean.valueOf(z2);
                }
                z = com.ss.android.ugc.aweme.net.b.a.f56916c.booleanValue();
            }
            if (z) {
                aVar7.f56917b = new TextView(this);
                aVar7.f56917b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                aVar7.f56917b.setPadding(10, (int) UIUtils.dip2Px(this, 30.0f), 0, 0);
                aVar7.f56917b.setTextColor(-65536);
                ((FrameLayout) findViewById(16908290)).addView(aVar7.f56917b);
            }
        }
        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.im.b.f50051a, true, 50045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.im.b.f50051a, true, 50045, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.im.b.a();
        }
        setSplashSkipView();
        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.app.ai.f33757a, true, 22566, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.app.ai.f33757a, true, 22566, new Class[0], Void.TYPE);
        } else {
            i.a(com.ss.android.ugc.aweme.app.aj.f33760b, (Executor) com.ss.android.ugc.aweme.thread.h.e());
        }
        this.mIsLogin = com.ss.android.ugc.aweme.account.d.a().isLogin();
        recordLaunchDate();
        ag i3 = ag.i();
        if (PatchProxy.isSupport(new Object[0], i3, ag.f3141a, false, 40161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i3, ag.f3141a, false, 40161, new Class[0], Void.TYPE);
        } else if (i3.j > 0) {
            i3.h();
        } else {
            i3.j = SystemClock.uptimeMillis();
        }
        com.ss.android.ugc.aweme.update.d a4 = com.ss.android.ugc.aweme.update.d.a();
        if (PatchProxy.isSupport(new Object[0], a4, com.ss.android.ugc.aweme.update.d.f75210a, false, 87363, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a4, com.ss.android.ugc.aweme.update.d.f75210a, false, 87363, new Class[0], Void.TYPE);
        } else {
            i.a((Callable<TResult>) new com.ss.android.ugc.aweme.update.e<TResult>(a4), (Executor) com.ss.android.ugc.aweme.thread.h.c());
        }
        com.ss.android.ugc.aweme.commercialize.splash.a.a().m = true;
        this.mBroadCastRegister = new k();
        if (getApplication() != null) {
            this.mBroadCastRegister.b(getApplication());
        }
        larksso();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
    }

    private void enterRecordFrom3rdPlatform(Intent intent, boolean z) {
        if (PatchProxy.isSupport(new Object[]{intent, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 57148, new Class[]{Intent.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent, Byte.valueOf(z)}, this, changeQuickRedirect, false, 57148, new Class[]{Intent.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService == null || !iAVService.needLoginBeforeRecord()) {
                lambda$enterRecordFrom3rdPlatform$8$MainActivity(intent);
            } else {
                com.ss.android.ugc.aweme.login.e.a((Activity) getActivity(), this.mEventType, "click_system_camera", ad.a().a("login_title", getString(C0906R.string.c7i)).f75487b, (com.ss.android.ugc.aweme.base.component.f) new p(this, intent));
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        int i2 = i;
        KeyEvent keyEvent2 = keyEvent;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent2}, this, changeQuickRedirect, false, 57162, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent2}, this, changeQuickRedirect, false, 57162, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            boolean z3 = false;
            for (com.ss.android.ugc.aweme.base.activity.a a2 : this.mActivityOnKeyDownListeners) {
                if (a2.a(i2, keyEvent2)) {
                    z3 = true;
                }
            }
            if (z3) {
                return true;
            }
            if (i2 == 4) {
                bu buVar = this.mScrollSwitchHelper;
                if (PatchProxy.isSupport(new Object[0], buVar, bu.f54648a, false, 57670, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], buVar, bu.f54648a, false, 57670, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    z = TextUtils.equals("page_discover", buVar.b());
                }
                if (z) {
                    bu buVar2 = this.mScrollSwitchHelper;
                    if (PatchProxy.isSupport(new Object[0], buVar2, bu.f54648a, false, 57678, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], buVar2, bu.f54648a, false, 57678, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        CommonPageFragment d2 = buVar2.k.d("page_discover");
                        if (d2 != null && d2.handleBackPress()) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
                if (!this.mScrollSwitchHelper.i()) {
                    return super.onKeyDown(i, keyEvent);
                }
                return true;
            } else if (i2 != 67) {
                return false;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, changeQuickRedirect, false, 57114, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, changeQuickRedirect, false, 57114, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i3 == 10005) {
            if (!AbTestManager.a().bi()) {
                if (intent2 != null && intent2.getIntExtra("error_code", -18) == 1030) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bi).a();
                }
                syncToToutiao(2400);
            } else if (intent2 != null) {
                if (intent2.getIntExtra("error_code", -18) == 1030) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bi).a();
                    return;
                }
                if (!intent2.hasExtra("error_code")) {
                    showSyncToutiaoDialog(2400);
                }
                return;
            }
        }
        if (i3 == 1 && i4 == 2) {
            bu buVar = this.mScrollSwitchHelper;
            if (PatchProxy.isSupport(new Object[0], buVar, bu.f54648a, false, 57663, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], buVar, bu.f54648a, false, 57663, new Class[0], Void.TYPE);
            } else if (buVar.j != null) {
                buVar.d("page_profile");
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
        if (this.mAvatarPresenter != null) {
            this.mAvatarPresenter.a(i3, i4, intent2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r21, @android.support.annotation.NonNull java.lang.String[] r22, @android.support.annotation.NonNull int[] r23) {
        /*
            r20 = this;
            r0 = r22
            r1 = r23
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r10 = 0
            r3[r10] = r4
            r11 = 1
            r3[r11] = r0
            r12 = 2
            r3[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 57196(0xdf6c, float:8.0149E-41)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005d
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r13[r10] = r3
            r13[r11] = r0
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = changeQuickRedirect
            r16 = 0
            r17 = 57196(0xdf6c, float:8.0149E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005d:
            super.onRequestPermissionsResult(r21, r22, r23)
            int r2 = r1.length
            if (r2 != 0) goto L_0x0064
            return
        L_0x0064:
            int r2 = r1.length
            r3 = 0
        L_0x0066:
            if (r3 >= r2) goto L_0x0072
            r4 = r1[r3]
            r5 = -1
            if (r4 != r5) goto L_0x006f
            r10 = 1
            goto L_0x0072
        L_0x006f:
            int r3 = r3 + 1
            goto L_0x0066
        L_0x0072:
            if (r10 != 0) goto L_0x0075
            return
        L_0x0075:
            r2 = r21
            if (r2 != r12) goto L_0x008b
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService> r3 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.class
            java.lang.Object r2 = r2.getService(r3)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r2 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r2
            r3 = r20
            r2.onRequestPermissionsResult(r3, r0, r1)
            goto L_0x008d
        L_0x008b:
            r3 = r20
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    public void onPublishServiceConnected(c cVar, ServiceConnectionImpl serviceConnectionImpl, Object obj) {
        ServiceConnectionImpl serviceConnectionImpl2 = serviceConnectionImpl;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{cVar, serviceConnectionImpl2, obj2}, this, changeQuickRedirect, false, 57184, new Class[]{c.class, ServiceConnectionImpl.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, serviceConnectionImpl2, obj2}, this, changeQuickRedirect, false, 57184, new Class[]{c.class, ServiceConnectionImpl.class, Object.class}, Void.TYPE);
            return;
        }
        ag.i().h();
        bg.a(new com.ss.android.ugc.aweme.story.model.b(-1, null, null, null));
        if (this.processedCallback != null) {
            this.processedCallback.onStartPublish();
        }
        bg.a(new com.ss.android.ugc.aweme.shortvideo.f.d(true));
        if (MainPageExperimentHelper.d() || !AbTestManager.a().I() || AbTestManager.a().G().intValue() != 2) {
            PublishDialogFragment publishDialogFragment = (PublishDialogFragment) ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createPublishDialogFragment();
            Bundle bundle = new Bundle();
            if (obj2 != null) {
                if (obj2 instanceof Serializable) {
                    bundle.putSerializable("args", (Serializable) obj2);
                } else if (obj2 instanceof Parcelable) {
                    bundle.putParcelable("args", (Parcelable) obj2);
                }
            }
            publishDialogFragment.setArguments(bundle);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (PatchProxy.isSupport(new Object[]{supportFragmentManager, "publish"}, publishDialogFragment, PublishDialogFragment.f65389a, false, 74415, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
                PublishDialogFragment publishDialogFragment2 = publishDialogFragment;
                PatchProxy.accessDispatch(new Object[]{supportFragmentManager, "publish"}, publishDialogFragment2, PublishDialogFragment.f65389a, false, 74415, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
            } else {
                supportFragmentManager.beginTransaction().add(C0906R.id.cws, publishDialogFragment, "publish").commitAllowingStateLoss();
            }
            getSupportFragmentManager().registerFragmentLifecycleCallbacks(new PublishFragmentLifecycleCallbacks(getActivity(), serviceConnectionImpl2, this.processedCallback), false);
            return;
        }
        showUploadItemInNewFollowFeed(cVar);
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 57113, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 57113, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        showCustomToast(str2, i2, i3);
    }
}
