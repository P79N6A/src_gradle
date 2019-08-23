package com.ss.android.ugc.aweme.poi.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class BubbleLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60976a;

    /* renamed from: b  reason: collision with root package name */
    public static int f60977b;

    /* renamed from: c  reason: collision with root package name */
    public static int f60978c;

    /* renamed from: d  reason: collision with root package name */
    public static int f60979d;

    /* renamed from: e  reason: collision with root package name */
    public static float f60980e;

    /* renamed from: f  reason: collision with root package name */
    public static float f60981f;
    public static float g;
    public static int h;
    public static int i;
    private boolean A;
    private Paint j;
    private final Path k;
    private final Path l;
    private RectF m;
    private float n;
    private float o;
    private Path p;
    private RectF q;
    private int r;
    private Matrix s;
    private Bitmap t;
    private Canvas u;
    private int v;
    private int w;
    private float x;
    private int y;
    private boolean z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BubbleOrientation {
    }

    public final float getBubbleOffset() {
        if (PatchProxy.isSupport(new Object[0], this, f60976a, false, 66922, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f60976a, false, 66922, new Class[0], Float.TYPE)).floatValue();
        }
        float max = Math.max(this.x, g);
        float f2 = 0.0f;
        switch (this.y) {
            case 0:
                f2 = Math.min(max, this.n - g);
                break;
            case 1:
                f2 = Math.min(max, this.o - g);
                break;
            case 2:
                f2 = Math.min(max, this.o - g);
                break;
            case 3:
                f2 = Math.min(max, this.n - g);
                break;
        }
        return f2;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60976a, false, 66926, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60976a, false, 66926, new Class[0], Void.TYPE);
            return;
        }
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat.setDuration(100);
        ofFloat.start();
        ofFloat.addUpdateListener(a.f61051b);
    }

    public final void setBgColor(int i2) {
        this.v = i2;
    }

    public final void setBorderColor(int i2) {
        this.w = i2;
    }

    public final void setBubbleOrientation(int i2) {
        this.y = i2;
    }

    public final void setNeedPath(boolean z2) {
        this.z = z2;
    }

    public final void setNeedPressFade(boolean z2) {
        this.A = z2;
    }

    public BubbleLayout(Context context) {
        this(context, null);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, f60976a, false, 66919, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, f60976a, false, 66919, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f60976a, false, 66923, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f60976a, false, 66923, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (this.A) {
                        if (!PatchProxy.isSupport(new Object[0], this, f60976a, false, 66927, new Class[0], Void.TYPE)) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
                            ofFloat.setDuration(100);
                            ofFloat.start();
                            ofFloat.addUpdateListener(b.f61053b);
                            break;
                        } else {
                            PatchProxy.accessDispatch(new Object[0], this, f60976a, false, 66927, new Class[0], Void.TYPE);
                            break;
                        }
                    }
                    break;
                case 1:
                    if (this.A) {
                        a();
                        break;
                    }
                    break;
            }
        } else if (this.A) {
            a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00cc, code lost:
        r11 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x01ad, code lost:
        r7.m.left += (float) ((r7.r * 3) / 2);
        r7.m.top += (float) ((r7.r * 3) / 2);
        r7.m.right += (float) ((r7.r * 3) / 2);
        r7.m.bottom += (float) ((r7.r * 3) / 2);
        r7.q = new android.graphics.RectF();
        r7.q.left = r7.m.left - ((float) (r7.r / 2));
        r7.q.top = r7.m.top - ((float) (r7.r / 2));
        r7.q.right = r7.m.right + ((float) (r7.r / 2));
        r7.q.bottom = r7.m.bottom + ((float) (r7.r / 2));
        r2.postTranslate(r11 + ((float) ((r7.r * 3) / 2)), r12 + ((float) ((r7.r * 3) / 2)));
        r0 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r16) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f60976a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 66925(0x1056d, float:9.3782E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f60976a
            r3 = 0
            r4 = 66925(0x1056d, float:9.3782E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0035:
            android.graphics.Bitmap r0 = r7.t
            if (r0 != 0) goto L_0x0052
            int r0 = r15.getMeasuredWidth()
            int r1 = r15.getMeasuredHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r7.t = r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r1 = r7.t
            r0.<init>(r1)
            r7.u = r0
        L_0x0052:
            float r11 = r7.n
            float r12 = r7.o
            r13 = 2
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            r0[r10] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f60976a
            r3 = 0
            r4 = 66921(0x10569, float:9.3776E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r9] = r1
            java.lang.Class<android.graphics.Matrix> r6 = android.graphics.Matrix.class
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r14 = 0
            if (r0 == 0) goto L_0x00a8
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            r0[r10] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f60976a
            r3 = 0
            r4 = 66921(0x10569, float:9.3776E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r9] = r1
            java.lang.Class<android.graphics.Matrix> r6 = android.graphics.Matrix.class
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            goto L_0x022e
        L_0x00a8:
            float r0 = r7.x
            float r1 = g
            float r0 = java.lang.Math.max(r0, r1)
            float r1 = g
            float r1 = r12 - r1
            float r1 = java.lang.Math.min(r0, r1)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r7.s = r3
            int r3 = r7.y
            r4 = 17
            switch(r3) {
                case 0: goto L_0x0175;
                case 1: goto L_0x0146;
                case 2: goto L_0x010b;
                case 3: goto L_0x00cf;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            r12 = r1
        L_0x00cc:
            r11 = 0
            goto L_0x01ad
        L_0x00cf:
            float r1 = g
            float r11 = r11 - r1
            float r11 = java.lang.Math.min(r0, r11)
            r0 = 1132920832(0x43870000, float:270.0)
            r2.postRotate(r0)
            android.graphics.Matrix r1 = r7.s
            r1.postRotate(r0)
            android.graphics.Matrix r0 = r7.s
            int r1 = r7.r
            int r1 = r1 * 3
            int r1 = r1 / r13
            float r1 = (float) r1
            float r1 = r1 + r11
            int r3 = r7.r
            int r3 = r3 * 2
            float r3 = (float) r3
            float r3 = r3 + r12
            r0.postTranslate(r1, r3)
            int r0 = f60977b
            r15.setPadding(r10, r10, r10, r0)
            r15.setGravity(r4)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = r7.n
            float r3 = r7.o
            int r4 = f60977b
            float r4 = (float) r4
            float r3 = r3 - r4
            r0.<init>(r14, r14, r1, r3)
            r7.m = r0
            goto L_0x01ad
        L_0x010b:
            float r1 = g
            float r12 = r12 - r1
            float r12 = java.lang.Math.min(r0, r12)
            r0 = 1127481344(0x43340000, float:180.0)
            r2.postRotate(r0)
            android.graphics.Matrix r1 = r7.s
            r1.postRotate(r0)
            android.graphics.Matrix r0 = r7.s
            int r1 = r7.r
            int r1 = r1 * 2
            float r1 = (float) r1
            float r1 = r1 + r11
            int r3 = r7.r
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r3 = r3 + r12
            r0.postTranslate(r1, r3)
            int r0 = f60977b
            r15.setPadding(r10, r10, r0, r10)
            r15.setGravity(r4)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = r7.n
            int r3 = f60977b
            float r3 = (float) r3
            float r1 = r1 - r3
            float r3 = r7.o
            r0.<init>(r14, r14, r1, r3)
            r7.m = r0
            goto L_0x01ad
        L_0x0146:
            float r1 = g
            float r12 = r12 - r1
            float r12 = java.lang.Math.min(r0, r12)
            int r0 = f60977b
            r15.setPadding(r0, r10, r10, r10)
            r15.setGravity(r4)
            android.graphics.Matrix r0 = r7.s
            int r1 = r7.r
            float r1 = (float) r1
            float r1 = r1 + r14
            int r3 = r7.r
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r3 = r3 + r12
            r0.postTranslate(r1, r3)
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = f60977b
            float r1 = (float) r1
            float r3 = r7.n
            float r4 = r7.o
            r0.<init>(r1, r14, r3, r4)
            r7.m = r0
            goto L_0x00cc
        L_0x0175:
            float r1 = g
            float r11 = r11 - r1
            float r11 = java.lang.Math.min(r0, r11)
            r0 = 1119092736(0x42b40000, float:90.0)
            r2.postRotate(r0)
            android.graphics.Matrix r1 = r7.s
            r1.postRotate(r0)
            android.graphics.Matrix r0 = r7.s
            int r1 = r7.r
            int r1 = r1 * 3
            int r1 = r1 / r13
            float r1 = (float) r1
            float r1 = r1 + r11
            int r3 = r7.r
            float r3 = (float) r3
            float r3 = r3 + r14
            r0.postTranslate(r1, r3)
            int r0 = f60977b
            r15.setPadding(r10, r0, r10, r10)
            r15.setGravity(r4)
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = f60977b
            float r1 = (float) r1
            float r3 = r7.n
            float r4 = r7.o
            r0.<init>(r14, r1, r3, r4)
            r7.m = r0
            r12 = 0
        L_0x01ad:
            android.graphics.RectF r0 = r7.m
            float r1 = r0.left
            int r3 = r7.r
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.left = r1
            android.graphics.RectF r0 = r7.m
            float r1 = r0.top
            int r3 = r7.r
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.top = r1
            android.graphics.RectF r0 = r7.m
            float r1 = r0.right
            int r3 = r7.r
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.right = r1
            android.graphics.RectF r0 = r7.m
            float r1 = r0.bottom
            int r3 = r7.r
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.bottom = r1
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r7.q = r0
            android.graphics.RectF r0 = r7.q
            android.graphics.RectF r1 = r7.m
            float r1 = r1.left
            int r3 = r7.r
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 - r3
            r0.left = r1
            android.graphics.RectF r0 = r7.q
            android.graphics.RectF r1 = r7.m
            float r1 = r1.top
            int r3 = r7.r
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 - r3
            r0.top = r1
            android.graphics.RectF r0 = r7.q
            android.graphics.RectF r1 = r7.m
            float r1 = r1.right
            int r3 = r7.r
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.right = r1
            android.graphics.RectF r0 = r7.q
            android.graphics.RectF r1 = r7.m
            float r1 = r1.bottom
            int r3 = r7.r
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.bottom = r1
            int r0 = r7.r
            int r0 = r0 * 3
            int r0 = r0 / r13
            float r0 = (float) r0
            float r11 = r11 + r0
            int r0 = r7.r
            int r0 = r0 * 3
            int r0 = r0 / r13
            float r0 = (float) r0
            float r12 = r12 + r0
            r2.postTranslate(r11, r12)
            r0 = r2
        L_0x022e:
            android.graphics.Paint r1 = r7.j
            int r2 = r7.w
            r1.setColor(r2)
            android.graphics.Paint r1 = r7.j
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r7.j
            int r2 = r7.r
            float r2 = (float) r2
            r1.setStrokeWidth(r2)
            boolean r1 = r7.z
            if (r1 == 0) goto L_0x0276
            android.graphics.Path r1 = r7.k
            r1.reset()
            android.graphics.Path r1 = r7.k
            android.graphics.RectF r2 = r7.q
            float r3 = f60981f
            int r4 = r7.r
            int r4 = r4 / r13
            float r4 = (float) r4
            float r3 = r3 + r4
            float r4 = f60981f
            int r5 = r7.r
            int r5 = r5 / r13
            float r5 = (float) r5
            float r4 = r4 + r5
            android.graphics.Path$Direction r5 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r2, r3, r4, r5)
            android.graphics.Path r1 = r7.k
            android.graphics.Path r2 = r7.p
            android.graphics.Matrix r3 = r7.s
            r1.addPath(r2, r3)
            android.graphics.Canvas r1 = r7.u
            android.graphics.Path r2 = r7.k
            android.graphics.Paint r3 = r7.j
            r1.drawPath(r2, r3)
        L_0x0276:
            android.graphics.Paint r1 = r7.j
            android.graphics.PorterDuffXfermode r2 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC
            r2.<init>(r3)
            r1.setXfermode(r2)
            android.graphics.Paint r1 = r7.j
            int r2 = r7.v
            r1.setColor(r2)
            android.graphics.Paint r1 = r7.j
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Path r1 = r7.k
            r1.reset()
            android.graphics.Path r1 = r7.k
            android.graphics.RectF r2 = r7.m
            float r3 = f60981f
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r2, r3, r3, r4)
            android.graphics.Path r1 = r7.k
            android.graphics.Path r2 = r7.l
            r1.addPath(r2, r0)
            android.graphics.Canvas r0 = r7.u
            android.graphics.Path r1 = r7.k
            android.graphics.Paint r2 = r7.j
            r0.drawPath(r1, r2)
            android.graphics.Paint r0 = r7.j
            r1 = 0
            r0.setXfermode(r1)
            android.graphics.Bitmap r0 = r7.t
            r8.drawBitmap(r0, r14, r14, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.widget.BubbleLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void a(int i2, float f2) {
        this.x = f2;
        this.y = i2;
    }

    private BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private static float a(Context context, float f2) {
        if (!PatchProxy.isSupport(new Object[]{context, Float.valueOf(f2)}, null, f60976a, true, 66917, new Class[]{Context.class, Float.TYPE}, Float.TYPE)) {
            return (context.getResources().getDisplayMetrics().density * f2) + 0.5f;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{context, Float.valueOf(f2)}, null, f60976a, true, 66917, new Class[]{Context.class, Float.TYPE}, Float.TYPE)).floatValue();
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60976a, false, 66924, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60976a, false, 66924, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        TextView textView = null;
        if (getChildAt(0) instanceof TextView) {
            textView = (TextView) getChildAt(0);
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (textView != null) {
            i4 = ((int) textView.getPaint().measureText(textView.getText().toString())) + textView.getPaddingLeft() + textView.getPaddingRight();
        } else {
            i4 = getMeasuredWidth();
        }
        if (this.y == 2 || this.y == 1) {
            if (i4 > h) {
                i6 = i4 + (f60978c * 2);
            } else {
                i6 = h;
            }
            i5 = i6 + f60977b;
        } else if (i4 > h) {
            i5 = i4 + (f60978c * 2);
        } else {
            i5 = h;
        }
        int i7 = i;
        int i8 = i5 + (this.r * 3);
        int i9 = i7 + (this.r * 3);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(i8, i9);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(i8, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, i9);
        }
        this.n = (float) (getMeasuredWidth() - (this.r * 3));
        this.o = (float) (getMeasuredHeight() - (this.r * 3));
    }

    private BubbleLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        this.k = new Path();
        this.l = new Path();
        this.p = new Path();
        this.x = 0.75f;
        this.y = 1;
        this.z = true;
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f60976a, false, 66918, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f60976a, false, 66918, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        this.r = (int) a(context, 0.5f);
        f60977b = (int) a(context, 7.0f);
        f60978c = (int) a(context, 10.0f);
        f60979d = (int) a(context, 6.0f);
        f60980e = 2.0f;
        f60981f = a(context, 6.0f);
        g = (float) (f60977b + f60979d);
        h = (int) a(context, 50.0f);
        i = (int) a(context, 46.0f);
        this.j = new Paint();
        this.j.setStyle(Paint.Style.FILL);
        this.j.setStrokeCap(Paint.Cap.BUTT);
        this.j.setAntiAlias(true);
        this.j.setStrokeWidth(f60980e);
        this.j.setStrokeJoin(Paint.Join.MITER);
        this.v = context.getResources().getColor(C0906R.color.a2r);
        this.w = Color.parseColor("#1DFFFFFF");
        this.j.setColor(this.v);
        setLayerType(1, this.j);
        if (PatchProxy.isSupport(new Object[0], this, f60976a, false, 66920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60976a, false, 66920, new Class[0], Void.TYPE);
        } else {
            this.l.moveTo(0.0f, 0.0f);
            this.l.lineTo((float) f60977b, (float) (-f60977b));
            this.l.lineTo((float) f60977b, (float) f60977b);
            this.l.close();
            this.p.moveTo(0.0f, 0.0f);
            Path path = this.p;
            double d2 = (double) f60977b;
            double d3 = (double) this.r;
            double sqrt = Math.sqrt(2.0d);
            Double.isNaN(d3);
            Double.isNaN(d2);
            float f2 = (float) (d2 + (d3 * sqrt));
            double d4 = (double) (-f60977b);
            double d5 = (double) this.r;
            double sqrt2 = Math.sqrt(2.0d);
            Double.isNaN(d5);
            Double.isNaN(d4);
            path.lineTo(f2, (float) (d4 - (d5 * sqrt2)));
            Path path2 = this.p;
            double d6 = (double) f60977b;
            double d7 = (double) this.r;
            double sqrt3 = Math.sqrt(2.0d);
            Double.isNaN(d7);
            Double.isNaN(d6);
            float f3 = (float) (d6 + (d7 * sqrt3));
            double d8 = (double) f60977b;
            double d9 = (double) this.r;
            double sqrt4 = Math.sqrt(2.0d);
            Double.isNaN(d9);
            Double.isNaN(d8);
            path2.lineTo(f3, (float) (d8 + (d9 * sqrt4)));
            this.p.close();
        }
        setBackgroundColor(0);
        setClipChildren(false);
    }
}
