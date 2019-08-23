package com.ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import java.io.Serializable;
import java.util.List;

public final class ar implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("poi_info_list")
    public List<SimplePoiInfoStruct> list;
    @SerializedName("title")
    public String title;

    public final boolean hasMore() {
        return this.hasMore;
    }

    public final void addNullItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65148, new Class[0], Void.TYPE);
            return;
        }
        this.list.add(new SimplePoiInfoStruct());
    }

    public final boolean isValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65147, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65147, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.title) && !CollectionUtils.isEmpty(this.list) && this.list.size() >= 3) {
            z = true;
        }
        return z;
    }
}
