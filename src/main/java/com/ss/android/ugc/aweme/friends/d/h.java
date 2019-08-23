package com.ss.android.ugc.aweme.friends.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.model.ContactModel;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48857a;

    /* renamed from: b  reason: collision with root package name */
    private final InviteContactFriendsModel f48858b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<a> f48859c = new WeakReference<>(null);

    public interface a {
    }

    public h(InviteContactFriendsModel inviteContactFriendsModel, a aVar) {
        this.f48858b = inviteContactFriendsModel;
    }

    public final void a(User user, List<ContactModel> list, InviteContactFriendsModel.InviteFriendsCallback inviteFriendsCallback) {
        List<ContactModel> list2 = list;
        InviteContactFriendsModel.InviteFriendsCallback inviteFriendsCallback2 = inviteFriendsCallback;
        if (PatchProxy.isSupport(new Object[]{user, list2, inviteFriendsCallback2}, this, f48857a, false, 46687, new Class[]{User.class, List.class, InviteContactFriendsModel.InviteFriendsCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, list2, inviteFriendsCallback2}, this, f48857a, false, 46687, new Class[]{User.class, List.class, InviteContactFriendsModel.InviteFriendsCallback.class}, Void.TYPE);
        } else if (user != null) {
            this.f48858b.inviteFriends(user.getNickname(), list2, inviteFriendsCallback2);
        }
    }
}
