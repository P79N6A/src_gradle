package com.bytedance.android.livesdk.feed.network;

import com.bytedance.retrofit2.client.Client;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Client.Provider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14320a;

    /* renamed from: b  reason: collision with root package name */
    private final Client f14321b;

    h(Client client) {
        this.f14321b = client;
    }

    public final Client get() {
        if (!PatchProxy.isSupport(new Object[0], this, f14320a, false, 8802, new Class[0], Client.class)) {
            return this.f14321b;
        }
        return (Client) PatchProxy.accessDispatch(new Object[0], this, f14320a, false, 8802, new Class[0], Client.class);
    }
}
