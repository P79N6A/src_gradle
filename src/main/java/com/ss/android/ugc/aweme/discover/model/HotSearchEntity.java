package com.ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import java.io.Serializable;
import java.util.List;

public class HotSearchEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    @SerializedName("active_time")
    private String lastUpdateTime;
    @SerializedName("word_list")
    private List<HotSearchItem> list;
    @SerializedName("share_info")
    private ShareInfo shareInfo;

    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public List<HotSearchItem> getList() {
        return this.list;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public boolean isValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37053, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37053, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!CollectionUtils.isEmpty(this.list) && !TextUtils.isEmpty(this.lastUpdateTime)) {
            z = true;
        }
        return z;
    }

    public void setLastUpdateTime(String str) {
        this.lastUpdateTime = str;
    }

    public void setList(List<HotSearchItem> list2) {
        this.list = list2;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }
}
