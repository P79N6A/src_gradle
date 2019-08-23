package com.ss.android.ugc.aweme.crossplatform.platform.rn.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

@Keep
public class RNBundleInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("base_version")
    String baseVersion;
    @SerializedName("modules")
    List<String> modules;
    @SerializedName("version")
    String version;

    public String getBaseVersion() {
        return this.baseVersion;
    }

    public List<String> getModules() {
        return this.modules;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34380, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34380, new Class[0], String.class);
        }
        return "\nmodules: " + this.modules + "\nversion: " + this.version + "\nbase_version: " + this.baseVersion;
    }

    public void setBaseVersion(String str) {
        this.baseVersion = str;
    }

    public void setModules(List<String> list) {
        this.modules = list;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
