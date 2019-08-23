package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66401a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66402b;

    e(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66402b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66401a, false, 75444, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66401a, false, 75444, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66402b;
        if (PatchProxy.isSupport(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75405, new Class[0], Void.TYPE);
            return;
        }
        if (cutMultiVideoActivity.w != null) {
            if (cutMultiVideoActivity.z == 2) {
                Pair<Long, Long> singleVideoPlayBoundary = cutMultiVideoActivity.videoEditView.getSingleVideoPlayBoundary();
                cutMultiVideoActivity.w.setSegBoundary(cutMultiVideoActivity.s, ((Long) singleVideoPlayBoundary.first).longValue(), ((Long) singleVideoPlayBoundary.second).longValue());
                cutMultiVideoActivity.w.seek(cutMultiVideoActivity.videoEditView.getSinglePlayingPosition());
                return;
            }
            Pair<Long, Long> multiVideoPlayBoundary = cutMultiVideoActivity.videoEditView.getMultiVideoPlayBoundary();
            if (cutMultiVideoActivity.z == 0) {
                cutMultiVideoActivity.w.setSegBoundary(0, ((Long) multiVideoPlayBoundary.first).longValue(), ((Long) multiVideoPlayBoundary.second).longValue());
            } else {
                cutMultiVideoActivity.w.setBoundary(((Long) multiVideoPlayBoundary.first).longValue(), ((Long) multiVideoPlayBoundary.second).longValue());
            }
            cutMultiVideoActivity.w.seek(cutMultiVideoActivity.videoEditView.getMultiPlayingPosition());
        }
    }
}
