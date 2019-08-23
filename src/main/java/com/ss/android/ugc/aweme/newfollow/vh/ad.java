package com.ss.android.ugc.aweme.newfollow.vh;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;

public final /* synthetic */ class ad implements PhotoMovieContext.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57701a;

    /* renamed from: b  reason: collision with root package name */
    private final UpLoadRecoverItemViewHolder f57702b;

    public ad(UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder) {
        this.f57702b = upLoadRecoverItemViewHolder;
    }

    public final void a(Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57701a, false, 62676, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57701a, false, 62676, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.b(new ae(this.f57702b, bitmap2));
    }
}
