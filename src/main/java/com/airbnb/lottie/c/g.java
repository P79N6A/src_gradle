package com.airbnb.lottie.c;

import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.LruCache;
import com.airbnb.lottie.LottieComposition;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final g f4797a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final LruCache<String, LottieComposition> f4798b = new LruCache<>(10485760);

    public static g a() {
        return f4797a;
    }

    @VisibleForTesting
    g() {
    }

    @Nullable
    public final LottieComposition a(String str) {
        return (LottieComposition) this.f4798b.get(str);
    }

    public final void a(@Nullable String str, @Nullable LottieComposition lottieComposition) {
        if (str != null) {
            this.f4798b.put(str, lottieComposition);
        }
    }
}
