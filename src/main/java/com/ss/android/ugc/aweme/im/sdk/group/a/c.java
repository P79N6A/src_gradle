package com.ss.android.ugc.aweme.im.sdk.group.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupInviteCardInfo;", "Ljava/io/Serializable;", "()V", "conversationId", "", "getConversationId", "()Ljava/lang/String;", "setConversationId", "(Ljava/lang/String;)V", "conversationShortId", "getConversationShortId", "setConversationShortId", "fromUserId", "getFromUserId", "setFromUserId", "fromUserSecId", "getFromUserSecId", "setFromUserSecId", "groupIcon", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getGroupIcon", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setGroupIcon", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "groupName", "getGroupName", "setGroupName", "ticket", "getTicket", "setTicket", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("conversation_id")
    @Nullable
    private String conversationId;
    @SerializedName("conversation_short_id")
    @Nullable
    private String conversationShortId;
    @SerializedName("from_uid")
    @Nullable
    private String fromUserId;
    @SerializedName("sec_from_uid")
    @Nullable
    private String fromUserSecId;
    @SerializedName("group_icon")
    @Nullable
    private UrlModel groupIcon;
    @SerializedName("group_name")
    @Nullable
    private String groupName;
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
    public final String getFromUserId() {
        return this.fromUserId;
    }

    @Nullable
    public final String getFromUserSecId() {
        return this.fromUserSecId;
    }

    @Nullable
    public final UrlModel getGroupIcon() {
        return this.groupIcon;
    }

    @Nullable
    public final String getGroupName() {
        return this.groupName;
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

    public final void setFromUserId(@Nullable String str) {
        this.fromUserId = str;
    }

    public final void setFromUserSecId(@Nullable String str) {
        this.fromUserSecId = str;
    }

    public final void setGroupIcon(@Nullable UrlModel urlModel) {
        this.groupIcon = urlModel;
    }

    public final void setGroupName(@Nullable String str) {
        this.groupName = str;
    }

    public final void setTicket(@Nullable String str) {
        this.ticket = str;
    }
}
