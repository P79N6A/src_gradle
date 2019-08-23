package com.ss.android.ugc.aweme.im.sdk.resources.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class e implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("icon_url")
    private String iconUrl;
    @SerializedName("id")
    private long id;
    private int optional;
    @SerializedName("resource_url")
    private String resourceUrl;
    private String type;
    @SerializedName("version")
    private String version;

    public String getDisplayName() {
        return this.displayName;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public long getId() {
        return this.id;
    }

    public int getOptional() {
        return this.optional;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public String getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setOptional(int i) {
        this.optional = i;
    }

    public void setResourceUrl(String str) {
        this.resourceUrl = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, changeQuickRedirect, false, 53168, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, changeQuickRedirect, false, 53168, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj2 == null || !(obj2 instanceof e)) {
            return false;
        } else if (this.id == ((e) obj2).getId()) {
            return true;
        } else {
            return false;
        }
    }
}
