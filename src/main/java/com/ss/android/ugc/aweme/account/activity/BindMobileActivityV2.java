package com.ss.android.ugc.aweme.account.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.fragment.BindMobileInputPhoneFragmentV2;
import com.ss.android.ugc.aweme.account.ui.BindMobileActivity;
import com.ss.android.ugc.aweme.utils.ad;

public class BindMobileActivityV2 extends BindMobileActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31607a;

    public final int a() {
        return C0906R.layout.cp;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f31607a, false, 19544, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f31607a, false, 19544, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f31607a, false, 19545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31607a, false, 19545, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f31607a, false, 19546, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f31607a, false, 19546, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final Fragment b() {
        if (PatchProxy.isSupport(new Object[0], this, f31607a, false, 19543, new Class[0], Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[0], this, f31607a, false, 19543, new Class[0], Fragment.class);
        }
        ad a2 = ad.a().a("enter_from", this.q).a("type", getIntent().getIntExtra("type", 2));
        if (!TextUtils.isEmpty(getIntent().getStringExtra("profile_key"))) {
            a2.a("profile_key", getIntent().getStringExtra("profile_key"));
        }
        BindMobileInputPhoneFragmentV2 bindMobileInputPhoneFragmentV2 = new BindMobileInputPhoneFragmentV2();
        bindMobileInputPhoneFragmentV2.setArguments(a2.f75487b);
        return bindMobileInputPhoneFragmentV2;
    }
}
