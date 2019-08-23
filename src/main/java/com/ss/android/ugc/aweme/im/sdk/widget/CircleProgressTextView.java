package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.R$styleable;
import java.text.NumberFormat;

public class CircleProgressTextView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52720a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f52721b;

    /* renamed from: c  reason: collision with root package name */
    private float f52722c;

    /* renamed from: d  reason: collision with root package name */
    private float f52723d;

    /* renamed from: e  reason: collision with root package name */
    private float f52724e;

    /* renamed from: f  reason: collision with root package name */
    private String f52725f;
    @ColorInt
    private int g;
    @ColorInt
    private int h;
    @ColorInt
    private int i;
    private Paint j;
    private Paint k;
    private Paint l;
    private RectF m;
    private NumberFormat n;

    public void setText(String str) {
        this.f52725f = str;
    }

    public CircleProgressTextView(Context context) {
        this(context, null);
    }

    public void setHintProgressColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52720a, false, 54038, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52720a, false, 54038, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h = i2;
        if (this.k == null) {
            this.k = new Paint(1);
        }
        this.k.setStrokeWidth(this.f52723d);
        this.k.setColor(this.h);
    }

    public void setHintProgressWidth(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f52720a, false, 54037, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f52720a, false, 54037, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.k.setStrokeWidth(f2);
    }

    public void setProgress(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f52720a, false, 54041, new Class[]{Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f52720a, false, 54041, new Class[]{Double.TYPE}, Void.TYPE);
            return;
        }
        double d3 = 1.0d;
        if (d2 <= 1.0d) {
            d3 = d2;
        }
        double max = Math.max(d3, 0.0d);
        if (this.n == null) {
            this.n = NumberFormat.getPercentInstance();
            this.n.setMinimumFractionDigits(0);
        }
        this.f52722c = (float) max;
        setText(this.n.format(max));
        postInvalidate();
    }

    public void setProgressColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52720a, false, 54036, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52720a, false, 54036, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i2;
        if (this.j == null) {
            this.j = new Paint(1);
        }
        this.j.setColor(this.g);
    }

    public void setProgressWidth(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f52720a, false, 54035, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f52720a, false, 54035, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f52723d = f2;
        this.j.setStrokeWidth(this.f52723d);
    }

    public void setTextColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52720a, false, 54039, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52720a, false, 54039, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i = i2;
        if (this.l == null) {
            this.l = new Paint(1);
        }
        this.l.setColor(this.i);
    }

    public void setTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f52720a, false, 54040, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f52720a, false, 54040, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f52724e = f2;
        this.l.setTextSize(this.f52724e);
    }

    public void onDraw(Canvas canvas) {
        int measureText;
        int i2;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f52720a, false, 54047, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f52720a, false, 54047, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f52720a, false, 54043, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f52720a, false, 54043, new Class[]{Canvas.class}, Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f52720a, false, 54042, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52720a, false, 54042, new Class[0], Void.TYPE);
            } else if (!this.f52721b) {
                int width = getWidth();
                int height = getHeight();
                if (this.m == null) {
                    this.m = new RectF();
                }
                float f2 = this.f52723d / 2.0f;
                this.m.left = f2;
                this.m.right = ((float) width) - f2;
                this.m.top = f2;
                this.m.bottom = ((float) height) - f2;
                this.f52721b = true;
            }
            this.j.setColor(this.g);
            this.k.setColor(this.h);
            float f3 = this.f52722c * 360.0f;
            canvas.drawArc(this.m, -90.0f, f3, false, this.j);
            canvas.drawArc(this.m, f3 - 0.049804688f, 360.0f - f3, false, this.k);
        }
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f52720a, false, 54044, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f52720a, false, 54044, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        int width2 = canvas.getWidth();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(width2)}, this, f52720a, false, 54045, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            measureText = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(width2)}, this, f52720a, false, 54045, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            measureText = (int) ((((float) width2) - this.l.measureText(this.f52725f)) / 2.0f);
        }
        int i3 = measureText;
        int height2 = canvas.getHeight();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(height2)}, this, f52720a, false, 54046, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(height2)}, this, f52720a, false, 54046, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            i2 = (int) ((((float) height2) / 2.0f) - ((this.l.descent() + this.l.ascent()) / 2.0f));
        }
        canvas.drawText(this.f52725f, (float) i3, (float) i2, this.l);
    }

    public CircleProgressTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleProgressTextView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f52723d = 10.0f;
        this.f52724e = 20.0f;
        this.f52725f = "";
        this.g = -1;
        this.i = -16776961;
        if (PatchProxy.isSupport(new Object[0], this, f52720a, false, 54032, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52720a, false, 54032, new Class[0], Void.TYPE);
        } else {
            this.j = new Paint(1);
            this.j.setStyle(Paint.Style.STROKE);
            this.k = new Paint(1);
            this.k.setStyle(Paint.Style.STROKE);
            this.l = new Paint(1);
            this.m = new RectF();
        }
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f52720a, false, 54033, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f52720a, false, 54033, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleProgressTextView);
        this.f52723d = (float) obtainStyledAttributes.getDimensionPixelSize(2, 10);
        this.g = obtainStyledAttributes.getColor(1, -1);
        this.f52724e = (float) obtainStyledAttributes.getDimensionPixelSize(4, 15);
        this.i = obtainStyledAttributes.getColor(3, -16776961);
        this.h = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        if (PatchProxy.isSupport(new Object[0], this, f52720a, false, 54034, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52720a, false, 54034, new Class[0], Void.TYPE);
            return;
        }
        setProgressWidth(this.f52723d);
        setProgressColor(this.g);
        setHintProgressWidth(this.f52723d);
        setHintProgressColor(this.h);
        setTextSize(this.f52724e);
        setTextColor(this.i);
    }
}
