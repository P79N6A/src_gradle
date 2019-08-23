package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import java.io.Serializable;
import java.util.List;

public class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    public long code;
    @SerializedName("name")
    public String name;
    @SerializedName("poi_info_list")
    public List<SimplePoiInfoStruct> poiInfoStructList;

    public boolean hasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64999, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64999, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.poiInfoStructList != null && this.poiInfoStructList.size() > 9) {
            z = true;
        }
        return z;
    }

    public int size() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64997, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64997, new Class[0], Integer.TYPE)).intValue();
        } else if (this.poiInfoStructList == null) {
            return 0;
        } else {
            return this.poiInfoStructList.size();
        }
    }

    public List<SimplePoiInfoStruct> getPage(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 64998, new Class[]{Integer.TYPE, Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 64998, new Class[]{Integer.TYPE, Integer.TYPE}, List.class);
        }
        int i3 = i * i2;
        int i4 = i3 + i2;
        List<SimplePoiInfoStruct> list = this.poiInfoStructList;
        if (i4 > size()) {
            i4 = size();
        }
        return list.subList(i3, i4);
    }
}
