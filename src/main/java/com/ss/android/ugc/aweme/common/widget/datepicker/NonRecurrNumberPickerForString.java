package com.ss.android.ugc.aweme.common.widget.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker;
import java.util.List;

public class NonRecurrNumberPickerForString extends NumberPicker {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40542a;

    public final void b() {
        this.k = new NumberPicker.a[(this.z.length + 2)];
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40542a, false, 33899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40542a, false, 33899, new Class[0], Void.TYPE);
            return;
        }
        this.k[0] = new NumberPicker.a(-1, this.l);
        for (int i = 1; i < this.k.length - 1; i++) {
            NumberPicker.a aVar = new NumberPicker.a(i - 1, this.l + (this.K * i));
            aVar.f40549a = (aVar.f40549a + this.z.length) % this.z.length;
            this.k[i] = aVar;
        }
        this.k[this.k.length - 1] = new NumberPicker.a(-1, this.m);
    }

    public NonRecurrNumberPickerForString(Context context) {
        super(context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(java.lang.String[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f40542a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r5 = 0
            r6 = 33902(0x846e, float:4.7507E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f40542a
            r13 = 0
            r14 = 33902(0x846e, float:4.7507E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x003d:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2 = 0
            r3 = 0
        L_0x0044:
            int r4 = r0.length
            if (r2 >= r4) goto L_0x0061
            r4 = r17
            android.text.TextPaint r5 = r4.f40548f
            r6 = r0[r2]
            r7 = r0[r2]
            int r7 = r7.length()
            r5.getTextBounds(r6, r9, r7, r1)
            int r5 = r1.width()
            int r3 = java.lang.Math.max(r5, r3)
            int r2 = r2 + 1
            goto L_0x0044
        L_0x0061:
            r4 = r17
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.datepicker.NonRecurrNumberPickerForString.b(java.lang.String[]):int");
    }

    public void setData(List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f40542a, false, 33897, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f40542a, false, 33897, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            b(0);
            c(list.size() - 1);
            e(3);
            c();
            b();
            a((String[]) list.toArray(new String[0]));
        }
    }

    public final void a(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40542a, false, 33900, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40542a, false, 33900, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.k[0].f40550b + i > (this.f40547e / 2) - this.K) {
            i2 = ((this.f40547e / 2) - this.K) - this.k[0].f40550b;
        } else if (this.k[this.k.length - 1].f40550b + i < (this.f40547e / 2) + this.K) {
            i2 = ((this.f40547e / 2) + this.K) - this.k[this.k.length - 1].f40550b;
        } else {
            i2 = i;
        }
        for (int i3 = 0; i3 < this.k.length; i3++) {
            this.k[i3].f40550b += i2;
            if (Math.abs(this.k[i3].f40550b - (this.f40547e / 2)) < this.K / 4) {
                this.A = this.k[i3].f40549a;
                int i4 = this.s;
                if (this.A >= 0) {
                    this.s = this.z[this.A];
                } else {
                    this.s = -1;
                }
                if (i4 != this.s) {
                    if (this.M != null) {
                        this.M.a(this, i4, this.s);
                    }
                    if (this.P != null && this.Q) {
                        this.P.a();
                    }
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        String str;
        TextPaint textPaint;
        Object obj;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f40542a, false, 33898, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f40542a, false, 33898, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        canvas.drawColor(this.G);
        canvas.drawLine(0.0f, this.B.top, (float) this.f40546d, this.B.top, this.i);
        canvas.drawLine(0.0f, this.B.bottom, (float) this.f40546d, this.B.bottom, this.i);
        if (this.w != null) {
            canvas.drawText(this.w, (float) (((this.f40546d + this.j.width()) + 6) / 2), (float) (this.f40547e / 2), this.g);
        }
        for (int i = 0; i < this.k.length; i++) {
            if (this.k[i].f40549a >= 0 && this.k[i].f40549a <= this.r - this.q) {
                if (this.R != null) {
                    str = this.R[this.k[i].f40549a];
                } else {
                    if (this.k[i].f40549a >= 0) {
                        obj = Integer.valueOf(this.z[this.k[i].f40549a]);
                    } else {
                        obj = "";
                    }
                    str = String.valueOf(obj);
                }
                this.N.contains(str);
                float f2 = (float) (this.f40546d / 2);
                float height = (float) (this.k[i].f40550b + (this.j.height() / 2));
                if (this.k[i].f40549a == this.A) {
                    textPaint = this.f40548f;
                } else {
                    textPaint = this.h;
                }
                canvas.drawText(str, f2, height, textPaint);
                this.N.add(str);
            }
        }
        this.N.clear();
        if (1 == this.D && this.E.isFinished()) {
            d();
        }
    }

    public NonRecurrNumberPickerForString(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f40542a, false, 33901, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f40542a, false, 33901, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f40546d = size;
        } else if (this.R == null || this.R.length <= 0) {
            this.f40546d = this.j.width() + getPaddingLeft() + getPaddingRight() + this.C.width() + 6;
        } else {
            this.f40546d = b(this.R);
        }
        if (mode2 == 1073741824) {
            this.f40547e = size2;
        } else {
            this.f40547e = (this.O * this.j.height()) + ((this.O - 1) * this.v) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(this.f40546d, this.f40547e);
        if (this.B == null) {
            this.B = new RectF();
            this.B.left = 0.0f;
            this.B.right = (float) this.f40546d;
            this.B.top = (float) (((this.f40547e - this.j.height()) - this.v) / 2);
            this.B.bottom = (float) (((this.f40547e + this.j.height()) + this.v) / 2);
            this.K = this.v + this.j.height();
            this.l = (this.f40547e / 2) - ((this.A + 1) * this.K);
            this.m = this.l + ((this.k.length - 1) * this.K);
            a();
        }
    }

    public NonRecurrNumberPickerForString(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
