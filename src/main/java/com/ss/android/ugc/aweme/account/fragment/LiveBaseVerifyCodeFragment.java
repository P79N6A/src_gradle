package com.ss.android.ugc.aweme.account.fragment;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.g;
import com.ss.android.ugc.aweme.account.login.a.s;
import com.ss.android.ugc.aweme.account.login.d.b;
import com.ss.android.ugc.aweme.account.login.ui.BasePhoneNumberInputFragment;
import com.ss.android.ugc.aweme.account.login.ui.i;
import com.ss.android.ugc.aweme.account.terminal.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.w;
import java.util.Map;

public abstract class LiveBaseVerifyCodeFragment<T extends b> extends BasePhoneNumberInputFragment<T> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31904a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f31905b;

    /* renamed from: c  reason: collision with root package name */
    public i f31906c;

    /* renamed from: d  reason: collision with root package name */
    private final int f31907d = 60000;

    /* renamed from: e  reason: collision with root package name */
    private final int f31908e = 50000;

    /* renamed from: f  reason: collision with root package name */
    private final int f31909f = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    private i.b g;
    private d h;

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f31904a, false, 19907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31904a, false, 19907, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        this.f31905b.setOnClickListener(this);
        if (this.f31906c != null) {
            this.g = new i.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f31910a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f31910a, false, 19911, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f31910a, false, 19911, new Class[0], Void.TYPE);
                    } else if (LiveBaseVerifyCodeFragment.this.isViewValid()) {
                        LiveBaseVerifyCodeFragment.this.f31905b.setText(LiveBaseVerifyCodeFragment.this.getString(C0906R.string.bzo));
                    }
                }

                public final void a(long j) {
                    if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f31910a, false, 19910, new Class[]{Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f31910a, false, 19910, new Class[]{Long.TYPE}, Void.TYPE);
                    } else if (LiveBaseVerifyCodeFragment.this.isViewValid()) {
                        LiveBaseVerifyCodeFragment.this.f31905b.setText(LiveBaseVerifyCodeFragment.this.getString(C0906R.string.bzp, Long.valueOf(j / 1000)));
                    }
                }
            };
            this.f31906c.a(this.g);
        }
    }

    public String f() {
        if (!PatchProxy.isSupport(new Object[0], this, f31904a, false, 19909, new Class[0], String.class)) {
            return r();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f31904a, false, 19909, new Class[0], String.class);
    }

    public void onAttach(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f31904a, false, 19906, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f31904a, false, 19906, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        super.onAttach(activity);
        if (this.f31906c == null) {
            i iVar = new i(60000, 1000, this.g);
            this.f31906c = iVar;
        }
        this.h = com.bytedance.sdk.account.d.d.a(w.b());
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f31904a, false, 19908, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f31904a, false, 19908, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view == this.f31905b) {
            if (!m()) {
                a.b((Context) w.b(), getResources().getString(C0906R.string.duc)).a();
            } else if (this.f31906c.b()) {
                a.b((Context) w.b(), getResources().getString(C0906R.string.dsf)).a();
            } else {
                String r = r();
                r.a("send_sms", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("send_method", "auto_system").a("send_reason", g.h).a("enter_method", com.ss.android.ugc.aweme.account.login.i.f32241a).a("enter_from", com.ss.android.ugc.aweme.account.login.i.f32242b).f31599b);
                this.h.a(r, "", g.h, (com.bytedance.sdk.account.f.b.a.i) new s(this) {

                    /* renamed from: c  reason: collision with root package name */
                    public static ChangeQuickRedirect f31912c;

                    /* renamed from: a */
                    public final void g(c<k> cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f31912c, false, 19912, new Class[]{c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f31912c, false, 19912, new Class[]{c.class}, Void.TYPE);
                            return;
                        }
                        super.g(cVar);
                        f.a(0, g.h, 0, "");
                        LiveBaseVerifyCodeFragment.this.f31906c.a();
                    }

                    public final void b(c<k> cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f31912c, false, 19913, new Class[]{c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f31912c, false, 19913, new Class[]{c.class}, Void.TYPE);
                            return;
                        }
                        f.a(1, g.h, cVar.error, cVar.errorMsg);
                        if (LiveBaseVerifyCodeFragment.this.isViewValid() && !TextUtils.isEmpty(cVar.errorMsg)) {
                            a.b(LiveBaseVerifyCodeFragment.this.getContext(), cVar.errorMsg).a();
                        }
                    }
                });
            }
        }
    }
}
