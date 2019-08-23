package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import java.util.concurrent.Callable;

public final /* synthetic */ class InviteContactFriendsModel$InvitedContactCacher$$Lambda$1 implements Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final InviteContactFriendsModel.InvitedContactCacher arg$1;

    InviteContactFriendsModel$InvitedContactCacher$$Lambda$1(InviteContactFriendsModel.InvitedContactCacher invitedContactCacher) {
        this.arg$1 = invitedContactCacher;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46637, new Class[0], Object.class)) {
            return this.arg$1.lambda$null$0$InviteContactFriendsModel$InvitedContactCacher();
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46637, new Class[0], Object.class);
    }
}
