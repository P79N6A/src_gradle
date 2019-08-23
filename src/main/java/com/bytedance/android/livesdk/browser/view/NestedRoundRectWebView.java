package com.bytedance.android.livesdk.browser.view;

import android.support.v4.view.NestedScrollingChild2;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.OverScroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class NestedRoundRectWebView extends RoundRectWebView implements NestedScrollingChild2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9638a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f9639b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f9640c;

    /* renamed from: d  reason: collision with root package name */
    private float f9641d;

    /* renamed from: e  reason: collision with root package name */
    private int f9642e;

    /* renamed from: f  reason: collision with root package name */
    private VelocityTracker f9643f;
    private int g;
    private int h;
    private OverScroller i;
    private int j;
    private NestedScrollingChildHelper k;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9638a, false, 3813, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9638a, false, 3813, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9643f != null) {
            this.f9643f.recycle();
            this.f9643f = null;
        }
    }

    public boolean hasNestedScrollingParent() {
        if (!PatchProxy.isSupport(new Object[0], this, f9638a, false, 3824, new Class[0], Boolean.TYPE)) {
            return this.k.hasNestedScrollingParent();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f9638a, false, 3824, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isNestedScrollingEnabled() {
        if (!PatchProxy.isSupport(new Object[0], this, f9638a, false, 3819, new Class[0], Boolean.TYPE)) {
            return this.k.isNestedScrollingEnabled();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f9638a, false, 3819, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f9638a, false, 3817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9638a, false, 3817, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.k.onDetachedFromWindow();
    }

    public void stopNestedScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f9638a, false, 3822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9638a, false, 3822, new Class[0], Void.TYPE);
            return;
        }
        this.k.stopNestedScroll();
    }

    public void computeScroll() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f9638a, false, 3815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9638a, false, 3815, new Class[0], Void.TYPE);
        } else if (this.i.computeScrollOffset()) {
            int currY = this.i.getCurrY();
            int i3 = currY - this.j;
            if (dispatchNestedPreScroll(0, i3, this.f9639b, null, 1)) {
                i3 -= this.f9639b[1];
            }
            if (i3 != 0) {
                int scrollY = getScrollY();
                if (scrollY == 0) {
                    i2 = i3;
                } else {
                    int i4 = scrollY + i3;
                    if (i4 <= 0) {
                        i2 = i4;
                    } else {
                        i2 = 0;
                    }
                }
                int i5 = i3 - i2;
                scrollBy(0, i5);
                dispatchNestedScroll(0, i5, 0, i2, null, 1);
            }
            this.j = currY;
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            if (hasNestedScrollingParent(1)) {
                stopNestedScroll(1);
            }
            this.j = 0;
        }
    }

    public boolean hasNestedScrollingParent(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f9638a, false, 3825, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return this.k.hasNestedScrollingParent(i2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f9638a, false, 3825, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public void setNestedScrollingEnabled(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f9638a, false, 3818, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f9638a, false, 3818, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.k.setNestedScrollingEnabled(z);
    }

    public boolean startNestedScroll(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f9638a, false, 3820, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return this.k.startNestedScroll(i2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f9638a, false, 3820, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public void stopNestedScroll(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f9638a, false, 3823, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f9638a, false, 3823, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.k.stopNestedScroll(i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f9638a, false, 3816, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f9638a, false, 3816, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[0], this, f9638a, false, 3812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9638a, false, 3812, new Class[0], Void.TYPE);
        } else if (this.f9643f == null) {
            this.f9643f = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        switch (motionEvent.getAction()) {
            case 0:
                this.f9641d = motionEvent.getRawY();
                this.f9642e = motionEvent2.getPointerId(0);
                startNestedScroll(2, 0);
                this.i.computeScrollOffset();
                if (!this.i.isFinished()) {
                    this.i.abortAnimation();
                    break;
                }
                break;
            case 1:
                VelocityTracker velocityTracker = this.f9643f;
                velocityTracker.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.h);
                int yVelocity = (int) velocityTracker.getYVelocity();
                this.f9642e = -1;
                stopNestedScroll(0);
                a();
                if (Math.abs(yVelocity) > this.g) {
                    int i3 = -yVelocity;
                    if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, this, f9638a, false, 3814, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        startNestedScroll(2, 1);
                        this.i.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
                        this.j = getScrollY();
                        ViewCompat.postInvalidateOnAnimation(this);
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f9638a, false, 3814, new Class[]{Integer.TYPE}, Void.TYPE);
                        break;
                    }
                }
                break;
            case 2:
                int i4 = this.f9642e;
                if (!(i4 == -1 || motionEvent2.findPointerIndex(i4) == -1)) {
                    float rawY = motionEvent.getRawY();
                    int round = Math.round(this.f9641d - rawY);
                    this.f9641d = rawY;
                    if (dispatchNestedPreScroll(0, round, this.f9639b, this.f9640c, 0)) {
                        obtain.offsetLocation(0.0f, (float) this.f9639b[1]);
                        round -= this.f9639b[1];
                    }
                    int scrollY = getScrollY();
                    if (scrollY == 0) {
                        i2 = round;
                    } else {
                        int i5 = scrollY + round;
                        if (i5 <= 0) {
                            i2 = i5;
                        }
                    }
                    if (dispatchNestedScroll(0, round - i2, 0, i2, this.f9640c, 0)) {
                        obtain.offsetLocation(0.0f, (float) i2);
                        break;
                    }
                }
                break;
            case 3:
                this.f9642e = -1;
                stopNestedScroll(0);
                a();
                break;
        }
        if (this.f9643f != null) {
            this.f9643f.addMovement(obtain);
        }
        boolean onTouchEvent = super.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent;
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f9638a, false, 3831, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return this.k.dispatchNestedPreFling(f2, f3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f9638a, false, 3831, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean startNestedScroll(int i2, int i3) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9638a, false, 3821, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return this.k.startNestedScroll(i2, i3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9638a, false, 3821, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f9638a, false, 3830, new Class[]{Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return this.k.dispatchNestedFling(f2, f3, z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z)}, this, f9638a, false, 3830, new Class[]{Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchNestedPreScroll(int r22, int r23, int[] r24, int[] r25) {
        /*
            r21 = this;
            r0 = r24
            r1 = r25
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r10 = 0
            r3[r10] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
            r11 = 1
            r3[r11] = r4
            r12 = 2
            r3[r12] = r0
            r13 = 3
            r3[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f9638a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r12] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r13] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r6 = 0
            r7 = 3828(0xef4, float:5.364E-42)
            r4 = r21
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0077
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r14[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r14[r11] = r3
            r14[r12] = r0
            r14[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r16 = f9638a
            r17 = 0
            r18 = 3828(0xef4, float:5.364E-42)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0077:
            r2 = r21
            android.support.v4.view.NestedScrollingChildHelper r3 = r2.k
            r4 = r22
            r5 = r23
            boolean r0 = r3.dispatchNestedPreScroll(r4, r5, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.view.NestedRoundRectWebView.dispatchNestedPreScroll(int, int, int[], int[]):boolean");
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iArr}, this, f9638a, false, 3826, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, int[].class}, Boolean.TYPE)) {
            return this.k.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iArr}, this, f9638a, false, 3826, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, int[].class}, Boolean.TYPE)).booleanValue();
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), iArr, iArr2, Integer.valueOf(i4)}, this, f9638a, false, 3829, new Class[]{Integer.TYPE, Integer.TYPE, int[].class, int[].class, Integer.TYPE}, Boolean.TYPE)) {
            return this.k.dispatchNestedPreScroll(i2, i3, iArr, iArr2, i4);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), iArr, iArr2, Integer.valueOf(i4)}, this, f9638a, false, 3829, new Class[]{Integer.TYPE, Integer.TYPE, int[].class, int[].class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iArr, Integer.valueOf(i6)}, this, f9638a, false, 3827, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, int[].class, Integer.TYPE}, Boolean.TYPE)) {
            return this.k.dispatchNestedScroll(i2, i3, i4, i5, iArr, i6);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iArr, Integer.valueOf(i6)}, this, f9638a, false, 3827, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, int[].class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
