package com.bytedance.android.livesdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class GradientTextView extends AppCompatTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18231a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f18232b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18233c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18234d;

    public void setColorList(int[] iArr) {
        this.f18232b = iArr;
    }

    public void setGradient(boolean z) {
        this.f18234d = z;
    }

    public GradientTextView(Context context) {
        this(context, null);
    }

    public GradientTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18234d = true;
        this.f18232b = new int[]{-39936, -26573};
    }

    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18231a, false, 14390, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f18231a, false, 14390, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            if (this.f18234d) {
                TextPaint paint = getPaint();
                if (this.f18233c) {
                    f2 = (float) getWidth();
                } else {
                    f2 = 0.0f;
                }
                if (this.f18233c) {
                    f3 = 0.0f;
                } else {
                    f3 = (float) getHeight();
                }
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f2, f3, this.f18232b[0], this.f18232b[1], Shader.TileMode.CLAMP);
                paint.setShader(linearGradient);
                return;
            }
            getPaint().setShader(null);
        }
    }
}
