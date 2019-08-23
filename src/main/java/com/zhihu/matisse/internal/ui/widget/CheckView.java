package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.C0906R;

public class CheckView extends View {

    /* renamed from: a  reason: collision with root package name */
    private boolean f82706a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f82707b;

    /* renamed from: c  reason: collision with root package name */
    private int f82708c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f82709d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f82710e;

    /* renamed from: f  reason: collision with root package name */
    private TextPaint f82711f;
    private Paint g;
    private Drawable h;
    private float i;
    private Rect j;
    private boolean k = true;

    private Rect getCheckRect() {
        if (this.j == null) {
            int i2 = (int) (((this.i * 48.0f) / 2.0f) - ((this.i * 16.0f) / 2.0f));
            float f2 = (float) i2;
            this.j = new Rect(i2, i2, (int) ((this.i * 48.0f) - f2), (int) ((this.i * 48.0f) - f2));
        }
        return this.j;
    }

    private void a() {
        if (this.f82710e == null) {
            this.f82710e = new Paint();
            this.f82710e.setAntiAlias(true);
            this.f82710e.setStyle(Paint.Style.FILL);
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{C0906R.attr.o1});
            int color = obtainStyledAttributes.getColor(0, ResourcesCompat.getColor(getResources(), C0906R.color.aou, getContext().getTheme()));
            obtainStyledAttributes.recycle();
            this.f82710e.setColor(color);
        }
    }

    public void setCountable(boolean z) {
        this.f82706a = z;
    }

    public CheckView(Context context) {
        super(context);
        a(context);
    }

    public void setEnabled(boolean z) {
        if (this.k != z) {
            this.k = z;
            invalidate();
        }
    }

    public void setChecked(boolean z) {
        if (!this.f82706a) {
            this.f82707b = z;
            invalidate();
            return;
        }
        throw new IllegalStateException("CheckView is countable, call setCheckedNum() instead.");
    }

    public void setCheckedNum(int i2) {
        if (!this.f82706a) {
            throw new IllegalStateException("CheckView is not countable, call setChecked() instead.");
        } else if (i2 == Integer.MIN_VALUE || i2 > 0) {
            this.f82708c = i2;
            invalidate();
        } else {
            throw new IllegalArgumentException("checked num can't be negative.");
        }
    }

    private void a(Context context) {
        this.i = context.getResources().getDisplayMetrics().density;
        this.f82709d = new Paint();
        this.f82709d.setAntiAlias(true);
        this.f82709d.setStyle(Paint.Style.STROKE);
        this.f82709d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f82709d.setStrokeWidth(this.i * 3.0f);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{C0906R.attr.o2});
        int color = obtainStyledAttributes.getColor(0, ResourcesCompat.getColor(getResources(), C0906R.color.aov, getContext().getTheme()));
        obtainStyledAttributes.recycle();
        this.f82709d.setColor(color);
        this.h = ResourcesCompat.getDrawable(context.getResources(), 2130838844, context.getTheme());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        super.onDraw(canvas);
        if (this.g == null) {
            this.g = new Paint();
            this.g.setAntiAlias(true);
            Paint paint = this.g;
            RadialGradient radialGradient = new RadialGradient((this.i * 48.0f) / 2.0f, (this.i * 48.0f) / 2.0f, this.i * 19.0f, new int[]{Color.parseColor("#00000000"), Color.parseColor("#0D000000"), Color.parseColor("#0D000000"), Color.parseColor("#00000000")}, new float[]{0.21052632f, 0.5263158f, 0.68421054f, 1.0f}, Shader.TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        canvas.drawCircle((this.i * 48.0f) / 2.0f, (this.i * 48.0f) / 2.0f, this.i * 19.0f, this.g);
        canvas.drawCircle((this.i * 48.0f) / 2.0f, (this.i * 48.0f) / 2.0f, this.i * 11.5f, this.f82709d);
        if (this.f82706a) {
            if (this.f82708c != Integer.MIN_VALUE) {
                a();
                canvas.drawCircle((this.i * 48.0f) / 2.0f, (this.i * 48.0f) / 2.0f, this.i * 11.0f, this.f82710e);
                if (this.f82711f == null) {
                    this.f82711f = new TextPaint();
                    this.f82711f.setAntiAlias(true);
                    this.f82711f.setColor(-1);
                    this.f82711f.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                    this.f82711f.setTextSize(this.i * 12.0f);
                }
                String valueOf = String.valueOf(this.f82708c);
                canvas.drawText(valueOf, (float) (((int) (((float) canvas.getWidth()) - this.f82711f.measureText(valueOf))) / 2), (float) (((int) ((((float) canvas.getHeight()) - this.f82711f.descent()) - this.f82711f.ascent())) / 2), this.f82711f);
            }
        } else if (this.f82707b) {
            a();
            canvas.drawCircle((this.i * 48.0f) / 2.0f, (this.i * 48.0f) / 2.0f, this.i * 11.0f, this.f82710e);
            this.h.setBounds(getCheckRect());
            this.h.draw(canvas);
        }
        if (this.k) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        setAlpha(f2);
    }

    public CheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (this.i * 48.0f), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public CheckView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }
}
