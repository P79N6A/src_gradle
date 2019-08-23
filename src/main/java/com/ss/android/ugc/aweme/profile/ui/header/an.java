package com.ss.android.ugc.aweme.profile.ui.header;

import android.content.DialogInterface;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class an implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62864a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f62865b;

    /* renamed from: c  reason: collision with root package name */
    private final View f62866c;

    an(aa aaVar, View view) {
        this.f62865b = aaVar;
        this.f62866c = view;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62864a, false, 69600, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62864a, false, 69600, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f62865b.n(this.f62866c);
    }
}
