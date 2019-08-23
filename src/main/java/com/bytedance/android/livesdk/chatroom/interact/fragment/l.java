package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10953a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractPKUserListFragment f10954b;

    l(InteractPKUserListFragment interactPKUserListFragment) {
        this.f10954b = interactPKUserListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10953a, false, 4591, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10953a, false, 4591, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f10954b.b();
    }
}
