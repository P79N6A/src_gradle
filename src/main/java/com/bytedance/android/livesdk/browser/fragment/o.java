package com.bytedance.android.livesdk.browser.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9397a;

    /* renamed from: b  reason: collision with root package name */
    private final WebDialogFragment f9398b;

    o(WebDialogFragment webDialogFragment) {
        this.f9398b = webDialogFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9397a, false, 3593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9397a, false, 3593, new Class[0], Void.TYPE);
            return;
        }
        WebDialogFragment webDialogFragment = this.f9398b;
        if (webDialogFragment.j != 0) {
            webDialogFragment.a(webDialogFragment.j);
        } else {
            webDialogFragment.a(webDialogFragment.k, webDialogFragment.l, webDialogFragment.n, webDialogFragment.m);
        }
    }
}
