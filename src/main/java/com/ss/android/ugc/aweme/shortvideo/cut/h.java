package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66460a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66461b;

    h(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66461b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66460a, false, 75447, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66460a, false, 75447, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66461b;
        if (PatchProxy.isSupport(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75421, new Class[0], Void.TYPE);
            return;
        }
        cutMultiVideoActivity.b(false);
        if (PatchProxy.isSupport(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75426, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75426, new Class[0], Void.TYPE);
        } else {
            cutMultiVideoActivity.textureView.setRotation(0.0f);
            cutMultiVideoActivity.textureView.setScaleX(1.0f);
            cutMultiVideoActivity.textureView.setScaleY(1.0f);
            com.ss.android.ugc.aweme.shortvideo.cut.model.h hVar = cutMultiVideoActivity.v.c().get(cutMultiVideoActivity.t);
            if (cutMultiVideoActivity.w != null) {
                cutMultiVideoActivity.w.setSegSpeed(cutMultiVideoActivity.s, (double) hVar.f66499f);
                CutMultiVideoViewModel cutMultiVideoViewModel = cutMultiVideoActivity.u;
                String str = hVar.f66495b;
                if (PatchProxy.isSupport(new Object[]{str}, cutMultiVideoViewModel, CutMultiVideoViewModel.f66179a, false, 75491, new Class[]{String.class}, Boolean.TYPE)) {
                    CutMultiVideoViewModel cutMultiVideoViewModel2 = cutMultiVideoViewModel;
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, cutMultiVideoViewModel2, CutMultiVideoViewModel.f66179a, false, 75491, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    z = cutMultiVideoViewModel.f66181c.containsKey(str);
                }
                if (!z) {
                    cutMultiVideoActivity.w.setSegBoundary(cutMultiVideoActivity.s, 0, hVar.f66496c);
                }
            }
        }
        cutMultiVideoActivity.c();
        if (cutMultiVideoActivity.w != null) {
            cutMultiVideoActivity.w.unSelect();
            Pair<Long, Long> multiVideoPlayBoundary = cutMultiVideoActivity.videoEditView.getMultiVideoPlayBoundary();
            cutMultiVideoActivity.w.setBoundary(((Long) multiVideoPlayBoundary.first).longValue(), ((Long) multiVideoPlayBoundary.second).longValue());
            cutMultiVideoActivity.w.setSpeed((double) cutMultiVideoActivity.v.d());
            cutMultiVideoActivity.w.seek(cutMultiVideoActivity.videoEditView.getMultiSeekTime());
        }
        cutMultiVideoActivity.a(false);
    }
}
