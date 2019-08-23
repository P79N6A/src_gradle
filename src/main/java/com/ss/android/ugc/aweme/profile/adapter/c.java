package com.ss.android.ugc.aweme.profile.adapter;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;

public final /* synthetic */ class c implements PhotoMovieContext.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61292a;

    /* renamed from: b  reason: collision with root package name */
    private final DraftBoxViewHolder f61293b;

    c(DraftBoxViewHolder draftBoxViewHolder) {
        this.f61293b = draftBoxViewHolder;
    }

    public final void a(Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f61292a, false, 67386, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f61292a, false, 67386, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.b(new d(this.f61293b, bitmap2));
    }
}
