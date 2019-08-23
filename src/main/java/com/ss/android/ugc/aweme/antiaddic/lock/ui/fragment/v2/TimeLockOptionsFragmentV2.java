package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.c;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockAboutFragmentV2;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.widget.TimeLockDesc;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public class TimeLockOptionsFragmentV2 extends AbsOptionsFragmentV2 {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f33586f;
    private TimeLockDesc g;
    private TimeLockDesc h;
    private TimeLockDesc i;
    private int j;

    public final int a() {
        return C0906R.layout.qx;
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f33586f, false, 22077, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33586f, false, 22077, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!c.f33443d.e()) {
            return false;
        } else {
            c cVar = c.f33443d;
            FragmentActivity activity = getActivity();
            if (PatchProxy.isSupport(new Object[]{activity}, cVar, c.f33440a, false, 21780, new Class[]{FragmentActivity.class}, Void.TYPE)) {
                c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{activity}, cVar2, c.f33440a, false, 21780, new Class[]{FragmentActivity.class}, Void.TYPE);
            } else {
                TeenageModeSetting teenageModeSetting = c.f33441b;
                if (teenageModeSetting != null) {
                    teenageModeSetting.setTimeLockSelfInMin(0);
                }
                r.a("close_time_lock_finish", (Map) d.a().f34114b);
                a.a(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.cke).a();
                if (activity != null) {
                    com.ss.android.ugc.aweme.antiaddic.lock.d.b(activity, 0);
                }
                cVar.a(c.f33441b);
            }
            return true;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33586f, false, 22074, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33586f, false, 22074, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.g = (TimeLockDesc) view.findViewById(C0906R.id.d2z);
        this.h = (TimeLockDesc) view.findViewById(C0906R.id.d30);
        this.i = (TimeLockDesc) view.findViewById(C0906R.id.d2y);
        TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
        if (c() || userSetting != null || c.f33443d.e()) {
            if (c()) {
                i2 = ((TimeLockAboutFragmentV2.a) ((TimeLockOptionViewModel) ViewModelProviders.of(getActivity()).get(TimeLockOptionViewModel.class)).f33618a.getValue()).f33584b;
            } else if (c.f33443d.e()) {
                i2 = c.f33443d.c();
            } else {
                i2 = userSetting.getLockTimeInMin();
            }
            this.j = i2;
            this.g.setText(getString(C0906R.string.cjz, Integer.valueOf(this.j)));
            this.h.setText(getString(C0906R.string.ck0, Integer.valueOf(this.j)));
            this.f33554c.setOnClickListener(new f(this));
            if (c()) {
                if (PatchProxy.isSupport(new Object[0], this, f33586f, false, 22075, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f33586f, false, 22075, new Class[0], Void.TYPE);
                    return;
                }
                this.f33553b.setText(getString(C0906R.string.aj1));
                this.g.setText(getString(C0906R.string.bl8, Integer.valueOf(this.j)));
                this.h.setText(getString(C0906R.string.bl9, Integer.valueOf(this.j)));
                this.i.setVisibility(0);
                this.i.setText(getString(C0906R.string.bl7));
                this.f33554c.setText(getString(C0906R.string.blc));
            }
        }
    }
}
