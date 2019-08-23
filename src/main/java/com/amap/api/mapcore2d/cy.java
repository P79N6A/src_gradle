package com.amap.api.mapcore2d;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

@dn(a = "a")
public class cy {
    @Cdo(a = "a1", b = 6)

    /* renamed from: a  reason: collision with root package name */
    private String f5903a;
    @Cdo(a = "a2", b = 6)

    /* renamed from: b  reason: collision with root package name */
    private String f5904b;
    @Cdo(a = "a6", b = 2)

    /* renamed from: c  reason: collision with root package name */
    private int f5905c;
    @Cdo(a = "a3", b = 6)

    /* renamed from: d  reason: collision with root package name */
    private String f5906d;
    @Cdo(a = "a4", b = 6)

    /* renamed from: e  reason: collision with root package name */
    private String f5907e;
    @Cdo(a = "a5", b = 6)

    /* renamed from: f  reason: collision with root package name */
    private String f5908f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String[] l;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f5909a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f5910b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f5911c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f5912d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f5913e = true;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f5914f = "standard";
        /* access modifiers changed from: private */
        public String[] g;

        public cy a() throws co {
            if (this.g != null) {
                return new cy(this);
            }
            throw new co("sdk packages is null");
        }

        public a a(String str) {
            this.f5910b = str;
            return this;
        }

        public a a(String[] strArr) {
            this.g = (String[]) strArr.clone();
            return this;
        }

        public a(String str, String str2, String str3) {
            this.f5909a = str2;
            this.f5910b = str2;
            this.f5912d = str3;
            this.f5911c = str;
        }
    }

    public static String h() {
        return "a6=1";
    }

    public String b() {
        return this.g;
    }

    private cy() {
        this.f5905c = 1;
    }

    public boolean f() {
        if (this.f5905c == 1) {
            return true;
        }
        return false;
    }

    public String c() {
        if (TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.f5904b)) {
            this.h = cz.c(this.f5904b);
        }
        return this.h;
    }

    public String d() {
        if (TextUtils.isEmpty(this.i) && !TextUtils.isEmpty(this.f5906d)) {
            this.i = cz.c(this.f5906d);
        }
        return this.i;
    }

    public String e() {
        if (TextUtils.isEmpty(this.k) && !TextUtils.isEmpty(this.f5908f)) {
            this.k = cz.c(this.f5908f);
        }
        if (TextUtils.isEmpty(this.k)) {
            this.k = "standard";
        }
        return this.k;
    }

    public String[] g() {
        if ((this.l == null || this.l.length == 0) && !TextUtils.isEmpty(this.f5907e)) {
            this.l = b(cz.c(this.f5907e));
        }
        return (String[]) this.l.clone();
    }

    public int hashCode() {
        dc dcVar = new dc();
        dcVar.a((Object) this.j).a((Object) this.g).a((Object) this.h).a((Object[]) this.l);
        return dcVar.a();
    }

    public String a() {
        if (TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.f5903a)) {
            this.j = cz.c(this.f5903a);
        }
        return this.j;
    }

    public void a(boolean z) {
        this.f5905c = z ? 1 : 0;
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
        hashMap.put("a1", cz.b(str));
        return dm.a((Map<String, String>) hashMap);
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
        if (getClass() == obj.getClass() && hashCode() == ((cy) obj).hashCode()) {
            return true;
        }
        return false;
    }

    private cy(a aVar) {
        this.f5905c = 1;
        this.g = aVar.f5909a;
        this.h = aVar.f5910b;
        this.j = aVar.f5911c;
        this.i = aVar.f5912d;
        this.f5905c = aVar.f5913e ? 1 : 0;
        this.k = aVar.f5914f;
        this.l = aVar.g;
        this.f5904b = cz.b(this.h);
        this.f5903a = cz.b(this.j);
        this.f5906d = cz.b(this.i);
        this.f5907e = cz.b(a(this.l));
        this.f5908f = cz.b(this.k);
    }
}
