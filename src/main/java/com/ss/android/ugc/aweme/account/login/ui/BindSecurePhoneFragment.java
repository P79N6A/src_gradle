package com.ss.android.ugc.aweme.account.login.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.sdk.account.f.a.h;
import com.bytedance.sdk.account.f.b.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.a.b;
import com.ss.android.mobilelib.c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.g;
import com.ss.android.ugc.aweme.account.login.a.o;
import com.ss.android.ugc.aweme.account.login.d.a;
import com.ss.android.ugc.aweme.account.terminal.d;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.account.view.StateButton;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;
import org.json.JSONObject;

public class BindSecurePhoneFragment extends BaseVerifyCodeFragment<a> implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32400a;

    /* renamed from: b  reason: collision with root package name */
    protected String f32401b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f32402c;

    /* renamed from: d  reason: collision with root package name */
    public EditText f32403d;

    /* renamed from: e  reason: collision with root package name */
    public View f32404e;

    /* renamed from: f  reason: collision with root package name */
    public a f32405f;
    public o g;

    public final boolean m() {
        return true;
    }

    public final int t() {
        return 2;
    }

    public final String r() {
        return this.f32401b;
    }

    public final int u() {
        return g.u;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f32400a, false, 20531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32400a, false, 20531, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public final /* synthetic */ com.ss.android.mobilelib.b.a c() {
        if (PatchProxy.isSupport(new Object[0], this, f32400a, false, 20527, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f32400a, false, 20527, new Class[0], a.class);
        }
        if ((this.f32405f == null || !this.f32405f.f30078a) && getContext() != null) {
            this.f32405f = new a(getContext(), this);
        }
        return this.f32405f;
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f32400a, false, 20533, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f32400a, false, 20533, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f32403d.requestFocus();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32400a, false, 20526, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32400a, false, 20526, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f32401b = arguments.getString("phone_number");
        } else {
            this.f32401b = b.a().b();
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f32400a, false, 20532, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f32400a, false, 20532, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName(str).setLabelName(str2).setJsonObject(com.ss.android.ugc.aweme.account.a.a.a.a().a("enter_from", this.m).a("position", this.n).b()));
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f32400a, false, 20529, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f32400a, false, 20529, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f32402c = (TextView) view.findViewById(C0906R.id.dne);
        this.f32403d = (EditText) view.findViewById(C0906R.id.a91);
        this.z = (TextView) view.findViewById(C0906R.id.csf);
        this.f32404e = view.findViewById(C0906R.id.oo);
        this.A = (TextView) view.findViewById(C0906R.id.ajd);
        this.f32402c.setText(this.f32401b);
        this.f32403d.addTextChangedListener(new com.ss.android.ugc.aweme.base.ui.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32406a;

            public final void afterTextChanged(Editable editable) {
                int length;
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{editable}, this, f32406a, false, 20534, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f32406a, false, 20534, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                if (TextUtils.isEmpty(editable.toString())) {
                    length = 0;
                } else {
                    length = editable.toString().length();
                }
                View view = BindSecurePhoneFragment.this.f32404e;
                if (length != 4) {
                    z = false;
                }
                StateButton.a.a(view, z);
            }
        });
        StateButton.a.a(this.f32404e, false);
        this.f32404e.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32408a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32408a, false, 20535, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32408a, false, 20535, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!TextUtils.isEmpty(BindSecurePhoneFragment.this.f32403d.getText()) && BindSecurePhoneFragment.this.f32403d.getText().toString().length() == 4) {
                    StateButton.a.b(BindSecurePhoneFragment.this.f32404e);
                    a aVar = BindSecurePhoneFragment.this.f32405f;
                    String str = BindSecurePhoneFragment.this.f32401b;
                    String obj = BindSecurePhoneFragment.this.f32403d.getText().toString();
                    o oVar = BindSecurePhoneFragment.this.g;
                    if (PatchProxy.isSupport(new Object[]{str, obj, "", oVar}, aVar, a.f32199d, false, 20317, new Class[]{String.class, String.class, String.class, f.class}, Void.TYPE)) {
                        a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{str, obj, "", oVar}, aVar2, a.f32199d, false, 20317, new Class[]{String.class, String.class, String.class, f.class}, Void.TYPE);
                    } else if (aVar.f30078a) {
                        aVar.f32200e.a(str, obj, "", (f) oVar);
                    }
                    BindSecurePhoneFragment.this.a("credible_auth", "click_auth");
                    r.a("login_submit", (Map) com.ss.android.ugc.aweme.account.a.a.b.a().a("enter_from", BindSecurePhoneFragment.this.m).a("enter_method", BindSecurePhoneFragment.this.n).a("enter_type", BindSecurePhoneFragment.this.o).a("group_id", com.ss.android.ugc.aweme.account.k.a.a(BindSecurePhoneFragment.this.getArguments())).a("log_pb", com.ss.android.ugc.aweme.account.k.a.b(BindSecurePhoneFragment.this.getArguments())).a("platform", "sms_verification").f31599b);
                }
            }
        });
        this.g = new o(this) {

            /* renamed from: e  reason: collision with root package name */
            public static ChangeQuickRedirect f32410e;

            /* renamed from: a */
            public final void g(com.bytedance.sdk.account.api.call.c<h> cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f32410e, false, 20536, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f32410e, false, 20536, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                    return;
                }
                super.g(cVar);
                com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("", "", true, "login", "", "mobile login success");
                n.a("aweme_phone_login_rate", 1, com.ss.android.ugc.aweme.account.a.a.a.a().b());
                if (BindSecurePhoneFragment.this.getActivity() != null) {
                    if (BindSecurePhoneFragment.this.getActivity() instanceof com.ss.android.ugc.aweme.account.login.c) {
                        ((com.ss.android.ugc.aweme.account.login.c) BindSecurePhoneFragment.this.getActivity()).a(true);
                    }
                    ((com.ss.android.ugc.aweme.account.login.b) BindSecurePhoneFragment.this.getActivity()).a(BindSecurePhoneFragment.this.b("phone_sms"));
                }
                StateButton.a.a(BindSecurePhoneFragment.this.f32404e);
                BindSecurePhoneFragment.this.a("credible_auth", "auth_success");
                BindSecurePhoneFragment.this.a("sign_in_success", "sms_verification");
                KeyboardUtils.c(BindSecurePhoneFragment.this.f32403d);
                r.a("login_success", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", BindSecurePhoneFragment.this.n).a("enter_from", BindSecurePhoneFragment.this.m).a("enter_type", BindSecurePhoneFragment.this.o).a("platform", "sms_verification").a("status", 1).a("_perf_monitor", 1).f31599b);
            }

            public final void b(com.bytedance.sdk.account.api.call.c<h> cVar) {
                JSONObject jSONObject;
                com.ss.android.ugc.aweme.account.login.b bVar;
                com.bytedance.sdk.account.api.call.c<h> cVar2 = cVar;
                if (PatchProxy.isSupport(new Object[]{cVar2}, this, f32410e, false, 20537, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar2}, this, f32410e, false, 20537, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                    return;
                }
                super.b(cVar);
                if (BindSecurePhoneFragment.this.getActivity() instanceof com.ss.android.ugc.aweme.account.login.c) {
                    ((com.ss.android.ugc.aweme.account.login.c) BindSecurePhoneFragment.this.getActivity()).a(false);
                }
                d.a(false, cVar2.error, cVar2.errorMsg);
                r.a("login_failure", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("platform", "sms_verification").a("enter_method", BindSecurePhoneFragment.this.n).a("enter_type", BindSecurePhoneFragment.this.o).a("carrier", "").a("error_code", cVar2.error).f31599b);
                n.a("aweme_phone_login_rate", 0, com.ss.android.ugc.aweme.account.a.a.a.a().a("errorCode", Integer.valueOf(cVar2.error)).a("errorDesc", cVar2.errorMsg).b());
                if (cVar2.error == 1075) {
                    FragmentActivity activity = BindSecurePhoneFragment.this.getActivity();
                    int i = cVar2.error;
                    if (cVar2.f22251a != null) {
                        jSONObject = ((h) cVar2.f22251a).k;
                    } else {
                        jSONObject = null;
                    }
                    if (BindSecurePhoneFragment.this.getActivity() instanceof com.ss.android.ugc.aweme.account.login.b) {
                        bVar = (com.ss.android.ugc.aweme.account.login.b) BindSecurePhoneFragment.this.getActivity();
                    } else {
                        bVar = null;
                    }
                    com.ss.android.ugc.aweme.account.login.a aVar = new com.ss.android.ugc.aweme.account.login.a(activity, i, jSONObject, null, bVar, BindSecurePhoneFragment.this.b("phone_sms"));
                    com.ss.android.ugc.aweme.account.login.d.a(aVar);
                } else if (com.ss.android.ugc.aweme.account.util.d.f33086b.contains(Integer.valueOf(cVar2.error))) {
                    if (BindSecurePhoneFragment.this.getActivity() != null) {
                        com.bytedance.ies.dmt.ui.d.a.b(BindSecurePhoneFragment.this.getActivity().getApplicationContext(), (int) C0906R.string.dqv).a();
                        BindSecurePhoneFragment.this.getActivity().finish();
                    }
                } else if (cVar2.error == 2003 || cVar2.error == 2004) {
                    AlertDialog.Builder a2 = p.a(BindSecurePhoneFragment.this.getContext());
                    a2.setMessage((CharSequence) cVar2.errorMsg);
                    a2.setPositiveButton((int) C0906R.string.do4, g.f32619b);
                    a2.setNegativeButton((int) C0906R.string.pm, h.f32621b);
                    a2.show();
                } else if (BindSecurePhoneFragment.this.getContext() != null && !TextUtils.isEmpty(cVar2.errorMsg)) {
                    com.bytedance.ies.dmt.ui.d.a.b(BindSecurePhoneFragment.this.getContext(), cVar2.errorMsg).a();
                }
                StateButton.a.a(BindSecurePhoneFragment.this.f32404e);
            }
        };
        super.e();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32400a, false, 20528, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.n2, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32400a, false, 20528, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
