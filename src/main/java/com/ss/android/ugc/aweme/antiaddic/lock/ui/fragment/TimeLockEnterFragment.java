package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeLockFragmentFactory;

public class TimeLockEnterFragment extends AbsTimeLockSettingFragment {
    public static ChangeQuickRedirect i;

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, i, false, 21976, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, i, false, 21976, new Class[]{String.class}, Void.TYPE);
            return;
        }
        TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
        if (str == null || userSetting == null || !str.equals(userSetting.getPassword())) {
            a.b(getContext(), (int) C0906R.string.cla).a();
            return;
        }
        a((View) this.f2607b);
        FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.remove(this);
        beginTransaction.commit();
        supportFragmentManager.popBackStack();
        ((SetTimeLockActivity) getActivity()).a(TimeLockFragmentFactory.c(b()));
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 21975, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.q4, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 21975, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
