package com.facebook.imagepipeline.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.util.Pools;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imageutils.a;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(26)
@ThreadSafe
public final class e extends b {
    public e(d dVar, int i, Pools.SynchronizedPool synchronizedPool) {
        super(dVar, i, synchronizedPool);
    }

    public final int getBitmapSize(int i, int i2, BitmapFactory.Options options) {
        boolean z;
        if (options.outColorSpace == null || !options.outColorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return i * i2 * 8;
        }
        return a.a(i, i2, options.inPreferredConfig);
    }
}
