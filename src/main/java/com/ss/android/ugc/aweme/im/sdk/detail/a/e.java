package com.ss.android.ugc.aweme.im.sdk.detail.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\"\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R \u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/model/GroupVerifyInfo;", "Ljava/io/Serializable;", "()V", "conversationId", "", "getConversationId", "()Ljava/lang/String;", "setConversationId", "(Ljava/lang/String;)V", "conversationShortId", "getConversationShortId", "setConversationShortId", "groupAvatar", "getGroupAvatar", "setGroupAvatar", "groupMemberCount", "", "getGroupMemberCount", "()Ljava/lang/Integer;", "setGroupMemberCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "groupName", "getGroupName", "setGroupName", "inviterUserId", "getInviterUserId", "setInviterUserId", "shareScene", "getShareScene", "setShareScene", "shareType", "getShareType", "setShareType", "ticket", "getTicket", "setTicket", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("conversation_id")
    @Nullable
    private String conversationId;
    @SerializedName("conversation_short_id")
    @Nullable
    private String conversationShortId;
    @SerializedName("group_avatar")
    @Nullable
    private String groupAvatar;
    @SerializedName("group_member_count")
    @Nullable
    private Integer groupMemberCount;
    @SerializedName("group_name")
    @Nullable
    private String groupName;
    @SerializedName("inviter_id")
    @Nullable
    private String inviterUserId;
    @SerializedName("share_scene")
    @Nullable
    private Integer shareScene;
    @SerializedName("share_type")
    @Nullable
    private Integer shareType;
    @SerializedName("ticket")
    @Nullable
    private String ticket;

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    public final String getConversationShortId() {
        return this.conversationShortId;
    }

    @Nullable
    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    @Nullable
    public final Integer getGroupMemberCount() {
        return this.groupMemberCount;
    }

    @Nullable
    public final String getGroupName() {
        return this.groupName;
    }

    @Nullable
    public final String getInviterUserId() {
        return this.inviterUserId;
    }

    @Nullable
    public final Integer getShareScene() {
        return this.shareScene;
    }

    @Nullable
    public final Integer getShareType() {
        return this.shareType;
    }

    @Nullable
    public final String getTicket() {
        return this.ticket;
    }

    public final void setConversationId(@Nullable String str) {
        this.conversationId = str;
    }

    public final void setConversationShortId(@Nullable String str) {
        this.conversationShortId = str;
    }

    public final void setGroupAvatar(@Nullable String str) {
        this.groupAvatar = str;
    }

    public final void setGroupMemberCount(@Nullable Integer num) {
        this.groupMemberCount = num;
    }

    public final void setGroupName(@Nullable String str) {
        this.groupName = str;
    }

    public final void setInviterUserId(@Nullable String str) {
        this.inviterUserId = str;
    }

    public final void setShareScene(@Nullable Integer num) {
        this.shareScene = num;
    }

    public final void setShareType(@Nullable Integer num) {
        this.shareType = num;
    }

    public final void setTicket(@Nullable String str) {
        this.ticket = str;
    }
}
