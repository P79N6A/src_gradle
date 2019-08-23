package com.bytedance.android.livesdk;

import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ad implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8901a;

    /* renamed from: b  reason: collision with root package name */
    private final PopupWindow f8902b;

    ad(PopupWindow popupWindow) {
        this.f8902b = popupWindow;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f8901a, false, 2721, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f8901a, false, 2721, new Class[]{View.class}, Void.TYPE);
            return;
        }
        al.a(this.f8902b);
    }
}
