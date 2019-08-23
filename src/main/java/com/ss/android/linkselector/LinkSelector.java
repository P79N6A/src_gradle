package com.ss.android.linkselector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ss.android.linkselector.c.a;
import com.ss.android.linkselector.c.b;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public final class LinkSelector {

    /* renamed from: f  reason: collision with root package name */
    public static Context f2471f;
    private static LinkSelector i = new LinkSelector();

    /* renamed from: a  reason: collision with root package name */
    public boolean f2472a = false;

    /* renamed from: b  reason: collision with root package name */
    public NetworkChangeReceiver f2473b;

    /* renamed from: c  reason: collision with root package name */
    public long f2474c = 300000;

    /* renamed from: d  reason: collision with root package name */
    public int f2475d = 10000;

    /* renamed from: e  reason: collision with root package name */
    public a f2476e;
    private Map<String, a> g = new ConcurrentHashMap();
    private Map<Pattern, String> h = new LinkedHashMap();

    public class NetworkChangeReceiver extends BroadcastReceiver {
        public NetworkChangeReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (LinkSelector.this.b()) {
                LinkSelector.this.a((a) null);
            }
        }
    }

    public final boolean b() {
        return b.a(this);
    }

    private static void d() {
        if (f2471f == null) {
            throw new IllegalStateException("LinkSelector may not been initialize! call init() in Application.onCreate() or make sure init() has been called before getInstance().");
        }
    }

    private LinkSelector() {
    }

    public static LinkSelector a() {
        d();
        if (i == null) {
            i = new LinkSelector();
        }
        return i;
    }

    public static boolean c() {
        if (f2471f == null) {
            return true;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) f2471f.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            new StringBuilder("isNetworkAvailable:").append(e2.toString());
            return false;
        }
    }

    public final void a(b bVar) {
        if (this.f2476e != null) {
            this.f2476e.a(bVar);
        }
    }

    public final void b(String str) {
        if (b()) {
            new StringBuilder("on link api success:").append(str);
        }
    }

    public final void c(String str) {
        if (b() && c()) {
            new StringBuilder("on link api error:").append(str);
            d(str);
        }
    }

    public static LinkSelector a(Context context) {
        if (context != null) {
            f2471f = context.getApplicationContext();
            return a();
        }
        throw new IllegalArgumentException("context can't be null");
    }

    public final synchronized void b(Map<Pattern, String> map) {
        if (map != null) {
            this.h.clear();
            this.h.putAll(map);
        }
    }

    private void d(String str) {
        boolean z;
        if (b()) {
            for (Map.Entry next : this.g.entrySet()) {
                if (next.getValue() != null) {
                    a aVar = (a) next.getValue();
                    URI create = URI.create(str);
                    com.ss.android.linkselector.b.b bVar = new com.ss.android.linkselector.b.b(create.getHost(), create.getScheme());
                    int i2 = 0;
                    while (true) {
                        if (i2 >= aVar.f2478a.size()) {
                            break;
                        }
                        com.ss.android.linkselector.b.b bVar2 = aVar.f2478a.get(i2);
                        if (bVar2 == null || !bVar2.f29292d.equals(bVar.f29292d) || !bVar2.f29293e.equals(bVar.f29293e)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            aVar.f2479b.a((com.ss.android.linkselector.b.a) aVar.f2478a.get(i2));
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public final String a(String str) {
        if (!b()) {
            return str;
        }
        a e2 = e(str);
        if (e2 != null) {
            return e2.a(str);
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ss.android.linkselector.a e(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00a7 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r5)
            return r1
        L_0x000a:
            java.net.URI r0 = java.net.URI.create(r6)     // Catch:{ Exception -> 0x0026 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0026 }
            r2.<init>()     // Catch:{ Exception -> 0x0026 }
            java.lang.String r3 = r0.getHost()     // Catch:{ Exception -> 0x0026 }
            r2.append(r3)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0026 }
            r2.append(r0)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0026 }
            goto L_0x0050
        L_0x0026:
            java.lang.String r0 = "?"
            int r0 = r6.indexOf(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "#"
            int r2 = r6.indexOf(r2)     // Catch:{ all -> 0x00a7 }
            int r3 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x00a7 }
            r4 = -1
            if (r3 != r4) goto L_0x003d
            int r3 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x003d:
            java.lang.String r0 = "://"
            int r0 = r6.indexOf(r0)     // Catch:{ all -> 0x00a7 }
            int r0 = r0 + 3
            if (r3 == r4) goto L_0x004c
            java.lang.String r0 = r6.substring(r0, r3)     // Catch:{ all -> 0x00a7 }
            goto L_0x0050
        L_0x004c:
            java.lang.String r0 = r6.substring(r0)     // Catch:{ all -> 0x00a7 }
        L_0x0050:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0058
            monitor-exit(r5)
            return r1
        L_0x0058:
            java.util.Map<java.util.regex.Pattern, java.lang.String> r2 = r5.h     // Catch:{ all -> 0x00a7 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00a7 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a7 }
        L_0x0062:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x00a5
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a7 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00a7 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00a7 }
            java.util.regex.Pattern r4 = (java.util.regex.Pattern) r4     // Catch:{ all -> 0x00a7 }
            java.util.regex.Matcher r4 = r4.matcher(r0)     // Catch:{ all -> 0x00a7 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0062
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = "path group key = "
            r1.<init>(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00a7 }
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = " for "
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            r1.append(r6)     // Catch:{ all -> 0x00a7 }
            java.util.Map<java.lang.String, com.ss.android.linkselector.a> r1 = r5.g     // Catch:{ all -> 0x00a7 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x00a7 }
            com.ss.android.linkselector.a r1 = (com.ss.android.linkselector.a) r1     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x00a5
            goto L_0x0062
        L_0x00a5:
            monitor-exit(r5)
            return r1
        L_0x00a7:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.linkselector.LinkSelector.e(java.lang.String):com.ss.android.linkselector.a");
    }

    public final void a(a aVar) {
        if (b()) {
            for (Map.Entry next : this.g.entrySet()) {
                if (next.getValue() != null) {
                    new StringBuilder("need opt = ").append((String) next.getKey());
                    ((a) next.getValue()).a();
                }
            }
        }
    }

    public final synchronized void a(Map<String, List<com.ss.android.linkselector.b.b>> map) {
        if (map != null) {
            this.g.clear();
            for (Map.Entry next : map.entrySet()) {
                this.g.put(next.getKey(), new a((List) next.getValue()));
            }
        }
    }
}
