package com.ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class RecordLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71359a;
    private int A;
    private TextView B;
    @ColorInt
    private int C;
    @ColorInt
    private int D;
    @ColorInt
    private int E;
    @ColorInt
    private int F;
    private int G;
    private int H;
    private int I;
    private long J;
    private int K;
    private final int L;
    private long M;
    private long N;
    private g O;
    private ArgbEvaluator P;
    private DashPathEffect Q;
    private View.OnClickListener R;

    /* renamed from: b  reason: collision with root package name */
    protected float f71360b;

    /* renamed from: c  reason: collision with root package name */
    protected float f71361c;

    /* renamed from: d  reason: collision with root package name */
    protected float f71362d;

    /* renamed from: e  reason: collision with root package name */
    protected int f71363e;

    /* renamed from: f  reason: collision with root package name */
    protected int f71364f;
    protected int g;
    protected int h;
    protected Paint i;
    protected Paint j;
    protected float k;
    protected float l;
    protected long m;
    protected final RectF n;
    public boolean o;
    protected boolean p;
    protected boolean q;
    protected long r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    protected ScaleGestureDetector v;
    protected a w;
    public boolean x;
    private float y;
    private float z;

    public interface a {
        void a(int i);

        void a_(float f2);

        void ao_();

        boolean ap_();

        void c();

        void d();

        void e();

        void f();
    }

    class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71369a;

        /* renamed from: c  reason: collision with root package name */
        private final a f71371c;

        public final void ao_() {
            if (PatchProxy.isSupport(new Object[0], this, f71369a, false, 81385, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71369a, false, 81385, new Class[0], Void.TYPE);
                return;
            }
            this.f71371c.ao_();
        }

        public final boolean ap_() {
            if (!PatchProxy.isSupport(new Object[0], this, f71369a, false, 81386, new Class[0], Boolean.TYPE)) {
                return this.f71371c.ap_();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71369a, false, 81386, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f71369a, false, 81387, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71369a, false, 81387, new Class[0], Void.TYPE);
                return;
            }
            if (!RecordLayout.this.x) {
                this.f71371c.c();
                RecordLayout.this.x = true;
            }
        }

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f71369a, false, 81389, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71369a, false, 81389, new Class[0], Void.TYPE);
                return;
            }
            if (RecordLayout.this.x) {
                this.f71371c.d();
                RecordLayout.this.x = false;
            }
        }

        public final void e() {
            if (PatchProxy.isSupport(new Object[0], this, f71369a, false, 81390, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71369a, false, 81390, new Class[0], Void.TYPE);
                return;
            }
            this.f71371c.e();
        }

        public final void f() {
            if (PatchProxy.isSupport(new Object[0], this, f71369a, false, 81392, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71369a, false, 81392, new Class[0], Void.TYPE);
                return;
            }
            this.f71371c.f();
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71369a, false, 81388, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71369a, false, 81388, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f71371c.a(i);
        }

        public final void a_(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71369a, false, 81391, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71369a, false, 81391, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            this.f71371c.a_(f2);
        }

        public b(a aVar) {
            this.f71371c = aVar;
        }
    }

    private int e() {
        return this.H;
    }

    private int f() {
        return this.H;
    }

    public int getCurrentScaleMode() {
        return this.g;
    }

    public int getMode() {
        return this.f71364f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x072b, code lost:
        if (r11 == 1) goto L_0x072d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x072d, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x075f, code lost:
        if (r11 == 2) goto L_0x072d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x084b, code lost:
        if (r12 == 1) goto L_0x0883;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x087c, code lost:
        if (r12 == 2) goto L_0x0883;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0695  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x06e3  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x07d5  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0823  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r31) {
        /*
            r30 = this;
            r7 = r30
            r8 = r31
            r15 = 1
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r9 = 0
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 81344(0x13dc0, float:1.13987E-40)
            r1 = r30
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81344(0x13dc0, float:1.13987E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r30
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            int r0 = r7.f71363e
            r1 = 6
            if (r0 != r1) goto L_0x0057
            android.graphics.Paint r0 = r7.i
            long r1 = r7.m
            int r1 = r7.a((long) r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r7.j
            long r1 = r7.m
            int r1 = r7.b((long) r1)
            r0.setColor(r1)
            r7.a((android.graphics.Canvas) r8, (boolean) r9, (boolean) r9)
            return
        L_0x0057:
            int r0 = r7.f71363e
            r1 = 7
            if (r0 != r1) goto L_0x0076
            android.graphics.Paint r0 = r7.i
            long r1 = r7.m
            int r1 = r7.a((long) r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r7.j
            long r1 = r7.m
            int r1 = r7.b((long) r1)
            r0.setColor(r1)
            r7.a((android.graphics.Canvas) r8, (boolean) r9, (boolean) r15)
            return
        L_0x0076:
            int r0 = r7.f71363e
            r1 = 8
            if (r0 != r1) goto L_0x0096
            android.graphics.Paint r0 = r7.i
            long r1 = r7.m
            int r1 = r7.a((long) r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r7.j
            long r1 = r7.m
            int r1 = r7.b((long) r1)
            r0.setColor(r1)
            r7.a((android.graphics.Canvas) r8, (boolean) r9)
            return
        L_0x0096:
            int r0 = r7.f71363e
            r1 = 9
            if (r0 != r1) goto L_0x00b6
            android.graphics.Paint r0 = r7.i
            long r1 = r7.m
            int r1 = r7.a((long) r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r7.j
            long r1 = r7.m
            int r1 = r7.b((long) r1)
            r0.setColor(r1)
            r7.a((android.graphics.Canvas) r8, (boolean) r15, (boolean) r9)
            return
        L_0x00b6:
            int r0 = r7.f71363e
            r1 = 10
            if (r0 != r1) goto L_0x00d6
            android.graphics.Paint r0 = r7.i
            long r1 = r7.m
            int r1 = r7.a((long) r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r7.j
            long r1 = r7.m
            int r1 = r7.b((long) r1)
            r0.setColor(r1)
            r7.a((android.graphics.Canvas) r8, (boolean) r15)
            return
        L_0x00d6:
            int r0 = r7.f71364f
            r11 = 300(0x12c, double:1.48E-321)
            r14 = 4
            r16 = 1065353216(0x3f800000, float:1.0)
            r6 = 3
            r5 = 2
            if (r0 != 0) goto L_0x01e2
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81363(0x13dd3, float:1.14014E-40)
            java.lang.Class[] r1 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r17 = android.graphics.Canvas.class
            r1[r9] = r17
            java.lang.Class r17 = java.lang.Void.TYPE
            r18 = r1
            r1 = r30
            r13 = 2
            r5 = r18
            r10 = 3
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x011c
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81363(0x13dd3, float:1.14014E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r30
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0a1c
        L_0x011c:
            r31.save()
            float r0 = r7.k
            float r1 = r7.l
            r8.translate(r0, r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            int r2 = r7.f71363e
            if (r2 != r13) goto L_0x0139
            long r2 = r7.m
            long r2 = r0 - r2
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0139
            r7.b((int) r10)
        L_0x0139:
            int r2 = r7.f71363e
            if (r2 != r14) goto L_0x0172
            long r2 = r7.m
            long r2 = r0 - r2
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0151
            r7.b((int) r15)
            r0 = 0
            r7.k = r0
            r7.l = r0
            r30.invalidate()
            goto L_0x0172
        L_0x0151:
            long r2 = r7.m
            long r2 = r0 - r2
            float r2 = (float) r2
            float r2 = r2 * r16
            r3 = 1133903872(0x43960000, float:300.0)
            float r2 = r2 / r3
            float r2 = r16 - r2
            float r4 = r7.k
            float r2 = r2 * r4
            r7.k = r2
            long r4 = r7.m
            long r0 = r0 - r4
            float r0 = (float) r0
            float r0 = r0 * r16
            float r0 = r0 / r3
            float r16 = r16 - r0
            float r0 = r7.l
            float r0 = r0 * r16
            r7.l = r0
        L_0x0172:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81364(0x13dd4, float:1.14015E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r30
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01a4
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81364(0x13dd4, float:1.14015E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r30
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01d0
        L_0x01a4:
            int r0 = r7.f71363e
            long r1 = r7.m
            int r0 = r7.e(r0, r1)
            int r1 = r7.f71363e
            long r2 = r7.m
            int r1 = r7.f(r1, r2)
            int r2 = r1 + r0
            int r2 = r2 / r13
            android.graphics.Paint r3 = r7.i
            int r1 = r1 - r0
            float r0 = (float) r1
            r3.setStrokeWidth(r0)
            int r0 = r30.getMeasuredWidth()
            int r0 = r0 >> r15
            float r0 = (float) r0
            int r1 = r30.getMeasuredHeight()
            int r1 = r1 >> r15
            float r1 = (float) r1
            float r2 = (float) r2
            android.graphics.Paint r3 = r7.i
            r8.drawCircle(r0, r1, r2, r3)
        L_0x01d0:
            int r0 = r7.f71363e
            if (r0 != r15) goto L_0x01d7
            super.dispatchDraw(r31)
        L_0x01d7:
            r31.restore()
            int r0 = r7.f71363e
            if (r0 == r15) goto L_0x01e1
            r30.invalidate()
        L_0x01e1:
            return
        L_0x01e2:
            r10 = 3
            r13 = 2
            int r0 = r7.f71364f
            r6 = 0
            r17 = 1062836634(0x3f59999a, float:0.85)
            if (r0 != r15) goto L_0x03bf
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81347(0x13dc3, float:1.13991E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r1 = r30
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0221
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81347(0x13dc3, float:1.13991E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r30
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0a1c
        L_0x0221:
            long r0 = android.os.SystemClock.uptimeMillis()
            int r2 = r7.f71363e
            if (r2 != r13) goto L_0x0234
            long r2 = r7.m
            long r2 = r0 - r2
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0234
            r7.b((int) r10)
        L_0x0234:
            int r2 = r7.f71363e
            if (r2 != r14) goto L_0x0245
            long r2 = r7.m
            long r0 = r0 - r2
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0245
            r7.b((int) r15)
            r30.invalidate()
        L_0x0245:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81350(0x13dc6, float:1.13996E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r30
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0278
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81350(0x13dc6, float:1.13996E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r30
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03b7
        L_0x0278:
            int r10 = r7.f71363e
            long r11 = r7.m
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r9] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r11)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81351(0x13dc7, float:1.13997E-40)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r30
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02d4
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r9] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r11)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81351(0x13dc7, float:1.13997E-40)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r30
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x02d2:
            r10 = r0
            goto L_0x02e4
        L_0x02d4:
            int r0 = r7.f71363e
            if (r0 != r15) goto L_0x02df
            int r0 = r7.H
            float r0 = (float) r0
            float r0 = r0 * r17
            int r0 = (int) r0
            goto L_0x02d2
        L_0x02df:
            int r0 = r7.e(r10, r11)
            goto L_0x02d2
        L_0x02e4:
            int r11 = r7.f71363e
            long r5 = r7.m
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r9] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r5)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81352(0x13dc8, float:1.13998E-40)
            java.lang.Class[] r12 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r12[r9] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r12[r15] = r1
            java.lang.Class r14 = java.lang.Integer.TYPE
            r1 = r30
            r22 = r5
            r5 = r12
            r6 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0345
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r9] = r1
            java.lang.Long r1 = new java.lang.Long
            r2 = r22
            r1.<init>(r2)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81352(0x13dc8, float:1.13998E-40)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r30
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x034b
        L_0x0345:
            r2 = r22
            int r0 = r7.f(r11, r2)
        L_0x034b:
            int r1 = r0 + r10
            int r1 = r1 / r13
            android.graphics.Paint r2 = r7.j
            int r0 = r0 - r10
            float r0 = (float) r0
            r2.setStrokeWidth(r0)
            android.graphics.Paint r0 = r7.j
            r6 = 0
            r0.setPathEffect(r6)
            int r0 = r30.getMeasuredWidth()
            int r0 = r0 / r13
            float r0 = (float) r0
            int r2 = r30.getMeasuredHeight()
            int r2 = r2 / r13
            float r2 = (float) r2
            float r1 = (float) r1
            android.graphics.Paint r3 = r7.j
            r8.drawCircle(r0, r2, r1, r3)
            int r0 = r7.f71363e
            long r1 = r7.m
            int r0 = r7.a((int) r0, (long) r1)
            int r1 = r30.getMeasuredWidth()
            int r1 = r1 / r13
            int r2 = r30.getMeasuredHeight()
            int r2 = r2 / r13
            int r3 = r7.f71363e
            long r4 = r7.m
            int r3 = r7.b(r3, r4)
            android.graphics.Paint r4 = r7.i
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            android.graphics.RectF r4 = r7.n
            int r5 = r1 - r3
            float r5 = (float) r5
            r4.left = r5
            android.graphics.RectF r4 = r7.n
            int r5 = r2 - r3
            float r5 = (float) r5
            r4.top = r5
            android.graphics.RectF r4 = r7.n
            int r1 = r1 + r3
            float r1 = (float) r1
            r4.right = r1
            android.graphics.RectF r1 = r7.n
            int r2 = r2 + r3
            float r2 = (float) r2
            r1.bottom = r2
            android.graphics.RectF r1 = r7.n
            float r0 = (float) r0
            android.graphics.Paint r2 = r7.i
            r8.drawRoundRect(r1, r0, r0, r2)
            android.graphics.Paint r0 = r7.i
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
        L_0x03b7:
            int r0 = r7.f71363e
            if (r0 == r15) goto L_0x03be
            r30.invalidate()
        L_0x03be:
            return
        L_0x03bf:
            int r0 = r7.f71364f
            if (r0 != r10) goto L_0x08c0
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81348(0x13dc4, float:1.13993E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r1 = r30
            r6 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03f8
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81348(0x13dc4, float:1.13993E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r30
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0a1c
        L_0x03f8:
            r31.save()
            float r0 = r7.k
            float r1 = r7.l
            r8.translate(r0, r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            int r2 = r7.f71363e
            if (r2 != r13) goto L_0x0418
            long r2 = r7.m
            long r2 = r0 - r2
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0418
            r7.b((int) r10)
            r7.d(r9)
        L_0x0418:
            int r2 = r7.f71363e
            if (r2 != r14) goto L_0x0457
            long r2 = r7.m
            long r2 = r0 - r2
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0435
            r7.b((int) r15)
            r7.d(r9)
            r7.q = r9
            r2 = 0
            r7.k = r2
            r7.l = r2
            r30.invalidate()
            goto L_0x0457
        L_0x0435:
            long r2 = r7.m
            long r2 = r0 - r2
            float r2 = (float) r2
            float r2 = r2 * r16
            r3 = 1133903872(0x43960000, float:300.0)
            float r2 = r2 / r3
            float r2 = r16 - r2
            float r4 = r7.k
            float r2 = r2 * r4
            r7.k = r2
            long r4 = r7.m
            long r4 = r0 - r4
            float r2 = (float) r4
            float r2 = r2 * r16
            float r2 = r2 / r3
            float r2 = r16 - r2
            float r3 = r7.l
            float r2 = r2 * r3
            r7.l = r2
        L_0x0457:
            int r2 = r7.f71363e
            if (r2 != r10) goto L_0x0485
            int r2 = r7.h
            if (r2 != 0) goto L_0x0470
            long r2 = r7.N
            long r0 = r0 - r2
            r2 = 350(0x15e, double:1.73E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0485
            boolean r0 = r7.q
            if (r0 != 0) goto L_0x0485
            r7.d(r13)
            goto L_0x0485
        L_0x0470:
            int r2 = r7.h
            if (r2 != r13) goto L_0x0485
            long r2 = r7.J
            long r0 = r0 - r2
            r2 = 200(0xc8, double:9.9E-322)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0485
            r7.d(r15)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.a(r13)
        L_0x0485:
            int r11 = r7.h
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r9] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81349(0x13dc5, float:1.13994E-40)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r30
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04ce
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r9] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81349(0x13dc5, float:1.13994E-40)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r30
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08b4
        L_0x04ce:
            int r12 = r7.f71363e
            long r5 = r7.m
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r5)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81353(0x13dc9, float:1.14E-40)
            java.lang.Class[] r1 = new java.lang.Class[r13]
            java.lang.Class r18 = java.lang.Integer.TYPE
            r1[r9] = r18
            java.lang.Class r18 = java.lang.Long.TYPE
            r1[r15] = r18
            java.lang.Class r18 = java.lang.Integer.TYPE
            r20 = r1
            r1 = r30
            r24 = r11
            r10 = r5
            r5 = r20
            r6 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0533
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r10)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81353(0x13dc9, float:1.14E-40)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r30
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x0531:
            r10 = r0
            goto L_0x058d
        L_0x0533:
            long r0 = android.os.SystemClock.uptimeMillis()
            int r2 = r7.f71363e
            if (r2 != r15) goto L_0x0542
            int r0 = r7.H
            float r0 = (float) r0
            float r0 = r0 * r17
            int r0 = (int) r0
            goto L_0x0531
        L_0x0542:
            int r2 = r7.f71363e
            if (r2 != r14) goto L_0x0588
            int r2 = r7.h
            if (r2 != 0) goto L_0x055a
            int r2 = r7.I
            float r2 = (float) r2
            long r0 = r0 - r10
            float r0 = (float) r0
            float r0 = r0 * r16
            r1 = 1133903872(0x43960000, float:300.0)
            float r0 = r0 / r1
            float r0 = r16 - r0
            float r2 = r2 * r0
            int r0 = (int) r2
            goto L_0x0531
        L_0x055a:
            int r2 = r7.h
            if (r2 != r15) goto L_0x0571
            int r2 = r7.I
            float r2 = (float) r2
            r3 = 1041865114(0x3e19999a, float:0.15)
            long r0 = r0 - r10
            float r0 = (float) r0
            float r0 = r0 * r3
            r1 = 1133903872(0x43960000, float:300.0)
            float r0 = r0 / r1
            float r0 = r16 - r0
            float r2 = r2 * r0
            int r0 = (int) r2
            goto L_0x0531
        L_0x0571:
            int r2 = r7.h
            if (r2 != r13) goto L_0x0588
            int r2 = r7.I
            float r2 = (float) r2
            r3 = 1041865114(0x3e19999a, float:0.15)
            long r0 = r0 - r10
            float r0 = (float) r0
            float r0 = r0 * r3
            r1 = 1133903872(0x43960000, float:300.0)
            float r0 = r0 / r1
            float r0 = r16 - r0
            float r2 = r2 * r0
            int r0 = (int) r2
            goto L_0x0531
        L_0x0588:
            int r0 = r7.e(r12, r10)
            goto L_0x0531
        L_0x058d:
            int r11 = r7.f71363e
            long r5 = r7.m
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r9] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r5)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81354(0x13dca, float:1.14001E-40)
            java.lang.Class[] r12 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r12[r9] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r12[r15] = r1
            java.lang.Class r17 = java.lang.Integer.TYPE
            r1 = r30
            r14 = r5
            r5 = r12
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x05f2
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r9] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r14)
            r2 = 1
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r3 = f71359a
            r4 = 0
            r5 = 81354(0x13dca, float:1.14001E-40)
            java.lang.Class[] r6 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6[r9] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r6[r2] = r1
            java.lang.Class r11 = java.lang.Integer.TYPE
            r1 = r30
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x05f6
        L_0x05f2:
            int r0 = r7.f(r11, r14)
        L_0x05f6:
            int r1 = r0 + r10
            int r1 = r1 / r13
            if (r24 == 0) goto L_0x061d
            r2 = r24
            if (r2 != r13) goto L_0x0600
            goto L_0x061d
        L_0x0600:
            r3 = 1
            if (r2 != r3) goto L_0x063c
            android.graphics.Paint r2 = r7.i
            int r0 = r0 - r10
            float r0 = (float) r0
            r2.setStrokeWidth(r0)
            int r0 = r30.getMeasuredWidth()
            int r0 = r0 / r13
            float r0 = (float) r0
            int r2 = r30.getMeasuredHeight()
            int r2 = r2 / r13
            float r2 = (float) r2
            float r1 = (float) r1
            android.graphics.Paint r3 = r7.i
            r8.drawCircle(r0, r2, r1, r3)
            goto L_0x063c
        L_0x061d:
            android.graphics.Paint r2 = r7.j
            int r0 = r0 - r10
            float r0 = (float) r0
            r2.setStrokeWidth(r0)
            android.graphics.Paint r0 = r7.j
            r2 = 0
            r0.setPathEffect(r2)
            int r0 = r30.getMeasuredWidth()
            int r0 = r0 / r13
            float r0 = (float) r0
            int r2 = r30.getMeasuredHeight()
            int r2 = r2 / r13
            float r2 = (float) r2
            float r1 = (float) r1
            android.graphics.Paint r3 = r7.j
            r8.drawCircle(r0, r2, r1, r3)
        L_0x063c:
            int r10 = r7.f71363e
            int r11 = r7.h
            long r14 = r7.m
            long r5 = r7.J
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r2 = 1
            r1[r2] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r14)
            r1[r13] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            r2 = 3
            r1[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81355(0x13dcb, float:1.14003E-40)
            r0 = 4
            java.lang.Class[] r12 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r12[r9] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r17 = 1
            r12[r17] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r12[r13] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r17 = 3
            r12[r17] = r0
            java.lang.Class r17 = java.lang.Integer.TYPE
            r0 = r1
            r1 = r30
            r25 = r5
            r5 = r12
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r12 = 1128792064(0x43480000, float:200.0)
            r17 = 1053609165(0x3ecccccd, float:0.4)
            if (r0 == 0) goto L_0x06e3
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r2 = 1
            r1[r2] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r14)
            r1[r13] = r0
            java.lang.Long r0 = new java.lang.Long
            r2 = r25
            r0.<init>(r2)
            r2 = 3
            r1[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81355(0x13dcb, float:1.14003E-40)
            r0 = 4
            java.lang.Class[] r5 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r5[r9] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6 = 1
            r5[r6] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r5[r13] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r6 = 3
            r5[r6] = r0
            java.lang.Class r6 = java.lang.Integer.TYPE
            r0 = r1
            r1 = r30
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x06e0:
            r10 = r0
            goto L_0x0768
        L_0x06e3:
            r2 = r25
            long r0 = android.os.SystemClock.uptimeMillis()
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r5 = 3
            if (r10 != r5) goto L_0x072f
            if (r11 != 0) goto L_0x06f8
            int r0 = r7.I
            float r0 = (float) r0
            float r0 = r0 * r4
            int r0 = (int) r0
            goto L_0x06e0
        L_0x06f8:
            if (r11 != r13) goto L_0x0711
            long r5 = r0 - r2
            float r5 = (float) r5
            r6 = 1120403456(0x42c80000, float:100.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0711
            int r0 = r7.I
            float r0 = (float) r0
            float r0 = r0 * r4
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r5 = r5 * r1
            float r5 = r5 / r12
            float r0 = r0 + r5
            int r0 = (int) r0
            goto L_0x06e0
        L_0x0711:
            if (r11 != r13) goto L_0x072a
            long r2 = r0 - r2
            float r2 = (float) r2
            r3 = 1120403456(0x42c80000, float:100.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x072a
            int r0 = r7.I
            float r0 = (float) r0
            float r0 = r0 * r17
            float r2 = r2 * r16
            float r2 = r2 / r12
            float r1 = r16 - r2
            float r0 = r0 * r1
            int r0 = (int) r0
            goto L_0x06e0
        L_0x072a:
            r2 = 1
            if (r11 != r2) goto L_0x072f
        L_0x072d:
            r10 = 0
            goto L_0x0768
        L_0x072f:
            r2 = 4
            if (r10 != r2) goto L_0x0762
            if (r11 != 0) goto L_0x074b
            int r2 = r7.I
            float r2 = (float) r2
            float r2 = r2 * r4
            int r3 = r7.I
            float r3 = (float) r3
            r4 = 1060320051(0x3f333333, float:0.7)
            float r3 = r3 * r4
            long r0 = r0 - r14
            float r0 = (float) r0
            float r3 = r3 * r0
            r0 = 1133903872(0x43960000, float:300.0)
            float r3 = r3 / r0
            float r2 = r2 + r3
            int r0 = (int) r2
            goto L_0x06e0
        L_0x074b:
            r2 = 1
            if (r11 != r2) goto L_0x075f
            int r2 = r7.I
            float r2 = (float) r2
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r3
            long r0 = r0 - r14
            float r0 = (float) r0
            float r2 = r2 * r0
            r0 = 1133903872(0x43960000, float:300.0)
            float r2 = r2 / r0
            int r0 = (int) r2
            goto L_0x06e0
        L_0x075f:
            if (r11 != r13) goto L_0x0762
            goto L_0x072d
        L_0x0762:
            int r0 = r7.a((int) r10, (long) r14)
            goto L_0x06e0
        L_0x0768:
            int r0 = r30.getMeasuredWidth()
            int r11 = r0 / 2
            int r0 = r30.getMeasuredHeight()
            int r14 = r0 / 2
            int r15 = r7.f71363e
            int r6 = r7.h
            long r4 = r7.m
            long r2 = r7.J
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r1[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r18 = 1
            r1[r18] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            r1[r13] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r2)
            r18 = 3
            r1[r18] = r0
            com.meituan.robust.ChangeQuickRedirect r18 = f71359a
            r20 = 0
            r21 = 81356(0x13dcc, float:1.14004E-40)
            r0 = 4
            java.lang.Class[] r12 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r12[r9] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r22 = 1
            r12[r22] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r12[r13] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r22 = 3
            r12[r22] = r0
            java.lang.Class r22 = java.lang.Integer.TYPE
            r0 = r1
            r1 = r30
            r27 = r2
            r2 = r18
            r3 = r20
            r29 = r14
            r13 = r4
            r4 = r21
            r5 = r12
            r12 = r6
            r6 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0823
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r1[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2 = 1
            r1[r2] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r13)
            r2 = 2
            r1[r2] = r0
            java.lang.Long r0 = new java.lang.Long
            r2 = r27
            r0.<init>(r2)
            r2 = 3
            r1[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81356(0x13dcc, float:1.14004E-40)
            r0 = 4
            java.lang.Class[] r5 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r5[r9] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6 = 1
            r5[r6] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r6 = 2
            r5[r6] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r6 = 3
            r5[r6] = r0
            java.lang.Class r6 = java.lang.Integer.TYPE
            r0 = r1
            r1 = r30
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r9 = r0.intValue()
            goto L_0x0883
        L_0x0823:
            r2 = r27
            long r0 = android.os.SystemClock.uptimeMillis()
            r4 = 3
            if (r15 != r4) goto L_0x084e
            if (r12 != 0) goto L_0x0835
            int r0 = r7.I
            float r0 = (float) r0
            float r0 = r0 * r17
            int r9 = (int) r0
            goto L_0x0883
        L_0x0835:
            r4 = 2
            if (r12 != r4) goto L_0x084a
            int r4 = r7.I
            float r4 = (float) r4
            float r4 = r4 * r17
            long r0 = r0 - r2
            float r0 = (float) r0
            float r0 = r0 * r16
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            float r16 = r16 - r0
            float r4 = r4 * r16
            int r9 = (int) r4
            goto L_0x0883
        L_0x084a:
            r2 = 1
            if (r12 != r2) goto L_0x084e
            goto L_0x0883
        L_0x084e:
            r2 = 4
            if (r15 != r2) goto L_0x087f
            if (r12 != 0) goto L_0x0867
            int r2 = r7.I
            float r2 = (float) r2
            float r2 = r2 * r17
            int r3 = r7.I
            float r3 = (float) r3
            float r3 = r3 * r17
            long r0 = r0 - r13
            float r0 = (float) r0
            float r3 = r3 * r0
            r0 = 1133903872(0x43960000, float:300.0)
            float r3 = r3 / r0
            float r2 = r2 + r3
            int r9 = (int) r2
            goto L_0x0883
        L_0x0867:
            r2 = 1
            if (r12 != r2) goto L_0x087b
            int r2 = r7.I
            float r2 = (float) r2
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r3
            long r0 = r0 - r13
            float r0 = (float) r0
            float r2 = r2 * r0
            r0 = 1133903872(0x43960000, float:300.0)
            float r2 = r2 / r0
            int r9 = (int) r2
            goto L_0x0883
        L_0x087b:
            r0 = 2
            if (r12 != r0) goto L_0x087f
            goto L_0x0883
        L_0x087f:
            int r9 = r7.b(r15, r13)
        L_0x0883:
            android.graphics.Paint r0 = r7.i
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.RectF r0 = r7.n
            int r1 = r11 - r9
            float r1 = (float) r1
            r0.left = r1
            android.graphics.RectF r0 = r7.n
            int r14 = r29 - r9
            float r1 = (float) r14
            r0.top = r1
            android.graphics.RectF r0 = r7.n
            int r11 = r11 + r9
            float r1 = (float) r11
            r0.right = r1
            android.graphics.RectF r0 = r7.n
            int r14 = r29 + r9
            float r1 = (float) r14
            r0.bottom = r1
            android.graphics.RectF r0 = r7.n
            float r1 = (float) r10
            android.graphics.Paint r2 = r7.i
            r8.drawRoundRect(r0, r1, r1, r2)
            android.graphics.Paint r0 = r7.i
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
        L_0x08b4:
            r31.restore()
            int r0 = r7.f71363e
            r1 = 1
            if (r0 == r1) goto L_0x08bf
            r30.invalidate()
        L_0x08bf:
            return
        L_0x08c0:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81345(0x13dc1, float:1.13989E-40)
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r30
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x08f5
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81345(0x13dc1, float:1.13989E-40)
            java.lang.Class[] r5 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.Canvas> r0 = android.graphics.Canvas.class
            r5[r9] = r0
            java.lang.Class r6 = java.lang.Void.TYPE
            r0 = r1
            r1 = r30
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x08f5:
            long r18 = android.os.SystemClock.uptimeMillis()
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81346(0x13dc2, float:1.1399E-40)
            java.lang.Class[] r5 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.Canvas> r0 = android.graphics.Canvas.class
            r5[r9] = r0
            java.lang.Class r6 = java.lang.Void.TYPE
            r0 = r1
            r1 = r30
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0930
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81346(0x13dc2, float:1.1399E-40)
            java.lang.Class[] r5 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.Canvas> r0 = android.graphics.Canvas.class
            r5[r9] = r0
            java.lang.Class r6 = java.lang.Void.TYPE
            r0 = r1
            r1 = r30
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r2 = 1
            goto L_0x09a5
        L_0x0930:
            int r0 = r7.H
            float r0 = (float) r0
            float r0 = r0 * r17
            int r0 = (int) r0
            int r1 = r7.H
            int r2 = r1 + r0
            r3 = 2
            int r2 = r2 / r3
            int r1 = r1 - r0
            android.graphics.Paint r0 = r7.j
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r7.j
            android.graphics.DashPathEffect r1 = r30.getDashPathEffect()
            r0.setPathEffect(r1)
            int r0 = r30.getMeasuredWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            int r1 = r30.getMeasuredHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            float r2 = (float) r2
            android.graphics.Paint r4 = r7.j
            r8.drawCircle(r0, r1, r2, r4)
            long r0 = r7.m
            r2 = 1
            int r0 = r7.a((int) r2, (long) r0)
            int r1 = r30.getMeasuredWidth()
            int r1 = r1 / r3
            int r4 = r30.getMeasuredHeight()
            int r4 = r4 / r3
            long r5 = r7.m
            int r3 = r7.b(r2, r5)
            android.graphics.Paint r5 = r7.i
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r5.setStyle(r6)
            android.graphics.RectF r5 = r7.n
            int r6 = r1 - r3
            float r6 = (float) r6
            r5.left = r6
            android.graphics.RectF r5 = r7.n
            int r6 = r4 - r3
            float r6 = (float) r6
            r5.top = r6
            android.graphics.RectF r5 = r7.n
            int r1 = r1 + r3
            float r1 = (float) r1
            r5.right = r1
            android.graphics.RectF r1 = r7.n
            int r4 = r4 + r3
            float r3 = (float) r4
            r1.bottom = r3
            android.graphics.RectF r1 = r7.n
            float r0 = (float) r0
            android.graphics.Paint r3 = r7.i
            r8.drawRoundRect(r1, r0, r0, r3)
            android.graphics.Paint r0 = r7.i
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
        L_0x09a5:
            android.graphics.Paint r0 = r7.j
            int r1 = r7.C
            r0.setColor(r1)
            int r0 = r7.f71363e
            r3 = 1000(0x3e8, double:4.94E-321)
            r1 = 3
            if (r0 != r1) goto L_0x09f2
            int r0 = r7.H
            float r0 = (float) r0
            float r0 = r0 * r17
            int r0 = (int) r0
            int r1 = r7.H
            int r1 = r1 + r0
            r0 = 2
            int r1 = r1 / r0
            int r5 = r30.getMeasuredWidth()
            int r5 = r5 / r0
            int r5 = r5 - r1
            float r9 = (float) r5
            int r5 = r30.getMeasuredHeight()
            int r5 = r5 / r0
            int r5 = r5 - r1
            float r10 = (float) r5
            int r5 = r30.getMeasuredWidth()
            int r5 = r5 / r0
            int r5 = r5 + r1
            float r11 = (float) r5
            int r5 = r30.getMeasuredHeight()
            int r5 = r5 / r0
            int r5 = r5 + r1
            float r12 = (float) r5
            r13 = -1028390912(0xffffffffc2b40000, float:-90.0)
            long r0 = r7.m
            long r0 = r18 - r0
            r5 = 360(0x168, double:1.78E-321)
            long r0 = r0 * r5
            long r0 = r0 / r3
            float r14 = (float) r0
            r15 = 0
            android.graphics.Paint r0 = r7.j
            r8 = r31
            r1 = 1
            r16 = r0
            r8.drawArc(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x09f3
        L_0x09f2:
            r1 = 1
        L_0x09f3:
            android.graphics.Paint r0 = r7.j
            int r2 = r7.F
            r0.setColor(r2)
            android.graphics.Paint r0 = r7.j
            android.graphics.DashPathEffect r2 = r30.getDashPathEffect()
            r0.setPathEffect(r2)
            int r0 = r7.f71363e
            if (r0 == r1) goto L_0x0a1c
            long r5 = r7.m
            long r18 = r18 - r5
            int r0 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a15
            r7.b((int) r1)
            r30.invalidate()
        L_0x0a15:
            int r0 = r7.f71363e
            if (r0 == r1) goto L_0x0a1c
            r30.invalidate()
        L_0x0a1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void a(int i2, boolean z2, boolean z3) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f71359a, false, 81372, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f71359a, false, 81372, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.s = this.t;
        this.A = this.f71364f;
        this.f71364f = i3;
        this.t = z2;
        this.u = z3;
        if (!this.p) {
            invalidate();
            super.setOnClickListener(this.R);
            this.p = !this.p;
        } else if (this.f71364f != this.A) {
            if (i3 == 1) {
                super.setOnClickListener(this.R);
                b(6);
            } else if (i3 == 2) {
                super.setOnClickListener(this.R);
                b(9);
            } else if (i3 == 0) {
                this.i.setColor(this.E);
                this.j.setColor(this.F);
                super.setOnClickListener(null);
                b(8);
            } else if (i3 == 3) {
                super.setOnClickListener(this.R);
                b(7);
            }
            invalidate();
        }
    }

    public final void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f71359a, false, 81373, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f71359a, false, 81373, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(i2, z2, true);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f71359a, false, 81378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71359a, false, 81378, new Class[0], Void.TYPE);
            return;
        }
        if (this.K != -1) {
            this.f71364f = this.K;
            this.K = -1;
            invalidate();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f71359a, false, 81377, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71359a, false, 81377, new Class[0], Void.TYPE);
        } else if (this.f71363e == 1) {
            b(2);
            invalidate();
        } else {
            if (this.f71363e == 3 || this.f71363e == 2) {
                b(4);
            }
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f71359a, false, 81379, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71359a, false, 81379, new Class[0], Void.TYPE);
            return;
        }
        g();
        if (this.f71363e == 3 || this.f71363e == 2) {
            b(4);
            this.x = false;
        }
    }

    public final boolean d() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f71359a, false, 81382, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71359a, false, 81382, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (System.currentTimeMillis() - this.M < 300) {
            z2 = true;
        }
        return z2;
    }

    public DashPathEffect getDashPathEffect() {
        if (PatchProxy.isSupport(new Object[0], this, f71359a, false, 81337, new Class[0], DashPathEffect.class)) {
            return (DashPathEffect) PatchProxy.accessDispatch(new Object[0], this, f71359a, false, 81337, new Class[0], DashPathEffect.class);
        }
        if (this.Q == null) {
            this.Q = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        }
        return this.Q;
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f71359a, false, 81340, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71359a, false, 81340, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.B = (TextView) findViewById(C0906R.id.dh8);
        if (com.ss.android.g.a.b()) {
            this.B.setText("");
            this.B.setBackgroundDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130840294));
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f71359a, false, 81380, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71359a, false, 81380, new Class[0], Void.TYPE);
            return;
        }
        g();
        setHasBeenMoveScaled(false);
        this.w.f();
        if (this.f71363e == 3 || this.f71363e == 2) {
            b(4);
        }
        this.w.d();
        this.r = System.currentTimeMillis();
        invalidate();
    }

    public void setCurrentScaleMode(int i2) {
        this.g = i2;
    }

    public void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.v = scaleGestureDetector;
    }

    public RecordLayout(Context context) {
        this(context, null);
    }

    public void setEnabled(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f71359a, false, 81339, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f71359a, false, 81339, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setEnabled(z2);
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f71359a, false, 81370, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f71359a, false, 81370, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        if (PatchProxy.isSupport(new Object[]{onLongClickListener}, this, f71359a, false, 81371, new Class[]{View.OnLongClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLongClickListener}, this, f71359a, false, 81371, new Class[]{View.OnLongClickListener.class}, Void.TYPE);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setRecordListener(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f71359a, false, 81338, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f71359a, false, 81338, new Class[]{a.class}, Void.TYPE);
        } else if (aVar != null) {
            this.w = new b(aVar);
        } else {
            this.w = null;
        }
    }

    private int c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71359a, false, 81342, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71359a, false, 81342, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        return this.L;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{1}, this, f71359a, false, 81374, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1}, this, f71359a, false, 81374, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setOnClickListener(this.R);
        this.K = this.f71364f;
        this.f71364f = 1;
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71359a, false, 81375, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71359a, false, 81375, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71363e = i2;
        this.m = SystemClock.uptimeMillis();
    }

    public void setHasBeenMoveScaled(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f71359a, false, 81381, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f71359a, false, 81381, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.o = z2;
        this.M = System.currentTimeMillis();
    }

    private void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71359a, false, 81376, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71359a, false, 81376, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h = i2;
        this.J = SystemClock.uptimeMillis();
    }

    @ColorInt
    private int a(long j2) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f71359a, false, 81367, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f71359a, false, 81367, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.t) {
            i3 = this.E;
            i2 = this.C;
        } else if (this.s) {
            i3 = this.C;
            i2 = this.E;
        } else {
            i3 = this.E;
            i2 = this.E;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.m > 300) {
            return i2;
        }
        return ((Integer) this.P.evaluate((((float) (uptimeMillis - j2)) * 1.0f) / 300.0f, Integer.valueOf(i3), Integer.valueOf(i2))).intValue();
    }

    @ColorInt
    private int b(long j2) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f71359a, false, 81368, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f71359a, false, 81368, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.t) {
            i3 = this.F;
            i2 = this.D;
        } else if (this.s) {
            i3 = this.D;
            i2 = this.F;
        } else {
            i3 = this.F;
            i2 = this.F;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - j2;
        if (uptimeMillis > 300) {
            return i2;
        }
        return ((Integer) this.P.evaluate((((float) uptimeMillis) * 1.0f) / 300.0f, Integer.valueOf(i3), Integer.valueOf(i2))).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0121, code lost:
        if (r7.m != 2) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0125, code lost:
        if (r7.h != 0) goto L_0x01f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 81369(0x13dd9, float:1.14022E-40)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f71359a
            r3 = 0
            r4 = 81369(0x13dd9, float:1.14022E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003f:
            boolean r0 = r18.isEnabled()
            if (r0 != 0) goto L_0x0055
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            if (r0 == 0) goto L_0x0054
            int r0 = r19.getAction()
            if (r0 != 0) goto L_0x0054
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.ao_()
        L_0x0054:
            return r9
        L_0x0055:
            int r0 = r19.getAction()
            if (r0 != 0) goto L_0x00b8
            com.ss.android.ugc.aweme.shortvideo.widget.g r1 = r7.O
            if (r1 == 0) goto L_0x00b8
            com.ss.android.ugc.aweme.shortvideo.widget.g r1 = r7.O
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.widget.g.f71445a
            r14 = 0
            r15 = 81424(0x13e10, float:1.141E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r1
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0090
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.widget.g.f71445a
            r14 = 0
            r15 = 81424(0x13e10, float:1.141E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r1
            r16 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x00b5
        L_0x0090:
            android.support.v4.app.FragmentActivity r2 = r1.f71446b
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r1.a(r2)
            boolean r3 = com.ss.android.g.a.a()
            if (r3 == 0) goto L_0x00b4
            boolean r3 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.g(r2)
            if (r3 == 0) goto L_0x00b4
            boolean r3 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.n(r2)
            if (r3 != 0) goto L_0x00b4
            com.ss.android.ugc.aweme.sticker.b r3 = r1.f71447c
            r3.a(r2)
            com.ss.android.ugc.aweme.sticker.b r1 = r1.f71447c
            r1.a()
            r1 = 1
            goto L_0x00b5
        L_0x00b4:
            r1 = 0
        L_0x00b5:
            if (r1 == 0) goto L_0x00b8
            return r9
        L_0x00b8:
            r1 = 261(0x105, float:3.66E-43)
            r2 = 2
            if (r0 == r1) goto L_0x00c5
            r1 = 517(0x205, float:7.24E-43)
            if (r0 == r1) goto L_0x00c2
            goto L_0x00c7
        L_0x00c2:
            r7.g = r2
            goto L_0x00c7
        L_0x00c5:
            r7.g = r9
        L_0x00c7:
            int r1 = r7.f71364f
            r3 = 4
            r4 = 3
            if (r1 != r4) goto L_0x0204
            long r5 = android.os.SystemClock.uptimeMillis()
            r1 = 0
            if (r0 != 0) goto L_0x0129
            long r5 = android.os.SystemClock.uptimeMillis()
            r7.N = r5
            float r0 = r19.getX()
            r7.f71360b = r0
            float r0 = r19.getY()
            r7.f71361c = r0
            float r0 = r19.getRawX()
            r7.y = r0
            float r0 = r19.getRawY()
            r7.z = r0
            int r0 = r7.f71363e
            if (r0 != r9) goto L_0x0100
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.c()
            r7.b((int) r2)
            goto L_0x01f1
        L_0x0100:
            int r0 = r7.f71363e
            if (r0 != r3) goto L_0x0117
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.c()
            r7.b((int) r2)
            r7.d(r10)
            r7.q = r10
            r7.k = r1
            r7.l = r1
            goto L_0x01f1
        L_0x0117:
            int r0 = r7.f71363e
            if (r0 == r4) goto L_0x0123
            long r0 = r7.m
            r4 = 2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x01f4
        L_0x0123:
            int r0 = r7.h
            if (r0 != 0) goto L_0x01f4
            goto L_0x01e9
        L_0x0129:
            if (r0 != r2) goto L_0x01a5
            int r0 = r7.f71363e
            if (r0 == r4) goto L_0x0133
            int r0 = r7.f71363e
            if (r0 != r2) goto L_0x01a1
        L_0x0133:
            float r0 = r19.getX()
            float r3 = r7.f71360b
            float r0 = r0 - r3
            r7.k = r0
            float r0 = r19.getY()
            float r3 = r7.f71361c
            float r0 = r0 - r3
            r7.l = r0
            int r0 = r7.h
            if (r0 != 0) goto L_0x018f
            float r0 = r19.getRawX()
            float r3 = r7.y
            float r0 = r0 - r3
            double r3 = (double) r0
            float r0 = r19.getRawY()
            float r5 = r7.z
            float r0 = r0 - r5
            double r5 = (double) r0
            java.lang.Double.isNaN(r3)
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r3
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r5
            double r3 = r3 + r5
            double r3 = java.lang.Math.sqrt(r3)
            int r0 = r7.L
            int r0 = r0 / r2
            double r5 = (double) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x017e
            boolean r0 = r7.q
            if (r0 != 0) goto L_0x017e
            r7.d(r2)
            goto L_0x01a1
        L_0x017e:
            boolean r0 = r7.q
            if (r0 == 0) goto L_0x01a1
            r7.k = r1
            r7.l = r1
            r7.setHasBeenMoveScaled(r10)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.f()
            goto L_0x01a1
        L_0x018f:
            int r0 = r7.g
            if (r0 == 0) goto L_0x0197
            int r0 = r7.g
            if (r0 != r9) goto L_0x01a1
        L_0x0197:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            float r1 = r19.getY()
            float r1 = -r1
            r0.a_(r1)
        L_0x01a1:
            r18.invalidate()
            goto L_0x01f4
        L_0x01a5:
            if (r0 == r9) goto L_0x01a9
            if (r0 != r4) goto L_0x01f4
        L_0x01a9:
            int r0 = r7.h
            if (r0 != 0) goto L_0x01d5
            int r0 = r7.f71363e
            if (r0 == r4) goto L_0x01b5
            int r0 = r7.f71363e
            if (r0 != r2) goto L_0x01f1
        L_0x01b5:
            long r2 = r7.N
            long r5 = r5 - r2
            r2 = 350(0x15e, double:1.73E-321)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f1
            r7.setHasBeenMoveScaled(r10)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.f()
            r7.q = r9
            r7.k = r1
            r7.l = r1
            r7.d(r10)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.a(r9)
            goto L_0x01f1
        L_0x01d5:
            int r0 = r7.g
            if (r0 == 0) goto L_0x01dd
            int r0 = r7.g
            if (r0 != r9) goto L_0x01e9
        L_0x01dd:
            boolean r0 = r7.o
            if (r0 == 0) goto L_0x01e9
            r7.setHasBeenMoveScaled(r10)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.f()
        L_0x01e9:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.d()
            r7.b((int) r3)
        L_0x01f1:
            r18.invalidate()
        L_0x01f4:
            android.view.ScaleGestureDetector r0 = r7.v
            if (r0 == 0) goto L_0x0203
            boolean r0 = r18.d()
            if (r0 != 0) goto L_0x0203
            android.view.ScaleGestureDetector r0 = r7.v
            r0.onTouchEvent(r8)
        L_0x0203:
            return r9
        L_0x0204:
            if (r0 != 0) goto L_0x0219
            long r5 = java.lang.System.currentTimeMillis()
            long r11 = r7.r
            long r5 = r5 - r11
            r11 = 300(0x12c, double:1.48E-321)
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x0214
            return r9
        L_0x0214:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r1 = r7.w
            r1.a(r10)
        L_0x0219:
            int r1 = r7.f71364f
            if (r1 != 0) goto L_0x02ad
            if (r0 != 0) goto L_0x0244
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            boolean r0 = r0.ap_()
            r9 = r9 ^ r0
            if (r9 == 0) goto L_0x029d
            float r0 = r19.getX()
            r7.f71360b = r0
            float r0 = r19.getY()
            r7.f71361c = r0
            float r0 = r7.f71361c
            r7.f71362d = r0
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.c()
            r7.b((int) r2)
            r18.invalidate()
            goto L_0x029d
        L_0x0244:
            if (r0 != r2) goto L_0x0271
            float r0 = r19.getX()
            float r1 = r7.f71360b
            float r0 = r0 - r1
            r7.k = r0
            float r0 = r19.getY()
            float r1 = r7.f71361c
            float r0 = r0 - r1
            r7.l = r0
            int r0 = r7.g
            if (r0 == 0) goto L_0x0260
            int r0 = r7.g
            if (r0 != r9) goto L_0x029d
        L_0x0260:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            float r1 = r19.getY()
            float r1 = -r1
            r0.a_(r1)
            float r0 = r19.getY()
            r7.f71362d = r0
            goto L_0x029d
        L_0x0271:
            if (r0 == r9) goto L_0x0278
            if (r0 != r4) goto L_0x0276
            goto L_0x0278
        L_0x0276:
            r9 = 0
            goto L_0x029d
        L_0x0278:
            int r0 = r7.g
            if (r0 == 0) goto L_0x0280
            int r0 = r7.g
            if (r0 != r9) goto L_0x028c
        L_0x0280:
            boolean r0 = r7.o
            if (r0 == 0) goto L_0x028c
            r7.setHasBeenMoveScaled(r10)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.f()
        L_0x028c:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r7.w
            r0.d()
            long r0 = java.lang.System.currentTimeMillis()
            r7.r = r0
            r7.b((int) r3)
            r18.invalidate()
        L_0x029d:
            android.view.ScaleGestureDetector r0 = r7.v
            if (r0 == 0) goto L_0x02ac
            boolean r0 = r18.d()
            if (r0 != 0) goto L_0x02ac
            android.view.ScaleGestureDetector r0 = r7.v
            r0.onTouchEvent(r8)
        L_0x02ac:
            return r9
        L_0x02ad:
            android.view.ScaleGestureDetector r0 = r7.v
            if (r0 == 0) goto L_0x02bc
            boolean r0 = r18.d()
            if (r0 != 0) goto L_0x02bc
            android.view.ScaleGestureDetector r0 = r7.v
            r0.onTouchEvent(r8)
        L_0x02bc:
            r18.requestFocus()
            boolean r0 = super.onTouchEvent(r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public RecordLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int d(int i2, long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{4, new Long(j3)}, this, f71359a, false, 81362, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{4, new Long(j3)}, this, f71359a, false, 81362, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        return (int) (((((float) this.I) * 0.85f) * ((float) (SystemClock.uptimeMillis() - j3))) / 300.0f);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71359a, false, 81341, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71359a, false, 81341, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(c(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(c(i3), 1073741824));
    }

    private int a(int i2, long j2) {
        int i3 = i2;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j3)}, this, f71359a, false, 81357, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j3)}, this, f71359a, false, 81357, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i3 == 2) {
            return (int) ((((float) this.I) * 0.1f) + (((float) this.I) * 0.7f * (1.0f - ((((float) (uptimeMillis - j3)) * 1.0f) / 300.0f))));
        }
        if (i3 == 3) {
            return (int) (((float) this.I) * 0.1f);
        }
        if (i3 == 4) {
            return (int) ((((float) this.I) * 0.1f) + (((((float) this.I) * 0.7f) * ((float) (uptimeMillis - j3))) / 300.0f));
        }
        if (i3 == 1) {
            return (int) (((float) this.I) * 0.8f);
        }
        return 0;
    }

    private int b(int i2, long j2) {
        int i3 = i2;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j3)}, this, f71359a, false, 81358, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j3)}, this, f71359a, false, 81358, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i3 == 2) {
            return (int) ((((float) this.I) * 0.4f) + (((float) this.I) * 0.4f * (1.0f - ((((float) (uptimeMillis - j3)) * 1.0f) / 300.0f))));
        }
        if (i3 == 3) {
            return (int) (((float) this.I) * 0.4f);
        }
        if (i3 == 4) {
            return (int) ((((float) this.I) * 0.4f) + (((((float) this.I) * 0.4f) * ((float) (uptimeMillis - j3))) / 300.0f));
        }
        if (i3 == 1) {
            return (int) (((float) this.I) * 0.8f);
        }
        return 0;
    }

    private int c(int i2, long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{4, new Long(j3)}, this, f71359a, false, 81360, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{4, new Long(j3)}, this, f71359a, false, 81360, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        return (int) (((float) this.I) * 0.85f * (1.0f - ((((float) (SystemClock.uptimeMillis() - j3)) * 1.0f) / 300.0f)));
    }

    private int e(int i2, long j2) {
        int i3 = i2;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j3)}, this, f71359a, false, 81365, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j3)}, this, f71359a, false, 81365, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i3 == 2) {
            return (int) ((((long) this.I) * (uptimeMillis - j3)) / 300);
        }
        if (i3 == 3) {
            double d2 = (double) this.I;
            double d3 = (double) (uptimeMillis - j3);
            Double.isNaN(d3);
            double d4 = (double) (this.G - this.H);
            Double.isNaN(d4);
            Double.isNaN(d2);
            return (int) (d2 + ((Math.sin((d3 * 3.141592653589793d) / 700.0d) + 1.0d) * d4 * 0.30000001192092896d));
        } else if (i3 == 4) {
            return (int) (((float) this.I) * (1.0f - ((((float) (uptimeMillis - j3)) * 1.0f) / 300.0f)));
        } else {
            return i3 == 1 ? 0 : 0;
        }
    }

    private int f(int i2, long j2) {
        int i3 = i2;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j3)}, this, f71359a, false, 81366, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j3)}, this, f71359a, false, 81366, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i3 == 2) {
            return this.H + ((int) ((((long) (this.G - this.H)) * (uptimeMillis - j3)) / 300));
        }
        if (i3 == 3) {
            return this.H + (this.G - this.H);
        }
        if (i3 == 4) {
            return this.H + ((int) (((float) (this.G - this.H)) * (1.0f - ((((float) (uptimeMillis - j3)) * 1.0f) / 300.0f))));
        }
        if (i3 == 1) {
            return this.H;
        }
        return 0;
    }

    private void a(Canvas canvas, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{canvas, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f71359a, false, 81359, new Class[]{Canvas.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas, Byte.valueOf(z2)}, this, f71359a, false, 81359, new Class[]{Canvas.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float c2 = (float) c(4, this.m);
        float e2 = (float) e();
        this.j.setStrokeWidth(e2 - c2);
        if (z2) {
            this.j.setPathEffect(getDashPathEffect());
        } else {
            this.j.setPathEffect(null);
        }
        canvas.drawCircle((float) (getMeasuredWidth() >> 1), (float) (getMeasuredHeight() >> 1), (e2 + c2) / 2.0f, this.j);
        float f2 = (((float) this.H) * 0.8f) + (((((float) (uptimeMillis - this.m)) * 1.0f) / 300.0f) * ((float) this.H) * 0.2f);
        this.i.setStrokeWidth(f2);
        canvas.drawCircle((float) (getMeasuredWidth() >> 1), (float) (getMeasuredHeight() >> 1), f2 / 2.0f, this.i);
        if (uptimeMillis - this.m > 300) {
            b(1);
            this.f71364f = 0;
        }
        invalidate();
    }

    public RecordLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f71364f = 3;
        this.A = -1;
        this.K = -1;
        this.L = (int) UIUtils.dip2Px(getContext(), 100.0f);
        this.n = new RectF();
        this.M = 0;
        this.p = false;
        this.q = false;
        this.u = true;
        this.P = new ArgbEvaluator();
        this.w = new d();
        this.R = new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71365a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f71365a, false, 81383, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f71365a, false, 81383, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (RecordLayout.this.f71363e != 1) {
                    if ((RecordLayout.this.f71363e == 3 || RecordLayout.this.f71363e == 2) && RecordLayout.this.u) {
                        RecordLayout.this.b(4);
                        RecordLayout.this.w.d();
                    }
                } else if (!RecordLayout.this.w.ap_()) {
                    if (RecordLayout.this.t) {
                        RecordLayout.this.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f71367a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f71367a, false, 81384, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f71367a, false, 81384, new Class[0], Void.TYPE);
                                    return;
                                }
                                RecordLayout.this.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                            }
                        }).start();
                        RecordLayout.this.w.e();
                        return;
                    }
                    if (RecordLayout.this.f71364f == 2) {
                        RecordLayout.this.b(3);
                    } else {
                        RecordLayout.this.b(2);
                    }
                    RecordLayout.this.invalidate();
                    RecordLayout.this.w.c();
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{context}, this, f71359a, false, 81343, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f71359a, false, 81343, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.G = (int) UIUtils.dip2Px(context, 55.0f);
        this.H = (int) UIUtils.dip2Px(context, 40.0f);
        this.I = (int) UIUtils.dip2Px(context, 40.0f);
        if (context instanceof FragmentActivity) {
            this.O = new g((FragmentActivity) context);
        }
        this.f71363e = 1;
        this.i = new Paint();
        this.C = Color.parseColor("#ffffffff");
        this.D = Color.parseColor("#99ffffff");
        this.E = getResources().getColor(C0906R.color.a1z);
        this.F = getResources().getColor(C0906R.color.a21);
        this.i.setColor(this.E);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setAntiAlias(true);
        this.j = new Paint();
        this.j.setColor(getResources().getColor(C0906R.color.a21));
        this.j.setStyle(Paint.Style.STROKE);
        this.j.setAntiAlias(true);
    }

    private void a(Canvas canvas, boolean z2, boolean z3) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2, Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f71359a, false, 81361, new Class[]{Canvas.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, Byte.valueOf(z2), Byte.valueOf(z3)}, this, f71359a, false, 81361, new Class[]{Canvas.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float d2 = (float) d(4, this.m);
        float f2 = (float) f();
        this.j.setStrokeWidth(f2 - d2);
        if (z2) {
            this.j.setPathEffect(getDashPathEffect());
        } else {
            this.j.setPathEffect(null);
        }
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (f2 + d2) / 2.0f, this.j);
        float f3 = (((float) this.H) * 0.8f) + ((1.0f - ((((float) (uptimeMillis - this.m)) * 1.0f) / 300.0f)) * ((float) this.H) * 0.2f);
        this.i.setStrokeWidth(f3);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), f3 / 2.0f, this.i);
        if (uptimeMillis - this.m > 300) {
            b(1);
            if (z2) {
                this.f71364f = 2;
            } else if (z3) {
                this.f71364f = 3;
            } else {
                this.f71364f = 1;
            }
        }
        invalidate();
    }
}
