package com.bytedance.im.core.d;

import com.bytedance.im.core.b.e.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class c implements Serializable {
    private String conversationId;
    private String desc;
    private Map<String, String> ext;
    private String icon;
    private String name;
    private String notice;
    private long owner;
    private String secOwner;
    private long version;

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNotice() {
        return this.notice;
    }

    public final long getOwner() {
        return this.owner;
    }

    public final String getSecOwner() {
        return this.secOwner;
    }

    public final long getVersion() {
        return this.version;
    }

    public final String getExtStr() {
        return b.a(this.ext);
    }

    public final synchronized Map<String, String> getExt() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return this.ext;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNotice(String str) {
        this.notice = str;
    }

    public final void setOwner(long j) {
        this.owner = j;
    }

    public final void setSecOwner(String str) {
        this.secOwner = str;
    }

    public final void setVersion(long j) {
        this.version = j;
    }

    public final void setExtStr(String str) {
        this.ext = b.a(str);
    }
}
