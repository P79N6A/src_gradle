package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66403a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66404b;

    f(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66404b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66403a, false, 75445, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66403a, false, 75445, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66404b;
        Float f2 = (Float) obj;
        if (cutMultiVideoActivity.w != null) {
            if (cutMultiVideoActivity.z == 1) {
                cutMultiVideoActivity.w.setSpeed((double) f2.floatValue());
                Pair<Long, Long> multiVideoPlayBoundary = cutMultiVideoActivity.videoEditView.getMultiVideoPlayBoundary();
                cutMultiVideoActivity.w.setBoundary(((Long) multiVideoPlayBoundary.first).longValue(), ((Long) multiVideoPlayBoundary.second).longValue());
                cutMultiVideoActivity.w.seek(cutMultiVideoActivity.videoEditView.getMultiSeekTime());
            } else {
                cutMultiVideoActivity.w.setSegSpeed(cutMultiVideoActivity.s, (double) (f2.floatValue() * cutMultiVideoActivity.v.d()));
                Pair<Long, Long> singleVideoPlayBoundary = cutMultiVideoActivity.videoEditView.getSingleVideoPlayBoundary();
                cutMultiVideoActivity.w.setSegBoundary(cutMultiVideoActivity.s, ((Long) singleVideoPlayBoundary.first).longValue(), ((Long) singleVideoPlayBoundary.second).longValue());
                cutMultiVideoActivity.w.seek(cutMultiVideoActivity.videoEditView.getSingleSeekTime());
            }
            cutMultiVideoActivity.a();
        }
    }
}
