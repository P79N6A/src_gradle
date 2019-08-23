package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.g.b.a;
import com.bytedance.g.b.b;
import com.bytedance.g.b.f;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public final class OmVast implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("adVerifications")
    public List<a> adVerificationList;
    @SerializedName("local_cache_loaded")
    public boolean loaded;
    public transient boolean loading;
    @SerializedName("providerType")
    @ProviderType
    public int providerType = 2;
    @SerializedName("local_cache_vast")
    public f vast;
    @SerializedName("vastContent")
    @Expose(serialize = false)
    public String vastContent;
    @SerializedName("vastUrl")
    @Expose(serialize = false)
    public String vastUrl;
    @SerializedName("vastWrapperCount")
    @Expose(serialize = false)
    public int vastWrapperCount = 1;

    public @interface ProviderType {
    }

    public final List<b> getCreativeList() {
        if (this.vast == null) {
            return null;
        }
        return this.vast.creativeList;
    }

    public final Set<String> getImpressions() {
        if (this.vast == null) {
            return null;
        }
        return this.vast.impressionSet;
    }
}
