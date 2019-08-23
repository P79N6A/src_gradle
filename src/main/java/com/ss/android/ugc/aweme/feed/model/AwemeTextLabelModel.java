package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class AwemeTextLabelModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("color")
    public String bgColor;
    @SerializedName("text")
    public String labelName;
    @SerializedName("type")
    public int labelType;
    @SerializedName("show_seconds")
    public float showSeconds;
    @SerializedName("color_text")
    public String textColor;

    public String getBgColor() {
        return this.bgColor;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public float getShowSeconds() {
        return this.showSeconds;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public boolean isAdHollowText() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41443, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41443, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.textColor) && this.textColor.endsWith("00000000")) {
            z = true;
        }
        return z;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setLabelName(String str) {
        this.labelName = str;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setShowSeconds(float f2) {
        this.showSeconds = f2;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }
}
