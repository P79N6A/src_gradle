package com.ss.android.ugc.aweme.filter.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.filter.h;
import java.util.List;

@Keep
public class FilterListBean extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    private List<h> mFilterList;
    @SerializedName("front_filter_id")
    private int mFrontFilterId;
    @SerializedName("rear_filter_id")
    private int mRearFilterId;

    public List<h> getFilterList() {
        return this.mFilterList;
    }

    public int getFrontFilterId() {
        return this.mFrontFilterId;
    }

    public int getRearFilterId() {
        return this.mRearFilterId;
    }

    public void setFilterList(List<h> list) {
        this.mFilterList = list;
    }

    public void setFrontFilterId(int i) {
        this.mFrontFilterId = i;
    }

    public void setRearFilterId(int i) {
        this.mRearFilterId = i;
    }
}
