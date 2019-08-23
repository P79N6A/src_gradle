package anet.channel.d;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.HorseRaceStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import java.util.List;
import java.util.Map;

public class f implements RequestCb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f1197a;

    public void onDataReceive(ByteArray byteArray, boolean z) {
    }

    f(e eVar) {
        this.f1197a = eVar;
    }

    public void onResponseCode(int i, Map<String, List<String>> map) {
        this.f1197a.f1192a.reqErrorCode = i;
    }

    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        int i2 = 0;
        ALog.i("awcn.NetworkDetector", "LongLinkTask request finish", this.f1197a.f1194c, "statusCode", Integer.valueOf(i), "msg", str);
        if (this.f1197a.f1192a.reqErrorCode == 0) {
            this.f1197a.f1192a.reqErrorCode = i;
        } else {
            HorseRaceStat horseRaceStat = this.f1197a.f1192a;
            if (this.f1197a.f1192a.reqErrorCode == 200) {
                i2 = 1;
            }
            horseRaceStat.reqRet = i2;
        }
        this.f1197a.f1192a.reqTime = (System.currentTimeMillis() - this.f1197a.f1193b) + this.f1197a.f1192a.connTime;
        synchronized (this.f1197a.f1192a) {
            this.f1197a.f1192a.notify();
        }
    }
}
