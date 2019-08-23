package com.ss.android.ugc.aweme.feed.model.poi;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.SearchPoiPosition;
import com.ss.android.ugc.aweme.poi.model.f;
import com.ss.android.ugc.aweme.poi.model.k;
import java.util.List;

public class SimplePoiInfoStruct implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("business_area_name")
    public String businessAreaName;
    @SerializedName("cost")
    public double cost;
    @SerializedName("cover")
    public UrlModel cover;
    @SerializedName("latitude")
    public String latitude;
    @SerializedName("longitude")
    public String longitude;
    @SerializedName("option_name")
    public String optionName;
    @SerializedName("address_info")
    public f poiAddress;
    @SerializedName("poi_backend_type")
    public k poiBackendType;
    @SerializedName("poi_id")
    public String poiId;
    @SerializedName("poi_name")
    public String poiName;
    @SerializedName("poi_rank_desc")
    public String poiRankDesc;
    @SerializedName("poi_voucher")
    public String poiVoucher;
    public List<SearchPoiPosition> position;
    @SerializedName("rating")
    public double rating;
    private String requestId;
    @SerializedName("voucher_release_areas")
    public List<String> voucherReleaseAreas;

    public String getRequestId() {
        return this.requestId;
    }

    public String getCity() {
        if (this.poiAddress != null) {
            return this.poiAddress.city;
        }
        return "";
    }

    public String getCityCode() {
        if (this.poiAddress != null) {
            return this.poiAddress.cityCode;
        }
        return "";
    }

    public String getPoiBackendType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41502, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41502, new Class[0], String.class);
        } else if (this.poiBackendType != null) {
            return this.poiBackendType.getCode();
        } else {
            return "";
        }
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41507, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41507, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.poiId != null) {
            i = this.poiId.hashCode();
        }
        return i;
    }

    public boolean isValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41505, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41505, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.poiId)) {
            z = true;
        }
        return z;
    }

    public List<Position> getPositionInAddress() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41504, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41504, new Class[0], List.class);
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41503, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41503, new Class[0], List.class);
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
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 41506, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 41506, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof SimplePoiInfoStruct)) {
                return false;
            }
            return n.a(this.poiId, ((SimplePoiInfoStruct) obj).poiId);
        }
    }
}
