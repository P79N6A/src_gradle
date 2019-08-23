package com.bytedance.android.livesdk;

import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class af implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9003a;

    /* renamed from: b  reason: collision with root package name */
    private final PopupWindow f9004b;

    af(PopupWindow popupWindow) {
        this.f9004b = popupWindow;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f9003a, false, 2724, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9003a, false, 2724, new Class[]{View.class}, Void.TYPE);
            return;
        }
        al.a(this.f9004b);
    }
}
