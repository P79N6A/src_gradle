package com.ss.android.ugc.aweme.setting.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.b.a.a.a;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commerce.service.logs.s;
import com.ss.android.ugc.aweme.commercialize.link.e;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.im.f;
import com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity;
import com.ss.android.ugc.aweme.profile.d.aa;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.y;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity;
import com.ss.android.ugc.aweme.story.live.b;
import com.ss.android.ugc.aweme.u.z;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;
import java.io.File;
import java.util.Map;

public class DouYinSettingNewVersionActivity extends SettingNewVersionActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64146a;

    /* renamed from: f  reason: collision with root package name */
    private aa f64147f;
    private boolean g;
    @BindView(2131493014)
    CommonItemView mAdStarAtlasItem;
    @BindView(2131495381)
    CommonItemView mLinkAuth;
    @BindView(2131495769)
    CommonItemView mMicroApp;
    @BindView(2131496922)
    NestedScrollView mScrollView;
    @BindView(2131494033)
    ViewGroup mSettingContainer;
    @BindView(2131497141)
    CommonItemView mShoppingGuideItem;
    @BindView(2131497564)
    View mThirdServiceDivider;
    @BindView(2131492884)
    ViewGroup mVgAccountDivider;
    @BindView(2131494226)
    ViewGroup mVgFansPlus;
    @BindView(2131496831)
    ViewGroup mVgRocket;
    @BindView(2131497690)
    ViewGroup mVgTouTiao;
    @BindView(2131495857)
    CommonItemView mWalletItem;

    public final int a() {
        return C0906R.layout.dy;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64146a, false, 72502, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64146a, false, 72502, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DouYinSettingNewVersionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void v() {
        m.a(this.f3866c);
        q.a(this, "log_out_popup", "cancel");
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72475, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72475, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        ((IAVService) ServiceManager.get().getService(IAVService.class)).startStorySettingActivity(this, 1, 2, false, true, false);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72477, new Class[0], Void.TYPE);
            return;
        }
        super.h();
        a.a(new e(this));
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72478, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72478, new Class[0], Void.TYPE);
            return;
        }
        super.i();
        this.mWalletItem.setOnClickListener(this);
        this.mMicroApp.setOnClickListener(this);
        this.mLinkAuth.setOnClickListener(this);
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72485, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72485, new Class[0], Void.TYPE);
            return;
        }
        super.j();
        startActivity(new Intent(this, SettingAccountAndSafetyActivity.class));
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72488, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72488, new Class[0], Void.TYPE);
            return;
        }
        super.m();
        startActivity(new Intent(this, SettingCommonProtocolActivity.class));
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72476, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72476, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        c.a().removeLoginOrLogoutListener(this);
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72491, new Class[0], Void.TYPE);
            return;
        }
        Dialog showPrivacyDialog = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).showPrivacyDialog(this);
        if (showPrivacyDialog != null) {
            showPrivacyDialog.show();
        }
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72501, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72501, new Class[0], Void.TYPE);
            return;
        }
        super.t();
    }

    @OnClick({2131496831})
    public void clickRocket() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72498, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72498, new Class[0], Void.TYPE);
            return;
        }
        r.a("rocket", (Map) d.a().a("enter_from", "personal_homepage").a("enter_method", "click_navigation").f34114b);
        com.ss.android.ugc.aweme.profile.q.a(this, com.ss.android.ugc.aweme.account.d.a().getCurUser().getrFansGroupInfo());
    }

    @OnClick({2131497690})
    public void clickToutiao() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72499, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72499, new Class[0], Void.TYPE);
            return;
        }
        r.a("enter_toutiao_homepage", (Map) d.a().a("enter_from", "personal_homepage").a("enter_method", "click_navigation").f34114b);
        if (this.f64147f == null) {
            this.f64147f = new aa();
        }
        this.f64147f.a(this, com.ss.android.ugc.aweme.account.d.a().getCurUserFollowDetail("com.ss.android.article.news"), com.ss.android.ugc.aweme.account.d.a().getCurUser(), null);
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72486, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72486, new Class[0], Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("notice_manage_click").setLabelName("settings"));
        z.a("enter_notification_setting").a("previous_page", "settings_page").a("enter_method", "click_button").e();
        startActivity(new Intent(this, PushSettingManagerActivity.class));
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72487, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72487, new Class[0], Void.TYPE);
            return;
        }
        z.a("enter_privacy_setting").a("previous_page", "settings_page").a("enter_method", "click_button").e();
        startActivity(new Intent(this, PrivacyActivity.class));
        if (PatchProxy.isSupport(new Object[0], null, f.f50065a, true, 50099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f.f50065a, true, 50099, new Class[0], Void.TYPE);
        } else {
            r.onEvent(MobClick.obtain().setEventName("privacy").setLabelName("settings"));
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72490, new Class[0], Void.TYPE);
            return;
        }
        z.a("enter_user_agreement").a("previous_page", "general_settings").a("enter_method", "click_button").h().e();
        if (!NetworkUtils.isNetworkAvailable(this)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
        } else {
            com.ss.android.ugc.aweme.bridgeservice.a.a().showProtocolDialog(this);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72472, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DouYinSettingNewVersionActivity", "onResume", true);
        super.onResume();
        if (this.g) {
            this.g = false;
            bg.a(new e());
        }
        a(com.ss.android.ugc.aweme.account.d.a().getCurUser());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DouYinSettingNewVersionActivity", "onResume", false);
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72493, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72493, new Class[0], Void.TYPE);
            return;
        }
        z.a("click_clean_cache_button").a("enter_from", "settings_page").e();
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/aweme_monitor");
        if (file.exists()) {
            file.delete();
        }
        try {
            new AlertDialog.Builder(this).setItems((CharSequence[]) getResources().getStringArray(C0906R.array.g), (DialogInterface.OnClickListener) new g(this)).create().show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72497, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72497, new Class[0], Void.TYPE);
            return;
        }
        z.a("enter_community_agreement").a("previous_page", "general_settings").a("enter_method", "click_button").h().e();
        Intent intent = new Intent(this, CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_load_dialog", true);
        intent.putExtra("hide_nav_bar", true);
        bundle.putString(PushConstants.TITLE, getString(C0906R.string.bqv));
        intent.putExtras(bundle);
        intent.setData(Uri.parse("https://aweme.snssdk.com/magic/page/ejs/5ca204b709a5900217b1f018?appType=douyin"));
        startActivity(intent);
    }

    @OnClick({2131494226})
    public void clickFansPlus() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72500, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72500, new Class[0], Void.TYPE);
            return;
        }
        String str = (String) SharePrefCache.inst().getSyncToTTUrl().c();
        if (((Integer) SharePrefCache.inst().getSyncTT().c()).intValue() == 1) {
            Intent intent = new Intent(this, CrossPlatformActivity.class);
            r.onEvent(MobClick.obtain().setEventName("fans_power_click").setLabelName("personal_homepage"));
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_load_dialog", true);
            intent.putExtras(bundle);
            intent.setData(Uri.parse(str));
            intent.putExtra("hide_nav_bar", true);
            intent.putExtra("hide_status_bar", true);
            startActivity(intent);
            overridePendingTransition(C0906R.anim.d0, C0906R.anim.d9);
        }
        r.a("fans_plus", (Map) d.a().a("enter_from", "personal_homepage").a("enter_method", "click_navigation").f34114b);
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72489, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72489, new Class[0], Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setLabelName("settings").setEventName("FAQ"));
        r.a("click_feedback_entrance", (Map) new d().a("enter_from", "settings").f34114b);
        r.a("FAQ", (Map) d.a().a("enter_from", "settings").f34114b);
        r.a("click_feedback_entrance", (Map) d.a().a("enter_from", "settings").f34114b);
        Intent intent = new Intent(this, CrossPlatformActivity.class);
        try {
            h.a().a(g.b().aQ().getNormalEntry());
        } catch (Exception unused) {
            intent.setData(Uri.parse("https://aweme.snssdk.com/falcon/douyin_falcon/faq/?enter_from=settings"));
            intent.putExtra("hide_nav_bar", true);
            startActivity(intent);
        }
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72494, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72495, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3866c == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle((int) C0906R.string.a15).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new h(this)).setPositiveButton((int) C0906R.string.b7r, (DialogInterface.OnClickListener) new i(this));
            if (AbTestManager.a().al()) {
                builder.setMessage((CharSequence) com.ss.android.ugc.aweme.account.d.a().getCurUser().getNickname());
            }
            this.f3866c = builder.create();
        }
        this.f3866c.show();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void u() {
        if (!NetworkUtils.isNetworkAvailable(this)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
            return;
        }
        m.a(this.f3866c);
        q.a(this, "log_out_popup", "confirm");
        if (!com.ss.android.ugc.aweme.d.c.a(this, "log_out")) {
            r.a("log_out", (Map) d.a().a("enter_from", "settings_page").a("f_mode", ex.b() ? 1 : 0).f34114b);
            c.a().addLoginOrLogoutListener(this);
            if (PatchProxy.isSupport(new Object[0], this, SettingNewVersionActivity.f3864b, false, 72679, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, SettingNewVersionActivity.f3864b, false, 72679, new Class[0], Void.TYPE);
            } else {
                runOnUiThread(new r(this));
            }
            c.b().logout("user_logout");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00be, code lost:
        if (r0 != false) goto L_0x00c0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.TargetApi(23)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r19 = this;
            r7 = r19
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f64146a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 72474(0x11b1a, float:1.01558E-40)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f64146a
            r3 = 0
            r4 = 72474(0x11b1a, float:1.01558E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            super.c()
            android.view.ViewGroup r0 = r7.rootView
            android.content.res.Resources r1 = r19.getResources()
            r2 = 2131625005(0x7f0e042d, float:1.8877206E38)
            int r1 = r1.getColor(r2)
            r0.setBackgroundColor(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mMyWalletItem
            r9 = 8
            r0.setVisibility(r9)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mHelperCenter
            r0.setVisibility(r9)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mCopyRightPolicyItem
            r0.setVisibility(r9)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mGuidanceForParentsItem
            r0.setVisibility(r9)
            android.view.ViewGroup r0 = r7.mSettingContainer
            r0.setVisibility(r8)
            boolean r0 = com.ss.android.ugc.aweme.wallet.a.a()
            if (r0 == 0) goto L_0x0063
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mWalletItem
            r0.setVisibility(r8)
            goto L_0x0068
        L_0x0063:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mWalletItem
            r0.setVisibility(r9)
        L_0x0068:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.link.a.a()
            r10 = 0
            if (r0 != 0) goto L_0x00c0
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.link.a.f38942a
            r14 = 1
            r15 = 30845(0x787d, float:4.3223E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x009c
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.link.a.f38942a
            r14 = 1
            r15 = 30845(0x787d, float:4.3223E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00be
        L_0x009c:
            com.ss.android.ugc.aweme.commercialize.link.a r0 = com.ss.android.ugc.aweme.commercialize.link.a.f38944c
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            if (r1 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            if (r1 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct r1 = r1.getCommercePermission()
            if (r1 == 0) goto L_0x00b7
            int r1 = r1.adLink
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00b8
        L_0x00b7:
            r1 = r10
        L_0x00b8:
            r2 = 11
            boolean r0 = r0.a((java.lang.Integer) r1, (int) r2)
        L_0x00be:
            if (r0 == 0) goto L_0x0114
        L_0x00c0:
            java.lang.String r0 = "settings_page"
            com.ss.android.ugc.aweme.commercialize.link.c.a(r0)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mLinkAuth
            r0.setVisibility(r8)
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.link.a.f38942a
            r14 = 1
            r15 = 30848(0x7880, float:4.3227E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x00f7
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.link.a.f38942a
            r14 = 1
            r15 = 30848(0x7880, float:4.3227E-41)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x010d
        L_0x00f7:
            com.ss.android.ugc.aweme.commercialize.link.a r0 = com.ss.android.ugc.aweme.commercialize.link.a.f38944c
            com.ss.android.ugc.aweme.app.an r0 = r0.e()
            java.lang.Object r0 = r0.c()
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.commercialize.link.a r1 = com.ss.android.ugc.aweme.commercialize.link.a.f38944c
            java.lang.String r1 = r1.d()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
        L_0x010d:
            if (r0 != 0) goto L_0x0114
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mLinkAuth
            r0.a()
        L_0x0114:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r11 = r0.getCurUser()
            if (r11 == 0) goto L_0x0167
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mShoppingGuideItem
            r0.setVisibility(r8)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mShoppingGuideItem
            r0.setOnClickListener(r7)
            boolean r0 = r11.isWithCommerceEntry()
            if (r0 == 0) goto L_0x0146
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mShoppingGuideItem
            android.content.res.Resources r1 = r19.getResources()
            r2 = 2131562451(0x7f0d0fd3, float:1.8750331E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setLeftText(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mShoppingGuideItem
            java.lang.String r1 = ""
            r0.setRightText(r1)
            goto L_0x016c
        L_0x0146:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mShoppingGuideItem
            android.content.res.Resources r1 = r19.getResources()
            r2 = 2131562449(0x7f0d0fd1, float:1.8750327E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setLeftText(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mShoppingGuideItem
            android.content.res.Resources r1 = r19.getResources()
            r2 = 2131562450(0x7f0d0fd2, float:1.875033E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setRightText(r1)
            goto L_0x016c
        L_0x0167:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mShoppingGuideItem
            r0.setVisibility(r9)
        L_0x016c:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f64146a
            r3 = 0
            r4 = 72482(0x11b22, float:1.01569E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0192
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f64146a
            r3 = 0
            r4 = 72482(0x11b22, float:1.01569E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01d4
        L_0x0192:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            com.ss.android.ugc.aweme.aj.b r1 = com.ss.android.ugc.aweme.aj.b.b()
            java.lang.String r2 = "star_atlas_url_default"
            java.lang.String r1 = r1.a(r7, r2)
            if (r0 == 0) goto L_0x01d4
            boolean r0 = r0.isWithStarAtlasEntry()
            if (r0 == 0) goto L_0x01d4
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01d4
            java.lang.String r0 = "show_starmap_assistant"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "navigation_panel"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            android.view.View r0 = r7.mThirdServiceDivider
            r0.setVisibility(r8)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mAdStarAtlasItem
            r0.setVisibility(r8)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mAdStarAtlasItem
            r0.setOnClickListener(r7)
        L_0x01d4:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mStorySetting
            r0.setVisibility(r8)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mUnderAgeProtection
            r0.setVisibility(r9)
            com.ss.android.ugc.aweme.app.AwemeAppData r0 = r7.f3867d
            com.ss.android.common.AppContext r0 = r0.c()
            java.lang.String r0 = r0.getVersion()
            boolean r1 = com.ss.android.ugc.aweme.g.a.a()
            r2 = 1
            if (r1 == 0) goto L_0x0259
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = " "
            r1.<init>(r3)
            com.ss.android.ugc.aweme.app.services.h r3 = com.ss.android.ugc.aweme.app.services.h.a(r19)
            java.lang.String r4 = "aweme_build_version"
            java.lang.String r5 = ""
            r6 = 2
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r8] = r4
            r12[r2] = r5
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.app.services.h.f34276a
            r15 = 0
            r16 = 23606(0x5c36, float:3.3079E-41)
            java.lang.Class[] r13 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r13[r8] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r13[r2] = r17
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r13
            r13 = r3
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r12 == 0) goto L_0x0241
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r8] = r4
            r12[r2] = r5
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.app.services.h.f34276a
            r15 = 0
            r16 = 23606(0x5c36, float:3.3079E-41)
            java.lang.Class[] r4 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r8] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r2] = r5
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r13 = r3
            r17 = r4
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0251
        L_0x0241:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x0251
            org.json.JSONObject r6 = r3.f34278b
            if (r6 == 0) goto L_0x0251
            org.json.JSONObject r3 = r3.f34278b
            java.lang.String r10 = r3.optString(r4, r5)
        L_0x0251:
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            goto L_0x025b
        L_0x0259:
            java.lang.String r1 = ""
        L_0x025b:
            android.widget.TextView r3 = r7.mVersionView
            r4 = 2131562371(0x7f0d0f83, float:1.8750169E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            r2[r8] = r0
            java.lang.String r0 = r7.getString(r4, r2)
            r3.setText(r0)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mEditUserProfile
            r0.setVisibility(r9)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mWalletItem
            r0.setVisibility(r9)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mShareProfileItem
            r0.setVisibility(r9)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r7.mMicroApp
            r0.setVisibility(r9)
            r7.a((com.ss.android.ugc.aweme.profile.model.User) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.DouYinSettingNewVersionActivity.c():void");
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f64146a, true, 72496, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f64146a, true, 72496, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            a(file2.getPath());
                        } else {
                            file2.delete();
                        }
                    }
                    file.delete();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64146a, false, 72471, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64146a, false, 72471, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DouYinSettingNewVersionActivity", "onCreate", true);
        super.onCreate(bundle);
        findViewById(16908290).setBackgroundResource(2130838193);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200);
        findViewById(C0906R.id.chu).startAnimation(alphaAnimation);
        com.benchmark.bl.a.b().a(1);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DouYinSettingNewVersionActivity", "onCreate", false);
    }

    public void setContentView(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64146a, false, 72470, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64146a, false, 72470, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(this).inflate(i, null);
        ((ViewStub) inflate.findViewById(C0906R.id.dvs)).inflate();
        setContentView(inflate);
    }

    private void a(User user) {
        int i;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{user}, this, f64146a, false, 72473, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f64146a, false, 72473, new Class[]{User.class}, Void.TYPE);
            return;
        }
        ViewGroup viewGroup = this.mVgTouTiao;
        int i4 = 8;
        if (ex.k(user)) {
            i = 0;
        } else {
            i = 8;
        }
        viewGroup.setVisibility(i);
        ViewGroup viewGroup2 = this.mVgRocket;
        if (ex.n(user)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        viewGroup2.setVisibility(i2);
        ViewGroup viewGroup3 = this.mVgFansPlus;
        if (!y.a(user) || ((Integer) SharePrefCache.inst().getSyncTT().c()).intValue() != 1) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        viewGroup3.setVisibility(i3);
        ViewGroup viewGroup4 = this.mVgAccountDivider;
        if (this.mVgTouTiao.getVisibility() == 0 || this.mVgRocket.getVisibility() == 0 || this.mVgFansPlus.getVisibility() == 0) {
            i4 = 0;
        }
        viewGroup4.setVisibility(i4);
    }

    public void onClick(View view) {
        String str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f64146a, false, 72479, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64146a, false, 72479, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.bpm) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72480, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72480, new Class[0], Void.TYPE);
                } else {
                    r.a("wallet_click", (Map) d.a().a("enter_from", "settings_page").f34114b);
                    com.ss.android.ugc.aweme.wallet.a.a(this, "page_index");
                    b.a("settings_page");
                    com.ss.android.ugc.aweme.sec.a.a("withdraw_money");
                    r.onEvent(new MobClick().setEventName("wallet").setLabelName("setting"));
                }
            }
        } else if (id == C0906R.id.bmv) {
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72481, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72481, new Class[0], Void.TYPE);
                } else {
                    if (this.mMicroApp.f20330d) {
                        this.mMicroApp.b();
                        SharePrefCache.inst().getShowMiniAppFreshGuideNotify().a(Boolean.FALSE);
                    }
                    r.a("click_mp_entrance", (Map) d.a().a("enter_from", "settings_page").f34114b);
                    startActivity(new Intent(this, RecentlyUsedMicroAppActivity.class));
                }
            }
        } else if (id == C0906R.id.cr1) {
            if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72484, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72484, new Class[0], Void.TYPE);
            } else {
                User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                if (curUser != null) {
                    if (TextUtils.isEmpty(curUser.getBindPhone())) {
                        c.c().bindMobile(this, "", null, null);
                    } else {
                        if (curUser.isWithCommerceEntry()) {
                            com.ss.android.ugc.aweme.commercialize.g.a((Context) this, com.ss.android.ugc.aweme.account.d.a().getVerifyStatus(), "setting_page", "click_toolbox", (com.ss.android.ugc.aweme.commerce.service.a.a) new f(this));
                        } else {
                            com.ss.android.ugc.aweme.commerce.a.a(this, "setting_page");
                            z = false;
                        }
                        s sVar = new s();
                        sVar.f38154f = "setting_page";
                        if (z) {
                            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                        } else {
                            str = PushConstants.PUSH_TYPE_NOTIFY;
                        }
                        sVar.g = str;
                        sVar.b();
                    }
                }
            }
        } else if (id == C0906R.id.bc6) {
            if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72492, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72492, new Class[0], Void.TYPE);
            } else {
                this.g = true;
                this.mLinkAuth.b();
                com.ss.android.ugc.aweme.commercialize.link.c.b("settings_page");
                if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.commercialize.link.a.f38942a, true, 30854, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.commercialize.link.a.f38942a, true, 30854, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.commercialize.link.a.f38944c.e().a(com.ss.android.ugc.aweme.commercialize.link.a.f38944c.d());
                }
                com.ss.android.ugc.aweme.commercialize.link.a.a((Activity) this, "settings");
            }
        } else if (id == C0906R.id.d0) {
            if (PatchProxy.isSupport(new Object[0], this, f64146a, false, 72483, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64146a, false, 72483, new Class[0], Void.TYPE);
            } else {
                r.a("click_starmap_assistant", (Map) d.a().a("enter_from", "navigation_panel").f34114b);
                if (NetworkUtils.isNetworkAvailable(this)) {
                    String a2 = com.ss.android.ugc.aweme.aj.b.b().a(this, "star_atlas_url_default");
                    if (!TextUtils.isEmpty(a2)) {
                        com.ss.android.ugc.aweme.commercialize.utils.g.a((Context) this, a2, "");
                    }
                } else {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
                }
            }
        } else {
            super.onClick(view);
        }
    }
}
