package com.ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.edit.cover.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66122a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f66123b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f66124c;

    f(b.a aVar, Bitmap bitmap) {
        this.f66123b = aVar;
        this.f66124c = bitmap;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f66122a, false, 75387, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f66122a, false, 75387, new Class[0], Object.class);
        }
        this.f66123b.a(this.f66124c);
        return null;
    }
}
