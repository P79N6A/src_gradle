package com.ss.android.ugc.aweme.feed.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.bi;

public final /* synthetic */ class u implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46933a;

    /* renamed from: b  reason: collision with root package name */
    private final p f46934b;

    u(p pVar) {
        this.f46934b = pVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46933a, false, 42707, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46933a, false, 42707, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bi.a(this.f46934b.f46810b);
    }
}
