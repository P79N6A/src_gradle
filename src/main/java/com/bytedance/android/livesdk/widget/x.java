package com.bytedance.android.livesdk.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18574a;

    /* renamed from: b  reason: collision with root package name */
    private final u f18575b;

    x(u uVar) {
        this.f18575b = uVar;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f18574a, false, 14632, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f18574a, false, 14632, new Class[]{View.class}, Void.TYPE);
            return;
        }
        u uVar = this.f18575b;
        if (uVar.f18562c != null) {
            uVar.f18562c.onClick(view2);
        }
        z.a(uVar.f18564e);
    }
}
