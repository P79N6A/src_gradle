package com.ss.android.ugc.aweme.commerce.service.widgets;

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
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.commerce.service.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.taobao.android.dexposed.ClassUtils;

public class PriceView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38287a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f38288b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f38289c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f38290d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f38291e = new Paint();

    /* renamed from: f  reason: collision with root package name */
    private int f38292f = -364470;
    private String g;
    private boolean h = false;
    private String i;
    private String j;
    private float k;
    private float l = UIUtils.sp2px(getContext(), 20.0f);
    private float m;
    private float n = UIUtils.dip2Px(getContext(), 5.0f);
    private float o = UIUtils.sp2px(getContext(), 1.0f);
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private float t = 0.0f;
    private float u = 0.0f;

    public PriceView(Context context) {
        super(context);
        a(context, null);
    }

    public void setPriceBold(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38287a, false, 30083, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38287a, false, 30083, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.p = z;
        if (this.p) {
            this.f38289c.setTypeface(Typeface.DEFAULT_BOLD);
        }
        requestLayout();
        invalidate();
    }

    public void setPriceText(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38287a, false, 30080, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f38287a, false, 30080, new Class[]{String.class}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f38287a, false, 30082, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f38287a, false, 30082, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.l = f2;
        this.f38289c.setTextSize(f2);
        this.f38290d.setTextSize(0.8f * f2);
        requestLayout();
        invalidate();
    }

    public void setYangBold(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38287a, false, 30084, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38287a, false, 30084, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.q = z;
        if (this.q) {
            this.f38288b.setTypeface(Typeface.DEFAULT_BOLD);
        }
        requestLayout();
        invalidate();
    }

    public void setYangTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f38287a, false, 30081, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f38287a, false, 30081, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.k = f2;
        this.f38288b.setTextSize(f2);
        requestLayout();
        invalidate();
    }

    public void draw(Canvas canvas) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f38287a, false, 30077, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f38287a, false, 30077, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.draw(canvas);
        if (!TextUtils.isEmpty(this.g) || !TextUtils.isEmpty(this.i)) {
            float height = (float) getHeight();
            Paint.FontMetrics fontMetrics = this.f38288b.getFontMetrics();
            Paint.FontMetrics fontMetrics2 = this.f38289c.getFontMetrics();
            this.f38290d.getFontMetrics();
            if (this.k > this.l) {
                f2 = (((float) getPaddingTop()) + (((height + fontMetrics.descent) - fontMetrics.ascent) / 2.0f)) - fontMetrics.descent;
            } else {
                f2 = (((float) getPaddingTop()) + (((height + fontMetrics2.descent) - fontMetrics2.ascent) / 2.0f)) - fontMetrics2.descent;
            }
            float paddingLeft = (float) getPaddingLeft();
            if (!this.h && !TextUtils.isEmpty(this.g)) {
                canvas.drawText(this.g, (float) getPaddingLeft(), f2, this.f38288b);
                paddingLeft += this.t + this.n;
            }
            if (!TextUtils.isEmpty(this.i)) {
                canvas.drawText(this.i, paddingLeft, f2, this.f38289c);
                if (!TextUtils.isEmpty(this.j)) {
                    canvas.drawText(this.j, paddingLeft + this.f38289c.measureText(this.i), f2, this.f38290d);
                }
            }
            if (this.r) {
                this.f38291e.setColor(this.f38292f);
                this.f38291e.setStrokeWidth(this.o);
                canvas.drawLine(3.0f, ((float) getMeasuredHeight()) / 2.0f, (float) getMeasuredWidth(), ((float) getMeasuredHeight()) / 2.0f, this.f38291e);
            }
        }
    }

    private void a(AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f38287a, false, 30076, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f38287a, false, 30076, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.PriceView);
            this.i = obtainStyledAttributes.getString(3);
            this.f38292f = obtainStyledAttributes.getColor(4, -364470);
            this.l = obtainStyledAttributes.getDimension(5, this.l);
            this.m = obtainStyledAttributes.getDimension(2, this.m);
            this.k = obtainStyledAttributes.getDimension(9, 0.0f);
            this.h = obtainStyledAttributes.getBoolean(0, false);
            this.n = obtainStyledAttributes.getDimension(7, this.n);
            this.p = obtainStyledAttributes.getBoolean(1, this.p);
            this.r = obtainStyledAttributes.getBoolean(6, this.r);
            this.s = obtainStyledAttributes.getBoolean(8, false);
            obtainStyledAttributes.recycle();
            setPriceText(this.i);
        }
    }

    public PriceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f38287a, false, 30075, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f38287a, false, 30075, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        a(attributeSet);
        if (this.k == 0.0f) {
            this.k = this.l * 0.8f;
        }
        this.g = context.getString(C0906R.string.bqm);
        this.f38288b = new Paint();
        this.f38288b.setTextSize(this.k);
        this.f38288b.setColor(this.f38292f);
        this.f38288b.setAntiAlias(true);
        if (this.q) {
            this.f38288b.setTypeface(Typeface.DEFAULT_BOLD);
        }
        this.f38289c = new Paint();
        this.f38289c.setTextSize(this.l);
        this.f38289c.setColor(this.f38292f);
        this.f38289c.setAntiAlias(true);
        if (this.p) {
            this.f38289c.setTypeface(Typeface.DEFAULT_BOLD);
        }
        this.f38290d = new Paint();
        if (this.s) {
            if (this.m == 0.0f) {
                this.m = this.l * 0.8f;
            }
            this.f38290d.setTextSize(this.m);
        } else {
            this.f38290d.setTextSize(this.l);
        }
        this.f38290d.setColor(this.f38292f);
        this.f38290d.setAntiAlias(true);
        if (this.p) {
            this.f38290d.setTypeface(Typeface.DEFAULT_BOLD);
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
            com.meituan.robust.ChangeQuickRedirect r2 = f38287a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 30085(0x7585, float:4.2158E-41)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004d
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f38287a
            r3 = 0
            r4 = 30085(0x7585, float:4.2158E-41)
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
            com.meituan.robust.ChangeQuickRedirect r2 = f38287a
            r3 = 0
            r4 = 30087(0x7587, float:4.2161E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38287a
            r3 = 0
            r4 = 30087(0x7587, float:4.2161E-41)
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
            android.graphics.Paint r1 = r12.f38288b
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
            com.meituan.robust.ChangeQuickRedirect r2 = f38287a
            r3 = 0
            r4 = 30088(0x7588, float:4.2162E-41)
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
            com.meituan.robust.ChangeQuickRedirect r2 = f38287a
            r3 = 0
            r4 = 30088(0x7588, float:4.2162E-41)
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
            android.graphics.Paint r0 = r12.f38289c
            java.lang.String r3 = r12.i
            float r0 = r0.measureText(r3)
            java.lang.String r3 = r12.j
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x010d
            android.graphics.Paint r3 = r12.f38290d
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
            float r3 = r12.n
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
            com.meituan.robust.ChangeQuickRedirect r2 = f38287a
            r3 = 0
            r4 = 30089(0x7589, float:4.2164E-41)
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
            com.meituan.robust.ChangeQuickRedirect r2 = f38287a
            r3 = 0
            r4 = 30089(0x7589, float:4.2164E-41)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.widgets.PriceView.onMeasure(int, int):void");
    }

    public PriceView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }

    @RequiresApi(api = 21)
    public PriceView(Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f38287a, false, 30086, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f38287a, false, 30086, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
    }
}
