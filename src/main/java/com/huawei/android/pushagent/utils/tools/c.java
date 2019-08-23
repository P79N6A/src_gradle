package com.huawei.android.pushagent.utils.tools;

import android.content.Context;
import android.content.Intent;
import com.huawei.android.pushagent.utils.a.e;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f25192a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Intent f25193b;

    c(Context context, Intent intent) {
        this.f25192a = context;
        this.f25193b = intent;
    }

    public final void run() {
        try {
            b.f25186a.b(this.f25192a, this.f25193b);
        } catch (Exception e2) {
            e.c("PushLogAC2815", "call handleEvent process cause Exception:" + e2.toString(), e2);
        }
    }
}
