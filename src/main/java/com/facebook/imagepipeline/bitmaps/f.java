package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import com.facebook.common.references.b;

public final class f implements b<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private static f f23834a;

    private f() {
    }

    public static f getInstance() {
        if (f23834a == null) {
            f23834a = new f();
        }
        return f23834a;
    }

    public final void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
