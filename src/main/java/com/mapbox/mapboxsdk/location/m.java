package com.mapbox.mapboxsdk.location;

import android.location.Location;
import android.util.SparseArray;
import android.view.animation.LinearInterpolator;
import com.mapbox.mapboxsdk.location.r;
import com.mapbox.mapboxsdk.maps.x;
import java.util.ArrayList;
import java.util.List;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    final SparseArray<r> f26502a;

    /* renamed from: b  reason: collision with root package name */
    final List<r.b> f26503b;

    /* renamed from: c  reason: collision with root package name */
    final List<r.a> f26504c;

    /* renamed from: d  reason: collision with root package name */
    final x f26505d;

    /* renamed from: e  reason: collision with root package name */
    Location f26506e;

    /* renamed from: f  reason: collision with root package name */
    float f26507f;
    long g;
    public float h;
    public boolean i;
    public boolean j;
    private float k;

    static float a(boolean z, float f2) {
        if (z) {
            return 0.0f;
        }
        return f2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        for (int i2 = 0; i2 < this.f26502a.size(); i2++) {
            a(this.f26502a.keyAt(i2));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        r rVar = this.f26502a.get(i2);
        if (rVar != null) {
            rVar.cancel();
            rVar.removeAllUpdateListeners();
            rVar.removeAllListeners();
            this.f26502a.put(i2, null);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, r rVar) {
        a(i2);
        this.f26502a.put(i2, rVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, boolean z) {
        float f3;
        long j2;
        if (this.k < 0.0f) {
            this.k = f2;
        }
        g gVar = (g) this.f26502a.get(6);
        if (gVar != null) {
            f3 = ((Float) gVar.getAnimatedValue()).floatValue();
        } else {
            f3 = this.k;
        }
        a(6, (r) new g(Float.valueOf(f3), Float.valueOf(f2), this.f26503b));
        if (z || !this.j) {
            j2 = 0;
        } else {
            j2 = 250;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f26502a.get(6));
        s.a(arrayList, new LinearInterpolator(), j2);
        this.k = f2;
    }
}
