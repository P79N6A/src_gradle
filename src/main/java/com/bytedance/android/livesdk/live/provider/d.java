package com.bytedance.android.livesdk.live.provider;

import com.bytedance.retrofit2.client.Client;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Client.Provider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15887a;

    /* renamed from: b  reason: collision with root package name */
    private final Client f15888b;

    d(Client client) {
        this.f15888b = client;
    }

    public final Client get() {
        if (!PatchProxy.isSupport(new Object[0], this, f15887a, false, 10368, new Class[0], Client.class)) {
            return this.f15888b;
        }
        return (Client) PatchProxy.accessDispatch(new Object[0], this, f15887a, false, 10368, new Class[0], Client.class);
    }
}
