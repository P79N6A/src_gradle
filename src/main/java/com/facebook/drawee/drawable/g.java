package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;
import javax.annotation.Nullable;

public final class g extends ForwardingDrawable implements Rounded {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    a f23735a = a.OVERLAY_COLOR;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final float[] f23736b = new float[8];
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    final Paint f23737c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    public int f23738d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f23739e = new RectF();
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private RectF f23740f;
    @Nullable
    private Matrix g;
    private final float[] h = new float[8];
    private boolean i = false;
    private float j = 0.0f;
    private int k = 0;
    private float l = 0.0f;
    private boolean m = false;
    private final Path n = new Path();
    private final Path o = new Path();
    private final RectF p = new RectF();

    public enum a {
        OVERLAY_COLOR,
        CLIPPING
    }

    public final int getBorderColor() {
        return this.k;
    }

    public final float getBorderWidth() {
        return this.j;
    }

    public final float getPadding() {
        return this.l;
    }

    public final float[] getRadii() {
        return this.h;
    }

    public final boolean getScaleDownInsideBorders() {
        return this.m;
    }

    public final boolean isCircle() {
        return this.i;
    }

    private void a() {
        this.n.reset();
        this.o.reset();
        this.p.set(getBounds());
        this.p.inset(this.l, this.l);
        this.n.addRect(this.p, Path.Direction.CW);
        if (this.i) {
            this.n.addCircle(this.p.centerX(), this.p.centerY(), Math.min(this.p.width(), this.p.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.n.addRoundRect(this.p, this.h, Path.Direction.CW);
        }
        this.p.inset(-this.l, -this.l);
        this.p.inset(this.j / 2.0f, this.j / 2.0f);
        if (this.i) {
            this.o.addCircle(this.p.centerX(), this.p.centerY(), Math.min(this.p.width(), this.p.height()) / 2.0f, Path.Direction.CW);
        } else {
            for (int i2 = 0; i2 < this.f23736b.length; i2++) {
                this.f23736b[i2] = (this.h[i2] + this.l) - (this.j / 2.0f);
            }
            this.o.addRoundRect(this.p, this.f23736b, Path.Direction.CW);
        }
        this.p.inset((-this.j) / 2.0f, (-this.j) / 2.0f);
    }

    public final void a(int i2) {
        this.f23738d = i2;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    public final void setCircle(boolean z) {
        this.i = z;
        a();
        invalidateSelf();
    }

    public final void setPadding(float f2) {
        this.l = f2;
        a();
        invalidateSelf();
    }

    public final void setRadius(float f2) {
        Arrays.fill(this.h, f2);
        a();
        invalidateSelf();
    }

    public final void setScaleDownInsideBorders(boolean z) {
        this.m = z;
        a();
        invalidateSelf();
    }

    public final void setRadii(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.h, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.h, 0, 8);
        }
        a();
        invalidateSelf();
    }

    public g(Drawable drawable) {
        super((Drawable) Preconditions.checkNotNull(drawable));
    }

    public final void draw(Canvas canvas) {
        this.f23739e.set(getBounds());
        switch (this.f23735a) {
            case CLIPPING:
                int save = canvas.save();
                this.n.setFillType(Path.FillType.EVEN_ODD);
                canvas.clipPath(this.n);
                super.draw(canvas);
                canvas.restoreToCount(save);
                break;
            case OVERLAY_COLOR:
                if (this.m) {
                    if (this.f23740f == null) {
                        this.f23740f = new RectF(this.f23739e);
                        this.g = new Matrix();
                    } else {
                        this.f23740f.set(this.f23739e);
                    }
                    this.f23740f.inset(this.j, this.j);
                    this.g.setRectToRect(this.f23739e, this.f23740f, Matrix.ScaleToFit.FILL);
                    int save2 = canvas.save();
                    canvas.clipRect(this.f23739e);
                    canvas.concat(this.g);
                    super.draw(canvas);
                    canvas.restoreToCount(save2);
                } else {
                    super.draw(canvas);
                }
                this.f23737c.setStyle(Paint.Style.FILL);
                this.f23737c.setColor(this.f23738d);
                this.f23737c.setStrokeWidth(0.0f);
                this.n.setFillType(Path.FillType.EVEN_ODD);
                canvas.drawPath(this.n, this.f23737c);
                if (this.i) {
                    float width = ((this.f23739e.width() - this.f23739e.height()) + this.j) / 2.0f;
                    float height = ((this.f23739e.height() - this.f23739e.width()) + this.j) / 2.0f;
                    if (width > 0.0f) {
                        Canvas canvas2 = canvas;
                        canvas2.drawRect(this.f23739e.left, this.f23739e.top, this.f23739e.left + width, this.f23739e.bottom, this.f23737c);
                        canvas2.drawRect(this.f23739e.right - width, this.f23739e.top, this.f23739e.right, this.f23739e.bottom, this.f23737c);
                    }
                    if (height > 0.0f) {
                        Canvas canvas3 = canvas;
                        canvas3.drawRect(this.f23739e.left, this.f23739e.top, this.f23739e.right, this.f23739e.top + height, this.f23737c);
                        canvas3.drawRect(this.f23739e.left, this.f23739e.bottom - height, this.f23739e.right, this.f23739e.bottom, this.f23737c);
                        break;
                    }
                }
                break;
        }
        if (this.k != 0) {
            this.f23737c.setStyle(Paint.Style.STROKE);
            this.f23737c.setColor(this.k);
            this.f23737c.setStrokeWidth(this.j);
            this.n.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.o, this.f23737c);
        }
    }

    public final void setBorder(int i2, float f2) {
        this.k = i2;
        this.j = f2;
        a();
        invalidateSelf();
    }
}
