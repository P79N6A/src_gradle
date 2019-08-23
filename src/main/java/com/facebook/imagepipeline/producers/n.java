package com.facebook.imagepipeline.producers;

import a.g;
import a.i;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.e;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class n implements al<b> {

    /* renamed from: a  reason: collision with root package name */
    private final e f24169a;

    /* renamed from: b  reason: collision with root package name */
    private final e f24170b;

    /* renamed from: c  reason: collision with root package name */
    private final CacheKeyFactory f24171c;
    public final al<b> mInputProducer;

    public static boolean isTaskCancelled(i<?> iVar) {
        if (iVar.c() || (iVar.d() && (iVar.f() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    public final void produceResults(Consumer<b> consumer, am amVar) {
        e eVar;
        ImageRequest imageRequest = amVar.getImageRequest();
        boolean z = true;
        if (imageRequest.isDiskCacheEnabled()) {
            amVar.getListener().onProducerStart(amVar.getId(), "DiskCacheProducer");
            CacheKey encodedCacheKey = this.f24171c.getEncodedCacheKey(imageRequest, amVar.getCallerContext());
            if (imageRequest.getCacheChoice() != ImageRequest.CacheChoice.SMALL) {
                z = false;
            }
            if (z) {
                eVar = this.f24170b;
            } else {
                eVar = this.f24169a;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            i<b> iVar = eVar.get(encodedCacheKey, atomicBoolean);
            final String id = amVar.getId();
            final ao listener = amVar.getListener();
            final Consumer<b> consumer2 = consumer;
            final am amVar2 = amVar;
            AnonymousClass1 r3 = new g<b, Void>() {
                public final Void then(i<b> iVar) throws Exception {
                    if (n.isTaskCancelled(iVar)) {
                        listener.onProducerFinishWithCancellation(id, "DiskCacheProducer", null);
                        consumer2.onCancellation();
                    } else if (iVar.d()) {
                        listener.onProducerFinishWithFailure(id, "DiskCacheProducer", iVar.f(), null);
                        n.this.mInputProducer.produceResults(consumer2, amVar2);
                    } else {
                        b bVar = (b) iVar.e();
                        if (bVar != null) {
                            listener.onProducerFinishWithSuccess(id, "DiskCacheProducer", n.a(listener, id, true, bVar.getSize()));
                            listener.onUltimateProducerReached(id, "DiskCacheProducer", true);
                            consumer2.onProgressUpdate(1.0f);
                            consumer2.onNewResult(bVar, 1);
                            bVar.close();
                        } else {
                            listener.onProducerFinishWithSuccess(id, "DiskCacheProducer", n.a(listener, id, false, 0));
                            n.this.mInputProducer.produceResults(consumer2, amVar2);
                        }
                    }
                    return null;
                }
            };
            iVar.a((g<TResult, TContinuationResult>) r3);
            amVar.addCallbacks(new e() {
                public final void onCancellationRequested() {
                    atomicBoolean.set(true);
                }
            });
        } else if (amVar.getLowestPermittedRequestLevel().getValue() >= ImageRequest.a.DISK_CACHE.getValue()) {
            consumer.onNewResult(null, 1);
        } else {
            this.mInputProducer.produceResults(consumer, amVar);
        }
    }

    public n(e eVar, e eVar2, CacheKeyFactory cacheKeyFactory, al<b> alVar) {
        this.f24169a = eVar;
        this.f24170b = eVar2;
        this.f24171c = cacheKeyFactory;
        this.mInputProducer = alVar;
    }

    @VisibleForTesting
    static Map<String, String> a(ao aoVar, String str, boolean z, int i) {
        if (!aoVar.requiresExtraMap(str)) {
            return null;
        }
        if (z) {
            return com.facebook.common.internal.g.of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return com.facebook.common.internal.g.of("cached_value_found", String.valueOf(z));
    }
}
