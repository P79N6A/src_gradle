package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ap implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12984a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkControlWidget f12985b;

    ap(LinkControlWidget linkControlWidget) {
        this.f12985b = linkControlWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12984a, false, 6960, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12984a, false, 6960, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinkControlWidget linkControlWidget = this.f12985b;
        dialogInterface.dismiss();
        if (linkControlWidget.isViewValid()) {
            linkControlWidget.f12581f.a(0);
        }
    }
}
