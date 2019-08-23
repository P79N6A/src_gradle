package com.ss.android.ugc.aweme.services;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ILocationService;

public final /* synthetic */ class LocationService$$Lambda$1 implements DialogInterface.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ILocationService.OnPermissionListener arg$1;

    LocationService$$Lambda$1(ILocationService.OnPermissionListener onPermissionListener) {
        this.arg$1 = onPermissionListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71397, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71397, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LocationService.lambda$showNearByLocationDialog$1$LocationService(this.arg$1, dialogInterface2, i);
    }
}
