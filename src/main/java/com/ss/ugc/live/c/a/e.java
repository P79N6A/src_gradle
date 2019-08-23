package com.ss.ugc.live.c.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.ss.ugc.live.c.a.a.b;

public final class e {
    boolean A;
    boolean B;
    String C;
    String D;
    AssetManager E;
    Object F;
    String G;

    /* renamed from: a  reason: collision with root package name */
    Context f78728a;

    /* renamed from: b  reason: collision with root package name */
    String f78729b;

    /* renamed from: c  reason: collision with root package name */
    int f78730c;

    /* renamed from: d  reason: collision with root package name */
    int f78731d;

    /* renamed from: e  reason: collision with root package name */
    int f78732e;

    /* renamed from: f  reason: collision with root package name */
    int f78733f;
    int g;
    int h;
    int i;
    int j;
    int k;
    boolean l;
    int m;
    int n;
    long o;
    int p;
    int q;
    com.ss.ugc.live.c.a.a.a r;
    com.ss.ugc.live.c.a.b.a s;
    b t;
    Intent u;
    int v;
    int w;
    float x;
    boolean y = true;
    int z;

    public static class a {
        com.ss.ugc.live.c.a.a.a A;
        com.ss.ugc.live.c.a.b.a B;
        AssetManager C;
        public String D;
        public Object E;
        public int F;
        public int G;

        /* renamed from: a  reason: collision with root package name */
        Context f78734a;

        /* renamed from: b  reason: collision with root package name */
        String f78735b;

        /* renamed from: c  reason: collision with root package name */
        int f78736c;

        /* renamed from: d  reason: collision with root package name */
        int f78737d;

        /* renamed from: e  reason: collision with root package name */
        int f78738e;

        /* renamed from: f  reason: collision with root package name */
        int f78739f;
        int g;
        int h;
        int i;
        boolean j;
        int k;
        int l;
        public long m;
        int n;
        int o;
        public Intent p;
        int q;
        public b r;
        public int s;
        String t;
        public float u;
        public boolean v;
        public int w;
        public boolean x;
        public boolean y;
        String z;

        public final e a() {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            long j2;
            int i9;
            String str;
            int i10;
            int i11;
            String str2;
            float f2;
            String str3;
            if (this.f78737d == 0) {
                i2 = 500;
            } else {
                i2 = this.f78737d;
            }
            this.f78737d = i2;
            if (this.f78738e == 0) {
                i3 = 200;
            } else {
                i3 = this.f78738e;
            }
            this.f78738e = i3;
            if (this.f78739f == 0) {
                i4 = 800;
            } else {
                i4 = this.f78739f;
            }
            this.f78739f = i4;
            if (this.h == 0) {
                i5 = 360;
            } else {
                i5 = this.h;
            }
            this.h = i5;
            if (this.i == 0) {
                i6 = 640;
            } else {
                i6 = this.i;
            }
            this.i = i6;
            if (this.g == 0) {
                i7 = 15;
            } else {
                i7 = this.g;
            }
            this.g = i7;
            if (this.l == 0) {
                i8 = 9;
            } else {
                i8 = this.l;
            }
            this.l = i8;
            if (this.m == 0) {
                j2 = 60000;
            } else {
                j2 = this.m;
            }
            this.m = j2;
            if (this.n == 0) {
                i9 = 44100;
            } else {
                i9 = this.n;
            }
            this.n = i9;
            int i12 = 2;
            int i13 = 1;
            if (this.o != 2) {
                i12 = 1;
            }
            this.o = i12;
            if (TextUtils.isEmpty(this.f78735b)) {
                str = "";
            } else {
                str = this.f78735b;
            }
            this.f78735b = str;
            if (this.k == 0) {
                i10 = 1;
            } else {
                i10 = Math.min(this.k, 3);
            }
            this.k = i10;
            if (this.q == 0) {
                i11 = 4;
            } else {
                i11 = this.q;
            }
            this.q = i11;
            if ("".equals(this.t)) {
                str2 = "live-stream-sdk";
            } else {
                str2 = this.t;
            }
            this.t = str2;
            if (this.w != 0) {
                i13 = this.w;
            }
            this.w = i13;
            if (this.u == 0.0f) {
                f2 = 2.0f;
            } else {
                f2 = this.u;
            }
            this.u = f2;
            if (this.z == null) {
                str3 = "";
            } else {
                str3 = this.z;
            }
            this.z = str3;
            return new e(this);
        }

        public final a a(int i2) {
            this.f78736c = i2;
            return this;
        }

        public final a b(int i2) {
            this.f78737d = i2;
            return this;
        }

        public final a c(int i2) {
            this.f78738e = i2;
            return this;
        }

        public final a d(int i2) {
            this.f78739f = i2;
            return this;
        }

        public final a e(int i2) {
            this.g = i2;
            return this;
        }

        public final a f(int i2) {
            this.h = i2;
            return this;
        }

        public final a g(int i2) {
            this.i = i2;
            return this;
        }

        public final a h(int i2) {
            this.k = i2;
            return this;
        }

        public final a i(int i2) {
            this.o = i2;
            return this;
        }

        public final a j(int i2) {
            this.q = i2;
            return this;
        }

        public a(Context context) {
            this.f78734a = context;
        }

        public final a a(com.ss.ugc.live.c.a.a.a aVar) {
            this.A = aVar;
            return this;
        }

        public final a b(String str) {
            this.z = str;
            return this;
        }

        public final a a(com.ss.ugc.live.c.a.b.a aVar) {
            this.B = aVar;
            return this;
        }

        public final a a(String str) {
            this.t = str;
            return this;
        }

        public final a a(boolean z2) {
            this.j = z2;
            return this;
        }
    }

    e(a aVar) {
        this.f78728a = aVar.f78734a;
        this.f78729b = aVar.f78735b;
        this.f78730c = aVar.f78736c;
        this.f78731d = aVar.f78737d;
        this.f78732e = aVar.f78738e;
        this.f78733f = aVar.f78739f;
        this.g = aVar.g;
        this.j = aVar.h;
        this.k = aVar.i;
        this.l = aVar.j;
        this.m = aVar.k;
        this.n = aVar.l;
        this.o = aVar.m;
        this.p = aVar.n;
        this.q = aVar.o;
        this.r = aVar.A;
        this.t = aVar.r;
        this.s = aVar.B;
        this.u = aVar.p;
        this.v = aVar.q;
        this.w = aVar.s;
        this.C = aVar.t;
        this.x = aVar.u;
        this.y = aVar.v;
        this.z = aVar.w;
        this.A = aVar.x;
        this.B = aVar.y;
        this.D = aVar.z;
        this.E = aVar.C;
        this.G = aVar.D;
        this.F = aVar.E;
        this.i = aVar.G;
        this.h = aVar.F;
    }
}
