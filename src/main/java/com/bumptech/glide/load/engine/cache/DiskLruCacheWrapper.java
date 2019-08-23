package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;
import java.io.IOException;

public class DiskLruCacheWrapper implements DiskCache {
    private static DiskLruCacheWrapper wrapper;
    private final File directory;
    private DiskLruCache diskLruCache;
    private final long maxSize;
    private final SafeKeyGenerator safeKeyGenerator;
    private final DiskCacheWriteLocker writeLocker = new DiskCacheWriteLocker();

    private synchronized void resetDiskCache() {
        this.diskLruCache = null;
    }

    private synchronized DiskLruCache getDiskCache() throws IOException {
        if (this.diskLruCache == null) {
            this.diskLruCache = DiskLruCache.open(this.directory, 1, 1, this.maxSize);
        }
        return this.diskLruCache;
    }

    public synchronized void clear() {
        try {
            getDiskCache().delete();
            resetDiskCache();
        } catch (IOException unused) {
            resetDiskCache();
        } catch (Throwable th) {
            resetDiskCache();
            throw th;
        }
    }

    public void delete(Key key) {
        try {
            getDiskCache().remove(this.safeKeyGenerator.getSafeKey(key));
        } catch (IOException unused) {
        }
    }

    public File get(Key key) {
        try {
            DiskLruCache.Value value = getDiskCache().get(this.safeKeyGenerator.getSafeKey(key));
            if (value != null) {
                return value.getFile(0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public static DiskCache create(File file, long j) {
        return new DiskLruCacheWrapper(file, j);
    }

    @Deprecated
    protected DiskLruCacheWrapper(File file, long j) {
        this.directory = file;
        this.maxSize = j;
        this.safeKeyGenerator = new SafeKeyGenerator();
    }

    @Deprecated
    public static synchronized DiskCache get(File file, long j) {
        DiskLruCacheWrapper diskLruCacheWrapper;
        synchronized (DiskLruCacheWrapper.class) {
            if (wrapper == null) {
                wrapper = new DiskLruCacheWrapper(file, j);
            }
            diskLruCacheWrapper = wrapper;
        }
        return diskLruCacheWrapper;
    }

    public void put(Key key, DiskCache.Writer writer) {
        DiskLruCache.Editor edit;
        String safeKey = this.safeKeyGenerator.getSafeKey(key);
        this.writeLocker.acquire(safeKey);
        try {
            DiskLruCache diskCache = getDiskCache();
            if (diskCache.get(safeKey) != null) {
                this.writeLocker.release(safeKey);
                return;
            }
            edit = diskCache.edit(safeKey);
            if (edit != null) {
                if (writer.write(edit.getFile(0))) {
                    edit.commit();
                }
                edit.abortUnlessCommitted();
                this.writeLocker.release(safeKey);
                return;
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + safeKey);
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.writeLocker.release(safeKey);
            throw th;
        }
    }
}
