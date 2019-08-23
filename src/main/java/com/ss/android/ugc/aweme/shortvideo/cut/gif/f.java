package com.ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66455a;

    /* renamed from: b  reason: collision with root package name */
    private final Video2GifCutFragment f66456b;

    f(Video2GifCutFragment video2GifCutFragment) {
        this.f66456b = video2GifCutFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66455a, false, 75825, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66455a, false, 75825, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Video2GifCutFragment video2GifCutFragment = this.f66456b;
        if (PatchProxy.isSupport(new Object[0], video2GifCutFragment, Video2GifCutFragment.f66407a, false, 75809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], video2GifCutFragment, Video2GifCutFragment.f66407a, false, 75809, new Class[0], Void.TYPE);
            return;
        }
        if (!(video2GifCutFragment.videoEditView.getPlayBoundary() == null || video2GifCutFragment.videoEditView.getPlayBoundary().first == null)) {
            video2GifCutFragment.f66409c.f3566c.b(((Long) video2GifCutFragment.videoEditView.getPlayBoundary().first).longValue());
            video2GifCutFragment.a();
        }
    }
}
