package com.facebook.imagepipeline.datasource;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.al;
import com.facebook.imagepipeline.producers.as;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class b<T> extends a<CloseableReference<T>> {
    @Nullable
    public final CloseableReference<T> getResult() {
        return CloseableReference.cloneOrNull((CloseableReference) super.getResult());
    }

    public final /* synthetic */ void closeResult(Object obj) {
        CloseableReference.closeSafely((CloseableReference) obj);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj, int i) {
        super.a(CloseableReference.cloneOrNull((CloseableReference) obj), i);
    }

    private b(al<CloseableReference<T>> alVar, as asVar, RequestListener requestListener) {
        super(alVar, asVar, requestListener);
    }

    public static <T> DataSource<CloseableReference<T>> create(al<CloseableReference<T>> alVar, as asVar, RequestListener requestListener) {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("CloseableProducerToDataSourceAdapter#create");
        }
        b bVar = new b(alVar, asVar, requestListener);
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return bVar;
    }
}
