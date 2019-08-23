package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.guide.ExtraParams;

@Keep
public class RecordInteractExtra {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("interaction_type")
    private int interactionType;
    @SerializedName("interaction_icon")
    private String popIcon;
    @SerializedName("interaction_text")
    private String popText;
    @SerializedName("interaction_url")
    private String schemeUrl;
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

    public String getSchemeUrl() {
        return this.schemeUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public ExtraParams toExtraParams() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77004, new Class[0], ExtraParams.class)) {
            return (ExtraParams) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77004, new Class[0], ExtraParams.class);
        }
        ExtraParams extraParams = new ExtraParams();
        extraParams.setInteractionIcon(this.popIcon);
        extraParams.setInteractionText(this.popText);
        extraParams.setInteractionType(this.interactionType);
        extraParams.setInteractionUrl(this.schemeUrl);
        return extraParams;
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

    public void setSchemeUrl(String str) {
        this.schemeUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void formatFromExtraParams(ExtraParams extraParams, String str) {
        if (PatchProxy.isSupport(new Object[]{extraParams, str}, this, changeQuickRedirect, false, 77003, new Class[]{ExtraParams.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{extraParams, str}, this, changeQuickRedirect, false, 77003, new Class[]{ExtraParams.class, String.class}, Void.TYPE);
            return;
        }
        if (extraParams != null) {
            this.stickerId = str;
            this.interactionType = extraParams.getInteractionType();
            this.popIcon = extraParams.getInteractionIcon();
            this.popText = extraParams.getInteractionText();
            this.schemeUrl = extraParams.getInteractionUrl();
        }
    }
}
