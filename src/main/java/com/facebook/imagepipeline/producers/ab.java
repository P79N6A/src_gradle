package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.c;
import com.facebook.common.memory.f;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

public abstract class ab implements al<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f24007a;

    /* renamed from: b  reason: collision with root package name */
    private final f f24008b;

    /* access modifiers changed from: protected */
    public abstract b a(ImageRequest imageRequest) throws IOException;

    /* access modifiers changed from: protected */
    public abstract String a();

    protected ab(Executor executor, f fVar) {
        this.f24007a = executor;
        this.f24008b = fVar;
    }

    /* access modifiers changed from: protected */
    public final b b(InputStream inputStream, int i) throws IOException {
        return a(inputStream, i);
    }

    /* access modifiers changed from: protected */
    public final b a(InputStream inputStream, int i) throws IOException {
        CloseableReference of;
        if (i <= 0) {
            try {
                of = CloseableReference.of(this.f24008b.newByteBuffer(inputStream));
            } catch (Throwable th) {
                c.a(inputStream);
                CloseableReference.closeSafely((CloseableReference<?>) null);
                throw th;
            }
        } else {
            of = CloseableReference.of(this.f24008b.newByteBuffer(inputStream, i));
        }
        CloseableReference closeableReference = of;
        b bVar = new b(closeableReference);
        c.a(inputStream);
        CloseableReference.closeSafely(closeableReference);
        return bVar;
    }

    public void produceResults(Consumer<b> consumer, am amVar) {
        final ao listener = amVar.getListener();
        final String id = amVar.getId();
        final ImageRequest imageRequest = amVar.getImageRequest();
        final AnonymousClass1 r0 = new at<b>(consumer, listener, a(), id) {
            public final /* synthetic */ Object getResult() throws Exception {
                b a2 = ab.this.a(imageRequest);
                if (a2 == null) {
                    listener.onUltimateProducerReached(id, ab.this.a(), false);
                    return null;
                }
                a2.parseMetaData();
                listener.onUltimateProducerReached(id, ab.this.a(), true);
                return a2;
            }

            public final /* synthetic */ void disposeResult(Object obj) {
                b.closeSafely((b) obj);
            }
        };
        amVar.addCallbacks(new e() {
            public final void onCancellationRequested() {
                r0.cancel();
            }
        });
        this.f24007a.execute(r0);
    }
}
