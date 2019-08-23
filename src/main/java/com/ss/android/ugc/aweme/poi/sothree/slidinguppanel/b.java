package com.ss.android.ugc.aweme.poi.sothree.slidinguppanel;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.widget.ScrollerCompat;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Arrays;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60376a;
    private static final Interpolator x = new Interpolator() {
        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public int f60377b;

    /* renamed from: c  reason: collision with root package name */
    public int f60378c;

    /* renamed from: d  reason: collision with root package name */
    public int f60379d = -1;

    /* renamed from: e  reason: collision with root package name */
    float[] f60380e;

    /* renamed from: f  reason: collision with root package name */
    float[] f60381f;
    int[] g;
    VelocityTracker h;
    public float i;
    public int j;
    public int k;
    ScrollerCompat l;
    final a m;
    public View n;
    boolean o;
    final ViewGroup p;
    final Runnable q = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60382a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f60382a, false, 65847, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60382a, false, 65847, new Class[0], Void.TYPE);
                return;
            }
            b.this.b(0);
        }
    };
    private float[] r;
    private float[] s;
    private int[] t;
    private int[] u;
    private int v;
    private float w;

    public static abstract class a {
        public static int c(int i) {
            return i;
        }

        public int a() {
            return 0;
        }

        public int a(View view, int i, int i2) {
            return 0;
        }

        public void a(int i) {
        }

        public void a(View view, float f2, float f3) {
        }

        public void a(View view, int i) {
        }

        public void a(View view, int i, int i2, int i3, int i4) {
        }

        public abstract boolean a(View view);

        public abstract void b(int i);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60376a, false, 65813, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60376a, false, 65813, new Class[0], Void.TYPE);
            return;
        }
        a();
        if (this.f60377b == 2) {
            int currX = this.l.getCurrX();
            int currY = this.l.getCurrY();
            this.l.abortAnimation();
            int currX2 = this.l.getCurrX();
            int currY2 = this.l.getCurrY();
            this.m.a(this.n, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        b(0);
    }

    public final boolean a(View view, int i2, int i3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65814, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65814, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.n = view2;
        this.f60379d = -1;
        int i4 = i2;
        return a(i2, i3, 0, 0);
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60376a, false, 65816, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60376a, false, 65816, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int left = this.n.getLeft();
        int top = this.n.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.l.abortAnimation();
            b(0);
            return false;
        }
        int a2 = a(this.n, i6, i7, i4, i5);
        if (this.m != null) {
            this.m.b(a2);
        }
        this.l.startScroll(left, top, i6, i7, a2);
        b(2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (this.f60380e != null && this.f60380e.length > i2) {
            this.f60380e[i2] = 0.0f;
            this.f60381f[i2] = 0.0f;
            this.r[i2] = 0.0f;
            this.s[i2] = 0.0f;
            this.g[i2] = 0;
            this.t[i2] = 0;
            this.u[i2] = 0;
            this.v = ((1 << i2) ^ -1) & this.v;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(float f2, float f3, int i2) {
        float f4 = f2;
        float f5 = f3;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2)}, this, f60376a, false, 65827, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2)}, this, f60376a, false, 65827, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        c(i3);
        this.f60380e[i3] = f4;
        this.r[i3] = f4;
        this.f60381f[i3] = f5;
        this.s[i3] = f5;
        this.g[i3] = c((int) f4, (int) f5);
        this.v |= 1 << i3;
    }

    /* access modifiers changed from: package-private */
    public void a(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f60376a, false, 65828, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f60376a, false, 65828, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = MotionEventCompat.getPointerId(motionEvent, i2);
            float x2 = MotionEventCompat.getX(motionEvent, i2);
            float y = MotionEventCompat.getY(motionEvent, i2);
            if (this.r != null && this.s != null && this.r.length > pointerId && this.s.length > pointerId) {
                this.r[pointerId] = x2;
                this.s[pointerId] = y;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60376a, false, 65829, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60376a, false, 65829, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f60377b != i2) {
            this.f60377b = i2;
            this.m.a(i2);
            if (this.f60377b == 0) {
                this.n = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f60376a, false, 65830, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f60376a, false, 65830, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view == this.n && this.f60379d == i2) {
            return true;
        } else {
            if (view == null || !this.m.a(view)) {
                return false;
            }
            this.f60379d = i2;
            b(view, i2);
            return true;
        }
    }

    public final void b(MotionEvent motionEvent) {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f60376a, false, 65833, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f60376a, false, 65833, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (actionMasked == 0) {
            a();
        }
        if (this.h == null) {
            this.h = VelocityTracker.obtain();
        }
        this.h.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x2 = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                View a2 = a((int) x2, (int) y);
                a(x2, y, pointerId);
                a(a2, pointerId);
                if ((this.g[pointerId] & this.k) != 0) {
                    return;
                }
                break;
            case 1:
                if (this.f60377b == 1) {
                    e();
                }
                a();
                return;
            case 2:
                if (this.f60377b == 1) {
                    int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.f60379d);
                    float x3 = MotionEventCompat.getX(motionEvent, findPointerIndex);
                    float y2 = MotionEventCompat.getY(motionEvent, findPointerIndex);
                    int i4 = (int) (x3 - this.r[this.f60379d]);
                    int i5 = (int) (y2 - this.s[this.f60379d]);
                    b(this.n.getLeft() + i4, this.n.getTop() + i5, i4, i5);
                    a(motionEvent);
                    return;
                }
                int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
                while (i3 < pointerCount) {
                    int pointerId2 = MotionEventCompat.getPointerId(motionEvent, i3);
                    float x4 = MotionEventCompat.getX(motionEvent, i3);
                    float y3 = MotionEventCompat.getY(motionEvent, i3);
                    float f2 = x4 - this.f60380e[pointerId2];
                    float f3 = y3 - this.f60381f[pointerId2];
                    b(f2, f3, pointerId2);
                    if (this.f60377b != 1) {
                        View a3 = a((int) this.f60380e[pointerId2], (int) this.f60381f[pointerId2]);
                        if (!a(a3, f2, f3) || !a(a3, pointerId2)) {
                            i3++;
                        }
                    }
                    a(motionEvent);
                    return;
                }
                a(motionEvent);
                return;
            case 3:
                if (this.f60377b == 1) {
                    a(0.0f, 0.0f);
                }
                a();
                break;
            case 5:
                int pointerId3 = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                float x5 = MotionEventCompat.getX(motionEvent, actionIndex);
                float y4 = MotionEventCompat.getY(motionEvent, actionIndex);
                a(x5, y4, pointerId3);
                if (this.f60377b == 0) {
                    a(a((int) x5, (int) y4), pointerId3);
                    return;
                } else if (b((int) x5, (int) y4)) {
                    a(this.n, pointerId3);
                    return;
                }
                break;
            case 6:
                int pointerId4 = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                if (this.f60377b == 1 && pointerId4 == this.f60379d) {
                    int pointerCount2 = MotionEventCompat.getPointerCount(motionEvent);
                    while (true) {
                        if (i3 < pointerCount2) {
                            int pointerId5 = MotionEventCompat.getPointerId(motionEvent, i3);
                            if (pointerId5 != this.f60379d) {
                                if (a((int) MotionEventCompat.getX(motionEvent, i3), (int) MotionEventCompat.getY(motionEvent, i3)) == this.n && a(this.n, pointerId5)) {
                                    i2 = this.f60379d;
                                }
                            }
                            i3++;
                        } else {
                            i2 = -1;
                        }
                    }
                    if (i2 == -1) {
                        e();
                    }
                }
                a(pointerId4);
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(float f2, float f3, int i2) {
        float f4 = f2;
        float f5 = f3;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2)}, this, f60376a, false, 65834, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2)}, this, f60376a, false, 65834, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        boolean a2 = a(f4, f5, i3, 1);
        if (a(f5, f4, i3, 4)) {
            a2 |= true;
        }
        if (a(f4, f5, i3, 2)) {
            a2 |= true;
        }
        if (a(f5, f4, i3, 8)) {
            a2 |= true;
        }
        if (a2) {
            int[] iArr = this.t;
            iArr[i3] = a2 | iArr[i3];
        }
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65835, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65835, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        float abs = Math.abs(f2);
        return ((this.g[i2] & i4) != i4 || (this.k & i4) == 0 || (this.u[i2] & i4) == i4 || (this.t[i2] & i4) == i4 || (abs <= ((float) this.f60378c) && Math.abs(f3) <= ((float) this.f60378c)) || (this.t[i2] & i4) != 0 || abs <= ((float) this.f60378c)) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f60376a, false, 65836, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f60376a, false, 65836, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view == null) {
            return false;
        } else {
            return (this.m.a() > 0) && Math.abs(f3) > ((float) this.f60378c);
        }
    }

    public final View a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65845, new Class[]{Integer.TYPE, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65845, new Class[]{Integer.TYPE, Integer.TYPE}, View.class);
        }
        for (int childCount = this.p.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.p.getChildAt(a.c(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean c() {
        if (this.f60377b == 1) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60376a, false, 65812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60376a, false, 65812, new Class[0], Void.TYPE);
            return;
        }
        this.f60379d = -1;
        d();
        if (this.h != null) {
            this.h.recycle();
            this.h = null;
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f60376a, false, 65825, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60376a, false, 65825, new Class[0], Void.TYPE);
        } else if (this.f60380e != null) {
            Arrays.fill(this.f60380e, 0.0f);
            Arrays.fill(this.f60381f, 0.0f);
            Arrays.fill(this.r, 0.0f);
            Arrays.fill(this.s, 0.0f);
            Arrays.fill(this.g, 0);
            Arrays.fill(this.t, 0);
            Arrays.fill(this.u, 0);
            this.v = 0;
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f60376a, false, 65841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60376a, false, 65841, new Class[0], Void.TYPE);
            return;
        }
        this.h.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, this.w);
        a(a(VelocityTrackerCompat.getXVelocity(this.h, this.f60379d), this.i, this.w), a(VelocityTrackerCompat.getYVelocity(this.h, this.f60379d), this.i, this.w));
    }

    private float a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f60376a, false, 65821, new Class[]{Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f60376a, false, 65821, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
        }
        double d2 = (double) (f2 - 0.5f);
        Double.isNaN(d2);
        return (float) Math.sin((double) ((float) (d2 * 0.4712389167638204d)));
    }

    private void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60376a, false, 65826, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60376a, false, 65826, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f60380e == null || this.f60380e.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr = new float[i3];
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (this.f60380e != null) {
                System.arraycopy(this.f60380e, 0, fArr, 0, this.f60380e.length);
                System.arraycopy(this.f60381f, 0, fArr2, 0, this.f60381f.length);
                System.arraycopy(this.r, 0, fArr3, 0, this.r.length);
                System.arraycopy(this.s, 0, fArr4, 0, this.s.length);
                System.arraycopy(this.g, 0, iArr, 0, this.g.length);
                System.arraycopy(this.t, 0, iArr2, 0, this.t.length);
                System.arraycopy(this.u, 0, iArr3, 0, this.u.length);
            }
            this.f60380e = fArr;
            this.f60381f = fArr2;
            this.r = fArr3;
            this.s = fArr4;
            this.g = iArr;
            this.t = iArr2;
            this.u = iArr3;
        }
    }

    private void b(View view, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f60376a, false, 65811, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f60376a, false, 65811, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
        } else if (view.getParent() == this.p) {
            this.n = view;
            this.f60379d = i2;
            this.m.a(view, i2);
            b(1);
        } else {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.p + ")");
        }
    }

    private int c(int i2, int i3) {
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65846, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65846, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (i2 < this.p.getLeft() + this.j) {
            i4 = 1;
        }
        if (i3 < this.p.getTop() + this.j) {
            i4 |= 4;
        }
        if (i2 > this.p.getRight() - this.j) {
            i4 |= 2;
        }
        if (i3 > this.p.getBottom() - this.j) {
            i4 |= 8;
        }
        return i4;
    }

    private boolean b(int i2, int i3) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65843, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return b(this.n, i2, i3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65843, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    private void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f60376a, false, 65824, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f60376a, false, 65824, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.o = true;
        this.m.a(this.n, f2, f3);
        this.o = false;
        if (this.f60377b == 1) {
            b(0);
        }
    }

    private float a(float f2, float f3, float f4) {
        float f5 = f4;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, f60376a, false, 65820, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, f60376a, false, 65820, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
        }
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs <= f5) {
            return f2;
        }
        if (f2 > 0.0f) {
            return f5;
        }
        return -f5;
    }

    private int b(int i2, int i3, int i4) {
        int i5 = i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60376a, false, 65819, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60376a, false, 65819, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs <= i5) {
            return i2;
        }
        if (i2 > 0) {
            return i5;
        }
        return -i5;
    }

    private int a(int i2, int i3, int i4) {
        int i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60376a, false, 65818, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60376a, false, 65818, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i2 == 0) {
            return 0;
        } else {
            int width = this.p.getWidth();
            float f2 = (float) (width / 2);
            float a2 = f2 + (a(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
            int abs = Math.abs(i3);
            if (abs > 0) {
                i5 = Math.round(Math.abs(a2 / ((float) abs)) * 1000.0f) * 4;
            } else {
                i5 = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
            }
            return Math.min(i5, 600);
        }
    }

    private boolean b(View view, int i2, int i3) {
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65844, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60376a, false, 65844, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view != null && i4 >= view.getLeft() && i4 < view.getRight() && i5 >= view.getTop() && i5 < view.getBottom()) {
            return true;
        } else {
            return false;
        }
    }

    b(Context context, ViewGroup viewGroup, Interpolator interpolator, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.p = viewGroup;
            this.m = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.j = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f60378c = viewConfiguration.getScaledTouchSlop();
            this.w = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.i = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.l = ScrollerCompat.create(context, interpolator == null ? x : interpolator);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private void b(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60376a, false, 65842, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60376a, false, 65842, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int left = this.n.getLeft();
        int top = this.n.getTop();
        if (i4 != 0) {
            this.n.offsetLeftAndRight(0 - left);
            i6 = 0;
        } else {
            i6 = i2;
        }
        if (i8 != 0) {
            int a2 = this.m.a(this.n, i3, i8);
            this.n.offsetTopAndBottom(a2 - top);
            i7 = a2;
        } else {
            i7 = i3;
        }
        if (!(i4 == 0 && i8 == 0)) {
            this.m.a(this.n, i6, i7, i6 - left, i7 - top);
        }
    }

    private int a(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60376a, false, 65817, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60376a, false, 65817, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int b2 = b(i4, (int) this.i, (int) this.w);
        int b3 = b(i5, (int) this.i, (int) this.w);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(b2);
        int abs4 = Math.abs(b3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (b2 != 0) {
            f2 = (float) abs3;
            f3 = (float) i6;
        } else {
            f2 = (float) abs;
            f3 = (float) i7;
        }
        float f6 = f2 / f3;
        if (b3 != 0) {
            f4 = (float) abs4;
            f5 = (float) i6;
        } else {
            f4 = (float) abs2;
            f5 = (float) i7;
        }
        float f7 = f4 / f5;
        return (int) ((((float) a(i2, b2, 0)) * f6) + (((float) a(i3, b3, this.m.a())) * f7));
    }
}
