package android.support.design.widget;

public final class MathUtils {
    public static boolean geq(float f2, float f3, float f4) {
        return f2 + f4 >= f3;
    }

    public static float lerp(float f2, float f3, float f4) {
        return ((1.0f - f4) * f2) + (f4 * f3);
    }

    private static float max(float f2, float f3, float f4, float f5) {
        return (f2 <= f3 || f2 <= f4 || f2 <= f5) ? (f3 <= f4 || f3 <= f5) ? f4 > f5 ? f4 : f5 : f3 : f2;
    }

    private MathUtils() {
    }

    public static float dist(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot((double) (f4 - f2), (double) (f5 - f3));
    }

    public static float distanceToFurthestCorner(float f2, float f3, float f4, float f5, float f6, float f7) {
        return max(dist(f2, f3, f4, f5), dist(f2, f3, f6, f5), dist(f2, f3, f6, f7), dist(f2, f3, f4, f7));
    }
}
