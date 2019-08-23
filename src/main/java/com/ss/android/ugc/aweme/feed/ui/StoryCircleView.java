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

public class StoryCircleView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46321a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f46322b;

    /* renamed from: c  reason: collision with root package name */
    private int f46323c;

    /* renamed from: d  reason: collision with root package name */
    private int f46324d;

    /* renamed from: e  reason: collision with root package name */
    private int f46325e;

    /* renamed from: f  reason: collision with root package name */
    private Context f46326f;
    private float g;
    private float h;
    private float i;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46321a, false, 43076, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46321a, false, 43076, new Class[0], Void.TYPE);
            return;
        }
        this.f46322b = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredWidth(), this.f46324d, this.f46325e, Shader.TileMode.MIRROR);
        this.f46322b.setShader(linearGradient);
        this.f46322b.setAntiAlias(true);
        this.f46322b.setDither(true);
        this.f46322b.setStyle(Paint.Style.STROKE);
        this.f46322b.setStrokeWidth((float) this.f46323c);
    }

    public StoryCircleView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f46321a, false, 43078, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f46321a, false, 43078, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        canvas.drawCircle(this.g, this.h, this.i - (this.f46322b.getStrokeWidth() / 2.0f), this.f46322b);
    }

    public void setColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46321a, false, 43074, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46321a, false, 43074, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = i2;
        a(i3, i3);
    }

    public void setStrokeWidth(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46321a, false, 43073, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46321a, false, 43073, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i3 >= 0) {
            this.f46323c = i3;
            a();
            invalidate();
        }
    }

    public StoryCircleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46321a, false, 43077, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46321a, false, 43077, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.g = ((float) getMeasuredWidth()) / 2.0f;
        this.h = ((float) getMeasuredHeight()) / 2.0f;
        this.i = ((float) (getMeasuredHeight() - (getPaddingTop() * 2))) / 2.0f;
        a();
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46321a, false, 43075, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46321a, false, 43075, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f46324d = i2;
        this.f46325e = i3;
        a();
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryCircleView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f46321a, false, 43072, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f46321a, false, 43072, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        this.f46326f = context2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StoryCircleView);
        this.f46323c = (int) obtainStyledAttributes.getDimension(2, UIUtils.dip2Px(context, 2.0f));
        this.f46324d = obtainStyledAttributes.getColor(1, Color.parseColor("#10DFF9"));
        this.f46325e = obtainStyledAttributes.getColor(0, Color.parseColor("#0BB8F0"));
        obtainStyledAttributes.recycle();
        a();
    }
}
