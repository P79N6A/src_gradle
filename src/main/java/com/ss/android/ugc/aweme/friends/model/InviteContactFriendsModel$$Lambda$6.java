package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import java.util.concurrent.Callable;

public final /* synthetic */ class InviteContactFriendsModel$$Lambda$6 implements Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final InviteContactFriendsModel arg$1;
    private final InviteContactFriendsModel.IFetchShareConfigCallback arg$2;

    InviteContactFriendsModel$$Lambda$6(InviteContactFriendsModel inviteContactFriendsModel, InviteContactFriendsModel.IFetchShareConfigCallback iFetchShareConfigCallback) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = iFetchShareConfigCallback;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46626, new Class[0], Object.class)) {
            return this.arg$1.lambda$fetchShareConfig$8$InviteContactFriendsModel(this.arg$2);
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46626, new Class[0], Object.class);
    }
}
