package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;

public interface am {
    void addCallbacks(an anVar);

    Object getCallerContext();

    String getId();

    ImageRequest getImageRequest();

    ao getListener();

    ImageRequest.a getLowestPermittedRequestLevel();

    Priority getPriority();

    boolean isIntermediateResultExpected();

    boolean isPrefetch();
}
