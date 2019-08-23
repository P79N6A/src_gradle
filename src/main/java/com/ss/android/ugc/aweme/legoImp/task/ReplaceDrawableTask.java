package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import org.jetbrains.annotations.NotNull;

public class ReplaceDrawableTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55300, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55300, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("ReplaceDrawableTask");
        if (!AbTestManager.a().d().isStartReplaceResourcesGetDrawable || Build.VERSION.SDK_INT >= 26) {
            z = false;
        }
        com.ss.android.ugc.bytex.a.a.a.f4322a = z;
    }
}
