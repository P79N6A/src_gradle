package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14261a;

    /* renamed from: b  reason: collision with root package name */
    private final PopupWindow f14262b;

    d(PopupWindow popupWindow) {
        this.f14262b = popupWindow;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14261a, false, 8721, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14261a, false, 8721, new Class[]{View.class}, Void.TYPE);
            return;
        }
        j.a(this.f14262b);
    }
}
