package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;

public final class g extends af<Pair<CacheKey, ImageRequest.a>, CloseableReference<CloseableImage>> {

    /* renamed from: b  reason: collision with root package name */
    private final CacheKeyFactory f24132b;

    public final CloseableReference<CloseableImage> cloneOrNull(CloseableReference<CloseableImage> closeableReference) {
        return CloseableReference.cloneOrNull(closeableReference);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(am amVar) {
        return Pair.create(this.f24132b.getBitmapCacheKey(amVar.getImageRequest(), amVar.getCallerContext()), amVar.getLowestPermittedRequestLevel());
    }

    public g(CacheKeyFactory cacheKeyFactory, al alVar) {
        super(alVar);
        this.f24132b = cacheKeyFactory;
    }
}
