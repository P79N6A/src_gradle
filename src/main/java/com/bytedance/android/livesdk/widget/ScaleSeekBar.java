package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.v7.widget.AppCompatSeekBar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ScaleSeekBar extends AppCompatSeekBar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18328a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f18329b;

    /* renamed from: c  reason: collision with root package name */
    private final float f18330c;

    /* renamed from: d  reason: collision with root package name */
    private String f18331d;

    /* renamed from: e  reason: collision with root package name */
    private String f18332e;

    /* renamed from: f  reason: collision with root package name */
    private int f18333f;
    private float g;
    private float h;

    public ScaleSeekBar(Context context) {
        this(context, null);
    }

    public synchronized void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18328a, false, 14641, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18328a, false, 14641, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        int bottom = getBottom();
        int top = getTop();
        setBottom((int) (((float) bottom) - ((this.f18330c + ((float) getPaddingTop())) + this.h)));
        setTop((int) (((float) top) + this.f18330c + ((float) getPaddingTop()) + this.h));
        canvas.save();
        canvas.translate(0.0f, this.f18330c + ((float) getPaddingTop()) + this.h);
        super.onDraw(canvas);
        canvas.restore();
        setBottom(bottom);
        setTop(top);
        int progress = getProgress();
        String str = this.f18332e + String.valueOf(progress) + this.f18331d;
        if (!c.a(getContext()) || Build.VERSION.SDK_INT < 17) {
            canvas.drawText(str, ((float) (((((getWidth() - getPaddingLeft()) - getPaddingRight()) * progress) / 100) + getPaddingLeft())) - (this.f18329b.measureText(str) / 2.0f), this.f18330c + ((float) getPaddingTop()), this.f18329b);
        } else {
            canvas.drawText(str, ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) - (((float) (((((getWidth() - getPaddingLeft()) - getPaddingRight()) * progress) / 100) - getPaddingStart())) + (this.f18329b.measureText(str) / 2.0f)), this.f18330c + ((float) getPaddingTop()), this.f18329b);
        }
    }

    public ScaleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0906R.attr.a1x);
    }

    public synchronized void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18328a, false, 14640, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18328a, false, 14640, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            measuredHeight = ((int) (((this.f18329b.descent() - this.f18329b.ascent()) + this.h) * 2.0f)) + getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public ScaleSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18333f = -1;
        this.g = 30.0f;
        this.h = 10.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_ScaleSeekBar);
        if (obtainStyledAttributes != null) {
            this.f18333f = obtainStyledAttributes.getColor(0, -1);
            this.g = obtainStyledAttributes.getDimension(3, 30.0f);
            this.h = obtainStyledAttributes.getDimension(2, 10.0f);
            this.f18332e = obtainStyledAttributes.getString(4);
            if (TextUtils.isEmpty(this.f18332e)) {
                this.f18332e = "";
            }
            this.f18331d = obtainStyledAttributes.getString(1);
            if (TextUtils.isEmpty(this.f18331d)) {
                this.f18331d = "";
            }
            obtainStyledAttributes.recycle();
        }
        this.f18329b = new Paint();
        this.f18329b.setColor(this.f18333f);
        this.f18329b.setTextSize(this.g);
        this.f18329b.setAntiAlias(true);
        this.f18330c = this.f18329b.descent() - this.f18329b.ascent();
    }
}
