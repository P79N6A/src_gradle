package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.poi.widget.f;

public class RoundedRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76399a;

    /* renamed from: b  reason: collision with root package name */
    private Path f76400b;

    /* renamed from: c  reason: collision with root package name */
    private int f76401c;

    public RoundedRelativeLayout(Context context) {
        this(context, null);
    }

    public void dispatchDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f76399a, false, 89613, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f76399a, false, 89613, new Class[]{Canvas.class}, Void.TYPE);
        } else if (this.f76401c == 0 || Build.VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
        } else {
            if (this.f76400b == null && this.f76401c > 0) {
                int width = getWidth();
                int height = getHeight();
                if (width > 0 && height > 0) {
                    this.f76400b = new Path();
                    this.f76400b.addRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), new float[]{(float) this.f76401c, (float) this.f76401c, (float) this.f76401c, (float) this.f76401c, (float) this.f76401c, (float) this.f76401c, (float) this.f76401c, (float) this.f76401c}, Path.Direction.CW);
                }
            }
            if (this.f76400b != null) {
                canvas.clipPath(this.f76400b);
            }
            super.dispatchDraw(canvas);
        }
    }

    public RoundedRelativeLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedRelativeLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.RoundedView, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f76401c = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f76399a, false, 89612, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f76399a, false, 89612, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f76401c == 0 || Build.VERSION.SDK_INT >= 21) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76399a, false, 89611, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76399a, false, 89611, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (this.f76401c > 0 && Build.VERSION.SDK_INT >= 21) {
                setClipToOutline(true);
                int i5 = i;
                int i6 = i2;
                setOutlineProvider(new f((float) this.f76401c, i, i2));
            }
        }
    }
}
