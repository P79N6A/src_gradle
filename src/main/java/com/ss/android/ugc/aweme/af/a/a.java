package com.ss.android.ugc.aweme.af.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public final class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("keepalive_timeout")
    private int keepaliveTimeout;
    @SerializedName("refresh_interval")
    private int refreshInterval;
    @SerializedName("refresh_switch")
    private boolean refreshSwitch;

    public final int getKeepaliveTimeout() {
        return this.keepaliveTimeout;
    }

    public final int getRefreshInterval() {
        return this.refreshInterval;
    }

    public final boolean isRefreshSwitch() {
        return this.refreshSwitch;
    }

    public final int hashCode() {
        return ((((this.refreshSwitch ? 1 : 0) * true) + this.refreshInterval) * 31) + this.keepaliveTimeout;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70681, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70681, new Class[0], String.class);
        }
        return "CdnDomainRefresh{" + "refreshSwitch=" + this.refreshSwitch + ", refreshInterval=" + this.refreshInterval + ", keepaliveTimeout=" + this.keepaliveTimeout + '}';
    }

    public final void setKeepaliveTimeout(int i) {
        this.keepaliveTimeout = i;
    }

    public final void setRefreshInterval(int i) {
        this.refreshInterval = i;
    }

    public final void setRefreshSwitch(boolean z) {
        this.refreshSwitch = z;
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 70680, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 70680, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.refreshSwitch == aVar.refreshSwitch && this.refreshInterval == aVar.refreshInterval && this.keepaliveTimeout == aVar.keepaliveTimeout) {
                return true;
            }
            return false;
        }
    }
}
