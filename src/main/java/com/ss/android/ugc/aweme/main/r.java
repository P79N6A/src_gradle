package com.ss.android.ugc.aweme.main;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class r implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54887a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f54888b;

    r(MainActivity mainActivity) {
        this.f54888b = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f54887a, false, 57225, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f54887a, false, 57225, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f54888b.cancelRestoreDialog(dialogInterface2);
    }
}
