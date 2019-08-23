package com.facebook.c.b.a;

import android.graphics.Matrix;
import com.facebook.c.b.a;

public final class b extends e<a, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final float f23314a;

    /* renamed from: b  reason: collision with root package name */
    public final float f23315b;

    public final void a(Matrix matrix) {
        matrix.postTranslate(-this.f23314a, -this.f23315b);
    }

    public b(float f2, float f3) {
        this.f23314a = f2;
        this.f23315b = f3;
    }

    public final /* synthetic */ void a(float f2, Object obj) {
        throw new NoSuchMethodError("Anchor point currently has no keyframing ability");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(a aVar, a aVar2, float f2, Object obj) {
        throw new NoSuchMethodError("Anchor point currently has no keyframing ability");
    }
}
