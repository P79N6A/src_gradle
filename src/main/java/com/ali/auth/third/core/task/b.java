package com.ali.auth.third.core.task;

import com.ali.auth.third.core.callback.InitResultCallback;
import com.ali.auth.third.core.model.ResultCode;

public class b implements InitResultCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InitResultCallback f4972a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f4973b;

    b(a aVar, InitResultCallback initResultCallback) {
        this.f4973b = aVar;
        this.f4972a = initResultCallback;
    }

    public void onFailure(int i, String str) {
        if (this.f4972a != null) {
            this.f4972a.onFailure(i, str);
        }
        this.f4973b.a(false, i, str);
    }

    public void onSuccess() {
        if (this.f4972a != null) {
            this.f4972a.onSuccess();
        }
        this.f4973b.a(true, ResultCode.SUCCESS.code, (String) null);
    }
}
