package anet.channel;

import anet.channel.entity.EventCb;
import anet.channel.entity.b;
import anet.channel.util.ALog;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f1155a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f1156b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Session f1157c;

    public void run() {
        try {
            if (this.f1157c.f1125b != null) {
                for (EventCb next : this.f1157c.f1125b.keySet()) {
                    if (!(next == null || (this.f1157c.f1125b.get(next).intValue() & this.f1155a) == 0)) {
                        try {
                            next.onEvent(this.f1157c, this.f1155a, this.f1156b);
                        } catch (Exception e2) {
                            ALog.e("awcn.Session", e2.toString(), this.f1157c.p, new Object[0]);
                        }
                    }
                }
            }
        } catch (Exception e3) {
            ALog.e("awcn.Session", "handleCallbacks", this.f1157c.p, e3, new Object[0]);
        }
    }

    a(Session session, int i, b bVar) {
        this.f1157c = session;
        this.f1155a = i;
        this.f1156b = bVar;
    }
}
