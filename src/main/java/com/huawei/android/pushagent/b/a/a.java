package com.huawei.android.pushagent.b.a;

import android.content.Context;
import android.content.Intent;
import com.huawei.android.pushagent.PushService;
import com.huawei.android.pushagent.b.a.a.b;
import com.huawei.android.pushagent.b.b.c;
import com.huawei.android.pushagent.utils.a.e;
import java.util.LinkedList;
import java.util.List;

public class a {

    /* renamed from: d  reason: collision with root package name */
    private static a f25004d;

    /* renamed from: a  reason: collision with root package name */
    C0287a f25005a = C0287a.ConnectEntity_Polling;

    /* renamed from: b  reason: collision with root package name */
    com.huawei.android.pushagent.b.a.a.a[] f25006b = new com.huawei.android.pushagent.b.a.a.a[C0287a.values().length];

    /* renamed from: c  reason: collision with root package name */
    private Context f25007c;

    /* renamed from: com.huawei.android.pushagent.b.a.a$a  reason: collision with other inner class name */
    public enum C0287a {
        ConnectEntity_Push,
        ConnectEntity_Polling
    }

    private a(Context context) {
        this.f25007c = context;
    }

    public static synchronized a a(Context context) {
        synchronized (a.class) {
            if (f25004d != null) {
                a aVar = f25004d;
                return aVar;
            } else if (context == null) {
                e.d("PushLogAC2815", "when init ChannelMgr g_channelMgr and context all null!!");
                return null;
            } else {
                a aVar2 = new a(context);
                f25004d = aVar2;
                aVar2.g();
                a aVar3 = f25004d;
                return aVar3;
            }
        }
    }

    public static b b(Context context) {
        return a(context).d().f25015e;
    }

    public static C0287a c() {
        return a((Context) null).f25005a;
    }

    private static void c(Context context) {
        e.a("PushLogAC2815", "enter cancelDelayAlarm");
        com.huawei.android.pushagent.utils.a.a.a(context, "com.huawei.action.CONNECT_PUSHSRV");
        com.huawei.android.pushagent.utils.a.a.a(context, "com.huawei.android.push.intent.HEARTBEAT_RSP_TIMEOUT");
        com.huawei.android.pushagent.utils.a.a.a(context, new Intent("com.huawei.intent.action.PUSH").putExtra("EXTRA_INTENT_TYPE", "com.huawei.android.push.intent.HEARTBEAT_REQ").putExtra("heartbeat_interval", 2592000000L).setPackage(context.getPackageName()));
    }

    public static com.huawei.android.pushagent.b.a.a.a e() {
        return a((Context) null).f25006b[C0287a.ConnectEntity_Push.ordinal()];
    }

    public static com.huawei.android.pushagent.b.a.a.a f() {
        return a((Context) null).f25006b[C0287a.ConnectEntity_Polling.ordinal()];
    }

    private boolean g() {
        e.a("PushLogAC2815", "begin to init ChannelMgr");
        int a2 = c.a(this.f25007c, "curConnectEntity", C0287a.ConnectEntity_Polling.ordinal());
        e.a("PushLogAC2815", "in cfg curConEntity:" + a2);
        if (a2 >= 0 && a2 < C0287a.values().length) {
            this.f25005a = C0287a.values()[a2];
        }
        if (C0287a.ConnectEntity_Polling == this.f25005a && !com.huawei.android.pushagent.b.b.a.a(this.f25007c).X() && com.huawei.android.pushagent.b.b.a.a(this.f25007c).W()) {
            this.f25005a = C0287a.ConnectEntity_Push;
        }
        this.f25006b[C0287a.ConnectEntity_Push.ordinal()] = new com.huawei.android.pushagent.b.a.a.b.a(null, this.f25007c);
        this.f25006b[C0287a.ConnectEntity_Polling.ordinal()] = new com.huawei.android.pushagent.b.a.a.a.a(null, this.f25007c);
        return true;
    }

    public List a() {
        LinkedList linkedList = new LinkedList();
        for (com.huawei.android.pushagent.b.a.a.a aVar : this.f25006b) {
            if (aVar.f25015e.c() != null) {
                linkedList.add(aVar.f25015e.c());
            }
        }
        return linkedList;
    }

    public void a(long j) {
        e.a("PushLogAC2815", "next connect pushsvr will be after " + j);
        Intent intent = new Intent("com.huawei.action.CONNECT_PUSHSRV");
        intent.setPackage(this.f25007c.getPackageName());
        com.huawei.android.pushagent.utils.a.a.b(this.f25007c, intent, j);
    }

    public void a(Intent intent) {
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("EXTRA_INTENT_TYPE");
        if ("com.huawei.android.push.intent.HEARTBEAT_RSP_TIMEOUT".equals(action)) {
            e.b("PushLogAC2815", "time out for wait heartbeat so reconnect");
            b(this.f25007c).c(true);
            d().d();
            if (-1 != com.huawei.android.pushagent.utils.a.b.a(this.f25007c) && c() == C0287a.ConnectEntity_Push) {
                try {
                    d().a(false);
                } catch (com.huawei.android.pushagent.a.c e2) {
                    e.c("PushLogAC2815", e2.toString(), e2);
                }
            }
        } else if (!"com.huawei.intent.action.PUSH".equals(action) || !"com.huawei.android.push.intent.HEARTBEAT_REQ".equals(stringExtra)) {
            if ("com.huawei.android.push.intent.REFRESH_PUSH_CHANNEL".equals(action) || "android.intent.action.TIME_SET".equals(action) || "android.intent.action.TIMEZONE_CHANGED".equals(action)) {
                if (d().a()) {
                    b(this.f25007c).a(false);
                    b(this.f25007c).g();
                } else if (-1 != com.huawei.android.pushagent.utils.a.b.a(this.f25007c)) {
                    e.a("PushLogAC2815", "received " + action + ", but not Connect, go to connect!");
                    PushService.a(new Intent("com.huawei.action.CONNECT_PUSHSRV"));
                } else {
                    e.b("PushLogAC2815", "no net work, when recevice :" + action + ", do nothing");
                }
            }
        } else if (-1 != com.huawei.android.pushagent.utils.a.b.a(this.f25007c)) {
            com.huawei.android.pushagent.b.a.a.a d2 = d();
            if (d2.a()) {
                d2.f25015e.a(true);
                d2.f25015e.g();
            } else {
                PushService.a(new Intent("com.huawei.action.CONNECT_PUSHSRV").setPackage(this.f25007c.getPackageName()));
            }
        } else {
            e.d("PushLogAC2815", "when send heart beat, not net work");
            b(this.f25007c).b();
        }
    }

    public void a(C0287a aVar) {
        this.f25005a = aVar;
        if (C0287a.ConnectEntity_Polling == aVar && !com.huawei.android.pushagent.b.b.a.a(this.f25007c).X() && com.huawei.android.pushagent.b.b.a.a(this.f25007c).W()) {
            aVar = C0287a.ConnectEntity_Push;
        }
        c.a(this.f25007c, new com.huawei.android.pushagent.a.a("curConnectEntity", Integer.class, (Object) Integer.valueOf(aVar.ordinal())));
    }

    public void a(C0287a aVar, boolean z) {
        e.d("PushLogAC2815", "enter ChannelMgr:connect(entity" + aVar + ", forceCon" + z + ")");
        if (aVar != null) {
            try {
                this.f25006b[aVar.ordinal()].a(z);
            } catch (com.huawei.android.pushagent.a.c e2) {
                e.c("PushLogAC2815", e2.toString(), e2);
            }
            return;
        }
        e.d("PushLogAC2815", "entityMode is invalid!!");
    }

    public void b() {
        c(this.f25007c);
        for (com.huawei.android.pushagent.b.a.a.a d2 : this.f25006b) {
            d2.d();
        }
    }

    public com.huawei.android.pushagent.b.a.a.a d() {
        e.a("PushLogAC2815", "enter getCurConnetEntity(curConnectType:" + this.f25005a + ", ordinal:" + this.f25005a.ordinal() + " curConnect:" + this.f25006b[this.f25005a.ordinal()].getClass().getSimpleName() + ")");
        if (C0287a.ConnectEntity_Polling == this.f25005a && !com.huawei.android.pushagent.b.b.a.a(this.f25007c).X() && com.huawei.android.pushagent.b.b.a.a(this.f25007c).W()) {
            e.a("PushLogAC2815", "polling srv is not ready, push is ok, so change it to Push");
            this.f25005a = C0287a.ConnectEntity_Push;
        }
        return this.f25006b[this.f25005a.ordinal()];
    }
}
