package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import org.jetbrains.annotations.NotNull;

public class MobLaunchEventTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long duration;
    private boolean isFirstStart;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    public void run(@NotNull Context context) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55275, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55275, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("MobLaunchEventTask");
        if (this.isFirstStart) {
            str = "first_launch_time";
        } else {
            str = "launch_time";
        }
        n.a("aweme_app_performance", str, (float) this.duration);
        MobClick obtain = MobClick.obtain();
        if (this.isFirstStart) {
            str2 = "first_launch_time";
        } else {
            str2 = "launch_time";
        }
        r.onEvent(obtain.setEventName(str2).setLabelName("perf_monitor").setExtValueLong(this.duration));
    }

    public MobLaunchEventTask(boolean z, long j) {
        this.isFirstStart = z;
        this.duration = j;
    }
}
