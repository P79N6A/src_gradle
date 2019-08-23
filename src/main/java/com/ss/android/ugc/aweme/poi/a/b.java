package com.ss.android.ugc.aweme.poi.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import java.io.Serializable;
import java.util.List;

public class b extends com.ss.android.ugc.aweme.newfollow.e.b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<PoiClassRankBannerStruct> poiClassRankBannerStructList;
    private String poiId;

    public int getFeedType() {
        return 65449;
    }

    public void setFeedType(int i) {
    }

    public List<PoiClassRankBannerStruct> getBanners() {
        return this.poiClassRankBannerStructList;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public int size() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64933, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64933, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.poiClassRankBannerStructList != null) {
            i = this.poiClassRankBannerStructList.size();
        }
        return i;
    }

    public b setPoiId(String str) {
        this.poiId = str;
        return this;
    }

    public b(List<PoiClassRankBannerStruct> list) {
        this.poiClassRankBannerStructList = list;
    }
}
