package com.facebook.imagepipeline.c;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
import android.support.v4.util.Pools;
import com.facebook.imagepipeline.memory.d;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(21)
@ThreadSafe
public final class a extends b {
    public a(d dVar, int i, Pools.SynchronizedPool synchronizedPool) {
        super(dVar, i, synchronizedPool);
    }

    public final int getBitmapSize(int i, int i2, BitmapFactory.Options options) {
        return com.facebook.imageutils.a.a(i, i2, options.inPreferredConfig);
    }
}
