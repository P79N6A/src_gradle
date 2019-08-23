package com.facebook.imagepipeline.b;

import com.facebook.imagepipeline.image.b;

public final class a extends RuntimeException {
    private final b mEncodedImage;

    public final b getEncodedImage() {
        return this.mEncodedImage;
    }

    public a(String str, b bVar) {
        super(str);
        this.mEncodedImage = bVar;
    }

    public a(String str, Throwable th, b bVar) {
        super(str, th);
        this.mEncodedImage = bVar;
    }
}
