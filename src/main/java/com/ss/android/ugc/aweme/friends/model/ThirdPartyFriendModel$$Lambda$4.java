package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ThirdPartyFriendModel$$Lambda$4 implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ThirdPartyFriendModel arg$1;

    ThirdPartyFriendModel$$Lambda$4(ThirdPartyFriendModel thirdPartyFriendModel) {
        this.arg$1 = thirdPartyFriendModel;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, changeQuickRedirect, false, 46664, new Class[]{i.class}, Object.class)) {
            return this.arg$1.lambda$uploadContacts$5$ThirdPartyFriendModel(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, changeQuickRedirect, false, 46664, new Class[]{i.class}, Object.class);
    }
}