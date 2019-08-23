package it.sephiroth.android.library.a;

public final class a implements b {
    public final double a(double d2, double d3, double d4, double d5) {
        double d6 = (d2 / d5) - 1.0d;
        return (d4 * ((d6 * d6 * d6) + 1.0d)) + 0.0d;
    }

    public final double b(double d2, double d3, double d4, double d5) {
        double d6 = d2 / (d5 / 2.0d);
        if (d6 < 1.0d) {
            return ((d4 / 2.0d) * d6 * d6 * d6) + 0.0d;
        }
        double d7 = d6 - 2.0d;
        return ((d4 / 2.0d) * ((d7 * d7 * d7) + 2.0d)) + 0.0d;
    }
}
