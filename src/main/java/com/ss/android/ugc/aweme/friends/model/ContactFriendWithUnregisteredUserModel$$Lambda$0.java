package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ContactFriendWithUnregisteredUserModel$$Lambda$0 implements g {
    static final g $instance = new ContactFriendWithUnregisteredUserModel$$Lambda$0();
    public static ChangeQuickRedirect changeQuickRedirect;

    private ContactFriendWithUnregisteredUserModel$$Lambda$0() {
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 46598, new Class[]{i.class}, Object.class)) {
            return ContactFriendWithUnregisteredUserModel.lambda$fetchList$0$ContactFriendWithUnregisteredUserModel(iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 46598, new Class[]{i.class}, Object.class);
    }
}
