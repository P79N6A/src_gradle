package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ad f80340a;

    /* renamed from: b  reason: collision with root package name */
    private final String f80341b = "umeng_it.cache";

    /* renamed from: c  reason: collision with root package name */
    private File f80342c;

    /* renamed from: d  reason: collision with root package name */
    private bm f80343d;

    /* renamed from: e  reason: collision with root package name */
    private long f80344e;

    /* renamed from: f  reason: collision with root package name */
    private long f80345f;
    private Set<y> g = new HashSet();
    private a h = null;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Context f80346a;

        /* renamed from: b  reason: collision with root package name */
        private Set<String> f80347b = new HashSet();

        public void b() {
            String string = ba.a(this.f80346a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string)) {
                String[] split = string.split(",");
                if (split != null) {
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f80347b.add(str);
                        }
                    }
                }
            }
        }

        public void a() {
            if (!this.f80347b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String append : this.f80347b) {
                    sb.append(append);
                    sb.append(',');
                }
                sb.deleteCharAt(sb.length() - 1);
                ba.a(this.f80346a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        public void b(String str) {
            this.f80347b.add(str);
        }

        public void c(String str) {
            this.f80347b.remove(str);
        }

        public a(Context context) {
            this.f80346a = context;
        }

        public boolean a(String str) {
            if (!this.f80347b.contains(str)) {
                return true;
            }
            return false;
        }
    }

    public String c() {
        return null;
    }

    public bm b() {
        return this.f80343d;
    }

    public void f() {
        if (this.f80343d != null) {
            a(this.f80343d);
        }
    }

    private bm h() {
        FileInputStream fileInputStream;
        Throwable th;
        if (!this.f80342c.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(this.f80342c);
            try {
                byte[] b2 = bw.b((InputStream) fileInputStream);
                bm bmVar = new bm();
                new cj().a((cg) bmVar, b2);
                bw.c(fileInputStream);
                return bmVar;
            } catch (Exception unused) {
                bw.c(fileInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                bw.c(fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
            bw.c(fileInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            bw.c(fileInputStream);
            throw th;
        }
    }

    public void d() {
        boolean z = false;
        for (y next : this.g) {
            if (next.c() && next.e() != null && !next.e().isEmpty()) {
                next.a((List<bk>) null);
                z = true;
            }
        }
        if (z) {
            this.f80343d.b(false);
            f();
        }
    }

    private void g() {
        bm bmVar = new bm();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (y next : this.g) {
            if (next.c()) {
                if (next.d() != null) {
                    hashMap.put(next.b(), next.d());
                }
                if (next.e() != null && !next.e().isEmpty()) {
                    arrayList.addAll(next.e());
                }
            }
        }
        bmVar.a((List<bk>) arrayList);
        bmVar.a((Map<String, bl>) hashMap);
        synchronized (this) {
            this.f80343d = bmVar;
        }
    }

    public void a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f80344e >= this.f80345f) {
            boolean z = false;
            for (y next : this.g) {
                if (next.c() && next.a()) {
                    z = true;
                    if (!next.c()) {
                        this.h.b(next.b());
                    }
                }
            }
            if (z) {
                g();
                this.h.a();
                f();
            }
            this.f80344e = currentTimeMillis;
        }
    }

    public void e() {
        bm h2 = h();
        if (h2 != null) {
            ArrayList<y> arrayList = new ArrayList<>(this.g.size());
            synchronized (this) {
                this.f80343d = h2;
                for (y next : this.g) {
                    next.a(this.f80343d);
                    if (!next.c()) {
                        arrayList.add(next);
                    }
                }
                for (y remove : arrayList) {
                    this.g.remove(remove);
                }
            }
            g();
        }
    }

    public void a(long j) {
        this.f80345f = j;
    }

    private void a(bm bmVar) {
        byte[] a2;
        if (bmVar != null) {
            try {
                synchronized (this) {
                    a2 = new cp().a(bmVar);
                }
                if (a2 != null) {
                    bw.a(this.f80342c, a2);
                }
            } catch (Exception unused) {
            }
        }
    }

    ad(Context context) {
        this.f80342c = new File(context.getFilesDir(), "umeng_it.cache");
        this.f80345f = 86400000;
        this.h = new a(context);
        this.h.b();
    }

    public boolean a(y yVar) {
        if (this.h.a(yVar.b())) {
            return this.g.add(yVar);
        }
        return false;
    }

    public static synchronized ad a(Context context) {
        ad adVar;
        synchronized (ad.class) {
            if (f80340a == null) {
                ad adVar2 = new ad(context);
                f80340a = adVar2;
                adVar2.a((y) new ae(context));
                f80340a.a((y) new z(context));
                f80340a.a((y) new am(context));
                f80340a.a((y) new ac(context));
                f80340a.a((y) new ab(context));
                f80340a.a((y) new ag(context));
                f80340a.a((y) new aj());
                f80340a.a((y) new an(context));
                al alVar = new al(context);
                if (!TextUtils.isEmpty(alVar.f())) {
                    f80340a.a((y) alVar);
                }
                ai aiVar = new ai(context);
                if (aiVar.g()) {
                    f80340a.a((y) aiVar);
                    f80340a.a((y) new ah(context));
                    aiVar.i();
                }
                f80340a.e();
            }
            adVar = f80340a;
        }
        return adVar;
    }
}
