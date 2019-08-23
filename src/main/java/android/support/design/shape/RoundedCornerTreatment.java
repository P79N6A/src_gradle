package android.support.design.shape;

import android.support.design.internal.Experimental;

@Experimental("The shapes API is currently experimental and subject to change")
public class RoundedCornerTreatment extends CornerTreatment {
    private final float radius;

    public RoundedCornerTreatment(float f2) {
        this.radius = f2;
    }

    public void getCornerPath(float f2, float f3, ShapePath shapePath) {
        shapePath.reset(0.0f, this.radius * f3);
        shapePath.addArc(0.0f, 0.0f, this.radius * 2.0f * f3, this.radius * 2.0f * f3, f2 + 180.0f, 90.0f);
    }
}
