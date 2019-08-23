package com.facebook.imagepipeline.image;

import com.facebook.imagepipeline.animated.a.e;
import com.facebook.imagepipeline.animated.a.g;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import javax.annotation.Nullable;

public class CloseableAnimatedImage extends CloseableImage {
    private g mImageResult;
    private final ImageDecodeOptions mOptions;

    public boolean isStateful() {
        return true;
    }

    public ImageDecodeOptions getOptions() {
        return this.mOptions;
    }

    public synchronized g getImageResult() {
        return this.mImageResult;
    }

    public synchronized boolean isClosed() {
        boolean z;
        if (this.mImageResult == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public void close() {
        synchronized (this) {
            if (this.mImageResult != null) {
                g gVar = this.mImageResult;
                this.mImageResult = null;
                gVar.dispose();
            }
        }
    }

    public synchronized int getHeight() {
        if (isClosed()) {
            return 0;
        }
        return this.mImageResult.mImage.getHeight();
    }

    @Nullable
    public synchronized e getImage() {
        if (isClosed()) {
            return null;
        }
        return this.mImageResult.mImage;
    }

    public synchronized int getSizeInBytes() {
        if (isClosed()) {
            return 0;
        }
        return this.mImageResult.mImage.getSizeInBytes();
    }

    public synchronized int getWidth() {
        if (isClosed()) {
            return 0;
        }
        return this.mImageResult.mImage.getWidth();
    }

    public CloseableAnimatedImage(g gVar, ImageDecodeOptions imageDecodeOptions) {
        this.mImageResult = gVar;
        this.mOptions = imageDecodeOptions;
    }
}
