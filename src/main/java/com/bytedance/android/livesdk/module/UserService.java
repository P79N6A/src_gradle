package com.bytedance.android.livesdk.module;

import android.support.annotation.Keep;
import com.bytedance.android.live.e.a;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class UserService implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public UserService() {
        b.a(a.class, this);
    }

    public e user() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12519, new Class[0], e.class)) {
            return TTLiveSDKContext.getHostService().k();
        }
        return (e) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12519, new Class[0], e.class);
    }
}
