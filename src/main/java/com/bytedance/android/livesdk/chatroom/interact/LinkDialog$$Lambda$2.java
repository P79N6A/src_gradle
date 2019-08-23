package com.bytedance.android.livesdk.chatroom.interact;

import android.support.v4.app.FragmentManager;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class LinkDialog$$Lambda$2 implements FragmentManager.OnBackStackChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10235a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkDialog f10236b;

    LinkDialog$$Lambda$2(LinkDialog linkDialog) {
        this.f10236b = linkDialog;
    }

    public final void onBackStackChanged() {
        InteractDialogFragmentBaseContract.View peek;
        if (PatchProxy.isSupport(new Object[0], this, f10235a, false, 4333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10235a, false, 4333, new Class[0], Void.TYPE);
            return;
        }
        LinkDialog linkDialog = this.f10236b;
        if (PatchProxy.isSupport(new Object[0], linkDialog, LinkDialog.f10229a, false, 4321, new Class[0], InteractDialogFragmentBaseContract.View.class)) {
            peek = (InteractDialogFragmentBaseContract.View) PatchProxy.accessDispatch(new Object[0], linkDialog, LinkDialog.f10229a, false, 4321, new Class[0], InteractDialogFragmentBaseContract.View.class);
        } else {
            peek = linkDialog.i.empty() ? null : linkDialog.i.peek();
        }
        InteractDialogFragmentBaseContract.View view = peek;
        if (PatchProxy.isSupport(new Object[]{view}, linkDialog, LinkDialog.f10229a, false, 4326, new Class[]{InteractDialogFragmentBaseContract.View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, linkDialog, LinkDialog.f10229a, false, 4326, new Class[]{InteractDialogFragmentBaseContract.View.class}, Void.TYPE);
        } else if (linkDialog.getDialog() != null && view != null && view.b_()) {
            linkDialog.f10234f.setText(view.c());
            linkDialog.f10232d.removeAllViews();
            linkDialog.f10233e.removeAllViews();
            if (view.e() != null) {
                linkDialog.f10232d.addView(view.e());
            }
            if (view.f() != null) {
                linkDialog.f10233e.addView(view.f());
            }
        }
    }
}
