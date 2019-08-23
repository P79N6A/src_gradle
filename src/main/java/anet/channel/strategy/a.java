package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.utils.c;
import anet.channel.util.ALog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap<String, List<IPConnStrategy>> f1346a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    final HashMap<String, Object> f1347b = new HashMap<>();

    a() {
    }

    /* access modifiers changed from: package-private */
    public List a(String str) {
        Object obj;
        if (TextUtils.isEmpty(str) || !c.c(str) || DispatchConstants.getAmdcServerDomain().equalsIgnoreCase(str)) {
            return Collections.EMPTY_LIST;
        }
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.LocalDnsStrategyTable", "try resolve ip with local dns", null, "host", str);
        }
        List list = Collections.EMPTY_LIST;
        if (!this.f1346a.containsKey(str)) {
            synchronized (this.f1347b) {
                if (!this.f1347b.containsKey(str)) {
                    obj = new Object();
                    this.f1347b.put(str, obj);
                    a(str, obj);
                } else {
                    obj = this.f1347b.get(str);
                }
            }
            if (obj != null) {
                try {
                    synchronized (obj) {
                        obj.wait(500);
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
        List list2 = this.f1346a.get(str);
        if (!(list2 == null || list2 == Collections.EMPTY_LIST)) {
            list = new ArrayList(list2);
        }
        ALog.i("awcn.LocalDnsStrategyTable", "get local strategy", null, "strategyList", list2);
        return list;
    }

    private void a(String str, Object obj) {
        anet.channel.strategy.utils.a.a(new b(this, str, obj));
    }

    /* access modifiers changed from: package-private */
    public void a(String str, ConnProtocol connProtocol) {
        boolean z;
        int i;
        List<IPConnStrategy> list = this.f1346a.get(str);
        if (list != null && !list.isEmpty()) {
            for (IPConnStrategy protocol : list) {
                if (protocol.getProtocol().equals(connProtocol)) {
                    return;
                }
            }
            String ip = ((IPConnStrategy) list.get(0)).getIp();
            if (connProtocol.protocol.equalsIgnoreCase("https") || !TextUtils.isEmpty(connProtocol.publicKey)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = 80;
            } else {
                i = 443;
            }
            list.add(IPConnStrategy.a(ip, i, connProtocol, 0, 0, 1, 45000));
            ALog.i("awcn.LocalDnsStrategyTable", "setProtocolForHost", null, "strategyList", list);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (!connEvent.isSuccess && !TextUtils.isEmpty(str)) {
            List list = this.f1346a.get(str);
            if (!(list == null || list == Collections.EMPTY_LIST)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next() == iConnStrategy) {
                        it2.remove();
                    }
                }
                if (list.isEmpty()) {
                    this.f1346a.put(str, Collections.EMPTY_LIST);
                }
            }
        }
    }
}
