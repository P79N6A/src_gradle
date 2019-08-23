package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12301a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f12302b;

    u(AbsInteractionFragment absInteractionFragment) {
        this.f12302b = absInteractionFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12301a, false, 5575, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12301a, false, 5575, new Class[]{View.class}, Void.TYPE);
            return;
        }
        AbsInteractionFragment absInteractionFragment = this.f12302b;
        absInteractionFragment.D.d();
        if (absInteractionFragment.C != null) {
            absInteractionFragment.C.b();
        }
        absInteractionFragment.n.setVisibility(8);
    }
}
