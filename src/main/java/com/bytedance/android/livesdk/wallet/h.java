package com.bytedance.android.livesdk.wallet;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18117a;

    /* renamed from: b  reason: collision with root package name */
    private final g f18118b;

    h(g gVar) {
        this.f18118b = gVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f18117a, false, 13937, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f18117a, false, 13937, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f18118b.h();
    }
}
