package com.facebook.imagepipeline.bitmaps;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.d;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(21)
@ThreadSafe
public final class a extends PlatformBitmapFactory {

    /* renamed from: a  reason: collision with root package name */
    private final d f23824a;

    public a(d dVar) {
        this.f23824a = dVar;
    }

    public final CloseableReference<Bitmap> createBitmapInternal(int i, int i2, Bitmap.Config config) {
        boolean z;
        Bitmap bitmap = (Bitmap) this.f23824a.get(com.facebook.imageutils.a.a(i, i2, config));
        if (bitmap.getAllocationByteCount() >= i * i2 * com.facebook.imageutils.a.a(config)) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        bitmap.reconfigure(i, i2, config);
        return CloseableReference.of(bitmap, this.f23824a);
    }
}
