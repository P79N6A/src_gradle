package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10943a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractPKTimeFragment f10944b;

    g(InteractPKTimeFragment interactPKTimeFragment) {
        this.f10944b = interactPKTimeFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10943a, false, 4562, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10943a, false, 4562, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f10944b.b();
    }
}
