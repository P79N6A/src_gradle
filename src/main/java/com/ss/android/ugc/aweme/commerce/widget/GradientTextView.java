package com.ss.android.ugc.aweme.commerce.widget;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;

public class GradientTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38338a;

    /* renamed from: b  reason: collision with root package name */
    private LinearGradient f38339b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f38340c;

    public final void a(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{attributeSet2}, this, f38338a, false, 30145, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f38338a, false, 30145, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        super.a(attributeSet);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet2, R$styleable.GradientTextView);
            int color = obtainStyledAttributes.getColor(1, 0);
            int color2 = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            this.f38340c = new int[]{color, color2};
        }
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f38338a, false, 30147, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f38338a, false, 30147, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (this.f38339b != null) {
            getPaint().setShader(this.f38339b);
        }
        super.onDraw(canvas);
    }

    @SuppressLint({"CI_DrawAllocation"})
    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38338a, false, 30146, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38338a, false, 30146, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        if (this.f38340c != null) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) getMeasuredWidth(), 0.0f, this.f38340c, null, Shader.TileMode.REPEAT);
            this.f38339b = linearGradient;
        }
    }
}
