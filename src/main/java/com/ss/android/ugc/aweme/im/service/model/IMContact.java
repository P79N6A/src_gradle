package com.ss.android.ugc.aweme.im.service.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

@Keep
public abstract class IMContact implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected int relationListItemType;

    public abstract UrlModel getDisplayAvatar();

    public abstract String getDisplayName();

    public int getType() {
        return this.relationListItemType;
    }

    public void setType(int i) {
        this.relationListItemType = i;
    }
}
