package com.bytedance.android.livesdk.rank;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17002a;

    /* renamed from: b  reason: collision with root package name */
    private final g f17003b;

    h(g gVar) {
        this.f17003b = gVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17002a, false, 12964, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17002a, false, 12964, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f17003b.dismiss();
    }
}
