package com.bytedance.android.livesdk.chatroom.interact;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10927a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkDialog f10928b;

    f(LinkDialog linkDialog) {
        this.f10928b = linkDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10927a, false, 4336, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10927a, false, 4336, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f10928b.a();
    }
}
