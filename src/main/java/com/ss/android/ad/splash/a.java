package com.ss.android.ad.splash;

import android.net.Uri;
import com.ss.android.ad.splash.utils.g;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f22768a;

    /* renamed from: b  reason: collision with root package name */
    public String f22769b;

    /* renamed from: c  reason: collision with root package name */
    public String f22770c;

    /* renamed from: d  reason: collision with root package name */
    public String f22771d;

    /* renamed from: e  reason: collision with root package name */
    public long f22772e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22773f = true;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;

    /* renamed from: com.ss.android.ad.splash.a$a  reason: collision with other inner class name */
    public static class C0240a {

        /* renamed from: a  reason: collision with root package name */
        public String f22774a;

        /* renamed from: b  reason: collision with root package name */
        public String f22775b;

        /* renamed from: c  reason: collision with root package name */
        public String f22776c;

        /* renamed from: d  reason: collision with root package name */
        public String f22777d;

        /* renamed from: e  reason: collision with root package name */
        public String f22778e;

        /* renamed from: f  reason: collision with root package name */
        public String f22779f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public long m;
        public String n;
        public String o;
        public String p;
        public String q;
        public String r;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (!g.a(this.f22770c)) {
            sb.append("&channel=");
            sb.append(Uri.encode(this.f22770c));
        }
        if (!g.a(this.f22768a)) {
            sb.append("&aid=");
            sb.append(Uri.encode(this.f22768a));
        }
        if (!g.a(this.s)) {
            sb.append("&gaid=");
            sb.append(Uri.encode(this.s));
        }
        if (!g.a(this.f22769b)) {
            sb.append("&app_name=");
            sb.append(Uri.encode(this.f22769b));
        }
        if (!g.a(this.i)) {
            sb.append("&update_version_code=");
            sb.append(Uri.encode(this.i));
        }
        if (!g.a(this.g)) {
            sb.append("&version_code=");
            sb.append(Uri.encode(this.g));
        }
        if (!g.a(this.h)) {
            sb.append("&version_name=");
            sb.append(Uri.encode(this.h));
        }
        if (!g.a(this.j)) {
            sb.append("&manifest_version_code=");
            sb.append(Uri.encode(this.j));
        }
        sb.append("&language=");
        if (g.a(this.k)) {
            str = "zh";
        } else {
            str = Uri.encode(this.k);
        }
        sb.append(str);
        if (!g.a(this.l)) {
            sb.append("&iid=");
            sb.append(Uri.encode(this.l));
        }
        if (!g.a(this.f22771d)) {
            sb.append("&device_id=");
            sb.append(Uri.encode(this.f22771d));
        }
        if (!g.a(this.n)) {
            sb.append("&openudid=");
            sb.append(Uri.encode(this.n));
        }
        if (!g.a(this.m)) {
            sb.append("&uuid=");
            sb.append(Uri.encode(this.m));
        }
        if (this.f22773f) {
            if (!g.a(this.o)) {
                sb.append("&ab_version=");
                sb.append(Uri.encode(this.o));
            }
            if (!g.a(this.p)) {
                sb.append("&ab_client=");
                sb.append(Uri.encode(this.p));
            }
            if (!g.a(this.q)) {
                sb.append("&ab_group=");
                sb.append(Uri.encode(this.q));
            }
            if (!g.a(this.r)) {
                sb.append("&ab_feature=");
                sb.append(Uri.encode(this.r));
            }
        }
        return sb.toString();
    }

    public a(C0240a aVar) {
        if (aVar != null) {
            this.f22768a = aVar.f22774a;
            this.f22769b = aVar.f22775b;
            this.g = aVar.f22776c;
            this.h = aVar.f22777d;
            this.i = aVar.f22778e;
            this.f22770c = aVar.f22779f;
            this.j = aVar.g;
            this.k = aVar.h;
            this.l = aVar.i;
            this.f22771d = aVar.j;
            this.n = aVar.k;
            this.m = aVar.l;
            this.o = aVar.n;
            this.p = aVar.o;
            this.q = aVar.p;
            this.r = aVar.q;
            this.s = aVar.r;
            this.f22772e = aVar.m;
        }
    }
}
