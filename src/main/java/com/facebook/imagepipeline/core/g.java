package com.facebook.imagepipeline.core;

import android.content.Context;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.g.b;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.f;
import com.facebook.imagepipeline.b.e;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.image.CloseableImage;

public final class g {
    public boolean mBitmapPrepareToDrawForPrefetch;
    public final int mBitmapPrepareToDrawMaxSizeBytes;
    public final int mBitmapPrepareToDrawMinSizeBytes;
    public final boolean mDecodeCancellationEnabled;
    public final boolean mGingerbreadDecoderEnabled;
    public final Supplier<Boolean> mLazyDataSource;
    public final int mMaxBitmapSize;
    public final boolean mNativeCodeDisabled;
    public final boolean mPartialImageCachingEnabled;
    public final c mProducerFactoryMethod;
    public final boolean mUseBitmapPrepareToDraw;
    public final boolean mUseDownsamplingRatioForResizing;
    public final com.facebook.common.g.b mWebpBitmapFactory;
    public final b.a mWebpErrorLogger;
    public final boolean mWebpSupportEnabled;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final ImagePipelineConfig.Builder f23916a;
        public boolean mBitmapPrepareToDrawForPrefetch;
        public int mBitmapPrepareToDrawMaxSizeBytes;
        public int mBitmapPrepareToDrawMinSizeBytes;
        public boolean mDecodeCancellationEnabled;
        public boolean mGingerbreadDecoderEnabled;
        public Supplier<Boolean> mLazyDataSource;
        public int mMaxBitmapSize = 2048;
        public boolean mNativeCodeDisabled;
        public boolean mPartialImageCachingEnabled;
        public c mProducerFactoryMethod;
        public boolean mUseBitmapPrepareToDraw;
        public boolean mUseDownsamplingRatioForResizing;
        public com.facebook.common.g.b mWebpBitmapFactory;
        public b.a mWebpErrorLogger;
        public boolean mWebpSupportEnabled;

        public final g build() {
            return new g(this, (byte) 0);
        }

        public a(ImagePipelineConfig.Builder builder) {
            this.f23916a = builder;
        }
    }

    public static class b implements c {
        public final h createProducerFactory(Context context, com.facebook.common.memory.a aVar, com.facebook.imagepipeline.b.c cVar, e eVar, boolean z, boolean z2, boolean z3, ExecutorSupplier executorSupplier, f fVar, n<CacheKey, CloseableImage> nVar, n<CacheKey, com.facebook.common.memory.e> nVar2, com.facebook.imagepipeline.cache.e eVar2, com.facebook.imagepipeline.cache.e eVar3, CacheKeyFactory cacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, int i, int i2, boolean z4, int i3) {
            h hVar = new h(context, aVar, cVar, eVar, z, z2, z3, executorSupplier, fVar, nVar, nVar2, eVar2, eVar3, cacheKeyFactory, platformBitmapFactory, i, i2, z4, i3);
            return hVar;
        }
    }

    public interface c {
        h createProducerFactory(Context context, com.facebook.common.memory.a aVar, com.facebook.imagepipeline.b.c cVar, e eVar, boolean z, boolean z2, boolean z3, ExecutorSupplier executorSupplier, f fVar, n<CacheKey, CloseableImage> nVar, n<CacheKey, com.facebook.common.memory.e> nVar2, com.facebook.imagepipeline.cache.e eVar2, com.facebook.imagepipeline.cache.e eVar3, CacheKeyFactory cacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, int i, int i2, boolean z4, int i3);
    }

    private g(a aVar) {
        this.mWebpSupportEnabled = aVar.mWebpSupportEnabled;
        this.mWebpErrorLogger = aVar.mWebpErrorLogger;
        this.mDecodeCancellationEnabled = aVar.mDecodeCancellationEnabled;
        this.mWebpBitmapFactory = aVar.mWebpBitmapFactory;
        this.mUseDownsamplingRatioForResizing = aVar.mUseDownsamplingRatioForResizing;
        this.mUseBitmapPrepareToDraw = aVar.mUseBitmapPrepareToDraw;
        this.mBitmapPrepareToDrawMinSizeBytes = aVar.mBitmapPrepareToDrawMinSizeBytes;
        this.mBitmapPrepareToDrawMaxSizeBytes = aVar.mBitmapPrepareToDrawMaxSizeBytes;
        this.mBitmapPrepareToDrawForPrefetch = aVar.mBitmapPrepareToDrawForPrefetch;
        this.mMaxBitmapSize = aVar.mMaxBitmapSize;
        this.mNativeCodeDisabled = aVar.mNativeCodeDisabled;
        this.mPartialImageCachingEnabled = aVar.mPartialImageCachingEnabled;
        if (aVar.mProducerFactoryMethod == null) {
            this.mProducerFactoryMethod = new b();
        } else {
            this.mProducerFactoryMethod = aVar.mProducerFactoryMethod;
        }
        this.mLazyDataSource = aVar.mLazyDataSource;
        this.mGingerbreadDecoderEnabled = aVar.mGingerbreadDecoderEnabled;
    }

    /* synthetic */ g(a aVar, byte b2) {
        this(aVar);
    }
}
