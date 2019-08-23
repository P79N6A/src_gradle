package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.anrmonitor.ANRError;
import com.ss.android.anrmonitor.a;
import com.ss.android.ugc.aweme.common.h.c;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import org.jetbrains.annotations.NotNull;

public class AnrTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    static final /* synthetic */ void lambda$run$0$AnrTask(ANRError aNRError) {
        if (a.a()) {
            throw aNRError;
        }
    }

    public void run(@NotNull Context context) {
        int i;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55240, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55240, new Class[]{Context.class}, Void.TYPE);
        } else if (a.a() && !c.a()) {
            com.ss.android.ugc.aweme.framework.a.a.a("AnrTask");
            if (!com.ss.android.ugc.aweme.q.c.a(com.ss.android.ugc.aweme.framework.e.a.a(), "test_data", 0).getBoolean("sp_key_enable_anr", false)) {
                try {
                    Class.forName("butterknife.RConverter");
                } catch (ClassNotFoundException unused) {
                }
                if (Build.VERSION.SDK_INT <= 19) {
                    i = 50000;
                } else {
                    i = 10000;
                }
                com.ss.android.anrmonitor.a aVar = new com.ss.android.anrmonitor.a(i);
                a.C0327a aVar2 = a.f53145b;
                if (aVar2 == null) {
                    aVar.f27931a = com.ss.android.anrmonitor.a.f27930c;
                } else {
                    aVar.f27931a = aVar2;
                }
                aVar.start();
            }
        }
    }
}
