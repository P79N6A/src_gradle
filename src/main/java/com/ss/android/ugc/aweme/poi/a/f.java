package com.ss.android.ugc.aweme.poi.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.newfollow.e.b;
import java.io.Serializable;

public class f extends b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String commentUrl;

    public int getFeedType() {
        return 65445;
    }

    public void setFeedType(int i) {
    }

    public f(String str) {
        this.commentUrl = str;
    }
}
