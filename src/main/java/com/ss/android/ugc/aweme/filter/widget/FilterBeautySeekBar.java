package com.ss.android.ugc.aweme.filter.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.themechange.base.b;
import com.ss.android.ugc.aweme.tools.avdmtview.R$styleable;

public class FilterBeautySeekBar extends AppCompatSeekBar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47663a;

    /* renamed from: b  reason: collision with root package name */
    private float f47664b;

    /* renamed from: c  reason: collision with root package name */
    private String f47665c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f47666d;

    /* renamed from: e  reason: collision with root package name */
    private float f47667e;

    /* renamed from: f  reason: collision with root package name */
    private float f47668f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int getProgress() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47663a     // Catch:{ all -> 0x0048 }
            r4 = 0
            r5 = 44470(0xadb6, float:6.2316E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0048 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0048 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x002e
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            com.meituan.robust.ChangeQuickRedirect r4 = f47663a     // Catch:{ all -> 0x0048 }
            r5 = 0
            r6 = 44470(0xadb6, float:6.2316E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0048 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0048 }
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0048 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0048 }
            monitor-exit(r9)
            return r0
        L_0x002e:
            int r0 = super.getProgress()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0048 }
            r9.f47665c = r1     // Catch:{ all -> 0x0048 }
            android.graphics.Paint r1 = r9.f47666d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0046
            android.graphics.Paint r1 = r9.f47666d     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = r9.f47665c     // Catch:{ all -> 0x0048 }
            float r1 = r1.measureText(r2)     // Catch:{ all -> 0x0048 }
            r9.f47667e = r1     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r9)
            return r0
        L_0x0048:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar.getProgress():int");
    }

    public FilterBeautySeekBar(Context context) {
        this(context, null, 0);
    }

    public synchronized void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f47663a, false, 44469, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f47663a, false, 44469, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        canvas.drawText(this.f47665c, (((float) ((getProgressDrawable().getBounds().width() * getProgress()) / getMax())) - (this.f47667e / 2.0f)) + this.f47668f, a(getContext(), 10.0f - this.j), this.f47666d);
    }

    public FilterBeautySeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static float a(Context context, float f2) {
        if (!PatchProxy.isSupport(new Object[]{context, Float.valueOf(f2)}, null, f47663a, true, 44468, new Class[]{Context.class, Float.TYPE}, Float.TYPE)) {
            return (context.getResources().getDisplayMetrics().density * f2) + 0.5f;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{context, Float.valueOf(f2)}, null, f47663a, true, 44468, new Class[]{Context.class, Float.TYPE}, Float.TYPE)).floatValue();
    }

    public FilterBeautySeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f47665c = "";
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FilterBeautySeekBar, i2, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        boolean z = false;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 2) {
                this.k = obtainStyledAttributes.getColor(index, -1);
            } else {
                if (index == 3) {
                    this.f47664b = obtainStyledAttributes.getDimension(index, 15.0f);
                }
                if (index == 6) {
                    z = obtainStyledAttributes.getBoolean(index, false);
                }
            }
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f47668f = obtainStyledAttributes.getDimension(1, 0.0f);
        } else {
            this.f47668f = a(context, 10.0f);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.g = obtainStyledAttributes.getDimension(4, 0.0f);
        } else {
            this.g = this.f47668f;
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.h = obtainStyledAttributes.getDimension(7, 0.0f);
        } else {
            this.h = a(context, 13.0f);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.i = obtainStyledAttributes.getDimension(0, 0.0f);
        } else {
            this.i = this.h;
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.j = obtainStyledAttributes.getDimension(5, 0.0f);
        }
        obtainStyledAttributes.recycle();
        if (z) {
            this.k = b.f74589e.b(false);
        }
        this.f47666d = new Paint();
        this.f47666d.setAntiAlias(true);
        this.f47666d.setColor(this.k);
        this.f47666d.setTextSize(this.f47664b);
        Rect rect = new Rect();
        this.f47665c = String.valueOf(getProgress());
        this.f47666d.getTextBounds(this.f47665c, 0, this.f47665c.length(), rect);
        setPadding((int) this.f47668f, (int) this.h, (int) this.g, (int) this.i);
    }
}
