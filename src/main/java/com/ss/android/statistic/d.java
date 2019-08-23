package com.ss.android.statistic;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.statistic.b.b;
import com.ss.android.statistic.c.c;
import com.ss.android.ugc.aweme.app.ag;
import com.ss.android.ugc.aweme.app.ah;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class d {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public c f2562a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public a f2563b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    private Map<String, com.ss.android.statistic.a.c> f2564c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private List<com.ss.android.statistic.b.a> f2565d;

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f2566e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final Queue<c> f2567f;
    @NonNull
    private Application g;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f31120a = new d((byte) 0);
    }

    public final void a(String str, String str2, String str3, Long l, Long l2, JSONObject jSONObject, int i) {
        e.a(this, str, str2, str3, l, l2, jSONObject, i);
    }

    @NonNull
    public static d a() {
        return a.f31120a;
    }

    public boolean b() {
        return this.f2566e.get();
    }

    private d() {
        this.f2564c = new ConcurrentHashMap();
        this.f2565d = new CopyOnWriteArrayList();
        this.f2562a = new c();
        this.f2566e = new AtomicBoolean(false);
        this.f2567f = new LinkedList();
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public final void a(@NonNull a aVar) {
        this.f2563b = aVar;
        for (com.ss.android.statistic.a.c a2 : this.f2564c.values()) {
            a2.a(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r0 = r6.f2565d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r0.next().a(r7) != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r0 = r6.f2564c.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r0.hasNext() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r1 = r0.next();
        r2 = true;
        r3 = r6.f2565d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r3.hasNext() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r3.next().a(r7, r1.a()) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r2 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        r1.b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(@android.support.annotation.NonNull com.ss.android.statistic.c r7) {
        /*
            r6 = this;
            java.util.Queue<com.ss.android.statistic.c> r0 = r6.f2567f
            monitor-enter(r0)
            boolean r1 = r6.b()     // Catch:{ all -> 0x0074 }
            if (r1 != 0) goto L_0x001f
            java.util.Queue<com.ss.android.statistic.c> r1 = r6.f2567f     // Catch:{ all -> 0x0074 }
            r1.offer(r7)     // Catch:{ all -> 0x0074 }
            java.util.Queue<com.ss.android.statistic.c> r7 = r6.f2567f     // Catch:{ all -> 0x0074 }
            int r7 = r7.size()     // Catch:{ all -> 0x0074 }
            r1 = 50
            if (r7 <= r1) goto L_0x001d
            java.util.Queue<com.ss.android.statistic.c> r7 = r6.f2567f     // Catch:{ all -> 0x0074 }
            r7.poll()     // Catch:{ all -> 0x0074 }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            java.util.List<com.ss.android.statistic.b.a> r0 = r6.f2565d
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r0.next()
            com.ss.android.statistic.b.a r1 = (com.ss.android.statistic.b.a) r1
            boolean r1 = r1.a(r7)
            if (r1 != 0) goto L_0x0026
            return
        L_0x0039:
            java.util.Map<java.lang.String, com.ss.android.statistic.a.c> r0 = r6.f2564c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0043:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0073
            java.lang.Object r1 = r0.next()
            com.ss.android.statistic.a.c r1 = (com.ss.android.statistic.a.c) r1
            r2 = 1
            java.util.List<com.ss.android.statistic.b.a> r3 = r6.f2565d
            java.util.Iterator r3 = r3.iterator()
        L_0x0056:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006d
            java.lang.Object r4 = r3.next()
            com.ss.android.statistic.b.a r4 = (com.ss.android.statistic.b.a) r4
            java.lang.String r5 = r1.a()
            boolean r4 = r4.a(r7, r5)
            if (r4 != 0) goto L_0x0056
            r2 = 0
        L_0x006d:
            if (r2 == 0) goto L_0x0043
            r1.b(r7)
            goto L_0x0043
        L_0x0073:
            return
        L_0x0074:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.statistic.d.a(com.ss.android.statistic.c):void");
    }

    private void a(@NonNull com.ss.android.statistic.a.c cVar, boolean z) {
        String a2 = cVar.a();
        if (!TextUtils.isEmpty(a2) && z) {
            if (!(this.g == null || this.f2563b == null)) {
                cVar.a(this.g, this.f2563b);
            }
            this.f2564c.put(a2, cVar);
        }
    }

    public final void b(@NonNull String str, @Nullable Map<String, String> map, int i) {
        Set<Map.Entry<String, String>> set;
        HashMap hashMap = new HashMap();
        if (map != null) {
            set = map.entrySet();
        } else {
            set = null;
        }
        if (set != null) {
            for (Map.Entry next : set) {
                hashMap.put(next.getKey(), next.getValue());
            }
        }
        a(new c(str, hashMap, i));
    }

    public final void a(@NonNull Application application, @NonNull a aVar, boolean z) {
        LinkedList linkedList;
        this.g = application;
        this.f2563b = aVar;
        a(new com.ss.android.statistic.a.a(), z);
        a(new com.ss.android.statistic.a.d(), z);
        this.f2565d.add(new com.ss.android.statistic.b.c(new com.ss.android.statistic.b.d(new b())));
        this.f2566e.set(true);
        if (b()) {
            synchronized (this.f2567f) {
                linkedList = new LinkedList(this.f2567f);
                this.f2567f.clear();
            }
            while (!linkedList.isEmpty()) {
                a((c) linkedList.poll());
            }
        }
    }

    public final void a(String str, Map map, int i) {
        Set<Map.Entry> set;
        if (com.ss.android.ugc.aweme.g.a.a()) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    set = map.entrySet();
                } else {
                    set = null;
                }
                if (set != null) {
                    for (Map.Entry entry : set) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
                ag.a().a(new ah(2, str, jSONObject));
            } catch (Exception unused) {
            }
        }
        b(str, map, i);
    }

    public final void b(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable Long l, @Nullable Long l2, @Nullable JSONObject jSONObject, int i) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(b.s, str);
        }
        if (str3 != null) {
            hashMap.put(b.p, str3);
        }
        if (l != null) {
            hashMap.put(b.t, l);
        }
        if (l2 != null) {
            hashMap.put(b.u, l2);
        }
        if (jSONObject != null) {
            hashMap.put(b.v, jSONObject);
        }
        a(new c(str2, hashMap, i));
    }
}
