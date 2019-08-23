package com.bytedance.sdk.account.api.call;

import com.bytedance.sdk.account.f.a.f;

public class c<T extends f> extends BaseApiResponse {

    /* renamed from: a  reason: collision with root package name */
    public T f22251a;

    public c(boolean z, int i, T t) {
        super(z, i);
        this.f22251a = t;
        this.error = t.g;
        this.errorMsg = t.h;
    }
}
