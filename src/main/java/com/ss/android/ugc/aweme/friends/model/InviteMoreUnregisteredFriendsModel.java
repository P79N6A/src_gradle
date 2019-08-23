package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class InviteMoreUnregisteredFriendsModel extends a<UnRegisteredUser, FriendList<User>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FriendApi mFriendApi = com.ss.android.ugc.aweme.friends.api.a.a();

    public List<UnRegisteredUser> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FriendList) this.mData).unregisteredUser;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((FriendList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    static final /* synthetic */ FriendList lambda$fetchList$0$InviteMoreUnregisteredFriendsModel(i iVar) throws Exception {
        return (FriendList) iVar.e();
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 46639, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 46639, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        fetchList(((FriendList) this.mData).cursor, 200);
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 46638, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 46638, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        fetchList(0, 200);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e2, code lost:
        if (r8.hasMore != false) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.ss.android.ugc.aweme.friends.model.FriendList<com.ss.android.ugc.aweme.profile.model.User> r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.friends.model.FriendList> r1 = com.ss.android.ugc.aweme.friends.model.FriendList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 46641(0xb631, float:6.5358E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 46641(0xb631, float:6.5358E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.friends.model.FriendList> r1 = com.ss.android.ugc.aweme.friends.model.FriendList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            if (r8 == 0) goto L_0x0045
            java.util.List<com.ss.android.ugc.aweme.friends.model.UnRegisteredUser> r0 = r8.unregisteredUser
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r0 = 0
            goto L_0x0046
        L_0x0045:
            r0 = 1
        L_0x0046:
            r7.mIsNewDataEmpty = r0
            boolean r0 = r7.mIsNewDataEmpty
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r7.mData
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            goto L_0x00e5
        L_0x0056:
            int r0 = r7.mListQueryType
            if (r0 == r9) goto L_0x00e9
            r1 = 4
            if (r0 == r1) goto L_0x005f
            goto L_0x00e8
        L_0x005f:
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            java.util.List<com.ss.android.ugc.aweme.friends.model.UnRegisteredUser> r0 = r0.unregisteredUser
            java.util.List<com.ss.android.ugc.aweme.friends.model.UnRegisteredUser> r1 = r8.unregisteredUser
            r2 = 2
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r0
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.c.a.f35250a
            r14 = 1
            r15 = 23863(0x5d37, float:3.3439E-41)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r3[r10] = r4
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x00a6
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r0
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.c.a.f35250a
            r14 = 1
            r15 = 23863(0x5d37, float:3.3439E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r10] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00c4
        L_0x00a6:
            boolean r2 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x00c4
            java.util.Iterator r1 = r1.iterator()
        L_0x00b0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00c4
            java.lang.Object r2 = r1.next()
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L_0x00b0
            r0.add(r2)
            goto L_0x00b0
        L_0x00c4:
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            int r1 = r8.cursor
            r0.cursor = r1
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            int r1 = r8.type
            r0.type = r1
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            java.lang.Object r1 = r7.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r1 = (com.ss.android.ugc.aweme.friends.model.FriendList) r1
            boolean r1 = r1.hasMore
            if (r1 == 0) goto L_0x00e5
            boolean r1 = r8.hasMore
            if (r1 == 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r9 = 0
        L_0x00e6:
            r0.hasMore = r9
        L_0x00e8:
            return
        L_0x00e9:
            r7.mData = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.model.InviteMoreUnregisteredFriendsModel.handleData(com.ss.android.ugc.aweme.friends.model.FriendList):void");
    }

    private void fetchList(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 46640, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 46640, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mFriendApi.queryMoreUnregisteredFriends(i, i2).c(InviteMoreUnregisteredFriendsModel$$Lambda$0.$instance).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
