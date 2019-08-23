package com.airbnb.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.i;

public final class g extends a {
    private final RectF g = new RectF();
    private final Paint h = new Paint();
    private final float[] i = new float[8];
    private final Path j = new Path();
    private final d k;
    @Nullable
    private a<ColorFilter, ColorFilter> l;

    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.g.set(0.0f, 0.0f, (float) this.k.j, (float) this.k.k);
        this.f4770a.mapRect(this.g);
        rectF.set(this.g);
    }

    g(LottieDrawable lottieDrawable, d dVar) {
        super(lottieDrawable, dVar);
        this.k = dVar;
        this.h.setAlpha(0);
        this.h.setStyle(Paint.Style.FILL);
        this.h.setColor(dVar.l);
    }

    public final <T> void a(T t, @Nullable c<T> cVar) {
        super.a(t, cVar);
        if (t == i.x) {
            if (cVar == null) {
                this.l = null;
                return;
            }
            this.l = new p(cVar);
        }
    }

    public final void b(Canvas canvas, Matrix matrix, int i2) {
        int alpha = Color.alpha(this.k.l);
        if (alpha != 0) {
            int intValue = (int) ((((float) i2) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) ((Integer) this.f4775f.f4666e.d()).intValue())) / 100.0f) * 255.0f);
            this.h.setAlpha(intValue);
            if (this.l != null) {
                this.h.setColorFilter((ColorFilter) this.l.d());
            }
            if (intValue > 0) {
                this.i[0] = 0.0f;
                this.i[1] = 0.0f;
                this.i[2] = (float) this.k.j;
                this.i[3] = 0.0f;
                this.i[4] = (float) this.k.j;
                this.i[5] = (float) this.k.k;
                this.i[6] = 0.0f;
                this.i[7] = (float) this.k.k;
                matrix.mapPoints(this.i);
                this.j.reset();
                this.j.moveTo(this.i[0], this.i[1]);
                this.j.lineTo(this.i[2], this.i[3]);
                this.j.lineTo(this.i[4], this.i[5]);
                this.j.lineTo(this.i[6], this.i[7]);
                this.j.lineTo(this.i[0], this.i[1]);
                this.j.close();
                canvas.drawPath(this.j, this.h);
            }
        }
    }
}
