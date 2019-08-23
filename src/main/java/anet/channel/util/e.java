package anet.channel.util;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.status.NetworkStatusHelper;

public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f1444a;

    public void run() {
        try {
            if (this.f1444a.f1442a.equals(c.b(NetworkStatusHelper.getStatus()))) {
                ALog.e("awcn.Inet64Util", "startIpStackDetect double check", null, new Object[0]);
                int f2 = c.i();
                if (this.f1444a.f1443b.ipStackType != f2) {
                    c.f1441e.put(this.f1444a.f1442a, Integer.valueOf(f2));
                    this.f1444a.f1443b.lastIpStackType = this.f1444a.f1443b.ipStackType;
                    this.f1444a.f1443b.ipStackType = f2;
                }
                if (f2 == 2 || f2 == 3) {
                    f g = c.j();
                    if (g != null) {
                        c.f1440d.put(this.f1444a.f1442a, g);
                        this.f1444a.f1443b.nat64Prefix = g.toString();
                    }
                }
                if (GlobalAppRuntimeInfo.isTargetProcess()) {
                    AppMonitor.getInstance().commitStat(this.f1444a.f1443b);
                }
            }
        } catch (Exception unused) {
        }
    }

    e(d dVar) {
        this.f1444a = dVar;
    }
}
