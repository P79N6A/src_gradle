package com.xiaomi.push;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public final class fi {

    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82017a;

        /* renamed from: a  reason: collision with other field name */
        private long f331a;

        /* renamed from: a  reason: collision with other field name */
        private String f332a = "";

        /* renamed from: a  reason: collision with other field name */
        private boolean f333a;

        /* renamed from: b  reason: collision with root package name */
        private int f82018b = 1;

        /* renamed from: b  reason: collision with other field name */
        private String f334b = "";

        /* renamed from: b  reason: collision with other field name */
        private boolean f335b;

        /* renamed from: c  reason: collision with root package name */
        private int f82019c;

        /* renamed from: c  reason: collision with other field name */
        private String f336c = "";

        /* renamed from: c  reason: collision with other field name */
        private boolean f337c;

        /* renamed from: d  reason: collision with root package name */
        private int f82020d;

        /* renamed from: d  reason: collision with other field name */
        private String f338d = "";

        /* renamed from: d  reason: collision with other field name */
        private boolean f339d;

        /* renamed from: e  reason: collision with root package name */
        private int f82021e = -1;

        /* renamed from: e  reason: collision with other field name */
        private String f340e = "";

        /* renamed from: e  reason: collision with other field name */
        private boolean f341e;

        /* renamed from: f  reason: collision with root package name */
        private String f82022f = "";

        /* renamed from: f  reason: collision with other field name */
        private boolean f342f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;

        public final int a() {
            if (this.f82021e < 0) {
                b();
            }
            return this.f82021e;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final long m236a() {
            return this.f331a;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final a m237a() {
            this.f342f = false;
            this.f338d = "";
            return this;
        }

        public final a a(int i2) {
            this.f333a = true;
            this.f82017a = i2;
            return this;
        }

        public final a a(long j2) {
            this.f335b = true;
            this.f331a = j2;
            return this;
        }

        public final a a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                switch (a2) {
                    case 0:
                        break;
                    case 8:
                        a(bVar.b());
                        continue;
                    case SearchJediMixFeedAdapter.f42514c:
                        a(bVar.b());
                        continue;
                    case 26:
                        a(bVar.a());
                        continue;
                    case 34:
                        b(bVar.a());
                        continue;
                    case 42:
                        c(bVar.a());
                        continue;
                    case 50:
                        d(bVar.a());
                        continue;
                    case 58:
                        e(bVar.a());
                        continue;
                    case 64:
                        b(bVar.b());
                        continue;
                    case 72:
                        c(bVar.b());
                        continue;
                    case 80:
                        d(bVar.b());
                        continue;
                    case 90:
                        f(bVar.a());
                        continue;
                    default:
                        if (!a(bVar, a2)) {
                            break;
                        } else {
                            continue;
                        }
                }
            }
            return this;
        }

        public final a a(String str) {
            this.f337c = true;
            this.f332a = str;
            return this;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final String m238a() {
            return this.f332a;
        }

        public final void a(c cVar) {
            if (a()) {
                cVar.a(1, c());
            }
            if (b()) {
                cVar.b(2, a());
            }
            if (c()) {
                cVar.a(3, a());
            }
            if (d()) {
                cVar.a(4, b());
            }
            if (e()) {
                cVar.a(5, c());
            }
            if (f()) {
                cVar.a(6, d());
            }
            if (g()) {
                cVar.a(7, e());
            }
            if (h()) {
                cVar.a(8, d());
            }
            if (i()) {
                cVar.a(9, e());
            }
            if (j()) {
                cVar.a(10, f());
            }
            if (k()) {
                cVar.a(11, f());
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m239a() {
            return this.f333a;
        }

        public final int b() {
            int i2 = 0;
            if (a()) {
                i2 = 0 + c.a(1, c());
            }
            if (b()) {
                i2 += c.b(2, a());
            }
            if (c()) {
                i2 += c.a(3, a());
            }
            if (d()) {
                i2 += c.a(4, b());
            }
            if (e()) {
                i2 += c.a(5, c());
            }
            if (f()) {
                i2 += c.a(6, d());
            }
            if (g()) {
                i2 += c.a(7, e());
            }
            if (h()) {
                i2 += c.a(8, d());
            }
            if (i()) {
                i2 += c.a(9, e());
            }
            if (j()) {
                i2 += c.a(10, f());
            }
            if (k()) {
                i2 += c.a(11, f());
            }
            this.f82021e = i2;
            return i2;
        }

        public final a b(int i2) {
            this.h = true;
            this.f82018b = i2;
            return this;
        }

        public final a b(String str) {
            this.f339d = true;
            this.f334b = str;
            return this;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final String m240b() {
            return this.f334b;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final boolean m241b() {
            return this.f335b;
        }

        public final int c() {
            return this.f82017a;
        }

        public final a c(int i2) {
            this.i = true;
            this.f82019c = i2;
            return this;
        }

        public final a c(String str) {
            this.f341e = true;
            this.f336c = str;
            return this;
        }

        /* renamed from: c  reason: collision with other method in class */
        public final String m242c() {
            return this.f336c;
        }

        /* renamed from: c  reason: collision with other method in class */
        public final boolean m243c() {
            return this.f337c;
        }

        public final int d() {
            return this.f82018b;
        }

        public final a d(int i2) {
            this.j = true;
            this.f82020d = i2;
            return this;
        }

        public final a d(String str) {
            this.f342f = true;
            this.f338d = str;
            return this;
        }

        /* renamed from: d  reason: collision with other method in class */
        public final String m244d() {
            return this.f338d;
        }

        /* renamed from: d  reason: collision with other method in class */
        public final boolean m245d() {
            return this.f339d;
        }

        public final int e() {
            return this.f82019c;
        }

        public final a e(String str) {
            this.g = true;
            this.f340e = str;
            return this;
        }

        /* renamed from: e  reason: collision with other method in class */
        public final String m246e() {
            return this.f340e;
        }

        /* renamed from: e  reason: collision with other method in class */
        public final boolean m247e() {
            return this.f341e;
        }

        public final int f() {
            return this.f82020d;
        }

        public final a f(String str) {
            this.k = true;
            this.f82022f = str;
            return this;
        }

        /* renamed from: f  reason: collision with other method in class */
        public final String m248f() {
            return this.f82022f;
        }

        /* renamed from: f  reason: collision with other method in class */
        public final boolean m249f() {
            return this.f342f;
        }

        public final boolean g() {
            return this.g;
        }

        public final boolean h() {
            return this.h;
        }

        public final boolean i() {
            return this.i;
        }

        public final boolean j() {
            return this.j;
        }

        public final boolean k() {
            return this.k;
        }
    }

    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82023a;

        /* renamed from: a  reason: collision with other field name */
        private boolean f343a;

        /* renamed from: b  reason: collision with root package name */
        private int f82024b;

        /* renamed from: b  reason: collision with other field name */
        private boolean f344b;

        /* renamed from: c  reason: collision with root package name */
        private int f82025c;

        /* renamed from: c  reason: collision with other field name */
        private boolean f345c;

        /* renamed from: d  reason: collision with root package name */
        private int f82026d = -1;

        /* renamed from: d  reason: collision with other field name */
        private boolean f346d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f82027e;

        public static b a(byte[] bArr) {
            return (b) new b().a(bArr);
        }

        public final int a() {
            if (this.f82026d < 0) {
                b();
            }
            return this.f82026d;
        }

        public final b a(int i) {
            this.f345c = true;
            this.f82023a = i;
            return this;
        }

        public final b a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                if (a2 == 0) {
                    break;
                } else if (a2 == 8) {
                    a(bVar.a());
                } else if (a2 == 24) {
                    a(bVar.b());
                } else if (a2 == 32) {
                    b(bVar.b());
                } else if (a2 == 40) {
                    c(bVar.b());
                } else if (!a(bVar, a2)) {
                    break;
                }
            }
            return this;
        }

        public final b a(boolean z) {
            this.f343a = true;
            this.f344b = z;
            return this;
        }

        public final void a(c cVar) {
            if (b()) {
                cVar.a(1, a());
            }
            if (c()) {
                cVar.a(3, c());
            }
            if (d()) {
                cVar.a(4, d());
            }
            if (e()) {
                cVar.a(5, e());
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m250a() {
            return this.f344b;
        }

        public final int b() {
            int i = 0;
            if (b()) {
                i = 0 + c.a(1, a());
            }
            if (c()) {
                i += c.a(3, c());
            }
            if (d()) {
                i += c.a(4, d());
            }
            if (e()) {
                i += c.a(5, e());
            }
            this.f82026d = i;
            return i;
        }

        public final b b(int i) {
            this.f346d = true;
            this.f82024b = i;
            return this;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final boolean m251b() {
            return this.f343a;
        }

        public final int c() {
            return this.f82023a;
        }

        public final b c(int i) {
            this.f82027e = true;
            this.f82025c = i;
            return this;
        }

        /* renamed from: c  reason: collision with other method in class */
        public final boolean m252c() {
            return this.f345c;
        }

        public final int d() {
            return this.f82024b;
        }

        /* renamed from: d  reason: collision with other method in class */
        public final boolean m253d() {
            return this.f346d;
        }

        public final int e() {
            return this.f82025c;
        }

        /* renamed from: e  reason: collision with other method in class */
        public final boolean m254e() {
            return this.f82027e;
        }
    }

    public static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82028a = -1;

        /* renamed from: a  reason: collision with other field name */
        private String f347a = "";

        /* renamed from: a  reason: collision with other field name */
        private boolean f348a;

        /* renamed from: b  reason: collision with root package name */
        private String f82029b = "";

        /* renamed from: b  reason: collision with other field name */
        private boolean f349b;

        /* renamed from: c  reason: collision with root package name */
        private String f82030c = "";

        /* renamed from: c  reason: collision with other field name */
        private boolean f350c;

        /* renamed from: d  reason: collision with root package name */
        private String f82031d = "";

        /* renamed from: d  reason: collision with other field name */
        private boolean f351d;

        /* renamed from: e  reason: collision with root package name */
        private String f82032e = "";

        /* renamed from: e  reason: collision with other field name */
        private boolean f352e;

        /* renamed from: f  reason: collision with root package name */
        private String f82033f = "";

        /* renamed from: f  reason: collision with other field name */
        private boolean f353f;

        public final int a() {
            if (this.f82028a < 0) {
                b();
            }
            return this.f82028a;
        }

        public final c a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                if (a2 == 0) {
                    break;
                } else if (a2 == 10) {
                    a(bVar.a());
                } else if (a2 == 18) {
                    b(bVar.a());
                } else if (a2 == 26) {
                    c(bVar.a());
                } else if (a2 == 34) {
                    d(bVar.a());
                } else if (a2 == 42) {
                    e(bVar.a());
                } else if (a2 == 50) {
                    f(bVar.a());
                } else if (!a(bVar, a2)) {
                    break;
                }
            }
            return this;
        }

        public final c a(String str) {
            this.f348a = true;
            this.f347a = str;
            return this;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final String m255a() {
            return this.f347a;
        }

        public final void a(c cVar) {
            if (a()) {
                cVar.a(1, a());
            }
            if (b()) {
                cVar.a(2, b());
            }
            if (c()) {
                cVar.a(3, c());
            }
            if (d()) {
                cVar.a(4, d());
            }
            if (e()) {
                cVar.a(5, e());
            }
            if (f()) {
                cVar.a(6, f());
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m256a() {
            return this.f348a;
        }

        public final int b() {
            int i = 0;
            if (a()) {
                i = 0 + c.a(1, a());
            }
            if (b()) {
                i += c.a(2, b());
            }
            if (c()) {
                i += c.a(3, c());
            }
            if (d()) {
                i += c.a(4, d());
            }
            if (e()) {
                i += c.a(5, e());
            }
            if (f()) {
                i += c.a(6, f());
            }
            this.f82028a = i;
            return i;
        }

        public final c b(String str) {
            this.f349b = true;
            this.f82029b = str;
            return this;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final String m257b() {
            return this.f82029b;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final boolean m258b() {
            return this.f349b;
        }

        public final c c(String str) {
            this.f350c = true;
            this.f82030c = str;
            return this;
        }

        public final String c() {
            return this.f82030c;
        }

        /* renamed from: c  reason: collision with other method in class */
        public final boolean m259c() {
            return this.f350c;
        }

        public final c d(String str) {
            this.f351d = true;
            this.f82031d = str;
            return this;
        }

        public final String d() {
            return this.f82031d;
        }

        /* renamed from: d  reason: collision with other method in class */
        public final boolean m260d() {
            return this.f351d;
        }

        public final c e(String str) {
            this.f352e = true;
            this.f82032e = str;
            return this;
        }

        public final String e() {
            return this.f82032e;
        }

        /* renamed from: e  reason: collision with other method in class */
        public final boolean m261e() {
            return this.f352e;
        }

        public final c f(String str) {
            this.f353f = true;
            this.f82033f = str;
            return this;
        }

        public final String f() {
            return this.f82033f;
        }

        /* renamed from: f  reason: collision with other method in class */
        public final boolean m262f() {
            return this.f353f;
        }
    }

    public static final class d extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82034a = -1;

        /* renamed from: a  reason: collision with other field name */
        private String f354a = "";

        /* renamed from: a  reason: collision with other field name */
        private boolean f355a;

        /* renamed from: b  reason: collision with root package name */
        private String f82035b = "";

        /* renamed from: b  reason: collision with other field name */
        private boolean f356b;

        /* renamed from: c  reason: collision with root package name */
        private String f82036c = "";

        /* renamed from: c  reason: collision with other field name */
        private boolean f357c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f82037d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f82038e;

        public static d a(byte[] bArr) {
            return (d) new d().a(bArr);
        }

        public final int a() {
            if (this.f82034a < 0) {
                b();
            }
            return this.f82034a;
        }

        public final d a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                if (a2 == 0) {
                    break;
                } else if (a2 == 8) {
                    a(bVar.a());
                } else if (a2 == 18) {
                    a(bVar.a());
                } else if (a2 == 26) {
                    b(bVar.a());
                } else if (a2 == 34) {
                    c(bVar.a());
                } else if (!a(bVar, a2)) {
                    break;
                }
            }
            return this;
        }

        public final d a(String str) {
            this.f357c = true;
            this.f354a = str;
            return this;
        }

        public final d a(boolean z) {
            this.f355a = true;
            this.f356b = z;
            return this;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final String m263a() {
            return this.f354a;
        }

        public final void a(c cVar) {
            if (b()) {
                cVar.a(1, a());
            }
            if (c()) {
                cVar.a(2, a());
            }
            if (d()) {
                cVar.a(3, b());
            }
            if (e()) {
                cVar.a(4, c());
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m264a() {
            return this.f356b;
        }

        public final int b() {
            int i = 0;
            if (b()) {
                i = 0 + c.a(1, a());
            }
            if (c()) {
                i += c.a(2, a());
            }
            if (d()) {
                i += c.a(3, b());
            }
            if (e()) {
                i += c.a(4, c());
            }
            this.f82034a = i;
            return i;
        }

        public final d b(String str) {
            this.f82037d = true;
            this.f82035b = str;
            return this;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final String m265b() {
            return this.f82035b;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final boolean m266b() {
            return this.f355a;
        }

        public final d c(String str) {
            this.f82038e = true;
            this.f82036c = str;
            return this;
        }

        public final String c() {
            return this.f82036c;
        }

        /* renamed from: c  reason: collision with other method in class */
        public final boolean m267c() {
            return this.f357c;
        }

        public final boolean d() {
            return this.f82037d;
        }

        public final boolean e() {
            return this.f82038e;
        }
    }

    public static final class e extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82039a;

        /* renamed from: a  reason: collision with other field name */
        private b f358a;

        /* renamed from: a  reason: collision with other field name */
        private String f359a = "";

        /* renamed from: a  reason: collision with other field name */
        private boolean f360a;

        /* renamed from: b  reason: collision with root package name */
        private int f82040b;

        /* renamed from: b  reason: collision with other field name */
        private String f361b = "";

        /* renamed from: b  reason: collision with other field name */
        private boolean f362b;

        /* renamed from: c  reason: collision with root package name */
        private int f82041c;

        /* renamed from: c  reason: collision with other field name */
        private String f363c = "";

        /* renamed from: c  reason: collision with other field name */
        private boolean f364c;

        /* renamed from: d  reason: collision with root package name */
        private int f82042d = -1;

        /* renamed from: d  reason: collision with other field name */
        private String f365d = "";

        /* renamed from: d  reason: collision with other field name */
        private boolean f366d;

        /* renamed from: e  reason: collision with root package name */
        private String f82043e = "";

        /* renamed from: e  reason: collision with other field name */
        private boolean f367e;

        /* renamed from: f  reason: collision with root package name */
        private String f82044f = "";

        /* renamed from: f  reason: collision with other field name */
        private boolean f368f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;

        public final int a() {
            if (this.f82042d < 0) {
                b();
            }
            return this.f82042d;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final b m268a() {
            return this.f358a;
        }

        public final e a(int i2) {
            this.f360a = true;
            this.f82039a = i2;
            return this;
        }

        public final e a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                switch (a2) {
                    case 0:
                        break;
                    case 8:
                        a(bVar.c());
                        continue;
                    case 18:
                        a(bVar.a());
                        continue;
                    case 26:
                        b(bVar.a());
                        continue;
                    case 34:
                        c(bVar.a());
                        continue;
                    case 40:
                        b(bVar.b());
                        continue;
                    case 50:
                        d(bVar.a());
                        continue;
                    case 58:
                        e(bVar.a());
                        continue;
                    case 66:
                        f(bVar.a());
                        continue;
                    case 74:
                        b bVar2 = new b();
                        bVar.a((e) bVar2);
                        a(bVar2);
                        continue;
                    case 80:
                        c(bVar.b());
                        continue;
                    default:
                        if (!a(bVar, a2)) {
                            break;
                        } else {
                            continue;
                        }
                }
            }
            return this;
        }

        public final e a(b bVar) {
            if (bVar != null) {
                this.i = true;
                this.f358a = bVar;
                return this;
            }
            throw new NullPointerException();
        }

        public final e a(String str) {
            this.f362b = true;
            this.f359a = str;
            return this;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final String m269a() {
            return this.f359a;
        }

        public final void a(c cVar) {
            if (a()) {
                cVar.b(1, c());
            }
            if (b()) {
                cVar.a(2, a());
            }
            if (c()) {
                cVar.a(3, b());
            }
            if (d()) {
                cVar.a(4, c());
            }
            if (e()) {
                cVar.a(5, d());
            }
            if (f()) {
                cVar.a(6, d());
            }
            if (g()) {
                cVar.a(7, e());
            }
            if (h()) {
                cVar.a(8, f());
            }
            if (i()) {
                cVar.a(9, (e) a());
            }
            if (j()) {
                cVar.a(10, e());
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m270a() {
            return this.f360a;
        }

        public final int b() {
            int i2 = 0;
            if (a()) {
                i2 = 0 + c.b(1, c());
            }
            if (b()) {
                i2 += c.a(2, a());
            }
            if (c()) {
                i2 += c.a(3, b());
            }
            if (d()) {
                i2 += c.a(4, c());
            }
            if (e()) {
                i2 += c.a(5, d());
            }
            if (f()) {
                i2 += c.a(6, d());
            }
            if (g()) {
                i2 += c.a(7, e());
            }
            if (h()) {
                i2 += c.a(8, f());
            }
            if (i()) {
                i2 += c.a(9, (e) a());
            }
            if (j()) {
                i2 += c.a(10, e());
            }
            this.f82042d = i2;
            return i2;
        }

        public final e b(int i2) {
            this.f367e = true;
            this.f82040b = i2;
            return this;
        }

        public final e b(String str) {
            this.f364c = true;
            this.f361b = str;
            return this;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final String m271b() {
            return this.f361b;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final boolean m272b() {
            return this.f362b;
        }

        public final int c() {
            return this.f82039a;
        }

        public final e c(int i2) {
            this.j = true;
            this.f82041c = i2;
            return this;
        }

        public final e c(String str) {
            this.f366d = true;
            this.f363c = str;
            return this;
        }

        /* renamed from: c  reason: collision with other method in class */
        public final String m273c() {
            return this.f363c;
        }

        /* renamed from: c  reason: collision with other method in class */
        public final boolean m274c() {
            return this.f364c;
        }

        public final int d() {
            return this.f82040b;
        }

        public final e d(String str) {
            this.f368f = true;
            this.f365d = str;
            return this;
        }

        /* renamed from: d  reason: collision with other method in class */
        public final String m275d() {
            return this.f365d;
        }

        /* renamed from: d  reason: collision with other method in class */
        public final boolean m276d() {
            return this.f366d;
        }

        public final int e() {
            return this.f82041c;
        }

        public final e e(String str) {
            this.g = true;
            this.f82043e = str;
            return this;
        }

        /* renamed from: e  reason: collision with other method in class */
        public final String m277e() {
            return this.f82043e;
        }

        /* renamed from: e  reason: collision with other method in class */
        public final boolean m278e() {
            return this.f367e;
        }

        public final e f(String str) {
            this.h = true;
            this.f82044f = str;
            return this;
        }

        public final String f() {
            return this.f82044f;
        }

        /* renamed from: f  reason: collision with other method in class */
        public final boolean m279f() {
            return this.f368f;
        }

        public final boolean g() {
            return this.g;
        }

        public final boolean h() {
            return this.h;
        }

        public final boolean i() {
            return this.i;
        }

        public final boolean j() {
            return this.j;
        }
    }

    public static final class f extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82045a = -1;

        /* renamed from: a  reason: collision with other field name */
        private b f369a;

        /* renamed from: a  reason: collision with other field name */
        private String f370a = "";

        /* renamed from: a  reason: collision with other field name */
        private boolean f371a;

        /* renamed from: b  reason: collision with root package name */
        private String f82046b = "";

        /* renamed from: b  reason: collision with other field name */
        private boolean f372b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f82047c;

        public static f a(byte[] bArr) {
            return (f) new f().a(bArr);
        }

        public final int a() {
            if (this.f82045a < 0) {
                b();
            }
            return this.f82045a;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final b m280a() {
            return this.f369a;
        }

        public final f a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                if (a2 == 0) {
                    break;
                } else if (a2 == 10) {
                    a(bVar.a());
                } else if (a2 == 18) {
                    b(bVar.a());
                } else if (a2 == 26) {
                    b bVar2 = new b();
                    bVar.a((e) bVar2);
                    a(bVar2);
                } else if (!a(bVar, a2)) {
                    break;
                }
            }
            return this;
        }

        public final f a(b bVar) {
            if (bVar != null) {
                this.f82047c = true;
                this.f369a = bVar;
                return this;
            }
            throw new NullPointerException();
        }

        public final f a(String str) {
            this.f371a = true;
            this.f370a = str;
            return this;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final String m281a() {
            return this.f370a;
        }

        public final void a(c cVar) {
            if (a()) {
                cVar.a(1, a());
            }
            if (b()) {
                cVar.a(2, b());
            }
            if (c()) {
                cVar.a(3, (e) a());
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m282a() {
            return this.f371a;
        }

        public final int b() {
            int i = 0;
            if (a()) {
                i = 0 + c.a(1, a());
            }
            if (b()) {
                i += c.a(2, b());
            }
            if (c()) {
                i += c.a(3, (e) a());
            }
            this.f82045a = i;
            return i;
        }

        public final f b(String str) {
            this.f372b = true;
            this.f82046b = str;
            return this;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final String m283b() {
            return this.f82046b;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final boolean m284b() {
            return this.f372b;
        }

        public final boolean c() {
            return this.f82047c;
        }
    }

    public static final class g extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82048a = -1;

        /* renamed from: a  reason: collision with other field name */
        private String f373a = "";

        /* renamed from: a  reason: collision with other field name */
        private boolean f374a;

        /* renamed from: b  reason: collision with root package name */
        private String f82049b = "";

        /* renamed from: b  reason: collision with other field name */
        private boolean f375b;

        /* renamed from: c  reason: collision with root package name */
        private String f82050c = "";

        /* renamed from: c  reason: collision with other field name */
        private boolean f376c;

        public static g a(byte[] bArr) {
            return (g) new g().a(bArr);
        }

        public final int a() {
            if (this.f82048a < 0) {
                b();
            }
            return this.f82048a;
        }

        public final g a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                if (a2 == 0) {
                    break;
                } else if (a2 == 10) {
                    a(bVar.a());
                } else if (a2 == 18) {
                    b(bVar.a());
                } else if (a2 == 26) {
                    c(bVar.a());
                } else if (!a(bVar, a2)) {
                    break;
                }
            }
            return this;
        }

        public final g a(String str) {
            this.f374a = true;
            this.f373a = str;
            return this;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final String m285a() {
            return this.f373a;
        }

        public final void a(c cVar) {
            if (a()) {
                cVar.a(1, a());
            }
            if (b()) {
                cVar.a(2, b());
            }
            if (c()) {
                cVar.a(3, c());
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m286a() {
            return this.f374a;
        }

        public final int b() {
            int i = 0;
            if (a()) {
                i = 0 + c.a(1, a());
            }
            if (b()) {
                i += c.a(2, b());
            }
            if (c()) {
                i += c.a(3, c());
            }
            this.f82048a = i;
            return i;
        }

        public final g b(String str) {
            this.f375b = true;
            this.f82049b = str;
            return this;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final String m287b() {
            return this.f82049b;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final boolean m288b() {
            return this.f375b;
        }

        public final g c(String str) {
            this.f376c = true;
            this.f82050c = str;
            return this;
        }

        public final String c() {
            return this.f82050c;
        }

        /* renamed from: c  reason: collision with other method in class */
        public final boolean m289c() {
            return this.f376c;
        }
    }

    public static final class h extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82051a;

        /* renamed from: a  reason: collision with other field name */
        private String f377a = "";

        /* renamed from: a  reason: collision with other field name */
        private boolean f378a;

        /* renamed from: b  reason: collision with root package name */
        private int f82052b = -1;

        /* renamed from: b  reason: collision with other field name */
        private boolean f379b;

        public static h a(byte[] bArr) {
            return (h) new h().a(bArr);
        }

        public final int a() {
            if (this.f82052b < 0) {
                b();
            }
            return this.f82052b;
        }

        public final h a(int i) {
            this.f378a = true;
            this.f82051a = i;
            return this;
        }

        public final h a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                if (a2 == 0) {
                    break;
                } else if (a2 == 8) {
                    a(bVar.b());
                } else if (a2 == 18) {
                    a(bVar.a());
                } else if (!a(bVar, a2)) {
                    break;
                }
            }
            return this;
        }

        public final h a(String str) {
            this.f379b = true;
            this.f377a = str;
            return this;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final String m290a() {
            return this.f377a;
        }

        public final void a(c cVar) {
            if (a()) {
                cVar.a(1, c());
            }
            if (b()) {
                cVar.a(2, a());
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m291a() {
            return this.f378a;
        }

        public final int b() {
            int i = 0;
            if (a()) {
                i = 0 + c.a(1, c());
            }
            if (b()) {
                i += c.a(2, a());
            }
            this.f82052b = i;
            return i;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final boolean m292b() {
            return this.f379b;
        }

        public final int c() {
            return this.f82051a;
        }
    }

    public static final class i extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82053a = -1;

        /* renamed from: a  reason: collision with other field name */
        private a f380a = a.f81814a;

        /* renamed from: a  reason: collision with other field name */
        private boolean f381a;

        public static i a(byte[] bArr) {
            return (i) new i().a(bArr);
        }

        public final int a() {
            if (this.f82053a < 0) {
                b();
            }
            return this.f82053a;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final a m293a() {
            return this.f380a;
        }

        public final i a(a aVar) {
            this.f381a = true;
            this.f380a = aVar;
            return this;
        }

        public final i a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                if (a2 == 0) {
                    break;
                } else if (a2 == 10) {
                    a(bVar.a());
                } else if (!a(bVar, a2)) {
                    break;
                }
            }
            return this;
        }

        public final void a(c cVar) {
            if (a()) {
                cVar.a(1, a());
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m294a() {
            return this.f381a;
        }

        public final int b() {
            int i = 0;
            if (a()) {
                i = 0 + c.a(1, a());
            }
            this.f82053a = i;
            return i;
        }
    }

    public static final class j extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82054a = -1;

        /* renamed from: a  reason: collision with other field name */
        private a f382a = a.f81814a;

        /* renamed from: a  reason: collision with other field name */
        private b f383a;

        /* renamed from: a  reason: collision with other field name */
        private boolean f384a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f82055b;

        public static j a(byte[] bArr) {
            return (j) new j().a(bArr);
        }

        public final int a() {
            if (this.f82054a < 0) {
                b();
            }
            return this.f82054a;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final a m295a() {
            return this.f382a;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final b m296a() {
            return this.f383a;
        }

        public final j a(a aVar) {
            this.f384a = true;
            this.f382a = aVar;
            return this;
        }

        public final j a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                if (a2 == 0) {
                    break;
                } else if (a2 == 10) {
                    a(bVar.a());
                } else if (a2 == 18) {
                    b bVar2 = new b();
                    bVar.a((e) bVar2);
                    a(bVar2);
                } else if (!a(bVar, a2)) {
                    break;
                }
            }
            return this;
        }

        public final j a(b bVar) {
            if (bVar != null) {
                this.f82055b = true;
                this.f383a = bVar;
                return this;
            }
            throw new NullPointerException();
        }

        public final void a(c cVar) {
            if (a()) {
                cVar.a(1, a());
            }
            if (b()) {
                cVar.a(2, (e) a());
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m297a() {
            return this.f384a;
        }

        public final int b() {
            int i = 0;
            if (a()) {
                i = 0 + c.a(1, a());
            }
            if (b()) {
                i += c.a(2, (e) a());
            }
            this.f82054a = i;
            return i;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final boolean m298b() {
            return this.f82055b;
        }
    }

    public static final class k extends e {

        /* renamed from: a  reason: collision with root package name */
        private int f82056a;

        /* renamed from: a  reason: collision with other field name */
        private long f385a;

        /* renamed from: a  reason: collision with other field name */
        private String f386a = "";

        /* renamed from: a  reason: collision with other field name */
        private boolean f387a;

        /* renamed from: b  reason: collision with root package name */
        private int f82057b = -1;

        /* renamed from: b  reason: collision with other field name */
        private long f388b;

        /* renamed from: b  reason: collision with other field name */
        private String f389b = "";

        /* renamed from: b  reason: collision with other field name */
        private boolean f390b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f82058c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f82059d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f82060e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f82061f;
        private boolean g;

        public static k a(byte[] bArr) {
            return (k) new k().a(bArr);
        }

        public final int a() {
            if (this.f82057b < 0) {
                b();
            }
            return this.f82057b;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final long m299a() {
            return this.f385a;
        }

        public final k a(int i) {
            this.g = true;
            this.f82056a = i;
            return this;
        }

        public final k a(long j) {
            this.f82058c = true;
            this.f385a = j;
            return this;
        }

        public final k a(b bVar) {
            while (true) {
                int a2 = bVar.a();
                if (a2 == 0) {
                    break;
                } else if (a2 == 10) {
                    a(bVar.a());
                } else if (a2 == 18) {
                    b(bVar.a());
                } else if (a2 == 24) {
                    a(bVar.a());
                } else if (a2 == 32) {
                    b(bVar.a());
                } else if (a2 == 40) {
                    a(bVar.a());
                } else if (a2 == 48) {
                    a(bVar.b());
                } else if (!a(bVar, a2)) {
                    break;
                }
            }
            return this;
        }

        public final k a(String str) {
            this.f387a = true;
            this.f386a = str;
            return this;
        }

        public final k a(boolean z) {
            this.f82060e = true;
            this.f82061f = z;
            return this;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final String m300a() {
            return this.f386a;
        }

        public final void a(c cVar) {
            if (a()) {
                cVar.a(1, a());
            }
            if (b()) {
                cVar.a(2, b());
            }
            if (c()) {
                cVar.a(3, a());
            }
            if (d()) {
                cVar.a(4, b());
            }
            if (f()) {
                cVar.a(5, e());
            }
            if (g()) {
                cVar.a(6, c());
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m301a() {
            return this.f387a;
        }

        public final int b() {
            int i = 0;
            if (a()) {
                i = 0 + c.a(1, a());
            }
            if (b()) {
                i += c.a(2, b());
            }
            if (c()) {
                i += c.a(3, a());
            }
            if (d()) {
                i += c.a(4, b());
            }
            if (f()) {
                i += c.a(5, e());
            }
            if (g()) {
                i += c.a(6, c());
            }
            this.f82057b = i;
            return i;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final long m302b() {
            return this.f388b;
        }

        public final k b(long j) {
            this.f82059d = true;
            this.f388b = j;
            return this;
        }

        public final k b(String str) {
            this.f390b = true;
            this.f389b = str;
            return this;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final String m303b() {
            return this.f389b;
        }

        /* renamed from: b  reason: collision with other method in class */
        public final boolean m304b() {
            return this.f390b;
        }

        public final int c() {
            return this.f82056a;
        }

        /* renamed from: c  reason: collision with other method in class */
        public final boolean m305c() {
            return this.f82058c;
        }

        public final boolean d() {
            return this.f82059d;
        }

        public final boolean e() {
            return this.f82061f;
        }

        public final boolean f() {
            return this.f82060e;
        }

        public final boolean g() {
            return this.g;
        }
    }
}
