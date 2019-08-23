package com.ss.android.ugc.aweme.profile.ui.header;

import android.content.DialogInterface;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ad implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62836a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f62837b;

    /* renamed from: c  reason: collision with root package name */
    private final View f62838c;

    ad(aa aaVar, View view) {
        this.f62837b = aaVar;
        this.f62838c = view;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62836a, false, 69589, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62836a, false, 69589, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f62837b.m(this.f62838c);
    }
}
