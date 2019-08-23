package com.ss.android.ugc.aweme.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.poi.widget.f;

public class RoundedFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76393a;

    /* renamed from: b  reason: collision with root package name */
    private Path f76394b;

    /* renamed from: c  reason: collision with root package name */
    private int f76395c;

    public RoundedFrameLayout(Context context) {
        this(context, null);
    }

    public void setRadius(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76393a, false, 89604, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76393a, false, 89604, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f76395c = i;
        a(getMeasuredWidth(), getMeasuredHeight());
    }

    public void dispatchDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f76393a, false, 89607, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f76393a, false, 89607, new Class[]{Canvas.class}, Void.TYPE);
        } else if (this.f76395c == 0 || Build.VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
        } else {
            if (this.f76394b == null && this.f76395c > 0) {
                int width = getWidth();
                int height = getHeight();
                if (width > 0 && height > 0) {
                    this.f76394b = new Path();
                    this.f76394b.addRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), new float[]{(float) this.f76395c, (float) this.f76395c, (float) this.f76395c, (float) this.f76395c, (float) this.f76395c, (float) this.f76395c, (float) this.f76395c, (float) this.f76395c}, Path.Direction.CW);
                }
            }
            if (this.f76394b != null) {
                canvas.clipPath(this.f76394b);
            }
            super.dispatchDraw(canvas);
        }
    }

    public RoundedFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @TargetApi(21)
    private void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76393a, false, 89605, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76393a, false, 89605, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f76395c > 0 && Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new f((float) this.f76395c, i, i2));
        }
    }

    public RoundedFrameLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.RoundedView, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f76395c = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f76393a, false, 89606, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f76393a, false, 89606, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f76395c == 0 || Build.VERSION.SDK_INT >= 21) {
            a(i, i2);
        }
    }
}
