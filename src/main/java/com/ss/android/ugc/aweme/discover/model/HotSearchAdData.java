package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class HotSearchAdData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("click_track_url_list")
    private UrlModel clickTrackUrl;
    @SerializedName("creative_id")
    private long creativeId;
    @SerializedName("is_preview")
    private boolean isPreiew;
    @SerializedName("log_extra")
    private String logExtra;
    @SerializedName("track_url_list")
    private UrlModel trackUrl;

    public UrlModel getClickTrackUrl() {
        return this.clickTrackUrl;
    }

    public long getCreativeId() {
        return this.creativeId;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public UrlModel getTrackUrl() {
        return this.trackUrl;
    }

    public boolean isPreiew() {
        return this.isPreiew;
    }
}
