package com.facebook.c;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import com.facebook.c.b;
import com.facebook.c.b.a.c;
import com.facebook.c.b.a.g;
import com.facebook.c.b.f;
import com.facebook.c.b.i;
import com.facebook.c.b.k;
import com.facebook.c.d;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class c extends Drawable implements b, d.b {

    /* renamed from: a  reason: collision with root package name */
    public final k f23391a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<Matrix> f23392b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f23393c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, a> f23394d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f23395e = new Paint(1);

    /* renamed from: f  reason: collision with root package name */
    private final List<b> f23396f;
    private final d g;
    private final Matrix h;
    private final Matrix i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float n;
    private boolean o;
    private WeakReference<C0251c> p;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Drawable f23397a;

        /* renamed from: b  reason: collision with root package name */
        final Matrix f23398b;

        public a(Drawable drawable, Matrix matrix) {
            this.f23398b = matrix;
            this.f23397a = drawable;
        }
    }

    class b {

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ boolean f23399f = (!c.class.desiredAssertionStatus());

        /* renamed from: a  reason: collision with root package name */
        final f f23400a;

        /* renamed from: b  reason: collision with root package name */
        public final a f23401b;

        /* renamed from: c  reason: collision with root package name */
        final Matrix f23402c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f23403d;

        /* renamed from: e  reason: collision with root package name */
        public Shader f23404e;
        private final g.a h;
        private final float[] i = new float[9];
        private Shader[] j;

        public final int b() {
            return this.f23400a.f23354c;
        }

        public final int c() {
            return this.f23400a.f23353b;
        }

        private boolean e() {
            a d2 = d();
            if (d2 == null || d2.f23397a == null) {
                return false;
            }
            return true;
        }

        public final float a() {
            if (this.h != null) {
                return this.h.a();
            }
            return 0.0f;
        }

        public final a d() {
            if (c.this.f23394d == null) {
                return null;
            }
            return c.this.f23394d.get(this.f23400a.n);
        }

        private float a(Matrix matrix) {
            matrix.getValues(this.i);
            return (Math.abs(this.i[0]) + Math.abs(this.i[4])) / 2.0f;
        }

        private Shader b(float f2) {
            if (this.j == null) {
                return null;
            }
            return this.j[(int) ((f2 / ((float) c.this.f23391a.f23380b)) * ((float) (this.j.length - 1)))];
        }

        private void a(f fVar) {
            if (this.j == null) {
                int i2 = c.this.f23391a.f23379a;
                float f2 = (float) c.this.f23391a.f23380b;
                int round = Math.round((30.0f * f2) / ((float) i2));
                this.j = new LinearGradient[(round + 1)];
                c.a aVar = new c.a();
                i iVar = fVar.m.f23364a;
                for (int i3 = 0; i3 < round; i3++) {
                    float f3 = (((float) i3) / ((float) round)) * f2;
                    iVar.f23371a.a(f3, aVar);
                    iVar.f23372b.a(f3, aVar);
                    Shader[] shaderArr = this.j;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, c.this.f23391a.f23383e[1], aVar.f23317a, aVar.f23318b, Shader.TileMode.CLAMP);
                    shaderArr[i3] = linearGradient;
                }
            }
        }

        public final void a(float f2) {
            if (f2 < this.f23400a.f23355d || f2 > this.f23400a.f23356e) {
                this.f23403d = false;
                return;
            }
            this.f23403d = true;
            this.f23400a.a(this.f23402c, f2);
            Matrix matrix = c.this.f23392b.get(this.f23400a.h);
            if (matrix != null && !matrix.isIdentity()) {
                this.f23402c.postConcat(matrix);
            }
            com.facebook.c.b.a.f fVar = this.f23400a.o;
            if (!e() && fVar != null) {
                this.f23401b.a();
                fVar.a(f2, this.f23401b);
                this.f23401b.a(this.f23402c);
                this.f23400a.a(this.h, f2);
                this.h.a(a(this.f23402c));
                if (this.f23400a.m != null) {
                    a(this.f23400a);
                }
                this.f23404e = b(f2);
            }
        }

        public b(f fVar) {
            this.f23400a = fVar;
            if (e()) {
                this.f23401b = null;
                this.h = null;
                this.f23402c = new Matrix();
            } else {
                this.f23401b = new a();
                this.h = new g.a();
                this.f23402c = c.this.f23393c;
            }
            if (!f23399f && this.f23402c == null) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: com.facebook.c.c$c  reason: collision with other inner class name */
    public interface C0251c {
        void a();
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void a() {
        this.g.c();
    }

    public final void b() {
        this.g.d();
    }

    public final void c() {
        this.g.f23413a = true;
    }

    public final void d() {
        if (this.p != null) {
            C0251c cVar = (C0251c) this.p.get();
            if (cVar != null) {
                cVar.a();
                this.p.clear();
            }
        }
    }

    public final void a(float f2) {
        b(f2);
        invalidateSelf();
    }

    public final void a(C0251c cVar) {
        this.p = new WeakReference<>(cVar);
    }

    private void b(float f2) {
        this.o = true;
        this.f23391a.a(this.f23392b, f2);
        int size = this.f23396f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f23396f.get(i2).a(f2);
        }
    }

    c(e eVar) {
        Map<String, a> map;
        d dVar;
        boolean z = true;
        this.o = false;
        this.f23391a = eVar.f23421a;
        if (eVar.f23423c.f23424a == null) {
            map = null;
        } else {
            map = Collections.unmodifiableMap(eVar.f23423c.f23424a);
        }
        this.f23394d = map;
        this.f23393c = new Matrix();
        this.h = new Matrix();
        this.i = new Matrix();
        k kVar = this.f23391a;
        if (Build.VERSION.SDK_INT < 16 ? false : z) {
            dVar = new d.a(this, kVar.f23379a, kVar.f23380b, (byte) 0);
        } else {
            dVar = new d.c(this, kVar.f23379a, kVar.f23380b, (byte) 0);
        }
        this.g = dVar;
        this.f23395e.setStrokeCap(Paint.Cap.ROUND);
        ArrayList arrayList = new ArrayList();
        int size = this.f23391a.f23381c.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new b(this.f23391a.f23381c.get(i2)));
        }
        this.f23396f = Collections.unmodifiableList(arrayList);
        this.f23392b = new SparseArray<>();
        List<com.facebook.c.b.d> list = this.f23391a.f23382d;
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            this.f23392b.put(list.get(i3).f23341a, new Matrix());
        }
        this.g.f23414b = (long) (PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE / eVar.f23422b);
    }

    public void draw(Canvas canvas) {
        Matrix matrix;
        boolean z;
        Rect bounds = getBounds();
        canvas.translate((float) bounds.left, (float) bounds.top);
        int size = this.f23396f.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f23396f.get(i2);
            if (bVar.f23403d) {
                a d2 = bVar.d();
                if (bVar.f23402c == c.this.f23393c) {
                    matrix = null;
                } else {
                    matrix = bVar.f23402c;
                }
                if (d2 == null || d2.f23397a == null || matrix == null) {
                    a aVar = bVar.f23401b;
                    if (aVar != null && !aVar.f23301a.isEmpty()) {
                        this.f23395e.setShader(null);
                        this.f23395e.setStrokeCap(bVar.f23400a.i);
                        if (bVar.c() != 0) {
                            this.f23395e.setStyle(Paint.Style.FILL);
                            if (bVar.f23404e == null) {
                                this.f23395e.setColor(bVar.c());
                                aVar.a(this.h);
                                canvas.drawPath(aVar.f23301a, this.f23395e);
                                aVar.a(this.i);
                            } else {
                                this.f23395e.setShader(bVar.f23404e);
                                canvas.concat(this.h);
                                canvas.drawPath(aVar.f23301a, this.f23395e);
                                canvas.concat(this.i);
                            }
                        }
                        if (bVar.b() != 0 && bVar.a() > 0.0f) {
                            this.f23395e.setColor(bVar.b());
                            this.f23395e.setStyle(Paint.Style.STROKE);
                            this.f23395e.setStrokeWidth(bVar.a() * this.l * this.m * this.n);
                            aVar.a(this.h);
                            canvas.drawPath(aVar.f23301a, this.f23395e);
                            aVar.a(this.i);
                        }
                    }
                } else {
                    canvas.save();
                    canvas.concat(this.h);
                    canvas.concat(matrix);
                    if (d2.f23398b == null || d2.f23398b.isIdentity()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        canvas.save();
                        canvas.concat(d2.f23398b);
                    }
                    d2.f23397a.draw(canvas);
                    if (z) {
                        canvas.restore();
                    }
                    canvas.restore();
                }
            }
        }
        canvas.translate((float) (-bounds.left), (float) (-bounds.top));
    }

    public void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        this.j = i4 - i2;
        this.k = i5 - i3;
        this.l = Math.min(((float) this.j) / this.f23391a.f23383e[0], ((float) this.k) / this.f23391a.f23383e[1]);
        b.a aVar = b.a.UP;
        if (!(this.m == 1.0f && this.n == 1.0f)) {
            this.h.setScale(this.l, this.l);
            this.m = 1.0f;
            this.n = 1.0f;
            this.h.invert(this.i);
        }
        if (!this.o) {
            b(0.0f);
        }
    }
}
