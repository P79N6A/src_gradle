package com.bytedance.im.core.d;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.e.b;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class n implements Serializable, Cloneable, Comparable<n> {
    public List<a> attachments;
    public String content;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public long createdAt;
    private int deleted;
    private Map<String, String> ext;
    public long index;
    public Map<String, String> localExt;
    private SparseArray<WeakReference<Object>> mKeyedTags;
    private long msgId;
    public int msgStatus;
    public int msgType;
    public long orderIndex;
    private int readStatus;
    private long rowid;
    public long sender;
    private int svrStatus;
    public String uuid;
    private long version;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final n f21289a = new n();

        public final n a() {
            this.f21289a.uuid = UUID.randomUUID().toString();
            this.f21289a.sender = c.a().f20879c.a();
            this.f21289a.createdAt = System.currentTimeMillis();
            this.f21289a.msgStatus = 0;
            return this.f21289a;
        }

        public final a a(int i) {
            this.f21289a.msgType = i;
            return this;
        }

        public final a a(String str) {
            this.f21289a.content = str;
            return this;
        }

        public final a a(b bVar) {
            this.f21289a.conversationId = bVar.getConversationId();
            this.f21289a.conversationShortId = bVar.getConversationShortId();
            this.f21289a.conversationType = bVar.getConversationType();
            n lastMessage = bVar.getLastMessage();
            if (lastMessage != null) {
                this.f21289a.orderIndex = lastMessage.orderIndex + 1;
            } else {
                this.f21289a.orderIndex = 1;
            }
            this.f21289a.index = bVar.getLastMessageIndex();
            return this;
        }
    }

    public final List<a> getAttachments() {
        return this.attachments;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final long getConversationShortId() {
        return this.conversationShortId;
    }

    public final int getConversationType() {
        return this.conversationType;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    public final long getIndex() {
        return this.index;
    }

    public final long getMsgId() {
        return this.msgId;
    }

    public final int getMsgStatus() {
        return this.msgStatus;
    }

    public final int getMsgType() {
        return this.msgType;
    }

    public final long getOrderIndex() {
        return this.orderIndex;
    }

    public final int getReadStatus() {
        return this.readStatus;
    }

    public final long getRowId() {
        return this.rowid;
    }

    public final long getSender() {
        return this.sender;
    }

    public final int getSvrStatus() {
        return this.svrStatus;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final long getVersion() {
        return this.version;
    }

    public final String getExtStr() {
        return b.a(this.ext);
    }

    public final String getLocalExtStr() {
        return b.a(this.localExt);
    }

    public final boolean isDeleted() {
        if (this.deleted == 1) {
            return true;
        }
        return false;
    }

    public final n clone() {
        try {
            return (n) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final synchronized Map<String, String> getExt() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return this.ext;
    }

    public final synchronized Map<String, String> getLocalExt() {
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        return this.localExt;
    }

    public final boolean invalid() {
        if (this.sender <= 0 || TextUtils.isEmpty(this.conversationId) || TextUtils.isEmpty(this.uuid)) {
            return true;
        }
        return false;
    }

    public final boolean isMention() {
        List<Long> mentionIds = getMentionIds();
        if (mentionIds == null || !mentionIds.contains(Long.valueOf(c.a().f20879c.a()))) {
            return false;
        }
        return true;
    }

    public final boolean isSelf() {
        if (c.a().f20879c.a() == this.sender) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = ((((((int) (this.orderIndex ^ (this.orderIndex >>> 32))) * 31) + ((int) (this.msgId ^ (this.msgId >>> 32)))) * 31) + this.msgType) * 31;
        if (this.conversationId != null) {
            i = this.conversationId.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final boolean isRecalled() {
        if ("true".equals(getExt().get("s:is_recalled")) || "true".equals(getExt().get("s:recalled"))) {
            return true;
        }
        return false;
    }

    public final List<Long> getMentionIds() {
        if (this.ext == null || !this.ext.containsKey("s:mentioned_users")) {
            return null;
        }
        String str = this.ext.get("s:mentioned_users");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList();
        for (String parseLong : split) {
            try {
                arrayList.add(Long.valueOf(Long.parseLong(parseLong)));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "Message{orderIndex=" + this.orderIndex + ", msgId=" + this.msgId + ", msgType=" + this.msgType + ", conversationId='" + this.conversationId + '\'' + ", conversationShortId=" + this.conversationShortId + ", conversationType=" + this.conversationType + ", uuid='" + this.uuid + '\'' + ", sender=" + this.sender + ", createdAt=" + this.createdAt + ", content='" + this.content + '\'' + ", index=" + this.index + ", version=" + this.version + ", deleted=" + this.deleted + ", svrStatus=" + this.svrStatus + ", msgStatus=" + this.msgStatus + ", readStatus=" + this.readStatus + ", ext=" + this.ext + ", localExt=" + this.localExt + ", mKeyedTags=" + this.mKeyedTags + ", attachments=" + this.attachments + '}';
    }

    public final void setAttachments(List<a> list) {
        this.attachments = list;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public final void setConversationType(int i) {
        this.conversationType = i;
    }

    public final void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public final void setDeleted(int i) {
        this.deleted = i;
    }

    public final void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public final void setIndex(long j) {
        this.index = j;
    }

    public final void setLocalExt(Map<String, String> map) {
        this.localExt = map;
    }

    public final void setMsgId(long j) {
        this.msgId = j;
    }

    public final void setMsgStatus(int i) {
        this.msgStatus = i;
    }

    public final void setMsgType(int i) {
        this.msgType = i;
    }

    public final void setOrderIndex(long j) {
        this.orderIndex = j;
    }

    public final void setReadStatus(int i) {
        this.readStatus = i;
    }

    public final void setRowId(long j) {
        this.rowid = j;
    }

    public final void setSender(long j) {
        this.sender = j;
    }

    public final void setSvrStatus(int i) {
        this.svrStatus = i;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public final void setVersion(long j) {
        this.version = j;
    }

    public final void setExtStr(String str) {
        this.ext = b.a(str);
    }

    public final void setLocalExtStr(String str) {
        this.localExt = b.a(str);
    }

    public final synchronized void clearLocalExt(String str) {
        if (this.localExt != null) {
            this.localExt.remove(str);
        }
    }

    public final Object getTag(int i) {
        if (this.mKeyedTags == null || this.mKeyedTags.get(i) == null) {
            return null;
        }
        return this.mKeyedTags.get(i).get();
    }

    public final synchronized void putExt(Map<String, String> map) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.putAll(map);
    }

    public final synchronized void putLocalExt(Map<String, String> map) {
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        this.localExt.putAll(map);
    }

    public final int compareTo(n nVar) {
        if (equals(nVar)) {
            return 0;
        }
        long orderIndex2 = nVar.getOrderIndex() - getOrderIndex();
        if (orderIndex2 > 0) {
            return 1;
        }
        if (orderIndex2 < 0) {
            return -1;
        }
        long createdAt2 = nVar.getCreatedAt() - getCreatedAt();
        if (createdAt2 > 0) {
            return 1;
        }
        if (createdAt2 < 0) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.uuid != null) {
            return this.uuid.equals(nVar.uuid);
        }
        if (nVar.uuid == null) {
            return true;
        }
        return false;
    }

    public final synchronized void addExt(String str, String str2) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put(str, str2);
    }

    public final synchronized void addLocalExt(String str, String str2) {
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        this.localExt.put(str, str2);
    }

    public final void setTag(int i, Object obj) {
        if (this.mKeyedTags == null) {
            this.mKeyedTags = new SparseArray<>(2);
        }
        this.mKeyedTags.put(i, new WeakReference(obj));
    }
}
