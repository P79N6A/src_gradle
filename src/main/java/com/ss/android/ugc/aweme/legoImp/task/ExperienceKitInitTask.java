package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.experiencekit.b;
import com.ss.android.experiencekit.b.d;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import org.jetbrains.annotations.NotNull;

public class ExperienceKitInitTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55254, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55254, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().d().openExperienceKit) {
            a.a("ExperienceKitInitTask");
            b.b().a((Application) context);
            if (com.ss.android.ugc.aweme.g.a.a()) {
                b b2 = b.b();
                b2.f29067c = true;
                b2.a((d) new com.ss.android.experiencekit.a.a());
            }
            b.b().a(com.ss.android.experiencekit.c.a.f29087a, com.ss.android.experiencekit.c.d.BEGIN);
        }
    }
}
