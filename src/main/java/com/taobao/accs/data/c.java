package com.taobao.accs.data;

import anet.channel.appmonitor.AppMonitor;
import com.taobao.accs.ut.monitor.AssembleMonitor;
import com.taobao.accs.utl.ALog;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f78943a;

    public void run() {
        synchronized (this.f78943a) {
            if (this.f78943a.f78941f == 0) {
                ALog.e("AssembleMessage", "timeout", "dataId", this.f78943a.f78937b);
                int unused = this.f78943a.f78941f = 1;
                this.f78943a.h.clear();
                AppMonitor.getInstance().commitStat(new AssembleMonitor(this.f78943a.f78937b, String.valueOf(this.f78943a.f78941f)));
            }
        }
    }

    c(a aVar) {
        this.f78943a = aVar;
    }
}
