package com.ss.android.ugc.aweme.live.livehostimpl;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class r implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53476a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f53477b = new r();

    private r() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53476a, false, 55829, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53476a, false, 55829, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
