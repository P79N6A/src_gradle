package com.ss.android.ugc.aweme.photomovie;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59029a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoMoviePublishFragment f59030b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f59031c;

    t(PhotoMoviePublishFragment photoMoviePublishFragment, Bitmap bitmap) {
        this.f59030b = photoMoviePublishFragment;
        this.f59031c = bitmap;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f59029a, false, 64037, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59029a, false, 64037, new Class[0], Void.TYPE);
            return;
        }
        PhotoMoviePublishFragment photoMoviePublishFragment = this.f59030b;
        photoMoviePublishFragment.j.setImageBitmap(this.f59031c);
    }
}
