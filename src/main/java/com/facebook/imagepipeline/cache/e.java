package com.facebook.imagepipeline.cache;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.f;
import com.facebook.common.memory.i;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class e {
    public static final Class<?> TAG = e.class;

    /* renamed from: a  reason: collision with root package name */
    private final f f23850a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f23851b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f23852c;
    public final FileCache mFileCache;
    public final l mImageCacheStatsTracker;
    public final i mPooledByteStreams;
    public final r mStagingArea = r.getInstance();

    public a.i<Void> clearAll() {
        this.mStagingArea.clearAll();
        try {
            return a.i.a((Callable<TResult>) new Callable<Void>() {
                public final Void call() throws Exception {
                    e.this.mStagingArea.clearAll();
                    e.this.mFileCache.clearAll();
                    return null;
                }
            }, this.f23852c);
        } catch (Exception e2) {
            FLog.w(TAG, (Throwable) e2, "Failed to schedule disk-cache clear", new Object[0]);
            return a.i.a(e2);
        }
    }

    public boolean diskCheckSync(CacheKey cacheKey) {
        if (containsSync(cacheKey)) {
            return true;
        }
        return checkInStagingAreaAndFileCache(cacheKey);
    }

    public a.i<Boolean> contains(CacheKey cacheKey) {
        if (containsSync(cacheKey)) {
            return a.i.a(Boolean.TRUE);
        }
        return a(cacheKey);
    }

    public boolean containsSync(CacheKey cacheKey) {
        if (this.mStagingArea.containsKey(cacheKey) || this.mFileCache.hasKeySync(cacheKey)) {
            return true;
        }
        return false;
    }

    private a.i<Boolean> a(final CacheKey cacheKey) {
        try {
            return a.i.a((Callable<TResult>) new Callable<Boolean>() {
                public final Boolean call() throws Exception {
                    return Boolean.valueOf(e.this.checkInStagingAreaAndFileCache(cacheKey));
                }
            }, this.f23851b);
        } catch (Exception e2) {
            FLog.w(TAG, (Throwable) e2, "Failed to schedule disk-cache read for %s", cacheKey.getUriString());
            return a.i.a(e2);
        }
    }

    public boolean checkInStagingAreaAndFileCache(CacheKey cacheKey) {
        b bVar = this.mStagingArea.get(cacheKey);
        if (bVar != null) {
            bVar.close();
            FLog.v(TAG, "Found image for %s in staging area", (Object) cacheKey.getUriString());
            this.mImageCacheStatsTracker.onStagingAreaHit(cacheKey);
            return true;
        }
        FLog.v(TAG, "Did not find image for %s in staging area", (Object) cacheKey.getUriString());
        this.mImageCacheStatsTracker.onStagingAreaMiss();
        try {
            return this.mFileCache.hasKey(cacheKey);
        } catch (Exception unused) {
            return false;
        }
    }

    public a.i<Void> remove(final CacheKey cacheKey) {
        Preconditions.checkNotNull(cacheKey);
        this.mStagingArea.remove(cacheKey);
        try {
            return a.i.a((Callable<TResult>) new Callable<Void>() {
                public final Void call() throws Exception {
                    try {
                        if (com.facebook.imagepipeline.e.b.isTracing()) {
                            com.facebook.imagepipeline.e.b.beginSection("BufferedDiskCache#remove");
                        }
                        e.this.mStagingArea.remove(cacheKey);
                        e.this.mFileCache.remove(cacheKey);
                        return null;
                    } finally {
                        if (com.facebook.imagepipeline.e.b.isTracing()) {
                            com.facebook.imagepipeline.e.b.endSection();
                        }
                    }
                }
            }, this.f23852c);
        } catch (Exception e2) {
            FLog.w(TAG, (Throwable) e2, "Failed to schedule disk-cache remove for %s", cacheKey.getUriString());
            return a.i.a(e2);
        }
    }

    public com.facebook.common.memory.e readFromDiskCache(CacheKey cacheKey) throws IOException {
        InputStream openStream;
        try {
            FLog.v(TAG, "Disk cache read for %s", (Object) cacheKey.getUriString());
            BinaryResource resource = this.mFileCache.getResource(cacheKey);
            if (resource == null) {
                FLog.v(TAG, "Disk cache miss for %s", (Object) cacheKey.getUriString());
                this.mImageCacheStatsTracker.onDiskCacheMiss();
                return null;
            }
            FLog.v(TAG, "Found entry in disk cache for %s", (Object) cacheKey.getUriString());
            this.mImageCacheStatsTracker.onDiskCacheHit(cacheKey);
            openStream = resource.openStream();
            com.facebook.common.memory.e newByteBuffer = this.f23850a.newByteBuffer(openStream, (int) resource.size());
            openStream.close();
            FLog.v(TAG, "Successful read from disk cache for %s", (Object) cacheKey.getUriString());
            return newByteBuffer;
        } catch (IOException e2) {
            FLog.w(TAG, (Throwable) e2, "Exception reading from cache for %s", cacheKey.getUriString());
            this.mImageCacheStatsTracker.onDiskCacheGetFail();
            throw e2;
        } catch (Throwable th) {
            openStream.close();
            throw th;
        }
    }

    public void writeToDiskCache(CacheKey cacheKey, final b bVar) {
        FLog.v(TAG, "About to write to disk-cache for key %s", (Object) cacheKey.getUriString());
        try {
            this.mFileCache.insert(cacheKey, new com.facebook.cache.common.f() {
                public final void write(OutputStream outputStream) throws IOException {
                    e.this.mPooledByteStreams.a(bVar.getInputStream(), outputStream);
                }
            });
            FLog.v(TAG, "Successful disk-cache write for key %s", (Object) cacheKey.getUriString());
        } catch (IOException e2) {
            FLog.w(TAG, (Throwable) e2, "Failed to write to disk-cache for key %s", cacheKey.getUriString());
        }
    }

    private a.i<b> a(final CacheKey cacheKey, final AtomicBoolean atomicBoolean) {
        try {
            return a.i.a((Callable<TResult>) new Callable<b>() {
                public final b call() throws Exception {
                    CloseableReference of;
                    try {
                        if (com.facebook.imagepipeline.e.b.isTracing()) {
                            com.facebook.imagepipeline.e.b.beginSection("BufferedDiskCache#getAsync");
                        }
                        if (!atomicBoolean.get()) {
                            b bVar = e.this.mStagingArea.get(cacheKey);
                            if (bVar != null) {
                                FLog.v(e.TAG, "Found image for %s in staging area", (Object) cacheKey.getUriString());
                                e.this.mImageCacheStatsTracker.onStagingAreaHit(cacheKey);
                            } else {
                                FLog.v(e.TAG, "Did not find image for %s in staging area", (Object) cacheKey.getUriString());
                                e.this.mImageCacheStatsTracker.onStagingAreaMiss();
                                try {
                                    of = CloseableReference.of(e.this.readFromDiskCache(cacheKey));
                                    b bVar2 = new b(of);
                                    CloseableReference.closeSafely(of);
                                    bVar = bVar2;
                                } catch (Exception unused) {
                                    if (com.facebook.imagepipeline.e.b.isTracing()) {
                                        com.facebook.imagepipeline.e.b.endSection();
                                    }
                                    return null;
                                } catch (Throwable th) {
                                    CloseableReference.closeSafely(of);
                                    throw th;
                                }
                            }
                            if (!Thread.interrupted()) {
                                return bVar;
                            }
                            FLog.v(e.TAG, "Host thread was interrupted, decreasing reference count");
                            if (bVar != null) {
                                bVar.close();
                            }
                            throw new InterruptedException();
                        }
                        throw new CancellationException();
                    } finally {
                        if (com.facebook.imagepipeline.e.b.isTracing()) {
                            com.facebook.imagepipeline.e.b.endSection();
                        }
                    }
                }
            }, this.f23851b);
        } catch (Exception e2) {
            FLog.w(TAG, (Throwable) e2, "Failed to schedule disk-cache read for %s", cacheKey.getUriString());
            return a.i.a(e2);
        }
    }

    public a.i<b> get(CacheKey cacheKey, AtomicBoolean atomicBoolean) {
        try {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("BufferedDiskCache#get");
            }
            b bVar = this.mStagingArea.get(cacheKey);
            if (bVar != null) {
                FLog.v(TAG, "Found image for %s in staging area", (Object) cacheKey.getUriString());
                this.mImageCacheStatsTracker.onStagingAreaHit(cacheKey);
                return a.i.a(bVar);
            }
            a.i<b> a2 = a(cacheKey, atomicBoolean);
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
            return a2;
        } finally {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
    }

    public void put(final CacheKey cacheKey, b bVar) {
        final b cloneOrNull;
        try {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("BufferedDiskCache#put");
            }
            Preconditions.checkNotNull(cacheKey);
            Preconditions.checkArgument(b.isValid(bVar));
            this.mStagingArea.put(cacheKey, bVar);
            cloneOrNull = b.cloneOrNull(bVar);
            this.f23852c.execute(new Runnable() {
                public final void run() {
                    try {
                        if (com.facebook.imagepipeline.e.b.isTracing()) {
                            com.facebook.imagepipeline.e.b.beginSection("BufferedDiskCache#putAsync");
                        }
                        e.this.writeToDiskCache(cacheKey, cloneOrNull);
                    } finally {
                        e.this.mStagingArea.remove(cacheKey, cloneOrNull);
                        b.closeSafely(cloneOrNull);
                        if (com.facebook.imagepipeline.e.b.isTracing()) {
                            com.facebook.imagepipeline.e.b.endSection();
                        }
                    }
                }
            });
        } catch (Exception e2) {
            FLog.w(TAG, (Throwable) e2, "Failed to schedule disk-cache write for %s", cacheKey.getUriString());
            this.mStagingArea.remove(cacheKey, bVar);
            b.closeSafely(cloneOrNull);
        } catch (Throwable th) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
            throw th;
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
    }

    public e(FileCache fileCache, f fVar, i iVar, Executor executor, Executor executor2, l lVar) {
        this.mFileCache = fileCache;
        this.f23850a = fVar;
        this.mPooledByteStreams = iVar;
        this.f23851b = executor;
        this.f23852c = executor2;
        this.mImageCacheStatsTracker = lVar;
    }
}
