package com.bytedance.android.livesdk.browser.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9399a;

    /* renamed from: b  reason: collision with root package name */
    private final WebDialogFragment f9400b;

    p(WebDialogFragment webDialogFragment) {
        this.f9400b = webDialogFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f9399a, false, 3594, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9399a, false, 3594, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f9400b.dismiss();
    }
}
