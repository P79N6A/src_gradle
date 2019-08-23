package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class RoundedRectangleImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private float f82726a;

    /* renamed from: b  reason: collision with root package name */
    private Path f82727b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f82728c;

    public RoundedRectangleImageView(Context context) {
        super(context);
        a(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.clipPath(this.f82727b);
        super.onDraw(canvas);
    }

    private void a(Context context) {
        this.f82726a = context.getResources().getDisplayMetrics().density * 2.0f;
        this.f82727b = new Path();
        this.f82728c = new RectF();
    }

    public RoundedRectangleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f82728c.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        this.f82727b.addRoundRect(this.f82728c, this.f82726a, this.f82726a, Path.Direction.CW);
    }

    public RoundedRectangleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
