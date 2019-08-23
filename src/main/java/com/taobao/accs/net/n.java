package com.taobao.accs.net;

import anet.channel.session.TnetSpdySession;
import com.taobao.accs.ut.a.d;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;

public class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f79021a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ byte[] f79022b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TnetSpdySession f79023c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j f79024d;

    public void run() {
        String str;
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(this.f79024d.d(), "onDataReceive", "type", Integer.valueOf(this.f79021a));
        }
        if (this.f79021a == 200) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f79024d.f78993e.a(this.f79022b, this.f79023c.getHost());
                d g = this.f79024d.f78993e.g();
                if (g != null) {
                    g.f79063c = String.valueOf(currentTimeMillis);
                    if (this.f79024d.f78991c == 0) {
                        str = "service";
                    } else {
                        str = "inapp";
                    }
                    g.g = str;
                    g.a();
                }
            } catch (Throwable th) {
                ALog.e(this.f79024d.d(), "onDataReceive ", th, new Object[0]);
                UTMini.getInstance().commitEvent(66001, "DATA_RECEIVE", UtilityImpl.a(th));
            }
        } else {
            String d2 = this.f79024d.d();
            ALog.e(d2, "drop frame len:" + this.f79022b.length + " frameType" + this.f79021a, new Object[0]);
        }
    }

    n(j jVar, int i, byte[] bArr, TnetSpdySession tnetSpdySession) {
        this.f79024d = jVar;
        this.f79021a = i;
        this.f79022b = bArr;
        this.f79023c = tnetSpdySession;
    }
}
