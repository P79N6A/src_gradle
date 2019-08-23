package com.facebook.imagepipeline.producers;

import a.g;
import a.i;
import com.facebook.b.c;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.f;
import com.facebook.common.memory.h;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.e;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

public final class ai implements al<b> {

    /* renamed from: a  reason: collision with root package name */
    private final e f24039a;

    /* renamed from: b  reason: collision with root package name */
    private final CacheKeyFactory f24040b;

    /* renamed from: c  reason: collision with root package name */
    private final f f24041c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.memory.a f24042d;

    /* renamed from: e  reason: collision with root package name */
    private final al<b> f24043e;

    static class a extends m<b, b> {

        /* renamed from: a  reason: collision with root package name */
        private final e f24052a;

        /* renamed from: b  reason: collision with root package name */
        private final CacheKey f24053b;

        /* renamed from: c  reason: collision with root package name */
        private final f f24054c;

        /* renamed from: d  reason: collision with root package name */
        private final com.facebook.common.memory.a f24055d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        private final b f24056e;

        public final void onNewResultImpl(b bVar, int i) {
            b bVar2;
            Throwable th;
            if (!isNotLast(i)) {
                if (this.f24056e == null || bVar.mBytesRange == null) {
                    if (statusHasFlag(i, 8) && isLast(i) && bVar.getImageFormat() != c.f23294a) {
                        this.f24052a.put(this.f24053b, bVar);
                    }
                    this.mConsumer.onNewResult(bVar, i);
                    return;
                }
                try {
                    b bVar3 = this.f24056e;
                    h newOutputStream = this.f24054c.newOutputStream(bVar.getSize() + bVar.mBytesRange.from);
                    a(bVar3.getInputStream(), newOutputStream, bVar.mBytesRange.from);
                    a(bVar.getInputStream(), newOutputStream, bVar.getSize());
                    CloseableReference of = CloseableReference.of(newOutputStream.toByteBuffer());
                    try {
                        bVar2 = new b(of);
                        try {
                            bVar2.parseMetaData();
                            this.mConsumer.onNewResult(bVar2, 1);
                            b.closeSafely(bVar2);
                            CloseableReference.closeSafely(of);
                            bVar.close();
                            this.f24056e.close();
                            this.f24052a.remove(this.f24053b);
                        } catch (Throwable th2) {
                            th = th2;
                            b.closeSafely(bVar2);
                            CloseableReference.closeSafely(of);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        bVar2 = null;
                        th = th4;
                        b.closeSafely(bVar2);
                        CloseableReference.closeSafely(of);
                        throw th;
                    }
                } catch (IOException e2) {
                    FLog.e("PartialDiskCacheProducer", "Error while merging image data", (Throwable) e2);
                    this.mConsumer.onFailure(e2);
                } catch (Throwable th5) {
                    bVar.close();
                    this.f24056e.close();
                    throw th5;
                }
            }
        }

        private void a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = (byte[]) this.f24055d.get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } catch (Throwable th) {
                    this.f24055d.release(bArr);
                    throw th;
                }
            }
            this.f24055d.release(bArr);
            if (i2 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            }
        }

        private a(Consumer<b> consumer, e eVar, CacheKey cacheKey, f fVar, com.facebook.common.memory.a aVar, @Nullable b bVar) {
            super(consumer);
            this.f24052a = eVar;
            this.f24053b = cacheKey;
            this.f24054c = fVar;
            this.f24055d = aVar;
            this.f24056e = bVar;
        }

        /* synthetic */ a(Consumer consumer, e eVar, CacheKey cacheKey, f fVar, com.facebook.common.memory.a aVar, b bVar, byte b2) {
            this(consumer, eVar, cacheKey, fVar, aVar, bVar);
        }
    }

    public static boolean isTaskCancelled(i<?> iVar) {
        if (iVar.c() || (iVar.d() && (iVar.f() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    public final void produceResults(Consumer<b> consumer, am amVar) {
        ImageRequest imageRequest = amVar.getImageRequest();
        if (!imageRequest.isDiskCacheEnabled()) {
            this.f24043e.produceResults(consumer, amVar);
            return;
        }
        amVar.getListener().onProducerStart(amVar.getId(), "PartialDiskCacheProducer");
        final CacheKey encodedCacheKey = this.f24040b.getEncodedCacheKey(imageRequest, imageRequest.getSourceUri().buildUpon().appendQueryParameter("fresco_partial", "true").build(), amVar.getCallerContext());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        i<b> iVar = this.f24039a.get(encodedCacheKey, atomicBoolean);
        final String id = amVar.getId();
        final ao listener = amVar.getListener();
        final Consumer<b> consumer2 = consumer;
        final am amVar2 = amVar;
        AnonymousClass1 r4 = new g<b, Void>() {
            public final Void then(i<b> iVar) throws Exception {
                if (ai.isTaskCancelled(iVar)) {
                    listener.onProducerFinishWithCancellation(id, "PartialDiskCacheProducer", null);
                    consumer2.onCancellation();
                } else if (iVar.d()) {
                    listener.onProducerFinishWithFailure(id, "PartialDiskCacheProducer", iVar.f(), null);
                    ai.this.startInputProducer(consumer2, amVar2, encodedCacheKey, null);
                } else {
                    b bVar = (b) iVar.e();
                    if (bVar != null) {
                        listener.onProducerFinishWithSuccess(id, "PartialDiskCacheProducer", ai.a(listener, id, true, bVar.getSize()));
                        com.facebook.imagepipeline.common.a max = com.facebook.imagepipeline.common.a.toMax(bVar.getSize() - 1);
                        bVar.mBytesRange = max;
                        int size = bVar.getSize();
                        ImageRequest imageRequest = amVar2.getImageRequest();
                        if (max.contains(imageRequest.getBytesRange())) {
                            listener.onUltimateProducerReached(id, "PartialDiskCacheProducer", true);
                            consumer2.onNewResult(bVar, 9);
                        } else {
                            consumer2.onNewResult(bVar, 8);
                            ai.this.startInputProducer(consumer2, new as(ImageRequestBuilder.fromRequest(imageRequest).setBytesRange(com.facebook.imagepipeline.common.a.from(size - 1)).build(), amVar2), encodedCacheKey, bVar);
                        }
                    } else {
                        listener.onProducerFinishWithSuccess(id, "PartialDiskCacheProducer", ai.a(listener, id, false, 0));
                        ai.this.startInputProducer(consumer2, amVar2, encodedCacheKey, bVar);
                    }
                }
                return null;
            }
        };
        iVar.a((g<TResult, TContinuationResult>) r4);
        amVar.addCallbacks(new e() {
            public final void onCancellationRequested() {
                atomicBoolean.set(true);
            }
        });
    }

    public final void startInputProducer(Consumer<b> consumer, am amVar, CacheKey cacheKey, @Nullable b bVar) {
        a aVar = new a(consumer, this.f24039a, cacheKey, this.f24041c, this.f24042d, bVar, (byte) 0);
        this.f24043e.produceResults(aVar, amVar);
    }

    @VisibleForTesting
    @Nullable
    static Map<String, String> a(ao aoVar, String str, boolean z, int i) {
        if (!aoVar.requiresExtraMap(str)) {
            return null;
        }
        if (z) {
            return com.facebook.common.internal.g.of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return com.facebook.common.internal.g.of("cached_value_found", String.valueOf(z));
    }

    public ai(e eVar, CacheKeyFactory cacheKeyFactory, f fVar, com.facebook.common.memory.a aVar, al<b> alVar) {
        this.f24039a = eVar;
        this.f24040b = cacheKeyFactory;
        this.f24041c = fVar;
        this.f24042d = aVar;
        this.f24043e = alVar;
    }
}
