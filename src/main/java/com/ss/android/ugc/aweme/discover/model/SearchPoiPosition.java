package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.List;

public class SearchPoiPosition implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("position")
    public List<Position> position;
    @SerializedName("target")
    String target;

    public boolean isPoiAddress() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37121, new Class[0], Boolean.TYPE)) {
            return "poi_address".endsWith(this.target);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37121, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isPoiName() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37120, new Class[0], Boolean.TYPE)) {
            return "poi_name".endsWith(this.target);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37120, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
