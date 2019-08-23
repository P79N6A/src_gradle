package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import org.jetbrains.annotations.NotNull;

public class VideoCachePreloaderInitTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    @MeasureFunction
    private void initVideoLoader() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55328, new Class[0], Void.TYPE);
            return;
        }
        g.f().a();
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55327, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55327, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("VideoCachePreloaderInitTask");
        initVideoLoader();
    }
}
