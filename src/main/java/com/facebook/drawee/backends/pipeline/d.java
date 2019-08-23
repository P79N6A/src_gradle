package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.f;
import com.facebook.drawee.components.a;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    Resources f23646a;

    /* renamed from: b  reason: collision with root package name */
    a f23647b;

    /* renamed from: c  reason: collision with root package name */
    DrawableFactory f23648c;

    /* renamed from: d  reason: collision with root package name */
    Executor f23649d;

    /* renamed from: e  reason: collision with root package name */
    n<CacheKey, CloseableImage> f23650e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    f<DrawableFactory> f23651f;
    @Nullable
    Supplier<Boolean> g;

    public final c a() {
        c cVar = new c(this.f23646a, this.f23647b, this.f23648c, this.f23649d, this.f23650e, this.f23651f);
        if (this.g != null) {
            cVar.f23644d = ((Boolean) this.g.get()).booleanValue();
        }
        return cVar;
    }
}
