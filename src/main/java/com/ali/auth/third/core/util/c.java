package com.ali.auth.third.core.util;

import com.ali.auth.third.core.callback.FailureCallback;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FailureCallback f5000a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f5001b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f5002c;

    c(FailureCallback failureCallback, int i, String str) {
        this.f5000a = failureCallback;
        this.f5001b = i;
        this.f5002c = str;
    }

    public final void run() {
        if (this.f5000a != null) {
            this.f5000a.onFailure(this.f5001b, this.f5002c);
        }
    }
}
