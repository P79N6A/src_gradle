package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f78995a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f78996b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f78997c;

    public void run() {
        Message a2 = this.f78997c.f78993e.a(this.f78995a);
        if (a2 != null) {
            this.f78997c.f78993e.a(a2, -9);
            this.f78997c.a(this.f78995a, this.f78996b, "receive data time out");
            String d2 = this.f78997c.d();
            ALog.e(d2, this.f78995a + "-> receive data time out!", new Object[0]);
        }
    }

    c(b bVar, String str, boolean z) {
        this.f78997c = bVar;
        this.f78995a = str;
        this.f78996b = z;
    }
}
