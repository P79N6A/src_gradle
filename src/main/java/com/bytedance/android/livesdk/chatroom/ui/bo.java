package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.widget.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class bo implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11947a;

    /* renamed from: b  reason: collision with root package name */
    private final bn f11948b;

    bo(bn bnVar) {
        this.f11948b = bnVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CompoundButton compoundButton2 = compoundButton;
        if (PatchProxy.isSupport(new Object[]{compoundButton2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f11947a, false, 5857, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton2, Byte.valueOf(z)}, this, f11947a, false, 5857, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        bn bnVar = this.f11948b;
        if (!z) {
            if (bnVar.f11943c.getItemCount() <= 0) {
                bnVar.a((int) C0906R.string.d4z);
                bnVar.f11942b.n();
                aa.a(bnVar.f11944d, "shutdown_connection", "connection", true);
                return;
            }
            new m.a(bnVar.getContext(), 0).c((int) C0906R.string.d7s).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new bt(bnVar)).b(1, (int) C0906R.string.cpz, (DialogInterface.OnClickListener) new bu(compoundButton2)).a(false).c();
        }
    }
}
