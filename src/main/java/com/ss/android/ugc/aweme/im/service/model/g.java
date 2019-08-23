package com.ss.android.ugc.aweme.im.service.model;

import java.io.Serializable;

public class g implements Serializable {
    public String aid;
    public IMContact contact;
    public String enterFrom;
    public boolean isMulti;
    public String itemType;

    public g(IMContact iMContact, boolean z, String str, String str2) {
        this.contact = iMContact;
        this.isMulti = z;
        this.itemType = str;
        this.enterFrom = str2;
    }

    public g(IMContact iMContact, boolean z, String str, String str2, String str3) {
        this.contact = iMContact;
        this.isMulti = z;
        this.itemType = str;
        this.enterFrom = str2;
        this.aid = str3;
    }
}
