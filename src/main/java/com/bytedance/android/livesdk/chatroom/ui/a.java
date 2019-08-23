package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11802a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f11803b;

    a(AbsInteractionFragment absInteractionFragment) {
        this.f11803b = absInteractionFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11802a, false, 5555, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11802a, false, 5555, new Class[]{View.class}, Void.TYPE);
            return;
        }
        AbsInteractionFragment absInteractionFragment = this.f11803b;
        if (view.getId() == C0906R.id.ti) {
            if (PatchProxy.isSupport(new Object[0], absInteractionFragment, AbsInteractionFragment.f11424a, false, 5512, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], absInteractionFragment, AbsInteractionFragment.f11424a, false, 5512, new Class[0], Void.TYPE);
                return;
            }
            absInteractionFragment.a(6);
        }
    }
}
