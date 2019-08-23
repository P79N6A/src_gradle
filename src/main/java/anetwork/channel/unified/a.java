package anetwork.channel.unified;

import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;

public class a implements IUnifiedTask {

    /* renamed from: a  reason: collision with root package name */
    private j f1554a;

    /* renamed from: b  reason: collision with root package name */
    private Cache f1555b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f1556c;

    public void cancel() {
        this.f1556c = true;
        this.f1554a.f1591a.f1548b.ret = 2;
    }

    public void run() {
        Cache.Entry entry;
        boolean z;
        Cache cache;
        boolean z2;
        int i;
        if (!this.f1556c) {
            RequestStatistic requestStatistic = this.f1554a.f1591a.f1548b;
            if (this.f1555b != null) {
                String g = this.f1554a.f1591a.g();
                String str = this.f1554a.f1591a.a().getHeaders().get("Cache-Control");
                boolean equals = "no-store".equals(str);
                long currentTimeMillis = System.currentTimeMillis();
                if (equals) {
                    this.f1555b.remove(g);
                    z = false;
                    entry = null;
                } else {
                    z = "no-cache".equals(str);
                    Cache.Entry entry2 = this.f1555b.get(g);
                    if (ALog.isPrintLog(2)) {
                        String str2 = this.f1554a.f1593c;
                        Object[] objArr = new Object[8];
                        objArr[0] = "hit";
                        if (entry2 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objArr[1] = Boolean.valueOf(z2);
                        objArr[2] = "cost";
                        objArr[3] = Long.valueOf(requestStatistic.cacheTime);
                        objArr[4] = "length";
                        if (entry2 != null) {
                            i = entry2.data.length;
                        } else {
                            i = 0;
                        }
                        objArr[5] = Integer.valueOf(i);
                        objArr[6] = "key";
                        objArr[7] = g;
                        ALog.i("anet.CacheTask", "read cache", str2, objArr);
                    }
                    entry = entry2;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                requestStatistic.cacheTime = currentTimeMillis2 - currentTimeMillis;
                if (entry != null && !z && entry.isFresh()) {
                    if (this.f1554a.f1594d.compareAndSet(false, true)) {
                        this.f1554a.a();
                        requestStatistic.ret = 1;
                        requestStatistic.statusCode = 200;
                        requestStatistic.msg = "SUCCESS";
                        requestStatistic.protocolType = "cache";
                        requestStatistic.rspEnd = currentTimeMillis2;
                        requestStatistic.processTime = currentTimeMillis2 - requestStatistic.start;
                        if (ALog.isPrintLog(2)) {
                            ALog.i("anet.CacheTask", "hit fresh cache", this.f1554a.f1593c, "URL", this.f1554a.f1591a.f().urlString());
                        }
                        this.f1554a.f1592b.onResponseCode(200, entry.responseHeaders);
                        this.f1554a.f1592b.onDataReceiveSize(1, entry.data.length, ByteArray.wrap(entry.data));
                        this.f1554a.f1592b.onFinish(new DefaultFinishEvent(200, "SUCCESS", requestStatistic));
                    }
                } else if (!this.f1556c) {
                    j jVar = this.f1554a;
                    if (equals) {
                        cache = null;
                    } else {
                        cache = this.f1555b;
                    }
                    e eVar = new e(jVar, cache, entry);
                    this.f1554a.f1595e = eVar;
                    eVar.run();
                }
            }
        }
    }

    public a(j jVar, Cache cache) {
        this.f1554a = jVar;
        this.f1555b = cache;
    }
}
