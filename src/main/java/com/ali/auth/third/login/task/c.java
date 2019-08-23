package com.ali.auth.third.login.task;

import android.text.TextUtils;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.service.UserTrackerService;
import com.ali.auth.third.login.UTConstants;
import java.util.HashMap;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f5038a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f5039b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LoginByIVTokenTask f5040c;

    c(LoginByIVTokenTask loginByIVTokenTask, int i, String str) {
        this.f5040c = loginByIVTokenTask;
        this.f5038a = i;
        this.f5039b = str;
    }

    public void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("code", this.f5038a);
        if (!TextUtils.isEmpty(this.f5039b)) {
            hashMap.put("message", this.f5039b);
        }
        ((UserTrackerService) KernelContext.getService(UserTrackerService.class)).send(UTConstants.E_H5_LOGIN_FAILURE, hashMap);
        if (this.f5040c.f5028a != null) {
            this.f5040c.f5028a.onFailure(this.f5038a, this.f5039b);
        }
    }
}
