package com.ss.android.ugc.aweme.hotsearch.share;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49834a;

    /* renamed from: b  reason: collision with root package name */
    private final g f49835b;

    h(g gVar) {
        this.f49835b = gVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f49834a, false, 49781, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f49834a, false, 49781, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        g gVar = this.f49835b;
        if (gVar.f49833f != null) {
            gVar.f49833f = null;
        }
    }
}
