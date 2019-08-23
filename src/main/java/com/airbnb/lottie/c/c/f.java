package com.airbnb.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.c.b.n;
import com.airbnb.lottie.c.e;
import java.util.Collections;
import java.util.List;

public final class f extends a {
    private final c g;

    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.g.a(rectF, this.f4770a);
    }

    f(LottieDrawable lottieDrawable, d dVar) {
        super(lottieDrawable, dVar);
        this.g = new c(lottieDrawable, this, new n("__container", dVar.f4781a));
        this.g.a(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: package-private */
    public final void b(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.g.a(canvas, matrix, i);
    }

    /* access modifiers changed from: protected */
    public final void b(e eVar, int i, List<e> list, e eVar2) {
        this.g.a(eVar, i, list, eVar2);
    }
}
