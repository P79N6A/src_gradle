package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.g;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.Map;

public final class aj implements al<CloseableReference<CloseableImage>> {

    /* renamed from: a  reason: collision with root package name */
    private final n<CacheKey, CloseableImage> f24057a;

    /* renamed from: b  reason: collision with root package name */
    private final CacheKeyFactory f24058b;

    /* renamed from: c  reason: collision with root package name */
    private final al<CloseableReference<CloseableImage>> f24059c;

    public static class a extends m<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {

        /* renamed from: a  reason: collision with root package name */
        private final CacheKey f24060a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f24061b;

        /* renamed from: c  reason: collision with root package name */
        private final n<CacheKey, CloseableImage> f24062c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f24063d;

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onNewResultImpl(Object obj, int i) {
            CloseableReference closeableReference = (CloseableReference) obj;
            CloseableReference closeableReference2 = null;
            if (closeableReference == null) {
                if (isLast(i)) {
                    this.mConsumer.onNewResult(closeableReference2, i);
                }
            } else if (!isNotLast(i) || this.f24061b) {
                if (this.f24063d) {
                    closeableReference2 = this.f24062c.cache(this.f24060a, closeableReference);
                }
                try {
                    this.mConsumer.onProgressUpdate(1.0f);
                    Consumer<O> consumer = this.mConsumer;
                    if (closeableReference2 != null) {
                        closeableReference = closeableReference2;
                    }
                    consumer.onNewResult(closeableReference, i);
                } finally {
                    CloseableReference.closeSafely(closeableReference2);
                }
            }
        }

        public a(Consumer<CloseableReference<CloseableImage>> consumer, CacheKey cacheKey, boolean z, n<CacheKey, CloseableImage> nVar, boolean z2) {
            super(consumer);
            this.f24060a = cacheKey;
            this.f24061b = z;
            this.f24062c = nVar;
            this.f24063d = z2;
        }
    }

    private static String a() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }

    public final void produceResults(Consumer<CloseableReference<CloseableImage>> consumer, am amVar) {
        ao listener = amVar.getListener();
        String id = amVar.getId();
        ImageRequest imageRequest = amVar.getImageRequest();
        Object callerContext = amVar.getCallerContext();
        Postprocessor postprocessor = imageRequest.getPostprocessor();
        if (postprocessor == null || postprocessor.getPostprocessorCacheKey() == null) {
            this.f24059c.produceResults(consumer, amVar);
            return;
        }
        listener.onProducerStart(id, a());
        CacheKey postprocessedBitmapCacheKey = this.f24058b.getPostprocessedBitmapCacheKey(imageRequest, callerContext);
        CloseableReference closeableReference = this.f24057a.get(postprocessedBitmapCacheKey);
        Map map = null;
        if (closeableReference != null) {
            String a2 = a();
            if (listener.requiresExtraMap(id)) {
                map = g.of("cached_value_found", "true");
            }
            listener.onProducerFinishWithSuccess(id, a2, map);
            listener.onUltimateProducerReached(id, "PostprocessedBitmapMemoryCacheProducer", true);
            consumer.onProgressUpdate(1.0f);
            consumer.onNewResult(closeableReference, 1);
            closeableReference.close();
            return;
        }
        Consumer<CloseableReference<CloseableImage>> consumer2 = consumer;
        a aVar = new a(consumer2, postprocessedBitmapCacheKey, postprocessor instanceof com.facebook.imagepipeline.request.a, this.f24057a, amVar.getImageRequest().isMemoryCacheEnabled());
        String a3 = a();
        if (listener.requiresExtraMap(id)) {
            map = g.of("cached_value_found", "false");
        }
        listener.onProducerFinishWithSuccess(id, a3, map);
        this.f24059c.produceResults(aVar, amVar);
    }

    public aj(n<CacheKey, CloseableImage> nVar, CacheKeyFactory cacheKeyFactory, al<CloseableReference<CloseableImage>> alVar) {
        this.f24057a = nVar;
        this.f24058b = cacheKeyFactory;
        this.f24059c = alVar;
    }
}
