package com.bytedance.android.livesdk.wallet;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18163a;

    /* renamed from: b  reason: collision with root package name */
    private final v f18164b;

    w(v vVar) {
        this.f18164b = vVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f18163a, false, 14001, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f18163a, false, 14001, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f18164b.j();
    }
}
