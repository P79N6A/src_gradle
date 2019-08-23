package com.ss.android.ugc.aweme.commerce.live;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class LiveBubbleLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36955a;

    /* renamed from: b  reason: collision with root package name */
    public static int f36956b;

    /* renamed from: c  reason: collision with root package name */
    public static float f36957c;

    /* renamed from: d  reason: collision with root package name */
    public static float f36958d;

    /* renamed from: e  reason: collision with root package name */
    public static int f36959e;

    /* renamed from: f  reason: collision with root package name */
    public static int f36960f;
    private Paint g;
    private final Path h;
    private final Path i;
    private RectF j;
    private float k;
    private float l;
    private Path m;
    private RectF n;
    private int o;
    private Matrix p;
    private Bitmap q;
    private Canvas r;
    private int s;
    private int t;
    private float u;
    private int v;
    private PorterDuffXfermode w;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BubbleOrientation {
    }

    public final float getBubbleOffset() {
        if (PatchProxy.isSupport(new Object[0], this, f36955a, false, 28252, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f36955a, false, 28252, new Class[0], Float.TYPE)).floatValue();
        }
        float max = Math.max(this.u, f36958d);
        float f2 = 0.0f;
        switch (this.v) {
            case 0:
                f2 = Math.min(max, this.k - f36958d);
                break;
            case 1:
                f2 = Math.min(max, this.l - f36958d);
                break;
            case 2:
                f2 = Math.min(max, this.l - f36958d);
                break;
            case 3:
                f2 = Math.min(max, this.k - f36958d);
                break;
        }
        return f2;
    }

    public final void setBubbleOrientation(int i2) {
        this.v = i2;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, f36955a, false, 28249, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, f36955a, false, 28249, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c8, code lost:
        r11 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x01a9, code lost:
        r7.j.left += (float) ((r7.o * 3) / 2);
        r7.j.top += (float) ((r7.o * 3) / 2);
        r7.j.right += (float) ((r7.o * 3) / 2);
        r7.j.bottom += (float) ((r7.o * 3) / 2);
        r7.n = new android.graphics.RectF();
        r7.n.left = r7.j.left - ((float) (r7.o / 2));
        r7.n.top = r7.j.top - ((float) (r7.o / 2));
        r7.n.right = r7.j.right + ((float) (r7.o / 2));
        r7.n.bottom = r7.j.bottom + ((float) (r7.o / 2));
        r2.postTranslate(r11 + ((float) ((r7.o * 3) / 2)), r12 + ((float) ((r7.o * 3) / 2)));
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
            com.meituan.robust.ChangeQuickRedirect r2 = f36955a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28254(0x6e5e, float:3.9592E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f36955a
            r3 = 0
            r4 = 28254(0x6e5e, float:3.9592E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            android.graphics.Bitmap r0 = r7.q
            if (r0 != 0) goto L_0x0050
            int r0 = r15.getMeasuredWidth()
            int r1 = r15.getMeasuredHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r7.q = r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r1 = r7.q
            r0.<init>(r1)
            r7.r = r0
        L_0x0050:
            float r11 = r7.k
            float r12 = r7.l
            r13 = 2
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            r0[r10] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f36955a
            r3 = 0
            r4 = 28251(0x6e5b, float:3.9588E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r9] = r1
            java.lang.Class<android.graphics.Matrix> r6 = android.graphics.Matrix.class
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r14 = 0
            if (r0 == 0) goto L_0x00a4
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            r0[r10] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f36955a
            r3 = 0
            r4 = 28251(0x6e5b, float:3.9588E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r9] = r1
            java.lang.Class<android.graphics.Matrix> r6 = android.graphics.Matrix.class
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            goto L_0x022a
        L_0x00a4:
            float r0 = r7.u
            float r1 = f36958d
            float r0 = java.lang.Math.max(r0, r1)
            float r1 = f36958d
            float r1 = r12 - r1
            float r1 = java.lang.Math.min(r0, r1)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r7.p = r3
            int r3 = r7.v
            r4 = 17
            switch(r3) {
                case 0: goto L_0x0171;
                case 1: goto L_0x0142;
                case 2: goto L_0x0107;
                case 3: goto L_0x00cb;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            r12 = r1
        L_0x00c8:
            r11 = 0
            goto L_0x01a9
        L_0x00cb:
            float r1 = f36958d
            float r11 = r11 - r1
            float r11 = java.lang.Math.min(r0, r11)
            r0 = 1132920832(0x43870000, float:270.0)
            r2.postRotate(r0)
            android.graphics.Matrix r1 = r7.p
            r1.postRotate(r0)
            android.graphics.Matrix r0 = r7.p
            int r1 = r7.o
            int r1 = r1 * 3
            int r1 = r1 / r13
            float r1 = (float) r1
            float r1 = r1 + r11
            int r3 = r7.o
            int r3 = r3 * 2
            float r3 = (float) r3
            float r3 = r3 + r12
            r0.postTranslate(r1, r3)
            int r0 = f36956b
            r15.setPadding(r10, r10, r10, r0)
            r15.setGravity(r4)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = r7.k
            float r3 = r7.l
            int r4 = f36956b
            float r4 = (float) r4
            float r3 = r3 - r4
            r0.<init>(r14, r14, r1, r3)
            r7.j = r0
            goto L_0x01a9
        L_0x0107:
            float r1 = f36958d
            float r12 = r12 - r1
            float r12 = java.lang.Math.min(r0, r12)
            r0 = 1127481344(0x43340000, float:180.0)
            r2.postRotate(r0)
            android.graphics.Matrix r1 = r7.p
            r1.postRotate(r0)
            android.graphics.Matrix r0 = r7.p
            int r1 = r7.o
            int r1 = r1 * 2
            float r1 = (float) r1
            float r1 = r1 + r11
            int r3 = r7.o
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r3 = r3 + r12
            r0.postTranslate(r1, r3)
            int r0 = f36956b
            r15.setPadding(r10, r10, r0, r10)
            r15.setGravity(r4)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = r7.k
            int r3 = f36956b
            float r3 = (float) r3
            float r1 = r1 - r3
            float r3 = r7.l
            r0.<init>(r14, r14, r1, r3)
            r7.j = r0
            goto L_0x01a9
        L_0x0142:
            float r1 = f36958d
            float r12 = r12 - r1
            float r12 = java.lang.Math.min(r0, r12)
            int r0 = f36956b
            r15.setPadding(r0, r10, r10, r10)
            r15.setGravity(r4)
            android.graphics.Matrix r0 = r7.p
            int r1 = r7.o
            float r1 = (float) r1
            float r1 = r1 + r14
            int r3 = r7.o
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r3 = r3 + r12
            r0.postTranslate(r1, r3)
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = f36956b
            float r1 = (float) r1
            float r3 = r7.k
            float r4 = r7.l
            r0.<init>(r1, r14, r3, r4)
            r7.j = r0
            goto L_0x00c8
        L_0x0171:
            float r1 = f36958d
            float r11 = r11 - r1
            float r11 = java.lang.Math.min(r0, r11)
            r0 = 1119092736(0x42b40000, float:90.0)
            r2.postRotate(r0)
            android.graphics.Matrix r1 = r7.p
            r1.postRotate(r0)
            android.graphics.Matrix r0 = r7.p
            int r1 = r7.o
            int r1 = r1 * 3
            int r1 = r1 / r13
            float r1 = (float) r1
            float r1 = r1 + r11
            int r3 = r7.o
            float r3 = (float) r3
            float r3 = r3 + r14
            r0.postTranslate(r1, r3)
            int r0 = f36956b
            r15.setPadding(r10, r0, r10, r10)
            r15.setGravity(r4)
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = f36956b
            float r1 = (float) r1
            float r3 = r7.k
            float r4 = r7.l
            r0.<init>(r14, r1, r3, r4)
            r7.j = r0
            r12 = 0
        L_0x01a9:
            android.graphics.RectF r0 = r7.j
            float r1 = r0.left
            int r3 = r7.o
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.left = r1
            android.graphics.RectF r0 = r7.j
            float r1 = r0.top
            int r3 = r7.o
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.top = r1
            android.graphics.RectF r0 = r7.j
            float r1 = r0.right
            int r3 = r7.o
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.right = r1
            android.graphics.RectF r0 = r7.j
            float r1 = r0.bottom
            int r3 = r7.o
            int r3 = r3 * 3
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.bottom = r1
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r7.n = r0
            android.graphics.RectF r0 = r7.n
            android.graphics.RectF r1 = r7.j
            float r1 = r1.left
            int r3 = r7.o
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 - r3
            r0.left = r1
            android.graphics.RectF r0 = r7.n
            android.graphics.RectF r1 = r7.j
            float r1 = r1.top
            int r3 = r7.o
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 - r3
            r0.top = r1
            android.graphics.RectF r0 = r7.n
            android.graphics.RectF r1 = r7.j
            float r1 = r1.right
            int r3 = r7.o
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.right = r1
            android.graphics.RectF r0 = r7.n
            android.graphics.RectF r1 = r7.j
            float r1 = r1.bottom
            int r3 = r7.o
            int r3 = r3 / r13
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.bottom = r1
            int r0 = r7.o
            int r0 = r0 * 3
            int r0 = r0 / r13
            float r0 = (float) r0
            float r11 = r11 + r0
            int r0 = r7.o
            int r0 = r0 * 3
            int r0 = r0 / r13
            float r0 = (float) r0
            float r12 = r12 + r0
            r2.postTranslate(r11, r12)
            r0 = r2
        L_0x022a:
            android.graphics.Paint r1 = r7.g
            int r2 = r7.t
            r1.setColor(r2)
            android.graphics.Paint r1 = r7.g
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r7.g
            int r2 = r7.o
            float r2 = (float) r2
            r1.setStrokeWidth(r2)
            android.graphics.Path r1 = r7.h
            r1.reset()
            android.graphics.Path r1 = r7.h
            android.graphics.RectF r2 = r7.n
            float r3 = f36957c
            int r4 = r7.o
            int r4 = r4 / r13
            float r4 = (float) r4
            float r3 = r3 + r4
            float r4 = f36957c
            int r5 = r7.o
            int r5 = r5 / r13
            float r5 = (float) r5
            float r4 = r4 + r5
            android.graphics.Path$Direction r5 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r2, r3, r4, r5)
            android.graphics.Path r1 = r7.h
            android.graphics.Path r2 = r7.m
            android.graphics.Matrix r3 = r7.p
            r1.addPath(r2, r3)
            android.graphics.Canvas r1 = r7.r
            android.graphics.Path r2 = r7.h
            android.graphics.Paint r3 = r7.g
            r1.drawPath(r2, r3)
            android.graphics.Paint r1 = r7.g
            android.graphics.PorterDuffXfermode r2 = r7.w
            r1.setXfermode(r2)
            android.graphics.Paint r1 = r7.g
            int r2 = r7.s
            r1.setColor(r2)
            android.graphics.Paint r1 = r7.g
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Path r1 = r7.h
            r1.reset()
            android.graphics.Path r1 = r7.h
            android.graphics.RectF r2 = r7.j
            float r3 = f36957c
            r4 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 * r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r5
            float r6 = f36957c
            float r6 = r6 * r4
            float r6 = r6 / r5
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r2, r3, r6, r4)
            android.graphics.Path r1 = r7.h
            android.graphics.Path r2 = r7.i
            r1.addPath(r2, r0)
            android.graphics.Canvas r0 = r7.r
            android.graphics.Path r1 = r7.h
            android.graphics.Paint r2 = r7.g
            r0.drawPath(r1, r2)
            android.graphics.Paint r0 = r7.g
            r1 = 0
            r0.setXfermode(r1)
            android.graphics.Bitmap r0 = r7.q
            r8.drawBitmap(r0, r14, r14, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.live.LiveBubbleLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36955a, false, 28253, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36955a, false, 28253, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i4 = f36959e + (this.o * 3);
        int i5 = f36960f + (this.o * 3);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(i4, i5);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(i4, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, i5);
        }
        this.k = (float) (getMeasuredWidth() - (this.o * 3));
        this.l = (float) (getMeasuredHeight() - (this.o * 3));
    }
}
