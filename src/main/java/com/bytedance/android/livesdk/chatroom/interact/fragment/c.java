package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10935a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractPKMatchFragment f10936b;

    c(InteractPKMatchFragment interactPKMatchFragment) {
        this.f10936b = interactPKMatchFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10935a, false, 4528, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10935a, false, 4528, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f10936b.j();
    }
}
