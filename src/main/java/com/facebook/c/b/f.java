package com.facebook.c.b;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.facebook.c.b.a.b;
import com.facebook.c.b.a.g;
import com.facebook.c.b.b;
import com.facebook.c.c.c;
import com.facebook.c.c.e;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f23352a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23353b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23354c;

    /* renamed from: d  reason: collision with root package name */
    public final float f23355d;

    /* renamed from: e  reason: collision with root package name */
    public final float f23356e;

    /* renamed from: f  reason: collision with root package name */
    public final List<h> f23357f;
    public final float[][][] g;
    public final int h;
    public final Paint.Cap i;
    final b j;
    final List<b> k;
    final b l;
    public final g m;
    public final String n;
    public final com.facebook.c.b.a.f o;
    private final float p;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23358a;

        /* renamed from: b  reason: collision with root package name */
        public int f23359b;

        /* renamed from: c  reason: collision with root package name */
        public int f23360c;

        /* renamed from: d  reason: collision with root package name */
        public float f23361d;

        /* renamed from: e  reason: collision with root package name */
        public float f23362e;

        /* renamed from: f  reason: collision with root package name */
        public float f23363f = Float.MAX_VALUE;
        public List<h> g;
        public float[][][] h;
        public int i;
        public Paint.Cap j = Paint.Cap.ROUND;
        public List<b> k;
        public g l;
        public String m;
    }

    public final void a(g.a aVar, float f2) {
        if (aVar != null) {
            aVar.f23326a = this.p;
            if (this.j != null) {
                this.j.f23332f.a(f2, aVar);
            }
        }
    }

    public final void a(Matrix matrix, float f2) {
        if (matrix != null) {
            matrix.reset();
            if (this.k != null) {
                if (this.l != null) {
                    ((b) this.l.f23332f).a(matrix);
                }
                int size = this.k.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.k.get(i2).f23332f.a(f2, matrix);
                }
            }
        }
    }

    public f(String str, int i2, int i3, float f2, float f3, float f4, List<h> list, float[][][] fArr, int i4, Paint.Cap cap, List<b> list2, g gVar, String str2) {
        com.facebook.c.b.a.f fVar;
        this.f23352a = str;
        this.f23353b = i2;
        this.f23354c = i3;
        this.p = f2;
        this.f23355d = f3;
        this.f23356e = f4;
        this.f23357f = e.a(list);
        this.g = (float[][][]) c.a(fArr, c.a(fArr, this.f23357f.size()), "timing_curves");
        this.h = i4;
        this.i = cap;
        this.j = com.facebook.c.c.b.a(list2, b.C0250b.STROKE_WIDTH);
        this.l = com.facebook.c.c.b.a(list2, b.C0250b.ANCHOR_POINT);
        e.a(list2, b.f23327a);
        this.k = e.a(list2);
        this.m = gVar;
        this.n = str2;
        if (this.f23357f.isEmpty()) {
            fVar = null;
        } else {
            fVar = new com.facebook.c.b.a.f(this.f23357f, this.g);
        }
        this.o = fVar;
    }
}
