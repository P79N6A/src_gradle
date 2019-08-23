package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68597a;

    /* renamed from: b  reason: collision with root package name */
    private final MvChooseAlbumFragment f68598b;

    f(MvChooseAlbumFragment mvChooseAlbumFragment) {
        this.f68598b = mvChooseAlbumFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68597a, false, 77943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68597a, false, 77943, new Class[0], Void.TYPE);
            return;
        }
        MvChooseAlbumFragment mvChooseAlbumFragment = this.f68598b;
        mvChooseAlbumFragment.f68521d.setTranslationY((float) (-mvChooseAlbumFragment.f68521d.getHeight()));
    }
}
