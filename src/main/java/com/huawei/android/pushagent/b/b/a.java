package com.huawei.android.pushagent.b.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.android.pushagent.PushReceiver;
import com.huawei.android.pushagent.PushService;
import com.huawei.android.pushagent.a.e;
import com.huawei.android.pushagent.b.d.b;
import com.huawei.android.pushagent.b.e.b;
import com.huawei.android.pushagent.utils.a.h;
import java.net.InetSocketAddress;
import java.util.Date;

public class a extends e {
    private static a g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25060a;

    /* renamed from: e  reason: collision with root package name */
    private Thread f25061e;

    /* renamed from: f  reason: collision with root package name */
    private long f25062f = 300000;

    public a(Context context) {
        super(context);
        af();
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (g == null) {
                g = new a(context);
            }
            aVar = g;
        }
        return aVar;
    }

    private synchronized boolean ah() {
        boolean z;
        if (ai()) {
            com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", " trsQuery thread already running, just wait!!");
            z = false;
        } else {
            this.f25061e = new b(this, "PushTRSQuery");
            this.f25061e.start();
            c.a(this.f25166d, new com.huawei.android.pushagent.a.a("lastQueryTRSTime", Long.class, (Object) Long.valueOf(System.currentTimeMillis())));
            c.a(this.f25166d, new com.huawei.android.pushagent.a.a("queryTrsTimes", Long.class, (Object) Long.valueOf(c.a(this.f25166d, "queryTrsTimes", 0) + 1)));
            z = true;
        }
        return z;
    }

    private synchronized boolean ai() {
        return this.f25061e != null && this.f25061e.isAlive();
    }

    public static void b(Context context) {
        if (g != null) {
            g.a("pushSrvValidTime", (Object) 0);
            g.f25060a = true;
        }
    }

    /* access modifiers changed from: private */
    public boolean b(e eVar) {
        if (eVar == null || !eVar.V()) {
            com.huawei.android.pushagent.utils.a.e.d("PushLogSC2815", "in PushSrvInfo:trsRetInfo, trsRetInfo is null or invalid:" + eVar);
            return false;
        }
        com.huawei.android.pushagent.utils.a.e.b("PushLogSC2815", "queryTrs success!");
        if (!a(eVar)) {
            com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "heart beat range change.");
            PushService.a(new Intent("com.huawei.android.push.intent.HEARTBEAT_RANGE_CHANGE"));
        }
        if (eVar.f25165c.containsKey("USE_SSL")) {
            c.a((Context) null, new com.huawei.android.pushagent.a.a("USE_SSL", Integer.class, (Object) Integer.valueOf(((Integer) eVar.f25165c.get("USE_SSL")).intValue())));
        }
        if (eVar.f25165c.containsKey("forbiddenMultiChannel")) {
            int intValue = ((Integer) eVar.f25165c.get("forbiddenMultiChannel")).intValue();
            com.huawei.android.pushagent.utils.a.e.b("PushLogSC2815", "forbiddenMultiChannel:" + intValue);
            new h(this.f25166d, "pushConfig").a("forbiddenMultiChannel", Integer.valueOf(intValue));
        }
        if (!a(eVar.b())) {
            com.huawei.android.pushagent.utils.a.e.b("PushLogSC2815", "belongId changed, need to reRegisterDeviceToken");
            b.c(this.f25166d);
        }
        this.f25165c.putAll(eVar.f25165c);
        a("pushSrvValidTime", (Object) Long.valueOf((f() * 1000) + System.currentTimeMillis()));
        this.f25062f = q() * 1000;
        c.a(this.f25166d, new com.huawei.android.pushagent.a.a("queryTrsTimes", Integer.class, (Object) 0));
        com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "write the lastQueryTRSsucc_time to the pushConfig.xml file ");
        c.a(this.f25166d, new com.huawei.android.pushagent.a.a("lastQueryTRSsucc_time", Long.class, (Object) Long.valueOf(System.currentTimeMillis())));
        this.f25060a = false;
        this.f25165c.remove("PushID");
        ag();
        com.huawei.android.pushagent.b.d.b.a(this.f25166d).a(this.f25166d, b.C0290b.TRS_QUERIED, new Bundle());
        if (com.huawei.android.pushagent.utils.a.r(this.f25166d).equals(this.f25166d.getPackageName()) || !com.huawei.android.pushagent.utils.a.s(this.f25166d)) {
            PushService.a(new Intent("com.huawei.android.push.intent.TRS_QUERY_SUCCESS").putExtra("trs_result", eVar.toString()));
        } else {
            com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "need not current " + this.f25166d.getPackageName() + " to depose, so exit");
            com.huawei.android.pushagent.utils.a.a(this.f25166d, false);
            boolean e2 = new h(this.f25166d, "pclient_request_info").e(this.f25166d.getPackageName());
            com.huawei.android.pushagent.utils.a.a(this.f25166d, 3);
            if (e2) {
                PushReceiver.getToken(this.f25166d);
            }
            PushService.b();
        }
        return true;
    }

    public InetSocketAddress a(boolean z) {
        boolean c2 = c(z);
        if (!V() || c2) {
            com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "in getPushSrvAddr, have no invalid addr");
            return null;
        }
        com.huawei.android.pushagent.utils.a.e.b("PushLogSC2815", "return valid PushSrvAddr");
        return new InetSocketAddress(c(), d());
    }

    public InetSocketAddress b(boolean z) {
        boolean c2 = c(z);
        if (!X() || c2) {
            com.huawei.android.pushagent.utils.a.e.d("PushLogSC2815", "in getPollingAddr, have no invalid addr");
            return null;
        }
        com.huawei.android.pushagent.utils.a.e.b("PushLogSC2815", "return valid PollingSrvAddr");
        return new InetSocketAddress(C(), D());
    }

    public boolean c(boolean z) {
        if (ai()) {
            com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "trsQuery thread is running");
            return true;
        }
        long a2 = c.a(this.f25166d, "lastQueryTRSTime", 0);
        long a3 = c.a(this.f25166d, "lastQueryTRSsucc_time", 0);
        com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "isvalid:" + V() + " srvValidBefore:" + (a("pushSrvValidTime", Long.MAX_VALUE) - System.currentTimeMillis()) + " pushSrvNeedQueryTRS:" + this.f25060a);
        if (V() && !this.f25060a && a("pushSrvValidTime", Long.MAX_VALUE) >= System.currentTimeMillis() && System.currentTimeMillis() > a3) {
            com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", " need not query TRS");
            return false;
        } else if (-1 == com.huawei.android.pushagent.utils.a.b.a(this.f25166d)) {
            com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "in queryTRSInfo no network");
            return false;
        } else {
            if (z) {
                com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "Force to Connect TRS");
            } else if (System.currentTimeMillis() - a3 < e() * 1000 && System.currentTimeMillis() > a3) {
                com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "can not contect TRS Service when  the connect more than " + e() + " sec last contected success time,lastQueryTRSsucc_time = " + new Date(a3));
                return false;
            } else if (System.currentTimeMillis() - a2 < this.f25062f && System.currentTimeMillis() > a2) {
                com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "can't connect TRS Service when the connectting time more later " + (this.f25062f / 1000) + "sec than  last contectting time,lastQueryTRSTime =" + new Date(a2));
                return false;
            } else if (c.a(this.f25166d, "queryTrsTimes", 0) > t()) {
                this.f25062f = r() * 1000;
            }
            if (c.a(this.f25166d, "cloudpush_isNoDelayConnect", false) || com.huawei.android.pushagent.b.d.a.a(this.f25166d)) {
                return ah();
            }
            return false;
        }
    }
}
