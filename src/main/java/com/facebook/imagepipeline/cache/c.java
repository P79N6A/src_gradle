package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public final class c implements CacheKey {

    /* renamed from: a  reason: collision with root package name */
    private final String f23843a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final ResizeOptions f23844b;

    /* renamed from: c  reason: collision with root package name */
    private final RotationOptions f23845c;

    /* renamed from: d  reason: collision with root package name */
    private final ImageDecodeOptions f23846d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private final CacheKey f23847e;

    /* renamed from: f  reason: collision with root package name */
    private final int f23848f;
    public final long mCacheTime;
    public final Object mCallerContext;
    @Nullable
    public final String mPostprocessorName;

    public final String getUriString() {
        return this.f23843a;
    }

    public final int hashCode() {
        return this.f23848f;
    }

    public final String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.f23843a, this.f23844b, this.f23845c, this.f23846d, this.f23847e, this.mPostprocessorName, Integer.valueOf(this.f23848f)});
    }

    public final boolean containsUri(Uri uri) {
        return getUriString().contains(uri.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f23848f != cVar.f23848f || !this.f23843a.equals(cVar.f23843a) || !Objects.equal(this.f23844b, cVar.f23844b) || !Objects.equal(this.f23845c, cVar.f23845c) || !Objects.equal(this.f23846d, cVar.f23846d) || !Objects.equal(this.f23847e, cVar.f23847e) || !Objects.equal(this.mPostprocessorName, cVar.mPostprocessorName)) {
            return false;
        }
        return true;
    }

    public c(String str, @Nullable ResizeOptions resizeOptions, RotationOptions rotationOptions, ImageDecodeOptions imageDecodeOptions, @Nullable CacheKey cacheKey, @Nullable String str2, Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.f23843a = (String) Preconditions.checkNotNull(str);
        this.f23844b = resizeOptions;
        this.f23845c = rotationOptions;
        this.f23846d = imageDecodeOptions;
        this.f23847e = cacheKey;
        this.mPostprocessorName = str2;
        Integer valueOf = Integer.valueOf(str.hashCode());
        int i7 = 0;
        if (resizeOptions != null) {
            i = resizeOptions.hashCode();
        } else {
            i = 0;
        }
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(rotationOptions.hashCode());
        ImageDecodeOptions imageDecodeOptions2 = this.f23846d;
        CacheKey cacheKey2 = this.f23847e;
        if (valueOf == null) {
            i2 = 0;
        } else {
            i2 = valueOf.hashCode();
        }
        if (valueOf2 == null) {
            i3 = 0;
        } else {
            i3 = valueOf2.hashCode();
        }
        if (valueOf3 == null) {
            i4 = 0;
        } else {
            i4 = valueOf3.hashCode();
        }
        if (imageDecodeOptions2 == null) {
            i5 = 0;
        } else {
            i5 = imageDecodeOptions2.hashCode();
        }
        if (cacheKey2 == null) {
            i6 = 0;
        } else {
            i6 = cacheKey2.hashCode();
        }
        this.f23848f = ((((((((((i2 + 31) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + (str2 != null ? str2.hashCode() : i7);
        this.mCallerContext = obj;
        this.mCacheTime = RealtimeSinceBootClock.get().now();
    }
}
