package com.ss.android.ugc.aweme.account.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.common.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.f;
import com.ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.main.h.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.w;

public abstract class BaseBindMobileActivity extends BaseAccountActivity {
    public static ChangeQuickRedirect p;
    public String q;
    public String r;
    public int s;
    public String t;
    FrameLayout u;

    public Fragment b() {
        if (!PatchProxy.isSupport(new Object[0], this, p, false, 21066, new Class[0], Fragment.class)) {
            return BindMobileInputPhoneFragment.a(e());
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[0], this, p, false, 21066, new Class[0], Fragment.class);
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 21065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 21065, new Class[0], Void.TYPE);
            return;
        }
        a(b());
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 21070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 21070, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        ((r) w.a(r.class)).a(this);
        User k = w.k();
        if (k != null && !k.isPhoneBinded()) {
            w.a(7, 2, (Object) null);
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 21069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 21069, new Class[0], Void.TYPE);
        } else if (d.a().f20314a || !w.i().isForbidSkipBindPhone() || this.q == null || !this.q.contains("third_party_") || !w.j()) {
            super.onBackPressed();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 21068, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 21068, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, null, n.f33102a, true, 21351, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, null, n.f33102a, true, 21351, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        n.e().edit().putBoolean("has_enter_bind_phone", true).apply();
    }

    public final Bundle e() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 21067, new Class[0], Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[0], this, p, false, 21067, new Class[0], Bundle.class);
        }
        ad a2 = ad.a().a("enter_from", this.q);
        if (!TextUtils.isEmpty(getIntent().getStringExtra("profile_key"))) {
            a2.a("profile_key", getIntent().getStringExtra("profile_key"));
        }
        if (TextUtils.equals(this.r, "enter_from_bind_pre_account")) {
            a2.a("type", 5);
            a2.a("proaccount_switch_type", this.s);
            a2.a("proaccount_category", this.t);
        } else {
            a2.a("type", getIntent().getIntExtra("type", 2));
        }
        return a2.f75487b;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, p, false, 21064, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, p, false, 21064, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.u = (FrameLayout) findViewById(C0906R.id.aic);
        this.q = getIntent().getStringExtra(f.f32229f);
        this.r = getIntent().getStringExtra(f.g);
        this.s = getIntent().getIntExtra(f.h, 0);
        this.t = getIntent().getStringExtra(f.i);
        if (TextUtils.equals(this.r, "enter_from_bind_pre_account")) {
            this.u.setBackground(ContextCompat.getDrawable(this, C0906R.color.bn));
        }
        AccountOpeModel accountOpeModel = (AccountOpeModel) ViewModelProviders.of((FragmentActivity) this).get(AccountOpeModel.class);
        accountOpeModel.f32738a.observe(this, new h(this));
        accountOpeModel.f32739b.observe(this, new i(this));
        d();
    }
}
