package com.ss.android.ugc.aweme.shortvideo.gesture.a;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b extends a {
    public static ChangeQuickRedirect i;
    public static boolean k = false;
    private static final PointF l = new PointF();
    public PointF j = new PointF();
    private final a m;
    private PointF n;
    private PointF o;
    private PointF p = new PointF();

    public interface a {
        boolean a(b bVar);

        boolean a(b bVar, float f2, float f3);

        void b(b bVar);
    }

    private PointF c(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, i, false, 77403, new Class[]{MotionEvent.class}, PointF.class)) {
            return (PointF) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, i, false, 77403, new Class[]{MotionEvent.class}, PointF.class);
        }
        int pointerCount = motionEvent.getPointerCount();
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            f2 += motionEvent2.getX(i2);
            f3 += motionEvent2.getY(i2);
        }
        float f4 = (float) pointerCount;
        return new PointF(f2 / f4, f3 / f4);
    }

    public final void b(MotionEvent motionEvent) {
        PointF pointF;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, i, false, 77402, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, i, false, 77402, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        super.b(motionEvent);
        MotionEvent motionEvent2 = this.f67901d;
        this.n = c(motionEvent);
        this.o = c(motionEvent2);
        if (motionEvent2.getPointerCount() == motionEvent.getPointerCount()) {
            z = false;
        }
        if (z) {
            pointF = l;
        } else {
            pointF = new PointF(this.n.x - this.o.x, this.n.y - this.o.y);
        }
        this.j = pointF;
        this.p.x += this.j.x;
        this.p.y += this.j.y;
    }

    public b(Context context, a aVar) {
        super(context);
        this.m = aVar;
    }

    public final void b(int i2, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), motionEvent}, this, i, false, 77401, new Class[]{Integer.TYPE, MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), motionEvent}, this, i, false, 77401, new Class[]{Integer.TYPE, MotionEvent.class}, Void.TYPE);
            return;
        }
        switch (i2) {
            case 1:
            case 3:
                this.m.b(this);
                a();
                return;
            case 2:
                if (this.f67901d != null) {
                    b(motionEvent);
                    if (this.f67903f / this.g > 0.67f && this.m.a(this)) {
                        this.f67901d.recycle();
                        this.f67901d = MotionEvent.obtain(motionEvent);
                        break;
                    }
                } else {
                    return;
                }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r15, android.view.MotionEvent r16) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r11 = 0
            r0[r11] = r1
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = i
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 77398(0x12e56, float:1.08458E-40)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004b
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r11] = r1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 77398(0x12e56, float:1.08458E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004b:
            if (r8 == 0) goto L_0x00f2
            if (r8 == r10) goto L_0x0051
            goto L_0x00f1
        L_0x0051:
            com.ss.android.ugc.aweme.shortvideo.gesture.a.b$a r8 = r7.m
            android.view.MotionEvent r9 = r7.f67901d
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 77399(0x12e57, float:1.08459E-40)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Float.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x008f
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 77399(0x12e57, float:1.08459E-40)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Float.TYPE
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
        L_0x008d:
            r9 = r0
            goto L_0x00a2
        L_0x008f:
            if (r9 != 0) goto L_0x0094
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00a2
        L_0x0094:
            boolean r0 = k
            if (r0 == 0) goto L_0x009d
            float r0 = r9.getRawX()
            goto L_0x008d
        L_0x009d:
            float r0 = r9.getX()
            goto L_0x008d
        L_0x00a2:
            android.view.MotionEvent r13 = r7.f67901d
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 77400(0x12e58, float:1.0846E-40)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Float.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00db
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 77400(0x12e58, float:1.0846E-40)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Float.TYPE
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Float r0 = (java.lang.Float) r0
            float r10 = r0.floatValue()
            goto L_0x00eb
        L_0x00db:
            if (r13 != 0) goto L_0x00de
            goto L_0x00eb
        L_0x00de:
            boolean r0 = k
            if (r0 == 0) goto L_0x00e7
            float r10 = r13.getRawY()
            goto L_0x00eb
        L_0x00e7:
            float r10 = r13.getY()
        L_0x00eb:
            boolean r0 = r8.a(r14, r9, r10)
            r7.f67900c = r0
        L_0x00f1:
            return
        L_0x00f2:
            r14.a()
            android.graphics.PointF r0 = r7.p
            r1 = 0
            r0.x = r1
            android.graphics.PointF r0 = r7.p
            r0.y = r1
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r16)
            r7.f67901d = r0
            r0 = 0
            r7.h = r0
            r14.b(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.gesture.a.b.a(int, android.view.MotionEvent):void");
    }
}
