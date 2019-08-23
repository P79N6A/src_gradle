package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.support.v4.content.PermissionChecker;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class ScreenshotActivityLifeCycleTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55301, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55301, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("ScreenshotActivityLifeCycleTask");
        k a2 = k.a();
        if (PermissionChecker.checkSelfPermission(a2, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            a2.registerActivityLifecycleCallbacks(new com.ss.android.ugc.aweme.ah.a(a2));
        } else {
            r.a("screenshot_no_permission", (Map) d.a().f34114b);
        }
    }
}
