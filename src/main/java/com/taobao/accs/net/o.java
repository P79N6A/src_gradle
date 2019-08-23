package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.b;
import java.util.Iterator;

public class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f79025a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f79026b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f79027c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j f79028d;

    public void run() {
        if (this.f79025a > 0) {
            Message.a aVar = new Message.a(this.f79025a, "");
            Message.a aVar2 = null;
            Iterator<Message.a> it2 = this.f79028d.f78993e.f().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Message.a next = it2.next();
                if (next.equals(aVar)) {
                    aVar2 = next;
                    break;
                }
            }
            if (aVar2 != null) {
                Message b2 = this.f79028d.f78993e.b(aVar2.b());
                if (b2 != null) {
                    if (this.f79026b) {
                        if (!this.f79028d.a(b2, 2000)) {
                            this.f79028d.f78993e.a(b2, this.f79027c);
                        }
                        if (b2.e() != null) {
                            b.a("accs", "resend", "total_tnet", 0.0d);
                        }
                    } else {
                        this.f79028d.f78993e.a(b2, this.f79027c);
                    }
                }
            }
        }
        if (this.f79025a < 0 && this.f79026b) {
            this.f79028d.b(this.f79025a);
        }
    }

    o(j jVar, int i, boolean z, int i2) {
        this.f79028d = jVar;
        this.f79025a = i;
        this.f79026b = z;
        this.f79027c = i2;
    }
}
