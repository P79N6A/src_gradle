package com.taobao.accs.data;

import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.utl.ALog;

public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f78963a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MsgDistributeService f78964b;

    public void run() {
        ALog.i("MsgDistributeService", "onStartCommand send message", new Object[0]);
        ACCSManager.AccsRequest accsRequest = (ACCSManager.AccsRequest) this.f78963a.getSerializableExtra("reqdata");
        String stringExtra = this.f78963a.getStringExtra("packageName");
        String stringExtra2 = this.f78963a.getStringExtra("appKey");
        String stringExtra3 = this.f78963a.getStringExtra("configTag");
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra3 = stringExtra2;
        }
        ACCSManager.getAccsInstance(this.f78964b.getApplicationContext(), stringExtra2, stringExtra3).a(this.f78964b.getApplicationContext(), accsRequest, stringExtra, false);
    }

    k(MsgDistributeService msgDistributeService, Intent intent) {
        this.f78964b = msgDistributeService;
        this.f78963a = intent;
    }
}
