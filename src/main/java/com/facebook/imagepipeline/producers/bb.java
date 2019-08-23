package com.facebook.imagepipeline.producers;

import com.facebook.b.c;
import com.facebook.b.d;
import com.facebook.common.f.e;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.f;
import com.facebook.common.memory.h;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.b;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public final class bb implements al<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f24119a;

    /* renamed from: b  reason: collision with root package name */
    private final al<b> f24120b;
    public final f mPooledByteBufferFactory;

    class a extends m<b, b> {

        /* renamed from: b  reason: collision with root package name */
        private final am f24124b;

        /* renamed from: c  reason: collision with root package name */
        private e f24125c = e.UNSET;

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onNewResultImpl(@Nullable Object obj, int i) {
            b bVar = (b) obj;
            if (this.f24125c == e.UNSET && bVar != null) {
                this.f24125c = bb.shouldTranscode(bVar);
            }
            if (this.f24125c != e.NO) {
                if (isLast(i)) {
                    if (this.f24125c == e.YES && bVar != null) {
                        bb.this.transcodeLastResult(bVar, this.mConsumer, this.f24124b);
                        return;
                    }
                }
            }
            this.mConsumer.onNewResult(bVar, i);
        }

        public a(Consumer<b> consumer, am amVar) {
            super(consumer);
            this.f24124b = amVar;
        }
    }

    public static e shouldTranscode(b bVar) {
        Preconditions.checkNotNull(bVar);
        c a2 = d.a(bVar.getInputStream());
        if (com.facebook.b.b.a(a2)) {
            com.facebook.imagepipeline.nativecode.e webpTranscoder = com.facebook.imagepipeline.nativecode.f.getWebpTranscoder();
            if (webpTranscoder == null) {
                return e.NO;
            }
            return e.valueOf(!webpTranscoder.isWebpNativelySupported(a2));
        } else if (a2 == c.f23294a) {
            return e.UNSET;
        } else {
            return e.NO;
        }
    }

    public final void produceResults(Consumer<b> consumer, am amVar) {
        this.f24120b.produceResults(new a(consumer, amVar), amVar);
    }

    public static void doTranscode(b bVar, h hVar) throws Exception {
        InputStream inputStream = bVar.getInputStream();
        c a2 = d.a(inputStream);
        if (a2 == com.facebook.b.b.f23293f || a2 == com.facebook.b.b.h) {
            com.facebook.imagepipeline.nativecode.f.getWebpTranscoder().transcodeWebpToJpeg(inputStream, hVar, 80);
            bVar.mImageFormat = com.facebook.b.b.f23288a;
        } else if (a2 == com.facebook.b.b.g || a2 == com.facebook.b.b.i) {
            com.facebook.imagepipeline.nativecode.f.getWebpTranscoder().transcodeWebpToPng(inputStream, hVar);
            bVar.mImageFormat = com.facebook.b.b.f23289b;
        } else {
            throw new IllegalArgumentException("Wrong image format");
        }
    }

    public bb(Executor executor, f fVar, al<b> alVar) {
        this.f24119a = (Executor) Preconditions.checkNotNull(executor);
        this.mPooledByteBufferFactory = (f) Preconditions.checkNotNull(fVar);
        this.f24120b = (al) Preconditions.checkNotNull(alVar);
    }

    public final void transcodeLastResult(b bVar, Consumer<b> consumer, am amVar) {
        Preconditions.checkNotNull(bVar);
        final b cloneOrNull = b.cloneOrNull(bVar);
        AnonymousClass1 r0 = new at<b>(consumer, amVar.getListener(), "WebpTranscodeProducer", amVar.getId()) {
            public final void onCancellation() {
                b.closeSafely(cloneOrNull);
                super.onCancellation();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public b getResult() throws Exception {
                CloseableReference of;
                h newOutputStream = bb.this.mPooledByteBufferFactory.newOutputStream();
                try {
                    bb.doTranscode(cloneOrNull, newOutputStream);
                    of = CloseableReference.of(newOutputStream.toByteBuffer());
                    b bVar = new b(of);
                    bVar.copyMetaDataFrom(cloneOrNull);
                    CloseableReference.closeSafely(of);
                    newOutputStream.close();
                    return bVar;
                } catch (Throwable th) {
                    newOutputStream.close();
                    throw th;
                }
            }

            public final /* synthetic */ void disposeResult(Object obj) {
                b.closeSafely((b) obj);
            }

            public final void onFailure(Exception exc) {
                b.closeSafely(cloneOrNull);
                super.onFailure(exc);
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                b.closeSafely(cloneOrNull);
                super.onSuccess((b) obj);
            }
        };
        this.f24119a.execute(r0);
    }
}
