package com.bytedance.lighten.loader.a;

import com.bytedance.lighten.core.b.e;
import com.facebook.imagepipeline.producers.ah;
import java.io.IOException;
import java.io.InputStream;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private ah.a f21804a;

    public final void a() {
        this.f21804a.onCancellation();
    }

    public a(ah.a aVar) {
        this.f21804a = aVar;
    }

    public final void a(Throwable th) {
        this.f21804a.onFailure(th);
    }

    public final void a(InputStream inputStream, int i) throws IOException {
        this.f21804a.onResponse(inputStream, i);
    }
}
