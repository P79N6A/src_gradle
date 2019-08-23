package com.taobao.accs.net;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;

public class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f79029a;

    public void run() {
        try {
            if (this.f79029a.f78992d != null && !TextUtils.isEmpty(this.f79029a.i())) {
                ALog.i(this.f79029a.d(), "mTryStartServiceRunable bindapp", new Object[0]);
                this.f79029a.b(this.f79029a.f78992d);
            }
        } catch (Exception unused) {
        }
    }

    p(j jVar) {
        this.f79029a = jVar;
    }
}
