package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10931a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractButtonFragment f10932b;

    a(InteractButtonFragment interactButtonFragment) {
        this.f10932b = interactButtonFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10931a, false, 4496, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10931a, false, 4496, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f10932b.i();
    }
}
