package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.friends.api.a;
import com.ss.android.ugc.aweme.friends.d.d;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class ContactFriendModel extends d<User> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected boolean mCountOnly;
    protected FriendApi mFriendApi;

    public void buildFriendItems(FriendList<User> friendList) {
    }

    public ContactFriendModel() {
        this.mFriendApi = a.a();
    }

    public ContactFriendModel(boolean z) {
        this();
        this.mCountOnly = z;
    }

    static final /* synthetic */ FriendList lambda$fetchList$0$ContactFriendModel(i iVar) throws Exception {
        return (FriendList) iVar.e();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FriendList lambda$fetchList$1$ContactFriendModel(i iVar) throws Exception {
        FriendList friendList = (FriendList) iVar.e();
        if (friendList != null && !CollectionUtils.isEmpty(friendList.friends) && !this.mHasFollowedFriends) {
            partitionByIsFollowedStatus(friendList.friends);
        }
        return (FriendList) iVar.e();
    }

    public void partitionByIsFollowedStatus(List<User> list) {
        List<User> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 46592, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 46592, new Class[]{List.class}, Void.TYPE);
            return;
        }
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (list2.get(i).getFollowStatus() != 0) {
                while (i < size && list2.get(size - 1).getFollowStatus() != 0) {
                    size--;
                }
                list2.set(i, list2.get(size));
                list2.set(size, list2.get(i));
                z = true;
            }
        }
        this.mHasFollowedFriends = z;
    }

    public void fetchList(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 46591, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 46591, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.mCountOnly) {
            this.mFriendApi.queryContactsFriendsCountOnly(i4, i5, i6, 1).c(ContactFriendModel$$Lambda$0.$instance).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
        } else {
            this.mFriendApi.queryContactsFriends(i4, i5, i6).c(new ContactFriendModel$$Lambda$1(this)).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }
}
