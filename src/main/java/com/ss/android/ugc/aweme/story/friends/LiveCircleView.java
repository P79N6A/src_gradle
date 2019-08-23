package com.ss.android.ugc.aweme.story.friends;

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
import com.ss.android.ugc.aweme.story.R$styleable;

public class LiveCircleView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73005a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f73006b;

    /* renamed from: c  reason: collision with root package name */
    private int f73007c;

    /* renamed from: d  reason: collision with root package name */
    private Context f73008d;

    /* renamed from: e  reason: collision with root package name */
    private int f73009e;

    /* renamed from: f  reason: collision with root package name */
    private int f73010f;
    private float g;
    private float h;
    private int i;
    private Paint j;

    public void setStrokeWidth(int i2) {
        this.f73007c = i2;
    }

    public LiveCircleView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f73005a, false, 84406, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f73005a, false, 84406, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        canvas.drawCircle((float) this.f73009e, (float) this.f73010f, this.g, this.f73006b);
        canvas.drawCircle((float) this.f73009e, (float) this.f73010f, this.h, this.j);
    }

    public void setFraction(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f73005a, false, 84407, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f73005a, false, 84407, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.h = this.g + (((float) this.i) * f2);
        this.j.setAlpha(255 - ((int) (255.0f * f2)));
        postInvalidate();
    }

    public LiveCircleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f73005a, false, 84405, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f73005a, false, 84405, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.f73009e = getMeasuredWidth() / 2;
        this.f73010f = getMeasuredHeight() / 2;
        this.g = (float) ((getMeasuredHeight() / 2) - getPaddingBottom());
        this.h = this.g;
        this.i = getPaddingBottom();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveCircleView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f73005a, false, 84404, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f73005a, false, 84404, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, R$styleable.LiveCircleView);
        this.f73007c = (int) obtainStyledAttributes.getDimension(0, UIUtils.dip2Px(context2, 1.5f));
        obtainStyledAttributes.recycle();
        this.f73008d = context2;
        this.f73006b = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, Color.parseColor("#FF1764"), Color.parseColor("#ED3495"), Shader.TileMode.MIRROR);
        this.f73006b.setShader(linearGradient);
        this.f73006b.setAntiAlias(true);
        this.f73006b.setDither(true);
        this.f73006b.setStyle(Paint.Style.STROKE);
        this.f73006b.setStrokeWidth(UIUtils.dip2Px(context2, 1.0f));
        this.j = new Paint(this.f73006b);
    }
}
