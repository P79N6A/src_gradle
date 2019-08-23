package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.al;
import com.facebook.imagepipeline.producers.as;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class c<T> extends a<T> {
    private c(al<T> alVar, as asVar, RequestListener requestListener) {
        super(alVar, asVar, requestListener);
    }

    public static <T> DataSource<T> create(al<T> alVar, as asVar, RequestListener requestListener) {
        return new c(alVar, asVar, requestListener);
    }
}
