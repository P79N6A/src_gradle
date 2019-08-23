package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.sysoptimizer.DvmOptimizer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import org.jetbrains.annotations.NotNull;

public class DvmLinearAllocOptTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55251, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55251, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            if (g.b().br().booleanValue()) {
                return;
            }
        } catch (Exception unused) {
        }
        a.a("DvmLinearAllocOptTask");
        DvmOptimizer.optDvmLinearAllocBuffer();
    }
}
