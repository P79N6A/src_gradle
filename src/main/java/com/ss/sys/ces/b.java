package com.ss.sys.ces;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.a.a.a;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.sys.ces.a.c;
import com.ss.sys.ces.a.d;
import com.ss.sys.ces.a.e;
import com.ss.sys.ces.a.f;
import com.ss.sys.ces.gg.tt;
import com.ss.sys.ces.out.ISdk;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class b extends Thread implements ISdk {

    /* renamed from: a  reason: collision with root package name */
    public static Context f78487a = null;

    /* renamed from: b  reason: collision with root package name */
    public static long f78488b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static String f78489c = "";

    /* renamed from: d  reason: collision with root package name */
    public static String f78490d = "";

    /* renamed from: e  reason: collision with root package name */
    static boolean f78491e = false;

    /* renamed from: f  reason: collision with root package name */
    public static String f78492f = "";
    public static String g = "";
    public static boolean h;
    public static boolean i;
    static boolean k;
    private static volatile b l;
    private static int m;
    private static int n;
    private static int o;
    private static Map<String, Object> p;
    public boolean j;
    private boolean q = true;

    private b(Context context, long j2) {
        setName("CZL-00");
        f78487a = context;
        f78488b = j2;
    }

    public static b a() {
        return l;
    }

    static void a(String str, final Context context) {
        new Thread("CZL-" + str) {
            public final void run() {
                c.f78509a = 0;
                c.a(context);
            }
        }.start();
    }

    private static boolean c() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f78487a.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null || activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public void InitSelas() {
        b();
    }

    public void SetRegionType(int i2) {
        a.a(i2);
    }

    public final Object a(int i2, Object obj) {
        String str;
        if (i2 == 123) {
            return e.a(f78487a);
        }
        if (i2 == 121) {
            return c.c(f78487a);
        }
        if (i2 == 122) {
            return c.a();
        }
        if (i2 == 126) {
            return c.d(f78487a);
        }
        if (i2 == 127) {
            return c.a(f78487a);
        }
        if (i2 == 128) {
            return c.b(f78487a);
        }
        if (i2 == 120) {
            return com.ss.sys.ces.a.b.a();
        }
        if (i2 == 124) {
            return f.b(f78487a);
        }
        if (i2 == 130) {
            return f.a(f78487a);
        }
        if (i2 == 125) {
            return f.c(f78487a);
        }
        if (i2 == 129) {
            return d.a(f78487a);
        }
        if (i2 == 131) {
            return com.ss.sys.a.a.a();
        }
        if (i2 == 132) {
            reportNow((String) obj);
            return null;
        } else if (i2 != 133) {
            return null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : p.entrySet()) {
                    if (next.getValue() == null) {
                        jSONObject.put((String) next.getKey(), "");
                    } else {
                        jSONObject.put((String) next.getKey(), next.getValue());
                    }
                }
                str = jSONObject.toString();
            } catch (Throwable unused) {
                str = null;
            }
            return str == null ? "{}" : str.trim();
        }
    }

    public String debugEntry(Context context, int i2) {
        return a.DebugPrint(context, i2);
    }

    public byte[] encode(byte[] bArr) {
        return a.encode(bArr);
    }

    public String onEvent() {
        return com.ss.sys.a.a.a();
    }

    public void reportNow(final String str) {
        try {
            new Thread("CZL-5") {
                /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0069 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r7 = this;
                        java.lang.String r0 = "RN"
                        android.content.Context r1 = com.ss.sys.ces.b.f78487a     // Catch:{ Throwable -> 0x0080 }
                        com.ss.sys.ces.b.a((java.lang.String) r0, (android.content.Context) r1)     // Catch:{ Throwable -> 0x0080 }
                        r0 = 222(0xde, float:3.11E-43)
                        android.content.Context r1 = com.ss.sys.ces.b.f78487a     // Catch:{ Throwable -> 0x0080 }
                        java.lang.String r2 = r3     // Catch:{ Throwable -> 0x0080 }
                        java.lang.Object r0 = com.ss.sys.ces.a.meta(r0, r1, r2)     // Catch:{ Throwable -> 0x0080 }
                        byte[] r0 = (byte[]) r0     // Catch:{ Throwable -> 0x0080 }
                        byte[] r0 = (byte[]) r0     // Catch:{ Throwable -> 0x0080 }
                        if (r0 == 0) goto L_0x0078
                        int r1 = r0.length     // Catch:{ Throwable -> 0x0080 }
                        if (r1 <= 0) goto L_0x0078
                        com.ss.sys.ces.b.d r1 = new com.ss.sys.ces.b.d     // Catch:{ Throwable -> 0x0069 }
                        android.content.Context r2 = com.ss.sys.ces.b.f78487a     // Catch:{ Throwable -> 0x0069 }
                        java.lang.String r3 = com.ss.sys.ces.b.f78490d     // Catch:{ Throwable -> 0x0069 }
                        r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x0069 }
                        java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0069 }
                        r2.<init>()     // Catch:{ Throwable -> 0x0069 }
                        com.bytedance.retrofit2.client.Header r3 = new com.bytedance.retrofit2.client.Header     // Catch:{ Throwable -> 0x0069 }
                        java.lang.String r4 = "Cookie"
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0069 }
                        java.lang.String r6 = "sessionid="
                        r5.<init>(r6)     // Catch:{ Throwable -> 0x0069 }
                        java.lang.String r6 = r1.f78500a     // Catch:{ Throwable -> 0x0069 }
                        r5.append(r6)     // Catch:{ Throwable -> 0x0069 }
                        java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0069 }
                        r3.<init>(r4, r5)     // Catch:{ Throwable -> 0x0069 }
                        r2.add(r3)     // Catch:{ Throwable -> 0x0069 }
                        java.lang.String r3 = r1.f78502c     // Catch:{ Throwable -> 0x0069 }
                        com.bytedance.retrofit2.Retrofit r3 = com.bytedance.ttnet.utils.RetrofitUtils.getSsRetrofit(r3)     // Catch:{ Throwable -> 0x0069 }
                        java.lang.Class<com.ss.sys.ces.b.c> r4 = com.ss.sys.ces.b.c.class
                        java.lang.Object r3 = r3.create(r4)     // Catch:{ Throwable -> 0x0069 }
                        com.ss.sys.ces.b.c r3 = (com.ss.sys.ces.b.c) r3     // Catch:{ Throwable -> 0x0069 }
                        com.bytedance.retrofit2.mime.TypedByteArray r4 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ Throwable -> 0x0069 }
                        java.lang.String r5 = "application/octet-stream"
                        r6 = 0
                        java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x0069 }
                        r4.<init>(r5, r0, r6)     // Catch:{ Throwable -> 0x0069 }
                        java.lang.String r5 = r1.f78502c     // Catch:{ Throwable -> 0x0069 }
                        com.bytedance.retrofit2.Call r2 = r3.a(r5, r2, r4)     // Catch:{ Throwable -> 0x0069 }
                        com.ss.sys.ces.b.d$1 r3 = new com.ss.sys.ces.b.d$1     // Catch:{ Throwable -> 0x0069 }
                        r3.<init>()     // Catch:{ Throwable -> 0x0069 }
                        r2.enqueue(r3)     // Catch:{ Throwable -> 0x0069 }
                        goto L_0x0080
                    L_0x0069:
                        com.ss.sys.ces.b.a r1 = new com.ss.sys.ces.b.a     // Catch:{ Throwable -> 0x0080 }
                        android.content.Context r2 = com.ss.sys.ces.b.f78487a     // Catch:{ Throwable -> 0x0080 }
                        java.lang.String r3 = com.ss.sys.ces.b.f78490d     // Catch:{ Throwable -> 0x0080 }
                        r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x0080 }
                        r2 = 1
                        r3 = 2
                        r1.a(r2, r3, r0)     // Catch:{ Throwable -> 0x0080 }
                        return
                    L_0x0078:
                        java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x0080 }
                        java.lang.String r1 = "NullPointerException"
                        r0.<init>(r1)     // Catch:{ Throwable -> 0x0080 }
                        throw r0     // Catch:{ Throwable -> 0x0080 }
                    L_0x0080:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ces.b.AnonymousClass4.run():void");
                }
            }.start();
        } catch (Throwable unused) {
        }
    }

    public void run() {
        this.j = true;
        long j2 = 60000;
        int i2 = 0;
        while (true) {
            i2++;
            String.format("[LOOP]times : %d settings=%b reported=%b", new Object[]{Integer.valueOf(i2), Boolean.valueOf(i), Boolean.valueOf(h)});
            boolean c2 = c();
            if (this.q) {
                com.ss.a.b.f.a(5000);
            }
            if (c2 && k) {
                reportNow("META");
            }
            if (c2) {
                m = 0;
                int i3 = n + 1;
                n = i3;
                if (i3 > 10) {
                    j2 = 7200000;
                }
            } else {
                int i4 = m + 1;
                m = i4;
                if (i4 > 10) {
                    n = 0;
                    m = 0;
                    j2 = 7200000;
                }
                com.ss.a.b.f.a((long) (m * 10 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            }
            if (this.q) {
                com.ss.a.b.f.a(5000);
            }
            if (h) {
                n = 0;
                m = 0;
                o = 0;
                com.ss.a.b.f.a(7200000);
            } else {
                int i5 = o + 1;
                o = i5;
                if (i5 < 5) {
                    new StringBuilder("report error repeat times : ").append(o);
                    com.ss.a.b.f.a(((long) o) * j2);
                } else {
                    com.ss.a.b.f.a(7200000);
                    this.q = false;
                }
            }
            j2 = 7200000;
        }
    }

    public void setCustomInfo(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            p = hashMap;
        }
    }

    public void setInterface(com.ss.sys.ces.c.a aVar) {
    }

    public void setNetwork(boolean z) {
    }

    public void setParams(String str, String str2) {
        if (str != null && str.length() > 0) {
            f78492f = str;
            a.meta(103, null, str);
        }
        if (str2 != null && str2.length() > 0) {
            g = str2;
            a.meta(104, null, str2);
        }
        a("SP1", f78487a);
        b();
        if (!isAlive() || !this.j) {
            try {
                start();
            } catch (Throwable unused) {
            }
        }
    }

    public void setParams(String str, String str2, boolean z) {
        if (str != null && str.length() > 0) {
            f78492f = str;
            a.meta(103, null, str);
        }
        if (str2 != null && str2.length() > 0) {
            g = str2;
            a.meta(104, null, str2);
        }
        a("SP2", f78487a);
        b();
        if (!z) {
            return;
        }
        if (!isAlive() || !this.j) {
            try {
                start();
            } catch (Throwable unused) {
            }
        }
    }

    public void setSession(String str) {
        if (str != null && str.length() > 0) {
            synchronized (this) {
                if (f78490d.length() <= 0 || (f78490d.length() > 0 && !str.equals(f78490d))) {
                    f78490d = str;
                }
            }
        }
    }

    public void setUrlInterface(int i2, String str) {
        if (str != null && str.length() > 0) {
            a.a(i2, str);
        }
    }

    public static b a(final Context context, long j2, int i2) {
        if (l == null) {
            synchronized (b.class) {
                if (l == null) {
                    l = new b(context, j2);
                }
                a.a(i2);
                a.b((int) f78488b);
                com.ss.a.b.e.a(context, "cms");
                try {
                    tt.init_gorgon();
                } catch (Throwable unused) {
                }
                synchronized (b.class) {
                    if (context != null) {
                        try {
                            if (!f78491e) {
                                new Thread("CZL-2") {
                                    public final void run() {
                                        try {
                                            a.meta(BaseLoginOrRegisterActivity.o, null, PushConstants.PUSH_TYPE_NOTIFY);
                                            a.meta(102, null, ((int) b.f78488b));
                                            a.meta(1020, null, b.f78489c);
                                            a.meta(105, null, com.ss.sys.ces.a.a.b(context));
                                            a.meta(106, null, com.ss.sys.ces.a.a.a(context));
                                            a.meta(107, null, com.ss.sys.ces.a.a.c(context));
                                            a.meta(108, null, com.ss.sys.ces.a.a.d(context));
                                            a.meta(109, null, com.ss.sys.ces.a.a.a());
                                            a.meta(110, null, com.ss.sys.ces.a.a.b());
                                            b.f78491e = true;
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }.start();
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
            }
        }
        return l;
    }

    private static void b() {
        Context context = f78487a;
        long j2 = f78488b;
        AnonymousClass3 r3 = new com.ss.sys.a.a.a() {
            public final void a() {
                b.k = true;
            }
        };
        if (com.ss.sys.a.a.f78470b != 102 && com.ss.sys.a.a.f78470b != 202 && com.ss.sys.a.a.f78470b != 200) {
            com.ss.sys.a.a.f78469a = System.currentTimeMillis();
            com.ss.sys.a.a.f78471c = false;
            com.ss.sys.a.a.f78472d = j2;
            com.ss.sys.a.a.f78470b = 102;
            Thread thread = new Thread(new com.ss.sys.a.b(context, r3));
            thread.setName("CZL-3");
            thread.start();
        }
    }
}
