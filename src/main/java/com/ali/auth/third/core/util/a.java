package com.ali.auth.third.core.util;

import com.ali.auth.third.core.callback.FailureCallback;
import com.ali.auth.third.core.message.Message;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FailureCallback f4996a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Message f4997b;

    a(FailureCallback failureCallback, Message message) {
        this.f4996a = failureCallback;
        this.f4997b = message;
    }

    public final void run() {
        if (this.f4996a != null) {
            this.f4996a.onFailure(this.f4997b.code, this.f4997b.message);
        }
    }
}
