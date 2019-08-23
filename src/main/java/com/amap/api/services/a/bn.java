package com.amap.api.services.a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

@cf(a = "a")
public class bn {
    @cg(a = "a1", b = 6)

    /* renamed from: a  reason: collision with root package name */
    private String f6644a;
    @cg(a = "a2", b = 6)

    /* renamed from: b  reason: collision with root package name */
    private String f6645b;
    @cg(a = "a6", b = 2)

    /* renamed from: c  reason: collision with root package name */
    private int f6646c;
    @cg(a = "a3", b = 6)

    /* renamed from: d  reason: collision with root package name */
    private String f6647d;
    @cg(a = "a4", b = 6)

    /* renamed from: e  reason: collision with root package name */
    private String f6648e;
    @cg(a = "a5", b = 6)

    /* renamed from: f  reason: collision with root package name */
    private String f6649f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String[] l;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f6650a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f6651b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f6652c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f6653d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f6654e = true;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f6655f = "standard";
        /* access modifiers changed from: private */
        public String[] g;

        public bn a() throws be {
            if (this.g != null) {
                return new bn(this);
            }
            throw new be("sdk packages is null");
        }

        public a a(String str) {
            this.f6651b = str;
            return this;
        }

        public a a(boolean z) {
            this.f6654e = z;
            return this;
        }

        public a a(String[] strArr) {
            this.g = (String[]) strArr.clone();
            return this;
        }

        public a(String str, String str2, String str3) {
            this.f6650a = str2;
            this.f6651b = str2;
            this.f6653d = str3;
            this.f6652c = str;
        }
    }

    public static String g() {
        return "a6=1";
    }

    public String b() {
        return this.g;
    }

    private bn() {
        this.f6646c = 1;
    }

    public boolean e() {
        if (this.f6646c == 1) {
            return true;
        }
        return false;
    }

    public String c() {
        if (TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.f6645b)) {
            this.h = bo.c(this.f6645b);
        }
        return this.h;
    }

    public String d() {
        if (TextUtils.isEmpty(this.k) && !TextUtils.isEmpty(this.f6649f)) {
            this.k = bo.c(this.f6649f);
        }
        if (TextUtils.isEmpty(this.k)) {
            this.k = "standard";
        }
        return this.k;
    }

    public String[] f() {
        if ((this.l == null || this.l.length == 0) && !TextUtils.isEmpty(this.f6648e)) {
            this.l = b(bo.c(this.f6648e));
        }
        return (String[]) this.l.clone();
    }

    public int hashCode() {
        bw bwVar = new bw();
        bwVar.a((Object) this.j).a((Object) this.g).a((Object) this.h).a((Object[]) this.l);
        return bwVar.a();
    }

    public String a() {
        if (TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.f6644a)) {
            this.j = bo.c(this.f6644a);
        }
        return this.j;
    }

    private String[] b(String str) {
        try {
            return str.split(";");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("a1", bo.b(str));
        return ce.a((Map<String, String>) hashMap);
    }

    private String a(String[] strArr) {
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
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (getClass() == obj.getClass() && hashCode() == ((bn) obj).hashCode()) {
            return true;
        }
        return false;
    }

    private bn(a aVar) {
        this.f6646c = 1;
        this.g = aVar.f6650a;
        this.h = aVar.f6651b;
        this.j = aVar.f6652c;
        this.i = aVar.f6653d;
        this.f6646c = aVar.f6654e ? 1 : 0;
        this.k = aVar.f6655f;
        this.l = aVar.g;
        this.f6645b = bo.b(this.h);
        this.f6644a = bo.b(this.j);
        this.f6647d = bo.b(this.i);
        this.f6648e = bo.b(a(this.l));
        this.f6649f = bo.b(this.k);
    }
}
