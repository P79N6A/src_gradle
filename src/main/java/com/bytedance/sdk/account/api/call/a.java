package com.bytedance.sdk.account.api.call;

import com.bytedance.sdk.account.api.call.BaseApiResponse;

public abstract class a<T extends BaseApiResponse> extends com.bytedance.sdk.account.d.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22249a;

    public abstract void a(T t);

    public final void a() {
        this.f22249a = true;
        if (this.f22331b != null) {
            this.f22331b.c();
        }
    }
}
