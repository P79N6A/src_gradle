package com.ss.android.ugc.aweme.story.app;

import android.app.Application;
import android.support.annotation.Keep;
import com.bytedance.ies.dmt.ui.common.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.api.h;
import com.ss.android.ugc.aweme.story.api.i;
import com.ss.android.ugc.aweme.story.app.a;
import kotlin.jvm.internal.Intrinsics;

@Keep
public class StoryInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void init(Application application) {
        Application application2 = application;
        if (PatchProxy.isSupport(new Object[]{application2}, this, changeQuickRedirect, false, 82159, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application2}, this, changeQuickRedirect, false, 82159, new Class[]{Application.class}, Void.TYPE);
            return;
        }
        a a2 = a.a();
        if (PatchProxy.isSupport(new Object[]{application2}, a2, a.f71863a, false, 82160, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application2}, a2, a.f71863a, false, 82160, new Class[]{Application.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(application2, "application");
        a2.f71866b = application2;
        d.a().a(false, false);
        if (PatchProxy.isSupport(new Object[0], a2, a.f71863a, false, 82161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, a.f71863a, false, 82161, new Class[0], Void.TYPE);
            return;
        }
        ServiceManager.get().bind(i.class, a.c.f71870b).asSingleton();
        ServiceManager.get().bind(h.class, a.d.f71872b).asSingleton();
    }
}
