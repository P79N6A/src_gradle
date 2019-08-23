package com.ss.android.ugc.aweme.im.sdk.chat.net.upload;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("extra")
    private d extraInfo;
    @SerializedName("inner_image_config")
    private c innerImageConfig;
    @SerializedName("public_image_config")
    private c publicImageConfig;

    public d getExtraInfo() {
        return this.extraInfo;
    }

    public c getInnerImageConfig() {
        return this.innerImageConfig;
    }

    public c getPublicImageConfig() {
        return this.publicImageConfig;
    }

    public void setExtraInfo(d dVar) {
        this.extraInfo = dVar;
    }

    public void setInnerImageConfig(c cVar) {
        this.innerImageConfig = cVar;
    }

    public void setPublicImageConfig(c cVar) {
        this.publicImageConfig = cVar;
    }
}
