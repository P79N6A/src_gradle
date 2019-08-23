package com.bytedance.im.core.d;

import com.bytedance.im.core.b.e.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class f implements Serializable {
    private String conversationId;
    private Map<String, String> ext;
    private int favor;
    private int mute;
    private int stickTop;
    private long version;

    public final String getConversationId() {
        return this.conversationId;
    }

    public final int getFavor() {
        return this.favor;
    }

    public final int getMute() {
        return this.mute;
    }

    public final int getStickTop() {
        return this.stickTop;
    }

    public final long getVersion() {
        return this.version;
    }

    public final String getExtStr() {
        return b.a(this.ext);
    }

    public final boolean isFavor() {
        if (this.favor == 1) {
            return true;
        }
        return false;
    }

    public final boolean isMute() {
        if (this.mute == 1) {
            return true;
        }
        return false;
    }

    public final boolean isStickTop() {
        if (this.stickTop == 1) {
            return true;
        }
        return false;
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

    public final void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public final void setFavor(int i) {
        this.favor = i;
    }

    public final void setMute(int i) {
        this.mute = i;
    }

    public final void setStickTop(int i) {
        this.stickTop = i;
    }

    public final void setVersion(long j) {
        this.version = j;
    }

    public final void setExtStr(String str) {
        this.ext = b.a(str);
    }
}
