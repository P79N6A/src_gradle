package android.support.design.bottomappbar;

import android.support.design.shape.EdgeTreatment;
import android.support.design.shape.ShapePath;

public class BottomAppBarTopEdgeTreatment extends EdgeTreatment {
    private float cradleVerticalOffset;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    /* access modifiers changed from: package-private */
    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    /* access modifiers changed from: package-private */
    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    /* access modifiers changed from: package-private */
    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    /* access modifiers changed from: package-private */
    public float getFabDiameter() {
        return this.fabDiameter;
    }

    /* access modifiers changed from: package-private */
    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    /* access modifiers changed from: package-private */
    public void setCradleVerticalOffset(float f2) {
        this.cradleVerticalOffset = f2;
    }

    /* access modifiers changed from: package-private */
    public void setFabCradleMargin(float f2) {
        this.fabMargin = f2;
    }

    /* access modifiers changed from: package-private */
    public void setFabCradleRoundedCornerRadius(float f2) {
        this.roundedCornerRadius = f2;
    }

    /* access modifiers changed from: package-private */
    public void setFabDiameter(float f2) {
        this.fabDiameter = f2;
    }

    /* access modifiers changed from: package-private */
    public void setHorizontalOffset(float f2) {
        this.horizontalOffset = f2;
    }

    public BottomAppBarTopEdgeTreatment(float f2, float f3, float f4) {
        this.fabMargin = f2;
        this.roundedCornerRadius = f3;
        this.cradleVerticalOffset = f4;
        if (f4 >= 0.0f) {
            this.horizontalOffset = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void getEdgePath(float f2, float f3, ShapePath shapePath) {
        float f4 = f2;
        ShapePath shapePath2 = shapePath;
        if (this.fabDiameter == 0.0f) {
            shapePath2.lineTo(f4, 0.0f);
            return;
        }
        float f5 = ((this.fabMargin * 2.0f) + this.fabDiameter) / 2.0f;
        float f6 = f3 * this.roundedCornerRadius;
        float f7 = (f4 / 2.0f) + this.horizontalOffset;
        float f8 = (this.cradleVerticalOffset * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            shapePath2.lineTo(f4, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (f10 * f10)));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f10)));
        float f13 = 90.0f - degrees;
        float f14 = f11 - f6;
        shapePath2.lineTo(f14, 0.0f);
        float f15 = f6 * 2.0f;
        float f16 = degrees;
        shapePath.addArc(f14, 0.0f, f11 + f6, f15, 270.0f, degrees);
        shapePath.addArc(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        shapePath.addArc(f12 - f6, 0.0f, f12 + f6, f15, 270.0f - f16, f16);
        shapePath2.lineTo(f4, 0.0f);
    }
}
