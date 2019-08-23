package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ev implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12236a;

    /* renamed from: b  reason: collision with root package name */
    private final SimpleInputDialogFragment f12237b;

    ev(SimpleInputDialogFragment simpleInputDialogFragment) {
        this.f12237b = simpleInputDialogFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12236a, false, 6436, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12236a, false, 6436, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f12237b.d();
    }
}
