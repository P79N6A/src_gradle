package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.e;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.e.b;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import javax.annotation.Nullable;

public final class a implements DrawableFactory {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f23634a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final DrawableFactory f23635b;

    public final boolean supportsImageType(CloseableImage closeableImage) {
        return true;
    }

    @Nullable
    public final Drawable createDrawable(CloseableImage closeableImage) {
        boolean z;
        try {
            if (b.isTracing()) {
                b.beginSection("DefaultDrawableFactory#createDrawable");
            }
            if (closeableImage instanceof CloseableStaticBitmap) {
                CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableImage;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f23634a, closeableStaticBitmap.getUnderlyingBitmap());
                boolean z2 = false;
                if (closeableStaticBitmap.getRotationAngle() == 0 || closeableStaticBitmap.getRotationAngle() == -1) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (!(closeableStaticBitmap.getExifOrientation() == 1 || closeableStaticBitmap.getExifOrientation() == 0)) {
                        z2 = true;
                    }
                    if (!z2) {
                        return bitmapDrawable;
                    }
                }
                e eVar = new e(bitmapDrawable, closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
                if (b.isTracing()) {
                    b.endSection();
                }
                return eVar;
            } else if (this.f23635b == null || !this.f23635b.supportsImageType(closeableImage)) {
                if (b.isTracing()) {
                    b.endSection();
                }
                return null;
            } else {
                Drawable createDrawable = this.f23635b.createDrawable(closeableImage);
                if (b.isTracing()) {
                    b.endSection();
                }
                return createDrawable;
            }
        } finally {
            if (b.isTracing()) {
                b.endSection();
            }
        }
    }

    public a(Resources resources, @Nullable DrawableFactory drawableFactory) {
        this.f23634a = resources;
        this.f23635b = drawableFactory;
    }
}
