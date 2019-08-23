package com.ss.android.ugc.aweme.discover.mixfeed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel$SearchStateListener$$CC;

public final /* synthetic */ class d implements SearchStateViewModel.SearchStateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42573a;

    /* renamed from: b  reason: collision with root package name */
    private final c f42574b;

    d(c cVar) {
        this.f42574b = cVar;
    }

    public final void onPageHidden() {
        if (PatchProxy.isSupport(new Object[0], this, f42573a, false, 36861, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42573a, false, 36861, new Class[0], Void.TYPE);
            return;
        }
        SearchStateViewModel$SearchStateListener$$CC.onPageHidden(this);
    }

    public final void onPageResume() {
        if (PatchProxy.isSupport(new Object[0], this, f42573a, false, 36862, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42573a, false, 36862, new Class[0], Void.TYPE);
            return;
        }
        SearchStateViewModel$SearchStateListener$$CC.onPageResume(this);
    }

    public final void onContentVisible(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42573a, false, 36860, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42573a, false, 36860, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c cVar = this.f42574b;
        if (z) {
            ((e) cVar.f2979f).o();
            return;
        }
        e eVar = (e) cVar.f2979f;
        if (PatchProxy.isSupport(new Object[0], eVar, e.f42575a, false, 36885, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], eVar, e.f42575a, false, 36885, new Class[0], Void.TYPE);
        } else if (eVar.j != null) {
            ((SearchMixFeedAdapter) eVar.j).A_();
        }
        ((e) cVar.f2979f).n();
    }
}
