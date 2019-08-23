package com.bytedance.android.livesdk;

import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bc implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9130a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentD f9131b;

    bc(StartLiveFragmentD startLiveFragmentD) {
        this.f9131b = startLiveFragmentD;
    }

    public final void onDismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f9130a, false, 2851, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9130a, false, 2851, new Class[0], Void.TYPE);
            return;
        }
        this.f9131b.b(0);
    }
}
