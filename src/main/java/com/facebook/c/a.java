package com.facebook.c;

import android.graphics.Matrix;
import android.graphics.Path;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Path f23301a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f23302b;

    public final void a() {
        this.f23301a.reset();
        e(0.0f, 0.0f);
    }

    public a() {
        this(new Path(), new float[]{0.0f, 0.0f});
    }

    public final void a(Matrix matrix) {
        this.f23301a.transform(matrix);
        matrix.mapPoints(this.f23302b);
    }

    private a(Path path, float[] fArr) {
        this.f23301a = path;
        this.f23302b = fArr;
    }

    private void e(float f2, float f3) {
        this.f23302b[0] = f2;
        this.f23302b[1] = f3;
    }

    public final void b(float f2, float f3) {
        this.f23301a.rMoveTo(f2, f3);
        f(f2, f3);
    }

    public final void c(float f2, float f3) {
        this.f23301a.lineTo(f2, f3);
        e(f2, f3);
    }

    public final void d(float f2, float f3) {
        this.f23301a.rLineTo(f2, f3);
        f(f2, f3);
    }

    private void f(float f2, float f3) {
        float[] fArr = this.f23302b;
        fArr[0] = fArr[0] + f2;
        float[] fArr2 = this.f23302b;
        fArr2[1] = fArr2[1] + f3;
    }

    public final void a(float f2, float f3) {
        this.f23301a.moveTo(f2, f3);
        e(f2, f3);
    }

    public final void b(float f2, float f3, float f4, float f5) {
        this.f23301a.rQuadTo(f2, f3, f4, f5);
        f(f4, f5);
    }

    public final void a(float f2, float f3, float f4, float f5) {
        this.f23301a.quadTo(f2, f3, f4, f5);
        e(f4, f5);
    }

    public final void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f23301a.rCubicTo(f2, f3, f4, f5, f6, f7);
        f(f6, f7);
    }

    public final void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f23301a.cubicTo(f2, f3, f4, f5, f6, f7);
        e(f6, f7);
    }
}
