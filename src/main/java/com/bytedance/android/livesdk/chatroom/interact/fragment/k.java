package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10951a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractPKTypeFragment f10952b;

    k(InteractPKTypeFragment interactPKTypeFragment) {
        this.f10952b = interactPKTypeFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10951a, false, 4578, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10951a, false, 4578, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f10952b.b();
    }
}
