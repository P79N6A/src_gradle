package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;

public final /* synthetic */ class j implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66464a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66465b;

    j(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66465b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66464a, false, 75449, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66464a, false, 75449, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66465b;
        h hVar = (h) obj;
        if (PatchProxy.isSupport(new Object[]{hVar}, cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75420, new Class[]{h.class}, Void.TYPE)) {
            CutMultiVideoActivity cutMultiVideoActivity2 = cutMultiVideoActivity;
            PatchProxy.accessDispatch(new Object[]{hVar}, cutMultiVideoActivity2, CutMultiVideoActivity.f66139a, false, 75420, new Class[]{h.class}, Void.TYPE);
            return;
        }
        cutMultiVideoActivity.b(false);
        if (cutMultiVideoActivity.w != null) {
            cutMultiVideoActivity.w.pause();
        }
        if (cutMultiVideoActivity.textureView != null) {
            cutMultiVideoActivity.textureView.setRotation(0.0f);
            cutMultiVideoActivity.textureView.setScaleX(1.0f);
            cutMultiVideoActivity.textureView.setScaleY(1.0f);
        }
        if (cutMultiVideoActivity.f66144f.getItemCount() == 1) {
            cutMultiVideoActivity.e();
            cutMultiVideoActivity.finish();
            return;
        }
        cutMultiVideoActivity.w.deleteSeg(cutMultiVideoActivity.s);
        cutMultiVideoActivity.c();
        cutMultiVideoActivity.w.unSelect();
        Pair<Long, Long> multiVideoPlayBoundary = cutMultiVideoActivity.videoEditView.getMultiVideoPlayBoundary();
        cutMultiVideoActivity.w.setBoundary(((Long) multiVideoPlayBoundary.first).longValue(), ((Long) multiVideoPlayBoundary.second).longValue());
        cutMultiVideoActivity.w.setSpeed((double) cutMultiVideoActivity.v.d());
        cutMultiVideoActivity.w.seek(cutMultiVideoActivity.videoEditView.getMultiSeekTime());
        cutMultiVideoActivity.a(true);
    }
}
