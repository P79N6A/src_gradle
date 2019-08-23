package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.widget.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class bx implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11978a;

    /* renamed from: b  reason: collision with root package name */
    private final bw f11979b;

    bx(bw bwVar) {
        this.f11979b = bwVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CompoundButton compoundButton2 = compoundButton;
        if (PatchProxy.isSupport(new Object[]{compoundButton2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f11978a, false, 5900, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton2, Byte.valueOf(z)}, this, f11978a, false, 5900, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        bw bwVar = this.f11979b;
        if (!z) {
            if (bwVar.f11974c.getItemCount() <= 0) {
                bwVar.a((int) C0906R.string.d4z);
                bwVar.f11973b.e();
                aa.a(bwVar.f11975d, "shutdown_connection", "connection", true);
                return;
            }
            new m.a(bwVar.getContext(), 0).c((int) C0906R.string.d7s).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new ca(bwVar)).b(1, (int) C0906R.string.cpz, (DialogInterface.OnClickListener) new cb(compoundButton2)).a(false).c();
        }
    }
}
