package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;

public final /* synthetic */ class k implements PhotoMovieContext.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71465a;

    /* renamed from: b  reason: collision with root package name */
    private final h f71466b;

    k(h hVar) {
        this.f71466b = hVar;
    }

    public final void a(Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f71465a, false, 81472, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f71465a, false, 81472, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.b(new l(this.f71466b, bitmap2));
    }
}
