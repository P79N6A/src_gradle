package com.ss.android.ugc.aweme.base.component;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.story.api.j;

public final /* synthetic */ class h implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34723a;

    /* renamed from: b  reason: collision with root package name */
    private final g f34724b;

    h(g gVar) {
        this.f34724b = gVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f34723a, false, 24605, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f34723a, false, 24605, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        g gVar = this.f34724b;
        j jVar = (j) obj;
        if (jVar != null && jVar.f71843e == 4) {
            if (PatchProxy.isSupport(new Object[]{jVar}, gVar, g.f34719a, false, 24603, new Class[]{j.class}, Void.TYPE)) {
                g gVar2 = gVar;
                PatchProxy.accessDispatch(new Object[]{jVar}, gVar2, g.f34719a, false, 24603, new Class[]{j.class}, Void.TYPE);
                return;
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).storySettingService().setFirstPublishSuccStatus();
            if (!(jVar.g == null || jVar.g.getLifeActivityInfo() == null || jVar.g.getLifeActivityInfo().getCardType() <= 0 || g.f34720d == jVar.g || gVar.f34721b.isFinishing())) {
                g.f34720d = jVar.g;
            }
        }
    }
}
