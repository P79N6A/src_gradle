package android.support.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

public class RectEvaluator implements TypeEvaluator<Rect> {
    private Rect mRect;

    RectEvaluator() {
    }

    RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    public Rect evaluate(float f2, Rect rect, Rect rect2) {
        int i = rect.left + ((int) (((float) (rect2.left - rect.left)) * f2));
        int i2 = rect.top + ((int) (((float) (rect2.top - rect.top)) * f2));
        int i3 = rect.right + ((int) (((float) (rect2.right - rect.right)) * f2));
        int i4 = rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f2));
        if (this.mRect == null) {
            return new Rect(i, i2, i3, i4);
        }
        this.mRect.set(i, i2, i3, i4);
        return this.mRect;
    }
}
