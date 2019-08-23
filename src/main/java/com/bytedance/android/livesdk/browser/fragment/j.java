package com.bytedance.android.livesdk.browser.fragment;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ad;
import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9388a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBrowserFragment f9389b;

    j(TTLiveBrowserFragment tTLiveBrowserFragment) {
        this.f9389b = tTLiveBrowserFragment;
    }

    public final c a() {
        if (PatchProxy.isSupport(new Object[0], this, f9388a, false, 3545, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f9388a, false, 3545, new Class[0], c.class);
        }
        TTLiveBrowserFragment tTLiveBrowserFragment = this.f9389b;
        tTLiveBrowserFragment.E = new ad(tTLiveBrowserFragment);
        return tTLiveBrowserFragment.E;
    }
}
