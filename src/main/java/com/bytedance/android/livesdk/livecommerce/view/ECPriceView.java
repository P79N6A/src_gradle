package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livecommerce.R$styleable;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.taobao.android.dexposed.ClassUtils;

public class ECPriceView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16271a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f16272b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f16273c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f16274d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f16275e = new Paint();

    /* renamed from: f  reason: collision with root package name */
    private int f16276f = -364470;
    private String g;
    private boolean h = false;
    private String i;
    private String j;
    private float k;
    private float l = UIUtils.sp2px(getContext(), 20.0f);
    private float m = UIUtils.dip2Px(getContext(), 5.0f);
    private float n = UIUtils.sp2px(getContext(), 1.0f);
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private float t = 0.0f;
    private float u = 0.0f;

    private static float a(float f2) {
        return (f2 * 2.0f) / 3.0f;
    }

    public ECPriceView(Context context) {
        super(context);
        a(context, null);
    }

    public void setPriceBold(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f16271a, false, 10820, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f16271a, false, 10820, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.o = z;
        this.p = z;
        if (this.o) {
            this.f16273c.setTypeface(Typeface.DEFAULT_BOLD);
        }
        if (this.p) {
            this.f16274d.setTypeface(Typeface.DEFAULT_BOLD);
        }
        requestLayout();
        invalidate();
    }

    public void setPriceText(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f16271a, false, 10817, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f16271a, false, 10817, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if (!this.s || !str.contains(ClassUtils.PACKAGE_SEPARATOR)) {
                this.i = str;
                this.j = null;
            } else {
                int indexOf = str.indexOf(ClassUtils.PACKAGE_SEPARATOR);
                this.i = str.substring(0, indexOf);
                this.j = str.substring(indexOf);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setPriceTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f16271a, false, 10819, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f16271a, false, 10819, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.l = f2;
        this.f16273c.setTextSize(f2);
        this.f16274d.setTextSize(a(f2));
        requestLayout();
        invalidate();
    }

    public void setYangBold(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f16271a, false, 10822, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f16271a, false, 10822, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.q = z;
        if (this.q) {
            this.f16272b.setTypeface(Typeface.DEFAULT_BOLD);
        }
        requestLayout();
        invalidate();
    }

    public void setYangTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f16271a, false, 10818, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f16271a, false, 10818, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.k = f2;
        this.f16272b.setTextSize(f2);
        requestLayout();
        invalidate();
    }

    public void draw(Canvas canvas) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f16271a, false, 10814, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f16271a, false, 10814, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.draw(canvas);
        if (!TextUtils.isEmpty(this.g) || !TextUtils.isEmpty(this.i)) {
            float height = (float) getHeight();
            Paint.FontMetrics fontMetrics = this.f16272b.getFontMetrics();
            Paint.FontMetrics fontMetrics2 = this.f16273c.getFontMetrics();
            this.f16274d.getFontMetrics();
            if (this.k > this.l) {
                f2 = (((float) getPaddingTop()) + (((height + fontMetrics.descent) - fontMetrics.ascent) / 2.0f)) - fontMetrics.descent;
            } else {
                f2 = (((float) getPaddingTop()) + (((height + fontMetrics2.descent) - fontMetrics2.ascent) / 2.0f)) - fontMetrics2.descent;
            }
            float paddingLeft = (float) getPaddingLeft();
            if (!this.h && !TextUtils.isEmpty(this.g)) {
                canvas.drawText(this.g, (float) getPaddingLeft(), f2, this.f16272b);
                paddingLeft += this.t + this.m;
            }
            if (!TextUtils.isEmpty(this.i)) {
                canvas.drawText(this.i, paddingLeft, f2, this.f16273c);
                if (!TextUtils.isEmpty(this.j)) {
                    canvas.drawText(this.j, paddingLeft + this.f16273c.measureText(this.i), f2, this.f16274d);
                }
            }
            if (this.r) {
                this.f16275e.setColor(this.f16276f);
                this.f16275e.setStrokeWidth(this.n);
                canvas.drawLine(3.0f, ((float) getMeasuredHeight()) / 2.0f, (float) getMeasuredWidth(), ((float) getMeasuredHeight()) / 2.0f, this.f16275e);
            }
        }
    }

    private void a(AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f16271a, false, 10813, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f16271a, false, 10813, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ECPriceView);
            this.i = obtainStyledAttributes.getString(2);
            this.f16276f = obtainStyledAttributes.getColor(3, -364470);
            this.l = obtainStyledAttributes.getDimension(4, this.l);
            this.k = obtainStyledAttributes.getDimension(8, 0.0f);
            this.h = obtainStyledAttributes.getBoolean(0, false);
            this.m = obtainStyledAttributes.getDimension(6, this.m);
            this.o = obtainStyledAttributes.getBoolean(1, false);
            this.p = this.o;
            this.r = obtainStyledAttributes.getBoolean(5, this.r);
            this.s = obtainStyledAttributes.getBoolean(7, false);
            obtainStyledAttributes.recycle();
            setPriceText(this.i);
        }
        if (a.a()) {
            this.f16276f = -45517;
        } else {
            this.f16276f = -3601131;
        }
    }

    public ECPriceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f16271a, false, 10812, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f16271a, false, 10812, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        a(attributeSet);
        if (this.k == 0.0f) {
            this.k = a(this.l);
        }
        this.g = context.getString(C0906R.string.a9n);
        this.f16272b = new Paint();
        this.f16272b.setTextSize(this.k);
        this.f16272b.setColor(this.f16276f);
        this.f16272b.setAntiAlias(true);
        if (this.q) {
            this.f16272b.setTypeface(Typeface.DEFAULT_BOLD);
        }
        this.f16273c = new Paint();
        this.f16273c.setTextSize(this.l);
        this.f16273c.setColor(this.f16276f);
        this.f16273c.setAntiAlias(true);
        if (this.o) {
            this.f16273c.setTypeface(Typeface.DEFAULT_BOLD);
        }
        this.f16274d = new Paint();
        if (this.s) {
            this.f16274d.setTextSize(a(this.l));
        } else {
            this.f16274d.setTextSize(this.l);
        }
        this.f16274d.setColor(this.f16276f);
        this.f16274d.setAntiAlias(true);
        if (this.p) {
            this.f16274d.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f16271a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 10823(0x2a47, float:1.5166E-41)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004d
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f16271a
            r3 = 0
            r4 = 10823(0x2a47, float:1.5166E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004d:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f16271a
            r3 = 0
            r4 = 10825(0x2a49, float:1.5169E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f16271a
            r3 = 0
            r4 = 10825(0x2a49, float:1.5169E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0097
        L_0x006f:
            java.lang.String r0 = r12.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0097
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Paint r1 = r12.f16272b
            java.lang.String r2 = r12.g
            java.lang.String r3 = r12.g
            int r3 = r3.length()
            r1.getTextBounds(r2, r8, r3, r0)
            int r1 = r0.width()
            float r1 = (float) r1
            r12.t = r1
            int r0 = r0.height()
            float r0 = (float) r0
            r12.u = r0
        L_0x0097:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f16271a
            r3 = 0
            r4 = 10826(0x2a4a, float:1.517E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r7 = 1056964608(0x3f000000, float:0.5)
            r10 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x00d9
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f16271a
            r3 = 0
            r4 = 10826(0x2a4a, float:1.517E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x00d7:
            r11 = r0
            goto L_0x012f
        L_0x00d9:
            int r0 = android.view.View.MeasureSpec.getMode(r13)
            int r1 = r12.getMinimumWidth()
            int r1 = getDefaultSize(r1, r13)
            if (r0 != r10) goto L_0x00e9
            r11 = r1
            goto L_0x012f
        L_0x00e9:
            java.lang.String r0 = r12.i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r0 != 0) goto L_0x010c
            android.graphics.Paint r0 = r12.f16273c
            java.lang.String r3 = r12.i
            float r0 = r0.measureText(r3)
            java.lang.String r3 = r12.j
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x010d
            android.graphics.Paint r3 = r12.f16274d
            java.lang.String r4 = r12.j
            float r3 = r3.measureText(r4)
            float r0 = r0 + r3
            goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            boolean r3 = r12.h
            if (r3 != 0) goto L_0x0116
            float r2 = r12.t
            float r3 = r12.m
            float r2 = r2 + r3
        L_0x0116:
            float r2 = r2 + r0
            int r0 = r12.getPaddingRight()
            float r0 = (float) r0
            float r2 = r2 + r0
            int r0 = r12.getPaddingLeft()
            float r0 = (float) r0
            float r2 = r2 + r0
            float r2 = r2 + r7
            if (r1 != 0) goto L_0x0128
            int r0 = (int) r2
            goto L_0x00d7
        L_0x0128:
            float r0 = (float) r1
            float r0 = java.lang.Math.min(r2, r0)
            int r0 = (int) r0
            goto L_0x00d7
        L_0x012f:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f16271a
            r3 = 0
            r4 = 10827(0x2a4b, float:1.5172E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x016c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f16271a
            r3 = 0
            r4 = 10827(0x2a4b, float:1.5172E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x019b
        L_0x016c:
            int r0 = android.view.View.MeasureSpec.getMode(r14)
            int r1 = r12.getMinimumHeight()
            int r1 = getDefaultSize(r1, r14)
            if (r0 != r10) goto L_0x017c
            r0 = r1
            goto L_0x019b
        L_0x017c:
            float r0 = r12.l
            int r2 = r12.getPaddingBottom()
            float r2 = (float) r2
            float r0 = r0 + r2
            int r2 = r12.getPaddingTop()
            float r2 = (float) r2
            float r0 = r0 + r2
            float r0 = r0 + r7
            if (r1 != 0) goto L_0x0192
            int r0 = java.lang.Math.round(r0)
            goto L_0x019b
        L_0x0192:
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            int r0 = java.lang.Math.round(r0)
        L_0x019b:
            r12.setMeasuredDimension(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livecommerce.view.ECPriceView.onMeasure(int, int):void");
    }

    public ECPriceView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }

    @RequiresApi(api = 21)
    public ECPriceView(Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f16271a, false, 10824, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f16271a, false, 10824, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
    }
}
