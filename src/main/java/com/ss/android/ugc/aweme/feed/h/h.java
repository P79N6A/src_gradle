package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45495a;

    /* renamed from: b  reason: collision with root package name */
    private final g f45496b;

    h(g gVar) {
        this.f45496b = gVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f45495a, false, 42035, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f45495a, false, 42035, new Class[0], Object.class);
        }
        g gVar = this.f45496b;
        if (gVar.getItems() != null && gVar.g.f44640b + 1 < gVar.getItems().size()) {
            gVar.getItems().subList(0, gVar.g.f44640b + 1).clear();
            gVar.g.f44640b = 0;
        }
        AbTestManager a2 = AbTestManager.a();
        long j = 0;
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 72003, new Class[0], Long.TYPE)) {
            j = ((Long) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 72003, new Class[0], Long.TYPE)).longValue();
        } else if (a.a()) {
            AbTestModel d2 = a2.d();
            if (d2 != null && d2.enableFeedRefreshFromCache) {
                j = (long) (d2.feedRefreshAnimDuration * 1000.0d);
            }
        }
        Thread.sleep(j);
        return gVar.mData;
    }
}
