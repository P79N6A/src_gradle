package com.ss.android.ugc.aweme.commercialize;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.commercialize.model.i;
import java.io.Serializable;

public class k implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String enterFrom;
    private String enterMethod;
    private String keyWords;
    private i mEasterEggInfo;

    public i getEasterEggInfo() {
        return this.mEasterEggInfo;
    }

    public String getEnterFrom() {
        return this.enterFrom;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public String getKeyWords() {
        return this.keyWords;
    }

    public void setEasterEggInfo(i iVar) {
        this.mEasterEggInfo = iVar;
    }

    public void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public void setKeyWords(String str) {
        this.keyWords = str;
    }
}
