package com.ss.android.ugc.aweme.share.invitefriends.response;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65154a;

    /* renamed from: b  reason: collision with root package name */
    private final InviteFriendResponseDialog f65155b;

    b(InviteFriendResponseDialog inviteFriendResponseDialog) {
        this.f65155b = inviteFriendResponseDialog;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f65154a, false, 73570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65154a, false, 73570, new Class[0], Void.TYPE);
            return;
        }
        this.f65155b.dismiss();
    }
}
