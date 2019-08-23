package com.facebook.imagepipeline.cache;

import android.app.ActivityManager;
import android.os.Build;
import com.facebook.common.internal.Supplier;

public class h implements Supplier<MemoryCacheParams> {

    /* renamed from: a  reason: collision with root package name */
    private final ActivityManager f23879a;

    public MemoryCacheParams get() {
        int i;
        int min = Math.min(this.f23879a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            i = 4194304;
        } else if (min < 67108864) {
            i = 6291456;
        } else if (Build.VERSION.SDK_INT < 11) {
            i = 8388608;
        } else {
            i = min / 4;
        }
        MemoryCacheParams memoryCacheParams = new MemoryCacheParams(i, 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return memoryCacheParams;
    }

    public h(ActivityManager activityManager) {
        this.f23879a = activityManager;
    }
}
