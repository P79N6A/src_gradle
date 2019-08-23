package com.ss.android.ugc.aweme.im.sdk.resources.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

public final class c extends e {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("package_type")
    private int packageType;
    @SerializedName("resource_type")
    private int resourceType;
    @SerializedName("stickers")
    private List<a> stickers;

    public final int getPackageType() {
        return this.packageType;
    }

    public final int getResourceType() {
        return this.resourceType;
    }

    public final List<a> getStickers() {
        return this.stickers;
    }

    public final void setPackageType(int i) {
        this.packageType = i;
    }

    public final void setResourceType(int i) {
        this.resourceType = i;
    }

    public final void setStickers(List<a> list) {
        this.stickers = list;
    }
}
