package com.bytedance.android.livesdk.browser.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9378a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBrowserFragment f9379b;

    e(TTLiveBrowserFragment tTLiveBrowserFragment) {
        this.f9379b = tTLiveBrowserFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f9378a, false, 3539, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9378a, false, 3539, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f9379b.h();
    }
}
