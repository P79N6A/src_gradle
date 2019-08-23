package com.facebook.imagepipeline.animated.a;

public final class b {
    public final a blendOperation;
    public final C0264b disposalMethod;
    public final int frameNumber;
    public final int height;
    public final int width;
    public final int xOffset;
    public final int yOffset;

    public enum a {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    /* renamed from: com.facebook.imagepipeline.animated.a.b$b  reason: collision with other inner class name */
    public enum C0264b {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    public b(int i, int i2, int i3, int i4, int i5, a aVar, C0264b bVar) {
        this.frameNumber = i;
        this.xOffset = i2;
        this.yOffset = i3;
        this.width = i4;
        this.height = i5;
        this.blendOperation = aVar;
        this.disposalMethod = bVar;
    }
}
