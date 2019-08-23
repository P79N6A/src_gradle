package com.ss.android.ugc.aweme.feed.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.ar;

public final /* synthetic */ class ax implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46532a;

    /* renamed from: b  reason: collision with root package name */
    private final PrivateDialog f46533b;

    ax(PrivateDialog privateDialog) {
        this.f46533b = privateDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46532a, false, 42948, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46532a, false, 42948, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        PrivateDialog privateDialog = this.f46533b;
        if (PatchProxy.isSupport(new Object[]{2}, privateDialog, PrivateDialog.f46233a, false, 42929, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PrivateDialog privateDialog2 = privateDialog;
            PatchProxy.accessDispatch(new Object[]{2}, privateDialog2, PrivateDialog.f46233a, false, 42929, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (privateDialog.f46234b != null) {
            privateDialog.f46234b.a(new ar(2, privateDialog.f46235c));
        }
        if (privateDialog.f46238f != null && !privateDialog.f46238f.isFinishing()) {
            privateDialog.dismiss();
        }
    }
}
