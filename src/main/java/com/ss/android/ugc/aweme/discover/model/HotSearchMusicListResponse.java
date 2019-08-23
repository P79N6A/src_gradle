package com.ss.android.ugc.aweme.discover.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.hotsearch.b.a;
import java.util.List;

@Keep
public class HotSearchMusicListResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("banner_url")
    public UrlModel bannerUrl;
    @SerializedName("active_time")
    public String lastUpdateTime;
    @SerializedName("music_list")
    public List<HotSearchMusicItem> list;
    @SerializedName("log_pb")
    public LogPbBean logPb;
    @SerializedName("share_info")
    public ShareInfo shareInfo;
    @SerializedName("weekly_bill_info")
    public a weeklyBillInfo;

    public boolean isValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37062, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37062, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!CollectionUtils.isEmpty(this.list) && !TextUtils.isEmpty(this.lastUpdateTime)) {
            z = true;
        }
        return z;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37063, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37063, new Class[0], String.class);
        }
        return "HotSearchMusicListResponse{list=" + this.list + ", lastUpdateTime='" + this.lastUpdateTime + '\'' + '}';
    }

    public void setEditionUid(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 37064, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 37064, new Class[]{String.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.list)) {
            for (HotSearchMusicItem hotSearchMusicItem : this.list) {
                hotSearchMusicItem.mEditionUid = str;
            }
        }
    }
}
