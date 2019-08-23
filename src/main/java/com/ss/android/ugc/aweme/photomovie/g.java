package com.ss.android.ugc.aweme.photomovie;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.f;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.video.b;
import java.util.concurrent.CancellationException;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58998a;

    /* renamed from: b  reason: collision with root package name */
    private final f.AnonymousClass1 f58999b;

    /* renamed from: c  reason: collision with root package name */
    private final PhotoMovieContext f59000c;

    g(f.AnonymousClass1 r1, PhotoMovieContext photoMovieContext) {
        this.f58999b = r1;
        this.f59000c = photoMovieContext;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f58998a, false, 63957, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f58998a, false, 63957, new Class[]{i.class}, Object.class);
        }
        f.AnonymousClass1 r0 = this.f58999b;
        PhotoMovieContext photoMovieContext = this.f59000c;
        if (iVar.c()) {
            r0.a((Throwable) new CancellationException());
        } else if (iVar.d()) {
            r0.a((Throwable) iVar.f());
        } else {
            if (photoMovieContext.isSaveLocalWithoutWaterMark()) {
                b.e(fg.k);
                b.c(photoMovieContext.mOutputVideoPath, photoMovieContext.getLocalTempPath());
            }
            r0.b(iVar.e());
        }
        return null;
    }
}
