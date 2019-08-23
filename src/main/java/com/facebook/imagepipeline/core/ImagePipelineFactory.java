package com.facebook.imagepipeline.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.facebook.b.d;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.e;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.imagepipeline.animated.factory.AnimatedFactoryProvider;
import com.facebook.imagepipeline.b.c;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.cache.a;
import com.facebook.imagepipeline.cache.b;
import com.facebook.imagepipeline.cache.g;
import com.facebook.imagepipeline.cache.j;
import com.facebook.imagepipeline.cache.k;
import com.facebook.imagepipeline.cache.m;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.memory.ae;
import com.facebook.imagepipeline.producers.aw;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class ImagePipelineFactory {
    private static final Class<?> TAG = ImagePipelineFactory.class;
    private static c sHeifDecoder;
    private static ImagePipelineFactory sInstance;
    private AnimatedFactory mAnimatedFactory;
    private g<CacheKey, CloseableImage> mBitmapCountingMemoryCache;
    private m<CacheKey, CloseableImage> mBitmapMemoryCache;
    private final ImagePipelineConfig mConfig;
    private g<CacheKey, e> mEncodedCountingMemoryCache;
    private m<CacheKey, e> mEncodedMemoryCache;
    private c mImageDecoder;
    private ImagePipeline mImagePipeline;
    private com.facebook.imagepipeline.transcoder.c mImageTranscoderFactory;
    private com.facebook.imagepipeline.cache.e mMainBufferedDiskCache;
    private FileCache mMainFileCache;
    private PlatformBitmapFactory mPlatformBitmapFactory;
    private f mPlatformDecoder;
    private h mProducerFactory;
    private i mProducerSequenceFactory;
    private com.facebook.imagepipeline.cache.e mSmallImageBufferedDiskCache;
    private FileCache mSmallImageFileCache;
    private final aw mThreadHandoffProducerQueue;

    public static ImagePipelineFactory getInstance() {
        return (ImagePipelineFactory) Preconditions.checkNotNull(sInstance, "ImagePipelineFactory was not initialized!");
    }

    public static synchronized boolean hasBeenInitialized() {
        boolean z;
        synchronized (ImagePipelineFactory.class) {
            if (sInstance != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Nullable
    public AnimatedFactory getAnimatedFactory() {
        if (this.mAnimatedFactory == null) {
            this.mAnimatedFactory = AnimatedFactoryProvider.getAnimatedFactory(getPlatformBitmapFactory(), this.mConfig.getExecutorSupplier(), getBitmapCountingMemoryCache());
        }
        return this.mAnimatedFactory;
    }

    public g<CacheKey, CloseableImage> getBitmapCountingMemoryCache() {
        if (this.mBitmapCountingMemoryCache == null) {
            this.mBitmapCountingMemoryCache = a.get(this.mConfig.getBitmapMemoryCacheParamsSupplier(), this.mConfig.getMemoryTrimmableRegistry(), this.mConfig.getBitmapMemoryCacheTrimStrategy());
        }
        return this.mBitmapCountingMemoryCache;
    }

    public m<CacheKey, CloseableImage> getBitmapMemoryCache() {
        if (this.mBitmapMemoryCache == null) {
            this.mBitmapMemoryCache = b.get(getBitmapCountingMemoryCache(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mBitmapMemoryCache;
    }

    public g<CacheKey, e> getEncodedCountingMemoryCache() {
        if (this.mEncodedCountingMemoryCache == null) {
            this.mEncodedCountingMemoryCache = j.get(this.mConfig.getEncodedMemoryCacheParamsSupplier(), this.mConfig.getMemoryTrimmableRegistry());
        }
        return this.mEncodedCountingMemoryCache;
    }

    public m<CacheKey, e> getEncodedMemoryCache() {
        if (this.mEncodedMemoryCache == null) {
            this.mEncodedMemoryCache = k.get(getEncodedCountingMemoryCache(), this.mConfig.getImageCacheStatsTracker());
        }
        return this.mEncodedMemoryCache;
    }

    public FileCache getMainFileCache() {
        if (this.mMainFileCache == null) {
            this.mMainFileCache = this.mConfig.getFileCacheFactory().get(this.mConfig.getMainDiskCacheConfig());
        }
        return this.mMainFileCache;
    }

    public PlatformBitmapFactory getPlatformBitmapFactory() {
        if (this.mPlatformBitmapFactory == null) {
            this.mPlatformBitmapFactory = buildPlatformBitmapFactory(this.mConfig.getPoolFactory(), getPlatformDecoder());
        }
        return this.mPlatformBitmapFactory;
    }

    public f getPlatformDecoder() {
        if (this.mPlatformDecoder == null) {
            this.mPlatformDecoder = buildPlatformDecoder(this.mConfig.getPoolFactory(), this.mConfig.getExperiments().mGingerbreadDecoderEnabled);
        }
        return this.mPlatformDecoder;
    }

    public FileCache getSmallImageFileCache() {
        if (this.mSmallImageFileCache == null) {
            this.mSmallImageFileCache = this.mConfig.getFileCacheFactory().get(this.mConfig.getSmallImageDiskCacheConfig());
        }
        return this.mSmallImageFileCache;
    }

    public static synchronized void shutDown() {
        synchronized (ImagePipelineFactory.class) {
            if (sInstance != null) {
                sInstance.getBitmapMemoryCache().removeAll(com.facebook.common.internal.a.a());
                sInstance.getEncodedMemoryCache().removeAll(com.facebook.common.internal.a.a());
                sInstance = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public c buildHeifDecoder() {
        if (sHeifDecoder == null) {
            try {
                sHeifDecoder = (c) Class.forName("com.bytedance.fresco.heif.HeifDecoder$HeifFormatDecoder").getConstructor(new Class[]{com.facebook.common.memory.f.class}).newInstance(new Object[]{this.mConfig.getPoolFactory().getPooledByteBufferFactory()});
            } catch (Throwable unused) {
                return null;
            }
        }
        return sHeifDecoder;
    }

    private c getImageDecoder() {
        c cVar;
        c cVar2;
        if (this.mImageDecoder == null) {
            if (this.mConfig.getImageDecoder() != null) {
                this.mImageDecoder = this.mConfig.getImageDecoder();
            } else {
                AnimatedFactory animatedFactory = getAnimatedFactory();
                c buildHeifDecoder = buildHeifDecoder();
                if (animatedFactory != null) {
                    c gifDecoder = animatedFactory.getGifDecoder(Bitmap.Config.RGB_565);
                    cVar = animatedFactory.getWebPDecoder(Bitmap.Config.RGB_565);
                    cVar2 = gifDecoder;
                } else {
                    cVar2 = null;
                    cVar = null;
                }
                if (this.mConfig.getImageDecoderConfig() == null) {
                    this.mImageDecoder = new com.facebook.imagepipeline.b.b(cVar2, cVar, buildHeifDecoder, getPlatformDecoder());
                } else {
                    com.facebook.imagepipeline.b.b bVar = new com.facebook.imagepipeline.b.b(cVar2, cVar, buildHeifDecoder, getPlatformDecoder(), this.mConfig.getImageDecoderConfig().mCustomImageDecoders);
                    this.mImageDecoder = bVar;
                    d b2 = d.b();
                    b2.f23298a = this.mConfig.getImageDecoderConfig().mCustomImageFormats;
                    b2.a();
                }
            }
        }
        return this.mImageDecoder;
    }

    private i getProducerSequenceFactory() {
        boolean z;
        if (Build.VERSION.SDK_INT < 24 || !this.mConfig.getExperiments().mUseBitmapPrepareToDraw) {
            z = false;
        } else {
            z = true;
        }
        if (this.mProducerSequenceFactory == null) {
            i iVar = new i(this.mConfig.getContext().getApplicationContext().getContentResolver(), getProducerFactory(), this.mConfig.getNetworkFetcher(), this.mConfig.isResizeAndRotateEnabledForNetwork(), this.mConfig.getExperiments().mWebpSupportEnabled, this.mThreadHandoffProducerQueue, this.mConfig.isDownsampleEnabled(), z, this.mConfig.getExperiments().mPartialImageCachingEnabled, this.mConfig.isDiskCacheEnabled(), getImageTranscoderFactory());
            this.mProducerSequenceFactory = iVar;
        }
        return this.mProducerSequenceFactory;
    }

    private com.facebook.imagepipeline.cache.e getSmallImageBufferedDiskCache() {
        if (this.mSmallImageBufferedDiskCache == null) {
            com.facebook.imagepipeline.cache.e eVar = new com.facebook.imagepipeline.cache.e(getSmallImageFileCache(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(this.mConfig.getMemoryChunkType()), this.mConfig.getPoolFactory().getPooledByteStreams(), this.mConfig.getExecutorSupplier().forLocalStorageRead(), this.mConfig.getExecutorSupplier().forLocalStorageWrite(), this.mConfig.getImageCacheStatsTracker());
            this.mSmallImageBufferedDiskCache = eVar;
        }
        return this.mSmallImageBufferedDiskCache;
    }

    public ImagePipeline getImagePipeline() {
        if (this.mImagePipeline == null) {
            ImagePipeline imagePipeline = new ImagePipeline(getProducerSequenceFactory(), this.mConfig.getRequestListeners(), this.mConfig.getIsPrefetchEnabledSupplier(), getBitmapMemoryCache(), getEncodedMemoryCache(), getMainBufferedDiskCache(), getSmallImageBufferedDiskCache(), this.mConfig.getCacheKeyFactory(), this.mThreadHandoffProducerQueue, com.facebook.common.internal.j.a(Boolean.FALSE), this.mConfig.getExperiments().mLazyDataSource);
            this.mImagePipeline = imagePipeline;
        }
        return this.mImagePipeline;
    }

    /* access modifiers changed from: protected */
    public com.facebook.imagepipeline.transcoder.c getImageTranscoderFactory() {
        if (this.mImageTranscoderFactory == null) {
            if (this.mConfig.getImageTranscoderFactory() == null && this.mConfig.getImageTranscoderType() == null && this.mConfig.getExperiments().mNativeCodeDisabled) {
                this.mImageTranscoderFactory = new com.facebook.imagepipeline.transcoder.g(this.mConfig.getExperiments().mMaxBitmapSize);
            } else {
                this.mImageTranscoderFactory = new com.facebook.imagepipeline.transcoder.e(this.mConfig.getExperiments().mMaxBitmapSize, this.mConfig.getExperiments().mUseDownsamplingRatioForResizing, this.mConfig.getImageTranscoderFactory(), this.mConfig.getImageTranscoderType());
            }
        }
        return this.mImageTranscoderFactory;
    }

    public com.facebook.imagepipeline.cache.e getMainBufferedDiskCache() {
        if (this.mMainBufferedDiskCache == null) {
            com.facebook.imagepipeline.cache.e eVar = new com.facebook.imagepipeline.cache.e(getMainFileCache(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(this.mConfig.getMemoryChunkType()), this.mConfig.getPoolFactory().getPooledByteStreams(), this.mConfig.getExecutorSupplier().forLocalStorageRead(), this.mConfig.getExecutorSupplier().forLocalStorageWrite(), this.mConfig.getImageCacheStatsTracker());
            this.mMainBufferedDiskCache = eVar;
        }
        return this.mMainBufferedDiskCache;
    }

    private h getProducerFactory() {
        if (this.mProducerFactory == null) {
            this.mProducerFactory = this.mConfig.getExperiments().mProducerFactoryMethod.createProducerFactory(this.mConfig.getContext(), this.mConfig.getPoolFactory().getSmallByteArrayPool(), getImageDecoder(), this.mConfig.getProgressiveJpegConfig(), this.mConfig.isDownsampleEnabled(), this.mConfig.isResizeAndRotateEnabledForNetwork(), this.mConfig.getExperiments().mDecodeCancellationEnabled, this.mConfig.getExecutorSupplier(), this.mConfig.getPoolFactory().getPooledByteBufferFactory(this.mConfig.getMemoryChunkType()), getBitmapMemoryCache(), getEncodedMemoryCache(), getMainBufferedDiskCache(), getSmallImageBufferedDiskCache(), this.mConfig.getCacheKeyFactory(), getPlatformBitmapFactory(), this.mConfig.getExperiments().mBitmapPrepareToDrawMinSizeBytes, this.mConfig.getExperiments().mBitmapPrepareToDrawMaxSizeBytes, this.mConfig.getExperiments().mBitmapPrepareToDrawForPrefetch, this.mConfig.getExperiments().mMaxBitmapSize);
        }
        return this.mProducerFactory;
    }

    public static void setInstance(ImagePipelineFactory imagePipelineFactory) {
        sInstance = imagePipelineFactory;
    }

    @Nullable
    public DrawableFactory getAnimatedDrawableFactory(Context context) {
        AnimatedFactory animatedFactory = getAnimatedFactory();
        if (animatedFactory == null) {
            return null;
        }
        return animatedFactory.getAnimatedDrawableFactory(context);
    }

    public static synchronized void initialize(ImagePipelineConfig imagePipelineConfig) {
        synchronized (ImagePipelineFactory.class) {
            if (sInstance != null) {
                FLog.w(TAG, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            sInstance = new ImagePipelineFactory(imagePipelineConfig);
        }
    }

    public ImagePipelineFactory(ImagePipelineConfig imagePipelineConfig) {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ImagePipelineConfig()");
        }
        this.mConfig = (ImagePipelineConfig) Preconditions.checkNotNull(imagePipelineConfig);
        this.mThreadHandoffProducerQueue = new aw(imagePipelineConfig.getExecutorSupplier().forLightweightBackgroundTasks());
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
    }

    public static synchronized void initialize(Context context) {
        synchronized (ImagePipelineFactory.class) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("ImagePipelineFactory#initialize");
            }
            initialize(ImagePipelineConfig.newBuilder(context).build());
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
    }

    public static PlatformBitmapFactory buildPlatformBitmapFactory(ae aeVar, f fVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new com.facebook.imagepipeline.bitmaps.a(aeVar.getBitmapPool());
        }
        if (Build.VERSION.SDK_INT >= 11) {
            return new com.facebook.imagepipeline.bitmaps.e(new com.facebook.imagepipeline.bitmaps.b(aeVar.getPooledByteBufferFactory()), fVar);
        }
        return new com.facebook.imagepipeline.bitmaps.c();
    }

    public static f buildPlatformDecoder(ae aeVar, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            int flexByteArrayPoolMaxNumThreads = aeVar.getFlexByteArrayPoolMaxNumThreads();
            return new com.facebook.imagepipeline.c.e(aeVar.getBitmapPool(), flexByteArrayPoolMaxNumThreads, new Pools.SynchronizedPool(flexByteArrayPoolMaxNumThreads));
        } else if (Build.VERSION.SDK_INT >= 21) {
            int flexByteArrayPoolMaxNumThreads2 = aeVar.getFlexByteArrayPoolMaxNumThreads();
            return new com.facebook.imagepipeline.c.a(aeVar.getBitmapPool(), flexByteArrayPoolMaxNumThreads2, new Pools.SynchronizedPool(flexByteArrayPoolMaxNumThreads2));
        } else if (!z || Build.VERSION.SDK_INT >= 19) {
            return new com.facebook.imagepipeline.c.d(aeVar.getFlexByteArrayPool());
        } else {
            return new com.facebook.imagepipeline.c.c();
        }
    }
}
