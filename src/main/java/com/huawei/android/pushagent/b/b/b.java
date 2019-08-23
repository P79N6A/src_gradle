package com.huawei.android.pushagent.b.b;

import com.huawei.android.pushagent.a.e;

public class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f25063a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b(a aVar, String str) {
        super(str);
        this.f25063a = aVar;
    }

    public void run() {
        try {
            e a2 = com.huawei.android.pushagent.utils.tools.e.a(this.f25063a.f25166d, this.f25063a.b());
            if (a2 == null) {
                a2 = new e(this.f25063a.f25166d);
            }
            if (a2.V()) {
                boolean unused = this.f25063a.b(a2);
                return;
            }
            com.huawei.android.pushagent.utils.a.e.b("PushLogSC2815", "query trs error:" + this.f25063a.a());
        } catch (Exception e2) {
            com.huawei.android.pushagent.utils.a.e.c("PushLogSC2815", e2.toString(), e2);
        }
    }
}
