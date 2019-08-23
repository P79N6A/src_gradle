package com.facebook.imagepipeline.bitmaps;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.facebook.common.g.a;
import com.facebook.common.memory.e;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.memory.ae;
import com.facebook.imagepipeline.memory.p;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b f23828a;

    /* renamed from: b  reason: collision with root package name */
    private final p f23829b;

    public d(ae aeVar) {
        this.f23829b = aeVar.getFlexByteArrayPool();
        this.f23828a = new b(aeVar.getPooledByteBufferFactory());
    }

    @TargetApi(12)
    public final Bitmap createNakedBitmap(int i, int i2, Bitmap.Config config) {
        b bVar;
        BitmapFactory.Options options;
        int size;
        e eVar;
        CloseableReference closeableReference;
        CloseableReference generate = this.f23828a.generate((short) i, (short) i2);
        CloseableReference closeableReference2 = null;
        try {
            bVar = new b(generate);
            try {
                bVar.mImageFormat = com.facebook.b.b.f23288a;
                int i3 = bVar.mSampleSize;
                options = new BitmapFactory.Options();
                options.inDither = true;
                options.inPreferredConfig = config;
                options.inPurgeable = true;
                options.inInputShareable = true;
                options.inSampleSize = i3;
                if (Build.VERSION.SDK_INT >= 11) {
                    options.inMutable = true;
                }
                size = ((e) generate.get()).size();
                eVar = (e) generate.get();
                closeableReference = this.f23829b.get(size + 2);
            } catch (Throwable th) {
                th = th;
                CloseableReference.closeSafely(closeableReference2);
                b.closeSafely(bVar);
                CloseableReference.closeSafely(generate);
                throw th;
            }
            try {
                byte[] bArr = (byte[]) closeableReference.get();
                eVar.read(0, bArr, 0, size);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, options);
                decodeByteArray.setHasAlpha(true);
                decodeByteArray.eraseColor(0);
                CloseableReference.closeSafely(closeableReference);
                b.closeSafely(bVar);
                CloseableReference.closeSafely(generate);
                return decodeByteArray;
            } catch (Throwable th2) {
                th = th2;
                closeableReference2 = closeableReference;
                CloseableReference.closeSafely(closeableReference2);
                b.closeSafely(bVar);
                CloseableReference.closeSafely(generate);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bVar = null;
            CloseableReference.closeSafely(closeableReference2);
            b.closeSafely(bVar);
            CloseableReference.closeSafely(generate);
            throw th;
        }
    }
}
