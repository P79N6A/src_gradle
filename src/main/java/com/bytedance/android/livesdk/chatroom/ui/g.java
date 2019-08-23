package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12259a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f12260b;

    g(AbsInteractionFragment absInteractionFragment) {
        this.f12260b = absInteractionFragment;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f12259a, false, 5561, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f12259a, false, 5561, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f12260b.a(8);
    }
}
