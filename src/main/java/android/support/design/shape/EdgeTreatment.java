package android.support.design.shape;

import android.support.design.internal.Experimental;

@Experimental("The shapes API is currently experimental and subject to change")
public class EdgeTreatment {
    public void getEdgePath(float f2, float f3, ShapePath shapePath) {
        shapePath.lineTo(f2, 0.0f);
    }
}
