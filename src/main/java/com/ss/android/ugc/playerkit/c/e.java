package com.ss.android.ugc.playerkit.c;

import android.content.Context;
import com.ss.android.ugc.playerkit.a.d;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final d<f> f77718a;

    /* renamed from: b  reason: collision with root package name */
    public final d<Boolean> f77719b;

    /* renamed from: c  reason: collision with root package name */
    public Context f77720c;

    /* renamed from: d  reason: collision with root package name */
    public final String f77721d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f77722e;

    /* renamed from: f  reason: collision with root package name */
    public final b f77723f;
    public final boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k = 1;
    public d<Integer> l;
    public final String m;
    public String n;
    public boolean o;
    public boolean p;
    public f q;
    public boolean r;
    public int s;
    public boolean t;

    public final boolean b() {
        if (this.f77719b == null) {
            return false;
        }
        return ((Boolean) this.f77719b.a()).booleanValue();
    }

    public final f a() {
        if (this.q == null) {
            this.q = (f) this.f77718a.a();
        }
        if (a.r().k() && this.q != null) {
            this.h = this.q.f77726c;
        }
        return this.q;
    }

    public String toString() {
        return "PrepareData{id='" + this.f77721d + '\'' + ", isRenderReady=" + this.f77722e + ", config=" + this.f77723f + ", vr=" + this.g + ", h265=" + this.h + ", isCurPlayer=" + this.o + ", isPrepareCallback=" + this.p + ", processUrlData=" + this.q + ", isAsyncInit=" + this.r + ", framesWait=" + this.k + ", cacheKey=" + this.n + '}';
    }

    public e(d<f> dVar, d<Boolean> dVar2, Context context, String str, boolean z, b bVar, boolean z2, boolean z3, int i2, d<Integer> dVar3, String str2, boolean z4, boolean z5, boolean z6, int i3) {
        this.f77718a = dVar;
        this.f77719b = dVar2;
        this.f77720c = context;
        this.f77721d = str;
        this.f77722e = z;
        this.f77723f = bVar;
        this.g = z2;
        this.h = z3;
        this.i = i2;
        this.l = dVar3;
        this.m = str2;
        this.o = z4;
        this.p = z5;
        this.r = z6;
        this.j = i3;
    }
}
