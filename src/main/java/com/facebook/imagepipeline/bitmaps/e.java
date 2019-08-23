package com.facebook.imagepipeline.bitmaps;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.image.b;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(11)
@ThreadSafe
public class e extends PlatformBitmapFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final String f23830a = "e";

    /* renamed from: b  reason: collision with root package name */
    private final b f23831b;

    /* renamed from: c  reason: collision with root package name */
    private final f f23832c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f23833d;

    public e(b bVar, f fVar) {
        this.f23831b = bVar;
        this.f23832c = fVar;
    }

    private static CloseableReference<Bitmap> a(int i, int i2, Bitmap.Config config) {
        return CloseableReference.of(Bitmap.createBitmap(i, i2, config), f.getInstance());
    }

    @TargetApi(12)
    public CloseableReference<Bitmap> createBitmapInternal(int i, int i2, Bitmap.Config config) {
        b bVar;
        if (this.f23833d) {
            return a(i, i2, config);
        }
        CloseableReference generate = this.f23831b.generate((short) i, (short) i2);
        try {
            bVar = new b(generate);
            bVar.mImageFormat = com.facebook.b.b.f23288a;
            CloseableReference<Bitmap> decodeJPEGFromEncodedImage = this.f23832c.decodeJPEGFromEncodedImage(bVar, config, null, ((com.facebook.common.memory.e) generate.get()).size());
            if (!((Bitmap) decodeJPEGFromEncodedImage.get()).isMutable()) {
                CloseableReference.closeSafely(decodeJPEGFromEncodedImage);
                this.f23833d = true;
                FLog.wtf(f23830a, "Immutable bitmap returned by decoder");
                CloseableReference<Bitmap> a2 = a(i, i2, config);
                b.closeSafely(bVar);
                generate.close();
                return a2;
            }
            ((Bitmap) decodeJPEGFromEncodedImage.get()).setHasAlpha(true);
            ((Bitmap) decodeJPEGFromEncodedImage.get()).eraseColor(0);
            b.closeSafely(bVar);
            generate.close();
            return decodeJPEGFromEncodedImage;
        } catch (Throwable th) {
            generate.close();
            throw th;
        }
    }
}
