package com.ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.client.Client;
import com.bytedance.ttnet.retrofit.SsRetrofitClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class t implements Client.Provider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33907a;

    public final Client get() {
        if (!PatchProxy.isSupport(new Object[0], this, f33907a, false, 23155, new Class[0], Client.class)) {
            return new SsRetrofitClient();
        }
        return (Client) PatchProxy.accessDispatch(new Object[0], this, f33907a, false, 23155, new Class[0], Client.class);
    }
}
