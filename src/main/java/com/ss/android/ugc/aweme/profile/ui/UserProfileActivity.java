package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ae.c;
import com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.ss.android.ugc.aweme.base.activity.a;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ab;
import com.ss.android.ugc.aweme.profile.presenter.q;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@AddPageTrace
public class UserProfileActivity extends AmeSlideSSActivity implements q {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f62385b;

    /* renamed from: c  reason: collision with root package name */
    private String f62386c;

    /* renamed from: d  reason: collision with root package name */
    private String f62387d;

    /* renamed from: e  reason: collision with root package name */
    private String f62388e;

    /* renamed from: f  reason: collision with root package name */
    private String f62389f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    @BindView(2131497340)
    protected DmtStatusView mDmtStatusView;
    @BindView(2131498523)
    LinearLayout mProfileLayout;
    @BindView(2131497175)
    SlideSwitchLayout mSlideSwitchLayout;
    private Aweme n;
    private String o;
    private String p;
    private String q;
    private int r;
    private ab s;
    private String t;
    private List<a> u = new ArrayList();

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f62385b, false, 69146, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62385b, false, 69146, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62385b, false, 69147, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62385b, false, 69147, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private static void a(Context context, String str, String str2, int i2, String str3) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, Integer.valueOf(i2), str6}, null, f62385b, true, 69116, new Class[]{Context.class, String.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, Integer.valueOf(i2), str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f62385b, true, 69116, new Class[]{Context.class, String.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
        } else if (context2 != null && str4 != null && !str4.equals("")) {
            Intent intent = new Intent(context2, UserProfileActivity.class);
            intent.putExtra("uid", str4);
            intent.putExtra("sec_user_id", str5);
            intent.putExtra("profile_enterprise_type", i2);
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("enter_from_request_id", str6);
            }
            context2.startActivity(intent);
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6}, null, f62385b, true, 69117, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f62385b, true, 69117, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE);
        } else if (context2 != null && !TextUtils.isEmpty(str)) {
            Intent intent = new Intent(context2, UserProfileActivity.class);
            intent.putExtra("enter_from", str6);
            intent.putExtra("uid", str4);
            intent.putExtra("sec_user_id", str5);
            context2.startActivity(intent);
        }
    }

    public static void a(Context context, User user, String str, String str2, String str3) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, user, str4, str5, str6}, null, f62385b, true, 69120, new Class[]{Context.class, User.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, user, str4, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f62385b, true, 69120, new Class[]{Context.class, User.class, String.class, String.class, String.class}, Void.TYPE);
        } else if (context2 != null && user != null && !TextUtils.isEmpty(user.getUid())) {
            String uid = user.getUid();
            String secUid = user.getSecUid();
            Intent intent = new Intent(context2, UserProfileActivity.class);
            intent.putExtra("enter_from", str4);
            intent.putExtra("uid", uid);
            intent.putExtra("sec_user_id", secUid);
            intent.putExtra("profile_enterprise_type", a(user));
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("enter_from_request_id", str5);
            }
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("extra_previous_page_position", str6);
            }
            context2.startActivity(intent);
        }
    }

    public static void a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f62385b, true, 69123, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f62385b, true, 69123, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
        } else if (context2 != null && str3 != null && !str3.equals("")) {
            Intent intent = new Intent(context2, UserProfileActivity.class);
            intent.putExtra("uid", str3);
            intent.putExtra("sec_user_id", str4);
            context2.startActivity(intent);
        }
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f62385b, false, 69143, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f62385b, false, 69143, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.o = str;
        this.q = str2;
        d();
        this.mDmtStatusView.b();
    }

    private UserProfileFragment f() {
        if (PatchProxy.isSupport(new Object[0], this, f62385b, false, 69137, new Class[0], UserProfileFragment.class)) {
            return (UserProfileFragment) PatchProxy.accessDispatch(new Object[0], this, f62385b, false, 69137, new Class[0], UserProfileFragment.class);
        }
        UserProfileFragment userProfileFragment = new UserProfileFragment();
        userProfileFragment.U = this.n;
        return userProfileFragment;
    }

    public final void Z_() {
        if (PatchProxy.isSupport(new Object[0], this, f62385b, false, 69144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62385b, false, 69144, new Class[0], Void.TYPE);
            return;
        }
        this.mDmtStatusView.b();
        onBackPressed();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f62385b, false, 69127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62385b, false, 69127, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    private void c() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f62385b, false, 69133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62385b, false, 69133, new Class[0], Void.TYPE);
            return;
        }
        if (TextUtils.equals(this.j, "open_screen_ad") && !TextUtils.isEmpty(this.o)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", "click_open_screen_ad");
                jSONObject.put("enter_method", "open_screen_ad");
            } catch (JSONException unused) {
            }
            if (TextUtils.equals(this.o, d.a().getCurUserId())) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            r.a((Context) this, "enter_detail", str, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, jSONObject);
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f62385b, false, 69135, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62385b, false, 69135, new Class[0], Void.TYPE);
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("userprofilefragment");
        if (findFragmentByTag == null) {
            if (com.ss.android.g.a.a()) {
                findFragmentByTag = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createUserProfileFragment();
            }
            if (findFragmentByTag == null) {
                findFragmentByTag = f();
            }
            findFragmentByTag.setArguments(e());
        }
        supportFragmentManager.beginTransaction().replace(C0906R.id.due, findFragmentByTag, "userprofilefragment").commitAllowingStateLoss();
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f62385b, false, 69140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62385b, false, 69140, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        c.a(this);
        if (PatchProxy.isSupport(new Object[0], this, f62385b, false, 69141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62385b, false, 69141, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.t)) {
            try {
                startActivity(new Intent(this, Class.forName(this.t)));
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    private Bundle e() {
        if (PatchProxy.isSupport(new Object[0], this, f62385b, false, 69136, new Class[0], Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[0], this, f62385b, false, 69136, new Class[0], Bundle.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("uid", this.o);
        bundle.putString("sec_user_id", this.q);
        bundle.putString("profile_from", this.f62386c);
        bundle.putString("video_id", this.f62387d);
        bundle.putString("profile_from", "other_user");
        bundle.putString("type", this.f62388e);
        bundle.putString("enter_method", this.l);
        bundle.putString("enter_from", this.j);
        bundle.putString("request_id", this.f62389f);
        bundle.putString("room_id", this.g);
        bundle.putString("room_owner_id", this.h);
        bundle.putString("user_type", this.i);
        bundle.putBoolean("isFromFeed", false);
        bundle.putString("poi_id", this.k);
        bundle.putString("extra_previous_page_position", getIntent().getStringExtra("extra_previous_page_position"));
        bundle.putString("enter_from_request_id", getIntent().getStringExtra("enter_from_request_id"));
        bundle.putString("scene_id", this.m);
        bundle.putInt("need_track_compare_recommend_reason", getIntent().getIntExtra("need_track_compare_recommend_reason", 0));
        bundle.putString("previous_recommend_reason", getIntent().getStringExtra("previous_recommend_reason"));
        bundle.putString("recommend_from_type", getIntent().getStringExtra("recommend_from_type"));
        bundle.putInt("is_cold_launch", getIntent().getIntExtra("is_cold_launch", 0));
        return bundle;
    }

    public final void a(@NonNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f62385b, false, 69128, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f62385b, false, 69128, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!this.u.contains(aVar)) {
            this.u.add(aVar);
        }
    }

    public final void b(@NonNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f62385b, false, 69129, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f62385b, false, 69129, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.u != null) {
            this.u.remove(aVar);
        }
    }

    private static int a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f62385b, true, 69125, new Class[]{User.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{user}, null, f62385b, true, 69125, new Class[]{User.class}, Integer.TYPE)).intValue();
        } else if (user == null) {
            return 0;
        } else {
            return user.getCommerceUserLevel();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x02c5, code lost:
        if (android.text.TextUtils.equals(r7.o, com.ss.android.ugc.aweme.account.d.a().getCurUserId()) != false) goto L_0x0296;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x03ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r7 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 69126(0x10e06, float:9.6866E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            r3 = 0
            r4 = 69126(0x10e06, float:9.6866E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.profile.ui.UserProfileActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            super.onCreate(r19)
            r18.requestDisableOptimizeViewHierarchy()
            r0 = 2131689665(0x7f0f00c1, float:1.9008352E38)
            r7.setContentView((int) r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r1 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            r0.setStatusBar(r7)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            r3 = 0
            r4 = 69131(0x10e0b, float:9.6873E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            r3 = 0
            r4 = 69131(0x10e0b, float:9.6873E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0167
        L_0x007f:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = com.ss.android.ugc.aweme.base.utils.p.c(r18)
            r2 = -1
            r0.<init>(r1, r2)
            android.widget.LinearLayout r1 = r7.mProfileLayout
            r1.setLayoutParams(r0)
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout r0 = r7.mSlideSwitchLayout
            r0.setScrowToChildWhenRequestChildFocus(r10)
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout r0 = r7.mSlideSwitchLayout
            java.lang.String r1 = "page_profile"
            r2 = 2
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r11[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout.f46302a
            r14 = 0
            r15 = 43006(0xa7fe, float:6.0264E-41)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x00e0
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r11[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout.f46302a
            r14 = 0
            r15 = 43006(0xa7fe, float:6.0264E-41)
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0108
        L_0x00e0:
            android.content.Context r3 = r0.getContext()
            boolean r3 = com.ss.android.ugc.aweme.utils.ey.a((android.content.Context) r3)
            if (r3 == 0) goto L_0x00f5
            java.util.List<com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a> r3 = r0.f46306d
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a r4 = new com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a
            r4.<init>(r1, r10)
            r3.add(r10, r4)
            goto L_0x00ff
        L_0x00f5:
            java.util.List<com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a> r3 = r0.f46306d
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a r4 = new com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a
            r4.<init>(r1, r10)
            r3.add(r4)
        L_0x00ff:
            java.util.List<com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a> r1 = r0.f46306d
            int r1 = r1.size()
            int r1 = r1 - r9
            r0.f46304b = r1
        L_0x0108:
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout r0 = r7.mSlideSwitchLayout
            java.lang.String r1 = "page_profile"
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            java.lang.Byte r3 = java.lang.Byte.valueOf(r10)
            r11[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout.f46302a
            r14 = 0
            r15 = 43040(0xa820, float:6.0312E-41)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r10] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x0154
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r11[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout.f46302a
            r14 = 0
            r15 = 43040(0xa820, float:6.0312E-41)
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0159
        L_0x0154:
            java.lang.String r2 = "FROM_SLIDE"
            r0.a((java.lang.String) r1, (boolean) r10, (java.lang.String) r2)
        L_0x0159:
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout r0 = r7.mSlideSwitchLayout
            r0.setCanScroll(r10)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r7.mDmtStatusView
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = com.bytedance.ies.dmt.ui.widget.DmtStatusView.a.a((android.content.Context) r18)
            r0.setBuilder(r1)
        L_0x0167:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            r3 = 0
            r4 = 69132(0x10e0c, float:9.6875E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x018e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            r3 = 0
            r4 = 69132(0x10e0c, float:9.6875E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03d3
        L_0x018e:
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r1 = "uid"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.o = r1
            java.lang.String r1 = "sec_user_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.q = r1
            java.lang.String r1 = r7.q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01bd
            com.ss.android.ugc.aweme.utils.dr r1 = com.ss.android.ugc.aweme.utils.dr.a()
            r1.b()
            com.ss.android.ugc.aweme.utils.dr r1 = com.ss.android.ugc.aweme.utils.dr.a()
            java.lang.String r2 = r7.o
            java.lang.String r1 = r1.a(r2)
            r7.q = r1
        L_0x01bd:
            java.lang.String r1 = "unique_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.p = r1
            java.lang.String r1 = "profile_from"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.f62386c = r1
            java.lang.String r1 = "video_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.f62387d = r1
            java.lang.String r1 = "type"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.f62388e = r1
            java.lang.String r1 = "profile_enterprise_type"
            int r1 = r0.getIntExtra(r1, r10)
            r7.r = r1
            java.lang.String r1 = "enter_method"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.l = r1
            java.lang.String r1 = "request_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.f62389f = r1
            java.lang.String r1 = "room_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.g = r1
            java.lang.String r1 = "room_owner_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.h = r1
            java.lang.String r1 = "user_type"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.i = r1
            java.lang.String r1 = "scene_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.m = r1
            java.lang.String r1 = "poi_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.k = r1
            java.lang.String r1 = "enter_from"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.j = r1
            java.lang.String r1 = "extra_from_event_enter_from"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r2 = "extra_from_event_type"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "extra_from_pre_page"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r4 = "extra_from_pre_relation_from"
            java.lang.String r4 = r0.getStringExtra(r4)
            android.arch.lifecycle.ViewModelProvider r5 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r18)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel> r6 = com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel.class
            android.arch.lifecycle.ViewModel r5 = r5.get(r6)
            com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel r5 = (com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel) r5
            java.lang.String r6 = "extra_from_event_type"
            r5.b(r6, r2)
            java.lang.String r2 = "extra_from_pre_page"
            r5.b(r2, r3)
            java.lang.String r2 = "extra_from_pre_relation_from"
            r5.b(r2, r4)
            java.lang.String r2 = "extra_from_event_enter_from"
            r5.b(r2, r1)
            java.lang.String r1 = "face_to_face"
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x026a
            java.lang.String r1 = "extra_previous_page_position"
            r0.putExtra(r1, r3)
        L_0x026a:
            com.ss.android.ugc.aweme.commercialize.feed.j r1 = com.ss.android.ugc.aweme.commercialize.feed.j.a()
            java.lang.String r2 = "source_aid"
            java.lang.String r0 = r0.getStringExtra(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.a((java.lang.String) r0)
            r7.n = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r1 = "from_micro_app"
            java.lang.String r0 = r0.getStringExtra(r1)
            r7.t = r0
            java.lang.String r0 = r7.o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02b7
            java.lang.String r0 = r7.p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0298
        L_0x0296:
            r8 = 1
            goto L_0x02c9
        L_0x0298:
            java.lang.String r0 = r7.p
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            java.lang.String r1 = r1.getUniqueId()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x02c8
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r0 = r0.getCurUserId()
            r7.o = r0
            goto L_0x0296
        L_0x02b7:
            java.lang.String r0 = r7.o
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r1 = r1.getCurUserId()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x02c8
            goto L_0x0296
        L_0x02c8:
            r8 = 0
        L_0x02c9:
            if (r8 == 0) goto L_0x0333
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            r3 = 0
            r4 = 69138(0x10e12, float:9.6883E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02f2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            r3 = 0
            r4 = 69138(0x10e12, float:9.6883E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0391
        L_0x02f2:
            android.support.v4.app.FragmentManager r0 = r18.getSupportFragmentManager()
            java.lang.String r1 = "myprofilefragment"
            android.support.v4.app.Fragment r1 = r0.findFragmentByTag(r1)
            if (r1 != 0) goto L_0x0322
            boolean r2 = com.ss.android.g.a.a()
            if (r2 == 0) goto L_0x0314
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r2 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r1 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r1
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r1 = r1.createUserProfileFragment()
        L_0x0314:
            if (r1 != 0) goto L_0x031b
            com.ss.android.ugc.aweme.profile.ui.MyProfileFragment r1 = new com.ss.android.ugc.aweme.profile.ui.MyProfileFragment
            r1.<init>()
        L_0x031b:
            android.os.Bundle r2 = r18.e()
            r1.setArguments(r2)
        L_0x0322:
            android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
            r2 = 2131171443(0x7f071873, float:1.7957273E38)
            java.lang.String r3 = "myprofilefragment"
            android.support.v4.app.FragmentTransaction r0 = r0.replace(r2, r1, r3)
            r0.commitAllowingStateLoss()
            goto L_0x0391
        L_0x0333:
            java.lang.String r0 = r7.o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x033f
            r18.d()
            goto L_0x0391
        L_0x033f:
            java.lang.String r11 = r7.p
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            r3 = 0
            r4 = 69134(0x10e0e, float:9.6877E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0373
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            r3 = 0
            r4 = 69134(0x10e0e, float:9.6877E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0391
        L_0x0373:
            com.ss.android.ugc.aweme.profile.presenter.ab r0 = r7.s
            if (r0 != 0) goto L_0x0383
            com.ss.android.ugc.aweme.profile.presenter.ab r0 = new com.ss.android.ugc.aweme.profile.presenter.ab
            r0.<init>()
            r7.s = r0
            com.ss.android.ugc.aweme.profile.presenter.ab r0 = r7.s
            r0.a(r7)
        L_0x0383:
            com.ss.android.ugc.aweme.profile.presenter.ab r0 = r7.s
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r11
            r0.a((java.lang.Object[]) r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r7.mDmtStatusView
            r0.d()
        L_0x0391:
            r18.c()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            r3 = 0
            r4 = 69145(0x10e19, float:9.6893E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03ce
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f62385b
            r3 = 0
            r4 = 69145(0x10e19, float:9.6893E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03d3
        L_0x03ce:
            if (r8 != 0) goto L_0x03d3
            com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.disableStartActivityIfNeeded(r18)
        L_0x03d3:
            java.lang.String r0 = "com.ss.android.ugc.aweme.profile.ui.UserProfileActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.UserProfileActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f62385b, false, 69130, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f62385b, false, 69130, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            for (a a2 : this.u) {
                if (a2.a(i2, keyEvent2)) {
                    return true;
                }
            }
            int i3 = i2;
            return super.onKeyDown(i2, keyEvent);
        }
    }

    public static void a(Context context, @Nonnull Bundle bundle) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context2, bundle2}, null, f62385b, true, 69124, new Class[]{Context.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bundle2}, null, f62385b, true, 69124, new Class[]{Context.class, Bundle.class}, Void.TYPE);
        } else if (context2 != null) {
            Intent intent = new Intent(context2, UserProfileActivity.class);
            intent.putExtras(bundle2);
            context2.startActivity(intent);
        }
    }

    public static void a(Context context, User user) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, user}, null, f62385b, true, 69114, new Class[]{Context.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, user}, null, f62385b, true, 69114, new Class[]{Context.class, User.class}, Void.TYPE);
        } else if (context2 != null && user != null) {
            a(context2, user.getUid(), user.getSecUid(), a(user), "");
        }
    }

    public static void b(Context context, User user, String str) {
        Context context2 = context;
        User user2 = user;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, user2, str2}, null, f62385b, true, 69119, new Class[]{Context.class, User.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, user2, str2}, null, f62385b, true, 69119, new Class[]{Context.class, User.class, String.class}, Void.TYPE);
            return;
        }
        a(context2, user2, str2, "");
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f62385b, false, 69139, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f62385b, false, 69139, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i2 != 1) {
            int i4 = i3;
        } else if (i3 == 2) {
            if (this.mSlideSwitchLayout != null) {
                this.mSlideSwitchLayout.setCurrentItem("page_profile");
                return;
            }
        }
        super.onActivityResult(i2, i3, intent);
    }

    public static void a(Context context, User user, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, user, str2}, null, f62385b, true, 69115, new Class[]{Context.class, User.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, user, str2}, null, f62385b, true, 69115, new Class[]{Context.class, User.class, String.class}, Void.TYPE);
        } else if (context2 != null && user != null) {
            a(context2, user.getUid(), user.getSecUid(), a(user), str2);
        }
    }

    private static void a(Context context, User user, String str, String str2) {
        Context context2 = context;
        User user2 = user;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, user2, str3, str4}, null, f62385b, true, 69121, new Class[]{Context.class, User.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, user2, str3, str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f62385b, true, 69121, new Class[]{Context.class, User.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(context2, user2, str3, str4, "");
    }
}
