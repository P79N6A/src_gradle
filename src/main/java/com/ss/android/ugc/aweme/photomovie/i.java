package com.ss.android.ugc.aweme.photomovie;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.photomovie.PhotoMovie;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.bi;

public final /* synthetic */ class i implements PhotoMovie.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59003a;

    /* renamed from: b  reason: collision with root package name */
    static final PhotoMovie.a f59004b = new i();

    private i() {
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59003a, false, 63960, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59003a, false, 63960, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        n.a("save_upload_video_hardcode_rate", i, bi.a().a("type", "PhotoMovie").b());
    }
}
