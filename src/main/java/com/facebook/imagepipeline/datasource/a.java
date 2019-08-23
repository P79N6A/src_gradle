package com.facebook.imagepipeline.datasource;

import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.al;
import com.facebook.imagepipeline.producers.as;
import com.facebook.imagepipeline.producers.b;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract class a<T> extends com.facebook.datasource.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final as f23932a;

    /* renamed from: b  reason: collision with root package name */
    private final RequestListener f23933b;

    public synchronized void onCancellationImpl() {
        Preconditions.checkState(isClosed());
    }

    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (!super.isFinished()) {
            this.f23933b.onRequestCancellation(this.f23932a.getId());
            this.f23932a.cancel();
        }
        return true;
    }

    public void onFailureImpl(Throwable th) {
        if (super.a(th)) {
            this.f23933b.onRequestFailure(this.f23932a.getImageRequest(), this.f23932a.getId(), th, this.f23932a.isPrefetch());
        }
    }

    /* access modifiers changed from: protected */
    public void a(@Nullable T t, int i) {
        boolean isLast = b.isLast(i);
        if (super.a(t, isLast) && isLast) {
            this.f23933b.onRequestSuccess(this.f23932a.getImageRequest(), this.f23932a.getId(), this.f23932a.isPrefetch());
        }
    }

    protected a(al<T> alVar, as asVar, RequestListener requestListener) {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("AbstractProducerToDataSourceAdapter()");
        }
        this.f23932a = asVar;
        this.f23933b = requestListener;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        this.f23933b.onRequestStart(asVar.getImageRequest(), this.f23932a.getCallerContext(), this.f23932a.getId(), this.f23932a.isPrefetch());
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        alVar.produceResults(new b<T>() {
            public final void onCancellationImpl() {
                a.this.onCancellationImpl();
            }

            public final void onFailureImpl(Throwable th) {
                a.this.onFailureImpl(th);
            }

            public final void onProgressUpdateImpl(float f2) {
                a.this.setProgress(f2);
            }

            public final void onNewResultImpl(@Nullable T t, int i) {
                a.this.a(t, i);
            }
        }, asVar);
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
    }
}
