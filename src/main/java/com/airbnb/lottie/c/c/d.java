package com.airbnb.lottie.c.c;

import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.c.a.j;
import com.airbnb.lottie.c.a.k;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.c.b.g;
import java.util.List;
import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.airbnb.lottie.c.b.b> f4781a;

    /* renamed from: b  reason: collision with root package name */
    public final LottieComposition f4782b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4783c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4784d;

    /* renamed from: e  reason: collision with root package name */
    public final a f4785e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4786f;
    @Nullable
    public final String g;
    public final List<g> h;
    public final l i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    final float n;
    public final int o;
    public final int p;
    @Nullable
    public final j q;
    @Nullable
    public final k r;
    @Nullable
    public final com.airbnb.lottie.c.a.b s;
    public final List<com.airbnb.lottie.g.a<Float>> t;
    public final b u;

    public enum a {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown
    }

    public enum b {
        None,
        Add,
        Invert,
        Unknown
    }

    public final String toString() {
        return a("");
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.f4783c);
        sb.append("\n");
        d layerModelForId = this.f4782b.layerModelForId(this.f4786f);
        if (layerModelForId != null) {
            sb.append("\t\tParents: ");
            sb.append(layerModelForId.f4783c);
            d layerModelForId2 = this.f4782b.layerModelForId(layerModelForId.f4786f);
            while (layerModelForId2 != null) {
                sb.append("->");
                sb.append(layerModelForId2.f4783c);
                layerModelForId2 = this.f4782b.layerModelForId(layerModelForId2.f4786f);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.h.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.h.size());
            sb.append("\n");
        }
        if (!(this.j == 0 || this.k == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l)}));
        }
        if (!this.f4781a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.airbnb.lottie.c.b.b next : this.f4781a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public d(List<com.airbnb.lottie.c.b.b> list, LottieComposition lottieComposition, String str, long j2, a aVar, long j3, @Nullable String str2, List<g> list2, l lVar, int i2, int i3, int i4, float f2, float f3, int i5, int i6, @Nullable j jVar, @Nullable k kVar, List<com.airbnb.lottie.g.a<Float>> list3, b bVar, @Nullable com.airbnb.lottie.c.a.b bVar2) {
        this.f4781a = list;
        this.f4782b = lottieComposition;
        this.f4783c = str;
        this.f4784d = j2;
        this.f4785e = aVar;
        this.f4786f = j3;
        this.g = str2;
        this.h = list2;
        this.i = lVar;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f2;
        this.n = f3;
        this.o = i5;
        this.p = i6;
        this.q = jVar;
        this.r = kVar;
        this.t = list3;
        this.u = bVar;
        this.s = bVar2;
    }
}
