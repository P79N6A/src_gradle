package com.ss.android.ugc.aweme.account.login.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.sdk.account.f.a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.a.b;
import com.ss.android.mobilelib.c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.g;
import com.ss.android.ugc.aweme.account.login.a.q;
import com.ss.android.ugc.aweme.account.login.d;
import com.ss.android.ugc.aweme.account.login.d.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.w;
import java.util.Map;
import org.json.JSONObject;

public abstract class BaseResetPasswordFragment extends BaseVerifyCodeFragment<e> implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32372a;
    private e D;
    private q E;
    private View.OnClickListener F = new f(this);

    /* renamed from: b  reason: collision with root package name */
    protected TextView f32373b;

    /* renamed from: c  reason: collision with root package name */
    protected EditText f32374c;

    /* renamed from: d  reason: collision with root package name */
    protected EditText f32375d;

    /* renamed from: e  reason: collision with root package name */
    protected com.ss.android.mobilelib.c f32376e;

    /* renamed from: f  reason: collision with root package name */
    protected TextView f32377f;
    protected DmtButton g;
    protected String h;
    protected String i;
    protected boolean w;

    public abstract void f();

    public final int t() {
        return 1;
    }

    public final int u() {
        return g.f31964e;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f32372a, false, 20501, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32372a, false, 20501, new Class[0], Void.TYPE);
        } else if (isViewValid() && getActivity() != null) {
            a.b((Context) getActivity(), (int) C0906R.string.bli).a();
        }
    }

    public final /* synthetic */ com.ss.android.mobilelib.b.a c() {
        if (PatchProxy.isSupport(new Object[0], this, f32372a, false, 20494, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f32372a, false, 20494, new Class[0], e.class);
        }
        if ((this.D == null || !this.D.f30078a) && getActivity() != null) {
            this.D = new e(getActivity(), this);
        }
        return this.D;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f32372a, false, 20497, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32372a, false, 20497, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            if (this.f32375d == null || TextUtils.isEmpty(this.f32375d.getText()) || this.f32375d.getText().toString().length() < 8 || this.f32374c == null || TextUtils.isEmpty(this.f32374c.getText())) {
                this.g.setEnabled(false);
            } else {
                this.g.setEnabled(true);
            }
            if (!TextUtils.isEmpty(this.f32374c.getText()) && this.f32374c.getText().length() == 4) {
                this.f32375d.requestFocus();
            }
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f32372a, false, 20503, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f32372a, false, 20503, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f32374c.requestFocus();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32372a, false, 20495, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32372a, false, 20495, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.h = arguments.getString("phone_number");
            this.w = arguments.getBoolean("bundle_need_back");
            this.i = arguments.getString("mask_phone_number");
            return;
        }
        this.h = b.a().b();
    }

    public final void a(EditText editText, int i2) {
        if (PatchProxy.isSupport(new Object[]{editText, 20}, this, f32372a, false, 20500, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editText, 20}, this, f32372a, false, 20500, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Editable text = editText.getText();
        int length = text.length();
        if (length > 20) {
            h();
            if (this.g != null) {
                this.g.setEnabled(false);
            }
            int selectionEnd = Selection.getSelectionEnd(text);
            editText.setText(text.toString().substring(0, 20));
            Editable text2 = editText.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
            return;
        }
        if (this.g != null) {
            if (length < 8) {
                this.g.setEnabled(false);
                return;
            }
            this.g.setEnabled(true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f32372a, false, 20496, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f32372a, false, 20496, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        view.findViewById(C0906R.id.as6).setOnClickListener(this.F);
        this.f32373b = (TextView) view.findViewById(C0906R.id.ao4);
        this.f32374c = (EditText) view.findViewById(C0906R.id.a91);
        this.f32375d = (EditText) view.findViewById(C0906R.id.a8q);
        this.g = (DmtButton) view.findViewById(C0906R.id.oo);
        this.f32377f = (TextView) view.findViewById(C0906R.id.dnn);
        this.g.setEnabled(false);
        b(this.f32374c);
        this.f32374c.addTextChangedListener(new com.ss.android.ugc.aweme.base.ui.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32378a;

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f32378a, false, 20505, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f32378a, false, 20505, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                BaseResetPasswordFragment.this.g();
            }
        });
        this.f32375d.addTextChangedListener(new com.ss.android.ugc.aweme.base.ui.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32380a;

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f32380a, false, 20506, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f32380a, false, 20506, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                BaseResetPasswordFragment.this.g();
                BaseResetPasswordFragment.this.a(BaseResetPasswordFragment.this.f32375d, 20);
            }
        });
        this.f32376e = com.ss.android.mobilelib.c.a(getActivity()).a(this.f32374c, C0906R.string.abd).a(this.f32375d, C0906R.string.abf);
        this.g.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32382a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32382a, false, 20507, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32382a, false, 20507, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (BaseResetPasswordFragment.this.f32376e.a()) {
                    BaseResetPasswordFragment.this.a(BaseResetPasswordFragment.this.f32375d);
                    int length = BaseResetPasswordFragment.this.f32375d.getText().toString().length();
                    if (length < 8 || length > 20) {
                        BaseResetPasswordFragment.this.h();
                        return;
                    }
                    BaseResetPasswordFragment.this.f();
                }
            }
        });
        if (this.f32375d == null || TextUtils.isEmpty(this.f32375d.getText()) || this.f32375d.getText().toString().length() < 8 || this.f32374c == null || TextUtils.isEmpty(this.f32374c.getText())) {
            this.g.setEnabled(false);
        } else {
            this.g.setEnabled(true);
        }
        this.E = new q(this) {

            /* renamed from: d  reason: collision with root package name */
            public static ChangeQuickRedirect f32384d;

            /* renamed from: a */
            public final void g(com.bytedance.sdk.account.api.call.c<j> cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f32384d, false, 20508, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f32384d, false, 20508, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                } else if (BaseResetPasswordFragment.this.isViewValid() && BaseResetPasswordFragment.this.getContext() != null && cVar.f22251a != null && ((j) cVar.f22251a).f22388e != null) {
                    BaseResetPasswordFragment.this.a();
                    b.a().a(BaseResetPasswordFragment.this.getContext(), ((j) cVar.f22251a).f22384a);
                    com.ss.android.common.lib.a.a(BaseResetPasswordFragment.this.getContext(), "login", "reset_password_next");
                    a.a(BaseResetPasswordFragment.this.getContext(), (int) C0906R.string.rx).a();
                    w.a(((j) cVar.f22251a).f22388e);
                    r.a("login_success", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", BaseResetPasswordFragment.this.n).a("enter_from", BaseResetPasswordFragment.this.m).a("enter_type", BaseResetPasswordFragment.this.o).a("platform", "sms_verification").a("status", 1).a("_perf_monitor", 1).f31599b);
                    if (BaseResetPasswordFragment.this.getActivity() != null) {
                        ((com.ss.android.ugc.aweme.account.login.b) BaseResetPasswordFragment.this.getActivity()).a(BaseResetPasswordFragment.this.b(null));
                    }
                    w.a(5, 1, (Object) ((j) cVar.f22251a).f22384a);
                }
            }

            @SuppressLint({"LongLogTag"})
            public final void b(com.bytedance.sdk.account.api.call.c<j> cVar) {
                JSONObject jSONObject;
                com.ss.android.ugc.aweme.account.login.b bVar;
                com.bytedance.sdk.account.api.call.c<j> cVar2 = cVar;
                if (PatchProxy.isSupport(new Object[]{cVar2}, this, f32384d, false, 20509, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar2}, this, f32384d, false, 20509, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                    return;
                }
                r.a("login_failure", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", BaseResetPasswordFragment.this.n).a("platform", "sms_verification").a("enter_type", BaseResetPasswordFragment.this.o).a("carrier", "").a("error_code", cVar2.error).f31599b);
                BaseResetPasswordFragment.this.a();
                com.ss.android.common.lib.a.a(BaseResetPasswordFragment.this.getContext(), "login", "reset_password_next_error");
                w.a(8, 3, (Object) cVar2.errorMsg);
                if (cVar2.error == 1075) {
                    FragmentActivity activity = BaseResetPasswordFragment.this.getActivity();
                    int i = cVar2.error;
                    if (cVar2.f22251a != null) {
                        jSONObject = ((j) cVar2.f22251a).k;
                    } else {
                        jSONObject = null;
                    }
                    if (BaseResetPasswordFragment.this.getActivity() instanceof com.ss.android.ugc.aweme.account.login.b) {
                        bVar = (com.ss.android.ugc.aweme.account.login.b) BaseResetPasswordFragment.this.getActivity();
                    } else {
                        bVar = null;
                    }
                    com.ss.android.ugc.aweme.account.login.a aVar = new com.ss.android.ugc.aweme.account.login.a(activity, i, jSONObject, null, bVar, BaseResetPasswordFragment.this.b(null));
                    d.a(aVar);
                    return;
                }
                if (!TextUtils.isEmpty(cVar2.errorMsg)) {
                    a.b(BaseResetPasswordFragment.this.getContext(), cVar2.errorMsg).a();
                }
            }
        };
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32386a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f32386a, false, 20510, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32386a, false, 20510, new Class[0], Void.TYPE);
                    return;
                }
                r.a((Context) BaseResetPasswordFragment.this.getActivity(), "resend_click", "verification_code", w.e(), 0);
            }
        }, 500);
    }

    public final void a(String str, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{str, str2, null}, this, f32372a, false, 20499, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, null}, this, f32372a, false, 20499, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (isViewValid() && this.D != null) {
            r.a("login_submit", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", this.n).a("enter_from", this.m).a("enter_type", this.o).a("platform", "sms_verification").a("group_id", com.ss.android.ugc.aweme.account.k.a.a(getArguments())).a("log_pb", com.ss.android.ugc.aweme.account.k.a.b(getArguments())).f31599b);
            this.D.a(this.h, str, str2, null, this.E);
        }
    }
}
