package anetwork.channel.unified;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cookie.CookieManager;
import java.util.List;
import java.util.Map;

public class c implements RequestCb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f1563a;

    c(b bVar) {
        this.f1563a = bVar;
    }

    public void onDataReceive(ByteArray byteArray, boolean z) {
        if (!this.f1563a.f1559c.f1594d.get()) {
            int unused = this.f1563a.f1561e = this.f1563a.f1561e + 1;
            if (this.f1563a.f1559c.f1592b != null) {
                this.f1563a.f1559c.f1592b.onDataReceiveSize(this.f1563a.f1561e, this.f1563a.f1560d, byteArray);
            }
        }
    }

    public void onResponseCode(int i, Map<String, List<String>> map) {
        if (!this.f1563a.f1559c.f1594d.get()) {
            this.f1563a.f1559c.a();
            CookieManager.setCookie(this.f1563a.f1559c.f1591a.g(), map);
            int unused = this.f1563a.f1560d = HttpHelper.parseContentLength(map);
            if (this.f1563a.f1559c.f1592b != null) {
                this.f1563a.f1559c.f1592b.onResponseCode(i, map);
            }
        }
    }

    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        if (!this.f1563a.f1559c.f1594d.getAndSet(true)) {
            if (ALog.isPrintLog(2)) {
                ALog.i("anet.DegradeTask", "[onFinish]", this.f1563a.f1559c.f1593c, "code", Integer.valueOf(i), "msg", str);
            }
            this.f1563a.f1559c.a();
            requestStatistic.isDone.set(true);
            if (this.f1563a.f1559c.f1592b != null) {
                this.f1563a.f1559c.f1592b.onFinish(new DefaultFinishEvent(i, str, requestStatistic));
            }
        }
    }
}
