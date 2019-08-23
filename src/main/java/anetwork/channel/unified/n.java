package anetwork.channel.unified;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.aidl.DefaultFinishEvent;

public class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f1604a;

    public void run() {
        if (this.f1604a.f1597a.f1594d.compareAndSet(false, true)) {
            RequestStatistic requestStatistic = this.f1604a.f1597a.f1591a.f1548b;
            if (requestStatistic.isDone.compareAndSet(false, true)) {
                requestStatistic.statusCode = -202;
                requestStatistic.msg = ErrorConstant.getErrMsg(-202);
                requestStatistic.rspEnd = System.currentTimeMillis();
                ALog.e("anet.UnifiedRequestTask", "task time out", this.f1604a.f1597a.f1593c, "rs", requestStatistic);
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(-202, null, requestStatistic, null));
            }
            this.f1604a.f1597a.b();
            this.f1604a.f1597a.f1592b.onFinish(new DefaultFinishEvent(-202, null, requestStatistic));
        }
    }

    n(k kVar) {
        this.f1604a = kVar;
    }
}
