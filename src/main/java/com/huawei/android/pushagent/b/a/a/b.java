package com.huawei.android.pushagent.b.a.a;

import android.content.Context;
import android.content.Intent;
import com.huawei.android.pushagent.b.a.a;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import java.util.Date;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public long f25025a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f25026b;

    /* renamed from: c  reason: collision with root package name */
    public Context f25027c;

    /* renamed from: d  reason: collision with root package name */
    public int f25028d = 1;

    public b(Context context) {
        this.f25027c = context;
    }

    public void a() {
        if (a.b(this.f25027c) == this) {
            long b2 = b(false);
            e.a("PushLogAC2815", "after delayHeartBeatReq, nextHeartBeatTime, will be " + b2 + "ms later");
            com.huawei.android.pushagent.utils.a.a.a(this.f25027c, new Intent("com.huawei.intent.action.PUSH").putExtra("EXTRA_INTENT_TYPE", "com.huawei.android.push.intent.HEARTBEAT_REQ").putExtra("heartbeat_interval", b2).setPackage(this.f25027c.getPackageName()), b2);
        }
    }

    public void a(int i) {
        this.f25028d = i;
    }

    public void a(long j) {
        this.f25025a = j;
        new h(this.f25027c, c()).a("lastHeartBeatTime", Long.valueOf(j));
    }

    public void a(boolean z) {
        this.f25026b = z;
    }

    public abstract long b(boolean z);

    public void b() {
        if (a.b(this.f25027c) == this) {
            long e2 = e() - System.currentTimeMillis();
            e.a("PushLogAC2815", "after updateHeartBeatReq, nextHeartBeatTime, will be " + e2 + "ms later");
            com.huawei.android.pushagent.utils.a.a.a(this.f25027c, new Intent("com.huawei.intent.action.PUSH").putExtra("EXTRA_INTENT_TYPE", "com.huawei.android.push.intent.HEARTBEAT_REQ").putExtra("heartbeat_interval", e2).setPackage(this.f25027c.getPackageName()), e2);
        }
    }

    public abstract boolean b(long j);

    public String c() {
        return getClass().getSimpleName();
    }

    public abstract void c(boolean z);

    public long d() {
        return this.f25025a;
    }

    public long e() {
        long currentTimeMillis = System.currentTimeMillis();
        long b2 = b(false);
        if (d() <= currentTimeMillis && d() + b2 > currentTimeMillis) {
            currentTimeMillis = d();
        }
        return currentTimeMillis + b2;
    }

    public abstract b f();

    public abstract void g();

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("lastHeartBeatTime");
        stringBuffer.append(new Date(this.f25025a));
        stringBuffer.append(" heartBeatInterval");
        stringBuffer.append(b(false));
        return stringBuffer.toString();
    }
}
