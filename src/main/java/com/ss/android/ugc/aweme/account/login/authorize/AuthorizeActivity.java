package com.ss.android.ugc.aweme.account.login.authorize;

import a.g;
import a.i;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.sdk.account.api.call.d;
import com.bytedance.sdk.account.api.f;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.rocket.android.api.FusionFuelSdk;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.account.login.authorize.a.a;
import com.ss.android.ugc.aweme.account.login.authorize.a.c;
import com.ss.android.ugc.aweme.account.login.authorize.platforms.BasePlatformAuthorize;
import com.ss.android.ugc.aweme.account.login.authorize.platforms.b;
import com.ss.android.ugc.aweme.account.login.authorize.platforms.e;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.w;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public class AuthorizeActivity extends AmeBaseActivity implements a, b, com.ss.android.ugc.aweme.account.login.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32104a;
    private static final boolean s = com.ss.android.ugc.aweme.g.a.a();
    BasePlatformAuthorize o;
    String p;
    protected String q;
    protected String r;
    private DmtStatusView t;
    private f u;
    private boolean v;
    private boolean w;
    private com.ss.android.ugc.aweme.account.login.authorize.platforms.f x;

    private static boolean a(int i) {
        return i == 1025 || i == 2049 || i == 3073;
    }

    public final int a() {
        return C0906R.layout.aa;
    }

    public final void b() {
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32104a, false, 20134, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32104a, false, 20134, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a(@NonNull com.ss.android.ugc.aweme.account.login.authorize.platforms.f fVar) {
        com.ss.android.ugc.aweme.account.login.authorize.platforms.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f32104a, false, 20120, new Class[]{com.ss.android.ugc.aweme.account.login.authorize.platforms.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f32104a, false, 20120, new Class[]{com.ss.android.ugc.aweme.account.login.authorize.platforms.f.class}, Void.TYPE);
            return;
        }
        this.x = fVar2;
        com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("authorized sucess", "", false, this.o.c(), w.h());
        n.a("third_platform_login_error_rate", 0, com.ss.android.ugc.aweme.account.a.a.a.a().a("platform", this.o.c()).b());
        if (this.v) {
            e.a(e.a.SUCCESS, null, a(this.p));
            com.ss.android.ugc.aweme.account.i.a.a(a.b.GET_THIRD_PARTY_AUTH_INFO, a.C0406a.THIRD_PARTY, fVar.toString());
        }
        if (this.w) {
            Intent intent = new Intent();
            intent.putExtra("AUTHORIZE_OK_OPEN_ID", fVar2.f32159d);
            intent.putExtra("AUTHORIZE_OK_ACCESS_TOKEN", fVar2.f32157b);
            intent.putExtra("AUTHORIZE_OK_EXPIRE_IN", String.valueOf(fVar2.f32158c));
            intent.putExtra("AUTHORIZE_OK_CODE", fVar2.f32160e);
            intent.putExtra("platform", this.p);
            intent.putExtra("ori_platform", fVar2.i);
            a(-1, intent);
            return;
        }
        b(fVar);
    }

    public final void a(com.bytedance.sdk.account.k.b bVar, JSONObject jSONObject) {
        String str;
        com.bytedance.sdk.account.k.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, jSONObject}, this, f32104a, false, 20123, new Class[]{com.bytedance.sdk.account.k.b.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, jSONObject}, this, f32104a, false, 20123, new Class[]{com.bytedance.sdk.account.k.b.class, JSONObject.class}, Void.TYPE);
            return;
        }
        w.a(bVar);
        a(this.p, this.v, true);
        if (this.v) {
            com.ss.android.ugc.aweme.account.terminal.a.a("success");
            JSONObject b2 = com.ss.android.ugc.aweme.account.a.a.a.a().a("platform", this.o.c()).a("isSuccess", "true").b();
            com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("passport success", "", true, this.p, "", "sso");
            n.a("third_platform_login_error_rate", 0, b2);
            r.a((Context) w.b(), "third_platform_login_error_rate", "third_login", PushConstants.PUSH_TYPE_NOTIFY, 0, b2);
            JSONObject jSONObject2 = bVar2.f22520e;
            a.b bVar3 = a.b.SSO_WITH_THIRD_PARTY;
            a.C0406a aVar = a.C0406a.THIRD_PARTY;
            if (jSONObject2 == null) {
                str = "";
            } else {
                str = jSONObject2.toString();
            }
            com.ss.android.ugc.aweme.account.i.a.a(bVar3, aVar, str);
            if (!isViewValid()) {
                setResult(0);
                finish();
                return;
            }
            b(getIntent() != null ? getIntent().getExtras() : null);
            return;
        }
        if (TextUtils.equals(this.p, "flipchat")) {
            FusionFuelSdk.login();
        }
        w.a(this.p, true);
        w.f().a(this.p);
        a(-1, new Intent());
    }

    public final void a(int i, String str, String str2, String str3, d dVar) {
        boolean z;
        boolean z2;
        int i2 = i;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str4, str5, str6, dVar2}, this, f32104a, false, 20125, new Class[]{Integer.TYPE, String.class, String.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str4, str5, str6, dVar2}, this, f32104a, false, 20125, new Class[]{Integer.TYPE, String.class, String.class, String.class, d.class}, Void.TYPE);
            return;
        }
        a(this.p, this.v, false);
        if (this.v) {
            JSONObject b2 = com.ss.android.ugc.aweme.account.a.a.a.a().a("platform", this.o.c()).a("isSuccess", "false").a("errorDesc", String.format(Locale.CHINA, "error:%d,msg:%s", new Object[]{Integer.valueOf(i), str4})).b();
            com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("passport success", "", true, this.p, "", "sso");
            n.a("third_platform_login_error_rate", 1, b2);
            r.a((Context) w.b(), "third_platform_login_error_rate", "third_login", PushConstants.PUSH_TYPE_NOTIFY, 0, b2);
            com.ss.android.ugc.aweme.account.i.a.b(String.valueOf(i), str4, a.b.SSO_WITH_THIRD_PARTY, a.C0406a.THIRD_PARTY, "");
        }
        final Intent intent = new Intent();
        intent.putExtra("error_code", i2);
        intent.putExtra("description", str4);
        intent.putExtra("dialog_tips", str5);
        intent.putExtra("platform", this.o.c());
        if (!TextUtils.isEmpty(str3)) {
            this.x.j = str6;
        }
        if (dVar2.result != null) {
            if (this.v) {
                z2 = com.ss.android.ugc.aweme.account.util.d.a(dVar2.result, this, 2);
            } else {
                z2 = com.ss.android.ugc.aweme.account.util.d.a(dVar2.result, this, 0);
            }
            if (z2) {
                return;
            }
        }
        if (dVar2.error == 1075) {
            com.ss.android.ugc.aweme.account.login.a aVar = new com.ss.android.ugc.aweme.account.login.a(this, dVar2.error, dVar2.result, new TPLoginMethod("", this.p, new TPUserInfo("", "")), this, (getIntent() == null || getIntent().getExtras() == null) ? new Bundle() : getIntent().getExtras(), new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32105a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f32105a, false, 20140, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f32105a, false, 20140, new Class[0], Void.TYPE);
                        return;
                    }
                    AuthorizeActivity.this.a(0, intent);
                }
            });
            com.ss.android.ugc.aweme.account.login.d.a(aVar);
            z = false;
        } else {
            if (dVar.isBindExist()) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.cbd).a();
            } else if (!(i2 == 2003 || i2 == 2004 || TextUtils.isEmpty(str))) {
                com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), str4).a();
            }
            z = true;
        }
        com.ss.android.ugc.aweme.account.terminal.a.a(str);
        String c2 = this.o.c();
        com.ss.android.ugc.aweme.account.terminal.d.a(1, c2, i2, "passport error:" + str4);
        try {
            com.ss.android.ugc.aweme.account.login.loginlog.a.a().a(str, "", false, this.o.c(), "", "login fail");
        } catch (Exception unused) {
        }
        if (!this.v) {
            w.a(this.p, false);
        }
        if (z) {
            a(0, intent);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f32104a, false, 20118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32104a, false, 20118, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.o.g();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f32104a, false, 20117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32104a, false, 20117, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", true);
        super.onResume();
        this.o.f();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", false);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f32104a, false, 20122, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32104a, false, 20122, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.terminal.a.a("cancel");
        com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("user cancel", "", false, this.o.c(), w.h());
        com.ss.android.ugc.aweme.account.terminal.d.a(2, this.o.c(), 0, "");
        n.a("third_platform_login_error_rate", 3, com.ss.android.ugc.aweme.account.a.a.a.a().a("platform", this.o.c()).a("errorDesc", "user cancel").b());
        a(this.p, this.v, false);
        if (this.v) {
            e.a(e.a.CANCEL, null, a(this.p));
            com.ss.android.ugc.aweme.account.i.a.b("", "user cancel", a.b.GET_THIRD_PARTY_AUTH_INFO, a.C0406a.THIRD_PARTY, this.p);
        }
        if (this.w) {
            Intent intent = new Intent();
            intent.putExtra("platform", this.p);
            a(0, intent);
            return;
        }
        if (!this.v) {
            w.a(this.p, false);
        }
        finish();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x012b, code lost:
        if (r1.equals("qzone_sns") != false) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r15 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f32104a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 20115(0x4e93, float:2.8187E-41)
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f32104a
            r5 = 0
            r6 = 20115(0x4e93, float:2.8187E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            super.c()
            r1 = 2131170110(0x7f07133e, float:1.795457E38)
            android.view.View r1 = r15.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.ui.widget.DmtStatusView) r1
            r15.t = r1
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r15.t
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r2 = com.bytedance.ies.dmt.ui.widget.DmtStatusView.a.a((android.content.Context) r15)
            r1.setBuilder(r2)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r15.t
            r1.d()
            com.bytedance.sdk.account.api.f r1 = com.bytedance.sdk.account.d.d.b(r15)
            r15.u = r1
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r2 = "platform"
            java.lang.String r2 = r1.getStringExtra(r2)
            r15.p = r2
            java.lang.String r2 = "is_login"
            r3 = 1
            boolean r2 = r1.getBooleanExtra(r2, r3)
            r15.v = r2
            java.lang.String r2 = "IS_AUTHORIZE_ONLY"
            boolean r1 = r1.getBooleanExtra(r2, r0)
            r15.w = r1
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r2 = "enter_from"
            java.lang.String r1 = r1.getStringExtra(r2)
            r15.q = r1
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r2 = "enter_method"
            java.lang.String r1 = r1.getStringExtra(r2)
            r15.r = r1
            java.lang.String r1 = r15.p
            boolean r2 = r15.w
            r4 = 2
            r5 = 3
            if (r2 == 0) goto L_0x0084
            r2 = 3
            goto L_0x008b
        L_0x0084:
            boolean r2 = r15.v
            if (r2 == 0) goto L_0x008a
            r2 = 1
            goto L_0x008b
        L_0x008a:
            r2 = 2
        L_0x008b:
            r6 = 4
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r0] = r1
            r7[r3] = r15
            r7[r4] = r15
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r7[r5] = r8
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.ugc.aweme.account.login.authorize.platforms.c.f32147a
            r10 = 1
            r11 = 20168(0x4ec8, float:2.8261E-41)
            java.lang.Class[] r12 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r12[r0] = r13
            java.lang.Class<android.app.Activity> r13 = android.app.Activity.class
            r12[r3] = r13
            java.lang.Class<com.ss.android.ugc.aweme.account.login.authorize.platforms.b> r13 = com.ss.android.ugc.aweme.account.login.authorize.platforms.b.class
            r12[r4] = r13
            java.lang.Class r13 = java.lang.Integer.TYPE
            r12[r5] = r13
            java.lang.Class<com.ss.android.ugc.aweme.account.login.authorize.platforms.BasePlatformAuthorize> r13 = com.ss.android.ugc.aweme.account.login.authorize.platforms.BasePlatformAuthorize.class
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L_0x00ea
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r0] = r1
            r8[r3] = r15
            r8[r4] = r15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r8[r5] = r1
            r9 = 0
            com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.account.login.authorize.platforms.c.f32147a
            r11 = 1
            r12 = 20168(0x4ec8, float:2.8261E-41)
            java.lang.Class[] r13 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r13[r0] = r1
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r13[r3] = r0
            java.lang.Class<com.ss.android.ugc.aweme.account.login.authorize.platforms.b> r0 = com.ss.android.ugc.aweme.account.login.authorize.platforms.b.class
            r13[r4] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r13[r5] = r0
            java.lang.Class<com.ss.android.ugc.aweme.account.login.authorize.platforms.BasePlatformAuthorize> r14 = com.ss.android.ugc.aweme.account.login.authorize.platforms.BasePlatformAuthorize.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.account.login.authorize.platforms.BasePlatformAuthorize r0 = (com.ss.android.ugc.aweme.account.login.authorize.platforms.BasePlatformAuthorize) r0
            goto L_0x0151
        L_0x00ea:
            r7 = -1
            int r8 = r1.hashCode()
            switch(r8) {
                case -1530308138: goto L_0x0125;
                case -1134307907: goto L_0x011b;
                case -791575966: goto L_0x0111;
                case -471473230: goto L_0x0107;
                case 635922494: goto L_0x00fd;
                case 1851692357: goto L_0x00f3;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            goto L_0x012e
        L_0x00f3:
            java.lang.String r0 = "flipchat"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x012e
            r0 = 5
            goto L_0x012f
        L_0x00fd:
            java.lang.String r0 = "toutiao_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x012e
            r0 = 4
            goto L_0x012f
        L_0x0107:
            java.lang.String r0 = "sina_weibo"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x012e
            r0 = 1
            goto L_0x012f
        L_0x0111:
            java.lang.String r0 = "weixin"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x012e
            r0 = 2
            goto L_0x012f
        L_0x011b:
            java.lang.String r0 = "toutiao"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x012e
            r0 = 3
            goto L_0x012f
        L_0x0125:
            java.lang.String r3 = "qzone_sns"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r0 = -1
        L_0x012f:
            switch(r0) {
                case 0: goto L_0x014c;
                case 1: goto L_0x0146;
                case 2: goto L_0x0140;
                case 3: goto L_0x013a;
                case 4: goto L_0x013a;
                case 5: goto L_0x0134;
                default: goto L_0x0132;
            }
        L_0x0132:
            r0 = 0
            goto L_0x0151
        L_0x0134:
            com.ss.android.ugc.aweme.account.login.authorize.platforms.a r0 = new com.ss.android.ugc.aweme.account.login.authorize.platforms.a
            r0.<init>(r15, r15, r2)
            goto L_0x0151
        L_0x013a:
            com.ss.android.ugc.aweme.account.login.authorize.platforms.g r0 = new com.ss.android.ugc.aweme.account.login.authorize.platforms.g
            r0.<init>(r15, r15, r2)
            goto L_0x0151
        L_0x0140:
            com.ss.android.ugc.aweme.account.login.authorize.platforms.i r0 = new com.ss.android.ugc.aweme.account.login.authorize.platforms.i
            r0.<init>(r15, r15, r2)
            goto L_0x0151
        L_0x0146:
            com.ss.android.ugc.aweme.account.login.authorize.platforms.j r0 = new com.ss.android.ugc.aweme.account.login.authorize.platforms.j
            r0.<init>(r15, r15, r2)
            goto L_0x0151
        L_0x014c:
            com.ss.android.ugc.aweme.account.login.authorize.platforms.d r0 = new com.ss.android.ugc.aweme.account.login.authorize.platforms.d
            r0.<init>(r15, r15, r2)
        L_0x0151:
            r15.o = r0
            com.ss.android.ugc.aweme.account.login.authorize.platforms.BasePlatformAuthorize r0 = r15.o
            if (r0 != 0) goto L_0x015a
            r15.finish()
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity.c():void");
    }

    public final void a(@NonNull Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32104a, false, 20133, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32104a, false, 20133, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        b(bundle);
    }

    private void b(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32104a, false, 20124, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32104a, false, 20124, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle != null) {
            bundle.putString("login_path", "third_party_auth");
            bundle.putString("platform", this.o.c());
            bundle.putString("mob_platform", com.ss.android.ugc.aweme.account.k.a.a(this.o.c()));
            com.ss.android.ugc.aweme.account.util.r.a(bundle).b((g<TResult, i<TContinuationResult>>) new a<TResult,i<TContinuationResult>>(bundle)).b(new b(bundle), i.f1052b).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(this), i.f1052b).a((g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(this));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        if (r0.equals("sina_weibo") != false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f32104a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r5 = 0
            r6 = 20132(0x4ea4, float:2.8211E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f32104a
            r13 = 0
            r14 = 20132(0x4ea4, float:2.8211E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            if (r2 == 0) goto L_0x0040
            java.lang.String r0 = ""
            return r0
        L_0x0040:
            java.lang.String r2 = ""
            r3 = -1
            int r4 = r18.hashCode()
            switch(r4) {
                case -1530308138: goto L_0x0072;
                case -1134307907: goto L_0x0068;
                case -791575966: goto L_0x005e;
                case -471473230: goto L_0x0055;
                case 1851692357: goto L_0x004b;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x007c
        L_0x004b:
            java.lang.String r1 = "flipchat"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 4
            goto L_0x007d
        L_0x0055:
            java.lang.String r4 = "sina_weibo"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x007c
            goto L_0x007d
        L_0x005e:
            java.lang.String r1 = "weixin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 2
            goto L_0x007d
        L_0x0068:
            java.lang.String r1 = "toutiao"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 3
            goto L_0x007d
        L_0x0072:
            java.lang.String r1 = "qzone_sns"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 0
            goto L_0x007d
        L_0x007c:
            r1 = -1
        L_0x007d:
            switch(r1) {
                case 0: goto L_0x008d;
                case 1: goto L_0x008a;
                case 2: goto L_0x0087;
                case 3: goto L_0x0084;
                case 4: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x008f
        L_0x0081:
            java.lang.String r2 = "rocket"
            goto L_0x008f
        L_0x0084:
            java.lang.String r2 = "toutiao"
            goto L_0x008f
        L_0x0087:
            java.lang.String r2 = "weixin"
            goto L_0x008f
        L_0x008a:
            java.lang.String r2 = "weibo"
            goto L_0x008f
        L_0x008d:
            java.lang.String r2 = "qq"
        L_0x008f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity.a(java.lang.String):java.lang.String");
    }

    private void b(@NonNull com.ss.android.ugc.aweme.account.login.authorize.platforms.f fVar) {
        com.ss.android.ugc.aweme.account.login.authorize.platforms.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f32104a, false, 20128, new Class[]{com.ss.android.ugc.aweme.account.login.authorize.platforms.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f32104a, false, 20128, new Class[]{com.ss.android.ugc.aweme.account.login.authorize.platforms.f.class}, Void.TYPE);
        } else if (this.v) {
            if (!TextUtils.isEmpty(fVar2.f32157b)) {
                this.u.b(this.o.d(), this.o.c(), fVar2.f32157b, fVar2.f32158c, (Map) a(fVar2, fVar2.g, fVar2.h), (com.bytedance.sdk.account.api.call.a<d>) new c<d>(this));
                return;
            }
            f fVar3 = this.u;
            String d2 = this.o.d();
            String c2 = this.o.c();
            String str = fVar2.f32160e;
            fVar3.a(d2, c2, str, fVar2.f32158c, (Map) a(fVar2, fVar2.g, fVar2.h), (com.bytedance.sdk.account.api.call.a<d>) new c<d>(this));
        } else if (!TextUtils.isEmpty(fVar2.f32157b)) {
            this.u.b(this.o.d(), this.o.c(), fVar2.f32157b, fVar2.f32158c, (Map) a(fVar2, fVar2.g, fVar2.h), (com.ss.android.account.d) new com.ss.android.ugc.aweme.account.login.authorize.a.b(this));
        } else {
            f fVar4 = this.u;
            String d3 = this.o.d();
            String c3 = this.o.c();
            String str2 = fVar2.f32160e;
            fVar4.a(d3, c3, str2, fVar2.f32158c, (Map) a(fVar2, fVar2.g, fVar2.h), (com.ss.android.account.d) new com.ss.android.ugc.aweme.account.login.authorize.a.b(this));
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32104a, false, 20116, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32104a, false, 20116, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", true);
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.account.terminal.d.f32792b = System.currentTimeMillis();
        this.o.b();
        if (this.v) {
            r.a("token_request", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", this.r).a("enter_from", this.q).a("platform", a(this.p)).a("_perf_monitor", 1).f31599b);
            com.ss.android.ugc.aweme.account.i.a.a(this.q, this.r, a.C0406a.THIRD_PARTY, this.p);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
    }

    public final void a(int i, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), intent2}, this, f32104a, false, 20127, new Class[]{Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), intent2}, this, f32104a, false, 20127, new Class[]{Integer.TYPE, Intent.class}, Void.TYPE);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            setResult(i, intent);
            finish();
        } else {
            new Handler(Looper.getMainLooper()).post(new e(this, i, intent2));
        }
    }

    private boolean b(int i, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), intent}, this, f32104a, false, 20130, new Class[]{Integer.TYPE, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), intent}, this, f32104a, false, 20130, new Class[]{Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (i == 0 || intent == null) {
            return false;
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("callback")) {
                return false;
            }
            try {
                Uri parse = Uri.parse(extras.getString("callback"));
                String scheme = parse.getScheme();
                if (scheme != null) {
                    if (scheme.startsWith(com.ss.android.ugc.aweme.app.e.f34153c)) {
                        if ("connect_switch".equals(parse.getQueryParameter("error_name"))) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            } catch (Exception unused) {
            }
        }
    }

    public final void a(int i, String str) {
        int i2 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f32104a, false, 20121, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f32104a, false, 20121, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        r.a("login_failure", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("platform", this.p).a("enter_method", com.ss.android.ugc.aweme.account.login.i.f32241a).a("enter_type", "click_login").a("carrier", "").a("error_code", "error_code_1").f31599b);
        String format = String.format(Locale.CHINA, "code:%d msg:%s", new Object[]{Integer.valueOf(i), str2});
        com.ss.android.ugc.aweme.account.terminal.a.a(format);
        com.ss.android.ugc.aweme.account.login.loginlog.a.a().a(format, "", false, this.o.c(), w.h());
        com.ss.android.ugc.aweme.account.terminal.d.a(1, this.o.c(), i2, str2);
        if (!TextUtils.equals(this.p, "weixin") || i2 != -1) {
            n.a("third_platform_login_error_rate", 1, com.ss.android.ugc.aweme.account.a.a.a.a().a("platform", this.o.c()).a("errorDesc", format).b());
        } else {
            n.a("third_platform_login_error_rate", 2, com.ss.android.ugc.aweme.account.a.a.a.a().a("platform", this.o.c()).a("errorDesc", format).b());
        }
        com.bytedance.ies.dmt.ui.d.a.b((Context) this, this.o.e() + "授权失败,请重试", 0).a();
        a(this.p, this.v, false);
        if (this.v) {
            e.a(e.a.FAILURE, String.format(Locale.CHINA, "error Code:%d, Msg:%s", new Object[]{Integer.valueOf(i), str2}), a(this.p));
            com.ss.android.ugc.aweme.account.i.a.b(String.valueOf(i), str2, a.b.GET_THIRD_PARTY_AUTH_INFO, a.C0406a.THIRD_PARTY, this.p);
        }
        if (this.w) {
            Intent intent = new Intent();
            intent.putExtra("platform", this.p);
            a(0, intent);
            return;
        }
        if (!this.v) {
            w.a(this.p, false);
        }
        com.ss.android.ugc.aweme.account.loginsetting.a.a(com.ss.android.ugc.aweme.account.util.n.g(), this.o.c(), i, false, w.f50729d, null);
        finish();
    }

    private Map<String, String> a(com.ss.android.ugc.aweme.account.login.authorize.platforms.f fVar, int i, String str) {
        com.ss.android.ugc.aweme.account.login.authorize.platforms.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2, Integer.valueOf(i), str}, this, f32104a, false, 20119, new Class[]{com.ss.android.ugc.aweme.account.login.authorize.platforms.f.class, Integer.TYPE, String.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{fVar2, Integer.valueOf(i), str}, this, f32104a, false, 20119, new Class[]{com.ss.android.ugc.aweme.account.login.authorize.platforms.f.class, Integer.TYPE, String.class}, Map.class);
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(fVar2.f32159d)) {
            hashMap.put("uid", Uri.encode(fVar2.f32159d));
        }
        if (i != -1) {
            hashMap.put("verify_type", Uri.encode(String.valueOf(i)));
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("verified_ticket", Uri.encode(str));
        }
        if (this.v && w.i().isEnableMultiAccountLogin()) {
            hashMap.put("multi_login", Uri.encode(PushConstants.PUSH_TYPE_THROUGH_MESSAGE));
        }
        if (!TextUtils.isEmpty(fVar2.j)) {
            hashMap.put("profile_key", Uri.encode(fVar2.j));
        }
        return hashMap;
    }

    private void a(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        String str4;
        String str5 = str;
        if (PatchProxy.isSupport(new Object[]{str5, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f32104a, false, 20131, new Class[]{String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, Byte.valueOf(z), Byte.valueOf(z2)}, this, f32104a, false, 20131, new Class[]{String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (TextUtils.equals(str5, "flipchat")) {
            if (z2 || z) {
                com.ss.android.ugc.aweme.account.a.a.b a2 = com.ss.android.ugc.aweme.account.a.a.b.a();
                if (FlipChat.INSTANCE.isAppInstall(this)) {
                    str2 = "yes";
                } else {
                    str2 = "no";
                }
                com.ss.android.ugc.aweme.account.a.a.b a3 = a2.a("is_installed", str2);
                if (z) {
                    str3 = "third_party_login";
                } else {
                    str3 = "settings";
                }
                com.ss.android.ugc.aweme.account.a.a.b a4 = a3.a("user_enter_type", str3);
                if (z2) {
                    str4 = "yes";
                } else {
                    str4 = "no";
                }
                r.a("flipchat_authorize_result", (Map) a4.a("is_successful", str4).f31599b);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        Intent intent2;
        String str;
        String str2;
        String str3;
        Bundle bundle;
        int i4 = i;
        int i5 = i2;
        Intent intent3 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent3}, this, f32104a, false, 20126, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent3}, this, f32104a, false, 20126, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        int i6 = -1;
        if (i4 == 1024 || i4 == 2048 || i4 == 3072 || i4 == 2049 || i4 == 3073) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent3}, this, f32104a, false, 20129, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent3}, this, f32104a, false, 20129, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            } else {
                SparseIntArray sparseIntArray = new SparseIntArray();
                sparseIntArray.put(1024, 2001);
                sparseIntArray.put(2048, 2000);
                sparseIntArray.put(2049, 2000);
                sparseIntArray.put(3072, 2002);
                sparseIntArray.put(3073, 2002);
                if (i5 == -1) {
                    if (a(i)) {
                        com.ss.android.ugc.aweme.account.i.a.a(a.b.HIT_VERIFY_STRATEGY, a.C0406a.THIRD_PARTY, String.valueOf(i));
                    }
                    if (intent3 == null) {
                        str2 = null;
                    } else {
                        str2 = intent3.getStringExtra("ticket");
                    }
                    this.x.h = str2;
                    this.x.g = sparseIntArray.get(i4);
                    b(this.x);
                } else {
                    com.ss.android.ugc.aweme.account.terminal.d.a(1, this.o.c(), sparseIntArray.get(i4), "策略处理失败");
                    String str4 = "";
                    if (i4 == 2049 || i4 == 3073) {
                        if (intent3 == null) {
                            intent2 = new Intent();
                        } else {
                            intent2 = intent3;
                        }
                        i3 = intent2.getIntExtra("error_code", -1);
                        if (i3 == 10003 || com.ss.android.ugc.aweme.account.util.d.f33086b.contains(Integer.valueOf(i3))) {
                            str = getString(C0906R.string.dqv);
                            intent2.putExtra("toast_tips", getString(C0906R.string.dqv));
                        } else {
                            str = getString(C0906R.string.b8b);
                            intent2.putExtra("toast_tips", getString(C0906R.string.b8b));
                        }
                        intent2.putExtra("need_finish_login", true);
                        intent3 = intent2;
                        str4 = str;
                    } else {
                        i3 = -1;
                    }
                    if (a(i)) {
                        com.ss.android.ugc.aweme.account.i.a.b(String.valueOf(i3), str4, a.b.HIT_VERIFY_STRATEGY, a.C0406a.THIRD_PARTY, String.valueOf(i));
                    }
                    if (i5 != 0 || intent3 == null) {
                        onBackPressed();
                        return;
                    }
                    a(0, intent3);
                }
            }
        } else if (i4 == 1025) {
            if (i5 == -1) {
                com.ss.android.ugc.aweme.account.i.a.a(a.b.HIT_VERIFY_STRATEGY, a.C0406a.THIRD_PARTY, String.valueOf(i));
                if (getIntent() != null) {
                    bundle = getIntent().getExtras();
                } else {
                    bundle = null;
                }
                b(bundle);
                return;
            }
            if (intent3 != null) {
                i6 = intent3.getIntExtra("error_code", -1);
            }
            Intent intent4 = new Intent();
            if (com.ss.android.ugc.aweme.account.util.d.f33086b.contains(Integer.valueOf(i6))) {
                str3 = getString(C0906R.string.dqv);
                intent4.putExtra("toast_tips", getString(C0906R.string.dqv));
            } else {
                str3 = getString(C0906R.string.b8a);
                intent4.putExtra("toast_tips", getString(C0906R.string.b8a));
            }
            com.ss.android.ugc.aweme.account.i.a.b(String.valueOf(i6), str3, a.b.HIT_VERIFY_STRATEGY, a.C0406a.THIRD_PARTY, String.valueOf(i));
            intent4.putExtra("need_finish_login", true);
            a(0, intent4);
        } else if (i4 != 32972) {
            this.o.a(i4, i5, intent3);
        } else if (i5 != -1) {
            finish();
        } else if (this.w) {
            if (intent3 != null) {
                String stringExtra = intent3.getStringExtra("h5_auth_code");
                String stringExtra2 = intent3.getStringExtra("h5_auth_state");
                Intent intent5 = new Intent();
                intent5.putExtra("AUTHORIZE_OK_CODE", stringExtra);
                intent5.putExtra("AUTHORIZE_OK_STATE", stringExtra2);
                a(-1, intent5);
                return;
            }
            a(0, new Intent());
        } else if (b(i5, intent3)) {
            Intent intent6 = new Intent();
            intent6.putExtra("repeat_bind_error", true);
            a(0, intent6);
        } else {
            com.ss.android.account.token.a.b();
            this.u.a(this.p, (com.ss.android.account.d) new com.ss.android.ugc.aweme.account.login.authorize.a.b(this));
        }
    }
}
