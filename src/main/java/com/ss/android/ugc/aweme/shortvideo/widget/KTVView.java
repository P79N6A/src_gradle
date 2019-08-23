package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.R$styleable;
import com.ss.android.ugc.aweme.base.utils.k;

public class KTVView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71332a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f71333b;

    /* renamed from: c  reason: collision with root package name */
    private int f71334c;

    /* renamed from: d  reason: collision with root package name */
    private int f71335d;

    /* renamed from: e  reason: collision with root package name */
    private int f71336e;

    public KTVView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f71332a, false, 81318, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f71332a, false, 81318, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Drawable background = getBackground();
        if (background != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
            background.draw(canvas);
            canvas.drawRect((float) this.f71335d, 0.0f, (float) this.f71336e, (float) getHeight(), this.f71333b);
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setColor(@ColorInt int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71332a, false, 81317, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71332a, false, 81317, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71333b.setColor(i);
        invalidate();
    }

    public void setLength(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71332a, false, 81315, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71332a, false, 81315, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71334c = i;
        this.f71336e = k.a(this.f71335d + this.f71334c, this.f71335d, getWidth() - getPaddingRight());
        invalidate();
    }

    public void setStart(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71332a, false, 81314, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71332a, false, 81314, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71335d = i;
        this.f71336e = k.a(this.f71335d + this.f71334c, this.f71335d, getWidth() - getPaddingRight());
        invalidate();
    }

    public KTVView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KTVView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KTVView, i, 0);
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.f71333b = new Paint(1);
        this.f71333b.setStyle(Paint.Style.FILL);
        this.f71333b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f71333b.setColor(color);
    }
}
