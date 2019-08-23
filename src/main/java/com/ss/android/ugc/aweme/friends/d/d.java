package com.ss.android.ugc.aweme.friends.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public abstract class d<T extends User> extends a<T, FriendList<T>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected boolean mHasFollowedFriends;

    public abstract void buildFriendItems(FriendList<T> friendList);

    public abstract void fetchList(int i, int i2, int i3);

    public int getRegisteredCount() {
        return ((FriendList) this.mData).registerCount;
    }

    public List<T> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FriendList) this.mData).friends;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((FriendList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 46684, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 46684, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.mHasFollowedFriends = false;
        fetchList(0, 20, 0);
    }

    public void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 46685, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 46685, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        fetchList(((FriendList) this.mData).cursor, 20, ((FriendList) this.mData).type);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        if (r10.hasMore != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.ss.android.ugc.aweme.friends.model.FriendList<T> r10) {
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
            r4 = 46686(0xb65e, float:6.5421E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 46686(0xb65e, float:6.5421E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.friends.model.FriendList> r1 = com.ss.android.ugc.aweme.friends.model.FriendList.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            r9.buildFriendItems(r10)
            if (r10 == 0) goto L_0x0042
            java.util.List<T> r0 = r10.friends
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = 0
            goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            r9.mIsNewDataEmpty = r0
            boolean r0 = r9.mIsNewDataEmpty
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r9.mData
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            goto L_0x0086
        L_0x0052:
            int r0 = r9.mListQueryType
            if (r0 == r7) goto L_0x008a
            r1 = 4
            if (r0 == r1) goto L_0x005a
            goto L_0x0089
        L_0x005a:
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.friends.model.FriendList r0 = (com.ss.android.ugc.aweme.friends.model.FriendList) r0
            java.util.List<T> r0 = r0.friends
            java.util.List<T> r1 = r10.friends
            r0.addAll(r1)
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
            if (r1 == 0) goto L_0x0086
            boolean r1 = r10.hasMore
            if (r1 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r7 = 0
        L_0x0087:
            r0.hasMore = r7
        L_0x0089:
            return
        L_0x008a:
            r9.mData = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.d.d.handleData(com.ss.android.ugc.aweme.friends.model.FriendList):void");
    }
}
