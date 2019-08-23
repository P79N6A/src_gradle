package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ContactFriendWithUnregisteredUserModel$$Lambda$1 implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ContactFriendWithUnregisteredUserModel arg$1;

    ContactFriendWithUnregisteredUserModel$$Lambda$1(ContactFriendWithUnregisteredUserModel contactFriendWithUnregisteredUserModel) {
        this.arg$1 = contactFriendWithUnregisteredUserModel;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, changeQuickRedirect, false, 46599, new Class[]{i.class}, Object.class)) {
            return this.arg$1.lambda$fetchList$1$ContactFriendWithUnregisteredUserModel(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, changeQuickRedirect, false, 46599, new Class[]{i.class}, Object.class);
    }
}
