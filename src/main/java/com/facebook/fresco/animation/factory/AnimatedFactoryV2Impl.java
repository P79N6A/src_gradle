package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.executors.h;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Supplier;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.animated.b.b;
import com.facebook.imagepipeline.animated.c.a;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.imagepipeline.animated.factory.c;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.g;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.d;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@DoNotStrip
@NotThreadSafe
public class AnimatedFactoryV2Impl implements AnimatedFactory {
    public static int sAnimationCachingStrategy = 1;
    @Nullable
    private b mAnimatedDrawableBackendProvider;
    @Nullable
    private DrawableFactory mAnimatedDrawableFactory;
    @Nullable
    private a mAnimatedDrawableUtil;
    @Nullable
    private com.facebook.imagepipeline.animated.factory.b mAnimatedImageFactory;
    private final g<CacheKey, CloseableImage> mBackingCache;
    private final ExecutorSupplier mExecutorSupplier;
    private final PlatformBitmapFactory mPlatformBitmapFactory;

    private com.facebook.imagepipeline.animated.factory.b buildAnimatedImageFactory() {
        return new c(new b() {
            public com.facebook.imagepipeline.animated.a.a get(com.facebook.imagepipeline.animated.a.g gVar, Rect rect) {
                return new com.facebook.imagepipeline.animated.b.a(AnimatedFactoryV2Impl.this.getAnimatedDrawableUtil(), gVar, rect);
            }
        }, this.mPlatformBitmapFactory);
    }

    private b getAnimatedDrawableBackendProvider() {
        if (this.mAnimatedDrawableBackendProvider == null) {
            this.mAnimatedDrawableBackendProvider = new b() {
                public com.facebook.imagepipeline.animated.a.a get(com.facebook.imagepipeline.animated.a.g gVar, Rect rect) {
                    return new com.facebook.imagepipeline.animated.b.a(AnimatedFactoryV2Impl.this.getAnimatedDrawableUtil(), gVar, rect);
                }
            };
        }
        return this.mAnimatedDrawableBackendProvider;
    }

    public a getAnimatedDrawableUtil() {
        if (this.mAnimatedDrawableUtil == null) {
            this.mAnimatedDrawableUtil = new a();
        }
        return this.mAnimatedDrawableUtil;
    }

    public com.facebook.imagepipeline.animated.factory.b getAnimatedImageFactory() {
        if (this.mAnimatedImageFactory == null) {
            this.mAnimatedImageFactory = buildAnimatedImageFactory();
        }
        return this.mAnimatedImageFactory;
    }

    private ExperimentalBitmapAnimationDrawableFactory createDrawableFactory() {
        AnonymousClass3 r7 = new Supplier<Integer>() {
            public Integer get() {
                return Integer.valueOf(AnimatedFactoryV2Impl.sAnimationCachingStrategy);
            }
        };
        ExperimentalBitmapAnimationDrawableFactory experimentalBitmapAnimationDrawableFactory = new ExperimentalBitmapAnimationDrawableFactory(getAnimatedDrawableBackendProvider(), h.a(), new com.facebook.common.executors.b(this.mExecutorSupplier.forDecode()), RealtimeSinceBootClock.get(), this.mPlatformBitmapFactory, this.mBackingCache, r7, new Supplier<Integer>() {
            public Integer get() {
                return 3;
            }
        });
        return experimentalBitmapAnimationDrawableFactory;
    }

    public static void setAnimationCachingStrategy(int i) {
        sAnimationCachingStrategy = i;
    }

    public com.facebook.imagepipeline.b.c getGifDecoder(final Bitmap.Config config) {
        return new com.facebook.imagepipeline.b.c() {
            public CloseableImage decode(com.facebook.imagepipeline.image.b bVar, int i, d dVar, ImageDecodeOptions imageDecodeOptions) {
                return AnimatedFactoryV2Impl.this.getAnimatedImageFactory().decodeGif(bVar, imageDecodeOptions, config);
            }
        };
    }

    public com.facebook.imagepipeline.b.c getWebPDecoder(final Bitmap.Config config) {
        return new com.facebook.imagepipeline.b.c() {
            public CloseableImage decode(com.facebook.imagepipeline.image.b bVar, int i, d dVar, ImageDecodeOptions imageDecodeOptions) {
                return AnimatedFactoryV2Impl.this.getAnimatedImageFactory().decodeWebP(bVar, imageDecodeOptions, config);
            }
        };
    }

    @Nullable
    public DrawableFactory getAnimatedDrawableFactory(Context context) {
        if (this.mAnimatedDrawableFactory == null) {
            this.mAnimatedDrawableFactory = createDrawableFactory();
        }
        return this.mAnimatedDrawableFactory;
    }

    @DoNotStrip
    public AnimatedFactoryV2Impl(PlatformBitmapFactory platformBitmapFactory, ExecutorSupplier executorSupplier, g<CacheKey, CloseableImage> gVar) {
        this.mPlatformBitmapFactory = platformBitmapFactory;
        this.mExecutorSupplier = executorSupplier;
        this.mBackingCache = gVar;
    }
}
