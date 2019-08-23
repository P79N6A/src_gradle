package com.bytedance.android.live.core.setting;

import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8160a;

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f8161b;

    c(LinearLayout linearLayout) {
        this.f8161b = linearLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f8160a, false, 885, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f8160a, false, 885, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LinearLayout linearLayout = this.f8161b;
        if (linearLayout.getVisibility() == 0) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }
}
