package com.mapbox.android.gestures;

import android.content.Context;
import android.os.Build;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

@UiThread
public final class n extends i<b> {
    private static final Set<Integer> v;
    public ScaleGestureDetector g;
    ScaleGestureDetector.OnScaleGestureListener h = new ScaleGestureDetector.OnScaleGestureListener() {
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            return n.this.a(scaleGestureDetector);
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return n.this.b(scaleGestureDetector);
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            n.this.i();
        }
    };
    public boolean i;
    float s;
    float t;
    public float u;
    private boolean w;

    public static class a implements b {
        public void a(n nVar, float f2, float f3) {
        }

        public boolean a(n nVar) {
            return true;
        }

        public boolean b(n nVar) {
            return false;
        }
    }

    public interface b {
        void a(n nVar, float f2, float f3);

        boolean a(n nVar);

        boolean b(n nVar);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final Set<Integer> a() {
        return v;
    }

    public final void h() {
        super.h();
        this.w = true;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.w = true;
        d();
    }

    static {
        HashSet hashSet = new HashSet();
        v = hashSet;
        hashSet.add(1);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (!this.o) {
            super.d();
            return;
        }
        if (this.w) {
            super.d();
            ((b) this.f25946f).a(this, this.q, this.r);
            this.w = false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean b(MotionEvent motionEvent) {
        super.b(motionEvent);
        return this.g.onTouchEvent(motionEvent);
    }

    public final void c(@DimenRes int i2) {
        this.u = this.f25941a.getResources().getDimension(C0906R.dimen.i5);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        this.s = scaleGestureDetector.getCurrentSpan();
        if (!a(1)) {
            return false;
        }
        this.p = VelocityTracker.obtain();
        if (this.u == 0.0f && ((b) this.f25946f).a(this)) {
            g();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        if (this.s == 0.0f) {
            this.s = scaleGestureDetector.getCurrentSpan();
        }
        this.t = Math.abs(this.s - scaleGestureDetector.getCurrentSpan());
        boolean z = false;
        if (this.o || !a(1) || this.t < this.u) {
            if (!this.o) {
                return true;
            }
            if (scaleGestureDetector.getScaleFactor() < 1.0f) {
                z = true;
            }
            this.i = z;
            return ((b) this.f25946f).b(this);
        } else if (!((b) this.f25946f).a(this)) {
            return false;
        } else {
            g();
            return true;
        }
    }

    public n(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.g = new ScaleGestureDetector(context, this.h);
        try {
            Field declaredField = this.g.getClass().getDeclaredField("mMinSpan");
            declaredField.setAccessible(true);
            if (Build.VERSION.SDK_INT >= 24) {
                declaredField.set(this.g, Integer.valueOf((int) this.f25941a.getResources().getDimension(C0906R.dimen.ib)));
            } else {
                declaredField.set(this.g, Integer.valueOf((int) this.f25941a.getResources().getDimension(C0906R.dimen.ia)));
            }
            Field declaredField2 = this.g.getClass().getDeclaredField("mSpanSlop");
            declaredField2.setAccessible(true);
            declaredField2.set(this.g, Integer.valueOf(ViewConfiguration.get(this.f25941a).getScaledTouchSlop()));
        } catch (NoSuchFieldException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }
}
