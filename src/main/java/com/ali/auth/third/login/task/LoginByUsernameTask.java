package com.ali.auth.third.login.task;

import android.text.TextUtils;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.message.Message;
import com.ali.auth.third.core.message.MessageUtils;
import com.ali.auth.third.core.model.LoginReturnData;
import com.ali.auth.third.core.model.ResultCode;
import com.ali.auth.third.core.model.RpcResponse;
import com.ali.auth.third.core.service.UserTrackerService;
import com.ali.auth.third.core.task.AbsAsyncTask;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.core.util.CommonUtils;
import com.ali.auth.third.core.util.ResourceUtils;
import com.ali.auth.third.login.LoginComponent;
import com.ali.auth.third.login.UTConstants;
import com.ali.auth.third.ui.LoginWebViewActivity;
import com.ali.auth.third.ui.context.a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginByUsernameTask extends AbsAsyncTask<String, Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    private a f5031a;

    public LoginByUsernameTask(a aVar) {
        this.f5031a = aVar;
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
            this.f5031a.a(jSONObject2.toString());
            return null;
        }
        RpcResponse<LoginReturnData> loginByUserName = LoginComponent.INSTANCE.loginByUserName(strArr[0]);
        if (loginByUserName == null) {
            this.f5031a.b("");
            return null;
        }
        try {
            if (loginByUserName.code == 3000) {
                com.ali.auth.third.login.a.a.f5012b.refreshWhenLogin((LoginReturnData) loginByUserName.returnValue);
                this.f5031a.a().setResult(ResultCode.SUCCESS.code);
                this.f5031a.a().finish();
            } else {
                if (loginByUserName.code == 13010) {
                    jSONObject = new JSONObject();
                    jSONObject.put("code", loginByUserName.code);
                    jSONObject.put("message", loginByUserName.message);
                    JSONObject jSONObject3 = new JSONObject();
                    if (loginByUserName.returnValue != null) {
                        jSONObject3.put("checkCodeId", ((LoginReturnData) loginByUserName.returnValue).checkCodeId);
                        jSONObject3.put("checkCodeUrl", ((LoginReturnData) loginByUserName.returnValue).checkCodeUrl);
                    }
                    jSONObject.put("data", jSONObject3);
                    aVar = this.f5031a;
                } else if (loginByUserName.code == 13011) {
                    jSONObject = new JSONObject();
                    jSONObject.put("code", loginByUserName.code);
                    jSONObject.put("message", loginByUserName.message);
                    JSONObject jSONObject4 = new JSONObject();
                    if (loginByUserName.returnValue != null) {
                        jSONObject4.put("checkCodeId", ((LoginReturnData) loginByUserName.returnValue).checkCodeId);
                        jSONObject4.put("checkCodeUrl", ((LoginReturnData) loginByUserName.returnValue).checkCodeUrl);
                    }
                    jSONObject.put("data", jSONObject4);
                    aVar = this.f5031a;
                } else if (loginByUserName.code == 13060) {
                    jSONObject = new JSONObject();
                    jSONObject.put("code", loginByUserName.code);
                    jSONObject.put("message", loginByUserName.message);
                    JSONObject jSONObject5 = new JSONObject();
                    if (loginByUserName.returnValue != null) {
                        jSONObject5.put("doubleCheckUrl", ((LoginReturnData) loginByUserName.returnValue).h5Url);
                    }
                    jSONObject.put("data", jSONObject5);
                    if (loginByUserName.returnValue != null) {
                        this.f5031a.a();
                        LoginWebViewActivity.token = ((LoginReturnData) loginByUserName.returnValue).token;
                        this.f5031a.a();
                        LoginWebViewActivity.scene = ((LoginReturnData) loginByUserName.returnValue).scene;
                    }
                    aVar = this.f5031a;
                } else {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("code", loginByUserName.code);
                    jSONObject6.put("message", loginByUserName.message);
                    this.f5031a.a(jSONObject6.toString());
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", loginByUserName.code);
                    if (!TextUtils.isEmpty(loginByUserName.message)) {
                        hashMap.put("message", loginByUserName.message);
                    }
                    ((UserTrackerService) KernelContext.getService(UserTrackerService.class)).send(UTConstants.E_H5_LOGIN_FAILURE, hashMap);
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
        this.f5031a.a(createMessage.code, createMessage.message);
    }
}
