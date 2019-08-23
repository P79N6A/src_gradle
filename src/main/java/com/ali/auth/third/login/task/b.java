package com.ali.auth.third.login.task;

import com.ali.auth.third.core.message.Message;
import com.ali.auth.third.core.message.MessageUtils;
import com.ali.auth.third.core.model.RpcResponse;
import com.ali.auth.third.core.trace.SDKLogger;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f5035a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RpcResponse f5036b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbsLoginByCodeTask f5037c;

    b(AbsLoginByCodeTask absLoginByCodeTask, int i, RpcResponse rpcResponse) {
        this.f5037c = absLoginByCodeTask;
        this.f5035a = i;
        this.f5036b = rpcResponse;
    }

    public void run() {
        Message createMessage = MessageUtils.createMessage(15, "login", "code " + this.f5035a + " " + this.f5036b.message);
        SDKLogger.d("login", createMessage.toString());
        this.f5037c.doWhenResultFail(createMessage.code, createMessage.message);
    }
}
