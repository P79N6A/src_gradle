package android.support.design.shape;

import android.support.design.internal.Experimental;

@Experimental("The shapes API is currently experimental and subject to change")
public class CutCornerTreatment extends CornerTreatment {
    private final float size;

    public CutCornerTreatment(float f2) {
        this.size = f2;
    }

    public void getCornerPath(float f2, float f3, ShapePath shapePath) {
        shapePath.reset(0.0f, this.size * f3);
        double d2 = (double) f2;
        double sin = Math.sin(d2);
        double d3 = (double) this.size;
        Double.isNaN(d3);
        double d4 = (double) f3;
        Double.isNaN(d4);
        double cos = Math.cos(d2);
        double d5 = (double) this.size;
        Double.isNaN(d5);
        Double.isNaN(d4);
        shapePath.lineTo((float) (sin * d3 * d4), (float) (cos * d5 * d4));
    }
}
