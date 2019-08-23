package com.ss.android.ugc.aweme.shortvideo;

import a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.tools.extract.e;
import com.ss.android.ugc.aweme.tools.extract.g;
import java.util.concurrent.Callable;

public final /* synthetic */ class dd implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66740a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f66741b;

    /* renamed from: c  reason: collision with root package name */
    private final j f66742c;

    dd(Object obj, j jVar) {
        this.f66741b = obj;
        this.f66742c = jVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f66740a, false, 74250, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f66740a, false, 74250, new Class[0], Object.class);
        }
        Object obj = this.f66741b;
        j jVar = this.f66742c;
        g gVar = new g(((PhotoMovieContext) obj).mImageList);
        gVar.a((e.a) new di(obj, gVar, jVar));
        return null;
    }
}
