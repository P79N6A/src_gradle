package com.ss.android.ugc.aweme.shortvideo;

import a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.tools.extract.e;
import com.ss.android.ugc.aweme.tools.extract.g;

public final /* synthetic */ class di implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66757a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f66758b;

    /* renamed from: c  reason: collision with root package name */
    private final g f66759c;

    /* renamed from: d  reason: collision with root package name */
    private final j f66760d;

    di(Object obj, g gVar, j jVar) {
        this.f66758b = obj;
        this.f66759c = gVar;
        this.f66760d = jVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66757a, false, 74255, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66757a, false, 74255, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Object obj = this.f66758b;
        g gVar = this.f66759c;
        j jVar = this.f66760d;
        ((PhotoMovieContext) obj).extractFramesModel = gVar.e();
        jVar.b(null);
    }
}
