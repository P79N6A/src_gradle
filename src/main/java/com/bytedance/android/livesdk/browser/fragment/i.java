package com.bytedance.android.livesdk.browser.fragment;

import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9386a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBrowserFragment f9387b;

    i(TTLiveBrowserFragment tTLiveBrowserFragment) {
        this.f9387b = tTLiveBrowserFragment;
    }

    public final c a() {
        if (!PatchProxy.isSupport(new Object[0], this, f9386a, false, 3544, new Class[0], c.class)) {
            return this.f9387b.A;
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f9386a, false, 3544, new Class[0], c.class);
    }
}
