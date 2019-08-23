package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class BorderLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34927a;

    /* renamed from: b  reason: collision with root package name */
    protected float f34928b;

    /* renamed from: c  reason: collision with root package name */
    protected float f34929c;
    @ColorInt

    /* renamed from: d  reason: collision with root package name */
    protected int f34930d;

    /* renamed from: e  reason: collision with root package name */
    protected int f34931e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f34932f;
    private Paint g;

    public boolean isSelected() {
        return this.f34932f;
    }

    public BorderLayout(Context context) {
        this(context, null);
    }

    public void setSelected(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34927a, false, 24993, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34927a, false, 24993, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f34932f != z) {
            this.f34932f = z;
            if (this.f34932f) {
                this.g.setColor(this.f34930d);
            } else {
                this.g.setColor(this.f34931e);
            }
            postInvalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f34927a, false, 24994, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f34927a, false, 24994, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f34927a, false, 24992, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f34927a, false, 24992, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Rect rect = new Rect();
        getDrawingRect(rect);
        RectF rectF = new RectF();
        rectF.left = ((float) rect.left) + this.f34928b;
        rectF.right = ((float) rect.right) - this.f34928b;
        rectF.top = ((float) rect.top) + this.f34928b;
        rectF.bottom = ((float) rect.bottom) - this.f34928b;
        canvas.drawRoundRect(rectF, this.f34929c, this.f34929c, this.g);
    }

    public BorderLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f34927a, false, 24990, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f34927a, false, 24990, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f34930d = i;
        this.f34931e = i2;
        this.g.setColor(this.f34931e);
    }

    public BorderLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34928b = 3.0f;
        this.f34929c = 6.0f;
        this.f34930d = -256;
        this.f34931e = -1;
        if (PatchProxy.isSupport(new Object[0], this, f34927a, false, 24991, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34927a, false, 24991, new Class[0], Void.TYPE);
            return;
        }
        setWillNotDraw(false);
        if (this.g == null) {
            this.g = new Paint(1);
            this.g.setColor(this.f34931e);
        }
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setStrokeWidth(this.f34928b);
    }
}
