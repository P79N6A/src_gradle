package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66462a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66463b;

    i(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66463b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66462a, false, 75448, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66462a, false, 75448, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66463b;
        if (PatchProxy.isSupport(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75422, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75422, new Class[0], Void.TYPE);
            return;
        }
        cutMultiVideoActivity.b(false);
        cutMultiVideoActivity.c();
        cutMultiVideoActivity.w.unSelect();
        Pair<Long, Long> multiVideoPlayBoundary = cutMultiVideoActivity.videoEditView.getMultiVideoPlayBoundary();
        cutMultiVideoActivity.w.setBoundary(((Long) multiVideoPlayBoundary.first).longValue(), ((Long) multiVideoPlayBoundary.second).longValue());
        cutMultiVideoActivity.w.setSpeed((double) cutMultiVideoActivity.v.d());
        cutMultiVideoActivity.w.setSegRotation(cutMultiVideoActivity.s, cutMultiVideoActivity.v.c(cutMultiVideoActivity.t).k);
        cutMultiVideoActivity.textureView.setRotation(0.0f);
        cutMultiVideoActivity.textureView.setScaleY(1.0f);
        cutMultiVideoActivity.textureView.setScaleX(1.0f);
        cutMultiVideoActivity.w.seek(cutMultiVideoActivity.videoEditView.getMultiSeekTime());
        cutMultiVideoActivity.a(false);
    }
}
