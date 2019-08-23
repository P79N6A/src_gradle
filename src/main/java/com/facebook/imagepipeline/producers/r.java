package com.facebook.imagepipeline.producers;

import com.facebook.b.c;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.g;
import com.facebook.common.memory.e;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

public final class r implements al<b> {

    /* renamed from: a  reason: collision with root package name */
    private final n<CacheKey, e> f24188a;

    /* renamed from: b  reason: collision with root package name */
    private final CacheKeyFactory f24189b;

    /* renamed from: c  reason: collision with root package name */
    private final al<b> f24190c;

    static class a extends m<b, b> {

        /* renamed from: a  reason: collision with root package name */
        private final n<CacheKey, e> f24191a;

        /* renamed from: b  reason: collision with root package name */
        private final CacheKey f24192b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f24193c;

        public final void onNewResultImpl(b bVar, int i) {
            CloseableReference<e> byteBufferRef;
            CloseableReference closeableReference;
            b bVar2;
            try {
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.beginSection("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!isNotLast(i) && bVar != null && !statusHasAnyFlag(i, 10)) {
                    if (bVar.getImageFormat() != c.f23294a) {
                        byteBufferRef = bVar.getByteBufferRef();
                        if (byteBufferRef != null) {
                            closeableReference = null;
                            if (this.f24193c) {
                                closeableReference = this.f24191a.cache(this.f24192b, byteBufferRef);
                            }
                            CloseableReference.closeSafely(byteBufferRef);
                            if (closeableReference != null) {
                                bVar2 = new b(closeableReference);
                                bVar2.copyMetaDataFrom(bVar);
                                CloseableReference.closeSafely(closeableReference);
                                this.mConsumer.onProgressUpdate(1.0f);
                                this.mConsumer.onNewResult(bVar2, i);
                                b.closeSafely(bVar2);
                                if (com.facebook.imagepipeline.e.b.isTracing()) {
                                    com.facebook.imagepipeline.e.b.endSection();
                                }
                                return;
                            }
                        }
                        this.mConsumer.onNewResult(bVar, i);
                        if (com.facebook.imagepipeline.e.b.isTracing()) {
                            com.facebook.imagepipeline.e.b.endSection();
                            return;
                        }
                        return;
                    }
                }
                this.mConsumer.onNewResult(bVar, i);
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
            } catch (Throwable th) {
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
                throw th;
            }
        }

        public a(Consumer<b> consumer, n<CacheKey, e> nVar, CacheKey cacheKey, boolean z) {
            super(consumer);
            this.f24191a = nVar;
            this.f24192b = cacheKey;
            this.f24193c = z;
        }
    }

    public final void produceResults(Consumer<b> consumer, am amVar) {
        Map map;
        b bVar;
        try {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("EncodedMemoryCacheProducer#produceResults");
            }
            String id = amVar.getId();
            ao listener = amVar.getListener();
            listener.onProducerStart(id, "EncodedMemoryCacheProducer");
            CacheKey encodedCacheKey = this.f24189b.getEncodedCacheKey(amVar.getImageRequest(), amVar.getCallerContext());
            CloseableReference closeableReference = this.f24188a.get(encodedCacheKey);
            Map map2 = null;
            if (closeableReference != null) {
                try {
                    bVar = new b(closeableReference);
                    if (listener.requiresExtraMap(id)) {
                        map2 = g.of("cached_value_found", "true");
                    }
                    listener.onProducerFinishWithSuccess(id, "EncodedMemoryCacheProducer", map2);
                    listener.onUltimateProducerReached(id, "EncodedMemoryCacheProducer", true);
                    consumer.onProgressUpdate(1.0f);
                    consumer.onNewResult(bVar, 1);
                    b.closeSafely(bVar);
                    CloseableReference.closeSafely(closeableReference);
                } catch (Throwable th) {
                    CloseableReference.closeSafely(closeableReference);
                    throw th;
                }
            } else if (amVar.getLowestPermittedRequestLevel().getValue() >= ImageRequest.a.ENCODED_MEMORY_CACHE.getValue()) {
                if (listener.requiresExtraMap(id)) {
                    map = g.of("cached_value_found", "false");
                } else {
                    map = null;
                }
                listener.onProducerFinishWithSuccess(id, "EncodedMemoryCacheProducer", map);
                listener.onUltimateProducerReached(id, "EncodedMemoryCacheProducer", false);
                consumer.onNewResult(null, 1);
                CloseableReference.closeSafely(closeableReference);
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
            } else {
                a aVar = new a(consumer, this.f24188a, encodedCacheKey, amVar.getImageRequest().isMemoryCacheEnabled());
                if (listener.requiresExtraMap(id)) {
                    map2 = g.of("cached_value_found", "false");
                }
                listener.onProducerFinishWithSuccess(id, "EncodedMemoryCacheProducer", map2);
                this.f24190c.produceResults(aVar, amVar);
                CloseableReference.closeSafely(closeableReference);
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
            }
        } finally {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
    }

    public r(n<CacheKey, e> nVar, CacheKeyFactory cacheKeyFactory, al<b> alVar) {
        this.f24188a = nVar;
        this.f24189b = cacheKeyFactory;
        this.f24190c = alVar;
    }
}
