package com.ss.android.ugc.aweme.face2face;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class q implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43973a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FacePermissionActivity f43974b;

    q(Face2FacePermissionActivity face2FacePermissionActivity) {
        this.f43974b = face2FacePermissionActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43973a, false, 39124, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43973a, false, 39124, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f43974b.finish();
    }
}
