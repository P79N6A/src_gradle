package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.utils.cy;
import org.jetbrains.annotations.NotNull;

public class CheckNoticeTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        String str;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55246, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55246, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("CheckNoticeTask");
        Boolean valueOf = Boolean.valueOf(cy.a(k.a()));
        k a2 = k.a();
        if (valueOf.booleanValue()) {
            str = "allow_on";
        } else {
            str = "allow_off";
        }
        com.ss.android.common.lib.a.a(a2, "notice", str);
    }
}
