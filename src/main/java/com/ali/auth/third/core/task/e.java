package com.ali.auth.third.core.task;

import com.ali.auth.third.core.callback.InitResultCallback;
import com.ali.auth.third.core.util.CommonUtils;

public class e implements InitResultCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InitWaitTask f4980a;

    e(InitWaitTask initWaitTask) {
        this.f4980a = initWaitTask;
    }

    public void onFailure(int i, String str) {
        CommonUtils.onFailure(this.f4980a.failureCallback, i, str);
    }

    public void onSuccess() {
        this.f4980a.f4966a.run();
    }
}
