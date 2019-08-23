package com.ss.android.ugc.aweme.photomovie;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;

public final /* synthetic */ class r implements PhotoMovieContext.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59025a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoMoviePublishFragment f59026b;

    r(PhotoMoviePublishFragment photoMoviePublishFragment) {
        this.f59026b = photoMoviePublishFragment;
    }

    public final void a(Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f59025a, false, 64035, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f59025a, false, 64035, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        PhotoMoviePublishFragment photoMoviePublishFragment = this.f59026b;
        if (bitmap2 != null) {
            photoMoviePublishFragment.o.post(new t(photoMoviePublishFragment, bitmap2));
        }
    }
}
