package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.common.memory.f;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class ap extends ab {

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f24080a;

    /* access modifiers changed from: protected */
    public final String a() {
        return "QualifiedResourceFetchProducer";
    }

    /* access modifiers changed from: protected */
    public final b a(ImageRequest imageRequest) throws IOException {
        return b(this.f24080a.openInputStream(imageRequest.getSourceUri()), -1);
    }

    public ap(Executor executor, f fVar, ContentResolver contentResolver) {
        super(executor, fVar);
        this.f24080a = contentResolver;
    }
}
