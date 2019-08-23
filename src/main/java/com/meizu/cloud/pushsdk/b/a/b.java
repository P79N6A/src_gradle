package com.meizu.cloud.pushsdk.b.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.meizu.cloud.pushsdk.b.a.b;
import com.meizu.cloud.pushsdk.b.c.b;
import com.meizu.cloud.pushsdk.b.c.c;
import com.meizu.cloud.pushsdk.b.c.f;
import com.meizu.cloud.pushsdk.b.c.g;
import com.meizu.cloud.pushsdk.b.c.h;
import com.meizu.cloud.pushsdk.b.c.j;
import com.meizu.cloud.pushsdk.b.c.k;
import com.meizu.cloud.pushsdk.b.g.f;
import com.meizu.cloud.pushsdk.b.g.l;
import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public class b<T extends b> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26857a = "b";
    private static final g w = g.a("application/json; charset=utf-8");
    private static final g x = g.a("text/x-markdown; charset=utf-8");
    private static final Object z = new Object();
    private com.meizu.cloud.pushsdk.b.c.a A;
    /* access modifiers changed from: private */
    public int B;
    /* access modifiers changed from: private */
    public boolean C;
    private int D;
    /* access modifiers changed from: private */
    public com.meizu.cloud.pushsdk.b.d.a E;
    private Bitmap.Config F;
    private int G;
    private int H;
    private ImageView.ScaleType I;
    private Executor J;
    private String K;
    private Type L;

    /* renamed from: b  reason: collision with root package name */
    private int f26858b;

    /* renamed from: c  reason: collision with root package name */
    private d f26859c;

    /* renamed from: d  reason: collision with root package name */
    private int f26860d;

    /* renamed from: e  reason: collision with root package name */
    private String f26861e;

    /* renamed from: f  reason: collision with root package name */
    private int f26862f;
    private Object g;
    private e h;
    private HashMap<String, String> i;
    private HashMap<String, String> j;
    private HashMap<String, String> k;
    private HashMap<String, String> l;
    private HashMap<String, String> m;
    private HashMap<String, String> n;
    private HashMap<String, File> o;
    private String p;
    private String q;
    private JSONObject r;
    private JSONArray s;
    private String t;
    private byte[] u;
    private File v;
    private g y;

    public static class a<T extends a> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public d f26865a = d.MEDIUM;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f26866b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Object f26867c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public HashMap<String, String> f26868d = new HashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public HashMap<String, String> f26869e = new HashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, String> f26870f = new HashMap<>();
        /* access modifiers changed from: private */
        public String g;
        /* access modifiers changed from: private */
        public String h;
        /* access modifiers changed from: private */
        public int i = 0;
        /* access modifiers changed from: private */
        public Executor j;
        /* access modifiers changed from: private */
        public String k;

        public a(String str, String str2, String str3) {
            this.f26866b = str;
            this.g = str2;
            this.h = str3;
        }

        public b a() {
            return new b(this);
        }
    }

    /* renamed from: com.meizu.cloud.pushsdk.b.a.b$b  reason: collision with other inner class name */
    public static class C0312b<T extends C0312b> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public d f26871a = d.MEDIUM;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f26872b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f26873c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Object f26874d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Bitmap.Config f26875e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f26876f;
        /* access modifiers changed from: private */
        public int g;
        /* access modifiers changed from: private */
        public ImageView.ScaleType h;
        /* access modifiers changed from: private */
        public HashMap<String, String> i = new HashMap<>();
        /* access modifiers changed from: private */
        public HashMap<String, String> j = new HashMap<>();
        /* access modifiers changed from: private */
        public HashMap<String, String> k = new HashMap<>();
        /* access modifiers changed from: private */
        public Executor l;
        /* access modifiers changed from: private */
        public String m;

        public C0312b(String str) {
            this.f26873c = str;
            this.f26872b = 0;
        }

        public T a(HashMap<String, String> hashMap) {
            if (hashMap != null) {
                for (Map.Entry next : hashMap.entrySet()) {
                    this.j.put(next.getKey(), next.getValue());
                }
            }
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    public static class c<T extends c> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public d f26877a = d.MEDIUM;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f26878b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Object f26879c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public HashMap<String, String> f26880d = new HashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public HashMap<String, String> f26881e = new HashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, String> f26882f = new HashMap<>();
        /* access modifiers changed from: private */
        public HashMap<String, String> g = new HashMap<>();
        /* access modifiers changed from: private */
        public HashMap<String, File> h = new HashMap<>();
        /* access modifiers changed from: private */
        public int i = 0;
        /* access modifiers changed from: private */
        public Executor j;
        /* access modifiers changed from: private */
        public String k;
        /* access modifiers changed from: private */
        public String l;

        public c(String str) {
            this.f26878b = str;
        }

        public T a(String str, File file) {
            this.h.put(str, file);
            return this;
        }

        public T a(HashMap<String, String> hashMap) {
            if (hashMap != null) {
                for (Map.Entry next : hashMap.entrySet()) {
                    this.f26881e.put(next.getKey(), next.getValue());
                }
            }
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    public static class d<T extends d> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public d f26883a = d.MEDIUM;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f26884b = 1;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f26885c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Object f26886d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public JSONObject f26887e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public JSONArray f26888f;
        /* access modifiers changed from: private */
        public String g;
        /* access modifiers changed from: private */
        public byte[] h;
        /* access modifiers changed from: private */
        public File i;
        /* access modifiers changed from: private */
        public HashMap<String, String> j = new HashMap<>();
        /* access modifiers changed from: private */
        public HashMap<String, String> k = new HashMap<>();
        /* access modifiers changed from: private */
        public HashMap<String, String> l = new HashMap<>();
        /* access modifiers changed from: private */
        public HashMap<String, String> m = new HashMap<>();
        /* access modifiers changed from: private */
        public HashMap<String, String> n = new HashMap<>();
        /* access modifiers changed from: private */
        public Executor o;
        /* access modifiers changed from: private */
        public String p;
        /* access modifiers changed from: private */
        public String q;

        public d(String str) {
            this.f26885c = str;
            this.f26884b = 1;
        }

        public T a(HashMap<String, String> hashMap) {
            if (hashMap != null) {
                for (Map.Entry next : hashMap.entrySet()) {
                    this.k.put(next.getKey(), next.getValue());
                }
            }
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    public b(a aVar) {
        this.i = new HashMap<>();
        this.j = new HashMap<>();
        this.k = new HashMap<>();
        this.l = new HashMap<>();
        this.m = new HashMap<>();
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.y = null;
        this.D = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.f26860d = 1;
        this.f26858b = 0;
        this.f26859c = aVar.f26865a;
        this.f26861e = aVar.f26866b;
        this.g = aVar.f26867c;
        this.p = aVar.g;
        this.q = aVar.h;
        this.i = aVar.f26868d;
        this.m = aVar.f26869e;
        this.n = aVar.f26870f;
        this.D = aVar.i;
        this.J = aVar.j;
        this.K = aVar.k;
    }

    public b(C0312b bVar) {
        this.i = new HashMap<>();
        this.j = new HashMap<>();
        this.k = new HashMap<>();
        this.l = new HashMap<>();
        this.m = new HashMap<>();
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.y = null;
        this.D = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.f26860d = 0;
        this.f26858b = bVar.f26872b;
        this.f26859c = bVar.f26871a;
        this.f26861e = bVar.f26873c;
        this.g = bVar.f26874d;
        this.i = bVar.i;
        this.F = bVar.f26875e;
        this.H = bVar.g;
        this.G = bVar.f26876f;
        this.I = bVar.h;
        this.m = bVar.j;
        this.n = bVar.k;
        this.J = bVar.l;
        this.K = bVar.m;
    }

    public b(c cVar) {
        this.i = new HashMap<>();
        this.j = new HashMap<>();
        this.k = new HashMap<>();
        this.l = new HashMap<>();
        this.m = new HashMap<>();
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.y = null;
        this.D = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.f26860d = 2;
        this.f26858b = 1;
        this.f26859c = cVar.f26877a;
        this.f26861e = cVar.f26878b;
        this.g = cVar.f26879c;
        this.i = cVar.f26880d;
        this.m = cVar.f26882f;
        this.n = cVar.g;
        this.l = cVar.f26881e;
        this.o = cVar.h;
        this.D = cVar.i;
        this.J = cVar.j;
        this.K = cVar.k;
        if (cVar.l != null) {
            this.y = g.a(cVar.l);
        }
    }

    public b(d dVar) {
        this.i = new HashMap<>();
        this.j = new HashMap<>();
        this.k = new HashMap<>();
        this.l = new HashMap<>();
        this.m = new HashMap<>();
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.y = null;
        this.D = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.f26860d = 0;
        this.f26858b = dVar.f26884b;
        this.f26859c = dVar.f26883a;
        this.f26861e = dVar.f26885c;
        this.g = dVar.f26886d;
        this.i = dVar.j;
        this.j = dVar.k;
        this.k = dVar.l;
        this.m = dVar.m;
        this.n = dVar.n;
        this.r = dVar.f26887e;
        this.s = dVar.f26888f;
        this.t = dVar.g;
        this.v = dVar.i;
        this.u = dVar.h;
        this.J = dVar.o;
        this.K = dVar.p;
        if (dVar.q != null) {
            this.y = g.a(dVar.q);
        }
    }

    public c a() {
        this.h = e.STRING;
        return com.meizu.cloud.pushsdk.b.e.c.a(this);
    }

    public c a(k kVar) {
        c a2;
        switch (this.h) {
            case JSON_ARRAY:
                try {
                    return c.a(new JSONArray(f.a((l) kVar.b().a()).h()));
                } catch (Exception e2) {
                    return c.a(com.meizu.cloud.pushsdk.b.i.b.b(new com.meizu.cloud.pushsdk.b.b.a((Throwable) e2)));
                }
            case JSON_OBJECT:
                try {
                    return c.a(new JSONObject(f.a((l) kVar.b().a()).h()));
                } catch (Exception e3) {
                    return c.a(com.meizu.cloud.pushsdk.b.i.b.b(new com.meizu.cloud.pushsdk.b.b.a((Throwable) e3)));
                }
            case STRING:
                try {
                    return c.a(f.a((l) kVar.b().a()).h());
                } catch (Exception e4) {
                    return c.a(com.meizu.cloud.pushsdk.b.i.b.b(new com.meizu.cloud.pushsdk.b.b.a((Throwable) e4)));
                }
            case BITMAP:
                synchronized (z) {
                    try {
                        a2 = com.meizu.cloud.pushsdk.b.i.b.a(kVar, this.G, this.H, this.F, this.I);
                    } catch (Exception e5) {
                        return c.a(com.meizu.cloud.pushsdk.b.i.b.b(new com.meizu.cloud.pushsdk.b.b.a((Throwable) e5)));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return a2;
            case PREFETCH:
                return c.a("prefetch");
            default:
                return null;
        }
    }

    public com.meizu.cloud.pushsdk.b.b.a a(com.meizu.cloud.pushsdk.b.b.a aVar) {
        try {
            if (!(aVar.a() == null || aVar.a().b() == null || aVar.a().b().a() == null)) {
                aVar.b(f.a((l) aVar.a().b().a()).h());
            }
        } catch (Exception unused) {
        }
        return aVar;
    }

    public void a(com.meizu.cloud.pushsdk.b.c.a aVar) {
        this.A = aVar;
    }

    public void a(String str) {
        this.K = str;
    }

    public c b() {
        this.h = e.BITMAP;
        return com.meizu.cloud.pushsdk.b.e.c.a(this);
    }

    public c c() {
        return com.meizu.cloud.pushsdk.b.e.c.a(this);
    }

    public int d() {
        return this.f26858b;
    }

    public String e() {
        String str = this.f26861e;
        for (Map.Entry next : this.n.entrySet()) {
            str = str.replace("{" + ((String) next.getKey()) + "}", String.valueOf(next.getValue()));
        }
        f.a g2 = com.meizu.cloud.pushsdk.b.c.f.c(str).g();
        for (Map.Entry next2 : this.m.entrySet()) {
            g2.a((String) next2.getKey(), (String) next2.getValue());
        }
        return g2.b().toString();
    }

    public e f() {
        return this.h;
    }

    public int g() {
        return this.f26860d;
    }

    public String h() {
        return this.K;
    }

    public com.meizu.cloud.pushsdk.b.d.a i() {
        return new com.meizu.cloud.pushsdk.b.d.a() {
            public void a(long j, long j2) {
                int unused = b.this.B = (int) ((100 * j) / j2);
                if (b.this.E != null && !b.this.C) {
                    b.this.E.a(j, j2);
                }
            }
        };
    }

    public String j() {
        return this.p;
    }

    public String k() {
        return this.q;
    }

    public com.meizu.cloud.pushsdk.b.c.a l() {
        return this.A;
    }

    public j m() {
        if (this.r != null) {
            return this.y != null ? j.a(this.y, this.r.toString()) : j.a(w, this.r.toString());
        }
        if (this.s != null) {
            return this.y != null ? j.a(this.y, this.s.toString()) : j.a(w, this.s.toString());
        }
        if (this.t != null) {
            return this.y != null ? j.a(this.y, this.t) : j.a(x, this.t);
        }
        if (this.v != null) {
            return this.y != null ? j.a(this.y, this.v) : j.a(x, this.v);
        }
        if (this.u != null) {
            return this.y != null ? j.a(this.y, this.u) : j.a(x, this.u);
        }
        b.a aVar = new b.a();
        try {
            for (Map.Entry next : this.j.entrySet()) {
                if (!TextUtils.isEmpty((CharSequence) next.getKey()) && !TextUtils.isEmpty((CharSequence) next.getValue())) {
                    aVar.a((String) next.getKey(), (String) next.getValue());
                }
            }
            for (Map.Entry next2 : this.k.entrySet()) {
                if (!TextUtils.isEmpty((CharSequence) next2.getKey()) && !TextUtils.isEmpty((CharSequence) next2.getValue())) {
                    aVar.b((String) next2.getKey(), (String) next2.getValue());
                }
            }
        } catch (Exception unused) {
        }
        return aVar.a();
    }

    public j n() {
        h.a a2 = new h.a().a(h.f26946e);
        try {
            for (Map.Entry next : this.l.entrySet()) {
                a2.a(com.meizu.cloud.pushsdk.b.c.c.a("Content-Disposition", "form-data; name=\"" + ((String) next.getKey()) + "\""), j.a((g) null, (String) next.getValue()));
            }
            for (Map.Entry next2 : this.o.entrySet()) {
                if (next2.getValue() != null) {
                    String name = ((File) next2.getValue()).getName();
                    j a3 = j.a(g.a(com.meizu.cloud.pushsdk.b.i.b.a(name)), (File) next2.getValue());
                    a2.a(com.meizu.cloud.pushsdk.b.c.c.a("Content-Disposition", "form-data; name=\"" + ((String) next2.getKey()) + "\"; filename=\"" + name + "\""), a3);
                    if (this.y != null) {
                        a2.a(this.y);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return a2.a();
    }

    public com.meizu.cloud.pushsdk.b.c.c o() {
        c.a aVar = new c.a();
        try {
            for (Map.Entry next : this.i.entrySet()) {
                aVar.a((String) next.getKey(), (String) next.getValue());
            }
        } catch (Exception unused) {
        }
        return aVar.a();
    }

    public String toString() {
        return "ANRequest{sequenceNumber='" + this.f26862f + ", mMethod=" + this.f26858b + ", mPriority=" + this.f26859c + ", mRequestType=" + this.f26860d + ", mUrl=" + this.f26861e + '}';
    }
}
