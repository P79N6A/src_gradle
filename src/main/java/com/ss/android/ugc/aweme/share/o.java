package com.ss.android.ugc.aweme.share;

import android.graphics.Bitmap;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.e;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65222a;

    /* renamed from: b  reason: collision with root package name */
    private final e.AnonymousClass2 f65223b;

    /* renamed from: c  reason: collision with root package name */
    private final DataSource f65224c;

    o(e.AnonymousClass2 r1, DataSource dataSource) {
        this.f65223b = r1;
        this.f65224c = dataSource;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f65222a, false, 72948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65222a, false, 72948, new Class[0], Void.TYPE);
            return;
        }
        e.AnonymousClass2 r0 = this.f65223b;
        try {
            if (this.f65224c.isFinished()) {
                Bitmap bitmap = null;
                if (e.this.l != null && (e.this.l.get() instanceof a)) {
                    bitmap = ((a) e.this.l.get()).getUnderlyingBitmap();
                }
                if (e.this.f3880e != null) {
                    e.this.f3880e.setImageBitmap(bitmap);
                }
                e.this.a(bitmap);
                e.this.j = true;
                e.this.j();
            }
        } catch (Throwable unused) {
        }
    }
}
