package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ILocationService;

public final /* synthetic */ class LocationService$$Lambda$0 implements DialogInterface.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Activity arg$1;
    private final ILocationService.OnPermissionListener arg$2;

    LocationService$$Lambda$0(Activity activity, ILocationService.OnPermissionListener onPermissionListener) {
        this.arg$1 = activity;
        this.arg$2 = onPermissionListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71396, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71396, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LocationService.lambda$showNearByLocationDialog$0$LocationService(this.arg$1, this.arg$2, dialogInterface, i);
    }
}
