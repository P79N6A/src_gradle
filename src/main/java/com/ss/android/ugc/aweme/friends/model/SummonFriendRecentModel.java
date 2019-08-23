package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.permission.e;
import java.util.ArrayList;
import java.util.List;

public class SummonFriendRecentModel extends a<List<SummonFriendItem>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    FollowUserListModel followUserListModel;
    private long maxTime;
    RecentFriendModel recentFriendModel;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public boolean isHasMore() {
        if (this.followUserListModel != null) {
            return this.followUserListModel.hasMore;
        }
        return false;
    }

    public List<SummonFriendItem> loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46645, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46645, new Class[0], List.class);
        }
        try {
            if (c.a() && !d.a().isLogin()) {
                return null;
            }
            this.followUserListModel = SummonFriendApi.a(10, this.maxTime, 0, d.a().getCurUserId(), e.a(), e.b());
            if (this.followUserListModel != null) {
                addItem(this.followUserListModel.users, k.a().getResources().getString(C0906R.string.cgh), false, 3);
                setCursor(this.followUserListModel);
                return (List) this.mData;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public List<SummonFriendItem> refreshData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46644, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46644, new Class[0], List.class);
        }
        try {
            if (this.mData == null) {
                this.mData = new ArrayList();
            }
            ((List) this.mData).clear();
            this.recentFriendModel = SummonFriendApi.a();
            if (!(this.recentFriendModel == null || this.recentFriendModel.users == null)) {
                addItem(this.recentFriendModel.users, k.a().getResources().getString(C0906R.string.cgi), true, 4);
            }
            if (d.a().isLogin()) {
                this.followUserListModel = SummonFriendApi.a(10, System.currentTimeMillis() / 1000, 0, d.a().getCurUserId(), e.a(), e.b());
                if (this.followUserListModel != null) {
                    setCursor(this.followUserListModel);
                    addItem(this.followUserListModel.users, k.a().getResources().getString(C0906R.string.cgh), true, 3);
                }
            }
            return (List) this.mData;
        } catch (Exception unused) {
            return null;
        }
    }

    private void setCursor(FollowUserListModel followUserListModel2) {
        this.maxTime = followUserListModel2.maxTime;
    }

    private void addSummonItem(List<User> list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, changeQuickRedirect, false, 46647, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, changeQuickRedirect, false, 46647, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
        } else if (this.mData != null) {
            for (User user : list) {
                SummonFriendItem summonFriendItem = new SummonFriendItem();
                summonFriendItem.mUser = user;
                summonFriendItem.type = i;
                ((List) this.mData).add(summonFriendItem);
            }
        }
    }

    private void addItem(List<User> list, String str, boolean z, int i) {
        List<User> list2 = list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list2, str2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, this, changeQuickRedirect, false, 46646, new Class[]{List.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, str2, Byte.valueOf(z), Integer.valueOf(i)}, this, changeQuickRedirect, false, 46646, new Class[]{List.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (list2 != null) {
            if (list.size() > 0 && z) {
                SummonFriendItem summonFriendItem = new SummonFriendItem();
                summonFriendItem.type = 2;
                summonFriendItem.label = str2;
                ((List) this.mData).add(summonFriendItem);
            }
            addSummonItem(list2, i);
        }
    }
}
