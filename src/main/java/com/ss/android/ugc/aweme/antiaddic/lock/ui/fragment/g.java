package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.content.DialogInterface;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33528a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeLockOptionsFragment f33529b;

    g(TimeLockOptionsFragment timeLockOptionsFragment) {
        this.f33529b = timeLockOptionsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33528a, false, 21984, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33528a, false, 21984, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        TimeLockOptionsFragment timeLockOptionsFragment = this.f33529b;
        TimeLockRuler.removeUserSetting();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
            a.a(timeLockOptionsFragment.getContext(), (int) C0906R.string.ck3).a();
            r.onEvent(MobClick.obtain().setEventName("time_lock_off").setLabelName("set"));
            r.a("close_teen_protection", (Map) d.a().f34114b);
        }
        timeLockOptionsFragment.getActivity().finish();
    }
}
