package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;

public class LiveCircleView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46206a;

    /* renamed from: b  reason: collision with root package name */
    public Paint f46207b;

    /* renamed from: c  reason: collision with root package name */
    public Paint f46208c;

    /* renamed from: d  reason: collision with root package name */
    private float f46209d;

    /* renamed from: e  reason: collision with root package name */
    private Context f46210e;

    /* renamed from: f  reason: collision with root package name */
    private int f46211f;
    private int g;
    private float h;
    private float i;
    private int j;

    public void setStrokeWidth(int i2) {
        this.f46209d = (float) i2;
    }

    public LiveCircleView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f46206a, false, 42868, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f46206a, false, 42868, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        canvas.drawCircle((float) this.f46211f, (float) this.g, this.h, this.f46207b);
        canvas.drawCircle((float) this.f46211f, (float) this.g, this.i, this.f46208c);
    }

    public void setFraction(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f46206a, false, 42869, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f46206a, false, 42869, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.i = this.h + (((float) this.j) * f2);
        this.f46208c.setStrokeWidth(this.f46209d * (1.0f - f2));
        postInvalidate();
    }

    public LiveCircleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46206a, false, 42867, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46206a, false, 42867, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.f46211f = getMeasuredWidth() / 2;
        this.g = getMeasuredHeight() / 2;
        this.h = (float) ((getMeasuredHeight() / 2) - getPaddingBottom());
        this.i = this.h;
        this.j = getPaddingBottom();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveCircleView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f46206a, false, 42866, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f46206a, false, 42866, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, R$styleable.LiveCircleView);
        this.f46209d = (float) ((int) obtainStyledAttributes.getDimension(0, UIUtils.dip2Px(context2, 1.5f)));
        obtainStyledAttributes.recycle();
        this.f46210e = context2;
        this.f46207b = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, Color.parseColor("#FF1764"), Color.parseColor("#ED3495"), Shader.TileMode.MIRROR);
        this.f46207b.setShader(linearGradient);
        this.f46207b.setAntiAlias(true);
        this.f46207b.setDither(true);
        this.f46207b.setStyle(Paint.Style.STROKE);
        this.f46207b.setStrokeWidth(UIUtils.dip2Px(context2, 1.0f));
        this.f46208c = new Paint(this.f46207b);
    }
}
