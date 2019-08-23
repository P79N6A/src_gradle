package android.support.design.shape;

import android.support.design.internal.Experimental;

@Experimental("The shapes API is currently experimental and subject to change")
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f2, boolean z) {
        this.size = f2;
        this.inside = z;
    }

    public void getEdgePath(float f2, float f3, ShapePath shapePath) {
        float f4;
        float f5 = f2 / 2.0f;
        shapePath.lineTo(f5 - (this.size * f3), 0.0f);
        if (this.inside) {
            f4 = this.size;
        } else {
            f4 = -this.size;
        }
        shapePath.lineTo(f5, f4 * f3);
        shapePath.lineTo(f5 + (this.size * f3), 0.0f);
        shapePath.lineTo(f2, 0.0f);
    }
}
