package com.airbnb.lottie.c.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.f.f;
import com.airbnb.lottie.i;

public final class c extends a {
    private final Paint g = new Paint(3);
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    @Nullable
    private a<ColorFilter, ColorFilter> j;

    @Nullable
    private Bitmap e() {
        return this.f4771b.getImageAsset(this.f4772c.g);
    }

    c(LottieDrawable lottieDrawable, d dVar) {
        super(lottieDrawable, dVar);
    }

    public final <T> void a(T t, @Nullable com.airbnb.lottie.g.c<T> cVar) {
        super.a(t, cVar);
        if (t == i.x) {
            if (cVar == null) {
                this.j = null;
                return;
            }
            this.j = new p(cVar);
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        Bitmap e2 = e();
        if (e2 != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) e2.getWidth()), Math.min(rectF.bottom, (float) e2.getHeight()));
            this.f4770a.mapRect(rectF);
        }
    }

    public final void b(@NonNull Canvas canvas, Matrix matrix, int i2) {
        Bitmap e2 = e();
        if (e2 != null && !e2.isRecycled()) {
            float a2 = f.a();
            this.g.setAlpha(i2);
            if (this.j != null) {
                this.g.setColorFilter((ColorFilter) this.j.d());
            }
            canvas.save();
            canvas.concat(matrix);
            this.h.set(0, 0, e2.getWidth(), e2.getHeight());
            this.i.set(0, 0, (int) (((float) e2.getWidth()) * a2), (int) (((float) e2.getHeight()) * a2));
            canvas.drawBitmap(e2, this.h, this.i, this.g);
            canvas.restore();
        }
    }
}
