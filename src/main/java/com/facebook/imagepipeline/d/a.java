package com.facebook.imagepipeline.d;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import javax.annotation.Nullable;

public final class a extends BasePostprocessor {

    /* renamed from: a  reason: collision with root package name */
    private final int f23929a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23930b;

    /* renamed from: c  reason: collision with root package name */
    private CacheKey f23931c;

    @Nullable
    public final CacheKey getPostprocessorCacheKey() {
        if (this.f23931c == null) {
            this.f23931c = new SimpleCacheKey(String.format(null, "i%dr%d", new Object[]{Integer.valueOf(this.f23929a), Integer.valueOf(this.f23930b)}));
        }
        return this.f23931c;
    }

    public a(int i) {
        this(3, i);
    }

    public final void process(Bitmap bitmap) {
        NativeBlurFilter.iterativeBoxBlur(bitmap, this.f23929a, this.f23930b);
    }

    public a(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        Preconditions.checkArgument(i2 > 0 ? true : z2);
        this.f23929a = i;
        this.f23930b = i2;
    }
}
