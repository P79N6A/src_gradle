package com.bytedance.android.livesdk.gift.assets;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class AssetsModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("describe")
    private String describe;
    @SerializedName("download_type")
    private int downloadType;
    @SerializedName("id")
    private long id;
    @SerializedName("md5")
    private String md5;
    @SerializedName("name")
    private String name;
    @SerializedName("resource_url")
    private i resourceModel;
    @SerializedName("resource_type")
    private int resourceType;
    @SerializedName("resource_uri")
    private String resourceUri;
    @SerializedName("size")
    private long size;

    public String getDescribe() {
        return this.describe;
    }

    public int getDownloadType() {
        return this.downloadType;
    }

    public long getId() {
        return this.id;
    }

    public String getMD5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public i getResourceModel() {
        return this.resourceModel;
    }

    public int getResourceType() {
        return this.resourceType;
    }

    public String getResourceUri() {
        return this.resourceUri;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9351, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9351, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = ((int) (this.id ^ (this.id >>> 32))) * 31;
        if (this.name != null) {
            i = this.name.hashCode();
        } else {
            i = 0;
        }
        int i7 = (i6 + i) * 31;
        if (this.describe != null) {
            i2 = this.describe.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        if (this.md5 != null) {
            i3 = this.md5.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (((i8 + i3) * 31) + this.resourceType) * 31;
        if (this.resourceUri != null) {
            i4 = this.resourceUri.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        if (this.resourceModel != null) {
            i5 = this.resourceModel.hashCode();
        }
        return ((((i10 + i5) * 31) + ((int) (this.size ^ (this.size >>> 32)))) * 31) + this.downloadType;
    }

    @SerializedName("describe")
    public void setDescribe(String str) {
        this.describe = str;
    }

    @SerializedName("download_type")
    public void setDownloadType(int i) {
        this.downloadType = i;
    }

    @SerializedName("id")
    public void setId(long j) {
        this.id = j;
    }

    @SerializedName("md5")
    public void setMD5(String str) {
        this.md5 = str;
    }

    @SerializedName("name")
    public void setName(String str) {
        this.name = str;
    }

    @SerializedName("resource_url")
    public void setResourceModel(i iVar) {
        this.resourceModel = iVar;
    }

    @SerializedName("resource_type")
    public void setResourceType(int i) {
        this.resourceType = i;
    }

    @SerializedName("resource_uri")
    public void setResourceUri(String str) {
        this.resourceUri = str;
    }

    @SerializedName("size")
    public void setSize(long j) {
        this.size = j;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 9350, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 9350, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == null || !(obj instanceof AssetsModel)) {
            return false;
        } else {
            AssetsModel assetsModel = (AssetsModel) obj;
            if (this.id == assetsModel.id && this.md5.equals(assetsModel.getMD5()) && this.name.equals(assetsModel.getName()) && this.describe.equals(assetsModel.getDescribe()) && this.resourceType == assetsModel.getResourceType() && this.resourceUri.equals(assetsModel.getResourceUri()) && this.size == assetsModel.getSize() && this.downloadType == assetsModel.getDownloadType()) {
                return true;
            }
            return false;
        }
    }
}
