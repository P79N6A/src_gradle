package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.b.d;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;

public final /* synthetic */ class InviteContactFriendsModel$$Lambda$7 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final InviteContactFriendsModel.IFetchShareConfigCallback arg$1;
    private final d arg$2;

    InviteContactFriendsModel$$Lambda$7(InviteContactFriendsModel.IFetchShareConfigCallback iFetchShareConfigCallback, d dVar) {
        this.arg$1 = iFetchShareConfigCallback;
        this.arg$2 = dVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46627, new Class[0], Void.TYPE);
            return;
        }
        InviteContactFriendsModel.lambda$null$7$InviteContactFriendsModel(this.arg$1, this.arg$2);
    }
}
