package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10933a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractPKInviteFragment f10934b;

    b(InteractPKInviteFragment interactPKInviteFragment) {
        this.f10934b = interactPKInviteFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10933a, false, 4507, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10933a, false, 4507, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f10934b.b();
    }
}
