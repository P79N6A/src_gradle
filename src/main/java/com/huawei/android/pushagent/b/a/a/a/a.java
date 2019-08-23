package com.huawei.android.pushagent.b.a.a.a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.android.pushagent.a.b;
import com.huawei.android.pushagent.a.d;
import com.huawei.android.pushagent.b.a.a;
import com.huawei.android.pushagent.b.a.a.c;
import com.huawei.android.pushagent.b.a.b.b;
import com.huawei.android.pushagent.utils.a.e;
import java.net.InetSocketAddress;
import java.util.Date;

public class a extends com.huawei.android.pushagent.b.a.a.a {
    public a(d dVar, Context context) {
        super(dVar, context, new b(context), a.class.getSimpleName());
        f();
    }

    public void a(c.a aVar, Bundle bundle) {
        e.a("PushLogAC2815", "enter PollingConnectEntity:notifyEvent(" + aVar + ",bd:" + bundle + ")");
        switch (aVar) {
            case SocketEvent_CONNECTED:
                this.f25015e.a();
                this.f25015e.a(System.currentTimeMillis());
                try {
                    a((b) new com.huawei.android.pushagent.a.a.a(com.huawei.android.pushagent.b.b.a.a(this.f25014d).E()));
                    if (this.f25013c != null) {
                        this.f25013c.c().setSoTimeout((int) (com.huawei.android.pushagent.b.b.a.a(this.f25014d).v() * 1000));
                    }
                    return;
                } catch (Exception e2) {
                    e.c("PushLogAC2815", "call send cause:" + e2.toString(), e2);
                    break;
                }
            case SocketEvent_MSG_RECEIVED:
                b bVar = (b) bundle.getSerializable("push_msg");
                if (bVar != null) {
                    e.b("PushLogAC2815", "received polling Msg:" + bVar.getClass().getSimpleName());
                    if (bVar instanceof com.huawei.android.pushagent.a.a.b) {
                        com.huawei.android.pushagent.a.a.b bVar2 = (com.huawei.android.pushagent.a.a.b) bVar;
                        if (bVar2.d() >= 0 && bVar2.d() <= a.C0287a.values().length) {
                            a.C0287a aVar2 = a.C0287a.values()[bVar2.d()];
                            com.huawei.android.pushagent.b.a.a.a(this.f25014d).a(aVar2);
                            this.f25015e.b(((long) bVar2.f()) * 1000);
                            if (bVar2.e() || aVar2 == a.C0287a.ConnectEntity_Push) {
                                try {
                                    com.huawei.android.pushagent.b.a.a.e().a(true, bVar2.e());
                                } catch (com.huawei.android.pushagent.a.c e3) {
                                    e.c("PushLogAC2815", e3.toString(), e3);
                                }
                            }
                            if (this.f25013c != null) {
                                try {
                                    this.f25013c.a();
                                    return;
                                } catch (Exception e4) {
                                    e.c("PushLogAC2815", "call channel close cause:" + e4.toString(), e4);
                                    break;
                                }
                            }
                        } else {
                            e.d("PushLogAC2815", "received mode:" + bVar2.d() + " cannot be recongnized");
                            return;
                        }
                    }
                } else {
                    e.b("PushLogAC2815", "push_msg is null");
                    return;
                }
                break;
        }
    }

    public synchronized void a(boolean z) throws com.huawei.android.pushagent.a.c {
        e.a("PushLogAC2815", "enter PollingConnectEntity:connect(forceCon:" + z + ")");
        this.f25015e.b();
        if (com.huawei.android.pushagent.b.b.a.a(this.f25014d).X()) {
            if (a()) {
                e.b("PushLogAC2815", "Polling aready connect, just wait Rsp!");
                return;
            }
            if (!z) {
                if (System.currentTimeMillis() < this.f25015e.d() + this.f25015e.b(false) && System.currentTimeMillis() > this.f25015e.d()) {
                    e.b("PushLogAC2815", "cannot connect, heartBeatInterval:" + this.f25015e.b(false) + " lastCntTime:" + new Date(this.f25015e.d()));
                    return;
                }
            }
            if (com.huawei.android.pushagent.utils.a.b.a(this.f25014d) == -1) {
                e.b("PushLogAC2815", "no network, so cannot connect Polling");
                return;
            }
            if (this.f25012b != null) {
                if (this.f25012b.isAlive()) {
                    e.b("PushLogAC2815", "aready in connect, just wait!! srvSocket:" + this.f25012b.toString());
                    return;
                }
            }
            e.a("PushLogAC2815", "begin to create new socket, so close socket");
            b();
            d();
            InetSocketAddress b2 = com.huawei.android.pushagent.b.b.a.a(this.f25014d).b(false);
            if (b2 != null) {
                e.a("PushLogAC2815", "get pollingSrvAddr:" + b2);
                this.f25011a.f24993a = b2.getAddress().getHostAddress();
                this.f25011a.f24994b = b2.getPort();
                this.f25012b = new c(this);
                this.f25012b.start();
                return;
            }
            e.d("PushLogAC2815", "no valid pollingSrvAddr, just wait!!");
        }
    }

    public synchronized void a(boolean z, boolean z2) throws com.huawei.android.pushagent.a.c {
        a(z);
    }

    public a.C0287a e() {
        return a.C0287a.ConnectEntity_Polling;
    }

    public boolean f() {
        if (this.f25011a == null) {
            this.f25011a = new d("", -1, false, b.a.ChannelType_Normal);
        }
        return true;
    }
}
