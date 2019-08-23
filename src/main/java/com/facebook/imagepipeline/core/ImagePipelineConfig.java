package com.facebook.imagepipeline.core;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.cache.disk.b;
import com.facebook.common.g.b;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.NoOpMemoryTrimmableRegistry;
import com.facebook.imagepipeline.b.c;
import com.facebook.imagepipeline.b.d;
import com.facebook.imagepipeline.b.e;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.cache.g;
import com.facebook.imagepipeline.cache.h;
import com.facebook.imagepipeline.cache.i;
import com.facebook.imagepipeline.cache.l;
import com.facebook.imagepipeline.cache.q;
import com.facebook.imagepipeline.core.g;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.memory.ae;
import com.facebook.imagepipeline.producers.ah;
import com.facebook.imagepipeline.producers.t;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.ad;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ImagePipelineConfig {
    private static a sDefaultImageRequestConfig = new a((byte) 0);
    private final Bitmap.Config mBitmapConfig;
    private final Supplier<MemoryCacheParams> mBitmapMemoryCacheParamsSupplier;
    private final g.a mBitmapMemoryCacheTrimStrategy;
    private final CacheKeyFactory mCacheKeyFactory;
    private final Context mContext;
    private final boolean mDiskCacheEnabled;
    private final boolean mDownsampleEnabled;
    private final Supplier<MemoryCacheParams> mEncodedMemoryCacheParamsSupplier;
    private final ExecutorSupplier mExecutorSupplier;
    private final f mFileCacheFactory;
    private final int mHttpNetworkTimeout;
    private final l mImageCacheStatsTracker;
    @Nullable
    private final c mImageDecoder;
    @Nullable
    private final d mImageDecoderConfig;
    private final g mImagePipelineExperiments;
    @Nullable
    private final com.facebook.imagepipeline.transcoder.c mImageTranscoderFactory;
    @Nullable
    private final Integer mImageTranscoderType;
    private final Supplier<Boolean> mIsPrefetchEnabledSupplier;
    private final b mMainDiskCacheConfig;
    private final int mMemoryChunkType;
    private final com.facebook.common.memory.b mMemoryTrimmableRegistry;
    private final ah mNetworkFetcher;
    @Nullable
    private final PlatformBitmapFactory mPlatformBitmapFactory;
    private final ae mPoolFactory;
    private final e mProgressiveJpegConfig;
    private final Set<RequestListener> mRequestListeners;
    private final boolean mResizeAndRotateEnabledForNetwork;
    private final b mSmallImageDiskCacheConfig;

    public static class Builder {
        public Bitmap.Config mBitmapConfig;
        public Supplier<MemoryCacheParams> mBitmapMemoryCacheParamsSupplier;
        public g.a mBitmapMemoryCacheTrimStrategy;
        public CacheKeyFactory mCacheKeyFactory;
        public final Context mContext;
        public boolean mDiskCacheEnabled;
        public boolean mDownsampleEnabled;
        public Supplier<MemoryCacheParams> mEncodedMemoryCacheParamsSupplier;
        public ExecutorSupplier mExecutorSupplier;
        public final g.a mExperimentsBuilder;
        public f mFileCacheFactory;
        public int mHttpConnectionTimeout;
        public l mImageCacheStatsTracker;
        public c mImageDecoder;
        public d mImageDecoderConfig;
        public com.facebook.imagepipeline.transcoder.c mImageTranscoderFactory;
        @Nullable
        public Integer mImageTranscoderType;
        public Supplier<Boolean> mIsPrefetchEnabledSupplier;
        public b mMainDiskCacheConfig;
        @Nullable
        public Integer mMemoryChunkType;
        public com.facebook.common.memory.b mMemoryTrimmableRegistry;
        public ah mNetworkFetcher;
        public PlatformBitmapFactory mPlatformBitmapFactory;
        public ae mPoolFactory;
        public e mProgressiveJpegConfig;
        public Set<RequestListener> mRequestListeners;
        public boolean mResizeAndRotateEnabledForNetwork;
        public b mSmallImageDiskCacheConfig;

        public g.a experiment() {
            return this.mExperimentsBuilder;
        }

        @Nullable
        public Integer getImageTranscoderType() {
            return this.mImageTranscoderType;
        }

        @Nullable
        public Integer getMemoryChunkType() {
            return this.mMemoryChunkType;
        }

        public boolean isDiskCacheEnabled() {
            return this.mDiskCacheEnabled;
        }

        public boolean isDownsampleEnabled() {
            return this.mDownsampleEnabled;
        }

        public ImagePipelineConfig build$___twin___() {
            return new ImagePipelineConfig(this);
        }

        public ImagePipelineConfig build() {
            setMemoryTrimmableRegistry(ad.a());
            return build$___twin___();
        }

        public Builder setBitmapMemoryCacheTrimStrategy(g.a aVar) {
            this.mBitmapMemoryCacheTrimStrategy = aVar;
            return this;
        }

        public Builder setBitmapsConfig(Bitmap.Config config) {
            this.mBitmapConfig = config;
            return this;
        }

        public Builder setCacheKeyFactory(CacheKeyFactory cacheKeyFactory) {
            this.mCacheKeyFactory = cacheKeyFactory;
            return this;
        }

        public Builder setDiskCacheEnabled(boolean z) {
            this.mDiskCacheEnabled = z;
            return this;
        }

        public Builder setDownsampleEnabled(boolean z) {
            this.mDownsampleEnabled = z;
            return this;
        }

        public Builder setExecutorSupplier(ExecutorSupplier executorSupplier) {
            this.mExecutorSupplier = executorSupplier;
            return this;
        }

        public Builder setFileCacheFactory(f fVar) {
            this.mFileCacheFactory = fVar;
            return this;
        }

        public Builder setHttpConnectionTimeout(int i) {
            this.mHttpConnectionTimeout = i;
            return this;
        }

        public Builder setImageCacheStatsTracker(l lVar) {
            this.mImageCacheStatsTracker = lVar;
            return this;
        }

        public Builder setImageDecoder(c cVar) {
            this.mImageDecoder = cVar;
            return this;
        }

        public Builder setImageDecoderConfig(d dVar) {
            this.mImageDecoderConfig = dVar;
            return this;
        }

        public Builder setImageTranscoderFactory(com.facebook.imagepipeline.transcoder.c cVar) {
            this.mImageTranscoderFactory = cVar;
            return this;
        }

        public Builder setIsPrefetchEnabledSupplier(Supplier<Boolean> supplier) {
            this.mIsPrefetchEnabledSupplier = supplier;
            return this;
        }

        public Builder setMainDiskCacheConfig(b bVar) {
            this.mMainDiskCacheConfig = bVar;
            return this;
        }

        public Builder setMemoryTrimmableRegistry(com.facebook.common.memory.b bVar) {
            this.mMemoryTrimmableRegistry = bVar;
            return this;
        }

        public Builder setNetworkFetcher(ah ahVar) {
            this.mNetworkFetcher = ahVar;
            return this;
        }

        public Builder setPlatformBitmapFactory(PlatformBitmapFactory platformBitmapFactory) {
            this.mPlatformBitmapFactory = platformBitmapFactory;
            return this;
        }

        public Builder setPoolFactory(ae aeVar) {
            this.mPoolFactory = aeVar;
            return this;
        }

        public Builder setProgressiveJpegConfig(e eVar) {
            this.mProgressiveJpegConfig = eVar;
            return this;
        }

        public Builder setRequestListeners(Set<RequestListener> set) {
            this.mRequestListeners = set;
            return this;
        }

        public Builder setResizeAndRotateEnabledForNetwork(boolean z) {
            this.mResizeAndRotateEnabledForNetwork = z;
            return this;
        }

        public Builder setSmallImageDiskCacheConfig(b bVar) {
            this.mSmallImageDiskCacheConfig = bVar;
            return this;
        }

        public Builder setImageTranscoderType(int i) {
            this.mImageTranscoderType = Integer.valueOf(i);
            return this;
        }

        public Builder setMemoryChunkType(int i) {
            this.mMemoryChunkType = Integer.valueOf(i);
            return this;
        }

        public Builder setBitmapMemoryCacheParamsSupplier(Supplier<MemoryCacheParams> supplier) {
            this.mBitmapMemoryCacheParamsSupplier = (Supplier) Preconditions.checkNotNull(supplier);
            return this;
        }

        public Builder setEncodedMemoryCacheParamsSupplier(Supplier<MemoryCacheParams> supplier) {
            this.mEncodedMemoryCacheParamsSupplier = (Supplier) Preconditions.checkNotNull(supplier);
            return this;
        }

        private Builder(Context context) {
            this.mResizeAndRotateEnabledForNetwork = true;
            this.mHttpConnectionTimeout = -1;
            this.mExperimentsBuilder = new g.a(this);
            this.mDiskCacheEnabled = true;
            this.mContext = (Context) Preconditions.checkNotNull(context);
        }
    }

    public static class a {
        public boolean mProgressiveRenderingEnabled;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static a getDefaultImageRequestConfig() {
        return sDefaultImageRequestConfig;
    }

    public Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
    }

    public Supplier<MemoryCacheParams> getBitmapMemoryCacheParamsSupplier() {
        return this.mBitmapMemoryCacheParamsSupplier;
    }

    public g.a getBitmapMemoryCacheTrimStrategy() {
        return this.mBitmapMemoryCacheTrimStrategy;
    }

    public CacheKeyFactory getCacheKeyFactory() {
        return this.mCacheKeyFactory;
    }

    public Context getContext() {
        return this.mContext;
    }

    public Supplier<MemoryCacheParams> getEncodedMemoryCacheParamsSupplier() {
        return this.mEncodedMemoryCacheParamsSupplier;
    }

    public ExecutorSupplier getExecutorSupplier() {
        return this.mExecutorSupplier;
    }

    public g getExperiments() {
        return this.mImagePipelineExperiments;
    }

    public f getFileCacheFactory() {
        return this.mFileCacheFactory;
    }

    public l getImageCacheStatsTracker() {
        return this.mImageCacheStatsTracker;
    }

    @Nullable
    public c getImageDecoder() {
        return this.mImageDecoder;
    }

    @Nullable
    public d getImageDecoderConfig() {
        return this.mImageDecoderConfig;
    }

    @Nullable
    public com.facebook.imagepipeline.transcoder.c getImageTranscoderFactory() {
        return this.mImageTranscoderFactory;
    }

    @Nullable
    public Integer getImageTranscoderType() {
        return this.mImageTranscoderType;
    }

    public Supplier<Boolean> getIsPrefetchEnabledSupplier() {
        return this.mIsPrefetchEnabledSupplier;
    }

    public b getMainDiskCacheConfig() {
        return this.mMainDiskCacheConfig;
    }

    public int getMemoryChunkType() {
        return this.mMemoryChunkType;
    }

    public com.facebook.common.memory.b getMemoryTrimmableRegistry() {
        return this.mMemoryTrimmableRegistry;
    }

    public ah getNetworkFetcher() {
        return this.mNetworkFetcher;
    }

    @Nullable
    public PlatformBitmapFactory getPlatformBitmapFactory() {
        return this.mPlatformBitmapFactory;
    }

    public ae getPoolFactory() {
        return this.mPoolFactory;
    }

    public e getProgressiveJpegConfig() {
        return this.mProgressiveJpegConfig;
    }

    public b getSmallImageDiskCacheConfig() {
        return this.mSmallImageDiskCacheConfig;
    }

    public boolean isDiskCacheEnabled() {
        return this.mDiskCacheEnabled;
    }

    public boolean isDownsampleEnabled() {
        return this.mDownsampleEnabled;
    }

    public boolean isResizeAndRotateEnabledForNetwork() {
        return this.mResizeAndRotateEnabledForNetwork;
    }

    public Set<RequestListener> getRequestListeners() {
        return Collections.unmodifiableSet(this.mRequestListeners);
    }

    @VisibleForTesting
    static void resetDefaultRequestConfig() {
        sDefaultImageRequestConfig = new a((byte) 0);
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context);
    }

    @Nullable
    private static com.facebook.imagepipeline.transcoder.c getImageTranscoderFactory(Builder builder) {
        if (builder.mImageTranscoderFactory != null && builder.mImageTranscoderType != null) {
            throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
        } else if (builder.mImageTranscoderFactory != null) {
            return builder.mImageTranscoderFactory;
        } else {
            return null;
        }
    }

    private static b getDefaultMainDiskCacheConfig(Context context) {
        try {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return b.a(context).a();
        } finally {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
    }

    private ImagePipelineConfig(Builder builder) {
        Supplier<MemoryCacheParams> supplier;
        g.a aVar;
        Bitmap.Config config;
        CacheKeyFactory cacheKeyFactory;
        f fVar;
        Supplier<MemoryCacheParams> supplier2;
        l lVar;
        Supplier<Boolean> supplier3;
        b bVar;
        com.facebook.common.memory.b bVar2;
        int i;
        ah ahVar;
        ae aeVar;
        e eVar;
        Set<RequestListener> set;
        b bVar3;
        ExecutorSupplier executorSupplier;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ImagePipelineConfig()");
        }
        this.mImagePipelineExperiments = builder.mExperimentsBuilder.build();
        if (builder.mBitmapMemoryCacheParamsSupplier == null) {
            supplier = new h<>((ActivityManager) builder.mContext.getSystemService(PushConstants.INTENT_ACTIVITY_NAME));
        } else {
            supplier = builder.mBitmapMemoryCacheParamsSupplier;
        }
        this.mBitmapMemoryCacheParamsSupplier = supplier;
        if (builder.mBitmapMemoryCacheTrimStrategy == null) {
            aVar = new com.facebook.imagepipeline.cache.d();
        } else {
            aVar = builder.mBitmapMemoryCacheTrimStrategy;
        }
        this.mBitmapMemoryCacheTrimStrategy = aVar;
        if (builder.mBitmapConfig == null) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = builder.mBitmapConfig;
        }
        this.mBitmapConfig = config;
        if (builder.mCacheKeyFactory == null) {
            cacheKeyFactory = DefaultCacheKeyFactory.getInstance();
        } else {
            cacheKeyFactory = builder.mCacheKeyFactory;
        }
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mContext = (Context) Preconditions.checkNotNull(builder.mContext);
        if (builder.mFileCacheFactory == null) {
            fVar = new c(new e());
        } else {
            fVar = builder.mFileCacheFactory;
        }
        this.mFileCacheFactory = fVar;
        this.mDownsampleEnabled = builder.mDownsampleEnabled;
        if (builder.mEncodedMemoryCacheParamsSupplier == null) {
            supplier2 = new i<>();
        } else {
            supplier2 = builder.mEncodedMemoryCacheParamsSupplier;
        }
        this.mEncodedMemoryCacheParamsSupplier = supplier2;
        if (builder.mImageCacheStatsTracker == null) {
            lVar = q.getInstance();
        } else {
            lVar = builder.mImageCacheStatsTracker;
        }
        this.mImageCacheStatsTracker = lVar;
        this.mImageDecoder = builder.mImageDecoder;
        this.mImageTranscoderFactory = getImageTranscoderFactory(builder);
        this.mImageTranscoderType = builder.mImageTranscoderType;
        if (builder.mIsPrefetchEnabledSupplier == null) {
            supplier3 = new Supplier<Boolean>() {
                public final Boolean get() {
                    return Boolean.TRUE;
                }
            };
        } else {
            supplier3 = builder.mIsPrefetchEnabledSupplier;
        }
        this.mIsPrefetchEnabledSupplier = supplier3;
        if (builder.mMainDiskCacheConfig == null) {
            bVar = getDefaultMainDiskCacheConfig(builder.mContext);
        } else {
            bVar = builder.mMainDiskCacheConfig;
        }
        this.mMainDiskCacheConfig = bVar;
        if (builder.mMemoryTrimmableRegistry == null) {
            bVar2 = NoOpMemoryTrimmableRegistry.getInstance();
        } else {
            bVar2 = builder.mMemoryTrimmableRegistry;
        }
        this.mMemoryTrimmableRegistry = bVar2;
        this.mMemoryChunkType = getMemoryChunkType(builder, this.mImagePipelineExperiments);
        if (builder.mHttpConnectionTimeout < 0) {
            i = 30000;
        } else {
            i = builder.mHttpConnectionTimeout;
        }
        this.mHttpNetworkTimeout = i;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ImagePipelineConfig->mNetworkFetcher");
        }
        if (builder.mNetworkFetcher == null) {
            ahVar = new t(this.mHttpNetworkTimeout);
        } else {
            ahVar = builder.mNetworkFetcher;
        }
        this.mNetworkFetcher = ahVar;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        this.mPlatformBitmapFactory = builder.mPlatformBitmapFactory;
        if (builder.mPoolFactory == null) {
            aeVar = new ae(com.facebook.imagepipeline.memory.ad.newBuilder().build());
        } else {
            aeVar = builder.mPoolFactory;
        }
        this.mPoolFactory = aeVar;
        if (builder.mProgressiveJpegConfig == null) {
            eVar = new com.facebook.imagepipeline.b.g();
        } else {
            eVar = builder.mProgressiveJpegConfig;
        }
        this.mProgressiveJpegConfig = eVar;
        if (builder.mRequestListeners == null) {
            set = new HashSet<>();
        } else {
            set = builder.mRequestListeners;
        }
        this.mRequestListeners = set;
        this.mResizeAndRotateEnabledForNetwork = builder.mResizeAndRotateEnabledForNetwork;
        if (builder.mSmallImageDiskCacheConfig == null) {
            bVar3 = this.mMainDiskCacheConfig;
        } else {
            bVar3 = builder.mSmallImageDiskCacheConfig;
        }
        this.mSmallImageDiskCacheConfig = bVar3;
        this.mImageDecoderConfig = builder.mImageDecoderConfig;
        int flexByteArrayPoolMaxNumThreads = this.mPoolFactory.getFlexByteArrayPoolMaxNumThreads();
        if (builder.mExecutorSupplier == null) {
            executorSupplier = new a(flexByteArrayPoolMaxNumThreads);
        } else {
            executorSupplier = builder.mExecutorSupplier;
        }
        this.mExecutorSupplier = executorSupplier;
        this.mDiskCacheEnabled = builder.mDiskCacheEnabled;
        com.facebook.common.g.b bVar4 = this.mImagePipelineExperiments.mWebpBitmapFactory;
        if (bVar4 != null) {
            setWebpBitmapFactory(bVar4, this.mImagePipelineExperiments, new com.facebook.imagepipeline.bitmaps.d(getPoolFactory()));
        } else if (this.mImagePipelineExperiments.mWebpSupportEnabled && com.facebook.common.g.c.f2345a) {
            com.facebook.common.g.b a2 = com.facebook.common.g.c.a();
            if (a2 != null) {
                setWebpBitmapFactory(a2, this.mImagePipelineExperiments, new com.facebook.imagepipeline.bitmaps.d(getPoolFactory()));
            }
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
    }

    private static int getMemoryChunkType(Builder builder, g gVar) {
        if (builder.mMemoryChunkType != null) {
            return builder.mMemoryChunkType.intValue();
        }
        if (gVar.mNativeCodeDisabled) {
            return 1;
        }
        return 0;
    }

    private static void setWebpBitmapFactory(com.facebook.common.g.b bVar, g gVar, com.facebook.common.g.a aVar) {
        com.facebook.common.g.c.f2348d = bVar;
        b.a aVar2 = gVar.mWebpErrorLogger;
        if (aVar2 != null) {
            bVar.setWebpErrorLogger(aVar2);
        }
        if (aVar != null) {
            bVar.setBitmapCreator(aVar);
        }
    }
}
