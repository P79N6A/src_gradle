package com.bytedance.ad.symphony.a.a;

import android.content.Context;
import android.os.Handler;
import com.bytedance.ad.symphony.ad.a;
import com.bytedance.ad.symphony.b.f;
import com.bytedance.ad.symphony.e;
import com.bytedance.ad.symphony.g.d;
import com.bytedance.ad.symphony.model.config.c;
import com.bytedance.ad.symphony.provider.b;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakContainer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public abstract class a<AD extends com.bytedance.ad.symphony.ad.a> implements com.bytedance.ad.symphony.a.a<AD> {

    /* renamed from: a  reason: collision with root package name */
    protected Handler f7550a;

    /* renamed from: b  reason: collision with root package name */
    protected Handler f7551b;

    /* renamed from: c  reason: collision with root package name */
    public Map<Integer, b<AD>> f7552c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    protected Map<String, Long> f7553d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    protected Map<String, WeakContainer<Object>> f7554e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    protected Context f7555f;
    protected com.bytedance.ad.symphony.f.b g;
    public com.bytedance.ad.symphony.c.a h;
    public Map<String, List<String>> i;
    private final Object j = new Object();
    private volatile Boolean k = Boolean.TRUE;
    private volatile boolean l;
    private boolean m;
    private b.a n;

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public void c() {
    }

    public final com.bytedance.ad.symphony.f.b b() {
        return this.g;
    }

    public final void a(c cVar) {
        this.g.f7631c = cVar;
    }

    private void b(final String str) {
        if (StringUtils.isEmpty(str)) {
            a();
        } else if (c(str)) {
            a();
        } else {
            this.f7550a.post(new Runnable() {
                public final void run() {
                    a.this.a(str);
                }
            });
        }
    }

    private boolean c(String str) {
        if (!this.f7553d.containsKey(str) || this.f7553d.get(str).longValue() == 0) {
            return false;
        }
        if (System.currentTimeMillis() - this.f7553d.get(str).longValue() < 25000) {
            return true;
        }
        this.f7553d.put(str, 0L);
        f.a(str);
        a();
        new Exception(str + "：requestHandler fail to call onPreloadFinish,trigger timeout strategy");
        return false;
    }

    private void d(String str) {
        if (com.bytedance.ad.symphony.b.b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":ad pool status\n");
            Iterator<Map.Entry<Integer, b<AD>>> it2 = this.f7552c.entrySet().iterator();
            while (it2.hasNext()) {
                sb.append(((b) it2.next().getValue()).toString() + "\n");
            }
            a();
        }
    }

    public final void a(String str) {
        com.bytedance.ad.symphony.g.f.a();
        if (c(str)) {
            a();
            return;
        }
        com.bytedance.ad.symphony.f.a a2 = this.g.a(str);
        if (a2 != null) {
            if (!d.a(a2.d()) || (!d.a(a2.c()) && !d.a((List) a2.c().get(0)))) {
                d("before crate request handler:");
                a();
                StringBuilder sb = new StringBuilder("tryPreloadAd, type:");
                sb.append(str);
                sb.append(",use strategy:");
                sb.append(a2.toString());
                List<com.bytedance.ad.symphony.e.b> a3 = e.a(this.f7555f, a2, str, this.n, this);
                if (!d.a(a3)) {
                    a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(": start loading");
                    this.f7553d.put(str, Long.valueOf(System.currentTimeMillis()));
                    for (com.bytedance.ad.symphony.e.b c2 : a3) {
                        c2.c();
                    }
                }
            }
        }
    }

    private static void a(com.bytedance.ad.symphony.ad.a aVar, com.bytedance.ad.symphony.b.b bVar) {
        if (!(aVar == null || bVar == null)) {
            try {
                f.a(aVar);
            } catch (Exception e2) {
                com.bytedance.ad.symphony.d.a(e2);
            }
        }
    }

    private int a(com.bytedance.ad.symphony.f.a aVar, String str) {
        a();
        StringBuilder sb = new StringBuilder("getCachedAdProviderId,type:");
        sb.append(str);
        sb.append("    use strategy：");
        sb.append(aVar.a());
        if (!(aVar == null || aVar.b() == null)) {
            for (Integer intValue : aVar.b()) {
                int intValue2 = intValue.intValue();
                b bVar = this.f7552c.get(Integer.valueOf(intValue2));
                if (bVar != null && bVar.hasValidAd(str)) {
                    return intValue2;
                }
            }
        }
        return -1;
    }

    public final AD a(com.bytedance.ad.symphony.model.a aVar, com.bytedance.ad.symphony.b.b bVar) {
        String str;
        AD ad = null;
        if (aVar == null || d.a(aVar.f7642b) || aVar.f7641a == null) {
            return null;
        }
        if (bVar == null || bVar.f7583b == null) {
            a();
        }
        List<String> list = aVar.f7642b;
        com.bytedance.ad.symphony.f.a aVar2 = aVar.f7641a;
        if (list.size() == 1) {
            String str2 = list.get(0);
            long j2 = aVar.f7644d;
            JSONObject jSONObject = aVar.f7643c;
            if (aVar2 == null || str2 == null) {
                a();
                return null;
            }
            a();
            StringBuilder sb = new StringBuilder("placementType:");
            sb.append(str2);
            sb.append(",fillStrategy:");
            sb.append(aVar2);
            this.g.a(str2, aVar2);
            int a2 = a(this.g.a(str2), str2);
            if (a2 == -1) {
                b(str2);
                return null;
            }
            a();
            new StringBuilder("find cached ad ,providerId:").append(a2);
            if (bVar != null) {
                str = bVar.f7583b;
            } else {
                str = "";
            }
            String str3 = str;
            if (StringUtils.isEmpty(str2)) {
                a();
            } else {
                ad = a(a2, str2, j2, jSONObject, str3);
                a((com.bytedance.ad.symphony.ad.a) ad, bVar);
                b(str2);
            }
            d("after geNext ad:");
            return ad;
        }
        return a(aVar.f7641a, aVar.f7642b, bVar, aVar.f7644d, aVar.f7643c);
    }

    public a(b bVar, String str, String str2) {
        boolean z = true;
        this.l = true;
        this.n = new b.a() {
            public final void a(final String str) {
                com.bytedance.ad.symphony.g.f.a();
                a.this.a();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(":onPreloadFinished");
                a.this.f7553d.put(str, 0L);
                a.this.f7551b.post(new Runnable() {
                    public final void run() {
                        WeakContainer weakContainer = a.this.f7554e.get(str);
                        if (weakContainer != null) {
                            Iterator it2 = weakContainer.iterator();
                            while (it2.hasNext()) {
                                it2.next();
                            }
                        }
                    }
                });
            }

            public final void a(String str, String str2, int i, String str3, double d2) {
                com.bytedance.ad.symphony.g.f.a();
                a.this.a();
                StringBuilder sb = new StringBuilder("preload FAILED, providerId--> ");
                sb.append(i);
                sb.append(", type-->");
                sb.append(str);
                sb.append(", requestTime-->");
                sb.append(d2);
                if (!com.bytedance.ad.symphony.e.b.f7622a.contains(str3)) {
                    if ("Request Timeout".equals(str3)) {
                        com.bytedance.ad.symphony.b.d dVar = new com.bytedance.ad.symphony.b.d();
                        dVar.f7592c = i;
                        dVar.f7590a = str2;
                        dVar.f7591b = str;
                        if (f.a()) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("ad_placement_id", dVar.f7590a);
                            hashMap.put("ad_placement_type_prefix", com.bytedance.ad.symphony.model.config.a.a(dVar.f7591b));
                            hashMap.put("ad_placement_type", dVar.f7591b);
                            hashMap.put("ad_provider_id", Integer.valueOf(dVar.f7592c));
                            f.a("ad_request_timeout", "sdk_ad", 0, null, hashMap);
                        }
                        return;
                    }
                    com.bytedance.ad.symphony.b.c cVar = new com.bytedance.ad.symphony.b.c();
                    cVar.f7589f = i;
                    cVar.f7588e = d2;
                    cVar.f7586c = str2;
                    cVar.f7587d = str;
                    cVar.f7584a = "failed";
                    cVar.f7585b = str3;
                    if (f.a()) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("request_status", cVar.f7584a);
                        hashMap2.put("error_message", cVar.f7585b);
                        hashMap2.put("ad_placement_id", cVar.f7586c);
                        hashMap2.put("ad_placement_type_prefix", com.bytedance.ad.symphony.model.config.a.a(cVar.f7587d));
                        hashMap2.put("ad_placement_type", cVar.f7587d);
                        hashMap2.put("ad_request_time", Double.valueOf(cVar.f7588e));
                        hashMap2.put("ad_provider_id", Integer.valueOf(cVar.f7589f));
                        f.a("ad_sdk_request", "sdk_ad", 0, null, hashMap2);
                    }
                }
            }
        };
        this.f7550a = new Handler(com.bytedance.ad.symphony.g.a.a());
        this.f7551b = com.bytedance.ad.symphony.g.a.f7636a;
        this.f7555f = bVar.f7563a.getApplicationContext();
        this.m = bVar.f7564b;
        this.h = bVar.f7566d;
        this.g = new com.bytedance.ad.symphony.f.b(this.f7555f, str, str2);
        this.g.f7630b = (!bVar.f7565c || !com.bytedance.ad.symphony.b.b()) ? false : z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        a();
        new java.lang.StringBuilder("createProvider, className-->").append(r6);
        r4 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0088 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<com.bytedance.ad.symphony.model.config.AdConfig> r13, android.util.SparseArray<com.bytedance.ad.symphony.provider.a.C0060a> r14, java.lang.Class<? extends com.bytedance.ad.symphony.a.a> r15) {
        /*
            r12 = this;
            boolean r0 = r12.l
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r12.l = r1
            r12.c()
        L_0x000a:
            if (r13 == 0) goto L_0x0143
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0014
            goto L_0x0143
        L_0x0014:
            boolean r0 = r12.m
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.Object r0 = r12.j
            monitor-enter(r0)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0140 }
            r2.<init>(r13)     // Catch:{ all -> 0x0140 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0140 }
        L_0x0025:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0140 }
            if (r3 == 0) goto L_0x00c7
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0140 }
            com.bytedance.ad.symphony.model.config.AdConfig r3 = (com.bytedance.ad.symphony.model.config.AdConfig) r3     // Catch:{ all -> 0x0140 }
            if (r3 == 0) goto L_0x0025
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r4 = r12.f7552c     // Catch:{ all -> 0x0140 }
            int r5 = r3.f7654a     // Catch:{ all -> 0x0140 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0140 }
            boolean r4 = r4.containsKey(r5)     // Catch:{ all -> 0x0140 }
            if (r4 != 0) goto L_0x00b4
            android.content.Context r4 = r12.f7555f     // Catch:{ all -> 0x0140 }
            r5 = 0
            java.lang.String r6 = ""
            if (r3 == 0) goto L_0x005b
            if (r14 == 0) goto L_0x005b
            int r7 = r3.f7654a     // Catch:{ Exception -> 0x0088 }
            int r7 = com.bytedance.ad.symphony.provider.a.getRealProviderId(r7)     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r7 = r14.get(r7)     // Catch:{ Exception -> 0x0088 }
            com.bytedance.ad.symphony.provider.a$a r7 = (com.bytedance.ad.symphony.provider.a.C0060a) r7     // Catch:{ Exception -> 0x0088 }
            if (r7 == 0) goto L_0x005b
            java.lang.String r7 = r7.f7679c     // Catch:{ Exception -> 0x0088 }
            r6 = r7
        L_0x005b:
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0088 }
            if (r7 == 0) goto L_0x0062
            goto L_0x0025
        L_0x0062:
            java.lang.Class r7 = java.lang.Class.forName(r6)     // Catch:{ Exception -> 0x0088 }
            r8 = 3
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0088 }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r1] = r10     // Catch:{ Exception -> 0x0088 }
            java.lang.Class<com.bytedance.ad.symphony.model.config.AdConfig> r10 = com.bytedance.ad.symphony.model.config.AdConfig.class
            r11 = 1
            r9[r11] = r10     // Catch:{ Exception -> 0x0088 }
            r10 = 2
            r9[r10] = r15     // Catch:{ Exception -> 0x0088 }
            java.lang.reflect.Constructor r7 = r7.getConstructor(r9)     // Catch:{ Exception -> 0x0088 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0088 }
            r8[r1] = r4     // Catch:{ Exception -> 0x0088 }
            r8[r11] = r3     // Catch:{ Exception -> 0x0088 }
            r8[r10] = r12     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r4 = r7.newInstance(r8)     // Catch:{ Exception -> 0x0088 }
            com.bytedance.ad.symphony.provider.a r4 = (com.bytedance.ad.symphony.provider.a) r4     // Catch:{ Exception -> 0x0088 }
            goto L_0x0096
        L_0x0088:
            r12.a()     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            java.lang.String r7 = "createProvider, className-->"
            r4.<init>(r7)     // Catch:{ all -> 0x0140 }
            r4.append(r6)     // Catch:{ all -> 0x0140 }
            r4 = r5
        L_0x0096:
            if (r4 == 0) goto L_0x0025
            r12.a()     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "createProvider, providerId-->"
            r5.<init>(r6)     // Catch:{ all -> 0x0140 }
            int r6 = r3.f7654a     // Catch:{ all -> 0x0140 }
            r5.append(r6)     // Catch:{ all -> 0x0140 }
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r5 = r12.f7552c     // Catch:{ all -> 0x0140 }
            int r3 = r3.f7654a     // Catch:{ all -> 0x0140 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0140 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0140 }
            goto L_0x0025
        L_0x00b4:
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r4 = r12.f7552c     // Catch:{ all -> 0x0140 }
            int r5 = r3.f7654a     // Catch:{ all -> 0x0140 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0140 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0140 }
            com.bytedance.ad.symphony.provider.b r4 = (com.bytedance.ad.symphony.provider.b) r4     // Catch:{ all -> 0x0140 }
            r4.setAdConfig(r3)     // Catch:{ all -> 0x0140 }
            goto L_0x0025
        L_0x00c7:
            r12.a()     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            java.lang.String r15 = "initConfig, providers created, size-->"
            r14.<init>(r15)     // Catch:{ all -> 0x0140 }
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r15 = r12.f7552c     // Catch:{ all -> 0x0140 }
            if (r15 != 0) goto L_0x00d6
            goto L_0x00dc
        L_0x00d6:
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r15 = r12.f7552c     // Catch:{ all -> 0x0140 }
            int r1 = r15.size()     // Catch:{ all -> 0x0140 }
        L_0x00dc:
            r14.append(r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r0)     // Catch:{ all -> 0x0140 }
            com.bytedance.ad.symphony.c.a r14 = r12.h
            if (r14 == 0) goto L_0x013f
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r15 = r12.f7552c
            java.util.Set r15 = r15.keySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x00f3:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r15.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r14.add(r0)
            goto L_0x00f3
        L_0x0103:
            java.lang.Boolean r14 = r12.k
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x012f
            java.lang.Boolean r14 = r12.k
            monitor-enter(r14)
            java.lang.Boolean r15 = r12.k     // Catch:{ all -> 0x012c }
            boolean r15 = r15.booleanValue()     // Catch:{ all -> 0x012c }
            if (r15 == 0) goto L_0x012a
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r15 = r12.f7552c     // Catch:{ all -> 0x012c }
            if (r15 == 0) goto L_0x012a
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x012c }
            r12.k = r13     // Catch:{ all -> 0x012c }
            android.os.Handler r13 = r12.f7551b     // Catch:{ all -> 0x012c }
            com.bytedance.ad.symphony.a.a.a$3 r15 = new com.bytedance.ad.symphony.a.a.a$3     // Catch:{ all -> 0x012c }
            r15.<init>()     // Catch:{ all -> 0x012c }
            r13.post(r15)     // Catch:{ all -> 0x012c }
            monitor-exit(r14)     // Catch:{ all -> 0x012c }
            return
        L_0x012a:
            monitor-exit(r14)     // Catch:{ all -> 0x012c }
            goto L_0x012f
        L_0x012c:
            r13 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x012c }
            throw r13
        L_0x012f:
            boolean r13 = com.bytedance.ad.symphony.g.d.a(r13)
            if (r13 != 0) goto L_0x013f
            android.os.Handler r13 = r12.f7551b
            com.bytedance.ad.symphony.a.a.a$4 r14 = new com.bytedance.ad.symphony.a.a.a$4
            r14.<init>()
            r13.post(r14)
        L_0x013f:
            return
        L_0x0140:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0140 }
            throw r13
        L_0x0143:
            r12.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ad.symphony.a.a.a.a(java.util.List, android.util.SparseArray, java.lang.Class):void");
    }

    private AD a(int i2, String str, long j2, JSONObject jSONObject, String str2) {
        b bVar = this.f7552c.get(Integer.valueOf(i2));
        if (bVar == null) {
            return null;
        }
        AD nextAd = bVar.getNextAd(str);
        if (!(nextAd == null || nextAd.a() == null)) {
            nextAd.a().f7648d = j2;
            nextAd.a().f7649e = jSONObject;
            nextAd.a().g = str2;
        }
        return nextAd;
    }

    private AD a(com.bytedance.ad.symphony.f.a aVar, List<String> list, com.bytedance.ad.symphony.b.b bVar, long j2, JSONObject jSONObject) {
        String str;
        List<String> list2 = list;
        com.bytedance.ad.symphony.b.b bVar2 = bVar;
        AD ad = null;
        if (aVar == null || d.a(list)) {
            a();
            return null;
        }
        a();
        StringBuilder sb = new StringBuilder("placementType:");
        sb.append(list);
        sb.append(",fillStrategy:");
        sb.append(aVar);
        for (String a2 : list) {
            this.g.a(a2, aVar);
        }
        List b2 = this.g.a(list.get(0)).b();
        if (d.a(b2)) {
            return null;
        }
        for (int i2 = 0; i2 < b2.size(); i2++) {
            int intValue = ((Integer) b2.get(i2)).intValue();
            b bVar3 = this.f7552c.get(Integer.valueOf(intValue));
            if (bVar3 != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        break;
                    }
                    String str2 = list.get(i3);
                    if (bVar3.hasValidAd(str2)) {
                        if (bVar2 != null) {
                            str = bVar2.f7583b;
                        } else {
                            str = "";
                        }
                        ad = a(intValue, str2, j2, jSONObject, str);
                    } else {
                        i3++;
                    }
                }
                if (ad != null) {
                    break;
                }
            }
        }
        if (ad != null) {
            a((com.bytedance.ad.symphony.ad.a) ad, bVar2);
        }
        for (String b3 : list) {
            b(b3);
        }
        if (ad != null) {
            a();
            new StringBuilder("find cached ad:").append(ad);
        } else {
            a();
        }
        return ad;
    }
}
