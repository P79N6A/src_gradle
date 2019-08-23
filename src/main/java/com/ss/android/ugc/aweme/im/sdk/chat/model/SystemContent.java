package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class SystemContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("group_tips")
    String groupNoticeTips;
    @SerializedName("template")
    Key[] template;
    @SerializedName("tips")
    String tips;

    @Keep
    public static class Key {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("action")
        int action;
        @SerializedName("key")
        String key;
        @SerializedName("link")
        String link;
        @SerializedName("name")
        String name;

        public int getAction() {
            return this.action;
        }

        public String getKey() {
            return this.key;
        }

        public String getLink() {
            return this.link;
        }

        public String getName() {
            return this.name;
        }

        public void setAction(int i) {
            this.action = i;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setLink(String str) {
            this.link = str;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    public String getGroupNoticeTips() {
        return this.groupNoticeTips;
    }

    public Key[] getTemplate() {
        return this.template;
    }

    public String getTips() {
        return this.tips;
    }

    public String getMsgHint() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51204, new Class[0], String.class)) {
            return getTips();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51204, new Class[0], String.class);
    }

    public void setGroupNoticeTips(String str) {
        this.groupNoticeTips = str;
    }

    public void setTemplate(Key[] keyArr) {
        this.template = keyArr;
    }

    public void setTips(String str) {
        this.tips = str;
    }
}
