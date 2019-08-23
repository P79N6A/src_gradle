package com.huawei.android.pushselfshow.richpush.favorites;

import android.content.Context;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.utils.a.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f25251a;

    d(c cVar) {
        this.f25251a = cVar;
    }

    public void run() {
        e.a("PushSelfShowLog", "deleteTipDialog mThread run");
        boolean z = false;
        for (e eVar : this.f25251a.f25250a.h.a()) {
            if (eVar.a()) {
                c.a((Context) this.f25251a.f25250a.f25230b, eVar.c());
                z = true;
            }
        }
        if (z) {
            if (!this.f25251a.f25250a.k) {
                this.f25251a.f25250a.h.b();
            }
            this.f25251a.f25250a.f25229a.sendEmptyMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
        }
    }
}
