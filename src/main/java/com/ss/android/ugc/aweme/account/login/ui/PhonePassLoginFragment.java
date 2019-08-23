package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.sdk.account.f.a.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.a.a.b;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.account.login.a.n;
import com.ss.android.ugc.aweme.account.login.d.d;
import com.ss.android.ugc.aweme.account.login.m;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView;
import com.ss.android.ugc.aweme.account.util.i;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.base.ui.c;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;
import java.util.Map;

public class PhonePassLoginFragment extends BasePhoneNumberInputFragment<d> implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32529a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f32530b = a.a();

    /* renamed from: c  reason: collision with root package name */
    public PhonePassLoginView f32531c;

    /* renamed from: d  reason: collision with root package name */
    private EditText f32532d;

    /* renamed from: e  reason: collision with root package name */
    private d f32533e;

    /* renamed from: f  reason: collision with root package name */
    private View f32534f;
    private n g;
    private boolean h;
    private TextView i;
    private View w;
    private boolean x = true;
    private View.OnClickListener y = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32545a;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f32545a, false, 20719, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f32545a, false, 20719, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            int id = view.getId();
            if (id == C0906R.id.as6) {
                if (PhonePassLoginFragment.this.getActivity() != null) {
                    PhonePassLoginFragment.this.a(view);
                    PhonePassLoginFragment.this.getActivity().onBackPressed();
                }
            } else if (id == C0906R.id.ci4) {
                PhonePassLoginFragment.this.a(view);
            }
        }
    };

    private String g() {
        if (!PatchProxy.isSupport(new Object[0], this, f32529a, false, 20708, new Class[0], String.class)) {
            return r();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f32529a, false, 20708, new Class[0], String.class);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32529a, false, 20700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32529a, false, 20700, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (isViewValid() && this.f32531c != null) {
            this.f32531c.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32529a, false, 20699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32529a, false, 20699, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.f32531c != null) {
            this.f32531c.b();
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f32529a, false, 20702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32529a, false, 20702, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.g != null) {
            this.g.a();
        }
    }

    public final /* synthetic */ com.ss.android.mobilelib.b.a c() {
        if (PatchProxy.isSupport(new Object[0], this, f32529a, false, 20703, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f32529a, false, 20703, new Class[0], d.class);
        }
        if ((this.f32533e == null || !this.f32533e.f30078a) && getActivity() != null) {
            this.f32533e = new d(getActivity(), this);
        }
        return this.f32533e;
    }

    public final boolean o_() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f32529a, false, 20710, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32529a, false, 20710, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (getArguments() == null || !this.x || w.h()) {
            return false;
        } else {
            if (getArguments().getInt("bundle_flow_type", BaseLoginOrRegisterActivity.o) == BaseLoginOrRegisterActivity.r) {
                z = true;
            }
            return z;
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f32529a, false, 20705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32529a, false, 20705, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.i.a.a(this.m, this.n, a.C0406a.PHONE_NUMBER_PASS, "");
        this.x = false;
        com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("", "", false, "login", "", "login commit");
        if (!m()) {
            com.ss.android.ugc.aweme.account.terminal.a.a("PhoneNumberIsWrong");
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bmg).a();
            com.ss.android.ugc.aweme.account.login.loginlog.a a2 = com.ss.android.ugc.aweme.account.login.loginlog.a.a();
            a2.a(getString(C0906R.string.bmg) + "   " + r(), "", false, "login", "", "login commit error");
            com.ss.android.ugc.aweme.account.i.a.b("", "PhoneNumberIsWrong", a.b.PHONE_NUMBER_INVALID, a.C0406a.PHONE_NUMBER_PASS, g());
        } else if (!this.f32531c.f32555e) {
            com.ss.android.ugc.aweme.account.terminal.a.a("NotAcceptPrivacyAndTerm");
            com.ss.android.ugc.aweme.account.terminal.a.c("NotAcceptPrivacyAndTerm");
            com.ss.android.ugc.aweme.account.i.a.a("-1", "NotAcceptPrivacyAndTerm", a.b.CHECK_PRIVACY_ACCEPT, a.C0406a.PHONE_SMS, null);
            this.f32531c.d();
        } else {
            r.a("login_submit", (Map) b.a().a("enter_from", this.m).a("enter_method", this.n).a("enter_type", this.o).a("group_id", com.ss.android.ugc.aweme.account.k.a.a(getArguments())).a("log_pb", com.ss.android.ugc.aweme.account.k.a.b(getArguments())).a("platform", "phone").f31599b);
            KeyboardUtils.c(this.f32532d);
            if (this.f32533e != null) {
                this.f32533e.a(r(), this.f32532d.getText().toString(), null, this.g);
                return;
            }
            com.ss.android.ugc.aweme.account.terminal.a.a("PresenterIsNull");
            com.ss.android.ugc.aweme.account.i.a.b("", "PresenterIsNull", null, a.C0406a.PHONE_NUMBER_PASS, g());
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32529a, false, 20698, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32529a, false, 20698, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (this.w != null) {
            this.w.setOnClickListener(this.y);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32529a, false, 20697, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32529a, false, 20697, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.h = arguments.getBoolean("from_login_or_register", false);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f32529a, false, 20704, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f32529a, false, 20704, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        e();
        b(this.u);
    }

    public final void a(String str, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f32529a, false, 20707, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), Byte.valueOf(z)}, this, f32529a, false, 20707, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (getActivity() != null) {
            switch (i2) {
                case 1009:
                case 1033:
                case 1034:
                case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE:
                case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_ERROR:
                    return;
                default:
                    super.a(str, i2, z);
                    return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32529a, false, 20701, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32529a, false, 20701, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.oi, viewGroup2, false);
        this.w = inflate.findViewById(C0906R.id.as6);
        this.w.setOnClickListener(this.y);
        inflate.findViewById(C0906R.id.ci4).setOnClickListener(this.y);
        this.s = inflate.findViewById(C0906R.id.a0j);
        this.u = (EditText) inflate.findViewById(C0906R.id.a8r);
        this.v = inflate.findViewById(C0906R.id.bxk);
        this.t = (TextView) inflate.findViewById(C0906R.id.a0k);
        this.f32531c = (PhonePassLoginView) inflate.findViewById(C0906R.id.du5);
        this.f32532d = (EditText) inflate.findViewById(C0906R.id.a8q);
        this.f32534f = inflate.findViewById(C0906R.id.dn8);
        this.f32532d.addTextChangedListener(new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32535a;

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f32535a, false, 20711, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f32535a, false, 20711, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                PhonePassLoginFragment.this.f32531c.setLoginBtnEnable(!TextUtils.isEmpty(editable.toString()));
            }
        });
        this.i = (TextView) inflate.findViewById(C0906R.id.dnn);
        inflate.findViewById(C0906R.id.dn2).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32537a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32537a, false, 20712, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32537a, false, 20712, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("", "", false, "login", "", "忘记密码");
                if (!PhonePassLoginFragment.this.m()) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) PhonePassLoginFragment.this.getActivity(), (int) C0906R.string.bmg).a();
                } else {
                    PhonePassLoginFragment.this.l().c(i.a(ResetPasswordFragment.class, PhonePassLoginFragment.this.getArguments()).a("phone_number", PhonePassLoginFragment.this.r()).a("mask_phone_number", PhonePassLoginFragment.this.s()).a(), false);
                }
            }
        });
        this.f32531c.setEditText(this.u);
        this.f32531c.setEnterMethod(this.n);
        this.f32531c.setLifecycleOwner(this);
        this.f32531c.setLoginListener(new PhonePassLoginView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32539a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f32539a, false, 20713, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32539a, false, 20713, new Class[0], Void.TYPE);
                    return;
                }
                PhonePassLoginFragment.this.f();
            }
        });
        this.f32534f.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32541a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32541a, false, 20714, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32541a, false, 20714, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (PhonePassLoginFragment.this.getContext() != null) {
                    try {
                        h.a().a(g.b().aQ().getNotLoggedIn());
                    } catch (com.bytedance.ies.a unused) {
                        com.ss.android.common.util.i iVar = new com.ss.android.common.util.i("https://aweme.snssdk.com/falcon/douyin_falcon/faq/?id=1209");
                        iVar.a("enter_from", "login_pad");
                        ((v) w.a(v.class)).a(PhonePassLoginFragment.this.getContext(), iVar.toString(), true);
                    }
                }
            }
        });
        this.f32531c.a(com.ss.android.ugc.aweme.account.util.n.a());
        r.a("phone_login_enter_password", (Map) new b().f31599b);
        this.g = new n(this) {

            /* renamed from: d  reason: collision with root package name */
            public static ChangeQuickRedirect f32543d;

            /* renamed from: a */
            public final void g(com.bytedance.sdk.account.api.call.c<e> cVar) {
                com.bytedance.sdk.account.api.call.c<e> cVar2 = cVar;
                if (PatchProxy.isSupport(new Object[]{cVar2}, this, f32543d, false, 20715, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar2}, this, f32543d, false, 20715, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                    return;
                }
                super.g(cVar);
                com.ss.android.ugc.aweme.account.terminal.a.a("success");
                if (PhonePassLoginFragment.this.isViewValid()) {
                    PhonePassLoginFragment.this.a();
                    com.ss.android.ugc.aweme.base.n.a("aweme_phone_login_rate", 1, com.ss.android.ugc.aweme.account.a.a.a.a().b());
                    com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("", "", true, "login", "", "mobile login success");
                    com.ss.android.common.lib.a.a(PhonePassLoginFragment.this.getContext(), "login", "login_success");
                    com.ss.android.ugc.aweme.account.i.a.a(a.b.LOGIN_BY_PASS, a.C0406a.PHONE_NUMBER_PASS, "");
                    com.ss.android.mobilelib.a.b.a().a(PhonePassLoginFragment.this.getContext(), ((e) cVar2.f22251a).f22369a);
                    if (PhonePassLoginFragment.this.getActivity() instanceof LoginOrRegisterActivity) {
                        ((LoginOrRegisterActivity) PhonePassLoginFragment.this.getActivity()).a(true);
                        ((LoginOrRegisterActivity) PhonePassLoginFragment.this.getActivity()).a(PhonePassLoginFragment.this.b("phone_password"));
                    }
                    r.onEvent(MobClick.obtain().setEventName("sign_in_success").setLabelName("phone").setJsonObject(com.ss.android.ugc.aweme.account.a.a.a.a().a("enter_from", PhonePassLoginFragment.this.m).a("position", PhonePassLoginFragment.this.n).b()));
                    r.a("login_success", (Map) new b().a("enter_method", PhonePassLoginFragment.this.m).a("enter_from", PhonePassLoginFragment.this.n).a("enter_type", PhonePassLoginFragment.this.o).a("platform", "phone").a("status", 1).a("_perf_monitor", 1).f31599b);
                    if (PhonePassLoginFragment.this.getArguments() != null && PhonePassLoginFragment.this.getArguments().getBoolean("need_remember_login_method", true)) {
                        com.ss.android.ugc.aweme.account.login.g.a((BaseLoginMethod) new PhoneLoginMethod(w.e(), LoginMethodName.PHONE_NUMBER_PASS, PhonePassLoginFragment.this.q));
                    }
                }
            }

            /* JADX WARNING: type inference failed for: r1v41, types: [android.support.v4.app.FragmentActivity] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.e> r19) {
                /*
                    r18 = this;
                    r7 = r18
                    r8 = r19
                    r9 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r10 = 0
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f32543d
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<com.bytedance.sdk.account.api.call.c> r1 = com.bytedance.sdk.account.api.call.c.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 20716(0x50ec, float:2.9029E-41)
                    r1 = r18
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0036
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f32543d
                    r3 = 0
                    r4 = 20716(0x50ec, float:2.9029E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<com.bytedance.sdk.account.api.call.c> r1 = com.bytedance.sdk.account.api.call.c.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r18
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0036:
                    super.b(r19)
                    java.lang.String r0 = r8.errorMsg
                    com.ss.android.ugc.aweme.account.terminal.a.a(r0)
                    int r0 = r8.error
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    java.lang.String r1 = r8.errorMsg
                    com.ss.android.ugc.aweme.account.i.a$a r2 = com.ss.android.ugc.aweme.account.i.a.C0406a.PHONE_NUMBER_PASS
                    java.lang.String r3 = ""
                    r4 = 0
                    com.ss.android.ugc.aweme.account.i.a.b(r0, r1, r4, r2, r3)
                    int r0 = r8.error
                    java.lang.String r1 = r8.errorMsg
                    r2 = 3
                    java.lang.Object[] r11 = new java.lang.Object[r2]
                    java.lang.Byte r3 = java.lang.Byte.valueOf(r10)
                    r11[r10] = r3
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                    r11[r9] = r3
                    r3 = 2
                    r11[r3] = r1
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.terminal.d.f32791a
                    r14 = 1
                    r15 = 20952(0x51d8, float:2.936E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r2]
                    java.lang.Class r6 = java.lang.Boolean.TYPE
                    r5[r10] = r6
                    java.lang.Class r6 = java.lang.Integer.TYPE
                    r5[r9] = r6
                    java.lang.Class<java.lang.String> r6 = java.lang.String.class
                    r5[r3] = r6
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r16 = r5
                    boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r5 == 0) goto L_0x00ae
                    java.lang.Object[] r11 = new java.lang.Object[r2]
                    java.lang.Byte r5 = java.lang.Byte.valueOf(r10)
                    r11[r10] = r5
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r11[r9] = r0
                    r11[r3] = r1
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.terminal.d.f32791a
                    r14 = 1
                    r15 = 20952(0x51d8, float:2.936E-41)
                    java.lang.Class[] r0 = new java.lang.Class[r2]
                    java.lang.Class r1 = java.lang.Boolean.TYPE
                    r0[r10] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r0[r9] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r0[r3] = r1
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r16 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    goto L_0x00b3
                L_0x00ae:
                    com.ss.android.ugc.aweme.account.terminal.d$a r2 = com.ss.android.ugc.aweme.account.terminal.d.f32793c
                    r2.a((boolean) r10, (int) r0, (java.lang.String) r1)
                L_0x00b3:
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    boolean r0 = r0.isViewValid()
                    if (r0 != 0) goto L_0x00bc
                    return
                L_0x00bc:
                    java.lang.String r0 = "login_failure"
                    com.ss.android.ugc.aweme.account.a.a.b r1 = new com.ss.android.ugc.aweme.account.a.a.b
                    r1.<init>()
                    java.lang.String r2 = "platform"
                    java.lang.String r3 = "phone"
                    com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "enter_method"
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r3 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    java.lang.String r3 = r3.n
                    com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "enter_type"
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r3 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    java.lang.String r3 = r3.m
                    com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "carrier"
                    java.lang.String r3 = ""
                    com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "error_code"
                    int r3 = r8.error
                    com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (int) r3)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r1.f31599b
                    com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    boolean r0 = r0 instanceof com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity
                    if (r0 == 0) goto L_0x014b
                    int r0 = r8.error
                    r1 = 1039(0x40f, float:1.456E-42)
                    if (r0 != r1) goto L_0x0140
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity r0 = (com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity) r0
                    java.lang.Class<com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment> r1 = com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment.class
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r2 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.os.Bundle r2 = r2.getArguments()
                    com.ss.android.ugc.aweme.account.util.i$a r1 = com.ss.android.ugc.aweme.account.util.i.a(r1, r2)
                    java.lang.String r2 = "phone_number"
                    T r3 = r8.f22251a
                    com.bytedance.sdk.account.f.a.e r3 = (com.bytedance.sdk.account.f.a.e) r3
                    java.lang.String r3 = r3.f22369a
                    com.ss.android.ugc.aweme.account.util.i$a r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "enter_from"
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r3 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    java.lang.String r3 = r3.m
                    com.ss.android.ugc.aweme.account.util.i$a r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "enter_method"
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r3 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    java.lang.String r3 = r3.n
                    com.ss.android.ugc.aweme.account.util.i$a r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    android.support.v4.app.Fragment r1 = r1.a()
                    r0.b(r1, r10)
                    return
                L_0x0140:
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity r0 = (com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity) r0
                    r0.a((boolean) r10)
                L_0x014b:
                    java.lang.String r0 = "aweme_phone_login_rate"
                    com.ss.android.ugc.aweme.account.a.a.a r1 = com.ss.android.ugc.aweme.account.a.a.a.a()
                    java.lang.String r2 = "errorCode"
                    int r3 = r8.error
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    com.ss.android.ugc.aweme.account.a.a.a r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "errorDesc"
                    java.lang.String r3 = r8.errorMsg
                    com.ss.android.ugc.aweme.account.a.a.a r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    org.json.JSONObject r1 = r1.b()
                    com.ss.android.ugc.aweme.base.n.a((java.lang.String) r0, (int) r10, (org.json.JSONObject) r1)
                    com.ss.android.ugc.aweme.account.login.loginlog.a r11 = com.ss.android.ugc.aweme.account.login.loginlog.a.a()
                    java.lang.String r12 = r8.errorMsg
                    java.lang.String r13 = ""
                    r14 = 0
                    java.lang.String r15 = "login"
                    java.lang.String r16 = ""
                    java.lang.String r17 = "mobile login fail"
                    r11.a(r12, r13, r14, r15, r16, r17)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r1 = "login"
                    java.lang.String r2 = "login_error"
                    com.ss.android.common.lib.a.a(r0, r1, r2)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    r0.a()
                    int r0 = r8.error
                    r1 = 1075(0x433, float:1.506E-42)
                    if (r0 != r1) goto L_0x01df
                    com.ss.android.ugc.aweme.account.login.a r0 = new com.ss.android.ugc.aweme.account.login.a
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r1 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r12 = r1.getActivity()
                    int r13 = r8.error
                    T r1 = r8.f22251a
                    if (r1 == 0) goto L_0x01ac
                    T r1 = r8.f22251a
                    com.bytedance.sdk.account.f.a.e r1 = (com.bytedance.sdk.account.f.a.e) r1
                    org.json.JSONObject r1 = r1.k
                    r14 = r1
                    goto L_0x01ad
                L_0x01ac:
                    r14 = r4
                L_0x01ad:
                    com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod r15 = new com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod
                    java.lang.String r1 = ""
                    com.ss.android.ugc.aweme.account.login.model.LoginMethodName r2 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_NUMBER_PASS
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r3 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    com.ss.android.ugc.aweme.account.login.e.a$a r3 = r3.q
                    r15.<init>(r1, r2, r3)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r1 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                    boolean r1 = r1 instanceof com.ss.android.ugc.aweme.account.login.b
                    if (r1 == 0) goto L_0x01cd
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r1 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                    r4 = r1
                    com.ss.android.ugc.aweme.account.login.b r4 = (com.ss.android.ugc.aweme.account.login.b) r4
                L_0x01cd:
                    r16 = r4
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r1 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    java.lang.String r2 = "phone_password"
                    android.os.Bundle r17 = r1.b(r2)
                    r11 = r0
                    r11.<init>(r12, r13, r14, r15, r16, r17)
                    com.ss.android.ugc.aweme.account.login.d.a(r0)
                    return
                L_0x01df:
                    int r0 = r8.error
                    r1 = 2003(0x7d3, float:2.807E-42)
                    r2 = 2131559036(0x7f0d027c, float:1.8743405E38)
                    if (r0 == r1) goto L_0x0266
                    int r0 = r8.error
                    r1 = 2004(0x7d4, float:2.808E-42)
                    if (r0 != r1) goto L_0x01ef
                    goto L_0x0266
                L_0x01ef:
                    java.lang.String r0 = r8.errorMsg
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x020e
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.content.Context r0 = r0.getContext()
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r1 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    r2 = 2131561094(0x7f0d0a86, float:1.8747579E38)
                    java.lang.String r1 = r1.getString(r2)
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
                    r0.a()
                    return
                L_0x020e:
                    int r0 = r8.error
                    r1 = 1009(0x3f1, float:1.414E-42)
                    if (r0 != r1) goto L_0x0224
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r1 = r8.errorMsg
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
                    r0.a()
                    return
                L_0x0224:
                    int r0 = r8.error
                    r1 = 1033(0x409, float:1.448E-42)
                    if (r0 != r1) goto L_0x023a
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r1 = r8.errorMsg
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
                    r0.a()
                    return
                L_0x023a:
                    int r0 = r8.error
                    r1 = 1034(0x40a, float:1.449E-42)
                    if (r0 != r1) goto L_0x0265
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = com.ss.android.ugc.aweme.account.util.p.a(r0)
                    java.lang.String r1 = r8.errorMsg
                    r0.setMessage((java.lang.CharSequence) r1)
                    r1 = 2131560944(0x7f0d09f0, float:1.8747275E38)
                    com.ss.android.ugc.aweme.account.login.ui.v r3 = new com.ss.android.ugc.aweme.account.login.ui.v
                    r3.<init>(r7)
                    r0.setPositiveButton((int) r1, (android.content.DialogInterface.OnClickListener) r3)
                    com.ss.android.ugc.aweme.account.login.ui.w r1 = new com.ss.android.ugc.aweme.account.login.ui.w
                    r1.<init>(r7)
                    r0.setNegativeButton((int) r2, (android.content.DialogInterface.OnClickListener) r1)
                    r0.show()
                L_0x0265:
                    return
                L_0x0266:
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.this
                    java.lang.String r1 = r8.errorMsg
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r1
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.f32529a
                    r14 = 0
                    r15 = 20706(0x50e2, float:2.9015E-41)
                    java.lang.Class[] r3 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.String> r4 = java.lang.String.class
                    r3[r10] = r4
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r0
                    r16 = r3
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r3 == 0) goto L_0x029b
                    java.lang.Object[] r8 = new java.lang.Object[r9]
                    r8[r10] = r1
                    com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.f32529a
                    r11 = 0
                    r12 = 20706(0x50e2, float:2.9015E-41)
                    java.lang.Class[] r13 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r13[r10] = r2
                    java.lang.Class r14 = java.lang.Void.TYPE
                    r9 = r0
                    r10 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
                    return
                L_0x029b:
                    android.support.v4.app.FragmentActivity r3 = r0.getActivity()
                    com.bytedance.ies.uikit.dialog.AlertDialog$Builder r3 = com.ss.android.ugc.aweme.account.util.p.a(r3)
                    r3.setMessage((java.lang.CharSequence) r1)
                    r1 = 2131564451(0x7f0d17a3, float:1.8754388E38)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment$7 r4 = new com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment$7
                    r4.<init>()
                    r3.setPositiveButton((int) r1, (android.content.DialogInterface.OnClickListener) r4)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment$8 r1 = new com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment$8
                    r1.<init>()
                    r3.setNegativeButton((int) r2, (android.content.DialogInterface.OnClickListener) r1)
                    r3.show()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment.AnonymousClass5.b(com.bytedance.sdk.account.api.call.c):void");
            }
        };
        if (Build.VERSION.SDK_INT >= 19) {
            View findViewById = inflate.findViewById(C0906R.id.cv4);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = p.c();
            findViewById.setLayoutParams(layoutParams);
        }
        return inflate;
    }
}
