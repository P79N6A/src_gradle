package com.ss.android.ugc.aweme.im.sdk.story.widget;

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
import com.ss.android.ugc.aweme.im.sdk.R$styleable;

public class StoryCircleView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52443a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f52444b;

    /* renamed from: c  reason: collision with root package name */
    private int f52445c;

    /* renamed from: d  reason: collision with root package name */
    private int f52446d;

    /* renamed from: e  reason: collision with root package name */
    private int f52447e;

    /* renamed from: f  reason: collision with root package name */
    private Context f52448f;
    private float g;
    private float h;
    private float i;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52443a, false, 53305, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52443a, false, 53305, new Class[0], Void.TYPE);
            return;
        }
        this.f52444b = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredWidth(), this.f52446d, this.f52447e, Shader.TileMode.MIRROR);
        this.f52444b.setShader(linearGradient);
        this.f52444b.setAntiAlias(true);
        this.f52444b.setDither(true);
        this.f52444b.setStyle(Paint.Style.STROKE);
        this.f52444b.setStrokeWidth((float) this.f52445c);
    }

    public StoryCircleView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f52443a, false, 53307, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f52443a, false, 53307, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        canvas.drawCircle(this.g, this.h, this.i - (this.f52444b.getStrokeWidth() / 2.0f), this.f52444b);
    }

    public void setStrokeWidth(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52443a, false, 53302, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52443a, false, 53302, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i3 >= 0) {
            this.f52445c = i3;
            a();
            invalidate();
        }
    }

    public void setColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52443a, false, 53303, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52443a, false, 53303, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i2)}, this, f52443a, false, 53304, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i2)}, this, f52443a, false, 53304, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f52446d = i2;
        this.f52447e = i2;
        a();
        invalidate();
    }

    public StoryCircleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52443a, false, 53306, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52443a, false, 53306, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.g = ((float) getMeasuredWidth()) / 2.0f;
        this.h = ((float) getMeasuredHeight()) / 2.0f;
        this.i = ((float) (getMeasuredHeight() - (getPaddingTop() * 2))) / 2.0f;
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryCircleView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f52443a, false, 53301, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f52443a, false, 53301, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        this.f52448f = context2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StoryCircleView);
        this.f52445c = (int) obtainStyledAttributes.getDimension(2, UIUtils.dip2Px(context, 2.0f));
        this.f52446d = obtainStyledAttributes.getColor(1, Color.parseColor("#10DFF9"));
        this.f52447e = obtainStyledAttributes.getColor(0, Color.parseColor("#0BB8F0"));
        obtainStyledAttributes.recycle();
        a();
    }
}
