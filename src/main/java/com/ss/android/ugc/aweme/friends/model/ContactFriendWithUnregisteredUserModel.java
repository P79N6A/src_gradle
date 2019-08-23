package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public class ContactFriendWithUnregisteredUserModel extends ContactFriendModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<User> mUsers = new ArrayList();

    public List<User> getItems() {
        return this.mUsers;
    }

    static final /* synthetic */ FriendList lambda$fetchList$0$ContactFriendWithUnregisteredUserModel(i iVar) throws Exception {
        return (FriendList) iVar.e();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FriendList lambda$fetchList$1$ContactFriendWithUnregisteredUserModel(i iVar) throws Exception {
        FriendList friendList = (FriendList) iVar.e();
        if (friendList != null && !CollectionUtils.isEmpty(friendList.friends) && !this.mHasFollowedFriends) {
            partitionByIsFollowedStatus(friendList.friends);
        }
        return (FriendList) iVar.e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        if (r10.hasMore != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.ss.android.ugc.aweme.friends.model.FriendList<com.ss.android.ugc.aweme.profile.model.User> r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.friends.model.FriendList> r1 = com.ss.android.ugc.aweme.friends.model.FriendList.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 46596(0xb604, float:6.5295E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 46596(0xb604, float:6.5295E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.friends.model.FriendList> r1 = com.ss.android.ugc.aweme.friends.model.FriendList.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            r9.buildFriendItems(r10)
            if (r10 == 0) goto L_0x004a
            java.util.List<T> r0 = r10.friends
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0048
            java.util.List<com.ss.android.ugc.aweme.friends.model.UnRegisteredUser> r0 = r10.unregisteredUser
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r0 = 0
            goto L_0x004b
        L_0x004a:
            r0 = 1
        L_0x004b:
            r9.mIsNewDataEmpty = r0
            boolean r0 = r9.mIsNewDataEmpty
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r9.mData
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            goto L_0x0095
        L_0x005a:
            int r0 = r9.mListQueryType
            if (r0 == r7) goto L_0x0099
            r1 = 4
            if (r0 == r1) goto L_0x0062
            goto L_0x0098
        L_0x0062:
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            java.util.List<T> r0 = r0.friends
            java.util.List<T> r1 = r10.friends
            r0.addAll(r1)
            java.util.List<T> r0 = r10.friends
            java.util.List<com.ss.android.ugc.aweme.friends.model.UnRegisteredUser> r1 = r10.unregisteredUser
            r9.addAll(r0, r1)
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            int r1 = r10.cursor
            r0.cursor = r1
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            int r1 = r10.type
            r0.type = r1
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            java.lang.Object r1 = r9.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r1 = (com.ss.android.ugc.aweme.friends.model.FriendList) r1
            boolean r1 = r1.hasMore
            if (r1 == 0) goto L_0x0095
            boolean r1 = r10.hasMore
            if (r1 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r7 = 0
        L_0x0096:
            r0.hasMore = r7
        L_0x0098:
            return
        L_0x0099:
            r9.mData = r10
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r9.mUsers
            r0.clear()
            java.util.List<T> r0 = r10.friends
            java.util.List<com.ss.android.ugc.aweme.friends.model.UnRegisteredUser> r1 = r10.unregisteredUser
            r9.addAll(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.model.ContactFriendWithUnregisteredUserModel.handleData(com.ss.android.ugc.aweme.friends.model.FriendList):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c6, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void addAll(java.util.List<com.ss.android.ugc.aweme.profile.model.User> r12, java.util.List<com.ss.android.ugc.aweme.friends.model.UnRegisteredUser> r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c7 }
            r9 = 0
            r1[r9] = r12     // Catch:{ all -> 0x00c7 }
            r10 = 1
            r1[r10] = r13     // Catch:{ all -> 0x00c7 }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x00c7 }
            r4 = 0
            r5 = 46597(0xb605, float:6.5296E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00c7 }
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r6[r9] = r2     // Catch:{ all -> 0x00c7 }
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r6[r10] = r2     // Catch:{ all -> 0x00c7 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00c7 }
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x0041
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c7 }
            r1[r9] = r12     // Catch:{ all -> 0x00c7 }
            r1[r10] = r13     // Catch:{ all -> 0x00c7 }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x00c7 }
            r4 = 0
            r5 = 46597(0xb605, float:6.5296E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00c7 }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r6[r9] = r0     // Catch:{ all -> 0x00c7 }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r6[r10] = r0     // Catch:{ all -> 0x00c7 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00c7 }
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r11)
            return
        L_0x0041:
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r1 = r11.mUsers     // Catch:{ all -> 0x00c7 }
            int r1 = r1.size()     // Catch:{ all -> 0x00c7 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00c7 }
            r2.<init>()     // Catch:{ all -> 0x00c7 }
            java.util.Iterator r3 = r13.iterator()     // Catch:{ all -> 0x00c7 }
        L_0x0050:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00c7 }
            if (r4 == 0) goto L_0x007a
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00c7 }
            com.ss.android.ugc.aweme.friends.model.UnRegisteredUser r4 = (com.ss.android.ugc.aweme.friends.model.UnRegisteredUser) r4     // Catch:{ all -> 0x00c7 }
            com.ss.android.ugc.aweme.friends.model.Friend r5 = new com.ss.android.ugc.aweme.friends.model.Friend     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = r4.mobileId     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c7 }
            r5.<init>(r6)     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = r4.remarkName     // Catch:{ all -> 0x00c7 }
            r5.setNickname(r6)     // Catch:{ all -> 0x00c7 }
            int r4 = r4.inviteStatus     // Catch:{ all -> 0x00c7 }
            if (r4 <= 0) goto L_0x0072
            r4 = 1
            goto L_0x0073
        L_0x0072:
            r4 = 0
        L_0x0073:
            r5.setInvited(r4)     // Catch:{ all -> 0x00c7 }
            r2.add(r5)     // Catch:{ all -> 0x00c7 }
            goto L_0x0050
        L_0x007a:
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r3 = r11.mUsers     // Catch:{ all -> 0x00c7 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x0091
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r3 = r11.mUsers     // Catch:{ all -> 0x00c7 }
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00c7 }
            boolean r3 = r3 instanceof com.ss.android.ugc.aweme.friends.model.Friend     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r3 = 0
            goto L_0x0092
        L_0x0091:
            r3 = 1
        L_0x0092:
            if (r12 == 0) goto L_0x00af
            int r4 = r1 + -1
        L_0x0096:
            if (r4 < 0) goto L_0x00aa
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r5 = r11.mUsers     // Catch:{ all -> 0x00c7 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x00c7 }
            com.ss.android.ugc.aweme.profile.model.User r5 = (com.ss.android.ugc.aweme.profile.model.User) r5     // Catch:{ all -> 0x00c7 }
            boolean r5 = r5 instanceof com.ss.android.ugc.aweme.friends.model.Friend     // Catch:{ all -> 0x00c7 }
            if (r5 != 0) goto L_0x00a7
            int r1 = r4 + 1
            goto L_0x00aa
        L_0x00a7:
            int r4 = r4 + -1
            goto L_0x0096
        L_0x00aa:
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r4 = r11.mUsers     // Catch:{ all -> 0x00c7 }
            r4.addAll(r1, r12)     // Catch:{ all -> 0x00c7 }
        L_0x00af:
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r2)     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x00c5
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r11.mUsers     // Catch:{ all -> 0x00c7 }
            r0.addAll(r2)     // Catch:{ all -> 0x00c7 }
            if (r3 == 0) goto L_0x00c5
            java.lang.Object r0 = r2.get(r9)     // Catch:{ all -> 0x00c7 }
            com.ss.android.ugc.aweme.friends.model.Friend r0 = (com.ss.android.ugc.aweme.friends.model.Friend) r0     // Catch:{ all -> 0x00c7 }
            r0.setFirstOne(r10)     // Catch:{ all -> 0x00c7 }
        L_0x00c5:
            monitor-exit(r11)
            return
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.model.ContactFriendWithUnregisteredUserModel.addAll(java.util.List, java.util.List):void");
    }

    public void fetchList(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 46595, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 46595, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.mCountOnly) {
            this.mFriendApi.queryContactsFriendsCountOnly(i4, i5, i6, 1).c(ContactFriendWithUnregisteredUserModel$$Lambda$0.$instance).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
        } else {
            this.mFriendApi.queryContactsFriends(i4, i5, i6).c(new ContactFriendWithUnregisteredUserModel$$Lambda$1(this)).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }
}
