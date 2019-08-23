package com.taobao.accs.data;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.b;

public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f78958a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f78959b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Intent f78960c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g f78961d;

    public void run() {
        if (g.f78953a != null && g.f78953a.contains(this.f78958a)) {
            ALog.e("MsgDistribute", "routing msg time out, try election", "dataId", this.f78958a, "serviceId", this.f78959b);
            g.f78953a.remove(this.f78958a);
            b.a("accs", "ele_routing_rate", "", "timeout", "pkg:" + this.f78960c.getPackage());
        }
    }

    i(g gVar, String str, String str2, Intent intent) {
        this.f78961d = gVar;
        this.f78958a = str;
        this.f78959b = str2;
        this.f78960c = intent;
    }
}
