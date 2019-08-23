package com.huawei.android.pushagent.b.a.a.a;

import android.content.Context;
import com.huawei.android.pushagent.a.c;
import com.huawei.android.pushagent.b.b.a;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;

public class b extends com.huawei.android.pushagent.b.a.a.b {

    /* renamed from: e  reason: collision with root package name */
    long f25024e = -1;

    public b(Context context) {
        super(context);
        f();
    }

    public long b(boolean z) {
        if (-1 == com.huawei.android.pushagent.utils.a.b.a(this.f25027c)) {
            return a.a(this.f25027c).p() * 1000;
        }
        if (h()) {
            f();
        }
        if (this.f25024e > 0) {
            return this.f25024e;
        }
        long B = a.a(this.f25027c).B() * 1000;
        long currentTimeMillis = System.currentTimeMillis();
        if (d() >= currentTimeMillis) {
            a(0);
        }
        if (d() <= currentTimeMillis - (a.a(this.f25027c).B() * 1000)) {
            return a.a(this.f25027c).B() * 1000;
        }
        if (d() <= currentTimeMillis && currentTimeMillis <= d() + (a.a(this.f25027c).B() * 1000)) {
            B = (d() + (a.a(this.f25027c).B() * 1000)) - currentTimeMillis;
        }
        return B;
    }

    public boolean b(long j) {
        this.f25024e = j;
        return true;
    }

    public String c() {
        return "Push_PollingHBeat";
    }

    public void c(boolean z) {
    }

    public com.huawei.android.pushagent.b.a.a.b f() {
        this.f25025a = new h(this.f25027c, c()).d("lastHeartBeatTime");
        return this;
    }

    public void g() {
        try {
            com.huawei.android.pushagent.b.a.a.f().a(false);
        } catch (c e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return false;
    }
}
