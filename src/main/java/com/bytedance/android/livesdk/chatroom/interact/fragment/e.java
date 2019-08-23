package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10939a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractPKMatchInviteFragment f10940b;

    e(InteractPKMatchInviteFragment interactPKMatchInviteFragment) {
        this.f10940b = interactPKMatchInviteFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10939a, false, 4541, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10939a, false, 4541, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f10940b.b();
    }
}
