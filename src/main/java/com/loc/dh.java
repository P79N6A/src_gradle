package com.loc;

import android.text.TextUtils;

@ao(a = "a")
public class dh {

    /* renamed from: a  reason: collision with root package name */
    public String f25797a;
    @ap(a = "a1", b = 6)

    /* renamed from: b  reason: collision with root package name */
    private String f25798b;
    @ap(a = "a2", b = 6)

    /* renamed from: c  reason: collision with root package name */
    private String f25799c;
    @ap(a = "a6", b = 2)

    /* renamed from: d  reason: collision with root package name */
    private int f25800d;
    @ap(a = "a3", b = 6)

    /* renamed from: e  reason: collision with root package name */
    private String f25801e;
    @ap(a = "a4", b = 6)

    /* renamed from: f  reason: collision with root package name */
    private String f25802f;
    @ap(a = "a5", b = 6)
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String[] l;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f25803a;

        /* renamed from: b  reason: collision with root package name */
        String f25804b;

        /* renamed from: c  reason: collision with root package name */
        String f25805c;

        /* renamed from: d  reason: collision with root package name */
        String f25806d;

        /* renamed from: e  reason: collision with root package name */
        boolean f25807e = true;

        /* renamed from: f  reason: collision with root package name */
        String f25808f = "standard";
        String[] g;

        public a(String str, String str2, String str3) {
            this.f25803a = str2;
            this.f25804b = str2;
            this.f25806d = str3;
            this.f25805c = str;
        }

        public final a a(String[] strArr) {
            this.g = (String[]) strArr.clone();
            return this;
        }

        public final dh a() throws cx {
            if (this.g != null) {
                return new dh(this, (byte) 0);
            }
            throw new cx("sdk packages is null");
        }
    }

    private dh() {
        this.f25800d = 1;
    }

    /* synthetic */ dh(a aVar, byte b2) {
        this(aVar);
    }

    private static String a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (String append : strArr) {
                sb.append(append);
                sb.append(";");
            }
            return sb.toString();
        } catch (Throwable th) {
            com.google.a.a.a.a.a.a.b(th);
            return null;
        }
    }

    private static String[] a(String str) {
        try {
            return str.split(";");
        } catch (Throwable th) {
            com.google.a.a.a.a.a.a.b(th);
            return null;
        }
    }

    public final String a() {
        if (TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.f25798b)) {
            this.j = di.c(this.f25798b);
        }
        return this.j;
    }

    public final void a(boolean z) {
        this.f25800d = z ? 1 : 0;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.f25799c)) {
            this.h = di.c(this.f25799c);
        }
        return this.h;
    }

    public final String c() {
        if (TextUtils.isEmpty(this.k) && !TextUtils.isEmpty(this.g)) {
            this.k = di.c(this.g);
        }
        if (TextUtils.isEmpty(this.k)) {
            this.k = "standard";
        }
        return this.k;
    }

    public final boolean d() {
        return this.f25800d == 1;
    }

    public final String[] e() {
        if ((this.l == null || this.l.length == 0) && !TextUtils.isEmpty(this.f25802f)) {
            this.l = a(di.c(this.f25802f));
        }
        return (String[]) this.l.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return getClass() == obj.getClass() && hashCode() == ((dh) obj).hashCode();
    }

    public int hashCode() {
        e eVar = new e();
        eVar.a((Object) this.j).a((Object) this.f25797a).a((Object) this.h).a((Object[]) this.l);
        return eVar.f25814a;
    }

    private dh(a aVar) {
        this.f25800d = 1;
        this.f25797a = aVar.f25803a;
        this.h = aVar.f25804b;
        this.j = aVar.f25805c;
        this.i = aVar.f25806d;
        this.f25800d = aVar.f25807e ? 1 : 0;
        this.k = aVar.f25808f;
        this.l = aVar.g;
        this.f25799c = di.b(this.h);
        this.f25798b = di.b(this.j);
        this.f25801e = di.b(this.i);
        this.f25802f = di.b(a(this.l));
        this.g = di.b(this.k);
    }
}
