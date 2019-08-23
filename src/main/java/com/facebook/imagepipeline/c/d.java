package com.facebook.imagepipeline.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.e;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.p;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(19)
@ThreadSafe
public final class d extends DalvikPurgeableDecoder {

    /* renamed from: a  reason: collision with root package name */
    private final p f23841a;

    public d(p pVar) {
        this.f23841a = pVar;
    }

    public final Bitmap decodeByteArrayAsPurgeable(CloseableReference<e> closeableReference, BitmapFactory.Options options) {
        e eVar = (e) closeableReference.get();
        int size = eVar.size();
        CloseableReference<byte[]> closeableReference2 = this.f23841a.get(size);
        try {
            byte[] bArr = (byte[]) closeableReference2.get();
            eVar.read(0, bArr, 0, size);
            return (Bitmap) Preconditions.checkNotNull(BitmapFactory.decodeByteArray(bArr, 0, size, options), "BitmapFactory returned null");
        } finally {
            CloseableReference.closeSafely(closeableReference2);
        }
    }

    public final Bitmap decodeJPEGByteArrayAsPurgeable(CloseableReference<e> closeableReference, int i, BitmapFactory.Options options) {
        byte[] bArr;
        boolean z;
        if (endsWithEOI(closeableReference, i)) {
            bArr = null;
        } else {
            bArr = EOI;
        }
        e eVar = (e) closeableReference.get();
        if (i <= eVar.size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int i2 = i + 2;
        CloseableReference<byte[]> closeableReference2 = this.f23841a.get(i2);
        try {
            byte[] bArr2 = (byte[]) closeableReference2.get();
            eVar.read(0, bArr2, 0, i);
            if (bArr != null) {
                bArr2[i] = -1;
                bArr2[i + 1] = -39;
                i = i2;
            }
            return (Bitmap) Preconditions.checkNotNull(BitmapFactory.decodeByteArray(bArr2, 0, i, options), "BitmapFactory returned null");
        } finally {
            CloseableReference.closeSafely(closeableReference2);
        }
    }
}
