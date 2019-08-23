package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.graphics.drawable.DrawableWrapper;
import com.ss.android.ugc.aweme.C0906R;

public class ShadowDrawableWrapper extends DrawableWrapper {
    static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    private boolean addPaddingForCorners = true;
    final RectF contentBounds;
    float cornerRadius;
    final Paint cornerShadowPaint;
    Path cornerShadowPath;
    private boolean dirty = true;
    final Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    public int getOpacity() {
        return -3;
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public float getMaxShadowSize() {
        return this.rawMaxShadowSize;
    }

    public float getShadowSize() {
        return this.rawShadowSize;
    }

    public float getMinHeight() {
        return (Math.max(this.rawMaxShadowSize, this.cornerRadius + ((this.rawMaxShadowSize * 1.5f) / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * 1.5f * 2.0f);
    }

    public float getMinWidth() {
        return (Math.max(this.rawMaxShadowSize, this.cornerRadius + (this.rawMaxShadowSize / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * 2.0f);
    }

    private void buildShadowCorners() {
        RectF rectF = new RectF(-this.cornerRadius, -this.cornerRadius, this.cornerRadius, this.cornerRadius);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.shadowSize, -this.shadowSize);
        if (this.cornerShadowPath == null) {
            this.cornerShadowPath = new Path();
        } else {
            this.cornerShadowPath.reset();
        }
        this.cornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
        this.cornerShadowPath.moveTo(-this.cornerRadius, 0.0f);
        this.cornerShadowPath.rLineTo(-this.shadowSize, 0.0f);
        this.cornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.cornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.cornerShadowPath.close();
        float f2 = -rectF2.top;
        if (f2 > 0.0f) {
            float f3 = this.cornerRadius / f2;
            Paint paint = this.cornerShadowPaint;
            RadialGradient radialGradient = r8;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f2, new int[]{0, this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, f3, ((1.0f - f3) / 2.0f) + f3, 1.0f}, Shader.TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        Paint paint2 = this.edgeShadowPaint;
        LinearGradient linearGradient = new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.edgeShadowPaint.setAntiAlias(false);
    }

    public void onBoundsChange(Rect rect) {
        this.dirty = true;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.addPaddingForCorners = z;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f2) {
        setShadowSize(this.rawShadowSize, f2);
    }

    public void setShadowSize(float f2) {
        setShadowSize(f2, this.rawMaxShadowSize);
    }

    private static int toEven(float f2) {
        int round = Math.round(f2);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.cornerShadowPaint.setAlpha(i);
        this.edgeShadowPaint.setAlpha(i);
    }

    public final void setRotation(float f2) {
        if (this.rotation != f2) {
            this.rotation = f2;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.dirty) {
            buildComponents(getBounds());
            this.dirty = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public void setCornerRadius(float f2) {
        float round = (float) Math.round(f2);
        if (this.cornerRadius != round) {
            this.cornerRadius = round;
            this.dirty = true;
            invalidateSelf();
        }
    }

    private void buildComponents(Rect rect) {
        float f2 = this.rawMaxShadowSize * 1.5f;
        this.contentBounds.set(((float) rect.left) + this.rawMaxShadowSize, ((float) rect.top) + f2, ((float) rect.right) - this.rawMaxShadowSize, ((float) rect.bottom) - f2);
        getWrappedDrawable().setBounds((int) this.contentBounds.left, (int) this.contentBounds.top, (int) this.contentBounds.right, (int) this.contentBounds.bottom);
        buildShadowCorners();
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) calculateVerticalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        int ceil2 = (int) Math.ceil((double) calculateHorizontalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    private void drawShadow(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.rotation, this.contentBounds.centerX(), this.contentBounds.centerY());
        float f6 = (-this.cornerRadius) - this.shadowSize;
        float f7 = this.cornerRadius;
        float f8 = f7 * 2.0f;
        if (this.contentBounds.width() - f8 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.contentBounds.height() - f8 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f9 = this.rawShadowSize - (this.rawShadowSize * 0.25f);
        float f10 = f7 / ((this.rawShadowSize - (this.rawShadowSize * 0.5f)) + f7);
        float f11 = f7 / (f9 + f7);
        float f12 = f7 / ((this.rawShadowSize - (this.rawShadowSize * 1.0f)) + f7);
        int save2 = canvas.save();
        canvas2.translate(this.contentBounds.left + f7, this.contentBounds.top + f7);
        canvas2.scale(f10, f11);
        canvas2.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z) {
            canvas2.scale(1.0f / f10, 1.0f);
            float width = this.contentBounds.width() - f8;
            float f13 = -this.cornerRadius;
            float f14 = f13;
            i2 = save2;
            f2 = f12;
            i = save;
            f3 = f11;
            canvas.drawRect(0.0f, f6, width, f14, this.edgeShadowPaint);
        } else {
            i2 = save2;
            f2 = f12;
            i = save;
            f3 = f11;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        canvas2.translate(this.contentBounds.right - f7, this.contentBounds.bottom - f7);
        float f15 = f2;
        canvas2.scale(f10, f15);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z) {
            canvas2.scale(1.0f / f10, 1.0f);
            f4 = f3;
            f5 = f15;
            canvas.drawRect(0.0f, f6, this.contentBounds.width() - f8, (-this.cornerRadius) + this.shadowSize, this.edgeShadowPaint);
        } else {
            f4 = f3;
            f5 = f15;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.contentBounds.left + f7, this.contentBounds.bottom - f7);
        canvas2.scale(f10, f5);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z2) {
            canvas2.scale(1.0f / f5, 1.0f);
            canvas.drawRect(0.0f, f6, this.contentBounds.height() - f8, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        canvas2.translate(this.contentBounds.right - f7, this.contentBounds.top + f7);
        float f16 = f4;
        canvas2.scale(f10, f16);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z2) {
            canvas2.scale(1.0f / f16, 1.0f);
            canvas.drawRect(0.0f, f6, this.contentBounds.height() - f8, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
    }

    public void setShadowSize(float f2, float f3) {
        if (f2 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float even = (float) toEven(f2);
        float even2 = (float) toEven(f3);
        if (even > even2) {
            if (!this.printedShadowClipWarning) {
                this.printedShadowClipWarning = true;
            }
            even = even2;
        }
        if (this.rawShadowSize != even || this.rawMaxShadowSize != even2) {
            this.rawShadowSize = even;
            this.rawMaxShadowSize = even2;
            this.shadowSize = (float) Math.round(even * 1.5f);
            this.maxShadowSize = even2;
            this.dirty = true;
            invalidateSelf();
        }
    }

    public static float calculateHorizontalPadding(float f2, float f3, boolean z) {
        if (!z) {
            return f2;
        }
        double d2 = (double) f2;
        double d3 = (double) f3;
        Double.isNaN(d3);
        Double.isNaN(d2);
        return (float) (d2 + ((1.0d - COS_45) * d3));
    }

    public static float calculateVerticalPadding(float f2, float f3, boolean z) {
        if (!z) {
            return f2 * 1.5f;
        }
        double d2 = (double) (f2 * 1.5f);
        double d3 = (double) f3;
        Double.isNaN(d3);
        Double.isNaN(d2);
        return (float) (d2 + ((1.0d - COS_45) * d3));
    }

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f2, float f3, float f4) {
        super(drawable);
        this.shadowStartColor = ContextCompat.getColor(context, C0906R.color.j9);
        this.shadowMiddleColor = ContextCompat.getColor(context, C0906R.color.j8);
        this.shadowEndColor = ContextCompat.getColor(context, C0906R.color.j7);
        this.cornerShadowPaint = new Paint(5);
        this.cornerShadowPaint.setStyle(Paint.Style.FILL);
        this.cornerRadius = (float) Math.round(f2);
        this.contentBounds = new RectF();
        this.edgeShadowPaint = new Paint(this.cornerShadowPaint);
        this.edgeShadowPaint.setAntiAlias(false);
        setShadowSize(f3, f4);
    }
}
