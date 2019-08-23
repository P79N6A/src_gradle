package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SearchUserList extends SearchApiResult {
    @SerializedName("cursor")
    public int cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("type")
    public int type;
    @SerializedName("user_list")
    public List<SearchUser> userList;
}
