package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import java.util.Comparator;

public final /* synthetic */ class InviteContactFriendsModel$$Lambda$3 implements Comparator {
    static final Comparator $instance = new InviteContactFriendsModel$$Lambda$3();
    public static ChangeQuickRedirect changeQuickRedirect;

    private InviteContactFriendsModel$$Lambda$3() {
    }

    public final int compare(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 46623, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return InviteContactFriendsModel.lambda$sortWithContactIndex$3$InviteContactFriendsModel((InviteContactFriendsModel.ContactFriend) obj, (InviteContactFriendsModel.ContactFriend) obj2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 46623, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
    }
}
