package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.f;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class ac extends ab {
    /* access modifiers changed from: protected */
    public final String a() {
        return "LocalFileFetchProducer";
    }

    /* access modifiers changed from: protected */
    public final b a(ImageRequest imageRequest) throws IOException {
        return b(new FileInputStream(imageRequest.getSourceFile().toString()), (int) imageRequest.getSourceFile().length());
    }

    public ac(Executor executor, f fVar) {
        super(executor, fVar);
    }
}
