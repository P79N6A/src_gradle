package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

@SuppressLint({"AppCompatCustomView"})
public class StrokeGradientTextView extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14943a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f14944b;

    public StrokeGradientTextView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f14943a, false, 9612, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f14943a, false, 9612, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        this.f14944b.draw(canvas2);
        super.onDraw(canvas);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f14943a, false, 9609, new Class[]{ViewGroup.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f14943a, false, 9609, new Class[]{ViewGroup.LayoutParams.class}, Void.TYPE);
            return;
        }
        super.setLayoutParams(layoutParams);
        this.f14944b.setLayoutParams(layoutParams2);
    }

    public void setTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f14943a, false, 9607, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f14943a, false, 9607, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        super.setTextSize(f2);
        this.f14944b.setTextSize(f2);
    }

    public StrokeGradientTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14943a, false, 9610, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14943a, false, 9610, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        CharSequence text = this.f14944b.getText();
        if (text == null || !text.equals(getText())) {
            this.f14944b.setText(getText());
            postInvalidate();
        }
        this.f14944b.measure(i, i2);
    }

    public void setTextSize(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f14943a, false, 9608, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f14943a, false, 9608, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        super.setTextSize(i, f2);
        this.f14944b.setTextSize(i, f2);
    }

    public StrokeGradientTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14944b = new TextView(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f14943a, false, 9606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14943a, false, 9606, new Class[0], Void.TYPE);
            return;
        }
        TextPaint paint = this.f14944b.getPaint();
        paint.setStrokeWidth(getResources().getDimension(C0906R.dimen.nr));
        paint.setStyle(Paint.Style.STROKE);
        this.f14944b.setTextColor(getResources().getColor(C0906R.color.aby));
        this.f14944b.setGravity(getGravity());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f14943a, false, 9611, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f14943a, false, 9611, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.f14944b.layout(i, i2, i3, i4);
        TextPaint paint = getPaint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), getResources().getColor(C0906R.color.ac1), getResources().getColor(C0906R.color.ac0), Shader.TileMode.CLAMP);
        paint.setShader(linearGradient);
    }
}
