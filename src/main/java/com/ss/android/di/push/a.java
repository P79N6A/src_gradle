package com.ss.android.di.push;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.awemepushapi.IPushApi;

public final class a {
    public static IPushApi a() {
        IPushApi iPushApi;
        try {
            iPushApi = (IPushApi) ServiceManager.get().getService(IPushApi.class);
        } catch (Exception unused) {
            iPushApi = null;
        }
        if (iPushApi == null) {
            return new PushServiceMock();
        }
        return iPushApi;
    }
}
