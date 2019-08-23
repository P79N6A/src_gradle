package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;

public final /* synthetic */ class InviteContactFriendsModel$$Lambda$8 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean arg$1;
    private final InviteContactFriendsModel.InviteFriendsCallback arg$2;
    private final String arg$3;

    InviteContactFriendsModel$$Lambda$8(boolean z, InviteContactFriendsModel.InviteFriendsCallback inviteFriendsCallback, String str) {
        this.arg$1 = z;
        this.arg$2 = inviteFriendsCallback;
        this.arg$3 = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46628, new Class[0], Void.TYPE);
            return;
        }
        InviteContactFriendsModel.lambda$null$5$InviteContactFriendsModel(this.arg$1, this.arg$2, this.arg$3);
    }
}
