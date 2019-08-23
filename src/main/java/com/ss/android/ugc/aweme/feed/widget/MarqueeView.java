package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.support.annotation.StringRes;
import android.support.v4.view.ViewCompat;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;

public class MarqueeView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47006a;

    /* renamed from: b  reason: collision with root package name */
    private TextPaint f47007b;

    /* renamed from: c  reason: collision with root package name */
    private Paint.FontMetrics f47008c;

    /* renamed from: d  reason: collision with root package name */
    private String f47009d;

    /* renamed from: e  reason: collision with root package name */
    private int f47010e;

    /* renamed from: f  reason: collision with root package name */
    private long f47011f;
    private float g;
    private float h;
    private int i;
    private long j;
    private boolean k;
    private int l;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47006a, false, 43719, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47006a, false, 43719, new Class[0], Void.TYPE);
        } else if (this.i != 1) {
            this.i = 1;
            invalidate();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f47006a, false, 43720, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47006a, false, 43720, new Class[0], Void.TYPE);
        } else if (this.i != 2) {
            this.i = 2;
            this.g = 0.0f;
            this.j = 0;
            invalidate();
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f47006a, false, 43721, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47006a, false, 43721, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.i == 0) {
            c();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f47006a, false, 43718, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47006a, false, 43718, new Class[0], Void.TYPE);
        } else if (this.i != 0) {
            if (this.i == 1) {
                this.i = 0;
                invalidate();
                return;
            }
            if (this.i == 2) {
                this.g = 0.0f;
                this.j = 0;
                this.i = 0;
                invalidate();
            }
        }
    }

    public void setSpeed(int i2) {
        this.f47010e = i2;
    }

    public MarqueeView(Context context) {
        this(context, null);
    }

    public void setText(@StringRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47006a, false, 43714, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47006a, false, 43714, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setText(getResources().getString(i2));
    }

    public void setTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47006a, false, 43711, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47006a, false, 43711, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f47007b != null) {
            this.f47007b.setColor(i2);
        }
    }

    public void setTextShadow(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47006a, false, 43713, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47006a, false, 43713, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f47007b != null) {
            this.f47007b.setShadowLayer(1.0f, 1.0f, 1.0f, i2);
        }
    }

    public void setTextSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47006a, false, 43712, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47006a, false, 43712, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f47007b != null) {
            this.f47007b.setTextSize((float) i2);
        }
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f47006a, false, 43716, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f47006a, false, 43716, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f47009d)) {
            float f2 = 0.0f;
            if (this.h != 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.j > 0) {
                    float f3 = ((float) ((uptimeMillis - this.j) * ((long) this.f47010e))) / 1000.0f;
                    float f4 = this.g;
                    if (this.k) {
                        i4 = 1;
                    } else {
                        i4 = -1;
                    }
                    this.g = f4 + (f3 * ((float) i4));
                    this.g %= this.h;
                }
                if (this.i == 0) {
                    this.j = uptimeMillis;
                }
                this.f47007b.getFontMetrics(this.f47008c);
                while (true) {
                    float measuredWidth = (float) getMeasuredWidth();
                    float f5 = this.g;
                    if (this.k) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    if (f2 >= measuredWidth + (f5 * ((float) i2))) {
                        break;
                    }
                    String str = this.f47009d;
                    float f6 = this.g;
                    if (this.k) {
                        i3 = -1;
                    } else {
                        i3 = 1;
                    }
                    canvas.drawText(str, f6 + (((float) i3) * f2), -this.f47008c.top, this.f47007b);
                    f2 += this.h;
                }
                if (this.i == 0) {
                    postInvalidateDelayed(this.f47011f);
                }
            }
        }
    }

    public void setText(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f47006a, false, 43715, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f47006a, false, 43715, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f47009d = str + "    ";
        this.h = this.f47007b.measureText(this.f47009d);
        while (this.h < ((float) this.l)) {
            this.f47009d += this.f47009d;
            this.h = this.f47007b.measureText(this.f47009d);
        }
        this.g = 0.0f;
        this.j = 0;
        requestLayout();
    }

    public MarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f47006a, false, 43717, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f47006a, false, 43717, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.f47007b.getFontMetrics(this.f47008c);
        int i5 = (int) (this.f47008c.bottom - this.f47008c.top);
        if (!TextUtils.isEmpty(this.f47009d)) {
            i4 = (int) this.f47007b.measureText(this.f47009d);
        } else {
            i4 = 0;
        }
        if (View.MeasureSpec.getSize(i2) <= i4) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i4, i5);
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z = true;
        }
        this.k = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarqueeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.f47008c = new Paint.FontMetrics();
        this.f47010e = 25;
        this.f47011f = 16;
        this.l = 0;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f47006a, false, 43710, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f47006a, false, 43710, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        this.f47007b = new TextPaint();
        this.f47007b.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MarqueeView);
        this.f47010e = obtainStyledAttributes.getDimensionPixelSize(0, this.f47010e);
        int color = obtainStyledAttributes.getColor(1, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 28);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        this.f47007b.setTextSize((float) dimensionPixelSize);
        this.f47007b.setShadowLayer(1.0f, 1.0f, 1.0f, color2);
        this.f47007b.setColor(color);
        Typeface a2 = b.a().a(c.f20594a);
        if (a2 != null) {
            this.f47007b.setTypeface(a2);
        }
        this.i = 2;
        this.l = context.getResources().getDimensionPixelSize(C0906R.dimen.k5);
    }
}
