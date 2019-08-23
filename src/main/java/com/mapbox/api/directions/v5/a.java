package com.mapbox.api.directions.v5;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.api.directions.v5.b;
import com.mapbox.geojson.Point;
import java.util.List;

public final class a extends b {

    /* renamed from: e  reason: collision with root package name */
    private final String f26144e;

    /* renamed from: f  reason: collision with root package name */
    private final String f26145f;
    private final List<Point> g;
    private final String h;
    private final String i;
    private final Boolean j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final Boolean o;
    private final Boolean p;
    private final String q;
    private final String r;
    private final Boolean s;
    private final String t;
    private final Boolean u;
    private final Boolean v;
    private final String w;
    private final String x;
    private final String y;
    private final String z;

    /* renamed from: com.mapbox.api.directions.v5.a$a  reason: collision with other inner class name */
    public static final class C0297a extends b.a {

        /* renamed from: c  reason: collision with root package name */
        private String f26146c;

        /* renamed from: d  reason: collision with root package name */
        private String f26147d;

        /* renamed from: e  reason: collision with root package name */
        private List<Point> f26148e;

        /* renamed from: f  reason: collision with root package name */
        private String f26149f;
        private String g;
        private Boolean h;
        private String i;
        private String j;
        private String k;
        private String l;
        private Boolean m;
        private Boolean n;
        private String o;
        private String p;
        private Boolean q;
        private String r;
        private Boolean s;
        private Boolean t;
        private String u;
        private String v;
        private String w;
        private String x;

        /* access modifiers changed from: package-private */
        public final b a() {
            String str = "";
            if (this.f26146c == null) {
                str = str + " user";
            }
            if (this.f26147d == null) {
                str = str + " profile";
            }
            if (this.f26148e == null) {
                str = str + " coordinates";
            }
            if (this.f26149f == null) {
                str = str + " baseUrl";
            }
            if (this.g == null) {
                str = str + " accessToken";
            }
            if (str.isEmpty()) {
                a aVar = new a(this.f26146c, this.f26147d, this.f26148e, this.f26149f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, (byte) 0);
                return aVar;
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public final b.a a(String str) {
            this.f26146c = str;
            return this;
        }

        public final b.a b(String str) {
            this.f26147d = str;
            return this;
        }

        public final b.a c(String str) {
            this.f26149f = str;
            return this;
        }

        public final b.a e(String str) {
            this.i = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final b.a f(@Nullable String str) {
            this.k = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final b.a g(@Nullable String str) {
            this.l = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final b.a h(@Nullable String str) {
            this.o = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final b.a i(@Nullable String str) {
            this.w = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final b.a j(@Nullable String str) {
            this.x = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final b.a a(List<Point> list) {
            if (list != null) {
                this.f26148e = list;
                return this;
            }
            throw new NullPointerException("Null coordinates");
        }

        public final b.a d(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null accessToken");
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final String a() {
        return this.f26144e;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final String b() {
        return this.f26145f;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final List<Point> c() {
        return this.g;
    }

    @NonNull
    public final String d() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final String e() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Boolean f() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String g() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String h() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String i() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String j() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Boolean k() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Boolean l() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String m() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String n() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Boolean o() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String p() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Boolean q() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Boolean r() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String s() {
        return this.w;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String t() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String u() {
        return this.y;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String v() {
        return this.z;
    }

    public final String toString() {
        return "MapboxDirections{user=" + this.f26144e + ", profile=" + this.f26145f + ", coordinates=" + this.g + ", baseUrl=" + this.h + ", accessToken=" + this.i + ", alternatives=" + this.j + ", geometries=" + this.k + ", overview=" + this.l + ", radius=" + this.m + ", bearing=" + this.n + ", steps=" + this.o + ", continueStraight=" + this.p + ", annotation=" + this.q + ", language=" + this.r + ", roundaboutExits=" + this.s + ", clientAppName=" + this.t + ", voiceInstructions=" + this.u + ", bannerInstructions=" + this.v + ", voiceUnits=" + this.w + ", exclude=" + this.x + ", approaches=" + this.y + ", waypointNames=" + this.z + "}";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int hashCode = (((((((((this.f26144e.hashCode() ^ 1000003) * 1000003) ^ this.f26145f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        int i18 = 0;
        if (this.j == null) {
            i2 = 0;
        } else {
            i2 = this.j.hashCode();
        }
        int i19 = (hashCode ^ i2) * 1000003;
        if (this.k == null) {
            i3 = 0;
        } else {
            i3 = this.k.hashCode();
        }
        int i20 = (i19 ^ i3) * 1000003;
        if (this.l == null) {
            i4 = 0;
        } else {
            i4 = this.l.hashCode();
        }
        int i21 = (i20 ^ i4) * 1000003;
        if (this.m == null) {
            i5 = 0;
        } else {
            i5 = this.m.hashCode();
        }
        int i22 = (i21 ^ i5) * 1000003;
        if (this.n == null) {
            i6 = 0;
        } else {
            i6 = this.n.hashCode();
        }
        int i23 = (i22 ^ i6) * 1000003;
        if (this.o == null) {
            i7 = 0;
        } else {
            i7 = this.o.hashCode();
        }
        int i24 = (i23 ^ i7) * 1000003;
        if (this.p == null) {
            i8 = 0;
        } else {
            i8 = this.p.hashCode();
        }
        int i25 = (i24 ^ i8) * 1000003;
        if (this.q == null) {
            i9 = 0;
        } else {
            i9 = this.q.hashCode();
        }
        int i26 = (i25 ^ i9) * 1000003;
        if (this.r == null) {
            i10 = 0;
        } else {
            i10 = this.r.hashCode();
        }
        int i27 = (i26 ^ i10) * 1000003;
        if (this.s == null) {
            i11 = 0;
        } else {
            i11 = this.s.hashCode();
        }
        int i28 = (i27 ^ i11) * 1000003;
        if (this.t == null) {
            i12 = 0;
        } else {
            i12 = this.t.hashCode();
        }
        int i29 = (i28 ^ i12) * 1000003;
        if (this.u == null) {
            i13 = 0;
        } else {
            i13 = this.u.hashCode();
        }
        int i30 = (i29 ^ i13) * 1000003;
        if (this.v == null) {
            i14 = 0;
        } else {
            i14 = this.v.hashCode();
        }
        int i31 = (i30 ^ i14) * 1000003;
        if (this.w == null) {
            i15 = 0;
        } else {
            i15 = this.w.hashCode();
        }
        int i32 = (i31 ^ i15) * 1000003;
        if (this.x == null) {
            i16 = 0;
        } else {
            i16 = this.x.hashCode();
        }
        int i33 = (i32 ^ i16) * 1000003;
        if (this.y == null) {
            i17 = 0;
        } else {
            i17 = this.y.hashCode();
        }
        int i34 = (i33 ^ i17) * 1000003;
        if (this.z != null) {
            i18 = this.z.hashCode();
        }
        return i34 ^ i18;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f26144e.equals(bVar.a()) || !this.f26145f.equals(bVar.b()) || !this.g.equals(bVar.c()) || !this.h.equals(bVar.d()) || !this.i.equals(bVar.e()) || (this.j != null ? !this.j.equals(bVar.f()) : bVar.f() != null) || (this.k != null ? !this.k.equals(bVar.g()) : bVar.g() != null) || (this.l != null ? !this.l.equals(bVar.h()) : bVar.h() != null) || (this.m != null ? !this.m.equals(bVar.i()) : bVar.i() != null) || (this.n != null ? !this.n.equals(bVar.j()) : bVar.j() != null) || (this.o != null ? !this.o.equals(bVar.k()) : bVar.k() != null) || (this.p != null ? !this.p.equals(bVar.l()) : bVar.l() != null) || (this.q != null ? !this.q.equals(bVar.m()) : bVar.m() != null) || (this.r != null ? !this.r.equals(bVar.n()) : bVar.n() != null) || (this.s != null ? !this.s.equals(bVar.o()) : bVar.o() != null) || (this.t != null ? !this.t.equals(bVar.p()) : bVar.p() != null) || (this.u != null ? !this.u.equals(bVar.q()) : bVar.q() != null) || (this.v != null ? !this.v.equals(bVar.r()) : bVar.r() != null) || (this.w != null ? !this.w.equals(bVar.s()) : bVar.s() != null) || (this.x != null ? !this.x.equals(bVar.t()) : bVar.t() != null) || (this.y != null ? !this.y.equals(bVar.u()) : bVar.u() != null) || (this.z != null ? !this.z.equals(bVar.v()) : bVar.v() != null)) {
            return false;
        }
        return true;
    }

    private a(String str, String str2, List<Point> list, String str3, String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str9, @Nullable String str10, @Nullable Boolean bool4, @Nullable String str11, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15) {
        this.f26144e = str;
        this.f26145f = str2;
        this.g = list;
        this.h = str3;
        this.i = str4;
        this.j = bool;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = bool2;
        this.p = bool3;
        this.q = str9;
        this.r = str10;
        this.s = bool4;
        this.t = str11;
        this.u = bool5;
        this.v = bool6;
        this.w = str12;
        this.x = str13;
        this.y = str14;
        this.z = str15;
    }

    /* synthetic */ a(String str, String str2, List list, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, Boolean bool2, Boolean bool3, String str9, String str10, Boolean bool4, String str11, Boolean bool5, Boolean bool6, String str12, String str13, String str14, String str15, byte b2) {
        this(str, str2, list, str3, str4, bool, str5, str6, str7, str8, bool2, bool3, str9, str10, bool4, str11, bool5, bool6, str12, str13, str14, str15);
    }
}
