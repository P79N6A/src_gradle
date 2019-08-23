package com.ss.android.ugc.aweme.setting.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class PopupResponse extends BaseResponse {
    @SerializedName("popups")
    public List<PopupSetting> popups;
}
