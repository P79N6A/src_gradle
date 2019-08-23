package anet.channel;

import anet.channel.SessionRequest;
import anet.channel.entity.EventCb;
import anet.channel.entity.b;
import anet.channel.util.ALog;

public class e implements EventCb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SessionRequest.IConnCb f1200a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f1201b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SessionRequest f1202c;

    e(SessionRequest sessionRequest, SessionRequest.IConnCb iConnCb, long j) {
        this.f1202c = sessionRequest;
        this.f1200a = iConnCb;
        this.f1201b = j;
    }

    public void onEvent(Session session, int i, b bVar) {
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        Session session2 = session;
        int i3 = i;
        b bVar2 = bVar;
        if (session2 != null) {
            if (bVar2 == null) {
                i2 = 0;
            } else {
                i2 = bVar2.f1209b;
            }
            if (bVar2 == null) {
                str = "";
            } else {
                str = bVar2.f1210c;
            }
            if (i3 != 2) {
                if (i3 == 256) {
                    if (session2 != null) {
                        str3 = session2.p;
                    } else {
                        str3 = null;
                    }
                    ALog.d("awcn.SessionRequest", null, str3, "Session", session2, "EventType", Integer.valueOf(i), "Event", bVar2);
                    this.f1202c.a(session2, i2, str);
                    this.f1200a.onFailed(session, this.f1201b, i, i2);
                } else if (i3 == 512) {
                    if (session2 != null) {
                        str4 = session2.p;
                    } else {
                        str4 = null;
                    }
                    ALog.d("awcn.SessionRequest", null, str4, "Session", session2, "EventType", Integer.valueOf(i), "Event", bVar2);
                    this.f1202c.a(session2, 0, (String) null);
                    this.f1200a.onSuccess(session2, this.f1201b);
                    return;
                }
                return;
            }
            if (session2 != null) {
                str2 = session2.p;
            } else {
                str2 = null;
            }
            ALog.d("awcn.SessionRequest", null, str2, "Session", session2, "EventType", Integer.valueOf(i), "Event", bVar2);
            this.f1202c.a(session2, i2, str);
            if (this.f1202c.f1140b.c(this.f1202c, session2)) {
                this.f1200a.onDisConnect(session2, this.f1201b, i3);
                return;
            }
            this.f1200a.onFailed(session, this.f1201b, i, i2);
        }
    }
}
