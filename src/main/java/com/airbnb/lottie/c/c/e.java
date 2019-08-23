package com.airbnb.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;

public final class e extends a {
    /* access modifiers changed from: package-private */
    public final void b(Canvas canvas, Matrix matrix, int i) {
    }

    e(LottieDrawable lottieDrawable, d dVar) {
        super(lottieDrawable, dVar);
    }

    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
