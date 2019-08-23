package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import java.io.File;

public final class ExternalPreferredCacheDiskCacheFactory extends DiskLruCacheFactory {
    public ExternalPreferredCacheDiskCacheFactory(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public ExternalPreferredCacheDiskCacheFactory(final Context context, final String str, long j) {
        super((DiskLruCacheFactory.CacheDirectoryGetter) new DiskLruCacheFactory.CacheDirectoryGetter() {
            @Nullable
            private File getInternalCacheDirectory() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                if (str != null) {
                    return new File(cacheDir, str);
                }
                return cacheDir;
            }

            public File getCacheDirectory() {
                File internalCacheDirectory = getInternalCacheDirectory();
                if (internalCacheDirectory != null && internalCacheDirectory.exists()) {
                    return internalCacheDirectory;
                }
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir == null || !externalCacheDir.canWrite()) {
                    return internalCacheDirectory;
                }
                if (str != null) {
                    return new File(externalCacheDir, str);
                }
                return externalCacheDir;
            }
        }, j);
    }
}
