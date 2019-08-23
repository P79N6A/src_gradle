package com.huawei.android.pushagent.b.a.a.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.android.pushagent.PushService;
import com.huawei.android.pushagent.a.b.f;
import com.huawei.android.pushagent.a.b.k;
import com.huawei.android.pushagent.a.d;
import com.huawei.android.pushagent.b.a.a;
import com.huawei.android.pushagent.b.a.a.c;
import com.huawei.android.pushagent.b.d.b;
import com.huawei.android.pushagent.utils.a.e;
import java.net.InetSocketAddress;

public class a extends com.huawei.android.pushagent.b.a.a.a {
    boolean g = false;

    public a(d dVar, Context context) {
        super(dVar, context, new b(context), a.class.getSimpleName());
        f();
    }

    public void a(c.a aVar, Bundle bundle) {
        int a2 = com.huawei.android.pushagent.b.b.c.a(this.f25014d, "tryConnectPushSevTimes", 0);
        int a3 = com.huawei.android.pushagent.b.b.c.a(this.f25014d, "lastConnectPushSrvMethodIdx", 0);
        e.a("PushLogAC2815", "enter PushConnectEntity. notifyEvent is " + aVar + ",  tryConnectPushSevTimes:" + a2 + " lastConnctIdx:" + a3);
        switch (aVar) {
            case SocketEvent_CONNECTING:
                PushService.a(new Intent("com.huawei.android.push.intent.CONNECTING"));
                break;
            case SocketEvent_CONNECTED:
                this.f25015e.a();
                this.f25015e.a(System.currentTimeMillis());
                b.a(this.f25014d).a(this.f25014d, b.C0290b.SOCKET_CONNECTED, new Bundle());
                com.huawei.android.pushagent.b.b.c.a(this.f25014d, new com.huawei.android.pushagent.a.a("lastcontectsucc_time", Long.class, (Object) Long.valueOf(System.currentTimeMillis())));
                Intent intent = new Intent("com.huawei.android.push.intent.CONNECTED");
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                PushService.a(intent);
                return;
            case SocketEvent_CLOSE:
                bundle.putInt("connect_mode", e().ordinal());
                PushService.a(new Intent("com.huawei.android.push.intent.CHANNEL_CLOSED").putExtras(bundle));
                if (com.huawei.android.pushagent.b.a.a.c() == e()) {
                    com.huawei.android.pushagent.utils.a.a.a(this.f25014d, "com.huawei.android.push.intent.HEARTBEAT_RSP_TIMEOUT");
                    b.a(this.f25014d).a(this.f25014d, b.C0290b.SOCKET_CLOSE, bundle);
                }
                if (!this.g) {
                    int i = a2 + 1;
                    e.b("PushLogAC2815", "channel is not Regist, tryConnectPushSevTimes add to " + i);
                    com.huawei.android.pushagent.b.b.c.a(this.f25014d, new com.huawei.android.pushagent.a.a("tryConnectPushSevTimes", Integer.class, (Object) Integer.valueOf(i)));
                    com.huawei.android.pushagent.b.b.c.a(this.f25014d, new com.huawei.android.pushagent.a.a("lastConnectPushSrvMethodIdx", Integer.class, (Object) Integer.valueOf(a3)));
                    return;
                }
                break;
            case SocketEvent_MSG_RECEIVED:
                com.huawei.android.pushagent.a.b bVar = (com.huawei.android.pushagent.a.b) bundle.getSerializable("push_msg");
                if (bVar != null) {
                    e.a("PushLogAC2815", "received pushSrv Msg:" + com.huawei.android.pushagent.utils.a.a(bVar.a()));
                    if (bVar.a() == -45 || bVar.a() == -33) {
                        this.g = true;
                        com.huawei.android.pushagent.b.b.c.a(this.f25014d, new com.huawei.android.pushagent.a.a("lastConnectPushSrvMethodIdx", Integer.class, (Object) Integer.valueOf(b(a2, a3))));
                        com.huawei.android.pushagent.b.b.c.a(this.f25014d, new com.huawei.android.pushagent.a.a("tryConnectPushSevTimes", Integer.class, (Object) 0));
                    } else if ((bVar instanceof f) || (bVar instanceof k)) {
                        com.huawei.android.pushagent.utils.a.a.a(this.f25014d, "com.huawei.android.push.intent.HEARTBEAT_RSP_TIMEOUT");
                        this.f25015e.c(false);
                    }
                    this.f25015e.a();
                    Intent intent2 = new Intent("com.huawei.android.push.intent.MSG_RECEIVED");
                    intent2.putExtra("push_msg", bVar);
                    PushService.a(intent2);
                    break;
                } else {
                    e.b("PushLogAC2815", "push_msg is null");
                    return;
                }
                break;
        }
    }

    public synchronized void a(boolean z) throws com.huawei.android.pushagent.a.c {
        a(z, false);
    }

    public synchronized void a(boolean z, boolean z2) throws com.huawei.android.pushagent.a.c {
        try {
            e.a("PushLogAC2815", "enter PushConnectEntity:connect(isForceToConnPushSrv:" + z + ")");
            this.f25015e.b();
            if (com.huawei.android.pushagent.b.b.a.a(this.f25014d).V()) {
                if (com.huawei.android.pushagent.utils.a.b.a(this.f25014d) == -1) {
                    e.d("PushLogAC2815", "no network, so cannot connect");
                    return;
                }
                if (com.huawei.android.pushagent.b.b.c.a(this.f25014d, "cloudpush_isNoDelayConnect", false)) {
                    z = true;
                }
                if (!a()) {
                    int a2 = com.huawei.android.pushagent.b.b.c.a(this.f25014d, "tryConnectPushSevTimes", 0);
                    long b2 = b.a(this.f25014d).b(this.f25014d);
                    if (b2 <= 0) {
                        e.b("PushLogAC2815", "no limit to connect pushsvr");
                        if (this.f25012b != null) {
                            if (this.f25012b.isAlive()) {
                                e.b("PushLogAC2815", "It is in connecting...");
                                return;
                            }
                        }
                        e.a("PushLogAC2815", "begin to create new socket, so close socket");
                        b();
                        d();
                        e.a("PushLogAC2815", "IS_NODELAY_CONNECT:" + com.huawei.android.pushagent.b.b.c.a(this.f25014d, "cloudpush_isNoDelayConnect", false) + " hasMsg:" + z2);
                        if (com.huawei.android.pushagent.b.b.c.a(this.f25014d, "cloudpush_isNoDelayConnect", false) || z2 || com.huawei.android.pushagent.b.d.a.a(this.f25014d, 1)) {
                            this.g = false;
                            int a3 = com.huawei.android.pushagent.b.b.c.a(this.f25014d, "lastConnectPushSrvMethodIdx", 0);
                            InetSocketAddress a4 = com.huawei.android.pushagent.b.b.a.a(this.f25014d).a(z);
                            if (a4 != null) {
                                e.a("PushLogAC2815", "get pushSrvAddr:" + a4);
                                this.f25011a.f24993a = a4.getAddress().getHostAddress();
                                this.f25011a.f24994b = a4.getPort();
                                this.f25011a.f24995c = com.huawei.android.pushagent.b.b.c.b(this.f25014d);
                                this.f25011a = a(a3, a2);
                                this.f25012b = new c(this);
                                this.f25012b.start();
                                return;
                            }
                            e.a("PushLogAC2815", "no valid pushSrvAddr, just wait!!");
                            return;
                        }
                        com.huawei.android.pushagent.b.a.a.a(this.f25014d).a(a.C0287a.ConnectEntity_Polling);
                        com.huawei.android.pushagent.b.a.a.a(this.f25014d).a(a.C0287a.ConnectEntity_Polling, false);
                        return;
                    }
                    com.huawei.android.pushagent.b.a.a.a(this.f25014d).a(b2);
                } else if (z) {
                    e.a("PushLogAC2815", "hasConnect, but isForceToConnPushSrv:" + z + ", so send heartBeat");
                    this.f25015e.g();
                } else {
                    e.a("PushLogAC2815", "aready connect, need not connect more");
                }
            }
        } catch (Exception e2) {
            throw new com.huawei.android.pushagent.a.c((Throwable) e2);
        }
    }

    public a.C0287a e() {
        return a.C0287a.ConnectEntity_Push;
    }

    public boolean f() {
        if (this.f25011a == null) {
            this.f25011a = new d("", -1, false, com.huawei.android.pushagent.b.b.c.b(this.f25014d));
        }
        return true;
    }
}
