package com.ali.auth.third.login.task;

import com.ali.auth.third.core.context.KernelContext;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LoginByIVTokenTask f5041a;

    d(LoginByIVTokenTask loginByIVTokenTask) {
        this.f5041a = loginByIVTokenTask;
    }

    public void run() {
        if (this.f5041a.f5028a != null) {
            this.f5041a.f5028a.onSuccess(KernelContext.credentialService.getSession());
        }
    }
}
