package com.bytedance.android.livesdk.browser.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9376a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBrowserFragment f9377b;

    d(TTLiveBrowserFragment tTLiveBrowserFragment) {
        this.f9377b = tTLiveBrowserFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9376a, false, 3538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9376a, false, 3538, new Class[0], Void.TYPE);
            return;
        }
        TTLiveBrowserFragment tTLiveBrowserFragment = this.f9377b;
        if (PatchProxy.isSupport(new Object[0], tTLiveBrowserFragment, TTLiveBrowserFragment.f9357a, false, 3508, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], tTLiveBrowserFragment, TTLiveBrowserFragment.f9357a, false, 3508, new Class[0], Void.TYPE);
            return;
        }
        tTLiveBrowserFragment.K = false;
        if (tTLiveBrowserFragment.z != null && tTLiveBrowserFragment.z.getVisibility() == 0) {
            tTLiveBrowserFragment.z.setVisibility(8);
        }
    }
}
