package com.bytedance.android.livesdk.wallet;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17978a;

    /* renamed from: b  reason: collision with root package name */
    private final b f17979b;

    c(b bVar) {
        this.f17979b = bVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17978a, false, 13882, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17978a, false, 13882, new Class[]{View.class}, Void.TYPE);
            return;
        }
        b bVar = this.f17979b;
        if (bVar.s != null) {
            bVar.s.a(bVar, bVar.h.isChecked());
        }
    }
}
