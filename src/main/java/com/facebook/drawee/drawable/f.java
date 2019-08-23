package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;
import javax.annotation.Nullable;

public final class f extends Drawable implements Rounded {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final float[] f23729a = new float[8];
    @VisibleForTesting
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    float[] f23730b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    final Paint f23731c = new Paint(1);
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    final Path f23732d = new Path();
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    final Path f23733e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public int f23734f = 0;
    private final float[] g = new float[8];
    private boolean h = false;
    private float i = 0.0f;
    private float j = 0.0f;
    private int k = 0;
    private boolean l = false;
    private final RectF m = new RectF();
    private int n = 255;

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getAlpha() {
        return this.n;
    }

    public final int getBorderColor() {
        return this.k;
    }

    public final float getBorderWidth() {
        return this.i;
    }

    public final float getPadding() {
        return this.j;
    }

    public final float[] getRadii() {
        return this.g;
    }

    public final boolean getScaleDownInsideBorders() {
        return this.l;
    }

    public final boolean isCircle() {
        return this.h;
    }

    public final int getOpacity() {
        return DrawableUtils.getOpacityFromColor(DrawableUtils.multiplyColorAlpha(this.f23734f, this.n));
    }

    private void a() {
        float f2;
        this.f23732d.reset();
        this.f23733e.reset();
        this.m.set(getBounds());
        this.m.inset(this.i / 2.0f, this.i / 2.0f);
        if (this.h) {
            this.f23733e.addCircle(this.m.centerX(), this.m.centerY(), Math.min(this.m.width(), this.m.height()) / 2.0f, Path.Direction.CW);
        } else {
            for (int i2 = 0; i2 < this.f23729a.length; i2++) {
                this.f23729a[i2] = (this.g[i2] + this.j) - (this.i / 2.0f);
            }
            this.f23733e.addRoundRect(this.m, this.f23729a, Path.Direction.CW);
        }
        this.m.inset((-this.i) / 2.0f, (-this.i) / 2.0f);
        float f3 = this.j;
        if (this.l) {
            f2 = this.i;
        } else {
            f2 = 0.0f;
        }
        float f4 = f3 + f2;
        this.m.inset(f4, f4);
        if (this.h) {
            this.f23732d.addCircle(this.m.centerX(), this.m.centerY(), Math.min(this.m.width(), this.m.height()) / 2.0f, Path.Direction.CW);
        } else if (this.l) {
            if (this.f23730b == null) {
                this.f23730b = new float[8];
            }
            for (int i3 = 0; i3 < this.f23730b.length; i3++) {
                this.f23730b[i3] = this.g[i3] - this.i;
            }
            this.f23732d.addRoundRect(this.m, this.f23730b, Path.Direction.CW);
        } else {
            this.f23732d.addRoundRect(this.m, this.g, Path.Direction.CW);
        }
        float f5 = -f4;
        this.m.inset(f5, f5);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @TargetApi(11)
    public static f a(ColorDrawable colorDrawable) {
        return new f(colorDrawable.getColor());
    }

    public final void setAlpha(int i2) {
        if (i2 != this.n) {
            this.n = i2;
            invalidateSelf();
        }
    }

    public final void setCircle(boolean z) {
        this.h = z;
        a();
        invalidateSelf();
    }

    public final void setPadding(float f2) {
        if (this.j != f2) {
            this.j = f2;
            a();
            invalidateSelf();
        }
    }

    public final void setScaleDownInsideBorders(boolean z) {
        if (this.l != z) {
            this.l = z;
            a();
            invalidateSelf();
        }
    }

    public final void setRadius(float f2) {
        boolean z;
        if (f2 >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "radius should be non negative");
        Arrays.fill(this.g, f2);
        a();
        invalidateSelf();
    }

    public final void setRadii(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.g, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.g, 0, 8);
        }
        a();
        invalidateSelf();
    }

    private f(int i2) {
        if (this.f23734f != i2) {
            this.f23734f = i2;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        this.f23731c.setColor(DrawableUtils.multiplyColorAlpha(this.f23734f, this.n));
        this.f23731c.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.f23732d, this.f23731c);
        if (this.i != 0.0f) {
            this.f23731c.setColor(DrawableUtils.multiplyColorAlpha(this.k, this.n));
            this.f23731c.setStyle(Paint.Style.STROKE);
            this.f23731c.setStrokeWidth(this.i);
            canvas.drawPath(this.f23733e, this.f23731c);
        }
    }

    public final void setBorder(int i2, float f2) {
        if (this.k != i2) {
            this.k = i2;
            invalidateSelf();
        }
        if (this.i != f2) {
            this.i = f2;
            a();
            invalidateSelf();
        }
    }
}
