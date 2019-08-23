package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class InviteContactFriendsModel$$Lambda$2 implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final InviteContactFriendsModel arg$1;
    private final AtomicReference arg$2;

    InviteContactFriendsModel$$Lambda$2(InviteContactFriendsModel inviteContactFriendsModel, AtomicReference atomicReference) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = atomicReference;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 46622, new Class[]{i.class}, Object.class)) {
            return this.arg$1.lambda$uploadContacts$2$InviteContactFriendsModel(this.arg$2, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 46622, new Class[]{i.class}, Object.class);
    }
}
