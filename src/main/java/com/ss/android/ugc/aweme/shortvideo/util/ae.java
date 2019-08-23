package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ae implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71091a;

    /* renamed from: b  reason: collision with root package name */
    private final ac f71092b;

    public ae(ac acVar) {
        this.f71092b = acVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f71091a, false, 81025, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f71091a, false, 81025, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71092b.a(dialogInterface2);
    }
}
