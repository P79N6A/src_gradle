package com.facebook.imagepipeline.animated.factory;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.g;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import com.facebook.imagepipeline.image.CloseableImage;

public class AnimatedFactoryProvider {
    private static d sAnimatedTempBitmapFactory;
    private static AnimatedFactory sImpl;
    private static boolean sImplLoaded;
    private static int sPreDecodeCount;

    public static d getAnimatedTempBitmapFactory() {
        return sAnimatedTempBitmapFactory;
    }

    public static int getDefaultPreDecodeCount() {
        return sPreDecodeCount;
    }

    public static void setAnimatedTempBitmapFactory(d dVar) {
        sAnimatedTempBitmapFactory = dVar;
    }

    public static void setDefaultPreDecodeCount(int i) {
        sPreDecodeCount = i;
    }

    public static AnimatedFactory getAnimatedFactory(PlatformBitmapFactory platformBitmapFactory, ExecutorSupplier executorSupplier, g<CacheKey, CloseableImage> gVar) {
        if (!sImplLoaded) {
            try {
                sImpl = (AnimatedFactory) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(new Class[]{PlatformBitmapFactory.class, ExecutorSupplier.class, g.class}).newInstance(new Object[]{platformBitmapFactory, executorSupplier, gVar});
            } catch (Throwable unused) {
            }
            if (sImpl != null) {
                sImplLoaded = true;
            }
        }
        return sImpl;
    }
}
