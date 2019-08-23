package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class e implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33524a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeLockOptionsFragment f33525b;

    e(TimeLockOptionsFragment timeLockOptionsFragment) {
        this.f33525b = timeLockOptionsFragment;
    }

    public final void OnSettingItemClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33524a, false, 21982, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33524a, false, 21982, new Class[]{View.class}, Void.TYPE);
            return;
        }
        TimeLockOptionsFragment timeLockOptionsFragment = this.f33525b;
        timeLockOptionsFragment.f33502c.setChecked(true ^ timeLockOptionsFragment.f33502c.a());
        timeLockOptionsFragment.f33503d.setContentFilterOn(timeLockOptionsFragment.f33502c.a());
        r.a("switch_teen_mode", (Map) d.a().a("to_status", timeLockOptionsFragment.f33502c.a() ? "on" : "off").f34114b);
        TimeLockRuler.applyUserSetting(timeLockOptionsFragment.f33503d);
    }
}
