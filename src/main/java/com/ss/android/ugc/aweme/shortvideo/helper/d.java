package com.ss.android.ugc.aweme.shortvideo.helper;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.b;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.bitmaps.f;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68124a;

    public static CloseableReference<CloseableImage> a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (!PatchProxy.isSupport(new Object[]{bitmap2}, null, f68124a, true, 77453, new Class[]{Bitmap.class}, CloseableReference.class)) {
            return CloseableReference.of(new CloseableStaticBitmap(bitmap2, (b<Bitmap>) f.getInstance(), c.FULL_QUALITY, 0));
        }
        return (CloseableReference) PatchProxy.accessDispatch(new Object[]{bitmap2}, null, f68124a, true, 77453, new Class[]{Bitmap.class}, CloseableReference.class);
    }

    @CanIgnoreReturnValue
    public static void a(@NonNull CloseableReference<CloseableImage> closeableReference, @NonNull String str) {
        CloseableReference<CloseableImage> closeableReference2 = closeableReference;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{closeableReference2, str2}, null, f68124a, true, 77454, new Class[]{CloseableReference.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeableReference2, str2}, null, f68124a, true, 77454, new Class[]{CloseableReference.class, String.class}, Void.TYPE);
            return;
        }
        Fresco.getImagePipelineFactory().getBitmapMemoryCache().cache(DefaultCacheKeyFactory.getInstance().getBitmapCacheKey(ImageRequest.fromUri("file://" + str2), null), closeableReference2);
    }
}
