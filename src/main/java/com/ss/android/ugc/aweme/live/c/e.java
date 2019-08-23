package com.ss.android.ugc.aweme.live.c;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.image.c;

public final class e implements Postprocessor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53352a;

    /* renamed from: b  reason: collision with root package name */
    private int f53353b = 5;

    /* renamed from: c  reason: collision with root package name */
    private float f53354c;

    /* renamed from: d  reason: collision with root package name */
    private a f53355d = null;

    public interface a {
    }

    public final String getName() {
        return "blurProcessor";
    }

    public final CacheKey getPostprocessorCacheKey() {
        if (!PatchProxy.isSupport(new Object[0], this, f53352a, false, 55973, new Class[0], CacheKey.class)) {
            return new SimpleCacheKey("blur_bitmap_processor");
        }
        return (CacheKey) PatchProxy.accessDispatch(new Object[0], this, f53352a, false, 55973, new Class[0], CacheKey.class);
    }

    public final CloseableReference<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{bitmap, platformBitmapFactory}, this, f53352a, false, 55972, new Class[]{Bitmap.class, PlatformBitmapFactory.class}, CloseableReference.class)) {
            return (CloseableReference) PatchProxy.accessDispatch(new Object[]{bitmap, platformBitmapFactory}, this, f53352a, false, 55972, new Class[]{Bitmap.class, PlatformBitmapFactory.class}, CloseableReference.class);
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
        if (this.f53354c != 0.0f) {
            float f3 = (float) round;
            float f4 = (float) round2;
            if (Math.abs((f3 / f4) - ((float) this.f53353b)) > 0.2f) {
                int i3 = (int) (f3 / this.f53354c);
                if (i3 > round2) {
                    i2 = (int) (f4 * this.f53354c);
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
        c.a(createScaledBitmap, (Bitmap) createBitmap2.get(), this.f53353b);
        createScaledBitmap.recycle();
        return createBitmap2;
    }

    public e(int i, float f2, a aVar) {
        this.f53354c = f2;
    }
}
