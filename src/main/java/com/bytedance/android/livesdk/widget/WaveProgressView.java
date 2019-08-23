package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Hashtable;
import java.util.Map;

public class WaveProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18364a;

    /* renamed from: b  reason: collision with root package name */
    float f18365b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f18366c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Float, Path> f18367d;

    /* renamed from: e  reason: collision with root package name */
    private int f18368e;

    /* renamed from: f  reason: collision with root package name */
    private int f18369f;
    private String g;
    private int h;
    private int i;
    private float j;
    private ValueAnimator k;
    private Path l;

    public int getColor() {
        return this.i;
    }

    public float getProgress() {
        return this.j;
    }

    public String getText() {
        return this.g;
    }

    public int getTextSize() {
        return this.h;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18364a, false, 14770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18364a, false, 14770, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null && !this.k.isStarted()) {
            this.k.start();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f18364a, false, 14771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18364a, false, 14771, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null && this.k.isStarted()) {
            this.k.cancel();
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f18364a, false, 14765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18364a, false, 14765, new Class[0], Void.TYPE);
            return;
        }
        this.l = null;
        this.f18367d.clear();
        super.onDetachedFromWindow();
    }

    private Path getWavePath() {
        if (PatchProxy.isSupport(new Object[0], this, f18364a, false, 14768, new Class[0], Path.class)) {
            return (Path) PatchProxy.accessDispatch(new Object[0], this, f18364a, false, 14768, new Class[0], Path.class);
        }
        float f2 = this.j;
        if (!this.f18367d.containsKey(Float.valueOf(f2))) {
            Path path = new Path();
            float f3 = 1.0f - f2;
            path.moveTo(0.0f, ((float) this.f18369f) * f3);
            float f4 = (float) (this.f18368e / 4);
            float f5 = ((float) this.f18369f) * f3;
            for (int i2 = 0; i2 < 2; i2++) {
                int i3 = i2 * 4;
                path.quadTo(((float) (i3 + 1)) * f4, f5 - (((float) this.f18369f) * 0.1f), ((float) (i3 + 2)) * f4, f5);
                path.quadTo(((float) (i3 + 3)) * f4, (((float) this.f18369f) * 0.1f) + f5, ((float) (i3 + 4)) * f4, f5);
            }
            path.lineTo((float) (this.f18368e * 2), (float) this.f18369f);
            path.lineTo(0.0f, (float) this.f18369f);
            path.close();
            this.f18367d.put(Float.valueOf(f2), path);
        }
        return this.f18367d.get(Float.valueOf(f2));
    }

    public void setColor(int i2) {
        this.i = i2;
    }

    public void setText(String str) {
        this.g = str;
    }

    public void setTextSize(int i2) {
        this.h = i2;
    }

    public WaveProgressView(Context context) {
        this(context, null);
    }

    public void setProgress(float f2) {
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f18364a, false, 14769, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f18364a, false, 14769, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (f3 > 1.0f || f3 < 0.0f) {
        } else {
            this.j = f3;
            postInvalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18364a, false, 14767, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18364a, false, 14767, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        this.f18368e = getWidth();
        this.f18369f = getHeight();
        this.f18366c.setColor(this.i);
        float measureText = (float) ((int) (((float) (this.f18368e / 2)) - (this.f18366c.measureText(this.g) / 2.0f)));
        float ascent = (float) ((int) (((float) (this.f18369f / 2)) - ((this.f18366c.ascent() + this.f18366c.descent()) / 2.0f)));
        canvas.drawText(this.g, measureText, ascent, this.f18366c);
        if (this.l == null) {
            this.l = new Path();
            this.l.addCircle((float) (this.f18368e / 2), (float) (this.f18369f / 2), (float) (this.f18369f / 2), Path.Direction.CW);
            this.l.close();
        }
        canvas.clipPath(this.l);
        Path wavePath = getWavePath();
        canvas.translate(((float) this.f18368e) * this.f18365b, 0.0f);
        canvas.drawPath(wavePath, this.f18366c);
        canvas.clipPath(wavePath);
        this.f18366c.setColor(-1);
        canvas.drawText(this.g, measureText - (((float) this.f18368e) * this.f18365b), ascent, this.f18366c);
    }

    public WaveProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        WaveProgressView waveProgressView;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18364a, false, 14766, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18364a, false, 14766, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            i4 = View.MeasureSpec.makeMeasureSpec(380, 1073741824);
        } else {
            i4 = i2;
        }
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            i5 = View.MeasureSpec.makeMeasureSpec(380, 1073741824);
            waveProgressView = this;
        } else {
            waveProgressView = this;
            i5 = i3;
        }
        waveProgressView.setMeasuredDimension(i4, i5);
    }

    public WaveProgressView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f18367d = new Hashtable();
        this.g = "";
        this.h = 180;
        this.i = -16776961;
        this.j = 0.5f;
        this.f18365b = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WaveProgressView);
        this.h = obtainStyledAttributes.getDimensionPixelSize(2, this.h);
        this.i = obtainStyledAttributes.getColor(0, this.i);
        String string = obtainStyledAttributes.getString(1);
        if (string != null) {
            this.g = string;
        }
        obtainStyledAttributes.recycle();
        this.f18366c = new Paint();
        this.f18366c.setColor(this.i);
        this.f18366c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f18366c.setStyle(Paint.Style.FILL);
        this.f18366c.setTextSize((float) this.h);
        this.f18366c.setDither(true);
        this.k = ValueAnimator.ofFloat(new float[]{-1.0f, 0.0f});
        this.k.setDuration(1500);
        this.k.setInterpolator(new LinearInterpolator());
        this.k.setRepeatCount(-1);
        this.k.setRepeatMode(1);
        this.k.addUpdateListener(new ao(this));
    }
}
