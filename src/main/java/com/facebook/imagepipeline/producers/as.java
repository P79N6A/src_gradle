package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class as extends d {
    public as(ImageRequest imageRequest, am amVar) {
        this(imageRequest, amVar.getId(), amVar.getListener(), amVar.getCallerContext(), amVar.getLowestPermittedRequestLevel(), amVar.isPrefetch(), amVar.isIntermediateResultExpected(), amVar.getPriority());
    }

    public as(ImageRequest imageRequest, String str, ao aoVar, Object obj, ImageRequest.a aVar, boolean z, boolean z2, Priority priority) {
        super(imageRequest, str, aoVar, obj, aVar, z, z2, priority);
    }
}
