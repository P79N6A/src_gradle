package com.ss.android.ugc.aweme.hotsearch.share;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49851a;

    /* renamed from: b  reason: collision with root package name */
    private final g f49852b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f49853c;

    o(g gVar, Bitmap bitmap) {
        this.f49852b = gVar;
        this.f49853c = bitmap;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f49851a, false, 49788, new Class[0], Object.class)) {
            return this.f49852b.a(this.f49853c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f49851a, false, 49788, new Class[0], Object.class);
    }
}
