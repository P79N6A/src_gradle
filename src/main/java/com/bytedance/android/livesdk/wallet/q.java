package com.bytedance.android.livesdk.wallet;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18140a;

    /* renamed from: b  reason: collision with root package name */
    private final p f18141b;

    q(p pVar) {
        this.f18141b = pVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f18140a, false, 13978, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f18140a, false, 13978, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f18141b.f();
    }
}
