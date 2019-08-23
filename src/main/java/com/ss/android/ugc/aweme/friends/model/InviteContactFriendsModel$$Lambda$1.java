package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class InviteContactFriendsModel$$Lambda$1 implements Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final InviteContactFriendsModel arg$1;
    private final AtomicReference arg$2;

    InviteContactFriendsModel$$Lambda$1(InviteContactFriendsModel inviteContactFriendsModel, AtomicReference atomicReference) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = atomicReference;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46621, new Class[0], Object.class)) {
            return this.arg$1.lambda$uploadContacts$1$InviteContactFriendsModel(this.arg$2);
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46621, new Class[0], Object.class);
    }
}
