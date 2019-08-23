package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.annotation.Keep;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class RoundRectWebView extends SSWebView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean needCleanRadius;
    private Paint paint;
    private Path path;
    private float radius;
    private float radiusBottomLeft;
    private float radiusBottomRight;
    private float radiusTopLeft;
    private float radiusTopRight;
    private RectF rect;

    private void init() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3832, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3832, new Class[0], Void.TYPE);
            return;
        }
        this.path = new Path();
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(0);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public RoundRectWebView(Context context) {
        super(context);
        init();
    }

    public void setRadius(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 3833, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 3833, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.radius = f2;
        this.needCleanRadius = true;
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, changeQuickRedirect, false, 3835, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, changeQuickRedirect, false, 3835, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.radius != 0.0f) {
            this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            this.path.addRoundRect(this.rect, this.radius, this.radius, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
        } else if (this.radiusTopLeft == 0.0f && this.radiusTopRight == 0.0f && this.radiusBottomRight == 0.0f && this.radiusBottomLeft == 0.0f) {
            if (this.needCleanRadius) {
                this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
                this.path.reset();
                this.path.setFillType(Path.FillType.INVERSE_WINDING);
                this.path.addRoundRect(this.rect, 0.0f, 0.0f, Path.Direction.CW);
                canvas.drawPath(this.path, this.paint);
            }
        } else {
            this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            this.path.addRoundRect(this.rect, new float[]{this.radiusTopLeft, this.radiusTopLeft, this.radiusTopRight, this.radiusTopRight, this.radiusBottomRight, this.radiusBottomRight, this.radiusBottomLeft, this.radiusBottomLeft}, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
        }
    }

    public RoundRectWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public RoundRectWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void setRadius(float f2, float f3, float f4, float f5) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, changeQuickRedirect, false, 3834, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, changeQuickRedirect, false, 3834, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.radius = 0.0f;
        this.radiusTopLeft = f2;
        this.radiusTopRight = f3;
        this.radiusBottomRight = f4;
        this.radiusBottomLeft = f5;
        this.needCleanRadius = true;
        invalidate();
    }
}
