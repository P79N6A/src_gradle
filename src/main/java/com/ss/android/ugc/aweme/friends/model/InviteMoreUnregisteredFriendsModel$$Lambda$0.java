package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class InviteMoreUnregisteredFriendsModel$$Lambda$0 implements g {
    static final g $instance = new InviteMoreUnregisteredFriendsModel$$Lambda$0();
    public static ChangeQuickRedirect changeQuickRedirect;

    private InviteMoreUnregisteredFriendsModel$$Lambda$0() {
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 46642, new Class[]{i.class}, Object.class)) {
            return InviteMoreUnregisteredFriendsModel.lambda$fetchList$0$InviteMoreUnregisteredFriendsModel(iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 46642, new Class[]{i.class}, Object.class);
    }
}
