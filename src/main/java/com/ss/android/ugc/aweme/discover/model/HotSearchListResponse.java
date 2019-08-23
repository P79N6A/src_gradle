package com.ss.android.ugc.aweme.discover.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

@Keep
public class HotSearchListResponse extends BaseResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    @SerializedName("ad_search_list")
    private List<AdDefaultSearchStruct> adSearchList;
    @SerializedName("data")
    private HotSearchEntity data;
    @SerializedName("op_default_word")
    private String defaultSearchKeyword;
    @SerializedName("log_pb")
    private LogPbBean logPb;
    @SerializedName("op_default_search_word")
    private String realDefaultSearchKeyword;

    public List<AdDefaultSearchStruct> getAdSearchList() {
        return this.adSearchList;
    }

    public HotSearchEntity getData() {
        return this.data;
    }

    public String getDefaultSearchKeyword() {
        return this.defaultSearchKeyword;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public String getRealDefaultSearchKeyword() {
        return this.realDefaultSearchKeyword;
    }

    public void setData(HotSearchEntity hotSearchEntity) {
        this.data = hotSearchEntity;
    }

    public void setDefaultSearchKeyword(String str) {
        this.defaultSearchKeyword = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setRealDefaultSearchKeyword(String str) {
        this.realDefaultSearchKeyword = str;
    }
}
