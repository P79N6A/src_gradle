package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;

public final class q extends af<Pair<CacheKey, ImageRequest.a>, b> {

    /* renamed from: b  reason: collision with root package name */
    private final CacheKeyFactory f24187b;

    public final b cloneOrNull(b bVar) {
        return b.cloneOrNull(bVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(am amVar) {
        return Pair.create(this.f24187b.getEncodedCacheKey(amVar.getImageRequest(), amVar.getCallerContext()), amVar.getLowestPermittedRequestLevel());
    }

    public q(CacheKeyFactory cacheKeyFactory, al alVar) {
        super(alVar);
        this.f24187b = cacheKeyFactory;
    }
}
