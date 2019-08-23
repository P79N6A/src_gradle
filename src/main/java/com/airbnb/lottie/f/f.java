package com.airbnb.lottie.f;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.annotation.Nullable;
import com.airbnb.lottie.a.a.r;
import com.airbnb.lottie.d;
import java.io.Closeable;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final PathMeasure f4847a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    private static final Path f4848b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private static final Path f4849c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private static final float[] f4850d = new float[4];

    /* renamed from: e  reason: collision with root package name */
    private static final float f4851e = ((float) Math.sqrt(2.0d));

    /* renamed from: f  reason: collision with root package name */
    private static float f4852f = -1.0f;

    public static float a() {
        if (f4852f == -1.0f) {
            f4852f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f4852f;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float a(Matrix matrix) {
        f4850d[0] = 0.0f;
        f4850d[1] = 0.0f;
        f4850d[2] = f4851e;
        f4850d[3] = f4851e;
        matrix.mapPoints(f4850d);
        return ((float) Math.hypot((double) (f4850d[2] - f4850d[0]), (double) (f4850d[3] - f4850d[1]))) / 2.0f;
    }

    public static void a(Path path, @Nullable r rVar) {
        if (rVar != null) {
            a(path, ((Float) rVar.f4639b.d()).floatValue() / 100.0f, ((Float) rVar.f4640c.d()).floatValue() / 100.0f, ((Float) rVar.f4641d.d()).floatValue() / 360.0f);
        }
    }

    public static void a(Path path, float f2, float f3, float f4) {
        d.b("applyTrimPathIfNeeded");
        f4847a.setPath(path, false);
        float length = f4847a.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            d.c("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f3 - f2) - 1.0f)) < 0.01d) {
            d.c("applyTrimPathIfNeeded");
        } else {
            float f5 = f2 * length;
            float f6 = f3 * length;
            float f7 = f4 * length;
            float min = Math.min(f5, f6) + f7;
            float max = Math.max(f5, f6) + f7;
            if (min >= length && max >= length) {
                min = (float) e.a(min, length);
                max = (float) e.a(max, length);
            }
            if (min < 0.0f) {
                min = (float) e.a(min, length);
            }
            if (max < 0.0f) {
                max = (float) e.a(max, length);
            }
            if (min == max) {
                path.reset();
                d.c("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length;
            }
            f4848b.reset();
            f4847a.getSegment(min, max, f4848b, true);
            if (max > length) {
                f4849c.reset();
                f4847a.getSegment(0.0f, max % length, f4849c, true);
                f4848b.addPath(f4849c);
            } else if (min < 0.0f) {
                f4849c.reset();
                f4847a.getSegment(min + length, length, f4849c, true);
                f4848b.addPath(f4849c);
            }
            path.set(f4848b);
            d.c("applyTrimPathIfNeeded");
        }
    }
}
