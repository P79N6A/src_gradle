package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import java.util.HashSet;
import java.util.Set;

@UiThread
public final class j extends i<a> {
    private static final Set<Integer> s;
    public float g;
    public float h;
    public float i;

    public interface a {
        boolean a(j jVar);

        boolean a(j jVar, float f2);

        void b(j jVar, float f2);
    }

    public static class b implements a {
        public boolean a(j jVar) {
            return true;
        }

        public boolean a(j jVar, float f2) {
            return true;
        }

        public void b(j jVar, float f2) {
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final Set<Integer> a() {
        return s;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        super.c();
        this.h = 0.0f;
    }

    static {
        HashSet hashSet = new HashSet();
        s = hashSet;
        hashSet.add(2);
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        super.b();
        d dVar = (d) this.l.get(new h((Integer) this.k.get(0), (Integer) this.k.get(1)));
        this.i = (float) Math.toDegrees(Math.atan2((double) dVar.f25954b, (double) dVar.f25953a) - Math.atan2((double) dVar.f25956d, (double) dVar.f25955c));
        this.h += this.i;
        if (this.o && this.i != 0.0f) {
            return ((a) this.f25946f).a(this, this.i);
        }
        if (!a(2) || !((a) this.f25946f).a(this)) {
            return false;
        }
        g();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        super.d();
        if (this.i == 0.0f) {
            this.q = 0.0f;
            this.r = 0.0f;
        }
        float f2 = this.q;
        double d2 = (double) ((this.m.x * this.r) + (this.m.y * f2));
        Double.isNaN(d2);
        float abs = Math.abs((float) (d2 / (Math.pow((double) this.m.x, 2.0d) + Math.pow((double) this.m.y, 2.0d))));
        if (this.i < 0.0f) {
            abs = -abs;
        }
        ((a) this.f25946f).b(this, abs);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        if (Math.abs(this.h) < this.g || !super.a(i2)) {
            return false;
        }
        return true;
    }

    public j(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }
}
