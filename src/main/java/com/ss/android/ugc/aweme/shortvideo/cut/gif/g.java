package com.ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66457a;

    /* renamed from: b  reason: collision with root package name */
    private final Video2GifCutFragment f66458b;

    g(Video2GifCutFragment video2GifCutFragment) {
        this.f66458b = video2GifCutFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66457a, false, 75826, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66457a, false, 75826, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Video2GifCutFragment video2GifCutFragment = this.f66458b;
        if (PatchProxy.isSupport(new Object[0], video2GifCutFragment, Video2GifCutFragment.f66407a, false, 75810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], video2GifCutFragment, Video2GifCutFragment.f66407a, false, 75810, new Class[0], Void.TYPE);
            return;
        }
        Pair<Long, Long> singleVideoPlayBoundary = video2GifCutFragment.videoEditView.getSingleVideoPlayBoundary();
        if (!(singleVideoPlayBoundary == null || singleVideoPlayBoundary.first == null || singleVideoPlayBoundary.second == null)) {
            video2GifCutFragment.f66409c.f3566c.a(((Long) singleVideoPlayBoundary.first).longValue(), ((Long) singleVideoPlayBoundary.second).longValue());
            video2GifCutFragment.f66409c.f3566c.a(video2GifCutFragment.videoEditView.getSinglePlayingPosition());
        }
    }
}
