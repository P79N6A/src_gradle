package com.bytedance.android.livesdk.module;

import android.support.annotation.Keep;
import com.bytedance.android.live.b.a;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class BrowserService implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public BrowserService() {
        b.a(a.class, this);
    }

    public com.bytedance.android.livesdk.browser.c.b webViewManager() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12499, new Class[0], com.bytedance.android.livesdk.browser.c.b.class)) {
            return j.q().f();
        }
        return (com.bytedance.android.livesdk.browser.c.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12499, new Class[0], com.bytedance.android.livesdk.browser.c.b.class);
    }
}
