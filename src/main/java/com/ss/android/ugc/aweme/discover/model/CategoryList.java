package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class CategoryList extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    public int cursor;
    @SerializedName("device_type")
    public int deviceType;
    @SerializedName("has_more")
    public int hasMore;
    @SerializedName("category_list")
    public List<Category> items;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }
}
