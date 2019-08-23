package com.ss.android.ugc.aweme.im.sdk.chat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/SingleSessionInfo;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/SessionInfo;", "()V", "chatExt", "Ljava/io/Serializable;", "getChatExt", "()Ljava/io/Serializable;", "setChatExt", "(Ljava/io/Serializable;)V", "fromUser", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "getFromUser", "()Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "setFromUser", "(Lcom/ss/android/ugc/aweme/im/service/model/IMUser;)V", "fromUserId", "", "getFromUserId", "()Ljava/lang/String;", "setFromUserId", "(Ljava/lang/String;)V", "imAdLog", "Lcom/ss/android/ugc/aweme/im/service/model/IMAdLog;", "getImAdLog", "()Lcom/ss/android/ugc/aweme/im/service/model/IMAdLog;", "setImAdLog", "(Lcom/ss/android/ugc/aweme/im/service/model/IMAdLog;)V", "getSingleChatFromUser", "getSingleChatFromUserId", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class p extends o {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Serializable chatExt;
    @Nullable
    private IMUser fromUser;
    @Nullable
    private String fromUserId;
    @Nullable
    private a imAdLog;

    @Nullable
    public final Serializable getChatExt() {
        return this.chatExt;
    }

    @Nullable
    public final IMUser getFromUser() {
        return this.fromUser;
    }

    @Nullable
    public final String getFromUserId() {
        return this.fromUserId;
    }

    @Nullable
    public final a getImAdLog() {
        return this.imAdLog;
    }

    @Nullable
    public final IMUser getSingleChatFromUser() {
        return this.fromUser;
    }

    @Nullable
    public final String getSingleChatFromUserId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50500, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50500, new Class[0], String.class);
        }
        IMUser iMUser = this.fromUser;
        if (iMUser != null) {
            return iMUser.getUid();
        }
        return null;
    }

    public final void setChatExt(@Nullable Serializable serializable) {
        this.chatExt = serializable;
    }

    public final void setFromUser(@Nullable IMUser iMUser) {
        this.fromUser = iMUser;
    }

    public final void setFromUserId(@Nullable String str) {
        this.fromUserId = str;
    }

    public final void setImAdLog(@Nullable a aVar) {
        this.imAdLog = aVar;
    }
}
