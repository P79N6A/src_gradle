package com.ali.auth.third.core.util;

import com.ali.auth.third.core.callback.FailureCallback;
import com.ali.auth.third.core.model.ResultCode;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FailureCallback f4998a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ResultCode f4999b;

    b(FailureCallback failureCallback, ResultCode resultCode) {
        this.f4998a = failureCallback;
        this.f4999b = resultCode;
    }

    public final void run() {
        if (this.f4998a != null) {
            this.f4998a.onFailure(this.f4999b.code, this.f4999b.message);
        }
    }
}
