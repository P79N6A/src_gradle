package com.facebook.imagepipeline.animated.factory;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.b.c;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public interface AnimatedFactory {
    @Nullable
    DrawableFactory getAnimatedDrawableFactory(Context context);

    @Nullable
    c getGifDecoder(Bitmap.Config config);

    @Nullable
    c getWebPDecoder(Bitmap.Config config);
}
