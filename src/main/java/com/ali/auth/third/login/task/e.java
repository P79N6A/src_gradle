package com.ali.auth.third.login.task;

import android.text.TextUtils;
import com.ali.auth.third.core.broadcast.LoginAction;
import com.ali.auth.third.core.callback.FailureCallback;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.model.ResultCode;
import com.ali.auth.third.core.service.MemberExecutorService;
import com.ali.auth.third.core.service.impl.CredentialManager;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.core.util.CommonUtils;
import com.ali.auth.third.login.LoginComponent;
import com.ali.auth.third.login.a.a;
import com.ali.auth.third.login.callback.LogoutCallback;

public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LogoutCallback f5042a;

    e(LogoutCallback logoutCallback) {
        this.f5042a = logoutCallback;
    }

    public void run() {
        f fVar;
        MemberExecutorService memberExecutorService;
        ResultCode logout;
        try {
            SDKLogger.e("logout task", "into logout " + CredentialManager.INSTANCE.getInternalSession().toString());
            if (!TextUtils.isEmpty(CredentialManager.INSTANCE.getInternalSession().user.userId)) {
                LoginComponent.logout();
            }
            logout = a.f5012b.logout();
            if (ResultCode.SUCCESS.equals(logout)) {
                a.f5014d.logout();
                CommonUtils.sendBroadcast(LoginAction.NOTIFY_LOGOUT);
                memberExecutorService = KernelContext.executorService;
                fVar = new f(this);
                memberExecutorService.postUITask(fVar);
                return;
            }
        } catch (Exception unused) {
            logout = a.f5012b.logout();
            if (ResultCode.SUCCESS.equals(logout)) {
                a.f5014d.logout();
                CommonUtils.sendBroadcast(LoginAction.NOTIFY_LOGOUT);
                memberExecutorService = KernelContext.executorService;
                fVar = new f(this);
            }
        } catch (Throwable th) {
            ResultCode logout2 = a.f5012b.logout();
            if (ResultCode.SUCCESS.equals(logout2)) {
                a.f5014d.logout();
                CommonUtils.sendBroadcast(LoginAction.NOTIFY_LOGOUT);
                KernelContext.executorService.postUITask(new f(this));
            } else {
                CommonUtils.onFailure((FailureCallback) this.f5042a, logout2);
            }
            throw th;
        }
        CommonUtils.onFailure((FailureCallback) this.f5042a, logout);
    }
}
