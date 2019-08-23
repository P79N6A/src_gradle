package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FitTextView extends LiveTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8345a;

    /* renamed from: e  reason: collision with root package name */
    private Paint f8346e;

    /* renamed from: f  reason: collision with root package name */
    private float f8347f;
    private float g;

    public FitTextView(Context context) {
        this(context, null);
    }

    public FitTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 6.0f;
        if (PatchProxy.isSupport(new Object[0], this, f8345a, false, 1502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8345a, false, 1502, new Class[0], Void.TYPE);
            return;
        }
        this.f8346e = new TextPaint();
        this.f8346e.set(getPaint());
        this.f8347f = getTextSize();
    }

    private float a(Context context, float f2) {
        if (!PatchProxy.isSupport(new Object[]{context, Float.valueOf(f2)}, this, f8345a, false, 1506, new Class[]{Context.class, Float.TYPE}, Float.TYPE)) {
            return f2 / context.getResources().getDisplayMetrics().scaledDensity;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{context, Float.valueOf(f2)}, this, f8345a, false, 1506, new Class[]{Context.class, Float.TYPE}, Float.TYPE)).floatValue();
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (PatchProxy.isSupport(new Object[]{charSequence, bufferType}, this, f8345a, false, 1504, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, bufferType}, this, f8345a, false, 1504, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE);
            return;
        }
        super.setText(charSequence, bufferType);
        a(charSequence.toString(), getWidth());
    }

    private void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f8345a, false, 1505, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f8345a, false, 1505, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i > 0) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float f2 = this.f8347f;
            this.f8346e.setTextSize(f2);
            while (true) {
                if (this.f8346e.measureText(str) <= ((float) paddingLeft)) {
                    break;
                }
                f2 -= 1.0f;
                if (f2 <= this.g) {
                    f2 = this.g;
                    break;
                }
                this.f8346e.setTextSize(f2);
            }
            setTextSize(a(getContext(), f2));
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f8345a, false, 1503, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f8345a, false, 1503, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i5 != i3) {
            a(getText().toString(), i5);
        }
    }
}
