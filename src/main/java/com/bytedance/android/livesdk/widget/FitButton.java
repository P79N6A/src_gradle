package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatButton;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FitButton extends AppCompatButton {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18218a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f18219b;

    /* renamed from: c  reason: collision with root package name */
    private float f18220c;

    /* renamed from: d  reason: collision with root package name */
    private float f18221d;

    public FitButton(Context context) {
        this(context, null);
    }

    public FitButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18221d = 6.0f;
        if (PatchProxy.isSupport(new Object[0], this, f18218a, false, 14367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18218a, false, 14367, new Class[0], Void.TYPE);
            return;
        }
        this.f18219b = new TextPaint();
        this.f18219b.set(getPaint());
        this.f18220c = getTextSize();
    }

    private float a(Context context, float f2) {
        if (!PatchProxy.isSupport(new Object[]{context, Float.valueOf(f2)}, this, f18218a, false, 14369, new Class[]{Context.class, Float.TYPE}, Float.TYPE)) {
            return f2 / context.getResources().getDisplayMetrics().scaledDensity;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{context, Float.valueOf(f2)}, this, f18218a, false, 14369, new Class[]{Context.class, Float.TYPE}, Float.TYPE)).floatValue();
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (PatchProxy.isSupport(new Object[]{charSequence, bufferType}, this, f18218a, false, 14366, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, bufferType}, this, f18218a, false, 14366, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE);
            return;
        }
        super.setText(charSequence, bufferType);
        a(charSequence.toString(), getWidth());
    }

    private void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f18218a, false, 14368, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f18218a, false, 14368, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i > 0) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float f2 = this.f18220c;
            this.f18219b.setTextSize(f2);
            while (true) {
                if (this.f18219b.measureText(str) <= ((float) paddingLeft)) {
                    break;
                }
                f2 -= 1.0f;
                if (f2 <= this.f18221d) {
                    f2 = this.f18221d;
                    break;
                }
                this.f18219b.setTextSize(f2);
            }
            setTextSize(a(getContext(), f2));
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18218a, false, 14365, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18218a, false, 14365, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i5 != i3) {
            a(getText().toString(), i5);
        }
    }
}
