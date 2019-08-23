package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.l;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class StrategyConfig implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private SerialLruCache<String, String> f1326a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f1327b;

    /* renamed from: c  reason: collision with root package name */
    private transient StrategyInfoHolder f1328c;

    StrategyConfig() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f1326a == null) {
            this.f1326a = new SerialLruCache<>(256);
        }
        if (this.f1327b == null) {
            this.f1327b = new ConcurrentHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(StrategyInfoHolder strategyInfoHolder) {
        this.f1328c = strategyInfoHolder;
    }

    /* access modifiers changed from: package-private */
    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f1327b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if ("No_Result".equals(r2) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = anet.channel.strategy.utils.c.c(r6)
            if (r0 != 0) goto L_0x000e
            goto L_0x003e
        L_0x000e:
            anet.channel.strategy.utils.SerialLruCache<java.lang.String, java.lang.String> r0 = r5.f1326a
            monitor-enter(r0)
            anet.channel.strategy.utils.SerialLruCache<java.lang.String, java.lang.String> r2 = r5.f1326a     // Catch:{ all -> 0x003b }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x003b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x0022
            anet.channel.strategy.utils.SerialLruCache<java.lang.String, java.lang.String> r3 = r5.f1326a     // Catch:{ all -> 0x003b }
            java.lang.String r4 = "No_Result"
            r3.put(r6, r4)     // Catch:{ all -> 0x003b }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x0030
            anet.channel.strategy.StrategyInfoHolder r0 = r5.f1328c
            anet.channel.strategy.StrategyTable r0 = r0.d()
            r1 = 0
            r0.a((java.lang.String) r6, (boolean) r1)
            goto L_0x0039
        L_0x0030:
            java.lang.String r6 = "No_Result"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r1 = r2
        L_0x003a:
            return r1
        L_0x003b:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r6
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyConfig.a(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public void a(l.d dVar) {
        if (dVar.f1407b != null) {
            synchronized (this) {
                TreeMap treeMap = null;
                for (l.b bVar : dVar.f1407b) {
                    if (bVar.j) {
                        this.f1326a.remove(bVar.f1398a);
                    } else if (bVar.f1401d != null) {
                        if (treeMap == null) {
                            treeMap = new TreeMap();
                        }
                        treeMap.put(bVar.f1398a, bVar.f1401d);
                    } else {
                        if ("http".equalsIgnoreCase(bVar.f1400c) || "https".equalsIgnoreCase(bVar.f1400c)) {
                            this.f1326a.put(bVar.f1398a, bVar.f1400c);
                        } else {
                            this.f1326a.put(bVar.f1398a, "No_Result");
                        }
                        if (!TextUtils.isEmpty(bVar.f1402e)) {
                            this.f1327b.put(bVar.f1398a, bVar.f1402e);
                        } else {
                            this.f1327b.remove(bVar.f1398a);
                        }
                    }
                }
                if (treeMap != null) {
                    for (Map.Entry entry : treeMap.entrySet()) {
                        String str = (String) entry.getValue();
                        if (this.f1326a.containsKey(str)) {
                            this.f1326a.put(entry.getKey(), this.f1326a.get(str));
                        } else {
                            this.f1326a.put(entry.getKey(), "No_Result");
                        }
                    }
                }
            }
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.StrategyConfig", "", null, "SchemeMap", this.f1326a.toString());
                ALog.d("awcn.StrategyConfig", "", null, "UnitMap", this.f1327b.toString());
            }
        }
    }
}
