package com.ss.android.ugc.aweme.poi.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.poi.model.am;
import java.io.Serializable;

public class g extends b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String poiId;
    public am productInfo;

    public int getFeedType() {
        return 65448;
    }

    public void setFeedType(int i) {
    }

    public String getSpSource() {
        if (this.productInfo == null) {
            return "";
        }
        return this.productInfo.supplierSource;
    }

    public g(am amVar, String str) {
        this.productInfo = amVar;
        this.poiId = str;
    }
}
