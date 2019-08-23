package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.c.b;
import com.facebook.common.f.f;
import com.facebook.common.internal.Objects;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.listener.RequestListener;
import java.io.File;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public class ImageRequest {
    private final List<Uri> mBackupUris;
    @Nullable
    private final com.facebook.imagepipeline.common.a mBytesRange;
    private final CacheChoice mCacheChoice;
    private final ImageDecodeOptions mImageDecodeOptions;
    private final boolean mIsDiskCacheEnabled;
    private final boolean mIsMemoryCacheEnabled;
    private final boolean mLocalThumbnailPreviewsEnabled;
    private final a mLowestPermittedRequestLevel;
    @Nullable
    private final Postprocessor mPostprocessor;
    private final boolean mProgressiveRenderingEnabled;
    @Nullable
    private final RequestListener mRequestListener;
    private final Priority mRequestPriority;
    @Nullable
    private final ResizeOptions mResizeOptions;
    private final RotationOptions mRotationOptions;
    private File mSourceFile;
    private final Uri mSourceUri;
    private final int mSourceUriType = getSourceUriType(this.mSourceUri);

    public enum CacheChoice {
        SMALL,
        DEFAULT
    }

    public enum a {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        public static a getMax(a aVar, a aVar2) {
            if (aVar.getValue() > aVar2.getValue()) {
                return aVar;
            }
            return aVar2;
        }

        private a(int i) {
            this.mValue = i;
        }
    }

    public List<Uri> getBackupUris() {
        return this.mBackupUris;
    }

    @Nullable
    public com.facebook.imagepipeline.common.a getBytesRange() {
        return this.mBytesRange;
    }

    public CacheChoice getCacheChoice() {
        return this.mCacheChoice;
    }

    public ImageDecodeOptions getImageDecodeOptions() {
        return this.mImageDecodeOptions;
    }

    public boolean getLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public a getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    @Nullable
    public Postprocessor getPostprocessor() {
        return this.mPostprocessor;
    }

    public Priority getPriority() {
        return this.mRequestPriority;
    }

    public boolean getProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    @Nullable
    public RequestListener getRequestListener() {
        return this.mRequestListener;
    }

    @Nullable
    public ResizeOptions getResizeOptions() {
        return this.mResizeOptions;
    }

    public RotationOptions getRotationOptions() {
        return this.mRotationOptions;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public int getSourceUriType() {
        return this.mSourceUriType;
    }

    public boolean isDiskCacheEnabled() {
        return this.mIsDiskCacheEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return this.mIsMemoryCacheEnabled;
    }

    @Deprecated
    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.useImageMetadata();
    }

    public int getPreferredHeight() {
        if (this.mResizeOptions != null) {
            return this.mResizeOptions.height;
        }
        return 2048;
    }

    public int getPreferredWidth() {
        if (this.mResizeOptions != null) {
            return this.mResizeOptions.width;
        }
        return 2048;
    }

    public synchronized File getSourceFile() {
        if (this.mSourceFile == null) {
            this.mSourceFile = new File(this.mSourceUri.getPath());
        }
        return this.mSourceFile;
    }

    public int hashCode() {
        CacheKey cacheKey;
        if (this.mPostprocessor != null) {
            cacheKey = this.mPostprocessor.getPostprocessorCacheKey();
        } else {
            cacheKey = null;
        }
        return Objects.hashCode(this.mCacheChoice, this.mSourceUri, this.mSourceFile, this.mBytesRange, this.mImageDecodeOptions, this.mResizeOptions, this.mRotationOptions, cacheKey);
    }

    public String toString() {
        return Objects.toStringHelper((Object) this).add("uri", (Object) this.mSourceUri).add("cacheChoice", (Object) this.mCacheChoice).add("decodeOptions", (Object) this.mImageDecodeOptions).add("postprocessor", (Object) this.mPostprocessor).add("priority", (Object) this.mRequestPriority).add("resizeOptions", (Object) this.mResizeOptions).add("rotationOptions", (Object) this.mRotationOptions).add("bytesRange", (Object) this.mBytesRange).toString();
    }

    public static ImageRequest fromFile(@Nullable File file) {
        if (file == null) {
            return null;
        }
        return fromUri(Uri.fromFile(file));
    }

    public static ImageRequest fromUri(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.newBuilderWithSource(uri).build();
    }

    public static ImageRequest fromUri(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }

    protected ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        RotationOptions rotationOptions;
        this.mCacheChoice = imageRequestBuilder.getCacheChoice();
        this.mSourceUri = imageRequestBuilder.getSourceUri();
        this.mBackupUris = imageRequestBuilder.getBackupUris();
        this.mProgressiveRenderingEnabled = imageRequestBuilder.isProgressiveRenderingEnabled();
        this.mLocalThumbnailPreviewsEnabled = imageRequestBuilder.isLocalThumbnailPreviewsEnabled();
        this.mImageDecodeOptions = imageRequestBuilder.getImageDecodeOptions();
        this.mResizeOptions = imageRequestBuilder.getResizeOptions();
        if (imageRequestBuilder.getRotationOptions() == null) {
            rotationOptions = RotationOptions.autoRotate();
        } else {
            rotationOptions = imageRequestBuilder.getRotationOptions();
        }
        this.mRotationOptions = rotationOptions;
        this.mBytesRange = imageRequestBuilder.getBytesRange();
        this.mRequestPriority = imageRequestBuilder.getRequestPriority();
        this.mLowestPermittedRequestLevel = imageRequestBuilder.getLowestPermittedRequestLevel();
        this.mIsDiskCacheEnabled = imageRequestBuilder.isDiskCacheEnabled();
        this.mIsMemoryCacheEnabled = imageRequestBuilder.isMemoryCacheEnabled();
        this.mPostprocessor = imageRequestBuilder.getPostprocessor();
        this.mRequestListener = imageRequestBuilder.getRequestListener();
    }

    public boolean equals(Object obj) {
        CacheKey cacheKey;
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (!Objects.equal(this.mSourceUri, imageRequest.mSourceUri) || !Objects.equal(this.mCacheChoice, imageRequest.mCacheChoice) || !Objects.equal(this.mSourceFile, imageRequest.mSourceFile) || !Objects.equal(this.mBytesRange, imageRequest.mBytesRange) || !Objects.equal(this.mImageDecodeOptions, imageRequest.mImageDecodeOptions) || !Objects.equal(this.mResizeOptions, imageRequest.mResizeOptions) || !Objects.equal(this.mRotationOptions, imageRequest.mRotationOptions)) {
            return false;
        }
        CacheKey cacheKey2 = null;
        if (this.mPostprocessor != null) {
            cacheKey = this.mPostprocessor.getPostprocessorCacheKey();
        } else {
            cacheKey = null;
        }
        if (imageRequest.mPostprocessor != null) {
            cacheKey2 = imageRequest.mPostprocessor.getPostprocessorCacheKey();
        }
        return Objects.equal(cacheKey, cacheKey2);
    }

    private static int getSourceUriType(Uri uri) {
        String str;
        if (uri == null) {
            return -1;
        }
        if (f.b(uri)) {
            return 0;
        }
        if (f.c(uri)) {
            String path = uri.getPath();
            int lastIndexOf = path.lastIndexOf(46);
            String str2 = null;
            if (lastIndexOf < 0 || lastIndexOf == path.length() - 1) {
                str = null;
            } else {
                str = path.substring(lastIndexOf + 1);
            }
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.US);
                String str3 = b.f23498b.get(lowerCase);
                if (str3 == null) {
                    str3 = b.f23497a.getMimeTypeFromExtension(lowerCase);
                }
                if (str3 == null) {
                    str2 = com.facebook.common.c.a.f23496a.get(lowerCase);
                } else {
                    str2 = str3;
                }
            }
            if (com.facebook.common.c.a.a(str2)) {
                return 2;
            }
            return 3;
        } else if (f.d(uri)) {
            return 4;
        } else {
            if (f.f(uri)) {
                return 5;
            }
            if (f.g(uri)) {
                return 6;
            }
            if ("data".equals(f.h(uri))) {
                return 7;
            }
            if ("android.resource".equals(f.h(uri))) {
                return 8;
            }
            return -1;
        }
    }
}
