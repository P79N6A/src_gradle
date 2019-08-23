package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class InviteContactFriendsModel$$Lambda$5 implements Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final InviteContactFriendsModel arg$1;
    private final List arg$2;
    private final String arg$3;
    private final String arg$4;
    private final InviteContactFriendsModel.InviteFriendsCallback arg$5;

    InviteContactFriendsModel$$Lambda$5(InviteContactFriendsModel inviteContactFriendsModel, List list, String str, String str2, InviteContactFriendsModel.InviteFriendsCallback inviteFriendsCallback) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = list;
        this.arg$3 = str;
        this.arg$4 = str2;
        this.arg$5 = inviteFriendsCallback;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46625, new Class[0], Object.class)) {
            return this.arg$1.lambda$inviteFriends$6$InviteContactFriendsModel(this.arg$2, this.arg$3, this.arg$4, this.arg$5);
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46625, new Class[0], Object.class);
    }
}
