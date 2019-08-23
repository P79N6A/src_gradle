package com.bytedance.im.core.d;

import android.text.TextUtils;
import com.bytedance.im.core.a.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b implements Serializable, Cloneable, Comparable<b> {
    private String conversationId;
    private long conversationShortId;
    private int conversationType;
    private c coreInfo;
    private String draftContent;
    private long draftTime;
    private boolean hasMore = true;
    private int inboxType;
    private boolean isMember;
    private n lastMessage;
    private long lastMessageIndex;
    private Map<String, String> localExt;
    private m member;
    private int memberCount;
    private List<Long> memberIds;
    private List<n> mentionMessages;
    private long minIndex;
    private long readIndex;
    private f settingInfo;
    private int status;
    private String ticket;
    private long unreadCount;
    private long updatedTime;

    public String getConversationId() {
        return this.conversationId;
    }

    public long getConversationShortId() {
        return this.conversationShortId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public c getCoreInfo() {
        return this.coreInfo;
    }

    public String getDraftContent() {
        return this.draftContent;
    }

    public long getDraftTime() {
        return this.draftTime;
    }

    public int getInboxType() {
        return this.inboxType;
    }

    public n getLastMessage() {
        return this.lastMessage;
    }

    public long getLastMessageIndex() {
        return this.lastMessageIndex;
    }

    public m getMember() {
        return this.member;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public List<n> getMentionMessages() {
        return this.mentionMessages;
    }

    public long getMinIndex() {
        return this.minIndex;
    }

    public long getReadIndex() {
        return this.readIndex;
    }

    public f getSettingInfo() {
        return this.settingInfo;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTicket() {
        return this.ticket;
    }

    public long getUnreadCount() {
        return this.unreadCount;
    }

    public long getUpdatedTime() {
        return this.updatedTime;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public String getLocalExtStr() {
        return com.bytedance.im.core.b.e.b.a(this.localExt);
    }

    public String getMemberStr() {
        return com.bytedance.im.core.b.e.b.a(this.member);
    }

    public boolean isDissolved() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    public b clone() {
        try {
            return (b) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public List<Long> getMemberIds() {
        if (this.memberIds != null) {
            return this.memberIds;
        }
        return new ArrayList();
    }

    public int getMuted() {
        if (this.settingInfo != null) {
            return this.settingInfo.getMute();
        }
        return 0;
    }

    public int getStickTop() {
        if (this.settingInfo != null) {
            return this.settingInfo.getStickTop();
        }
        return 0;
    }

    public int hashCode() {
        if (this.conversationId != null) {
            return this.conversationId.hashCode();
        }
        return 0;
    }

    public boolean isFavorite() {
        if (this.settingInfo == null || !this.settingInfo.isFavor()) {
            return false;
        }
        return true;
    }

    public boolean isGroupChat() {
        if (this.conversationType == d.a.f20887b) {
            return true;
        }
        return false;
    }

    public boolean isLiveChat() {
        if (this.conversationType == d.a.f20888c) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        if (this.settingInfo == null || !this.settingInfo.isMute()) {
            return false;
        }
        return true;
    }

    public boolean isSingleChat() {
        if (this.conversationType == d.a.f20886a) {
            return true;
        }
        return false;
    }

    public boolean isStickTop() {
        if (this.settingInfo == null || !this.settingInfo.isStickTop()) {
            return false;
        }
        return true;
    }

    public boolean isTemp() {
        if (this.conversationShortId <= 0) {
            return true;
        }
        return false;
    }

    public synchronized Map<String, String> getExt() {
        if (this.settingInfo == null) {
            return null;
        }
        return this.settingInfo.getExt();
    }

    public synchronized Map<String, String> getLocalExt() {
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        return this.localExt;
    }

    public boolean isStranger() {
        if (this.localExt == null || !this.localExt.containsKey("s:conv_is_stranger")) {
            return false;
        }
        return true;
    }

    public boolean isWaitingInfo() {
        if (this.localExt == null || !this.localExt.containsKey("s:conv_wait_info")) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Conversation{conversationId='" + this.conversationId + '\'' + ", conversationShortId=" + this.conversationShortId + ", conversationType=" + this.conversationType + ", isMember=" + this.isMember + ", memberCount=" + this.memberCount + ", unreadCount=" + this.unreadCount + ", updatedTime=" + this.updatedTime + ", readIndex=" + this.readIndex + ", lastMessageIndex=" + this.lastMessageIndex + ", ticket='" + this.ticket + '\'' + ", inboxType=" + this.inboxType + ", hasMore=" + this.hasMore + ", draftTime=" + this.draftTime + ", draftContent='" + this.draftContent + '\'' + ", localExt=" + this.localExt + ", memberIds=" + this.memberIds + ", lastMessage=" + this.lastMessage + ", member=" + this.member + '}';
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setCoreInfo(c cVar) {
        this.coreInfo = cVar;
    }

    public void setDraftContent(String str) {
        this.draftContent = str;
    }

    public void setDraftTime(long j) {
        this.draftTime = j;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setInboxType(int i) {
        this.inboxType = i;
    }

    public void setIsMember(boolean z) {
        this.isMember = z;
    }

    public void setLastMessage(n nVar) {
        this.lastMessage = nVar;
    }

    public void setLastMessageIndex(long j) {
        this.lastMessageIndex = j;
    }

    public void setLocalExt(Map<String, String> map) {
        this.localExt = map;
    }

    public void setMember(m mVar) {
        this.member = mVar;
    }

    public void setMemberCount(int i) {
        this.memberCount = i;
    }

    public void setMemberIds(List<Long> list) {
        this.memberIds = list;
    }

    public void setMentionMessages(List<n> list) {
        this.mentionMessages = list;
    }

    public void setMinIndex(long j) {
        this.minIndex = j;
    }

    public void setReadIndex(long j) {
        this.readIndex = j;
    }

    public void setSettingInfo(f fVar) {
        this.settingInfo = fVar;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public void setUnreadCount(long j) {
        this.unreadCount = j;
    }

    public void setUpdatedTime(long j) {
        this.updatedTime = j;
    }

    public void setLocalExtStr(String str) {
        this.localExt = com.bytedance.im.core.b.e.b.a(str);
    }

    public void setMemberStr(String str) {
        this.member = com.bytedance.im.core.b.e.b.b(str);
    }

    public int compareTo(b bVar) {
        if (bVar.getStickTop() != getStickTop()) {
            return bVar.getStickTop() - getStickTop();
        }
        long max = Math.max(bVar.getUpdatedTime(), bVar.getDraftTime()) - Math.max(getUpdatedTime(), getDraftTime());
        if (max > 0) {
            return 1;
        }
        if (max < 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.conversationId != null) {
            return this.conversationId.equals(bVar.conversationId);
        }
        if (bVar.conversationId == null) {
            return true;
        }
        return false;
    }

    public boolean removeMentionMessage(String str) {
        if (this.mentionMessages == null || this.mentionMessages.isEmpty()) {
            return false;
        }
        for (n next : this.mentionMessages) {
            if (TextUtils.equals(str, next.getUuid())) {
                this.mentionMessages.remove(next);
                return true;
            }
        }
        return false;
    }
}
