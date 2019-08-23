package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.dispatch.a;
import anet.channel.strategy.l;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.strategy.utils.c;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class StrategyTable implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    protected static Comparator<StrategyCollection> f1339f = new o();

    /* renamed from: a  reason: collision with root package name */
    protected String f1340a;

    /* renamed from: b  reason: collision with root package name */
    protected volatile String f1341b;

    /* renamed from: c  reason: collision with root package name */
    boolean f1342c;

    /* renamed from: d  reason: collision with root package name */
    Map<String, Long> f1343d;

    /* renamed from: e  reason: collision with root package name */
    protected transient boolean f1344e;
    private HostLruCache g;
    private volatile transient int h;

    static class HostLruCache extends SerialLruCache<String, StrategyCollection> {
        public HostLruCache(int i) {
            super(i);
        }

        public boolean entryRemoved(Map.Entry<String, StrategyCollection> entry) {
            if (!entry.getValue().f1324e) {
                return true;
            }
            Iterator it2 = entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!((StrategyCollection) ((Map.Entry) it2.next()).getValue()).f1324e) {
                        it2.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            return false;
        }
    }

    private void b() {
        if (HttpDispatcher.getInstance().isInitHostsChanged(this.f1340a)) {
            for (String next : HttpDispatcher.getInstance().getInitHosts()) {
                this.g.put(next, new StrategyCollection(next));
            }
        }
    }

    private void c() {
        try {
            if (HttpDispatcher.getInstance().isInitHostsChanged(this.f1340a)) {
                TreeSet treeSet = null;
                synchronized (this.g) {
                    for (String next : HttpDispatcher.getInstance().getInitHosts()) {
                        if (!this.g.containsKey(next)) {
                            this.g.put(next, new StrategyCollection(next));
                            if (treeSet == null) {
                                treeSet = new TreeSet();
                            }
                            treeSet.add(next);
                        }
                    }
                }
                if (treeSet != null) {
                    a((Set<String>) treeSet);
                }
            }
        } catch (Exception e2) {
            ALog.e("awcn.StrategyTable", "checkInitHost failed", this.f1340a, e2, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (this.g == null) {
            this.g = new HostLruCache(256);
            b();
        }
        for (StrategyCollection checkInit : this.g.values()) {
            checkInit.checkInit();
        }
        int i = 0;
        ALog.i("awcn.StrategyTable", "strategy map", null, "size", Integer.valueOf(this.g.size()));
        if (!GlobalAppRuntimeInfo.isTargetProcess()) {
            i = -1;
        }
        this.h = i;
        if (this.f1343d == null) {
            this.f1343d = new ConcurrentHashMap();
        }
    }

    protected StrategyTable(String str) {
        this.f1340a = str;
        a();
    }

    private void a(String str) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(str);
        a((Set<String>) treeSet);
    }

    public String getCnameByHost(String str) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.g) {
            strategyCollection = (StrategyCollection) this.g.get(str);
        }
        if (strategyCollection != null && strategyCollection.isExpired() && a.a() == 0) {
            a(str);
        }
        if (strategyCollection != null) {
            return strategyCollection.f1323d;
        }
        return null;
    }

    private void a(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            if ((!GlobalAppRuntimeInfo.isAppBackground() || AppLifecycle.lastEnterBackgroundTime <= 0) && NetworkStatusHelper.isConnected()) {
                int a2 = a.a();
                if (a2 != 3) {
                    long currentTimeMillis = System.currentTimeMillis();
                    synchronized (this.g) {
                        for (String str : set) {
                            StrategyCollection strategyCollection = (StrategyCollection) this.g.get(str);
                            if (strategyCollection != null) {
                                strategyCollection.f1322c = 30000 + currentTimeMillis;
                            }
                        }
                    }
                    if (a2 == 0) {
                        b(set);
                    }
                    HttpDispatcher.getInstance().sendAmdcRequest(set, this.h);
                    return;
                }
                return;
            }
            ALog.i("awcn.StrategyTable", "app in background or no network", this.f1340a, new Object[0]);
        }
    }

    private void b(Set<String> set) {
        TreeSet treeSet = new TreeSet(f1339f);
        synchronized (this.g) {
            treeSet.addAll(this.g.values());
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it2 = treeSet.iterator();
        while (it2.hasNext()) {
            StrategyCollection strategyCollection = (StrategyCollection) it2.next();
            if (strategyCollection.isExpired() && set.size() < 40) {
                strategyCollection.f1322c = 30000 + currentTimeMillis;
                set.add(strategyCollection.f1320a);
            } else {
                return;
            }
        }
    }

    public List<IConnStrategy> queryByHost(String str) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str) || !c.c(str)) {
            return Collections.EMPTY_LIST;
        }
        c();
        synchronized (this.g) {
            strategyCollection = (StrategyCollection) this.g.get(str);
            if (strategyCollection == null) {
                strategyCollection = new StrategyCollection(str);
                this.g.put(str, strategyCollection);
            }
        }
        if (strategyCollection.f1322c == 0 || (strategyCollection.isExpired() && a.a() == 0)) {
            a(str);
        }
        return strategyCollection.queryStrategyList();
    }

    public void update(l.d dVar) {
        ALog.i("awcn.StrategyTable", "update strategyTable with httpDns response", this.f1340a, new Object[0]);
        try {
            this.f1341b = dVar.f1406a;
            this.h = dVar.f1411f;
            l.b[] bVarArr = dVar.f1407b;
            if (bVarArr != null) {
                synchronized (this.g) {
                    for (l.b bVar : bVarArr) {
                        if (!(bVar == null || bVar.f1398a == null)) {
                            if (bVar.j) {
                                this.g.remove(bVar.f1398a);
                            } else {
                                StrategyCollection strategyCollection = (StrategyCollection) this.g.get(bVar.f1398a);
                                if (strategyCollection == null) {
                                    strategyCollection = new StrategyCollection(bVar.f1398a);
                                    this.g.put(bVar.f1398a, strategyCollection);
                                }
                                strategyCollection.update(bVar);
                            }
                        }
                    }
                }
                this.f1344e = true;
                if (ALog.isPrintLog(1)) {
                    StringBuilder sb = new StringBuilder("uniqueId : ");
                    sb.append(this.f1340a);
                    sb.append("\n-------------------------domains:------------------------------------");
                    ALog.d("awcn.StrategyTable", sb.toString(), null, new Object[0]);
                    synchronized (this.g) {
                        for (Map.Entry entry : this.g.entrySet()) {
                            sb.setLength(0);
                            sb.append((String) entry.getKey());
                            sb.append(" = ");
                            sb.append(((StrategyCollection) entry.getValue()).toString());
                            ALog.d("awcn.StrategyTable", sb.toString(), null, new Object[0]);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            ALog.e("awcn.StrategyTable", "fail to update strategyTable", this.f1340a, th, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str, boolean z) {
        StrategyCollection strategyCollection;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.g) {
                strategyCollection = (StrategyCollection) this.g.get(str);
                if (strategyCollection == null) {
                    strategyCollection = new StrategyCollection(str);
                    this.g.put(str, strategyCollection);
                }
            }
            if (z || strategyCollection.f1322c == 0 || (strategyCollection.isExpired() && a.a() == 0)) {
                a(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str, long j) {
        Long l = this.f1343d.get(str);
        if (l == null) {
            return false;
        }
        if (l.longValue() + j >= System.currentTimeMillis()) {
            return true;
        }
        this.f1343d.remove(str);
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyCollection strategyCollection;
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.StrategyTable", "[notifyConnEvent]", null, "Host", str, "IConnStrategy", iConnStrategy, "ConnEvent", connEvent);
        }
        String str2 = iConnStrategy.getProtocol().protocol;
        if ("quic".equals(str2) || "quicplain".equals(str2)) {
            this.f1342c = connEvent.isSuccess;
            ALog.e("awcn.StrategyTable", "enbale quic", null, "uniqueId", this.f1340a, "enable", Boolean.valueOf(connEvent.isSuccess));
        }
        if (!connEvent.isSuccess && c.b(iConnStrategy.getIp())) {
            this.f1343d.put(str, Long.valueOf(System.currentTimeMillis()));
            ALog.e("awcn.StrategyTable", "disable ipv6", null, "uniqueId", this.f1340a, "host", str);
        }
        synchronized (this.g) {
            strategyCollection = (StrategyCollection) this.g.get(str);
        }
        if (strategyCollection != null) {
            strategyCollection.notifyConnEvent(iConnStrategy, connEvent);
        }
    }
}
