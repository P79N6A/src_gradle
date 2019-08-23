package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.List;

public class SearchCommodity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    @SerializedName("goods_info")
    Commodity commodity;
    @SerializedName("position")
    List<Position> positions;

    public Commodity getCommodity() {
        return this.commodity;
    }

    public List<Position> getPositions() {
        return this.positions;
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37078, new Class[0], Integer.TYPE)) {
            return this.commodity.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37078, new Class[0], Integer.TYPE)).intValue();
    }

    public void setCommodity(Commodity commodity2) {
        this.commodity = commodity2;
    }

    public void setPositions(List<Position> list) {
        this.positions = list;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37077, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37077, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof SearchCommodity)) {
                return false;
            }
            return this.commodity.equals(((SearchCommodity) obj).commodity);
        }
    }
}
