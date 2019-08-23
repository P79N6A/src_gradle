package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class LogMainTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long launchTime = k.f();
    private long time = System.currentTimeMillis();

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55273, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55273, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("LogMainTask");
        if (this.launchTime > 0) {
            JSONObject a2 = new t().a("duration", String.valueOf(this.time - this.launchTime)).a();
            r.onEvent(MobClick.obtain().setEventName("load_main").setLabelName("perf_monitor").setExtValueLong(this.time - this.launchTime).setJsonObject(a2));
            r.a("load_main", a2);
        }
    }
}
