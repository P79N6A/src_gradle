package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;

public final /* synthetic */ class InviteContactFriendsModel$InvitedContactCacher$$Lambda$0 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final InviteContactFriendsModel.InvitedContactCacher arg$1;

    InviteContactFriendsModel$InvitedContactCacher$$Lambda$0(InviteContactFriendsModel.InvitedContactCacher invitedContactCacher) {
        this.arg$1 = invitedContactCacher;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46636, new Class[0], Void.TYPE);
            return;
        }
        this.arg$1.lambda$new$1$InviteContactFriendsModel$InvitedContactCacher();
    }
}
