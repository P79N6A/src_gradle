package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ContactFriendModel$$Lambda$1 implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ContactFriendModel arg$1;

    ContactFriendModel$$Lambda$1(ContactFriendModel contactFriendModel) {
        this.arg$1 = contactFriendModel;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, changeQuickRedirect, false, 46594, new Class[]{i.class}, Object.class)) {
            return this.arg$1.lambda$fetchList$1$ContactFriendModel(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, changeQuickRedirect, false, 46594, new Class[]{i.class}, Object.class);
    }
}
