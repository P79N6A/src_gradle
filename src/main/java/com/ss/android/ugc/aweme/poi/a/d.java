package com.ss.android.ugc.aweme.poi.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.newfollow.e.b;
import java.io.Serializable;

public class d extends b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isAweme;
    public boolean showMore;

    public int getFeedType() {
        return 65443;
    }

    public void setFeedType(int i) {
    }

    public d(boolean z, boolean z2) {
        this.isAweme = z;
        this.showMore = z2;
    }
}
