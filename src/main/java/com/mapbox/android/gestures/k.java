package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashSet;
import java.util.Set;

@UiThread
public final class k extends i<a> {
    private static final Set<Integer> t;
    public float g;
    public float h;
    public float i;
    public float s;

    public interface a {
        boolean a(k kVar);

        boolean a(k kVar, float f2);

        void b(k kVar);
    }

    public static class b implements a {
        public boolean a(k kVar) {
            return true;
        }

        public boolean a(k kVar, float f2) {
            return false;
        }

        public void b(k kVar) {
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final Set<Integer> a() {
        return t;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        super.c();
        this.i = 0.0f;
    }

    static {
        HashSet hashSet = new HashSet();
        t = hashSet;
        hashSet.add(3);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        super.d();
        ((a) this.f25946f).b(this);
    }

    /* access modifiers changed from: protected */
    public final boolean f() {
        boolean z;
        if (!super.f()) {
            d dVar = (d) this.l.get(new h((Integer) this.k.get(0), (Integer) this.k.get(1)));
            double degrees = Math.toDegrees(Math.abs(Math.atan2((double) dVar.f25956d, (double) dVar.f25955c)));
            if (degrees <= ((double) this.g) || 180.0d - degrees <= ((double) this.g)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        super.b();
        this.s = ((this.f25942b.getY(this.f25942b.findPointerIndex(((Integer) this.k.get(0)).intValue())) + this.f25942b.getY(this.f25942b.findPointerIndex(((Integer) this.k.get(1)).intValue()))) / 2.0f) - ((this.f25943c.getY(this.f25943c.findPointerIndex(((Integer) this.k.get(0)).intValue())) + this.f25943c.getY(this.f25943c.findPointerIndex(((Integer) this.k.get(1)).intValue()))) / 2.0f);
        this.i += this.s;
        if (this.o && this.s != 0.0f) {
            return ((a) this.f25946f).a(this, this.s);
        }
        if (!a(3) || !((a) this.f25946f).a(this)) {
            return false;
        }
        g();
        return true;
    }

    public final void c(@DimenRes int i2) {
        this.h = this.f25941a.getResources().getDimension(C0906R.dimen.i6);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        if (Math.abs(this.i) < this.h || !super.a(i2)) {
            return false;
        }
        return true;
    }

    public k(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }
}
