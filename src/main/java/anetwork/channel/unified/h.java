package anetwork.channel.unified;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionGetCallback;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class h implements SessionGetCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RequestStatistic f1582a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f1583b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Request f1584c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SessionCenter f1585d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ HttpUrl f1586e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f1587f;
    final /* synthetic */ e g;

    public void onSessionGetFail() {
        ALog.e("anet.NetworkTask", "onSessionGetFail", this.g.f1566a.f1593c, PushConstants.WEB_URL, this.f1582a.url);
        this.f1582a.connWaitTime = System.currentTimeMillis() - this.f1583b;
        this.g.a(this.g.a(null, this.f1585d, this.f1586e, this.f1587f), this.f1584c);
    }

    public void onSessionGetSuccess(Session session) {
        ALog.i("anet.NetworkTask", "onSessionGetSuccess", this.g.f1566a.f1593c, "Session", session);
        this.f1582a.connWaitTime = System.currentTimeMillis() - this.f1583b;
        this.f1582a.spdyRequestSend = true;
        this.g.a(session, this.f1584c);
    }

    h(e eVar, RequestStatistic requestStatistic, long j, Request request, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z) {
        this.g = eVar;
        this.f1582a = requestStatistic;
        this.f1583b = j;
        this.f1584c = request;
        this.f1585d = sessionCenter;
        this.f1586e = httpUrl;
        this.f1587f = z;
    }
}
