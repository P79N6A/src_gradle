package com.ali.auth.third.core;

import com.ali.auth.third.core.callback.ResultCallback;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Class f4902a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ResultCallback f4903b;

    a(Class cls, ResultCallback resultCallback) {
        this.f4902a = cls;
        this.f4903b = resultCallback;
    }

    public final void run() {
        this.f4903b.onSuccess(MemberSDK.getService(this.f4902a));
    }
}
