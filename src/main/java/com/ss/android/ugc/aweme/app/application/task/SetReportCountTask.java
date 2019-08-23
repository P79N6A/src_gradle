package com.ss.android.ugc.aweme.app.application.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.net.a.j;
import org.jetbrains.annotations.NotNull;

public class SetReportCountTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 23292, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 23292, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("SetReportCountTask");
        int i = 1024;
        try {
            i = g.b().aE().intValue();
        } catch (Exception unused) {
        }
        if (j.a() != null) {
            j.a().r = i;
        }
    }
}
