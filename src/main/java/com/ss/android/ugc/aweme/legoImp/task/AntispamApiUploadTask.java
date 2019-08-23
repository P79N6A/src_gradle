package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import org.jetbrains.annotations.NotNull;

public class AntispamApiUploadTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 55242, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 55242, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("AntispamApiUploadTask");
        if (com.ss.android.g.a.a() && b.b().b(context2, "is_first_install", true)) {
            com.ss.android.ugc.aweme.sec.a.a("install");
            b.b().a(context2, "is_first_install", false);
        }
        com.ss.android.ugc.aweme.sec.a.a("cold_start");
    }
}
