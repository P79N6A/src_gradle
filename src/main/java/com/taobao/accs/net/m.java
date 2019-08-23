package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;

public class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f79018a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f79019b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j f79020c;

    public void run() {
        Message a2 = this.f79020c.f78993e.a(this.f79018a);
        if (a2 != null) {
            this.f79020c.f78993e.a(a2, -9);
            this.f79020c.a(this.f79018a, this.f79019b, "receive data time out");
            String d2 = this.f79020c.d();
            ALog.e(d2, this.f79018a + "-> receive data time out!", new Object[0]);
        }
    }

    m(j jVar, String str, boolean z) {
        this.f79020c = jVar;
        this.f79018a = str;
        this.f79019b = z;
    }
}
