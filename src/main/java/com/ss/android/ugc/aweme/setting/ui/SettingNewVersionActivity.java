package com.ss.android.ugc.aweme.setting.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.sharedpref.f;
import com.ss.android.ugc.aweme.base.ui.session.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.k.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.model.g;
import com.ss.android.ugc.aweme.livewallpaper.c.e;
import com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.profile.d.x;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.serverpush.a.b;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;

public abstract class SettingNewVersionActivity extends AmeBaseActivity implements View.OnClickListener, IAccountService.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3864b;

    /* renamed from: a  reason: collision with root package name */
    private int f3865a;

    /* renamed from: c  reason: collision with root package name */
    protected Dialog f3866c;

    /* renamed from: d  reason: collision with root package name */
    protected AwemeAppData f3867d;

    /* renamed from: e  reason: collision with root package name */
    c f3868e;

    /* renamed from: f  reason: collision with root package name */
    private long f3869f;
    private List<Aweme> g;
    @BindView(2131492878)
    CommonItemView mAboutAmeItem;
    @BindView(2131492879)
    CommonItemView mAccessibility;
    @BindView(2131492880)
    CommonItemView mAccountAndSafetyItem;
    @BindView(2131493028)
    CommonItemView mAddAccount;
    @BindView(2131493540)
    CommonItemView mCheckUpdate;
    @BindView(2131493561)
    CommonItemView mClearCacheItem;
    @BindView(2131493719)
    CommonItemView mCommonProtocolItem;
    @BindView(2131493721)
    CommonItemView mCommunityPolicyItem;
    @BindView(2131493784)
    CommonItemView mCopyRightPolicyItem;
    @BindView(2131494091)
    CommonItemView mEditUserProfile;
    @BindView(2131494250)
    CommonItemView mFeedbackAndHelpItem;
    @BindView(2131494543)
    CommonItemView mGuidanceForParentsItem;
    @BindView(2131494598)
    CommonItemView mHelperCenter;
    @BindView(2131494820)
    CommonItemView mInsights;
    @Nullable
    @BindView(2131495206)
    CommonItemView mJoinTesters;
    @BindView(2131495648)
    CommonItemView mLocalLiveWallpaper;
    @BindView(2131495684)
    CommonItemView mLogout;
    @BindView(2131495769)
    CommonItemView mMicroApp;
    @BindView(2131494846)
    CommonItemView mMusInviteFriend;
    @BindView(2131495847)
    CommonItemView mMyQrCode;
    @BindView(2131495856)
    CommonItemView mMyWalletItem;
    @BindView(2131495982)
    CommonItemView mNotificationManagerItem;
    @BindView(2131496054)
    CommonItemView mOpenDebugTest;
    @BindView(2131496442)
    CommonItemView mPrivacyManagerItem;
    @BindView(2131496450)
    CommonItemView mPrivacyPolicyItem;
    @BindView(2131497483)
    CommonItemView mProtocolItem;
    @BindView(2131496884)
    CommonItemView mSafetyCenter;
    @BindView(2131497118)
    CommonItemView mShareProfileItem;
    @BindView(2131497360)
    CommonItemView mStorySetting;
    @BindView(2131497604)
    TextTitleBar mTitleBar;
    @BindView(2131498302)
    CommonItemView mUnderAgeProtection;
    @BindView(2131498373)
    TextView mUserInfo;
    @BindView(2131498421)
    TextView mVersionView;
    @BindView(2131496848)
    ViewGroup rootView;
    @BindView(2131497328)
    View statusBar;

    public int a() {
        return C0906R.layout.dx;
    }

    public void d() {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public abstract void k();

    public abstract void l();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    private void v() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72670, new Class[0], Void.TYPE);
            return;
        }
        ParentalPlatformManager.f2599b.a((ParentalPlatformManager.a) new ParentalPlatformManager.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64215a;

            public final void a(@NotNull Exception exc) {
                if (PatchProxy.isSupport(new Object[]{exc}, this, f64215a, false, 72686, new Class[]{Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{exc}, this, f64215a, false, 72686, new Class[]{Exception.class}, Void.TYPE);
                    return;
                }
                SettingNewVersionActivity.this.a(true);
            }

            public final void a(@NotNull com.ss.android.ugc.aweme.setting.serverpush.a.c cVar, boolean z) {
                if (PatchProxy.isSupport(new Object[]{cVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f64215a, false, 72685, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar, Byte.valueOf(z)}, this, f64215a, false, 72685, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                SettingNewVersionActivity.this.a(true);
            }
        });
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72678, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(C0906R.anim.cx, C0906R.anim.da);
    }

    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72657, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72657, new Class[0], Void.TYPE);
            return;
        }
        r.a("enter_account_safety", (Map) d.a().a("enter_from", "settings_page").f34114b);
    }

    public void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72661, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72661, new Class[0], Void.TYPE);
            return;
        }
        r.a("display_settings", (Map) d.a().a("enter_from", "settings_page").f34114b);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72649, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72649, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        a.b(this.g);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72650, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72650, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    private boolean u() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72654, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72654, new Class[0], Boolean.TYPE)).booleanValue();
        }
        b a2 = com.ss.android.ugc.aweme.setting.c.a.a();
        if (!com.ss.android.g.a.a() || ex.b() || a2 == null || ((!a2.f64022b || TextUtils.isEmpty(a2.f64023c)) && !TextUtils.equals(com.ss.android.ugc.aweme.framework.core.a.b().f3304b, "beta"))) {
            return false;
        }
        return true;
    }

    public void t() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72676, new Class[0], Void.TYPE);
            return;
        }
        AppLogNewUtils.onEventV3("click_insight", null);
        r.a("click_insight", (Map) d.a().a("enter_from", "settings_page").f34114b);
        r.a("enter_insight_detail", (Map) d.a().a("enter_from", "settings_page").f34114b);
    }

    public final void w() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72666, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.account.d.a().allUidList().size() < 3) {
            MultiAccountViewModel.a((FragmentActivity) this, "", "add_account_setting");
        } else {
            com.bytedance.ies.dmt.ui.d.a.c((Context) this, (int) C0906R.string.co).a();
        }
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72647, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72647, new Class[0], Void.TYPE);
            return;
        }
        this.mTitleBar.setTitle((int) C0906R.string.clr);
        this.mTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64208a;

            public final void b(View view) {
            }

            public final void a(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f64208a, false, 72682, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f64208a, false, 72682, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                SettingNewVersionActivity.this.exit(view2);
            }
        });
        this.f3867d = AwemeAppData.p();
        if (com.ss.android.g.a.a() || e.c()) {
            this.mLocalLiveWallpaper.setVisibility(8);
        } else {
            this.mLocalLiveWallpaper.setVisibility(0);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72651, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72651, new Class[0], Void.TYPE);
            } else {
                this.statusBar.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(this);
            }
        }
        if (AbTestManager.a().al()) {
            this.mAddAccount.setVisibility(0);
        }
        if (ex.b()) {
            this.mAccessibility.setVisibility(8);
        }
        if (com.ss.android.g.a.a() && Build.VERSION.SDK_INT >= 21) {
            this.mCheckUpdate.setVisibility(0);
        }
        if (u()) {
            this.mJoinTesters.setVisibility(0);
        }
    }

    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72648, new Class[0], Void.TYPE);
            return;
        }
        this.mOpenDebugTest.setLeftText("Debug Test");
        this.mOpenDebugTest.setVisibility(8);
        if (com.ss.android.ugc.aweme.account.d.a().getCurUser() != null && com.ss.android.ugc.aweme.account.d.a().getCurUser().getIsCreater() && ((Boolean) SharePrefCache.inst().getCanCreateInsights().c()).booleanValue()) {
            this.mInsights.setVisibility(0);
        }
        this.g = a.a();
        if (this.g == null) {
            this.g = (List) getIntent().getSerializableExtra("aweme_list");
        }
        if (com.ss.android.g.a.b() && this.g == null) {
            String stringExtra = getIntent().getStringExtra("aweme_list_str");
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    this.g = (List) new Gson().fromJson(stringExtra, new TypeToken<List<Aweme>>() {
                    }.getType());
                } catch (Exception unused) {
                }
            }
        }
    }

    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72652, new Class[0], Void.TYPE);
            return;
        }
        this.mEditUserProfile.setOnClickListener(this);
        this.mAccountAndSafetyItem.setOnClickListener(this);
        this.mNotificationManagerItem.setOnClickListener(this);
        this.mPrivacyManagerItem.setOnClickListener(this);
        this.mUnderAgeProtection.setOnClickListener(this);
        this.mCommonProtocolItem.setOnClickListener(this);
        this.mStorySetting.setOnClickListener(this);
        this.mFeedbackAndHelpItem.setOnClickListener(this);
        this.mHelperCenter.setOnClickListener(this);
        this.mProtocolItem.setOnClickListener(this);
        this.mAboutAmeItem.setOnClickListener(this);
        this.mPrivacyPolicyItem.setOnClickListener(this);
        this.mCopyRightPolicyItem.setOnClickListener(this);
        this.mClearCacheItem.setOnClickListener(this);
        this.mOpenDebugTest.setOnClickListener(this);
        this.mLocalLiveWallpaper.setOnClickListener(this);
        this.mAddAccount.setOnClickListener(this);
        this.mLogout.setOnClickListener(this);
        this.mMyWalletItem.setOnClickListener(this);
        this.mShareProfileItem.setOnClickListener(this);
        this.mMyQrCode.setOnClickListener(this);
        this.mCommunityPolicyItem.setOnClickListener(this);
        this.mGuidanceForParentsItem.setOnClickListener(this);
        this.mInsights.setOnClickListener(this);
        this.mSafetyCenter.setOnClickListener(this);
        this.mMusInviteFriend.setOnClickListener(this);
        this.mAccessibility.setOnClickListener(this);
        this.mCheckUpdate.setOnClickListener(this);
        if (u()) {
            this.mJoinTesters.setOnClickListener(this);
        }
    }

    public void exit(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3864b, false, 72674, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3864b, false, 72674, new Class[]{View.class}, Void.TYPE);
            return;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3864b, false, 72646, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3864b, false, 72646, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        c();
        h();
        i();
        com.benchmark.bl.a.b().a(1);
    }

    @Subscribe
    public void onEvent(g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3864b, false, 72677, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3864b, false, 72677, new Class[]{g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(AllStoryActivity.f73306b, gVar.itemType)) {
            dv.a(this, this.rootView, gVar);
        }
    }

    @OnClick({2131498373})
    public void onUserInfoClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3864b, false, 72673, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3864b, false, 72673, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ey.a("user_info", this, this.mUserInfo.getText().toString());
    }

    private boolean b(boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3864b, false, 72669, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3864b, false, 72669, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!TimeLockRuler.isRuleValid()) {
            return false;
        } else {
            if (com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b.b() != b.a.CHILD) {
                com.ss.android.ugc.aweme.antiaddic.lock.d.a((a.C0450a<Boolean>) new a.C0450a<Boolean>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64213a;

                    public final /* synthetic */ void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.isSupport(new Object[]{bool}, this, f64213a, false, 72684, new Class[]{Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool}, this, f64213a, false, 72684, new Class[]{Boolean.class}, Void.TYPE);
                            return;
                        }
                        SettingNewVersionActivity.this.r();
                    }
                }, "logout");
                return true;
            } else if (!z) {
                v();
                return true;
            } else {
                boolean isTimeLockOn = TimeLockRuler.isTimeLockOn();
                boolean isContentFilterOn = TimeLockRuler.isContentFilterOn();
                if (!isTimeLockOn && !isContentFilterOn) {
                    return false;
                }
                if (isContentFilterOn) {
                    i = C0906R.string.q1;
                } else {
                    i = C0906R.string.q2;
                }
                com.bytedance.ies.dmt.ui.d.a.a((Context) this, i).a();
                return true;
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3864b, false, 72668, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3864b, false, 72668, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown() && !((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished()) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bt6).a();
        } else if (!NetworkUtils.isNetworkAvailable(this)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
        } else if (isActive() && !b(z)) {
            r();
        }
    }

    @OnClick({2131498421})
    public void onVersionClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3864b, false, 72672, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3864b, false, 72672, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (System.currentTimeMillis() - this.f3869f < 500) {
            this.f3865a++;
        } else {
            this.f3865a = 0;
        }
        if (this.f3865a >= 4) {
            this.mUserInfo.setVisibility(0);
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            this.mUserInfo.setText(("UserId: " + com.ss.android.ugc.aweme.account.d.a().getCurUserId()) + "\n" + ("DeviceId: " + serverDeviceId) + "\n" + ("UpdateVerionCode: " + i.a().getUpdateVersionCode()) + "\nGitSHA: 70269d3c718" + "\n" + ("VESDK: " + iAVService.getVESDKVersion()) + "\n" + ("EffectSdk: " + iAVService.getEffectSDKVersion()) + "\n" + AwemeAppData.p().d());
            this.f3865a = 0;
        }
        this.f3869f = System.currentTimeMillis();
    }

    public void onClick(View view) {
        f fVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f3864b, false, 72653, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3864b, false, 72653, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.a90) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72656, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72656, new Class[0], Void.TYPE);
                } else {
                    r.a("edit_profile", (Map) d.a().a("enter_method", "click_setting_profile").f34114b);
                    startActivity(new Intent(this, ProfileEditActivity.class));
                }
            }
        } else if (id == C0906R.id.v) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                j();
            }
        } else if (id == C0906R.id.bt8) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                k();
            }
        } else if (id == C0906R.id.c62) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                l();
            }
        } else if (id == C0906R.id.dnw) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72658, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72658, new Class[0], Void.TYPE);
                } else {
                    r.a("enter_teen_protection", (Map) d.a().a("enter_method", "click_button").a("enter_from", "settings_page").f34114b);
                    ParentalPlatformManager.a((Activity) this);
                }
            }
        } else if (id == C0906R.id.xu) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                m();
            }
        } else if (id == C0906R.id.cw6) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                d();
            }
        } else if (id == C0906R.id.ad4) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                n();
            }
        } else if (id == C0906R.id.anx) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            }
        } else if (id == C0906R.id.d02) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                o();
            }
        } else if (id == C0906R.id.t) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72662, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72662, new Class[0], Void.TYPE);
                } else if (!NetworkUtils.isNetworkAvailable(this)) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
                } else {
                    h.a().a((Activity) this, "aweme://about_activity");
                }
            }
        } else if (id == C0906R.id.c6_) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                p();
            }
        } else if (id == C0906R.id.zz) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            }
        } else if (id == C0906R.id.t6) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                q();
            }
        } else if (id == C0906R.id.bv3) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72665, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72665, new Class[0], Void.TYPE);
                } else {
                    if (com.ss.android.ugc.aweme.g.a.a()) {
                        h.a().a((Activity) this, "aweme://test_setting");
                    }
                }
            }
        } else if (id == C0906R.id.bjn) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72664, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72664, new Class[0], Void.TYPE);
                } else {
                    r.a("live_photo_manage", (Map) d.a().a("enter_from", "settings_page").f34114b);
                    startActivity(new Intent(this, LocalLiveWallPaperActivity.class));
                }
            }
        } else if (id == C0906R.id.dd) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72667, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72667, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (TimeLockRuler.isSelfContentFilterOn()) {
                    com.ss.android.ugc.aweme.antiaddic.lock.d.a((a.C0450a<Boolean>) new a.C0450a<Boolean>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f64211a;

                        public final /* synthetic */ void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            if (PatchProxy.isSupport(new Object[]{bool}, this, f64211a, false, 72683, new Class[]{Boolean.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{bool}, this, f64211a, false, 72683, new Class[]{Boolean.class}, Void.TYPE);
                                return;
                            }
                            SettingNewVersionActivity.this.w();
                        }
                    }, "add_account");
                } else if (TimeLockRuler.isParentalPlatformContentFilterOn()) {
                    com.bytedance.ies.dmt.ui.d.a.c((Context) this, (int) C0906R.string.ad6).a();
                } else {
                    z = false;
                }
                if (!z) {
                    w();
                }
            }
        } else if (id == C0906R.id.bkm) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                a(false);
            }
        } else if (id == C0906R.id.bpl) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            }
        } else if (id == C0906R.id.cqc) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72675, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72675, new Class[0], Void.TYPE);
                } else {
                    r.a("click_share_person", (Map) d.a().a("enter_from", "settings_page").f34114b);
                    User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                    if (curUser != null) {
                        x.a(this, curUser, this.g);
                    }
                }
            }
        } else if (id == C0906R.id.bpc) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            }
        } else if (id == C0906R.id.xw) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                s();
            }
        } else if (id == C0906R.id.am9) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            }
        } else if (id == C0906R.id.auy) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.base.sharedpref.e.f34884a, true, 24889, new Class[0], f.class)) {
                    fVar = (f) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.base.sharedpref.e.f34884a, true, 24889, new Class[0], f.class);
                } else {
                    fVar = com.ss.android.ugc.aweme.base.sharedpref.e.a("show_insights_red");
                }
                fVar.b("show_insights_red", false);
                t();
            }
        } else if (id == C0906R.id.cj1) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            }
        } else if (id == C0906R.id.avf) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            }
        } else if (id == C0906R.id.u) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72655, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72655, new Class[0], Void.TYPE);
                } else {
                    startActivity(new Intent(this, AccessibilitySettingActivity.class));
                }
            }
        } else if (id == C0906R.id.s9) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            }
        } else if (id == C0906R.id.b70 && !com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72663, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72663, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.setting.serverpush.a.b a2 = com.ss.android.ugc.aweme.setting.c.a.a();
            if (a2 != null && !TextUtils.isEmpty(a2.f64023c)) {
                Intent intent = new Intent(this, CrossPlatformActivity.class);
                intent.putExtra(PushConstants.TITLE, getString(C0906R.string.b3y));
                intent.setData(Uri.parse(a2.f64023c));
                startActivity(intent);
            }
        }
    }

    public final void a(int i, boolean z, int i2, @Nullable User user) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), user}, this, f3864b, false, 72671, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2), user}, this, f3864b, false, 72671, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, User.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3864b, false, 72680, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3864b, false, 72680, new Class[0], Void.TYPE);
            return;
        }
        if (!isFinishing() && this.f3868e != null && this.f3868e.isShowing()) {
            this.f3868e.dismiss();
        }
    }
}
