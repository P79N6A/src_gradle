package com.bytedance.sdk.account.bdplatform.impl.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.sdk.account.bdplatform.R$styleable;

public class RoundImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private float f22313a;

    /* renamed from: b  reason: collision with root package name */
    private float f22314b;

    /* renamed from: c  reason: collision with root package name */
    private float f22315c;

    /* renamed from: d  reason: collision with root package name */
    private float f22316d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f22317e;

    public RoundImageView(Context context) {
        this(context, null);
    }

    public void draw(Canvas canvas) {
        canvas.saveLayer(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), null, 31);
        super.draw(canvas);
        if (this.f22313a > 0.0f) {
            Path path = new Path();
            path.moveTo(0.0f, this.f22313a);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(this.f22313a, 0.0f);
            path.arcTo(new RectF(0.0f, 0.0f, this.f22313a * 2.0f, this.f22313a * 2.0f), -90.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.f22317e);
        }
        if (this.f22314b > 0.0f) {
            int width = getWidth();
            Path path2 = new Path();
            float f2 = (float) width;
            path2.moveTo(f2 - this.f22314b, 0.0f);
            path2.lineTo(f2, 0.0f);
            path2.lineTo(f2, this.f22314b);
            path2.arcTo(new RectF(f2 - (this.f22314b * 2.0f), 0.0f, f2, this.f22314b * 2.0f), 0.0f, -90.0f);
            path2.close();
            canvas.drawPath(path2, this.f22317e);
        }
        if (this.f22315c > 0.0f) {
            int height = getHeight();
            Path path3 = new Path();
            float f3 = (float) height;
            path3.moveTo(0.0f, f3 - this.f22315c);
            path3.lineTo(0.0f, f3);
            path3.lineTo(this.f22315c, f3);
            path3.arcTo(new RectF(0.0f, f3 - (this.f22315c * 2.0f), this.f22315c * 2.0f, f3), 90.0f, 90.0f);
            path3.close();
            canvas.drawPath(path3, this.f22317e);
        }
        if (this.f22316d > 0.0f) {
            int height2 = getHeight();
            int width2 = getWidth();
            Path path4 = new Path();
            float f4 = (float) width2;
            float f5 = (float) height2;
            path4.moveTo(f4 - this.f22316d, f5);
            path4.lineTo(f4, f5);
            path4.lineTo(f4, f5 - this.f22316d);
            path4.arcTo(new RectF(f4 - (this.f22316d * 2.0f), f5 - (this.f22316d * 2.0f), f4, f5), 0.0f, 90.0f);
            path4.close();
            canvas.drawPath(path4, this.f22317e);
        }
        canvas.restore();
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundImageView);
            float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
            this.f22313a = dimension;
            this.f22314b = dimension;
            this.f22315c = dimension;
            this.f22316d = dimension;
            obtainStyledAttributes.recycle();
        }
        this.f22317e = new Paint(5);
        this.f22317e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }
}
