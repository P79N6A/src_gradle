package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.R$styleable;

public class WaveSideBar extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32600a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f32601b = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    /* renamed from: c  reason: collision with root package name */
    private String[] f32602c;

    /* renamed from: d  reason: collision with root package name */
    private int f32603d;

    /* renamed from: e  reason: collision with root package name */
    private float f32604e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f32605f;
    private int g;
    private float h;
    private float i;
    private float j;
    private RectF k;
    private float l;
    private float m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private a r;
    private float s;
    private DisplayMetrics t;

    public interface a {
        void a(String str);
    }

    public String[] getDefaultIndexItems() {
        return f32601b;
    }

    public void setLazyRespond(boolean z) {
        this.o = z;
    }

    public void setOnSelectIndexItemListener(a aVar) {
        this.r = aVar;
    }

    public WaveSideBar(Context context) {
        this(context, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setIndexItems(java.lang.String... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f32600a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 20799(0x513f, float:2.9146E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f32600a
            r13 = 0
            r14 = 20799(0x513f, float:2.9146E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1 = r17
            r1.f32602c = r0
            r17.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.WaveSideBar.setIndexItems(java.lang.String[]):void");
    }

    public void setMaxOffset(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f32600a, false, 20802, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f32600a, false, 20802, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j = (float) i2;
        invalidate();
    }

    public void setPosition(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f32600a, false, 20801, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f32600a, false, 20801, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i3 == 0 || i3 == 1) {
            this.p = i3;
            requestLayout();
        } else {
            throw new IllegalArgumentException("the position must be POSITION_RIGHT or POSITION_LEFT");
        }
    }

    public void setTextAlign(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f32600a, false, 20803, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f32600a, false, 20803, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.q != i2) {
            switch (i2) {
                case 0:
                    this.f32605f.setTextAlign(Paint.Align.CENTER);
                    break;
                case 1:
                    this.f32605f.setTextAlign(Paint.Align.LEFT);
                    break;
                case 2:
                    this.f32605f.setTextAlign(Paint.Align.RIGHT);
                    break;
                default:
                    throw new IllegalArgumentException("the alignment must be TEXT_ALIGN_CENTER, TEXT_ALIGN_LEFT or TEXT_ALIGN_RIGHT");
            }
            this.q = i2;
            invalidate();
        }
    }

    public void setTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f32600a, false, 20800, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f32600a, false, 20800, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i2;
        this.f32605f.setColor(i2);
        invalidate();
    }

    public void setTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f32600a, false, 20804, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f32600a, false, 20804, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.h != f2) {
            this.h = f2;
            this.f32605f.setTextSize(f2);
            invalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        char c2 = 0;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f32600a, false, 20793, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f32600a, false, 20793, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        int length = this.f32602c.length;
        int i2 = 0;
        while (true) {
            int i3 = 255;
            if (i2 < length) {
                float f4 = (float) i2;
                float f5 = this.s + (this.i * f4);
                Object[] objArr = new Object[1];
                objArr[c2] = Integer.valueOf(i2);
                ChangeQuickRedirect changeQuickRedirect = f32600a;
                Class[] clsArr = new Class[1];
                clsArr[c2] = Integer.TYPE;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, 20794, clsArr, Float.TYPE)) {
                    Object[] objArr2 = new Object[1];
                    objArr2[c2] = Integer.valueOf(i2);
                    ChangeQuickRedirect changeQuickRedirect2 = f32600a;
                    Class[] clsArr2 = new Class[1];
                    clsArr2[c2] = Integer.TYPE;
                    f2 = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, 20794, clsArr2, Float.TYPE)).floatValue();
                } else if (this.f32603d != -1) {
                    float abs = Math.abs(this.f32604e - ((this.i * f4) + (this.i / 2.0f))) / this.i;
                    f2 = Math.max(1.0f - ((abs * abs) / 16.0f), 0.0f);
                } else {
                    f2 = 0.0f;
                }
                if (i2 != this.f32603d) {
                    i3 = (int) (255.0f * (1.0f - f2));
                }
                this.f32605f.setAlpha(i3);
                this.f32605f.setTextSize(this.h + (this.h * f2));
                if (this.p == 1) {
                    switch (this.q) {
                        case 0:
                            f3 = ((float) getPaddingLeft()) + (this.m / 2.0f) + (this.j * f2);
                            continue;
                        case 1:
                            f3 = ((float) getPaddingLeft()) + (this.j * f2);
                            continue;
                        case 2:
                            f3 = ((float) getPaddingLeft()) + this.m + (this.j * f2);
                            continue;
                    }
                } else {
                    switch (this.q) {
                        case 0:
                            f3 = (((float) (getWidth() - getPaddingRight())) - (this.m / 2.0f)) - (this.j * f2);
                            continue;
                        case 1:
                            f3 = (((float) (getWidth() - getPaddingRight())) - this.m) - (this.j * f2);
                            continue;
                        case 2:
                            f3 = ((float) (getWidth() - getPaddingRight())) - (this.j * f2);
                            continue;
                    }
                }
                f3 = 0.0f;
                canvas2.drawText(this.f32602c[i2], f3, f5, this.f32605f);
                i2++;
                c2 = 0;
            } else {
                this.f32605f.setAlpha(255);
                this.f32605f.setTextSize(this.h);
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f32600a, false, 20795, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f32600a, false, 20795, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f32602c.length == 0) {
            return super.onTouchEvent(motionEvent);
        } else {
            float y = motionEvent.getY();
            float x = motionEvent.getX();
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(y)}, this, f32600a, false, 20796, new Class[]{Float.TYPE}, Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(y)}, this, f32600a, false, 20796, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
            } else {
                this.f32604e = y - (((float) (getHeight() / 2)) - (this.l / 2.0f));
                if (this.f32604e <= 0.0f) {
                    i2 = 0;
                } else {
                    i2 = (int) (this.f32604e / this.i);
                    if (i2 >= this.f32602c.length) {
                        i2 = this.f32602c.length - 1;
                    }
                }
            }
            this.f32603d = i2;
            switch (motionEvent.getAction()) {
                case 0:
                    if (this.k.contains(x, y)) {
                        this.n = true;
                        if (!this.o && this.r != null) {
                            this.r.a(this.f32602c[this.f32603d]);
                        }
                        invalidate();
                        return true;
                    }
                    this.f32603d = -1;
                    return false;
                case 1:
                case 3:
                    if (this.o && this.r != null) {
                        this.r.a(this.f32602c[this.f32603d]);
                    }
                    this.f32603d = -1;
                    this.n = false;
                    invalidate();
                    return true;
                case 2:
                    if (this.n && !this.o && this.r != null) {
                        this.r.a(this.f32602c[this.f32603d]);
                    }
                    invalidate();
                    return true;
                default:
                    return super.onTouchEvent(motionEvent);
            }
        }
    }

    public WaveSideBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f32600a, false, 20792, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f32600a, false, 20792, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        Paint.FontMetrics fontMetrics = this.f32605f.getFontMetrics();
        this.i = fontMetrics.bottom - fontMetrics.top;
        this.l = ((float) this.f32602c.length) * this.i;
        for (String measureText : this.f32602c) {
            this.m = Math.max(this.m, this.f32605f.measureText(measureText));
        }
        if (this.p == 1) {
            f2 = 0.0f;
        } else {
            f2 = (((float) size2) - this.m) - ((float) getPaddingRight());
        }
        if (this.p == 1) {
            f3 = ((float) getPaddingLeft()) + f2 + this.m;
        } else {
            f3 = (float) size2;
        }
        float f4 = (float) (size / 2);
        float f5 = f4 - (this.l / 2.0f);
        this.k.set(f2, f5, f3, this.l + f5);
        this.s = ((f4 - ((((float) this.f32602c.length) * this.i) / 2.0f)) + ((this.i / 2.0f) - ((fontMetrics.descent - fontMetrics.ascent) / 2.0f))) - fontMetrics.ascent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaveSideBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float f2;
        float f3;
        this.f32603d = -1;
        this.f32604e = -1.0f;
        this.k = new RectF();
        this.n = false;
        this.o = false;
        this.t = context.getResources().getDisplayMetrics();
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WaveSideBar);
        this.o = obtainStyledAttributes.getBoolean(0, false);
        this.g = obtainStyledAttributes.getColor(4, -7829368);
        if (PatchProxy.isSupport(new Object[]{14}, this, f32600a, false, 20798, new Class[]{Integer.TYPE}, Float.TYPE)) {
            f2 = ((Float) PatchProxy.accessDispatch(new Object[]{14}, this, f32600a, false, 20798, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        } else {
            f2 = TypedValue.applyDimension(2, 14.0f, this.t);
        }
        this.h = obtainStyledAttributes.getDimension(5, f2);
        if (PatchProxy.isSupport(new Object[]{80}, this, f32600a, false, 20797, new Class[]{Integer.TYPE}, Float.TYPE)) {
            f3 = ((Float) PatchProxy.accessDispatch(new Object[]{80}, this, f32600a, false, 20797, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        } else {
            f3 = TypedValue.applyDimension(1, 80.0f, this.t);
        }
        this.j = obtainStyledAttributes.getDimension(1, f3);
        this.p = obtainStyledAttributes.getInt(2, 0);
        this.q = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        this.f32602c = getDefaultIndexItems();
        if (PatchProxy.isSupport(new Object[0], this, f32600a, false, 20791, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32600a, false, 20791, new Class[0], Void.TYPE);
            return;
        }
        this.f32605f = new Paint();
        this.f32605f.setAntiAlias(true);
        this.f32605f.setColor(this.g);
        this.f32605f.setTextSize(this.h);
        this.f32605f.setTypeface(b.a().a(c.g));
        switch (this.q) {
            case 0:
                this.f32605f.setTextAlign(Paint.Align.CENTER);
                return;
            case 1:
                this.f32605f.setTextAlign(Paint.Align.LEFT);
                return;
            case 2:
                this.f32605f.setTextAlign(Paint.Align.RIGHT);
                break;
        }
    }
}