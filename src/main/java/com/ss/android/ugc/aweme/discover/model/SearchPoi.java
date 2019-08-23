package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import java.util.List;

public class SearchPoi implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String logPb;
    @SerializedName("simple_poi_info")
    public SimplePoiInfoStruct poi;
    @SerializedName("position_info")
    public List<SearchPoiPosition> position;
    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37119, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37119, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.poi != null) {
            i = this.poi.hashCode();
        }
        return i;
    }

    public List<Position> getPositionInAddress() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37117, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37117, new Class[0], List.class);
        } else if (this.position == null) {
            return null;
        } else {
            for (SearchPoiPosition next : this.position) {
                if (next.isPoiAddress()) {
                    return next.position;
                }
            }
            return null;
        }
    }

    public List<Position> getPositionInName() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37116, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37116, new Class[0], List.class);
        } else if (this.position == null) {
            return null;
        } else {
            for (SearchPoiPosition next : this.position) {
                if (next.isPoiName()) {
                    return next.position;
                }
            }
            return null;
        }
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37118, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37118, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof SearchPoi)) {
                return false;
            }
            return n.a(this.poi, ((SearchPoi) obj).poi);
        }
    }
}
