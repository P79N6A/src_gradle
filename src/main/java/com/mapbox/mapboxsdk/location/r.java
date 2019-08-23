package com.mapbox.mapboxsdk.location;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.List;

public abstract class r<K, L> extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f26541a = a();

    /* renamed from: b  reason: collision with root package name */
    final List<L> f26542b;

    /* renamed from: c  reason: collision with root package name */
    public final K f26543c;

    interface a {
        void a(float f2);

        void a(LatLng latLng);

        void b(float f2);
    }

    interface b {
        void b(float f2);

        void b(LatLng latLng);

        void c(float f2);

        void d(float f2);
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract TypeEvaluator b();

    r(K k, K k2, List<L> list) {
        setObjectValues(new Object[]{k, k2});
        setEvaluator(b());
        this.f26542b = list;
        this.f26543c = k2;
        addUpdateListener(this);
    }
}
