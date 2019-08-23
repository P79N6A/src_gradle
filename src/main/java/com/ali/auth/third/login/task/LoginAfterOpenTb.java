package com.ali.auth.third.login.task;

import android.app.Activity;
import android.text.TextUtils;
import com.ali.auth.third.core.broadcast.LoginAction;
import com.ali.auth.third.core.callback.FailureCallback;
import com.ali.auth.third.core.callback.LoginCallback;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.model.LoginReturnData;
import com.ali.auth.third.core.model.ResultCode;
import com.ali.auth.third.core.model.RpcResponse;
import com.ali.auth.third.core.service.UserTrackerService;
import com.ali.auth.third.core.util.CommonUtils;
import com.ali.auth.third.login.LoginComponent;
import com.ali.auth.third.login.UTConstants;
import com.ali.auth.third.login.a.a;
import com.ali.auth.third.ui.LoginActivity;
import com.ali.auth.third.ui.context.CallbackContext;
import java.util.HashMap;

public class LoginAfterOpenTb extends AbsLoginByCodeTask {

    /* renamed from: a  reason: collision with root package name */
    private LoginCallback f5027a;

    public LoginAfterOpenTb(Activity activity, LoginCallback loginCallback) {
        super(activity);
        this.f5027a = loginCallback;
    }

    public void doWhenException(Throwable th) {
        CommonUtils.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED);
        HashMap hashMap = new HashMap();
        hashMap.put("code", "10010");
        hashMap.put("message", "exception");
        ((UserTrackerService) KernelContext.getService(UserTrackerService.class)).send(UTConstants.E_TB_LOGIN_FAILURE, hashMap);
        CommonUtils.onFailure((FailureCallback) this.f5027a, ResultCode.create(10010, th.getMessage()));
    }

    /* access modifiers changed from: protected */
    public void doWhenResultFail(int i, String str) {
        if (this.f5027a != null) {
            this.f5027a.onFailure(i, str);
            HashMap hashMap = new HashMap();
            hashMap.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("message", str);
            }
            ((UserTrackerService) KernelContext.getService(UserTrackerService.class)).send(UTConstants.E_TB_LOGIN_FAILURE, hashMap);
        }
        if (CallbackContext.mGlobalLoginCallback != null) {
            CallbackContext.mGlobalLoginCallback.onFailure(i, str);
        }
        CommonUtils.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED);
        if (this.activity != null && (this.activity instanceof LoginActivity)) {
            CallbackContext.activity = null;
            this.activity.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void doWhenResultOk() {
        if (this.f5027a != null) {
            this.f5027a.onSuccess(a.f5012b.getSession());
            ((UserTrackerService) KernelContext.getService(UserTrackerService.class)).send(UTConstants.E_TB_LOGIN_SUCCESS, null);
        }
        if (CallbackContext.mGlobalLoginCallback != null) {
            CallbackContext.mGlobalLoginCallback.onSuccess(a.f5012b.getSession());
        }
        CommonUtils.sendBroadcast(LoginAction.NOTIFY_LOGIN_SUCCESS);
        if (this.activity != null && (this.activity instanceof LoginActivity)) {
            CallbackContext.activity = null;
            this.activity.finish();
        }
    }

    /* access modifiers changed from: protected */
    public RpcResponse<LoginReturnData> login(String[] strArr) {
        return LoginComponent.INSTANCE.loginByCode(strArr[0]);
    }
}
