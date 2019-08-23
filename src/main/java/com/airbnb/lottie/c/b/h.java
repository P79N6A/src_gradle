package com.airbnb.lottie.c.b;

import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.a.b;
import com.airbnb.lottie.a.a.k;
import com.airbnb.lottie.d;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4724a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4725b;

    public enum a {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        public static a forId(int i) {
            switch (i) {
                case 1:
                    return Merge;
                case 2:
                    return Add;
                case 3:
                    return Subtract;
                case 4:
                    return Intersect;
                case 5:
                    return ExcludeIntersections;
                default:
                    return Merge;
            }
        }
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f4725b + '}';
    }

    public h(String str, a aVar) {
        this.f4724a = str;
        this.f4725b = aVar;
    }

    @Nullable
    public final b a(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar) {
        if (lottieDrawable.enableMergePathsForKitKatAndAbove()) {
            return new k(this);
        }
        d.a("Animation contains merge paths but they are disabled.");
        return null;
    }
}
