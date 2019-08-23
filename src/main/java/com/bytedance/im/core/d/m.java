package com.bytedance.im.core.d;

import java.io.Serializable;

public class m implements Serializable {
    private String alias;
    private String conversationId;
    private int conversationType;
    private int role;
    private String secUid;
    private long sortOrder;
    private long uid;

    public String getAlias() {
        return this.alias;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public int getRole() {
        return this.role;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public long getSortOrder() {
        return this.sortOrder;
    }

    public long getUid() {
        return this.uid;
    }

    public int hashCode() {
        if (this.conversationId == null || this.uid == 0) {
            return 0;
        }
        return (this.conversationId + "_" + this.uid).hashCode();
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setRole(int i) {
        this.role = i;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSortOrder(long j) {
        this.sortOrder = j;
    }

    public void setUid(long j) {
        this.uid = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.conversationId == null ? mVar.conversationId == null : this.conversationId.equals(mVar.conversationId)) {
            if (this.uid == mVar.uid) {
                return true;
            }
        }
        return false;
    }
}
