package com.ss.android.ugc.aweme.face2face;

import android.content.DialogInterface;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43969a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FacePermissionActivity f43970b;

    o(Face2FacePermissionActivity face2FacePermissionActivity) {
        this.f43970b = face2FacePermissionActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43969a, false, 39122, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43969a, false, 39122, new Class[0], Void.TYPE);
            return;
        }
        Face2FacePermissionActivity face2FacePermissionActivity = this.f43970b;
        new a.C0185a(face2FacePermissionActivity).a((int) C0906R.string.ad5).b((int) C0906R.string.ad3).a((int) C0906R.string.ad2, (DialogInterface.OnClickListener) new p(face2FacePermissionActivity)).b((int) C0906R.string.ad4, (DialogInterface.OnClickListener) new q(face2FacePermissionActivity)).a().a().setOnCancelListener(new r(face2FacePermissionActivity));
    }
}
