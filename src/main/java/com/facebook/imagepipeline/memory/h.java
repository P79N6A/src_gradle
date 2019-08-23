package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.b;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(21)
@ThreadSafe
public final class h extends a<Bitmap> implements d {
    /* access modifiers changed from: protected */
    public final int b(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    public final int c(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final /* synthetic */ Object a(f fVar) {
        Bitmap bitmap = (Bitmap) super.a(fVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ int b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Preconditions.checkNotNull(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(int i) {
        double d2 = (double) i;
        Double.isNaN(d2);
        return Bitmap.createBitmap(1, (int) Math.ceil(d2 / 2.0d), Bitmap.Config.RGB_565);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean c(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Preconditions.checkNotNull(bitmap);
        if (bitmap.isRecycled() || !bitmap.isMutable()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Preconditions.checkNotNull(bitmap);
        bitmap.recycle();
    }

    public h(b bVar, af afVar, ag agVar) {
        super(bVar, afVar, agVar);
        a();
    }
}
