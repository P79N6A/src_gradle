package com.airbnb.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.n;
import com.airbnb.lottie.c.a.k;
import com.airbnb.lottie.c.b;
import com.airbnb.lottie.c.d;
import com.airbnb.lottie.f.f;
import com.airbnb.lottie.i;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class h extends a {
    private final char[] g = new char[1];
    private final RectF h = new RectF();
    private final Matrix i = new Matrix();
    private final Paint j = new Paint(1) {
        {
            setStyle(Paint.Style.FILL);
        }
    };
    private final Paint k = new Paint(1) {
        {
            setStyle(Paint.Style.STROKE);
        }
    };
    private final Map<d, List<c>> l = new HashMap();
    private final n m;
    private final LottieDrawable n;
    private final LottieComposition o;
    @Nullable
    private a<Integer, Integer> p;
    @Nullable
    private a<Integer, Integer> q;
    @Nullable
    private a<Float, Float> r;
    @Nullable
    private a<Float, Float> s;

    public final <T> void a(T t, @Nullable com.airbnb.lottie.g.c<T> cVar) {
        super.a(t, cVar);
        if (t == i.f4876a && this.p != null) {
            this.p.a(cVar);
        } else if (t == i.f4877b && this.q != null) {
            this.q.a(cVar);
        } else if (t != i.k || this.r == null) {
            if (t == i.l && this.s != null) {
                this.s.a(cVar);
            }
        } else {
            this.r.a(cVar);
        }
    }

    h(LottieDrawable lottieDrawable, d dVar) {
        super(lottieDrawable, dVar);
        this.n = lottieDrawable;
        this.o = dVar.f4782b;
        this.m = dVar.q.a();
        this.m.a((a.C0033a) this);
        a((a<?, ?>) this.m);
        k kVar = dVar.r;
        if (!(kVar == null || kVar.f4686a == null)) {
            this.p = kVar.f4686a.a();
            this.p.a((a.C0033a) this);
            a(this.p);
        }
        if (!(kVar == null || kVar.f4687b == null)) {
            this.q = kVar.f4687b.a();
            this.q.a((a.C0033a) this);
            a(this.q);
        }
        if (!(kVar == null || kVar.f4688c == null)) {
            this.r = kVar.f4688c.a();
            this.r.a((a.C0033a) this);
            a(this.r);
        }
        if (kVar != null && kVar.f4689d != null) {
            this.s = kVar.f4689d.a();
            this.s.a((a.C0033a) this);
            a(this.s);
        }
    }

    private static void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private static void a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        String str;
        List list;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        canvas.save();
        if (!this.n.useTextGlyphs()) {
            canvas.setMatrix(matrix);
        }
        b bVar = (b) this.m.d();
        com.airbnb.lottie.c.c cVar = this.o.getFonts().get(bVar.f4698b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        if (this.p != null) {
            this.j.setColor(((Integer) this.p.d()).intValue());
        } else {
            this.j.setColor(bVar.h);
        }
        if (this.q != null) {
            this.k.setColor(((Integer) this.q.d()).intValue());
        } else {
            this.k.setColor(bVar.i);
        }
        int intValue = (((Integer) this.f4775f.f4666e.d()).intValue() * 255) / 100;
        this.j.setAlpha(intValue);
        this.k.setAlpha(intValue);
        if (this.r != null) {
            this.k.setStrokeWidth(((Float) this.r.d()).floatValue());
        } else {
            this.k.setStrokeWidth(((float) bVar.j) * f.a() * f.a(matrix));
        }
        if (this.n.useTextGlyphs()) {
            float f2 = ((float) bVar.f4699c) / 100.0f;
            float a2 = f.a(matrix);
            String str2 = bVar.f4697a;
            int i3 = 0;
            while (i3 < str2.length()) {
                d dVar = (d) this.o.getCharacters().get(d.a(str2.charAt(i3), cVar.f4766a, cVar.f4768c));
                if (dVar != null) {
                    if (this.l.containsKey(dVar)) {
                        str = str2;
                        list = this.l.get(dVar);
                    } else {
                        List<com.airbnb.lottie.c.b.n> list2 = dVar.f4789a;
                        int size = list2.size();
                        list = new ArrayList(size);
                        int i4 = 0;
                        while (i4 < size) {
                            String str3 = str2;
                            list.add(new c(this.n, this, list2.get(i4)));
                            i4++;
                            str2 = str3;
                        }
                        str = str2;
                        this.l.put(dVar, list);
                    }
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        Path e2 = ((c) list.get(i5)).e();
                        e2.computeBounds(this.h, false);
                        this.i.set(matrix2);
                        this.i.preTranslate(0.0f, ((float) (-bVar.g)) * f.a());
                        this.i.preScale(f2, f2);
                        e2.transform(this.i);
                        if (bVar.k) {
                            a(e2, this.j, canvas2);
                            a(e2, this.k, canvas2);
                        } else {
                            a(e2, this.k, canvas2);
                            a(e2, this.j, canvas2);
                        }
                    }
                    float a3 = ((float) dVar.f4791c) * f2 * f.a() * a2;
                    float f3 = ((float) bVar.f4701e) / 10.0f;
                    if (this.s != null) {
                        f3 += ((Float) this.s.d()).floatValue();
                    }
                    canvas2.translate(a3 + (f3 * a2), 0.0f);
                } else {
                    str = str2;
                }
                i3++;
                str2 = str;
            }
        } else {
            a(bVar, cVar, matrix2, canvas2);
        }
        canvas.restore();
    }

    private void a(b bVar, com.airbnb.lottie.c.c cVar, Matrix matrix, Canvas canvas) {
        float a2 = f.a(matrix);
        Typeface typeface = this.n.getTypeface(cVar.f4766a, cVar.f4768c);
        if (typeface != null) {
            String str = bVar.f4697a;
            o textDelegate = this.n.getTextDelegate();
            if (textDelegate != null) {
                if (textDelegate.f4899b && textDelegate.f4898a.containsKey(str)) {
                    str = textDelegate.f4898a.get(str);
                } else if (textDelegate.f4899b) {
                    textDelegate.f4898a.put(str, str);
                }
            }
            this.j.setTypeface(typeface);
            Paint paint = this.j;
            double d2 = bVar.f4699c;
            double a3 = (double) f.a();
            Double.isNaN(a3);
            paint.setTextSize((float) (d2 * a3));
            this.k.setTypeface(this.j.getTypeface());
            this.k.setTextSize(this.j.getTextSize());
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                this.g[0] = charAt;
                if (bVar.k) {
                    a(this.g, this.j, canvas);
                    a(this.g, this.k, canvas);
                } else {
                    a(this.g, this.k, canvas);
                    a(this.g, this.j, canvas);
                }
                this.g[0] = charAt;
                float measureText = this.j.measureText(this.g, 0, 1);
                float f2 = ((float) bVar.f4701e) / 10.0f;
                if (this.s != null) {
                    f2 += ((Float) this.s.d()).floatValue();
                }
                canvas.translate(measureText + (f2 * a2), 0.0f);
            }
        }
    }
}
