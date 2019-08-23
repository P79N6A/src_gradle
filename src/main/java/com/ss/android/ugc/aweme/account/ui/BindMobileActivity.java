package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.k.a;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.ss.android.ugc.aweme.account.login.c.b;
import com.ss.android.ugc.aweme.account.login.f;
import com.ss.android.ugc.aweme.account.login.ui.o;
import com.ss.android.ugc.aweme.account.util.d;
import com.ss.android.ugc.aweme.account.util.k;
import com.ss.android.ugc.aweme.base.utils.s;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public class BindMobileActivity extends BaseBindMobileActivity {
    public static ChangeQuickRedirect v;

    /* renamed from: a  reason: collision with root package name */
    private o<OneLoginPhoneBean> f32890a;
    private boolean w;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 21109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 21109, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, v, false, 21110, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, v, false, 21110, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public Fragment b() {
        if (!PatchProxy.isSupport(new Object[0], this, v, false, 21107, new Class[0], Fragment.class)) {
            return BindMobileInputPhoneFragment.a(e());
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[0], this, v, false, 21107, new Class[0], Fragment.class);
    }

    private String f() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 21105, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 21105, new Class[0], String.class);
        }
        switch (s.b(this)) {
            case 0:
                return "";
            case 1:
                return "china_telecom";
            case 2:
                return "china_unicom";
            case 3:
                return "china_mobile";
            default:
                return "";
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 21103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 21103, new Class[0], Void.TYPE);
            return;
        }
        this.w = getIntent().getBooleanExtra(f.f32228e, false);
        if ((this.w || TextUtils.equals(this.q, "authorize_force_bind")) && k.b() && this.mStatusView != null) {
            if (PatchProxy.isSupport(new Object[0], this, v, false, 21106, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, v, false, 21106, new Class[0], Void.TYPE);
            } else {
                this.f32890a = new m(this);
                this.mStatusView.setBuilder(DmtStatusView.a.a((Context) this));
                this.mStatusView.d();
                this.u.setVisibility(4);
                b.a().a(this.f32890a);
                b.a().a(this, PushConstants.WORK_RECEIVER_EVENTCORE_ERROR, "");
            }
        } else {
            a(b());
            a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, v, false, 21104, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, v, false, 21104, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.w) {
            com.ss.android.ugc.aweme.account.a.a.b a2 = com.ss.android.ugc.aweme.account.a.a.b.a().a("enter_from", "log_in").a("platform", a.a(d.a(this.q)));
            if (z) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            r.a("phone_bundling_click", (Map) a2.a("is_one_click", str).a("carrier", f()).f31599b);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, v, false, 21102, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, v, false, 21102, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onCreate", true);
        getWindow().setSoftInputMode(0);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, BaseAccountActivity.o, false, 21039, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, BaseAccountActivity.o, false, 21039, new Class[0], Void.TYPE);
        } else if (this.mRootContainer != null) {
            this.mRootContainer.setBackgroundResource(2130838073);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onCreate", false);
    }
}
