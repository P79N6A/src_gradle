package com.bytedance.android.livesdk.gift.relay.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class CountDownAnimationView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15463a;

    /* renamed from: b  reason: collision with root package name */
    private float f15464b;

    /* renamed from: c  reason: collision with root package name */
    private float f15465c;

    /* renamed from: d  reason: collision with root package name */
    private float f15466d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f15467e;

    /* renamed from: f  reason: collision with root package name */
    private RectF f15468f;
    private LinearGradient g;
    private float h;
    private int i;
    private TextView j;

    public CountDownAnimationView(Context context) {
        this(context, null);
    }

    public void setCountDownTime(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f15463a, false, 10126, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f15463a, false, 10126, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i = i2;
        setTime(this.i);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f15463a, false, 10129, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f15463a, false, 10129, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        canvas.drawArc(this.f15468f, -90.0f, -this.h, false, this.f15467e);
    }

    public void setProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f15463a, false, 10127, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f15463a, false, 10127, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.h = f2;
        invalidate();
    }

    public void setTime(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f15463a, false, 10128, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f15463a, false, 10128, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.setText(String.valueOf(i2) + " ");
    }

    public CountDownAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountDownAnimationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (PatchProxy.isSupport(new Object[0], this, f15463a, false, 10125, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15463a, false, 10125, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(getContext()).inflate(C0906R.layout.aio, this);
        this.f15464b = getResources().getDimension(C0906R.dimen.ok);
        this.f15465c = getResources().getDimension(C0906R.dimen.oj);
        this.f15466d = getResources().getDimension(C0906R.dimen.om);
        this.f15467e = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f15464b, this.f15465c, getResources().getColor(C0906R.color.ad6), getResources().getColor(C0906R.color.ad5), Shader.TileMode.CLAMP);
        this.g = linearGradient;
        this.f15467e.setAntiAlias(true);
        this.f15467e.setShader(this.g);
        this.f15467e.setStyle(Paint.Style.STROKE);
        this.f15467e.setStrokeCap(Paint.Cap.ROUND);
        this.f15467e.setStrokeWidth(this.f15466d);
        float f2 = this.f15466d / 2.0f;
        this.f15468f = new RectF(f2, f2, this.f15464b - f2, this.f15465c - f2);
        this.j = (TextView) findViewById(C0906R.id.a0e);
        setWillNotDraw(false);
    }
}
