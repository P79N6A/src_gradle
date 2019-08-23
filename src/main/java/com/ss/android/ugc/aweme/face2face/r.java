package com.ss.android.ugc.aweme.face2face;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class r implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43975a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FacePermissionActivity f43976b;

    r(Face2FacePermissionActivity face2FacePermissionActivity) {
        this.f43976b = face2FacePermissionActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f43975a, false, 39125, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f43975a, false, 39125, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f43976b.finish();
    }
}
