package com.ss.android.ugc.aweme.legoImp.task;

import a.i;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.x;
import java.util.ArrayList;
import org.greenrobot.eventbus.d;
import org.jetbrains.annotations.NotNull;

public class EventBusInstallTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55252, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55252, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("EventBusInstallTask");
        if (PatchProxy.isSupport(new Object[0], null, b.f53146a, true, 55253, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, b.f53146a, true, 55253, new Class[0], Void.TYPE);
            return;
        }
        try {
            d dVar = new d();
            x xVar = new x();
            if (dVar.j == null) {
                dVar.j = new ArrayList();
            }
            dVar.j.add(xVar);
            dVar.i = i.f1051a;
            dVar.b();
        } catch (Exception unused) {
        }
    }
}
