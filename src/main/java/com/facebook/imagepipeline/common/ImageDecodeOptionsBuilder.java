package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.factory.AnimatedFactoryProvider;
import com.facebook.imagepipeline.b.c;
import com.facebook.imagepipeline.f.a;
import javax.annotation.Nullable;

public class ImageDecodeOptionsBuilder {
    private Bitmap.Config mBitmapConfig = Bitmap.Config.ARGB_8888;
    @Nullable
    private a mBitmapTransformation;
    @Nullable
    private c mCustomImageDecoder;
    private boolean mDecodeAllFrames;
    private boolean mDecodePreviewFrame;
    private boolean mForceStaticImage;
    private int mMinDecodeIntervalMs = 100;
    private int mPreDecodeFrameCount = AnimatedFactoryProvider.getDefaultPreDecodeCount();
    private boolean mTransformToSRGB;
    private boolean mUseLastFrameForPreview;

    public Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
    }

    @Nullable
    public a getBitmapTransformation() {
        return this.mBitmapTransformation;
    }

    @Nullable
    public c getCustomImageDecoder() {
        return this.mCustomImageDecoder;
    }

    public boolean getDecodeAllFrames() {
        return this.mDecodeAllFrames;
    }

    public boolean getDecodePreviewFrame() {
        return this.mDecodePreviewFrame;
    }

    public boolean getForceStaticImage() {
        return this.mForceStaticImage;
    }

    public int getMinDecodeIntervalMs() {
        return this.mMinDecodeIntervalMs;
    }

    public int getPreDecodeFrameCount() {
        return this.mPreDecodeFrameCount;
    }

    public boolean getTransformToSRGB() {
        return this.mTransformToSRGB;
    }

    public boolean getUseLastFrameForPreview() {
        return this.mUseLastFrameForPreview;
    }

    public ImageDecodeOptions build() {
        return new ImageDecodeOptions(this);
    }

    public ImageDecodeOptionsBuilder setBitmapConfig(Bitmap.Config config) {
        this.mBitmapConfig = config;
        return this;
    }

    public ImageDecodeOptionsBuilder setBitmapTransformation(@Nullable a aVar) {
        this.mBitmapTransformation = aVar;
        return this;
    }

    public ImageDecodeOptionsBuilder setCustomImageDecoder(@Nullable c cVar) {
        this.mCustomImageDecoder = cVar;
        return this;
    }

    public ImageDecodeOptionsBuilder setDecodeAllFrames(boolean z) {
        this.mDecodeAllFrames = z;
        return this;
    }

    public ImageDecodeOptionsBuilder setDecodePreviewFrame(boolean z) {
        this.mDecodePreviewFrame = z;
        return this;
    }

    public ImageDecodeOptionsBuilder setForceStaticImage(boolean z) {
        this.mForceStaticImage = z;
        return this;
    }

    public ImageDecodeOptionsBuilder setMinDecodeIntervalMs(int i) {
        this.mMinDecodeIntervalMs = i;
        return this;
    }

    public ImageDecodeOptionsBuilder setPreDecodeFrameCount(int i) {
        this.mPreDecodeFrameCount = i;
        return this;
    }

    public ImageDecodeOptionsBuilder setTransformToSRGB(boolean z) {
        this.mTransformToSRGB = z;
        return this;
    }

    public ImageDecodeOptionsBuilder setUseLastFrameForPreview(boolean z) {
        this.mUseLastFrameForPreview = z;
        return this;
    }

    public ImageDecodeOptionsBuilder setFrom(ImageDecodeOptions imageDecodeOptions) {
        this.mDecodePreviewFrame = imageDecodeOptions.decodePreviewFrame;
        this.mPreDecodeFrameCount = imageDecodeOptions.preDecodeFrameCount;
        this.mUseLastFrameForPreview = imageDecodeOptions.useLastFrameForPreview;
        this.mDecodeAllFrames = imageDecodeOptions.decodeAllFrames;
        this.mForceStaticImage = imageDecodeOptions.forceStaticImage;
        this.mBitmapConfig = imageDecodeOptions.bitmapConfig;
        this.mCustomImageDecoder = imageDecodeOptions.customImageDecoder;
        this.mTransformToSRGB = imageDecodeOptions.transformToSRGB;
        this.mBitmapTransformation = imageDecodeOptions.bitmapTransformation;
        return this;
    }
}
