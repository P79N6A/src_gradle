package anet.channel.d;

import anet.channel.Session;
import anet.channel.entity.EventCb;
import anet.channel.entity.b;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.l;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;

public final class e implements EventCb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HorseRaceStat f1192a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f1193b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f1194c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l.e f1195d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ TnetSpdySession f1196e;

    public final void onEvent(Session session, int i, b bVar) {
        if (this.f1192a.connTime == 0) {
            this.f1192a.connTime = System.currentTimeMillis() - this.f1193b;
            if (i == 1) {
                ALog.i("awcn.NetworkDetector", "tnetSpdySession connect success", this.f1194c, new Object[0]);
                this.f1192a.connRet = 1;
                HttpUrl parse = HttpUrl.parse(session.getHost() + this.f1195d.f1414c);
                if (parse != null) {
                    this.f1196e.request(new Request.Builder().setUrl(parse).setReadTimeout(this.f1195d.f1413b.f1395d).setRedirectEnable(false).setSeq(this.f1194c).build(), new f(this));
                    return;
                }
                return;
            }
            this.f1192a.connErrorCode = bVar.f1209b;
            synchronized (this.f1192a) {
                this.f1192a.notify();
            }
        }
    }

    e(HorseRaceStat horseRaceStat, long j, String str, l.e eVar, TnetSpdySession tnetSpdySession) {
        this.f1192a = horseRaceStat;
        this.f1193b = j;
        this.f1194c = str;
        this.f1195d = eVar;
        this.f1196e = tnetSpdySession;
    }
}
