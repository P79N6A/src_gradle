package com.ss.android.ad.splash.core;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.a;
import com.ss.android.ad.splash.a.a;
import com.ss.android.ad.splash.c.d;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.k;
import com.ss.android.ad.splash.n;
import com.ss.android.ad.splash.origin.c;
import com.ss.android.ad.splash.q;
import com.ss.android.ad.splash.utils.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONObject;

public class e {
    private static ExecutorService A;
    private static ExecutorService B;
    private static ExecutorService C;
    private static a D;
    private static HashMap<String, String> E;
    private static Context F;
    private static com.ss.android.ad.splash.core.e.a G;
    private static Handler H = new Handler(Looper.getMainLooper());
    @DrawableRes
    private static int I;
    private static int J;
    private static volatile boolean K = false;
    private static volatile boolean L = false;
    private static int M = 0;
    private static boolean N = false;
    private static volatile d O;
    private static int P;
    private static boolean Q = true;
    private static boolean R = false;
    private static c S;
    private static int T = -1;
    private static boolean U = true;
    private static boolean V = false;
    private static boolean W = false;

    /* renamed from: a  reason: collision with root package name */
    public static com.ss.android.ad.splash.d f27659a;

    /* renamed from: b  reason: collision with root package name */
    static volatile q f27660b;

    /* renamed from: c  reason: collision with root package name */
    static n f27661c;

    /* renamed from: d  reason: collision with root package name */
    static long f27662d;

    /* renamed from: e  reason: collision with root package name */
    static boolean f27663e;

    /* renamed from: f  reason: collision with root package name */
    static volatile boolean f27664f;
    static long g;
    static boolean h;
    @DrawableRes
    static int i;
    @StringRes
    static int j;
    @StringRes
    static int k;
    @StringRes
    static int l;
    @StyleRes
    static int m;
    @DrawableRes
    static int n;
    static boolean o = true;
    static volatile String p;
    static volatile long q = 864000000;
    static volatile boolean r = true;
    static k s;
    static int t = 0;
    static int u = 0;
    static boolean v = false;
    static boolean w = false;
    static volatile Future x;
    static boolean y = false;
    static long z = 2000;

    public static String J() {
        return "1385";
    }

    public static String K() {
        return "18202";
    }

    public static void i() {
        L = true;
    }

    public static void r() {
        K = true;
    }

    public static long B() {
        return q;
    }

    public static c D() {
        return S;
    }

    public static HashMap<String, String> E() {
        return E;
    }

    @NonNull
    public static Context F() {
        return F;
    }

    public static int G() {
        return M;
    }

    public static boolean H() {
        return N;
    }

    public static d I() {
        return O;
    }

    public static int L() {
        return u;
    }

    public static boolean M() {
        return v;
    }

    public static int O() {
        return P;
    }

    public static boolean P() {
        return Q;
    }

    public static int Q() {
        return T;
    }

    public static boolean R() {
        return U;
    }

    public static boolean S() {
        return V;
    }

    public static boolean T() {
        return w;
    }

    public static long U() {
        return z;
    }

    public static boolean V() {
        return W;
    }

    public static long c() {
        return g;
    }

    public static a e() {
        return D;
    }

    public static int g() {
        return J;
    }

    public static boolean h() {
        return L;
    }

    @StringRes
    public static int j() {
        return l;
    }

    @StringRes
    public static int k() {
        return j;
    }

    @DrawableRes
    public static int l() {
        return I;
    }

    @StringRes
    public static int m() {
        return k;
    }

    @DrawableRes
    public static int n() {
        return n;
    }

    @DrawableRes
    public static int o() {
        return i;
    }

    @StyleRes
    public static int p() {
        return m;
    }

    public static boolean q() {
        return K;
    }

    public static ExecutorService s() {
        return A;
    }

    public static q t() {
        return f27660b;
    }

    public static n u() {
        return f27661c;
    }

    public static com.ss.android.ad.splash.d v() {
        return f27659a;
    }

    public static long w() {
        return f27662d;
    }

    public static boolean x() {
        return f27663e;
    }

    public static ExecutorService y() {
        return B;
    }

    public static ExecutorService z() {
        return C;
    }

    public static boolean a() {
        return f27664f;
    }

    public static void a(boolean z2) {
        N = z2;
    }

    public static void a(Future future) {
        x = future;
    }

    public static boolean d() {
        return h;
    }

    public static boolean b() {
        return o;
    }

    public static String N() {
        String str = "";
        if (D != null) {
            str = D.f22771d;
        }
        if (TextUtils.isEmpty(str)) {
            return r.a().j();
        }
        return str;
    }

    public static void f() {
        String str = "";
        if (D != null) {
            str = e().f22771d;
        }
        if (!g.a(str)) {
            r.a().c(str).d();
        }
    }

    public static String A() {
        try {
            if (g.a(p)) {
                return Environment.getExternalStorageDirectory().getPath() + "/Android/data/" + F().getPackageName() + "/splashCache/";
            }
        } catch (Exception unused) {
        }
        return p;
    }

    @NonNull
    public static com.ss.android.ad.splash.core.e.a C() {
        if (G == null) {
            synchronized (e.class) {
                if (G == null) {
                    G = new b(F, new com.ss.android.ad.splash.core.e.e(F));
                }
            }
        }
        return G;
    }

    public static void a(int i2) {
        T = i2;
    }

    public static void b(ExecutorService executorService) {
        B = executorService;
    }

    public static void d(boolean z2) {
        W = z2;
    }

    public static void a(@NonNull Context context) {
        F = context.getApplicationContext();
    }

    public static void b(boolean z2) {
        Q = false;
    }

    public static void c(ExecutorService executorService) {
        C = executorService;
    }

    public static void a(a aVar) {
        D = aVar;
    }

    public static void c(boolean z2) {
        U = z2;
    }

    public static void a(d dVar) {
        O = dVar;
    }

    public static void a(c cVar) {
        S = cVar;
    }

    public static void a(HashMap<String, String> hashMap) {
        E = hashMap;
    }

    public static void a(ExecutorService executorService) {
        A = executorService;
    }

    public static void a(long j2, String str, String str2, JSONObject jSONObject) {
        if (R) {
            final com.ss.android.ad.splash.a.a a2 = new a.C0241a().a(jSONObject).a(j2).c(str2).b(str).a("umeng").a();
            H.post(new Runnable() {
                public final void run() {
                    if (e.f27659a != null) {
                        e.f27659a.a(a2);
                    }
                }
            });
            return;
        }
        Handler handler = H;
        final String str3 = str;
        final String str4 = str2;
        final long j3 = j2;
        final JSONObject jSONObject2 = jSONObject;
        AnonymousClass4 r1 = new Runnable() {
            public final void run() {
                if (e.f27659a != null) {
                    e.f27659a.a(str3, str4, j3, 0, jSONObject2);
                }
            }
        };
        handler.post(r1);
    }

    public static void a(long j2, String str, List<String> list, int i2) {
        String str2;
        if (list != null && !list.isEmpty() && f27660b != null) {
            com.ss.android.ad.splash.core.e.a C2 = C();
            if (e() == null) {
                str2 = "";
            } else {
                str2 = e().f22771d;
            }
            C2.a(j2, str, str2, list, true, i2);
        }
    }

    public static void a(long j2, String str, String str2, String str3, Map<String, Object> map) {
        if (R) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                if (!map.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry next : map.entrySet()) {
                        if (next != null) {
                            jSONObject2.putOpt((String) next.getKey(), next.getValue());
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                }
            } catch (Exception unused) {
            }
            a.C0241a a2 = new a.C0241a().b(str).a("umeng");
            a2.f22790e = str3;
            final com.ss.android.ad.splash.a.a a3 = a2.c(str2).a(j2).a(jSONObject).a();
            H.post(new Runnable() {
                public final void run() {
                    if (e.f27659a != null) {
                        e.f27659a.a(a3);
                    }
                }
            });
            return;
        }
        final JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.putOpt("log_extra", str3);
            jSONObject3.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            if (!map.isEmpty()) {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry next2 : map.entrySet()) {
                    if (next2 != null) {
                        jSONObject4.putOpt((String) next2.getKey(), next2.getValue());
                    }
                }
                jSONObject3.putOpt("ad_extra_data", jSONObject4);
            }
        } catch (Exception unused2) {
        }
        Handler handler = H;
        final String str4 = str;
        final String str5 = str2;
        final long j3 = j2;
        AnonymousClass2 r0 = new Runnable() {
            public final void run() {
                if (e.f27659a != null) {
                    e.f27659a.a(str4, str5, j3, 0, jSONObject3);
                }
            }
        };
        handler.post(r0);
    }
}
