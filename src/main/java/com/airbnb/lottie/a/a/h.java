package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.util.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.b.c;
import com.airbnb.lottie.c.b.e;
import com.airbnb.lottie.c.b.f;

public final class h extends a {

    /* renamed from: b  reason: collision with root package name */
    private final String f4597b;

    /* renamed from: c  reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f4598c = new LongSparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f4599d = new LongSparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f4600e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final f f4601f;
    private final int g;
    private final a<c, c> h;
    private final a<PointF, PointF> i;
    private final a<PointF, PointF> j;

    public final String b() {
        return this.f4597b;
    }

    private int c() {
        int i2;
        int round = Math.round(this.i.f4646c * ((float) this.g));
        int round2 = Math.round(this.j.f4646c * ((float) this.g));
        int round3 = Math.round(this.h.f4646c * ((float) this.g));
        if (round != 0) {
            i2 = round * 527;
        } else {
            i2 = 17;
        }
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        if (round3 != 0) {
            return i2 * 31 * round3;
        }
        return i2;
    }

    public h(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, e eVar) {
        super(lottieDrawable, aVar, eVar.h.toPaintCap(), eVar.i.toPaintJoin(), eVar.j, eVar.f4718d, eVar.g, eVar.k, eVar.l);
        this.f4597b = eVar.f4715a;
        this.f4601f = eVar.f4716b;
        this.g = (int) (lottieDrawable.getComposition().getDuration() / 32.0f);
        this.h = eVar.f4717c.a();
        this.h.a((a.C0033a) this);
        aVar.a(this.h);
        this.i = eVar.f4719e.a();
        this.i.a((a.C0033a) this);
        aVar.a(this.i);
        this.j = eVar.f4720f.a();
        this.j.a((a.C0033a) this);
        aVar.a(this.j);
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        a(this.f4600e, matrix);
        if (this.f4601f == f.Linear) {
            Paint paint = this.f4565a;
            long c2 = (long) c();
            LinearGradient linearGradient = (LinearGradient) this.f4598c.get(c2);
            if (linearGradient == null) {
                PointF pointF = (PointF) this.i.d();
                PointF pointF2 = (PointF) this.j.d();
                c cVar = (c) this.h.d();
                LinearGradient linearGradient2 = new LinearGradient((float) ((int) (this.f4600e.left + (this.f4600e.width() / 2.0f) + pointF.x)), (float) ((int) (this.f4600e.top + (this.f4600e.height() / 2.0f) + pointF.y)), (float) ((int) (this.f4600e.left + (this.f4600e.width() / 2.0f) + pointF2.x)), (float) ((int) (this.f4600e.top + (this.f4600e.height() / 2.0f) + pointF2.y)), cVar.f4708b, cVar.f4707a, Shader.TileMode.CLAMP);
                this.f4598c.put(c2, linearGradient2);
                linearGradient = linearGradient2;
            }
            paint.setShader(linearGradient);
        } else {
            Paint paint2 = this.f4565a;
            long c3 = (long) c();
            RadialGradient radialGradient = (RadialGradient) this.f4599d.get(c3);
            if (radialGradient == null) {
                PointF pointF3 = (PointF) this.i.d();
                PointF pointF4 = (PointF) this.j.d();
                c cVar2 = (c) this.h.d();
                int[] iArr = cVar2.f4708b;
                float[] fArr = cVar2.f4707a;
                int width = (int) (this.f4600e.left + (this.f4600e.width() / 2.0f) + pointF3.x);
                int height = (int) (this.f4600e.top + (this.f4600e.height() / 2.0f) + pointF3.y);
                RadialGradient radialGradient2 = new RadialGradient((float) width, (float) height, (float) Math.hypot((double) (((int) ((this.f4600e.left + (this.f4600e.width() / 2.0f)) + pointF4.x)) - width), (double) (((int) ((this.f4600e.top + (this.f4600e.height() / 2.0f)) + pointF4.y)) - height)), iArr, fArr, Shader.TileMode.CLAMP);
                this.f4599d.put(c3, radialGradient2);
                radialGradient = radialGradient2;
            }
            paint2.setShader(radialGradient);
        }
        super.a(canvas, matrix, i2);
    }
}
