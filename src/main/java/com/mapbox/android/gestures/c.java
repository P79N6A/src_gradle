package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@UiThread
public final class c extends i<a> {
    private static final Set<Integer> s;
    public float g;
    public float h;
    public float i;
    private PointF t;
    private boolean u;
    private final Map<Integer, b> v = new HashMap();

    public interface a {
        boolean a(c cVar);

        boolean a(c cVar, float f2, float f3);

        void b(c cVar);
    }

    public static class b implements a {
        public boolean a(c cVar) {
            return true;
        }

        public boolean a(c cVar, float f2, float f3) {
            return false;
        }

        public void b(c cVar) {
        }
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return 1;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final Set<Integer> a() {
        return s;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        super.c();
    }

    /* access modifiers changed from: protected */
    public final void d() {
        super.d();
        ((a) this.f25946f).b(this);
    }

    static {
        HashSet hashSet = new HashSet();
        s = hashSet;
        hashSet.add(13);
    }

    private boolean i() {
        for (b next : this.v.values()) {
            if (Math.abs(next.i) < this.i) {
                if (Math.abs(next.j) >= this.i) {
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        super.b();
        for (Integer intValue : this.k) {
            int intValue2 = intValue.intValue();
            b bVar = this.v.get(Integer.valueOf(intValue2));
            float x = this.f25942b.getX(this.f25942b.findPointerIndex(intValue2));
            float y = this.f25942b.getY(this.f25942b.findPointerIndex(intValue2));
            bVar.f25949c = bVar.f25951e;
            bVar.f25950d = bVar.f25952f;
            bVar.f25951e = x;
            bVar.f25952f = y;
            bVar.g = bVar.f25949c - bVar.f25951e;
            bVar.h = bVar.f25950d - bVar.f25952f;
            bVar.i = bVar.f25947a - bVar.f25951e;
            bVar.j = bVar.f25948b - bVar.f25952f;
        }
        if (this.o) {
            PointF pointF = this.m;
            this.g = this.t.x - pointF.x;
            this.h = this.t.y - pointF.y;
            this.t = pointF;
            if (!this.u) {
                return ((a) this.f25946f).a(this, this.g, this.h);
            }
            this.u = false;
            return ((a) this.f25946f).a(this, 0.0f, 0.0f);
        } else if (!a(13) || !((a) this.f25946f).a(this)) {
            return false;
        } else {
            g();
            this.t = this.m;
            this.u = false;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        if (!super.a(i2) || !i()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean b(MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 5:
                this.u = true;
                this.v.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new b(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
                break;
            case 1:
                this.v.clear();
                break;
            case 3:
                this.v.clear();
                break;
            case 6:
                this.u = true;
                this.v.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                break;
        }
        return super.b(motionEvent);
    }

    public c(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }
}
