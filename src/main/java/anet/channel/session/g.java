package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.b;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import java.util.List;
import java.util.Map;

public class g implements RequestCb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f1302a;

    g(f fVar) {
        this.f1302a = fVar;
    }

    public void onDataReceive(ByteArray byteArray, boolean z) {
        this.f1302a.f1299b.onDataReceive(byteArray, z);
    }

    public void onResponseCode(int i, Map<String, List<String>> map) {
        ALog.i("awcn.HttpSession", "", this.f1302a.f1298a.getSeq(), "httpStatusCode", Integer.valueOf(i));
        ALog.i("awcn.HttpSession", "", this.f1302a.f1298a.getSeq(), "response headers", map);
        this.f1302a.f1299b.onResponseCode(i, map);
        this.f1302a.f1300c.serverRT = HttpHelper.parseServerRT(map);
        this.f1302a.f1301d.handleResponseCode(this.f1302a.f1298a, i);
        this.f1302a.f1301d.handleResponseHeaders(this.f1302a.f1298a, map);
    }

    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        if (i <= 0 && i != -204) {
            this.f1302a.f1301d.handleCallbacks(2, new b(2, 0, "Http connect fail"));
        }
        this.f1302a.f1299b.onFinish(i, str, requestStatistic);
    }
}
