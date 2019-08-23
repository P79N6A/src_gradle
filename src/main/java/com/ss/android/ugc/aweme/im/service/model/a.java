package com.ss.android.ugc.aweme.im.service.model;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String creativeId;
    private String logExtra;

    public String getCreativeId() {
        return this.creativeId;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public a(String str, String str2) {
        this.logExtra = str;
        this.creativeId = str2;
    }
}
