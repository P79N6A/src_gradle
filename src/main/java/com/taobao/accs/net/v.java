package com.taobao.accs.net;

public class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f79040a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f79041b;

    public void run() {
        if (this.f79040a != null && this.f79040a.equals(this.f79041b.N) && this.f79041b.s == 2) {
            boolean unused = this.f79041b.J = false;
            boolean unused2 = this.f79041b.L = true;
            this.f79041b.l();
            this.f79041b.H.setCloseReason("conn timeout");
        }
    }

    v(s sVar, String str) {
        this.f79041b = sVar;
        this.f79040a = str;
    }
}
