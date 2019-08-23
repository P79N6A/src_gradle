package com.ss.android.ugc.aweme.newfollow.live;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.image.c;

public final class a implements Postprocessor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57162a;

    /* renamed from: b  reason: collision with root package name */
    private int f57163b = 5;

    /* renamed from: c  reason: collision with root package name */
    private float f57164c;

    /* renamed from: d  reason: collision with root package name */
    private C0651a f57165d = null;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.live.a$a  reason: collision with other inner class name */
    public interface C0651a {
    }

    public final String getName() {
        return "blurProcessor";
    }

    public final CacheKey getPostprocessorCacheKey() {
        if (!PatchProxy.isSupport(new Object[0], this, f57162a, false, 61186, new Class[0], CacheKey.class)) {
            return new SimpleCacheKey("blur_bitmap_processor");
        }
        return (CacheKey) PatchProxy.accessDispatch(new Object[0], this, f57162a, false, 61186, new Class[0], CacheKey.class);
    }

    public final CloseableReference<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{bitmap, platformBitmapFactory}, this, f57162a, false, 61185, new Class[]{Bitmap.class, PlatformBitmapFactory.class}, CloseableReference.class)) {
            return (CloseableReference) PatchProxy.accessDispatch(new Object[]{bitmap, platformBitmapFactory}, this, f57162a, false, 61185, new Class[]{Bitmap.class, PlatformBitmapFactory.class}, CloseableReference.class);
        }
        float f2 = 0.1f;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 100 || height < 100) {
            f2 = 0.6f;
        } else if (width < 200 || height < 200) {
            f2 = 0.3f;
        }
        int round = Math.round(((float) width) * f2);
        int round2 = Math.round(((float) height) * f2);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        if (this.f57164c != 0.0f) {
            float f3 = (float) round;
            float f4 = (float) round2;
            if (Math.abs((f3 / f4) - ((float) this.f57163b)) > 0.2f) {
                int i3 = (int) (f3 / this.f57164c);
                if (i3 > round2) {
                    i2 = (int) (f4 * this.f57164c);
                    i = round2;
                } else {
                    i = i3;
                    i2 = round;
                }
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (round - i2) >> 1, (round2 - i) >> 1, i2, i);
                createScaledBitmap.recycle();
                createScaledBitmap = createBitmap;
                round = i2;
                round2 = i;
            }
        }
        CloseableReference<Bitmap> createBitmap2 = platformBitmapFactory.createBitmap(round, round2);
        c.a(createScaledBitmap, (Bitmap) createBitmap2.get(), this.f57163b);
        createScaledBitmap.recycle();
        return createBitmap2;
    }

    public a(int i, float f2, C0651a aVar) {
        this.f57164c = f2;
    }
}
