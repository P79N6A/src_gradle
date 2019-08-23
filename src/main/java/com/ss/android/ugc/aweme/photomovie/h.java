package com.ss.android.ugc.aweme.photomovie;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.photomovie.PhotoMovie;
import com.ss.android.ugc.aweme.photomovie.f;

public final /* synthetic */ class h implements PhotoMovie.ProgressCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59001a;

    /* renamed from: b  reason: collision with root package name */
    private final f.AnonymousClass1.AnonymousClass1 f59002b;

    h(f.AnonymousClass1.AnonymousClass1 r1) {
        this.f59002b = r1;
    }

    public final void onProgress(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59001a, false, 63959, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59001a, false, 63959, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f59002b.a(i);
    }
}
