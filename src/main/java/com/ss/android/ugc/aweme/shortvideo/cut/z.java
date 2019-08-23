package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class z implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66612a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66613b;

    z(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66613b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66612a, false, 75465, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66612a, false, 75465, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66613b;
        if (PatchProxy.isSupport(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75403, new Class[0], Void.TYPE);
            return;
        }
        if (cutMultiVideoActivity.w != null) {
            cutMultiVideoActivity.w.seekRight(((Long) cutMultiVideoActivity.videoEditView.getPlayBoundary().second).longValue());
            cutMultiVideoActivity.a();
        }
    }
}
