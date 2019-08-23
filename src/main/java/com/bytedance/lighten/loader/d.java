package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.os.Build;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public final class d implements Supplier<MemoryCacheParams> {

    /* renamed from: a  reason: collision with root package name */
    private ActivityManager f21812a;

    public final /* synthetic */ Object get() {
        int i;
        int min = Math.min(this.f21812a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            i = 4194304;
        } else if (min < 67108864) {
            i = 6291456;
        } else {
            i = min / 4;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            MemoryCacheParams memoryCacheParams = new MemoryCacheParams(i, SearchJediMixFeedAdapter.f42517f, i / 12, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return memoryCacheParams;
        }
        MemoryCacheParams memoryCacheParams2 = new MemoryCacheParams(i, 256, i / 8, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return memoryCacheParams2;
    }

    public d(ActivityManager activityManager) {
        this.f21812a = activityManager;
    }
}
