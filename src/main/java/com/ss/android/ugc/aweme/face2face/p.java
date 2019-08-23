package com.ss.android.ugc.aweme.face2face;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.bi;

public final /* synthetic */ class p implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43971a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FacePermissionActivity f43972b;

    p(Face2FacePermissionActivity face2FacePermissionActivity) {
        this.f43972b = face2FacePermissionActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43971a, false, 39123, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43971a, false, 39123, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Face2FacePermissionActivity face2FacePermissionActivity = this.f43972b;
        bi.a(face2FacePermissionActivity);
        face2FacePermissionActivity.finish();
    }
}
