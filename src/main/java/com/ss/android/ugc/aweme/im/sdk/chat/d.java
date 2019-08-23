package com.ss.android.ugc.aweme.im.sdk.chat;

import com.bytedance.im.core.proto.GroupRole;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.group.a.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/GroupSessionInfo;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/SessionInfo;", "()V", "groupCheckMessage", "Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupCheckMsg;", "getGroupCheckMessage", "()Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupCheckMsg;", "setGroupCheckMessage", "(Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupCheckMsg;)V", "groupRole", "", "getGroupRole", "()I", "setGroupRole", "(I)V", "isGroupOwner", "", "isGroupOwnerOrManager", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends o {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private b groupCheckMessage;
    private int groupRole = GroupRole.ORDINARY.getValue();

    @Nullable
    public final b getGroupCheckMessage() {
        return this.groupCheckMessage;
    }

    public final int getGroupRole() {
        return this.groupRole;
    }

    public final boolean isGroupOwner() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50308, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50308, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.groupRole == GroupRole.OWNER.getValue()) {
            z = true;
        }
        return z;
    }

    public final boolean isGroupOwnerOrManager() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50309, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50309, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.groupRole == GroupRole.MANAGER.getValue() || this.groupRole == GroupRole.OWNER.getValue()) {
            return true;
        } else {
            return false;
        }
    }

    public final void setGroupCheckMessage(@Nullable b bVar) {
        this.groupCheckMessage = bVar;
    }

    public final void setGroupRole(int i) {
        this.groupRole = i;
    }
}
