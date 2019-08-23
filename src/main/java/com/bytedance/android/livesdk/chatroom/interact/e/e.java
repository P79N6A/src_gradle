package com.bytedance.android.livesdk.chatroom.interact.e;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.interact.e.a;
import com.bytedance.android.livesdk.utils.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10904a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AnonymousClass4 f10905b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10906c;

    e(a.AnonymousClass4 r1, boolean z) {
        this.f10905b = r1;
        this.f10906c = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f10904a, false, 5085, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f10904a, false, 5085, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.AnonymousClass4 r0 = this.f10905b;
        boolean z = this.f10906c;
        dialogInterface.dismiss();
        if (a.this.m != null) {
            a.this.m.lambda$put$1$DataCenter("cmd_interact_state_change", new q(z ? 5 : 9));
        }
        if (!z) {
            aa.a(a.this.j, "shutdown_connection", "guest_cancel", false);
        }
    }
}
