package com.facebook.imagepipeline.animated.factory;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.CloseableImage;

public interface b {
    CloseableImage decodeGif(com.facebook.imagepipeline.image.b bVar, ImageDecodeOptions imageDecodeOptions, Bitmap.Config config);

    CloseableImage decodeWebP(com.facebook.imagepipeline.image.b bVar, ImageDecodeOptions imageDecodeOptions, Bitmap.Config config);
}
