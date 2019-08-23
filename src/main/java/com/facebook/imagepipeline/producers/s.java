package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.imagepipeline.common.a;
import com.facebook.imagepipeline.image.b;
import javax.annotation.Nullable;

public class s {
    public final Consumer<b> mConsumer;
    public final am mContext;
    public long mLastIntermediateResultTimeMs;
    public int mOnNewResultStatusFlags;
    @Nullable
    public a mResponseBytesRange;

    public String getId() {
        return this.mContext.getId();
    }

    public ao getListener() {
        return this.mContext.getListener();
    }

    public Uri getUri() {
        return this.mContext.getImageRequest().getSourceUri();
    }

    public s(Consumer<b> consumer, am amVar) {
        this.mConsumer = consumer;
        this.mContext = amVar;
    }
}
