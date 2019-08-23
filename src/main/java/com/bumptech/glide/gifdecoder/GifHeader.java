package com.bumptech.glide.gifdecoder;

import android.support.annotation.ColorInt;
import java.util.ArrayList;
import java.util.List;

public class GifHeader {
    @ColorInt
    int bgColor;
    int bgIndex;
    GifFrame currentFrame;
    int frameCount;
    final List<GifFrame> frames = new ArrayList();
    @ColorInt
    int[] gct;
    boolean gctFlag;
    int gctSize;
    int height;
    int loopCount = -1;
    int pixelAspect;
    int status;
    int width;

    public int getHeight() {
        return this.height;
    }

    public int getNumFrames() {
        return this.frameCount;
    }

    public int getStatus() {
        return this.status;
    }

    public int getWidth() {
        return this.width;
    }
}
