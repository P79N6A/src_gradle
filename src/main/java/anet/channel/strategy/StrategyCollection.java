package anet.channel.strategy;

import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.l;
import anet.channel.util.ALog;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class StrategyCollection implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    String f1320a;

    /* renamed from: b  reason: collision with root package name */
    StrategyList f1321b;

    /* renamed from: c  reason: collision with root package name */
    volatile long f1322c;

    /* renamed from: d  reason: collision with root package name */
    volatile String f1323d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1324e;

    /* renamed from: f  reason: collision with root package name */
    private transient long f1325f;

    public StrategyCollection() {
    }

    public boolean isExpired() {
        if (System.currentTimeMillis() > this.f1322c) {
            return true;
        }
        return false;
    }

    public void checkInit() {
        if (System.currentTimeMillis() - this.f1322c > 172800000) {
            this.f1321b = null;
            return;
        }
        if (this.f1321b != null) {
            this.f1321b.checkInit();
        }
    }

    public synchronized List<IConnStrategy> queryStrategyList() {
        if (this.f1321b == null) {
            return Collections.EMPTY_LIST;
        }
        return this.f1321b.getStrategyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("\nStrategyList = ");
        sb.append(this.f1322c);
        if (this.f1321b != null) {
            sb.append(this.f1321b.toString());
        } else if (this.f1323d != null) {
            sb.append('[');
            sb.append(this.f1320a);
            sb.append("=>");
            sb.append(this.f1323d);
            sb.append(']');
        } else {
            sb.append("[]");
        }
        return sb.toString();
    }

    protected StrategyCollection(String str) {
        this.f1320a = str;
        this.f1324e = DispatchConstants.isAmdcServerDomain(str);
    }

    public synchronized void update(l.b bVar) {
        this.f1322c = System.currentTimeMillis() + (((long) bVar.f1399b) * 1000);
        if (!bVar.f1398a.equalsIgnoreCase(this.f1320a)) {
            ALog.e("StrategyCollection", "update error!", null, "host", this.f1320a, "dnsInfo.host", bVar.f1398a);
            return;
        }
        this.f1323d = bVar.f1401d;
        if (bVar.f1403f == null || bVar.f1403f.length == 0 || bVar.h == null || bVar.h.length == 0) {
            if (bVar.i != null) {
                if (bVar.i.length == 0) {
                }
            }
            this.f1321b = null;
            return;
        }
        if (this.f1321b == null) {
            this.f1321b = new StrategyList();
        }
        this.f1321b.update(bVar);
    }

    public synchronized void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (this.f1321b != null) {
            this.f1321b.notifyConnEvent(iConnStrategy, connEvent);
            if (!connEvent.isSuccess && this.f1321b.shouldRefresh()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f1325f > 60000) {
                    StrategyCenter.getInstance().forceRefreshStrategy(this.f1320a);
                    this.f1325f = currentTimeMillis;
                }
            }
        }
    }
}
