package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class d implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33522a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeLockOptionsFragment f33523b;

    d(TimeLockOptionsFragment timeLockOptionsFragment) {
        this.f33523b = timeLockOptionsFragment;
    }

    public final void OnSettingItemClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33522a, false, 21981, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33522a, false, 21981, new Class[]{View.class}, Void.TYPE);
            return;
        }
        TimeLockOptionsFragment timeLockOptionsFragment = this.f33523b;
        timeLockOptionsFragment.f33501b.setChecked(true ^ timeLockOptionsFragment.f33501b.a());
        timeLockOptionsFragment.f33503d.setTimeLockOn(timeLockOptionsFragment.f33501b.a());
        r.a("switch_time_lock", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("to_status", timeLockOptionsFragment.f33501b.a() ? "on" : "off").f34114b);
        TimeLockRuler.applyUserSetting(timeLockOptionsFragment.f33503d);
    }
}
