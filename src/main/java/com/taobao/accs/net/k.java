package com.taobao.accs.net;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import java.util.UUID;

public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f79015a;

    public void run() {
        ALog.d(this.f79015a.d(), "sendAccsHeartbeatMessage", new Object[0]);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dataType", "pingreq");
        jSONObject.put("timeInterval", Long.valueOf(this.f79015a.o));
        ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, null, jSONObject.toJSONString().getBytes(), UUID.randomUUID().toString());
        accsRequest.setTarget("accs-iot");
        accsRequest.setTargetServiceName("sal");
        j jVar = this.f79015a;
        Context context = this.f79015a.f78992d;
        String packageName = this.f79015a.f78992d.getPackageName();
        this.f79015a.i.getAppKey();
        this.f79015a.a(Message.a(jVar, context, packageName, "4|", accsRequest, true), true);
    }

    k(j jVar) {
        this.f79015a = jVar;
    }
}
