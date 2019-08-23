package anet.channel.session;

import anet.channel.IAuth;
import anet.channel.statist.SessionStatistic;
import anet.channel.util.ALog;

public class i implements IAuth.AuthCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TnetSpdySession f1304a;

    public void onAuthSuccess() {
        this.f1304a.notifyStatus(4, null);
        this.f1304a.z = System.currentTimeMillis();
        if (this.f1304a.D != null) {
            this.f1304a.D.start(this.f1304a);
        }
        this.f1304a.q.ret = 1;
        ALog.d("awcn.TnetSpdySession", "spdyOnStreamResponse", this.f1304a.p, "authTime", Long.valueOf(this.f1304a.q.authTime));
        if (this.f1304a.A > 0) {
            this.f1304a.q.authTime = System.currentTimeMillis() - this.f1304a.A;
        }
    }

    i(TnetSpdySession tnetSpdySession) {
        this.f1304a = tnetSpdySession;
    }

    public void onAuthFail(int i, String str) {
        this.f1304a.notifyStatus(5, null);
        if (this.f1304a.q != null) {
            SessionStatistic sessionStatistic = this.f1304a.q;
            sessionStatistic.closeReason = "Accs_Auth_Fail:" + i;
            this.f1304a.q.errorCode = (long) i;
        }
        this.f1304a.close();
    }
}
