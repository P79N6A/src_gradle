package com.bytedance.android.livesdk.chatroom.interact;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10347a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkDialog f10348b;

    c(LinkDialog linkDialog) {
        this.f10348b = linkDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10347a, false, 4332, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10347a, false, 4332, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LinkDialog linkDialog = this.f10348b;
        if (linkDialog.l) {
            linkDialog.dismiss();
        }
    }
}
