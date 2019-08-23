package com.bytedance.android.livesdk.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18576a;

    /* renamed from: b  reason: collision with root package name */
    private final u f18577b;

    y(u uVar) {
        this.f18577b = uVar;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f18576a, false, 14633, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f18576a, false, 14633, new Class[]{View.class}, Void.TYPE);
            return;
        }
        u uVar = this.f18577b;
        if (uVar.f18563d != null) {
            uVar.f18563d.onClick(view2);
        }
        z.a(uVar.f18564e);
    }
}
