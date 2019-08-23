package com.ss.android.ugc.aweme.poi.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.newfollow.e.b;
import java.io.Serializable;

public class c extends b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String aid = "";
    public boolean isAweme;
    public String relatedId;
    public boolean showDividerLine;
    public int targetPosition;

    public int getFeedType() {
        return 65444;
    }

    public void setFeedType(int i) {
    }

    public c(String str, boolean z, boolean z2) {
        this.relatedId = str;
        this.isAweme = z;
        this.showDividerLine = z2;
    }

    public c(String str, boolean z, int i, boolean z2) {
        this.relatedId = str;
        this.isAweme = z;
        this.targetPosition = i;
        this.showDividerLine = z2;
    }
}
