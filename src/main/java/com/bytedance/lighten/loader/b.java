package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import com.bytedance.lighten.core.c;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.BasePostprocessor;

public final class b extends BasePostprocessor {

    /* renamed from: a  reason: collision with root package name */
    private c f21810a;

    public b(c cVar) {
        this.f21810a = cVar;
    }

    public final CloseableReference<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
        return CloseableReference.cloneOrNull(platformBitmapFactory.createBitmap(bitmap, this.f21810a.f21771a, this.f21810a.f21772b, this.f21810a.f21773c, this.f21810a.f21774d));
    }
}
