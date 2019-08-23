package com.bytedance.sdk.account.d;

import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.a;
import java.lang.ref.WeakReference;

public final class i<T extends BaseApiResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<a<T>> f22348a;

    /* renamed from: b  reason: collision with root package name */
    public final T f22349b;

    public i(WeakReference<a<T>> weakReference, T t) {
        this.f22348a = weakReference;
        this.f22349b = t;
    }
}
