package com.ss.android.ugc.aweme.account.fragment;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.activity.SelectCountryActivity;
import com.ss.android.ugc.aweme.account.login.ui.CountryListActivity;
import com.ss.android.ugc.aweme.w;

public class BindMobileInputPhoneFragmentV2 extends BaseBindMobileInputPhoneFragmentV2 {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f31903c;

    public final void d() {
        Class cls;
        if (PatchProxy.isSupport(new Object[0], this, f31903c, false, 19905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31903c, false, 19905, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            FragmentActivity activity2 = getActivity();
            if (w.i().getdUseNewLoginStyle() == 1) {
                cls = SelectCountryActivity.class;
            } else {
                cls = CountryListActivity.class;
            }
            activity.startActivity(new Intent(activity2, cls));
        }
    }
}
