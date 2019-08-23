package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.DimenRes;
import android.support.annotation.UiThread;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.C0906R;
import e.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@UiThread
public abstract class e<L> extends a<L> {
    private final float g;
    private final g h = new g();
    public float j;
    public final List<Integer> k = new ArrayList();
    final HashMap<h, d> l = new HashMap<>();
    public PointF m = new PointF();

    /* access modifiers changed from: protected */
    public boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* access modifiers changed from: protected */
    public int e() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public boolean f() {
        boolean z;
        float f2;
        DisplayMetrics displayMetrics = this.f25941a.getResources().getDisplayMetrics();
        float f3 = ((float) displayMetrics.widthPixels) - this.g;
        float f4 = ((float) displayMetrics.heightPixels) - this.g;
        float f5 = this.g;
        Iterator<Integer> it2 = this.k.iterator();
        do {
            z = false;
            if (it2.hasNext()) {
                int findPointerIndex = this.f25942b.findPointerIndex(it2.next().intValue());
                MotionEvent motionEvent = this.f25942b;
                float rawX = motionEvent.getRawX() - motionEvent.getX();
                float f6 = 0.0f;
                if (findPointerIndex < motionEvent.getPointerCount()) {
                    f2 = motionEvent.getX(findPointerIndex) + rawX;
                } else {
                    f2 = 0.0f;
                }
                MotionEvent motionEvent2 = this.f25942b;
                float rawY = motionEvent2.getRawY() - motionEvent2.getY();
                if (findPointerIndex < motionEvent2.getPointerCount()) {
                    f6 = motionEvent2.getY(findPointerIndex) + rawY;
                }
                if (f2 < f5 || f6 < f5 || f2 > f3 || f6 > f4) {
                    z = true;
                    continue;
                }
            } else {
                for (d dVar : this.l.values()) {
                    if (dVar.f25958f < this.j) {
                        return true;
                    }
                }
                return false;
            }
        } while (!z);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(int i) {
        if (!super.a(i) || f()) {
            return false;
        }
        return true;
    }

    public final void b(@DimenRes int i) {
        this.j = this.f25941a.getResources().getDimension(C0906R.dimen.i4);
    }

    /* access modifiers changed from: protected */
    public boolean b(MotionEvent motionEvent) {
        long j2;
        boolean z;
        boolean z2;
        long j3;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        g gVar = this.h;
        int pointerCount = motionEvent.getPointerCount();
        int size = this.k.size();
        if (size == 0) {
            j2 = 0;
        } else {
            if (Math.abs(pointerCount - size) <= 1) {
                if (pointerCount > size) {
                    j2 = 5;
                } else if (pointerCount >= size) {
                    if (pointerCount == 1) {
                        j3 = 1;
                    } else {
                        j3 = 6;
                    }
                    j2 = (j3 << 8) + 2;
                }
            }
            j2 = 255;
        }
        long j4 = (long) actionMasked;
        if (j4 != j2) {
            while (true) {
                if (j2 == 0) {
                    z = true;
                    break;
                } else if (j4 == (j2 & 255)) {
                    break;
                } else {
                    j2 >>= 8;
                }
            }
        }
        z = false;
        if (z) {
            if (this instanceof i) {
                i iVar = (i) this;
                if (iVar.o) {
                    iVar.d();
                }
            }
            this.k.clear();
            this.l.clear();
        }
        if (!z || actionMasked == 0) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0 || actionMasked2 == 5) {
                this.k.add(Integer.valueOf(motionEvent2.getPointerId(motionEvent.getActionIndex())));
            } else if (actionMasked2 == 1 || actionMasked2 == 6) {
                this.k.remove(Integer.valueOf(motionEvent2.getPointerId(motionEvent.getActionIndex())));
            }
        }
        if (z) {
            a.f83088b.a("Some MotionEvents were not passed to the library.", new Object[0]);
            return false;
        }
        if (actionMasked == 2 && this.k.size() >= e()) {
            if (this.f25942b.getPressure() / this.f25943c.getPressure() > 0.67f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.l.clear();
                int i = 0;
                while (i < this.k.size() - 1) {
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < this.k.size(); i3++) {
                        int intValue = this.k.get(i).intValue();
                        int intValue2 = this.k.get(i3).intValue();
                        float x = this.f25943c.getX(this.f25943c.findPointerIndex(intValue));
                        float y = this.f25943c.getY(this.f25943c.findPointerIndex(intValue));
                        this.l.put(new h(Integer.valueOf(intValue), Integer.valueOf(intValue2)), new d(this.f25943c.getX(this.f25943c.findPointerIndex(intValue2)) - x, this.f25943c.getY(this.f25943c.findPointerIndex(intValue2)) - y, this.f25942b.getX(this.f25942b.findPointerIndex(intValue2)) - this.f25942b.getX(this.f25942b.findPointerIndex(intValue)), this.f25942b.getY(this.f25942b.findPointerIndex(intValue2)) - this.f25942b.getY(this.f25942b.findPointerIndex(intValue))));
                    }
                    i = i2;
                }
                if (!f()) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    float f2 = 0.0f;
                    float f3 = 0.0f;
                    for (int i4 = 0; i4 < pointerCount2; i4++) {
                        f2 += motionEvent2.getX(i4);
                        f3 += motionEvent2.getY(i4);
                    }
                    float f4 = (float) pointerCount2;
                    this.m = new PointF(f2 / f4, f3 / f4);
                    return b();
                }
            }
        }
        return false;
    }

    public e(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.g = (float) ViewConfiguration.get(context).getScaledEdgeSlop();
    }
}
