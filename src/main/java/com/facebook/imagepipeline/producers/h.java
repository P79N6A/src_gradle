package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.g;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.e.b;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.d;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

public class h implements al<CloseableReference<CloseableImage>> {

    /* renamed from: a  reason: collision with root package name */
    private final CacheKeyFactory f24133a;

    /* renamed from: b  reason: collision with root package name */
    private final al<CloseableReference<CloseableImage>> f24134b;
    public final n<CacheKey, CloseableImage> mMemoryCache;

    /* access modifiers changed from: protected */
    public String a() {
        return "BitmapMemoryCacheProducer";
    }

    public void produceResults(Consumer<CloseableReference<CloseableImage>> consumer, am amVar) {
        Map map;
        Map map2;
        try {
            if (b.isTracing()) {
                b.beginSection("BitmapMemoryCacheProducer#produceResults");
            }
            ao listener = amVar.getListener();
            String id = amVar.getId();
            listener.onProducerStart(id, a());
            CacheKey bitmapCacheKey = this.f24133a.getBitmapCacheKey(amVar.getImageRequest(), amVar.getCallerContext());
            CloseableReference closeableReference = this.mMemoryCache.get(bitmapCacheKey);
            Map map3 = null;
            if (closeableReference != null) {
                boolean isOfFullQuality = ((CloseableImage) closeableReference.get()).getQualityInfo().isOfFullQuality();
                if (isOfFullQuality) {
                    String a2 = a();
                    if (listener.requiresExtraMap(id)) {
                        map2 = g.of("cached_value_found", "true");
                    } else {
                        map2 = null;
                    }
                    listener.onProducerFinishWithSuccess(id, a2, map2);
                    listener.onUltimateProducerReached(id, a(), true);
                    consumer.onProgressUpdate(1.0f);
                }
                consumer.onNewResult(closeableReference, b.simpleStatusForIsLast(isOfFullQuality));
                closeableReference.close();
                if (isOfFullQuality) {
                    return;
                }
            }
            if (amVar.getLowestPermittedRequestLevel().getValue() >= ImageRequest.a.BITMAP_MEMORY_CACHE.getValue()) {
                String a3 = a();
                if (listener.requiresExtraMap(id)) {
                    map = g.of("cached_value_found", "false");
                } else {
                    map = null;
                }
                listener.onProducerFinishWithSuccess(id, a3, map);
                listener.onUltimateProducerReached(id, a(), false);
                consumer.onNewResult(null, 1);
                if (b.isTracing()) {
                    b.endSection();
                }
                return;
            }
            Consumer<CloseableReference<CloseableImage>> a4 = a(consumer, bitmapCacheKey, amVar.getImageRequest().isMemoryCacheEnabled());
            String a5 = a();
            if (listener.requiresExtraMap(id)) {
                map3 = g.of("cached_value_found", "false");
            }
            listener.onProducerFinishWithSuccess(id, a5, map3);
            if (b.isTracing()) {
                b.beginSection("mInputProducer.produceResult");
            }
            this.f24134b.produceResults(a4, amVar);
            if (b.isTracing()) {
                b.endSection();
            }
            if (b.isTracing()) {
                b.endSection();
            }
        } finally {
            if (b.isTracing()) {
                b.endSection();
            }
        }
    }

    /* access modifiers changed from: protected */
    public Consumer<CloseableReference<CloseableImage>> a(Consumer<CloseableReference<CloseableImage>> consumer, final CacheKey cacheKey, final boolean z) {
        return new m<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>(consumer) {
            public final void onNewResultImpl(CloseableReference<CloseableImage> closeableReference, int i) {
                CloseableReference<CloseableImage> closeableReference2;
                CloseableReference closeableReference3;
                try {
                    if (b.isTracing()) {
                        b.beginSection("BitmapMemoryCacheProducer#onNewResultImpl");
                    }
                    boolean isLast = isLast(i);
                    closeableReference2 = null;
                    if (closeableReference == null) {
                        if (isLast) {
                            this.mConsumer.onNewResult(null, i);
                        }
                        if (b.isTracing()) {
                            b.endSection();
                        }
                        return;
                    }
                    if (!((CloseableImage) closeableReference.get()).isStateful()) {
                        if (!statusHasFlag(i, 8)) {
                            if (!isLast) {
                                closeableReference3 = h.this.mMemoryCache.get(cacheKey);
                                if (closeableReference3 != null) {
                                    d qualityInfo = ((CloseableImage) closeableReference.get()).getQualityInfo();
                                    d qualityInfo2 = ((CloseableImage) closeableReference3.get()).getQualityInfo();
                                    if (qualityInfo2.isOfFullQuality() || qualityInfo2.getQuality() >= qualityInfo.getQuality()) {
                                        this.mConsumer.onNewResult(closeableReference3, i);
                                        CloseableReference.closeSafely(closeableReference3);
                                        if (b.isTracing()) {
                                            b.endSection();
                                        }
                                        return;
                                    }
                                    CloseableReference.closeSafely(closeableReference3);
                                }
                            }
                            if (z) {
                                closeableReference2 = h.this.mMemoryCache.cache(cacheKey, closeableReference);
                            }
                            if (isLast) {
                                this.mConsumer.onProgressUpdate(1.0f);
                            }
                            Consumer<O> consumer = this.mConsumer;
                            if (closeableReference2 != null) {
                                closeableReference = closeableReference2;
                            }
                            consumer.onNewResult(closeableReference, i);
                            CloseableReference.closeSafely(closeableReference2);
                            if (b.isTracing()) {
                                b.endSection();
                                return;
                            }
                            return;
                        }
                    }
                    this.mConsumer.onNewResult(closeableReference, i);
                    if (b.isTracing()) {
                        b.endSection();
                    }
                } catch (Throwable th) {
                    if (b.isTracing()) {
                        b.endSection();
                    }
                    throw th;
                }
            }
        };
    }

    public h(n<CacheKey, CloseableImage> nVar, CacheKeyFactory cacheKeyFactory, al<CloseableReference<CloseableImage>> alVar) {
        this.mMemoryCache = nVar;
        this.f24133a = cacheKeyFactory;
        this.f24134b = alVar;
    }
}
