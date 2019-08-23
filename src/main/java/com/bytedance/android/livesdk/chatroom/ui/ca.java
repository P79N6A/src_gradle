package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.utils.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class ca implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11987a;

    /* renamed from: b  reason: collision with root package name */
    private final bw f11988b;

    ca(bw bwVar) {
        this.f11988b = bwVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11987a, false, 5903, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11987a, false, 5903, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bw bwVar = this.f11988b;
        dialogInterface.dismiss();
        bwVar.a((int) C0906R.string.d4z);
        bwVar.f11973b.e();
        aa.a(bwVar.f11975d, "shutdown_connection", "connection", true);
    }
}
