package com.ss.android.ugc.aweme.feed.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class v implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46935a;

    /* renamed from: b  reason: collision with root package name */
    private final p f46936b;

    v(p pVar) {
        this.f46936b = pVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46935a, false, 42708, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46935a, false, 42708, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        p pVar = this.f46936b;
        pVar.a(2);
        if (pVar.f46810b != null && !pVar.f46810b.isFinishing()) {
            dialogInterface.dismiss();
        }
    }
}
