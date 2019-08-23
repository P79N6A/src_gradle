package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeLockFragmentFactory;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public class TimeLockConfirmFragment extends AbsTimeLockSettingFragment {
    public static ChangeQuickRedirect i;
    ViewGroup j;
    ViewGroup k;
    DmtTextView l;
    private String m;

    public final int a() {
        return C0906R.string.ckc;
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, i, false, 21974, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, i, false, 21974, new Class[]{String.class}, Void.TYPE);
        } else if (!this.m.equals(str)) {
            a.b(getContext(), (int) C0906R.string.ckb).a();
        } else {
            TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
            TimeLockUserSetting timeLockUserSetting = new TimeLockUserSetting();
            timeLockUserSetting.setUserId(d.a().getCurUserId());
            timeLockUserSetting.setLastSetTime(System.currentTimeMillis());
            timeLockUserSetting.setPassword(str);
            if (userSetting == null) {
                timeLockUserSetting.setTimeLockOn(false);
                timeLockUserSetting.setContentFilterOn(false);
            } else {
                timeLockUserSetting.setTimeLockOn(userSetting.isTimeLockOn());
                timeLockUserSetting.setContentFilterOn(userSetting.isContentFilterOn());
            }
            TimeLockRuler.applyUserSetting(timeLockUserSetting);
            r.onEvent(MobClick.obtain().setEventName("time_lock_on").setLabelName("set"));
            if (!this.f33490f) {
                r.a("open_teen_protection_finish", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
            }
            a.a(getContext(), (int) C0906R.string.ck_).a();
            int backStackEntryCount = getActivity().getSupportFragmentManager().getBackStackEntryCount();
            a((View) this.f2607b);
            for (int i2 = 0; i2 < backStackEntryCount; i2++) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
            ((SetTimeLockActivity) getActivity()).a(TimeLockFragmentFactory.c(b()));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, i, false, 21972, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, i, false, 21972, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.m = getArguments().getString("password");
        this.j = (ViewGroup) view.findViewById(C0906R.id.chu);
        this.k = (ViewGroup) view.findViewById(C0906R.id.d3v);
        if (com.ss.android.g.a.b()) {
            this.j.setBackgroundColor(getResources().getColor(C0906R.color.a25));
            this.k.setBackgroundColor(getResources().getColor(C0906R.color.a17));
        }
        this.l = (DmtTextView) view.findViewById(C0906R.id.cx6);
        if (com.ss.android.g.a.a()) {
            this.l.setText(C0906R.string.ckc);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 21971, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.q8, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 21971, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
