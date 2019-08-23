package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import org.jetbrains.annotations.NotNull;

public class PreloadInstanceForAllProcessTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    private void preloadInstance(Object obj) {
    }

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    @MeasureFunction
    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55292, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55292, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("PreloadInstanceForAllProcessTask");
        preloadInstance(context.getSystemService("phone"));
        preloadInstance(context.getSystemService("notification"));
    }
}
