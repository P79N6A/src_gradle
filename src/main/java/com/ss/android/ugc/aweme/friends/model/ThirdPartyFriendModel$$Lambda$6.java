package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ThirdPartyFriendModel$$Lambda$6 implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ThirdPartyFriendModel arg$1;
    private final i arg$2;

    ThirdPartyFriendModel$$Lambda$6(ThirdPartyFriendModel thirdPartyFriendModel, i iVar) {
        this.arg$1 = thirdPartyFriendModel;
        this.arg$2 = iVar;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 46667, new Class[]{i.class}, Object.class)) {
            return this.arg$1.lambda$null$0$ThirdPartyFriendModel(this.arg$2, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 46667, new Class[]{i.class}, Object.class);
    }
}
