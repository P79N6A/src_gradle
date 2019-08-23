package com.ss.android.ugc.aweme.profile.ui.header;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ae implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62839a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f62840b;

    ae(aa aaVar) {
        this.f62840b = aaVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f62839a, false, 69590, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f62839a, false, 69590, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f62840b.a(dialogInterface2, i);
    }
}
