package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.utils.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class bt implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11958a;

    /* renamed from: b  reason: collision with root package name */
    private final bn f11959b;

    bt(bn bnVar) {
        this.f11959b = bnVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11958a, false, 5862, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11958a, false, 5862, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bn bnVar = this.f11959b;
        dialogInterface.dismiss();
        bnVar.a((int) C0906R.string.d4z);
        bnVar.f11942b.n();
        aa.a(bnVar.f11944d, "shutdown_connection", "connection", true);
    }
}
