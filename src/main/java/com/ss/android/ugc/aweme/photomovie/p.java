package com.ss.android.ugc.aweme.photomovie;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;

public final /* synthetic */ class p implements IAVPublishExtension.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59021a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoMoviePublishFragment f59022b;

    p(PhotoMoviePublishFragment photoMoviePublishFragment) {
        this.f59022b = photoMoviePublishFragment;
    }

    public final void onContentModified() {
        if (PatchProxy.isSupport(new Object[0], this, f59021a, false, 64033, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59021a, false, 64033, new Class[0], Void.TYPE);
            return;
        }
        this.f59022b.n = true;
    }
}
