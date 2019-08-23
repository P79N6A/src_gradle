package com.ss.android.ugc.aweme.friends.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public class RecommendList extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    public int cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("log_pb")
    public LogPbBean logPb;
    @SerializedName("new_user_count")
    public int newUserCount;
    @SerializedName("rid")
    public String rid;
    @SerializedName("user_list")
    public List<User> userList;

    public List<User> getUserList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46643, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46643, new Class[0], List.class);
        }
        if (this.userList == null) {
            this.userList = new ArrayList(0);
        }
        return this.userList;
    }
}
