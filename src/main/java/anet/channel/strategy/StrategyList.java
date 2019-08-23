package anet.channel.strategy;

import anet.channel.strategy.l;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.strategy.utils.c;
import anet.channel.util.ALog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class StrategyList implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private List<IPConnStrategy> f1335a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Map<Integer, ConnHistoryItem> f1336b = new SerialLruCache(40);

    /* renamed from: c  reason: collision with root package name */
    private boolean f1337c = false;

    /* renamed from: d  reason: collision with root package name */
    private transient Comparator<IPConnStrategy> f1338d = null;

    interface Predicate<T> {
        boolean apply(T t);
    }

    public String toString() {
        return this.f1335a.toString();
    }

    private Comparator a() {
        if (this.f1338d == null) {
            this.f1338d = new k(this);
        }
        return this.f1338d;
    }

    public StrategyList() {
    }

    public boolean shouldRefresh() {
        boolean z = true;
        boolean z2 = true;
        for (IPConnStrategy next : this.f1335a) {
            if (!this.f1336b.get(Integer.valueOf(next.getUniqueId())).b()) {
                if (next.f1317a == 0) {
                    z = false;
                }
                z2 = false;
            }
        }
        if ((!this.f1337c || !z) && !z2) {
            return false;
        }
        return true;
    }

    public void checkInit() {
        if (this.f1335a == null) {
            this.f1335a = new ArrayList();
        }
        if (this.f1336b == null) {
            this.f1336b = new SerialLruCache(40);
        }
        Iterator<Map.Entry<Integer, ConnHistoryItem>> it2 = this.f1336b.entrySet().iterator();
        while (it2.hasNext()) {
            if (((ConnHistoryItem) it2.next().getValue()).d()) {
                it2.remove();
            }
        }
        for (IPConnStrategy next : this.f1335a) {
            if (!this.f1336b.containsKey(Integer.valueOf(next.getUniqueId()))) {
                this.f1336b.put(Integer.valueOf(next.getUniqueId()), new ConnHistoryItem());
            }
        }
        Collections.sort(this.f1335a, a());
    }

    public List<IConnStrategy> getStrategyList() {
        if (this.f1335a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = null;
        for (IPConnStrategy next : this.f1335a) {
            ConnHistoryItem connHistoryItem = this.f1336b.get(Integer.valueOf(next.getUniqueId()));
            if (connHistoryItem == null || !connHistoryItem.c()) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(next);
            } else {
                ALog.i("awcn.StrategyList", "strategy ban!", null, "strategy", next);
            }
        }
        if (linkedList == null) {
            return Collections.EMPTY_LIST;
        }
        return linkedList;
    }

    StrategyList(List<IPConnStrategy> list) {
        this.f1335a = list;
    }

    public void update(l.b bVar) {
        int i;
        for (IPConnStrategy iPConnStrategy : this.f1335a) {
            iPConnStrategy.f1319c = true;
        }
        for (int i2 = 0; i2 < bVar.h.length; i2++) {
            for (String a2 : bVar.f1403f) {
                a(a2, 1, bVar.h[i2]);
            }
            if (bVar.g != null) {
                this.f1337c = true;
                for (String a3 : bVar.g) {
                    a(a3, 0, bVar.h[i2]);
                }
            } else {
                this.f1337c = false;
            }
        }
        if (bVar.i != null) {
            for (l.e eVar : bVar.i) {
                String str = eVar.f1412a;
                if (c.c(eVar.f1412a)) {
                    i = -1;
                } else {
                    i = 1;
                }
                a(str, i, eVar.f1413b);
            }
        }
        ListIterator<IPConnStrategy> listIterator = this.f1335a.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().f1319c) {
                listIterator.remove();
            }
        }
        Collections.sort(this.f1335a, a());
    }

    private static <T> int a(Collection<T> collection, Predicate<T> predicate) {
        if (collection == null) {
            return -1;
        }
        int i = 0;
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext() && !predicate.apply(it2.next())) {
            i++;
        }
        if (i == collection.size()) {
            return -1;
        }
        return i;
    }

    public void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if ((iConnStrategy instanceof IPConnStrategy) && this.f1335a.indexOf(iConnStrategy) != -1) {
            this.f1336b.get(Integer.valueOf(((IPConnStrategy) iConnStrategy).getUniqueId())).a(connEvent.isSuccess);
            Collections.sort(this.f1335a, this.f1338d);
        }
    }

    private void a(String str, int i, l.a aVar) {
        int a2 = a(this.f1335a, new j(this, aVar, str, ConnProtocol.valueOf(aVar)));
        if (a2 != -1) {
            IPConnStrategy iPConnStrategy = this.f1335a.get(a2);
            iPConnStrategy.cto = aVar.f1394c;
            iPConnStrategy.rto = aVar.f1395d;
            iPConnStrategy.heartbeat = aVar.f1397f;
            iPConnStrategy.f1317a = i;
            iPConnStrategy.f1318b = 0;
            iPConnStrategy.f1319c = false;
            return;
        }
        IPConnStrategy a3 = IPConnStrategy.a(str, aVar);
        if (a3 != null) {
            a3.f1317a = i;
            a3.f1318b = 0;
            if (!this.f1336b.containsKey(Integer.valueOf(a3.getUniqueId()))) {
                this.f1336b.put(Integer.valueOf(a3.getUniqueId()), new ConnHistoryItem());
            }
            this.f1335a.add(a3);
        }
    }
}
