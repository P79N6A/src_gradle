package com.ss.android.ugc.aweme.feed.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassInfoStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiOpTabStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Keep
public class FeedItemList implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    public volatile boolean appendCache;
    @SerializedName("block_code")
    public int blockCode;
    public String cityCode;
    @SerializedName("current_city")
    public NearbyCities.CityBean currentCity;
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("error_code")
    public int error_code;
    @SerializedName("extra")
    public Extra extra;
    public int fetchType;
    @SerializedName("has_more")
    public int hasMore;
    @SerializedName("guide_word")
    public HotSearchGuideWord hotSearchGuideWord;
    public boolean isFromLocalCache;
    @SerializedName("aweme_list")
    public List<Aweme> items;
    public Map<String, String> localExtra = new HashMap();
    @SerializedName("log_pb")
    public LogPbBean logPb;
    @SerializedName(alternate = {"max_time"}, value = "max_cursor")
    public long maxCursor;
    @SerializedName(alternate = {"min_time"}, value = "min_cursor")
    public long minCursor;
    @SerializedName("page_id")
    public int pageId;
    @SerializedName("poi_class_info_list")
    public List<PoiClassInfoStruct> poiClassInfoStructList;
    @SerializedName("poi_op_tab_list")
    public List<PoiOpTabStruct> poiOpTabStructs;
    @SerializedName("preload_ads")
    public List<Aweme> preloadAds;
    @SerializedName("refresh_clear")
    public int refreshClear;
    public volatile boolean replaceFake;
    @SerializedName("rid")
    public String requestId;
    @SerializedName("status_code")
    public int status_code;
    @SerializedName("status_msg")
    public String status_msg;

    public void setReplaceFake() {
        this.replaceFake = true;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean getReplaceFake() {
        boolean z = this.replaceFake;
        this.replaceFake = false;
        return z;
    }

    public boolean isAppendCache() {
        boolean z = this.appendCache;
        this.appendCache = false;
        return z;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean isRefreshClear() {
        if (this.refreshClear == 1) {
            return true;
        }
        return false;
    }

    public int size() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41454, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41454, new Class[0], Integer.TYPE)).intValue();
        } else if (CollectionUtils.isEmpty(this.items)) {
            return 0;
        } else {
            return this.items.size();
        }
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public boolean isCurrentCity(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 41453, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 41453, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(this.cityCode)) {
            return false;
        } else {
            return this.cityCode.equalsIgnoreCase(str);
        }
    }

    public void setCityCode(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 41452, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 41452, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.cityCode = str;
        } else if (this.currentCity != null) {
            this.cityCode = this.currentCity.code;
        }
    }

    public void setLocalExtra(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, changeQuickRedirect, false, 41451, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, changeQuickRedirect, false, 41451, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.localExtra.put(str3, str4);
    }
}
