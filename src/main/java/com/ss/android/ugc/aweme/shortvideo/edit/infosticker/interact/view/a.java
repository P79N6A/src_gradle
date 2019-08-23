package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.utils.ey;

public class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67314a;

    /* renamed from: b  reason: collision with root package name */
    public RectF f67315b;

    /* renamed from: c  reason: collision with root package name */
    public int f67316c;

    /* renamed from: d  reason: collision with root package name */
    RectF f67317d;

    /* renamed from: e  reason: collision with root package name */
    PointF[] f67318e;

    /* renamed from: f  reason: collision with root package name */
    private int f67319f;
    private int g;
    private int h;
    private Paint i;
    private DashPathEffect j;
    private float k;
    private int l;
    private Vibrator m;
    private int n;
    private b o;

    public int getDeltaX() {
        return this.f67316c;
    }

    public int getViewWidth() {
        return this.l;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67314a, false, 77029, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67314a, false, 77029, new Class[0], Void.TYPE);
            return;
        }
        c(false);
        a(false);
        b(false);
        d(false);
        e(false);
        f(false);
        g(false);
        h(false);
        i(false);
        if (this.o != null) {
            this.o.b(false);
            this.o.a(false);
        }
    }

    public final Float a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67314a, false, 77030, new Class[]{Float.TYPE}, Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67314a, false, 77030, new Class[]{Float.TYPE}, Float.class);
        } else if (Math.abs(f2 - 0.0f) < 1.0f) {
            return Float.valueOf(0.0f);
        } else {
            if (Math.abs(Math.abs(f2) - 90.0f) < 1.0f) {
                return Float.valueOf(90.0f);
            }
            if (Math.abs(f2 - 45.0f) < 1.0f) {
                return Float.valueOf(45.0f);
            }
            if (Math.abs(f2 - -45.0f) < 1.0f) {
                return Float.valueOf(-45.0f);
            }
            return Float.valueOf(f2);
        }
    }

    private boolean b() {
        if ((this.n & SearchJediMixFeedAdapter.f42517f) == 128) {
            return true;
        }
        return false;
    }

    private boolean c() {
        if ((this.n & 256) == 256) {
            return true;
        }
        return false;
    }

    private boolean d() {
        if ((this.n & 64) == 64) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if ((this.n & 8) == 8) {
            return true;
        }
        return false;
    }

    private boolean f() {
        if ((this.n & 4) == 4) {
            return true;
        }
        return false;
    }

    private boolean g() {
        if ((this.n & 2) == 2) {
            return true;
        }
        return false;
    }

    private boolean h() {
        if ((this.n & 1) == 1) {
            return true;
        }
        return false;
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f67314a, false, 77037, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67314a, false, 77037, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            try {
                this.m.vibrate(30);
            } catch (Throwable unused) {
            }
        }
    }

    private float getLeftViewXMargin() {
        if (PatchProxy.isSupport(new Object[0], this, f67314a, false, 77039, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f67314a, false, 77039, new Class[0], Float.TYPE)).floatValue();
        } else if (ey.a(getContext())) {
            return (float) this.h;
        } else {
            return UIUtils.dip2Px(getContext(), 8.0f);
        }
    }

    private float getRightViewXMargin() {
        if (PatchProxy.isSupport(new Object[0], this, f67314a, false, 77040, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f67314a, false, 77040, new Class[0], Float.TYPE)).floatValue();
        } else if (ey.a(getContext())) {
            return ((float) fc.b(getContext())) - UIUtils.dip2Px(getContext(), 8.0f);
        } else {
            return (float) (fc.b(getContext()) - this.h);
        }
    }

    private int getShowHeight() {
        if (PatchProxy.isSupport(new Object[0], this, f67314a, false, 77013, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67314a, false, 77013, new Class[0], Integer.TYPE)).intValue();
        }
        Rect rect = new Rect();
        ((Activity) getContext()).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int height = ((View) getParent().getParent()).getHeight() - rect.top;
        int a2 = a(getContext());
        if (height > a2) {
            return height;
        }
        return a2;
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f67314a, false, 77012, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67314a, false, 77012, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (PatchProxy.isSupport(new Object[0], this, f67314a, false, 77017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67314a, false, 77017, new Class[0], Void.TYPE);
            return;
        }
        a();
        Context context = getContext();
        if (PatchProxy.isSupport(new Object[]{context}, this, f67314a, false, 77018, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f67314a, false, 77018, new Class[]{Context.class}, Void.TYPE);
        } else {
            this.o = new b(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fc.b(getContext()), getShowHeight());
            layoutParams.gravity = 1;
            this.o.setLayoutParams(layoutParams);
            addView(this.o);
        }
        Context context2 = getContext();
        if (PatchProxy.isSupport(new Object[]{context2}, this, f67314a, false, 77014, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f67314a, false, 77014, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(fc.b(getContext()), getShowHeight());
        layoutParams2.gravity = 1;
        setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(fc.b(getContext()), getShowHeight());
        layoutParams3.gravity = 1;
        this.o.setLayoutParams(layoutParams3);
        if (PatchProxy.isSupport(new Object[]{context2}, this, f67314a, false, 77016, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f67314a, false, 77016, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f67315b = new RectF(getLeftViewXMargin(), (float) (-getHeight()), getRightViewXMargin(), ((float) getShowHeight()) - this.k);
    }

    public void setDeltaX(int i2) {
        this.f67316c = i2;
    }

    public void setViewWidth(int i2) {
        this.l = i2;
    }

    private a(Context context) {
        this(context, null);
    }

    private static int a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f67314a, true, 77015, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f67314a, true, 77015, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        Rect rect = new Rect();
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    private void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67314a, false, 77021, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67314a, false, 77021, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (!b()) {
                i();
            }
            this.n |= SearchJediMixFeedAdapter.f42517f;
        } else {
            this.n &= -129;
        }
        postInvalidate();
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67314a, false, 77022, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67314a, false, 77022, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (!c()) {
                i();
            }
            this.n |= 256;
        } else {
            this.n &= -257;
        }
        postInvalidate();
    }

    private void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67314a, false, 77023, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67314a, false, 77023, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.n |= 32;
        } else {
            this.n &= -33;
        }
        postInvalidate();
    }

    private void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67314a, false, 77024, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67314a, false, 77024, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.n |= 16;
        } else {
            this.n &= -17;
        }
        postInvalidate();
    }

    private void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67314a, false, 77025, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67314a, false, 77025, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (!e()) {
                i();
            }
            this.n |= 8;
        } else {
            this.n &= -9;
        }
        postInvalidate();
    }

    private void g(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67314a, false, 77026, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67314a, false, 77026, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (!f()) {
                i();
            }
            this.n |= 4;
        } else {
            this.n &= -5;
        }
        postInvalidate();
    }

    private void h(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67314a, false, 77027, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67314a, false, 77027, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (!g()) {
                i();
            }
            this.n |= 2;
        } else {
            this.n &= -3;
        }
        postInvalidate();
    }

    private void i(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67314a, false, 77028, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67314a, false, 77028, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (!h()) {
                i();
            }
            this.n |= 1;
        } else {
            this.n &= -2;
        }
        postInvalidate();
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67314a, false, 77020, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67314a, false, 77020, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (!d()) {
                i();
            }
            this.n |= 64;
        } else {
            this.n &= -65;
        }
        postInvalidate();
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f67314a, false, 77038, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f67314a, false, 77038, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        this.i.setPathEffect(null);
        if (c()) {
            canvas.drawLine(getLeftViewXMargin(), 0.0f, getLeftViewXMargin(), (float) getHeight(), this.i);
        }
        if (b()) {
            canvas.drawLine(getRightViewXMargin(), 0.0f, getRightViewXMargin(), (float) getHeight(), this.i);
        }
        if (d()) {
            canvas.drawLine(0.0f, ((float) getHeight()) - this.k, (float) getWidth(), ((float) getHeight()) - this.k, this.i);
        }
        if ((this.n & 32) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.drawLine(0.0f, ((float) getHeight()) / 2.0f, (float) getWidth(), ((float) getHeight()) / 2.0f, this.i);
        }
        if ((this.n & 16) != 16) {
            z2 = false;
        }
        if (z2) {
            canvas.drawLine(((float) getWidth()) / 2.0f, 0.0f, ((float) getWidth()) / 2.0f, (float) getHeight(), this.i);
        }
        this.i.setPathEffect(this.j);
        if (e() && this.f67317d != null) {
            canvas.drawLine(0.0f, this.f67317d.centerY(), (float) getWidth(), this.f67317d.centerY(), this.i);
        }
        if (f() && this.f67317d != null) {
            canvas.drawLine(this.f67317d.centerX(), 0.0f, this.f67317d.centerX(), (float) getHeight(), this.i);
        }
        if (g() && this.f67317d != null) {
            Canvas canvas2 = canvas;
            canvas2.drawLine(0.0f, ((float) getHeight()) - ((((float) getHeight()) - this.f67317d.centerY()) + this.f67317d.centerX()), (((float) getHeight()) - this.f67317d.centerY()) + this.f67317d.centerX(), (float) getHeight(), this.i);
        }
        if (h() && this.f67317d != null) {
            canvas.drawLine((float) getWidth(), ((float) getHeight()) - ((((float) getWidth()) - this.f67317d.centerX()) + (((float) getHeight()) - this.f67317d.centerY())), ((float) getWidth()) - ((((float) getWidth()) - this.f67317d.centerX()) + (((float) getHeight()) - this.f67317d.centerY())), (float) getHeight(), this.i);
        }
    }

    private a(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.f67319f = 4;
        this.g = -16717825;
        this.i = new Paint();
        this.f67317d = new RectF();
        this.n = 0;
        this.f67319f = (int) UIUtils.dip2Px(context, 1.5f);
        this.h = (int) UIUtils.dip2Px(context, 56.0f);
        this.i.setColor(this.g);
        this.i.setAntiAlias(true);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth((float) this.f67319f);
        setWillNotDraw(false);
        this.k = (float) ((int) UIUtils.dip2Px(context, 201.0f));
        this.j = new DashPathEffect(new float[]{UIUtils.dip2Px(context, 2.0f), UIUtils.dip2Px(context, 1.0f)}, 0.0f);
        this.m = (Vibrator) context.getSystemService("vibrator");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.graphics.PointF[] r15, boolean r16, boolean r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r16)
            r12 = 1
            r0[r12] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
            r13 = 2
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f67314a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.graphics.PointF[]> r1 = android.graphics.PointF[].class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r3 = 0
            r4 = 77036(0x12cec, float:1.0795E-40)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0065
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r16)
            r0[r12] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f67314a
            r3 = 0
            r4 = 77036(0x12cec, float:1.0795E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.graphics.PointF[]> r1 = android.graphics.PointF[].class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0065:
            r0 = -1
            if (r8 != 0) goto L_0x0069
            return r0
        L_0x0069:
            android.graphics.RectF r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(r15)
            r7.f67317d = r1
            android.graphics.RectF r1 = r7.f67317d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0078
            return r0
        L_0x0078:
            android.graphics.RectF r1 = r7.f67317d
            int r2 = r7.f67316c
            float r2 = (float) r2
            r3 = 0
            r1.offset(r2, r3)
            r7.f67318e = r8
            android.graphics.RectF r1 = r7.f67315b
            if (r1 != 0) goto L_0x0088
            return r0
        L_0x0088:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r17 == 0) goto L_0x00a1
            android.graphics.RectF r2 = r7.f67317d
            float r2 = r2.left
            android.graphics.RectF r4 = r7.f67315b
            float r4 = r4.left
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a1
            r14.c(r12)
            goto L_0x00a4
        L_0x00a1:
            r14.c(r11)
        L_0x00a4:
            if (r17 == 0) goto L_0x00bb
            android.graphics.RectF r2 = r7.f67317d
            float r2 = r2.right
            android.graphics.RectF r4 = r7.f67315b
            float r4 = r4.right
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x00bb
            r14.b(r12)
            goto L_0x00be
        L_0x00bb:
            r14.b(r11)
        L_0x00be:
            if (r17 == 0) goto L_0x00d5
            android.graphics.RectF r2 = r7.f67317d
            float r2 = r2.bottom
            android.graphics.RectF r4 = r7.f67315b
            float r4 = r4.bottom
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d5
            r14.a((boolean) r12)
            goto L_0x00d8
        L_0x00d5:
            r14.a((boolean) r11)
        L_0x00d8:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.b r2 = r7.o
            if (r2 == 0) goto L_0x0151
            android.content.Context r2 = r14.getContext()
            boolean r2 = com.ss.android.ugc.aweme.utils.ey.a((android.content.Context) r2)
            if (r2 == 0) goto L_0x0108
            android.graphics.RectF r2 = r7.f67317d
            float r2 = r2.left
            android.graphics.RectF r4 = r7.f67315b
            float r4 = r4.left
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0106
            android.graphics.RectF r2 = r7.f67317d
            float r2 = r2.left
            android.graphics.RectF r4 = r7.f67315b
            float r4 = r4.left
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r2 = 0
            goto L_0x0126
        L_0x0106:
            r2 = 1
            goto L_0x0126
        L_0x0108:
            android.graphics.RectF r2 = r7.f67317d
            float r2 = r2.right
            android.graphics.RectF r4 = r7.f67315b
            float r4 = r4.right
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0106
            android.graphics.RectF r2 = r7.f67317d
            float r2 = r2.right
            android.graphics.RectF r4 = r7.f67315b
            float r4 = r4.right
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0104
            goto L_0x0106
        L_0x0126:
            android.graphics.RectF r4 = r7.f67317d
            float r4 = r4.bottom
            android.graphics.RectF r5 = r7.f67315b
            float r5 = r5.bottom
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0146
            android.graphics.RectF r4 = r7.f67317d
            float r4 = r4.bottom
            android.graphics.RectF r5 = r7.f67315b
            float r5 = r5.bottom
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            r4 = 0
            goto L_0x0147
        L_0x0146:
            r4 = 1
        L_0x0147:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.b r5 = r7.o
            r5.a((boolean) r2)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.b r2 = r7.o
            r2.b(r4)
        L_0x0151:
            r2 = 4
            if (r16 == 0) goto L_0x01d4
            r1 = r8[r12]
            float r1 = r1.x
            r4 = r8[r11]
            float r4 = r4.x
            float r1 = r1 - r4
            r4 = r8[r12]
            float r4 = r4.y
            r5 = r8[r11]
            float r5 = r5.y
            float r4 = r4 - r5
            float r4 = r4 / r1
            double r4 = (double) r4
            double r4 = java.lang.Math.atan(r4)
            r8 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r4 = r4 / r8
            r8 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r4 = r4 * r8
            float r1 = (float) r4
            int r1 = java.lang.Math.round(r1)
            float r4 = (float) r1
            float r3 = r4 - r3
            float r3 = java.lang.Math.abs(r3)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0190
            r14.f(r12)
            r0 = 4
            goto L_0x0193
        L_0x0190:
            r14.f(r11)
        L_0x0193:
            int r1 = java.lang.Math.abs(r1)
            float r1 = (float) r1
            r3 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x01a8
            r14.g(r12)
            r0 = 4
            goto L_0x01ab
        L_0x01a8:
            r14.g(r11)
        L_0x01ab:
            r1 = 1110704128(0x42340000, float:45.0)
            float r1 = r4 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x01bc
            r14.h(r12)
            r10 = 4
            goto L_0x01c0
        L_0x01bc:
            r14.h(r11)
            r10 = r0
        L_0x01c0:
            r0 = -1036779520(0xffffffffc2340000, float:-45.0)
            float r4 = r4 - r0
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x01d0
            r14.i(r12)
            r10 = 4
            goto L_0x0228
        L_0x01d0:
            r14.i(r11)
            goto L_0x0228
        L_0x01d4:
            android.graphics.RectF r2 = r7.f67317d
            float r2 = r2.bottom
            android.graphics.RectF r3 = r7.f67317d
            float r3 = r3.top
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 / r1
            android.graphics.RectF r3 = r7.f67317d
            float r3 = r3.top
            float r2 = r2 + r3
            int r3 = r14.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r1
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x01fb
            r14.d(r12)
            r0 = 3
            goto L_0x01fe
        L_0x01fb:
            r14.d(r11)
        L_0x01fe:
            android.graphics.RectF r2 = r7.f67317d
            float r2 = r2.right
            android.graphics.RectF r3 = r7.f67317d
            float r3 = r3.left
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 / r1
            android.graphics.RectF r3 = r7.f67317d
            float r3 = r3.left
            float r2 = r2 + r3
            int r3 = r14.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r1
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0224
            r14.e(r12)
            goto L_0x0228
        L_0x0224:
            r14.e(r11)
            r10 = r0
        L_0x0228:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a.a(android.graphics.PointF[], boolean, boolean):int");
    }

    public final PointF a(PointF[] pointFArr, float f2, float f3, boolean z) {
        if (PatchProxy.isSupport(new Object[]{pointFArr, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f67314a, false, 77032, new Class[]{PointF[].class, Float.TYPE, Float.TYPE, Boolean.TYPE}, PointF.class)) {
            return (PointF) PatchProxy.accessDispatch(new Object[]{pointFArr, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z)}, this, f67314a, false, 77032, new Class[]{PointF[].class, Float.TYPE, Float.TYPE, Boolean.TYPE}, PointF.class);
        } else if (pointFArr == null) {
            return new PointF(0.0f, 0.0f);
        } else {
            RectF a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(pointFArr);
            a2.offset((float) this.f67316c, 0.0f);
            PointF pointF = new PointF();
            pointF.x = f2;
            pointF.y = f3;
            if (Math.abs(((Math.abs(a2.bottom - a2.top) / 2.0f) + a2.top) - (((float) getHeight()) / 2.0f)) < 1.0f) {
                pointF.y = (((float) getHeight()) / 2.0f) - (((a2.bottom - a2.top) / 2.0f) + a2.top);
            }
            if (Math.abs(((Math.abs(a2.right - a2.left) / 2.0f) + a2.left) - (((float) getWidth()) / 2.0f)) < 1.0f) {
                pointF.x = (((float) getWidth()) / 2.0f) - (((a2.right - a2.left) / 2.0f) + a2.left);
            }
            return pointF;
        }
    }

    public static a a(Context context, int i2, int i3, int i4, int i5) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, null, f67314a, true, 77019, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, null, f67314a, true, 77019, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, a.class);
        }
        a aVar = new a(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fc.b(context), a(context));
        layoutParams.gravity = 1;
        aVar.setLayoutParams(layoutParams);
        aVar.setDeltaX(i4);
        aVar.setViewWidth(i2);
        aVar.setLayerType(1, null);
        return aVar;
    }
}
