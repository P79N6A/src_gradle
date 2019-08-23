package com.ss.android.ugc.aweme.setting.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class BlackList extends BaseResponse {
    @SerializedName("block_list")
    public List<User> blockList;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("index")
    public int index;
}
