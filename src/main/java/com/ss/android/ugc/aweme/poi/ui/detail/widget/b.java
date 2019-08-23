package com.ss.android.ugc.aweme.poi.ui.detail.widget;

import android.support.v4.math.MathUtils;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public abstract class b<V extends View> extends f<V> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f60771d;

    /* renamed from: a  reason: collision with root package name */
    private Runnable f60772a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f60773b;

    /* renamed from: c  reason: collision with root package name */
    private int f60774c = -1;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f60775e;

    /* renamed from: f  reason: collision with root package name */
    private int f60776f;
    private int g = -1;
    private VelocityTracker h;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60777a;

        /* renamed from: c  reason: collision with root package name */
        private final CoordinatorLayout f60779c;

        /* renamed from: d  reason: collision with root package name */
        private final V f60780d;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f60777a, false, 66578, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60777a, false, 66578, new Class[0], Void.TYPE);
                return;
            }
            if (!(this.f60780d == null || b.this.f60775e == null)) {
                if (b.this.f60775e.computeScrollOffset()) {
                    b.this.a(this.f60779c, this.f60780d, b.this.f60775e.getCurrY(), 1, true);
                    ViewCompat.postOnAnimation(this.f60780d, this);
                    return;
                }
                b.this.a(this.f60779c, this.f60780d);
            }
        }

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.f60779c = coordinatorLayout;
            this.f60780d = v;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(CoordinatorLayout coordinatorLayout, V v) {
    }

    public boolean a() {
        return false;
    }

    public boolean a(V v, float f2) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean c(V v) {
        return false;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60771d, false, 66577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60771d, false, 66577, new Class[0], Void.TYPE);
            return;
        }
        if (this.h == null) {
            this.h = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f60771d, false, 66572, new Class[0], Integer.TYPE)) {
            return getTopAndBottomOffset();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60771d, false, 66572, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public int a(V v) {
        if (!PatchProxy.isSupport(new Object[]{v}, this, f60771d, false, 66576, new Class[]{View.class}, Integer.TYPE)) {
            return v.getHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{v}, this, f60771d, false, 66576, new Class[]{View.class}, Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public int b(V v) {
        if (!PatchProxy.isSupport(new Object[]{v}, this, f60771d, false, 66575, new Class[]{View.class}, Integer.TYPE)) {
            return -v.getHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{v}, this, f60771d, false, 66575, new Class[]{View.class}, Integer.TYPE)).intValue();
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v2 = v;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v2, motionEvent2}, this, f60771d, false, 66568, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v2, motionEvent2}, this, f60771d, false, 66568, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.g < 0) {
            this.g = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f60773b) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f60773b = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (c(v2) && coordinatorLayout2.a((View) v2, x, y)) {
                    this.f60776f = y;
                    this.f60774c = motionEvent2.getPointerId(0);
                    c();
                    break;
                }
            case 1:
            case 3:
                this.f60773b = false;
                this.f60774c = -1;
                if (this.h != null) {
                    this.h.recycle();
                    this.h = null;
                    break;
                }
                break;
            case 2:
                int i = this.f60774c;
                if (i != -1) {
                    int findPointerIndex = motionEvent2.findPointerIndex(i);
                    if (findPointerIndex != -1) {
                        int y2 = (int) motionEvent2.getY(findPointerIndex);
                        if (Math.abs(y2 - this.f60776f) > this.g && !a()) {
                            this.f60773b = true;
                            this.f60776f = y2;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.h != null) {
            this.h.addMovement(motionEvent2);
        }
        return this.f60773b;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v2 = v;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v2, motionEvent2}, this, f60771d, false, 66569, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v2, motionEvent2}, this, f60771d, false, 66569, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.g < 0) {
            this.g = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout2.a((View) v2, (int) motionEvent.getX(), y) && c(v2)) {
                    this.f60776f = y;
                    this.f60774c = motionEvent2.getPointerId(0);
                    c();
                    break;
                } else {
                    return false;
                }
            case 1:
                if (this.h != null && !a()) {
                    this.h.addMovement(motionEvent2);
                    this.h.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    float yVelocity = this.h.getYVelocity(this.f60774c);
                    int i = -a(v2);
                    int i2 = i;
                    float f2 = yVelocity;
                    if (!PatchProxy.isSupport(new Object[]{coordinatorLayout2, v2, Integer.valueOf(i), 0, Float.valueOf(yVelocity)}, this, f60771d, false, 66574, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE, Integer.TYPE, Float.TYPE}, Boolean.TYPE)) {
                        if (this.f60772a != null) {
                            v2.removeCallbacks(this.f60772a);
                            this.f60772a = null;
                        }
                        float f3 = f2;
                        if (!a(v2, f3)) {
                            if (this.f60775e == null) {
                                this.f60775e = new OverScroller(v.getContext());
                            }
                            this.f60775e.fling(0, getTopAndBottomOffset(), 0, Math.round(f3), 0, 0, i2, 0);
                            if (!this.f60775e.computeScrollOffset()) {
                                a(coordinatorLayout, v);
                                break;
                            } else {
                                this.f60772a = new a(coordinatorLayout2, v2);
                                ViewCompat.postOnAnimation(v2, this.f60772a);
                                break;
                            }
                        }
                    } else {
                        ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v2, Integer.valueOf(i2), 0, Float.valueOf(f2)}, this, f60771d, false, 66574, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE, Integer.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                        break;
                    }
                }
                break;
            case 2:
                int findPointerIndex = motionEvent2.findPointerIndex(this.f60774c);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i3 = this.f60776f - y2;
                    if (!this.f60773b && Math.abs(i3) > this.g) {
                        if (!a()) {
                            this.f60773b = true;
                        }
                        i3 = i3 > 0 ? i3 - this.g : i3 + this.g;
                    }
                    int i4 = i3;
                    if (this.f60773b) {
                        this.f60776f = y2;
                        b(coordinatorLayout, v, i4, b(v2), 0, 0, true);
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                break;
        }
        this.f60773b = false;
        this.f60774c = -1;
        if (this.h != null) {
            this.h.recycle();
            this.h = null;
        }
        if (this.h != null) {
            this.h.addMovement(motionEvent2);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, boolean z) {
        if (!PatchProxy.isSupport(new Object[]{coordinatorLayout, v, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f60771d, false, 66570, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return a(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE, i2, z);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f60771d, false, 66570, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4, boolean z) {
        int i5 = i2;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0)}, this, f60771d, false, 66571, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)}, this, f60771d, false, 66571, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i5 != 0 && topAndBottomOffset >= i5 && topAndBottomOffset <= i3) {
            int clamp = MathUtils.clamp(i, i2, i3);
            if (topAndBottomOffset != clamp) {
                setTopAndBottomOffset(clamp);
                i6 = topAndBottomOffset - clamp;
                return i6;
            }
        }
        return i6;
    }

    /* access modifiers changed from: package-private */
    public final int b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4, boolean z) {
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0)}, this, f60771d, false, 66573, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)}, this, f60771d, false, 66573, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        return a(coordinatorLayout, v, b() - i, i2, i3, i4, z);
    }
}
