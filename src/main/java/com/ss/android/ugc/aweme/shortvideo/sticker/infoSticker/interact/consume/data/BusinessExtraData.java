package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class BusinessExtraData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("interaction_type")
    private int interactionType;
    @SerializedName("interaction_icon")
    private String popIcon;
    @SerializedName("interaction_text")
    private String popText;
    @SerializedName("interaction_url")
    private String schemaUrl;
    @SerializedName("sticker_id")
    private String stickerId;

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getPopIcon() {
        return this.popIcon;
    }

    public String getPopText() {
        return this.popText;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setPopIcon(String str) {
        this.popIcon = str;
    }

    public void setPopText(String str) {
        this.popText = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }
}
