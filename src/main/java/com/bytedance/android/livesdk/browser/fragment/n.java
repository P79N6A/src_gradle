package com.bytedance.android.livesdk.browser.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9395a;

    /* renamed from: b  reason: collision with root package name */
    private final WebDialogFragment f9396b;

    n(WebDialogFragment webDialogFragment) {
        this.f9396b = webDialogFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f9395a, false, 3592, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9395a, false, 3592, new Class[]{View.class}, Void.TYPE);
            return;
        }
        WebDialogFragment webDialogFragment = this.f9396b;
        if (webDialogFragment.q != null) {
            webDialogFragment.q.b();
        }
    }
}
