package com.ss.android.ugc.aweme.profile.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

@Keep
public class AvatarDecoration implements Serializable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    public long id;
    @SerializedName("name")
    public String name;
    @SerializedName("source_url")
    public UrlModel sourceUrl;

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public UrlModel getSourceUrl() {
        return this.sourceUrl;
    }
}
