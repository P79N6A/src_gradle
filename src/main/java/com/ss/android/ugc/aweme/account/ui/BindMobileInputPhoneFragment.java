package com.ss.android.ugc.aweme.account.ui;

import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.ad;

public class BindMobileInputPhoneFragment extends BaseBindMobileInputPhoneFragment {
    public static ChangeQuickRedirect A;

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 21114, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 21114, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        if (this.g == 2) {
            this.u.postDelayed(new n(this), 500);
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 21115, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 21115, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.g == 2 && this.u != null) {
            a((View) this.u);
        }
    }

    public static BindMobileInputPhoneFragment a(Bundle bundle) {
        Bundle bundle2;
        if (PatchProxy.isSupport(new Object[]{bundle}, null, A, true, 21113, new Class[]{Bundle.class}, BindMobileInputPhoneFragment.class)) {
            return (BindMobileInputPhoneFragment) PatchProxy.accessDispatch(new Object[]{bundle}, null, A, true, 21113, new Class[]{Bundle.class}, BindMobileInputPhoneFragment.class);
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        BindMobileInputPhoneFragment bindMobileInputPhoneFragment = new BindMobileInputPhoneFragment();
        bindMobileInputPhoneFragment.setArguments(bundle2);
        return bindMobileInputPhoneFragment;
    }

    public static BindMobileInputPhoneFragment a(String str, int i) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, A, true, 21112, new Class[]{String.class, Integer.TYPE}, BindMobileInputPhoneFragment.class)) {
            return a(ad.a().a("type", i).a("enter_from", str2).f75487b);
        }
        return (BindMobileInputPhoneFragment) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, A, true, 21112, new Class[]{String.class, Integer.TYPE}, BindMobileInputPhoneFragment.class);
    }
}
