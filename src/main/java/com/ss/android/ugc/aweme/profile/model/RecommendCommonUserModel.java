package com.ss.android.ugc.aweme.profile.model;

import a.g;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.friends.api.RecommendApi;
import com.ss.android.ugc.aweme.friends.api.b;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.w.a.a;
import java.util.ArrayList;
import java.util.List;

public class RecommendCommonUserModel extends a<RecommendList> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private RecommendApi mRecommendApi = b.a();
    private int newUserCount;
    private List<String> userIdList;

    public void removeFollowedUser() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67489, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67489, new Class[0], Void.TYPE);
            return;
        }
        if (this.mData != null && !((RecommendList) this.mData).getUserList().isEmpty()) {
            List<User> userList = ((RecommendList) this.mData).getUserList();
            int size = userList.size();
            while (i < size) {
                if (userList.get(i).getFollowStatus() != 0) {
                    userList.remove(i);
                    size--;
                    i--;
                }
                i++;
            }
            ((RecommendList) this.mData).userList = userList;
        }
    }

    public void setData(List<User> list) {
        if (this.mData != null) {
            ((RecommendList) this.mData).userList = list;
        }
    }

    public int getUserImprOrder(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 67491, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 67491, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.userIdList != null) {
            return this.userIdList.indexOf(str);
        } else {
            return 0;
        }
    }

    public void removeData(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, changeQuickRedirect, false, 67488, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, changeQuickRedirect, false, 67488, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (this.mData != null && !((RecommendList) this.mData).getUserList().isEmpty()) {
            List<User> userList = ((RecommendList) this.mData).getUserList();
            userList.remove(user);
            ((RecommendList) this.mData).userList = userList;
        }
    }

    public void handleData(RecommendList recommendList) {
        if (PatchProxy.isSupport(new Object[]{recommendList}, this, changeQuickRedirect, false, 67490, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList}, this, changeQuickRedirect, false, 67490, new Class[]{RecommendList.class}, Void.TYPE);
            return;
        }
        if (!(recommendList == null || recommendList.getUserList() == null)) {
            for (User requestId : recommendList.getUserList()) {
                requestId.setRequestId(recommendList.rid);
            }
        }
        if (this.mQueryType == 1) {
            super.handleData(recommendList);
        } else if (this.mQueryType == 4) {
            if (this.mData != null) {
                List<User> userList = ((RecommendList) this.mData).getUserList();
                userList.addAll(recommendList.getUserList());
                this.mData = recommendList;
                ((RecommendList) this.mData).userList = userList;
            } else {
                this.mData = recommendList;
            }
        }
        if (this.userIdList == null) {
            this.userIdList = new ArrayList();
        } else {
            this.userIdList.clear();
        }
        if (!(recommendList == null || recommendList.getUserList() == null)) {
            for (User uid : recommendList.getUserList()) {
                this.userIdList.add(uid.getUid());
            }
        }
        if (recommendList != null) {
            ai.a().a(recommendList.rid, recommendList.logPb);
        }
    }

    @SuppressLint({"TooManyMethodParam"})
    public void loadMore(int i, String str, int i2, int i3, int i4, int i5, String str2, String str3) {
        int i6;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str2, str3}, this, changeQuickRedirect, false, 67486, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str2, str3}, this, changeQuickRedirect, false, 67486, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 4;
            if (this.mData == null) {
                i6 = 0;
            } else {
                i6 = ((RecommendList) this.mData).cursor;
            }
            fetchData(i, str, i6, i2, i3, i4, null, i5, str2, str3);
        }
    }

    @SuppressLint({"TooManyMethodParam"})
    public void refreshRecommendUser(int i, String str, int i2, int i3, int i4, String str2, int i5, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, Integer.valueOf(i5), str3, str4}, this, changeQuickRedirect, false, 67485, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, Integer.valueOf(i5), str3, str4}, this, changeQuickRedirect, false, 67485, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 1;
            fetchData(i, str, 0, i2, i3, i4, str2, i5, str3, str4);
        }
    }

    @SuppressLint({"TooManyMethodParam"})
    private void fetchData(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str2, Integer.valueOf(i6), str3, str4}, this, changeQuickRedirect, false, 67487, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str2, Integer.valueOf(i6), str3, str4}, this, changeQuickRedirect, false, 67487, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str2)) {
            String str5 = str;
            this.mRecommendApi.recommendList(Integer.valueOf(i), Integer.valueOf(i2), str5, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), k.a().b(), Integer.valueOf(i6), str3).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
        } else {
            this.mRecommendApi.recommendList(Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), 1, Integer.valueOf(i5), k.a().b(), str2, Integer.valueOf(i6), str3, str4).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }
}
