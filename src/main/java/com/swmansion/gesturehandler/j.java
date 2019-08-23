package com.swmansion.gesturehandler;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class j extends b<j> {
    private static float O = Float.MAX_VALUE;
    private static float P = Float.MIN_VALUE;
    private static int Q = 1;
    private static int R = 10;
    public float A = O;
    public float B = O;
    public float C = O;
    public int D = Q;
    public int E = R;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    private float S = P;
    private VelocityTracker T;

    /* renamed from: a  reason: collision with root package name */
    public float f78785a = O;

    /* renamed from: b  reason: collision with root package name */
    public float f78786b = P;
    public float u = P;
    public float v = O;
    public float w = O;
    public float x = P;
    public float y = P;
    public float z = O;

    /* access modifiers changed from: protected */
    public final void b() {
        if (this.T != null) {
            this.T.recycle();
            this.T = null;
        }
    }

    public final j a(float f2) {
        this.S = f2 * f2;
        return this;
    }

    public j(Context context) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.S = (float) (scaledTouchSlop * scaledTouchSlop);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r8.g
            int r1 = r9.getActionMasked()
            r2 = 5
            r3 = 6
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x000d
            goto L_0x001e
        L_0x000d:
            boolean r4 = r8.N
            float r4 = com.swmansion.gesturehandler.f.a(r9, r4)
            r8.J = r4
            boolean r4 = r8.N
            float r4 = com.swmansion.gesturehandler.f.b(r9, r4)
            r8.K = r4
            goto L_0x004a
        L_0x001e:
            float r4 = r8.H
            float r5 = r8.J
            float r6 = r8.F
            float r5 = r5 - r6
            float r4 = r4 + r5
            r8.H = r4
            float r4 = r8.I
            float r5 = r8.K
            float r6 = r8.G
            float r5 = r5 - r6
            float r4 = r4 + r5
            r8.I = r4
            boolean r4 = r8.N
            float r4 = com.swmansion.gesturehandler.f.a(r9, r4)
            r8.J = r4
            boolean r4 = r8.N
            float r4 = com.swmansion.gesturehandler.f.b(r9, r4)
            r8.K = r4
            float r4 = r8.J
            r8.F = r4
            float r4 = r8.K
            r8.G = r4
        L_0x004a:
            r4 = 0
            if (r0 != 0) goto L_0x0070
            int r5 = r9.getPointerCount()
            int r6 = r8.D
            if (r5 < r6) goto L_0x0070
            float r5 = r8.J
            r8.F = r5
            float r5 = r8.K
            r8.G = r5
            r8.H = r4
            r8.I = r4
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r8.T = r5
            android.view.VelocityTracker r5 = r8.T
            a(r5, r9)
            r8.f()
            goto L_0x0090
        L_0x0070:
            android.view.VelocityTracker r5 = r8.T
            if (r5 == 0) goto L_0x0090
            android.view.VelocityTracker r5 = r8.T
            a(r5, r9)
            android.view.VelocityTracker r5 = r8.T
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r6)
            android.view.VelocityTracker r5 = r8.T
            float r5 = r5.getXVelocity()
            r8.L = r5
            android.view.VelocityTracker r5 = r8.T
            float r5 = r5.getYVelocity()
            r8.M = r5
        L_0x0090:
            r5 = 4
            r6 = 1
            if (r1 != r6) goto L_0x009e
            if (r0 != r5) goto L_0x009a
            r8.g()
            return
        L_0x009a:
            r8.d()
            return
        L_0x009e:
            if (r1 != r2) goto L_0x00b2
            int r2 = r9.getPointerCount()
            int r7 = r8.E
            if (r2 <= r7) goto L_0x00b2
            if (r0 != r5) goto L_0x00ae
            r8.c()
            return
        L_0x00ae:
            r8.d()
            return
        L_0x00b2:
            if (r1 != r3) goto L_0x00c2
            if (r0 != r5) goto L_0x00c2
            int r9 = r9.getPointerCount()
            int r1 = r8.D
            if (r9 >= r1) goto L_0x00c2
            r8.d()
            return
        L_0x00c2:
            r9 = 2
            if (r0 != r9) goto L_0x01e6
            float r9 = r8.J
            float r0 = r8.F
            float r9 = r9 - r0
            float r0 = r8.H
            float r9 = r9 + r0
            float r0 = r8.u
            float r1 = P
            r2 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00de
            float r0 = r8.u
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00de
        L_0x00dc:
            r9 = 1
            goto L_0x0114
        L_0x00de:
            float r0 = r8.v
            float r1 = O
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ed
            float r0 = r8.v
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ed
            goto L_0x00dc
        L_0x00ed:
            float r9 = r8.K
            float r0 = r8.G
            float r9 = r9 - r0
            float r0 = r8.I
            float r9 = r9 + r0
            float r0 = r8.y
            float r1 = P
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0104
            float r0 = r8.y
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            goto L_0x00dc
        L_0x0104:
            float r0 = r8.z
            float r1 = O
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0113
            float r0 = r8.z
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0113
            goto L_0x00dc
        L_0x0113:
            r9 = 0
        L_0x0114:
            if (r9 == 0) goto L_0x011a
            r8.d()
            return
        L_0x011a:
            float r9 = r8.J
            float r0 = r8.F
            float r9 = r9 - r0
            float r0 = r8.H
            float r9 = r9 + r0
            float r0 = r8.f78785a
            float r1 = O
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0132
            float r0 = r8.f78785a
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0132
            goto L_0x01d9
        L_0x0132:
            float r0 = r8.f78786b
            float r1 = P
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0142
            float r0 = r8.f78786b
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0142
            goto L_0x01d9
        L_0x0142:
            float r0 = r8.K
            float r1 = r8.G
            float r0 = r0 - r1
            float r1 = r8.I
            float r0 = r0 + r1
            float r1 = r8.w
            float r3 = O
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x015a
            float r1 = r8.w
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x015a
            goto L_0x01d9
        L_0x015a:
            float r1 = r8.x
            float r3 = P
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x016a
            float r1 = r8.x
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x016a
            goto L_0x01d9
        L_0x016a:
            float r9 = r9 * r9
            float r0 = r0 * r0
            float r9 = r9 + r0
            float r0 = r8.S
            float r1 = O
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x017e
            float r0 = r8.S
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x017e
            goto L_0x01d9
        L_0x017e:
            float r9 = r8.L
            float r0 = r8.A
            float r1 = O
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01a1
            float r0 = r8.A
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0194
            float r0 = r8.A
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d9
        L_0x0194:
            float r0 = r8.A
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01a1
            float r0 = r8.A
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01a1
            goto L_0x01d9
        L_0x01a1:
            float r0 = r8.M
            float r1 = r8.B
            float r3 = O
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01c4
            float r1 = r8.B
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x01b7
            float r1 = r8.B
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x01d9
        L_0x01b7:
            float r1 = r8.B
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x01c4
            float r1 = r8.B
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x01c4
            goto L_0x01d9
        L_0x01c4:
            float r9 = r9 * r9
            float r0 = r0 * r0
            float r9 = r9 + r0
            float r0 = r8.C
            float r1 = O
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01d8
            float r0 = r8.C
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x01d8
            goto L_0x01d9
        L_0x01d8:
            r6 = 0
        L_0x01d9:
            if (r6 == 0) goto L_0x01e6
            float r9 = r8.J
            r8.F = r9
            float r9 = r8.K
            r8.G = r9
            r8.e()
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.j.a(android.view.MotionEvent):void");
    }

    private static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }
}
