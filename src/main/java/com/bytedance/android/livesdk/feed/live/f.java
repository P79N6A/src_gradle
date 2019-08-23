package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14265a;

    /* renamed from: b  reason: collision with root package name */
    private final PopupWindow f14266b;

    f(PopupWindow popupWindow) {
        this.f14266b = popupWindow;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14265a, false, 8724, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14265a, false, 8724, new Class[]{View.class}, Void.TYPE);
            return;
        }
        j.a(this.f14266b);
    }
}
