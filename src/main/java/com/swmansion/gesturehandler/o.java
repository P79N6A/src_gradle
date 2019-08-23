package com.swmansion.gesturehandler;

import android.os.Handler;

public class o extends b<o> {
    private static float z = Float.MIN_VALUE;
    private int A = 1;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private Handler H;
    private int I;
    private final Runnable J = new Runnable() {
        public final void run() {
            o.this.d();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public float f78799a = z;

    /* renamed from: b  reason: collision with root package name */
    public float f78800b = z;
    public float u = z;
    public long v = 500;
    public long w = 500;
    public int x = 1;
    public int y = 1;

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.H != null) {
            this.H.removeCallbacksAndMessages(null);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.I = 0;
        this.A = 0;
        if (this.H != null) {
            this.H.removeCallbacksAndMessages(null);
        }
    }

    private void l() {
        if (this.H == null) {
            this.H = new Handler();
        } else {
            this.H.removeCallbacksAndMessages(null);
        }
        this.H.postDelayed(this.J, this.v);
    }

    public o() {
        a(true);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r6.g
            int r1 = r7.getActionMasked()
            if (r0 != 0) goto L_0x0019
            r2 = 0
            r6.D = r2
            r6.E = r2
            float r2 = r7.getRawX()
            r6.B = r2
            float r2 = r7.getRawY()
            r6.C = r2
        L_0x0019:
            r2 = 6
            r3 = 1
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 != r2) goto L_0x0021
            goto L_0x002e
        L_0x0021:
            float r2 = com.swmansion.gesturehandler.f.a(r7, r3)
            r6.F = r2
            float r2 = com.swmansion.gesturehandler.f.b(r7, r3)
            r6.G = r2
            goto L_0x0056
        L_0x002e:
            float r2 = r6.D
            float r4 = r6.F
            float r5 = r6.B
            float r4 = r4 - r5
            float r2 = r2 + r4
            r6.D = r2
            float r2 = r6.E
            float r4 = r6.G
            float r5 = r6.C
            float r4 = r4 - r5
            float r2 = r2 + r4
            r6.E = r2
            float r2 = com.swmansion.gesturehandler.f.a(r7, r3)
            r6.F = r2
            float r2 = com.swmansion.gesturehandler.f.b(r7, r3)
            r6.G = r2
            float r2 = r6.F
            r6.B = r2
            float r2 = r6.G
            r6.C = r2
        L_0x0056:
            int r2 = r6.A
            int r4 = r7.getPointerCount()
            if (r2 >= r4) goto L_0x0064
            int r7 = r7.getPointerCount()
            r6.A = r7
        L_0x0064:
            float r7 = r6.F
            float r2 = r6.B
            float r7 = r7 - r2
            float r2 = r6.D
            float r7 = r7 + r2
            float r2 = r6.f78799a
            float r4 = z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0080
            float r2 = java.lang.Math.abs(r7)
            float r4 = r6.f78799a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0080
        L_0x007e:
            r7 = 1
            goto L_0x00b0
        L_0x0080:
            float r2 = r6.G
            float r4 = r6.C
            float r2 = r2 - r4
            float r4 = r6.E
            float r2 = r2 + r4
            float r4 = r6.f78800b
            float r5 = z
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x009b
            float r4 = java.lang.Math.abs(r2)
            float r5 = r6.f78800b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x009b
            goto L_0x007e
        L_0x009b:
            float r2 = r2 * r2
            float r7 = r7 * r7
            float r2 = r2 + r7
            float r7 = r6.u
            float r4 = z
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x00af
            float r7 = r6.u
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00af
            goto L_0x007e
        L_0x00af:
            r7 = 0
        L_0x00b0:
            if (r7 == 0) goto L_0x00b6
            r6.d()
            return
        L_0x00b6:
            if (r0 != 0) goto L_0x00c1
            if (r1 != 0) goto L_0x00bd
            r6.f()
        L_0x00bd:
            r6.l()
            return
        L_0x00c1:
            r7 = 2
            if (r0 != r7) goto L_0x00fd
            if (r1 != r3) goto L_0x00f8
            android.os.Handler r7 = r6.H
            if (r7 != 0) goto L_0x00d2
            android.os.Handler r7 = new android.os.Handler
            r7.<init>()
            r6.H = r7
            goto L_0x00d8
        L_0x00d2:
            android.os.Handler r7 = r6.H
            r0 = 0
            r7.removeCallbacksAndMessages(r0)
        L_0x00d8:
            int r7 = r6.I
            int r7 = r7 + r3
            r6.I = r7
            int r0 = r6.x
            if (r7 != r0) goto L_0x00ee
            int r7 = r6.A
            int r0 = r6.y
            if (r7 < r0) goto L_0x00ee
            r6.e()
            r6.g()
            goto L_0x00fd
        L_0x00ee:
            android.os.Handler r7 = r6.H
            java.lang.Runnable r0 = r6.J
            long r1 = r6.w
            r7.postDelayed(r0, r1)
            return
        L_0x00f8:
            if (r1 != 0) goto L_0x00fd
            r6.l()
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.o.a(android.view.MotionEvent):void");
    }
}
