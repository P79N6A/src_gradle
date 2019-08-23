package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.SsResponse;

@Deprecated
public final class d extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final transient SsResponse<?> f21952a;
    private final int code;

    public final int code() {
        return this.code;
    }

    public final SsResponse<?> response() {
        return this.f21952a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(SsResponse<?> ssResponse) {
        super("HTTP " + ssResponse.code());
        if (ssResponse != null) {
            this.code = ssResponse.code();
            this.f21952a = ssResponse;
            return;
        }
        throw new NullPointerException("response == null");
    }
}
