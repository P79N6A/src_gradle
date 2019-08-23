package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class HotVideoListResponse extends BaseResponse implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("active_time")
    public String lastUpdateTime;
    @SerializedName("log_pb")
    public LogPbBean logPb;
    @SerializedName("aweme_list")
    public List<HotVideoItem> mHotVideoItemList;
    private String requestId;
    @SerializedName("share_info")
    public ShareInfo shareInfo;

    public String getRequestId() {
        return this.requestId;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37070, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37070, new Class[0], String.class);
        }
        return "HotVideoListResponse{mHotVideoItemList=" + this.mHotVideoItemList + ", lastUpdateTime='" + this.lastUpdateTime + '\'' + ", logPb=" + this.logPb + '}';
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 37069, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 37069, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.requestId = str;
        if (!CollectionUtils.isEmpty(this.mHotVideoItemList)) {
            for (int i = 0; i < this.mHotVideoItemList.size(); i++) {
                HotVideoItem hotVideoItem = this.mHotVideoItemList.get(i);
                if (hotVideoItem != null) {
                    Aweme aweme = hotVideoItem.getAweme();
                    if (aweme != null) {
                        aweme.setRequestId(str);
                        a a2 = a.a();
                        a2.a(aweme.getAid() + 13, str, i);
                    }
                }
            }
        }
    }
}
