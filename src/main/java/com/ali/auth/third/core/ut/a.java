package com.ali.auth.third.core.ut;

import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.model.RpcRequest;
import com.ali.auth.third.core.service.RpcService;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import org.json.JSONObject;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ JSONObject f4981a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserTracer f4982b;

    a(UserTracer userTracer, JSONObject jSONObject) {
        this.f4982b = userTracer;
        this.f4981a = jSONObject;
    }

    public void run() {
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.target = "mtop.taobao.havana.mlogin.userTracerLog";
        rpcRequest.version = "1.0";
        rpcRequest.addParam("userTracerInfo", this.f4981a);
        rpcRequest.addParam(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
        ((RpcService) KernelContext.getService(RpcService.class)).invoke(rpcRequest, String.class);
    }
}
