package com.ss.android.ugc.aweme.shortvideo;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class z implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71499a;

    /* renamed from: b  reason: collision with root package name */
    private final y f71500b;

    z(y yVar) {
        this.f71500b = yVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71499a, false, 73957, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71499a, false, 73957, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        y yVar = this.f71500b;
        dialogInterface.dismiss();
        yVar.a();
    }
}
