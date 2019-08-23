package com.bytedance.frameworks.baselib.network.http;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ttnet.org.chromium.base.ContextUtils;
import java.net.InetAddress;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static List<j> f19852a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public static g f19853b;

    /* renamed from: c  reason: collision with root package name */
    public static C0162e f19854c;

    /* renamed from: d  reason: collision with root package name */
    public static String f19855d = null;

    /* renamed from: e  reason: collision with root package name */
    public static f f19856e;

    /* renamed from: f  reason: collision with root package name */
    public static b f19857f;
    public static k g;
    public static volatile int h = -1;
    public static c i;
    public static a j;
    private static i k;
    private static boolean l = true;
    private static volatile AtomicBoolean m = new AtomicBoolean(false);
    private static final Object n = new Object();
    private static CountDownLatch o = new CountDownLatch(1);
    private static h p;
    private static d q;

    public interface a {
        Map<String, String> a(String str, Map<String, List<String>> map);
    }

    public interface b<T extends a> {
        String a(String str);

        String a(String str, boolean z);

        void a();
    }

    public interface c<T extends b> {
        String a(String str, T t);

        List<InetAddress> a(String str);
    }

    public interface d {
        Map<String, List<String>> a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$e  reason: collision with other inner class name */
    public interface C0162e {
        boolean b(String str);
    }

    public interface f {
        String a();
    }

    public interface g {
        boolean c(String str);
    }

    public interface h {
        List<String> a(CookieManager cookieManager, com.bytedance.frameworks.baselib.network.http.b.a aVar, URI uri);

        List<String> d(String str);
    }

    public interface i {
        Pair<Boolean, String> a(String str);

        Pair<Boolean, byte[]> a(byte[] bArr);

        Map<String, ?> a();

        boolean a(URI uri);

        Pair<Boolean, byte[]> b(byte[] bArr);

        void b();
    }

    public interface j {
        void a(Map<String, ?> map);
    }

    public interface k<T extends a> {
        void a(long j, long j2, String str, String str2, T t);

        void a(long j, long j2, String str, String str2, T t, Throwable th);
    }

    public static i a() {
        return k;
    }

    public static g b() {
        return f19853b;
    }

    public static C0162e c() {
        return f19854c;
    }

    public static String f() {
        return f19855d;
    }

    public static f g() {
        return f19856e;
    }

    public static h i() {
        return p;
    }

    public static d j() {
        return q;
    }

    public static void a(j jVar) {
        f19852a.add(jVar);
    }

    public static void a(boolean z) {
        l = z;
    }

    public static void a(String str, Throwable th, long j2, a aVar) {
        if (!StringUtils.isEmpty(str) && th != null) {
        }
    }

    public static void a(String str, long j2, a aVar) {
        StringUtils.isEmpty(str);
    }

    public static int d() {
        if (!l) {
            return 15000;
        }
        try {
            com.bytedance.frameworks.baselib.network.a.d c2 = com.bytedance.frameworks.baselib.network.a.c.b().c();
            if (com.bytedance.frameworks.baselib.network.a.d.POOR == c2) {
                return 45000;
            }
            if (com.bytedance.frameworks.baselib.network.a.d.MODERATE == c2) {
                return 30000;
            }
            return (com.bytedance.frameworks.baselib.network.a.d.GOOD == c2 || com.bytedance.frameworks.baselib.network.a.d.EXCELLENT == c2 || com.bytedance.frameworks.baselib.network.a.d.UNKNOWN == c2) ? 15000 : 15000;
        } catch (Throwable unused) {
        }
    }

    public static int e() {
        if (!l) {
            return 15000;
        }
        try {
            com.bytedance.frameworks.baselib.network.a.d c2 = com.bytedance.frameworks.baselib.network.a.c.b().c();
            if (com.bytedance.frameworks.baselib.network.a.d.POOR == c2) {
                return 45000;
            }
            if (com.bytedance.frameworks.baselib.network.a.d.MODERATE == c2) {
                return 30000;
            }
            return (com.bytedance.frameworks.baselib.network.a.d.GOOD == c2 || com.bytedance.frameworks.baselib.network.a.d.EXCELLENT == c2 || com.bytedance.frameworks.baselib.network.a.d.UNKNOWN == c2) ? 15000 : 15000;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|(2:9|(1:11))|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.CookieManager h() {
        /*
            java.lang.Object r0 = n
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = m     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0048 }
            r2 = 1
            if (r1 != 0) goto L_0x002f
            java.util.concurrent.CountDownLatch r1 = o     // Catch:{ Exception -> 0x002a }
            if (r1 == 0) goto L_0x002a
            java.util.concurrent.CountDownLatch r1 = o     // Catch:{ Exception -> 0x002a }
            r3 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x002a }
            r1.await(r3, r5)     // Catch:{ Exception -> 0x002a }
            java.util.concurrent.CountDownLatch r1 = o     // Catch:{ Exception -> 0x002a }
            long r3 = r1.getCount()     // Catch:{ Exception -> 0x002a }
            r5 = 1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x002a
            java.util.concurrent.CountDownLatch r1 = o     // Catch:{ Exception -> 0x002a }
            r1.countDown()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            java.util.concurrent.atomic.AtomicBoolean r1 = m     // Catch:{ all -> 0x0048 }
            r1.getAndSet(r2)     // Catch:{ all -> 0x0048 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.baselib.network.http.e$b r0 = f19857f
            if (r0 == 0) goto L_0x0037
            r0.a()
        L_0x0037:
            r0 = 0
            android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()     // Catch:{ Throwable -> 0x0046 }
            boolean r0 = r1.acceptCookie()     // Catch:{ Throwable -> 0x0047 }
            if (r0 != 0) goto L_0x0047
            r1.setAcceptCookie(r2)     // Catch:{ Throwable -> 0x0047 }
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            return r1
        L_0x0048:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.e.h():android.webkit.CookieManager");
    }

    public static String a(String str) {
        return a(str, (b) null);
    }

    public static void a(int i2) {
        h = i2;
    }

    public static void b(boolean z) {
        if (m.get() != z) {
            m.getAndSet(z);
            if (o != null && o.getCount() > 0) {
                o.countDown();
            }
            if (!z) {
                o = new CountDownLatch(1);
            }
        }
    }

    public static void a(h hVar) {
        p = hVar;
    }

    public static void a(i iVar) {
        k = iVar;
    }

    public static String a(String str, b bVar) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        c cVar = i;
        if (cVar != null) {
            str = cVar.a(str, bVar);
        }
        return str;
    }

    public static String a(String str, boolean z) {
        b bVar = f19857f;
        if (bVar != null) {
            return bVar.a(str, true);
        }
        return str;
    }

    public static Map a(String str, Map map) {
        Map<String, String> map2;
        String str2 = str;
        a aVar = j;
        if (aVar != null) {
            map2 = aVar.a(str2, map);
        } else {
            map2 = null;
        }
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, null, com.ss.android.ugc.aweme.v.d.f75988a, true, 59763, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2}, null, com.ss.android.ugc.aweme.v.d.f75988a, true, 59763, new Class[]{String.class, Map.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.v.d.a() && ContextUtils.getApplicationContext() != null && ToolUtils.isMainProcess(ContextUtils.getApplicationContext())) {
            if (map2 != null) {
                String[] strArr = com.ss.android.ugc.aweme.v.d.f75989b;
                int length = strArr.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    String str3 = strArr[i2];
                    if (TextUtils.isEmpty(map2.get(str3)) && !Uri.parse(str).getPath().equals("/v2/r")) {
                        com.ss.android.ugc.aweme.v.d.b("header通用参数" + str3 + "不能为空,url=" + str2);
                        break;
                    }
                    i2++;
                }
            } else {
                com.ss.android.ugc.aweme.v.d.b("header通用参数不能为空,url=" + str2);
            }
        }
        return map2;
    }

    public static void a(long j2, long j3, String str, String str2, a aVar) {
        k kVar = g;
        if (!StringUtils.isEmpty(str) && j2 > 0 && kVar != null) {
            kVar.a(j2, j3, str, str2, aVar);
        }
    }

    public static void a(long j2, long j3, String str, String str2, a aVar, Throwable th) {
        if (!StringUtils.isEmpty(str) && th != null) {
            k kVar = g;
            if (kVar != null) {
                kVar.a(j2, j3, str, str2, aVar, th);
            }
        }
    }
}
