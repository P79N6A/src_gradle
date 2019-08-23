package com.facebook.imagepipeline.b;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.b.c;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.f.a;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.d;
import java.util.Map;
import javax.annotation.Nullable;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f23810a;

    /* renamed from: b  reason: collision with root package name */
    private final c f23811b;

    /* renamed from: c  reason: collision with root package name */
    private final c f23812c;

    /* renamed from: d  reason: collision with root package name */
    private final f f23813d;

    /* renamed from: e  reason: collision with root package name */
    private final c f23814e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private final Map<c, c> f23815f;

    private static void a(@Nullable a aVar, CloseableReference<Bitmap> closeableReference) {
        if (aVar != null) {
            Bitmap bitmap = (Bitmap) closeableReference.get();
            if (Build.VERSION.SDK_INT >= 12 && aVar.modifiesTransparency()) {
                bitmap.setHasAlpha(true);
            }
            aVar.transform(bitmap);
        }
    }

    public final CloseableStaticBitmap decodeStaticImage(com.facebook.imagepipeline.image.b bVar, ImageDecodeOptions imageDecodeOptions) {
        CloseableReference decodeFromEncodedImageWithColorSpace = this.f23813d.decodeFromEncodedImageWithColorSpace(bVar, imageDecodeOptions.bitmapConfig, null, imageDecodeOptions.transformToSRGB);
        try {
            a(imageDecodeOptions.bitmapTransformation, decodeFromEncodedImageWithColorSpace);
            return new CloseableStaticBitmap(decodeFromEncodedImageWithColorSpace, com.facebook.imagepipeline.image.c.FULL_QUALITY, bVar.getRotationAngle(), bVar.getExifOrientation());
        } finally {
            decodeFromEncodedImageWithColorSpace.close();
        }
    }

    public final CloseableImage decodeAnimatedWebp(com.facebook.imagepipeline.image.b bVar, int i, d dVar, ImageDecodeOptions imageDecodeOptions) {
        return this.f23811b.decode(bVar, i, dVar, imageDecodeOptions);
    }

    public b(c cVar, c cVar2, c cVar3, f fVar) {
        this(cVar, cVar2, cVar3, fVar, null);
    }

    public final CloseableImage decodeGif(com.facebook.imagepipeline.image.b bVar, int i, d dVar, ImageDecodeOptions imageDecodeOptions) {
        if (imageDecodeOptions.forceStaticImage || this.f23810a == null) {
            return decodeStaticImage(bVar, imageDecodeOptions);
        }
        return this.f23810a.decode(bVar, i, dVar, imageDecodeOptions);
    }

    public final CloseableImage decode(com.facebook.imagepipeline.image.b bVar, int i, d dVar, ImageDecodeOptions imageDecodeOptions) {
        if (imageDecodeOptions.customImageDecoder != null) {
            return imageDecodeOptions.customImageDecoder.decode(bVar, i, dVar, imageDecodeOptions);
        }
        c imageFormat = bVar.getImageFormat();
        if (imageFormat == null || imageFormat == c.f23294a) {
            imageFormat = com.facebook.b.d.a(bVar.getInputStream());
            bVar.mImageFormat = imageFormat;
        }
        if (this.f23815f != null) {
            c cVar = this.f23815f.get(imageFormat);
            if (cVar != null) {
                return cVar.decode(bVar, i, dVar, imageDecodeOptions);
            }
        }
        return this.f23814e.decode(bVar, i, dVar, imageDecodeOptions);
    }

    public final CloseableStaticBitmap decodeJpeg(com.facebook.imagepipeline.image.b bVar, int i, d dVar, ImageDecodeOptions imageDecodeOptions) {
        CloseableReference decodeJPEGFromEncodedImageWithColorSpace = this.f23813d.decodeJPEGFromEncodedImageWithColorSpace(bVar, imageDecodeOptions.bitmapConfig, null, i, imageDecodeOptions.transformToSRGB);
        try {
            a(imageDecodeOptions.bitmapTransformation, decodeJPEGFromEncodedImageWithColorSpace);
            return new CloseableStaticBitmap(decodeJPEGFromEncodedImageWithColorSpace, dVar, bVar.getRotationAngle(), bVar.getExifOrientation());
        } finally {
            decodeJPEGFromEncodedImageWithColorSpace.close();
        }
    }

    public b(c cVar, c cVar2, c cVar3, f fVar, @Nullable Map<c, c> map) {
        this.f23814e = new c() {
            public final CloseableImage decode(com.facebook.imagepipeline.image.b bVar, int i, d dVar, ImageDecodeOptions imageDecodeOptions) {
                c imageFormat = bVar.getImageFormat();
                if (imageFormat == com.facebook.b.b.f23288a) {
                    return b.this.decodeJpeg(bVar, i, dVar, imageDecodeOptions);
                }
                if (imageFormat == com.facebook.b.b.f23290c) {
                    return b.this.decodeGif(bVar, i, dVar, imageDecodeOptions);
                }
                if (imageFormat == com.facebook.b.b.j) {
                    return b.this.decodeAnimatedWebp(bVar, i, dVar, imageDecodeOptions);
                }
                if (imageFormat != c.f23294a) {
                    return b.this.decodeStaticImage(bVar, imageDecodeOptions);
                }
                throw new a("unknown image format", bVar);
            }
        };
        this.f23810a = cVar;
        this.f23811b = cVar2;
        this.f23812c = cVar3;
        this.f23813d = fVar;
        this.f23815f = map;
    }
}
