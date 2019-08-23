package com.facebook.imagepipeline.producers;

import com.facebook.b.c;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.e;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;

public final class o implements al<b> {

    /* renamed from: a  reason: collision with root package name */
    private final e f24179a;

    /* renamed from: b  reason: collision with root package name */
    private final e f24180b;

    /* renamed from: c  reason: collision with root package name */
    private final CacheKeyFactory f24181c;

    /* renamed from: d  reason: collision with root package name */
    private final al<b> f24182d;

    static class a extends m<b, b> {

        /* renamed from: a  reason: collision with root package name */
        private final am f24183a;

        /* renamed from: b  reason: collision with root package name */
        private final e f24184b;

        /* renamed from: c  reason: collision with root package name */
        private final e f24185c;

        /* renamed from: d  reason: collision with root package name */
        private final CacheKeyFactory f24186d;

        public final void onNewResultImpl(b bVar, int i) {
            if (isNotLast(i) || bVar == null || statusHasAnyFlag(i, 10) || bVar.getImageFormat() == c.f23294a) {
                this.mConsumer.onNewResult(bVar, i);
                return;
            }
            ImageRequest imageRequest = this.f24183a.getImageRequest();
            CacheKey encodedCacheKey = this.f24186d.getEncodedCacheKey(imageRequest, this.f24183a.getCallerContext());
            if (imageRequest.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
                this.f24185c.put(encodedCacheKey, bVar);
            } else {
                this.f24184b.put(encodedCacheKey, bVar);
            }
            this.mConsumer.onNewResult(bVar, i);
        }

        private a(Consumer<b> consumer, am amVar, e eVar, e eVar2, CacheKeyFactory cacheKeyFactory) {
            super(consumer);
            this.f24183a = amVar;
            this.f24184b = eVar;
            this.f24185c = eVar2;
            this.f24186d = cacheKeyFactory;
        }

        /* synthetic */ a(Consumer consumer, am amVar, e eVar, e eVar2, CacheKeyFactory cacheKeyFactory, byte b2) {
            this(consumer, amVar, eVar, eVar2, cacheKeyFactory);
        }
    }

    public final void produceResults(Consumer<b> consumer, am amVar) {
        if (amVar.getLowestPermittedRequestLevel().getValue() >= ImageRequest.a.DISK_CACHE.getValue()) {
            consumer.onNewResult(null, 1);
            return;
        }
        if (amVar.getImageRequest().isDiskCacheEnabled()) {
            a aVar = new a(consumer, amVar, this.f24179a, this.f24180b, this.f24181c, (byte) 0);
            consumer = aVar;
        }
        this.f24182d.produceResults(consumer, amVar);
    }

    public o(e eVar, e eVar2, CacheKeyFactory cacheKeyFactory, al<b> alVar) {
        this.f24179a = eVar;
        this.f24180b = eVar2;
        this.f24181c = cacheKeyFactory;
        this.f24182d = alVar;
    }
}
