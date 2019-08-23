package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class ThirdPartyFriendModel$$Lambda$3 implements Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ThirdPartyFriendModel arg$1;

    ThirdPartyFriendModel$$Lambda$3(ThirdPartyFriendModel thirdPartyFriendModel) {
        this.arg$1 = thirdPartyFriendModel;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46663, new Class[0], Object.class)) {
            return this.arg$1.lambda$uploadContacts$4$ThirdPartyFriendModel();
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46663, new Class[0], Object.class);
    }
}
