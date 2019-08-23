package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10878a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkDialog f10879b;

    /* renamed from: c  reason: collision with root package name */
    private final InteractDialogFragmentBaseContract.View f10880c;

    e(LinkDialog linkDialog, InteractDialogFragmentBaseContract.View view) {
        this.f10879b = linkDialog;
        this.f10880c = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f10878a, false, 4335, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10878a, false, 4335, new Class[0], Void.TYPE);
            return;
        }
        LinkDialog linkDialog = this.f10879b;
        InteractDialogFragmentBaseContract.View view = this.f10880c;
        if (linkDialog.i.isEmpty() || !linkDialog.i.peek().f10828c.equals(view.f10828c)) {
            linkDialog.b(view);
        }
    }
}
