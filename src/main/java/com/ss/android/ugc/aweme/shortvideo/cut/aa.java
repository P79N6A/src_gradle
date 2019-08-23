package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aa implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66338a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66339b;

    aa(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66339b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66338a, false, 75466, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66338a, false, 75466, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66339b;
        if (PatchProxy.isSupport(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75404, new Class[0], Void.TYPE);
            return;
        }
        if (cutMultiVideoActivity.w != null) {
            cutMultiVideoActivity.w.seekLeft(((Long) cutMultiVideoActivity.videoEditView.getPlayBoundary().first).longValue());
            cutMultiVideoActivity.a();
        }
    }
}
