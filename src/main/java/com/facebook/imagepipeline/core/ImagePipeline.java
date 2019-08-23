package com.facebook.imagepipeline.core;

import a.g;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.i;
import com.facebook.common.memory.e;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.datasource.c;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.b;
import com.facebook.imagepipeline.producers.al;
import com.facebook.imagepipeline.producers.as;
import com.facebook.imagepipeline.producers.aw;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class ImagePipeline {
    private static final CancellationException PREFETCH_EXCEPTION = new CancellationException("Prefetching is not enabled");
    private final n<CacheKey, CloseableImage> mBitmapMemoryCache;
    private final CacheKeyFactory mCacheKeyFactory;
    private final n<CacheKey, e> mEncodedMemoryCache;
    private AtomicLong mIdCounter = new AtomicLong();
    private final Supplier<Boolean> mIsPrefetchEnabledSupplier;
    private final Supplier<Boolean> mLazyDataSource;
    private final com.facebook.imagepipeline.cache.e mMainBufferedDiskCache;
    private final i mProducerSequenceFactory;
    private final RequestListener mRequestListener;
    public final com.facebook.imagepipeline.cache.e mSmallImageBufferedDiskCache;
    private final Supplier<Boolean> mSuppressBitmapPrefetchingSupplier;
    private final aw mThreadHandoffProducerQueue;

    public n<CacheKey, CloseableImage> getBitmapMemoryCache() {
        return this.mBitmapMemoryCache;
    }

    public CacheKeyFactory getCacheKeyFactory() {
        return this.mCacheKeyFactory;
    }

    public Supplier<Boolean> isLazyDataSource() {
        return this.mLazyDataSource;
    }

    public void clearCaches() {
        clearMemoryCaches();
        clearDiskCaches();
    }

    public boolean isPaused() {
        return this.mThreadHandoffProducerQueue.isQueueing();
    }

    public void pause() {
        this.mThreadHandoffProducerQueue.startQueueing();
    }

    public void resume() {
        this.mThreadHandoffProducerQueue.stopQueuing();
    }

    private String generateUniqueFutureId() {
        return String.valueOf(this.mIdCounter.getAndIncrement());
    }

    public void clearDiskCaches() {
        this.mMainBufferedDiskCache.clearAll();
        this.mSmallImageBufferedDiskCache.clearAll();
    }

    public void clearMemoryCaches() {
        AnonymousClass4 r0 = new i<CacheKey>() {
            public final boolean apply(CacheKey cacheKey) {
                return true;
            }
        };
        this.mBitmapMemoryCache.removeAll(r0);
        this.mEncodedMemoryCache.removeAll(r0);
    }

    private i<CacheKey> predicateForUri(final Uri uri) {
        return new i<CacheKey>() {
            public final boolean apply(CacheKey cacheKey) {
                return cacheKey.containsUri(uri);
            }
        };
    }

    public void evictFromCache(Uri uri) {
        evictFromMemoryCache(uri);
        evictFromDiskCache(uri);
    }

    public void evictFromDiskCache(Uri uri) {
        evictFromDiskCache(ImageRequest.fromUri(uri));
    }

    public void evictFromMemoryCache(Uri uri) {
        i<CacheKey> predicateForUri = predicateForUri(uri);
        this.mBitmapMemoryCache.removeAll(predicateForUri);
        this.mEncodedMemoryCache.removeAll(predicateForUri);
    }

    public boolean isInBitmapMemoryCache(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.mBitmapMemoryCache.contains(predicateForUri(uri));
    }

    public DataSource<Boolean> isInDiskCache(Uri uri) {
        return isInDiskCache(ImageRequest.fromUri(uri));
    }

    public void evictFromDiskCache(ImageRequest imageRequest) {
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, null);
        this.mMainBufferedDiskCache.remove(encodedCacheKey);
        this.mSmallImageBufferedDiskCache.remove(encodedCacheKey);
    }

    public boolean isInBitmapMemoryCache(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        CloseableReference closeableReference = this.mBitmapMemoryCache.get(this.mCacheKeyFactory.getBitmapCacheKey(imageRequest, null));
        try {
            return CloseableReference.isValid(closeableReference);
        } finally {
            CloseableReference.closeSafely(closeableReference);
        }
    }

    public boolean isInDiskCacheSync(Uri uri) {
        if (isInDiskCacheSync(uri, ImageRequest.CacheChoice.SMALL) || isInDiskCacheSync(uri, ImageRequest.CacheChoice.DEFAULT)) {
            return true;
        }
        return false;
    }

    @Nullable
    public CloseableReference<CloseableImage> getCachedImage(@Nullable CacheKey cacheKey) {
        n<CacheKey, CloseableImage> nVar = this.mBitmapMemoryCache;
        if (nVar == null || cacheKey == null) {
            return null;
        }
        CloseableReference<CloseableImage> closeableReference = nVar.get(cacheKey);
        if (closeableReference == null || ((CloseableImage) closeableReference.get()).getQualityInfo().isOfFullQuality()) {
            return closeableReference;
        }
        closeableReference.close();
        return null;
    }

    public DataSource<Boolean> isInDiskCache(ImageRequest imageRequest) {
        final CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, null);
        final com.facebook.datasource.e a2 = com.facebook.datasource.e.a();
        this.mMainBufferedDiskCache.contains(encodedCacheKey).b((g<TResult, a.i<TContinuationResult>>) new g<Boolean, a.i<Boolean>>() {
            public final a.i<Boolean> then(a.i<Boolean> iVar) throws Exception {
                if (iVar.c() || iVar.d() || !((Boolean) iVar.e()).booleanValue()) {
                    return ImagePipeline.this.mSmallImageBufferedDiskCache.contains(encodedCacheKey);
                }
                return a.i.a(Boolean.TRUE);
            }
        }).a((g<TResult, TContinuationResult>) new g<Boolean, Void>() {
            public final Void then(a.i<Boolean> iVar) throws Exception {
                boolean z;
                com.facebook.datasource.e eVar = a2;
                if (iVar.c() || iVar.d() || !((Boolean) iVar.e()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                eVar.a(Boolean.valueOf(z));
                return null;
            }
        });
        return a2;
    }

    public boolean isInDiskCacheSync(ImageRequest imageRequest) {
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, null);
        switch (imageRequest.getCacheChoice()) {
            case DEFAULT:
                return this.mMainBufferedDiskCache.diskCheckSync(encodedCacheKey);
            case SMALL:
                return this.mSmallImageBufferedDiskCache.diskCheckSync(encodedCacheKey);
            default:
                return false;
        }
    }

    public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, Object obj) {
        return fetchDecodedImage(imageRequest, obj, ImageRequest.a.FULL_FETCH);
    }

    public DataSource<CloseableReference<e>> fetchEncodedImage(ImageRequest imageRequest, Object obj) {
        return fetchEncodedImage(imageRequest, obj, null);
    }

    public DataSource<CloseableReference<CloseableImage>> fetchImageFromBitmapCache(ImageRequest imageRequest, Object obj) {
        return fetchDecodedImage(imageRequest, obj, ImageRequest.a.BITMAP_MEMORY_CACHE);
    }

    public Supplier<DataSource<CloseableReference<e>>> getEncodedImageDataSourceSupplier(final ImageRequest imageRequest, final Object obj) {
        return new Supplier<DataSource<CloseableReference<e>>>() {
            public final DataSource<CloseableReference<e>> get() {
                return ImagePipeline.this.fetchEncodedImage(imageRequest, obj);
            }

            public final String toString() {
                return Objects.toStringHelper((Object) this).add("uri", (Object) imageRequest.getSourceUri()).toString();
            }
        };
    }

    public DataSource<Void> prefetchToDiskCache(ImageRequest imageRequest, Object obj) {
        return prefetchToDiskCache(imageRequest, obj, Priority.MEDIUM);
    }

    @Nullable
    public CacheKey getCacheKey(ImageRequest imageRequest, Object obj) {
        CacheKeyFactory cacheKeyFactory = this.mCacheKeyFactory;
        if (cacheKeyFactory == null || imageRequest == null) {
            return null;
        }
        if (imageRequest.getPostprocessor() != null) {
            return cacheKeyFactory.getPostprocessedBitmapCacheKey(imageRequest, obj);
        }
        return cacheKeyFactory.getBitmapCacheKey(imageRequest, obj);
    }

    public boolean isInDiskCacheSync(Uri uri, ImageRequest.CacheChoice cacheChoice) {
        return isInDiskCacheSync(ImageRequestBuilder.newBuilderWithSource(uri).setCacheChoice(cacheChoice).build());
    }

    private RequestListener getRequestListenerForRequest(ImageRequest imageRequest, @Nullable RequestListener requestListener) {
        if (requestListener == null) {
            if (imageRequest.getRequestListener() == null) {
                return this.mRequestListener;
            }
            return new b(this.mRequestListener, imageRequest.getRequestListener());
        } else if (imageRequest.getRequestListener() == null) {
            return new b(this.mRequestListener, requestListener);
        } else {
            return new b(this.mRequestListener, requestListener, imageRequest.getRequestListener());
        }
    }

    public DataSource<Void> prefetchToBitmapCache(ImageRequest imageRequest, Object obj) {
        al alVar;
        if (!((Boolean) this.mIsPrefetchEnabledSupplier.get()).booleanValue()) {
            return com.facebook.datasource.b.a(PREFETCH_EXCEPTION);
        }
        try {
            if (((Boolean) this.mSuppressBitmapPrefetchingSupplier.get()).booleanValue()) {
                alVar = this.mProducerSequenceFactory.getEncodedImagePrefetchProducerSequence(imageRequest);
            } else {
                alVar = this.mProducerSequenceFactory.getDecodedImagePrefetchProducerSequence(imageRequest);
            }
            return submitPrefetchRequest(alVar, imageRequest, ImageRequest.a.FULL_FETCH, obj, Priority.MEDIUM);
        } catch (Exception e2) {
            return com.facebook.datasource.b.a(e2);
        }
    }

    public Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier(final ImageRequest imageRequest, final Object obj, final ImageRequest.a aVar) {
        return new Supplier<DataSource<CloseableReference<CloseableImage>>>() {
            public final DataSource<CloseableReference<CloseableImage>> get() {
                return ImagePipeline.this.fetchDecodedImage(imageRequest, obj, aVar);
            }

            public final String toString() {
                return Objects.toStringHelper((Object) this).add("uri", (Object) imageRequest.getSourceUri()).toString();
            }
        };
    }

    public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, Object obj, @Nullable RequestListener requestListener) {
        return fetchDecodedImage(imageRequest, obj, ImageRequest.a.FULL_FETCH, requestListener);
    }

    public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, Object obj, ImageRequest.a aVar) {
        return fetchDecodedImage(imageRequest, obj, aVar, null);
    }

    public DataSource<CloseableReference<e>> fetchEncodedImage(ImageRequest imageRequest, Object obj, @Nullable RequestListener requestListener) {
        Preconditions.checkNotNull(imageRequest.getSourceUri());
        try {
            al encodedImageProducerSequence = this.mProducerSequenceFactory.getEncodedImageProducerSequence(imageRequest);
            if (imageRequest.getResizeOptions() != null) {
                imageRequest = ImageRequestBuilder.fromRequest(imageRequest).setResizeOptions(null).build();
            }
            return submitFetchRequest(encodedImageProducerSequence, imageRequest, ImageRequest.a.FULL_FETCH, obj, requestListener);
        } catch (Exception e2) {
            return com.facebook.datasource.b.a(e2);
        }
    }

    public DataSource<Void> prefetchToDiskCache(ImageRequest imageRequest, Object obj, Priority priority) {
        if (!((Boolean) this.mIsPrefetchEnabledSupplier.get()).booleanValue()) {
            return com.facebook.datasource.b.a(PREFETCH_EXCEPTION);
        }
        try {
            return submitPrefetchRequest(this.mProducerSequenceFactory.getEncodedImagePrefetchProducerSequence(imageRequest), imageRequest, ImageRequest.a.FULL_FETCH, obj, priority);
        } catch (Exception e2) {
            return com.facebook.datasource.b.a(e2);
        }
    }

    public Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier(ImageRequest imageRequest, Object obj, ImageRequest.a aVar, @Nullable RequestListener requestListener) {
        final ImageRequest imageRequest2 = imageRequest;
        final Object obj2 = obj;
        final ImageRequest.a aVar2 = aVar;
        final RequestListener requestListener2 = requestListener;
        AnonymousClass2 r0 = new Supplier<DataSource<CloseableReference<CloseableImage>>>() {
            public final DataSource<CloseableReference<CloseableImage>> get() {
                return ImagePipeline.this.fetchDecodedImage(imageRequest2, obj2, aVar2, requestListener2);
            }

            public final String toString() {
                return Objects.toStringHelper((Object) this).add("uri", (Object) imageRequest2.getSourceUri()).toString();
            }
        };
        return r0;
    }

    public DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, Object obj, ImageRequest.a aVar, @Nullable RequestListener requestListener) {
        try {
            return submitFetchRequest(this.mProducerSequenceFactory.getDecodedImageProducerSequence(imageRequest), imageRequest, aVar, obj, requestListener);
        } catch (Exception e2) {
            return com.facebook.datasource.b.a(e2);
        }
    }

    private DataSource<Void> submitPrefetchRequest(al<Void> alVar, ImageRequest imageRequest, ImageRequest.a aVar, Object obj, Priority priority) {
        RequestListener requestListenerForRequest = getRequestListenerForRequest(imageRequest, null);
        try {
            ImageRequest imageRequest2 = imageRequest;
            as asVar = new as(imageRequest2, generateUniqueFutureId(), requestListenerForRequest, obj, ImageRequest.a.getMax(imageRequest.getLowestPermittedRequestLevel(), aVar), true, false, priority);
            return c.create(alVar, asVar, requestListenerForRequest);
        } catch (Exception e2) {
            return com.facebook.datasource.b.a(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> com.facebook.datasource.DataSource<com.facebook.common.references.CloseableReference<T>> submitFetchRequest(com.facebook.imagepipeline.producers.al<com.facebook.common.references.CloseableReference<T>> r11, com.facebook.imagepipeline.request.ImageRequest r12, com.facebook.imagepipeline.request.ImageRequest.a r13, java.lang.Object r14, @javax.annotation.Nullable com.facebook.imagepipeline.listener.RequestListener r15) {
        /*
            r10 = this;
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            com.facebook.imagepipeline.e.b.beginSection(r0)
        L_0x000b:
            com.facebook.imagepipeline.listener.RequestListener r15 = r10.getRequestListenerForRequest(r12, r15)
            com.facebook.imagepipeline.request.ImageRequest$a r0 = r12.getLowestPermittedRequestLevel()     // Catch:{ Exception -> 0x004f }
            com.facebook.imagepipeline.request.ImageRequest$a r6 = com.facebook.imagepipeline.request.ImageRequest.a.getMax(r0, r13)     // Catch:{ Exception -> 0x004f }
            com.facebook.imagepipeline.producers.as r13 = new com.facebook.imagepipeline.producers.as     // Catch:{ Exception -> 0x004f }
            java.lang.String r3 = r10.generateUniqueFutureId()     // Catch:{ Exception -> 0x004f }
            r7 = 0
            boolean r0 = r12.getProgressiveRenderingEnabled()     // Catch:{ Exception -> 0x004f }
            if (r0 != 0) goto L_0x0032
            android.net.Uri r0 = r12.getSourceUri()     // Catch:{ Exception -> 0x004f }
            boolean r0 = com.facebook.common.f.f.b(r0)     // Catch:{ Exception -> 0x004f }
            if (r0 != 0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            r0 = 0
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r0 = 1
            r8 = 1
        L_0x0034:
            com.facebook.imagepipeline.common.Priority r9 = r12.getPriority()     // Catch:{ Exception -> 0x004f }
            r1 = r13
            r2 = r12
            r4 = r15
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x004f }
            com.facebook.datasource.DataSource r11 = com.facebook.imagepipeline.datasource.b.create(r11, r13, r15)     // Catch:{ Exception -> 0x004f }
            boolean r12 = com.facebook.imagepipeline.e.b.isTracing()
            if (r12 == 0) goto L_0x004c
            com.facebook.imagepipeline.e.b.endSection()
        L_0x004c:
            return r11
        L_0x004d:
            r11 = move-exception
            goto L_0x005e
        L_0x004f:
            r11 = move-exception
            com.facebook.datasource.DataSource r11 = com.facebook.datasource.b.a(r11)     // Catch:{ all -> 0x004d }
            boolean r12 = com.facebook.imagepipeline.e.b.isTracing()
            if (r12 == 0) goto L_0x005d
            com.facebook.imagepipeline.e.b.endSection()
        L_0x005d:
            return r11
        L_0x005e:
            boolean r12 = com.facebook.imagepipeline.e.b.isTracing()
            if (r12 == 0) goto L_0x0067
            com.facebook.imagepipeline.e.b.endSection()
        L_0x0067:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.core.ImagePipeline.submitFetchRequest(com.facebook.imagepipeline.producers.al, com.facebook.imagepipeline.request.ImageRequest, com.facebook.imagepipeline.request.ImageRequest$a, java.lang.Object, com.facebook.imagepipeline.listener.RequestListener):com.facebook.datasource.DataSource");
    }

    public ImagePipeline(i iVar, Set<RequestListener> set, Supplier<Boolean> supplier, n<CacheKey, CloseableImage> nVar, n<CacheKey, e> nVar2, com.facebook.imagepipeline.cache.e eVar, com.facebook.imagepipeline.cache.e eVar2, CacheKeyFactory cacheKeyFactory, aw awVar, Supplier<Boolean> supplier2, Supplier<Boolean> supplier3) {
        this.mProducerSequenceFactory = iVar;
        this.mRequestListener = new b(set);
        this.mIsPrefetchEnabledSupplier = supplier;
        this.mBitmapMemoryCache = nVar;
        this.mEncodedMemoryCache = nVar2;
        this.mMainBufferedDiskCache = eVar;
        this.mSmallImageBufferedDiskCache = eVar2;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mThreadHandoffProducerQueue = awVar;
        this.mSuppressBitmapPrefetchingSupplier = supplier2;
        this.mLazyDataSource = supplier3;
    }
}
