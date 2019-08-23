package com.ss.android.ugc.aweme.im.sdk.chat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018R \u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/SessionInfo;", "Ljava/io/Serializable;", "()V", "chatType", "", "chatType$annotations", "getChatType", "()I", "setChatType", "(I)V", "conversationId", "", "getConversationId", "()Ljava/lang/String;", "setConversationId", "(Ljava/lang/String;)V", "enterFrom", "enterFrom$annotations", "getEnterFrom", "setEnterFrom", "getSingleChatFromUser", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "getSingleChatFromUserId", "isEnterpriseChat", "", "isFriendChat", "isGroupChat", "isSingleChat", "isStrangerChat", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class o implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int chatType;
    @NotNull
    private String conversationId = "";
    private int enterFrom;

    public static /* synthetic */ void chatType$annotations() {
    }

    public static /* synthetic */ void enterFrom$annotations() {
    }

    @Nullable
    public IMUser getSingleChatFromUser() {
        return null;
    }

    @Nullable
    public String getSingleChatFromUserId() {
        return null;
    }

    public final int getChatType() {
        return this.chatType;
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    public final int getEnterFrom() {
        return this.enterFrom;
    }

    public final boolean isFriendChat() {
        if (this.chatType == 0) {
            return true;
        }
        return false;
    }

    public final boolean isStrangerChat() {
        if (this.chatType == 1) {
            return true;
        }
        return false;
    }

    public final boolean isEnterpriseChat() {
        if (this.chatType == 2) {
            return true;
        }
        return false;
    }

    public final boolean isGroupChat() {
        if (this.chatType == 3) {
            return true;
        }
        return false;
    }

    public final boolean isSingleChat() {
        if (this.chatType == 0 || this.chatType == 1 || this.chatType == 2) {
            return true;
        }
        return false;
    }

    public final void setChatType(int i) {
        this.chatType = i;
    }

    public final void setEnterFrom(int i) {
        this.enterFrom = i;
    }

    public final void setConversationId(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 50486, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 50486, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.conversationId = str2;
    }
}
