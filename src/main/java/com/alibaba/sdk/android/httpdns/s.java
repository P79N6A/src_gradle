package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import java.net.SocketTimeoutException;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f5127a;

    /* renamed from: a  reason: collision with other field name */
    private static a f29a = a.ENABLE;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f5128c;

    /* renamed from: d  reason: collision with root package name */
    private static long f5129d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f5130e;

    /* renamed from: f  reason: collision with root package name */
    private static int f5131f;
    private static int g;

    enum a {
        ENABLE,
        PRE_DISABLE,
        DISABLE
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0019, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized java.lang.String a(com.alibaba.sdk.android.httpdns.n r4) {
        /*
            java.lang.Class<com.alibaba.sdk.android.httpdns.s> r0 = com.alibaba.sdk.android.httpdns.s.class
            monitor-enter(r0)
            com.alibaba.sdk.android.httpdns.n r1 = com.alibaba.sdk.android.httpdns.n.QUERY_HOST     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r4 == r1) goto L_0x001a
            com.alibaba.sdk.android.httpdns.n r1 = com.alibaba.sdk.android.httpdns.n.SNIFF_HOST     // Catch:{ all -> 0x003d }
            if (r4 != r1) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            com.alibaba.sdk.android.httpdns.n r1 = com.alibaba.sdk.android.httpdns.n.QUERY_SCHEDULE_CENTER     // Catch:{ all -> 0x003d }
            if (r4 == r1) goto L_0x0018
            com.alibaba.sdk.android.httpdns.n r1 = com.alibaba.sdk.android.httpdns.n.SNIFF_SCHEDULE_CENTER     // Catch:{ all -> 0x003d }
            if (r4 != r1) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            monitor-exit(r0)
            return r2
        L_0x0018:
            monitor-exit(r0)
            return r2
        L_0x001a:
            com.alibaba.sdk.android.httpdns.s$a r1 = f29a     // Catch:{ all -> 0x003d }
            com.alibaba.sdk.android.httpdns.s$a r3 = com.alibaba.sdk.android.httpdns.s.a.ENABLE     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x0035
            com.alibaba.sdk.android.httpdns.s$a r1 = f29a     // Catch:{ all -> 0x003d }
            com.alibaba.sdk.android.httpdns.s$a r3 = com.alibaba.sdk.android.httpdns.s.a.PRE_DISABLE     // Catch:{ all -> 0x003d }
            if (r1 != r3) goto L_0x0027
            goto L_0x0035
        L_0x0027:
            com.alibaba.sdk.android.httpdns.n r1 = com.alibaba.sdk.android.httpdns.n.QUERY_HOST     // Catch:{ all -> 0x003d }
            if (r4 != r1) goto L_0x002d
            monitor-exit(r0)
            return r2
        L_0x002d:
            java.lang.String[] r4 = com.alibaba.sdk.android.httpdns.d.f5094b     // Catch:{ all -> 0x003d }
            int r1 = f5131f     // Catch:{ all -> 0x003d }
            r4 = r4[r1]     // Catch:{ all -> 0x003d }
            monitor-exit(r0)
            return r4
        L_0x0035:
            java.lang.String[] r4 = com.alibaba.sdk.android.httpdns.d.f5094b     // Catch:{ all -> 0x003d }
            int r1 = f5131f     // Catch:{ all -> 0x003d }
            r4 = r4[r1]     // Catch:{ all -> 0x003d }
            monitor-exit(r0)
            return r4
        L_0x003d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.s.a(com.alibaba.sdk.android.httpdns.n):java.lang.String");
    }

    static synchronized void a(Context context) {
        synchronized (s.class) {
            if (!f5128c) {
                synchronized (s.class) {
                    if (!f5128c) {
                        if (context != null) {
                            f5127a = c.a(context, "httpdns_config_cache", 0);
                        }
                        f5130e = f5127a.getBoolean("status", false);
                        int i = f5127a.getInt("activiate_ip_index", 0);
                        f5131f = i;
                        g = i;
                        f5129d = f5127a.getLong("disable_modified_time", 0);
                        if (System.currentTimeMillis() - f5129d >= 86400000) {
                            b(false);
                        }
                        f29a = f5130e ? a.DISABLE : a.ENABLE;
                        f5128c = true;
                    }
                }
            }
        }
    }

    static synchronized void a(String str, String str2) {
        synchronized (s.class) {
            if (!(f29a == a.ENABLE || str2 == null || !str2.equals(d.f5094b[f5131f]))) {
                StringBuilder sb = new StringBuilder();
                sb.append(f29a == a.DISABLE ? "Disable " : "Pre_disable ");
                sb.append("mode finished. Enter enable mode.");
                g.f(sb.toString());
                f29a = a.ENABLE;
                b(false);
                q.a().e();
                g = f5131f;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void a(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
        /*
            java.lang.Class<com.alibaba.sdk.android.httpdns.s> r0 = com.alibaba.sdk.android.httpdns.s.class
            monitor-enter(r0)
            boolean r4 = a((java.lang.Throwable) r4)     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x005a
            if (r3 == 0) goto L_0x005a
            java.lang.String[] r4 = com.alibaba.sdk.android.httpdns.d.f5094b     // Catch:{ all -> 0x005c }
            int r1 = f5131f     // Catch:{ all -> 0x005c }
            r4 = r4[r1]     // Catch:{ all -> 0x005c }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x005a
            f()     // Catch:{ all -> 0x005c }
            int r3 = g     // Catch:{ all -> 0x005c }
            int r4 = f5131f     // Catch:{ all -> 0x005c }
            if (r3 != r4) goto L_0x002f
            com.alibaba.sdk.android.httpdns.q r3 = com.alibaba.sdk.android.httpdns.q.a()     // Catch:{ all -> 0x005c }
            r4 = 0
            r3.a(r4)     // Catch:{ all -> 0x005c }
            com.alibaba.sdk.android.httpdns.o r3 = com.alibaba.sdk.android.httpdns.o.a()     // Catch:{ all -> 0x005c }
            r3.c()     // Catch:{ all -> 0x005c }
        L_0x002f:
            com.alibaba.sdk.android.httpdns.s$a r3 = f29a     // Catch:{ all -> 0x005c }
            com.alibaba.sdk.android.httpdns.s$a r4 = com.alibaba.sdk.android.httpdns.s.a.ENABLE     // Catch:{ all -> 0x005c }
            if (r3 != r4) goto L_0x0040
            com.alibaba.sdk.android.httpdns.s$a r2 = com.alibaba.sdk.android.httpdns.s.a.PRE_DISABLE     // Catch:{ all -> 0x005c }
            f29a = r2     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "enter pre_disable mode"
            com.alibaba.sdk.android.httpdns.g.f(r2)     // Catch:{ all -> 0x005c }
            monitor-exit(r0)
            return
        L_0x0040:
            com.alibaba.sdk.android.httpdns.s$a r3 = f29a     // Catch:{ all -> 0x005c }
            com.alibaba.sdk.android.httpdns.s$a r4 = com.alibaba.sdk.android.httpdns.s.a.PRE_DISABLE     // Catch:{ all -> 0x005c }
            if (r3 != r4) goto L_0x005a
            com.alibaba.sdk.android.httpdns.s$a r3 = com.alibaba.sdk.android.httpdns.s.a.DISABLE     // Catch:{ all -> 0x005c }
            f29a = r3     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "enter disable mode"
            com.alibaba.sdk.android.httpdns.g.f(r3)     // Catch:{ all -> 0x005c }
            r3 = 1
            b((boolean) r3)     // Catch:{ all -> 0x005c }
            com.alibaba.sdk.android.httpdns.q r3 = com.alibaba.sdk.android.httpdns.q.a()     // Catch:{ all -> 0x005c }
            r3.g(r2)     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r0)
            return
        L_0x005c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.s.a(java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    private static boolean a(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return true;
        }
        if (th instanceof f) {
            f fVar = (f) th;
            return fVar.getErrorCode() == 403 && fVar.getMessage().equals("ServiceLevelDeny");
        }
    }

    static void b(int i) {
        if (f5127a != null && i >= 0 && i < d.f5094b.length) {
            f5131f = i;
            SharedPreferences.Editor edit = f5127a.edit();
            edit.putInt("activiate_ip_index", i);
            edit.putLong("activiated_ip_index_modified_time", System.currentTimeMillis());
            edit.commit();
        }
    }

    static synchronized void b(boolean z) {
        synchronized (s.class) {
            if (f5130e != z) {
                f5130e = z;
                if (f5127a != null) {
                    SharedPreferences.Editor edit = f5127a.edit();
                    edit.putBoolean("status", f5130e);
                    edit.putLong("disable_modified_time", System.currentTimeMillis());
                    edit.commit();
                }
            }
        }
    }

    static synchronized boolean d() {
        boolean z;
        synchronized (s.class) {
            z = f5130e;
        }
        return z;
    }

    private static void f() {
        f5131f = f5131f == d.f5094b.length + -1 ? 0 : f5131f + 1;
        b(f5131f);
    }

    static synchronized void g() {
        synchronized (s.class) {
            b(0);
            g = f5131f;
            q.a().a(true);
        }
    }

    static synchronized void h() {
        synchronized (s.class) {
            q.a().a(true);
        }
    }
}
