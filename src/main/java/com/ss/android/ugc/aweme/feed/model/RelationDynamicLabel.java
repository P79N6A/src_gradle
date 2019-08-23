package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class RelationDynamicLabel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("count")
    public int count;
    @SerializedName("label_info")
    public String labelInfo;
    @SerializedName("nickname")
    public String nickname;
    @SerializedName("type")
    public int type;
    @SerializedName("user_id")
    public String userId;

    public interface LabelType {
    }

    public int getCount() {
        return this.count;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41473, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41473, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.labelInfo)) {
            z = true;
        }
        return z;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public RelationDynamicLabel setUserId(String str) {
        this.userId = str;
        return this;
    }
}
