package com.bytedance.android.livesdkapi.view;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TextureRenderView extends TextureView implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18838a;

    /* renamed from: b  reason: collision with root package name */
    private int f18839b;

    /* renamed from: c  reason: collision with root package name */
    private int f18840c;

    /* renamed from: d  reason: collision with root package name */
    private int f18841d = 2;

    public int getTextureLayout() {
        return this.f18841d;
    }

    public void setScaleType(int i) {
        this.f18841d = i;
    }

    public TextureRenderView(Context context) {
        super(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18838a, false, 15152, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18838a, false, 15152, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i > 0 && i2 > 0) {
            this.f18839b = i;
            this.f18840c = i2;
            requestLayout();
        }
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18838a, false, 15151, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18838a, false, 15151, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        } else if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        }
        if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        }
        if (this.f18841d != 1 && this.f18839b > 0 && this.f18840c > 0) {
            if (this.f18841d == 2) {
                float f2 = (float) suggestedMinimumHeight;
                float f3 = (float) suggestedMinimumWidth;
                if (((float) this.f18840c) / ((float) this.f18839b) > f2 / f3) {
                    suggestedMinimumHeight = (int) (((float) this.f18840c) * ((f3 * 1.0f) / ((float) this.f18839b)));
                } else {
                    suggestedMinimumWidth = (int) (((float) this.f18839b) * ((f2 * 1.0f) / ((float) this.f18840c)));
                }
            } else {
                int i3 = (int) (((float) this.f18840c) * ((((float) suggestedMinimumWidth) * 1.0f) / ((float) this.f18839b)));
                if (i3 > suggestedMinimumHeight) {
                    suggestedMinimumWidth = (int) (((float) this.f18839b) * ((((float) suggestedMinimumHeight) * 1.0f) / ((float) this.f18840c)));
                } else {
                    suggestedMinimumHeight = i3;
                }
            }
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public TextureRenderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
