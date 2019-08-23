package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public class LinearGradientDraweeView extends AnimatedImageView {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f46989f;
    private int g;
    private int h;
    private int i;
    private Paint j;
    private LinearGradient k;

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f46989f, false, 43687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46989f, false, 43687, new Class[0], Void.TYPE);
            return;
        }
        this.k = null;
        invalidate();
    }

    public LinearGradientDraweeView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f46989f, false, 43688, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f46989f, false, 43688, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.g > 0) {
            int height = getHeight() - this.g;
            if (this.k == null) {
                LinearGradient linearGradient = new LinearGradient(0.0f, (float) height, 0.0f, (float) getHeight(), new int[]{this.h, this.i}, null, Shader.TileMode.CLAMP);
                this.k = linearGradient;
                this.j.setShader(this.k);
            }
            canvas.drawRect(0.0f, (float) height, (float) getWidth(), (float) getHeight(), this.j);
        }
    }

    public LinearGradientDraweeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearGradientDraweeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.j = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LinearGradientDraweeView);
        this.h = obtainStyledAttributes.getColor(2, 0);
        this.i = obtainStyledAttributes.getColor(0, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
