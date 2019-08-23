package com.bytedance.android.livesdk.browser.fragment;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ae;
import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9374a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBrowserFragment f9375b;

    c(TTLiveBrowserFragment tTLiveBrowserFragment) {
        this.f9375b = tTLiveBrowserFragment;
    }

    public final com.bytedance.ies.f.b.c a() {
        if (PatchProxy.isSupport(new Object[0], this, f9374a, false, 3537, new Class[0], com.bytedance.ies.f.b.c.class)) {
            return (com.bytedance.ies.f.b.c) PatchProxy.accessDispatch(new Object[0], this, f9374a, false, 3537, new Class[0], com.bytedance.ies.f.b.c.class);
        }
        TTLiveBrowserFragment tTLiveBrowserFragment = this.f9375b;
        tTLiveBrowserFragment.F = new ae(tTLiveBrowserFragment);
        return tTLiveBrowserFragment.F;
    }
}
