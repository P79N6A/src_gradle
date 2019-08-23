package com.ali.auth.third.login.task;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AbsLoginByCodeTask f5034a;

    a(AbsLoginByCodeTask absLoginByCodeTask) {
        this.f5034a = absLoginByCodeTask;
    }

    public void run() {
        this.f5034a.doWhenResultOk();
    }
}
