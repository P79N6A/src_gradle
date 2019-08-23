package com.tencent.bugly.crashreport.common.info;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import com.ss.android.ugc.aweme.q.c;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class a {
    private static a ad;
    public HashMap<String, String> A = new HashMap<>();
    public boolean B = true;
    public List<String> C = new ArrayList();
    public com.tencent.bugly.crashreport.a D = null;
    public SharedPreferences E;
    private final Context F;
    private String G;
    private String H;
    private String I = "unknown";
    private String J = "unknown";
    private String K = "";
    private String L;
    private String M;
    private String N;
    private String O;
    private long P = -1;
    private long Q = -1;
    private long R = -1;
    private String S;
    private String T;
    private Map<String, PlugInBean> U;
    private boolean V = true;
    private String W;
    private String X;
    private Boolean Y;
    private String Z;

    /* renamed from: a  reason: collision with root package name */
    public final long f79274a = System.currentTimeMillis();
    private String aa;
    private String ab;
    private Map<String, PlugInBean> ac;
    private int ae = -1;
    private int af = -1;
    private Map<String, String> ag = new HashMap();
    private Map<String, String> ah = new HashMap();
    private Map<String, String> ai = new HashMap();
    private boolean aj;
    private String ak = null;
    private String al = null;
    private String am = null;
    private String an = null;
    private String ao = null;
    private final Object ap = new Object();
    private final Object aq = new Object();
    private final Object ar = new Object();
    private final Object as = new Object();
    private final Object at = new Object();
    private final Object au = new Object();
    private final Object av = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final byte f79275b;

    /* renamed from: c  reason: collision with root package name */
    public String f79276c;

    /* renamed from: d  reason: collision with root package name */
    public final String f79277d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f79278e = true;

    /* renamed from: f  reason: collision with root package name */
    public final String f79279f;
    public final String g;
    public final String h;
    public long i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public List<String> o;
    public String p = "unknown";
    public long q = 0;
    public long r = 0;
    public long s = 0;
    public long t = 0;
    public boolean u = false;
    public String v = null;
    public String w = null;
    public String x = null;
    public boolean y = false;
    public boolean z = false;

    public static String c() {
        return "2.6.6";
    }

    public final synchronized Map<String, PlugInBean> K() {
        return null;
    }

    public final synchronized Map<String, PlugInBean> v() {
        return null;
    }

    public final int I() {
        return this.af;
    }

    public static int L() {
        return b.c();
    }

    public final boolean J() {
        return AppInfo.f(this.F);
    }

    public final String P() {
        return b.n();
    }

    public final long R() {
        return b.o();
    }

    public final boolean a() {
        return this.aj;
    }

    public final synchronized String i() {
        return this.J;
    }

    public final synchronized String j() {
        return this.K;
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            aVar = ad;
        }
        return aVar;
    }

    public final void C() {
        synchronized (this.ar) {
            this.ag.clear();
        }
    }

    public final int D() {
        int size;
        synchronized (this.ar) {
            size = this.ag.size();
        }
        return size;
    }

    public final Set<String> E() {
        Set<String> keySet;
        synchronized (this.ar) {
            keySet = this.ag.keySet();
        }
        return keySet;
    }

    public final int H() {
        int i2;
        synchronized (this.at) {
            i2 = this.ae;
        }
        return i2;
    }

    public final String M() {
        if (this.ak == null) {
            this.ak = b.m();
        }
        return this.ak;
    }

    public final String N() {
        if (this.al == null) {
            this.al = b.j(this.F);
        }
        return this.al;
    }

    public final String O() {
        if (this.am == null) {
            this.am = b.k(this.F);
        }
        return this.am;
    }

    public final String Q() {
        if (this.an == null) {
            this.an = b.l(this.F);
        }
        return this.an;
    }

    public final String f() {
        if (!z.a((String) null)) {
            return null;
        }
        return this.X;
    }

    public final String g() {
        String str;
        synchronized (this.au) {
            str = this.I;
        }
        return str;
    }

    public final String r() {
        if (this.S == null) {
            this.S = b.a(true);
        }
        return this.S;
    }

    public final String s() {
        if (this.T == null) {
            this.T = b.h(this.F);
        }
        return this.T;
    }

    public final String u() {
        if (this.ao == null) {
            this.ao = AppInfo.e(this.F);
        }
        return this.ao;
    }

    public final String w() {
        if (this.W == null) {
            this.W = b.k();
        }
        return this.W;
    }

    public final Map<String, String> B() {
        synchronized (this.ar) {
            if (this.ag.size() <= 0) {
                return null;
            }
            HashMap hashMap = new HashMap(this.ag);
            return hashMap;
        }
    }

    public final Map<String, String> F() {
        synchronized (this.av) {
            if (this.ah.size() <= 0) {
                return null;
            }
            HashMap hashMap = new HashMap(this.ah);
            return hashMap;
        }
    }

    public final Map<String, String> G() {
        synchronized (this.as) {
            if (this.ai.size() <= 0) {
                return null;
            }
            HashMap hashMap = new HashMap(this.ai);
            return hashMap;
        }
    }

    public final void d() {
        synchronized (this.ap) {
            this.G = UUID.randomUUID().toString();
        }
    }

    public final String e() {
        if (this.G == null) {
            synchronized (this.ap) {
                if (this.G == null) {
                    this.G = UUID.randomUUID().toString();
                }
            }
        }
        return this.G;
    }

    public final String k() {
        if (!this.V) {
            return "";
        }
        if (this.L == null) {
            this.L = b.a(this.F);
        }
        return this.L;
    }

    public final String l() {
        if (!this.V) {
            return "";
        }
        if (this.M == null || !this.M.contains(":")) {
            this.M = b.d(this.F);
        }
        return this.M;
    }

    public final String m() {
        if (!this.V) {
            return "";
        }
        if (this.N == null) {
            this.N = b.b(this.F);
        }
        return this.N;
    }

    public final String n() {
        if (!this.V) {
            return "";
        }
        if (this.O == null) {
            this.O = b.c(this.F);
        }
        return this.O;
    }

    public final long o() {
        if (this.P <= 0) {
            this.P = b.e();
        }
        return this.P;
    }

    public final long p() {
        if (this.Q <= 0) {
            this.Q = b.g();
        }
        return this.Q;
    }

    public final long q() {
        if (this.R <= 0) {
            this.R = b.i();
        }
        return this.R;
    }

    public final Boolean x() {
        if (this.Y == null) {
            this.Y = Boolean.valueOf(b.i(this.F));
        }
        return this.Y;
    }

    public final String A() {
        if (this.ab == null) {
            this.ab = b.d();
            x.a("Hardware serial number: %s", this.ab);
        }
        return this.ab;
    }

    public final String h() {
        if (this.H != null) {
            return this.H;
        }
        this.H = k() + "|" + m() + "|" + n();
        return this.H;
    }

    public final String y() {
        if (this.Z == null) {
            this.Z = b.g(this.F);
            x.a("ROM ID: %s", this.Z);
        }
        return this.Z;
    }

    public final String z() {
        if (this.aa == null) {
            this.aa = b.e(this.F);
            x.a("SIM serial number: %s", this.aa);
        }
        return this.aa;
    }

    public final String t() {
        try {
            Map<String, ?> all = c.a(this.F, "BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.aq) {
                    for (Map.Entry next : all.entrySet()) {
                        try {
                            this.A.put(next.getKey(), next.getValue().toString());
                        } catch (Throwable th) {
                            x.a(th);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            x.a(th2);
        }
        if (this.A.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next2 : this.A.entrySet()) {
            sb.append("[");
            sb.append((String) next2.getKey());
            sb.append(",");
            sb.append((String) next2.getValue());
            sb.append("] ");
        }
        c("SDK_INFO", sb.toString());
        return sb.toString();
    }

    public final void a(String str) {
        this.X = str;
    }

    public final void a(boolean z2) {
        this.aj = z2;
        if (this.D != null) {
            this.D.setNativeIsAppForeground(z2);
        }
    }

    public final synchronized void d(String str) {
        this.J = String.valueOf(str);
    }

    public final synchronized void e(String str) {
        this.K = String.valueOf(str);
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (ad == null) {
                ad = new a(context);
            }
            aVar = ad;
        }
        return aVar;
    }

    public final void b(String str) {
        synchronized (this.au) {
            if (str == null) {
                str = "10000";
            }
            this.I = String.valueOf(str);
        }
    }

    public final void c(String str) {
        this.H = str;
        synchronized (this.av) {
            this.ah.put("E8", str);
        }
    }

    public final void a(int i2) {
        synchronized (this.at) {
            int i3 = this.ae;
            if (i3 != i2) {
                this.ae = i2;
                x.a("user scene tag %d changed to tag %d", Integer.valueOf(i3), Integer.valueOf(this.ae));
            }
        }
    }

    public final void b(int i2) {
        int i3 = this.af;
        if (i3 != 24096) {
            this.af = 24096;
            x.a("server scene tag %d changed to tag %d", Integer.valueOf(i3), Integer.valueOf(this.af));
        }
    }

    public final String f(String str) {
        String remove;
        if (z.a(str)) {
            x.d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.ar) {
            remove = this.ag.remove(str);
        }
        return remove;
    }

    public final String g(String str) {
        String str2;
        if (z.a(str)) {
            x.d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.ar) {
            str2 = this.ag.get(str);
        }
        return str2;
    }

    private a(Context context) {
        this.F = z.a(context);
        this.f79275b = 1;
        PackageInfo b2 = AppInfo.b(context);
        if (b2 != null) {
            try {
                this.j = b2.versionName;
                this.v = this.j;
                this.w = Integer.toString(b2.versionCode);
            } catch (Throwable th) {
                x.a(th);
            }
        }
        this.f79276c = AppInfo.a(context);
        this.f79277d = AppInfo.a(Process.myPid());
        this.f79279f = b.l();
        this.g = b.a();
        this.k = AppInfo.c(context);
        this.h = "Android " + b.b() + ",level " + b.c();
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        sb.append(";");
        sb.append(this.h);
        Map d2 = AppInfo.d(context);
        if (d2 != null) {
            try {
                this.o = AppInfo.a(d2);
                String str = (String) d2.get("BUGLY_APPID");
                if (str != null) {
                    this.X = str;
                }
                String str2 = (String) d2.get("BUGLY_APP_VERSION");
                if (str2 != null) {
                    this.j = str2;
                }
                String str3 = (String) d2.get("BUGLY_APP_CHANNEL");
                if (str3 != null) {
                    this.l = str3;
                }
                String str4 = (String) d2.get("BUGLY_ENABLE_DEBUG");
                if (str4 != null) {
                    this.u = str4.equalsIgnoreCase("true");
                }
                String str5 = (String) d2.get("com.tencent.rdm.uuid");
                if (str5 != null) {
                    this.x = str5;
                }
            } catch (Throwable th2) {
                x.a(th2);
            }
        }
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.z = true;
                x.c("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable unused) {
        }
        this.E = z.a("BUGLY_COMMON_VALUES", context);
        x.c("com info create end", new Object[0]);
    }

    public final void c(String str, String str2) {
        if (z.a(str) || z.a(str2)) {
            x.d("server key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
            return;
        }
        synchronized (this.as) {
            this.ai.put(str, str2);
        }
    }

    public final void a(String str, String str2) {
        if (str != null && str2 != null) {
            synchronized (this.aq) {
                this.A.put(str, str2);
            }
        }
    }

    public final void b(String str, String str2) {
        if (z.a(str) || z.a(str2)) {
            x.d("key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
            return;
        }
        synchronized (this.ar) {
            this.ag.put(str, str2);
        }
    }
}
