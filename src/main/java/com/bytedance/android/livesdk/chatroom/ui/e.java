package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.j.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12126a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f12127b;

    e(AbsInteractionFragment absInteractionFragment) {
        this.f12127b = absInteractionFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12126a, false, 5559, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12126a, false, 5559, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        f.a((Context) this.f12127b.getActivity()).a("live_anchor_popup", "click", 0, 0);
        dialogInterface.dismiss();
    }
}
