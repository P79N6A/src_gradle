package com.ali.auth.third.login.task;

import com.ali.auth.third.core.message.Message;
import com.ali.auth.third.core.message.MessageUtils;
import com.ali.auth.third.core.model.LoginReturnData;
import com.ali.auth.third.core.model.ResultCode;
import com.ali.auth.third.core.model.RpcResponse;
import com.ali.auth.third.core.task.AbsAsyncTask;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.core.util.CommonUtils;
import com.ali.auth.third.core.util.ResourceUtils;
import com.ali.auth.third.login.LoginComponent;
import com.ali.auth.third.ui.LoginWebViewActivity;
import com.ali.auth.third.ui.context.a;
import org.json.JSONException;
import org.json.JSONObject;

public class BindByUsernameTask extends AbsAsyncTask<String, Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    private a f5026a;

    public BindByUsernameTask(a aVar) {
        this.f5026a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void asyncExecute(String... strArr) {
        JSONObject jSONObject;
        a aVar;
        if (!CommonUtils.isNetworkAvailable()) {
            RpcResponse rpcResponse = new RpcResponse();
            rpcResponse.code = -1;
            rpcResponse.message = ResourceUtils.getString("com_taobao_tae_sdk_network_not_available_message");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", rpcResponse.code);
                jSONObject2.put("message", rpcResponse.message);
            } catch (JSONException unused) {
            }
            this.f5026a.a(jSONObject2.toString());
            return null;
        }
        RpcResponse<LoginReturnData> loginByUserName = LoginComponent.INSTANCE.loginByUserName(strArr[0]);
        if (loginByUserName == null) {
            this.f5026a.b("");
            return null;
        }
        try {
            if (loginByUserName.code == 3000) {
                com.ali.auth.third.login.a.a.f5012b.refreshWhenLogin((LoginReturnData) loginByUserName.returnValue);
                this.f5026a.a().setResult(ResultCode.SUCCESS.code);
                this.f5026a.a().finish();
            } else {
                if (loginByUserName.code == 13010) {
                    jSONObject = new JSONObject();
                    jSONObject.put("code", 1007);
                    jSONObject.put("message", loginByUserName.message);
                    jSONObject.put("success", false);
                    JSONObject jSONObject3 = new JSONObject();
                    if (loginByUserName.returnValue != null) {
                        jSONObject3.put("checkCodeId", ((LoginReturnData) loginByUserName.returnValue).checkCodeId);
                        jSONObject3.put("checkCodeUrl", ((LoginReturnData) loginByUserName.returnValue).checkCodeUrl);
                    }
                    jSONObject.put("data", jSONObject3);
                    aVar = this.f5026a;
                } else if (loginByUserName.code == 13011) {
                    jSONObject = new JSONObject();
                    jSONObject.put("code", 1008);
                    jSONObject.put("message", loginByUserName.message);
                    JSONObject jSONObject4 = new JSONObject();
                    if (loginByUserName.returnValue != null) {
                        jSONObject4.put("checkCodeId", ((LoginReturnData) loginByUserName.returnValue).checkCodeId);
                        jSONObject4.put("checkCodeUrl", ((LoginReturnData) loginByUserName.returnValue).checkCodeUrl);
                    }
                    jSONObject.put("data", jSONObject4);
                    aVar = this.f5026a;
                } else if (loginByUserName.code == 13060) {
                    jSONObject = new JSONObject();
                    jSONObject.put("code", 1013);
                    jSONObject.put("message", loginByUserName.message);
                    JSONObject jSONObject5 = new JSONObject();
                    if (loginByUserName.returnValue != null) {
                        jSONObject5.put("doubleCheckUrl", ((LoginReturnData) loginByUserName.returnValue).h5Url);
                    }
                    jSONObject.put("data", jSONObject5);
                    if (loginByUserName.returnValue != null) {
                        this.f5026a.a();
                        LoginWebViewActivity.token = ((LoginReturnData) loginByUserName.returnValue).token;
                        this.f5026a.a();
                        LoginWebViewActivity.scene = ((LoginReturnData) loginByUserName.returnValue).scene;
                    }
                    aVar = this.f5026a;
                } else {
                    jSONObject = new JSONObject();
                    jSONObject.put("code", loginByUserName.code);
                    jSONObject.put("message", loginByUserName.message);
                    aVar = this.f5026a;
                }
                aVar.a(jSONObject.toString());
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public void doFinally() {
    }

    public void doWhenException(Throwable th) {
        Message createMessage = MessageUtils.createMessage(10010, th.getMessage());
        SDKLogger.d("login", createMessage.toString());
        this.f5026a.a(createMessage.code, createMessage.message);
    }
}
