package com.ss.android.ugc.aweme.face2face.a;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43917a;

    /* renamed from: b  reason: collision with root package name */
    private final i f43918b;

    e(i iVar) {
        this.f43918b = iVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f43917a, false, 39159, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f43917a, false, 39159, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f43918b.a();
    }
}
