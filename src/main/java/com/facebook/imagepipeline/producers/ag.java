package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.memory.a;
import com.facebook.common.memory.f;
import com.facebook.common.memory.h;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.producers.ah;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;

public final class ag implements al<b> {

    /* renamed from: a  reason: collision with root package name */
    private final f f24034a;

    /* renamed from: b  reason: collision with root package name */
    private final a f24035b;

    /* renamed from: c  reason: collision with root package name */
    private final ah f24036c;

    public final void onCancellation(s sVar) {
        sVar.getListener().onProducerFinishWithCancellation(sVar.getId(), "NetworkFetchProducer", a(sVar, -1));
        sVar.mConsumer.onCancellation();
    }

    @Nullable
    private Map<String, String> a(s sVar, int i) {
        if (!sVar.getListener().requiresExtraMap(sVar.getId())) {
            return null;
        }
        return this.f24036c.getExtraMap(sVar, i);
    }

    public final void produceResults(Consumer<b> consumer, am amVar) {
        amVar.getListener().onProducerStart(amVar.getId(), "NetworkFetchProducer");
        final s createFetchState = this.f24036c.createFetchState(consumer, amVar);
        this.f24036c.fetch(createFetchState, new ah.a() {
            public final void onCancellation() {
                ag.this.onCancellation(createFetchState);
            }

            public final void onFailure(Throwable th) {
                ag.this.onFailure(createFetchState, th);
            }

            public final void onResponse(InputStream inputStream, int i) throws IOException {
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.beginSection("NetworkFetcher->onResponse");
                }
                ag.this.a(createFetchState, inputStream, i);
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
            }
        });
    }

    public final void onFailure(s sVar, Throwable th) {
        sVar.getListener().onProducerFinishWithFailure(sVar.getId(), "NetworkFetchProducer", th, a(sVar, -1));
        sVar.getListener().onUltimateProducerReached(sVar.getId(), "NetworkFetchProducer", false);
        sVar.mConsumer.onFailure(th);
    }

    public ag(f fVar, a aVar, ah ahVar) {
        this.f24034a = fVar;
        this.f24035b = aVar;
        this.f24036c = ahVar;
    }

    /* access modifiers changed from: protected */
    public final void a(s sVar, InputStream inputStream, int i) throws IOException {
        h hVar;
        float f2;
        if (i > 0) {
            hVar = this.f24034a.newOutputStream(i);
        } else {
            hVar = this.f24034a.newOutputStream();
        }
        byte[] bArr = (byte[]) this.f24035b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f24036c.onFetchCompletion(sVar, hVar.size());
                    Map<String, String> a2 = a(sVar, hVar.size());
                    ao listener = sVar.getListener();
                    listener.onProducerFinishWithSuccess(sVar.getId(), "NetworkFetchProducer", a2);
                    listener.onUltimateProducerReached(sVar.getId(), "NetworkFetchProducer", true);
                    a(hVar, sVar.mOnNewResultStatusFlags | 1, sVar.mResponseBytesRange, sVar.mConsumer);
                    return;
                } else if (read > 0) {
                    boolean z = false;
                    hVar.write(bArr, 0, read);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (sVar.mContext.isIntermediateResultExpected()) {
                        z = this.f24036c.shouldPropagate(sVar);
                    }
                    if (z && uptimeMillis - sVar.mLastIntermediateResultTimeMs >= 100) {
                        sVar.mLastIntermediateResultTimeMs = uptimeMillis;
                        sVar.getListener().onProducerEvent(sVar.getId(), "NetworkFetchProducer", "intermediate_result");
                        a(hVar, sVar.mOnNewResultStatusFlags, sVar.mResponseBytesRange, sVar.mConsumer);
                    }
                    int size = hVar.size();
                    if (i > 0) {
                        f2 = ((float) size) / ((float) i);
                    } else {
                        double d2 = (double) (-size);
                        Double.isNaN(d2);
                        f2 = 1.0f - ((float) Math.exp(d2 / 50000.0d));
                    }
                    sVar.mConsumer.onProgressUpdate(f2);
                }
            } finally {
                this.f24035b.release(bArr);
                hVar.close();
            }
        }
    }

    private static void a(h hVar, int i, @Nullable com.facebook.imagepipeline.common.a aVar, Consumer<b> consumer) {
        b bVar;
        CloseableReference of = CloseableReference.of(hVar.toByteBuffer());
        try {
            bVar = new b(of);
            try {
                bVar.mBytesRange = aVar;
                bVar.parseMetaData();
                consumer.onNewResult(bVar, i);
                b.closeSafely(bVar);
                CloseableReference.closeSafely(of);
            } catch (Throwable th) {
                th = th;
                b.closeSafely(bVar);
                CloseableReference.closeSafely(of);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            b.closeSafely(bVar);
            CloseableReference.closeSafely(of);
            throw th;
        }
    }
}
