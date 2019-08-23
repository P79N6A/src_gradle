package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

public class Commodity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 42;
    @SerializedName("gid")
    private String gid;
    @SerializedName("img")
    private String image;
    private LogPbBean logPb;
    @SerializedName("name")
    private String name;
    @SerializedName("platform_name")
    private String platformName;
    @SerializedName("show_price")
    private long price;
    boolean reportShow;
    @SerializedName("schema")
    private String schema;

    public String getGid() {
        return this.gid;
    }

    public String getImage() {
        return this.image;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public String getName() {
        return this.name;
    }

    public String getPlatformName() {
        return this.platformName;
    }

    public long getPrice() {
        return this.price;
    }

    public String getSchema() {
        return this.schema;
    }

    public boolean isReportShow() {
        return this.reportShow;
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37021, new Class[0], Integer.TYPE)) {
            return this.gid.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37021, new Class[0], Integer.TYPE)).intValue();
    }

    public void setGid(String str) {
        this.gid = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPlatformName(String str) {
        this.platformName = str;
    }

    public void setPrice(long j) {
        this.price = j;
    }

    public void setReportShow(boolean z) {
        this.reportShow = z;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37020, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37020, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof Commodity)) {
                return false;
            }
            return this.gid.equals(((Commodity) obj).gid);
        }
    }
}
