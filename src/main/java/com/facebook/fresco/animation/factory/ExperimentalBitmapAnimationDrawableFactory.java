package com.facebook.fresco.animation.factory;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.backend.AnimationBackendDelegateWithInactivityCheck;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameRenderer;
import com.facebook.fresco.animation.bitmap.cache.FrescoFrameCache;
import com.facebook.fresco.animation.bitmap.cache.KeepLastFrameCache;
import com.facebook.fresco.animation.bitmap.cache.NoOpCache;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparer;
import com.facebook.fresco.animation.bitmap.preparation.DefaultBitmapFramePreparer;
import com.facebook.fresco.animation.bitmap.preparation.FixedNumberBitmapFramePreparationStrategy;
import com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendAnimationInformation;
import com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.imagepipeline.animated.a.a;
import com.facebook.imagepipeline.animated.a.e;
import com.facebook.imagepipeline.animated.b.b;
import com.facebook.imagepipeline.animated.b.c;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.g;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableAnimatedImage;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public class ExperimentalBitmapAnimationDrawableFactory implements DrawableFactory {
    private final b mAnimatedDrawableBackendProvider;
    private final g<CacheKey, CloseableImage> mBackingCache;
    private final Supplier<Integer> mCachingStrategySupplier;
    private final ExecutorService mExecutorServiceForFramePreparing;
    private final com.facebook.common.time.b mMonotonicClock;
    private final Supplier<Integer> mNumberOfFramesToPrepareSupplier;
    private final PlatformBitmapFactory mPlatformBitmapFactory;
    private final ScheduledExecutorService mScheduledExecutorServiceForUiThread;

    public static class AnimationFrameCacheKey implements CacheKey {
        private final String mAnimationUriString;

        public String getUriString() {
            return this.mAnimationUriString;
        }

        public String toString() {
            return this.mAnimationUriString;
        }

        public int hashCode() {
            if (this.mAnimationUriString != null) {
                return this.mAnimationUriString.hashCode();
            }
            return 0;
        }

        public boolean containsUri(Uri uri) {
            return uri.toString().startsWith(this.mAnimationUriString);
        }

        public AnimationFrameCacheKey(int i) {
            this.mAnimationUriString = "anim://" + i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnimationFrameCacheKey animationFrameCacheKey = (AnimationFrameCacheKey) obj;
            if (this.mAnimationUriString != null) {
                return this.mAnimationUriString.equals(animationFrameCacheKey.mAnimationUriString);
            }
            if (animationFrameCacheKey.mAnimationUriString == null) {
                return true;
            }
            return false;
        }
    }

    public boolean supportsImageType(CloseableImage closeableImage) {
        return closeableImage instanceof CloseableAnimatedImage;
    }

    public AnimatedDrawable2 createDrawable(CloseableImage closeableImage) {
        return new AnimatedDrawable2(createAnimationBackend((CloseableAnimatedImage) closeableImage));
    }

    private a createAnimatedDrawableBackend(com.facebook.imagepipeline.animated.a.g gVar) {
        e eVar = gVar.mImage;
        return this.mAnimatedDrawableBackendProvider.get(gVar, new Rect(0, 0, eVar.getWidth(), eVar.getHeight()));
    }

    private c createAnimatedFrameCache(com.facebook.imagepipeline.animated.a.g gVar) {
        c cVar = new c(new AnimationFrameCacheKey(gVar.hashCode()), this.mBackingCache);
        int decodedFrameSize = gVar.getDecodedFrameSize();
        if (decodedFrameSize > 0) {
            for (int i = 0; i < decodedFrameSize; i++) {
                if (gVar.hasDecodedFrame(i)) {
                    cacheDecodedBitmap(cVar, i, gVar.getDecodedFrame(i));
                }
            }
        }
        return cVar;
    }

    private BitmapFrameCache createBitmapFrameCache(com.facebook.imagepipeline.animated.a.g gVar) {
        switch (((Integer) this.mCachingStrategySupplier.get()).intValue()) {
            case 1:
                return new FrescoFrameCache(createAnimatedFrameCache(gVar), true);
            case 2:
                return new FrescoFrameCache(createAnimatedFrameCache(gVar), false);
            case 3:
                return new KeepLastFrameCache();
            default:
                return new NoOpCache();
        }
    }

    private AnimationBackend createAnimationBackend(CloseableAnimatedImage closeableAnimatedImage) {
        BitmapFramePreparer bitmapFramePreparer;
        FixedNumberBitmapFramePreparationStrategy fixedNumberBitmapFramePreparationStrategy;
        com.facebook.imagepipeline.animated.a.g imageResult = closeableAnimatedImage.getImageResult();
        a createAnimatedDrawableBackend = createAnimatedDrawableBackend(imageResult);
        BitmapFrameCache createBitmapFrameCache = createBitmapFrameCache(imageResult);
        AnimatedDrawableBackendFrameRenderer animatedDrawableBackendFrameRenderer = new AnimatedDrawableBackendFrameRenderer(createBitmapFrameCache, createAnimatedDrawableBackend);
        int i = closeableAnimatedImage.getOptions().preDecodeFrameCount;
        if (i <= 0) {
            i = ((Integer) this.mNumberOfFramesToPrepareSupplier.get()).intValue();
        }
        if (i > 0) {
            FixedNumberBitmapFramePreparationStrategy fixedNumberBitmapFramePreparationStrategy2 = new FixedNumberBitmapFramePreparationStrategy(i);
            bitmapFramePreparer = createBitmapFramePreparer(animatedDrawableBackendFrameRenderer, closeableAnimatedImage.getOptions().bitmapConfig);
            fixedNumberBitmapFramePreparationStrategy = fixedNumberBitmapFramePreparationStrategy2;
        } else {
            fixedNumberBitmapFramePreparationStrategy = null;
            bitmapFramePreparer = null;
        }
        BitmapAnimationBackend bitmapAnimationBackend = new BitmapAnimationBackend(this.mPlatformBitmapFactory, createBitmapFrameCache, new AnimatedDrawableBackendAnimationInformation(createAnimatedDrawableBackend), animatedDrawableBackendFrameRenderer, fixedNumberBitmapFramePreparationStrategy, bitmapFramePreparer);
        bitmapAnimationBackend.setBitmapConfig(closeableAnimatedImage.getOptions().bitmapConfig);
        return AnimationBackendDelegateWithInactivityCheck.createForBackend(bitmapAnimationBackend, this.mMonotonicClock, this.mScheduledExecutorServiceForUiThread);
    }

    private BitmapFramePreparer createBitmapFramePreparer(BitmapFrameRenderer bitmapFrameRenderer, Bitmap.Config config) {
        return new DefaultBitmapFramePreparer(this.mPlatformBitmapFactory, bitmapFrameRenderer, config, this.mExecutorServiceForFramePreparing);
    }

    private void cacheDecodedBitmap(c cVar, int i, CloseableReference<Bitmap> closeableReference) {
        CloseableReference closeableReference2 = null;
        try {
            CloseableReference of = CloseableReference.of(new CloseableStaticBitmap(closeableReference, com.facebook.imagepipeline.image.c.FULL_QUALITY, 0));
            try {
                cVar.cache(i, of);
                CloseableReference.closeSafely(of);
            } catch (Throwable th) {
                th = th;
                closeableReference2 = of;
                CloseableReference.closeSafely(closeableReference2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            CloseableReference.closeSafely(closeableReference2);
            throw th;
        }
    }

    public ExperimentalBitmapAnimationDrawableFactory(b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, com.facebook.common.time.b bVar2, PlatformBitmapFactory platformBitmapFactory, g<CacheKey, CloseableImage> gVar, Supplier<Integer> supplier, Supplier<Integer> supplier2) {
        this.mAnimatedDrawableBackendProvider = bVar;
        this.mScheduledExecutorServiceForUiThread = scheduledExecutorService;
        this.mExecutorServiceForFramePreparing = executorService;
        this.mMonotonicClock = bVar2;
        this.mPlatformBitmapFactory = platformBitmapFactory;
        this.mBackingCache = gVar;
        this.mCachingStrategySupplier = supplier;
        this.mNumberOfFramesToPrepareSupplier = supplier2;
    }
}
