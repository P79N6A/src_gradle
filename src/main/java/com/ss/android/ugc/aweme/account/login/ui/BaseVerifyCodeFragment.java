package com.ss.android.ugc.aweme.account.login.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.f.a.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.i.e;
import com.ss.android.ugc.aweme.account.login.a.s;
import com.ss.android.ugc.aweme.account.login.a.v;
import com.ss.android.ugc.aweme.account.login.d.b;
import com.ss.android.ugc.aweme.account.login.ui.i;
import com.ss.android.ugc.aweme.account.terminal.f;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.w;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public abstract class BaseVerifyCodeFragment<T extends b> extends BasePhoneNumberInputFragment<T> implements View.OnClickListener {
    public static ChangeQuickRedirect x;
    public static final boolean y = a.a();
    protected TextView A;
    public String B;
    protected s C;

    /* renamed from: a  reason: collision with root package name */
    private final int f32388a = 60000;

    /* renamed from: b  reason: collision with root package name */
    private final int f32389b = 50000;

    /* renamed from: c  reason: collision with root package name */
    private final int f32390c = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;

    /* renamed from: d  reason: collision with root package name */
    private i f32391d;

    /* renamed from: e  reason: collision with root package name */
    private i.b f32392e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32393f = true;
    private v g;
    protected TextView z;

    public abstract int t();

    public abstract int u();

    public boolean v() {
        return true;
    }

    public void w() {
    }

    public String x() {
        return "user_click";
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, x, false, 20515, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, x, false, 20515, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.f32391d.a(null);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, x, false, 20514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, x, false, 20514, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        if (this.z != null) {
            this.z.setOnClickListener(this);
        }
        if (this.A != null) {
            this.A.setOnClickListener(this);
        }
        if (this.f32391d != null) {
            this.f32392e = new i.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32394a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f32394a, false, 20521, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f32394a, false, 20521, new Class[0], Void.TYPE);
                    } else if (BaseVerifyCodeFragment.this.isViewValid()) {
                        BaseVerifyCodeFragment.this.z.setText(BaseVerifyCodeFragment.this.getString(C0906R.string.bzo));
                        if (BaseVerifyCodeFragment.this.v()) {
                            com.ss.android.ugc.aweme.base.utils.v.a((View) BaseVerifyCodeFragment.this.A, 0);
                        }
                        BaseVerifyCodeFragment.this.w();
                    }
                }

                public final void a(long j) {
                    if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f32394a, false, 20520, new Class[]{Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f32394a, false, 20520, new Class[]{Long.TYPE}, Void.TYPE);
                    } else if (BaseVerifyCodeFragment.this.isViewValid()) {
                        BaseVerifyCodeFragment.this.z.setText(BaseVerifyCodeFragment.this.getString(C0906R.string.bzp, Long.valueOf(j / 1000)));
                        if (j < 50000 && BaseVerifyCodeFragment.this.A.getVisibility() != 0 && BaseVerifyCodeFragment.this.v()) {
                            BaseVerifyCodeFragment.this.A.setVisibility(0);
                        }
                    }
                }
            };
            this.f32391d.a(this.f32392e);
        }
        this.g = new v(this) {

            /* renamed from: d  reason: collision with root package name */
            public static ChangeQuickRedirect f32396d;

            public final void b(c<k> cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f32396d, false, 20523, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f32396d, false, 20523, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                f.a(1, BaseVerifyCodeFragment.this.u(), cVar.error, cVar.errorMsg);
                if (BaseVerifyCodeFragment.this.getActivity() instanceof LoginOrRegisterActivity) {
                    ((LoginOrRegisterActivity) BaseVerifyCodeFragment.this.getActivity()).c(false);
                }
                if (!TextUtils.isEmpty(cVar.errorMsg)) {
                    com.bytedance.ies.dmt.ui.d.a.b(BaseVerifyCodeFragment.this.getContext(), cVar.errorMsg).a();
                }
            }

            /* renamed from: a */
            public final void g(c<k> cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f32396d, false, 20522, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f32396d, false, 20522, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                super.g(cVar);
                f.a(0, BaseVerifyCodeFragment.this.u(), 0, "");
                if (BaseVerifyCodeFragment.this.getActivity() != null) {
                    AlertDialog.Builder a2 = p.a(BaseVerifyCodeFragment.this.getActivity());
                    a2.setTitle((int) C0906R.string.bmd).setMessage((int) C0906R.string.bme).setNegativeButton((int) C0906R.string.anv, (DialogInterface.OnClickListener) null).setCancelable(false);
                    bc.a(a2.create());
                    if (BaseVerifyCodeFragment.this.getActivity() instanceof LoginOrRegisterActivity) {
                        ((LoginOrRegisterActivity) BaseVerifyCodeFragment.this.getActivity()).c(true);
                    }
                }
            }
        };
        this.C = new s(this) {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f32398c;

            /* renamed from: a */
            public final void g(c<k> cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f32398c, false, 20524, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f32398c, false, 20524, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                super.g(cVar);
                f.a(0, BaseVerifyCodeFragment.this.u(), 0, "");
                if (BaseVerifyCodeFragment.this.getActivity() instanceof LoginOrRegisterActivity) {
                    ((LoginOrRegisterActivity) BaseVerifyCodeFragment.this.getActivity()).b(true);
                }
            }

            public final void b(c<k> cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f32398c, false, 20525, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f32398c, false, 20525, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                f.a(1, BaseVerifyCodeFragment.this.u(), cVar.error, cVar.errorMsg);
                if (cVar.error == 2015) {
                    BaseVerifyCodeFragment.this.c("anti_spam");
                    return;
                }
                if (BaseVerifyCodeFragment.this.getActivity() instanceof LoginOrRegisterActivity) {
                    ((LoginOrRegisterActivity) BaseVerifyCodeFragment.this.getActivity()).b(false);
                }
                if (!TextUtils.isEmpty(cVar.errorMsg)) {
                    com.bytedance.ies.dmt.ui.d.a.b(BaseVerifyCodeFragment.this.getContext(), cVar.errorMsg).a();
                }
            }
        };
    }

    public void onAttach(Activity activity) {
        SparseArray<i> sparseArray;
        if (PatchProxy.isSupport(new Object[]{activity}, this, x, false, 20511, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, x, false, 20511, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        super.onAttach(activity);
        if (activity instanceof LoginOrRegisterActivity) {
            sparseArray = ((LoginOrRegisterActivity) activity).y;
            this.f32391d = sparseArray.get(t());
        } else {
            sparseArray = null;
        }
        if (this.f32391d == null) {
            i iVar = new i(60000, 1000, this.f32392e);
            this.f32391d = iVar;
            if (sparseArray != null) {
                sparseArray.put(t(), this.f32391d);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, x, false, 20512, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, x, false, 20512, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle2.putString("send_code_phone_number", this.B);
    }

    public void onViewStateRestored(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, x, false, 20513, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, x, false, 20513, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewStateRestored(bundle);
        if (bundle2 != null) {
            this.B = bundle2.getString("send_code_phone_number");
        }
    }

    public void b(int i) {
        byte b2;
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, x, false, 20519, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, x, false, 20519, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 0) {
            b2 = 1;
        } else {
            b2 = 0;
        }
        String str2 = this.B;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(b2), str2}, null, e.f31992a, true, 20050, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(b2), str2}, null, e.f31992a, true, 20050, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event", "send code");
        if (b2 != 0) {
            str = "true";
        } else {
            str = "false";
        }
        hashMap.put("isVoiceCode", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("mobile", str2);
        e eVar = e.f31993b;
        String hashMap2 = hashMap.toString();
        Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
        eVar.c(hashMap2);
    }

    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, x, false, 20518, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, x, false, 20518, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (c() != null) {
            com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("", "", false, "send_voice_code", "", "发送语音验证码");
            this.B = r();
            ((b) c()).b(this.B, null, this.g);
            this.f32393f = false;
        }
        r.a("send_voice_verification_code", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("send_reason", String.valueOf(u())).a("send_method", str2).f31599b);
        b(0);
    }

    public void onClick(View view) {
        String str;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, x, false, 20516, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, x, false, 20516, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view2 == this.z) {
            if (!m()) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) w.b(), getResources().getString(C0906R.string.duc)).a();
            } else if (this.f32391d.b()) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) w.b(), getResources().getString(C0906R.string.dsf)).a();
            } else {
                this.f32391d.a();
                if (PatchProxy.isSupport(new Object[0], this, x, false, 20517, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, x, false, 20517, new Class[0], Void.TYPE);
                } else {
                    if (c() != null) {
                        com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("", "", false, "register", "", "注册重发验证码");
                        r.a((Context) getActivity(), "resend_click", "verification_code", w.e(), 0);
                        this.B = r();
                        ((b) c()).a(this.B, null, this.C);
                    }
                    com.ss.android.ugc.aweme.account.a.a.b bVar = new com.ss.android.ugc.aweme.account.a.a.b();
                    if (TextUtils.equals(getString(C0906R.string.bzo), this.z.getText())) {
                        str = "resend";
                    } else {
                        str = x();
                    }
                    r.a("send_sms", (Map) bVar.a("send_method", str).a("send_reason", u()).a("enter_method", this.n).a("enter_from", this.m).f31599b);
                    b(2);
                }
            }
        } else if (view2 == this.A) {
            if (!m()) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) w.b(), getResources().getString(C0906R.string.duc)).a();
            } else if (this.f32393f || !this.f32391d.b()) {
                if (!this.f32391d.b()) {
                    this.f32391d.a();
                }
                c("user_click");
            } else {
                com.bytedance.ies.dmt.ui.d.a.b((Context) w.b(), getResources().getString(C0906R.string.dsf)).a();
            }
        }
    }
}
