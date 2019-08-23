package com.ss.android.ugc.aweme.account.login.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.bytedance.sdk.account.f.a.h;
import com.bytedance.sdk.account.f.b.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.b.a;
import com.ss.android.mobilelib.c.d;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.g;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.account.login.a.o;
import com.ss.android.ugc.aweme.account.login.d.c;
import com.ss.android.ugc.aweme.account.login.m;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView;
import com.ss.android.ugc.aweme.account.util.i;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;
import java.util.Map;

public class LoginOrRegisterFragment extends BaseVerifyCodeFragment<c> implements com.ss.android.mobilelib.c.c, d, m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32459a;
    private ImageView D;
    private TextView E;
    private boolean F;
    private View.OnClickListener G = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32465a;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f32465a, false, 20615, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f32465a, false, 20615, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            int id = view.getId();
            if (id == C0906R.id.dms) {
                if (LoginOrRegisterFragment.this.getActivity() != null) {
                    b.a((Activity) LoginOrRegisterFragment.this.getActivity(), (View) LoginOrRegisterFragment.this.u);
                    if (LoginOrRegisterFragment.this.h) {
                        LoginOrRegisterFragment.this.getActivity().onBackPressed();
                    } else {
                        LoginOrRegisterFragment.this.getActivity().finish();
                    }
                }
                if (LoginOrRegisterFragment.this.f32462d) {
                    w.a(50, 1, "");
                }
            } else if (id == C0906R.id.dn8) {
                com.ss.android.ugc.aweme.account.l.b.a(w.b(), "login_pad", "");
            } else if (id == C0906R.id.ci4) {
                KeyboardUtils.c(LoginOrRegisterFragment.this.u);
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    protected ThirdPartyLoginView f32460b;

    /* renamed from: c  reason: collision with root package name */
    protected PhonePassLoginView f32461c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f32462d;

    /* renamed from: e  reason: collision with root package name */
    public EditText f32463e;

    /* renamed from: f  reason: collision with root package name */
    protected c f32464f;
    protected o g;
    public boolean h;
    public boolean i = true;
    private View w;

    public final int t() {
        return 0;
    }

    public final int u() {
        return g.u;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32459a, false, 20606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32459a, false, 20606, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        try {
            if (isViewValid()) {
                if (getActivity() != null) {
                    this.f32461c.a();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32459a, false, 20607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32459a, false, 20607, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (isViewValid()) {
                if (getActivity() != null) {
                    this.f32461c.b();
                }
            }
        } catch (Exception unused) {
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f32459a, false, 20599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32459a, false, 20599, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.g != null) {
            this.g.a();
        }
        w.a((Activity) null);
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f32459a, false, 20597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32459a, false, 20597, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        w.a(2, 1, "");
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f32459a, false, 20598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32459a, false, 20598, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        w.a(2, 4, "");
    }

    public final boolean v() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f32459a, false, 20600, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32459a, false, 20600, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f32460b.getVisibility() != 0) {
            z = true;
        }
        return z;
    }

    public final void w() {
        if (PatchProxy.isSupport(new Object[0], this, f32459a, false, 20609, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32459a, false, 20609, new Class[0], Void.TYPE);
            return;
        }
        this.F = true;
        f();
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f32459a, false, 20612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32459a, false, 20612, new Class[0], Void.TYPE);
            return;
        }
        if (this.f32460b.getVisibility() != 0 && !this.F && !this.h) {
            UIUtils.setViewVisibility(this.w, 8);
        } else if (w.i().getShowFeedback() == 1) {
            UIUtils.setViewVisibility(this.w, 0);
        }
    }

    public final /* synthetic */ a c() {
        if (PatchProxy.isSupport(new Object[0], this, f32459a, false, 20601, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f32459a, false, 20601, new Class[0], c.class);
        }
        if ((this.f32464f == null || !this.f32464f.f30078a) && getContext() != null) {
            this.f32464f = new c(getContext(), this);
        }
        return this.f32464f;
    }

    public final boolean o_() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f32459a, false, 20613, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32459a, false, 20613, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (getArguments() == null || !this.i || w.h()) {
            return false;
        } else {
            if (getArguments().getInt("bundle_flow_type", BaseLoginOrRegisterActivity.o) == BaseLoginOrRegisterActivity.q) {
                z = true;
            }
            return z;
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f32459a, false, 20610, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f32459a, false, 20610, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f32463e.requestFocus();
            this.i = false;
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32459a, false, 20593, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32459a, false, 20593, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f32462d = arguments.getBoolean("bundle_need_back");
            this.h = arguments.getBoolean("from_one_login");
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f32459a, false, 20611, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f32459a, false, 20611, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str}, this, f32459a, false, 20608, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f32459a, false, 20608, new Class[]{String.class}, Void.TYPE);
        } else if (str != null) {
            if (this.h || str.length() != 0) {
                this.f32460b.setVisibility(8);
                this.f32461c.setVisibility(0);
            } else {
                this.f32460b.setVisibility(0);
                this.f32461c.setVisibility(8);
                this.A.setVisibility(8);
            }
        }
        this.z.setEnabled(m());
        this.z.setClickable(m());
        this.f32460b.getVisibility();
        f();
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f32459a, false, 20595, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f32459a, false, 20595, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        e();
        this.g = new o(this) {

            /* renamed from: e  reason: collision with root package name */
            public static ChangeQuickRedirect f32473e;

            /* renamed from: a */
            public final void g(com.bytedance.sdk.account.api.call.c<h> cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f32473e, false, 20619, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f32473e, false, 20619, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                    return;
                }
                super.g(cVar);
                com.ss.android.ugc.aweme.account.terminal.a.a("success");
                com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("", "", true, "login", "", "mobile login success");
                n.a("aweme_phone_login_rate", 1, com.ss.android.ugc.aweme.account.a.a.a.a().b());
                com.ss.android.ugc.aweme.account.i.a.a(a.b.LOGIN_BY_PHONE_SMS, a.C0406a.PHONE_SMS, "");
                if (LoginOrRegisterFragment.this.getActivity() != null) {
                    if (LoginOrRegisterFragment.this.getActivity() instanceof com.ss.android.ugc.aweme.account.login.c) {
                        ((com.ss.android.ugc.aweme.account.login.c) LoginOrRegisterFragment.this.getActivity()).a(true);
                    }
                    ((com.ss.android.ugc.aweme.account.login.b) LoginOrRegisterFragment.this.getActivity()).a(LoginOrRegisterFragment.this.b("phone_sms"));
                }
                if (LoginOrRegisterFragment.this.f32461c != null) {
                    LoginOrRegisterFragment.this.f32461c.a();
                }
                r.onEvent(MobClick.obtain().setEventName("sign_in_success").setLabelName("sms_verification").setJsonObject(com.ss.android.ugc.aweme.account.a.a.a.a().a("enter_from", LoginOrRegisterFragment.this.m).a("position", LoginOrRegisterFragment.this.n).b()));
                r.a("login_success", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", LoginOrRegisterFragment.this.n).a("enter_from", LoginOrRegisterFragment.this.m).a("platform", "sms_verification").a("status", 1).a("_perf_monitor", 1).f31599b);
                if (LoginOrRegisterFragment.this.getArguments() != null && LoginOrRegisterFragment.this.getArguments().getBoolean("need_remember_login_method", true)) {
                    com.ss.android.ugc.aweme.account.login.g.a((BaseLoginMethod) new PhoneLoginMethod(w.e(), LoginMethodName.PHONE_SMS, LoginOrRegisterFragment.this.q));
                }
            }

            /* JADX WARNING: type inference failed for: r1v35, types: [android.support.v4.app.FragmentActivity] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.h> r16) {
                /*
                    r15 = this;
                    r7 = r15
                    r8 = r16
                    r9 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r10 = 0
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f32473e
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<com.bytedance.sdk.account.api.call.c> r1 = com.bytedance.sdk.account.api.call.c.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 20620(0x508c, float:2.8895E-41)
                    r1 = r15
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0033
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f32473e
                    r3 = 0
                    r4 = 20620(0x508c, float:2.8895E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<com.bytedance.sdk.account.api.call.c> r1 = com.bytedance.sdk.account.api.call.c.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r15
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0033:
                    super.b(r16)
                    java.lang.String r0 = r8.errorMsg
                    com.ss.android.ugc.aweme.account.terminal.a.a(r0)
                    java.lang.String r0 = "login_failure"
                    com.ss.android.ugc.aweme.account.a.a.b r1 = new com.ss.android.ugc.aweme.account.a.a.b
                    r1.<init>()
                    java.lang.String r2 = "enter_method"
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r3 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    java.lang.String r3 = r3.n
                    com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "platform"
                    java.lang.String r3 = "sms_verification"
                    com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "enter_type"
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r3 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    java.lang.String r3 = r3.o
                    com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "carrier"
                    java.lang.String r3 = ""
                    com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "error_code"
                    int r3 = r8.error
                    com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (int) r3)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r1.f31599b
                    com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                    int r0 = r8.error
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    java.lang.String r1 = r8.errorMsg
                    com.ss.android.ugc.aweme.account.i.a$a r2 = com.ss.android.ugc.aweme.account.i.a.C0406a.PHONE_SMS
                    java.lang.String r3 = ""
                    r4 = 0
                    com.ss.android.ugc.aweme.account.i.a.b(r0, r1, r4, r2, r3)
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    boolean r0 = r0 instanceof com.ss.android.ugc.aweme.account.login.c
                    if (r0 == 0) goto L_0x0098
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.ss.android.ugc.aweme.account.login.c r0 = (com.ss.android.ugc.aweme.account.login.c) r0
                    r0.a(r10)
                L_0x0098:
                    java.lang.String r0 = ""
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r1 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    android.content.Context r1 = r1.getContext()
                    if (r1 == 0) goto L_0x00ab
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    r1 = 2131561094(0x7f0d0a86, float:1.8747579E38)
                    java.lang.String r0 = r0.getString(r1)
                L_0x00ab:
                    java.lang.String r1 = r8.errorMsg
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 == 0) goto L_0x00b4
                    goto L_0x00b6
                L_0x00b4:
                    java.lang.String r0 = r8.errorMsg
                L_0x00b6:
                    int r1 = r8.error
                    java.lang.String r2 = r8.errorMsg
                    com.ss.android.ugc.aweme.account.terminal.d.a(r10, r1, r2)
                    java.lang.String r1 = "aweme_phone_login_rate"
                    com.ss.android.ugc.aweme.account.a.a.a r2 = com.ss.android.ugc.aweme.account.a.a.a.a()
                    java.lang.String r3 = "errorCode"
                    int r5 = r8.error
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    com.ss.android.ugc.aweme.account.a.a.a r2 = r2.a((java.lang.String) r3, (java.lang.Integer) r5)
                    java.lang.String r3 = "errorDesc"
                    java.lang.String r5 = r8.errorMsg
                    com.ss.android.ugc.aweme.account.a.a.a r2 = r2.a((java.lang.String) r3, (java.lang.String) r5)
                    org.json.JSONObject r2 = r2.b()
                    com.ss.android.ugc.aweme.base.n.a((java.lang.String) r1, (int) r10, (org.json.JSONObject) r2)
                    int r1 = r8.error
                    r2 = 1075(0x433, float:1.506E-42)
                    if (r1 != r2) goto L_0x012c
                    com.ss.android.ugc.aweme.account.login.a r0 = new com.ss.android.ugc.aweme.account.login.a
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r1 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r9 = r1.getActivity()
                    int r10 = r8.error
                    T r1 = r8.f22251a
                    if (r1 == 0) goto L_0x00fa
                    T r1 = r8.f22251a
                    com.bytedance.sdk.account.f.a.h r1 = (com.bytedance.sdk.account.f.a.h) r1
                    org.json.JSONObject r1 = r1.k
                    r11 = r1
                    goto L_0x00fb
                L_0x00fa:
                    r11 = r4
                L_0x00fb:
                    com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod r12 = new com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod
                    java.lang.String r1 = ""
                    com.ss.android.ugc.aweme.account.login.model.LoginMethodName r2 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_SMS
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r3 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    com.ss.android.ugc.aweme.account.login.e.a$a r3 = r3.q
                    r12.<init>(r1, r2, r3)
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r1 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                    boolean r1 = r1 instanceof com.ss.android.ugc.aweme.account.login.b
                    if (r1 == 0) goto L_0x011b
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r1 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                    r4 = r1
                    com.ss.android.ugc.aweme.account.login.b r4 = (com.ss.android.ugc.aweme.account.login.b) r4
                L_0x011b:
                    r13 = r4
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r1 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    java.lang.String r2 = "phone_sms"
                    android.os.Bundle r14 = r1.b(r2)
                    r8 = r0
                    r8.<init>(r9, r10, r11, r12, r13, r14)
                    com.ss.android.ugc.aweme.account.login.d.a(r0)
                    goto L_0x019b
                L_0x012c:
                    java.util.Set<java.lang.Integer> r1 = com.ss.android.ugc.aweme.account.util.d.f33086b
                    int r2 = r8.error
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    boolean r1 = r1.contains(r2)
                    if (r1 == 0) goto L_0x0160
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    if (r0 == 0) goto L_0x019b
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    android.content.Context r0 = r0.getApplicationContext()
                    r1 = 2131564552(0x7f0d1808, float:1.8754592E38)
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
                    r0.a()
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    r0.finish()
                    goto L_0x019b
                L_0x0160:
                    int r1 = r8.error
                    r2 = 2003(0x7d3, float:2.807E-42)
                    if (r1 == r2) goto L_0x017b
                    int r1 = r8.error
                    r2 = 2004(0x7d4, float:2.808E-42)
                    if (r1 != r2) goto L_0x016d
                    goto L_0x017b
                L_0x016d:
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r1 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    android.content.Context r1 = r1.getContext()
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r1, (java.lang.String) r0)
                    r0.a()
                    goto L_0x019b
                L_0x017b:
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r1 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    android.content.Context r1 = r1.getContext()
                    com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = com.ss.android.ugc.aweme.account.util.p.a(r1)
                    r1.setMessage((java.lang.CharSequence) r0)
                    r0 = 2131564451(0x7f0d17a3, float:1.8754388E38)
                    android.content.DialogInterface$OnClickListener r2 = com.ss.android.ugc.aweme.account.login.ui.m.f32636b
                    r1.setPositiveButton((int) r0, (android.content.DialogInterface.OnClickListener) r2)
                    r0 = 2131559036(0x7f0d027c, float:1.8743405E38)
                    android.content.DialogInterface$OnClickListener r2 = com.ss.android.ugc.aweme.account.login.ui.n.f32638b
                    r1.setNegativeButton((int) r0, (android.content.DialogInterface.OnClickListener) r2)
                    r1.show()
                L_0x019b:
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView r0 = r0.f32461c
                    if (r0 == 0) goto L_0x01a8
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.this
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView r0 = r0.f32461c
                    r0.a()
                L_0x01a8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment.AnonymousClass5.b(com.bytedance.sdk.account.api.call.c):void");
            }
        };
        this.f32461c.setEditText(this.u);
        f();
        if (PatchProxy.isSupport(new Object[0], this, f32459a, false, 20596, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32459a, false, 20596, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.h || (UIUtils.getScreenWidth(getContext()) >= 1080 && UIUtils.getScreenHeight(getContext()) >= 2160)) {
            z = true;
        }
        if (z) {
            this.u.postDelayed(new l(this), 500);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        String str;
        String str2;
        int i4 = i2;
        Intent intent2 = intent;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f32459a, false, 20602, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f32459a, false, 20602, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i4 == 1001) {
            if (intent2 == null || !intent2.getBooleanExtra("need_finish_login", false)) {
                z = false;
            }
            AlertDialog alertDialog = null;
            if (intent2 != null) {
                str = intent2.getStringExtra("toast_tips");
            } else {
                str = null;
            }
            int i5 = -1;
            if (intent2 != null) {
                i5 = intent2.getIntExtra("error_code", -1);
            }
            if (intent2 != null) {
                str2 = intent2.getStringExtra("description");
            } else {
                str2 = null;
            }
            if ((i5 == 2003 || i5 == 2004) && !TextUtils.isEmpty(str2)) {
                AlertDialog.Builder a2 = p.a(getActivity());
                a2.setMessage((CharSequence) str2);
                a2.setPositiveButton((int) C0906R.string.do4, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32475a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32475a, false, 20623, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32475a, false, 20623, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        com.ss.android.common.lib.a.a(LoginOrRegisterFragment.this.getActivity(), "login", "login_pop_confirm");
                        ((v) w.a(v.class)).a((Context) LoginOrRegisterFragment.this.getActivity(), "https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", true);
                    }
                });
                a2.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32477a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32477a, false, 20624, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32477a, false, 20624, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        com.ss.android.common.lib.a.a(LoginOrRegisterFragment.this.getActivity(), "login", "login_pop_cancel");
                    }
                });
                alertDialog = a2.show();
            }
            if (!TextUtils.isEmpty(str) && getActivity() != null) {
                com.bytedance.ies.dmt.ui.d.a.b(getActivity().getApplicationContext(), str).a();
            }
            if (z && getActivity() != null) {
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                getActivity().finish();
            }
        }
        if (this.f32460b != null) {
            this.f32460b.a(i2, i3, intent2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32459a, false, 20594, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32459a, false, 20594, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.oh, viewGroup2, false);
        this.f32460b = (ThirdPartyLoginView) inflate.findViewById(C0906R.id.dup);
        this.f32461c = (PhonePassLoginView) inflate.findViewById(C0906R.id.du6);
        this.u = (EditText) inflate.findViewById(C0906R.id.a8r);
        this.w = inflate.findViewById(C0906R.id.dn8);
        this.s = inflate.findViewById(C0906R.id.a0j);
        this.t = (TextView) inflate.findViewById(C0906R.id.a0k);
        this.v = inflate.findViewById(C0906R.id.bxk);
        this.z = (TextView) inflate.findViewById(C0906R.id.csf);
        this.A = (TextView) inflate.findViewById(C0906R.id.ajd);
        this.f32463e = (EditText) inflate.findViewById(C0906R.id.a8v);
        this.w.setOnClickListener(this.G);
        this.D = (ImageView) inflate.findViewById(C0906R.id.dms);
        this.D.setOnClickListener(this.G);
        this.f32461c.setEnterMethod(this.n);
        this.E = (TextView) inflate.findViewById(C0906R.id.ao5);
        inflate.findViewById(C0906R.id.ci4).setOnClickListener(this.G);
        inflate.findViewById(C0906R.id.bwk).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32467a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32467a, false, 20616, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32467a, false, 20616, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                r.a("switch_to_phone", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", LoginOrRegisterFragment.this.n).f31599b);
                ((LoginOrRegisterActivity) LoginOrRegisterFragment.this.getActivity()).c(i.a(PhonePassLoginFragment.class, LoginOrRegisterFragment.this.getArguments()).a("key_input_phone_num", LoginOrRegisterFragment.this.r()).a("enter_from", LoginOrRegisterFragment.this.m).a("enter_method", LoginOrRegisterFragment.this.n).a("from_login_or_register", true).a(), !LoginOrRegisterFragment.this.h);
            }
        });
        this.f32461c.setLifecycleOwner(this);
        this.f32461c.setLoginListener(new PhonePassLoginView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32469a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f32469a, false, 20617, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32469a, false, 20617, new Class[0], Void.TYPE);
                    return;
                }
                LoginOrRegisterFragment.this.i = false;
                if (!LoginOrRegisterFragment.this.m()) {
                    com.ss.android.ugc.aweme.account.terminal.a.a("PhoneNumberIsWrong");
                    com.ss.android.ugc.aweme.account.i.a.a("-1", "phone number invalid", a.b.PHONE_NUMBER_INVALID, a.C0406a.PHONE_SMS, null);
                    com.bytedance.ies.dmt.ui.d.a.b((Context) w.b(), LoginOrRegisterFragment.this.getResources().getString(C0906R.string.duc)).a();
                } else if (!LoginOrRegisterFragment.this.f32461c.f32555e) {
                    com.ss.android.ugc.aweme.account.terminal.a.a("NotAcceptPrivacyAndTerm");
                    com.ss.android.ugc.aweme.account.terminal.a.c("NotAcceptPrivacyAndTerm");
                    com.ss.android.ugc.aweme.account.i.a.a("-1", "NotAcceptPrivacyAndTerm", a.b.CHECK_PRIVACY_ACCEPT, a.C0406a.PHONE_SMS, null);
                    LoginOrRegisterFragment.this.f32461c.d();
                } else {
                    r.a("login_submit", (Map) com.ss.android.ugc.aweme.account.a.a.b.a().a("enter_from", LoginOrRegisterFragment.this.m).a("enter_method", LoginOrRegisterFragment.this.n).a("enter_type", LoginOrRegisterFragment.this.o).a("group_id", com.ss.android.ugc.aweme.account.k.a.a(LoginOrRegisterFragment.this.getArguments())).a("log_pb", com.ss.android.ugc.aweme.account.k.a.b(LoginOrRegisterFragment.this.getArguments())).a("platform", "sms_verification").f31599b);
                    r.onEvent(MobClick.obtain().setEventName("sign_in").setLabelName("sms_verification").setJsonObject(com.ss.android.ugc.aweme.account.a.a.a.a().a("enter_from", LoginOrRegisterFragment.this.m).a("position", LoginOrRegisterFragment.this.n).b()));
                    r.a("login_choose_platform", (Map) com.ss.android.ugc.aweme.account.a.a.b.a().a("enter_method", LoginOrRegisterFragment.this.n).a("enter_from", LoginOrRegisterFragment.this.m).a("platform", "phone").f31599b);
                    LoginOrRegisterFragment.this.f32461c.b();
                    if (LoginOrRegisterFragment.this.f32464f != null) {
                        c cVar = LoginOrRegisterFragment.this.f32464f;
                        String r = LoginOrRegisterFragment.this.r();
                        String obj = LoginOrRegisterFragment.this.f32463e.getText().toString();
                        o oVar = LoginOrRegisterFragment.this.g;
                        if (PatchProxy.isSupport(new Object[]{r, obj, "", oVar}, cVar, c.f32209d, false, 20325, new Class[]{String.class, String.class, String.class, f.class}, Void.TYPE)) {
                            c cVar2 = cVar;
                            PatchProxy.accessDispatch(new Object[]{r, obj, "", oVar}, cVar2, c.f32209d, false, 20325, new Class[]{String.class, String.class, String.class, f.class}, Void.TYPE);
                        } else {
                            cVar.f32210e.a(r, obj, "", (f) oVar);
                        }
                    }
                    if (!TextUtils.equals(LoginOrRegisterFragment.this.B, LoginOrRegisterFragment.this.r())) {
                        com.ss.android.ugc.aweme.account.a.a.a a2 = com.ss.android.ugc.aweme.account.a.a.a.a().a("send_code_phone_number", LoginOrRegisterFragment.this.B).a("formatted_phone_number", LoginOrRegisterFragment.this.r());
                        if (LoginOrRegisterFragment.this.u != null) {
                            a2.a("phone_number_raw_input", LoginOrRegisterFragment.this.u.getText().toString());
                        }
                        n.a("send_code_sms_login_phone_number", a2.b());
                        com.ss.android.ugc.aweme.account.i.a.a(LoginOrRegisterFragment.this.m, LoginOrRegisterFragment.this.n, a.C0406a.PHONE_SMS, "SendCodeNum Equal FormattedNum");
                        return;
                    }
                    com.ss.android.ugc.aweme.account.terminal.a.a("SendCodeNumNotEqualFormattedNum");
                    com.ss.android.ugc.aweme.account.i.a.a(LoginOrRegisterFragment.this.m, LoginOrRegisterFragment.this.n, a.C0406a.PHONE_SMS, "SendCodeNum not Equal FormattedNum");
                }
            }
        });
        this.f32463e.addTextChangedListener(new com.ss.android.ugc.aweme.base.ui.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32471a;

            public final void afterTextChanged(Editable editable) {
                int i;
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{editable}, this, f32471a, false, 20618, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f32471a, false, 20618, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                PhonePassLoginView phonePassLoginView = LoginOrRegisterFragment.this.f32461c;
                String obj = LoginOrRegisterFragment.this.f32463e.getText().toString();
                if (PatchProxy.isSupport(new Object[]{obj}, phonePassLoginView, PhonePassLoginView.f32551a, false, 20726, new Class[]{String.class}, Void.TYPE)) {
                    PhonePassLoginView phonePassLoginView2 = phonePassLoginView;
                    PatchProxy.accessDispatch(new Object[]{obj}, phonePassLoginView2, PhonePassLoginView.f32551a, false, 20726, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                if (TextUtils.isEmpty(obj)) {
                    i = 0;
                } else {
                    i = obj.length();
                }
                LoginButton loginButton = phonePassLoginView.f32553c;
                if (i != 4) {
                    z = false;
                }
                loginButton.setEnabled(z);
            }
        });
        if (Build.VERSION.SDK_INT >= 19) {
            View findViewById = inflate.findViewById(C0906R.id.cv4);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = StatusBarUtils.getStatusBarHeight(getActivity());
            findViewById.setLayoutParams(layoutParams);
        }
        if (this.A != null) {
            String string = getString(C0906R.string.q7);
            String string2 = getString(C0906R.string.aj5);
            Spannable.Factory instance = Spannable.Factory.getInstance();
            Spannable newSpannable = instance.newSpannable(string + string2);
            newSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(C0906R.color.a0b)), 0, string.length(), 17);
            this.A.setText(newSpannable);
        }
        this.f32460b.setEventType(this.m);
        this.f32460b.setPosition(this.n);
        ThirdPartyLoginView thirdPartyLoginView = this.f32460b;
        if (getArguments() == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = getArguments();
        }
        thirdPartyLoginView.setBundle(bundle2);
        if (this.h) {
            this.f32460b.setVisibility(8);
            this.f32461c.setVisibility(0);
            this.D.setImageResource(2130838751);
            this.D.setContentDescription(getString(C0906R.string.b48));
        } else {
            this.D.setContentDescription(getString(C0906R.string.tw));
        }
        if (this.h) {
            this.D.setContentDescription(getString(C0906R.string.b48));
        } else {
            this.D.setContentDescription(getString(C0906R.string.tw));
        }
        this.v.setContentDescription(getString(C0906R.string.tb));
        return inflate;
    }
}
